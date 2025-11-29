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
package gg.squire.mixology.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mixology.SquireMixology;
import gg.squire.mixology.SquireMixologyConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import gg.squire.mixology.tasks.GameEnum15;
import gg.squire.mixology.tasks.GameEnum16;
import gg.squire.mixology.tasks.SHelper;

@TaskDesc(name="Mixing vessel")
public class MixingVesselTask
extends Task {
    private final  SquireMixologyConfig X;

    private static boolean lIIlIllIlIIIlII(int n2) {
        return n2 == 0;
    }

    private static void lIIlIllIlIIIIlI() {
        lIIIIIIIIlllI = new String[lIIIIIIIIllll[2]];
        n.lIIIIIIIIlllI[n.lIIIIIIIIllll[0]] = "Taking from vessel";
    }

    static {
        n.lIIlIllIlIIIIll();
        n.lIIlIllIlIIIIlI();
    }

    public boolean run() {
        n var1;
        if (n.lIIlIllIlIIIlII(s.e() ? 1 : 0)) {
            return lIIIIIIIIllll[0];
        }
        if (n.lIIlIllIlIIIlIl((Object)var1.X.pluginMode(), (Object)d.MINIGAME)) {
            return lIIIIIIIIllll[0];
        }
        if (n.lIIlIllIlIIIlII(SquireMixology.k ? 1 : 0) && n.lIIlIllIlIIIllI(s.g() ? 1 : 0)) {
            return lIIIIIIIIllll[0];
        }
        if (n.lIIlIllIlIIIllI(SquireMixology.k ? 1 : 0)) {
            return lIIIIIIIIllll[0];
        }
        if (n.lIIlIllIlIIIlll((Object)var1.X.potionStrategy(), (Object)f.SINGLE_ORDER) && n.lIIlIllIlIIIllI(s.f() ? 1 : 0)) {
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
    public MixingVesselTask(SquireMixologyConfig squireMixologyConfig) {
        this.X = squireMixologyConfig;
    }

        return String.valueOf(var2);
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

