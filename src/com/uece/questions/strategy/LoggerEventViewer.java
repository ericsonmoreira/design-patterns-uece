package com.uece.questions.strategy;

class LoggerEventViewer extends Logger {
    @Override
    public void log(String s) {
        if(this.isAtivo()) {
            System.out.println("LoggerEventViewer :: " + s);
        }
    }
}
