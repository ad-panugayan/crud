package com.example.crud.infra;

import lombok.*;

import javax.persistence.*;

@Getter
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

    @Setter
    @Column(name = "Name")
    private String name;

    @Setter
    @Column(name = "CarId")
    private Integer carId;
}
