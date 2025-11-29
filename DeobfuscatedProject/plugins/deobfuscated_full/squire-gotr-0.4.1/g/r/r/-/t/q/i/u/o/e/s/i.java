/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Equipment
 */
package g.r.r.-.t.q.i.u.o.e.s;

import g.r.r.-.t.q.i.u.o.e.s.c;
import g.r.r.-.t.q.i.u.o.e.s.h;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.runecrafting.SquireGOTRPlugin;
import javax.inject.Inject;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;

/* TASK: Using dragon pickaxe special -> UsingdragonpickaxespecialTask */
@TaskDesc(name="Using dragon pickaxe special", priority=13, blocking=true)
public class i
extends h {
    private static /* synthetic */ int[] llIIllIlllII;

    private static boolean llllllIlllIIII(int n2, int n3) {
        return n2 != n3;
    }

    private static void llllllIllIlllI() {
        llIIllIlllII = new int[10];
        i.llIIllIlllII[0] = 1;
        i.llIIllIlllII[1] = (0x23 ^ 0x4B ^ (0x43 ^ 0x1A)) & (0x22 ^ 0x33 ^ (0xB2 ^ 0x92) ^ -1);
        i.llIIllIlllII[2] = 0x36 ^ 0x52;
        i.llIIllIlllII[3] = 0xA8 ^ 0xB3 ^ (0xBD ^ 0xA2);
        i.llIIllIlllII[4] = 0xFFFFEEDE & 0x3FB1;
        i.llIIllIlllII[5] = -(0xFFFFA3AF & 0x5D51) & (0xFFFFDF7D & 0x7DFF);
        i.llIIllIlllII[6] = 2;
        i.llIIllIlllII[7] = 0xFFFFF7FF & 0x3BBB;
        i.llIIllIlllII[8] = 3;
        i.llIIllIlllII[9] = -(0xFFFF8FDB & 0x763D) & (0xFFFFEFFF & 0x77FF);
    }

    private static boolean llllllIllIllll(int n2) {
        return n2 == 0;
    }

    @Override
    protected boolean aj() {
        return llIIllIlllII[0];
    }

    @Inject
    public i(SquireGOTRPlugin squireGOTRPlugin) {
        c[] cArray = new c[llIIllIlllII[0]];
        cArray[i.llIIllIlllII[1]] = c.COUNTDOWN;
        super(squireGOTRPlugin, cArray);
    }

    @Override
    protected boolean ak() {
        if (!i.llllllIllIllll(Combat.isSpecEnabled() ? 1 : 0) || i.llllllIlllIIII(Combat.getSpecEnergy(), llIIllIlllII[2])) {
            return llIIllIlllII[1];
        }
        int[] nArray = new int[llIIllIlllII[3]];
        nArray[i.llIIllIlllII[1]] = llIIllIlllII[4];
        nArray[i.llIIllIlllII[0]] = llIIllIlllII[5];
        nArray[i.llIIllIlllII[6]] = llIIllIlllII[7];
        nArray[i.llIIllIlllII[8]] = llIIllIlllII[9];
        if (i.llllllIllIllll(Equipment.contains((int[])nArray) ? 1 : 0)) {
            return llIIllIlllII[1];
        }
        Combat.toggleSpec();
        return llIIllIlllII[0];
    }

    static {
        i.llllllIllIlllI();
    }
}

