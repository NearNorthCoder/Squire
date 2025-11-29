/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.entities.Players
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
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import o.m.-.g.q.i.l.i.r.y.o.e.x.u.s.DEnum;
import o.m.-.g.q.i.l.i.r.y.o.e.x.u.s.FEnum;
import o.m.-.g.q.i.l.i.r.y.o.e.x.u.s.s_Unknown;

/* TASK: Handle alembic -> HandlealembicTask */
@TaskDesc(name="Handle alembic")
public class HandleAlembicTask
extends Task {
    private final /* synthetic */ SquireMixologyConfig T;
    private static /* synthetic */ String[] lllllllIllIl;
    private static /* synthetic */ int[] lllllllIlllI;
    /* synthetic */ int S;

    private static boolean lIIlIlIlIlllIII(int n2, int n3) {
        return n2 < n3;
    }

    public boolean run() {
        k var3;
        if (k.lIIlIlIlIllIlIl(s.e() ? 1 : 0)) {
            return lllllllIlllI[1];
        }
        if (k.lIIlIlIlIllIllI((Object)var3.T.pluginMode(), (Object)d.MINIGAME)) {
            return lllllllIlllI[1];
        }
        if (k.lIIlIlIlIllIlIl(s.a(lllllllIlllI[2], lllllllIlllI[3], lllllllIlllI[4]) ? 1 : 0)) {
            return lllllllIlllI[1];
        }
        if (k.lIIlIlIlIllIlIl(Players.getLocal().isIdle() ? 1 : 0)) {
            return lllllllIlllI[1];
        }
        if (k.lIIlIlIlIllIlll((Object)var3.T.potionStrategy(), (Object)f.MULTI_ORDER)) {
            if (k.lIIlIlIlIllIlIl(s.g() ? 1 : 0) && k.lIIlIlIlIlllIII(Vars.getBit((int)lllllllIlllI[3]), lllllllIlllI[5])) {
                return lllllllIlllI[1];
            }
            s.j();
            if (k.lIIlIlIlIlllIIl(SquireMixology.x, var3.S)) {
                return lllllllIlllI[1];
            }
        }
        if (k.lIIlIlIlIllIllI((Object)var3.T.potionStrategy(), (Object)f.MULTI_ORDER) && k.lIIlIlIlIlllIIl(SquireMixology.r, var3.S)) {
            return lllllllIlllI[1];
        }
        SquireMixology.g = lllllllIllIl[lllllllIlllI[1]];
        int[] nArray = new int[lllllllIlllI[5]];
        nArray[k.lllllllIlllI[1]] = lllllllIlllI[4];
        TileObjects.getNearest((int[])nArray).interact(lllllllIlllI[1]);
        return lllllllIlllI[1];
    }

    private static boolean lIIlIlIlIllIllI(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIIlIlIlIllIlIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlIlIlIlllIIl(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIIlIlIlIllIlll(Object object, Object object2) {
        return object == object2;
    }

    private static void lIIlIlIlIllIlII() {
        lllllllIlllI = new int[6];
        k.lllllllIlllI[0] = 0xFFFFDE6B & 0x37BD;
        k.lllllllIlllI[1] = (0x67 ^ 0x5F) & ~(0xA4 ^ 0x9C);
        k.lllllllIlllI[2] = 0xFFFFBBDF & 0x4FAB;
        k.lllllllIlllI[3] = -(0xFFFFDBBB & 0x76DF) & (0xFFFFFEDB & 0x7FFE);
        k.lllllllIlllI[4] = -(0xFFFFB731 & 0x6DEF) & (0xFFFFFDFF & 0xFF7F);
        k.lllllllIlllI[5] = 1;
    }

    @Inject
    public k(SquireMixologyConfig squireMixologyConfig) {
        this.S = lllllllIlllI[0];
        this.T = squireMixologyConfig;
    }

    static {
        k.lIIlIlIlIllIlII();
        k.lIIlIlIlIllIIll();
    }

    private static String lIIlIlIlIllIIlI(String var4, String var8) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var1 = new StringBuilder();
        char[] var2 = var8.toCharArray();
        int var10 = lllllllIlllI[1];
        char[] var7 = var4.toCharArray();
        int var9 = var7.length;
        int var6 = lllllllIlllI[1];
        while (k.lIIlIlIlIlllIII(var6, var9)) {
            char var5 = var7[var6];
            var1.append((char)(var5 ^ var2[var10 % var2.length]));
            0;
            ++var10;
            ++var6;
            0;
            if (1 <= (0x97 ^ 0x93)) continue;
            return null;
        }
        return String.valueOf(var1);
    }

    private static void lIIlIlIlIllIIll() {
        lllllllIllIl = new String[lllllllIlllI[5]];
        k.lllllllIllIl[k.lllllllIlllI[1]] = k."Crystalising";
    }
}

