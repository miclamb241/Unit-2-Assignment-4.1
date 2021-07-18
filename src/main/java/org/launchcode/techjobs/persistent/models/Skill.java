package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    @ManyToMany(mappedBy = "skills")
    private List<Job> jobs = new ArrayList<>();

    @NotBlank
    @Size(max = 500)
    private String description;

    public Skill(List<Job> aJobs, String aDescription) {
        super();
        this.jobs = aJobs;
        this.description = aDescription;
    }

    public Skill() { }

    public Skill(String aDescription) {
        this.description = aDescription;
    }

    public Skill(List<Job> aJobs) { this.jobs = aJobs; }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}