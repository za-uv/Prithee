package org.example;

import java.io.ByteArrayInputStream;
import java.util.SplittableRandom;

import org.junit.jupiter.api.Test;

class MainTest {
    @Test
    boolean prithee()
    {
        String prithee = "Shall I compare thee to a summer’s day?\n" +
                "Thou art more lovely and more temperate:\n" +
                "Rough winds do shake the darling buds of May,\n" +
                "And summer’s lease hath all too short a date;\n" +
                "Sometime too hot the eye of heaven shines,\n" +
                "And often is his gold complexion dimm’d;\n" +
                "And every fair from fair sometime declines,\n" +
                "By chance or nature’s changing course untrimm'd;\n" +
                "But thy eternal summer shall not fade,\n" +
                "Nor lose possession of that fair thou ow’st;\n" +
                "Nor shall death brag thou wander’st in his shade,\n" +
                "When in eternal lines to time thou grow’st:\n" +
                "   So long as men can breathe or eyes can see,\n" +
                "   So long lives this, and this gives life to thee.\n";
        String[] pritheeTokens = prithee.split(" ");

        SplittableRandom rand = new SplittableRandom();
        SplittableRandom testRand = rand.split();
        String simInput = "";
        for (int i = 0; i < 3; i++) simInput += pritheeTokens[testRand.nextInt(0, 20)] + "\n";
        System.setIn(new ByteArrayInputStream(simInput.getBytes()));
        return Main.prithee(rand);
    }
}
