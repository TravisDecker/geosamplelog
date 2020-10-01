package com.straylense.geosamplelog;

import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
@Table(name = user)
public class user {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NonNull
    private String username;

    @NonNull
    private String password;
}
