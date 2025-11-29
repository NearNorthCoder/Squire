/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 */
package gg.squire.corp.tasks;

import gg.squire.corp.tasks.CorpTaskBase;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;

@TaskDesc(name="Drinking from pool")
public class DrinkingFromPoolTask
extends CorpTaskBase {

        return String.valueOf(var1);
    }

    private static boolean lllIIIlllIIIlI(int n2) {
        return n2 == 0;
    }

    private static boolean lllIIIlllIIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static void lllIIIlllIIIII() {
        lIllIIIIIlII = new String[lIllIIIIIlIl[2]];
        j.lIllIIIIIlII[j.lIllIIIIIlIl[0]] = "Ornate pool of Rejuvenation";
        j.lIllIIIIIlII[j.lIllIIIIIlIl[1]] = "Drink";
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        j var2;
        if (j.lllIIIlllIIIlI(this.l() ? 1 : 0)) {
            return lIllIIIIIlIl[0];
        }
        if (j.lllIIIlllIIIlI(var2.m() ? 1 : 0)) {
            return lIllIIIIIlIl[0];
        }
        String[] stringArray = new String[lIllIIIIIlIl[1]];
        stringArray[j.lIllIIIIIlIl[0]] = lIllIIIIIlII[lIllIIIIIlIl[0]];
        TileObject var3 = TileObjects.getNearest((String[])stringArray);
        if (j.lllIIIlllIIIll(var3)) {
            return lIllIIIIIlIl[0];
        }
        var1_1.interact(lIllIIIIIlII[lIllIIIIIlIl[1]]);
        return lIllIIIIIlIl[1];
    }

    private static boolean lllIIIlllIIIll(Object object) {
        return object == null;
    }

    static {
        j.lllIIIlllIIIIl();
        j.lllIIIlllIIIII();
    }
}

