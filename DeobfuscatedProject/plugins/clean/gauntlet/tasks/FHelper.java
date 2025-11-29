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
import gg.squire.gauntlet.tasks.GameEnum38;
import gg.squire.gauntlet.tasks.GauntletTaskBase;
import net.runelite.api.Player;
import net.runelite.api.Prayer;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.widgets.Prayers;

@TaskDesc(priority=10, name="Turning off prayers")
public class FHelper
extends GauntletTaskBase {

    private static boolean lIIIIIIIlllIIII(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public FHelper(c c2) {
        d[] dArray = new d[llIlIIIIlIll[0]];
        dArray[F.llIlIIIIlIll[1]] = d.FIRST_ROTATION_CREATE;
        dArray[F.llIlIIIIlIll[2]] = d.PREPARE_BOSS_FIGHT;
        dArray[F.llIlIIIIlIll[3]] = d.CREATING_T3_STAFF;
        super(c2, dArray);
    }

    static {
        F.lIIIIIIIllIllIl();
    }

    @Override
    public boolean bf() {
        return llIlIIIIlIll[2];
    }

    private static boolean lIIIIIIIlllIIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIIIIIllIllll(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean be() {
        void var1;
        F var2;
        Player player = Players.getLocal();
        if (F.lIIIIIIIllIlllI(player)) {
            return llIlIIIIlIll[1];
        }
        if (F.lIIIIIIIllIllll(var2.ba.V().av().e(var1.getWorldLocation()) ? 1 : 0)) {
            return llIlIIIIlIll[1];
        }
        Prayer[] var3 = Prayer.values();
        int var4 = var3.length;
        int var5 = llIlIIIIlIll[1];
        while (F.lIIIIIIIlllIIII(var5, var4)) {
            Prayer var6 = var3[var5];
            if (F.lIIIIIIIlllIIIl(Prayers.isEnabled((Prayer)var6) ? 1 : 0)) {
                Prayers.toggle((Prayer)var6);
                return llIlIIIIlIll[2];
            }
            ++var5;

            if (((0x6D ^ 0x70) & ~(0x29 ^ 0x34)) == 0) continue;
            return false;
        }
        return llIlIIIIlIll[1];
    }

    private static boolean lIIIIIIIllIlllI(Object object) {
        return object == null;
    }
}

