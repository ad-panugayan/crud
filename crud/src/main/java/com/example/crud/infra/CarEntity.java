package com.example.crud.infra;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(schema = "smpl", name = "Cars")
public class CarEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Integer id;

    @Setter
    @Column(name = "PlateNumber")
    private String plateNumber;

    @Setter
    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "DriverId")
    private DriverEntity driverEntity;

}
