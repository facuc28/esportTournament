package com.thc.code.client.domain;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class Summoner implements Serializable{

    private int profileIconId;
    private String name;
    private long summonerLevel;
    private long revisionDate;
    private long id;
    private long accountId;

    public Summoner(int profileIconId, String name, long summonerLevel, long revisionDate, long id, long accountId) {
        this.profileIconId = profileIconId;
        this.name = name;
        this.summonerLevel = summonerLevel;
        this.revisionDate = revisionDate;
        this.id = id;
        this.accountId = accountId;
    }

    public Summoner() {
    }

    public Summoner(Summoner summoner) {
        this.profileIconId = summoner.profileIconId;
        this.name = summoner.name;
        this.summonerLevel = summoner.summonerLevel;
        this.revisionDate = summoner.revisionDate;
        this.id = summoner.id;
        this.accountId = summoner.accountId;
    }

    public int getProfileIconId() {
        return profileIconId;
    }

    public void setProfileIconId(int profileIconId) {
        this.profileIconId = profileIconId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSummonerLevel() {
        return summonerLevel;
    }

    public void setSummonerLevel(long summonerLevel) {
        this.summonerLevel = summonerLevel;
    }

    public long getRevisionDate() {
        return revisionDate;
    }

    public void setRevisionDate(long revisionDate) {
        this.revisionDate = revisionDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }
}
