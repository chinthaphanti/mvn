package xx.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import xx.model.Sample;

public interface SampleRepository extends MongoRepository<Sample, String> {

}
