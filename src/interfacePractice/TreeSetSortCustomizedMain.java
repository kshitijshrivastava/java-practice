package interfacePractice;

import java.util.TreeSet;

public class TreeSetSortCustomizedMain {

	public static void main(String[] args) {

    TreeSet<String> t = new TreeSet<String>(new TreeSetSortCustomized());
    TreeSet t1 = new TreeSet();
    TreeSet<Integer> t3 = new TreeSet<Integer>();
    TreeSet<Integer> t4 = new TreeSet<Integer>(new TreeSortIntegerCustomized());
    t.add("z");
    t.add("a");
    t.add("b");
    t1.add("z");
    t1.add("a");
    t1.add("b");
   // t1.add(1);
    //t1.add('c');
    t3.add(55);
    t3.add(22);
    t3.add(99);
    t4.add(55);
    t4.add(22);
    t4.add(99);
    System.out.println(t);
    System.out.println(t1);
    System.out.println(t3);
    System.out.println(t4);
    		

	}

}
