/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.widgets.Prayers
 */
package q.i.e.u.s.s.o.e.i.n.l.f.-.r.o.-.p.-.m.r.o;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.moons.SquireMoonsOfPerilConfig;
import java.util.List;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.widgets.Prayers;

@TaskDesc(name="PrayFlick", priority=0x7FFFFFFE)
public class j
extends Task {
    /* synthetic */ WorldArea ah;
    private final /* synthetic */ SquireMoonsOfPerilConfig ag;
    private static /* synthetic */ int[] lIIIIIIIlIlIl;
    /* synthetic */ WorldArea Q;
    /* synthetic */ WorldArea ai;

    public boolean run() {
        if (j.lIIlIllIlIlIIlI(this.g(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Prayers.disableAll();
            return lIIIIIIIlIlIl[4];
        }
        List lllllllllllllllIIIllllllIlIIlllI = Prayers.getOffensive();
        if (j.lIIlIllIlIlIIll(Prayers.getPoints())) {
            Prayers.flick((List)lllllllllllllllIIIllllllIlIIlllI);
            "".length();
        }
        return lIIIIIIIlIlIl[11];
    }

    private static boolean lIIlIllIlIlIIll(int n) {
        return n > 0;
    }

    @Inject
    public j(SquireMoonsOfPerilConfig squireMoonsOfPerilConfig) {
        this.Q = new WorldArea(lIIIIIIIlIlIl[0], lIIIIIIIlIlIl[1], lIIIIIIIlIlIl[2], lIIIIIIIlIlIl[3], lIIIIIIIlIlIl[4]);
        this.ah = new WorldArea(lIIIIIIIlIlIl[5], lIIIIIIIlIlIl[1], lIIIIIIIlIlIl[6], lIIIIIIIlIlIl[7], lIIIIIIIlIlIl[4]);
        this.ai = new WorldArea(lIIIIIIIlIlIl[8], lIIIIIIIlIlIl[9], lIIIIIIIlIlIl[10], lIIIIIIIlIlIl[6], lIIIIIIIlIlIl[4]);
        this.ag = squireMoonsOfPerilConfig;
    }

    static {
        j.lIIlIllIlIlIIII();
    }

    private static boolean lIIlIllIlIlIlII(int n) {
        return n != 0;
    }

    protected boolean g(WorldPoint worldPoint) {
        int n;
        if (!j.lIIlIllIlIlIIlI(this.Q.contains(worldPoint) ? 1 : 0) || !j.lIIlIllIlIlIIlI(this.ah.contains(worldPoint) ? 1 : 0) || j.lIIlIllIlIlIlII(this.ai.contains(worldPoint) ? 1 : 0)) {
            n = lIIIIIIIlIlIl[11];
            "".length();
            if ("  ".length() != "  ".length()) {
                return ((0x6D ^ 0x26 ^ (0xE0 ^ 0xAE)) & (35 + 36 - -23 + 39 ^ 104 + 51 - 149 + 122 ^ -" ".length())) != 0;
            }
        } else {
            n = lIIIIIIIlIlIl[4];
        }
        return n != 0;
    }

    private static void lIIlIllIlIlIIII() {
        lIIIIIIIlIlIl = new int[12];
        j.lIIIIIIIlIlIl[0] = -(0xFFFFEBC7 & 0x7E79) & (0xFFFFEFFF & Short.MAX_VALUE);
        j.lIIIIIIIlIlIl[1] = 0xFFFFB5EB & 0x6F9F;
        j.lIIIIIIIlIlIl[2] = 0xA3 ^ 0x85;
        j.lIIIIIIIlIlIl[3] = 0x7E ^ 0x50;
        j.lIIIIIIIlIlIl[4] = (0x20 ^ 0x36 ^ (0x92 ^ 0xB1)) & (0xD5 ^ 0x97 ^ (0xC2 ^ 0xB5) ^ -" ".length());
        j.lIIIIIIIlIlIl[5] = -(0xFFFFFC13 & 0x7BED) & (0xFFFFFD7F & 0x7FDC);
        j.lIIIIIIIlIlIl[6] = 0x6E ^ 0x48 ^ "   ".length();
        j.lIIIIIIIlIlIl[7] = 154 + 102 - 210 + 129 ^ 15 + 65 - 12 + 65;
        j.lIIIIIIIlIlIl[8] = 0xFFFFCDCF & 0x37BB;
        j.lIIIIIIIlIlIl[9] = 0xFFFFFFBF & 0x25FF;
        j.lIIIIIIIlIlIl[10] = 0x98 ^ 0xBB ^ (0xCE ^ 0xC4);
        j.lIIIIIIIlIlIl[11] = " ".length();
    }

    private static boolean lIIlIllIlIlIIlI(int n) {
        return n == 0;
    }
}

