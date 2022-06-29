package com.vana.zteam.repository;

import com.vana.zteam.entity.Gamer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GamerRepository extends JpaRepository<Gamer,String> {
}
