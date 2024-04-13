package app.model;

import app.entity.Cappuccino;
import app.entity.Coffee;
import app.entity.Espresso;
import app.entity.Latte;
import app.exceptions.RunningAppException;
import app.exceptions.InvalidDataException;

public class AppModel {

    private final DataValidator dataValidator;

    public AppModel(DataValidator dataValidator) {
        this.dataValidator = dataValidator;
    }

    public Coffee handleData(String data) throws InvalidDataException, RunningAppException {
        int chosenOption = dataValidator.validate(data);
        switch (chosenOption){
            case 1 -> {
                return new Espresso();
            }
            case 2 -> {
                return new Cappuccino();
            }
            case 3 -> {
                return new Latte();
            }
        }
        throw new RunningAppException("Something was going wrong(");
    }

}
