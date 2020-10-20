package com.straylense.geosamplelog.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "app_users")
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID userId;

    @NonNull
    @Column(unique = true)
    private String username;

    @NonNull
    private String password;

    private String roles;

    @Column(columnDefinition = "boolean default true")
    private boolean enabled;

    @Column(columnDefinition = "boolean default true")
    private boolean isAccountNonExpired;

    @Column(columnDefinition = "boolean default true")
    private boolean isAccountNonLocked;

    @Column(columnDefinition = "boolean default true")
    private boolean isCredentialsNonExpired;

}
