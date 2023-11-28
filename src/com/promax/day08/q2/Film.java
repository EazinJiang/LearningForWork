package com.promax.day08.q2;

public class Film {
    private String name;
    private Double score;

    @Override
    public String toString() {
        return "Film{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    public Film(String name, Double score) {
        this.name = name;
        this.score = score;
    }

    public Film() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }
}
