package com.aster.parser;

import com.aster.model.FugleMessage;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FugleMessageParser {
    private final ObjectMapper objectMapper = new ObjectMapper();

    public FugleMessage parse(String json) throws JsonProcessingException {
        return objectMapper.readValue(json, FugleMessage.class);
    }


}
