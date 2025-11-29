/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.GameObject
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 */
package e.t.r.i.s.h.q.n.r.u.-.u.e;

import e.t.r.i.s.h.q.n.r.u.-.u.e.a;
import e.t.r.i.s.h.q.n.r.u.-.u.e.x;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.hunter.SquireHunterConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.inject.Inject;
import net.runelite.api.GameObject;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;

@TaskDesc(name="Jumping Pitfall Trap", priority=20, blocking=true)
public class w
extends x {
    private static /* synthetic */ String[] lllIlllllIlI;
    private static /* synthetic */ int[] lllIlllllIll;

    static {
        w.lIIIlllIIIlllll();
        w.lIIIlllIIIllllI();
    }

    private static boolean lIIIlllIIlIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIlllIIlIIIII(Object object) {
        return object == null;
    }

    private static void lIIIlllIIIllllI() {
        lllIlllllIlI = new String[lllIlllllIll[3]];
        w.lllIlllllIlI[w.lllIlllllIll[0]] = w.lIIIlllIIIlllIl("Jw8aOQ==", "mzwIL");
    }

    private static void lIIIlllIIIlllll() {
        lllIlllllIll = new int[4];
        w.lllIlllllIll[0] = (0x35 ^ 0x79) & ~(0x45 ^ 9);
        w.lllIlllllIll[1] = "  ".length();
        w.lllIlllllIll[2] = 0x2F ^ 0x29;
        w.lllIlllllIll[3] = " ".length();
    }

    private static String lIIIlllIIIlllIl(String lllllllllllllllIIlIllIllIIlIIIlI, String lllllllllllllllIIlIllIllIIIlllII) {
        lllllllllllllllIIlIllIllIIlIIIlI = new String(Base64.getDecoder().decode(lllllllllllllllIIlIllIllIIlIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIllIllIIlIIIII = new StringBuilder();
        char[] lllllllllllllllIIlIllIllIIIlllll = lllllllllllllllIIlIllIllIIIlllII.toCharArray();
        int lllllllllllllllIIlIllIllIIIllllI = lllIlllllIll[0];
        char[] lllllllllllllllIIlIllIllIIIllIII = lllllllllllllllIIlIllIllIIlIIIlI.toCharArray();
        int lllllllllllllllIIlIllIllIIIlIlll = lllllllllllllllIIlIllIllIIIllIII.length;
        int lllllllllllllllIIlIllIllIIIlIllI = lllIlllllIll[0];
        while (w.lIIIlllIIlIIIlI(lllllllllllllllIIlIllIllIIIlIllI, lllllllllllllllIIlIllIllIIIlIlll)) {
            char lllllllllllllllIIlIllIllIIlIIIll = lllllllllllllllIIlIllIllIIIllIII[lllllllllllllllIIlIllIllIIIlIllI];
            lllllllllllllllIIlIllIllIIlIIIII.append((char)(lllllllllllllllIIlIllIllIIlIIIll ^ lllllllllllllllIIlIllIllIIIlllll[lllllllllllllllIIlIllIllIIIllllI % lllllllllllllllIIlIllIllIIIlllll.length]));
            "".length();
            ++lllllllllllllllIIlIllIllIIIllllI;
            ++lllllllllllllllIIlIllIllIIIlIllI;
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlIllIllIIlIIIII);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected boolean x() {
        void lllllllllllllllIIlIllIllIIlIlllI;
        w lllllllllllllllIIlIllIllIIlIllll;
        TileObject tileObject = this.F();
        if (w.lIIIlllIIlIIIII(tileObject)) {
            return lllIlllllIll[0];
        }
        NPC lllllllllllllllIIlIllIllIIlIllIl = lllllllllllllllIIlIllIllIIlIllll.E();
        if (w.lIIIlllIIlIIIII(lllllllllllllllIIlIllIllIIlIllIl)) {
            return lllIlllllIll[0];
        }
        if (w.lIIIlllIIlIIIIl(((GameObject)lllllllllllllllIIlIllIllIIlIlllI).getWorldArea().contains(lllllllllllllllIIlIllIllIIlIllIl.getWorldLocation()) ? 1 : 0)) {
            return lllIlllllIll[0];
        }
        lllllllllllllllIIlIllIllIIlIlllI.interact(lllIlllllIlI[lllIlllllIll[0]]);
        if (w.lIIIlllIIlIIIlI(lllllllllllllllIIlIllIllIIlIlllI.distanceTo((Locatable)Players.getLocal()), lllIlllllIll[1]) && w.lIIIlllIIlIIIlI(lllllllllllllllIIlIllIllIIlIllIl.distanceTo((Locatable)Players.getLocal()), lllIlllllIll[1])) {
            lllllllllllllllIIlIllIllIIlIllll.sleep(lllIlllllIll[2]);
            return lllIlllllIll[3];
        }
        this.sleep(lllIlllllIll[1]);
        return lllIlllllIll[3];
    }

    private static boolean lIIIlllIIlIIIIl(int n2) {
        return n2 != 0;
    }

    @Inject
    public w(a a2, SquireHunterConfig squireHunterConfig) {
        super(a2, squireHunterConfig);
    }
}

