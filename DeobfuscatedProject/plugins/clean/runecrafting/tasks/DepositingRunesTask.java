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
import java.util.Arrays;
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

@TaskDesc(name="Depositing runes", priority=2, blocking=true, register=true)
public class DepositingRunesTask
extends RunecraftingTaskBase {

    static {
        t.lllllllIllllll();
        t.lllllllIlllIlI();
    }

    private static boolean llllllllIIIIll(int n2, int n3) {
        return n2 > n3;
    }

    @Inject
    public DepositingRunesTask(SquireGOTRPlugin squireGOTRPlugin) {
        c[] cArray = new c[llIIllllIIIl[0]];
        cArray[t.llIIllllIIIl[1]] = c.COUNTDOWN;
        cArray[t.llIIllllIIIl[2]] = c.ACTIVATING;
        cArray[t.llIIllllIIIl[3]] = c.ACTIVE;
        cArray[t.llIIllllIIIl[4]] = c.FINISHING;
        super(squireGOTRPlugin, cArray);
    }

    private static boolean llllllllIIIIIl(int n2) {
        return n2 != 0;
    }

    @Override
    protected boolean aj() {
        return llIIllllIIIl[2];
    }

    @Override
    protected boolean ak() {
        t var1;
        if (t.llllllllIIIIII(this.aW.depositRunes() ? 1 : 0)) {
            return llIIllllIIIl[1];
        }
        if (t.llllllllIIIIII(Inventory.contains(item -> {
            int n2;
            if (t.llllllllIIIIIl(item.isStackable() ? 1 : 0) && t.llllllllIIIIIl(item.getName().contains(llIIlllIlllI[llIIllllIIIl[2]]) ? 1 : 0)) {
                n2 = llIIllllIIIl[2];

                if (((0x4C ^ 2) & ~(0x23 ^ 0x6D)) < 0) {
                    return false;
                }
            } else {
                n2 = llIIllllIIIl[1];
            }
            return n2 != 0;
        }) ? 1 : 0)) {
            return llIIllllIIIl[1];
        }
        if (t.llllllllIIIIIl(SquireGOTRPlugin.g.contains((Locatable)Players.getLocal()) ? 1 : 0)) {
            return llIIllllIIIl[1];
        }
        int[] nArray = new int[llIIllllIIIl[2]];
        nArray[t.llIIllllIIIl[1]] = llIIllllIIIl[5];
        TileObject var2 = TileObjects.getNearest((int[])nArray);
        if (!t.llllllllIIIIlI(var2) || t.llllllllIIIIll(var2.distanceTo((Locatable)Players.getLocal()), llIIllllIIIl[6])) {
            return llIIllllIIIl[1];
        }
        if (t.llllllllIIIIII(var1.b((GameObject)var2) ? 1 : 0)) {
            var2.interact(llIIlllIlllI[llIIllllIIIl[1]]);
        }
        return llIIllllIIIl[2];
    }

    private static void lllllllIlllIlI() {
        llIIlllIlllI = new String[llIIllllIIIl[3]];
        t.llIIlllIlllI[t.llIIllllIIIl[1]] = "Deposit-runes";
        t.llIIlllIlllI[t.llIIllllIIIl[2]] = "rune";
    }

    private static boolean llllllllIIIIII(int n2) {
        return n2 == 0;
    }

    private static boolean llllllllIIIIlI(Object object) {
        return object != null;
    }
}

