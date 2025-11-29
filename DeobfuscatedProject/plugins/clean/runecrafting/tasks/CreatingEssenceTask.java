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
 *  net.unethicalite.api.movement.Movement
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
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;

@TaskDesc(name="Creating essence", priority=1, blocking=true)
public class CreatingEssenceTask
extends RunecraftingTaskBase {

    private static boolean llllllIIlllllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llllllIlIIIIII(Object object) {
        return object != null;
    }

    @Inject
    public CreatingEssenceTask(SquireGOTRPlugin squireGOTRPlugin) {
        c[] cArray = new c[llIIllIlIIlI[0]];
        cArray[n.llIIllIlIIlI[1]] = c.COUNTDOWN;
        cArray[n.llIIllIlIIlI[2]] = c.ACTIVE;
        super(squireGOTRPlugin, cArray);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean ak() {
        void var1_1;
        n var1;
        if (n.llllllIIllllIl((Object)this.aV.m(), (Object)c.ACTIVATING) && n.llllllIIlllllI(this.aV.a(), this.aW.fragmentAmount())) {
            return llIIllIlIIlI[1];
        }
        int[] nArray = new int[llIIllIlIIlI[2]];
        nArray[n.llIIllIlIIlI[1]] = llIIllIlIIlI[3];
        TileObject var2 = TileObjects.getNearest((int[])nArray);
        Player var3 = Players.getLocal();
        if (!n.llllllIIllllll(Inventory.isFull() ? 1 : 0) || !n.llllllIlIIIIII(var2) || n.llllllIlIIIIIl(SquireGOTRPlugin.g.contains((Locatable)var3) ? 1 : 0)) {
            return llIIllIlIIlI[1];
        }
        if (n.llllllIlIIIIIl(SquireGOTRPlugin.h.contains((Locatable)var3) ? 1 : 0) && n.llllllIIlllllI(var1.aV.a(), var1.aW.fragmentAmount())) {
            return llIIllIlIIlI[1];
        }
        if (n.llllllIlIIIIIl(var1.aV.c() ? 1 : 0)) {
            return llIIllIlIIlI[1];
        }
        if (n.llllllIlIIIIlI(var1.aV.o(), llIIllIlIIlI[0]) && n.llllllIlIIIIll(Players.getLocal().getAnimation(), llIIllIlIIlI[4])) {
            return llIIllIlIIlI[2];
        }
        if (n.llllllIIllllll(Reachable.isInteractable((Locatable)var2) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)var2.getWorldLocation(), (boolean)llIIllIlIIlI[1]);

            return llIIllIlIIlI[2];
        }
        if (n.llllllIlIIIIIl(var1.b((GameObject)var2) ? 1 : 0)) {
            return llIIllIlIIlI[1];
        }
        var1_1.interact(llIIllIlIIIl[llIIllIlIIlI[1]]);
        this.sleep(llIIllIlIIlI[2]);
        return llIIllIlIIlI[2];
    }

    private static boolean llllllIIllllll(int n2) {
        return n2 == 0;
    }

    private static boolean llllllIlIIIIIl(int n2) {
        return n2 != 0;
    }

    private static void llllllIIlllIll() {
        llIIllIlIIIl = new String[llIIllIlIIlI[2]];
        n.llIIllIlIIIl[n.llIIllIlIIlI[1]] = "Work-at";
    }

    static {
        n.llllllIIllllII();
        n.llllllIIlllIll();
    }

    private static boolean llllllIlIIIIlI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llllllIIllllIl(Object object, Object object2) {
        return object == object2;
    }

    private static boolean llllllIlIIIIll(int n2, int n3) {
        return n2 == n3;
    }

}

