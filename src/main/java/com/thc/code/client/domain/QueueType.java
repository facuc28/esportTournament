package com.thc.code.client.domain;

public enum QueueType {

    RANKED_SOLO_5X5("solo_Q"),
    RANKED_FLEX_SR("flex");

    private String description;

    QueueType(String param) {
       this.description = param;
    }


    public static QueueType getByDescription(String description) {
        for (QueueType queueType : values()) {
            if (queueType.description.equalsIgnoreCase(description)) {
                return queueType;
            }
        }

        return null;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
