/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.thieving.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.thieving.SquireThieving;
import gg.squire.thieving.SquireThievingConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import gg.squire.thieving.tasks.ThievingTaskBase;

@TaskDesc(name="Going back inside", priority=0x7FFFFFFF, blocking=true)
public class GoingBackInsideTask
extends ThievingTaskBase {

    @Override
    public boolean l() {
        if (v.lIllIIlIlIlIlll(Movement.isRunEnabled() ? 1 : 0) && v.lIllIIlIlIllIII(Movement.getRunEnergy(), lIIlllIIIllIl[0])) {
            Movement.toggleRun();
            return lIIlllIIIllIl[1];
        }
        if (v.lIllIIlIlIlIlll(Movement.shouldWalk() ? 1 : 0)) {
            return lIIlllIIIllIl[2];
        }
        String[] stringArray = new String[lIIlllIIIllIl[1]];
        stringArray[v.lIIlllIIIllIl[2]] = lIIlllIIIllII[lIIlllIIIllIl[2]];
        TileObject var1 = TileObjects.getNearest((String[])stringArray);
        if (v.lIllIIlIlIllIIl(var1)) {
            var1.interact(lIIlllIIIllII[lIIlllIIIllIl[1]]);
            return lIIlllIIIllIl[1];
        }
        return lIIlllIIIllIl[2];
    }

    private static boolean lIllIIlIlIllIIl(Object object) {
        return object != null;
    }

    private static boolean lIllIIlIlIlIlll(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIIlIlIllIII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIllIIlIlIllIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIllIIlIlIlIlIl() {
        lIIlllIIIllII = new String[lIIlllIIIllIl[3]];
        v.lIIlllIIIllII[v.lIIlllIIIllIl[2]] = "Lizard dwelling";
        v.lIIlllIIIllII[v.lIIlllIIIllIl[1]] = "Enter";
    }

    @Inject
    public GoingBackInsideTask(SquireThieving squireThieving, SquireThievingConfig squireThievingConfig) {
        super(squireThieving, squireThievingConfig);
    }

        return String.valueOf(var2);
    }

    static {
        v.lIllIIlIlIlIllI();
        v.lIllIIlIlIlIlIl();
    }
}

