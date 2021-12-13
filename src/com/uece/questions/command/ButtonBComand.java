package com.uece.questions.command;

public class ButtonBComand extends JoystickCommand {

    public ButtonBComand(Futebol futebol, Corrida corrida, Luta luta) {
        super(futebol, corrida, luta);
    }

    /**
     * Futebol - Passa a Bola
     * Corrida - Freiar
     * Luta - Defende
     */
    @Override
    public void execute() {
        this.futebol.passarBola();
        this.corrida.freiar();
        this.luta.defender();
    }
}
