package com.thc.code.framework;

import java.util.Map;

import static org.springframework.util.ObjectUtils.isEmpty;

public class ApiValidator {

    private static final String NOT_ACCEPTED = "'";

    public static boolean validateRequest(Map<String, String> queryParams) {

        if (isEmpty(queryParams)) {
            return false;
        }

        for (Map.Entry<String, String> entry : queryParams.entrySet()) {
            if (isEmpty(entry.getValue()) || NOT_ACCEPTED.equalsIgnoreCase(entry.getValue())) {
                return false;
            }
        }

        return true;
    }

    public static ChannelResponse generateFailureResponse(Map<String, String> params) {
        ChannelResponse channelResponse = new ChannelResponse();
        channelResponse.addAttribute("data", null);
        channelResponse.addAttribute("error", new ErrorResponse(2, "ERROR", "Parameter not valid", null));

        return channelResponse;
    }

}
