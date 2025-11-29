/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 */
package gg.squire.corp.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;

@TaskDesc(name="Entering house portal", priority=100, blocking=true)
public class EnteringHousePortalTask
extends Task {

    public boolean run() {
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (k.lllIIIlllIlllI(lIllIIIIlIII[lIllIIIIlIIl[1]].equals(tileObject.getName()) ? 1 : 0)) {
                String[] stringArray = new String[lIllIIIIlIIl[1]];
                stringArray[k.lIllIIIIlIIl[0]] = lIllIIIIlIII[lIllIIIIlIIl[2]];
                if (k.lllIIIlllIlllI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIllIIIIlIIl[1];

                    if (-3 <= 0) return n2 != 0;
                    return false;
                }
            }
            n2 = lIllIIIIlIIl[0];
            return n2 != 0;
        });
        if (k.lllIIIlllIllIl(tileObject2)) {
            return lIllIIIIlIIl[0];
        }
        tileObject2.interact(lIllIIIIlIII[lIllIIIIlIIl[0]]);
        return lIllIIIIlIIl[1];
    }

    private static void lllIIIlllIlIll() {
        lIllIIIIlIII = new String[lIllIIIIlIIl[3]];
        k.lIllIIIIlIII[k.lIllIIIIlIIl[0]] = "Home";
        k.lIllIIIIlIII[k.lIllIIIIlIIl[1]] = "Portal";
        k.lIllIIIIlIII[k.lIllIIIIlIIl[2]] = "Home";
    }

    private static boolean lllIIIlllIllIl(Object object) {
        return object == null;
    }

    static {
        k.lllIIIlllIllII();
        k.lllIIIlllIlIll();
    }

    private static boolean lllIIIlllIlllI(int n2) {
        return n2 != 0;
    }
}

