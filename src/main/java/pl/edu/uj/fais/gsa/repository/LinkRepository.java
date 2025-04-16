package pl.edu.uj.fais.gsa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.edu.uj.fais.gsa.model.Link;

public interface LinkRepository extends JpaRepository<Link, Integer> {
}
