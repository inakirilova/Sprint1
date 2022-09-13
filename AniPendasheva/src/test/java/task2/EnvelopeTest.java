package task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnvelopeTest {

    @Test
    void isFittable() {
        Envelope envelope1 = new Envelope(4,5);
        Envelope envelope2 = new Envelope(5,5);

        envelope1.isFittable(envelope2);
        assertAll(
                () ->  assertEquals(true ,envelope1.isFittable(envelope2) ,"4x5 fit in 5x5"),
                () ->  assertEquals(true , new Envelope(4,5).isFittable(new Envelope(4,5)),"4x5 fit in 4x5"),
                () ->  assertEquals(true , new Envelope(4,5).isFittable(new Envelope(5,4)),"4x5 fit in 4x5"),
                () ->  assertEquals(true , new Envelope(5,9).isFittable(new Envelope(2,6)),"5x9 fit in 2x6"),
                () ->  assertEquals(true , new Envelope(9,5).isFittable(new Envelope(6,2)),"9x5 fit in 6x2"),
                () ->  assertEquals(false , new Envelope(1,4).isFittable(new Envelope(2,3)),"1x4 fit in 2x3"),
                () ->  assertEquals(true , new Envelope(1,4).isFittable(new Envelope(5,2)),"1x4 fit in 5x2"));
    }

    @Test
    void areNumsPositive() {
        assertAll(
                () ->  assertEquals(true , Envelope.areNumsPositive( 3f,5f),"3 and 5 positive"),
                () ->  assertEquals(true , Envelope.areNumsPositive( 4f,5f)," and 5 positive"),
                () ->  assertEquals(true , Envelope.areNumsPositive( 310f,50f),"310 and 50 positive"),
                () ->  assertEquals(false , Envelope.areNumsPositive( -3f,5f),"-3 and 5 positive"),
                () ->  assertEquals(false , Envelope.areNumsPositive( -3f,-5f),"-3 and -5 positive"),
                () ->  assertEquals(false , Envelope.areNumsPositive( 3f,-5f),"3 and -5 positive"),
                () ->  assertEquals(false , Envelope.areNumsPositive( 0,5f),"0 and 5 positive"),
                () ->  assertEquals(false , Envelope.areNumsPositive( 5,0),"5 and 0 positive" ));
    }

}