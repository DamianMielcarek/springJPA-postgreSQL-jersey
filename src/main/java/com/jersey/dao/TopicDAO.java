package com.jersey.dao;

import java.util.List;

import com.jersey.entities.Topic;

public interface TopicDAO {

  List<Topic> getAllTopics();

  Topic getTopicById(int topicId);

  void addTopic(Topic topic);

  void updateTopic(Topic topic);

  void deleteTopic(int topicId);

  boolean topicExists(String title, String category);
}
