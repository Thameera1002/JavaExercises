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


}
