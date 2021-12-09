package com.uece.questions.strategy;

public abstract class Logger {
    private boolean ativo = false;

    private static Logger instance;

    protected Logger() {}

    public static Logger getInstance(LoggerTypes loggerType) {
        if (instance == null) {
            switch (loggerType) {
                case EventViewer:
                    instance = new LoggerEventViewer();
                    break;
                case File:
                    instance = new LoggerFile();
                    break;
                case Database:
                    instance = new LoggerDatabase();
                    break;
                default:
                    break;
            }
        }
        return instance;
    }

    public boolean isAtivo() {
        return this.ativo;
    }

    public void setAtivo(boolean b) {
        this.ativo = b;
    }

    public abstract void log(String s);
}
