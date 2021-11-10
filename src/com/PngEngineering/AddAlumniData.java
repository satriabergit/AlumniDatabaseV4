package com.PngEngineering;

import java.util.Scanner;

public class AddAlumniData {
    Orchestrator orchestrator;

    AddAlumniData(Orchestrator orchestrator) {
        this.orchestrator = orchestrator;
    }

    public void showAddAlumniDataWizard() {
        AlumniData newAlumniData = new AlumniData();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama alumni: ");
        do{
            newAlumniData.name = scanner.nextLine();
        } while (newAlumniData.name.strip().isEmpty());

        System.out.print("Masukkan alamat alumni: ");
        do{
            newAlumniData.address = scanner.nextLine();
        } while (newAlumniData.address.strip().isEmpty());

        System.out.print("Masukkan nomor telepon alumni: ");
        newAlumniData.phoneNo = scanner.nextInt();

        orchestrator.addAlumniData(newAlumniData);
    }
}
