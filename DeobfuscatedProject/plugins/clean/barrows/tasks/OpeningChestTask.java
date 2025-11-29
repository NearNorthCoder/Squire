/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Reachable
 */
package gg.squire.barrows.tasks;

import gg.squire.barrows.SquireBarrows;
import gg.squire.barrows.SquireBarrowsConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Reachable;

@TaskDesc(name="Opening chest", priority=220, blocking=true)
public class OpeningChestTask
extends Task {
    private final  SquireBarrows an;
    private final  SquireBarrowsConfig ao;

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (y.lIllIIllIIIlII(this.an.h() ? 1 : 0)) {
            return llllIIIIlII[0];
        }
        String[] stringArray = new String[llllIIIIlII[1]];
        stringArray[y.llllIIIIlII[0]] = llllIIIIIll[llllIIIIlII[0]];
        TileObject var1 = TileObjects.getNearest((String[])stringArray);
        if (y.lIllIIllIIIlIl(var1)) {
            return llllIIIIlII[0];
        }
        String[] stringArray2 = new String[llllIIIIlII[1]];
        stringArray2[y.llllIIIIlII[0]] = llllIIIIIll[llllIIIIlII[1]];
        if (!y.lIllIIllIIIllI(var1.hasAction(stringArray2) ? 1 : 0) || !y.lIllIIllIIIllI(Reachable.isInteractable((Locatable)var1) ? 1 : 0) || y.lIllIIllIIIlll(var1.distanceTo(Players.getLocal().getWorldLocation()), llllIIIIlII[2])) {
            return llllIIIIlII[0];
        }
        var1_1.interact(llllIIIIIll[llllIIIIlII[3]]);
        return llllIIIIlII[1];
    }

    private static boolean lIllIIllIIIlIl(Object object) {
        return object == null;
    }

    private static boolean lIllIIllIIlIII(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var2);
    }

    static {
        y.lIllIIllIIIIll();
        y.lIllIIllIIIIlI();
    }

    private static void lIllIIllIIIIlI() {
        llllIIIIIll = new String[llllIIIIlII[4]];
        y.llllIIIIIll[y.llllIIIIlII[0]] = "Chest";
        y.llllIIIIIll[y.llllIIIIlII[1]] = "Open";
        y.llllIIIIIll[y.llllIIIIlII[3]] = "Open";
    }

    private static boolean lIllIIllIIIllI(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIIllIIIlII(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIIllIIIlll(int n2, int n3) {
        return n2 > n3;
    }

    @Inject
    public OpeningChestTask(SquireBarrows squireBarrows, SquireBarrowsConfig squireBarrowsConfig) {
        this.an = squireBarrows;
        this.ao = squireBarrowsConfig;
    }
}

