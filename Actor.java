package GeekBrains.OOP.Homework.OOPHomeworkSeminar2;

import GeekBrains.OOP.Seminars.Lesson2.ActorBehaviour;

public abstract class Actor implements ActorBehaviour {
    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;

    public Actor(String name) {
        this.name = name;
    }

    public abstract String getName();
}
