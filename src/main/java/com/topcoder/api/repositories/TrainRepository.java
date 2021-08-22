package com.topcoder.api.repositories;

import java.util.List;

import com.topcoder.api.entities.Trains;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The interface Train repository.
 */
@Repository
public interface TrainRepository extends JpaRepository<Trains, Long> {

    List<Trains> findAll();

}
