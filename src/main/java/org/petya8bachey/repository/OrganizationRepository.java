package org.petya8bachey.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.petya8bachey.domain.Organization;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository  @Transactional
public interface OrganizationRepository extends JpaRepository<Organization, Integer> {
    List<Organization> findAllByName(String name);
}
