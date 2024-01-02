package com.intelligence.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
@Entity
@Table(name = "spy_list")
public class SpyEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long spy_Id;
    private String spy_Name;

    @Column(unique = true)
    @NotBlank(message = "Spy Username must be provided")
    private String spy_UserName;
    private String spy_Email;
    private String spy_Phone;
    private String spy_Password;
    private String spy_Salary;

    private List<String> spy_Intel;

    private List<String> spy_Files;

    @ManyToMany
    private List<MissionEntity> missions;
}
