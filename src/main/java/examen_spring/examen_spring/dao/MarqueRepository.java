package examen_spring.examen_spring.dao;

import examen_spring.examen_spring.entities.Marque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarqueRepository extends JpaRepository<Marque,Long> {
}
