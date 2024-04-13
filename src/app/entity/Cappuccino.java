package app.entity;

public class Cappuccino implements Coffee{
    @Override
    public String makeDrink() {
        return "Your cappuccino. Enjoy :)";
    }
}
