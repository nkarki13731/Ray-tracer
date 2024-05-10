public class main {
    public static void main(String[] args) {
        final int W = 1920;
        final int H = 1080;
        Scene scene  = new Scene(
                new ImagePlane(
                        new Vector3d(1f,0.75f,0f),
                        new Vector3d(-1f,0.75f,0f),
                        new Vector3d(1f,-0.75f,0f),
                        new Vector3d(-1f,-0.75f,0f)),new Vector3d(0,0,-1));
        Raytracer raytacer = new Raytracer(W,H,scene);

    }
}
