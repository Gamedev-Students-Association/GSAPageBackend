package pl.edu.uj.fais.gsa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.edu.uj.fais.gsa.model.Project;

public interface ProjectRepository extends JpaRepository<Project, Integer> {
}
