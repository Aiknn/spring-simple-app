package kz.aiknn.simpleweb.repositories;

import kz.aiknn.simpleweb.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
