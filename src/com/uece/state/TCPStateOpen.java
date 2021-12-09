package com.uece.state;

public class TCPStateOpen implements TCPState {
    @Override
    public TCPState open() {
        System.out.println("OPEN");
        return this;
    }

    @Override
    public TCPState broadcasting() {
        System.out.println("Mudando para BROADCASTRING");
        return new TCPStateBroadcasting();
    }

    @Override
    public TCPState close() {
        System.out.println("Mudando para BROADCASTRING");
        return new TCPStateClosed();
    }
}
