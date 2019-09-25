package com.gennevilliers.com.gennevilliers.dao;

import com.gennevilliers.entities.Parent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface ParentRepository extends JpaRepository<Parent,String> {



}
