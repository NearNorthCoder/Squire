/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Production
 */
package gg.squire.skilling.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.skilling.BankStanderConfig;
import gg.squire.plugins.skilling.SquireBankStander;
import java.util.Map;
import javax.inject.Inject;
import gg.squire.skilling.tasks.SkillingManager;
import gg.squire.skilling.tasks.GameEnum4;
import gg.squire.skilling.tasks.GameEnum12;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Production;

@TaskDesc(name="Cutting stuff")
public class CuttingStuffTask
extends SkillingManager {

    @Override
    public Map<Integer, Integer> g() {
        if (H.var2((Object)this.j.fletchingProduct(), (Object)k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.l.ARROW_SHAFT)) {
            return Map.of(var1[0], var1[1], this.j.arrowShaftLogs().M(), var1[1]);
        }
        return Map.of(var1[0], var1[1], this.j.fletchingProduct().z(), var1[1]);
    }

    @Inject
    public CuttingStuffTask(SquireBankStander squireBankStander, BankStanderConfig bankStanderConfig) {
        super(squireBankStander, bankStanderConfig, b.FLETCH_CUTTING);
    }

    @Override
    public int i() {
        return var1[3];
    }

    private static void var3() {
        var1 = new int[4];
        H.var1[0] = 0xFFFFFBB3 & 0x7FE;
        H.var1[1] = 1;
        H.var1[2] = (0x6C ^ 0x49) & ~(0x81 ^ 0xA4);
        H.var1[3] = 21 + 33 - 22 + 98 ^ 24 + 79 - 13 + 44;
    }

    @Override
    public boolean h() {
        int n2;
        H var4;
        if (H.var5(Production.isOpen() ? 1 : 0)) {
            Production.chooseOption((int)this.j.fletchingProduct().C());
            this.sleep(this.i());
            return var1[1];
        }
        int[] nArray = new int[var1[1]];
        int n3 = var1[2];
        if (H.var2((Object)var4.j.fletchingProduct(), (Object)k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.l.ARROW_SHAFT)) {
            n2 = var4.j.arrowShaftLogs().M();
            0;
            if (((0x36 ^ 0x2A) & ~(0x8D ^ 0x91)) < 0) {
                return ((0x8E ^ 0xB4) & ~(0x62 ^ 0x58)) != 0;
            }
        } else {
            n2 = var4.j.fletchingProduct().z();
        }
        nArray[n3] = n2;
        Item item = Inventory.getFirst((int[])nArray);
        int[] nArray2 = new int[var1[1]];
        nArray2[H.var1[2]] = var1[0];
        item.useOn(Inventory.getFirst((int[])nArray2));
        return var1[1];
    }

    private static boolean var5(int n2) {
        return n2 != 0;
    }

    static {
        H.var3();
    }

    private static boolean var2(Object object, Object object2) {
        return object == object2;
    }
}

