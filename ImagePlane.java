public class ImagePlane {
    private   Vector3d x1;
    private  Vector3d x2;
    private  Vector3d x3;
    private Vector3d x4;


    public ImagePlane(Vector3d topLeft,Vector3d topRight,Vector3d bottomleft,Vector3d bottomRight){
        this.x1 = topLeft;
        this.x2 = topLeft;
        this.x3 = bottomleft;
        this.x4 = bottomRight;
    }
}

