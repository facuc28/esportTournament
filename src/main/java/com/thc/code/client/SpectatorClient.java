package com.thc.code.client;

import com.thc.code.client.domain.CurrentGameInfo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class SpectatorClient {

    @Value("${lol.api.key}")
    private String API_KEY;
    private static final String API_LOL_URL = "https://la2.api.riotgames.com/lol/spectator/v3/active-games/by-summoner/";

    public CurrentGameInfo getActiveGameBySummonerId(long summonerId) {
        RestTemplate restTemplate = new RestTemplate();
        try {
            return restTemplate.getForObject(API_LOL_URL + String.valueOf(summonerId) + API_KEY, CurrentGameInfo.class);
        }catch (Exception E) {
            return new CurrentGameInfo();
        }

    }

}
