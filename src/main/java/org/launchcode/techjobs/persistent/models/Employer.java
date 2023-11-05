package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @NotNull
    @Size (min = 3, max = 50)
    private String location;

    //@OneToMany(mappedBy = "employer")
    @OneToMany
    @JoinColumn(name = "employer_id") // The name parameter indicates that Employer will have a foreign key column named employer_id referring to the id in the class Job
    private final List<Job> jobs = new ArrayList<>();

    public Employer(String location) {
        this.location = location;
    }

    public Employer () {}

    public String getLocation() {
        return location;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
