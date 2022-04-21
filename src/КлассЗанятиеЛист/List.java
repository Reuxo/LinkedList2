package КлассЗанятиеЛист;

public class List {
    private Node head;
    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public List() {
        this.head = null;
        this.length = 0;
    }

    public List(Node head) {
        this.head = head;
        this.length = 1;
    }

    public void printList() { // Вывод списка в консоль
        System.out.print("[");
        Node nodeTmp = this.head;
        while (nodeTmp.getNextNode() != null) {
            System.out.print(nodeTmp.getValue() + ", ");
            nodeTmp = nodeTmp.getNextNode();
        }
        System.out.print(nodeTmp.getValue() + "]");
    }


    public void push(int value) { //вставка новой ноды со значением value в конец списка
        Node nodeTmp = this.head;
        while (nodeTmp.getNextNode() != null) {
            nodeTmp = nodeTmp.getNextNode();
        }
        nodeTmp.setNextNode(new Node(value));
        this.length++;
    }

    public void push(int value, int index) { //Вставка новой Ноды со значением value по index
        if (index == 0) {
            this.pushHead(value);
        } else {
            Node nodeTmp = this.head;
            for (int i = 0; i < index - 1 && nodeTmp.getNextNode() != null; i++) {
                nodeTmp = nodeTmp.getNextNode();
            }
            Node nextNode = new Node(value, nodeTmp.getNextNode());
            nodeTmp.setNextNode(nextNode);
            this.length++;
        }
    }

    private void pushHead(int value) { //Вставка новой ноды со значением value в head
        Node node = new Node(value, this.head);
        this.head = node;
        this.length++;
    }

    public void pop() {  //Удаление последнего элемента списка
        Node nodeTmp = this.head;
        while (nodeTmp.getNextNode().getNextNode() != null) {
            nodeTmp = nodeTmp.getNextNode();
        }
        nodeTmp.setNextNode(null);
        this.length--;
    }

    public void pop(int index) {  //Удаление по индексу
        if (index == 0) {
            popHead();
        } else {
            Node nodeTmp = this.head;
            for (int i = 0; i < index - 1 && nodeTmp.getNextNode().getNextNode() != null; i++) {
                nodeTmp = nodeTmp.getNextNode();
            }
            nodeTmp.setNextNode(nodeTmp.getNextNode().getNextNode());
            this.length--;
        }
    }

    public void popHead() { // Удаление head
        this.head = this.head.getNextNode();
        this.length--;
    }
}
