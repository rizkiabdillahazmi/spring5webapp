package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Rizki Abdillah Azmi on 16-Jan-23
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
