package sri.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import sri.model.Sample;

public interface SampleRepository extends MongoRepository<Sample, String> {

}
