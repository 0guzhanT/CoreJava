package Classes;

import java.util.Comparator;

public class Box {
    int width, height, length;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }


    public Box(int width, int height, int length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    double calculateVolume() {
        return width * height * length;
    }

    public static Comparator<Box> boxComparatorHeight = new Comparator<Box>() {
        @Override
        public int compare(Box b1, Box b2) {
            int height1 = b1.getHeight();
            int height2 = b2.getHeight();
            return height1 - height2;
        }
    };

    public static Comparator<Box> boxComparatorHeightDesc = new Comparator<Box>() {
        @Override
        public int compare(Box o1, Box o2) {
            int heigth1 = o1.getHeight();
            int height2 = o2.getHeight();

            return height2 - heigth1;
        }
    };

    @Override
    public String toString() {
        return "[ width=" + width + ", height=" + height + ", length=" + length + "]";
    }
}



