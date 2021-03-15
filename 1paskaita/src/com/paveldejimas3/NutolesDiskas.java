package com.paveldejimas3;

import java.util.ArrayList;
import java.util.List;

public class NutolesDiskas implements Saugykla {

    List<Info> informacija = new ArrayList<>();


    @Override
    public void saugotiInfo(Info info) {
        informacija.add(info);
        System.out.println("Issaugota i duomanu baze");
    }

    @Override
    public Info rastiInfo(int id) {
        for(Info info:informacija){
            if(info.getId() == id){
                System.out.println("id: " + info.getId() + ", tekstas: " + info.getTekstas());
                System.out.println("Rasta duomenu bazeje pagal ID");
            }
        } return null;
    }

    @Override
    public Info rastiInfo(String tekstas) {
        for(Info info:informacija){
            if(info.getTekstas().equals(tekstas)){
                System.out.println("id: " + info.getId() + ", tekstas: " + info.getTekstas());
                System.out.println("Rasta duomenu bazeje pagal tekstas");
            }
        } return null;
    }
}
