package nl.novi.marijana.les12huiswerkservices.repositories;

import nl.novi.marijana.les12huiswerkservices.models.Television;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//<Datatype of the Entity, datatype of the id>
public interface TelevisionRepository extends JpaRepository<Television, Long> {
    List<Television> findAllTelevisionsByBrandEqualsIgnoreCase(String brand);
}
