package k.p000.u.u.l.i.s.r.c.d.p001.q.u.e.u.e.e.s.s.l;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.duke.SquireDukeSucellus;
import gg.squire.duke.SquireDukeSucellusConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.client.Static;
@TaskDesc(name = "Post Kill Handler", blocking = true, priority = 4999)
/* renamed from: k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.z  reason: invalid package */
/* loaded from: 2266a50d-0893-46c4-a132-50718fc51d1a.jar:k/-/u/u/l/i/s/r/c/d/-/q/u/e/u/e/e/s/s/l/z.class */
public class z extends Task {
    private final /* synthetic */ SquireDukeSucellusConfig aY;
    private static /* synthetic */ int[] lIllIlllIlll;
    private /* synthetic */ C0000a u;
    private final /* synthetic */ SquireDukeSucellus aX;
    private static /* synthetic */ String[] lIllIlllIllI;

    @Inject
    public z(SquireDukeSucellus squireDukeSucellus, SquireDukeSucellusConfig squireDukeSucellusConfig) {
        this.aY = squireDukeSucellusConfig;
        this.aX = squireDukeSucellus;
        this.u = squireDukeSucellus.s();
    }

    private static void lllIlIIllllIIl() {
        lIllIlllIlll = new int[9];
        lIllIlllIlll[0] = (169 ^ 166) & ((12 ^ 3) ^ (-1));
        lIllIlllIlll[1] = " ".length();
        lIllIlllIlll[2] = "  ".length();
        lIllIlllIlll[3] = "   ".length();
        lIllIlllIlll[4] = (234 ^ 167) ^ (220 ^ 149);
        lIllIlllIlll[5] = (((51 + 8) - (-52)) + 21) ^ (((0 + 73) - (-30)) + 26);
        lIllIlllIlll[6] = (20 ^ 74) ^ (46 ^ 118);
        lIllIlllIlll[7] = (108 ^ 12) ^ (76 ^ 43);
        lIllIlllIlll[8] = 127 ^ 119;
    }

    static {
        lllIlIIllllIIl();
        lllIlIIllllIII();
    }

