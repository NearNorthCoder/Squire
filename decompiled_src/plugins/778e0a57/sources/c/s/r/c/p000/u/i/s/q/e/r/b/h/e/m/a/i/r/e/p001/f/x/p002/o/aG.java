package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileObjects;
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.aG  reason: invalid package */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/aG.class */
public class aG {
    private static /* synthetic */ String[] lIlIlIIllIII;
    public static final /* synthetic */ int dS;
    public static final /* synthetic */ int dV;
    private static /* synthetic */ int[] lIlIlIIllIIl;
    public static final /* synthetic */ int dT;
    public static final /* synthetic */ int dU;
    public static final /* synthetic */ int dW;

    private static void llIlllIlIIllII() {
        lIlIlIIllIIl = new int[7];
        lIlIlIIllIIl[0] = (255 ^ 169) & ((55 ^ 97) ^ (-1));
        lIlIlIIllIIl[1] = " ".length();
        lIlIlIIllIIl[2] = "  ".length();
        lIlIlIIllIIl[3] = 43 ^ 47;
        lIlIlIIllIIl[4] = "   ".length();
        lIlIlIIllIIl[5] = (-((-25635) & 28067)) & (-545) & 32751;
        lIlIlIIllIIl[6] = 46 ^ 38;
    }

    private static void llIlllIlIIlIll() {
        lIlIlIIllIII = new String[lIlIlIIllIIl[4]];
        lIlIlIIllIII[lIlIlIIllIIl[0]] = llIlllIlIIlIIl("KhU2FBEDHnkAChQKLQIU", "myYcx");
        lIlIlIIllIII[lIlIlIIllIIl[1]] = llIlllIlIIlIlI("xwLNinIpufM=", "KwzGc");
        lIlIlIIllIII[lIlIlIIllIIl[2]] = llIlllIlIIlIlI("PnEFsmkufrE=", "yQgky");
    }

    private static boolean llIlllIlIIllIl(Object obj) {
        return obj == null;
    }

    private static String llIlllIlIIlIlI(String lllllllllllllllIllIlIIIlIllIlllI, String lllllllllllllllIllIlIIIlIllIllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIlIIIlIllIllIl.getBytes(StandardCharsets.UTF_8)), lIlIlIIllIIl[6]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIlIIllIIl[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIlIIIlIllIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIlIIIlIllIllll) {
            lllllllllllllllIllIlIIIlIllIllll.printStackTrace();
            return null;
        }
    }

    public static int dk() {
        int i;
        NPC nearest = NPCs.getNearest(npc -> {
            return npc.getName().contains(lIlIlIIllIII[lIlIlIIllIIl[2]]);
        });
        if (llIlllIlIIllIl(nearest)) {
            return lIlIlIIllIIl[0];
        }
        NPC nearest2 = NPCs.getNearest(npc2 -> {
            if (llIlllIlIIllll(npc2.getName().contains(lIlIlIIllIII[lIlIlIIllIIl[0]]) ? 1 : 0)) {
                String[] strArr = new String[lIlIlIIllIIl[1]];
                strArr[lIlIlIIllIIl[0]] = lIlIlIIllIII[lIlIlIIllIIl[1]];
                if (llIlllIlIIllll(npc2.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lIlIlIIllIIl[1];
                    "".length();
                    return (((43 ^ 15) ^ (184 ^ 171)) & (((108 ^ 118) ^ (146 ^ 191)) ^ (-" ".length()))) > 0 ? ((((146 + 26) - 80) + 115) ^ (((43 + 61) - 17) + 72)) & (((((37 + 20) - (-75)) + 110) ^ (((111 + 5) - 5) + 51)) ^ (-" ".length())) : r0;
                }
            }
            return lIlIlIIllIIl[0];
        });
        if (llIlllIlIIlllI(nearest2)) {
            i = lIlIlIIllIIl[1];
            "".length();
            if ("   ".length() != "   ".length()) {
                return ((5 ^ 113) ^ (57 ^ 120)) & (((33 ^ 17) ^ (111 ^ 106)) ^ (-" ".length()));
            }
        } else {
            i = lIlIlIIllIIl[0];
        }
        int i2 = i;
        if (llIlllIlIIlllI(nearest2)) {
            System.out.print("Crystal scale: " + nearest2.getHealthScale() + " | ratio: " + nearest2.getHealthRatio());
        }
        if (llIlllIlIIllll(i2) && llIlllIlIIllll(nearest.isMoving() ? 1 : 0)) {
            return lIlIlIIllIIl[2];
        }
        if (llIlllIlIlIIII(i2) && llIlllIlIIllll(nearest.isMoving() ? 1 : 0)) {
            return lIlIlIIllIIl[3];
        }
        if (llIlllIlIIllll(i2) && llIlllIlIlIIII(nearest.isMoving() ? 1 : 0)) {
            return lIlIlIIllIIl[4];
        }
        if (llIlllIlIlIIII(i2) && llIlllIlIlIIII(nearest.isMoving() ? 1 : 0)) {
            WorldPoint center = nearest.getWorldArea().getCenter();
            int[] iArr = new int[lIlIlIIllIIl[1]];
            iArr[lIlIlIIllIIl[0]] = lIlIlIIllIIl[5];
            TileObject nearest3 = TileObjects.getNearest(center, iArr);
            return (llIlllIlIIlllI(nearest3) && llIlllIlIlIIIl(nearest.getWorldArea().distanceTo(nearest3), lIlIlIIllIIl[4])) ? lIlIlIIllIIl[3] : lIlIlIIllIIl[1];
        }
        return lIlIlIIllIIl[0];
    }

    private static String llIlllIlIIlIIl(String lllllllllllllllIllIlIIIllIIIIIll, String lllllllllllllllIllIlIIIllIIIIIlI) {
        String lllllllllllllllIllIlIIIllIIIIIll2 = new String(Base64.getDecoder().decode(lllllllllllllllIllIlIIIllIIIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIlIIIllIIIIIIl = new StringBuilder();
        char[] charArray = lllllllllllllllIllIlIIIllIIIIIlI.toCharArray();
        int lllllllllllllllIllIlIIIlIlllllll = lIlIlIIllIIl[0];
        char[] charArray2 = lllllllllllllllIllIlIIIllIIIIIll2.toCharArray();
        int length = charArray2.length;
        int i = lIlIlIIllIIl[0];
        while (llIlllIlIlIIlI(i, length)) {
            lllllllllllllllIllIlIIIllIIIIIIl.append((char) (charArray2[i] ^ charArray[lllllllllllllllIllIlIIIlIlllllll % charArray.length]));
            "".length();
            lllllllllllllllIllIlIIIlIlllllll++;
            i++;
            "".length();
            if ("  ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIllIlIIIllIIIIIIl);
    }

    private static boolean llIlllIlIlIIII(int i) {
        return i == 0;
    }

    static {
        llIlllIlIIllII();
        llIlllIlIIlIll();
        dV = lIlIlIIllIIl[1];
        dW = lIlIlIIllIIl[0];
        dS = lIlIlIIllIIl[4];
        dU = lIlIlIIllIIl[2];
        dT = lIlIlIIllIIl[3];
    }

    private static boolean llIlllIlIlIIIl(int i, int i2) {
        return i <= i2;
    }

    private static boolean llIlllIlIIlllI(Object obj) {
        return obj != null;
    }

    private static boolean llIlllIlIIllll(int i) {
        return i != 0;
    }

    private static boolean llIlllIlIlIIlI(int i, int i2) {
        return i < i2;
    }
}
