package com.thc.code.client.domain;

public class MiniSeriesDTO {

    private int wins;
    private int losses;
    private int target;
    private String progress;

    public MiniSeriesDTO() {
    }

    public MiniSeriesDTO(int wins, int losses, int target, String progress) {
        this.wins = wins;
        this.losses = losses;
        this.target = target;
        this.progress = progress;
    }

    public MiniSeriesDTO(MiniSeriesDTO miniSeriesDTO) {
        this.wins = miniSeriesDTO.wins;
        this.losses = miniSeriesDTO.losses;
        this.target = miniSeriesDTO.target;
        this.progress = miniSeriesDTO.progress;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public int getTarget() {
        return target;
    }

    public void setTarget(int target) {
        this.target = target;
    }

    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }
}
