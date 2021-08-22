package com.topcoder.api.entities;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "trains")
public class Trains extends IdentifiableEntity implements Serializable {

    @Id
    private long id;
    private String name;
    private String description;
    @JsonProperty("distance-between-stop")
    private String distance_between_stop;
    @JsonProperty("max-speed")
    private String max_speed;
    @JsonProperty("sharing-tracks")
    private Boolean sharing_tracks;
    @JsonProperty("grade-crossing")
    private Boolean grade_crossing;
    @JsonProperty("train-frequency")
    private String train_frequency;
    @JsonProperty("amenities")
    private String amenities;

}
