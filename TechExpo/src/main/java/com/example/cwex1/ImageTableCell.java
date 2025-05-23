package com.example.cwex1;

import javafx.scene.control.TableCell;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ImageTableCell <c> extends TableCell<c, Image> {

    private final ImageView imageView = new ImageView();

    public ImageTableCell(double imageSize) {
        imageView.setFitWidth(imageSize);
        imageView.setFitHeight(imageSize);
    }

    @Override
    protected void updateItem(Image item, boolean empty) {
        super.updateItem(item, empty);
        if (empty || item == null) {
            setGraphic(null);

        } else {
            imageView.setImage(item);
            setGraphic(imageView);
        }
    }



}
