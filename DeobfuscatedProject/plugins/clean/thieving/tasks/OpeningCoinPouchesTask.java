/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.GameState
 *  net.runelite.api.Item
 *  net.runelite.api.Player
 *  net.unethicalite.api.commons.Rand
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.thieving.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.thieving.SquireThievingConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.GameState;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Opening coin pouches", priority=0x7FFFFFFF)
public class OpeningCoinPouchesTask
extends Task {
    private  int y;
    private final  int x = 22;
    private final  SquireThievingConfig v;
    
    private final  int w = 15;

    private static boolean lIllIIIlIlIIIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIIIlIIlllIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIIIlIIllllI(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        j var1;
        if (j.lIllIIIlIIllIll(Game.getState(), GameState.LOGGED_IN)) {
            return lIIllIllIIllI[2];
        }
        Player var2 = Players.getLocal();
        if (j.lIllIIIlIIlllII(var2.getGraphic(), lIIllIllIIllI[3])) {
            String[] stringArray = new String[lIIllIllIIllI[4]];
            stringArray[j.lIIllIllIIllI[2]] = lIIllIllIIlIl[lIIllIllIIllI[2]];
            if (j.lIllIIIlIIlllIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray2 = new String[lIIllIllIIllI[4]];
                stringArray2[j.lIIllIllIIllI[2]] = lIIllIllIIlIl[lIIllIllIIllI[4]];
                Inventory.getFirst((String[])stringArray2).interact(lIIllIllIIlIl[lIIllIllIIllI[5]]);
                return lIIllIllIIllI[4];
            }
            return lIIllIllIIllI[2];
        }
        String[] stringArray = new String[lIIllIllIIllI[4]];
        stringArray[j.lIIllIllIIllI[2]] = lIIllIllIIlIl[lIIllIllIIllI[6]];
        Item var3 = Inventory.getFirst((String[])stringArray);
        if (j.lIllIIIlIIllllI(var3)) {
            return lIIllIllIIllI[2];
        }
        if (j.lIllIIIlIIlllll(Inventory.getFreeSlots(), lIIllIllIIllI[5])) {
            var3.interact(lIIllIllIIlIl[lIIllIllIIllI[7]]);
            return lIIllIllIIllI[4];
        }
        if (j.lIllIIIlIlIIIII(var3.getQuantity(), var1.y)) {
            return lIIllIllIIllI[2];
        }
        var2_2.interact(lIIllIllIIlIl[lIIllIllIIllI[8]]);
        this.y = Rand.nextInt((int)lIIllIllIIllI[0], (int)lIIllIllIIllI[1]);
        return lIIllIllIIllI[4];
    }

    private static boolean lIllIIIlIIlllII(int n2, int n3) {
        return n2 != n3;
    }

    static {
        j.lIllIIIlIIllIlI();
        j.lIllIIIlIIllIIl();
    }

    private static boolean lIllIIIlIIlllll(int n2, int n3) {
        return n2 <= n3;
    }

        return String.valueOf(var4);
    }

    private static void lIllIIIlIIllIIl() {
        lIIllIllIIlIl = new String[lIIllIllIIllI[9]];
        j.lIIllIllIIlIl[j.lIIllIllIIllI[2]] = "Coin pouch";
        j.lIIllIllIIlIl[j.lIIllIllIIllI[4]] = "Coin pouch";
        j.lIIllIllIIlIl[j.lIIllIllIIllI[5]] = "Open-all";
        j.lIIllIllIIlIl[j.lIIllIllIIllI[6]] = "Coin pouch";
        j.lIIllIllIIlIl[j.lIIllIllIIllI[7]] = "Open-all";
        j.lIIllIllIIlIl[j.lIIllIllIIllI[8]] = "Open-all";
    }

    @Inject
    public OpeningCoinPouchesTask(SquireThievingConfig squireThievingConfig) {
        this.w = lIIllIllIIllI[0];
        this.x = lIIllIllIIllI[1];
        this.y = Rand.nextInt((int)lIIllIllIIllI[0], (int)lIIllIllIIllI[1]);
        this.v = squireThievingConfig;
    }

    private static boolean lIllIIIlIIllIll(Object object, Object object2) {
        return object != object2;
    }
}

