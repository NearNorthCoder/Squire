package r.o.u.a.r.v.s.i.s.v.q.d.r.i.p000.e;

import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Walking to the bank", priority = 2147483597, blocking = true)
/* renamed from: r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.r  reason: invalid package */
/* loaded from: 861c713a-2076-4f84-9c7c-f1dff7263a11.jar:r/o/u/a/r/v/s/i/s/v/q/d/r/i/-/e/r.class */
public class r extends q {
    private static /* synthetic */ int[] lIlIlIIlIIlII;
    private static /* synthetic */ String[] lIlIlIIlIIIll;

    private static boolean lIllllIlllIlIlI(int i, int i2) {
        return i < i2;
    }

    private static void lIllllIlllIIlIl() {
        lIlIlIIlIIlII = new int[7];
        lIlIlIIlIIlII[0] = ((((6 + 2) - (-107)) + 74) ^ (((11 + 52) - (-16)) + 73)) & (((143 ^ 156) ^ (44 ^ 26)) ^ (-" ".length()));
        lIlIlIIlIIlII[1] = " ".length();
        lIlIlIIlIIlII[2] = "  ".length();
        lIlIlIIlIIlII[3] = "   ".length();
        lIlIlIIlIIlII[4] = 70 ^ 66;
        lIlIlIIlIIlII[5] = 178 ^ 183;
        lIlIlIIlIIlII[6] = 136 ^ 128;
    }

    private static String lIllllIlllIIIll(String llllllllllllllIllIlIlllllIlllIll, String llllllllllllllIllIlIlllllIlllIlI) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllIlIlllllIlllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIlIlllllIlllIIl = new StringBuilder();
        char[] charArray = llllllllllllllIllIlIlllllIlllIlI.toCharArray();
        int llllllllllllllIllIlIlllllIllIlll = lIlIlIIlIIlII[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIlIlIIlIIlII[0];
        while (lIllllIlllIlIlI(i, length)) {
            char llllllllllllllIllIlIlllllIllllII = charArray2[i];
            llllllllllllllIllIlIlllllIlllIIl.append((char) (llllllllllllllIllIlIlllllIllllII ^ charArray[llllllllllllllIllIlIlllllIllIlll % charArray.length]));
            "".length();
            llllllllllllllIllIlIlllllIllIlll++;
            i++;
            "".length();
            if ("   ".length() > ((6 ^ 3) ^ " ".length())) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllIlIlllllIlllIIl);
    }

    private static boolean lIllllIlllIlIIl(Object obj) {
        return obj == null;
    }

    private static boolean lIllllIlllIlIII(int i, int i2) {
        return i > i2;
    }

    private static String lIllllIlllIIIIl(String llllllllllllllIllIlIlllllIIllIIl, String llllllllllllllIllIlIlllllIIlIllI) {
        try {
            SecretKeySpec llllllllllllllIllIlIlllllIIlllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIlllllIIlIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIlIIlIIlII[2], llllllllllllllIllIlIlllllIIlllII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIlllllIIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlIlllllIIllIlI) {
            llllllllllllllIllIlIlllllIIllIlI.printStackTrace();
            return null;
        }
    }

