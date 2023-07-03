package com.alemeno.service;

import com.alemeno.model.Tweet;
import com.alemeno.repository.TweetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class UserService  implements UserServiceImpl{
    @Autowired
    TweetRepository tweetRepository;


    @Override
    public void createTweet(Tweet tweet) {

        tweetRepository.save(tweet);
    }


    @Override
    public void updateTweet(Tweet tweet) {
        tweetRepository.updateTweetBytweetID(tweet.getTweetID(), tweet.getContent());

    }

    @Override
    public void deleteTweet(Tweet tweet) {
        tweetRepository.deleteById(tweet.getTweetID());

    }

    @Override
    public List<Tweet> showTweetById(Tweet tweet){
        return  tweetRepository.findAllById(Collections.singleton(tweet.getTweetID()));
    }


    @Override
    public List<Tweet> getTweetsByUser(Integer id) {
        return tweetRepository.getAllTweetsById(id);
    }
}
