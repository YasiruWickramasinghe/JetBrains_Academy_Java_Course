import static java.lang.Math.PI;
class Circle {

    double radius;

    // write methods here
    public double getLength(){

        return 2 * PI * radius;
    }
    public double getArea(){
        return PI * radius * radius;
    }
}