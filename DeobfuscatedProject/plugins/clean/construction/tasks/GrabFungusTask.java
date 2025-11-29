/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.client.Static
 */
package gg.squire.construction.tasks;

import gg.squire.basics.secondaries.SecondariesPlugin;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;

@TaskDesc(name="Grab fungus", blocking=true, priority=1)
public class GrabFungusTask
extends Task {
    private  int gR;
    
    private final  SecondariesPlugin gQ;

    private static boolean llIIlIllll(int n2) {
        return n2 != 0;
    }

    private static void llIIlIllII() {
        lllIIlII = new String[lllIIllI[1]];
        bR.lllIIlII[bR.lllIIllI[0]] = "Pick";
    }

    private static boolean llIIlIlllI(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        void var3_3;
        void llIlIIlllIlllll;
        bR llIlIIllllIIIII;
        WorldPoint worldPoint = this.gQ.cT();
        if (bR.llIIlIlllI(worldPoint)) {
            return lllIIllI[0];
        }
        if (bR.llIIlIllll(Inventory.isFull() ? 1 : 0)) {
            return lllIIllI[0];
        }
        int llIlIIlllIllllI = Static.getClient().getTickCount();
        if (bR.llIIllIIII(llIlIIlllIllllI - llIlIIllllIIIII.gR, lllIIllI[1])) {
            return lllIIllI[1];
        }
        int[] nArray = new int[lllIIllI[1]];
        nArray[bR.lllIIllI[0]] = lllIIllI[2];
        TileObject llIlIIlllIlllIl = TileObjects.getFirstSurrounding((WorldPoint)llIlIIlllIlllll, (int)lllIIllI[1], (int[])nArray);
        if (bR.llIIlIlllI(llIlIIlllIlllIl)) {
            return lllIIllI[0];
        }
        var3_3.interact(lllIIlII[lllIIllI[0]]);
        this.gR = var2_2;
        return lllIIllI[1];
    }

    private static boolean llIIllIIII(int n2, int n3) {
        return n2 <= n3;
    }

    @Inject
    public GrabFungusTask(SecondariesPlugin secondariesPlugin) {
        this.gQ = secondariesPlugin;
    }

    static {
        bR.llIIlIllIl();
        bR.llIIlIllII();
    }

}

