package com.shubham.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shubham.entity.Train;

@Repository
public interface TrainRepository extends JpaRepository<Train,Long>
{

}
