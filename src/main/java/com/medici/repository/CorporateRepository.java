package com.medici.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.medici.model.Corporate;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "corporates", path = "corporates")
public interface CorporateRepository extends JpaRepository<Corporate, Long> {

}
