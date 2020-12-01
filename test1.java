package comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class test1 {
    public static void main(String[] args) {
        List <String> list = new ArrayList<>();
        list.add("Zaur");
        list.add("Ivan");
        list.add("Mart");
        System.out.println("pered sort");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("posle sort");
        System.out.println(list);

    }
}
