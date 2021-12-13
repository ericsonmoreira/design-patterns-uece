package com.uece.questions.command;

public class Joystick {
    private Futebol futebol;
    private Corrida corrida;
    private Luta luta;

    private Command commandA;
    private Command commandB;

    public Joystick() {
        this.futebol = new Futebol();
        this.corrida = new Corrida();
        this.luta = new Luta();

        this.commandA = new ButtonAComand(this.futebol, this.corrida, this.luta);
        this.commandB = new ButtonBComand(this.futebol, this.corrida, this.luta);
    }

    public void handleCommandA() {
        this.commandA.execute();
    }

    public void handleCommandB() {
        this.commandB.execute();
    }
}
