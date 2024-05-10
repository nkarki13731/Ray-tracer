public class Vector3d {
    public float getX() {
        return x;
    }

    private float x;

    public float getZ() {
        return z;
    }

    public float getY() {
        return y;
    }

    private float y;
    private float z;

    public Vector3d(float x, float y, float z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector3d add(Vector3d other){
        return new Vector3d(this.x + other.getX(), this.y+ other.getY(),this.z+other.getZ());
    }
}