    private static void lIllllIlllIIlII() {
        lIlIlIIlIIIll = new String[lIlIlIIlIIlII[5]];
        lIlIlIIlIIIll[lIlIlIIlIIlII[0]] = lIllllIlllIIIIl("VGbZMTlGNO5b0MdPK/VxBQ==", "blAah");
        lIlIlIIlIIIll[lIlIlIIlIIlII[1]] = lIllllIlllIIIIl("5YS5ctaW7AE=", "dngOA");
        lIlIlIIlIIIll[lIlIlIIlIIlII[2]] = lIllllIlllIIIlI("cnqfi3x9zII=", "lBEkI");
        lIlIlIIlIIIll[lIlIlIIlIIlII[3]] = lIllllIlllIIIll("NyM+NxMKKg==", "cFPSa");
        lIlIlIIlIIIll[lIlIlIIlIIlII[4]] = lIllllIlllIIIll("OBIsGxNEAjYbGRkC", "igExx");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    @Override // r.o.u.a.r.v.s.i.s.v.q.d.r.i.p000.e.q
    protected boolean l() {
        if (lIllllIlllIIllI(this.w.isInInstancedRegion() ? 1 : 0)) {
            TileObject nearest = TileObjects.getNearest(tileObject -> {
                if (lIllllIlllIIllI(tileObject.getName().equals(lIlIlIIlIIIll[lIlIlIIlIIlII[3]]) ? 1 : 0)) {
                    String[] strArr = new String[lIlIlIIlIIlII[1]];
                    strArr[lIlIlIIlIIlII[0]] = lIlIlIIlIIIll[lIlIlIIlIIlII[4]];
                    if (lIllllIlllIIllI(tileObject.hasAction(strArr) ? 1 : 0)) {
                        ?? r0 = lIlIlIIlIIlII[1];
                        "".length();
                        return (((((6 + 31) - (-19)) + 75) ^ (((131 + 15) - (-13)) + 1)) & (((((9 + 182) - 137) + 137) ^ (((109 + 50) - 70) + 67)) ^ (-" ".length()))) > "   ".length() ? ((124 ^ 38) ^ (96 ^ 0)) & (((88 ^ 21) ^ (114 ^ 5)) ^ (-" ".length())) : r0;
                    }
                }
                return lIlIlIIlIIlII[0];
            });
            if (lIllllIlllIIlll(nearest)) {
                nearest.interact(lIlIlIIlIIIll[lIlIlIIlIIlII[0]]);
                return lIlIlIIlIIlII[1];
            }
        }
        if (lIllllIlllIIllI(this.t.earlyBank() ? 1 : 0) && lIllllIlllIIllI(R() ? 1 : 0)) {
            return lIlIlIIlIIlII[1];
        }
        if (lIllllIlllIIllI(P() ? 1 : 0)) {
            return lIlIlIIlIIlII[0];
        }
        Movement.walkTo(this.t.bank().F());
        "".length();
        return lIlIlIIlIIlII[1];
    }

    private static boolean lIllllIlllIIllI(int i) {
        return i != 0;
    }

    private static String lIllllIlllIIIlI(String llllllllllllllIllIlIlllllIlIIllI, String llllllllllllllIllIlIlllllIlIIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIlllllIlIIlIl.getBytes(StandardCharsets.UTF_8)), lIlIlIIlIIlII[6]), "DES");
            Cipher llllllllllllllIllIlIlllllIlIlIII = Cipher.getInstance("DES");
            llllllllllllllIllIlIlllllIlIlIII.init(lIlIlIIlIIlII[2], secretKeySpec);
            return new String(llllllllllllllIllIlIlllllIlIlIII.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIlllllIlIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlIlllllIlIIlll) {
            llllllllllllllIllIlIlllllIlIIlll.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private boolean R() {
        if (lIllllIlllIlIII(Combat.getCurrentHealth(), this.t.eatAt())) {
            return lIlIlIIlIIlII[0];
        }
        Item first = Inventory.getFirst(item -> {
            String[] strArr = new String[lIlIlIIlIIlII[1]];
            strArr[lIlIlIIlIIlII[0]] = lIlIlIIlIIIll[lIlIlIIlIIlII[2]];
            return item.hasAction(strArr);
        });
        if (lIllllIlllIlIIl(first)) {
            return lIlIlIIlIIlII[0];
        }
        first.interact(lIlIlIIlIIIll[lIlIlIIlIIlII[1]]);
        return lIlIlIIlIIlII[1];
    }

    private static boolean lIllllIlllIIlll(Object obj) {
        return obj != null;
    }

    static {
        lIllllIlllIIlIl();
        lIllllIlllIIlII();
    }
}
