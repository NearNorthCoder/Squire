package h.p000.q.i.r.s.u.s.i.e.v.a.c.g.p001.t.e.f;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.client.Static;
@TaskDesc(name = "Eat Task", priority = 100)
/* renamed from: h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.i  reason: invalid package */
/* loaded from: fabe4829-ed55-47a3-b654-ca361772d01e.jar:h/-/q/i/r/s/u/s/i/e/v/a/c/g/-/t/e/f/i.class */
public class i extends Task {
    private static /* synthetic */ int[] llIIIllIlIll;
    private static /* synthetic */ String[] llIIIllIlIIl;

    private static boolean llllIllIIlIIll(int i, int i2) {
        return i <= i2;
    }

    private static boolean llllIllIIlIIIl(int i, int i2) {
        return i > i2;
    }

    private static void llllIllIIIIlll() {
        llIIIllIlIIl = new String[llIIIllIlIll[17]];
        llIIIllIlIIl[llIIIllIlIll[1]] = llllIllIIIIlII("BCUCLQ==", "RLcAH");
        llIIIllIlIIl[llIIIllIlIll[0]] = llllIllIIIIlII("NBAbBw==", "byzkm");
        llIIIllIlIIl[llIIIllIlIll[2]] = llllIllIIIIlIl("UuFK99b0aok=", "CVzmR");
        llIIIllIlIIl[llIIIllIlIll[4]] = llllIllIIIIlII("LxAb", "jqoUX");
        llIIIllIlIIl[llIIIllIlIll[5]] = llllIllIIIIlIl("f+tblxVyOy0=", "URARO");
        llIIIllIlIIl[llIIIllIlIll[7]] = llllIllIIIIlII("EAUPDQQ=", "Twfco");
        llIIIllIlIIl[llIIIllIlIll[6]] = llllIllIIIIlII("KT0fFgY=", "mOvxm");
        llIIIllIlIIl[llIIIllIlIll[9]] = llllIllIIIIlIl("7jIYoXpt1dg=", "atont");
        llIIIllIlIIl[llIIIllIlIll[10]] = llllIllIIIIlII("IQYT", "dggvs");
        llIIIllIlIIl[llIIIllIlIll[11]] = llllIllIIIIlIl("iMto5EHnXXk=", "efyta");
        llIIIllIlIIl[llIIIllIlIll[12]] = llllIllIIIIlIl("bTmoT8xa55I=", "WZSQe");
        llIIIllIlIIl[llIIIllIlIll[13]] = llllIllIIIIlII("KxMDAD8rEw==", "YvptP");
        llIIIllIlIIl[llIIIllIlIll[14]] = llllIllIIIIlII("IB8bCxMC", "pmzrv");
        llIIIllIlIIl[llIIIllIlIll[15]] = llllIllIIIIllI("RHRKOajddVM=", "vJVVG");
        llIIIllIlIIl[llIIIllIlIll[16]] = llllIllIIIIlII("CBc9FQ==", "jeXbR");
    }

    private static String llllIllIIIIlIl(String lllllllllllllllIlIlIIIllllIlIIll, String lllllllllllllllIlIlIIIllllIlIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIIllllIlIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIIllIlIll[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIIllllIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlIIIllllIlIlII) {
            lllllllllllllllIlIlIIIllllIlIlII.printStackTrace();
            return null;
        }
    }

