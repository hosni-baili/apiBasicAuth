package com.sesame.amsrest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.sesame.amsrest.entities.Provider;

@CrossOrigin(origins = "*")
@Repository
public interface ProviderRepository extends CrudRepository<Provider, Long>{

}
