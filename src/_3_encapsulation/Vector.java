package _3_encapsulation;

public class Vector {
    private double x;
    private double y;
    private double magnitude;

    public void setX(double x){
        this.x = x;
        this.setMagnitude();
    }

    public void setY(double y){
        this.y = y;
        this.setMagnitude();
    }

    private void setMagnitude(){
        this.magnitude = Math.sqrt(( this.x * this.x )+( this.y * this.y ));
    }

    public double getX(){
        return this.x;
    }

    public double getY(){
        return this.y;
    }

    public double getMagnitude(){
        return this.magnitude;
    }

    public Vector(){
        this.x = 1;
        this.y = 1;
        this.setMagnitude();
    }

    public Vector(double x, double y){
        this.setX(x);
        this.setY(y);
        this.setMagnitude();
    }

    public void add(Vector vector1){
        this.setX(this.x + vector1.x);
        this.setY(this.y + vector1.y);
    }

    public void subtract(Vector vector1){
        this.setX(this.x - vector1.x);
        this.setY(this.y - vector1.y);
    }

    public void scale(double scaleFactor){
        this.setX(scaleFactor * this.x);
        this.setY(scaleFactor * this.y);
    }

}

