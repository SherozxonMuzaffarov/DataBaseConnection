package com.example.databaseconnection.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String firstName;
    private String LastName;
    private String email;

//    public UserModel(String firstName, String lastName, String email) {
//        this.firstName = firstName;
//        LastName = lastName;
//        this.email = email;
//    }
//
//    public UserModel(Long id, String firstName, String lastName, String email) {
//        Id = id;
//        this.firstName = firstName;
//        LastName = lastName;
//        this.email = email;
//    }


}
