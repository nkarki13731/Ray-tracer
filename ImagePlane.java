public class ImagePlane {
    private   Vector3d x1;
    private  Vector3d x2;
    private  Vector3d x3;
    private Vector3d x4;

    public Vector3d getX1() {
        return x1;
    }

    public Vector3d getX2() {
        return x2;
    }

    public Vector3d getX3() {
        return x3;
    }

    public Vector3d getX4() {
        return x4;
    }

    public ImagePlane(Vector3d topLeft, Vector3d topRight, Vector3d bottomleft, Vector3d bottomRight){
        this.x1 = topLeft;
        this.x2 = topRight;
        this.x3 = bottomleft;
        this.x4 = bottomRight;
    }
}

