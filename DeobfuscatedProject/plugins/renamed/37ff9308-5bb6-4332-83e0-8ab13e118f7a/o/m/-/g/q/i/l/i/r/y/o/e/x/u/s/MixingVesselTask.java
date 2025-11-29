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
import o.m.-.g.q.i.l.i.r.y.o.e.x.u.s.DEnum;
import o.m.-.g.q.i.l.i.r.y.o.e.x.u.s.FEnum;
import o.m.-.g.q.i.l.i.r.y.o.e.x.u.s.s_Unknown;

/* TASK: Mixing vessel -> MixingvesselTask */
@TaskDesc(name="Mixing vessel")
public class MixingVesselTask
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
        n.lIIIIIIIIllll[2] = 1;
        n.lIIIIIIIIllll[3] = -(0xFFFFDF4B & 0x26BD) & (0xFFFFDF6F & 0xFEFB);
    }

    private static void lIIlIllIlIIIIlI() {
        lIIIIIIIIlllI = new String[lIIIIIIIIllll[2]];
        n.lIIIIIIIIlllI[n.lIIIIIIIIllll[0]] = n."Taking from vessel";
    }

    static {
        n.lIIlIllIlIIIIll();
        n.lIIlIllIlIIIIlI();
    }

    public boolean run() {
        n var3;
        if (n.lIIlIllIlIIIlII(s.e() ? 1 : 0)) {
            return lIIIIIIIIllll[0];
        }
        if (n.lIIlIllIlIIIlIl((Object)var3.X.pluginMode(), (Object)d.MINIGAME)) {
            return lIIIIIIIIllll[0];
        }
        if (n.lIIlIllIlIIIlII(SquireMixology.k ? 1 : 0) && n.lIIlIllIlIIIllI(s.g() ? 1 : 0)) {
            return lIIIIIIIIllll[0];
        }
        if (n.lIIlIllIlIIIllI(SquireMixology.k ? 1 : 0)) {
            return lIIIIIIIIllll[0];
        }
        if (n.lIIlIllIlIIIlll((Object)var3.X.potionStrategy(), (Object)f.SINGLE_ORDER) && n.lIIlIllIlIIIllI(s.f() ? 1 : 0)) {
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

    private static String lIIlIllIlIIIIIl(String var2, String var4) {
        var2 = new String(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var1 = new StringBuilder();
        char[] var8 = var4.toCharArray();
        int var5 = lIIIIIIIIllll[0];
        char[] var6 = var2.toCharArray();
        int var7 = var6.length;
        int var10 = lIIIIIIIIllll[0];
        while (n.lIIlIllIlIIlIII(var10, var7)) {
            char var9 = var6[var10];
            var1.append((char)(var9 ^ var8[var5 % var8.length]));
            0;
            ++var5;
            ++var10;
            0;
            if (1 != 0) continue;
            return null;
        }
        return String.valueOf(var1);
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

