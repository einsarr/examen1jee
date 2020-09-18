package examen_spring.examen_spring.dao;

import examen_spring.examen_spring.entities.Location;
import examen_spring.examen_spring.entities.Vehicule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface VehiculeRepository extends JpaRepository<Vehicule,Long> {
    @Query("select v from Vehicule v where v.modele.id =:modele_id")
    public List<Vehicule> rechercherVehiculeByModele(@Param("modele_id") Long idmodele);
}
