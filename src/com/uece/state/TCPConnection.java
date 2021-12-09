package com.uece.state;

public class TCPConnection {
    private TCPState state;

    public TCPConnection() {
        this.state = new TCPStateClosed();
    }

    public void open() {
        this.state = this.state.open();
    }

    public void broadcasting() {
        this.state = this.state.broadcasting();
    }

    public void close() {
        this.state = this.state.close();
    }
}
