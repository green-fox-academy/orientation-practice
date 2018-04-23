package com.greenfox.academy.travelagency.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "attractions")
public class Attraction {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;


    @Column(name = "attr_name")
    private String attrName;

    @Column(name = "city")
    private String city;

    @Column(name = "category")
    private String category;

    @Column(name = "price")
    private Integer price;

    @Column(name = "longitude")
    private Float longitude;

    @Column(name = "lattitude")
    private Float lattitude;

    @JsonProperty("recommended_age")
    @Column(name = "recommended_age")
    private Float recommendedAge;

    @Column(name = "duration")
    private Integer duration;

    public Integer getId() {
        return id;
    }
}
