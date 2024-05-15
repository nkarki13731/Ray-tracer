import java.awt.*;

public class Sphere {
    private Vector3d centerPoint;
    private float radius;
    private Color color;

    public Sphere(Vector3d centerPoint, float radius, Color color){
        this.centerPoint = centerPoint;
        this.radius = radius;
        this.color = color;
    }

    public float performRayIntersectionTest(Ray ray){
        // getting the a ,b and c values for ax^2 + bx + c form
        float a = ray.getDirection().magnitude() * ray.getDirection().magnitude();
        Vector3d cDash = ray.getOrigin().minus(this.centerPoint);
        Vector3d d = ray.getDirection();
        float b = 2 * cDash.dotProduct(d);
        float c = (cDash.magnitude()*cDash.magnitude()) - this.radius * this.radius;

        // determining if the intersection occurs ot not
        float determinate = (b * b) - (4 * (a * c));
        if(determinate < 0){
            return -1;
        }
        float t1 = (float) ((-b) + Math.sqrt(determinate)) / (2 * a) ;
        float t2 = (float) ((-b) - Math.sqrt(determinate)) / (2 * a) ;
        return (Math.min(t1,t2));




    }



}
