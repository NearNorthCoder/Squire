/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  net.runelite.api.Client
 */
package a.u.i.-.l.r.h.z.s.r.u.q.e;

import a.u.i.-.l.r.h.z.s.r.u.q.e.c;
import gg.squire.client.plugins.fw.Task;
import gg.squire.zulrah.SquireZulrah;
import gg.squire.zulrah.SquireZulrahConfig;
import net.runelite.api.Client;

public abstract class P
extends Task {
    protected final /* synthetic */ SquireZulrah al;
    protected final /* synthetic */ Client aj;
    private static final /* synthetic */ int ai;
    protected final /* synthetic */ SquireZulrahConfig ak;
    private final /* synthetic */ c am;
    private static /* synthetic */ int[] lIllIllIlIIlI;
    protected static final /* synthetic */ int ah;

    private static boolean llIIlIIlIIIlIIl(int n2, int n3) {
        return n2 == n3;
    }

    static {
        P.llIIlIIlIIIIlIl();
        ah = lIllIllIlIIlI[3];
        ai = lIllIllIlIIlI[2];
    }

    /*
     * WARNING - void declaration
     */
    protected boolean ah() {
        void llllllllllllllIllIIIlIlIIlllIIlI;
        int[] nArray = this.aj.getMapRegions();
        int n2 = nArray.length;
        int llllllllllllllIllIIIlIlIIlllIIIl = lIllIllIlIIlI[1];
        while (P.llIIlIIlIIIlIII(llllllllllllllIllIIIlIlIIlllIIIl, (int)llllllllllllllIllIIIlIlIIlllIIlI)) {
            void llllllllllllllIllIIIlIlIIlllIIll;
            void llllllllllllllIllIIIlIlIIlllIIII = llllllllllllllIllIIIlIlIIlllIIll[llllllllllllllIllIIIlIlIIlllIIIl];
            if (P.llIIlIIlIIIlIIl((int)llllllllllllllIllIIIlIlIIlllIIII, lIllIllIlIIlI[2])) {
                return lIllIllIlIIlI[0];
            }
            ++llllllllllllllIllIIIlIlIIlllIIIl;
            "".length();
            if (((0xFC ^ 0x8C ^ (0x61 ^ 0x2A)) & (0x95 ^ 0xAF ^ " ".length() ^ -" ".length())) <= " ".length()) continue;
            return ((0x79 ^ 0x2A ^ 22 + 41 - -58 + 6) & (0x33 ^ 0x36 ^ (0x6F ^ 0x46) ^ -" ".length())) != 0;
        }
        return lIllIllIlIIlI[1];
    }

    private static boolean llIIlIIlIIIIllI(Object object, Object object2) {
        return object == object2;
    }

    public boolean run() {
        int n2;
        if (P.llIIlIIlIIIIllI((Object)this.al.a(), (Object)this.am) && P.llIIlIIlIIIIlll(this.ac() ? 1 : 0)) {
            n2 = lIllIllIlIIlI[0];
            "".length();
            if (((0xB8 ^ 0x81) & ~(0xB3 ^ 0x8A)) < 0) {
                return ("  ".length() & ~"  ".length()) != 0;
            }
        } else {
            n2 = lIllIllIlIIlI[1];
        }
        return n2 != 0;
    }

    private static boolean llIIlIIlIIIlIII(int n2, int n3) {
        return n2 < n3;
    }

    public abstract boolean ac();

    public P(SquireZulrahConfig squireZulrahConfig, SquireZulrah squireZulrah, Client client, c c2) {
        this.ak = squireZulrahConfig;
        this.al = squireZulrah;
        this.aj = client;
        this.am = c2;
    }

    private static boolean llIIlIIlIIIIlll(int n2) {
        return n2 != 0;
    }

    private static void llIIlIIlIIIIlIl() {
        lIllIllIlIIlI = new int[4];
        P.lIllIllIlIIlI[0] = " ".length();
        P.lIllIllIlIIlI[1] = (0x54 ^ 0x11) & ~(0x42 ^ 7);
        P.lIllIllIlIIlI[2] = 0xFFFFBA6F & 0x67BF;
        P.lIllIllIlIIlI[3] = -(0xFFFFED9F & 0x326D) & (0xFFFFEFFD & 0x37FF);
    }
}

