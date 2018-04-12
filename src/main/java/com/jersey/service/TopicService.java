package com.jersey.service;

import java.util.List;

import com.jersey.entities.Topic;

public interface TopicService {

  List<Topic> getAllTopices();

  Topic getTopicById(int topicId);

  boolean addTopic(Topic topic);

  void updateTopic(Topic topic);

  void deleteTopic(int topicId);
}
