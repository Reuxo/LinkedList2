package ListStringTask59;

public class Main {
    public static void main(String[] args) {
        String[] arrayOfStringsTask5 = {"tube", "youtube", "alabama", "Africa",
                "antarctica", "arctica", "rambler"};
        String[] arrayOfStrings1Task6 = {"tube", "elf", "fusion", "nail", "lock", "key", "yellow"};
        //String[] arrayOfStrings1Task6 = {"tube", "elf", "ghost", "nail", "lock", "key", "yellow"};
        String[] arrayOfStringsTask7 = {"tube", "year", "speed", "year", "tube", "range", "year", "tube", "tube",
                "stock", "object", "year"};
        String[] arrayOfStringsTask89 = {"alpha" ,"brandy", "crash", "java", "lie", "opportunity", "rock",
                "towel", "uranus", "victory", "zoo"};
        String[] arrayOrStringsTask9_10 = {"crash", "java", "lie", "opportunity", "rock", "towel", "uranus"};
        List list5 = new List(arrayOfStringsTask5);
        List list6 = new List(arrayOfStrings1Task6);
        List list7 = new List(arrayOfStringsTask7);
        List list89 = new List(arrayOfStringsTask89);
        List list9_10 = new List(arrayOrStringsTask9_10);
        // list5.printList();
        //list6.printList();
        //list7.printList();
        //list89.printList();
        //System.out.println();
        list9_10.printList();
        System.out.println();
        //System.out.println("Начинаются и заканчиваются на одинаковые буквы : " + HomeWork.task5(list5));
        //System.out.println(HomeWork.task6(list6));
        //System.out.println("Совпадения с первым словом : " + HomeWork.task7(list7, true));
        //System.out.println("Совпадения с последним словом : " + HomeWork.task7(list7, false));
        //System.out.println(HomeWork.task8(list8));
        //System.out.println(HomeWork.task9(list89, list9_10));
        HomeWork.task10(list9_10);


    }
}
