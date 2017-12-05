package ack.model;

import com.fasterxml.jackson.annotation.JsonGetter;

public class SearchResponse {

    private Long took;
    private Boolean timeOut;
    private Shards shards;
    private Hits hits;

    public Long getTook() {
        return took;
    }

    public void setTook(Long took) {
        this.took = took;
    }

    @JsonGetter("timed_out")
    public Boolean getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(Boolean timeOut) {
        this.timeOut = timeOut;
    }

    @JsonGetter("_shards")
    public Shards getShards() {
        return shards;
    }

    public void setShards(Shards shards) {
        this.shards = shards;
    }

    public Hits getHits() {
        return hits;
    }

    public void setHits(Hits hits) {
        this.hits = hits;
    }
}
