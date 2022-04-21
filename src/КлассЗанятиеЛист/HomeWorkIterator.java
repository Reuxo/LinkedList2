package КлассЗанятиеЛист;

import java.util.Iterator;

public class HomeWorkIterator {
    //Найти среднее арифметическое значение элементов списка.
    public static double task1Iterator(List list) {
        int sum = 0;
        ListIterator listIterator = new ListIterator(list);
        while (listIterator.hasNext()) {
            sum += listIterator.getNodeTmp().getValue();
            listIterator.next();
        }
        return ((double) sum / list.getLength());
    }

}
