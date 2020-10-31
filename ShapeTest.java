import java.io.*;

/**
 * @program: homework_assignment_6
 * @filename: ShapeTest
 * @author: Ke Chen
 * @date: 2020/10/31
 **/
public class ShapeTest {

    public static void writeToFile(String fileName, Shape shape) {
        try {
            FileOutputStream streamOut = new FileOutputStream(fileName);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(streamOut);
            objectOutputStream.writeObject(shape);
            objectOutputStream.close();
            streamOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle(1);
        Circle circle2 = new Circle(2);
        Circle circle3 = new Circle(3);
        Circle circle4 = new Circle(4);

        Triangle triangle1 = new Triangle(1, 2, 2.5);
        Triangle triangle2 = new Triangle(3, 4, 5);
        Triangle triangle3 = new Triangle(3, 4, 5);
        Triangle triangle4 = new Triangle(4, 5, 6);

        Rectangle rectangle1 = new Rectangle(1, 2);
        Rectangle rectangle2 = new Rectangle(2, 3);
        Rectangle rectangle3 = new Rectangle(3, 4);
        Rectangle rectangle4 = new Rectangle(4, 5);

        Hexagon hexagon1 = new Hexagon(1);
        Hexagon hexagon2 = new Hexagon(2);
        Hexagon hexagon3 = new Hexagon(3);
        Hexagon hexagon4 = new Hexagon(4);

        Shapes shapes1 = new Shapes();
        shapes1.add(circle1);
        shapes1.add(circle2);
        shapes1.add(triangle1);
        shapes1.add(triangle2);
        shapes1.add(rectangle1);
        shapes1.add(rectangle2);
        shapes1.add(hexagon1);
        shapes1.add(hexagon2);

        Shapes shapes2 = new Shapes();
        shapes2.add(circle3);
        shapes2.add(circle4);
        shapes2.add(triangle3);
        shapes2.add(triangle4);
        shapes2.add(rectangle3);
        shapes2.add(rectangle4);
        shapes2.add(hexagon3);
        shapes2.add(hexagon4);

        // ex1
        shapes1.compute();


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // ex2
        System.out.println("max shape: " + shapes1.max());
        System.out.println("min shape: " + shapes1.min());

        // ex3
        writeToFile("obj1.ser", circle1);
        writeToFile("obj2.ser", circle2);
        writeToFile("obj3.ser", triangle1);
        writeToFile("obj4.ser", triangle2);
        writeToFile("obj5.ser", rectangle1);
        writeToFile("obj6.ser", rectangle2);
        writeToFile("obj7.ser", hexagon1);
        writeToFile("obj8.ser", hexagon2);
    }
}
