/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Prayer
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Prayers
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.aR;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.util.ArrayList;
import java.util.List;
import net.runelite.api.Client;
import net.runelite.api.Prayer;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Prayers;

@TaskDesc(name="Olm Portals", priority=25000, blocking=true)
public class aP
extends aR {
    private static /* synthetic */ int[] lIlIlIIIIlII;

    static {
        aP.llIllIllllIlIl();
    }

    private static boolean llIllIlllllIII(Object object) {
        return object == null;
    }

    private static void llIllIllllIlIl() {
        lIlIlIIIIlII = new int[2];
        aP.lIlIlIIIIlII[0] = (0x7D ^ 0x22) & ~(0x35 ^ 0x6A);
        aP.lIlIlIIIIlII[1] = " ".length();
    }

    @Override
    public EquipmentSetup cj() {
        return null;
    }

    private static boolean llIllIllllIllI(int n2) {
        return n2 == 0;
    }

    private static boolean llIllIllllIlll(int n2) {
        return n2 != 0;
    }

    @Inject
    protected aP(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean cg() {
        void var1_1;
        aP lllllllllllllllIllIlIlIIllllIlII;
        if (aP.llIllIllllIllI(this.ct() ? 1 : 0)) {
            return lIlIlIIIIlII[0];
        }
        List<WorldPoint> lllllllllllllllIllIlIlIIllllIIll = lllllllllllllllIllIlIlIIllllIlII.ed.ao();
        if (aP.llIllIllllIlll(lllllllllllllllIllIlIlIIllllIlII.ed.ao().isEmpty() ? 1 : 0)) {
            return lIlIlIIIIlII[0];
        }
        if (aP.llIllIllllIlll(lllllllllllllllIllIlIlIIllllIlII.bS.getWorldLocation().equals((Object)lllllllllllllllIllIlIlIIllllIIll.get(lIlIlIIIIlII[0])) ? 1 : 0)) {
            return lIlIlIIIIlII[1];
        }
        Movement.setDestination((WorldPoint)((WorldPoint)var1_1.get(lIlIlIIIIlII[0])));
        return lIlIlIIIIlII[1];
    }

    @Override
    public List<Prayer> ci() {
        ArrayList<Prayer> arrayList = new ArrayList<Prayer>();
        Prayer prayer = this.ed.aE();
        if (aP.llIllIlllllIII(prayer)) {
            prayer = Prayer.PROTECT_FROM_MAGIC;
        }
        List list = Prayers.getOffensive();
        arrayList.add(prayer);
        "".length();
        arrayList.addAll(list);
        "".length();
        return arrayList;
    }
}

