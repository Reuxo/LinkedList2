package КлассЗанятиеЛист;

public class Task1 {
    public static double avg (List list){
        int sum = 0;
        Node nodetmp = list.getHead();
        while (nodetmp != null) {
            sum += nodetmp.getValue();
            nodetmp = nodetmp.getNextNode();
        }
        return ((double) sum / 6);
    }
}
