package com.uece.state;

public interface TCPState {
    public TCPState open();
    public TCPState broadcasting();
    public TCPState close();
}
