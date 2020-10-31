import java.util.ArrayList;

/**
 * @program: homework_assignment_6
 * @filename: MethodTest
 * @author: Ke Chen
 * @date: 2020/10/31
 **/
public class MethodTest {

    public static <T> int count(ArrayList<T> arrayList) {
        return arrayList.size();
    }

    public static void main(String[] args) {
        ArrayList arrayList1 = new ArrayList();
        arrayList1.add("a");
        arrayList1.add("b");
        arrayList1.add("c");
        arrayList1.add("d");
        arrayList1.add("e");

        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new Integer(1));
        arrayList2.add(new Integer(2));
        arrayList2.add(new Integer(3));
        arrayList2.add(new Integer(4));
        arrayList2.add(new Integer(5));
        arrayList2.add(new Integer(6));

        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(new Double(1.0));
        arrayList3.add(new Double(2.0));
        arrayList3.add(new Double(3.0));
        arrayList3.add(new Double(4.0));
        arrayList3.add(new Double(5.0));
        arrayList3.add(new Double(6.0));
        arrayList3.add(new Double(7.0));
        arrayList3.add(new Double(8.0));

        System.out.println("String List Count: " + count(arrayList1));
        System.out.println("Integer List Count: " + count(arrayList2));
        System.out.println("Double List Count: " + count(arrayList3));
    }
}
