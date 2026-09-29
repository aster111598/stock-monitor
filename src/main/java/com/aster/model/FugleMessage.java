package com.aster.model;

public class FugleMessage {

    private String event;
    private String channel;
    private TradeTick data;

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public TradeTick getData() {
        return data;
    }

    public void setData(TradeTick data) {
        this.data = data;
    }
}