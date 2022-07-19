package com.sathish.userlogin.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="Department")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String departmentNo;
    private String departmentHeadName;
}
