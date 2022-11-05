package proyecto.mingeso.microserviceempleado.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import proyecto.mingeso.microserviceempleado.entities.EmpleadoEntity;

@Repository
public interface EmpleadoRepository extends JpaRepository<EmpleadoEntity, Long> {
}