package com.aster;

import com.aster.model.FugleMessage;
import com.aster.model.TradeTick;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

    public static void main(String[] args) throws Exception {

        String json = """
                {
                  "event": "data",
                  "channel": "trades",
                  "data": {
                    "symbol": "2330",
                    "price": 1250.0,
                    "size": 3
                  }
                }
                """;

        ObjectMapper objectMapper = new ObjectMapper();

        FugleMessage message =
                objectMapper.readValue(json, FugleMessage.class);

        TradeTick tradeTick = message.getData();

        System.out.println("event = " + message.getEvent());
        System.out.println("channel = " + message.getChannel());
        System.out.println("symbol = " + tradeTick.getSymbol());
        System.out.println("price = " + tradeTick.getPrice());
        System.out.println("size = " + tradeTick.getSize());
    }
}