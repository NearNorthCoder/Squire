/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 */
package q.s.r.i.e.s.o.u.a.d.n.-.b;

import com.google.inject.Inject;
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
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import q.s.r.i.e.s.o.u.a.d.n.-.b.e_Unknown;

/* TASK: Drinking range potion -> DrinkingrangepotionTask */
@TaskDesc(name="Drinking range potion")
public class DrinkingRangePotionTask
extends Task {
    private static /* synthetic */ String[] lllIIIIllll;
    private static /* synthetic */ int[] lllIIIlIIIl;
    private final /* synthetic */ e ax;

    private static boolean lIlIllIllIIlII(int n2) {
        return n2 != 0;
    }

    @Inject
    public x(e e2) {
        this.ax = e2;
    }

    private static boolean lIlIllIllIIlll(int n2) {
        return n2 == 0;
    }

    private static String lIlIllIlIllllI(String var3, String var6) {
        try {
            SecretKeySpec var10 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var1 = Cipher.getInstance("Blowfish");
            var1.init(lllIIIlIIIl[4], var10);
            return new String(var1.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var4) {
            var4.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIllIllIIlIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIllIllIIllI(Object object) {
        return object == null;
    }

    private static void lIlIllIllIIIlI() {
        lllIIIIllll = new String[lllIIIlIIIl[5]];
        x.lllIIIIllll[x.lllIIIlIIIl[0]] = x."Drink";
        x.lllIIIIllll[x.lllIIIlIIIl[3]] = x."ranging";
        x.lllIIIIllll[x.lllIIIlIIIl[4]] = x."bastion";
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        x var12;
        if (!x.lIlIllIllIIlII(this.ax.t() ? 1 : 0) || x.lIlIllIllIIlII(this.ax.s() ? 1 : 0)) {
            return lllIIIlIIIl[0];
        }
        if (x.lIlIllIllIIlIl(var12.ax.r(), lllIIIlIIIl[1])) {
            return lllIIIlIIIl[0];
        }
        Item var7 = Inventory.getFirst(item -> {
            int n2;
            if (!x.lIlIllIllIIlll(item.getName().toLowerCase().contains(lllIIIIllll[lllIIIlIIIl[3]]) ? 1 : 0) || x.lIlIllIllIIlII(item.getName().toLowerCase().contains(lllIIIIllll[lllIIIlIIIl[4]]) ? 1 : 0)) {
                n2 = lllIIIlIIIl[3];
                0;
                if ((0xAB ^ 0xAF) < 3) {
                    return false;
                }
            } else {
                n2 = lllIIIlIIIl[0];
            }
            return n2 != 0;
        });
        if (x.lIlIllIllIIllI(var7)) {
            return lllIIIlIIIl[0];
        }
        if (x.lIlIllIllIIlIl(Skills.getBoostedLevel((Skill)Skill.RANGED) - Skills.getLevel((Skill)Skill.RANGED), lllIIIlIIIl[2])) {
            return lllIIIlIIIl[0];
        }
        var1_1.interact(lllIIIIllll[lllIIIlIIIl[0]]);
        return lllIIIlIIIl[3];
    }

    private static String lIlIllIlIlllIl(String var9, String var5) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), lllIIIlIIIl[6]), "DES");
            Cipher var11 = Cipher.getInstance("DES");
            var11.init(lllIIIlIIIl[4], var2);
            return new String(var11.doFinal(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    static {
        x.lIlIllIllIIIll();
        x.lIlIllIllIIIlI();
    }

    private static void lIlIllIllIIIll() {
        lllIIIlIIIl = new int[7];
        x.lllIIIlIIIl[0] = (0xD9 ^ 0x87 ^ (0x1A ^ 0x43)) & (0x13 ^ 0x2B ^ (0x14 ^ 0x2B) ^ -1);
        x.lllIIIlIIIl[1] = 0x94 ^ 0x91;
        x.lllIIIlIIIl[2] = 0x14 ^ 0x12;
        x.lllIIIlIIIl[3] = 1;
        x.lllIIIlIIIl[4] = 2;
        x.lllIIIlIIIl[5] = 3;
        x.lllIIIlIIIl[6] = 0x9A ^ 0x95 ^ (0x43 ^ 0x44);
    }
}

