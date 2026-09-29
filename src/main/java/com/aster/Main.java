package com.aster;

import com.aster.model.TradeTick;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) throws Exception{
        String json = """
                {
                  "symbol": "2330",
                  "price": 1250.0,
                  "size": 3
                }
                """;

        ObjectMapper objectMapper = new ObjectMapper();

        TradeTick tradeTick =
                objectMapper.readValue(json, TradeTick.class);

        System.out.println("symbol = " + tradeTick.getSymbol());
        System.out.println("price = " + tradeTick.getPrice());
        System.out.println("size = " + tradeTick.getSize());
    }
}