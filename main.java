import java.awt.*;
import java.io.IOException;
import java.nio.file.Paths;

public class main {
    public static void main(String[] args) {
        final int W = 255;
        final int H = 191;
        Scene scene  = new Scene(
                new ImagePlane(
                        new Vector3d(1f,0.75f,0f),
                        new Vector3d(-1f,0.75f,0f),
                        new Vector3d(1f,-0.75f,0f),
                        new Vector3d(-1f,-0.75f,0f)),new Vector3d(0,0,-1));
        Raytracer raytacer = new Raytracer(W,H,scene);
        Image image = new Image(W,H);
        for(int i = 0; i < W; i++){
            for (int j = 0; j < H; j++){

               Ray r = raytacer.tracer(i,j);


               image.plotPixel(i,j,new ImageColor(i,j,75));
//                image.plotPixel(i,j,new ImageColor(Math.abs((int)r.getOrigin().getX()),Math.abs((int)r.getOrigin().getY()),200));

            }
        }

        try {
            image.save(Paths.get("a.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
