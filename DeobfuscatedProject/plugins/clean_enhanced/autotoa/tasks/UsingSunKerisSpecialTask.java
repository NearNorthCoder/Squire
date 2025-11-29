/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.GameEnum12;

@TaskDesc(name="Using sun keris special", priority=1500)
public class UsingSunKerisSpecialTask
extends AutotoaManager {
    @Inject
    protected  TOAConfig d;
    private final  C cT;

    private final  SquireAutoTOA cS;

    private static void var3() {
        var1 = new String[var2[7]];
        an.var1[an.var2[0]] = "Obelisk";
    }

    private static boolean var4(int n2, int n3) {
        return n2 >= n3;
    }

    static {
        an.var5();
        an.var3();
    }

    private static boolean var6(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var7(Object object) {
        return object != null;
    }

    private static boolean var8(int n2) {
        return n2 == 0;
    }

    private static boolean var9(int n2) {
        return n2 != 0;
    }

    private static boolean var10(int n2, int n3) {
        return n2 != n3;
    }

    @Inject
    protected UsingSunKerisSpecialTask(Client client, SquireAutoTOA squireAutoTOA, C c2) {
        super(client);
        this.cS = squireAutoTOA;
        this.cT = c2;
    }

    private static boolean var11(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean var12(int n2, int n3) {
        return n2 == n3;
    }

    private static void var5() {
        var2 = new int[9];
        an.var2[0] = (0xA1 ^ 0x94) & ~(0x65 ^ 0x50);
        an.var2[1] = -(0xFFFFC655 & 0x7BAF) & (0xFFFFEFEF & 0x7FFD);
        an.var2[2] = 0x6D ^ 9;
        an.var2[3] = 0xE3 ^ 0xC0;
        an.var2[4] = -(0xFFFF9D7D & 0x72C7) & (0xFFFFFFEF & 0x3DFE);
        an.var2[5] = 0x1E ^ 0x30;
        an.var2[6] = 0x55 ^ 0x4E;
        an.var2[7] = 1;
        an.var2[8] = 2;
    }

        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    public boolean run() {
        an var19;
        NPC nPC = this.cS.b();
        if (an.var7(nPC) && an.var9(nPC.getName().contains(var1[var2[0]]) ? 1 : 0) && an.var9(this.d.dehydration() ? 1 : 0)) {
            return var2[0];
        }
        if (an.var9(var19.aq() ? 1 : 0) && an.var8(var19.be() ? 1 : 0)) {
            if (an.var4(var19.aX(), var2[1]) && an.var6(Combat.getSpecEnergy(), var2[2]) && an.var11(Combat.getCurrentHealth(), var2[3])) {
                return var2[0];
            }
            if (an.var12(var19.aX(), var2[4])) {
                return var2[0];
            }
            if (an.var10(var19.aX(), var2[4]) && an.var9(Inventory.contains(item -> e.AMBROSIA.d(item.getId())) ? 1 : 0)) {
                return var2[0];
            }
            var19.cS.a(var2[5]);
        }
        if (an.var9(var19.be() ? 1 : 0)) {
            var19.cS.a(var2[6]);
        }
        if (an.var11(Combat.getCurrentHealth(), var19.cS.f())) {
            var19.cS.c();
            return var2[0];
        }
        return this.ba();
    }
}

