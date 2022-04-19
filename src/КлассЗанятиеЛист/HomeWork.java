package КлассЗанятиеЛист;

public class HomeWork {
    //Найти среднее арифметическое значение элементов списка.
    public static double task1(List list){
        int sum = 0;
        int counter = 0;
        Node nodetmp = list.getHead();
        while (nodetmp != null) {
            sum += nodetmp.getValue();
            nodetmp = nodetmp.getNextNode();
            counter ++;
        }
        return ((double) sum / counter);
    }
    //Перенести в начало списка его последний элемент.
    public static void task2(List list) {
        Node nodetmp = list.getHead();
        while (nodetmp.getNextNode() != null) {
            nodetmp = nodetmp.getNextNode();
        }
        list.push(nodetmp.getValue(), 0 );
        list.pop();
    }
    //Поменять местами первый и последний элементы списка.
    public static void task4 (List list) {
        Node nodetmp = list.getHead();
        while (nodetmp.getNextNode() != null) {
            nodetmp = nodetmp.getNextNode();
        }
        list.push(nodetmp.getValue(), 0);
        list.pop();
        list.push(list.getHead().getNextNode().getValue());
        list.pop(1);
    }
}
