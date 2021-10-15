package com.uece.state;

public class TCPConnection {
    private TCPState state;

    public TCPConnection() {
        this.state = new TCPStateClosed();
    }
}
