package pl.edu.uj.fais.gsa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.edu.uj.fais.gsa.model.GSAEvent;

public interface GSAEventRepository extends JpaRepository<GSAEvent, Integer> {
}
