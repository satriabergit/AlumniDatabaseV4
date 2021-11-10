package com.PngEngineering;

import java.util.ArrayList;

public class Orchestrator {
    private AlumniDataManager dataManager = new AlumniDataManager();
    private int selectedMenu = 0;

    public void setSelectedMenu(int selectedMenu) {
        this.selectedMenu = selectedMenu;
    }

    public void start() {
        showMainMenu();
    }

    public void showMainMenu() {
        MainMenu mainMenu = new MainMenu(this);
        mainMenu.showMainMenu();

        while (selectedMenu != 0) {
            switch (selectedMenu) {
                case 1:
                    showAllAlumniData();
                    break;
                case 2:
                    showAddAlumniDataWizard();
                    break;
                default:
            }

            mainMenu.showMainMenu();
        }
    }

    public void showAllAlumniData() {
        ArrayList allAlumniData = dataManager.getAllAlumniData();
        ViewAllAlumniData viewAllAlumniData = new ViewAllAlumniData(allAlumniData);
        viewAllAlumniData.showAllAlumniData();
    }

    public void showAddAlumniDataWizard() {
        AddAlumniData addAlumniData = new AddAlumniData(this);
        addAlumniData.showAddAlumniDataWizard();
    }

    public void addAlumniData(AlumniData newAlumniData) {
        dataManager.addAlumniData(newAlumniData);
    }
}
