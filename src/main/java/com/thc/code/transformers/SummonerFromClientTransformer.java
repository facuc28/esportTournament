package com.thc.code.transformers;

import com.thc.code.client.domain.LeaguePositionDTO;
import com.thc.code.client.domain.Summoner;
import com.thc.code.domain.SummonerAPI;
import com.thc.code.framework.BaseTransformer;
import org.springframework.stereotype.Component;

@Component
public class SummonerFromClientTransformer extends BaseTransformer {

    @Override
    protected Object transformData(Object data, Object optionalProcessingParameter) {
        Summoner summonerInfoDTO = (Summoner) data;
        LeaguePositionDTO leaguePositionDTO = (LeaguePositionDTO) optionalProcessingParameter;

        return new SummonerAPI(summonerInfoDTO, leaguePositionDTO);
    }
}
