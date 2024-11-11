import java.util.Scanner;

abstract class Polygon {
    abstract void displaySides();
}

class Rectangle extends Polygon {
    int length;

    Rectangle(int length) {
        this.length = length;
    }

    void displaySides() {
        System.out.println("I'm a Rectangle, Number of Sides = " + (length * 2)); // Assuming it's a 4-sided rectangle
    }
}

class Triangle extends Polygon {
    int edges;

    Triangle(int edges) {
        this.edges = edges;
    }

    void displaySides() {
        System.out.println("I'm a Triangle, Number of Sides = " + edges);
    }
}

class Hexagon extends Polygon {
    int sides;

    Hexagon(int sides) {
        this.sides = sides;
    }

    void displaySides() {
        System.out.println("I'm a Hexagon, Number of Sides = " + sides);
    }
}

public class PolygonTest {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of sides for Rectangle: ");
        int rectangleSides = sc.nextInt();
        Rectangle rectangle = new Rectangle(rectangleSides);

        System.out.print("Enter the number of sides for Triangle: ");
        int triangleSides = sc.nextInt();
        Triangle triangle = new Triangle(triangleSides);

        System.out.print("Enter the number of sides for Hexagon: ");
        int hexagonSides = sc.nextInt();
        Hexagon hexagon = new Hexagon(hexagonSides);

        rectangle.displaySides();
        triangle.displaySides();
        hexagon.displaySides();

        sc.close();
    }
}
