/**
 * Copyright (c) 2019 TopCoder, Inc. All rights reserved.
 */
package com.topcoder.api.services;

import java.util.List;

import com.topcoder.api.entities.Trains;
import com.topcoder.api.repositories.TrainRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TrainService extends BaseService {

  @Autowired
  private TrainRepository trainRepository;


  public List<Trains> findAllTrains() {
    return trainRepository.findAll();
  }

}