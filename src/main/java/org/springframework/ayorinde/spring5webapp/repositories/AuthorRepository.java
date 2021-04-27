package org.springframework.ayorinde.spring5webapp.repositories;

import org.springframework.ayorinde.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
