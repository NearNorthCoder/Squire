/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 */
package o.m.-.g.q.i.l.i.r.y.o.e.x.u.s;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mixology.SquireMixology;
import gg.squire.mixology.SquireMixologyConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import o.m.-.g.q.i.l.i.r.y.o.e.x.u.s.d;
import o.m.-.g.q.i.l.i.r.y.o.e.x.u.s.f;
import o.m.-.g.q.i.l.i.r.y.o.e.x.u.s.s;

@TaskDesc(name="Mixing vessel")
public class n
extends Task {
    private final /* synthetic */ SquireMixologyConfig X;
    private static /* synthetic */ int[] lIIIIIIIIllll;
    private static /* synthetic */ String[] lIIIIIIIIlllI;

    private static boolean lIIlIllIlIIIlII(int n2) {
        return n2 == 0;
    }

    private static void lIIlIllIlIIIIll() {
        lIIIIIIIIllll = new int[4];
        n.lIIIIIIIIllll[0] = (0xFA ^ 0xA1) & ~(0x7E ^ 0x25);
        n.lIIIIIIIIllll[1] = 0xFFFFFEDF & 0x2D6B;
        n.lIIIIIIIIllll[2] = " ".length();
        n.lIIIIIIIIllll[3] = -(0xFFFFDF4B & 0x26BD) & (0xFFFFDF6F & 0xFEFB);
    }

    private static void lIIlIllIlIIIIlI() {
        lIIIIIIIIlllI = new String[lIIIIIIIIllll[2]];
        n.lIIIIIIIIlllI[n.lIIIIIIIIllll[0]] = n.lIIlIllIlIIIIIl("NQc9CBwGRjATHQxGIAQBEgM6", "afVar");
    }

    static {
        n.lIIlIllIlIIIIll();
        n.lIIlIllIlIIIIlI();
    }

    public boolean run() {
        n lllllllllllllllIIIlllllllIllIIII;
        if (n.lIIlIllIlIIIlII(s.e() ? 1 : 0)) {
            return lIIIIIIIIllll[0];
        }
        if (n.lIIlIllIlIIIlIl((Object)lllllllllllllllIIIlllllllIllIIII.X.pluginMode(), (Object)d.MINIGAME)) {
            return lIIIIIIIIllll[0];
        }
        if (n.lIIlIllIlIIIlII(SquireMixology.k ? 1 : 0) && n.lIIlIllIlIIIllI(s.g() ? 1 : 0)) {
            return lIIIIIIIIllll[0];
        }
        if (n.lIIlIllIlIIIllI(SquireMixology.k ? 1 : 0)) {
            return lIIIIIIIIllll[0];
        }
        if (n.lIIlIllIlIIIlll((Object)lllllllllllllllIIIlllllllIllIIII.X.potionStrategy(), (Object)f.SINGLE_ORDER) && n.lIIlIllIlIIIllI(s.f() ? 1 : 0)) {
            return lIIIIIIIIllll[0];
        }
        if (n.lIIlIllIlIIlIII(Vars.getBit((int)lIIIIIIIIllll[1]), lIIIIIIIIllll[2])) {
            return lIIIIIIIIllll[0];
        }
        SquireMixology.g = lIIIIIIIIlllI[lIIIIIIIIllll[0]];
        int[] nArray = new int[lIIIIIIIIllll[2]];
        nArray[n.lIIIIIIIIllll[0]] = lIIIIIIIIllll[3];
        TileObjects.getNearest((int[])nArray).interact(lIIIIIIIIllll[0]);
        return lIIIIIIIIllll[0];
    }

    @Inject
    public n(SquireMixologyConfig squireMixologyConfig) {
        this.X = squireMixologyConfig;
    }

    private static String lIIlIllIlIIIIIl(String lllllllllllllllIIIlllllllIlIIIII, String lllllllllllllllIIIlllllllIIlllll) {
        lllllllllllllllIIIlllllllIlIIIII = new String(Base64.getDecoder().decode(lllllllllllllllIIIlllllllIlIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIlllllllIlIIIll = new StringBuilder();
        char[] lllllllllllllllIIIlllllllIlIIIlI = lllllllllllllllIIIlllllllIIlllll.toCharArray();
        int lllllllllllllllIIIlllllllIlIIIIl = lIIIIIIIIllll[0];
        char[] lllllllllllllllIIIlllllllIIllIll = lllllllllllllllIIIlllllllIlIIIII.toCharArray();
        int lllllllllllllllIIIlllllllIIllIlI = lllllllllllllllIIIlllllllIIllIll.length;
        int lllllllllllllllIIIlllllllIIllIIl = lIIIIIIIIllll[0];
        while (n.lIIlIllIlIIlIII(lllllllllllllllIIIlllllllIIllIIl, lllllllllllllllIIIlllllllIIllIlI)) {
            char lllllllllllllllIIIlllllllIlIIllI = lllllllllllllllIIIlllllllIIllIll[lllllllllllllllIIIlllllllIIllIIl];
            lllllllllllllllIIIlllllllIlIIIll.append((char)(lllllllllllllllIIIlllllllIlIIllI ^ lllllllllllllllIIIlllllllIlIIIlI[lllllllllllllllIIIlllllllIlIIIIl % lllllllllllllllIIIlllllllIlIIIlI.length]));
            "".length();
            ++lllllllllllllllIIIlllllllIlIIIIl;
            ++lllllllllllllllIIIlllllllIIllIIl;
            "".length();
            if (" ".length() != 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIIlllllllIlIIIll);
    }

    private static boolean lIIlIllIlIIIlIl(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIIlIllIlIIlIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlIllIlIIIllI(int n2) {
        return n2 != 0;
    }

    private static boolean lIIlIllIlIIIlll(Object object, Object object2) {
        return object == object2;
    }
}

