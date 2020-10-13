package com.straylense.geosamplelog;

import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "user")
@Builder
@NoArgsConstructor
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID userId;

    @NonNull
    private String username;

    private String firstName;

    private String lastName;

    @NonNull
    private String password;

    @OneToMany
    private List<MineralSampleEntity> mineralSampleList;
}
