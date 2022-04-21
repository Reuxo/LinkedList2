package КлассЗанятиеЛист;

import java.util.Iterator;
import java.util.function.Consumer;

public class ListIterator implements Iterator<Node> {
    private List list;
    private Node nodeTmp;
    private int count;

    public Node getNodeTmp() {
        return nodeTmp;
    }

    public void setNodeTmp(Node nodeTmp) {
        this.nodeTmp = nodeTmp;
    }

    public ListIterator(List list) {
        this.list = list;
        this.nodeTmp = list.getHead();
        this.count = 0;
    }

    @Override
    public boolean hasNext() {
        return this.count < this.list.getLength();

    }

    @Override
    public Node next() {
        Node tmp = nodeTmp;
        count++;
        nodeTmp = nodeTmp.getNextNode();
        return tmp;

    }

}
