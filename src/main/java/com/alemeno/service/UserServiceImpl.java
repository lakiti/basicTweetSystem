package com.alemeno.service;

import com.alemeno.model.Tweet;

import java.util.List;

public interface UserServiceImpl {

    public void createTweet(Tweet tweet);

    public void updateTweet(Tweet tweet);

    public void deleteTweet(Tweet tweet);

    public List<Tweet> showTweetById(Tweet tweet);

    public List<Tweet> getTweetsByUser(Integer id);
}
