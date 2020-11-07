package team.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import team.model.Team;

public interface TeamRepository extends JpaRepository<Team, Integer> {
}
