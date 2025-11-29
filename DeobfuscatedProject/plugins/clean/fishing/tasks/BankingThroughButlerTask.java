/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Actor
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.pathfinder.TeleportLoader
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.fishing.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.fishing.SquireFisherConfig;
import gg.squire.fishing.tasks.GameEnum;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.pathfinder.TeleportLoader;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;

@TaskDesc(name="Banking through butler", priority=100, blocking=true)
public class BankingThroughButlerTask
extends Task {
    private final  SquireFisherConfig S;
    
    private final  Client T;

    private static void lllIlIllllIIIl() {
        lIlllIllIlII = new String[lIlllIllIlIl[4]];
        k.lIlllIllIlII[k.lIlllIllIlIl[0]] = "Demon butler";
        k.lIlllIllIlII[k.lIlllIllIlIl[1]] = "Call Servant";
        k.lIlllIllIlII[k.lIlllIllIlIl[8]] = "View House Options";
    }

    private void p() {
    }

    private static boolean lllIlIllllIIll(int n) {
        return n != 0;
    }

    @Inject
    public BankingThroughButlerTask(SquireFisherConfig squireFisherConfig, Client client) {
        this.S = squireFisherConfig;
        this.T = client;
    }

    private static boolean lllIlIllllIlII(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lllIlIlllllIII(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        void var2_2;
        k var1;
        if (!k.lllIlIllllIIll(this.S.butlerBanking() ? 1 : 0) || k.lllIlIllllIlII((Object)this.S.fish(), (Object)f.KARAMBWAN)) {
            return lIlllIllIlIl[0];
        }
        if (k.lllIlIllllIlIl(Inventory.isFull() ? 1 : 0)) {
            return lIlllIllIlIl[0];
        }
        if (k.lllIlIllllIlIl(var1.T.isInInstancedRegion() ? 1 : 0)) {
            TeleportLoader.enterHouse();

            return lIlllIllIlIl[1];
        }
        if (k.lllIlIllllIIll(Dialog.isOpen() ? 1 : 0)) {
            if (k.lllIlIllllIIll(Dialog.isEnterInputOpen() ? 1 : 0)) {
                Dialog.enterAmount((int)lIlllIllIlIl[2]);

                if (((0x68 ^ 0x4C) & ~(0x15 ^ 0x31)) != 0) {
                    return false;
                }
            } else if (k.lllIlIllllIIll(Dialog.canContinue() ? 1 : 0)) {
                Dialog.continueSpace();

                }
            } else if (k.lllIlIllllIIll(Dialog.isViewingOptions() ? 1 : 0)) {
                Dialog.chooseOption((int)lIlllIllIlIl[1]);

            }
            return lIlllIllIlIl[1];
        }
        String[] stringArray = new String[lIlllIllIlIl[1]];
        stringArray[k.lIlllIllIlIl[0]] = lIlllIllIlII[lIlllIllIlIl[0]];
        NPC var2 = NPCs.getNearest((String[])stringArray);
        if (k.lllIlIllllIllI(Widgets.get((int)lIlllIllIlIl[3], (int)lIlllIllIlIl[0]))) {
            if (!k.lllIlIllllIllI(var2) || k.lllIlIllllIlll(var2.distanceTo((Locatable)Players.getLocal()), lIlllIllIlIl[4])) {
                Widgets.get((int)lIlllIllIlIl[3], (int)lIlllIllIlIl[5]).interact(lIlllIllIlII[lIlllIllIlIl[1]]);

            }
        } else {
            Widgets.get((int)lIlllIllIlIl[6], (int)lIlllIllIlIl[7]).interact(lIlllIllIlII[lIlllIllIlIl[8]]);
        }
        if (!k.lllIlIllllIllI(var2) || k.lllIlIllllIlll(var2.distanceTo((Locatable)Players.getLocal()), lIlllIllIlIl[4])) {
            return lIlllIllIlIl[1];
        }
        int[] nArray = new int[lIlllIllIlIl[1]];
        nArray[k.lIlllIllIlIl[0]] = lIlllIllIlIl[9];
        Item var3 = Inventory.getFirst((int[])nArray);
        if (k.lllIlIlllllIII(var3)) {
            return lIlllIllIlIl[0];
        }
        var2_2.useOn((Actor)var1_1);
        return lIlllIllIlIl[1];
    }

    static {
        k.lllIlIllllIIlI();
        k.lllIlIllllIIIl();
    }

    private static boolean lllIlIllllIllI(Object object) {
        return object != null;
    }

    private static boolean lllIlIllllIlll(int n, int n2) {
        return n > n2;
    }

    private static boolean lllIlIllllIlIl(int n) {
        return n == 0;
    }
}

