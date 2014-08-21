/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.smileengine.tweettest;

import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

public class Main 
{
    public static void main( String[] args ) throws TwitterException
    {
        Twitter twitter = new TwitterFactory().getInstance();
        Status status = twitter.updateStatus("Jenkinsデプロイテスト");
    }
}