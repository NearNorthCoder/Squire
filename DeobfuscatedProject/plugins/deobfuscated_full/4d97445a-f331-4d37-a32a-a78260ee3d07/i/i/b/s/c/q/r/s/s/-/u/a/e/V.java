/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  net.runelite.api.Client
 *  net.runelite.api.Prayer
 *  net.unethicalite.client.Static
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import gg.squire.basics.cox.SquireCoxConfig;
import gg.squire.basics.cox.SquireCoxHelper;
import gg.squire.client.plugins.fw.Task;
import java.util.List;
import net.runelite.api.Client;
import net.runelite.api.Prayer;
import net.unethicalite.client.Static;

public abstract class V
extends Task {
    private static /* synthetic */ int[] lIIlIIlI;
    public static final /* synthetic */ int cp;
    protected final /* synthetic */ SquireCoxConfig cr;
    protected final /* synthetic */ SquireCoxHelper cq;

    public abstract boolean aW();

    private static boolean lIIIIlllll(int n2, int n3) {
        return n2 < n3;
    }

    static {
        V.lIIIIlllII();
        cp = lIIlIIlI[2];
    }

    public abstract int aV();

    private static boolean lIIIlIIIIl(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    private boolean aX() {
        void lllIIIIIIIllIlI;
        Client client = Static.getClient();
        int[] nArray = client.getMapRegions();
        int n2 = nArray.length;
        int lllIIIIIIIllIIl = lIIlIIlI[0];
        while (V.lIIIIlllll(lllIIIIIIIllIIl, (int)lllIIIIIIIllIlI)) {
            V lllIIIIIIIlllIl;
            void lllIIIIIIIllIll;
            void lllIIIIIIIllIII = lllIIIIIIIllIll[lllIIIIIIIllIIl];
            if (V.lIIIlIIIIl((int)lllIIIIIIIllIII, lllIIIIIIIlllIl.aV())) {
                return lIIlIIlI[1];
            }
            ++lllIIIIIIIllIIl;
            0;
            if ((0x48 ^ 0x4D) > 0) continue;
            return false;
        }
        return lIIlIIlI[0];
    }

    public V(SquireCoxHelper squireCoxHelper, SquireCoxConfig squireCoxConfig) {
        this.cq = squireCoxHelper;
        this.cr = squireCoxConfig;
    }

    public abstract List<Prayer> aU();

    private static void lIIIIlllII() {
        lIIlIIlI = new int[3];
        V.lIIlIIlI[0] = (0xF1 ^ 0xBB) & ~(0x50 ^ 0x1A);
        V.lIIlIIlI[1] = 1;
        V.lIIlIIlI[2] = 0xFFFFFDAE & 0x17F3;
    }
}

