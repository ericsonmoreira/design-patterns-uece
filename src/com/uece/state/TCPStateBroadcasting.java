package com.uece.state;

public class TCPStateBroadcasting implements TCPState {
    @Override
    public TCPState open() {
        System.out.println("Mudando para OPEN");
        return new TCPStateOpen();
    }

    @Override
    public TCPState broadcasting() {
        System.out.println("BROADCASTRING");
        return this;
    }

    @Override
    public TCPState close() {
        System.out.println("Mudando para CLOSED");
        return new TCPStateClosed();
    }
}
