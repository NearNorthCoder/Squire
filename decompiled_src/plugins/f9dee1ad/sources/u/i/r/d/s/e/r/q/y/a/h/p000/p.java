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
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Restoring prayer", priority = 20)
/* renamed from: u.i.r.d.s.e.r.q.y.a.h.-.p  reason: invalid package */
/* loaded from: f9dee1ad-dcbf-4af9-9fb8-47dc91e2d43e.jar:u/i/r/d/s/e/r/q/y/a/h/-/p.class */
public class p extends Task {
    private final /* synthetic */ SquireAlchemicalHydraConfig as;
    private static /* synthetic */ int[] llllIIlllIll;
    private static /* synthetic */ String[] llllIIlllIlI;
    private final /* synthetic */ C0000a ar;

    private static boolean lIIlIIIIIlIIIIl(int i, int i2) {
        return i > i2;
    }

    private static boolean lIIlIIIIIlIIIlI(Object obj) {
        return obj == null;
    }

    private static boolean lIIlIIIIIlIIlII(int i, int i2) {
        return i < i2;
    }

    @Inject
    public p(C0000a c0000a, SquireAlchemicalHydraConfig squireAlchemicalHydraConfig) {
        this.ar = c0000a;
        this.as = squireAlchemicalHydraConfig;
    }

    private static String lIIlIIIIIIlllII(String lllllllllllllllIIlIlIIllllIlllIl, String lllllllllllllllIIlIlIIllllIlllII) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIlIlIIllllIlllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIlIIllllIllIll = new StringBuilder();
        char[] charArray = lllllllllllllllIIlIlIIllllIlllII.toCharArray();
        int lllllllllllllllIIlIlIIllllIllIIl = llllIIlllIll[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = llllIIlllIll[0];
        while (lIIlIIIIIlIIlII(i, length)) {
            lllllllllllllllIIlIlIIllllIllIll.append((char) (charArray2[i] ^ charArray[lllllllllllllllIIlIlIIllllIllIIl % charArray.length]));
            "".length();
            lllllllllllllllIIlIlIIllllIllIIl++;
            i++;
            "".length();
            if (" ".length() >= (179 ^ 183)) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIlIlIIllllIllIll);
    }

    private static String lIIlIIIIIIllIll(String lllllllllllllllIIlIlIIlllllIllIl, String lllllllllllllllIIlIlIIlllllIllII) {
        try {
            SecretKeySpec lllllllllllllllIIlIlIIllllllIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIIlllllIllII.getBytes(StandardCharsets.UTF_8)), llllIIlllIll[5]), "DES");
            Cipher lllllllllllllllIIlIlIIlllllIllll = Cipher.getInstance("DES");
            lllllllllllllllIIlIlIIlllllIllll.init(llllIIlllIll[2], lllllllllllllllIIlIlIIllllllIIII);
            return new String(lllllllllllllllIIlIlIIlllllIllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIIlllllIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIlIIlllllIlllI) {
            lllllllllllllllIIlIlIIlllllIlllI.printStackTrace();
            return null;
        }
    }

    private static void lIIlIIIIIIllllI() {
        llllIIlllIlI = new String[llllIIlllIll[4]];
        llllIIlllIlI[llllIIlllIll[0]] = lIIlIIIIIIllIll("gOvz1o2792g=", "kofIR");
        llllIIlllIlI[llllIIlllIll[1]] = lIIlIIIIIIlllII("NjEFIiY=", "rClLM");
        llllIIlllIlI[llllIIlllIll[2]] = lIIlIIIIIIlllIl("xVaTEpjIFnw=", "drqkk");
        llllIIlllIlI[llllIIlllIll[3]] = lIIlIIIIIIlllII("Jx0qJTUnHQ==", "UxYQZ");
    }

    static {
        lIIlIIIIIIlllll();
        lIIlIIIIIIllllI();
    }

    private static boolean lIIlIIIIIlIIIII(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    public boolean run() {
        if (!lIIlIIIIIlIIIII(this.ar.g() ? 1 : 0) && !lIIlIIIIIlIIIIl(Skills.getBoostedLevel(Skill.PRAYER), this.as.restorePrayAt())) {
            Item first = Inventory.getFirst(item -> {
                String[] strArr = new String[llllIIlllIll[1]];
                strArr[llllIIlllIll[0]] = llllIIlllIlI[llllIIlllIll[1]];
                if (!lIIlIIIIIlIIIll(item.hasAction(strArr) ? 1 : 0) || (lIIlIIIIIlIIIII(item.getName().toLowerCase().contains(llllIIlllIlI[llllIIlllIll[2]]) ? 1 : 0) && !lIIlIIIIIlIIIll(item.getName().toLowerCase().contains(llllIIlllIlI[llllIIlllIll[3]]) ? 1 : 0))) {
                    return llllIIlllIll[0];
                }
                ?? r0 = llllIIlllIll[1];
                "".length();
                return ((74 ^ 45) ^ (26 ^ 121)) < (((234 ^ 157) ^ (73 ^ 55)) & (((143 ^ 174) ^ (234 ^ 194)) ^ (-" ".length()))) ? ((155 ^ 162) ^ (67 ^ 99)) & (((((54 + 115) - 107) + 72) ^ (((0 + 133) - 77) + 103)) ^ (-" ".length())) : r0;
            });
            if (lIIlIIIIIlIIIlI(first)) {
                return llllIIlllIll[0];
            }
            first.interact(llllIIlllIlI[llllIIlllIll[0]]);
            return llllIIlllIll[1];
        }
        return llllIIlllIll[0];
    }

    private static boolean lIIlIIIIIlIIIll(int i) {
        return i != 0;
    }

    private static String lIIlIIIIIIlllIl(String lllllllllllllllIIlIlIIllllIIIllI, String lllllllllllllllIIlIlIIllllIIIlll) {
        try {
            SecretKeySpec lllllllllllllllIIlIlIIllllIIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIIllllIIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIlIIllllIIlIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIlIIllllIIlIlI.init(llllIIlllIll[2], lllllllllllllllIIlIlIIllllIIlIll);
            return new String(lllllllllllllllIIlIlIIllllIIlIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIIllllIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIlIIllllIIlIIl) {
            lllllllllllllllIIlIlIIllllIIlIIl.printStackTrace();
            return null;
        }
    }

    private static void lIIlIIIIIIlllll() {
        llllIIlllIll = new int[6];
        llllIIlllIll[0] = ((((105 + 75) - 134) + 129) ^ (((71 + 111) - 147) + 143)) & (((((99 + 55) - 27) + 17) ^ (((102 + 95) - 128) + 72)) ^ (-" ".length()));
        llllIIlllIll[1] = " ".length();
        llllIIlllIll[2] = "  ".length();
        llllIIlllIll[3] = "   ".length();
        llllIIlllIll[4] = (184 ^ 172) ^ (38 ^ 54);
        llllIIlllIll[5] = 104 ^ 96;
    }
}
