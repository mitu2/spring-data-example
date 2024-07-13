package org.example.springdataexample.repositories.jdbc;

import org.example.springdataexample.entity.PersonEntity;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

/**
 * @author chenmoand
 */
@Repository
public interface ItemRepository extends JpaRepositoryImplementation<PersonEntity, Long> {
}
