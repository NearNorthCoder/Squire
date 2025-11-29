package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Widgets;
@TaskDesc(name = "Making party", priority = 2147483547, blocking = true)
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.ay  reason: invalid package and case insensitive filesystem */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/ay.class */
public class C0025ay extends AbstractC0026az {
    private static /* synthetic */ String[] lIIlllllIllI;
    private final /* synthetic */ SquireChambersPlugin dy;
    private final /* synthetic */ SquireChambersConfig dz;
    private static /* synthetic */ int[] lIIllllllIll;

    private static boolean llIlIIlIllIllI(int i) {
        return i != 0;
    }

    private static void llIlIIlIllIlII() {
        lIIlllllIllI = new String[lIIllllllIll[8]];
        lIIlllllIllI[lIIllllllIll[0]] = llIlIIlIlIllIl("4HCWIBk99IdEO5DFUzhO2w==", "qgPVy");
        lIIlllllIllI[lIIllllllIll[2]] = llIlIIlIlIlllI("hu9C7tRZB9o=", "bOMMI");
        lIIlllllIllI[lIIllllllIll[3]] = llIlIIlIlIllll("PCc2AQ0HNjwdH04gOhIKCg==", "nBUsx");
        lIIlllllIllI[lIIllllllIll[4]] = llIlIIlIlIlllI("fi32YNhwdBo=", "RHfWW");
        lIIlllllIllI[lIIllllllIll[5]] = llIlIIlIlIllIl("OIrLlpSK7Wny8OdRzqvTKlFPH6V2UwDw", "SbwTw");
        lIIlllllIllI[lIIllllllIll[6]] = llIlIIlIlIlllI("YhmE7XZAHiA=", "xcjRA");
        lIIlllllIllI[lIIllllllIll[7]] = llIlIIlIlIllIl("pWXSMA5gfO6Nz0jCG/19yw==", "flXZM");
    }

    private static boolean llIlIIlIllIlll(Object obj) {
        return obj != null;
    }

    private static String llIlIIlIlIllIl(String lllllllllllllllIlllIIlllllIIlIll, String lllllllllllllllIlllIIlllllIIlIlI) {
        try {
            SecretKeySpec lllllllllllllllIlllIIlllllIIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIIlllllIIlIlI.getBytes(StandardCharsets.UTF_8)), lIIllllllIll[9]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIllllllIll[3], lllllllllllllllIlllIIlllllIIlllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIIlllllIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIIlllllIIllII) {
            lllllllllllllllIlllIIlllllIIllII.printStackTrace();
            return null;
        }
    }

    private static String llIlIIlIlIlllI(String lllllllllllllllIlllIIlllllIllIII, String lllllllllllllllIlllIIlllllIlIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIIlllllIlIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIllllllIll[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIIlllllIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIIlllllIllIIl) {
            lllllllllllllllIlllIIlllllIllIIl.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIIlIlllIII(Object obj) {
        return obj == null;
    }

    private static String llIlIIlIlIllll(String lllllllllllllllIlllIIllllIllIllI, String lllllllllllllllIlllIIllllIlllIlI) {
        String lllllllllllllllIlllIIllllIllIllI2 = new String(Base64.getDecoder().decode(lllllllllllllllIlllIIllllIllIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIlllIIllllIlllIlI.toCharArray();
        int lllllllllllllllIlllIIllllIllIlll = lIIllllllIll[0];
        char[] charArray2 = lllllllllllllllIlllIIllllIllIllI2.toCharArray();
        int length = charArray2.length;
        int i = lIIllllllIll[0];
        while (llIlIIlIlllIIl(i, length)) {
            char lllllllllllllllIlllIIllllIllllII = charArray2[i];
            sb.append((char) (lllllllllllllllIlllIIllllIllllII ^ charArray[lllllllllllllllIlllIIllllIllIlll % charArray.length]));
            "".length();
            lllllllllllllllIlllIIllllIllIlll++;
            i++;
            "".length();
            if ("   ".length() < (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    static {
        llIlIIlIllIlIl();
        llIlIIlIllIlII();
    }

    private static boolean llIlIIlIlllIIl(int i, int i2) {
        return i < i2;
    }

    @Inject
    public C0025ay(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig) {
        this.dy = squireChambersPlugin;
        this.dz = squireChambersConfig;
    }

    private static void llIlIIlIllIlIl() {
        lIIllllllIll = new int[10];
        lIIllllllIll[0] = ((((56 + 215) - 245) + 214) ^ (((118 + 46) - 109) + 110)) & (((112 ^ 58) ^ (72 ^ 87)) ^ (-" ".length()));
        lIIllllllIll[1] = (-32265) & 32763;
        lIIllllllIll[2] = " ".length();
        lIIllllllIll[3] = "  ".length();
        lIIllllllIll[4] = "   ".length();
        lIIllllllIll[5] = (66 ^ 83) ^ (42 ^ 63);
        lIIllllllIll[6] = (16 ^ 116) ^ (239 ^ 142);
        lIIllllllIll[7] = 72 ^ 78;
        lIIllllllIll[8] = 168 ^ 175;
        lIIllllllIll[9] = (124 ^ 58) ^ (8 ^ 70);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.AbstractC0026az
    public boolean cg() {
        if (llIlIIlIllIllI(C0046u.bn() ? 1 : 0)) {
            return lIIllllllIll[0];
        }
        Widget widget = Widgets.get(lIIllllllIll[1], widget2 -> {
            String[] strArr = new String[lIIllllllIll[2]];
            strArr[lIIllllllIll[0]] = lIIlllllIllI[lIIllllllIll[7]];
            return widget2.hasAction(strArr);
        });
        if (llIlIIlIllIlll(widget)) {
            widget.interact(lIIlllllIllI[lIIllllllIll[0]]);
            return lIIllllllIll[0];
        }
        TileObjects.getNearest(this.cy, tileObject -> {
            if (llIlIIlIllIllI(tileObject.getName().equals(lIIlllllIllI[lIIllllllIll[5]]) ? 1 : 0)) {
                String[] strArr = new String[lIIllllllIll[2]];
                strArr[lIIllllllIll[0]] = lIIlllllIllI[lIIllllllIll[6]];
                if (llIlIIlIllIllI(tileObject.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lIIllllllIll[2];
                    "".length();
                    return ((189 ^ 185) & ((79 ^ 75) ^ (-1))) >= "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
            return lIIllllllIll[0];
        });
        "".length();
        TileObject nearest = TileObjects.getNearest(this.cy, tileObject2 -> {
            if (llIlIIlIllIllI(tileObject2.getName().equals(lIIlllllIllI[lIIllllllIll[3]]) ? 1 : 0)) {
                String[] strArr = new String[lIIllllllIll[2]];
                strArr[lIIllllllIll[0]] = lIIlllllIllI[lIIllllllIll[4]];
                if (llIlIIlIllIllI(tileObject2.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lIIllllllIll[2];
                    "".length();
                    return "   ".length() == 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
            return lIIllllllIll[0];
        });
        if (llIlIIlIlllIII(nearest)) {
            return lIIllllllIll[0];
        }
        nearest.interact(lIIlllllIllI[lIIllllllIll[2]]);
        return lIIllllllIll[2];
    }
}
