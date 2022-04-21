package ListStringTask59;

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
    public Node getTail() {
        Node nodeTmp = this.head;
        while (nodeTmp.getNextNode() != null) {
            nodeTmp = nodeTmp.getNextNode();
        }
        return nodeTmp;
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
    public List(Object[] arrayInput) {
        this.head = new Node(arrayInput[0]);
        for (int i = 1; i < arrayInput.length; i++) {
            this.push(arrayInput[i]);
        }
        this.length = arrayInput.length;
    }
    public void printList() {
        System.out.print("[");
        Node nodeTmp = this.head;
        while (nodeTmp.getNextNode() != null) {
            System.out.print(nodeTmp.getValue() + ", ");
            nodeTmp = nodeTmp.getNextNode();
        }
        System.out.print(nodeTmp.getValue() + "]");
    }
    public void push(Object value) {
        Node nodeTmp = this.head;
        while (nodeTmp.getNextNode() != null) {
            nodeTmp = nodeTmp.getNextNode();
        }
        nodeTmp.setNextNode(new Node(value));
        this.length++;
    }
    public void push(Object value, int index) {
        if (index == 0) {
            this.pushHead(value);
        }
        else {
            Node nodeTmp = this.head;
            for (int i = 0; i < index - 1 && nodeTmp.getNextNode() != null; i++) {
                nodeTmp = nodeTmp.getNextNode();
            }
            Node newNode = new Node(value, nodeTmp.getNextNode());
            nodeTmp.setNextNode(newNode);
        }
        this.length++;
    }
    private void pushHead(Object value) {
        Node node = new Node(value, this.head);
        this.head = node;

    }
    public void pop() {
        Node nodeTmp = this.head;
        while (nodeTmp.getNextNode().getNextNode() != null) {
            nodeTmp = nodeTmp.getNextNode();
        }
        nodeTmp.setNextNode(null);
        this.length--;
    }
    public void pop(int index) {
        if (index == 0) {
            popHead();
        }
        else {
            Node nodeTmp = this.head;
            for (int i = 0; i < index - 1 && nodeTmp.getNextNode().getNextNode() != null; i++) {
                nodeTmp = nodeTmp.getNextNode();
            }
            nodeTmp.setNextNode(nodeTmp.getNextNode().getNextNode());
        }
        this.length--;
    }
    private void popHead() {
        this.head = this.head.getNextNode();
    }

}
