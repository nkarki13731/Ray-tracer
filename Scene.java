public class Scene {
    ImagePlane imagePlane;
    Vector3d camera;
    Sphere sphere;

    public Scene(ImagePlane imagePlane, Vector3d camera,Sphere sphere){
        this.imagePlane = imagePlane;
        this.camera = camera;
        this.sphere = sphere;
    }
}
