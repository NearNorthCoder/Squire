/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.movement.Movement
 */
package r.r.s.u.-.s.i.e.u.u.r.i.q.c.s;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.scurrius.SquireScurrius;
import gg.squire.scurrius.SquireScurriusConfig;
import net.runelite.api.Client;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.movement.Movement;
import r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.a;
import r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.b;

@TaskDesc(name="Dodging Rockfall", priority=5000, blocking=true)
public class n
extends a {
    private static /* synthetic */ int[] lIIlIllIlIlII;
    private /* synthetic */ boolean Y;

    @Inject
    protected n(SquireScurrius squireScurrius, SquireScurriusConfig squireScurriusConfig, b b2, Client client) {
        super(squireScurrius, squireScurriusConfig, b2, client);
        this.Y = lIIlIllIlIlII[0];
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean a() {
        void var1_1;
        n llllllllllllllIllllIlIlIIlIllIlI;
        if (n.lIlIllIlIIlIlIl(this.a(this.e.getWorldLocation()) ? 1 : 0)) {
            return lIIlIllIlIlII[0];
        }
        WorldPoint llllllllllllllIllllIlIlIIlIllIIl = llllllllllllllIllllIlIlIIlIllIlI.a(lIIlIllIlIlII[1]);
        if (n.lIlIllIlIIlIllI(llllllllllllllIllllIlIlIIlIllIIl)) {
            llllllllllllllIllllIlIlIIlIllIlI.a(lIIlIllIlIlII[0]);
            "".length();
        }
        if (n.lIlIllIlIIlIllI(llllllllllllllIllllIlIlIIlIllIIl)) {
            return lIIlIllIlIlII[0];
        }
        Movement.setDestination((WorldPoint)var1_1);
        return lIIlIllIlIlII[1];
    }

    private static boolean lIlIllIlIIlIllI(Object object) {
        return object == null;
    }

    static {
        n.lIlIllIlIIlIlII();
    }

    private static boolean lIlIllIlIIlIlIl(int n2) {
        return n2 == 0;
    }

    private static void lIlIllIlIIlIlII() {
        lIIlIllIlIlII = new int[2];
        n.lIIlIllIlIlII[0] = (0xEC ^ 0xAA) & ~(3 ^ 0x45);
        n.lIIlIllIlIlII[1] = " ".length();
    }
}

