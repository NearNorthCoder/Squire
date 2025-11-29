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
import h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.f_Unknown;
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

/* TASK: Eat Task -> EattaskTask */
@TaskDesc(name="Eat Task", priority=100)
public class EatTask
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
        i.llIIIllIlIIl[i.llIIIllIlIll[1]] = i."Vial";
        i.llIIIllIlIIl[i.llIIIllIlIll[0]] = i."Vial";
        i.llIIIllIlIIl[i.llIIIllIlIll[2]] = i."Drop";
        i.llIIIllIlIIl[i.llIIIllIlIll[4]] = i."Eat";
        i.llIIIllIlIIl[i.llIIIllIlIll[5]] = i."Drink";
        i.llIIIllIlIIl[i.llIIIllIlIll[7]] = i."Drink";
        i.llIIIllIlIIl[i.llIIIllIlIll[6]] = i."Drink";
        i.llIIIllIlIIl[i.llIIIllIlIll[9]] = i."Eat";
        i.llIIIllIlIIl[i.llIIIllIlIll[10]] = i."Eat";
        i.llIIIllIlIIl[i.llIIIllIlIll[11]] = i."Ranging";
        i.llIIIllIlIIl[i.llIIIllIlIll[12]] = i."ranging";
        i.llIIIllIlIIl[i.llIIIllIlIll[13]] = i."restore";
        i.llIIIllIlIIl[i.llIIIllIlIll[14]] = i."Prayer";
        i.llIIIllIlIIl[i.llIIIllIlIll[15]] = i."Eat";
        i.llIIIllIlIIl[i.llIIIllIlIll[16]] = i."brew";
    }

    private static String llllIllIIIIlIl(String var8, String var16) {
        try {
            SecretKeySpec var20 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var16.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var9 = Cipher.getInstance("Blowfish");
            var9.init(llIIIllIlIll[2], var20);
            return new String(var9.doFinal(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
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
        Item var22 = Inventory.getFirst(item -> item.getName().contains(llIIIllIlIIl[llIIIllIlIll[16]]));
        if (i.llllIllIIIllll(var22) && (!i.llllIllIIlIIII(Combat.getMissingHealth(), llIIIllIlIll[3]) || i.llllIllIIlIIII(Skills.getBoostedLevel((Skill)Skill.ATTACK), Skills.getLevel((Skill)Skill.ATTACK)) && i.llllIllIIlIIII(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), Skills.getLevel((Skill)Skill.HITPOINTS)))) {
            Item var7 = Inventory.getFirst(item -> {
                String[] stringArray = new String[llIIIllIlIll[0]];
                stringArray[i.llIIIllIlIll[1]] = llIIIllIlIIl[llIIIllIlIll[15]];
                return item.hasAction(stringArray);
            });
            if (i.llllIllIIIllll(var7)) {
                i var23;
                var7.interact(llIIIllIlIIl[llIIIllIlIll[4]]);
                var23.sleep(llIIIllIlIll[0]);
            }
            var22.interact(llIIIllIlIIl[llIIIllIlIll[5]]);
            return llIIIllIlIll[1];
        }
        Item var7 = Inventory.getFirst(item -> {
            boolean bl;
            if (!i.llllIllIIlIlIl(item.getName().contains(llIIIllIlIIl[llIIIllIlIll[13]]) ? 1 : 0) || i.llllIllIIIlllI(item.getName().contains(llIIIllIlIIl[llIIIllIlIll[14]]) ? 1 : 0)) {
                bl = llIIIllIlIll[0];
                0;
                if (1 >= (0x99 ^ 0x9D)) {
                    return false;
                }
            } else {
                bl = llIIIllIlIll[1];
            }
            return bl;
        });
        if (i.llllIllIIIllll(var7) && (!i.llllIllIIlIIIl(Prayers.getPoints(), llIIIllIlIll[6]) || i.llllIllIIlIIII(Skills.getBoostedLevel((Skill)Skill.RANGED), Skills.getLevel((Skill)Skill.RANGED)))) {
            var7.interact(llIIIllIlIIl[llIIIllIlIll[7]]);
            return llIIIllIlIll[1];
        }
        Item var14 = Inventory.getFirst(item -> {
            boolean bl;
            if (!i.llllIllIIlIlIl(item.getName().contains(llIIIllIlIIl[llIIIllIlIll[11]]) ? 1 : 0) || i.llllIllIIIlllI(item.getName().contains(llIIIllIlIIl[llIIIllIlIll[12]]) ? 1 : 0)) {
                bl = llIIIllIlIll[0];
                0;
                if (3 < -1) {
                    return false;
                }
            } else {
                bl = llIIIllIlIll[1];
            }
            return bl;
        });
        if (i.llllIllIIIllll(var14) && i.llllIllIIIlllI(Static.getClient().isInInstancedRegion() ? 1 : 0) && i.llllIllIIlIIlI(f.p(), llIIIllIlIll[8]) && i.llllIllIIlIIll(Skills.getBoostedLevel((Skill)Skill.RANGED), Skills.getLevel((Skill)Skill.RANGED) + llIIIllIlIll[5])) {
            var14.interact(llIIIllIlIIl[llIIIllIlIll[6]]);
            return llIIIllIlIll[1];
        }
        if (i.llllIllIIlIlII(i.llllIllIIIllIl(Combat.getHealthPercent(), 58.0))) {
            return llIIIllIlIll[1];
        }
        Item var12 = Inventory.getFirst(item -> {
            String[] stringArray = new String[llIIIllIlIll[0]];
            stringArray[i.llIIIllIlIll[1]] = llIIIllIlIIl[llIIIllIlIll[10]];
            return item.hasAction(stringArray);
        });
        if (i.llllIllIIIllll(var12)) {
            var12.interact(llIIIllIlIIl[llIIIllIlIll[9]]);
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
        i.llIIIllIlIll[0] = 1;
        i.llIIIllIlIll[1] = (0x38 ^ 0x7E ^ (0x5D ^ 0xD)) & (0x95 ^ 0xA8 ^ (0x8E ^ 0xA5) ^ -1);
        i.llIIIllIlIll[2] = 2;
        i.llIIIllIlIll[3] = 0x80 ^ 0xB8 ^ (0x74 ^ 0x6C);
        i.llIIIllIlIll[4] = 3;
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

    private static String llllIllIIIIllI(String var2, String var11) {
        try {
            SecretKeySpec var15 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var11.getBytes(StandardCharsets.UTF_8)), llIIIllIlIll[10]), "DES");
            Cipher var21 = Cipher.getInstance("DES");
            var21.init(llIIIllIlIll[2], var15);
            return new String(var21.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var24) {
            var24.printStackTrace();
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

    private static String llllIllIIIIlII(String var6, String var17) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var13 = new StringBuilder();
        char[] var4 = var17.toCharArray();
        int var10 = llIIIllIlIll[1];
        char[] var19 = var6.toCharArray();
        int var18 = var19.length;
        int var3 = llIIIllIlIll[1];
        while (i.llllIllIIlIIII(var3, var18)) {
            char var5 = var19[var3];
            var13.append((char)(var5 ^ var4[var10 % var4.length]));
            0;
            ++var10;
            ++var3;
            0;
            if (3 >= -1) continue;
            return null;
        }
        return String.valueOf(var13);
    }

    private static boolean llllIllIIIlllI(int n2) {
        return n2 != 0;
    }
}

