package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Drink Stamina", priority = 30000)
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.ac  reason: invalid package and case insensitive filesystem */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/ac.class */
public class C0003ac extends Task {
    private static /* synthetic */ int[] lIlIIlIlllII;
    private static /* synthetic */ String[] lIlIIlIllIll;
    /* synthetic */ int cD = lIlIIlIlllII[0];
    /* synthetic */ boolean cE = lIlIIlIlllII[0];
    private final /* synthetic */ SquireChambersPlugin cC;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    protected boolean cv() {
        Item first = Inventory.getFirst(item -> {
            if (llIllIIllIlIlI(item.getName().startsWith(lIlIIlIllIll[lIlIIlIlllII[5]]) ? 1 : 0)) {
                String[] strArr = new String[lIlIIlIlllII[3]];
                strArr[lIlIIlIlllII[0]] = lIlIIlIllIll[lIlIIlIlllII[6]];
                if (llIllIIllIlIlI(item.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lIlIIlIlllII[3];
                    "".length();
                    return "  ".length() == ((6 ^ 81) ^ (205 ^ 158)) ? ((((145 + 70) - 189) + 169) ^ (((79 + 67) - 112) + 112)) & (((((51 + 189) - 98) + 111) ^ (((145 + 49) - 109) + 87)) ^ (-" ".length())) : r0;
                }
            }
            return lIlIIlIlllII[0];
        });
        if (llIllIIllIllII(first)) {
            return lIlIIlIlllII[0];
        }
        first.interact(lIlIIlIllIll[lIlIIlIlllII[0]]);
        sleep(lIlIIlIlllII[4]);
        return lIlIIlIlllII[3];
    }

    private static boolean llIllIIllIllII(Object obj) {
        return obj == null;
    }

    private static void llIllIIllIlIIl() {
        lIlIIlIlllII = new int[9];
        lIlIIlIlllII[0] = ((((55 + 146) - 63) + 47) ^ (((60 + 77) - 106) + 102)) & (((87 ^ 120) ^ (35 ^ 48)) ^ (-" ".length()));
        lIlIIlIlllII[1] = (((137 + 49) - 123) + 80) ^ (((94 + 11) - 16) + 56);
        lIlIIlIlllII[2] = (((108 + 61) - 105) + 65) ^ (((67 + 106) - 72) + 38);
        lIlIIlIlllII[3] = " ".length();
        lIlIIlIlllII[4] = "  ".length();
        lIlIIlIlllII[5] = "   ".length();
        lIlIIlIlllII[6] = 192 ^ 196;
        lIlIIlIlllII[7] = 57 ^ 60;
        lIlIIlIlllII[8] = (((63 + 33) - 47) + 78) ^ (30 ^ 105);
    }

    static {
        llIllIIllIlIIl();
        llIllIIllIlIII();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    public boolean run() {
        if (llIllIIllIlIlI(cw() ? 1 : 0)) {
            return lIlIIlIlllII[0];
        }
        if ((!llIllIIllIlIll(Movement.getRunEnergy(), lIlIIlIlllII[1]) || llIllIIllIlIlI(Movement.isStaminaBoosted() ? 1 : 0)) && !llIllIIllIlIll(Movement.getRunEnergy(), lIlIIlIlllII[2])) {
            return lIlIIlIlllII[0];
        }
        cv();
        "".length();
        return lIlIIlIlllII[3];
    }

    private static boolean llIllIIllIlIlI(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private boolean cw() {
        C0039n L = this.cC.L();
        if (!llIllIIllIllIl(L) || llIllIIllIlllI(L.a((Locatable) Players.getLocal()) ? 1 : 0)) {
            return lIlIIlIlllII[0];
        }
        if (llIllIIllIllIl(TileObjects.getNearest(tileObject -> {
            if (llIllIIllIlIlI(tileObject.getName().equals(lIlIIlIllIll[lIlIIlIlllII[3]]) ? 1 : 0)) {
                String[] strArr = new String[lIlIIlIlllII[3]];
                strArr[lIlIIlIlllII[0]] = lIlIIlIllIll[lIlIIlIlllII[4]];
                if (llIllIIllIlIlI(tileObject.hasAction(strArr) ? 1 : 0) && llIllIIllIlIlI(L.a((Locatable) tileObject) ? 1 : 0)) {
                    ?? r0 = lIlIIlIlllII[3];
                    "".length();
                    return (-" ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
            return lIlIIlIlllII[0];
        }))) {
            ?? r0 = lIlIIlIlllII[3];
            "".length();
            return "   ".length() == 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIlIIlIlllII[0];
    }

    private static String llIllIIllIIlIl(String lllllllllllllllIllIllIIllIIllIll, String lllllllllllllllIllIllIIllIIllIlI) {
        try {
            SecretKeySpec lllllllllllllllIllIllIIllIIllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIllIIllIIllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIllIIllIIlllIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIllIIllIIlllIl.init(lIlIIlIlllII[4], lllllllllllllllIllIllIIllIIllllI);
            return new String(lllllllllllllllIllIllIIllIIlllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIllIIllIIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIllIIllIIlllII) {
            lllllllllllllllIllIllIIllIIlllII.printStackTrace();
            return null;
        }
    }

    private static void llIllIIllIlIII() {
        lIlIIlIllIll = new String[lIlIIlIlllII[7]];
        lIlIIlIllIll[lIlIIlIlllII[0]] = llIllIIllIIlIl("nJw0Qibm3cs=", "IIDeX");
        lIlIIlIllIll[lIlIIlIlllII[3]] = llIllIIllIIllI("y8XbhSQzw/B7LmXau6mlKw==", "Ekose");
        lIlIIlIllIll[lIlIIlIlllII[4]] = llIllIIllIIllI("lU/jAWKFHbc=", "RkPgX");
        lIlIIlIllIll[lIlIIlIlllII[5]] = llIllIIllIIlIl("gZPRjSo719Voj/WLxbI5ag==", "QgHeY");
        lIlIIlIllIll[lIlIIlIlllII[6]] = llIllIIllIIlll("FQY9Iy4=", "QtTME");
    }

    private static String llIllIIllIIlll(String lllllllllllllllIllIllIIllIllIIII, String lllllllllllllllIllIllIIllIlIllll) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIllIllIIllIllIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIllIllIIllIlIllIl = lllllllllllllllIllIllIIllIlIllll.toCharArray();
        int lllllllllllllllIllIllIIllIlIllII = lIlIIlIlllII[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIlIIlIlllII[0];
        while (llIllIIllIlIll(i, length)) {
            sb.append((char) (charArray[i] ^ lllllllllllllllIllIllIIllIlIllIl[lllllllllllllllIllIllIIllIlIllII % lllllllllllllllIllIllIIllIlIllIl.length]));
            "".length();
            lllllllllllllllIllIllIIllIlIllII++;
            i++;
            "".length();
            if ("   ".length() == " ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean llIllIIllIlIll(int i, int i2) {
        return i < i2;
    }

    private static boolean llIllIIllIllIl(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    @Inject
    public C0003ac(SquireChambersPlugin squireChambersPlugin) {
        this.cC = squireChambersPlugin;
    }

    private static String llIllIIllIIllI(String lllllllllllllllIllIllIIllIIIlllI, String lllllllllllllllIllIllIIllIIIllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIllIIllIIIllIl.getBytes(StandardCharsets.UTF_8)), lIlIIlIlllII[8]), "DES");
            Cipher lllllllllllllllIllIllIIllIIlIIII = Cipher.getInstance("DES");
            lllllllllllllllIllIllIIllIIlIIII.init(lIlIIlIlllII[4], secretKeySpec);
            return new String(lllllllllllllllIllIllIIllIIlIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIllIIllIIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIllIIllIIIllll) {
            lllllllllllllllIllIllIIllIIIllll.printStackTrace();
            return null;
        }
    }

    private static boolean llIllIIllIlllI(int i) {
        return i == 0;
    }
}
