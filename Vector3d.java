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
    public Vector3d minus(Vector3d other){
        return new Vector3d(this.x - other.getX(), this.y- other.getY(),this.z-other.getZ());
    }
    public Vector3d scale(float scalaer){
        return new Vector3d(scalaer*this.x,scalaer*this.y,scalaer*this.z);

    }
    public float dotProduct(Vector3d a){
        return (this.x * a.getX() + this.y + a.getY() + this.z * a.getZ());

    }
    public float magnitude (){

        return (float) Math.sqrt(this.dotProduct(this));
    }
    public static Vector3d lerp (Vector3d a, Vector3d b,float t){
        return a.scale(1 - t).add(b.scale(t));


    }
}
