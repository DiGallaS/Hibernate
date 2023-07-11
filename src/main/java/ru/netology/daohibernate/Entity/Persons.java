package ru.netology.daohibernate.Entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Builder
@Table(name = "persons")
@AllArgsConstructor
@NoArgsConstructor
public class Persons {

    @EmbeddedId
    private PersonsKey personsKey;

    @Column(nullable = false)
    private int phoneNumber;

    @Column(nullable = false)
    private String cityOfLiving;
}
