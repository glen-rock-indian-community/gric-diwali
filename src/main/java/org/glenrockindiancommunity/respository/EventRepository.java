package org.glenrockindiancommunity.respository;

import java.time.LocalDateTime;
import java.util.List;

import org.glenrockindiancommunity.model.GricEvent;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "/event", collectionResourceRel = "events")
public interface EventRepository extends PagingAndSortingRepository<GricEvent, Integer> {

  GricEvent findByName(String name);

  List<GricEvent> findAllByEndDateTimeGreaterThanEqualOrderByStartDateTimeAsc(LocalDateTime today);

}
