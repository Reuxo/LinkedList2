package КлассЗанятиеЛист;

public class List {
    private Node head;

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public List() {
        this.head = null;
    }

    public List(Node head) {
        this.head = head;
    }

    public void printList() {
        Node nodeTmp = this.head;
        while (nodeTmp != null) {
            System.out.println(nodeTmp.getValue());
            nodeTmp = nodeTmp.getNextNode();
        }
    }

    public void push(int value) {
        Node nodeTmp = this.head;
        while (nodeTmp.getNextNode() != null) {
            nodeTmp = nodeTmp.getNextNode();
        }
        nodeTmp.setNextNode(new Node(value));
    }

    public void push(int value, int index) {
        if ( index == 0) {
            this.pushHead(value);
        }
        else{
            Node nodeTmp = this.head;
            for (int i = 0; i < index - 1 && nodeTmp.getNextNode() != null; i++) {
                nodeTmp = nodeTmp.getNextNode();
            }
            Node nextNode = new Node(value, nodeTmp.getNextNode());
            nodeTmp.setNextNode(nextNode);
        }
    }
    private void pushHead(int value) {
        Node node = new Node(value, this.head);
        this.head = node;
    }
    public void pop() {
        Node nodeTmp = this.head;
        while (nodeTmp.getNextNode().getNextNode() != null) {
            nodeTmp = nodeTmp.getNextNode();
        }
        nodeTmp.setNextNode(null);
    }
    public void pop(int index) {
        if (index == 0) {
            popHead();
        } else {
            Node nodeTmp = this.head;
            for (int i = 0; i < index - 1 && nodeTmp.getNextNode().getNextNode() != null; i++) {
                nodeTmp = nodeTmp.getNextNode();
            }
            nodeTmp.setNextNode(nodeTmp.getNextNode().getNextNode());
        }
    }
    private void popHead() {
        this.head = this.head.getNextNode();
    }
}
