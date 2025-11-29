/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.MenuAction
 *  net.runelite.api.Point
 *  net.runelite.api.SpritePixels
 *  net.runelite.api.events.ClientTick
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.util.ImageUtil
 *  net.unethicalite.client.Static
 */
package gg.squire.basics.repeat;

import com.google.inject.Provides;
import gg.squire.basics.repeat.SquireQuickMenuConfig;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import gg.squire.basics.repeat.BulkCleaningHerbsTask;
import gg.squire.basics.repeat.BulkOpeningTask;
import gg.squire.basics.repeat.BulkSearchTask;
import gg.squire.basics.repeat.QuickAlchingTask;
import gg.squire.basics.repeat.TrackingShopRepeatsTask;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ExecutorService;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.MenuAction;
import net.runelite.api.Point;
import net.runelite.api.SpritePixels;
import net.runelite.api.events.ClientTick;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.util.ImageUtil;
import net.unethicalite.client.Static;

@PluginDescriptor(name="Squire Quick Menus", enabledByDefault=false)
@SquireUtil
public class RepeatPlugin
extends SquirePlugin {
    private  SpritePixels[] gp;
    
    private  SpritePixels[] go;
    
    @Inject
    private  ExecutorService gc;
    @Inject
    private  Client v;
    public static final  String gn;
    private  boolean gq;

    public SpritePixels[] cQ() {
        return this.gp;
    }

    private static void lllIlllIII() {
        lIIIlIIIl = new String[lIIIlIlIl[4]];
        RepeatPlugin.lIIIlIIIl[RepeatPlugin.lIIIlIlIl[1]] = RepeatPlugin.lllIllIllI("/u8ukqNHhFo=", "csxVe");
        RepeatPlugin.lIIIlIIIl[RepeatPlugin.lIIIlIlIl[2]] = RepeatPlugin.lllIllIlll("", "AlaRs");
        RepeatPlugin.lIIIlIIIl[RepeatPlugin.lIIIlIlIl[3]] = "<col=ffcf40>";
    }

    /*
     * WARNING - void declaration
     */
    public void f(boolean bl2) {
        void llIIllIIIlIlIIl;
        SpritePixels[] spritePixelsArray = this.v.getCrossSprites();
        if (RepeatPlugin.lllIllllII(spritePixelsArray)) {
            return;
        }
        int llIIllIIIlIlIII = lIIIlIlIl[1];
        while (RepeatPlugin.lllIllllIl(llIIllIIIlIlIII, ((void)llIIllIIIlIlIIl).length)) {
            SpritePixels spritePixels;
            RepeatPlugin llIIllIIIlIllII;
            void llIIllIIIlIlIll;
            if (RepeatPlugin.lllIlllllI((int)llIIllIIIlIlIll)) {
                spritePixels = llIIllIIIlIllII.gp[llIIllIIIlIlIII];

                }
            } else {
                spritePixels = llIIllIIIlIllII.go[llIIllIIIlIlIII];
            }
            llIIllIIIlIlIIl[llIIllIIIlIlIII] = spritePixels;
            ++llIIllIIIlIlIII;

            return;
        }
        this.gq = bl2;
    }

    @Provides
    SquireQuickMenuConfig u(ConfigManager configManager) {
        return (SquireQuickMenuConfig)configManager.getConfig(SquireQuickMenuConfig.class);
    }

    public boolean cR() {
        return this.gq;
    }

        return String.valueOf(llIIllIIIIIIIII);
    }

    private static boolean lllIllllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static int lllIllllll(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    private static boolean lllIlllllI(int n2) {
        return n2 != 0;
    }

    public SpritePixels[] cP() {
        return this.go;
    }

    /*
     * WARNING - void declaration
     */
    private void cO() {
        RepeatPlugin llIIllIIIlllIIl;
        void llIIllIIIlllIII;
        SpritePixels[] spritePixelsArray = this.v.getCrossSprites();
        if (RepeatPlugin.lllIllllII(spritePixelsArray)) {
            return;
        }
        llIIllIIIlllIIl.go = new SpritePixels[((void)llIIllIIIlllIII).length];
        llIIllIIIlllIIl.gp = new SpritePixels[((void)llIIllIIIlllIII).length];
        System.arraycopy(llIIllIIIlllIII, lIIIlIlIl[1], llIIllIIIlllIIl.go, lIIIlIlIl[1], llIIllIIIlllIIl.go.length);
        int llIIllIIIllIlll = lIIIlIlIl[1];
        while (RepeatPlugin.lllIllllIl(llIIllIIIllIlll, llIIllIIIlllIIl.go.length)) {
            SpritePixels llIIllIIIllIlII;
            SpritePixels llIIllIIIllIllI = llIIllIIIlllIIl.go[llIIllIIIllIlll];
            BufferedImage llIIllIIIllIlIl = llIIllIIIllIllI.toBufferedImage();
            ImageUtil.recolorImage((BufferedImage)llIIllIIIllIlIl, (Color)new Color(lIIIlIlIl[6], lIIIlIlIl[7], lIIIlIlIl[8], lIIIlIlIl[9]));

            llIIllIIIlllIIl.gp[llIIllIIIllIlll] = llIIllIIIllIlII = ImageUtil.getImageSpritePixels((BufferedImage)llIIllIIIllIlIl, (Client)llIIllIIIlllIIl.v);
            ++llIIllIIIllIlll;

            return;
        }
    }

    private static boolean lllIllllII(Object object) {
        return object == null;
    }

    static {
        RepeatPlugin.lllIlllIlI();
        RepeatPlugin.lllIlllIII();
        gn = lIIIlIIIl[lIIIlIlIl[3]];
    }

    private static boolean llllIIIIII(int n2) {
        return n2 >= 0;
    }

    public void a(Point point) {
        this.f(lIIIlIlIl[2]);
        Static.getClientThread().execute(() -> this.v.invokeMenuAction(lIIIlIIIl[lIIIlIlIl[1]], lIIIlIIIl[lIIIlIlIl[2]], lIIIlIlIl[10], MenuAction.GAME_OBJECT_FIFTH_OPTION.getId(), lIIIlIlIl[1], lIIIlIlIl[1], point.getX(), point.getY()));
    }

    protected void onStop() {
        this.f(lIIIlIlIl[1]);
    }

    protected void onStart() {
        this.gc.submit(this::cO);

    }

    @Subscribe
    public void b(ClientTick clientTick) {
        if (RepeatPlugin.lllIlllllI(this.cR() ? 1 : 0) && RepeatPlugin.llllIIIIII(RepeatPlugin.lllIllllll(System.currentTimeMillis() - this.v.getMouseLastPressedMillis(), 400L))) {
            this.f(lIIIlIlIl[1]);
        }
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lIIIlIlIl[0]];
        classArray[RepeatPlugin.lIIIlIlIl[1]] = TrackingShopRepeatsTask.class;
        classArray[RepeatPlugin.lIIIlIlIl[2]] = BulkOpeningTask.class;
        classArray[RepeatPlugin.lIIIlIlIl[3]] = QuickAlchingTask.class;
        classArray[RepeatPlugin.lIIIlIlIl[4]] = BulkCleaningHerbsTask.class;
        classArray[RepeatPlugin.lIIIlIlIl[5]] = BulkSearchTask.class;
        return classArray;
    }

}

