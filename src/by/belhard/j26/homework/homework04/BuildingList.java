package by.belhard.j26.homework.homework04;

import by.belhard.j26.homework.homework04.building.Adress;
import by.belhard.j26.homework.homework04.building.Building;
import by.belhard.j26.homework.homework04.building.Elevator;
import by.belhard.j26.homework.homework04.building.Material;

public class BuildingList {
    public static void main(String[] args) {
        Building building1 = new Building("Office", 666, new Adress("Y_cherta_na_kulichkah", 13), Material.CONCRETE, Elevator.ELEVATOR_EVALUABLE);

        System.out.println(building1);
        System.out.println(building1.adress.adress);
        building1.DataPrint();

    }
}
