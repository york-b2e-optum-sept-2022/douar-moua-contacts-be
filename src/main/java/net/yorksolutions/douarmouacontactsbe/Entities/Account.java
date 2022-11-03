package net.yorksolutions.douarmouacontactsbe.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
public class Account {

    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    @JsonProperty
    private Long id;

    @JsonProperty
    @Column (unique = true)
    private String username;

    @JsonProperty
    @JsonIgnore
    private String password;
}
