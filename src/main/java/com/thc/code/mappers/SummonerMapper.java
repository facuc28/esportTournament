package com.thc.code.mappers;

import com.thc.code.client.SummonerClient;
import com.thc.code.client.domain.CurrentGameInfo;
import com.thc.code.client.domain.LeaguePositionDTO;
import com.thc.code.client.domain.QueueType;
import com.thc.code.client.domain.Summoner;
import com.thc.code.framework.ChannelResponse;
import com.thc.code.services.SummonerService;
import com.thc.code.transformers.SummonerFromClientTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SummonerMapper {

    @Autowired
    SummonerClient summonerClient;

    @Autowired
    SummonerService summonerService;

    @Autowired
    SummonerFromClientTransformer summonerFromClientTransformer;

    public ChannelResponse retrieveSummonerInformation(String summonerName) {
        Summoner clientSummoner = summonerService.getDownstreamSummonerByName(summonerName);
        LeaguePositionDTO clientSummonerLeague = summonerService.getSummonerLeague(summonerName, QueueType.RANKED_SOLO_5X5.name());

        return summonerFromClientTransformer.transform(clientSummoner, clientSummonerLeague);
    }

    public CurrentGameInfo getSummonerCurrentMatch(String summonerName) {
        return summonerService.getSummonerCurrentGame(summonerName);
    }

    public ChannelResponse retrieveSummonerInformationByQueue(String summonerName, String queueType) {

        Summoner clientSummoner = summonerService.getDownstreamSummonerByName(summonerName);
        LeaguePositionDTO clientSummonerLeague = summonerService.getSummonerLeague(summonerName, QueueType.getByDescription(queueType).name());

        return summonerFromClientTransformer.transform(clientSummoner, clientSummonerLeague);
    }


}
