import java.awt.*;

public class Raytracer {
    private  int w;
    private  int h;
    private  Scene scene;

    public Raytracer(int w, int h,Scene scene){
        this.w = w;
        this.h = h;
        this.scene = scene;
    }
    public Ray tracer(float x, float y) {
        Vector3d top = Vector3d.lerp(this.scene.imagePlane.getX1(), this.scene.imagePlane.getX2(), x);
        Vector3d bottom = Vector3d.lerp(this.scene.imagePlane.getX3(), this.scene.imagePlane.getX4(), x);
        Vector3d point = Vector3d.lerp(top, bottom, y);
        Ray ray = new Ray(point,point.minus(this.scene.camera));
        return ray;




    }
}
