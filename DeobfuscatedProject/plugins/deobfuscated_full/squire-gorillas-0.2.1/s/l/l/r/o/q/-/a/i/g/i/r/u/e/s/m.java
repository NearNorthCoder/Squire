/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.unethicalite.api.Locations
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 */
package s.l.l.r.o.q.-.a.i.g.i.r.u.e.s;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.gorillas.SquireGorillaConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.Locations;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.j;

/* TASK: Restoring stats -> RestoringstatsTask */
@TaskDesc(name="Restoring stats", priority=101, blocking=true)
public class m
extends j {
    private static /* synthetic */ String[] llIIlIIllIlI;
    private static /* synthetic */ int[] llIIlIIllIll;

    private static String lllllIIllllllI(String var8, String var27) {
        var8 = new String(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var11 = new StringBuilder();
        char[] var6 = var27.toCharArray();
        int var18 = llIIlIIllIll[1];
        char[] var19 = var8.toCharArray();
        int var20 = var19.length;
        int var9 = llIIlIIllIll[1];
        while (m.lllllIlIIIIlll(var9, var20)) {
            char var13 = var19[var9];
            var11.append((char)(var13 ^ var6[var18 % var6.length]));
            0;
            ++var18;
            ++var9;
            0;
            
            return null;
        }
        return String.valueOf(var11);
    }

    /*
     * WARNING - void declaration
     */
    private boolean M() {
        int var15;
        Item var14;
        void var21;
        int n2 = llIIlIIllIll[1];
        Skill[] skillArray = Skill.values();
        int n3 = skillArray.length;
        int var1 = llIIlIIllIll[1];
        while (m.lllllIlIIIIlll(var1, (int)var21)) {
            void var4 = var14[var1];
            if (m.lllllIlIIIIlll(Skills.getBoostedLevel((Skill)var4), Skills.getLevel((Skill)var4))) {
                var15 = llIIlIIllIll[2];
            }
            ++var1;
            0;
            if (-1 < 1) continue;
            return ((0xE7 ^ 0xBB ^ (0x68 ^ 0x56)) & (75 + 7 - 27 + 112 ^ 16 + 20 - -54 + 107 ^ -1)) != 0;
        }
        if (m.lllllIlIIIIIlI(var15)) {
            return llIIlIIllIll[1];
        }
        var14 = Inventory.getFirst(item -> item.getName().toLowerCase().contains(llIIlIIllIlI[llIIlIIllIll[6]]));
        if (m.lllllIlIIIIlIl(var14)) {
            return Combat.drinkBoostingPotion((int)llIIlIIllIll[4]);
        }
        skillArray.interact(llIIlIIllIlI[llIIlIIllIll[5]]);
        return llIIlIIllIll[2];
    }

    private static void lllllIlIIIIIIl() {
        llIIlIIllIll = new int[12];
        m.llIIlIIllIll[0] = 0xFFFFF6BE & 0x2F77;
        m.llIIlIIllIll[1] = (0x5D ^ 0x5A ^ (0x12 ^ 0x1E)) & (0x70 ^ 0x26 ^ (0x1C ^ 0x41) ^ -1);
        m.llIIlIIllIll[2] = 1;
        m.llIIlIIllIll[3] = 2;
        m.llIIlIIllIll[4] = 0xB7 ^ 0xBD;
        m.llIIlIIllIll[5] = 3;
        m.llIIlIIllIll[6] = 0x3C ^ 0x38;
        m.llIIlIIllIll[7] = 0x3B ^ 0x3E;
        m.llIIlIIllIll[8] = 66 + 120 - 176 + 169 ^ 136 + 95 - 178 + 128;
        m.llIIlIIllIll[9] = 1 ^ 0x43 ^ (0xF ^ 0x4A);
        m.llIIlIIllIll[10] = 0xA5 ^ 0x9A ^ (0x73 ^ 0x44);
        m.llIIlIIllIll[11] = 0x91 ^ 0x98;
    }

    @Inject
    public m(SquireGorillaConfig squireGorillaConfig, Client client) {
        super(squireGorillaConfig, client);
    }

    public boolean run() {
        m var25;
        if (m.lllllIlIIIIIlI(Locations.isRegionLoaded((int)llIIlIIllIll[0]) ? 1 : 0)) {
            return llIIlIIllIll[1];
        }
        if (m.lllllIlIIIIIll(var25.L() ? 1 : 0)) {
            return llIIlIIllIll[2];
        }
        if (m.lllllIlIIIIIll(var25.M() ? 1 : 0)) {
            return llIIlIIllIll[2];
        }
        return this.K();
    }

    /*
     * WARNING - void declaration
     */
    private boolean L() {
        void var1_1;
        if (m.lllllIlIIIIllI(Combat.getMissingHealth())) {
            return llIIlIIllIll[1];
        }
        Item var5 = Inventory.getFirst(item -> {
            int n2;
            String[] stringArray = new String[llIIlIIllIll[2]];
            stringArray[m.llIIlIIllIll[1]] = llIIlIIllIlI[llIIlIIllIll[7]];
            if (!m.lllllIlIIIIIlI(item.hasAction(stringArray) ? 1 : 0) || m.lllllIlIIIIIll(item.getName().startsWith(llIIlIIllIlI[llIIlIIllIll[8]]) ? 1 : 0)) {
                n2 = llIIlIIllIll[2];
                0;
                if (-(0x11 ^ 0x14) >= 0) {
                    return false;
                }
            } else {
                n2 = llIIlIIllIll[1];
            }
            return n2 != 0;
        });
        if (m.lllllIlIIIIlIl(var5)) {
            return llIIlIIllIll[1];
        }
        String[] stringArray = new String[llIIlIIllIll[3]];
        stringArray[m.llIIlIIllIll[1]] = llIIlIIllIlI[llIIlIIllIll[2]];
        stringArray[m.llIIlIIllIll[2]] = llIIlIIllIlI[llIIlIIllIll[3]];
        var1_1.interact(stringArray);
        return llIIlIIllIll[2];
    }

    /*
     * WARNING - void declaration
     */
    private boolean K() {
        void var1_1;
        if (m.lllllIlIIIIlII(Skills.getBoostedLevel((Skill)Skill.PRAYER), Skills.getLevel((Skill)Skill.PRAYER))) {
            return llIIlIIllIll[1];
        }
        Item var3 = Inventory.getFirst(item -> {
            int n2;
            if (!m.lllllIlIIIIIlI(item.getName().startsWith(llIIlIIllIlI[llIIlIIllIll[9]]) ? 1 : 0) || m.lllllIlIIIIIll(item.getName().startsWith(llIIlIIllIlI[llIIlIIllIll[10]]) ? 1 : 0)) {
                n2 = llIIlIIllIll[2];
                0;
                if (2 > 2) {
                    return ((44 + 2 - -102 + 27 ^ 95 + 58 - 74 + 79) & (0xA1 ^ 0xA4 ^ (0x4E ^ 0x7A) ^ -1)) != 0;
                }
            } else {
                n2 = llIIlIIllIll[1];
            }
            return n2 != 0;
        });
        if (m.lllllIlIIIIlIl(var3)) {
            return llIIlIIllIll[1];
        }
        var1_1.interact(llIIlIIllIlI[llIIlIIllIll[1]]);
        return llIIlIIllIll[2];
    }

    private static String lllllIIlllllIl(String var16, String var22) {
        try {
            SecretKeySpec var10 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var22.getBytes(StandardCharsets.UTF_8)), llIIlIIllIll[10]), "DES");
            Cipher var7 = Cipher.getInstance("DES");
            var7.init(llIIlIIllIll[3], var10);
            return new String(var7.doFinal(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }

    private static boolean lllllIlIIIIlll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllllIlIIIIlIl(Object object) {
        return object == null;
    }

    private static boolean lllllIlIIIIllI(int n2) {
        return n2 <= 0;
    }

    private static boolean lllllIlIIIIIlI(int n2) {
        return n2 == 0;
    }

    static {
        m.lllllIlIIIIIIl();
        m.lllllIlIIIIIII();
    }

    private static String lllllIIlllllll(String var23, String var2) {
        try {
            SecretKeySpec var17 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var12 = Cipher.getInstance("Blowfish");
            var12.init(llIIlIIllIll[3], var17);
            return new String(var12.doFinal(Base64.getDecoder().decode(var23.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var24) {
            var24.printStackTrace();
            return null;
        }
    }

    private static boolean lllllIlIIIIlII(int n2, int n3) {
        return n2 >= n3;
    }

    private static void lllllIlIIIIIII() {
        llIIlIIllIlI = new String[llIIlIIllIll[11]];
        m.llIIlIIllIlI[m.llIIlIIllIll[1]] = m."Drink";
        m.llIIlIIllIlI[m.llIIlIIllIll[2]] = m."Eat";
        m.llIIlIIllIlI[m.llIIlIIllIll[3]] = m."Drink";
        m.llIIlIIllIlI[m.llIIlIIllIll[5]] = m."Drink";
        m.llIIlIIllIlI[m.llIIlIIllIll[6]] = m."restore";
        m.llIIlIIllIlI[m.llIIlIIllIll[7]] = m."Eat";
        m.llIIlIIllIlI[m.llIIlIIllIll[8]] = m."Saradomin brew";
        m.llIIlIIllIlI[m.llIIlIIllIll[9]] = m."Prayer";
        m.llIIlIIllIlI[m.llIIlIIllIll[10]] = m."Super restore";
    }

    private static boolean lllllIlIIIIIll(int n2) {
        return n2 != 0;
    }
}

