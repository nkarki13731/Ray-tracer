public class ImageColor {
    public float getB() {
        return b;
    }

    public float getG() {
        return g;
    }

    public float getR() {
        return r;
    }

    private float r;

    private float g;
    private float b;

    public ImageColor(float r, float g, float b){
        this.r = r;
        this.b = b;
        this.g = g;
    }

}
