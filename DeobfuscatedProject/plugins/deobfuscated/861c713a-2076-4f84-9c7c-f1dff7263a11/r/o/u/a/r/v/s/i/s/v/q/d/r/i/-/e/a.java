/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 */
package r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.vardorvis.SquireVardorvis;
import gg.squire.vardorvis.SquireVardorvisConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.b;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.e;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.g;

public abstract class a
extends Task {
    protected final /* synthetic */ Client w;
    protected /* synthetic */ NPC y;
    private static /* synthetic */ String[] lIlIlIIlIlIII;
    protected static /* synthetic */ WorldPoint p;
    protected final /* synthetic */ SquireVardorvis s;
    protected static /* synthetic */ WorldPoint r;
    protected static /* synthetic */ WorldPoint q;
    protected final /* synthetic */ SquireVardorvisConfig t;
    protected final /* synthetic */ b v;
    protected final /* synthetic */ e u;
    private static /* synthetic */ int[] lIlIlIIlIlIIl;
    protected /* synthetic */ Player x;
    protected static /* synthetic */ WorldPoint o;
    protected /* synthetic */ boolean z;

    private static boolean lIllllIlllllIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIllllIllllIlIl() {
        lIlIlIIlIlIIl = new int[6];
        a.lIlIlIIlIlIIl[0] = (0xCB ^ 0xBA ^ (0xAD ^ 0xBC)) & (9 ^ 0x4B ^ (0x73 ^ 0x51) ^ -1);
        a.lIlIlIIlIlIIl[1] = 1;
        a.lIlIlIIlIlIIl[2] = 2;
        a.lIlIlIIlIlIIl[3] = 0x64 ^ 0x61;
        a.lIlIlIIlIlIIl[4] = -(0x50 ^ 0x55);
        a.lIlIlIIlIlIIl[5] = -2;
    }

    private static void lIllllIllllIlII() {
        lIlIlIIlIlIII = new String[lIlIlIIlIlIIl[1]];
        a.lIlIlIIlIlIII[a.lIlIlIIlIlIIl[0]] = a."Vardorvis";
    }

    private static boolean lIllllIlllllIII(Object object) {
        return object != null;
    }

    protected WorldPoint o() {
        return p.dx(lIlIlIIlIlIIl[1]).dy(lIlIlIIlIlIIl[2]);
    }

    static {
        a.lIllllIllllIlIl();
        a.lIllllIllllIlII();
    }

    private static boolean lIllllIllllIlll(Object object) {
        return object == null;
    }

    protected WorldPoint m() {
        int[] nArray = new int[lIlIlIIlIlIIl[1]];
        nArray[a.lIlIlIIlIlIIl[0]] = g.R;
        TileObject tileObject = TileObjects.getNearest((int[])nArray);
        if (a.lIllllIllllIlll(tileObject)) {
            return new WorldPoint(lIlIlIIlIlIIl[0], lIlIlIIlIlIIl[0], lIlIlIIlIlIIl[0]);
        }
        return tileObject.getWorldLocation().dx(lIlIlIIlIlIIl[2]).dy(lIlIlIIlIlIIl[3]);
    }

    public boolean run() {
        a llllllllllllllIllIlIllllIlIllIlI;
        if (a.lIllllIllllIllI(this.w.isInInstancedRegion() ? 1 : 0)) {
            return lIlIlIIlIlIIl[0];
        }
        o = llllllllllllllIllIlIllllIlIllIlI.m();
        p = llllllllllllllIllIlIllllIlIllIlI.n();
        q = llllllllllllllIllIlIllllIlIllIlI.o();
        r = llllllllllllllIllIlIllllIlIllIlI.p();
        llllllllllllllIllIlIllllIlIllIlI.x = Players.getLocal();
        if (a.lIllllIllllIlll(llllllllllllllIllIlIllllIlIllIlI.x)) {
            return lIlIlIIlIlIIl[0];
        }
        llllllllllllllIllIlIllllIlIllIlI.z = lIlIlIIlIlIIl[0];
        String[] stringArray = new String[lIlIlIIlIlIIl[1]];
        stringArray[a.lIlIlIIlIlIIl[0]] = lIlIlIIlIlIII[lIlIlIIlIlIIl[0]];
        llllllllllllllIllIlIllllIlIllIlI.y = NPCs.getNearest((String[])stringArray);
        if (a.lIllllIllllIlll(llllllllllllllIllIlIllllIlIllIlI.y)) {
            return lIlIlIIlIlIIl[0];
        }
        int[] nArray = new int[lIlIlIIlIlIIl[2]];
        nArray[a.lIlIlIIlIlIIl[0]] = g.T;
        nArray[a.lIlIlIIlIlIIl[1]] = g.U;
        TileObject llllllllllllllIllIlIllllIlIllIIl = TileObjects.getNearest((int[])nArray);
        if (!a.lIllllIllllIlll(llllllllllllllIllIlIllllIlIllIIl) || a.lIllllIlllllIII(llllllllllllllIllIlIllllIlIllIlI.y.getInteracting())) {
            llllllllllllllIllIlIllllIlIllIlI.z = lIlIlIIlIlIIl[1];
        }
        return this.l();
    }

    protected WorldPoint p() {
        return p.dx(lIlIlIIlIlIIl[1]).dy(lIlIlIIlIlIIl[5]);
    }

    public abstract boolean l();

    @Inject
    protected a(SquireVardorvis squireVardorvis, SquireVardorvisConfig squireVardorvisConfig, e e2, b b2, Client client) {
        this.s = squireVardorvis;
        this.t = squireVardorvisConfig;
        this.u = e2;
        this.v = b2;
        this.w = client;
    }

    private static String lIllllIllllIIll(String llllllllllllllIllIlIllllIlIIIlll, String llllllllllllllIllIlIllllIlIIlIll) {
        llllllllllllllIllIlIllllIlIIIlll = new String(Base64.getDecoder().decode(llllllllllllllIllIlIllllIlIIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIlIllllIlIIlIlI = new StringBuilder();
        char[] llllllllllllllIllIlIllllIlIIlIIl = llllllllllllllIllIlIllllIlIIlIll.toCharArray();
        int llllllllllllllIllIlIllllIlIIlIII = lIlIlIIlIlIIl[0];
        char[] llllllllllllllIllIlIllllIlIIIIlI = llllllllllllllIllIlIllllIlIIIlll.toCharArray();
        int llllllllllllllIllIlIllllIlIIIIIl = llllllllllllllIllIlIllllIlIIIIlI.length;
        int llllllllllllllIllIlIllllIlIIIIII = lIlIlIIlIlIIl[0];
        while (a.lIllllIlllllIIl(llllllllllllllIllIlIllllIlIIIIII, llllllllllllllIllIlIllllIlIIIIIl)) {
            char llllllllllllllIllIlIllllIlIIllIl = llllllllllllllIllIlIllllIlIIIIlI[llllllllllllllIllIlIllllIlIIIIII];
            llllllllllllllIllIlIllllIlIIlIlI.append((char)(llllllllllllllIllIlIllllIlIIllIl ^ llllllllllllllIllIlIllllIlIIlIIl[llllllllllllllIllIlIllllIlIIlIII % llllllllllllllIllIlIllllIlIIlIIl.length]));
            0;
            ++llllllllllllllIllIlIllllIlIIlIII;
            ++llllllllllllllIllIlIllllIlIIIIII;
            0;
            if ((0x47 ^ 0x43) > 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIlIllllIlIIlIlI);
    }

    protected WorldPoint n() {
        return o.dx(lIlIlIIlIlIIl[4]);
    }

    private static boolean lIllllIllllIllI(int n2) {
        return n2 == 0;
    }
}

