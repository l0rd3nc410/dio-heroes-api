package com.caiomacedo.illegalityleague.repositories;

import com.caiomacedo.illegalityleague.entities.Heroes;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

@EnableScan
public interface HeroesRepository extends CrudRepository<Heroes, String> {

}
