package com.uece.questions.command;

public class ButtonAComand extends JoystickCommand {

    public ButtonAComand(Futebol futebol, Corrida corrida, Luta luta) {
        super(futebol, corrida, luta);
    }

    /**
     * Futebol - Chuta a Bola
     * Corrida - Acelera
     * Luta - Bate
     */
    @Override
    public void execute() {
        this.futebol.chutarBola();
        this.corrida.acelerar();
        this.luta.bater();
    }
}
