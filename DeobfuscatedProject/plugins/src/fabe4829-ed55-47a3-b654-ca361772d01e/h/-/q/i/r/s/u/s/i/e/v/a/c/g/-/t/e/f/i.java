/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.client.Static
 */
package h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.f;
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

@TaskDesc(name="Eat Task", priority=100)
public class i
extends Task {
    private static /* synthetic */ int[] llIIIllIlIll;
    private static /* synthetic */ String[] llIIIllIlIIl;

    private static boolean llllIllIIlIIll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llllIllIIlIIIl(int n2, int n3) {
        return n2 > n3;
    }

    private static void llllIllIIIIlll() {
        llIIIllIlIIl = new String[llIIIllIlIll[17]];
        i.llIIIllIlIIl[i.llIIIllIlIll[1]] = i.llllIllIIIIlII("BCUCLQ==", "RLcAH");
        i.llIIIllIlIIl[i.llIIIllIlIll[0]] = i.llllIllIIIIlII("NBAbBw==", "byzkm");
        i.llIIIllIlIIl[i.llIIIllIlIll[2]] = i.llllIllIIIIlIl("UuFK99b0aok=", "CVzmR");
        i.llIIIllIlIIl[i.llIIIllIlIll[4]] = i.llllIllIIIIlII("LxAb", "jqoUX");
        i.llIIIllIlIIl[i.llIIIllIlIll[5]] = i.llllIllIIIIlIl("f+tblxVyOy0=", "URARO");
        i.llIIIllIlIIl[i.llIIIllIlIll[7]] = i.llllIllIIIIlII("EAUPDQQ=", "Twfco");
        i.llIIIllIlIIl[i.llIIIllIlIll[6]] = i.llllIllIIIIlII("KT0fFgY=", "mOvxm");
        i.llIIIllIlIIl[i.llIIIllIlIll[9]] = i.llllIllIIIIlIl("7jIYoXpt1dg=", "atont");
        i.llIIIllIlIIl[i.llIIIllIlIll[10]] = i.llllIllIIIIlII("IQYT", "dggvs");
        i.llIIIllIlIIl[i.llIIIllIlIll[11]] = i.llllIllIIIIlIl("iMto5EHnXXk=", "efyta");
        i.llIIIllIlIIl[i.llIIIllIlIll[12]] = i.llllIllIIIIlIl("bTmoT8xa55I=", "WZSQe");
        i.llIIIllIlIIl[i.llIIIllIlIll[13]] = i.llllIllIIIIlII("KxMDAD8rEw==", "YvptP");
        i.llIIIllIlIIl[i.llIIIllIlIll[14]] = i.llllIllIIIIlII("IB8bCxMC", "pmzrv");
        i.llIIIllIlIIl[i.llIIIllIlIll[15]] = i.llllIllIIIIllI("RHRKOajddVM=", "vJVVG");
        i.llIIIllIlIIl[i.llIIIllIlIll[16]] = i.llllIllIIIIlII("CBc9FQ==", "jeXbR");
    }

    private static String llllIllIIIIlIl(String lllllllllllllllIlIlIIIllllIlIIIl, String lllllllllllllllIlIlIIIllllIlIIII) {
        try {
            SecretKeySpec lllllllllllllllIlIlIIIllllIlIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIIllllIlIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIlIIIllllIlIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIlIIIllllIlIlIl.init(llIIIllIlIll[2], lllllllllllllllIlIlIIIllllIlIllI);
            return new String(lllllllllllllllIlIlIIIllllIlIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIIllllIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIlIIIllllIlIlII) {
            lllllllllllllllIlIlIIIllllIlIlII.printStackTrace();
            return null;
        }
    }

    private static boolean llllIllIIlIlII(int n2) {
        return n2 >= 0;
    }

    public boolean run() {
        String[] stringArray = new String[llIIIllIlIll[0]];
        stringArray[i.llIIIllIlIll[1]] = llIIIllIlIIl[llIIIllIlIll[1]];
        if (i.llllIllIIIlllI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            String[] stringArray2 = new String[llIIIllIlIll[0]];
            stringArray2[i.llIIIllIlIll[1]] = llIIIllIlIIl[llIIIllIlIll[0]];
            Inventory.getFirst((String[])stringArray2).interact(llIIIllIlIIl[llIIIllIlIll[2]]);
            return llIIIllIlIll[1];
        }
        Item lllllllllllllllIlIlIIlIIIIIIIlll = Inventory.getFirst(item -> item.getName().contains(llIIIllIlIIl[llIIIllIlIll[16]]));
        if (i.llllIllIIIllll(lllllllllllllllIlIlIIlIIIIIIIlll) && (!i.llllIllIIlIIII(Combat.getMissingHealth(), llIIIllIlIll[3]) || i.llllIllIIlIIII(Skills.getBoostedLevel((Skill)Skill.ATTACK), Skills.getLevel((Skill)Skill.ATTACK)) && i.llllIllIIlIIII(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), Skills.getLevel((Skill)Skill.HITPOINTS)))) {
            Item lllllllllllllllIlIlIIlIIIIIIIllI = Inventory.getFirst(item -> {
                String[] stringArray = new String[llIIIllIlIll[0]];
                stringArray[i.llIIIllIlIll[1]] = llIIIllIlIIl[llIIIllIlIll[15]];
                return item.hasAction(stringArray);
            });
            if (i.llllIllIIIllll(lllllllllllllllIlIlIIlIIIIIIIllI)) {
                i lllllllllllllllIlIlIIlIIIIIIlIII;
                lllllllllllllllIlIlIIlIIIIIIIllI.interact(llIIIllIlIIl[llIIIllIlIll[4]]);
                lllllllllllllllIlIlIIlIIIIIIlIII.sleep(llIIIllIlIll[0]);
            }
            lllllllllllllllIlIlIIlIIIIIIIlll.interact(llIIIllIlIIl[llIIIllIlIll[5]]);
            return llIIIllIlIll[1];
        }
        Item lllllllllllllllIlIlIIlIIIIIIIllI = Inventory.getFirst(item -> {
            boolean bl;
            if (!i.llllIllIIlIlIl(item.getName().contains(llIIIllIlIIl[llIIIllIlIll[13]]) ? 1 : 0) || i.llllIllIIIlllI(item.getName().contains(llIIIllIlIIl[llIIIllIlIll[14]]) ? 1 : 0)) {
                bl = llIIIllIlIll[0];
                "".length();
                if (" ".length() >= (0x99 ^ 0x9D)) {
                    return ((0xCF ^ 0xC1) & ~(0xA6 ^ 0xA8)) != 0;
                }
            } else {
                bl = llIIIllIlIll[1];
            }
            return bl;
        });
        if (i.llllIllIIIllll(lllllllllllllllIlIlIIlIIIIIIIllI) && (!i.llllIllIIlIIIl(Prayers.getPoints(), llIIIllIlIll[6]) || i.llllIllIIlIIII(Skills.getBoostedLevel((Skill)Skill.RANGED), Skills.getLevel((Skill)Skill.RANGED)))) {
            lllllllllllllllIlIlIIlIIIIIIIllI.interact(llIIIllIlIIl[llIIIllIlIll[7]]);
            return llIIIllIlIll[1];
        }
        Item lllllllllllllllIlIlIIlIIIIIIIlIl = Inventory.getFirst(item -> {
            boolean bl;
            if (!i.llllIllIIlIlIl(item.getName().contains(llIIIllIlIIl[llIIIllIlIll[11]]) ? 1 : 0) || i.llllIllIIIlllI(item.getName().contains(llIIIllIlIIl[llIIIllIlIll[12]]) ? 1 : 0)) {
                bl = llIIIllIlIll[0];
                "".length();
                if ("   ".length() < -" ".length()) {
                    return ((0x19 ^ 0x51) & ~(0x5B ^ 0x13)) != 0;
                }
            } else {
                bl = llIIIllIlIll[1];
            }
            return bl;
        });
        if (i.llllIllIIIllll(lllllllllllllllIlIlIIlIIIIIIIlIl) && i.llllIllIIIlllI(Static.getClient().isInInstancedRegion() ? 1 : 0) && i.llllIllIIlIIlI(f.p(), llIIIllIlIll[8]) && i.llllIllIIlIIll(Skills.getBoostedLevel((Skill)Skill.RANGED), Skills.getLevel((Skill)Skill.RANGED) + llIIIllIlIll[5])) {
            lllllllllllllllIlIlIIlIIIIIIIlIl.interact(llIIIllIlIIl[llIIIllIlIll[6]]);
            return llIIIllIlIll[1];
        }
        if (i.llllIllIIlIlII(i.llllIllIIIllIl(Combat.getHealthPercent(), 58.0))) {
            return llIIIllIlIll[1];
        }
        Item lllllllllllllllIlIlIIlIIIIIIIlII = Inventory.getFirst(item -> {
            String[] stringArray = new String[llIIIllIlIll[0]];
            stringArray[i.llIIIllIlIll[1]] = llIIIllIlIIl[llIIIllIlIll[10]];
            return item.hasAction(stringArray);
        });
        if (i.llllIllIIIllll(lllllllllllllllIlIlIIlIIIIIIIlII)) {
            lllllllllllllllIlIlIIlIIIIIIIlII.interact(llIIIllIlIIl[llIIIllIlIll[9]]);
            return llIIIllIlIll[1];
        }
        return llIIIllIlIll[1];
    }

    private static int llllIllIIIllIl(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 > d3 ? 1 : -1);
    }

    private static boolean llllIllIIlIIlI(int n2, int n3) {
        return n2 >= n3;
    }

    private static void llllIllIIIllII() {
        llIIIllIlIll = new int[18];
        i.llIIIllIlIll[0] = " ".length();
        i.llIIIllIlIll[1] = (0x38 ^ 0x7E ^ (0x5D ^ 0xD)) & (0x95 ^ 0xA8 ^ (0x8E ^ 0xA5) ^ -" ".length());
        i.llIIIllIlIll[2] = "  ".length();
        i.llIIIllIlIll[3] = 0x80 ^ 0xB8 ^ (0x74 ^ 0x6C);
        i.llIIIllIlIll[4] = "   ".length();
        i.llIIIllIlIll[5] = 145 + 135 - 263 + 150 ^ 146 + 51 - 71 + 37;
        i.llIIIllIlIll[6] = 0x59 ^ 0x5F;
        i.llIIIllIlIll[7] = 0x11 ^ 0x7A ^ (7 ^ 0x69);
        i.llIIIllIlIll[8] = 0xA0 ^ 0xB4;
        i.llIIIllIlIll[9] = 62 + 120 - 56 + 10 ^ 133 + 133 - 123 + 0;
        i.llIIIllIlIll[10] = 0x14 ^ 0x1C;
        i.llIIIllIlIll[11] = 29 + 10 - -89 + 3 ^ 128 + 57 - 124 + 77;
        i.llIIIllIlIll[12] = 0x6E ^ 0x64;
        i.llIIIllIlIll[13] = 0x87 ^ 0x8C;
        i.llIIIllIlIll[14] = 0x57 ^ 0x5B;
        i.llIIIllIlIll[15] = 0x71 ^ 5 ^ (0xCC ^ 0xB5);
        i.llIIIllIlIll[16] = 0xCE ^ 0xC0;
        i.llIIIllIlIll[17] = 17 + 24 - -12 + 80 ^ 112 + 4 - 18 + 40;
    }

    private static boolean llllIllIIlIIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llllIllIIIllll(Object object) {
        return object != null;
    }

    private static String llllIllIIIIllI(String lllllllllllllllIlIlIIIllllllIllI, String lllllllllllllllIlIlIIIllllllIlIl) {
        try {
            SecretKeySpec lllllllllllllllIlIlIIIlllllllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIIllllllIlIl.getBytes(StandardCharsets.UTF_8)), llIIIllIlIll[10]), "DES");
            Cipher lllllllllllllllIlIlIIIlllllllIlI = Cipher.getInstance("DES");
            lllllllllllllllIlIlIIIlllllllIlI.init(llIIIllIlIll[2], lllllllllllllllIlIlIIIlllllllIll);
            return new String(lllllllllllllllIlIlIIIlllllllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIIllllllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIlIIIlllllllIIl) {
            lllllllllllllllIlIlIIIlllllllIIl.printStackTrace();
            return null;
        }
    }

    static {
        i.llllIllIIIllII();
        i.llllIllIIIIlll();
    }

    private static boolean llllIllIIlIlIl(int n2) {
        return n2 == 0;
    }

    private static String llllIllIIIIlII(String lllllllllllllllIlIlIIIlllllIlIII, String lllllllllllllllIlIlIIIlllllIIIlI) {
        lllllllllllllllIlIlIIIlllllIlIII = new String(Base64.getDecoder().decode(lllllllllllllllIlIlIIIlllllIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIlIIIlllllIIllI = new StringBuilder();
        char[] lllllllllllllllIlIlIIIlllllIIlIl = lllllllllllllllIlIlIIIlllllIIIlI.toCharArray();
        int lllllllllllllllIlIlIIIlllllIIlII = llIIIllIlIll[1];
        char[] lllllllllllllllIlIlIIIllllIllllI = lllllllllllllllIlIlIIIlllllIlIII.toCharArray();
        int lllllllllllllllIlIlIIIllllIlllIl = lllllllllllllllIlIlIIIllllIllllI.length;
        int lllllllllllllllIlIlIIIllllIlllII = llIIIllIlIll[1];
        while (i.llllIllIIlIIII(lllllllllllllllIlIlIIIllllIlllII, lllllllllllllllIlIlIIIllllIlllIl)) {
            char lllllllllllllllIlIlIIIlllllIlIIl = lllllllllllllllIlIlIIIllllIllllI[lllllllllllllllIlIlIIIllllIlllII];
            lllllllllllllllIlIlIIIlllllIIllI.append((char)(lllllllllllllllIlIlIIIlllllIlIIl ^ lllllllllllllllIlIlIIIlllllIIlIl[lllllllllllllllIlIlIIIlllllIIlII % lllllllllllllllIlIlIIIlllllIIlIl.length]));
            "".length();
            ++lllllllllllllllIlIlIIIlllllIIlII;
            ++lllllllllllllllIlIlIIIllllIlllII;
            "".length();
            if ("   ".length() >= -" ".length()) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIlIIIlllllIIllI);
    }

    private static boolean llllIllIIIlllI(int n2) {
        return n2 != 0;
    }
}

