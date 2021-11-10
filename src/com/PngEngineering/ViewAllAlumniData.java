package com.PngEngineering;

import java.util.ArrayList;

public class ViewAllAlumniData {
    ArrayList<AlumniData> allAlumniData;

    ViewAllAlumniData(ArrayList<AlumniData> allAlumniData){
        this.allAlumniData = allAlumniData;
    }

    public void showAllAlumniData(){
        System.out.println("Data alumni: ");
        int index = 0;

        while (index < allAlumniData.size()) {
            AlumniData alumniData = allAlumniData.get(index);
            System.out.println((index+1) + ".\tnama\t: " + alumniData.name);
            System.out.println("\talamat\t: " + alumniData.address);
            System.out.println("\ttelepon\t: " + alumniData.phoneNo);
            index++;
        }
    }
}
