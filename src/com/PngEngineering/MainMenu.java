package com.PngEngineering;

import java.util.Scanner;

public class MainMenu {
    Orchestrator orchestrator;
    public MainMenu(Orchestrator orchestrator) {
        this.orchestrator = orchestrator;
    }

    public void showMainMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih menu:");
        System.out.println("1. tampilkan data alumni");
        System.out.println("2. tambah data alumni");
        System.out.println("0. keluar");
        System.out.print("Menu pilihan anda: ");

        orchestrator.setSelectedMenu(scanner.nextInt());
    }
}
