package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import com.google.inject.Inject;
import gg.squire.basics.cerberus.SquireCerberus;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Looting items", priority = 10)
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.v  reason: invalid package and case insensitive filesystem */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/v.class */
public class C0073v extends Task {
    private static /* synthetic */ String[] lIlIlIIl;
    private final /* synthetic */ SquireCerberus aG;
    private final /* synthetic */ C0000a aH;
    private static /* synthetic */ int[] lIlIlIlI;

    private static String lIIllIIIII(String llIllllllIIllII, String llIllllllIIlIll) {
        String llIllllllIIllII2 = new String(Base64.getDecoder().decode(llIllllllIIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIllllllIIlIlI = new StringBuilder();
        char[] charArray = llIllllllIIlIll.toCharArray();
        int llIllllllIIlIII = lIlIlIlI[0];
        char[] charArray2 = llIllllllIIllII2.toCharArray();
        int length = charArray2.length;
        int llIllllllIIIIII = lIlIlIlI[0];
        while (lIIllIlIIl(llIllllllIIIIII, length)) {
            llIllllllIIlIlI.append((char) (charArray2[llIllllllIIIIII] ^ charArray[llIllllllIIlIII % charArray.length]));
            "".length();
            llIllllllIIlIII++;
            llIllllllIIIIII++;
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(llIllllllIIlIlI);
    }

    static {
        lIIllIIIlI();
        lIIllIIIIl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v102, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v61, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v63, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v81, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v83, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean run() {
        if (lIIllIIlII(this.aH.f() ? 1 : 0)) {
            return lIlIlIlI[0];
        }
        if (!lIIllIIlIl(this.aG.p()) || lIIllIIllI(this.aG.p().isEmpty() ? 1 : 0)) {
            return lIlIlIlI[0];
        }
        Instant now = Instant.now();
        for (C0059h c0059h : this.aG.p()) {
            if (lIIllIIlll(lIIllIIIll(Duration.between(c0059h.O(), now).toMinutes(), 2L))) {
                this.aG.p().remove(c0059h);
                "".length();
            }
            int[] iArr = new int[lIlIlIlI[1]];
            iArr[lIlIlIlI[0]] = c0059h.P();
            TileItem nearest = TileItems.getNearest(iArr);
            if (!lIIllIlIII(nearest)) {
                if (lIIllIIllI(Inventory.isFull() ? 1 : 0)) {
                    if (!lIIllIIlII(nearest.isStackable() ? 1 : 0) || lIIllIIllI(nearest.isNoted() ? 1 : 0)) {
                        int[] iArr2 = new int[lIlIlIlI[1]];
                        iArr2[lIlIlIlI[0]] = nearest.getId();
                        if (lIIllIIllI(Inventory.contains(iArr2) ? 1 : 0)) {
                        }
                    }
                    if (lIIllIIllI(Inventory.isFull() ? 1 : 0)) {
                        Item first = Inventory.getFirst(item -> {
                            String[] strArr = new String[lIlIlIlI[1]];
                            strArr[lIlIlIlI[0]] = lIlIlIIl[lIlIlIlI[2]];
                            return item.hasAction(strArr);
                        });
                        if (lIIllIlIII(first)) {
                            return lIlIlIlI[0];
                        }
                        first.interact(lIlIlIIl[lIlIlIlI[1]]);
                        sleep(lIlIlIlI[2]);
                        return lIlIlIlI[1];
                    }
                    "".length();
                    if ((((90 ^ 73) ^ (158 ^ 144)) & (((105 ^ 55) ^ (115 ^ 48)) ^ (-" ".length()))) > "   ".length()) {
                        return ((99 ^ 114) ^ (27 ^ 93)) & (((9 ^ 55) ^ (26 ^ 115)) ^ (-" ".length()));
                    }
                }
                if (lIIllIIlII(Movement.shouldWalk() ? 1 : 0)) {
                    return lIlIlIlI[1];
                }
                nearest.interact(lIlIlIIl[lIlIlIlI[0]]);
                return lIlIlIlI[1];
            }
            this.aG.p().remove(c0059h);
            "".length();
            "".length();
            if (((((123 + 77) - 169) + 99) ^ (((60 + 120) - 124) + 78)) == 0) {
                return ((206 ^ 152) ^ (177 ^ 197)) & (((24 ^ 97) ^ (110 ^ 53)) ^ (-" ".length()));
            }
        }
        return lIlIlIlI[0];
    }

    private static boolean lIIllIlIII(Object obj) {
        return obj == null;
    }

    private static void lIIllIIIIl() {
        lIlIlIIl = new String[lIlIlIlI[3]];
        lIlIlIIl[lIlIlIlI[0]] = lIIlIllllI("lOYiAkFOIRQ=", "XXkNh");
        lIlIlIIl[lIlIlIlI[1]] = lIIlIlllll("HF+/R5UOtqQ=", "UmErX");
        lIlIlIIl[lIlIlIlI[2]] = lIIllIIIII("DA8t", "InYIK");
    }

    private static boolean lIIllIIlII(int i2) {
        return i2 == 0;
    }

    private static boolean lIIllIIlll(int i2) {
        return i2 > 0;
    }

    @Inject
    private C0073v(SquireCerberus squireCerberus, C0000a c0000a) {
        this.aG = squireCerberus;
        this.aH = c0000a;
    }

    private static void lIIllIIIlI() {
        lIlIlIlI = new int[5];
        lIlIlIlI[0] = ((8 ^ 57) ^ "  ".length()) & (((206 ^ 156) ^ (54 ^ 87)) ^ (-" ".length()));
        lIlIlIlI[1] = " ".length();
        lIlIlIlI[2] = "  ".length();
        lIlIlIlI[3] = "   ".length();
        lIlIlIlI[4] = (((14 + 100) - 23) + 56) ^ (((140 + 55) - 132) + 92);
    }

    private static String lIIlIllllI(String llIllllllIllIlI, String llIllllllIllIll) {
        try {
            SecretKeySpec llIllllllIlllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIllllllIllIll.getBytes(StandardCharsets.UTF_8)), lIlIlIlI[4]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIlIlI[2], llIllllllIlllll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIllllllIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIllllllIlllIl) {
            llIllllllIlllIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIllIlIIl(int i2, int i3) {
        return i2 < i3;
    }

    private static String lIIlIlllll(String llIlllllIllIlll, String llIlllllIllIllI) {
        try {
            SecretKeySpec llIlllllIlllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIlllllIllIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIlllllIlllIIl = Cipher.getInstance("Blowfish");
            llIlllllIlllIIl.init(lIlIlIlI[2], llIlllllIlllIlI);
            return new String(llIlllllIlllIIl.doFinal(Base64.getDecoder().decode(llIlllllIllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIlllllIlllIII) {
            llIlllllIlllIII.printStackTrace();
            return null;
        }
    }

    private static int lIIllIIIll(long j, long j2) {
        return (j > j2 ? 1 : (j == j2 ? 0 : -1));
    }

    private static boolean lIIllIIlIl(Object obj) {
        return obj != null;
    }

    private static boolean lIIllIIllI(int i2) {
        return i2 != 0;
    }
}
