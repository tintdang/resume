package dev.tindang.resume;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepositiory extends MongoRepository<Job, ObjectId> {
    Optional<Job> findJobByJobId(String jobId);
}
