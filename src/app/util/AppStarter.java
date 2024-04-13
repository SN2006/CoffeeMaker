package app.util;

import app.controller.AppController;
import app.model.AppModel;
import app.model.DataValidator;
import app.view.AppView;

public class AppStarter {

    public void startApp(){
        DataValidator dataValidator = new DataValidator();
        AppView view = new AppView();
        AppModel model = new AppModel(dataValidator);
        AppController controller = new AppController(view, model);
        controller.runApp();
    }

}
