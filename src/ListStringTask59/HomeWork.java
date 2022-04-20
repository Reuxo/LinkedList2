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
    public static boolean task9(List listBig, List listSmall) {
        StringBuilder stringBuilderBig = new StringBuilder();
        StringBuilder stringBuilderSmall = new StringBuilder();
        Node nodeTmp = listBig.getHead();
        while (nodeTmp != null) {
            stringBuilderBig.append(nodeTmp.getValue().toString());
            nodeTmp = nodeTmp.getNextNode();
        }
        nodeTmp = listSmall.getHead();
        while (nodeTmp != null) {
            stringBuilderSmall.append(nodeTmp.getValue().toString());
            nodeTmp = nodeTmp.getNextNode();
        }
        return (stringBuilderBig.toString().contains(stringBuilderSmall.toString()));
    }

    //Перевернуть список наоборот.
    public static void task10(List list) {
        Node nodeTmp = list.getHead();
        int count = 1;
        while (nodeTmp.getNextNode().getNextNode() != null) {
            count++;
            nodeTmp = nodeTmp.getNextNode();
        }
        for (int i = count; i > 0; i--) {
            nodeTmp = list.getHead();
            for (int j = 0; j < i - 1; j++) {
                nodeTmp = nodeTmp.getNextNode();
            }
            list.push(nodeTmp.getValue());
            list.pop(i - 1);
        }

    }
}
