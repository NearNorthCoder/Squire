/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.bandos.tasks;

import com.google.inject.Inject;
import gg.squire.bandos.SquireBandosConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import gg.squire.bandos.tasks.GameEnum;
import gg.squire.bandos.tasks.BandosManager;

@TaskDesc(name="Killing minions")
public class KillingMinionsTask
extends Task {
    
    private final  e aa;
    
    private final  SquireBandosConfig ab;

    static {
        q.var3();
        q.var4();
    }

    /*
     * WARNING - void declaration
     */
    private NPC N() {
        int[] nArray = new int[var2[1]];
        nArray[q.var2[0]] = b.STEELWILL.d();
        NPC nPC2 = NPCs.getNearest((int[])nArray);
        if (q.var5(nPC2) && q.var6(nPC2.isDead() ? 1 : 0)) {
            void var7;
            return var7;
        }
        int[] nArray2 = new int[var2[1]];
        nArray2[q.var2[0]] = b.STRONGSACK.d();
        NPC var8 = NPCs.getNearest((int[])nArray2);
        if (q.var5(var8) && q.var6(var8.isDead() ? 1 : 0)) {
            return var8;
        }
        return NPCs.getNearest(nPC -> {
            int n2;
            if (q.var6(nPC.isDead() ? 1 : 0) && q.var9(nPC.getId(), b.GRIMSPIKE.d())) {
                n2 = var2[1];
                0;
                if (((0x5B ^ 0x11) & ~(0xEC ^ 0xA6)) > 1) {
                    return ((0x56 ^ 0x6F) & ~(0xB2 ^ 0x8B)) != 0;
                }
            } else {
                n2 = var2[0];
            }
            return n2 != 0;
        });
    }

        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    private static boolean var16(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean var17(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        q var18;
        if (!q.var19(this.aa.t() ? 1 : 0) || q.var19(this.aa.s() ? 1 : 0)) {
            return var2[0];
        }
        NPC var20 = var18.N();
        if (q.var17(var20)) {
            return var2[0];
        }
        if (q.var5(Players.getLocal().getInteracting())) {
            return var2[0];
        }
        if (q.var19(var18.ab.useBlowpipe() ? 1 : 0)) {
            String[] stringArray = new String[var2[1]];
            stringArray[q.var2[0]] = var1[var2[0]];
            Item var21 = Inventory.getFirst((String[])stringArray);
            if (q.var5(var21)) {
                var21.interact(var1[var2[1]]);
                return var2[1];
            }
            if (q.var6(Combat.isSpecEnabled() ? 1 : 0) && q.var16(Combat.getSpecEnergy(), var2[2]) && q.var22(Combat.getMissingHealth(), var2[3])) {
                Combat.toggleSpec();
            }
        }
        var1_1.interact(var1[var2[4]]);
        this.sleep(var2[4]);
        return var2[1];
    }

    private static boolean var6(int n2) {
        return n2 == 0;
    }

    private static boolean var9(int n2, int n3) {
        return n2 == n3;
    }

        catch (Exception var28) {
            var28.printStackTrace();
            return null;
        }
    }

    private static boolean var19(int n2) {
        return n2 != 0;
    }

    private static void var4() {
        var1 = new String[var2[5]];
        q.var1[q.var2[0]] = "Toxic blowpipe";
        q.var1[q.var2[1]] = "Wield";
        q.var1[q.var2[4]] = "Attack";
    }

    private static void var3() {
        var2 = new int[7];
        q.var2[0] = (0x48 ^ 0x17 ^ (0x5E ^ 0x42)) & (0x30 ^ 0x36 ^ (0x54 ^ 0x11) ^ -1);
        q.var2[1] = 1;
        q.var2[2] = 2 ^ 0x30;
        q.var2[3] = 80 + 34 - 21 + 63 ^ 52 + 57 - 5 + 46;
        q.var2[4] = 2;
        q.var2[5] = 3;
        q.var2[6] = 0x60 ^ 0x4C ^ (0x93 ^ 0xB7);
    }

    @Inject
    public KillingMinionsTask(e e2, SquireBandosConfig squireBandosConfig) {
        this.aa = e2;
        this.ab = squireBandosConfig;
    }

    private static boolean var29(int n2, int n3) {
        return n2 < n3;
    }

    private static String var30(String var31, String var32) {
        var31 = new String(Base64.getDecoder().decode(var31.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var33 = new StringBuilder();
        char[] var34 = var32.toCharArray();
        int var35 = var2[0];
        char[] var36 = var31.toCharArray();
        int var37 = var36.length;
        int var38 = var2[0];
        while (q.var29(var38, var37)) {
            char var39 = var36[var38];
            var33.append((char)(var39 ^ var34[var35 % var34.length]));
            0;
            ++var35;
            ++var38;
            0;
            if (-3 <= 0) continue;
            return null;
        }
        return String.valueOf(var33);
    }

    private static boolean var22(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean var5(Object object) {
        return object != null;
    }
}

