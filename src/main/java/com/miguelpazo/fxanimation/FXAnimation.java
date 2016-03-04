package com.miguelpazo.fxanimation;

import javafx.stage.Stage;

/**
 *
 * @author Miguel R. Pazo Sánchez <http://miguelpazo.com>
 */
public class FXAnimation {

    private Stage stage;
    public static FXAnimation instance = null;

    protected FXAnimation() {
    }

    public static FXAnimation getInstance() {
        if (instance == null) {
            instance = new FXAnimation();
        }

        return instance;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public Stage getStage() {
        return this.stage;
    }
}
