package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import com.google.inject.Inject;
import gg.squire.basics.sarachnis.SarachnisConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldArea;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;
@TaskDesc(name = "Drinking prayer potion", priority = 5)
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.bI  reason: invalid package */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/bI.class */
public class bI extends Task {
    private static /* synthetic */ String[] llIIlIII;
    private static /* synthetic */ int[] llIIlIlI;
    private final /* synthetic */ SarachnisConfig gB;

    private static String lIlIlllllI(String llIllIlIIllIllI, String llIllIlIIllIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIllIlIIllIlIl.getBytes(StandardCharsets.UTF_8)), llIIlIlI[9]), "DES");
            Cipher llIllIlIIlllIII = Cipher.getInstance("DES");
            llIllIlIIlllIII.init(llIIlIlI[8], secretKeySpec);
            return new String(llIllIlIIlllIII.doFinal(Base64.getDecoder().decode(llIllIlIIllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIllIlIIllIlll) {
            llIllIlIIllIlll.printStackTrace();
            return null;
        }
    }

    private static void lIllIIIIIl() {
        llIIlIII = new String[llIIlIlI[7]];
        llIIlIII[llIIlIlI[1]] = lIlIllllIl("IxsZAhs=", "giplp");
        llIIlIII[llIIlIlI[0]] = lIlIlllllI("3YznjP+z30o=", "thpMq");
        llIIlIII[llIIlIlI[8]] = lIlIllllll("saEwJnkS1Jez4+xu3pu0jg==", "NWCNg");
    }

    private static boolean lIllIIIIll(int i2) {
        return i2 == 0;
    }

    private static boolean lIllIIIllI(int i2) {
        return i2 != 0;
    }

    private static boolean lIllIIIlll(int i2, int i3) {
        return i2 < i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    public boolean run() {
        int[] iArr = new int[llIIlIlI[0]];
        iArr[llIIlIlI[1]] = llIIlIlI[2];
        NPC nearest = NPCs.getNearest(iArr);
        if (!lIllIIIIll(new WorldArea(llIIlIlI[3], llIIlIlI[4], llIIlIlI[5], llIIlIlI[6], llIIlIlI[1]).contains(Players.getLocal()) ? 1 : 0) && !lIllIIIlII(nearest) && !lIllIIIlIl(Prayers.getPoints(), this.gB.restorePrayerLevel())) {
            Item first = Inventory.getFirst(item -> {
                if (!lIllIIIIll(item.getName().startsWith(llIIlIII[llIIlIlI[0]]) ? 1 : 0) || lIllIIIllI(item.getName().startsWith(llIIlIII[llIIlIlI[8]]) ? 1 : 0)) {
                    ?? r0 = llIIlIlI[0];
                    "".length();
                    return "   ".length() == 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return llIIlIlI[1];
            });
            if (lIllIIIlII(first)) {
                return llIIlIlI[1];
            }
            first.interact(llIIlIII[llIIlIlI[1]]);
            sleep(llIIlIlI[7]);
            return llIIlIlI[0];
        }
        return llIIlIlI[1];
    }

    static {
        lIllIIIIlI();
        lIllIIIIIl();
    }

    private static String lIlIllllll(String llIllIlIlIIIIll, String llIllIlIlIIIIlI) {
        try {
            SecretKeySpec llIllIlIlIIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIllIlIlIIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIlIlI[8], llIllIlIlIIIllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIllIlIlIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIllIlIlIIIlII) {
            llIllIlIlIIIlII.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIIlIl(int i2, int i3) {
        return i2 >= i3;
    }

    private static boolean lIllIIIlII(Object obj) {
        return obj == null;
    }

    @Inject
    public bI(SarachnisConfig sarachnisConfig) {
        this.gB = sarachnisConfig;
    }

    private static String lIlIllllIl(String llIllIlIIlIIIIl, String llIllIlIIlIIlIl) {
        String llIllIlIIlIIIIl2 = new String(Base64.getDecoder().decode(llIllIlIIlIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llIllIlIIlIIIll = llIllIlIIlIIlIl.toCharArray();
        int llIllIlIIlIIIlI = llIIlIlI[1];
        char[] charArray = llIllIlIIlIIIIl2.toCharArray();
        int llIllIlIIIllIll = charArray.length;
        int i2 = llIIlIlI[1];
        while (lIllIIIlll(i2, llIllIlIIIllIll)) {
            sb.append((char) (charArray[i2] ^ llIllIlIIlIIIll[llIllIlIIlIIIlI % llIllIlIIlIIIll.length]));
            "".length();
            llIllIlIIlIIIlI++;
            i2++;
            "".length();
            if (" ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void lIllIIIIlI() {
        llIIlIlI = new int[10];
        llIIlIlI[0] = " ".length();
        llIIlIlI[1] = ((27 ^ 49) ^ (208 ^ 194)) & (((42 ^ 0) ^ (31 ^ 13)) ^ (-" ".length()));
        llIIlIlI[2] = (-((-10305) & 11361)) & (-2051) & 11819;
        llIIlIlI[3] = (-10458) & 12287;
        llIIlIlI[4] = (-16709) & 26597;
        llIIlIlI[5] = 87 ^ 79;
        llIIlIlI[6] = 131 ^ 148;
        llIIlIlI[7] = "   ".length();
        llIIlIlI[8] = "  ".length();
        llIIlIlI[9] = (((104 + 86) - 164) + 125) ^ (((113 + 154) - 194) + 86);
    }
}
