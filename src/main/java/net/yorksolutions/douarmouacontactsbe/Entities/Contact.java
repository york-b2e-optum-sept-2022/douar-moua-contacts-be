package net.yorksolutions.douarmouacontactsbe.Entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Contact {

    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    @JsonProperty
    private Long id;

    @JsonProperty
    private String name;

    @JsonProperty
    private Long phone;

    @JsonProperty
    private Date entryDate;

    @JsonProperty
    private boolean active;
}
