package p000.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldPoint;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: -.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e.a  reason: invalid package */
/* loaded from: 185d2d5a-4681-414b-93d2-e699fe383083.jar:-/d/t/u/t/r/o/i/t/n/s/q/i/w/r/e/e/a.class */
public final class a {
    public static final /* synthetic */ a WEST;
    private final /* synthetic */ WorldPoint brazierStand;
    private static final /* synthetic */ a[] $VALUES;
    private static /* synthetic */ int[] lIlIllllIIIll;
    public static final /* synthetic */ a EAST;
    private static /* synthetic */ String[] lIlIllllIIIlI;
    private final /* synthetic */ WorldPoint treeStand;

    private static void llIIIIlIlIlllII() {
        lIlIllllIIIlI = new String[lIlIllllIIIll[6]];
        lIlIllllIIIlI[lIlIllllIIIll[0]] = llIIIIlIlIllIll("Jsk45kg0gRM=", "tgVix");
        lIlIllllIIIlI[lIlIllllIIIll[4]] = llIIIIlIlIllIll("o4XKP5mwvVU=", "sUMLp");
    }

    private a(String str, int i, WorldPoint worldPoint, WorldPoint worldPoint2) {
        this.brazierStand = worldPoint2;
        this.treeStand = worldPoint;
    }

    private static void llIIIIlIlIlllIl() {
        lIlIllllIIIll = new int[8];
        lIlIllllIIIll[0] = ((186 ^ 156) ^ (181 ^ 171)) & (((47 ^ 27) ^ (2 ^ 14)) ^ (-" ".length()));
        lIlIllllIIIll[1] = (-((-66) & 4587)) & (-8193) & 14335;
        lIlIllllIIIll[2] = (-((-533) & 17015)) & (-8202) & 28671;
        lIlIllllIIIll[3] = (-((-7433) & 23916)) & (-8193) & 28671;
        lIlIllllIIIll[4] = " ".length();
        lIlIllllIIIll[5] = (-((-4133) & 31165)) & (-1) & 28670;
        lIlIllllIIIll[6] = "  ".length();
        lIlIllllIIIll[7] = (((15 + 4) - (-77)) + 108) ^ (((85 + 94) - 110) + 127);
    }

    private static String llIIIIlIlIllIll(String llllllllllllllIllIIllllIllIlIIIl, String llllllllllllllIllIIllllIllIlIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIllllIllIlIIII.getBytes(StandardCharsets.UTF_8)), lIlIllllIIIll[7]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIllllIIIll[6], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIllllIllIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIllllIllIlIIlI) {
            llllllllllllllIllIIllllIllIlIIlI.printStackTrace();
            return null;
        }
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    static {
        llIIIIlIlIlllIl();
        llIIIIlIlIlllII();
        WEST = new a(lIlIllllIIIlI[lIlIllllIIIll[0]], lIlIllllIIIll[0], new WorldPoint(lIlIllllIIIll[1], lIlIllllIIIll[2], lIlIllllIIIll[0]), new WorldPoint(lIlIllllIIIll[1], lIlIllllIIIll[3], lIlIllllIIIll[0]));
        EAST = new a(lIlIllllIIIlI[lIlIllllIIIll[4]], lIlIllllIIIll[4], new WorldPoint(lIlIllllIIIll[5], lIlIllllIIIll[2], lIlIllllIIIll[0]), new WorldPoint(lIlIllllIIIll[5], lIlIllllIIIll[3], lIlIllllIIIll[0]));
        a[] aVarArr = new a[lIlIllllIIIll[6]];
        aVarArr[lIlIllllIIIll[0]] = WEST;
        aVarArr[lIlIllllIIIll[4]] = EAST;
        $VALUES = aVarArr;
    }

    public WorldPoint b() {
        return this.brazierStand;
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public WorldPoint c() {
        return this.treeStand;
    }
}
