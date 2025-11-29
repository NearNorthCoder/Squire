/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  net.runelite.api.Client
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import net.runelite.api.Client;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.Z_Unknown;

public abstract class ck_Unknown
extends Z_Unknown {
    protected static final /* synthetic */ int hT;
    protected final /* synthetic */ TOAConfig hY;
    protected static final /* synthetic */ int hU;
    protected static final /* synthetic */ int hV;
    private static /* synthetic */ int[] llIIIlIIllI;
    protected static final /* synthetic */ int hW;
    private static final /* synthetic */ int hX;

    @Inject
    protected ck(Client client, TOAConfig tOAConfig) {
        super(client);
        this.hY = tOAConfig;
    }

    private static void lIIllllIIIIIll() {
        llIIIlIIllI = new int[6];
        ck.llIIIlIIllI[0] = 0xFFFFBFCF & 0x74BE;
        ck.llIIIlIIllI[1] = (0x29 ^ 0x62) & ~(0xD1 ^ 0x9A);
        ck.llIIIlIIllI[2] = 0xA ^ 0x4D ^ (0x43 ^ 2);
        ck.llIIIlIIllI[3] = 3;
        ck.llIIIlIIllI[4] = -(0xFFFFFF97 & 0x7C69) & (0xFFFFFF5A & 0x7EFF);
        ck.llIIIlIIllI[5] = -(0xFFFFD2B6 & 0x6FFF) & (0xFFFFE7F7 & 0x3045AFD);
    }

    private static boolean lIIllllIIIIlII(int n2) {
        return n2 == 0;
    }

    public abstract boolean bl();

    public boolean run() {
        if (ck.lIIllllIIIIlII(this.j(llIIIlIIllI[0]) ? 1 : 0)) {
            return llIIIlIIllI[1];
        }
        return this.bl();
    }

    static {
        ck.lIIllllIIIIIll();
        hV = llIIIlIIllI[2];
        hX = llIIIlIIllI[0];
        hU = llIIIlIIllI[3];
        hT = llIIIlIIllI[4];
        hW = llIIIlIIllI[5];
    }
}

