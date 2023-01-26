package com.Hack.Hack.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="happy")
public class Happy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String first;

    private String second;
    private String third;
    private String fourth;
    private String fifth;




}


