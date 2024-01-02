package com.intelligence.entities;

import com.intelligence.dtos.MissionStatus;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Entity
@Data
@Table(name = "mission_list")
public class MissionEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mission_Id;
    private String mission_Name;

    @Column(unique = true)
    @NotBlank(message = "Mission Username must be provided")
    private String mission_UserName;
    private String mission_Location;
    private String mission_Description;
    private String mission_Date;
    private String mission_Expense;

    private List<String> mission_Files;

    private MissionStatus missionStatus;

    @ManyToMany
    private List<SpyEntity> spies;
}
