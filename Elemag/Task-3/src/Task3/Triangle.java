package Task3;

public class Triangle {
    private String name;
    private float sideA;
    private float sideB;
    private float sideC;

    public Triangle(String name, float sideA, float sideB, float sideC) {
        this.name = name;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public float getSideC() {
        return sideC;
    }

    public void setSideC(float sideC) {
        this.sideC = sideC;
    }

    public static boolean isTriangle(float sideA, float sideB, float sideC) {
        return sideA + sideB > sideC && sideA + sideC > sideB && sideC + sideB > sideA;
    }

    public float getArea() {
        float S = (sideA + sideB + sideC) / 2;
        float area = Float.parseFloat(String.valueOf(Math.sqrt(S * (S - sideA) * (S - sideB) * (S - sideC))));
        return area;
    }

}
