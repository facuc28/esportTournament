package com.thc.code.resources;

import com.thc.code.client.SummonerClient;
import com.thc.code.client.domain.CurrentGameInfo;
import com.thc.code.client.domain.Summoner;
import com.thc.code.framework.ApiValidator;
import com.thc.code.framework.ChannelResponse;
import com.thc.code.mappers.SummonerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/summoner")
public class SummonerResource {

    @Autowired
    SummonerClient summonerClient;

    @Autowired
    SummonerMapper summonerMapper;

    @RequestMapping("/get/basic")
    public Summoner getSummoner(@RequestParam(value = "summonerName") String summonerName) {
        return summonerClient.getSummoner(summonerName);
    }

    @RequestMapping("/get/medium")
    public ChannelResponse getSummonerWithLeagueInfo(@RequestParam(value = "summonerName") String summonerName) {
        return summonerMapper.retrieveSummonerInformation(summonerName);
    }

    @RequestMapping("/get/match/current")
    public CurrentGameInfo getCurrentGameInfo(@RequestParam(value = "summonerName") String summonerName) {
        return summonerMapper.getSummonerCurrentMatch(summonerName);
    }

    @RequestMapping("/get/medium/queue")
    public ChannelResponse getCurrentGameInfo(@RequestParam Map<String,String> params) {
        if (!ApiValidator.validateRequest(params)) {
            return ApiValidator.generateFailureResponse(params);
        }

        String summonerName = params.get("summonerName");
        String queueType = params.get("queuetype");

        return summonerMapper.retrieveSummonerInformationByQueue(summonerName, queueType);
    }
}
