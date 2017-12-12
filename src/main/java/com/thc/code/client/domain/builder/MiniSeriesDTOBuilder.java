package com.thc.code.client.domain.builder;

import com.thc.code.client.domain.MiniSeriesDTO;

public final class MiniSeriesDTOBuilder {
    private int wins;
    private int losses;
    private int target;
    private String progress;

    private MiniSeriesDTOBuilder() {
    }

    public static MiniSeriesDTOBuilder aMiniSeriesDTO() {
        return new MiniSeriesDTOBuilder();
    }

    public MiniSeriesDTOBuilder withWins(int wins) {
        this.wins = wins;
        return this;
    }

    public MiniSeriesDTOBuilder withLosses(int losses) {
        this.losses = losses;
        return this;
    }

    public MiniSeriesDTOBuilder withTarget(int target) {
        this.target = target;
        return this;
    }

    public MiniSeriesDTOBuilder withProgress(String progress) {
        this.progress = progress;
        return this;
    }

    public MiniSeriesDTO build() {
        MiniSeriesDTO miniSeriesDTO = new MiniSeriesDTO();
        miniSeriesDTO.setWins(wins);
        miniSeriesDTO.setLosses(losses);
        miniSeriesDTO.setTarget(target);
        miniSeriesDTO.setProgress(progress);
        return miniSeriesDTO;
    }
}
