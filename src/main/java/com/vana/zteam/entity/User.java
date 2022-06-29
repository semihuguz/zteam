package com.vana.zteam.entity;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name="user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    private long userId;

    @NotNull
    @Column(name="user_name")
    private String userName;

    @NotNull
    @Column(name="mail")
    private String mail;

    @NotNull
    @Column(name="password")
    private String password;

    @NotNull
    @Column(name="phone")
    private String phone;

    @Column(name="crate_date")
    private LocalDateTime createDate;



}
