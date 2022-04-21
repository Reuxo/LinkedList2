package ListStringTask59;

public class HomeWorkIterator510 {
    //Определить количество слов в списке, которые начинаются и заканчиваются на одну букву.
    private static boolean firstLast(Node node) {

        return (Character.toLowerCase(node.getValue().toString().charAt(0)) ==
                Character.toLowerCase(node.getValue().toString().charAt(node.getValue().toString().length() - 1)));
    }

    public static int task5It(List list) {
        int count = 0;
        ListIterator listIterator = new ListIterator(list);
        while (listIterator.hasNext()) {
            if (firstLast(listIterator.getNodeTmp())) {
                count++;
            }
            listIterator.next();
        }
        return count;
    }

    //Проверить, что каждое следующее слово в списке начинается с последней буквы предыдущего.
    private static boolean isLastFirst6(Node node) {
        return Character.toLowerCase(node.getValue().toString().charAt(node.getValue().toString().length() - 1))
                == Character.toLowerCase(node.getNextNode().getValue().toString().charAt(0));
    }

    public static boolean task6It(List list) {
        ListIterator listIterator = new ListIterator(list);
        while (listIterator.getNodeTmp().getNextNode() != null) {
            if (!isLastFirst6(listIterator.getNodeTmp())) {
                return false;
            }
            listIterator.next();
        }
        return true;
    }

    //Определить количество слов в списке, которые совпадают с первым (последним) словом списка.
    private static int equalsFirst(ListIterator listIterator) {
        int count = 0;
        while (listIterator.hasNext()) {
            if(listIterator.getList().getHead().getValue().toString().equalsIgnoreCase(listIterator.getNodeTmp().getValue().toString())) {
                count++;
            }
            listIterator.next();
        }
        return count ;
    }
    private static int equalsLast(ListIterator listIterator) {
        int count = 0;
        while (listIterator.hasNext()) {
            if(listIterator.getList().getTail().getValue().toString().equalsIgnoreCase(listIterator.getNodeTmp().getValue().toString())) {
                count++;
            }
            listIterator.next();
        }
        return count;
    }
    public static int task7It(List list, boolean isFirst) {
        ListIterator listIterator = new ListIterator(list);
        if (isFirst) {
            return equalsFirst(listIterator);

        } else {
            return equalsLast(listIterator);
        }
    }
}
