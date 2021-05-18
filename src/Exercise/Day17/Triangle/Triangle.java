package Exercise.Day17.Triangle;

import java.util.Objects;

public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle() {
    }

    public Triangle(double sideA, double sideB, double sideC) {
        if (sideA > 20 || sideB > 20 || sideC > 20 || sideA == 0 || sideB == 0 || sideC == 0) {
            System.out.println("Invalid input");
        }
        if (isValid(sideA, sideB, sideC)) {
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
        } else {
            System.out.println("Invalid triangle");
        }
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideA(double sideA) {
        if (!(sideA > 0 && sideA <= 20) && isValid(sideB, sideC, sideA) == false) {
            System.out.println("Invalid triangle");
            return;
        } else {
            this.sideA = sideA;
        }
    }

    public void setSideB(double sideB) {
        if (!(sideB > 0 && sideB <= 20) && isValid(sideB, sideC, sideA) == false) {
            System.out.println("Invalid triangle");
            return;
        } else {
            this.sideB = sideB;
        }
    }

    public void setSideC(double sideC) {
        if (!(sideC > 0 && sideC <= 20) && isValid(sideB, sideC, sideA) == false) {
            System.out.println("Invalid triangle");
            return;
        } else {
            this.sideC = sideC;
        }
    }

    private boolean isValid(double sideA, double sideB, double sideC) {
        if (sideA + sideB <= sideC) {
            return false;
        }
        if (sideB + sideC <= sideA) {
            return false;
        }
        if (sideA + sideC <= sideB) {
            return false;
        }
        return true;
    }

    public void check(Triangle triangle) {
        if (isValid(triangle.sideB, triangle.sideC, triangle.sideA)) {
            System.out.println("Is valid");
        } else {
            System.out.println("Invalid");
        }
    }

    public double triangleArea(Triangle triangle) {
        if (isValid(triangle.sideA, triangle.sideB, triangle.sideC) == false) {
            return -1;
        }
        double halfPerimeter = trianglePerimeter(triangle);
        double area = Math.sqrt(halfPerimeter * (halfPerimeter - triangle.sideA) * (halfPerimeter - triangle.sideB) * (halfPerimeter - triangle.sideC));
        return area;
    }

    public double trianglePerimeter(Triangle triangle) {
        if (isValid(triangle.sideA, triangle.sideB, triangle.sideC) == false) {
            return -1;
        }
        return triangle.sideC + triangle.sideB + triangle.sideA;
    }

    public void isRight(Triangle triangle) {
        if (isValid(triangle.sideA, triangle.sideB, triangle.sideC) == false) {
            System.out.println("Invalid triangle");
            return;
        }
        double biggestSide = 0;
        double lowerSide1 = 0;
        double lowerSide2 = 0;
        if (sideA < sideC && sideB < sideC) {
            biggestSide = sideC;
            lowerSide1 = sideA;
            lowerSide2 = sideB;
        } else if (sideA < sideB && sideC < sideB) {
            biggestSide = sideB;
            lowerSide1 = sideA;
            lowerSide2 = sideC;
        } else if (sideC < sideA && sideB < sideA) {
            biggestSide = sideA;
            lowerSide1 = sideC;
            lowerSide2 = sideB;
        }
        if ((Math.pow(lowerSide1, 2) + Math.pow(lowerSide2, 2)) == Math.pow(biggestSide, 2)) {
            System.out.println("Is right");
        } else {
            System.out.println("Is not right");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.sideA, sideA) == 0 &&
                Double.compare(triangle.sideB, sideB) == 0 &&
                Double.compare(triangle.sideC, sideC) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sideA, sideB, sideC);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                '}';
    }
}
