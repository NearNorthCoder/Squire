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
import i.i.b.s.c.q.r.s.s.-.u.a.e.bA;
import i.i.b.s.c.q.r.s.s.-.u.a.e.bB;
import i.i.b.s.c.q.r.s.s.-.u.a.e.bC;
import i.i.b.s.c.q.r.s.s.-.u.a.e.bE;
import i.i.b.s.c.q.r.s.s.-.u.a.e.bF;
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
    private /* synthetic */ SpritePixels[] gp;
    private static /* synthetic */ int[] lIIIlIlIl;
    private /* synthetic */ SpritePixels[] go;
    private static /* synthetic */ String[] lIIIlIIIl;
    @Inject
    private /* synthetic */ ExecutorService gc;
    @Inject
    private /* synthetic */ Client v;
    public static final /* synthetic */ String gn;
    private /* synthetic */ boolean gq;

    public SpritePixels[] cQ() {
        return this.gp;
    }

    private static void lllIlllIII() {
        lIIIlIIIl = new String[lIIIlIlIl[4]];
        RepeatPlugin.lIIIlIIIl[RepeatPlugin.lIIIlIlIl[1]] = RepeatPlugin.lllIllIllI("/u8ukqNHhFo=", "csxVe");
        RepeatPlugin.lIIIlIIIl[RepeatPlugin.lIIIlIlIl[2]] = RepeatPlugin.lllIllIlll("", "AlaRs");
        RepeatPlugin.lIIIlIIIl[RepeatPlugin.lIIIlIlIl[3]] = RepeatPlugin.lllIllIlll("fhMqD0ckFiYFTnJO", "BpEcz");
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
                "".length();
                if (null != null) {
                    return;
                }
            } else {
                spritePixels = llIIllIIIlIllII.go[llIIllIIIlIlIII];
            }
            llIIllIIIlIlIIl[llIIllIIIlIlIII] = spritePixels;
            ++llIIllIIIlIlIII;
            "".length();
            if (null == null) continue;
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

    private static String lllIllIlll(String llIIlIlllllllIl, String llIIlIlllllllII) {
        llIIlIlllllllIl = new String(Base64.getDecoder().decode(llIIlIlllllllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIIllIIIIIIIII = new StringBuilder();
        char[] llIIlIlllllllll = llIIlIlllllllII.toCharArray();
        int llIIlIllllllllI = lIIIlIlIl[1];
        char[] llIIlIllllllIII = llIIlIlllllllIl.toCharArray();
        int llIIlIlllllIlll = llIIlIllllllIII.length;
        int llIIlIlllllIllI = lIIIlIlIl[1];
        while (RepeatPlugin.lllIllllIl(llIIlIlllllIllI, llIIlIlllllIlll)) {
            char llIIllIIIIIIIll = llIIlIllllllIII[llIIlIlllllIllI];
            llIIllIIIIIIIII.append((char)(llIIllIIIIIIIll ^ llIIlIlllllllll[llIIlIllllllllI % llIIlIlllllllll.length]));
            "".length();
            ++llIIlIllllllllI;
            ++llIIlIlllllIllI;
            "".length();
            if (((0x3B ^ 0x7E ^ (0x3E ^ 0x48)) & (18 + 59 - -21 + 37 ^ 116 + 2 - -13 + 49 ^ -" ".length())) <= 0) continue;
            return null;
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
            "".length();
            llIIllIIIlllIIl.gp[llIIllIIIllIlll] = llIIllIIIllIlII = ImageUtil.getImageSpritePixels((BufferedImage)llIIllIIIllIlIl, (Client)llIIllIIIlllIIl.v);
            ++llIIllIIIllIlll;
            "".length();
            if (null == null) continue;
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
        "".length();
    }

    @Subscribe
    public void b(ClientTick clientTick) {
        if (RepeatPlugin.lllIlllllI(this.cR() ? 1 : 0) && RepeatPlugin.llllIIIIII(RepeatPlugin.lllIllllll(System.currentTimeMillis() - this.v.getMouseLastPressedMillis(), 400L))) {
            this.f(lIIIlIlIl[1]);
        }
    }

    private static void lllIlllIlI() {
        lIIIlIlIl = new int[12];
        RepeatPlugin.lIIIlIlIl[0] = 0x1A ^ 0x6B ^ (0x2F ^ 0x5B);
        RepeatPlugin.lIIIlIlIl[1] = (0x92 ^ 0x94) & ~(0x43 ^ 0x45);
        RepeatPlugin.lIIIlIlIl[2] = " ".length();
        RepeatPlugin.lIIIlIlIl[3] = "  ".length();
        RepeatPlugin.lIIIlIlIl[4] = "   ".length();
        RepeatPlugin.lIIIlIlIl[5] = 0x55 ^ 0x51;
        RepeatPlugin.lIIIlIlIl[6] = 101 + 107 - 141 + 72 + (0x51 ^ 0x24) - (0x3A ^ 0x69) + (0x70 ^ 0x39);
        RepeatPlugin.lIIIlIlIl[7] = 109 + 126 - 201 + 110;
        RepeatPlugin.lIIIlIlIl[8] = "   ".length() ^ (0xF ^ 0x31);
        RepeatPlugin.lIIIlIlIl[9] = 62 + 142 - 115 + 134 ^ 11 + 3 - -97 + 56;
        RepeatPlugin.lIIIlIlIl[10] = -" ".length();
        RepeatPlugin.lIIIlIlIl[11] = 73 + 10 - 23 + 105 ^ 22 + 159 - 23 + 15;
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lIIIlIlIl[0]];
        classArray[RepeatPlugin.lIIIlIlIl[1]] = bF.class;
        classArray[RepeatPlugin.lIIIlIlIl[2]] = bB.class;
        classArray[RepeatPlugin.lIIIlIlIl[3]] = bE.class;
        classArray[RepeatPlugin.lIIIlIlIl[4]] = bA.class;
        classArray[RepeatPlugin.lIIIlIlIl[5]] = bC.class;
        return classArray;
    }

    private static String lllIllIllI(String llIIlIllllIIIIl, String llIIlIllllIIIll) {
        try {
            SecretKeySpec llIIlIllllIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIlIllllIIIll.getBytes(StandardCharsets.UTF_8)), lIIIlIlIl[11]), "DES");
            Cipher llIIlIllllIIlll = Cipher.getInstance("DES");
            llIIlIllllIIlll.init(lIIIlIlIl[3], llIIlIllllIlIII);
            return new String(llIIlIllllIIlll.doFinal(Base64.getDecoder().decode(llIIlIllllIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIlIllllIIllI) {
            llIIlIllllIIllI.printStackTrace();
            return null;
        }
    }
}

