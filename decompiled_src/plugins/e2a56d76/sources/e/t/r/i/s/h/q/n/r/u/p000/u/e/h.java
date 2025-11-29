package e.t.r.i.s.h.q.n.r.u.p000.u.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.game.Skills;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: e.t.r.i.s.h.q.n.r.u.-.u.e.h  reason: invalid package */
/* loaded from: e2a56d76-bd9d-40c9-839c-e5b25fb4c3a0.jar:e/t/r/i/s/h/q/n/r/u/-/u/e/h.class */
public final class h {
    private final /* synthetic */ int levelRequired;
    private static /* synthetic */ int[] lllIllIlllll;
    private static final /* synthetic */ h[] $VALUES;
    private static /* synthetic */ String[] lllIllIllllI;
    public static final /* synthetic */ h DASHING_KEBBIT;
    public static final /* synthetic */ h DARK_KEBBIT;
    public static final /* synthetic */ h SPOTTED_KEBBIT;
    private final /* synthetic */ int kebbitId;

    public static NPC s() {
        int level = Skills.getLevel(Skill.HUNTER);
        ArrayList arrayList = new ArrayList();
        h[] values = values();
        int length = values.length;
        int i = lllIllIlllll[0];
        while (lIIIllIllIIllll(i, length)) {
            h hVar = values[i];
            if (lIIIllIllIlIIII(hVar.t(), level)) {
                "".length();
                if (" ".length() <= 0) {
                    return null;
                }
            } else {
                arrayList.add(hVar);
                "".length();
            }
            i++;
            "".length();
            if ((134 ^ 130) < 0) {
                return null;
            }
        }
        return NPCs.getNearest(arrayList.stream().mapToInt((v0) -> {
            return v0.u();
        }).toArray());
    }

    public int u() {
        return this.kebbitId;
    }

    private static String lIIIllIllIIlIll(String lllllllllllllllIIlIlllIlIlIlIIII, String lllllllllllllllIIlIlllIlIlIIllll) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIlIlllIlIlIlIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIlllIlIlIIlllI = new StringBuilder();
        char[] charArray = lllllllllllllllIIlIlllIlIlIIllll.toCharArray();
        int lllllllllllllllIIlIlllIlIlIIllII = lllIllIlllll[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lllIllIlllll[0];
        while (lIIIllIllIIllll(i, length)) {
            lllllllllllllllIIlIlllIlIlIIlllI.append((char) (charArray2[i] ^ charArray[lllllllllllllllIIlIlllIlIlIIllII % charArray.length]));
            "".length();
            lllllllllllllllIIlIlllIlIlIIllII++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIlIlllIlIlIIlllI);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }

    private static String lIIIllIllIIllII(String lllllllllllllllIIlIlllIlIIlllIll, String lllllllllllllllIIlIlllIlIIlllIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlllIlIIlllIlI.getBytes(StandardCharsets.UTF_8)), lllIllIlllll[10]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIllIlllll[6], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlllIlIIlllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIlllIlIIllllII) {
            lllllllllllllllIIlIlllIlIIllllII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIllIllIlIIII(int i, int i2) {
        return i > i2;
    }

    private h(String str, int i, int i2, int i3) {
        this.levelRequired = i2;
        this.kebbitId = i3;
    }

    static {
        lIIIllIllIIlllI();
        lIIIllIllIIllIl();
        DASHING_KEBBIT = new h(lllIllIllllI[lllIllIlllll[0]], lllIllIlllll[0], lllIllIlllll[1], lllIllIlllll[2]);
        DARK_KEBBIT = new h(lllIllIllllI[lllIllIlllll[3]], lllIllIlllll[3], lllIllIlllll[4], lllIllIlllll[5]);
        SPOTTED_KEBBIT = new h(lllIllIllllI[lllIllIlllll[6]], lllIllIlllll[6], lllIllIlllll[7], lllIllIlllll[8]);
        h[] hVarArr = new h[lllIllIlllll[9]];
        hVarArr[lllIllIlllll[0]] = DASHING_KEBBIT;
        hVarArr[lllIllIlllll[3]] = DARK_KEBBIT;
        hVarArr[lllIllIlllll[6]] = SPOTTED_KEBBIT;
        $VALUES = hVarArr;
    }

    public int t() {
        return this.levelRequired;
    }

    private static boolean lIIIllIllIIllll(int i, int i2) {
        return i < i2;
    }

    private static void lIIIllIllIIllIl() {
        lllIllIllllI = new String[lllIllIlllll[9]];
        lllIllIllllI[lllIllIlllll[0]] = lIIIllIllIIlIll("IjYWDgooMBoNBiQ1DBI=", "fwEFC");
        lllIllIllllI[lllIllIlllll[3]] = lIIIllIllIIllII("8EBRn9F3Hx55hHyc7wA3nQ==", "ECNTu");
        lllIllIllllI[lllIllIlllll[6]] = lIIIllIllIIlIll("BigaNgcQPAopFhc6HDY=", "UxUbS");
    }

    private static void lIIIllIllIIlllI() {
        lllIllIlllll = new int[11];
        lllIllIlllll[0] = ((35 ^ 76) ^ (49 ^ 10)) & (((208 ^ 149) ^ (148 ^ 133)) ^ (-" ".length()));
        lllIllIlllll[1] = (113 ^ 42) ^ (175 ^ 177);
        lllIllIlllll[2] = (-8737) & 14269;
        lllIllIlllll[3] = " ".length();
        lllIllIlllll[4] = (189 ^ 198) ^ (111 ^ 45);
        lllIllIlllll[5] = (-((-1129) & 20075)) & (-33) & 24510;
        lllIllIlllll[6] = "  ".length();
        lllIllIlllll[7] = (((34 + 39) - 6) + 89) ^ (((162 + 139) - 141) + 23);
        lllIllIlllll[8] = (-8741) & 14271;
        lllIllIlllll[9] = "   ".length();
        lllIllIlllll[10] = 4 ^ 12;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }
}
