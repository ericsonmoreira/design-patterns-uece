package com.uece.state;

public class TCPStateClosed implements TCPState {
    @Override
    public TCPState open() {
        System.out.println("Mudando para OPEN");
        return new TCPStateOpen();
    }

    @Override
    public TCPState broadcasting() {
        System.out.println("Mudando para BROADCASTRING");
        return new TCPStateOpen();
    }

    @Override
    public TCPState close() {
        System.out.println("BROADCASTRING");
        return this;
    }
}
