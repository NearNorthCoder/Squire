/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 */
package u.i.r.d.s.e.r.q.y.a.h.-;

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
import u.i.r.d.s.e.r.q.y.a.h.-.a_Unknown;

/* TASK: Restoring prayer -> RestoringprayerTask */
@TaskDesc(name="Restoring prayer", priority=20)
public class RestoringPrayerTask
extends Task {
    private final /* synthetic */ SquireAlchemicalHydraConfig as;
    private static /* synthetic */ int[] llllIIlllIll;
    private static /* synthetic */ String[] llllIIlllIlI;
    private final /* synthetic */ a ar;

    private static boolean lIIlIIIIIlIIIIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIlIIIIIlIIIlI(Object object) {
        return object == null;
    }

    private static boolean lIIlIIIIIlIIlII(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public p(a a2, SquireAlchemicalHydraConfig squireAlchemicalHydraConfig) {
        this.ar = a2;
        this.as = squireAlchemicalHydraConfig;
    }

    private static String lIIlIIIIIIlllII(String var17, String var20) {
        var17 = new String(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var19 = new StringBuilder();
        char[] var9 = var20.toCharArray();
        int var13 = llllIIlllIll[0];
        char[] var10 = var17.toCharArray();
        int var5 = var10.length;
        int var14 = llllIIlllIll[0];
        while (p.lIIlIIIIIlIIlII(var14, var5)) {
            char var12 = var10[var14];
            var19.append((char)(var12 ^ var9[var13 % var9.length]));
            0;
            ++var13;
            ++var14;
            0;
            if (1 < (0xB3 ^ 0xB7)) continue;
            return null;
        }
        return String.valueOf(var19);
    }

    private static String lIIlIIIIIIllIll(String var15, String var8) {
        try {
            SecretKeySpec var7 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var8.getBytes(StandardCharsets.UTF_8)), llllIIlllIll[5]), "DES");
            Cipher var16 = Cipher.getInstance("DES");
            var16.init(llllIIlllIll[2], var7);
            return new String(var16.doFinal(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    private static void lIIlIIIIIIllllI() {
        llllIIlllIlI = new String[llllIIlllIll[4]];
        p.llllIIlllIlI[p.llllIIlllIll[0]] = p."Drink";
        p.llllIIlllIlI[p.llllIIlllIll[1]] = p."Drink";
        p.llllIIlllIlI[p.llllIIlllIll[2]] = p."prayer";
        p.llllIIlllIlI[p.llllIIlllIll[3]] = p."restore";
    }

    static {
        p.lIIlIIIIIIlllll();
        p.lIIlIIIIIIllllI();
    }

    private static boolean lIIlIIIIIlIIIII(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        p var2;
        if (p.lIIlIIIIIlIIIII(this.ar.g() ? 1 : 0)) {
            return llllIIlllIll[0];
        }
        if (p.lIIlIIIIIlIIIIl(Skills.getBoostedLevel((Skill)Skill.PRAYER), var2.as.restorePrayAt())) {
            return llllIIlllIll[0];
        }
        Item var4 = Inventory.getFirst(item -> {
            int n2;
            String[] stringArray = new String[llllIIlllIll[1]];
            stringArray[p.llllIIlllIll[0]] = llllIIlllIlI[llllIIlllIll[1]];
            if (p.lIIlIIIIIlIIIll(item.hasAction(stringArray) ? 1 : 0) && (!p.lIIlIIIIIlIIIII(item.getName().toLowerCase().contains(llllIIlllIlI[llllIIlllIll[2]]) ? 1 : 0) || p.lIIlIIIIIlIIIll(item.getName().toLowerCase().contains(llllIIlllIlI[llllIIlllIll[3]]) ? 1 : 0))) {
                n2 = llllIIlllIll[1];
                0;
                if ((0x4A ^ 0x2D ^ (0x1A ^ 0x79)) < ((0xEA ^ 0x9D ^ (0x49 ^ 0x37)) & (0x8F ^ 0xAE ^ (0xEA ^ 0xC2) ^ -1))) {
                    return ((0x9B ^ 0xA2 ^ (0x43 ^ 0x63)) & (54 + 115 - 107 + 72 ^ 0 + 133 - 77 + 103 ^ -1)) != 0;
                }
            } else {
                n2 = llllIIlllIll[0];
            }
            return n2 != 0;
        });
        if (p.lIIlIIIIIlIIIlI(var4)) {
            return llllIIlllIll[0];
        }
        var1_1.interact(llllIIlllIlI[llllIIlllIll[0]]);
        return llllIIlllIll[1];
    }

    private static boolean lIIlIIIIIlIIIll(int n2) {
        return n2 != 0;
    }

    private static String lIIlIIIIIIlllIl(String var6, String var1) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var18 = Cipher.getInstance("Blowfish");
            var18.init(llllIIlllIll[2], var3);
            return new String(var18.doFinal(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    private static void lIIlIIIIIIlllll() {
        llllIIlllIll = new int[6];
        p.llllIIlllIll[0] = (105 + 75 - 134 + 129 ^ 71 + 111 - 147 + 143) & (99 + 55 - 27 + 17 ^ 102 + 95 - 128 + 72 ^ -1);
        p.llllIIlllIll[1] = 1;
        p.llllIIlllIll[2] = 2;
        p.llllIIlllIll[3] = 3;
        p.llllIIlllIll[4] = 0xB8 ^ 0xAC ^ (0x26 ^ 0x36);
        p.llllIIlllIll[5] = 0x68 ^ 0x60;
    }
}

