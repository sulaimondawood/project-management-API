package com.cloud.project_management_system.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Issue {
  @Id
  @GeneratedValue
  private Long id;

}
