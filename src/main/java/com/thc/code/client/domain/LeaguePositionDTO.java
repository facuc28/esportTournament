package com.thc.code.client.domain;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LeaguePositionDTO {
    private String leagueId;
    private String leagueName;
    private String tier;
    private String queueType;
    private String rank;
    private String playerOrTeamId;
    private String playerOrTeamName;
    private int leaguePoints;
    private int wins;
    private int losses;
    private boolean veteran;
    private boolean inactive;
    private boolean freshBlood;
    private boolean hotStreak;

    public LeaguePositionDTO() {
    }

    public LeaguePositionDTO(LeaguePositionDTO leaguePositionDTO) {

        this.rank = leaguePositionDTO.rank;
        this.queueType = leaguePositionDTO.queueType;
        this.hotStreak = leaguePositionDTO.hotStreak;
        this.wins = leaguePositionDTO.wins;
        this.veteran = leaguePositionDTO.veteran;
        this.losses = leaguePositionDTO.losses;
        this.freshBlood = leaguePositionDTO.freshBlood;
        this.leagueId = leaguePositionDTO.leagueId;
        this.playerOrTeamName = leaguePositionDTO.playerOrTeamName;
        this.inactive = leaguePositionDTO.inactive;
        this.playerOrTeamId = leaguePositionDTO.playerOrTeamId;
        this.tier = leaguePositionDTO.tier;
        this.leaguePoints = leaguePositionDTO.leaguePoints;
    }




    public LeaguePositionDTO(String leagueName, String rank, String queueType, boolean hotStreak, int wins,
                             boolean veteran, int losses, boolean freshBlood, String leagueId, String playerOrTeamName,
                             boolean inactive, String playerOrTeamId, String tier, int leaguePoints) {
        this.rank = rank;
        this.queueType = queueType;
        this.hotStreak = hotStreak;
        this.wins = wins;
        this.veteran = veteran;
        this.losses = losses;
        this.freshBlood = freshBlood;
        this.leagueId = leagueId;
        this.playerOrTeamName = playerOrTeamName;
        this.inactive = inactive;
        this.playerOrTeamId = playerOrTeamId;
        this.tier = tier;
        this.leaguePoints = leaguePoints;
        this.leagueName = leagueName;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public boolean isHotStreak() {
        return hotStreak;
    }

    public void setHotStreak(boolean hotStreak) {
        this.hotStreak = hotStreak;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public boolean isVeteran() {
        return veteran;
    }

    public void setVeteran(boolean veteran) {
        this.veteran = veteran;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public boolean isFreshBlood() {
        return freshBlood;
    }

    public void setFreshBlood(boolean freshBlood) {
        this.freshBlood = freshBlood;
    }

    public String getPlayerOrTeamName() {
        return playerOrTeamName;
    }

    public void setPlayerOrTeamName(String playerOrTeamName) {
        this.playerOrTeamName = playerOrTeamName;
    }

    public boolean isInactive() {
        return inactive;
    }

    public void setInactive(boolean inactive) {
        this.inactive = inactive;
    }

    public String getPlayerOrTeamId() {
        return playerOrTeamId;
    }

    public void setPlayerOrTeamId(String playerOrTeamId) {
        this.playerOrTeamId = playerOrTeamId;
    }

    public int getLeaguePoints() {
        return leaguePoints;
    }

    public void setLeaguePoints(int leaguePoints) {
        this.leaguePoints = leaguePoints;
    }

    public String getQueueType() {
        return queueType;
    }

    public void setQueueType(String queueType) {
        this.queueType = queueType;
    }

    public String getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(String leagueId) {
        this.leagueId = leagueId;
    }

    public String getTier() {
        return tier;
    }

    public void setTier(String tier) {
        this.tier = tier;
    }
    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }
}
