/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.widgets.Dialog
 */
package e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e;

import com.google.inject.Inject;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.J;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.b;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.d;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.sepulchre.SquireSepulchre;
import gg.squire.sepulchre.SquireSepulchreConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Dialog;

@TaskDesc(name="Enter Sepulchre", priority=25, blocking=true)
public class P
extends Task {
    private /* synthetic */ TileObject ap;
    private static /* synthetic */ String[] lllIIIlIlIIl;
    private /* synthetic */ J aq;
    private final /* synthetic */ SquireSepulchre am;
    private final /* synthetic */ SquireSepulchreConfig an;
    private static /* synthetic */ int[] lllIIIlIllII;
    private /* synthetic */ Player ai;
    private final /* synthetic */ d ao;

    private static boolean lIIIlIIlIIlIlIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIlIIlIIlIllI(int n2) {
        return n2 != 0;
    }

    @Inject
    public P(SquireSepulchre squireSepulchre, SquireSepulchreConfig squireSepulchreConfig, d d2) {
        this.an = squireSepulchreConfig;
        this.am = squireSepulchre;
        this.ao = d2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        TileObject lllllllllllllllIIllIlllIllllIlIl;
        P lllllllllllllllIIllIlllIllllIlll;
        void lllllllllllllllIIllIlllIllllIllI;
        Player player = Players.getLocal();
        if (P.lIIIlIIlIIlIlII(player)) {
            return lllIIIlIllII[0];
        }
        if (P.lIIIlIIlIIlIlIl(b.B.contains((Locatable)lllllllllllllllIIllIlllIllllIllI) ? 1 : 0)) {
            return lllIIIlIllII[0];
        }
        if (P.lIIIlIIlIIlIlIl(lllllllllllllllIIllIlllIllllIlll.am.j().matchesInventory() ? 1 : 0)) {
            return lllIIIlIllII[0];
        }
        if (P.lIIIlIIlIIlIllI(Dialog.isEnterInputOpen() ? 1 : 0)) {
            Dialog.enterAmount((int)lllIIIlIllII[0]);
        }
        if (P.lIIIlIIlIIlIlII(lllllllllllllllIIllIlllIllllIlIl = TileObjects.getNearest(tileObject -> {
            int n2;
            String[] stringArray = new String[lllIIIlIllII[1]];
            stringArray[P.lllIIIlIllII[0]] = lllIIIlIlIIl[lllIIIlIllII[1]];
            if (P.lIIIlIIlIIlIllI(tileObject.hasAction(stringArray) ? 1 : 0) && P.lIIIlIIlIIlIllI(tileObject.getName().startsWith(lllIIIlIlIIl[lllIIIlIllII[2]]) ? 1 : 0)) {
                n2 = lllIIIlIllII[1];
                "".length();
                if (-" ".length() >= "   ".length()) {
                    return ((0x2B ^ 0x20) & ~(0x9C ^ 0x97)) != 0;
                }
            } else {
                n2 = lllIIIlIllII[0];
            }
            return n2 != 0;
        }))) {
            return lllIIIlIllII[0];
        }
        var2_2.interact(lllIIIlIlIIl[lllIIIlIllII[0]]);
        return lllIIIlIllII[1];
    }

    static {
        P.lIIIlIIlIIlIIll();
        P.lIIIlIIlIIlIIlI();
    }

    private static void lIIIlIIlIIlIIlI() {
        lllIIIlIlIIl = new String[lllIIIlIllII[3]];
        P.lllIIIlIlIIl[P.lllIIIlIllII[0]] = P.lIIIlIIlIIlIIIl("KiACGihEKAQAJA==", "iLkwJ");
        P.lllIIIlIlIIl[P.lllIIIlIllII[1]] = P.lIIIlIIlIIlIIIl("MxkaCBVdERwSGQ==", "pusew");
        P.lllIIIlIlIIl[P.lllIIIlIllII[2]] = P.lIIIlIIlIIlIIIl("EjUXATky", "AAvhK");
    }

    private static String lIIIlIIlIIlIIIl(String lllllllllllllllIIllIlllIlllIlIII, String lllllllllllllllIIllIlllIlllIIIlI) {
        lllllllllllllllIIllIlllIlllIlIII = new String(Base64.getDecoder().decode(lllllllllllllllIIllIlllIlllIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIlllIlllIIllI = new StringBuilder();
        char[] lllllllllllllllIIllIlllIlllIIlIl = lllllllllllllllIIllIlllIlllIIIlI.toCharArray();
        int lllllllllllllllIIllIlllIlllIIlII = lllIIIlIllII[0];
        char[] lllllllllllllllIIllIlllIllIllllI = lllllllllllllllIIllIlllIlllIlIII.toCharArray();
        int lllllllllllllllIIllIlllIllIlllIl = lllllllllllllllIIllIlllIllIllllI.length;
        int lllllllllllllllIIllIlllIllIlllII = lllIIIlIllII[0];
        while (P.lIIIlIIlIIllIIl(lllllllllllllllIIllIlllIllIlllII, lllllllllllllllIIllIlllIllIlllIl)) {
            char lllllllllllllllIIllIlllIlllIlIIl = lllllllllllllllIIllIlllIllIllllI[lllllllllllllllIIllIlllIllIlllII];
            lllllllllllllllIIllIlllIlllIIllI.append((char)(lllllllllllllllIIllIlllIlllIlIIl ^ lllllllllllllllIIllIlllIlllIIlIl[lllllllllllllllIIllIlllIlllIIlII % lllllllllllllllIIllIlllIlllIIlIl.length]));
            "".length();
            ++lllllllllllllllIIllIlllIlllIIlII;
            ++lllllllllllllllIIllIlllIllIlllII;
            "".length();
            if (((0x52 ^ 0x18 ^ (0x1F ^ 0x72)) & (0x6D ^ 0x5A ^ (0x96 ^ 0x86) ^ -" ".length())) != " ".length()) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIllIlllIlllIIllI);
    }

    private static boolean lIIIlIIlIIllIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIIlIIlIIlIIll() {
        lllIIIlIllII = new int[4];
        P.lllIIIlIllII[0] = (0x77 ^ 0x66) & ~(0xA8 ^ 0xB9);
        P.lllIIIlIllII[1] = " ".length();
        P.lllIIIlIllII[2] = "  ".length();
        P.lllIIIlIllII[3] = "   ".length();
    }

    private static boolean lIIIlIIlIIlIlII(Object object) {
        return object == null;
    }
}

