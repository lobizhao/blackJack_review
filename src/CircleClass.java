import java.awt.*;
import java.util.Collections;

public class CircleClass {

    Point center;
    double radius;

    CircleClass(){

    }

    CircleClass(Point iniPointer, double iniRadius){
        this.center = iniPointer;
        this.radius = iniRadius;
    }

    double getPerimeter(){
        return 2*Math.PI *this.radius;
    }
    double getArear(){
        return Math.PI *this.radius * this.radius;
    }

    void setCenter(Point center){
        this.center = center;
    }
    void setRadius(double radius){
        this.radius = radius;
    }
}
