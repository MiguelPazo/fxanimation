package com.miguelpazo.fxanimation.scene;

import com.miguelpazo.fxanimation.FXAnimationBase;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.util.Duration;

/**
 *
 * @author Miguel R. Pazo Sánchez <http://miguelpazo.com>
 */
public class MoveElements extends FXAnimationBase {

    public static MoveElements instance = null;

    private MoveElements() {
    }

    public static MoveElements getInstance() {
        if (instance == null) {
            instance = new MoveElements();
        }

        return instance;
    }

    public void moveY(Node node, Double less, Integer speed, EventHandler<ActionEvent> onFinished) {
        Timeline tlAnimation = new Timeline();
        tlAnimation.setCycleCount(1);
        tlAnimation.setAutoReverse(false);

        Double positionY = node.getLayoutY() + less;
        final KeyValue kyNewLoad = new KeyValue(node.layoutYProperty(), positionY);
        final KeyFrame kfAnimation = new KeyFrame(Duration.millis(speed), onFinished, kyNewLoad);

        tlAnimation.getKeyFrames().add(kfAnimation);
        tlAnimation.play();
    }

    public void moveX(Node node, Double less, Integer speed, EventHandler<ActionEvent> onFinished) {
        Timeline tlAnimation = new Timeline();
        tlAnimation.setCycleCount(1);
        tlAnimation.setAutoReverse(false);

        Double positionX = node.getLayoutX() + less;
        final KeyValue kyNewLoad = new KeyValue(node.layoutXProperty(), positionX);
        final KeyFrame kfAnimation = new KeyFrame(Duration.millis(speed), onFinished, kyNewLoad);

        tlAnimation.getKeyFrames().add(kfAnimation);
        tlAnimation.play();
    }
}
