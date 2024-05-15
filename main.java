import java.awt.*;
import java.io.IOException;
import java.nio.file.Paths;

public class main {
    public static void main(String[] args) {
        final int W = 256;
        final int H = 192;
        Scene scene  = new Scene(
                new ImagePlane(
                        new Vector3d(1f,0.75f,0f),
                        new Vector3d(-1f,0.75f,0f),
                        new Vector3d(1f,-0.75f,0f),
                        new Vector3d
                                (-1f,-0.75f,0f))
                                ,new Vector3d(0,0,-1)
                                ,new Sphere(new Vector3d(0, 0, -0.8f),0.4f,new Color(255, 0, 0))
                                );
        Raytracer raytacer = new Raytracer(W,H,scene);
        Image image = new Image(W,H);
        for(int i = 0; i < W; i++){
            for (int j = 0; j < H; j++){

               Ray r = raytacer.tracer(i,j);
               float result = scene.sphere.performRayIntersectionTest(r);
               if (result < 0){
                   image.plotPixel(i,j,new ImageColor(0,0,0));

               }
               else{
                   image.plotPixel(i,j,new ImageColor(255,0,0));
               }


//               image.plotPixel(i,j,new ImageColor(i,j,75));
////                image.plotPixel(i,j,new ImageColor(Math.abs((int)r.getOrigin().getX()),Math.abs((int)r.getOrigin().getY()),200));

            }
        }

        try {
            image.save(Paths.get("a.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
