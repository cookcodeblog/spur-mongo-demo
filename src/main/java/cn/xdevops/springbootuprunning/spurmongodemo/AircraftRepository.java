package cn.xdevops.springbootuprunning.spurmongodemo;

import org.springframework.data.repository.CrudRepository;

public interface AircraftRepository extends CrudRepository<Aircraft, String> {
}
