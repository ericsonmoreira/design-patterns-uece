package com.uece.state;

public class TCPStateClosed implements TCPState {
    @Override
    public TCPState open() {
        return null;
    }

    @Override
    public TCPState broadcasting() {
        return null;
    }

    @Override
    public TCPState close() {
        return null;
    }
}
