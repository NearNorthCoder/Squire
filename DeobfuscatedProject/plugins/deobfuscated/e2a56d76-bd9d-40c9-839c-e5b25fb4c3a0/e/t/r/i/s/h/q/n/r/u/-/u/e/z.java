/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.GameObject
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
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;

@TaskDesc(name="Teasing Animal", priority=10, blocking=true)
public class z
extends x {
    public static final /* synthetic */ int G;
    private static /* synthetic */ String[] llllIIIIIIlI;
    private static /* synthetic */ int[] llllIIIIIIll;

    private static void lIIIlllIIlllIlI() {
        llllIIIIIIll = new int[4];
        z.llllIIIIIIll[0] = -1 & (0xFFFFAFFF & 0x5BFB);
        z.llllIIIIIIll[1] = 0x1E ^ 0xE ^ (0xB1 ^ 0xA5);
        z.llllIIIIIIll[2] = ((0xB6 ^ 0xAD) & ~(0x62 ^ 0x79) ^ (0x3A ^ 0x7C)) & (0x7D ^ 0x78 ^ (6 ^ 0x45) ^ -1);
        z.llllIIIIIIll[3] = 1;
    }

    static {
        z.lIIIlllIIlllIlI();
        z.lIIIlllIIlllIIl();
        G = llllIIIIIIll[0];
    }

    private static boolean lIIIlllIIllllll(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public z(a a2, SquireHunterConfig squireHunterConfig) {
        super(a2, squireHunterConfig);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected boolean x() {
        void var3_3;
        z lllllllllllllllIIlIllIlIlIIIlIII;
        if (z.lIIIlllIIlllIll(Players.getLocal().getAnimation(), llllIIIIIIll[0])) {
            this.sleep(llllIIIIIIll[1]);
            return llllIIIIIIll[2];
        }
        TileObject lllllllllllllllIIlIllIlIlIIIIlll = lllllllllllllllIIlIllIlIlIIIlIII.F();
        if (z.lIIIlllIIllllII(lllllllllllllllIIlIllIlIlIIIIlll)) {
            return llllIIIIIIll[2];
        }
        NPC lllllllllllllllIIlIllIlIlIIIIllI = lllllllllllllllIIlIllIlIlIIIlIII.E();
        if (z.lIIIlllIIllllIl(lllllllllllllllIIlIllIlIlIIIIllI)) {
            return llllIIIIIIll[2];
        }
        NPC lllllllllllllllIIlIllIlIlIIIIlIl = lllllllllllllllIIlIllIlIlIIIlIII.D();
        if (z.lIIIlllIIllllII(lllllllllllllllIIlIllIlIlIIIIlIl)) {
            return llllIIIIIIll[2];
        }
        if (z.lIIIlllIIlllllI(((GameObject)lllllllllllllllIIlIllIlIlIIIIlll).getWorldArea().contains(lllllllllllllllIIlIllIlIlIIIIlIl.getWorldLocation()) ? 1 : 0)) {
            return llllIIIIIIll[2];
        }
        var3_3.interact(llllIIIIIIlI[llllIIIIIIll[2]]);
        return llllIIIIIIll[3];
    }

    private static boolean lIIIlllIIllllII(Object object) {
        return object == null;
    }

    private static void lIIIlllIIlllIIl() {
        llllIIIIIIlI = new String[llllIIIIIIll[3]];
        z.llllIIIIIIlI[z.llllIIIIIIll[2]] = z."Tease";
    }

    private static boolean lIIIlllIIlllIll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIIlllIIllllIl(Object object) {
        return object != null;
    }

    private static boolean lIIIlllIIlllllI(int n2) {
        return n2 != 0;
    }

    private static String lIIIlllIIlllIII(String lllllllllllllllIIlIllIlIIllllIlI, String lllllllllllllllIIlIllIlIIlllIlII) {
        lllllllllllllllIIlIllIlIIllllIlI = new String(Base64.getDecoder().decode(lllllllllllllllIIlIllIlIIllllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIllIlIIllllIII = new StringBuilder();
        char[] lllllllllllllllIIlIllIlIIlllIlll = lllllllllllllllIIlIllIlIIlllIlII.toCharArray();
        int lllllllllllllllIIlIllIlIIlllIllI = llllIIIIIIll[2];
        char[] lllllllllllllllIIlIllIlIIlllIIII = lllllllllllllllIIlIllIlIIllllIlI.toCharArray();
        int lllllllllllllllIIlIllIlIIllIllll = lllllllllllllllIIlIllIlIIlllIIII.length;
        int lllllllllllllllIIlIllIlIIllIlllI = llllIIIIIIll[2];
        while (z.lIIIlllIIllllll(lllllllllllllllIIlIllIlIIllIlllI, lllllllllllllllIIlIllIlIIllIllll)) {
            char lllllllllllllllIIlIllIlIIllllIll = lllllllllllllllIIlIllIlIIlllIIII[lllllllllllllllIIlIllIlIIllIlllI];
            lllllllllllllllIIlIllIlIIllllIII.append((char)(lllllllllllllllIIlIllIlIIllllIll ^ lllllllllllllllIIlIllIlIIlllIlll[lllllllllllllllIIlIllIlIIlllIllI % lllllllllllllllIIlIllIlIIlllIlll.length]));
            0;
            ++lllllllllllllllIIlIllIlIIlllIllI;
            ++lllllllllllllllIIlIllIlIIllIlllI;
            0;
            if (-3 < 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlIllIlIIllllIII);
    }
}

