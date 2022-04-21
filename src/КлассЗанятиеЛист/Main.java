package КлассЗанятиеЛист;


import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        List list = new List(node1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.printList();
        System.out.println();
        //System.out.println("Среднее арифметическое : " + HomeWorkIterator.task1Iterator(list)); //Task1



    }
}


