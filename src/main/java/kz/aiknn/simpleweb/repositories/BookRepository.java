package kz.aiknn.simpleweb.repositories;

import kz.aiknn.simpleweb.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
