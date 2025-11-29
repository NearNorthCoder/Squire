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
package gg.squire.saradomin.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.saradomin.SquireSaraConfig;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import gg.squire.saradomin.tasks.SaradominManager;
import gg.squire.saradomin.tasks.GameEnum2;

@TaskDesc(name="Killing minions")
public class KillingMinionsTask
extends Task {

    private final  SquireSaraConfig aL;
    private final  g aK;

    @Inject
    public KillingMinionsTask(g g2, SquireSaraConfig squireSaraConfig) {
        this.aK = g2;
        this.aL = squireSaraConfig;
    }

    private static boolean var3(Object object) {
        return object != null;
    }

    private static String var4(String var5, String var6) {
        var5 = new String(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var7 = new StringBuilder();
        char[] var8 = var6.toCharArray();
        int var9 = var1[0];
        char[] var10 = var5.toCharArray();
        int var11 = var10.length;
        int var12 = var1[0];
        while (F.var13(var12, var11)) {
            char var14 = var10[var12];
            var7.append((char)(var14 ^ var8[var9 % var8.length]));
            0;
            ++var9;
            ++var12;
            0;
            if (2 > ((0x63 ^ 0x24) & ~(0xCB ^ 0x8C))) continue;
            return null;
        }
        return String.valueOf(var7);
    }

    private static void var15() {
        var2 = new String[var1[5]];
        F.var2[F.var1[0]] = "Toxic blowpipe";
        F.var2[F.var1[1]] = "Wield";
        F.var2[F.var1[4]] = "Attack";
    }

    static {
        F.var16();
        F.var15();
    }

        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }

    private static boolean var23(int n2) {
        return n2 == 0;
    }

    private static boolean var24(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean var25(Object object) {
        return object == null;
    }

    private static boolean var13(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    private NPC X() {
        int[] nArray = new int[var1[1]];
        nArray[F.var1[0]] = k.STARLIGHT.D();
        NPC nPC2 = NPCs.getNearest((int[])nArray);
        if (F.var3(nPC2) && F.var23(nPC2.isDead() ? 1 : 0)) {
            void var26;
            return var26;
        }
        int[] nArray2 = new int[var1[1]];
        nArray2[F.var1[0]] = k.GROWLER.D();
        NPC var27 = NPCs.getNearest((int[])nArray2);
        if (F.var3(var27) && F.var23(var27.isDead() ? 1 : 0)) {
            return var27;
        }
        return NPCs.getNearest(nPC -> {
            int n2;
            if (F.var23(nPC.isDead() ? 1 : 0) && F.var28(nPC.getId(), k.BREE.D())) {
                n2 = var1[1];
                0;
                if ((0x60 ^ 0x65) == 0) {
                    return (2 & ~2) != 0;
                }
            } else {
                n2 = var1[0];
            }
            return n2 != 0;
        });
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        F var29;
        if (!F.var30(this.aK.m() ? 1 : 0) || F.var30(this.aK.l() ? 1 : 0)) {
            return var1[0];
        }
        NPC var31 = var29.X();
        if (F.var25(var31)) {
            return var1[0];
        }
        if (F.var3(Players.getLocal().getInteracting())) {
            return var1[0];
        }
        if (F.var30(var29.aL.useBlowpipe() ? 1 : 0)) {
            String[] stringArray = new String[var1[1]];
            stringArray[F.var1[0]] = var2[var1[0]];
            Item var32 = Inventory.getFirst((String[])stringArray);
            if (F.var3(var32)) {
                var32.interact(var2[var1[1]]);
                return var1[1];
            }
            if (F.var23(Combat.isSpecEnabled() ? 1 : 0) && F.var33(Combat.getSpecEnergy(), var1[2]) && F.var24(Combat.getMissingHealth(), var1[3])) {
                Combat.toggleSpec();
            }
        }
        var1_1.interact(var2[var1[4]]);
        this.sleep(var1[4]);
        return var1[1];
    }

    private static void var16() {
        var1 = new int[7];
        F.var1[0] = (0xED ^ 0xA9 ^ (0x5A ^ 0x24)) & (0xAF ^ 0xA3 ^ (0x5D ^ 0x6B) ^ -1);
        F.var1[1] = 1;
        F.var1[2] = 0x27 ^ 0x15;
        F.var1[3] = 5 ^ 0xF;
        F.var1[4] = 2;
        F.var1[5] = 3;
        F.var1[6] = 0xB5 ^ 0xBD;
    }

    private static boolean var28(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var33(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean var30(int n2) {
        return n2 != 0;
    }
}

