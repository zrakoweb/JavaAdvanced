package com.paveldejimas3;

public class App {

    public static void main(String[] args) {
        Info info = new Info(1, "vienas");
        Info info1 = new Info(2, "du");
        Info info2 = new Info(3, "trys");
        DuomenuBaze baze = new DuomenuBaze();
        NutolesDiskas diskas = new NutolesDiskas();
        saugoti(diskas,info);
        saugoti(diskas,info2);
        saugoti(diskas,info1);
        rastiPagalId(diskas, 2);
        rastiPagalZodi(diskas, "trys");
        saugoti(baze,info);
        saugoti(baze,info2);
        saugoti(baze,info1);
        rastiPagalId(diskas, 1);
        rastiPagalZodi(diskas, "vienas");


    }
    static void saugoti(Saugykla saugykla, Info info){
        saugykla.saugotiInfo(info);
    }
    static void rastiPagalId(Saugykla saugykla, int id){
        saugykla.rastiInfo(id);
    }
    static void rastiPagalZodi(Saugykla saugykla, String tekstas){
        saugykla.rastiInfo(tekstas);
    }
}
