package com.example.crud.infra;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(schema = "smpl", name = "Drivers")
public class DriverEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Integer id;

    @Setter
    @Column(name = "Name")
    private String name;

    @Setter
    @JsonManagedReference
    @OneToMany(mappedBy = "driverEntity", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<CarEntity> carEntities;

}
