package com.example.answer3.pingPong;

public class PingPong {
    private static final int MAX_COUNT = 30;

    public static void main(String[] args) {
        PingPongExecute pongExecute = new PingPongExecute();

        Thread pingThread = new Thread(() -> {
            for (int i = 0; i < MAX_COUNT; i++) {
                pongExecute.playPing();
            }
        });

        Thread pongThread = new Thread(() -> {
            for (int i = 0; i < MAX_COUNT; i++) {
                pongExecute.playPong();
            }
        });

        pingThread.start();
        pongThread.start();
    }
}

