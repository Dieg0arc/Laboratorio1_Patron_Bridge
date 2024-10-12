package co.edu.cue.bridge;

abstract class Shape {
    protected Color color; // Color se asignará a cada figura

    protected Shape(Color color) {
        this.color = color;
    }

    abstract void draw(); // Método que dibuja la figura y aplica el color
}