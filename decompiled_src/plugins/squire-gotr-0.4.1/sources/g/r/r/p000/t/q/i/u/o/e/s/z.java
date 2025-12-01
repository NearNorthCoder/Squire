package g.r.r.p000.t.q.i.u.o.e.s;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.runecrafting.SquireGOTRPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Widgets;
@TaskDesc(name = "Entering Minigame", priority = 2, blocking = true)
/* renamed from: g.r.r.-.t.q.i.u.o.e.s.z  reason: invalid package */
/* loaded from: squire-gotr-0.4.1.jar:g/r/r/-/t/q/i/u/o/e/s/z.class */
public class z extends h {
    private static final /* synthetic */ String bg;
    private static /* synthetic */ int[] llIIllIIlllI;
    private static final /* synthetic */ String bh;
    private static /* synthetic */ String[] llIIllIIllIl;
    private /* synthetic */ boolean bi;
    private static final /* synthetic */ int bf;

    private static String llllllIIlIIIIl(String lllllllllllllllIlIIllIllIIIlllll, String lllllllllllllllIlIIllIllIIIllllI) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlIIllIllIIIlllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIlIIllIllIIIllllI.toCharArray();
        int lllllllllllllllIlIIllIllIIIllIll = llIIllIIlllI[1];
        char[] charArray2 = str.toCharArray();
        int lllllllllllllllIlIIllIllIIIlIlII = charArray2.length;
        int lllllllllllllllIlIIllIllIIIlIIll = llIIllIIlllI[1];
        while (llllllIIlIlIlI(lllllllllllllllIlIIllIllIIIlIIll, lllllllllllllllIlIIllIllIIIlIlII)) {
            sb.append((char) (charArray2[lllllllllllllllIlIIllIllIIIlIIll] ^ charArray[lllllllllllllllIlIIllIllIIIllIll % charArray.length]));
            "".length();
            lllllllllllllllIlIIllIllIIIllIll++;
            lllllllllllllllIlIIllIllIIIlIIll++;
            "".length();
            if ((44 ^ 40) <= (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private void c(String str) {
        if (llllllIIlIlIIl(str.contains(llIIllIIllIl[llIIllIIlllI[7]]) ? 1 : 0)) {
            return;
        }
        str.substring(str.indexOf(llIIllIIllIl[llIIllIIlllI[2]])).trim().substring(llIIllIIlllI[1], llIIllIIlllI[6]);
    }

    private static boolean llllllIIlIlIII(int i, int i2) {
        return i != i2;
    }

    private static void llllllIIlIIlII() {
        llIIllIIlllI = new int[11];
        llIIllIIlllI[0] = " ".length();
        llIIllIIlllI[1] = (167 ^ 129) & ((158 ^ 184) ^ (-1));
        llIIllIIlllI[2] = 184 ^ 188;
        llIIllIIlllI[3] = (-5121) & 48820;
        llIIllIIlllI[4] = (121 ^ 1) ^ (118 ^ 8);
        llIIllIIlllI[5] = (91 ^ 52) ^ (97 ^ 28);
        llIIllIIlllI[6] = "  ".length();
        llIIllIIlllI[7] = "   ".length();
        llIIllIIlllI[8] = (((111 + 106) - 178) + 130) ^ (((108 + 31) - 52) + 85);
        llIIllIIlllI[9] = 64 ^ 71;
        llIIllIIlllI[10] = (((60 + 45) - 94) + 159) ^ (((2 + 60) - (-43)) + 57);
    }

    private static boolean llllllIIlIlIlI(int i, int i2) {
        return i < i2;
    }

    static {
        llllllIIlIIlII();
        llllllIIlIIIll();
        bh = llIIllIIllIl[llIIllIIlllI[8]];
        bg = llIIllIIllIl[llIIllIIlllI[4]];
        bf = llIIllIIlllI[3];
    }

    private static boolean llllllIIlIIlll(int i, int i2) {
        return i > i2;
    }

    private static boolean llllllIIlIIllI(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Inject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public z(SquireGOTRPlugin squireGOTRPlugin) {
        super(squireGOTRPlugin, r2);
        EnumC0002c[] enumC0002cArr = new EnumC0002c[llIIllIIlllI[0]];
        enumC0002cArr[llIIllIIlllI[1]] = EnumC0002c.OUTSIDE;
    }

    private static boolean llllllIIlIIlIl(int i) {
        return i != 0;
    }

    private static String llllllIIlIIIII(String lllllllllllllllIlIIllIllIIllllII, String lllllllllllllllIlIIllIllIIlllIll) {
        try {
            SecretKeySpec lllllllllllllllIlIIllIllIIllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIllIllIIlllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIllIIlllI[6], lllllllllllllllIlIIllIllIIllllll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIllIllIIllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIllIllIIllllIl) {
            lllllllllllllllIlIIllIllIIllllIl.printStackTrace();
            return null;
        }
    }

    private static String llllllIIlIIIlI(String lllllllllllllllIlIIllIllIIlIllll, String lllllllllllllllIlIIllIllIIlIlllI) {
        try {
            SecretKeySpec lllllllllllllllIlIIllIllIIllIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIllIllIIlIlllI.getBytes(StandardCharsets.UTF_8)), llIIllIIlllI[10]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIllIIlllI[6], lllllllllllllllIlIIllIllIIllIIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIllIllIIlIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIllIllIIllIIII) {
            lllllllllllllllIlIIllIllIIllIIII.printStackTrace();
            return null;
        }
    }

    private static boolean llllllIIlIlIIl(int i) {
        return i == 0;
    }

    private static void llllllIIlIIIll() {
        llIIllIIllIl = new String[llIIllIIlllI[9]];
        llIIllIIllIl[llIIllIIlllI[1]] = llllllIIlIIIII("kbpI8UOzzBY+prOb9IiewiYbsNQoA7eeGc/mdXPlS3jwL3h2TKWZjreoUoGRBHSy", "aDQNA");
        llIIllIIllIl[llIIllIIlllI[0]] = llllllIIlIIIIl("Hy0HEwsRLQcdWAw0", "yDizx");
        llIIllIIllIl[llIIllIIlllI[6]] = llllllIIlIIIlI("VL732dnlI5iTd+OSMONECQ==", "YQxWi");
        llIIllIIllIl[llIIllIIlllI[7]] = llllllIIlIIIIl("LR0POB5WDRhnLR8OGD0DCwFKKQUdChhj", "jojYj");
        llIIllIIllIl[llIIllIIlllI[2]] = llllllIIlIIIIl("LAE0OTJXESNmAR4SIzwvCh1xKCkcFiNi", "ksQXF");
        llIIllIIllIl[llIIllIIlllI[8]] = llllllIIlIIIII("CALSdK2T4EekJB6TX/ODXg==", "XYxMb");
        llIIllIIllIl[llIIllIIlllI[4]] = llllllIIlIIIlI("XVLF8mKX9c36QWvyG38lbmkagsTnB0/aNRJD2SBJa/qFyhCn7zn+EGQq5jAF4S5J", "EJrdR");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    @Override // g.r.r.p000.t.q.i.u.o.e.s.h
    public boolean ak() {
        if (!llllllIIlIIlIl(this.aV.f() ? 1 : 0) && !llllllIIlIIlIl(Players.getLocal().isMoving() ? 1 : 0)) {
            TileObject nearest = TileObjects.getNearest(SquireGOTRPlugin.d);
            if (!llllllIIlIIllI(nearest) || llllllIIlIIlll(nearest.distanceTo(Players.getLocal()), llIIllIIlllI[2])) {
                return llIIllIIlllI[1];
            }
            if (llllllIIlIlIII(nearest.getId(), llIIllIIlllI[3])) {
                return llIIllIIlllI[1];
            }
            Widget widget = Widgets.get(WidgetInfo.MINIGAME_DIALOG_TEXT);
            if (llllllIIlIIllI(widget)) {
                String text = widget.getText();
                if (llllllIIlIIlIl(text.contains(llIIllIIllIl[llIIllIIlllI[1]]) ? 1 : 0)) {
                    sleep(Rand.nextInt(llIIllIIlllI[4], llIIllIIlllI[5]));
                }
                if (llllllIIlIIlIl(text.contains(llIIllIIllIl[llIIllIIlllI[0]]) ? 1 : 0)) {
                    sleep(Rand.nextInt(llIIllIIlllI[6], llIIllIIlllI[2]));
                }
            }
            nearest.interact(llIIllIIllIl[llIIllIIlllI[6]]);
            return llIIllIIlllI[0];
        }
        return llIIllIIlllI[1];
    }
}
