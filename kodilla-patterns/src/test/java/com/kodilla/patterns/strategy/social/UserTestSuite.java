package com.kodilla.patterns.strategy.social;


import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @After
    public void freeSpace() {
        System.out.println();
    }

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User ania_nowakowska = new Millenials("Ania Nowakowska");
        User john_mac = new YGeneration("John Mac");
        User david_brand = new ZGeneration("David Brand");

        //When
        String aniaSocialPost = ania_nowakowska.sharePost();
        System.out.println("Ania should: " + aniaSocialPost);
        String johnSocialPost = john_mac.sharePost();
        System.out.println("John should: " + johnSocialPost);
        String davidSocialPost = david_brand.sharePost();
        System.out.println("Dawid should: " + davidSocialPost);

        //Then
        Assert.assertEquals("[Facebook predictor] Shared post on Facebook", aniaSocialPost);
        Assert.assertEquals("[Twitter predictor] Shared post on Twitter", johnSocialPost);
        Assert.assertEquals("[Snapchat predictor] Shared post on Snapchat", davidSocialPost);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User ania_nowakowska = new Millenials("Ania Nowakowska");

        //When
        String aniaSocialPost = ania_nowakowska.sharePost();
        System.out.println("Ania should: " + aniaSocialPost);

        ania_nowakowska.setYourSocial(new SnapchatPublisher());
        String aniaNewSocialPost = ania_nowakowska.sharePost();
        System.out.println("Ania now should: " + aniaNewSocialPost);

        //Then
        Assert.assertEquals("[Snapchat predictor] Shared post on Snapchat", aniaNewSocialPost);
    }
}
