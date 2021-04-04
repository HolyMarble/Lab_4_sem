package Geometry2D;

public class aCircle implements aFigure {
    private Double r;
    public String figureN = "Круг";

    public aCircle(Double radius) {
        r = radius;
    }
    public Double calcArea() {
        return Math.PI * r * r;
    }
    public void showInformation() {
        System.out.println("\n" + figureN + r + "\n" + "Area: " + this.calcArea());
    }
    public String getN() {
        return figureN;
    }
    public Double getA() {
        return null;
    }
    public Double getB() {
        return null;
    }
    public Double getR() {
        return r;
    }
}




