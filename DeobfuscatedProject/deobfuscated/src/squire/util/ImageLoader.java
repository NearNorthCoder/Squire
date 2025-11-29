/*
 * Decompiled with CFR 0.152.
 */
package squire.auth;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class ImageLoader {
    private static final /* synthetic */ Logger al;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    static BufferedImage a(Class llllIlIlllIlIIl, String llllIlIlllIlIII) {
        try {
            Class<ImageIO> llllIlIlllIIlll = ImageIO.class;
            synchronized (ImageIO.class) {
                // ** MonitorExit[llllIlIlllIIlll] (shouldn't scrollPane in output)
                return ImageIO.read(llllIlIlllIlIIl.getResourceAsStream(llllIlIlllIlIII));
            }
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
    }

    static {
        al = LoggerFactory.getLogger(p.class);
    }

    p() {
    }
}
