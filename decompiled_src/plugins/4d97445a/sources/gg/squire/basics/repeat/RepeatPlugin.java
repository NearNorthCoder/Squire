package gg.squire.basics.repeat;

import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.bA;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.bB;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.bC;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.bE;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.bF;
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
@PluginDescriptor(name = "Squire Quick Menus", enabledByDefault = false)
@SquireUtil
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:gg/squire/basics/repeat/RepeatPlugin.class */
public class RepeatPlugin extends SquirePlugin {
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
        lIIIlIIIl[lIIIlIlIl[1]] = lllIllIllI("/u8ukqNHhFo=", "csxVe");
        lIIIlIIIl[lIIIlIlIl[2]] = lllIllIlll("", "AlaRs");
        lIIIlIIIl[lIIIlIlIl[3]] = lllIllIlll("fhMqD0ckFiYFTnJO", "BpEcz");
    }

    public void f(boolean z) {
        SpritePixels spritePixels;
        SpritePixels[] crossSprites = this.v.getCrossSprites();
        if (lllIllllII(crossSprites)) {
            return;
        }
        int i2 = lIIIlIlIl[1];
        while (lllIllllIl(i2, crossSprites.length)) {
            int i3 = i2;
            if (lllIlllllI(z ? 1 : 0)) {
                spritePixels = this.gp[i2];
                "".length();
                if (0 != 0) {
                    return;
                }
            } else {
                spritePixels = this.go[i2];
            }
            crossSprites[i3] = spritePixels;
            i2++;
            "".length();
            if (0 != 0) {
                return;
            }
        }
        this.gq = z;
    }

    @Provides
    SquireQuickMenuConfig u(ConfigManager configManager) {
        return (SquireQuickMenuConfig) configManager.getConfig(SquireQuickMenuConfig.class);
    }

    public boolean cR() {
        return this.gq;
    }

    private static String lllIllIlll(String llIIllIIIIIIIlI, String llIIllIIIIIIIIl) {
        String llIIllIIIIIIIlI2 = new String(Base64.getDecoder().decode(llIIllIIIIIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llIIllIIIIIIIIl.toCharArray();
        int llIIlIllllllllI = lIIIlIlIl[1];
        char[] charArray2 = llIIllIIIIIIIlI2.toCharArray();
        int length = charArray2.length;
        int i2 = lIIIlIlIl[1];
        while (lllIllllIl(i2, length)) {
            char llIIllIIIIIIIll = charArray2[i2];
            sb.append((char) (llIIllIIIIIIIll ^ charArray[llIIlIllllllllI % charArray.length]));
            "".length();
            llIIlIllllllllI++;
            i2++;
            "".length();
            if ((((59 ^ 126) ^ (62 ^ 72)) & (((((18 + 59) - (-21)) + 37) ^ (((116 + 2) - (-13)) + 49)) ^ (-" ".length()))) > 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lllIllllIl(int i2, int i3) {
        return i2 < i3;
    }

    private static int lllIllllll(long j, long j2) {
        return (j > j2 ? 1 : (j == j2 ? 0 : -1));
    }

    private static boolean lllIlllllI(int i2) {
        return i2 != 0;
    }

    public SpritePixels[] cP() {
        return this.go;
    }

    private void cO() {
        SpritePixels[] crossSprites = this.v.getCrossSprites();
        if (lllIllllII(crossSprites)) {
            return;
        }
        this.go = new SpritePixels[crossSprites.length];
        this.gp = new SpritePixels[crossSprites.length];
        System.arraycopy(crossSprites, lIIIlIlIl[1], this.go, lIIIlIlIl[1], this.go.length);
        int i2 = lIIIlIlIl[1];
        while (lllIllllIl(i2, this.go.length)) {
            BufferedImage bufferedImage = this.go[i2].toBufferedImage();
            ImageUtil.recolorImage(bufferedImage, new Color(lIIIlIlIl[6], lIIIlIlIl[7], lIIIlIlIl[8], lIIIlIlIl[9]));
            "".length();
            this.gp[i2] = ImageUtil.getImageSpritePixels(bufferedImage, this.v);
            i2++;
            "".length();
            if (0 != 0) {
                return;
            }
        }
    }

    private static boolean lllIllllII(Object obj) {
        return obj == null;
    }

    static {
        lllIlllIlI();
        lllIlllIII();
        gn = lIIIlIIIl[lIIIlIlIl[3]];
    }

    private static boolean llllIIIIII(int i2) {
        return i2 >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    public void a(Point point) {
        f(lIIIlIlIl[2]);
        Static.getClientThread().execute(() -> {
            this.v.invokeMenuAction(lIIIlIIIl[lIIIlIlIl[1]], lIIIlIIIl[lIIIlIlIl[2]], lIIIlIlIl[10], MenuAction.GAME_OBJECT_FIFTH_OPTION.getId(), lIIIlIlIl[1], lIIIlIlIl[1], point.getX(), point.getY());
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    protected void onStop() {
        f(lIIIlIlIl[1]);
    }

    protected void onStart() {
        this.gc.submit(this::cO);
        "".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean] */
    @Subscribe
    public void b(ClientTick clientTick) {
        if (lllIlllllI(cR() ? 1 : 0) && llllIIIIII(lllIllllll(System.currentTimeMillis() - this.v.getMouseLastPressedMillis(), 400L))) {
            f(lIIIlIlIl[1]);
        }
    }

    private static void lllIlllIlI() {
        lIIIlIlIl = new int[12];
        lIIIlIlIl[0] = (26 ^ 107) ^ (47 ^ 91);
        lIIIlIlIl[1] = (146 ^ 148) & ((67 ^ 69) ^ (-1));
        lIIIlIlIl[2] = " ".length();
        lIIIlIlIl[3] = "  ".length();
        lIIIlIlIl[4] = "   ".length();
        lIIIlIlIl[5] = 85 ^ 81;
        lIIIlIlIl[6] = (((((101 + 107) - 141) + 72) + (81 ^ 36)) - (58 ^ 105)) + (112 ^ 57);
        lIIIlIlIl[7] = ((109 + 126) - 201) + 110;
        lIIIlIlIl[8] = "   ".length() ^ (15 ^ 49);
        lIIIlIlIl[9] = (((62 + 142) - 115) + 134) ^ (((11 + 3) - (-97)) + 56);
        lIIIlIlIl[10] = -" ".length();
        lIIIlIlIl[11] = (((73 + 10) - 23) + 105) ^ (((22 + 159) - 23) + 15);
    }

    protected Class<?>[] tasks() {
        Class<?>[] clsArr = new Class[lIIIlIlIl[0]];
        clsArr[lIIIlIlIl[1]] = bF.class;
        clsArr[lIIIlIlIl[2]] = bB.class;
        clsArr[lIIIlIlIl[3]] = bE.class;
        clsArr[lIIIlIlIl[4]] = bA.class;
        clsArr[lIIIlIlIl[5]] = bC.class;
        return clsArr;
    }

    private static String lllIllIllI(String llIIlIllllIIlII, String llIIlIllllIIIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIlIllllIIIll.getBytes(StandardCharsets.UTF_8)), lIIIlIlIl[11]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIIlIlIl[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIIlIllllIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIIlIllllIIllI) {
            llIIlIllllIIllI.printStackTrace();
            return null;
        }
    }
}
