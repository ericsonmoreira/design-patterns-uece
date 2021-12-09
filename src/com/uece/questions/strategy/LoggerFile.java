package com.uece.questions.strategy;

class LoggerFile extends Logger {
    @Override
    public void log(String s) {
        if(this.isAtivo()) {
            System.out.println("LoggerFile :: " + s);
        }
    }
}
