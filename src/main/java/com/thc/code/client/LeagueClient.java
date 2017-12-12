package com.thc.code.client;

import com.thc.code.client.domain.LeaguePositionDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Component
public class LeagueClient {

    @Value("${lol.api.key}")
    private String API_KEY;
    private static final String API_LOL_URL = "https://la2.api.riotgames.com/lol/league/v3/positions/by-summoner/";



    public List<LeaguePositionDTO> getLeagueBySummonerId(long summonerId) {

        String summonerIdValue = String.valueOf(summonerId);
        RestTemplate restTemplate = new RestTemplate();
        LeaguePositionDTO[] league = restTemplate.getForObject(API_LOL_URL + summonerIdValue + API_KEY, LeaguePositionDTO[].class);

        return Arrays.asList(league);
    }



}
