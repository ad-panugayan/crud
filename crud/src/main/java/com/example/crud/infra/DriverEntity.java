package com.example.crud.infra;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(schema = "smpl", name = "Drivers")
public class DriverEntity {
    @Id
    @GeneratedValue
    @Column(name = "Id")
    private Integer id;

    @Column(name = "Name")
    private String name;

    @Column(name = "CarId")
    private Integer carId;
}
