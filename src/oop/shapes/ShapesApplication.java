package oop.shapes;

public class ShapesApplication {
    public static void main(String[] args) {
//        Square square = new Square(4);
//        Square square2 = new Square((8));
//        Square square3 = new Square(2);
//        Square[] squares = {square,square2,square3};
//        for (int i = 0; i < squares.length; i++) {
//            showSquare(square);
//        }
//        showSquare(square);
//
//    }

//    private static void showSquare(Square square) {
//        System.out.println("Field =" + square.field());
//        System.out.println("Circuit =" + square.circuit());
//        System.out.println("Diagonal =" + square.diagonal());

//        Shape[] shapes = {new Square(4), new Rectangle(2, 3), new Diamond()};
//        Square[] squares = {new Square(4), new Square(8), new Square(2)};
//        showShapes(shapes);
//        showShapes(squares);
    }

    private static void showShapes(Shape[] shapes) {
        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Name = " + shapes[i].getName());
            System.out.println("Field = " + shapes[i].field());
            System.out.println("Circuit = " + shapes[i].circuit());
            System.out.println("Diagonal = " + shapes[i].diagonal());
            System.out.println(shapes[i]);

        }
    }
}