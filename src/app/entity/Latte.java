package app.entity;

public class Latte implements Coffee{
    @Override
    public String makeDrink() {
        return "Your latte. Enjoy :)";
    }
}
