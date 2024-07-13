package org.example.springdataexample.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author chenmoand
 */
@Configuration
@EnableJpaRepositories(basePackages = "org.example.springdataexample.repositories.jdbc")
@EnableElasticsearchRepositories(basePackages = "org.example.springdataexample.repositories.elasticsearch")
public class SpringDataConfiguration {
}
