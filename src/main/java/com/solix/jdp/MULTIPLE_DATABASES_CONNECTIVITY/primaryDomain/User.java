package com.solix.jdp.MULTIPLE_DATABASES_CONNECTIVITY.primaryDomain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
    @Id
    private int id;
    private String name;
    private String email;

}
