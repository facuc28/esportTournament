package com.thc.code.framework;

public class BaseTransformer {

    public ChannelResponse transform(Object data, Object optionalProcessingParameter) {
      ChannelResponse channelResponse = new ChannelResponse();

        if (data == null) {
            channelResponse.addAttribute("data",null);
            channelResponse.addAttribute("error", new ErrorResponse(1, "ERROR", "Data is empty", null));

        }
        channelResponse.addAttribute("data",transformData(data, optionalProcessingParameter));

        return channelResponse;
    }

    public Object transformData(Object data) {
        return null;
    }

    protected Object transformData(Object data, Object optionalProcessingParameter) {
        return null;
    }
}
