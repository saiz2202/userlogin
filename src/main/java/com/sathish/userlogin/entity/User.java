package com.sathish.userlogin.entity;

import lombok.*;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ad_User")
@SequenceGenerator(name="Idsequence",sequenceName = "Idsequence",initialValue = 1, allocationSize = 50)

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "Idsequence")
    private long userId;

    private String firstName;
    private String lastName;

    @NonNull
    private String name;

    @NonNull
    private String phoneNo;
    private String email;
    private String password;
    private int age;
    private String sex;
    private String address;
    private String pincode;


}
