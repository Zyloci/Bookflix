package Group9.Bookflix.Repositories;

import org.springframework.data.repository.CrudRepository;
import Group9.Bookflix.Entities.Usuario;

public interface UserRep extends CrudRepository<Usuario, Long> {

}