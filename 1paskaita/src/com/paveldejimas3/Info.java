package com.paveldejimas3;

import java.util.ArrayList;
import java.util.List;

public class Info {

    private int id;
    private String tekstas;
    List<String> text = new ArrayList<>();

    public Info(int id, String tekstas){
        this.id = id;
        this.tekstas = tekstas;
    }

    public boolean arYraTekste(String zodis){
        if(text.contains(zodis)){
            return true;
        }else return false;
    }

    @Override
    public String toString() {
        return "Info{" +
                "id=" + id +
                ", tekstas='" + tekstas + '\'' +
                '}';
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getTekstas(){
        return tekstas;
    }
    public void setTekstas(String tekstas){
        this.tekstas = tekstas;
    }
}
