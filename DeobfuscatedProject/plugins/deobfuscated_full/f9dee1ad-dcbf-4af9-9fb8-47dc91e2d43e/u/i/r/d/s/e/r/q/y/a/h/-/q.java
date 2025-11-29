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
import u.i.r.d.s.e.r.q.y.a.h.-.a;

/* TASK: Drinking range potion -> DrinkingrangepotionTask */
@TaskDesc(name="Drinking range potion", priority=20)
public class q
extends Task {
    private static /* synthetic */ String[] llllIIlIIIll;
    private static /* synthetic */ int[] llllIIlIlIll;
    private final /* synthetic */ a at;
    private final /* synthetic */ SquireAlchemicalHydraConfig au;

    private static String lIIIlllllIIlIlI(String var5, String var7) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var11 = Cipher.getInstance("Blowfish");
            var11.init(llllIIlIlIll[4], var4);
            return new String(var11.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlllllllIIlI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIIllllllIlllI(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        q var1;
        if (q.lIIIllllllIlllI(this.at.g() ? 1 : 0)) {
            return llllIIlIlIll[0];
        }
        int var3 = Skills.getBoostedLevel((Skill)Skill.RANGED) - Skills.getLevel((Skill)Skill.RANGED);
        if (q.lIIIllllllIllll(var3, llllIIlIlIll[1])) {
            return llllIIlIlIll[0];
        }
        Item var9 = Inventory.getFirst(item -> {
            int n2;
            if (!q.lIIIllllllIlllI(item.getName().toLowerCase().contains(llllIIlIIIll[llllIIlIlIll[5]]) ? 1 : 0) || q.lIIIlllllllIIIl(item.getName().toLowerCase().contains(llllIIlIIIll[llllIIlIlIll[6]]) ? 1 : 0)) {
                n2 = llllIIlIlIll[2];
                0;
                if (3 == 0) {
                    return false;
                }
            } else {
                n2 = llllIIlIlIll[0];
            }
            return n2 != 0;
        });
        if (q.lIIIlllllllIIII(var9)) {
            return llllIIlIlIll[0];
        }
        if (q.lIIIllllllIlllI(var9.getName().contains(llllIIlIIIll[llllIIlIlIll[0]]) ? 1 : 0) && q.lIIIlllllllIIIl(var1.au.makeDivines() ? 1 : 0)) {
            String[] stringArray = new String[llllIIlIlIll[2]];
            stringArray[q.llllIIlIlIll[0]] = llllIIlIIIll[llllIIlIlIll[2]];
            if (q.lIIIlllllllIIlI(Inventory.getCount((boolean)llllIIlIlIll[2], (String[])stringArray), llllIIlIlIll[3])) {
                String[] stringArray2 = new String[llllIIlIlIll[2]];
                stringArray2[q.llllIIlIlIll[0]] = llllIIlIIIll[llllIIlIlIll[4]];
                Inventory.getFirst((String[])stringArray2).useOn(var9);
                return llllIIlIlIll[2];
            }
        }
        var2_2.interact(llllIIlIIIll[llllIIlIlIll[3]]);
        return llllIIlIlIll[2];
    }

    private static boolean lIIIllllllIllll(int n2, int n3) {
        return n2 > n3;
    }

    private static String lIIIlllllIIlIIl(String var13, String var10) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var10.getBytes(StandardCharsets.UTF_8)), llllIIlIlIll[7]), "DES");
            Cipher var12 = Cipher.getInstance("DES");
            var12.init(llllIIlIlIll[4], var2);
            return new String(var12.doFinal(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    @Inject
    public q(a a2, SquireAlchemicalHydraConfig squireAlchemicalHydraConfig) {
        this.at = a2;
        this.au = squireAlchemicalHydraConfig;
    }

    private static boolean lIIIlllllllIIIl(int n2) {
        return n2 != 0;
    }

    static {
        q.lIIIllllllIllIl();
        q.lIIIlllllIIlIll();
    }

    private static void lIIIlllllIIlIll() {
        llllIIlIIIll = new String[llllIIlIlIll[1]];
        q.llllIIlIIIll[q.llllIIlIlIll[0]] = q."Divine";
        q.llllIIlIIIll[q.llllIIlIlIll[2]] = q."Crystal dust";
        q.llllIIlIIIll[q.llllIIlIlIll[4]] = q."Crystal dust";
        q.llllIIlIIIll[q.llllIIlIlIll[3]] = q."Drink";
        q.llllIIlIIIll[q.llllIIlIlIll[5]] = q."ranging potion";
        q.llllIIlIIIll[q.llllIIlIlIll[6]] = q."bastion potion";
    }

    private static boolean lIIIlllllllIIII(Object object) {
        return object == null;
    }

    private static void lIIIllllllIllIl() {
        llllIIlIlIll = new int[8];
        q.llllIIlIlIll[0] = (0x57 ^ 0x7D) & ~(0x75 ^ 0x5F);
        q.llllIIlIlIll[1] = 0x55 ^ 0x53;
        q.llllIIlIlIll[2] = 1;
        q.llllIIlIlIll[3] = 3;
        q.llllIIlIlIll[4] = 2;
        q.llllIIlIlIll[5] = 0x37 ^ 0x2D ^ (0xD8 ^ 0xC6);
        q.llllIIlIlIll[6] = 0x56 ^ 0x53;
        q.llllIIlIlIll[7] = 0xB2 ^ 0x82 ^ (0x74 ^ 0x4C);
    }
}

