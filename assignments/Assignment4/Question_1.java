package Assignment4;

//Q1​. ​Implement the following four classes using Inheritance (2 mks)
    class Shape {
            private String name;
            private double perimeter;
            private double area;

            public Shape(){
            }

            //not abstract so we need{}, if it is abstract then we need;
            public void getArea(){
            }

            public void getPerimeter(){
            }

            public void draw(){
                System.out.println("Drawing" + getClass().getSimpleName());
            }
    }

        class Circle extends Shape {
            private double radius;

            //constructor
            public Circle(double radius) {
                this.radius = radius;
            }

            public void getPerimeter() {
                double P = 2 * Math.PI * radius;
                System.out.println(P);
            }

            public void getArea() {
                double A = Math.PI * radius * radius;
                System.out.println(A);
            }
        }


        class Rectangle extends Shape {
            private double width;
            private double height;

            //constructor
            public Rectangle(double width, double height) {
                this.width = width;
                this.height = height;
            }

            public void getPerimeter() {
                double P = 2 * (width + height);
                System.out.println(P);
            }

            public void getArea() {
                double A = width * height;
                System.out.println(A);
            }
        }


        class Square extends Shape{
            private double side;

            //constructor
            public Square(double side ) {
                this.side = side;
            }
            public void getPerimeter(){
                double P = 4 * side;
                System.out.println(P);
            }
            public void getArea() {
                double A = side * side;
                System.out.println(A);
            }

        }
//only one main function in one class
//public class Question_1 {
//    //Main operation class for testing
//    public static void main(String args[]) {
//        Shape s = new Shape();
//        Rectangle r = new Rectangle(2.0, 3.0);
//        Circle c = new Circle(4.0);
//        Square sq = new Square(4.0);
//
//        r.getArea(); ​// should print 6.0
//        r.getPerimeter();​ // should print 10.0
//        c.getArea();​ // should print 50.26
//        c.getPerimeter();​ // should print 25.13
//        sq.getArea();​ // should print 16.0
//        sq.getPerimeter();​ // should print 16.0
//        r.draw();​ // should print “Drawing rectangle​”
//        c.draw();​ // should print “Drawing Assignment4.Circle”
//        s.draw();​ // should print “Drawing Assignment4.Shape”
//        sq.draw()​; // should print “Drawing Assignment4.Square”
//
//    }
//}












