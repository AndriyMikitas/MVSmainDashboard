package com.example.generaldashboard;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalTime;

@Entity
@Table(name = "WorkingPlaces")

public class WorkingPlace {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column (name = "region" )
    private String region;

    @Column (name = "office" )
    private String office;

    @Column (name = "workingPlace" )
    private String workingPlace;

    @Column (name = "scheduledTime" )
    private LocalTime scheduledTime;

    @Column (name = "actualTime" )
    private LocalTime actualTime;

    public WorkingPlace() {

    }

    public WorkingPlace(String region, String office, String workingPlace, LocalTime scheduledTime, LocalTime actualTime){
        super();
        this.region = region;
        this.office = office;
        this.workingPlace = workingPlace;
        this.scheduledTime = scheduledTime;
        this.actualTime = actualTime;
    }

    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    public String getRegion(){
        return region;
    }

    public void setRegion(String region){
        this.region = region;
    }

    public String getOffice(){
        return office;
    }

    public void setOffice(String office){
        this.office = office;
    }

    public String getWorkingPlace(){
        return workingPlace;
    }

    public void setWorkingPlace(String workingPlace){
        this.workingPlace = workingPlace;
    }

    public LocalTime getScheduledTime(){
        return scheduledTime;
    }

    public void setScheduledTime(LocalTime scheduledTime){
        this.scheduledTime = scheduledTime;
    }

    public LocalTime getActualTime(){
        return actualTime;
    }

    public void setActualTime(LocalTime actualTime){
        this.actualTime = actualTime;
    }



}

