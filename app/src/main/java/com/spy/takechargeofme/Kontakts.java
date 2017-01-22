package com.spy.takechargeofme;

/**
 * Created by Ramez on 22-Jan-17.
 */

public class Kontakts {

    private String name;
    private String number;

    public Kontakts(String name, String number){
        this.name = name;
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }


}
