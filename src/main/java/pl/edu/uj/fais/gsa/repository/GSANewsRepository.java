package pl.edu.uj.fais.gsa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.edu.uj.fais.gsa.model.GSANews;

public interface GSANewsRepository extends JpaRepository<GSANews, Integer> {
}
