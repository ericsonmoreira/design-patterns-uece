package com.uece.questions.strategy;

public class LoggerDatabase extends Logger {
    @Override
    public void log(String s) {
        if(this.isAtivo()) {
            System.out.println("LoggerDatabase :: " + s);
        }
    }
}
