package ack.model;

import com.fasterxml.jackson.annotation.JsonGetter;

import java.util.List;

public class Hits {


    private List<Hit> hits;
    private Long total;
    private Double maxScore;


    public List<Hit> getHits() {
        return hits;
    }

    public void setHits(List<Hit> hits) {
        this.hits = hits;
    }


    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    @JsonGetter("max_score")
    public Double getMaxScore() {
        return maxScore;
    }

    public void setMaxScore(Double maxScore) {
        this.maxScore = maxScore;
    }
}
