package com.quiendamas.biddingapp.repository;

import com.quiendamas.biddingapp.model.Puja;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPujaRepository extends JpaRepository <Puja,Long> {
}
