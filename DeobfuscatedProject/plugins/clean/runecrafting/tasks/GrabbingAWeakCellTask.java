/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.GameObject
 *  net.runelite.api.Locatable
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Reachable
 */
package gg.squire.runecrafting.tasks;

import gg.squire.runecrafting.tasks.GameEnum14;
import gg.squire.runecrafting.tasks.RunecraftingTaskBase;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.runecrafting.SquireGOTRPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.GameObject;
import net.runelite.api.Locatable;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;

@TaskDesc(name="Grabbing a weak cell", priority=14, blocking=true)
public class GrabbingAWeakCellTask
extends RunecraftingTaskBase {

    private static boolean lIIIIIIIIIIIIll(Object object) {
        return object == null;
    }

    private static boolean lIIIIIIIIIIIlII(int n2) {
        return n2 != 0;
    }

    static {
        k.lIIIIIIIIIIIIlI();
        k.lIIIIIIIIIIIIIl();
    }

    @Override
    protected boolean ak() {
        k var1;
        if (!k.lIIIIIIIIIIIIll(this.aV.e()) || k.lIIIIIIIIIIIlII(Inventory.isFull() ? 1 : 0)) {
            return llIlIIIIIIIl[1];
        }
        if (k.lIIIIIIIIIIIlII(SquireGOTRPlugin.g.contains((Locatable)Players.getLocal()) ? 1 : 0)) {
            return llIlIIIIIIIl[1];
        }
        GameObject var2 = var1.aV.z();
        if (k.lIIIIIIIIIIIlIl(var2) && k.lIIIIIIIIIIIlII(Reachable.isInteractable((Locatable)var2) ? 1 : 0)) {
            var2.interact(llIlIIIIIIII[llIlIIIIIIIl[1]]);
            return llIlIIIIIIIl[0];
        }
        return llIlIIIIIIIl[1];
    }

    private static void lIIIIIIIIIIIIIl() {
        llIlIIIIIIII = new String[llIlIIIIIIIl[0]];
        k.llIlIIIIIIII[k.llIlIIIIIIIl[1]] = "Take";
    }

    @Inject
    public GrabbingAWeakCellTask(SquireGOTRPlugin squireGOTRPlugin) {
        c[] cArray = new c[llIlIIIIIIIl[0]];
        cArray[k.llIlIIIIIIIl[1]] = c.ACTIVATING;
        super(squireGOTRPlugin, cArray);
    }

    private static boolean lIIIIIIIIIIIlIl(Object object) {
        return object != null;
    }

}

