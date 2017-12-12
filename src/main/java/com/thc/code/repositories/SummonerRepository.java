package com.thc.code.repositories;

import com.thc.code.client.domain.Summoner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SummonerRepository {

    private List<Summoner> summoners = new ArrayList<>();

    public boolean addSummoner(Summoner summoner) {
    return summoners.add(new Summoner(summoner));
    }

    public List<Summoner> getSummoners() {
        return summoners;
    }

    public Summoner getSummonerByName(String summonerName) {
        for (Summoner summoner : summoners) {
            if (summoner.getName().equalsIgnoreCase(summonerName)) {
                return summoner;
            }
        }

        return null;
    }
}
