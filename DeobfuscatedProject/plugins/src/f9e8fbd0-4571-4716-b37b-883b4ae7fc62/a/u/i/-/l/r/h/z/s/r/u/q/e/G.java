/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 */
package a.u.i.-.l.r.h.z.s.r.u.q.e;

import a.u.i.-.l.r.h.z.s.r.u.q.e.E;
import a.u.i.-.l.r.h.z.s.r.u.q.e.c;
import a.u.i.-.l.r.h.z.s.r.u.q.e.t;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrah;
import gg.squire.zulrah.SquireZulrahConfig;
import net.runelite.api.Client;

@TaskDesc(name="Walking to bank")
public class G
extends E {
    private static final /* synthetic */ int ac;
    private final /* synthetic */ SquireZulrah ad;
    private static /* synthetic */ int[] lIllIlIIIIllI;

    private boolean ag() {
        G llllllllllllllIllIIlIIIIIIIIlIIl;
        if (G.llIIIlllIlIlIlI(this.Z.isInInstancedRegion() ? 1 : 0)) {
            return lIllIlIIIIllI[0];
        }
        int[] llllllllllllllIllIIlIIIIIIIIlIII = llllllllllllllIllIIlIIIIIIIIlIIl.Z.getMapRegions();
        int llllllllllllllIllIIlIIIIIIIIIlll = llllllllllllllIllIIlIIIIIIIIlIII.length;
        int llllllllllllllIllIIlIIIIIIIIIllI = lIllIlIIIIllI[0];
        while (G.llIIIlllIlIllIl(llllllllllllllIllIIlIIIIIIIIIllI, llllllllllllllIllIIlIIIIIIIIIlll)) {
            int llllllllllllllIllIIlIIIIIIIIIlIl = llllllllllllllIllIIlIIIIIIIIlIII[llllllllllllllIllIIlIIIIIIIIIllI];
            if (!G.llIIIlllIlIlllI(llllllllllllllIllIIlIIIIIIIIIlIl, lIllIlIIIIllI[1]) || G.llIIIlllIlIllll(llllllllllllllIllIIlIIIIIIIIIlIl, lIllIlIIIIllI[2])) {
                return lIllIlIIIIllI[3];
            }
            ++llllllllllllllIllIIlIIIIIIIIIllI;
            "".length();
            if (null == null) continue;
            return ((99 + 182 - 158 + 64 ^ 119 + 80 - 141 + 111) & (14 + 64 - -22 + 52 ^ 99 + 11 - 40 + 68 ^ -" ".length())) != 0;
        }
        return lIllIlIIIIllI[0];
    }

    private static boolean llIIIlllIlIllII(int n2) {
        return n2 != 0;
    }

    static {
        G.llIIIlllIlIlIIl();
        ac = lIllIlIIIIllI[4];
    }

    @Override
    public boolean ac() {
        return lIllIlIIIIllI[0];
    }

    @Override
    public boolean run() {
        G llllllllllllllIllIIlIIIIIIIIllll;
        if (!G.llIIIlllIlIlIlI(this.ag() ? 1 : 0) || G.llIIIlllIlIlIll((Object)this.ad.a(), (Object)c.DONE)) {
            return lIllIlIIIIllI[0];
        }
        if (G.llIIIlllIlIlIlI(llllllllllllllIllIIlIIIIIIIIllll.ad.d() ? 1 : 0)) {
            return lIllIlIIIIllI[0];
        }
        if (G.llIIIlllIlIllII(llllllllllllllIllIIlIIIIIIIIllll.ad() ? 1 : 0)) {
            return lIllIlIIIIllI[0];
        }
        return this.X.bankLocation().f().getAsBoolean();
    }

    @Inject
    protected G(SquireZulrahConfig squireZulrahConfig, Client client, t t2, SquireZulrah squireZulrah) {
        super(squireZulrah, squireZulrahConfig, client, t2);
        this.ad = squireZulrah;
    }

    private static boolean llIIIlllIlIlIll(Object object, Object object2) {
        return object != object2;
    }

    private static void llIIIlllIlIlIIl() {
        lIllIlIIIIllI = new int[5];
        G.lIllIlIIIIllI[0] = (0xC ^ 0x3D ^ (0x5B ^ 0x57)) & (0x36 ^ 0x55 ^ (0x30 ^ 0x6E) ^ -" ".length());
        G.lIllIlIIIIllI[1] = 0xFFFFA737 & 0x7BF8;
        G.lIllIlIIIIllI[2] = 0xFFFFEB7F & 0x37AF;
        G.lIllIlIIIIllI[3] = " ".length();
        G.lIllIlIIIIllI[4] = 0xFFFFBBEF & 0x663F;
    }

    private static boolean llIIIlllIlIlIlI(int n2) {
        return n2 == 0;
    }

    private static boolean llIIIlllIlIlllI(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean llIIIlllIlIllll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llIIIlllIlIllIl(int n2, int n3) {
        return n2 < n3;
    }
}

