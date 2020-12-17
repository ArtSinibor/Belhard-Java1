package by.belhard.j26.homework.homework10.Banka;

public class Transaction {

    private final String personSender;
    private final String personReciever;
    private final int amount;
    private TransactionStatus status;

    public Transaction(String personSender, String personReciever, int amount) {
        this.personSender = personSender;
        this.personReciever = personReciever;
        this.amount = amount;
        this.status = TransactionStatus.UNHANDLED;
    }

    public String getPersonSender() {
        return personSender;
    }

    public String getPersonReciever() {
        return personReciever;
    }

    public int getAmount() {
        return amount;
    }

    public TransactionStatus getStatus() {
        return status;
    }

    public void setStatus(TransactionStatus status) {
        this.status = status;
    }

    public boolean isValid() {
        return !status.name().startsWith("INVALID");
    }

    @Override
    public String toString() {

        return String.format("Transaction [from: %s, to: %s, amount: %d, status: %s]", personSender, personReciever, amount, status);
    }
}
