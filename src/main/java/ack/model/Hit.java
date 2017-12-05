package ack.model;

import com.fasterxml.jackson.annotation.JsonGetter;

public class Hit {

    private String index;
    private String type;
    private String id;
    private String score;
    private AckSponsor source;

    @JsonGetter("_index")
    public String getIndex() {
        return index;
    }


    public void setIndex(String index) {
        this.index = index;
    }

    @JsonGetter("_type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @JsonGetter("_id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @JsonGetter("_score")
    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    @JsonGetter("_source")
    public AckSponsor getSource() {
        return source;
    }

    public void setSource(AckSponsor source) {
        this.source = source;
    }
}
