/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.House
 *  net.unethicalite.api.widgets.Prayers
 */
package gg.squire.construction.tasks;

import gg.squire.basics.secondaries.SecondariesConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.construction.tasks.GameEnum4;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.House;
import net.unethicalite.api.widgets.Prayers;

@TaskDesc(name="Restoring from pool", priority=10, blocking=true)
public class RestoringFromPoolTask
extends Task {

    private final  SecondariesConfig gL;

    private static boolean llIIIIIlIll(int n2) {
        return n2 == 0;
    }

    private static boolean llIIIIIllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIIIIllII(Object object) {
        return object == null;
    }

    private static boolean llIIIIIlIlI(int n2) {
        return n2 != 0;
    }

    static {
        bN.llIIIIIlIII();
        bN.llIIIIIIlll();
    }

    private static void llIIIIIIlll() {
        llIllllll = new String[lllIIIIII[3]];
        bN.llIllllll[bN.lllIIIIII[0]] = "Drink";
        bN.llIllllll[bN.lllIIIIII[1]] = "pool";
        bN.llIllllll[bN.lllIIIIII[2]] = "Drink";
    }

    public boolean run() {
        bN lIlIllIlIlllIII;
        if (bN.llIIIIIlIIl((Object)this.gL.secondary(), (Object)bO.SWAMP_TOAD)) {
            return lllIIIIII[0];
        }
        if (bN.llIIIIIlIlI(Prayers.getPoints())) {
            return lllIIIIII[0];
        }
        if (bN.llIIIIIlIll(lIlIllIlIlllIII.gL.restoreInPoh() ? 1 : 0)) {
            TileObject lIlIllIlIllIlll = TileObjects.getNearest(tileObject -> {
                int n2;
                if (bN.llIIIIIlIlI(tileObject.getName().toLowerCase().contains(llIllllll[lllIIIIII[1]]) ? 1 : 0)) {
                    String[] stringArray = new String[lllIIIIII[1]];
                    stringArray[bN.lllIIIIII[0]] = llIllllll[lllIIIIII[2]];
                    if (bN.llIIIIIlIlI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                        n2 = lllIIIIII[1];

                        if (1 != 0) return n2 != 0;
                        return false;
                    }
                }
                n2 = lllIIIIII[0];
                return n2 != 0;
            });
            if (bN.llIIIIIllII(lIlIllIlIllIlll)) {
                return lllIIIIII[0];
            }
            lIlIllIlIllIlll.interact(llIllllll[lllIIIIII[0]]);
            return lllIIIIII[1];
        }
        if (bN.llIIIIIlIll(House.isInside() ? 1 : 0)) {
            return lllIIIIII[0];
        }
        return House.drinkFromPool();
    }

    @Inject
    public RestoringFromPoolTask(SecondariesConfig secondariesConfig) {
        this.gL = secondariesConfig;
    }

        return String.valueOf(lIlIllIlIIllIll);
    }

    private static boolean llIIIIIlIIl(Object object, Object object2) {
        return object == object2;
    }
}

