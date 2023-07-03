package com.alemeno.controller;

import com.alemeno.dto.Message;
import com.alemeno.model.Tweet;
import com.alemeno.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserServiceImpl userService;


    @PostMapping("/createTweet")
    public Message addProduct(@RequestBody Tweet tweet) {

        userService.createTweet(tweet);
        return new Message("Tweet created Successfully");
    }

    @PutMapping("/updateTweet")
    public Message updateTweet(@RequestBody Tweet tweet) {
        userService.updateTweet(tweet);
        return new Message("Tweet Updated Successfully");
    }

    @DeleteMapping("/deleteTweet")
    public Message deleteTweet(@RequestBody Tweet tweet) {
        userService.deleteTweet(tweet);
        return new Message("Tweet Deleted Successfully");
    }

    @GetMapping("getTweetById")
    public List<Tweet> showTweetById(@RequestBody Tweet tweet){
        return userService.showTweetById(tweet);

    }

    @GetMapping("getTweetsByUser/{id}")
    public List<Tweet> getTweetsByUser(@PathVariable Integer id ){
        return userService.getTweetsByUser(id);
    }

}
