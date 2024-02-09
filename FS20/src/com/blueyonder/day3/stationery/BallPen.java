package com.blueyonder.day3.stationery;

public class BallPen extends Pen {
    public BallPen()
    {
        super();
        System.out.println("Type: Ball Pen");
    }

    @Override
    public void write() {
        System.out.println("You are writing with Ball Pen");
    }
}
