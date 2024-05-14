public class ImageColor {
    public int getB() {
        return b;
    }

    public int getG() {
        return g;
    }

    public int getR() {
        return r;
    }

    private int r;

    private int g;
    private int b;

    public ImageColor(int r, int g, int b){
        if (r > 255){
            this.r = 255;
        }
        else {
        this.r = r;}


        if(g > 255){
            this.g = 255;
        }
        else {
            this.g = g;
        }

        this.b = b;

    }

}
