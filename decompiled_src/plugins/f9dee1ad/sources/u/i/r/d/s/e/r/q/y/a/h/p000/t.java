package u.i.r.d.s.e.r.q.y.a.h.p000;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.hydra.SquireAlchemicalHydraConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Using blowpipe spec", priority = 100)
/* renamed from: u.i.r.d.s.e.r.q.y.a.h.-.t  reason: invalid package */
/* loaded from: f9dee1ad-dcbf-4af9-9fb8-47dc91e2d43e.jar:u/i/r/d/s/e/r/q/y/a/h/-/t.class */
public class t extends Task {
    private static /* synthetic */ String[] llllIlIIlIIl;
    private static /* synthetic */ int[] llllIlIIlIlI;
    private final /* synthetic */ SquireAlchemicalHydraConfig aB;
    private /* synthetic */ String aC = llllIlIIlIIl[llllIlIIlIlI[0]];
    private final /* synthetic */ C0000a aA;

    private static String lIIlIIIIlIlIIII(String lllllllllllllllIIlIlIIlIlIIlIIll, String lllllllllllllllIIlIlIIlIlIIlIIlI) {
        String lllllllllllllllIIlIlIIlIlIIlIIll2 = new String(Base64.getDecoder().decode(lllllllllllllllIIlIlIIlIlIIlIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIlIIlIlIIlIIIl = new StringBuilder();
        char[] lllllllllllllllIIlIlIIlIlIIlIIII = lllllllllllllllIIlIlIIlIlIIlIIlI.toCharArray();
        int lllllllllllllllIIlIlIIlIlIIIllll = llllIlIIlIlI[0];
        char[] charArray = lllllllllllllllIIlIlIIlIlIIlIIll2.toCharArray();
        int length = charArray.length;
        int i = llllIlIIlIlI[0];
        while (lIIlIIIIlIllIIl(i, length)) {
            lllllllllllllllIIlIlIIlIlIIlIIIl.append((char) (charArray[i] ^ lllllllllllllllIIlIlIIlIlIIlIIII[lllllllllllllllIIlIlIIlIlIIIllll % lllllllllllllllIIlIlIIlIlIIlIIII.length]));
            "".length();
            lllllllllllllllIIlIlIIlIlIIIllll++;
            i++;
            "".length();
            if ((-((((74 + 34) - 5) + 44) ^ (((23 + 130) - 115) + 113))) >= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIlIlIIlIlIIlIIIl);
    }

    private static void lIIlIIIIlIlIIll() {
        llllIlIIlIlI = new int[9];
        llllIlIIlIlI[0] = (110 ^ 58) & ((29 ^ 73) ^ (-1));
        llllIlIIlIlI[1] = 78 ^ 124;
        llllIlIIlIlI[2] = 148 ^ 158;
        llllIlIIlIlI[3] = " ".length();
        llllIlIIlIlI[4] = "  ".length();
        llllIlIIlIlI[5] = "   ".length();
        llllIlIIlIlI[6] = 172 ^ 168;
        llllIlIIlIlI[7] = (67 ^ 55) ^ (107 ^ 26);
        llllIlIIlIlI[8] = (((118 + 2) - (-10)) + 11) ^ (((2 + 68) - 32) + 95);
    }

    private static boolean lIIlIIIIlIlIlIl(int i) {
        return i != 0;
    }

    private static boolean lIIlIIIIlIlIlII(Object obj) {
        return obj == null;
    }

    private static boolean lIIlIIIIlIllIIl(int i, int i2) {
        return i < i2;
    }

    private static String lIIlIIIIlIIllll(String lllllllllllllllIIlIlIIlIIllllllI, String lllllllllllllllIIlIlIIlIIllllIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIIlIIllllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llllIlIIlIlI[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIIlIIllllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIlIIlIIlllllll) {
            lllllllllllllllIIlIlIIlIIlllllll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIIIlIlIlll(int i, int i2) {
        return i <= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v55, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v57, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v59, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v61, types: [boolean] */
    public boolean run() {
        if (!lIIlIIIIlIlIlII(this.aA.k()) && !lIIlIIIIlIlIlIl(this.aA.k().Q() ? 1 : 0)) {
            Item fromSlot = Equipment.fromSlot(EquipmentInventorySlot.WEAPON);
            if (lIIlIIIIlIlIlII(fromSlot)) {
                return llllIlIIlIlI[0];
            }
            if (!lIIlIIIIlIlIllI(Combat.getSpecEnergy(), llllIlIIlIlI[1]) || lIIlIIIIlIlIlll(Combat.getMissingHealth(), llllIlIIlIlI[2])) {
                String[] strArr = new String[llllIlIIlIlI[3]];
                strArr[llllIlIIlIlI[0]] = this.aC;
                if (lIIlIIIIlIlIlIl(Inventory.contains(strArr) ? 1 : 0)) {
                    String[] strArr2 = new String[llllIlIIlIlI[3]];
                    strArr2[llllIlIIlIlI[0]] = this.aC;
                    Inventory.getFirst(strArr2).interact(llllIlIIlIIl[llllIlIIlIlI[3]]);
                }
                return llllIlIIlIlI[0];
            } else if (!lIIlIIIIlIllIII(fromSlot.getName().contains(llllIlIIlIIl[llllIlIIlIlI[4]]) ? 1 : 0)) {
                if (lIIlIIIIlIlIlIl(Combat.isSpecEnabled() ? 1 : 0)) {
                    return llllIlIIlIlI[0];
                }
                Combat.toggleSpec();
                return llllIlIIlIlI[3];
            } else {
                String[] strArr3 = new String[llllIlIIlIlI[3]];
                strArr3[llllIlIIlIlI[0]] = llllIlIIlIIl[llllIlIIlIlI[5]];
                Item first = Inventory.getFirst(strArr3);
                this.aC = fromSlot.getName();
                if (lIIlIIIIlIlIlII(first)) {
                    return llllIlIIlIlI[0];
                }
                if (lIIlIIIIlIlIllI(Combat.getSpecEnergy(), llllIlIIlIlI[1]) && lIIlIIIIlIlIlIl(this.aB.blowpipeSpec() ? 1 : 0)) {
                    first.interact(llllIlIIlIIl[llllIlIIlIlI[6]]);
                }
                return llllIlIIlIlI[3];
            }
        }
        return llllIlIIlIlI[0];
    }

    static {
        lIIlIIIIlIlIIll();
        lIIlIIIIlIlIIlI();
    }

    @Inject
    public t(C0000a c0000a, SquireAlchemicalHydraConfig squireAlchemicalHydraConfig) {
        this.aA = c0000a;
        this.aB = squireAlchemicalHydraConfig;
    }

    private static boolean lIIlIIIIlIllIII(int i) {
        return i == 0;
    }

    private static String lIIlIIIIlIlIIIl(String lllllllllllllllIIlIlIIlIIlllIIIl, String lllllllllllllllIIlIlIIlIIlllIIII) {
        try {
            SecretKeySpec lllllllllllllllIIlIlIIlIIlllIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIIlIIlllIIII.getBytes(StandardCharsets.UTF_8)), llllIlIIlIlI[8]), "DES");
            Cipher lllllllllllllllIIlIlIIlIIlllIIll = Cipher.getInstance("DES");
            lllllllllllllllIIlIlIIlIIlllIIll.init(llllIlIIlIlI[4], lllllllllllllllIIlIlIIlIIlllIlII);
            return new String(lllllllllllllllIIlIlIIlIIlllIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIIlIIlllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIlIIlIIlllIIlI) {
            lllllllllllllllIIlIlIIlIIlllIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIIIlIlIllI(int i, int i2) {
        return i >= i2;
    }

    private static void lIIlIIIIlIlIIlI() {
        llllIlIIlIIl = new String[llllIlIIlIlI[7]];
        llllIlIIlIIl[llllIlIIlIlI[0]] = lIIlIIIIlIIllll("WK1NT/aWpes=", "kVxDm");
        llllIlIIlIIl[llllIlIIlIlI[3]] = lIIlIIIIlIlIIII("BA8LGw8=", "Sfnwk");
        llllIlIIlIIl[llllIlIIlIlI[4]] = lIIlIIIIlIlIIIl("sRZNyjIoPSmd5L/pZI6q6Q==", "tPXqf");
        llllIlIIlIIl[llllIlIIlIlI[5]] = lIIlIIIIlIlIIII("EAobAQRkBw8HEDQMEw0=", "Dechg");
        llllIlIIlIIl[llllIlIIlIlI[6]] = lIIlIIIIlIlIIII("OiwrASs=", "mENmO");
    }
}
