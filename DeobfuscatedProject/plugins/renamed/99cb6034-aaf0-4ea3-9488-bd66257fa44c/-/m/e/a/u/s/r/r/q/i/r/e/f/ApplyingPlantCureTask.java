/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import -.m.e.a.u.s.r.r.q.i.r.e.f.N_Unknown;
import -.m.e.a.u.s.r.r.q.i.r.e.f.aX_Unknown;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an_Unknown;
import -.m.e.a.u.s.r.r.q.i.r.e.f.f_Unknown;
import -.m.e.a.u.s.r.r.q.i.r.e.f.NEnum;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmerConfig;
import java.util.Objects;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;

/* TASK: Applying plant cure -> ApplyingplantcureTask */
@TaskDesc(name="Applying plant cure", priority=6, blocking=true)
public class ApplyingPlantCureTask
extends aX_Unknown {
    private static /* synthetic */ int[] lIlllIIllllI;

    private static void lllIlIlllllIlI() {
        lIlllIIllllI = new int[5];
        aV.lIlllIIllllI[0] = 2;
        aV.lIlllIIllllI[1] = (0x2F ^ 0x76) & ~(0x7E ^ 0x27);
        aV.lIlllIIllllI[2] = 0xFFFFBFB5 & 0x57DE;
        aV.lIlllIIllllI[3] = 1;
        aV.lIlllIIllllI[4] = -(0xFFFF828B & 0x7F77) & (0xFFFFDBDF & 0x3F66);
    }

    @Inject
    public aV(f f2, SquireFarmerConfig squireFarmerConfig, Client client) {
        super(f2, squireFarmerConfig, client, (an an2) -> {
            boolean bl;
            if (aV.lllIlIllllllII((Object)an2.aZ(), (Object)n.DISEASED)) {
                bl = lIlllIIllllI[3];
                0;
                if (-(0x4D ^ 0x49) >= 0) {
                    return false;
                }
            } else {
                bl = lIlllIIllllI[1];
            }
            return bl;
        });
    }

    static {
        aV.lllIlIlllllIlI();
    }

    @Override
    public boolean J(N n2) {
        int[] nArray = new int[lIlllIIllllI[0]];
        nArray[aV.lIlllIIllllI[1]] = lIlllIIllllI[2];
        nArray[aV.lIlllIIllllI[3]] = lIlllIIllllI[4];
        Item item = Inventory.getFirst((int[])nArray);
        if (aV.lllIlIlllllIll(item)) {
            return lIlllIIllllI[1];
        }
        Item item2 = item;
        Objects.requireNonNull(item2);
        0;
        return this.a(n2, arg_0 -> ((Item)item2).useOn(arg_0));
    }

    private static boolean lllIlIllllllII(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lllIlIlllllIll(Object object) {
        return object == null;
    }
}

