package org.austral.ingsis.compose.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JJUserRepository extends JpaRepository<JJUser, Long> {

}
