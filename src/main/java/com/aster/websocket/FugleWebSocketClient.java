package com.aster.websocket;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.WebSocket;
import java.util.concurrent.CompletionStage;

public class FugleWebSocketClient implements WebSocket.Listener {

    private static final String URL =
            "wss://api.fugle.tw/marketdata/v1.0/stock/streaming";

    public void connect() {

        HttpClient client = HttpClient.newHttpClient();

        client.newWebSocketBuilder()
                .buildAsync(URI.create(URL), this)
                .join();
    }

    @Override
    public void onOpen(WebSocket webSocket) {
        System.out.println("WebSocket connected");

        WebSocket.Listener.super.onOpen(webSocket);
    }

    @Override
    public CompletionStage<?> onText(
            WebSocket webSocket,
            CharSequence data,
            boolean last) {

        System.out.println("Received: " + data);

        webSocket.request(1);

        return null;
    }

    @Override
    public void onError(WebSocket webSocket, Throwable error) {
        System.out.println("WebSocket error: " + error.getMessage());
    }
}