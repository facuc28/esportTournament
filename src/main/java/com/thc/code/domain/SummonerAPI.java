package com.thc.code.domain;

import com.thc.code.client.domain.LeaguePositionDTO;
import com.thc.code.client.domain.Summoner;

public class SummonerAPI {

    Summoner basicSummonerInfo;
    LeaguePositionDTO leaguePosition;

    public SummonerAPI(Summoner summonerInfoDTO, LeaguePositionDTO leaguePositionDTO) {
        this.basicSummonerInfo = summonerInfoDTO;
        this.leaguePosition = leaguePositionDTO;
    }

    public Summoner getBasicSummonerInfo() {
        return basicSummonerInfo;
    }

    public void setBasicSummonerInfo(Summoner basicSummonerInfo) {
        this.basicSummonerInfo = basicSummonerInfo;
    }

    public LeaguePositionDTO getLeaguePosition() {
        return leaguePosition;
    }

    public void setLeaguePosition(LeaguePositionDTO leaguePosition) {
        this.leaguePosition = leaguePosition;
    }
}
