package week7_sandip;

public class Pro_15_WallArea {


//Write a class with the name Wall. The class needs two fields (instance variables) with name width and height of type double.


    public static void main(String[] args) {

        // Wall wall = new Wall();
        Pro_15_WallArea wall = new Pro_15_WallArea() ;
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());

    }



//class Wall {
//
    double width;
    double height;

    public void Wall() {
        this.width = 0;
        this.height = 0;

    }

    public void Wall(double width, double height) {

        if (width < 0) {
            width = 0;
        }

        if (height < 0) {
            height = 0;
        }
        this.width = width;
        this.height = height;

    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setWidth(double width) {

        if (width < 0) {
            width = 0;
        }
        this.width = width;

    }

    public void setHeight(double height) {

        if (height < 0) {
            height = 0;
        }
        this.height = height;

    }

    public double getArea() {

        return (this.width * this.height);
    }


}


