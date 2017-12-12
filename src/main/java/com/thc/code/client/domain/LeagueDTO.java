package com.thc.code.client.domain;

import java.util.Set;

public class LeagueDTO {

    private Set<LeaguePositionDTO> leaguePositionDTO;

    public Set<LeaguePositionDTO> getLeaguePositionDTO() {
        return leaguePositionDTO;
    }

    public void setLeaguePositionDTO(Set<LeaguePositionDTO> leaguePositionDTO) {
        this.leaguePositionDTO = leaguePositionDTO;
    }

    public LeagueDTO(Set<LeaguePositionDTO> leaguePositionDTO) {
        this.leaguePositionDTO = leaguePositionDTO;
    }

    public LeagueDTO() {
    }
}
