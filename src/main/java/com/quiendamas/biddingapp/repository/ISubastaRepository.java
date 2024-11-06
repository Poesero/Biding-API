package com.quiendamas.biddingapp.repository;

import com.quiendamas.biddingapp.model.Subasta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISubastaRepository extends JpaRepository <Subasta, Long> {
}
