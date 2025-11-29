/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 */
package -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f;

import -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.a;
import -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.g;
import -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.i;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.inject.Inject;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;

@TaskDesc(name="Grinding sword", priority=100, blocking=true)
public class q
extends i {
    private static /* synthetic */ int[] llIlIlIlIIll;
    private static /* synthetic */ String[] llIlIlIlIIlI;
    private static final /* synthetic */ int ap;

    private static boolean lIIIIIllIIIlllI(Object object) {
        return object == null;
    }

    private static void lIIIIIllIIIllII() {
        llIlIlIlIIll = new int[5];
        q.llIlIlIlIIll[0] = 0xFFFFACEF & 0x77FE;
        q.llIlIlIlIIll[1] = 0xF5 ^ 0xA9 ^ (0xF4 ^ 0xAC);
        q.llIlIlIlIIll[2] = " ".length();
        q.llIlIlIlIIll[3] = (0x51 ^ 0x41) & ~(0x5C ^ 0x4C);
        q.llIlIlIlIIll[4] = "  ".length();
    }

    @Override
    protected boolean M() {
        Player player = Players.getLocal();
        if (q.lIIIIIllIIIllIl(player.getAnimation(), llIlIlIlIIll[0])) {
            this.sleep(llIlIlIlIIll[1]);
            return llIlIlIlIIll[2];
        }
        return this.N();
    }

    private static void lIIIIIllIIIlIll() {
        llIlIlIlIIlI = new String[llIlIlIlIIll[4]];
        q.llIlIlIlIIlI[q.llIlIlIlIIll[3]] = q.lIIIIIllIIIlIlI("IyAhBxwXJicHHUQ7O0kWET4k", "dRHix");
        q.llIlIlIlIIlI[q.llIlIlIlIIll[2]] = q.lIIIIIllIIIlIlI("DDo9", "YIXWm");
    }

    private static boolean lIIIIIllIIIllll(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    protected boolean N() {
        TileObject tileObject = this.P.s();
        if (q.lIIIIIllIIIlllI(tileObject)) {
            Log.info((String)llIlIlIlIIlI[llIlIlIlIIll[3]]);
            return llIlIlIlIIll[3];
        }
        tileObject.interact(llIlIlIlIIlI[llIlIlIlIIll[2]]);
        this.sleep(llIlIlIlIIll[1]);
        return llIlIlIlIIll[2];
    }

    private static boolean lIIIIIllIIIllIl(int n2, int n3) {
        return n2 == n3;
    }

    @Inject
    public q(a a2) {
        super(a2, g.GRINDSTONE);
    }

    static {
        q.lIIIIIllIIIllII();
        q.lIIIIIllIIIlIll();
        ap = llIlIlIlIIll[0];
    }

    private static String lIIIIIllIIIlIlI(String lllllllllllllllIlIIIIlIlIlIlIIll, String lllllllllllllllIlIIIIlIlIlIlIlll) {
        lllllllllllllllIlIIIIlIlIlIlIIll = new String(Base64.getDecoder().decode(lllllllllllllllIlIIIIlIlIlIlIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIIIlIlIlIlIllI = new StringBuilder();
        char[] lllllllllllllllIlIIIIlIlIlIlIlIl = lllllllllllllllIlIIIIlIlIlIlIlll.toCharArray();
        int lllllllllllllllIlIIIIlIlIlIlIlII = llIlIlIlIIll[3];
        char[] lllllllllllllllIlIIIIlIlIlIIlllI = lllllllllllllllIlIIIIlIlIlIlIIll.toCharArray();
        int lllllllllllllllIlIIIIlIlIlIIllIl = lllllllllllllllIlIIIIlIlIlIIlllI.length;
        int lllllllllllllllIlIIIIlIlIlIIllII = llIlIlIlIIll[3];
        while (q.lIIIIIllIIIllll(lllllllllllllllIlIIIIlIlIlIIllII, lllllllllllllllIlIIIIlIlIlIIllIl)) {
            char lllllllllllllllIlIIIIlIlIlIllIIl = lllllllllllllllIlIIIIlIlIlIIlllI[lllllllllllllllIlIIIIlIlIlIIllII];
            lllllllllllllllIlIIIIlIlIlIlIllI.append((char)(lllllllllllllllIlIIIIlIlIlIllIIl ^ lllllllllllllllIlIIIIlIlIlIlIlIl[lllllllllllllllIlIIIIlIlIlIlIlII % lllllllllllllllIlIIIIlIlIlIlIlIl.length]));
            "".length();
            ++lllllllllllllllIlIIIIlIlIlIlIlII;
            ++lllllllllllllllIlIIIIlIlIlIIllII;
            "".length();
            if (" ".length() == " ".length()) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIIIIlIlIlIlIllI);
    }
}

