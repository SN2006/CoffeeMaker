package app.controller;

import app.entity.Coffee;
import app.exceptions.RunningAppException;
import app.exceptions.InvalidDataException;
import app.model.AppModel;
import app.view.AppView;

public class AppController {

    private final AppView view;
    private final AppModel model;

    public AppController(AppView view, AppModel model) {
        this.view = view;
        this.model = model;
    }

    public void runApp(){
        view.getMenu();
        String chosenOption = view.getData();
        try {
            Coffee coffee = model.handleData(chosenOption);
            view.getOutput(coffee.makeDrink());
        }catch (InvalidDataException | RunningAppException e){
            view.getOutput(e.getMessage());
        }
    }

}
