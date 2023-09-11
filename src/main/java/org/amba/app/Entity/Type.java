package org.amba.app.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;
@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class Type {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;


    private String type;

}
