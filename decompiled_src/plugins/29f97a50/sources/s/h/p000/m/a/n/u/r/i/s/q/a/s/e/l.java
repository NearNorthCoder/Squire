package s.h.p000.m.a.n.u.r.i.s.q.a.s.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.widgets.Prayers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@TaskDesc(name = "Restoring Prayer", priority = 11, blocking = true)
/* renamed from: s.h.-.m.a.n.u.r.i.s.q.a.s.e.l  reason: invalid package */
/* loaded from: 29f97a50-4c1f-4047-b5b1-e3e7ab557a1b.jar:s/h/-/m/a/n/u/r/i/s/q/a/s/e/l.class */
public class l extends Task {
    private static final /* synthetic */ Logger W;
    private static /* synthetic */ String[] lIIlIlllIIIII;
    private static /* synthetic */ int[] lIIlIlllIllIl;

    static {
        lIlIllIlllIlIIl();
        lIlIllIlllIlIII();
        W = LoggerFactory.getLogger(l.class);
    }

    private static boolean lIlIllIlllIlIll(Object obj) {
        return obj == null;
    }

    private static String lIlIllIllIIIllI(String llllllllllllllIllllIlIIIIlIlllll, String llllllllllllllIllllIlIIIIlIllllI) {
        try {
            SecretKeySpec llllllllllllllIllllIlIIIIllIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIlIIIIlIllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllllIlIIIIllIIIIl = Cipher.getInstance("Blowfish");
            llllllllllllllIllllIlIIIIllIIIIl.init(lIIlIlllIllIl[7], llllllllllllllIllllIlIIIIllIIIlI);
            return new String(llllllllllllllIllllIlIIIIllIIIIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIlIIIIlIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIlIIIIllIIIII) {
            llllllllllllllIllllIlIIIIllIIIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIllIlllIlIlI(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    public boolean run() {
        if (lIlIllIlllIlIlI(Skills.getBoostedLevel(Skill.PRAYER), Skills.getLevel(Skill.PRAYER))) {
            return lIIlIlllIllIl[0];
        }
        WorldPoint worldPoint = new WorldPoint(lIIlIlllIllIl[1], lIIlIlllIllIl[2], lIIlIlllIllIl[0]);
        String[] strArr = new String[lIIlIlllIllIl[3]];
        strArr[lIIlIlllIllIl[0]] = lIIlIlllIIIII[lIIlIlllIllIl[0]];
        TileObject firstAt = TileObjects.getFirstAt(worldPoint, strArr);
        if (lIlIllIlllIlIll(firstAt)) {
            int[] iArr = new int[lIIlIlllIllIl[4]];
            iArr[lIIlIlllIllIl[0]] = lIIlIlllIllIl[5];
            iArr[lIIlIlllIllIl[3]] = lIIlIlllIllIl[6];
            iArr[lIIlIlllIllIl[7]] = lIIlIlllIllIl[8];
            firstAt = TileObjects.getNearest(iArr);
            if (lIlIllIlllIlIll(firstAt)) {
                return lIIlIlllIllIl[0];
            }
        }
        if (lIlIllIlllIllII(Prayers.isQuickPrayerEnabled() ? 1 : 0)) {
            Prayers.toggleQuickPrayer((boolean) lIIlIlllIllIl[0]);
            return lIIlIlllIllIl[3];
        }
        String[] strArr2 = new String[lIIlIlllIllIl[7]];
        strArr2[lIIlIlllIllIl[0]] = lIIlIlllIIIII[lIIlIlllIllIl[3]];
        strArr2[lIIlIlllIllIl[3]] = lIIlIlllIIIII[lIIlIlllIllIl[7]];
        firstAt.interact(strArr2);
        return lIIlIlllIllIl[3];
    }

    private static String lIlIllIllIIIlIl(String llllllllllllllIllllIlIIIIlIlIIlI, String llllllllllllllIllllIlIIIIlIlIIIl) {
        try {
            SecretKeySpec llllllllllllllIllllIlIIIIlIlIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIlIIIIlIlIIIl.getBytes(StandardCharsets.UTF_8)), lIIlIlllIllIl[9]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIlIlllIllIl[7], llllllllllllllIllllIlIIIIlIlIlIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIlIIIIlIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIlIIIIlIlIIll) {
            llllllllllllllIllllIlIIIIlIlIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIllIlllIllII(int i) {
        return i != 0;
    }

    private static boolean lIlIllIlllIllIl(int i, int i2) {
        return i < i2;
    }

    private static void lIlIllIlllIlIII() {
        lIIlIlllIIIII = new String[lIIlIlllIllIl[4]];
        lIIlIlllIIIII[lIIlIlllIllIl[0]] = lIlIllIllIIIlII("EToODSg=", "PVzlZ");
        lIIlIlllIIIII[lIIlIlllIllIl[3]] = lIlIllIllIIIlIl("3ERv6DxFA+w=", "iNDev");
        lIIlIlllIIIII[lIIlIlllIllIl[7]] = lIlIllIllIIIllI("ZcMi2AsCUQ4=", "DXuUY");
    }

    private static String lIlIllIllIIIlII(String llllllllllllllIllllIlIIIIllIllll, String llllllllllllllIllllIlIIIIlllIIll) {
        String llllllllllllllIllllIlIIIIllIllll2 = new String(Base64.getDecoder().decode(llllllllllllllIllllIlIIIIllIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllllIlIIIIlllIIlI = new StringBuilder();
        char[] llllllllllllllIllllIlIIIIlllIIIl = llllllllllllllIllllIlIIIIlllIIll.toCharArray();
        int llllllllllllllIllllIlIIIIlllIIII = lIIlIlllIllIl[0];
        char[] charArray = llllllllllllllIllllIlIIIIllIllll2.toCharArray();
        int length = charArray.length;
        int i = lIIlIlllIllIl[0];
        while (lIlIllIlllIllIl(i, length)) {
            llllllllllllllIllllIlIIIIlllIIlI.append((char) (charArray[i] ^ llllllllllllllIllllIlIIIIlllIIIl[llllllllllllllIllllIlIIIIlllIIII % llllllllllllllIllllIlIIIIlllIIIl.length]));
            "".length();
            llllllllllllllIllllIlIIIIlllIIII++;
            i++;
            "".length();
            if ("  ".length() >= "   ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllllIlIIIIlllIIlI);
    }

    private static void lIlIllIlllIlIIl() {
        lIIlIlllIllIl = new int[10];
        lIIlIlllIllIl[0] = (32 ^ 102) & ((87 ^ 17) ^ (-1));
        lIIlIlllIllIl[1] = (-9604) & 12207;
        lIIlIlllIllIl[2] = (-28966) & 32173;
        lIIlIlllIllIl[3] = " ".length();
        lIIlIlllIllIl[4] = "   ".length();
        lIIlIlllIllIl[5] = (-2113) & 31351;
        lIIlIlllIllIl[6] = (-((-2169) & 2431)) & (-66) & 29567;
        lIIlIlllIllIl[7] = "  ".length();
        lIIlIlllIllIl[8] = (-((-22045) & 24477)) & (-67) & 31739;
        lIIlIlllIllIl[9] = (((22 + 110) - 34) + 49) ^ (((128 + 46) - 23) + 4);
    }
}
