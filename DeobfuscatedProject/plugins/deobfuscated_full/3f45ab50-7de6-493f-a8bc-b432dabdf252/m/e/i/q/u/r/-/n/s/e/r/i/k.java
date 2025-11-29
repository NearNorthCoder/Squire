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
package m.e.i.q.u.r.-.n.s.e.r.i;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMinerConfig;
import javax.inject.Inject;
import m.e.i.q.u.r.-.n.s.e.r.i.T;
import m.e.i.q.u.r.-.n.s.e.r.i.a;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* TASK: Using Special Attack -> UsingspecialattackTask */
@TaskDesc(name="Using Special Attack")
public class k
extends Task {
    private final /* synthetic */ T u;
    private final /* synthetic */ SquireMinerConfig t;
    private static final /* synthetic */ Logger s;
    private static /* synthetic */ int[] lllllIIIllll;

    static {
        k.lIIlIIlIlIIIllI();
        s = LoggerFactory.getLogger(k.class);
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
            0;
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

    private static void lIIlIIlIlIIIllI() {
        lllllIIIllll = new int[11];
        k.lllllIIIllll[0] = (0xC3 ^ 0x98 ^ (0xB ^ 0x54)) & (76 + 26 - 86 + 131 ^ 47 + 66 - 15 + 53 ^ -1);
        k.lllllIIIllll[1] = 0xDD ^ 0xB9;
        k.lllllIIIllll[2] = 0x72 ^ 0x77;
        k.lllllIIIllll[3] = 1;
        k.lllllIIIllll[4] = -(0xFFFFFA2E & 0x55FB) & (0xFFFFFEFB & 0x7FBD);
        k.lllllIIIllll[5] = -(0xFFFFF615 & 0xFEB) & (0xFFFFFFFF & 0x37FD);
        k.lllllIIIllll[6] = 0xFFFFDD7D & 0x7EFF;
        k.lllllIIIllll[7] = -(0xFFFFF9FD & 0x16CB) & (0xFFFFFBFC & 0x77EB);
        k.lllllIIIllll[8] = -(0xFFFF8337 & 0x7FCE) & (0xFFFFDFAD & 0x7FD7);
        k.lllllIIIllll[9] = 0xFFFFFF77 & 0x5DBF;
        k.lllllIIIllll[10] = 0xFFFFFDBA & 0x5EC7;
    }

    @Inject
    public k(SquireMinerConfig squireMinerConfig, T t2) {
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

