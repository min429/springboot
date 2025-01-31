package jump.to.springboot.domain.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jump.to.springboot.domain.user.entity.SiteUser;

@Repository
public interface UserRepository extends JpaRepository<SiteUser, Long> {
}
