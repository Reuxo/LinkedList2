package КлассЗанятиеЛист;


public class Main {
    public static void main(String[] args) {
        int[] arrayTask14 = new int[]{12, 43, 100, 4, 24, 6, 63};
        Node head1 = new Node(arrayTask14[0]);
        List list = new List(head1);
        for (int i = 1; i < arrayTask14.length; i++) {
            list.push(arrayTask14[i]);
        }

        list.printList();
        System.out.println();
        // System.out.println("Средне арифметическое : " + HomeWork.task1(list));
        //HomeWork.task2(list);
        //list.printList();
        HomeWork.task4(list);
        list.printList();
    }

}


