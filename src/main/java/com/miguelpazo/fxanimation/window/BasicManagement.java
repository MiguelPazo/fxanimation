package com.miguelpazo.fxanimation.window;

import com.miguelpazo.fxanimation.FXAnimationBase;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author Miguel R. Pazo Sánchez <http://miguelpazo.com>
 */
public class BasicManagement extends FXAnimationBase {

    public static BasicManagement instance = null;
    private Double xOffset, yOffset;

    private BasicManagement() {

    }

    public static BasicManagement getInstance() {
        if (instance == null) {
            instance = new BasicManagement();
        }

        return instance;
    }

    public void minimize() {
        mainStage.setIconified(true);
    }

    public void maximize() {
        mainStage.setMaximized(true);
    }

    public void close() {
        mainStage.close();
    }

    public void dragDropToolBar(Node oNode) {
        oNode.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                xOffset = event.getSceneX();
                yOffset = event.getSceneY();
            }
        });
        oNode.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                mainStage.setX(event.getScreenX() - xOffset);
                mainStage.setY(event.getScreenY() - yOffset);
            }
        });

    }
}
