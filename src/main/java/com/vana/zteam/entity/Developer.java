package com.vana.zteam.entity;

import com.sun.istack.NotNull;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.context.annotation.EnableMBeanExport;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "developer")
public class Developer extends  User{

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "developer_id")
    private String developerId;

    @NotNull
    @Column(name = "developer_name")
    private String developerName;

    @Column(name = "developer_website")
    private String developerWebsite;
}
