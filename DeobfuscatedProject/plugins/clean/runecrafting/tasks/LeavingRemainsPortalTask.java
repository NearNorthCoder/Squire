/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.runecrafting.tasks;

import gg.squire.runecrafting.tasks.GameEnum14;
import gg.squire.runecrafting.tasks.RunecraftingTaskBase;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.runecrafting.SquireGOTRPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Leaving remains portal", priority=5, blocking=true)
public class LeavingRemainsPortalTask
extends RunecraftingTaskBase {

    static {
        x.llllllIlllIlII();
        x.llllllIlllIIll();
    }

    private static boolean llllllIlllIlIl(int n2) {
        return n2 != 0;
    }

    @Inject
    public LeavingRemainsPortalTask(SquireGOTRPlugin squireGOTRPlugin) {
        c[] cArray = new c[llIIllIllllI[0]];
        cArray[x.llIIllIllllI[1]] = c.ACTIVE;
        cArray[x.llIIllIllllI[2]] = c.FINISHING;
        cArray[x.llIIllIllllI[3]] = c.ACTIVATING;
        super(squireGOTRPlugin, cArray);
    }

    private static void llllllIlllIIll() {
        llIIllIlllIl = new String[llIIllIllllI[0]];
        x.llIIllIlllIl[x.llIIllIllllI[1]] = "Enter";
        x.llIIllIlllIl[x.llIIllIllllI[2]] = "Portal";
        x.llIIllIlllIl[x.llIIllIllllI[3]] = "Enter";
    }

    private static boolean llllllIlllIlll(Object object, Object object2) {
        return object != object2;
    }

    private static boolean llllllIlllIllI(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected boolean ak() {
        void var1_1;
        x var1;
        if (!x.llllllIlllIlIl(this.aV.g() ? 1 : 0) || x.llllllIlllIllI(SquireGOTRPlugin.g.contains((Locatable)Players.getLocal()) ? 1 : 0)) {
            return llIIllIllllI[1];
        }
        if (x.llllllIlllIllI(Inventory.isFull() ? 1 : 0) && x.llllllIlllIlll((Object)var1.aV.m(), (Object)c.ACTIVATING)) {
            return llIIllIllllI[1];
        }
        TileObject var2 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (x.llllllIlllIlIl(tileObject.getName().equals(llIIllIlllIl[llIIllIllllI[2]]) ? 1 : 0) && x.llllllIlllIlIl(tileObject.hasAction(llIIllIlllIl[llIIllIllllI[3]]::equals) ? 1 : 0)) {
                n2 = llIIllIllllI[2];

                }
            } else {
                n2 = llIIllIllllI[1];
            }
            return n2 != 0;
        });
        if (x.llllllIllllIII(var2)) {
            return llIIllIllllI[1];
        }
        var1_1.interact(llIIllIlllIl[llIIllIllllI[1]]);
        return llIIllIllllI[2];
    }

    private static boolean llllllIllllIII(Object object) {
        return object == null;
    }
}

