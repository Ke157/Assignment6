import java.util.ArrayList;

/**
 * @program: homework_assignment_6
 * @filename: Shapes
 * @author: Ke Chen
 * @date: 2020/10/31
 **/
public class Shapes<T extends Shape> {
    private ArrayList<T> shapeList;
    private int threadNo;

    public Shapes() {
        shapeList = new ArrayList<T>();
    }

    public Shapes(ArrayList<T> shapeList) {
        this.shapeList = shapeList;
    }

    public Shapes(ArrayList<T> shapeList, int threadNo) {
        this.shapeList = shapeList;
        this.threadNo = threadNo;
    }

    public Shape max() {
        double maxValue = -1;
        T maxItem = null;
        for (T item : shapeList) {
            if (item.computeArea() > maxValue) {
                maxValue = item.computeArea();
                maxItem = item;
            }
        }
        return maxItem;
    }

    public Shape min() {
        double minValue = 10000000;
        T minItem = null;
        for (T item : shapeList) {
            if (item.computeArea() < minValue) {
                minValue = item.computeArea();
                minItem = item;
            }
        }
        return minItem;
    }

    synchronized public double compute() {
        double total = 0;
        for (T item : shapeList) {
            item.start();
        }
        return 0;
    }

    public void add(T item) {
        shapeList.add(item);
    }

    public void remove(T item) {
        shapeList.remove(item);
    }

    public ArrayList<T> getShapeList() {
        return shapeList;
    }

    public void setShapeList(ArrayList<T> shapeList) {
        this.shapeList = shapeList;
    }
}
