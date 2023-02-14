package eus.ehu.test;

import eus.ehu.data_access.DbAccessManager;

public class Main {
    public static void main(String[] args) {
        DbAccessManager dataManager = DbAccessManager.getInstance();
        //dataManager.storePilot("Lewis Hamilton", "British", 303);
        //dataManager.storePilot("Fernando Alonso", "Spanish", 102);
        //dataManager.storePilot("Sergio Perez", "Mexican", 203);
        //dataManager.storePilot("Max Verstappen", "Dutch", 317);
        //dataManager.storePilot("Charles Leclerc", "Polish", 269);
        //dataManager.storePilot("Carlos Sainz", "Spanish", 283);
        dataManager.deletePilotByName("Carlos Sain");
        System.out.println(dataManager.getAllPilots());
        System.out.println(dataManager.getPilotsByNationality("Spanish"));
    }
}
