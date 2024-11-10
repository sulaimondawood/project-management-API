package com.cloud.project_management_system.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "_user")
public class User {
  @Id
  @GeneratedValue
  private Long id;

  private String fullName;
  private String email;
  private String password;
  @JsonIgnore
  @OneToMany(mappedBy = "assignees", cascade = CascadeType.ALL)
  private List<Issue> assignedIssues = new ArrayList<>();
  private int projectCounts;
}
