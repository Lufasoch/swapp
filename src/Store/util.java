/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Store;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author nightmare
 */
public class util {
    static byte[] imgToBytes(File fnew) throws IOException{
        //File fnew=new File(dir);
        BufferedImage originalImage=ImageIO.read(fnew);
        ByteArrayOutputStream baos=new ByteArrayOutputStream();
        //
        String name = fnew.getName();
        int pos = name.lastIndexOf('.');
        String ext = name.substring(pos + 1);
        //
        ImageIO.write(originalImage, ext, baos );
        byte[] imageInByte=baos.toByteArray();
        return imageInByte;
    }
}
