package com.uece.questions.singleton;

public class Logger {
    private boolean ativo = false;

    private static Logger instance;

    private Logger() {}

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public boolean isAtivo() {
        return this.ativo;
    }

    public void setAtivo(boolean b) {
        this.ativo = b;
    }

    public void log(String s) {
        if(this.ativo)
            System.out.println("LOG :: " + s);
    }
}
