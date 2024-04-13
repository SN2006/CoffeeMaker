package app.entity;

public class Espresso implements Coffee{
    @Override
    public String makeDrink() {
        return "Your espresso. Enjoy :)";
    }
}
