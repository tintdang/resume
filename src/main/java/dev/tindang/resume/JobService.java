package dev.tindang.resume;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobService {
    
    @Autowired
    private JobRepositiory jobRepositiory;
    public List<Job> allJobs(){
        return jobRepositiory.findAll();
    }
    public Optional<Job> singleJob(ObjectId id) {
        return jobRepositiory.findById(id);
    }
}
