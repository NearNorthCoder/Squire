/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.GameObject
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
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.GameObject;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Mining huge remains", priority=6, blocking=true)
public class MiningHugeRemainsTask
extends RunecraftingTaskBase {

    private static boolean lllllllIlIlllI(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected boolean ak() {
        void var1_1;
        y var1;
        if (!y.lllllllIlIlllI(this.aV.g() ? 1 : 0) || y.lllllllIlIllll(SquireGOTRPlugin.g.contains((Locatable)Players.getLocal()) ? 1 : 0)) {
            return llIIlllIllII[1];
        }
        if (y.lllllllIlIlllI(Inventory.isFull() ? 1 : 0)) {
            return llIIlllIllII[1];
        }
        int[] nArray = new int[llIIlllIllII[0]];
        nArray[y.llIIlllIllII[1]] = llIIlllIllII[2];
        TileObject var2 = TileObjects.getNearest((int[])nArray);
        if (y.lllllllIllIIIl(var2)) {
            return llIIlllIllII[1];
        }
        if (y.lllllllIlIlllI(Players.getLocal().isMoving() ? 1 : 0) && y.lllllllIlIlllI(var1.b((GameObject)var2) ? 1 : 0)) {
            return llIIlllIllII[0];
        }
        if (y.lllllllIllIIlI(var1.aV.o(), llIIlllIllII[3]) && y.lllllllIlIlllI(Players.getLocal().isAnimating() ? 1 : 0)) {
            return llIIlllIllII[0];
        }
        var1_1.interact(llIIlllIlIlI[llIIlllIllII[1]]);
        return llIIlllIllII[0];
    }

    private static void lllllllIlIlIll() {
        llIIlllIlIlI = new String[llIIlllIllII[0]];
        y.llIIlllIlIlI[y.llIIlllIllII[1]] = "Mine";
    }

    @Inject
    public MiningHugeRemainsTask(SquireGOTRPlugin squireGOTRPlugin) {
        c[] cArray = new c[llIIlllIllII[0]];
        cArray[y.llIIlllIllII[1]] = c.ACTIVE;
        super(squireGOTRPlugin, cArray);
    }

    private static boolean lllllllIllIIlI(int n2, int n3) {
        return n2 > n3;
    }

    static {
        y.lllllllIlIllIl();
        y.lllllllIlIlIll();
    }

    private static boolean lllllllIllIIIl(Object object) {
        return object == null;
    }

    private static boolean lllllllIlIllll(int n2) {
        return n2 == 0;
    }
}

