package EnumDemo4;

public class EnumDemo4 {
    public static void main(String[] args) {
        Apple apple1, apple2, apple3;

        System.out.println("Все константы перечисления Apple вместе с порядковыми номерами");
        for (Apple a: Apple.values())System.out.println(a+" "+a.ordinal());
        apple1=Apple.RedDel;
        apple2=Apple.GoldenDel;
        apple3=Apple.RedDel;
        System.out.println();
        if (apple1.compareTo(apple2)<0) System.out.println(apple1+" находится перед "+apple2);
        if (apple1.compareTo(apple2)>0) System.out.println(apple1+" находится после "+apple2);
        if (apple1.compareTo(apple3)==0) System.out.println(apple1+" равно "+apple3);
        System.out.println();
        if (apple1.equals(apple2)) System.out.println("Ошибка");
        if (apple1.equals(apple3)) System.out.println(apple1+" равно "+apple3);
        if (apple1==apple3) System.out.println(apple1+" == "+apple3);
    }
}
/*
Все константы перечисления Apple вместе с порядковыми номерами
Jonathan 0
GoldenDel 1
RedDel 2
Winesap 3
Cortland 4

RedDel находится после GoldenDel
RedDel равно RedDel

RedDel равно RedDel
RedDel == RedDel
 */