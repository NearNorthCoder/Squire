/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.GameObject
 *  net.runelite.api.Locatable
 *  net.unethicalite.api.entities.Players
 */
package g.r.r.-.t.q.i.u.o.e.s;

import g.r.r.-.t.q.i.u.o.e.s.c;
import g.r.r.-.t.q.i.u.o.e.s.h;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.runecrafting.SquireGOTRPlugin;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Base64;
import javax.inject.Inject;
import net.runelite.api.GameObject;
import net.runelite.api.Locatable;
import net.unethicalite.api.entities.Players;

@TaskDesc(name="Entering essence portal", priority=5, blocking=true)
public class w
extends h {
    private static /* synthetic */ String[] llIIlllllIIl;
    private static /* synthetic */ int[] llIIlllllIlI;

    private static String lllllllllIIIII(String lllllllllllllllIlIIlIllIIIIlIIII, String lllllllllllllllIlIIlIllIIIIIllll) {
        lllllllllllllllIlIIlIllIIIIlIIII = new String(Base64.getDecoder().decode(lllllllllllllllIlIIlIllIIIIlIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIlIllIIIIIlllI = new StringBuilder();
        char[] lllllllllllllllIlIIlIllIIIIIllIl = lllllllllllllllIlIIlIllIIIIIllll.toCharArray();
        int lllllllllllllllIlIIlIllIIIIIllII = llIIlllllIlI[1];
        char[] lllllllllllllllIlIIlIllIIIIIIllI = lllllllllllllllIlIIlIllIIIIlIIII.toCharArray();
        int lllllllllllllllIlIIlIllIIIIIIlIl = lllllllllllllllIlIIlIllIIIIIIllI.length;
        int lllllllllllllllIlIIlIllIIIIIIlII = llIIlllllIlI[1];
        while (w.lllllllllIlIll(lllllllllllllllIlIIlIllIIIIIIlII, lllllllllllllllIlIIlIllIIIIIIlIl)) {
            char lllllllllllllllIlIIlIllIIIIlIIIl = lllllllllllllllIlIIlIllIIIIIIllI[lllllllllllllllIlIIlIllIIIIIIlII];
            lllllllllllllllIlIIlIllIIIIIlllI.append((char)(lllllllllllllllIlIIlIllIIIIlIIIl ^ lllllllllllllllIlIIlIllIIIIIllIl[lllllllllllllllIlIIlIllIIIIIllII % lllllllllllllllIlIIlIllIIIIIllIl.length]));
            0;
            ++lllllllllllllllIlIIlIllIIIIIllII;
            ++lllllllllllllllIlIIlIllIIIIIIlII;
            0;
            if (3 == 3) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIIlIllIIIIIlllI);
    }

    private static boolean lllllllllIlIlI(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lllllllllIllIl(Object object) {
        return object == null;
    }

    private static void lllllllllIIlII() {
        llIIlllllIlI = new int[6];
        w.llIIlllllIlI[0] = 1;
        w.llIIlllllIlI[1] = (0xF6 ^ 0x98 ^ (0x5E ^ 0x3F)) & (160 + 83 - 145 + 78 ^ 164 + 180 - 220 + 67 ^ -1);
        w.llIIlllllIlI[2] = 3;
        w.llIIlllllIlI[3] = 8 + 0 - -68 + 84 ^ 90 + 84 - 79 + 75;
        w.llIIlllllIlI[4] = 0x26 ^ 0x51 ^ (0xF6 ^ 0x9F);
        w.llIIlllllIlI[5] = 2;
    }

    private static boolean lllllllllIlllI(Object object) {
        return object != null;
    }

    private static boolean lllllllllIlIll(int n2, int n3) {
        return n2 < n3;
    }

    private static void lllllllllIIIIl() {
        llIIlllllIIl = new String[llIIlllllIlI[0]];
        w.llIIlllllIIl[w.llIIlllllIlI[1]] = w."Enter";
    }

    @Override
    protected boolean aj() {
        return llIIlllllIlI[0];
    }

    @Override
    protected boolean ak() {
        w lllllllllllllllIlIIlIllIIIIllllI;
        if (w.lllllllllIIlll(this.aV.g() ? 1 : 0)) {
            return llIIlllllIlI[1];
        }
        if (!w.lllllllllIIlll(SquireGOTRPlugin.g.contains((Locatable)Players.getLocal()) ? 1 : 0) || w.lllllllllIlIIl(SquireGOTRPlugin.h.contains((Locatable)Players.getLocal()) ? 1 : 0)) {
            return llIIlllllIlI[1];
        }
        int lllllllllllllllIlIIlIllIIIIlllIl = lllllllllllllllIlIIlIllIIIIllllI.aV.q() - lllllllllllllllIlIIlIllIIIIllllI.aV.p();
        if (w.lllllllllIlIlI(lllllllllllllllIlIIlIllIIIIlllIl, llIIlllllIlI[2])) {
            return llIIlllllIlI[1];
        }
        if (w.lllllllllIlIll(lllllllllllllllIlIIlIllIIIIlllIl, llIIlllllIlI[3]) && w.lllllllllIllII(lllllllllllllllIlIIlIllIIIIllllI.aV.a(), llIIlllllIlI[3])) {
            return llIIlllllIlI[1];
        }
        Instant lllllllllllllllIlIIlIllIIIIlllII = lllllllllllllllIlIIlIllIIIIllllI.aV.J();
        GameObject lllllllllllllllIlIIlIllIIIIllIll = lllllllllllllllIlIIlIllIIIIllllI.aV.C();
        if (w.lllllllllIllIl(lllllllllllllllIlIIlIllIIIIllIll)) {
            return llIIlllllIlI[1];
        }
        if (!w.lllllllllIlllI(lllllllllllllllIlIIlIllIIIIlllII) || w.lllllllllIlIIl(Instant.now().isAfter(lllllllllllllllIlIIlIllIIIIlllII.plus((long)(llIIlllllIlI[4] - lllllllllllllllIlIIlIllIIIIllIll.distanceTo((Locatable)Players.getLocal()) / llIIlllllIlI[2]), ChronoUnit.SECONDS)) ? 1 : 0)) {
            return llIIlllllIlI[1];
        }
        if (w.lllllllllIIlll(lllllllllllllllIlIIlIllIIIIllllI.b(lllllllllllllllIlIIlIllIIIIllIll) ? 1 : 0)) {
            lllllllllllllllIlIIlIllIIIIllIll.interact(llIIlllllIIl[llIIlllllIlI[1]]);
            lllllllllllllllIlIIlIllIIIIllllI.c(llIIlllllIlI[5], () -> this.a(lllllllllllllllIlIIlIllIIIIllIll.getWorldLocation()));
        }
        return llIIlllllIlI[0];
    }

    private static boolean lllllllllIllII(int n2, int n3) {
        return n2 > n3;
    }

    static {
        w.lllllllllIIlII();
        w.lllllllllIIIIl();
    }

    @Inject
    public w(SquireGOTRPlugin squireGOTRPlugin) {
        c[] cArray = new c[llIIlllllIlI[0]];
        cArray[w.llIIlllllIlI[1]] = c.ACTIVE;
        super(squireGOTRPlugin, cArray);
    }

    private static boolean lllllllllIlIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lllllllllIIlll(int n2) {
        return n2 == 0;
    }
}

