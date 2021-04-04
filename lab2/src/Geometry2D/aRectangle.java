package Geometry2D;

public class aRectangle implements aFigure {
    private Double a, b;
    public String figureN = "Rectangle";
    public aRectangle(Double... sides) {
        a = sides[0];
        b = sides[1];
    }
    public Double calcArea() {
        return a * b;
    }
    public void showInformation() {
        System.out.println(
                "\n" + figureN + a + '\n' + b + '\n' + "Area: " + this.calcArea());
    }
    public String getN() {
        return figureN;
    }
    public Double getA() {
        return a;
    }
    public Double getB() {
        return b;
    }
    public Double getR() {
        return null;
    }
}


