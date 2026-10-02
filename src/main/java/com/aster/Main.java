package com.aster;

import com.aster.model.FugleMessage;
import com.aster.model.TradeTick;
import com.aster.parser.FugleMessageParser;

public class Main {

    public static void main(String[] args) throws Exception {

        String json = """
                {
                  "event": "data",
                  "data": {
                    "symbol": "2330",
                    "type": "EQUITY",
                    "exchange": "TWSE",
                    "market": "TSE",
                    "bid": 567,
                    "ask": 568,
                    "price": 568,
                    "size": 4778,
                    "volume": 54538,
                    "isClose": true,
                    "time": 1685338200000000,
                    "serial": 6652422
                  },
                  "id": "<CHANNEL_ID>",
                  "channel": "trades"
                }
                """;

        // Parse json message.
        FugleMessageParser parser = new FugleMessageParser();
        FugleMessage message = parser.parse(json);
        TradeTick tradeTick = message.getData();

        System.out.println("event = " + message.getEvent());
        System.out.println("symbol = " + tradeTick.getSymbol());
        System.out.println("price = " + tradeTick.getPrice());
        System.out.println("size = " + tradeTick.getSize());
        System.out.println("volume = " + tradeTick.getVolume());
        System.out.println("time = " + tradeTick.getTime());
        System.out.println("serial = " + tradeTick.getSerial());
        System.out.println("id = " + message.getId());
        System.out.println("channel = " + message.getChannel());

    }
}