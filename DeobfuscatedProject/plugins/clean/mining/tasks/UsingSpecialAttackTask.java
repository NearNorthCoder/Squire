/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.mining.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMinerConfig;
import javax.inject.Inject;
import gg.squire.mining.tasks.MiningManager;
import gg.squire.mining.tasks.GameEnum29;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@TaskDesc(name="Using Special Attack")
public class UsingSpecialAttackTask
extends Task {
    private final  T u;
    private final  SquireMinerConfig t;
    private static final  Logger s;

    static {
        k.lIIlIIlIlIIIllI();
        s = LoggerFactory.getLogger(UsingSpecialAttackTask.class);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean o() {
        int n2;
        block3: {
            block2: {
                int[] nArray = new int[lllllIIIllll[3]];
                nArray[k.lllllIIIllll[0]] = lllllIIIllll[4];
                if (!k.lIIlIIlIlIIIlll(Equipment.contains((int[])nArray) ? 1 : 0)) break block2;
                int[] nArray2 = new int[lllllIIIllll[3]];
                nArray2[k.lllllIIIllll[0]] = lllllIIIllll[5];
                if (!k.lIIlIIlIlIIIlll(Equipment.contains((int[])nArray2) ? 1 : 0)) break block2;
                int[] nArray3 = new int[lllllIIIllll[3]];
                nArray3[k.lllllIIIllll[0]] = lllllIIIllll[6];
                if (!k.lIIlIIlIlIIIlll(Equipment.contains((int[])nArray3) ? 1 : 0)) break block2;
                int[] nArray4 = new int[lllllIIIllll[3]];
                nArray4[k.lllllIIIllll[0]] = lllllIIIllll[7];
                if (!k.lIIlIIlIlIIIlll(Equipment.contains((int[])nArray4) ? 1 : 0)) break block2;
                int[] nArray5 = new int[lllllIIIllll[3]];
                nArray5[k.lllllIIIllll[0]] = lllllIIIllll[8];
                if (!k.lIIlIIlIlIIIlll(Equipment.contains((int[])nArray5) ? 1 : 0)) break block2;
                int[] nArray6 = new int[lllllIIIllll[3]];
                nArray6[k.lllllIIIllll[0]] = lllllIIIllll[9];
                if (!k.lIIlIIlIlIIIlll(Equipment.contains((int[])nArray6) ? 1 : 0)) break block2;
                int[] nArray7 = new int[lllllIIIllll[3]];
                nArray7[k.lllllIIIllll[0]] = lllllIIIllll[10];
                if (!k.lIIlIIlIlIIlIII(Equipment.contains((int[])nArray7) ? 1 : 0)) break block3;
            }
            n2 = lllllIIIllll[3];

            if (1 != (0x9A ^ 0x80 ^ (0xB5 ^ 0xAB))) return n2 != 0;
            return false;
        }
        n2 = lllllIIIllll[0];
        return n2 != 0;
    }

    private static boolean lIIlIIlIlIIlIlI(Object object, Object object2) {
        return object == object2;
    }

    public boolean run() {
        k var1;
        if (k.lIIlIIlIlIIIlll(this.o() ? 1 : 0)) {
            return lllllIIIllll[0];
        }
        if (k.lIIlIIlIlIIlIII(Inventory.isFull() ? 1 : 0)) {
            return lllllIIIllll[0];
        }
        if (k.lIIlIIlIlIIlIIl(Combat.getSpecEnergy(), lllllIIIllll[1])) {
            return lllllIIIllll[0];
        }
        Player var2 = Players.getLocal();
        if (k.lIIlIIlIlIIlIlI((Object)var1.t.activity(), (Object)a.MOTHERLODE_MINE) && k.lIIlIIlIlIIlIll(var1.u.a(var1.t.mlmArea()).distanceTo((Locatable)var2), lllllIIIllll[2])) {
            return lllllIIIllll[0];
        }
        Combat.toggleSpec();
        return lllllIIIllll[3];
    }

    private static boolean lIIlIIlIlIIlIII(int n2) {
        return n2 != 0;
    }

    @Inject
    public UsingSpecialAttackTask(SquireMinerConfig squireMinerConfig, T t2) {
        this.t = squireMinerConfig;
        this.u = t2;
    }

    private static boolean lIIlIIlIlIIlIll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIlIIlIlIIIlll(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlIIlIlIIlIIl(int n2, int n3) {
        return n2 != n3;
    }
}

