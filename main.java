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
                        new Vector3d(-1f,-0.75f,0f)),new Vector3d(0,0,-1));
        Raytracer raytacer = new Raytracer(W,H,scene);
        Image image = new Image(W,H);
//        for(int i = 0; i < W; i++){
//            for (int j = 0; j < H; j++){
//
//               Ray r = raytacer.tracer(i,j);
//                System.out.println(r.getOrigin().getX()+"X");
//                System.out.println(r.getOrigin().getY()+"Y");
//               image.plotPixel(Math.abs((int)r.getOrigin().getX()*W),Math.abs((int)r.getOrigin().getY()*H),new ImageColor(1,j/H,0));
//            }
//        }
        for(float i = -0.75f; i <= 0.75f; i+=0.1){
            for(float j = -1; j <= 1; j+=0.1){
                Ray r = raytacer.tracer(i,j);
                System.out.println(r.getOrigin().getX()+"X");
                System.out.println(r.getOrigin().getY()+"Y");
               image.plotPixel(Math.abs((int)r.getOrigin().getX()*W),Math.abs((int)r.getOrigin().getY()*H),new ImageColor(1,j,0));

            }
        }
        try {
            image.save(Paths.get("a.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
