package org.austral.ingsis.compose.user;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface JJUserRepository extends PagingAndSortingRepository<JJUser, Long> {

    JJUser findById(@Param("id") long id);

    @Override
    Page<JJUser> findAll(Pageable pageable);
}
