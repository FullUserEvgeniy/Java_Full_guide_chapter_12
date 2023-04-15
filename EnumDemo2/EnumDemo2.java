package EnumDemo2;
// Ислользование встроенных методов перечисления
// Перечисление сортов яблок
public class EnumDemo2 {
    public static void main(String[] args) {
        Apple apple;
        System.out.println("Перечисление сортов яблок");
        // использовать values()
        Apple[] allapples = Apple.values();
        for (Apple a:allapples){
            System.out.println(a);
        }
        System.out.println();
        //использовать метод valuesOf()
        apple = Apple.valueOf("Winesap");
        System.out.println("apple содержит: "+apple);
    }
}
/*
Перечисление сортов яблок
Jonathan
GoldenDel
RedDel
Winesap
Cortland

apple содержит: Winesap
 */