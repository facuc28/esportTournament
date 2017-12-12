package com.thc.code.client.domain.builder;

import com.thc.code.client.domain.LeaguePositionDTO;
import com.thc.code.client.domain.MiniSeriesDTO;

public final class LeaguePositionDTOBuilder {
    private String rank;
    private String queueType;
    private boolean hotStreak;
    private MiniSeriesDTO miniSeries;
    private int wins;
    private boolean veteran;
    private int losses;
    private boolean freshBlood;
    private String leagueId;
    private String playerOrTeamName;
    private boolean inactive;
    private String playerOrTeamId;
    private String tier;
    private int leaguePoints;

    private LeaguePositionDTOBuilder() {
    }

    public static LeaguePositionDTOBuilder aLeaguePositionDTO() {
        return new LeaguePositionDTOBuilder();
    }

    public LeaguePositionDTOBuilder withRank(String rank) {
        this.rank = rank;
        return this;
    }

    public LeaguePositionDTOBuilder withQueueType(String queueType) {
        this.queueType = queueType;
        return this;
    }

    public LeaguePositionDTOBuilder withHotStreak(boolean hotStreak) {
        this.hotStreak = hotStreak;
        return this;
    }

    public LeaguePositionDTOBuilder withMiniSeries(MiniSeriesDTO miniSeries) {
        this.miniSeries = miniSeries;
        return this;
    }

    public LeaguePositionDTOBuilder withWins(int wins) {
        this.wins = wins;
        return this;
    }

    public LeaguePositionDTOBuilder withVeteran(boolean veteran) {
        this.veteran = veteran;
        return this;
    }

    public LeaguePositionDTOBuilder withLosses(int losses) {
        this.losses = losses;
        return this;
    }

    public LeaguePositionDTOBuilder withFreshBlood(boolean freshBlood) {
        this.freshBlood = freshBlood;
        return this;
    }

    public LeaguePositionDTOBuilder withLeagueId(String leagueId) {
        this.leagueId = leagueId;
        return this;
    }

    public LeaguePositionDTOBuilder withPlayerOrTeamName(String playerOrTeamName) {
        this.playerOrTeamName = playerOrTeamName;
        return this;
    }

    public LeaguePositionDTOBuilder withInactive(boolean inactive) {
        this.inactive = inactive;
        return this;
    }

    public LeaguePositionDTOBuilder withPlayerOrTeamId(String playerOrTeamId) {
        this.playerOrTeamId = playerOrTeamId;
        return this;
    }

    public LeaguePositionDTOBuilder withTier(String tier) {
        this.tier = tier;
        return this;
    }

    public LeaguePositionDTOBuilder withLeaguePoints(int leaguePoints) {
        this.leaguePoints = leaguePoints;
        return this;
    }

    public LeaguePositionDTO build() {
        LeaguePositionDTO leaguePositionDTO = new LeaguePositionDTO();
        leaguePositionDTO.setRank(rank);
        leaguePositionDTO.setQueueType(queueType);
        leaguePositionDTO.setHotStreak(hotStreak);
        leaguePositionDTO.setWins(wins);
        leaguePositionDTO.setVeteran(veteran);
        leaguePositionDTO.setLosses(losses);
        leaguePositionDTO.setFreshBlood(freshBlood);
        leaguePositionDTO.setLeagueId(leagueId);
        leaguePositionDTO.setPlayerOrTeamName(playerOrTeamName);
        leaguePositionDTO.setInactive(inactive);
        leaguePositionDTO.setPlayerOrTeamId(playerOrTeamId);
        leaguePositionDTO.setTier(tier);
        leaguePositionDTO.setLeaguePoints(leaguePoints);
        return leaguePositionDTO;
    }
}
