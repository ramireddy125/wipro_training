package com.day_1_to_4;

abstract class Remote {
	abstract void turnOn();
    abstract void turnOff();
}
class TVRemote extends Remote {
    void turnOn() {
        System.out.println("TV is now ON.");
    }

    void turnOff() {
        System.out.println("TV is now OFF.");
    }
}

class ACRemote extends Remote {
    void turnOn() {
        System.out.println("Air Conditioner is now ON.");
    }

    void turnOff() {
        System.out.println("Air Conditioner is now OFF.");
    }
}
