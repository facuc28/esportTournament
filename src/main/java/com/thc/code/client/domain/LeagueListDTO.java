package com.thc.code.client.domain;

import java.util.List;

public class LeagueListDTO {

    private String tier;
    private String queue;
    private String name;
    private List<LeaguePositionDTO> entries;


    public LeagueListDTO() {
    }

    public LeagueListDTO(String tier, String queue, String name, List<LeaguePositionDTO> entries) {
        this.tier = tier;
        this.queue = queue;
        this.name = name;
        this.entries = entries;
    }

    public String getTier() {
        return tier;
    }

    public void setTier(String tier) {
        this.tier = tier;
    }

    public String getQueue() {
        return queue;
    }

    public void setQueue(String queue) {
        this.queue = queue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<LeaguePositionDTO> getEntries() {
        return entries;
    }

    public void setEntries(List<LeaguePositionDTO> entries) {
        this.entries = entries;
    }
}
