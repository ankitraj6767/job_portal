package com.blueyonder.day3.stationery;

public class InkPen extends Pen {
    public InkPen()
    {
        super();
        System.out.println("Type: Ink Pen");
    }

    @Override
    public void write() {
        System.out.println("You are writing with Ink Pen");
    }
}
