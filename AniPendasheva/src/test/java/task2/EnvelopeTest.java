package task2;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class EnvelopeTest {

    @Test
    void setEnvelope() {
        Envelope envelope1 = new Envelope();
        Envelope envelope2 = new Envelope();
        Scanner scanner = new Scanner(System.in);
        envelope1.setEnvelope(envelope1,  1,  "5",  "6",scanner);
        envelope2.setEnvelope(envelope2,  1,  "5",  "6",scanner);
    }
}