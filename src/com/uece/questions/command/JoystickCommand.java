package com.uece.questions.command;

public abstract class JoystickCommand implements Command {
    protected Futebol futebol;
    protected Corrida corrida;
    protected Luta luta;

    public JoystickCommand(Futebol futebol, Corrida corrida, Luta luta) {
        this.futebol = futebol;
        this.corrida = corrida;
        this.luta = luta;
    }
}
