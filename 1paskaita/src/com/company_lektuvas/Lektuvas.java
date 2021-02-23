package com.company_lektuvas;

import java.util.Random;

public class Lektuvas {


    public void isskleistiVaziuokle() {
        try {
            vaziuokle();
            System.out.println("ok: vaziuokle sekmingai isskleista");
        } catch (LaikinaKlaida e){
            System.out.println("Error: nepavyko isskleisti vaziuokles. Priezastis: " + e.getPriezastis() + " .laikina");
        } catch (SvarbiKlaida e){
            System.out.println("Error: nepavyko isskleisti vaziuokles. Priezastis: " + e.getPriezastis() + " .svarbi");
        } catch (VaziuoklesIsskleidimoKlaida e){
            System.out.println("Error: nepavyko isskleisti vaziuokles. Priezastis: " + e.getPriezastis() + " .nezinoma");
        }finally {
            System.out.println("Info lektuvas skrenda");
        }


    }
    private void vaziuokle() throws VaziuoklesIsskleidimoKlaida {
        Random rand = new Random();
        int x = rand.nextInt(10);
        switch (x){
            case 0:
                throw new SvarbiKlaida("Neatidare durys");
            case 1:
                throw new SvarbiKlaida("Nenusileido ratas");
            case 2:
                throw new LaikinaKlaida("Per didelis aukstis");
        }
    }

}
