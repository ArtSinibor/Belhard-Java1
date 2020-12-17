package by.belhard.j26.homework.homework10.Banka;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Bank {
    private final Map<String, Account> accounts = new HashMap<>();

    public void addAccounts(Map<String, Account> accounts) {

        this.accounts.putAll(accounts);
    }

    public List<Account> getAccountsSortedByName() {

        return accounts.values().stream().sorted(Comparator.comparing(Account::getName)).collect(Collectors.toList());
    }

    public void processTransactions(List<Transaction> transactions) {

        transactions.forEach(this::processTransaction);
    }

    private void processTransaction(Transaction transaction) {

        validateTransaction(transaction);

        if (!transaction.isValid())
            return;

        Account sender = accounts.get(transaction.getPersonSender());
        Account receiver = accounts.get(transaction.getPersonReciever());
        int amount = transaction.getAmount();

        transferMoney(sender, receiver, amount);
        transaction.setStatus(TransactionStatus.DONE);
    }

    private void validateTransaction(Transaction transaction) {

        transaction.setStatus(TransactionStatus.IN_PROCESS);

        if (transaction.getAmount() < 0)
            transaction.setStatus(TransactionStatus.INVALID_AMOUNT_VALUE);
        if (!accounts.containsKey(transaction.getPersonSender())
                || !accounts.containsKey(transaction.getPersonReciever()))
            transaction.setStatus(TransactionStatus.INVALID_NO_ACCOUNT);
        if (accounts.get(transaction.getPersonSender()).getMoney() - transaction.getAmount() < 0)
            transaction.setStatus(TransactionStatus.INVALID_NOT_ENOUGH_MONEY);
    }

    private void transferMoney(Account sender, Account receiver, int amount) {

        sender.setMoney(sender.getMoney() - amount);
        receiver.setMoney(receiver.getMoney() + amount);
    }
}
