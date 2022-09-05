package Task2;

import java.util.Scanner;

public class Envelope {
    private static Scanner cin = new Scanner(System.in);
    private float sideA;
    private float sideB;

    public Envelope(){}

    public Envelope(float sideA, float sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public float getSideA() {
        return sideA;
    }

    public void setSideA(float sideA) {
        this.sideA = sideA;
    }

    public float getSideB() {
        return sideB;
    }

    public void setSideB(float sideB) {
        this.sideB = sideB;
    }

    public boolean canItFit(Envelope envelope){
        float toFitShortSide = this.shortSide();
        float toFitLongSide = this.longSide();
        float intoShortSide = envelope.shortSide();
        float intoLongSide = envelope.longSide();

        if(toFitLongSide < intoLongSide && toFitShortSide < intoShortSide){
            return true;
        } else if(toFitLongSide < intoShortSide){
            return true;
        } else {
            return false;
        }
    }

    private float shortSide(){
        if(sideA > sideB){
            return sideB;
        } else {
            return sideA;
        }
    }

    private float longSide(){
        if(sideA > sideB){
            return sideA;
        } else {
            return sideB;
        }
    }

    public void askForParams(){
        try{
            System.out.print("Enter length(real number) for the first side: ");
            this.sideA = Float.parseFloat(cin.nextLine());

            System.out.print("Enter length(real number) for the second side: ");
            this.sideB = Float.parseFloat(cin.nextLine());

        } catch (Exception e){
            System.out.println("Incorrect input.");
            this.askForParams();
        }
        System.out.println("Envelope is saved.");
    }
}
