package DemoCollection;

import com.sun.source.doctree.SeeTree;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DemoCollectionSet {
    public static void main(String[] args) {

        //khai báo kiểu dữ liệu Set
        //không lưu đc giá trị trùng lặp
        Set<String> menu = new HashSet<>();
        //thêm dữ liệu
        menu.add("Menu");
        menu.add("Funtions");
        menu.add("Detail");
        menu.add("Menu");

        System.out.println(menu.contains("Funtions"));
        System.out.println(menu.remove("Menu"));
        System.out.println(menu.size());

        //in thông tin
        System.out.println("Các phần tử của set :");
        System.out.println("\t" + menu + "\n");

        //duyệt giá trị của set
        //show set through Iterator
        Iterator<String> itr = menu.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next() + ",");
        }

        // show set through for-each
        System.out.println();
        for (String obj : menu) {
            System.out.println(obj + ",");
        }


    }
}