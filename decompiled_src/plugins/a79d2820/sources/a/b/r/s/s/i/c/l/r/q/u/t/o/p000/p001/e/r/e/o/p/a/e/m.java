package a.b.r.s.s.i.c.l.r.q.u.t.o.p000.p001.e.r.e.o.p.a.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Skill;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Prayers;
/* renamed from: a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e.m  reason: invalid package */
/* loaded from: a79d2820-2b30-4bed-9aed-0ccb18befd76.jar:a/b/r/s/s/i/c/l/r/q/u/t/o/-/-/e/r/e/o/p/a/e/m.class */
public abstract class m extends a {
    private static /* synthetic */ int[] lIlIllllllll;
    private static /* synthetic */ String[] lIlIlllllllI;

    static {
        lllIIIllIIIllI();
        lllIIIllIIIlIl();
    }

    private static boolean lllIIIllIIlIlI(int i) {
        return i != 0;
    }

    private static boolean lllIIIllIIIlll(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean m() {
        if (!lllIIIllIIlIII(Combat.getSpecEnergy(), lIlIllllllll[2]) && !lllIIIllIIlIIl(Combat.getMissingHealth()) && !lllIIIllIIlIII(Prayers.getPoints(), Skills.getLevel(Skill.PRAYER)) && !lllIIIllIIlIII(Movement.getRunEnergy(), lIlIllllllll[3])) {
            return lIlIllllllll[1];
        }
        return lIlIllllllll[0];
    }

    private static void lllIIIllIIIlIl() {
        lIlIlllllllI = new String[lIlIllllllll[4]];
        lIlIlllllllI[lIlIllllllll[1]] = lllIIIllIIIIll("Ah81Fys+", "RpGcJ");
        lIlIlllllllI[lIlIllllllll[0]] = lllIIIllIIIlII("v1C6VJs4VFo=", "CFuhp");
    }

    private static String lllIIIllIIIIll(String lllllllllllllllIllIIIlIllllllIII, String lllllllllllllllIllIIIlIlllllIlll) {
        String lllllllllllllllIllIIIlIllllllIII2 = new String(Base64.getDecoder().decode(lllllllllllllllIllIIIlIllllllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIllIIIlIlllllIlIl = lllllllllllllllIllIIIlIlllllIlll.toCharArray();
        int lllllllllllllllIllIIIlIlllllIlII = lIlIllllllll[1];
        char[] charArray = lllllllllllllllIllIIIlIllllllIII2.toCharArray();
        int length = charArray.length;
        int i = lIlIllllllll[1];
        while (lllIIIllIIlIII(i, length)) {
            char lllllllllllllllIllIIIlIllllllIIl = charArray[i];
            sb.append((char) (lllllllllllllllIllIIIlIllllllIIl ^ lllllllllllllllIllIIIlIlllllIlIl[lllllllllllllllIllIIIlIlllllIlII % lllllllllllllllIllIIIlIlllllIlIl.length]));
            "".length();
            lllllllllllllllIllIIIlIlllllIlII++;
            i++;
            "".length();
            if (((((138 + 1) - 99) + 145) ^ (((38 + 152) - 4) + 3)) != ((((106 + 31) - 62) + 57) ^ (((101 + 99) - 136) + 64))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    public boolean l() {
        if (lllIIIllIIIlll(TileObjects.getNearest(tileObject -> {
            if (lllIIIllIIlIlI(tileObject.getName().equals(lIlIlllllllI[lIlIllllllll[1]]) ? 1 : 0)) {
                String[] strArr = new String[lIlIllllllll[0]];
                strArr[lIlIllllllll[1]] = lIlIlllllllI[lIlIllllllll[0]];
                if (lllIIIllIIlIlI(tileObject.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lIlIllllllll[0];
                    "".length();
                    return (-" ".length()) > "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
            return lIlIllllllll[1];
        }))) {
            ?? r0 = lIlIllllllll[0];
            "".length();
            return 0 != 0 ? ((94 ^ 7) ^ (120 ^ 112)) & (((11 ^ 23) ^ (34 ^ 111)) ^ (-" ".length())) : r0;
        }
        return lIlIllllllll[1];
    }

    private static void lllIIIllIIIllI() {
        lIlIllllllll = new int[6];
        lIlIllllllll[0] = " ".length();
        lIlIllllllll[1] = ((((125 + 125) - 228) + 129) ^ (((63 + 109) - 159) + 140)) & (((18 ^ 75) ^ (219 ^ 140)) ^ (-" ".length()));
        lIlIllllllll[2] = (((154 + 44) - 159) + 127) ^ (((44 + 151) - 66) + 65);
        lIlIllllllll[3] = 244 ^ 198;
        lIlIllllllll[4] = "  ".length();
        lIlIllllllll[5] = 152 ^ 144;
    }

    private static boolean lllIIIllIIlIII(int i, int i2) {
        return i < i2;
    }

    private static boolean lllIIIllIIlIIl(int i) {
        return i > 0;
    }

    private static String lllIIIllIIIlII(String lllllllllllllllIllIIIlIllllIIIll, String lllllllllllllllIllIIIlIllllIIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIIlIllllIIIlI.getBytes(StandardCharsets.UTF_8)), lIlIllllllll[5]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIllllllll[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIIlIllllIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIIIlIllllIIlII) {
            lllllllllllllllIllIIIlIllllIIlII.printStackTrace();
            return null;
        }
    }
}
