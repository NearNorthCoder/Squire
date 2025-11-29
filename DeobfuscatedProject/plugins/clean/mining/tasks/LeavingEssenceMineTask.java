/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.Interactable
 *  net.unethicalite.api.Locations
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.mining.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMinerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.mining.tasks.GameEnum29;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.unethicalite.api.Interactable;
import net.unethicalite.api.Locations;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Leaving essence mine", priority=10, blocking=true)
public class LeavingEssenceMineTask
extends Task {

    @Inject
    private  SquireMinerConfig f;

    /*
     * WARNING - void declaration
     */
    private Interactable q() {
        TileObject tileObject;
        void var1;
        void var2;
        String[] stringArray = new String[llllllIlllII[2]];
        stringArray[o.llllllIlllII[0]] = llllllIllIll[llllllIlllII[2]];
        TileObject tileObject2 = TileObjects.getNearest((String[])stringArray);
        String[] stringArray2 = new String[llllllIlllII[2]];
        stringArray2[o.llllllIlllII[0]] = llllllIllIll[llllllIlllII[3]];
        NPC nPC = NPCs.getNearest((String[])stringArray2);
        if (o.lIIlIlIIllIllll(nPC)) {
            return var2;
        }
        if (o.lIIlIlIIllIllll(var2)) {
            return var1;
        }
        if (o.lIIlIlIIlllIIII(var1.distanceTo((Locatable)Players.getLocal()), var2.distanceTo((Locatable)Players.getLocal()))) {
            tileObject = var1;

            }
        } else {
            tileObject = tileObject2;
        }
        return tileObject;
    }

    private static boolean lIIlIlIIlllIIII(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var3);
    }

    private static boolean lIIlIlIIllIllll(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        o var4;
        if (o.lIIlIlIIllIllIl((Object)this.f.activity(), (Object)a.ESSENCE)) {
            return llllllIlllII[0];
        }
        if (o.lIIlIlIIllIlllI(Inventory.isFull() ? 1 : 0)) {
            return llllllIlllII[0];
        }
        Interactable var5 = var4.q();
        if (o.lIIlIlIIllIllll(var5)) {
            return llllllIlllII[0];
        }
        if (o.lIIlIlIIllIlllI(Locations.isRegionLoaded((int)llllllIlllII[1]) ? 1 : 0)) {
            return llllllIlllII[0];
        }
        var1_1.interact(llllllIllIll[llllllIlllII[0]]);
        return llllllIlllII[2];
    }

    private static boolean lIIlIlIIllIlllI(int n2) {
        return n2 == 0;
    }

    private static void lIIlIlIIllIlIll() {
        llllllIllIll = new String[llllllIlllII[4]];
        o.llllllIllIll[o.llllllIlllII[0]] = "Use";
        o.llllllIllIll[o.llllllIlllII[2]] = "Portal";
        o.llllllIllIll[o.llllllIlllII[3]] = "Portal";
    }

    private static boolean lIIlIlIIllIllIl(Object object, Object object2) {
        return object != object2;
    }

    static {
        o.lIIlIlIIllIllII();
        o.lIIlIlIIllIlIll();
    }
}