    private static String lllIlIIlllIlll(String lllllllllllllllIlIlllIIlllIIIIlI, String lllllllllllllllIlIlllIIlllIIIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlllIIlllIIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIlllIIlllIIIlII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIlllIIlllIIIlII.init(lIllIlllIlll[2], secretKeySpec);
            return new String(lllllllllllllllIlIlllIIlllIIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlllIIlllIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlllIIlllIIIIll) {
            lllllllllllllllIlIlllIIlllIIIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lllIlIIllllIlI(int i) {
        return i == 0;
    }

    private static String lllIlIIlllIllI(String lllllllllllllllIlIlllIIllllIIlII, String lllllllllllllllIlIlllIIllllIIIll) {
        String lllllllllllllllIlIlllIIllllIIlII2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIlllIIllllIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIlIlllIIllllIIIll.toCharArray();
        int lllllllllllllllIlIlllIIllllIIIII = lIllIlllIlll[0];
        char[] charArray2 = lllllllllllllllIlIlllIIllllIIlII2.toCharArray();
        int length = charArray2.length;
        int i = lIllIlllIlll[0];
        while (lllIlIIlllllII(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[lllllllllllllllIlIlllIIllllIIIII % charArray.length]));
            "".length();
            lllllllllllllllIlIlllIIllllIIIII++;
            i++;
            "".length();
            if ("   ".length() == " ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v55, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v57, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v28, types: [boolean] */
    public boolean run() {
        if (!lllIlIIllllIlI(Static.getClient().isInInstancedRegion() ? 1 : 0) && !lllIlIIllllIlI(this.aX.l() ? 1 : 0)) {
            TileObject nearest = TileObjects.getNearest(tileObject -> {
                if (lllIlIIlllllIl(tileObject.getName().equals(lIllIlllIllI[lIllIlllIlll[6]]) ? 1 : 0)) {
                    String[] strArr = new String[lIllIlllIlll[1]];
                    strArr[lIllIlllIlll[0]] = lIllIlllIllI[lIllIlllIlll[7]];
                    if (lllIlIIlllllIl(tileObject.hasAction(strArr) ? 1 : 0)) {
                        ?? r0 = lIllIlllIlll[1];
                        "".length();
                        return "  ".length() <= (((((69 + 25) - 79) + 134) ^ (((58 + 78) - 66) + 61)) & (((((131 + 102) - 145) + 100) ^ (((3 + 42) - (-5)) + 120)) ^ (-" ".length()))) ? ((207 ^ 171) ^ (100 ^ 21)) & (((33 ^ 106) ^ (155 ^ 197)) ^ (-" ".length())) : r0;
                    }
                }
                return lIllIlllIlll[0];
            });
            if (lllIlIIllllIll(nearest)) {
                this.aX.d((boolean) lIllIlllIlll[0]);
                return lIllIlllIlll[0];
            } else if (lllIlIIlllllII(Inventory.getAll(item -> {
                if (!lllIlIIllllIlI(item.getName().contains(lIllIlllIllI[lIllIlllIlll[4]]) ? 1 : 0) || lllIlIIlllllIl(item.getName().contains(lIllIlllIllI[lIllIlllIlll[5]]) ? 1 : 0)) {
                    ?? r0 = lIllIlllIlll[1];
                    "".length();
                    return 0 != 0 ? ((251 ^ 172) ^ (26 ^ 107)) & (((161 ^ 173) ^ (161 ^ 139)) ^ (-" ".length())) : r0;
                }
                return lIllIlllIlll[0];
            }).stream().mapToInt(item2 -> {
                return Integer.parseInt(item2.getName().split(lIllIlllIllI[lIllIlllIlll[1]])[lIllIlllIlll[1]].replace(lIllIlllIllI[lIllIlllIlll[2]], lIllIlllIllI[lIllIlllIlll[3]]));
            }).sum(), this.aY.prayDoses())) {
                this.aX.f((boolean) lIllIlllIlll[1]);
                this.aX.g(lIllIlllIlll[1]);
                this.aX.d((boolean) lIllIlllIlll[0]);
                return lIllIlllIlll[0];
            } else if (lllIlIIlllllII(Inventory.getCount(item3 -> {
                String[] strArr = new String[lIllIlllIlll[1]];
                strArr[lIllIlllIlll[0]] = lIllIlllIllI[lIllIlllIlll[0]];
                return item3.hasAction(strArr);
            }), this.aY.food())) {
                this.aX.f((boolean) lIllIlllIlll[1]);
                this.aX.g(lIllIlllIlll[1]);
                this.aX.d((boolean) lIllIlllIlll[0]);
                return lIllIlllIlll[0];
            } else if (lllIlIIlllllIl(Players.getLocal().getWorldLocation().equals(C0007h.e(nearest)) ? 1 : 0)) {
                this.aX.d((boolean) lIllIlllIlll[0]);
                return lIllIlllIlll[0];
            } else {
                Movement.setDestination(C0007h.e(nearest));
                return lIllIlllIlll[1];
            }
        }
        return lIllIlllIlll[0];
    }

    private static boolean lllIlIIllllIll(Object obj) {
        return obj == null;
    }

    private static void lllIlIIllllIII() {
        lIllIlllIllI = new String[lIllIlllIlll[8]];
        lIllIlllIllI[lIllIlllIlll[0]] = lllIlIIlllIlIl("j5asxJM9qtQ=", "YYwaZ");
        lIllIlllIllI[lIllIlllIlll[1]] = lllIlIIlllIlIl("u61mH7L79h0=", "ZYGvO");
        lIllIlllIllI[lIllIlllIlll[2]] = lllIlIIlllIllI("RQ==", "ldDQB");
        lIllIlllIllI[lIllIlllIlll[3]] = lllIlIIlllIllI("", "IWpyI");
        lIllIlllIllI[lIllIlllIlll[4]] = lllIlIIlllIlIl("U+lQHKA4QA8=", "ZkTNZ");
        lIllIlllIllI[lIllIlllIlll[5]] = lllIlIIlllIlll("+0D2phFDF0w=", "xipVR");
        lIllIlllIllI[lIllIlllIlll[6]] = lllIlIIlllIlIl("r9X7UEf65o8=", "iRhvp");
        lIllIlllIllI[lIllIlllIlll[7]] = lllIlIIlllIlll("A0DYNo/LwsM=", "lZPCQ");
    }

    private static String lllIlIIlllIlIl(String lllllllllllllllIlIlllIIlllIIllll, String lllllllllllllllIlIlllIIlllIIlllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlllIIlllIIlllI.getBytes(StandardCharsets.UTF_8)), lIllIlllIlll[8]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIllIlllIlll[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlllIIlllIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlllIIlllIlIIII) {
            lllllllllllllllIlIlllIIlllIlIIII.printStackTrace();
            return null;
        }
    }

    private static boolean lllIlIIlllllIl(int i) {
        return i != 0;
    }

    private static boolean lllIlIIlllllII(int i, int i2) {
        return i < i2;
    }
}
