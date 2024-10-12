package co.edu.cue.bridge;

public class diamond extends Shape{
    public diamond(Color color){
        super(color);
    }

    @Override
    void draw() {
        System.out.print("Dibujando un rombo. ");
        color.applyColor();
    }

}
