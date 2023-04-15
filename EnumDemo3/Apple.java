package EnumDemo3;

enum Apple {

    Jonathan (10), GoldenDel (9), RedDel (12), Winesap (15), Cortland (8);

    private int price;

    Apple(int p){
        this.price = p;
    }

    int getPrice(){
        return price;
    }
}
//334