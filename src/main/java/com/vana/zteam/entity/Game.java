package com.vana.zteam.entity;

import com.sun.istack.NotNull;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "game")
public class Game {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID",strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "game_id")
    private String gameId;
    @NotNull
    @Column(name = "game_name")
    private String gameName;
    @NotNull
    @Column(name = "game_price")
    private double gamePrice;
    @NotNull
    @Column(name = "game_discount")
    private double gameDiscount;
    @NotNull
    @Column(name = "publisher_name")
    private String publisherName;
    @NotNull
    @Column(name = "developer_name")
    private String developerName;
    @NotNull
    @Column(name = "release_date")
    private Date releaseDate;
    @NotNull
    @Column(name = "game_genre")
    private String gameGenre;


}
