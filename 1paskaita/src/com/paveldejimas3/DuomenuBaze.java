package com.paveldejimas3;

import java.util.HashMap;
import java.util.Map;

public class DuomenuBaze implements Saugykla {

    Map<Integer, String> map = new HashMap<>();

    @Override
    public void saugotiInfo(Info info) {
        map.put(info.getId(), info.getTekstas());
        System.out.println("Issaugota i duomanu baze");
    }

    @Override
    public Info rastiInfo(int id) {

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            if (key.equals(id)) {
                System.out.println("id: " + key + ", tekstas: " + value);
                System.out.println("Rasta duomenu bazeje pagal ID");

            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "DuomenuBaze{" +
                "map=" + map +
                '}';
    }

    @Override
    public Info rastiInfo(String tekstas) {

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            if (value.equals(tekstas)) {
                System.out.println("id: " + key + ", tekstas: " + value);
                System.out.println("Rasta duomenu bazeje pagal tekstas");

            }
        }
        return null;
    }
}
