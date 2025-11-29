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
import gg.squire.mining.tasks.GameEnum5;
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
        k.var2();
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
                int[] nArray = new int[var1[3]];
                nArray[k.var1[0]] = var1[4];
                if (!k.var3(Equipment.contains((int[])nArray) ? 1 : 0)) break block2;
                int[] nArray2 = new int[var1[3]];
                nArray2[k.var1[0]] = var1[5];
                if (!k.var3(Equipment.contains((int[])nArray2) ? 1 : 0)) break block2;
                int[] nArray3 = new int[var1[3]];
                nArray3[k.var1[0]] = var1[6];
                if (!k.var3(Equipment.contains((int[])nArray3) ? 1 : 0)) break block2;
                int[] nArray4 = new int[var1[3]];
                nArray4[k.var1[0]] = var1[7];
                if (!k.var3(Equipment.contains((int[])nArray4) ? 1 : 0)) break block2;
                int[] nArray5 = new int[var1[3]];
                nArray5[k.var1[0]] = var1[8];
                if (!k.var3(Equipment.contains((int[])nArray5) ? 1 : 0)) break block2;
                int[] nArray6 = new int[var1[3]];
                nArray6[k.var1[0]] = var1[9];
                if (!k.var3(Equipment.contains((int[])nArray6) ? 1 : 0)) break block2;
                int[] nArray7 = new int[var1[3]];
                nArray7[k.var1[0]] = var1[10];
                if (!k.var4(Equipment.contains((int[])nArray7) ? 1 : 0)) break block3;
            }
            n2 = var1[3];
            0;
            if (1 != (0x9A ^ 0x80 ^ (0xB5 ^ 0xAB))) return n2 != 0;
            return ((49 + 36 - 5 + 138 ^ 127 + 99 - 150 + 72) & (102 + 194 - 258 + 172 ^ 98 + 82 - 48 + 24 ^ -1)) != 0;
        }
        n2 = var1[0];
        return n2 != 0;
    }

    private static boolean var5(Object object, Object object2) {
        return object == object2;
    }

    public boolean run() {
        k var6;
        if (k.var3(this.o() ? 1 : 0)) {
            return var1[0];
        }
        if (k.var4(Inventory.isFull() ? 1 : 0)) {
            return var1[0];
        }
        if (k.var7(Combat.getSpecEnergy(), var1[1])) {
            return var1[0];
        }
        Player var8 = Players.getLocal();
        if (k.var5((Object)var6.t.activity(), (Object)a.MOTHERLODE_MINE) && k.var9(var6.u.a(var6.t.mlmArea()).distanceTo((Locatable)var8), var1[2])) {
            return var1[0];
        }
        Combat.toggleSpec();
        return var1[3];
    }

    private static boolean var4(int n2) {
        return n2 != 0;
    }

    private static void var2() {
        var1 = new int[11];
        k.var1[0] = (0xC3 ^ 0x98 ^ (0xB ^ 0x54)) & (76 + 26 - 86 + 131 ^ 47 + 66 - 15 + 53 ^ -1);
        k.var1[1] = 0xDD ^ 0xB9;
        k.var1[2] = 0x72 ^ 0x77;
        k.var1[3] = 1;
        k.var1[4] = -(0xFFFFFA2E & 0x55FB) & (0xFFFFFEFB & 0x7FBD);
        k.var1[5] = -(0xFFFFF615 & 0xFEB) & (0xFFFFFFFF & 0x37FD);
        k.var1[6] = 0xFFFFDD7D & 0x7EFF;
        k.var1[7] = -(0xFFFFF9FD & 0x16CB) & (0xFFFFFBFC & 0x77EB);
        k.var1[8] = -(0xFFFF8337 & 0x7FCE) & (0xFFFFDFAD & 0x7FD7);
        k.var1[9] = 0xFFFFFF77 & 0x5DBF;
        k.var1[10] = 0xFFFFFDBA & 0x5EC7;
    }

    @Inject
    public UsingSpecialAttackTask(SquireMinerConfig squireMinerConfig, T t2) {
        this.t = squireMinerConfig;
        this.u = t2;
    }

    private static boolean var9(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean var3(int n2) {
        return n2 == 0;
    }

    private static boolean var7(int n2, int n3) {
        return n2 != n3;
    }
}

