package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

import static com.javarush.task.task16.task1631.common.ImageTypes.BMP;

public class ImageReaderFactory {
    public static ImageReader getImageReader (ImageTypes types) {
        ImageReader toReturn = null;
        if (types != null) {
        switch (types) {
            case BMP:
              return  toReturn = new BmpReader();
            case JPG:
               return toReturn = new JpgReader();
            case PNG:
               return toReturn = new PngReader();
        }
        }
        throw new IllegalArgumentException("Неизвестный тип картинки");




    }
}
