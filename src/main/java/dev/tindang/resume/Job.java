package dev.tindang.resume;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "jobs")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Job {
    @Id
    private ObjectId id;
    private String jobId;
    private String jobTitle;
    private String employer;
    private String startDate;
    private String endDate;
    private String description;
    private List<String> roleDescription;
}
