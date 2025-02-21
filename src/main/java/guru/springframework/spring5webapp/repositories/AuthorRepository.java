package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Rizki Abdillah Azmi on 16-Jan-23
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
