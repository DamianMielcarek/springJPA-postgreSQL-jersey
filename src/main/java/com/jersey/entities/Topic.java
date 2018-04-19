package com.jersey.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "topics")
@Data
public class Topic implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id")
  private int topicId;

  @Column(name = "title", nullable = false, length = 100)
  private String title;

  @Column(name = "category", nullable = false, length = 200)
  private String category;
}
