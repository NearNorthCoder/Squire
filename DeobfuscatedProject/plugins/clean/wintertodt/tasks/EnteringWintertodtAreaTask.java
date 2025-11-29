/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.wintertodt.tasks;

import gg.squire.wintertodt.tasks.BHelper;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.wintertodt.SquireWintertodtConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Entering Wintertodt Area", priority=1)
public class EnteringWintertodtAreaTask
extends Task {
    
    private final  b B;
    private static final  WorldPoint A;
    private static final  int z;
    private final  SquireWintertodtConfig C;

    @Inject
    public EnteringWintertodtAreaTask(b b2, SquireWintertodtConfig squireWintertodtConfig) {
        this.B = b2;
        this.C = squireWintertodtConfig;
    }

    private static boolean llIIIIllIllIIll(int n2) {
        return n2 != 0;
    }

    private static void llIIIIllIlIlllI() {
        lIlIlllllIlIl = new String[lIlIlllllIlll[1]];
        e.lIlIlllllIlIl[e.lIlIlllllIlll[0]] = "Enter";
    }

    static {
        e.llIIIIllIllIIlI();
        e.llIIIIllIlIlllI();
        z = lIlIlllllIlll[2];
        A = new WorldPoint(lIlIlllllIlll[4], lIlIlllllIlll[5], lIlIlllllIlll[0]);
    }

    private static boolean llIIIIllIllIlII(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (!e.llIIIIllIllIIll(Movement.shouldWalk() ? 1 : 0) || e.llIIIIllIllIIll(this.B.i() ? 1 : 0)) {
            return lIlIlllllIlll[0];
        }
        int[] nArray = new int[lIlIlllllIlll[1]];
        nArray[e.lIlIlllllIlll[0]] = lIlIlllllIlll[2];
        TileObject var1 = TileObjects.getNearest((int[])nArray);
        if (e.llIIIIllIllIlII(var1)) {
            e var2;
            Movement.walk((WorldPoint)A);
            var2.sleep(lIlIlllllIlll[1]);
            return lIlIlllllIlll[0];
        }
        var1_1.interact(lIlIlllllIlIl[lIlIlllllIlll[0]]);
        this.sleep(lIlIlllllIlll[3]);
        return lIlIlllllIlll[1];
    }
}

