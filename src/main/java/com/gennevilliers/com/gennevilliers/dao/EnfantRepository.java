package com.gennevilliers.com.gennevilliers.dao;

import com.gennevilliers.entities.Enfant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface EnfantRepository extends JpaRepository<Enfant,String> {
}
