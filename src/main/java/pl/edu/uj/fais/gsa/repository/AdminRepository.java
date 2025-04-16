package pl.edu.uj.fais.gsa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.edu.uj.fais.gsa.model.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer> {
}
