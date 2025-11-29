/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Player
 *  net.runelite.api.Prayer
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.widgets.Prayers
 */
package gg.squire.gauntlet.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.GameEnum4;
import gg.squire.gauntlet.tasks.GauntletTaskBase;
import net.runelite.api.Player;
import net.runelite.api.Prayer;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.widgets.Prayers;

@TaskDesc(priority=10, name="Turning off prayers")
public class FHelper
extends GauntletTaskBase {

    private static boolean var2(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public FHelper(c c2) {
        d[] dArray = new d[var1[0]];
        dArray[F.var1[1]] = d.FIRST_ROTATION_CREATE;
        dArray[F.var1[2]] = d.PREPARE_BOSS_FIGHT;
        dArray[F.var1[3]] = d.CREATING_T3_STAFF;
        super(c2, dArray);
    }

    static {
        F.var3();
    }

    @Override
    public boolean bf() {
        return var1[2];
    }

    private static boolean var4(int n2) {
        return n2 != 0;
    }

    private static boolean var5(int n2) {
        return n2 == 0;
    }

    private static void var3() {
        var1 = new int[4];
        F.var1[0] = 3;
        F.var1[1] = (10 + 189 - 193 + 246 ^ 10 + 124 - 73 + 100) & (51 + 57 - 24 + 73 ^ 119 + 164 - 132 + 41 ^ -1);
        F.var1[2] = 1;
        F.var1[3] = 2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean be() {
        void var6;
        F var7;
        Player player = Players.getLocal();
        if (F.var8(player)) {
            return var1[1];
        }
        if (F.var5(var7.ba.V().av().e(var6.getWorldLocation()) ? 1 : 0)) {
            return var1[1];
        }
        Prayer[] var9 = Prayer.values();
        int var10 = var9.length;
        int var11 = var1[1];
        while (F.var2(var11, var10)) {
            Prayer var12 = var9[var11];
            if (F.var4(Prayers.isEnabled((Prayer)var12) ? 1 : 0)) {
                Prayers.toggle((Prayer)var12);
                return var1[2];
            }
            ++var11;
            0;
            if (((0x6D ^ 0x70) & ~(0x29 ^ 0x34)) == 0) continue;
            return ((0x11 ^ 0x44) & ~(0x2A ^ 0x7F)) != 0;
        }
        return var1[1];
    }

    private static boolean var8(Object object) {
        return object == null;
    }
}

