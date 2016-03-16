package com.houcine.jhipster.repository.search;

import com.houcine.jhipster.domain.Tag;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data ElasticSearch repository for the Tag entity.
 */
public interface TagSearchRepository extends ElasticsearchRepository<Tag, Long> {
}
