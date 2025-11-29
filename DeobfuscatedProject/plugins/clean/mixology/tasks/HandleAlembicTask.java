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
package gg.squire.mixology.tasks;

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
import gg.squire.mixology.tasks.GameEnum15;
import gg.squire.mixology.tasks.GameEnum16;
import gg.squire.mixology.tasks.SHelper;

@TaskDesc(name="Handle alembic")
public class HandleAlembicTask
extends Task {
    private final  SquireMixologyConfig T;

     int S;

    private static boolean lIIlIlIlIlllIII(int n2, int n3) {
        return n2 < n3;
    }

    public boolean run() {
        k var1;
        if (k.lIIlIlIlIllIlIl(s.e() ? 1 : 0)) {
            return lllllllIlllI[1];
        }
        if (k.lIIlIlIlIllIllI((Object)var1.T.pluginMode(), (Object)d.MINIGAME)) {
            return lllllllIlllI[1];
        }
        if (k.lIIlIlIlIllIlIl(s.a(lllllllIlllI[2], lllllllIlllI[3], lllllllIlllI[4]) ? 1 : 0)) {
            return lllllllIlllI[1];
        }
        if (k.lIIlIlIlIllIlIl(Players.getLocal().isIdle() ? 1 : 0)) {
            return lllllllIlllI[1];
        }
        if (k.lIIlIlIlIllIlll((Object)var1.T.potionStrategy(), (Object)f.MULTI_ORDER)) {
            if (k.lIIlIlIlIllIlIl(s.g() ? 1 : 0) && k.lIIlIlIlIlllIII(Vars.getBit((int)lllllllIlllI[3]), lllllllIlllI[5])) {
                return lllllllIlllI[1];
            }
            s.j();
            if (k.lIIlIlIlIlllIIl(SquireMixology.x, var1.S)) {
                return lllllllIlllI[1];
            }
        }
        if (k.lIIlIlIlIllIllI((Object)var1.T.potionStrategy(), (Object)f.MULTI_ORDER) && k.lIIlIlIlIlllIIl(SquireMixology.r, var1.S)) {
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

    @Inject
    public HandleAlembicTask(SquireMixologyConfig squireMixologyConfig) {
        this.S = lllllllIlllI[0];
        this.T = squireMixologyConfig;
    }

    static {
        k.lIIlIlIlIllIlII();
        k.lIIlIlIlIllIIll();
    }

        return String.valueOf(var2);
    }

    private static void lIIlIlIlIllIIll() {
        lllllllIllIl = new String[lllllllIlllI[5]];
        k.lllllllIllIl[k.lllllllIlllI[1]] = "Crystalising";
    }
}

