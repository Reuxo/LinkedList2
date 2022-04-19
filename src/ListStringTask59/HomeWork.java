package ListStringTask59;

public class HomeWork {
    //Определить количество слов в списке, которые начинаются и заканчиваются на одну букву.
    public static int task5(List list) {
        Node nodetmp = list.getHead();
        int count = 0;
        while (nodetmp != null) {
            if (Character.toLowerCase(nodetmp.getValue().toString().charAt(0)) ==
                    Character.toLowerCase(nodetmp.getValue().toString().charAt(nodetmp.getValue().toString().length() - 1))) {
                count++;
            }
            nodetmp = nodetmp.getNextNode();
        }
        return count;
    }

    //Проверить, что каждое следующее слово в списке начинается с последней буквы предыдущего.
    public static boolean task6(List list) {
        Node nodetmp = list.getHead();
        while (nodetmp.getNextNode() != null) {
            if (Character.toLowerCase(nodetmp.getValue().toString().charAt(nodetmp.getValue().toString().length() - 1)) !=
                    Character.toLowerCase(nodetmp.getNextNode().getValue().toString().charAt(0))) {
                return false;
            }
            nodetmp = nodetmp.getNextNode();
        }
        return true;
    }

    //Определить количество слов в списке, которые совпадают с первым (последним) словом списка.
    public static int task7(List list, boolean isFirst) {
        Node nodetmp = list.getHead();
        Node nodeTmpFirstLast = list.getHead();
        int count = 0;
        if (isFirst) {
            while (nodetmp != null) {
                if (nodeTmpFirstLast.getValue().toString().equalsIgnoreCase(nodetmp.getValue().toString())) {
                    count++;
                }
                nodetmp = nodetmp.getNextNode();
            }

        } else {
            while (nodetmp.getNextNode() != null) {
                nodetmp = nodetmp.getNextNode();
            }
            nodeTmpFirstLast = nodetmp;
            nodetmp = list.getHead();
            while (nodetmp != null) {
                if (nodeTmpFirstLast.getValue().toString().equalsIgnoreCase(nodetmp.getValue().toString())) {
                    count++;
                }
                nodetmp = nodetmp.getNextNode();
            }
        }
        return count;
    }

    //Проверить, упорядочены ли элементы списка по алфавиту.
    public static boolean task8(List list) {
        Node nodetmp = list.getHead();
        while (nodetmp.getNextNode() != null) {
            if (Character.toLowerCase(nodetmp.getValue().toString().charAt(0)) >
                    Character.toLowerCase(nodetmp.getNextNode().getValue().toString().charAt(0))) {
                return false;
            }
            nodetmp = nodetmp.getNextNode();
        }
        return true;
    }

    //Определить, входит ли список L1 в L2.
    public static boolean task9(List bigList, List smallList) {
        Node nodeTmpBig = bigList.getHead();
        Node nodeTmpSmall = smallList.getHead();
        while (nodeTmpBig.getNextNode() != null) {
            if(nodeTmpBig.getValue() == nodeTmpSmall.getValue()) {
                System.out.println(nodeTmpBig.getValue().toString());
                Node nodeTmpBig1 = nodeTmpBig;
                while (nodeTmpSmall.getNextNode() != null) {
                   if(nodeTmpBig1.getValue() != nodeTmpSmall.getValue()) {
                       System.out.println(nodeTmpBig1.getValue().toString());
                       System.out.println(nodeTmpSmall.getValue().toString());
                       break;
                   }
                   else {
                       nodeTmpSmall = nodeTmpSmall.getNextNode();
                       nodeTmpBig = nodeTmpBig.getNextNode();
                   }
                   return true;
                }
                return false;
            }
            nodeTmpBig = nodeTmpBig.getNextNode();
        }
        return false;
    }
    //Перевернуть список наоборот.
    public static void task10(List list) {
        Node nodeTmp = list.getHead();
        int count = 1;
        while (nodeTmp.getNextNode() != null) {
            count++;
            nodeTmp = nodeTmp.getNextNode();
        }
        System.out.println(nodeTmp.getValue().toString());
        System.out.println(count);
        //i = 0;
        list.push(nodeTmp.getValue(), 0);
        list.pop();
        list.printList();
        //i = 1;
    }
}
