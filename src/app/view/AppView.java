package app.view;

import java.util.Scanner;

public class AppView {

    private final Scanner IN = new Scanner(System.in);

    public String getData(){
        return IN.nextLine();
    }

    public void getMenu(){
        System.out.println("""
                ------------------------------
                Choose a drink:
                      1 - Espresso
                      2 - Cappuccino
                      3 - Latte
                ------------------------------
                """);
    }

    public void getOutput(String output){
        System.out.println(output);
    }

}
