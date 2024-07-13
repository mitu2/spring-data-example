package org.example.springdataexample.repositories.elasticsearch;

import org.example.springdataexample.document.PersonDocument;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * @author chenmoand
 */
@Repository
public interface PersonElasticsearchRepository extends ElasticsearchRepository<PersonDocument, Long> {
}
