package org.springframework.ayorinde.spring5webapp.repositories;

import org.springframework.ayorinde.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
