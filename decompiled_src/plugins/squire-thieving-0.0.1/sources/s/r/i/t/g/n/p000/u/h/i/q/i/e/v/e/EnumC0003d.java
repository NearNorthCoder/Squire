package s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.d  reason: invalid package and case insensitive filesystem */
/* loaded from: squire-thieving-0.0.1.jar:s/r/i/t/g/n/-/u/h/i/q/i/e/v/e/d.class */
public final class EnumC0003d {
    private final /* synthetic */ String name;
    private final /* synthetic */ int combat;
    public static final /* synthetic */ EnumC0003d MENAPHITE;
    private static final /* synthetic */ EnumC0003d[] $VALUES;
    private final /* synthetic */ EnumC0002c house;
    private static /* synthetic */ String[] lIIllIlIllIII;
    private static /* synthetic */ int[] lIIllIlIllIIl;
    public static final /* synthetic */ EnumC0003d BANDIT_56;
    public static final /* synthetic */ EnumC0003d BANDIT_41;
    public static final /* synthetic */ EnumC0003d HIGHEST_LEVEL;
    private final /* synthetic */ int thieving;

    public int w() {
        return this.combat;
    }

    private static String lIllIIIIlIlIIlI(String llllllllllllllIlllIlllllIIIIIIlI, String llllllllllllllIlllIlllllIIIIIIIl) {
        try {
            SecretKeySpec llllllllllllllIlllIlllllIIIIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIlllllIIIIIIIl.getBytes(StandardCharsets.UTF_8)), lIIllIlIllIIl[12]), "DES");
            Cipher llllllllllllllIlllIlllllIIIIIlII = Cipher.getInstance("DES");
            llllllllllllllIlllIlllllIIIIIlII.init(lIIllIlIllIIl[3], llllllllllllllIlllIlllllIIIIIlIl);
            return new String(llllllllllllllIlllIlllllIIIIIlII.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIlllllIIIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIlllllIIIIIIll) {
            llllllllllllllIlllIlllllIIIIIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIIlIIIlIIl(int i, int i2) {
        return i < i2;
    }

    static {
        lIllIIIIlIlIlII();
        lIllIIIIlIlIIll();
        HIGHEST_LEVEL = new EnumC0003d(lIIllIlIllIII[lIIllIlIllIIl[3]], lIIllIlIllIIl[1], lIIllIlIllIIl[0], lIIllIlIllIII[lIIllIlIllIIl[4]], lIIllIlIllIIl[0], null);
        MENAPHITE = new EnumC0003d(lIIllIlIllIII[lIIllIlIllIIl[5]], lIIllIlIllIIl[2], lIIllIlIllIIl[6], lIIllIlIllIII[lIIllIlIllIIl[7]], lIIllIlIllIIl[8], EnumC0002c.MENAPHITE_HOUSE);
        BANDIT_56 = new EnumC0003d(lIIllIlIllIII[lIIllIlIllIIl[9]], lIIllIlIllIIl[3], lIIllIlIllIIl[8], lIIllIlIllIII[lIIllIlIllIIl[10]], lIIllIlIllIIl[11], EnumC0002c.LADDER_HOUSE);
        BANDIT_41 = new EnumC0003d(lIIllIlIllIII[lIIllIlIllIIl[12]], lIIllIlIllIIl[4], lIIllIlIllIIl[13], lIIllIlIllIII[lIIllIlIllIIl[14]], lIIllIlIllIIl[15], EnumC0002c.LADDER_HOUSE);
        EnumC0003d[] enumC0003dArr = new EnumC0003d[lIIllIlIllIIl[5]];
        enumC0003dArr[lIIllIlIllIIl[1]] = HIGHEST_LEVEL;
        enumC0003dArr[lIIllIlIllIIl[2]] = MENAPHITE;
        enumC0003dArr[lIIllIlIllIIl[3]] = BANDIT_56;
        enumC0003dArr[lIIllIlIllIIl[4]] = BANDIT_41;
        $VALUES = enumC0003dArr;
    }

    public String v() {
        return this.name;
    }

    public static EnumC0003d valueOf(String str) {
        return (EnumC0003d) Enum.valueOf(EnumC0003d.class, str);
    }

    public EnumC0002c t() {
        return this.house;
    }

    public NPC a(Predicate<NPC> predicate) {
        return NPCs.getNearest(t().r(), npc -> {
            if (lIllIIIIlIlIllI(b(npc) ? 1 : 0) && lIllIIIIlIlIllI(predicate.test(npc) ? 1 : 0)) {
                ?? r0 = lIIllIlIllIIl[2];
                "".length();
                return (-" ".length()) < (-" ".length()) ? ((((31 + 115) - 107) + 115) ^ (((48 + 60) - (-20)) + 9)) & (((133 ^ 191) ^ (22 ^ 63)) ^ (-" ".length())) : r0;
            }
            return lIIllIlIllIIl[1];
        });
    }

    public NPC a(EnumC0003d enumC0003d) {
        return NPCs.getNearest(npc -> {
            if (lIllIIIIlIlIllI(this.name.equals(enumC0003d.name) ? 1 : 0) && lIllIIIIlIlIlll(npc.getCombatLevel(), enumC0003d.combat)) {
                ?? r0 = lIIllIlIllIIl[2];
                "".length();
                return (-" ".length()) != (-" ".length()) ? ((156 ^ 193) ^ (114 ^ 125)) & (((134 ^ 198) ^ (114 ^ 96)) ^ (-" ".length())) : r0;
            }
            return lIIllIlIllIIl[1];
        });
    }

    private EnumC0003d(String str, int i, int i2, String str2, int i3, EnumC0002c enumC0002c) {
        this.thieving = i2;
        this.name = str2;
        this.combat = i3;
        this.house = enumC0002c;
    }

    public static EnumC0003d[] values() {
        return (EnumC0003d[]) $VALUES.clone();
    }

    private static String lIllIIIIlIlIIII(String llllllllllllllIlllIllllIllllIlIl, String llllllllllllllIlllIllllIllllIlII) {
        try {
            SecretKeySpec llllllllllllllIlllIllllIlllllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllllIllllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIllIlIllIIl[3], llllllllllllllIlllIllllIlllllIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllllIllllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIllllIllllIIIl) {
            llllllllllllllIlllIllllIllllIIIl.printStackTrace();
            return null;
        }
    }

    public int u() {
        return this.thieving;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public boolean b(NPC npc) {
        if (lIllIIIIlIlIllI(this.name.equals(npc.getName()) ? 1 : 0) && lIllIIIIlIlIlll(this.combat, npc.getCombatLevel())) {
            ?? r0 = lIIllIlIllIIl[2];
            "".length();
            return (-" ".length()) > 0 ? ((153 ^ 158) ^ (39 ^ 52)) & (((((177 + 181) - 159) + 14) ^ (((35 + 175) - 44) + 27)) ^ (-" ".length())) : r0;
        }
        return lIIllIlIllIIl[1];
    }

    private static boolean lIllIIIIlIlIlll(int i, int i2) {
        return i == i2;
    }

    private static void lIllIIIIlIlIIll() {
        lIIllIlIllIII = new String[lIIllIlIllIIl[16]];
        lIIllIlIllIII[lIIllIlIllIIl[1]] = lIllIIIIlIlIIII("/gBTUQAWqFE=", "lPjpI");
        lIIllIlIllIII[lIIllIlIllIIl[2]] = lIllIIIIlIlIIIl("", "oiTVF");
        lIIllIlIllIII[lIIllIlIllIIl[3]] = lIllIIIIlIlIIII("Y8aEl35GYmtHBVjJo0KQHQ==", "zKJBB");
        lIIllIlIllIII[lIIllIlIllIIl[4]] = lIllIIIIlIlIIIl("BgMpMAc9Hm4UBzgPIg==", "NjNXb");
        lIIllIlIllIII[lIIllIlIllIIl[5]] = lIllIIIIlIlIIIl("PCg8BBc5JCYA", "qmrEG");
        lIIllIlIllIII[lIIllIlIllIIl[7]] = lIllIIIIlIlIIII("yg/+UwYzoWrvfy6ugAiM9w==", "TbmzO");
        lIIllIlIllIII[lIIllIlIllIIl[9]] = lIllIIIIlIlIIIl("DzAvNSYZLlRH", "Mqaqo");
        lIIllIlIllIII[lIIllIlIllIIl[10]] = lIllIIIIlIlIIIl("KRMZDBof", "krwhs");
        lIIllIlIllIII[lIIllIlIllIIl[12]] = lIllIIIIlIlIIlI("HKyhQitbmzel2sxpqhPWkQ==", "QWQDD");
        lIIllIlIllIII[lIIllIlIllIIl[14]] = lIllIIIIlIlIIII("W7K1UobvTWA=", "MkCza");
    }

    @Override // java.lang.Enum
    public String toString() {
        String str;
        String str2 = this.name;
        if (lIllIIIIlIlIlIl(this.thieving, lIIllIlIllIIl[0])) {
            String str3 = lIIllIlIllIII[lIIllIlIllIIl[1]];
            Object[] objArr = new Object[lIIllIlIllIIl[2]];
            objArr[lIIllIlIllIIl[1]] = Integer.valueOf(this.thieving);
            str = String.format(str3, objArr);
            "".length();
            if ((((116 ^ 114) ^ (246 ^ 188)) & (((((123 + 188) - 219) + 109) ^ (((106 + 127) - 221) + 121)) ^ (-" ".length()))) >= " ".length()) {
                return null;
            }
        } else {
            str = lIIllIlIllIII[lIIllIlIllIIl[2]];
        }
        return str2 + str;
    }

    private static boolean lIllIIIIlIlIllI(int i) {
        return i != 0;
    }

    private static boolean lIllIIIIlIlIlIl(int i, int i2) {
        return i != i2;
    }

    private static String lIllIIIIlIlIIIl(String llllllllllllllIlllIllllIlllIIlIl, String llllllllllllllIlllIllllIlllIIlII) {
        String llllllllllllllIlllIllllIlllIIlIl2 = new String(Base64.getDecoder().decode(llllllllllllllIlllIllllIlllIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIlllIllllIlllIIlII.toCharArray();
        int llllllllllllllIlllIllllIlllIIIIl = lIIllIlIllIIl[1];
        char[] charArray2 = llllllllllllllIlllIllllIlllIIlIl2.toCharArray();
        int length = charArray2.length;
        int i = lIIllIlIllIIl[1];
        while (lIllIIIlIIIlIIl(i, length)) {
            char llllllllllllllIlllIllllIlllIIllI = charArray2[i];
            sb.append((char) (llllllllllllllIlllIllllIlllIIllI ^ charArray[llllllllllllllIlllIllllIlllIIIIl % charArray.length]));
            "".length();
            llllllllllllllIlllIllllIlllIIIIl++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    public NPC b(EnumC0002c enumC0002c) {
        return NPCs.getNearest(enumC0002c.p().getCenter(), npc -> {
            if (lIllIIIIlIlIllI(enumC0002c.p().contains(npc) ? 1 : 0) && lIllIIIIlIlIllI(this.name.equals(npc.getName()) ? 1 : 0) && lIllIIIIlIlIlll(npc.getCombatLevel(), this.combat)) {
                ?? r0 = lIIllIlIllIIl[2];
                "".length();
                return "  ".length() <= 0 ? ((124 ^ 32) ^ " ".length()) & (((93 ^ 45) ^ (155 ^ 182)) ^ (-" ".length())) : r0;
            }
            return lIIllIlIllIIl[1];
        });
    }

    private static void lIllIIIIlIlIlII() {
        lIIllIlIllIIl = new int[17];
        lIIllIlIllIIl[0] = -" ".length();
        lIIllIlIllIIl[1] = ((102 ^ 42) ^ (28 ^ 27)) & (((((95 + 54) - 16) + 114) ^ (((101 + 85) - 171) + 173)) ^ (-" ".length()));
        lIIllIlIllIIl[2] = " ".length();
        lIIllIlIllIIl[3] = "  ".length();
        lIIllIlIllIIl[4] = "   ".length();
        lIIllIlIllIIl[5] = 156 ^ 152;
        lIIllIlIllIIl[6] = 200 ^ 137;
        lIIllIlIllIIl[7] = 182 ^ 179;
        lIIllIlIllIIl[8] = 135 ^ 176;
        lIIllIlIllIIl[9] = 103 ^ 97;
        lIIllIlIllIIl[10] = (((89 + 19) - (-8)) + 15) ^ (((40 + 86) - 6) + 12);
        lIIllIlIllIIl[11] = 65 ^ 121;
        lIIllIlIllIIl[12] = (((175 + 68) - 97) + 59) ^ (((187 + 130) - 288) + 168);
        lIIllIlIllIIl[13] = (((236 + 108) - 300) + 193) ^ (((147 + 12) - (-1)) + 32);
        lIIllIlIllIIl[14] = 53 ^ 60;
        lIIllIlIllIIl[15] = 238 ^ 199;
        lIIllIlIllIIl[16] = 157 ^ 151;
    }
}
