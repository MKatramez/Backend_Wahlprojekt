package de.hsrm.Muzik.repository;

import de.hsrm.Muzik.baseClass.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {


    @Query("SELECT p FROM Person p WHERE p.mail=?1")
    Optional<Person> findPersonByEmail(String mail);

}
