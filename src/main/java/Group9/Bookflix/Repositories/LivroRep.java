package Group9.Bookflix.Repositories;

import org.springframework.data.repository.CrudRepository;
import Group9.Bookflix.Entities.Livro;

public interface LivroRep extends CrudRepository<Livro, Long> {

}