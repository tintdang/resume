package dev.tindang.resume;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    
    @Autowired
    private JobRepositiory jobRepositiory;
    public List<Job> allJobs(){
        return jobRepositiory.findAll();
    }
}
