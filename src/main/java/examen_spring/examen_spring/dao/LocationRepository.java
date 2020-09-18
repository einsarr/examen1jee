package examen_spring.examen_spring.dao;

import examen_spring.examen_spring.entities.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface LocationRepository extends JpaRepository<Location,Long> {
    @Query("select l from Location l where l.datelocation =:dateloc")
    public List<Location> rechercherLocationByDate(@Param("dateloc") Date datelocation);
}
