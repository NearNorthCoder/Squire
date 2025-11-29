package p000.r.u.q.e.s.o.t.a.i;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.toa.SquireTOA;
import gg.squire.toa.TOAConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
@TaskDesc(name = "Handling babboon prayers")
/* renamed from: -.r.u.q.e.s.o.t.a.i.N  reason: invalid package */
/* loaded from: squire-toa-1.0.1.jar:-/r/u/q/e/s/o/t/a/i/N.class */
public class N extends z {
    private static /* synthetic */ String[] lIlIIIIIIllll;
    private static /* synthetic */ int[] lIlIIIIIlIIII;

    private static String lIllIlIllllllll(String llllllllllllllIlllIIllIIlllIllll, String llllllllllllllIlllIIllIIlllIlllI) {
        try {
            SecretKeySpec llllllllllllllIlllIIllIIllllIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIllIIlllIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIIIIIlIIII[2], llllllllllllllIlllIIllIIllllIIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIllIIlllIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIIllIIllllIIII) {
            llllllllllllllIlllIIllIIllllIIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIllIIIIIllI(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIllIllIIIIlIIl(Object obj, Object obj2) {
        return obj != obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // p000.r.u.q.e.s.o.t.a.i.z
    public boolean I() {
        if (lIllIllIIIIlIIl(this.aT.prayModeBaboons(), EnumC0013n.NONE)) {
            ?? r0 = lIlIIIIIlIIII[0];
            "".length();
            return (-(173 ^ 168)) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIlIIIIIlIIII[1];
    }

    private static void lIllIllIIIIIIlI() {
        lIlIIIIIIllll = new String[lIlIIIIIlIIII[6]];
        lIlIIIIIIllll[lIlIIIIIlIIII[1]] = lIllIlIllllllll("zA8x+tL3F8P8r9X+6pxh+w==", "gZdUs");
        lIlIIIIIIllll[lIlIIIIIlIIII[0]] = lIllIllIIIIIIII("ACABCB4sYS4GFic=", "BAcgq");
        lIlIIIIIIllll[lIlIIIIIlIIII[2]] = lIllIllIIIIIIIl("cBf4JMRhwjz4OVhM01IsNg==", "VmXqp");
        lIlIIIIIIllll[lIlIIIIIlIIII[3]] = lIllIllIIIIIIII("OwIzHj8XQwUZIhgPPQ==", "ycQqP");
        lIlIIIIIIllll[lIlIIIIIlIIII[5]] = lIllIllIIIIIIIl("GwOkLe9OVuA=", "DsElw");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    @Override // p000.r.u.q.e.s.o.t.a.i.z
    public boolean C() {
        if (!lIllIllIIIIlIII(this.aT.prayModeBaboons(), EnumC0013n.NONE) && lIllIllIIIIIlIl(NPCs.getNearest(npc -> {
            return npc.getName().contains(lIlIIIIIIllll[lIlIIIIIlIIII[5]]);
        }))) {
            ?? r0 = lIlIIIIIlIIII[0];
            "".length();
            return "   ".length() != "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIlIIIIIlIIII[1];
    }

    @Override // p000.r.u.q.e.s.o.t.a.i.z
    public int F() {
        return lIlIIIIIlIIII[4];
    }

    private static boolean lIllIllIIIIIlII(int i, int i2) {
        return i > i2;
    }

    static {
        lIllIllIIIIIIll();
        lIllIllIIIIIIlI();
    }

    private static void lIllIllIIIIIIll() {
        lIlIIIIIlIIII = new int[8];
        lIlIIIIIlIIII[0] = " ".length();
        lIlIIIIIlIIII[1] = ((((36 + 27) - (-67)) + 22) ^ (((97 + 42) - 16) + 6)) & (((((136 + 76) - 69) + 4) ^ (((136 + 100) - 233) + 135)) ^ (-" ".length()));
        lIlIIIIIlIIII[2] = "  ".length();
        lIlIIIIIlIIII[3] = "   ".length();
        lIlIIIIIlIIII[4] = (-17577) & 32762;
        lIlIIIIIlIIII[5] = 136 ^ 140;
        lIlIIIIIlIIII[6] = 47 ^ 42;
        lIlIIIIIlIIII[7] = 124 ^ 116;
    }

    private static String lIllIllIIIIIIII(String llllllllllllllIlllIIllIIllIlllll, String llllllllllllllIlllIIllIIllIllllI) {
        String llllllllllllllIlllIIllIIllIlllll2 = new String(Base64.getDecoder().decode(llllllllllllllIlllIIllIIllIlllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllIlllIIllIIllIlllII = llllllllllllllIlllIIllIIllIllllI.toCharArray();
        int llllllllllllllIlllIIllIIllIllIll = lIlIIIIIlIIII[1];
        char[] charArray = llllllllllllllIlllIIllIIllIlllll2.toCharArray();
        int length = charArray.length;
        int i = lIlIIIIIlIIII[1];
        while (lIllIllIIIIlIlI(i, length)) {
            char llllllllllllllIlllIIllIIlllIIIII = charArray[i];
            sb.append((char) (llllllllllllllIlllIIllIIlllIIIII ^ llllllllllllllIlllIIllIIllIlllII[llllllllllllllIlllIIllIIllIllIll % llllllllllllllIlllIIllIIllIlllII.length]));
            "".length();
            llllllllllllllIlllIIllIIllIllIll++;
            i++;
            "".length();
            if ((-" ".length()) > (173 ^ 169)) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    @Override // p000.r.u.q.e.s.o.t.a.i.z
    public EnumC0013n J() {
        return this.aT.prayModeBaboons();
    }

    @Inject
    public N(SquireTOA squireTOA, TOAConfig tOAConfig) {
        super(squireTOA, tOAConfig);
    }

    private static boolean lIllIllIIIIIlIl(Object obj) {
        return obj != null;
    }

    private static String lIllIllIIIIIIIl(String llllllllllllllIlllIIllIIllIIlIlI, String llllllllllllllIlllIIllIIllIIIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIllIIllIIIlll.getBytes(StandardCharsets.UTF_8)), lIlIIIIIlIIII[7]), "DES");
            Cipher llllllllllllllIlllIIllIIllIIllII = Cipher.getInstance("DES");
            llllllllllllllIlllIIllIIllIIllII.init(lIlIIIIIlIIII[2], secretKeySpec);
            return new String(llllllllllllllIlllIIllIIllIIllII.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIllIIllIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIIllIIllIIlIll) {
            llllllllllllllIlllIIllIIllIIlIll.printStackTrace();
            return null;
        }
    }

    @Override // p000.r.u.q.e.s.o.t.a.i.z
    public List<Prayer> E() {
        String[] strArr = new String[lIlIIIIIlIIII[0]];
        strArr[lIlIIIIIlIIII[1]] = lIlIIIIIIllll[lIlIIIIIlIIII[1]];
        int size = NPCs.getAll(strArr).size();
        String[] strArr2 = new String[lIlIIIIIlIIII[0]];
        strArr2[lIlIIIIIlIIII[1]] = lIlIIIIIIllll[lIlIIIIIlIIII[0]];
        int size2 = NPCs.getAll(strArr2).size();
        Prayer prayer = null;
        if (lIllIllIIIIIlII(size2, size)) {
            prayer = Prayer.PROTECT_FROM_MAGIC;
            "".length();
            if (" ".length() == 0) {
                return null;
            }
        } else if (lIllIllIIIIIlII(size, size2)) {
            prayer = Prayer.PROTECT_FROM_MISSILES;
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        } else {
            String[] strArr3 = new String[lIlIIIIIlIIII[2]];
            strArr3[lIlIIIIIlIIII[1]] = lIlIIIIIIllll[lIlIIIIIlIIII[2]];
            strArr3[lIlIIIIIlIIII[0]] = lIlIIIIIIllll[lIlIIIIIlIIII[3]];
            NPC nearest = NPCs.getNearest(strArr3);
            if (lIllIllIIIIIlIl(nearest) && !lIllIllIIIIIllI(nearest.distanceTo(Players.getLocal()), lIlIIIIIlIIII[2])) {
                prayer = Prayer.PROTECT_FROM_MELEE;
            } else if (lIllIllIIIIIlll(size2)) {
                prayer = Prayer.PROTECT_FROM_MAGIC;
                "".length();
                if ((-"  ".length()) > 0) {
                    return null;
                }
            }
        }
        return lIllIllIIIIIlIl(prayer) ? List.of(H(), prayer) : List.of(H());
    }

    private static boolean lIllIllIIIIlIII(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIllIllIIIIlIlI(int i, int i2) {
        return i < i2;
    }

    private static boolean lIllIllIIIIIlll(int i) {
        return i > 0;
    }
}
