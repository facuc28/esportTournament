package com.thc.code.client.domain;

import java.util.List;

public class CurrentGameInfo {

    private long gameid;
    private long gameStartTime;
    private String plataformId;
    private String gameMod;
    private long mapId;
    private String gameType;
    private List<BannedChampion> bannedChampions;
    private Observer observers;
    private List<CurrentGameParticipant> participants;
    private long gameLength;
    private long gameQueueConfigId;

    public long getGameid() {
        return gameid;
    }

    public void setGameid(long gameid) {
        this.gameid = gameid;
    }

    public long getGameStartTime() {
        return gameStartTime;
    }

    public void setGameStartTime(long gameStartTime) {
        this.gameStartTime = gameStartTime;
    }

    public String getPlataformId() {
        return plataformId;
    }

    public void setPlataformId(String plataformId) {
        this.plataformId = plataformId;
    }

    public String getGameMod() {
        return gameMod;
    }

    public void setGameMod(String gameMod) {
        this.gameMod = gameMod;
    }

    public long getMapId() {
        return mapId;
    }

    public void setMapId(long mapId) {
        this.mapId = mapId;
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    public List<BannedChampion> getBannedChampions() {
        return bannedChampions;
    }

    public void setBannedChampions(List<BannedChampion> bannedChampions) {
        this.bannedChampions = bannedChampions;
    }

    public Observer getObservers() {
        return observers;
    }

    public void setObservers(Observer observers) {
        this.observers = observers;
    }

    public List<CurrentGameParticipant> getParticipants() {
        return participants;
    }

    public void setParticipants(List<CurrentGameParticipant> participants) {
        this.participants = participants;
    }

    public long getGameLength() {
        return gameLength;
    }

    public void setGameLength(long gameLength) {
        this.gameLength = gameLength;
    }

    public long getGameQueueConfigId() {
        return gameQueueConfigId;
    }

    public void setGameQueueConfigId(long gameQueueConfigId) {
        this.gameQueueConfigId = gameQueueConfigId;
    }
}
