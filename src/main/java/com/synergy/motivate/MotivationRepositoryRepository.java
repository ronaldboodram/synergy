package com.synergy.motivate;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "motivate")
public interface MotivationRepositoryRepository extends CrudRepository<DailyMotivationMsg, Long> {


}
