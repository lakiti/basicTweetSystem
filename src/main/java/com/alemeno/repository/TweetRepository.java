package com.alemeno.repository;

import com.alemeno.model.Tweet;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TweetRepository extends JpaRepository<Tweet,Integer> {

    @Transactional
    @Modifying
    @Query("UPDATE Tweet SET content = :content WHERE tweetID = :tweetID")
    public void updateTweetBytweetID(Integer tweetID, String content);


    @Query(value = "SELECT * FROM tweets t WHERE t.id = :id", nativeQuery = true)
    public List<Tweet> getAllTweetsById(int id) ;
}

