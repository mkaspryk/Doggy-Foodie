package pl.polsl.gr6.proj.io.DoggyFoodie.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import pl.polsl.gr6.proj.io.DoggyFoodie.model.Uzytkownik;

/**
 *
 * @author Radosław Płachta
 * @version 1.0
 */
public interface UzytkownikRepository extends CrudRepository<Uzytkownik, Integer> {
    @Query("SELECT u FROM Uzytkownik u WHERE u.name = ?1 AND u.password = ?2")
    Uzytkownik findUser(String name, String passwd);
}
