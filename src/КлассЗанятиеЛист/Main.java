package КлассЗанятиеЛист;


public class Main {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(27);
        List list1 = new List(node1);
        node1.setNextNode(node2);
        node2.setNextNode(node3);
        node3.setNextNode(node4);
        list1.push(-4);
        list1.push(1000, 0);
        list1.printList();
        System.out.println();
        list1.pop(0);
        list1.printList();


    }
}
