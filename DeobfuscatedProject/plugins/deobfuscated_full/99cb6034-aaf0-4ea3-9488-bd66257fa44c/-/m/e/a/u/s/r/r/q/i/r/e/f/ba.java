/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Inventory
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import -.m.e.a.u.s.r.r.q.i.r.e.f.N;
import -.m.e.a.u.s.r.r.q.i.r.e.f.P;
import -.m.e.a.u.s.r.r.q.i.r.e.f.aX;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an;
import -.m.e.a.u.s.r.r.q.i.r.e.f.f;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmerConfig;
import java.util.Objects;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;

/* TASK: Planting seed in patch -> PlantingseedinpatchTask */
@TaskDesc(name="Planting seed in patch", priority=5, blocking=true)
public class ba
extends aX {
    private static /* synthetic */ int[] lIlllIlIIlII;

    private static boolean lllIllIIIlIIll(int n2) {
        return n2 == 0;
    }

    private static boolean lllIllIIIlIIlI(Object object, Object object2) {
        return object == object2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(N n2) {
        void var2;
        Item item = this.bR.h(n2);
        if (ba.lllIllIIIlIIIl(item)) {
            return lIlllIlIIlII[0];
        }
        if (ba.lllIllIIIlIIlI((Object)var2.aL(), (Object)P.GRAPES) && ba.lllIllIIIlIIll(Vars.getBit((int)var2.aO()))) {
            ba var3;
            int[] nArray = new int[lIlllIlIIlII[1]];
            nArray[ba.lIlllIlIIlII[0]] = lIlllIlIIlII[2];
            Item var1 = Inventory.getFirst((int[])nArray);
            if (ba.lllIllIIIlIIIl(var1)) {
                return lIlllIlIIlII[0];
            }
            Item item2 = var1;
            Objects.requireNonNull(item2);
            0;
            var3.a((N)var2, arg_0 -> ((Item)item2).useOn(arg_0));
            0;
            return lIlllIlIIlII[1];
        }
        Item item3 = item;
        Objects.requireNonNull(item3);
        0;
        return this.a(n2, arg_0 -> ((Item)item3).useOn(arg_0));
    }

    static {
        ba.lllIllIIIlIIII();
    }

    @Inject
    public ba(f f2, SquireFarmerConfig squireFarmerConfig, Client client) {
        super(f2, squireFarmerConfig, client, an::be);
    }

    private static boolean lllIllIIIlIIIl(Object object) {
        return object == null;
    }

    private static void lllIllIIIlIIII() {
        lIlllIlIIlII = new int[3];
        ba.lIlllIlIIlII[0] = (0x5E ^ 0x29 ^ (0x40 ^ 0x6A)) & (64 + 33 - 62 + 166 ^ 128 + 34 - 73 + 59 ^ -1);
        ba.lIlllIlIIlII[1] = 1;
        ba.lIlllIlIIlII[2] = 0xFFFFBFEF & 0x747D;
    }
}

