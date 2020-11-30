package by.belhard.j26.homework.homework04.building;

import javax.sound.midi.Soundbank;

public class Building {

    public String purpose;
    public Adress adress;
    public Elevator elevator;
    public Material material;
    public int num_of_floors;

    public Building() {

    }

    public Building(String purpose, int num_of_floors, Adress adress, Material material, Elevator elevator) {
        this.purpose = purpose;
        this.adress = adress;
        this.material = material;
        this.elevator = elevator;
    }

    public void DataPrint(){
        System.out.println("Adress of building: " + adress.adress + ", " + adress.number);
        System.out.println("Purpose of building: " + purpose);
        System.out.println("Number of floors: " + num_of_floors);
        System.out.println("Construction material: " + material);
        System.out.println("Elevator: " + elevator);
    }
}
