package com.oop.inheritance;

public class Desktop extends  Device{
    String graphic;
    String keyboard;
    String  mouse;
    String chipset;

    public Desktop() {
    }

    public Desktop(String graphic, String keyboard, String mouse, String chipset) {
        this.graphic = graphic;
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.chipset = chipset;
    }

    @Override
    public void price() {
        System.out.println(2000);
    }

    @Override
    public String toString() {
        return "Desktop{" +
                "graphic='" + graphic + '\'' +
                ", keyboard='" + keyboard + '\'' +
                ", mouse='" + mouse + '\'' +
                ", chipset='" + chipset + '\'' +
                "} " + super.toString();
    }
}