    private static boolean llllIllIIlIlII(int i) {
        return i >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v72, types: [boolean] */
    public boolean run() {
        String[] strArr = new String[llIIIllIlIll[0]];
        strArr[llIIIllIlIll[1]] = llIIIllIlIIl[llIIIllIlIll[1]];
        if (llllIllIIIlllI(Inventory.contains(strArr) ? 1 : 0)) {
            String[] strArr2 = new String[llIIIllIlIll[0]];
            strArr2[llIIIllIlIll[1]] = llIIIllIlIIl[llIIIllIlIll[0]];
            Inventory.getFirst(strArr2).interact(llIIIllIlIIl[llIIIllIlIll[2]]);
            return llIIIllIlIll[1];
        }
        Item first = Inventory.getFirst(item -> {
            return item.getName().contains(llIIIllIlIIl[llIIIllIlIll[16]]);
        });
        if (llllIllIIIllll(first) && (!llllIllIIlIIII(Combat.getMissingHealth(), llIIIllIlIll[3]) || (llllIllIIlIIII(Skills.getBoostedLevel(Skill.ATTACK), Skills.getLevel(Skill.ATTACK)) && llllIllIIlIIII(Skills.getBoostedLevel(Skill.HITPOINTS), Skills.getLevel(Skill.HITPOINTS))))) {
            Item first2 = Inventory.getFirst(item2 -> {
                String[] strArr3 = new String[llIIIllIlIll[0]];
                strArr3[llIIIllIlIll[1]] = llIIIllIlIIl[llIIIllIlIll[15]];
                return item2.hasAction(strArr3);
            });
            if (llllIllIIIllll(first2)) {
                first2.interact(llIIIllIlIIl[llIIIllIlIll[4]]);
                sleep(llIIIllIlIll[0]);
            }
            first.interact(llIIIllIlIIl[llIIIllIlIll[5]]);
            return llIIIllIlIll[1];
        }
        Item first3 = Inventory.getFirst(item3 -> {
            if (!llllIllIIlIlIl(item3.getName().contains(llIIIllIlIIl[llIIIllIlIll[13]]) ? 1 : 0) || llllIllIIIlllI(item3.getName().contains(llIIIllIlIIl[llIIIllIlIll[14]]) ? 1 : 0)) {
                ?? r0 = llIIIllIlIll[0];
                "".length();
                return " ".length() >= (153 ^ 157) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llIIIllIlIll[1];
        });
        if (llllIllIIIllll(first3) && (!llllIllIIlIIIl(Prayers.getPoints(), llIIIllIlIll[6]) || llllIllIIlIIII(Skills.getBoostedLevel(Skill.RANGED), Skills.getLevel(Skill.RANGED)))) {
            first3.interact(llIIIllIlIIl[llIIIllIlIll[7]]);
            return llIIIllIlIll[1];
        }
        Item first4 = Inventory.getFirst(item4 -> {
            if (!llllIllIIlIlIl(item4.getName().contains(llIIIllIlIIl[llIIIllIlIll[11]]) ? 1 : 0) || llllIllIIIlllI(item4.getName().contains(llIIIllIlIIl[llIIIllIlIll[12]]) ? 1 : 0)) {
                ?? r0 = llIIIllIlIll[0];
                "".length();
                return "   ".length() < (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llIIIllIlIll[1];
        });
        if (llllIllIIIllll(first4) && llllIllIIIlllI(Static.getClient().isInInstancedRegion() ? 1 : 0) && llllIllIIlIIlI(f.p(), llIIIllIlIll[8]) && llllIllIIlIIll(Skills.getBoostedLevel(Skill.RANGED), Skills.getLevel(Skill.RANGED) + llIIIllIlIll[5])) {
            first4.interact(llIIIllIlIIl[llIIIllIlIll[6]]);
            return llIIIllIlIll[1];
        } else if (llllIllIIlIlII(llllIllIIIllIl(Combat.getHealthPercent(), 58.0d))) {
            return llIIIllIlIll[1];
        } else {
            Item first5 = Inventory.getFirst(item5 -> {
                String[] strArr3 = new String[llIIIllIlIll[0]];
                strArr3[llIIIllIlIll[1]] = llIIIllIlIIl[llIIIllIlIll[10]];
                return item5.hasAction(strArr3);
            });
            if (llllIllIIIllll(first5)) {
                first5.interact(llIIIllIlIIl[llIIIllIlIll[9]]);
                return llIIIllIlIll[1];
            }
            return llIIIllIlIll[1];
        }
    }

    private static int llllIllIIIllIl(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static boolean llllIllIIlIIlI(int i, int i2) {
        return i >= i2;
    }

    private static void llllIllIIIllII() {
        llIIIllIlIll = new int[18];
        llIIIllIlIll[0] = " ".length();
        llIIIllIlIll[1] = ((56 ^ 126) ^ (93 ^ 13)) & (((149 ^ 168) ^ (142 ^ 165)) ^ (-" ".length()));
        llIIIllIlIll[2] = "  ".length();
        llIIIllIlIll[3] = (128 ^ 184) ^ (116 ^ 108);
        llIIIllIlIll[4] = "   ".length();
        llIIIllIlIll[5] = (((145 + 135) - 263) + 150) ^ (((146 + 51) - 71) + 37);
        llIIIllIlIll[6] = 89 ^ 95;
        llIIIllIlIll[7] = (17 ^ 122) ^ (7 ^ 105);
        llIIIllIlIll[8] = 160 ^ 180;
        llIIIllIlIll[9] = (((62 + 120) - 56) + 10) ^ (((133 + 133) - 123) + 0);
        llIIIllIlIll[10] = 20 ^ 28;
        llIIIllIlIll[11] = (((29 + 10) - (-89)) + 3) ^ (((128 + 57) - 124) + 77);
        llIIIllIlIll[12] = 110 ^ 100;
        llIIIllIlIll[13] = 135 ^ 140;
        llIIIllIlIll[14] = 87 ^ 91;
        llIIIllIlIll[15] = (113 ^ 5) ^ (204 ^ 181);
        llIIIllIlIll[16] = 206 ^ 192;
        llIIIllIlIll[17] = (((17 + 24) - (-12)) + 80) ^ (((112 + 4) - 18) + 40);
    }

    private static boolean llllIllIIlIIII(int i, int i2) {
        return i < i2;
    }

    private static boolean llllIllIIIllll(Object obj) {
        return obj != null;
    }

    private static String llllIllIIIIllI(String lllllllllllllllIlIlIIIlllllllIII, String lllllllllllllllIlIlIIIllllllIlll) {
        try {
            SecretKeySpec lllllllllllllllIlIlIIIlllllllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIIllllllIlll.getBytes(StandardCharsets.UTF_8)), llIIIllIlIll[10]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIIllIlIll[2], lllllllllllllllIlIlIIIlllllllIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIIlllllllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlIIIllllllIlII) {
            lllllllllllllllIlIlIIIllllllIlII.printStackTrace();
            return null;
        }
    }

    static {
        llllIllIIIllII();
        llllIllIIIIlll();
    }

    private static boolean llllIllIIlIlIl(int i) {
        return i == 0;
    }

    private static String llllIllIIIIlII(String lllllllllllllllIlIlIIIlllllIlIII, String lllllllllllllllIlIlIIIlllllIIlll) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlIlIIIlllllIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIlIIIlllllIIllI = new StringBuilder();
        char[] lllllllllllllllIlIlIIIlllllIIlIl = lllllllllllllllIlIlIIIlllllIIlll.toCharArray();
        int lllllllllllllllIlIlIIIlllllIIlII = llIIIllIlIll[1];
        char[] charArray = str.toCharArray();
        int lllllllllllllllIlIlIIIllllIlllIl = charArray.length;
        int i = llIIIllIlIll[1];
        while (llllIllIIlIIII(i, lllllllllllllllIlIlIIIllllIlllIl)) {
            lllllllllllllllIlIlIIIlllllIIllI.append((char) (charArray[i] ^ lllllllllllllllIlIlIIIlllllIIlIl[lllllllllllllllIlIlIIIlllllIIlII % lllllllllllllllIlIlIIIlllllIIlIl.length]));
            "".length();
            lllllllllllllllIlIlIIIlllllIIlII++;
            i++;
            "".length();
            if ("   ".length() < (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIlIIIlllllIIllI);
    }

    private static boolean llllIllIIIlllI(int i) {
        return i != 0;
    }
}
