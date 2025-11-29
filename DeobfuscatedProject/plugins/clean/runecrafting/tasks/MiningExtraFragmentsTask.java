/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.GameObject
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
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
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.GameObject;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Mining extra fragments", priority=1)
public class MiningExtraFragmentsTask
extends RunecraftingTaskBase {

    @Override
    protected boolean ak() {
        WorldPoint worldPoint;
        o var1;
        if (!o.llllllllIIIlll(Inventory.isFull() ? 1 : 0) || !o.llllllllIIlIII(this.aV.g() ? 1 : 0) || !o.llllllllIIIlll(SquireGOTRPlugin.g.contains((Locatable)Players.getLocal()) ? 1 : 0) || o.llllllllIIlIII(SquireGOTRPlugin.h.contains((Locatable)Players.getLocal()) ? 1 : 0)) {
            return llIIllllIIll[1];
        }
        if (o.llllllllIIIlll(var1.aV.c() ? 1 : 0)) {
            return llIIllllIIll[1];
        }
        int[] nArray = new int[llIIllllIIll[0]];
        nArray[o.llIIllllIIll[1]] = llIIllllIIll[2];
        TileObject var2 = TileObjects.getNearest((int[])nArray);
        if (o.llllllllIIlIIl(var2)) {
            worldPoint = Players.getLocal().getWorldLocation();

        } else {
            worldPoint = var2.getWorldLocation();
        }
        int[] nArray2 = new int[llIIllllIIll[0]];
        nArray2[o.llIIllllIIll[1]] = llIIllllIIll[3];
        TileObject var3 = TileObjects.getNearest((WorldPoint)worldPoint, (int[])nArray2);
        if (o.llllllllIIlIIl(var3)) {
            return llIIllllIIll[1];
        }
        Player var4 = Players.getLocal();
        if (o.llllllllIIlIII(var4.isAnimating() ? 1 : 0)) {
            return llIIllllIIll[0];
        }
        if (o.llllllllIIIlll(var1.b((GameObject)var3) ? 1 : 0)) {
            var3.interact(llIIllllIIlI[llIIllllIIll[1]]);
            var1.sleep(llIIllllIIll[4]);
        }
        return llIIllllIIll[0];
    }

    private static boolean llllllllIIIlll(int n2) {
        return n2 == 0;
    }

    static {
        o.llllllllIIIllI();
        o.llllllllIIIlIl();
    }

    private static void llllllllIIIlIl() {
        llIIllllIIlI = new String[llIIllllIIll[0]];
        o.llIIllllIIlI[o.llIIllllIIll[1]] = "Mine";
    }

    private static boolean llllllllIIlIII(int n2) {
        return n2 != 0;
    }

    @Inject
    public MiningExtraFragmentsTask(SquireGOTRPlugin squireGOTRPlugin) {
        c[] cArray = new c[llIIllllIIll[0]];
        cArray[o.llIIllllIIll[1]] = c.ACTIVE;
        super(squireGOTRPlugin, cArray);
    }

    private static boolean llllllllIIlIIl(Object object) {
        return object == null;
    }
}

