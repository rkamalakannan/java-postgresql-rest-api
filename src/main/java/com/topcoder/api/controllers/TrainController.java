package com.topcoder.api.controllers;

import java.util.List;
import java.util.Optional;

import com.topcoder.api.entities.Trains;
import com.topcoder.api.repositories.TrainRepository;
import com.topcoder.api.services.TrainService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/trains")
public class TrainController {

  @Autowired
  private TrainService trainService;

  @Autowired
  private TrainRepository trainRepository;

  /*

  Returns all the available trains from the table "Trains"

  */
  @GetMapping()
  public ResponseEntity<?> getAllTrains() {
    try {
      List<Trains> trains = trainService.findAllTrains();
      return ResponseEntity.status(HttpStatus.OK).body(trains);

    } catch (Exception e) {
      return ResponseEntity.status(HttpStatus.METHOD_NOT_ALLOWED).body("invalid endpoint");

    }
  }

   /*

  Returns all the available trains from the table "Trains" based on the Id

  */

  @GetMapping("/{id}")
  public ResponseEntity<?> getTrainsById(@PathVariable long id) {
    Optional<Trains> trains = trainRepository.findById(id);

    if (trains.isPresent()) {
      return ResponseEntity.status(HttpStatus.OK).body(trains);
    }

    else {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body("train not found");

    }
  }

}