/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Actor
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Projectile
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.Projectiles
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.construction.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.Actor;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Projectile;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Throwing fishing explosive", register=true)
public class ThrowingFishingExplosiveTask
extends Task {
    public static final  int cm;
    
    public static final  int cl;
    public static final  int ck;
    public static final  int cj;

    private static boolean lIIIIlIIll(int n2, int n3) {
        return n2 > n3;
    }

    private static void lIIIIIllll() {
        lIIIlIIl = new String[lIIIlIlI[9]];
        U.lIIIlIIl[U.lIIIlIlI[0]] = "Eat";
        U.lIIIlIIl[U.lIIIlIlI[2]] = "Eat";
    }

    private static boolean lIIIIlIlIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIIIlIllI(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(lllIIIlllIIllll);
    }

    private static boolean lIIIIlIIlI(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        void var4_4;
        Item item2 = Inventory.getFirst(item -> item.hasAction(lIIIlIIl[lIIIlIlI[2]]::equals));
        if (U.lIIIIlIIlI(item2)) {
            return lIIIlIlI[0];
        }
        if (U.lIIIIlIIll(Combat.getMissingHealth(), lIIIlIlI[1])) {
            void lllIIIlllIlllll;
            lllIIIlllIlllll.interact(lIIIlIIl[lIIIlIlI[0]]);
            return lIIIlIlI[2];
        }
        int[] nArray = new int[lIIIlIlI[2]];
        nArray[U.lIIIlIlI[0]] = lIIIlIlI[3];
        NPC lllIIIlllIllllI = NPCs.getNearest((int[])nArray);
        if (!U.lIIIIlIlII(lllIIIlllIllllI) || U.lIIIIlIlIl(lllIIIlllIllllI.distanceTo((Locatable)Players.getLocal()), lIIIlIlI[4])) {
            return lIIIlIlI[0];
        }
        int[] nArray2 = new int[lIIIlIlI[2]];
        nArray2[U.lIIIlIlI[0]] = lIIIlIlI[5];
        Projectile lllIIIlllIlllIl = Projectiles.getNearest((int[])nArray2);
        if (U.lIIIIlIlII(lllIIIlllIlllIl)) {
            return lIIIlIlI[0];
        }
        int[] nArray3 = new int[lIIIlIlI[2]];
        nArray3[U.lIIIlIlI[0]] = lIIIlIlI[6];
        Item lllIIIlllIlllII = Inventory.getFirst((int[])nArray3);
        if (U.lIIIIlIIlI(lllIIIlllIlllII)) {
            return lIIIlIlI[0];
        }
        var4_4.useOn((Actor)var2_2);
        this.sleep(lIIIlIlI[7]);
        return lIIIlIlI[2];
    }

    private static boolean lIIIIlIlII(Object object) {
        return object != null;
    }

    static {
        U.lIIIIlIIIl();
        U.lIIIIIllll();
        cl = lIIIlIlI[6];
        ck = lIIIlIlI[5];
        cm = lIIIlIlI[3];
        cj = lIIIlIlI[8];
    }
}

