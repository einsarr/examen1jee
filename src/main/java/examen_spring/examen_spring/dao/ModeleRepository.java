package examen_spring.examen_spring.dao;

import examen_spring.examen_spring.entities.Modele;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModeleRepository extends JpaRepository<Modele,Long> {
}
