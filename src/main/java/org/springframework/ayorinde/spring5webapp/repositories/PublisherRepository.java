package org.springframework.ayorinde.spring5webapp.repositories;

import org.springframework.ayorinde.spring5webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {

}
