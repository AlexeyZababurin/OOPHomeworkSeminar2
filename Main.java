package GeekBrains.OOP.Homework.OOPHomeworkSeminar2;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Human human1 = new Human("Алексей");
        Human human2 = new Human("Андрей");
        Human human3 = new Human("Владимир");
        market.acceptToMarket(human1);
        market.update();
        market.acceptToMarket(human2);
        market.update();
        market.acceptToMarket(human3);
        market.update();
    }
}
