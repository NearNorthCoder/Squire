/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Prayer
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
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
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.widgets.Prayers;

@TaskDesc(name="Prayer Flicking", priority=30000)
public class aK
extends aR {
    private static /* synthetic */ int[] lIlIlIllIIlI;

    @Override
    public boolean cg() {
        if (aK.llIllllIlIIIlI(this.ct() ? 1 : 0)) {
            if (aK.llIllllIlIIIll(Prayers.anyActive() ? 1 : 0)) {
                Prayers.disableAll();
                return lIlIlIllIIlI[0];
            }
            return lIlIlIllIIlI[1];
        }
        Prayers.flick(this.ci());
        "".length();
        return lIlIlIllIIlI[0];
    }

    @Override
    public List<Prayer> ci() {
        ArrayList<Prayer> arrayList = new ArrayList<Prayer>();
        Prayer prayer = this.ed.aE();
        if (aK.llIllllIlIIlII(prayer)) {
            prayer = Prayer.PROTECT_FROM_MAGIC;
        }
        List list = Prayers.getOffensive();
        arrayList.add(prayer);
        "".length();
        arrayList.addAll(list);
        "".length();
        return arrayList;
    }

    static {
        aK.llIllllIlIIIIl();
    }

    @Inject
    protected aK(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
    }

    private static boolean llIllllIlIIlII(Object object) {
        return object == null;
    }

    private static boolean llIllllIlIIIlI(int n2) {
        return n2 == 0;
    }

    private static void llIllllIlIIIIl() {
        lIlIlIllIIlI = new int[2];
        aK.lIlIlIllIIlI[0] = " ".length();
        aK.lIlIlIllIIlI[1] = (0x52 ^ 0x6D ^ (7 ^ 0x6F)) & (66 + 17 - -95 + 24 ^ 70 + 151 - 134 + 70 ^ -" ".length());
    }

    @Override
    public EquipmentSetup cj() {
        return null;
    }

    private static boolean llIllllIlIIIll(int n2) {
        return n2 != 0;
    }
}

