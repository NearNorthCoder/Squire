/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  net.runelite.api.Client
 *  net.runelite.api.coords.WorldPoint
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import net.runelite.api.Client;
import net.runelite.api.coords.WorldPoint;

public abstract class az
extends Task {
    protected /* synthetic */ WorldPoint cy;
    @Inject
    protected /* synthetic */ SquireChambersConfig k;
    @Inject
    protected /* synthetic */ SquireChambersPlugin v;
    private static /* synthetic */ int[] lIlIllIIIIIl;
    @Inject
    protected /* synthetic */ Client u;

    protected abstract boolean cg();

    public az() {
        this.cy = new WorldPoint(lIlIllIIIIIl[0], lIlIllIIIIIl[1], lIlIllIIIIIl[2]);
    }

    private static boolean llIllllllIIlll(int n2) {
        return n2 != 0;
    }

    public boolean run() {
        az lllllllllllllllIllIIllIIllIlIlIl;
        if (az.llIllllllIIlll(this.k.pause() ? 1 : 0)) {
            return lIlIllIIIIIl[2];
        }
        if (az.llIllllllIIlll(lllllllllllllllIllIIllIIllIlIlIl.u.isInInstancedRegion() ? 1 : 0)) {
            return lIlIllIIIIIl[2];
        }
        return this.cg();
    }

    private static void llIllllllIIllI() {
        lIlIllIIIIIl = new int[3];
        az.lIlIllIIIIIl[0] = 0xFFFFE4DF & 0x1FFE;
        az.lIlIllIIIIIl[1] = 0xFFFFBFFB & 0x4DEE;
        az.lIlIllIIIIIl[2] = (0xA ^ 0x1C) & ~(0x50 ^ 0x46);
    }

    static {
        az.llIllllllIIllI();
    }
}

