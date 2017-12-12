package com.thc.code.services;

import com.thc.code.client.LeagueClient;
import com.thc.code.client.SpectatorClient;
import com.thc.code.client.SummonerClient;
import com.thc.code.client.domain.CurrentGameInfo;
import com.thc.code.client.domain.LeaguePositionDTO;
import com.thc.code.client.domain.Summoner;
import com.thc.code.repositories.SummonerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SummonerService {

    @Autowired
    SummonerRepository summonerRepository;

    @Autowired
    SummonerClient summonerClient;

    @Autowired
    LeagueClient leagueClient;

    @Autowired
    SpectatorClient spectatorClient;

    @Autowired
    Summoner summoner;

    public boolean addLocalSummoner(Summoner summoner) {
        return summonerRepository.addSummoner(summoner);
    }

    public Summoner getLocalSummonerByName(String name) {
        return summonerRepository.getSummonerByName(name);
    }

    public Summoner getDownstreamSummonerByName(String summonerName) {
        if (summoner != null && summonerName.equalsIgnoreCase(summoner.getName())) {
            return summoner;
        }
        updateSummoner(summonerName);

        return summoner;
    }

    public LeaguePositionDTO getSummonerLeague(String summonerName, String queueType) {
        processSummonerCache(summonerName);

        List<LeaguePositionDTO> clientSummonerLeagues = leagueClient.getLeagueBySummonerId(summoner.getId());

        for (LeaguePositionDTO league : clientSummonerLeagues) {
           if (league.getQueueType().equalsIgnoreCase(queueType)) {

               return league;
           }
        }

        return null;
    }

    private void processSummonerCache(String summonerName) {
        if (summoner != null && !summonerName.equalsIgnoreCase(summoner.getName())) {
            updateSummoner(summonerName);
        }
    }

    public CurrentGameInfo getSummonerCurrentGame(String summonerName) {
        processSummonerCache(summonerName);

        return spectatorClient.getActiveGameBySummonerId(summoner.getId());
    }

    private void updateSummoner(String summonerName) {
        summoner = summonerClient.getSummoner(summonerName);
    }

}
