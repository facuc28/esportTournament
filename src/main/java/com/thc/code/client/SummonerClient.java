package com.thc.code.client;


import com.thc.code.client.domain.Summoner;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class SummonerClient {

    @Value("${lol.api.key}")
    private String API_KEY;
    private static final String API_LOL_URL = "https://la2.api.riotgames.com/lol/summoner/v3/summoners/by-name/";

    public Summoner getSummoner(String summonerName) {

        RestTemplate restTemplate = new RestTemplate();
        Summoner summoner = restTemplate.getForObject(API_LOL_URL + summonerName + API_KEY, Summoner.class);
        return summoner;
    }


}
