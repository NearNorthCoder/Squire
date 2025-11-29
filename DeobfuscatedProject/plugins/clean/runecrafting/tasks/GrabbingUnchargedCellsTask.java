/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.GameObject
 *  net.runelite.api.Locatable
 *  net.unethicalite.api.entities.Players
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
import net.unethicalite.api.movement.Reachable;

@TaskDesc(name="Grabbing uncharged cells", priority=15, blocking=true)
public class GrabbingUnchargedCellsTask
extends RunecraftingTaskBase {

    static {
        j.lllllllllIIIll();
        j.lllllllllIIIlI();
    }

    private static boolean lllllllllIlIII(Object object) {
        return object != null;
    }

    private static boolean lllllllllIIllI(int n2) {
        return n2 != 0;
    }

    private static void lllllllllIIIlI() {
        llIIlllllIII = new String[llIIlllllIll[0]];
        j.llIIlllllIII[j.llIIlllllIll[1]] = "Take-10";
    }

    @Override
    protected boolean ak() {
        j var1;
        if (j.lllllllllIIlIl(this.aV.d(), llIIlllllIll[2])) {
            return llIIlllllIll[1];
        }
        if (j.lllllllllIIllI(SquireGOTRPlugin.g.contains((Locatable)Players.getLocal()) ? 1 : 0)) {
            return llIIlllllIll[1];
        }
        GameObject var2 = var1.aV.y();
        if (j.lllllllllIlIII(var2) && j.lllllllllIIllI(Reachable.isInteractable((Locatable)var2) ? 1 : 0)) {
            var2.interact(llIIlllllIII[llIIlllllIll[1]]);
            return llIIlllllIll[0];
        }
        return llIIlllllIll[1];
    }

    private static boolean lllllllllIIlIl(int n2, int n3) {
        return n2 == n3;
    }

    @Inject
    public GrabbingUnchargedCellsTask(SquireGOTRPlugin squireGOTRPlugin) {
        c[] cArray = new c[llIIlllllIll[0]];
        cArray[j.llIIlllllIll[1]] = c.ACTIVATING;
        super(squireGOTRPlugin, cArray);
    }
}

