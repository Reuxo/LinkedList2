package КлассЗанятиеЛист;


public class Main {
    public static void main(String[] args) {

        Node node1 = new Node(5);
        List list = new List(node1);
        for (int i = 0; i < 6; i++) {
            list.push((int) (Math.random() * 25));
        }
        list.printList();
        System.out.println("Средне арифметическое : " + Task1.avg(list));
    }
}


