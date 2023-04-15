package EnumDemo3;
// работа с перечислением
public class EnumDemo3 {
    public static void main(String[] args) {
        Apple apple;
        System.out.println("Яблоки сорта Winesap стоят = "+Apple.Winesap.getPrice()+" центов");

        for (Apple apple1:Apple.values()){
            System.out.println("Яблоки сорта "+apple1+" стоят = "+apple1.getPrice()+" центов");
        }
    }
}
