/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 */
package gg.squire.mining.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMinerConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import gg.squire.mining.tasks.MiningTaskBase;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;

@TaskDesc(name="Going back through pass", priority=100, blocking=true)
public class GoingBackThroughPassTask
extends MiningTaskBase {

    private static void lIIlIIllIIIlIlI() {
        lllllIIlllll = new String[lllllIlIIIII[1]];
        P.lllllIIlllll[P.lllllIlIIIII[0]] = "Go-through";
    }

    private static boolean lIIlIIllIIIllIl(Object object) {
        return object == null;
    }

    private static boolean lIIlIIllIIIlllI(int n2, int n3) {
        return n2 < n3;
    }

    static {
        P.lIIlIIllIIIlIll();
        P.lIIlIIllIIIlIlI();
    }

    @Inject
    protected GoingBackThroughPassTask(SquireMinerConfig squireMinerConfig) {
        super(squireMinerConfig);
    }

        return String.valueOf(var1);
    }

    private static boolean lIIlIIllIIIllII(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean t() {
        void var1_1;
        if (!P.lIIlIIllIIIllII(this.y()) || P.lIIlIIllIIIllII(this.z() ? 1 : 0)) {
            return lllllIlIIIII[0];
        }
        int[] nArray = new int[lllllIlIIIII[1]];
        nArray[P.lllllIlIIIII[0]] = lllllIlIIIII[2];
        TileObject var2 = TileObjects.getNearest((int[])nArray);
        if (P.lIIlIIllIIIllIl(var2)) {
            return lllllIlIIIII[0];
        }
        var1_1.interact(lllllIIlllll[lllllIlIIIII[0]]);
        return lllllIlIIIII[1];
    }
}

