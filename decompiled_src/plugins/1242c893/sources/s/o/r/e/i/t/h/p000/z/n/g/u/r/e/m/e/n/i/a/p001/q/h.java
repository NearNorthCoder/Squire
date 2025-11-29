package s.o.r.e.i.t.h.p000.z.n.g.u.r.e.m.e.n.i.a.p001.q;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmarezone.SquireNightmareZone;
import gg.squire.nightmarezone.SquireNightmareZoneConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;
@TaskDesc(name = "Lower HP", priority = 15, blocking = true)
/* renamed from: s.o.r.e.i.t.h.-.z.n.g.u.r.e.m.e.n.i.a.-.q.h  reason: invalid package */
/* loaded from: 1242c893-c960-46c9-b833-9f028c156ac6.jar:s/o/r/e/i/t/h/-/z/n/g/u/r/e/m/e/n/i/a/-/q/h.class */
public class h extends Task {
    private static /* synthetic */ String[] lIIIlIIlllIII;
    private final /* synthetic */ SquireNightmareZoneConfig T;
    private final /* synthetic */ SquireNightmareZone S;
    private final /* synthetic */ Client U;
    private static /* synthetic */ int[] lIIIlIIlllIIl;

    private static boolean lIIlllllIllllll(Object obj) {
        return obj != null;
    }

    private static boolean lIIlllllIllllII(int i) {
        return i != 0;
    }

    private static void lIIlllllIlllIII() {
        lIIIlIIlllIII = new String[lIIIlIIlllIIl[6]];
        lIIIlIIlllIII[lIIIlIIlllIIl[0]] = lIIlllllIllIllI("8NKw5V4PjmBpe6F3MlsJ7A==", "UwtHc");
        lIIIlIIlllIII[lIIIlIIlllIIl[1]] = lIIlllllIllIllI("cbDwtivzKlg=", "IDOPA");
        lIIIlIIlllIII[lIIIlIIlllIIl[3]] = lIIlllllIllIlll("PTwRPxMcJVA/ChogUC4EEi4=", "yKpMe");
        lIIIlIIlllIII[lIIIlIIlllIIl[5]] = lIIlllllIllIllI("Hy5TOBHlufM=", "MqtoR");
    }

    private static String lIIlllllIllIllI(String lllllllllllllllIIIIlllIllllIllIl, String lllllllllllllllIIIIlllIllllIllII) {
        try {
            SecretKeySpec lllllllllllllllIIIIlllIlllllIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIlllIllllIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIIlIIlllIIl[3], lllllllllllllllIIIIlllIlllllIIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIlllIllllIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIlllIllllIlllI) {
            lllllllllllllllIIIIlllIllllIlllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlllllIllllIl(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIIlllllIlllIll(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIIllllllIIIIII(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIlllllIlllllI(int i, int i2) {
        return i > i2;
    }

    private static boolean lIIlllllIlllIlI(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    public boolean run() {
        if (!lIIlllllIlllIlI(this.U.isInInstancedRegion() ? 1 : 0) && !lIIlllllIlllIll(Skills.getBoostedLevel(Skill.HITPOINTS), lIIIlIIlllIIl[1])) {
            int varbitValue = Static.getClient().getVarbitValue(lIIIlIIlllIIl[2]);
            if ((!lIIlllllIllllII(this.T.overload()) || lIIlllllIllllIl(varbitValue, lIIIlIIlllIIl[3])) && !lIIlllllIlllllI(varbitValue, lIIIlIIlllIIl[4])) {
                String[] strArr = new String[lIIIlIIlllIIl[1]];
                strArr[lIIIlIIlllIIl[0]] = lIIIlIIlllIII[lIIIlIIlllIIl[0]];
                Item first = Inventory.getFirst(strArr);
                if (lIIlllllIllllll(first)) {
                    first.interact(lIIIlIIlllIII[lIIIlIIlllIIl[1]]);
                    return lIIIlIIlllIIl[1];
                }
                String[] strArr2 = new String[lIIIlIIlllIIl[1]];
                strArr2[lIIIlIIlllIIl[0]] = lIIIlIIlllIII[lIIIlIIlllIIl[3]];
                Item first2 = Inventory.getFirst(strArr2);
                if (lIIlllllIllllll(first2)) {
                    first2.interact(lIIIlIIlllIII[lIIIlIIlllIIl[5]]);
                    return lIIIlIIlllIIl[1];
                }
                return lIIIlIIlllIIl[0];
            }
            return lIIIlIIlllIIl[0];
        }
        return lIIIlIIlllIIl[0];
    }

    @Inject
    public h(SquireNightmareZone squireNightmareZone, SquireNightmareZoneConfig squireNightmareZoneConfig, Client client) {
        this.S = squireNightmareZone;
        this.T = squireNightmareZoneConfig;
        this.U = client;
    }

    static {
        lIIlllllIlllIIl();
        lIIlllllIlllIII();
    }

    private static String lIIlllllIllIlll(String lllllllllllllllIIIIllllIIIIIIIlI, String lllllllllllllllIIIIllllIIIIIIIIl) {
        String lllllllllllllllIIIIllllIIIIIIIlI2 = new String(Base64.getDecoder().decode(lllllllllllllllIIIIllllIIIIIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIIllllIIIIIIIII = new StringBuilder();
        char[] lllllllllllllllIIIIlllIlllllllll = lllllllllllllllIIIIllllIIIIIIIIl.toCharArray();
        int lllllllllllllllIIIIlllIllllllllI = lIIIlIIlllIIl[0];
        char[] charArray = lllllllllllllllIIIIllllIIIIIIIlI2.toCharArray();
        int lllllllllllllllIIIIlllIlllllIlll = charArray.length;
        int i = lIIIlIIlllIIl[0];
        while (lIIllllllIIIIII(i, lllllllllllllllIIIIlllIlllllIlll)) {
            char lllllllllllllllIIIIllllIIIIIIIll = charArray[i];
            lllllllllllllllIIIIllllIIIIIIIII.append((char) (lllllllllllllllIIIIllllIIIIIIIll ^ lllllllllllllllIIIIlllIlllllllll[lllllllllllllllIIIIlllIllllllllI % lllllllllllllllIIIIlllIlllllllll.length]));
            "".length();
            lllllllllllllllIIIIlllIllllllllI++;
            i++;
            "".length();
            if (((((147 + 164) - 269) + 148) ^ (((109 + 58) - 126) + 145)) < ((77 ^ 75) ^ "  ".length())) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIIIllllIIIIIIIII);
    }

    private static void lIIlllllIlllIIl() {
        lIIIlIIlllIIl = new int[7];
        lIIIlIIlllIIl[0] = "  ".length() & ("  ".length() ^ (-1));
        lIIIlIIlllIIl[1] = " ".length();
        lIIIlIIlllIIl[2] = (-((-1953) & 26529)) & (-4229) & 32759;
        lIIIlIIlllIIl[3] = "  ".length();
        lIIIlIIlllIIl[4] = (((91 + 36) - 109) + 135) ^ (((41 + 135) - 156) + 118);
        lIIIlIIlllIIl[5] = "   ".length();
        lIIIlIIlllIIl[6] = 123 ^ 127;
    }
}
