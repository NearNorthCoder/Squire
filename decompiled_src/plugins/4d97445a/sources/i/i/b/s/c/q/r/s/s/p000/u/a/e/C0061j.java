package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import com.google.inject.Inject;
import gg.squire.basics.cerberus.SquireCerberusConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;
@TaskDesc(name = "Drinking prayer potion", priority = 150)
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.j  reason: invalid package and case insensitive filesystem */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/j.class */
public class C0061j extends Task {
    private static /* synthetic */ String[] lIlIIIllI;
    private static /* synthetic */ int[] lIlIIIlll;
    private final /* synthetic */ C0000a al;
    private final /* synthetic */ SquireCerberusConfig ak;

    private static void lIIIlllllIl() {
        lIlIIIlll = new int[5];
        lIlIIIlll[0] = (137 ^ 167) & ((78 ^ 96) ^ (-1));
        lIlIIIlll[1] = " ".length();
        lIlIIIlll[2] = "  ".length();
        lIlIIIlll[3] = "   ".length();
        lIlIIIlll[4] = 15 ^ 7;
    }

    private static boolean lIIlIIIIIlI(int i2) {
        return i2 == 0;
    }

    static {
        lIIIlllllIl();
        lIIIlllllII();
    }

    private static boolean lIIIlllllll(Object obj) {
        return obj == null;
    }

    private static String lIIIllllIlI(String llIIIIlIlIllIII, String llIIIIlIlIlIlll) {
        try {
            SecretKeySpec llIIIIlIlIllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIIIlIlIlIlll.getBytes(StandardCharsets.UTF_8)), lIlIIIlll[4]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIIIlll[2], llIIIIlIlIllIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIIIIlIlIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIIIIlIlIllIIl) {
            llIIIIlIlIllIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIllllllI(Object obj) {
        return obj != null;
    }

    private static boolean lIIlIIIIIll(int i2, int i3) {
        return i2 < i3;
    }

    private static boolean lIIlIIIIIII(int i2, int i3) {
        return i2 >= i3;
    }

    private static boolean lIIlIIIIIIl(int i2) {
        return i2 != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public boolean run() {
        if (!lIIIllllllI(this.al.k()) || lIIIlllllll(this.al.k().y())) {
            return lIlIIIlll[0];
        }
        if ((!lIIlIIIIIII(Prayers.getPoints(), this.ak.drinkAtPrayer()) || !lIIlIIIIIIl(this.al.h().isEmpty() ? 1 : 0)) && !lIIlIIIIIII(Prayers.getPoints(), this.ak.drinkAtPrayerGhost())) {
            Item first = Inventory.getFirst(item -> {
                if (!lIIlIIIIIlI(item.getName().startsWith(lIlIIIllI[lIlIIIlll[1]]) ? 1 : 0) || lIIlIIIIIIl(item.getName().startsWith(lIlIIIllI[lIlIIIlll[2]]) ? 1 : 0)) {
                    ?? r0 = lIlIIIlll[1];
                    "".length();
                    return (49 ^ 53) < (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIlIIIlll[0];
            });
            if (lIIIlllllll(first)) {
                return lIlIIIlll[0];
            }
            first.interact(lIlIIIllI[lIlIIIlll[0]]);
            return lIlIIIlll[1];
        }
        return lIlIIIlll[0];
    }

    private static void lIIIlllllII() {
        lIlIIIllI = new String[lIlIIIlll[3]];
        lIlIIIllI[lIlIIIlll[0]] = lIIIllllIlI("L0a77JFNYlM=", "TpOkh");
        lIlIIIllI[lIlIIIlll[1]] = lIIIllllIll("KSsgNjML", "yYAOV");
        lIlIIIllI[lIlIIIlll[2]] = lIIIllllIlI("qv6lYhoPFVR3Fhsls5XY8A==", "CqosH");
    }

    private static String lIIIllllIll(String llIIIIlIlIIlIII, String llIIIIlIlIIIIlI) {
        String llIIIIlIlIIlIII2 = new String(Base64.getDecoder().decode(llIIIIlIlIIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llIIIIlIlIIIIlI.toCharArray();
        int llIIIIlIlIIIlII = lIlIIIlll[0];
        char[] charArray2 = llIIIIlIlIIlIII2.toCharArray();
        int length = charArray2.length;
        int i2 = lIlIIIlll[0];
        while (lIIlIIIIIll(i2, length)) {
            char llIIIIlIlIIlIIl = charArray2[i2];
            sb.append((char) (llIIIIlIlIIlIIl ^ charArray[llIIIIlIlIIIlII % charArray.length]));
            "".length();
            llIIIIlIlIIIlII++;
            i2++;
            "".length();
            if (" ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    @Inject
    private C0061j(SquireCerberusConfig squireCerberusConfig, C0000a c0000a) {
        this.ak = squireCerberusConfig;
        this.al = c0000a;
    }
}
