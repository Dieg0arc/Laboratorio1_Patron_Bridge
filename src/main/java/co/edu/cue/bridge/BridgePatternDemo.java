package co.edu.cue.bridge;

public class BridgePatternDemo {
    public static void main(String[] args) {
        // Crear instancias de figuras con diferentes colores
        Shape redCircle = new Circle(new Red());
        Shape blueSquare = new Square(new Blue());
        Shape greenTriangle = new Triangle(new Green());
        Shape yellowDiamond = new diamond(new Yellow());

        // Llamamos al método draw() de cada figura
        redCircle.draw();   // Salida: Dibujando un círculo. Color rojo aplicado.
        blueSquare.draw();  // Salida: Dibujando un cuadrado. Color azul aplicado.
        greenTriangle.draw(); // Salida: Dibujando un triángulo. Color verde aplicado.
        yellowDiamond.draw();  // Salida: Dibujando un círculo. Color amarillo aplicado.
    }
}
