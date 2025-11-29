/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.GameState
 *  net.runelite.api.Item
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Prayers
 */
package gg.squire.construction.tasks;

import gg.squire.basics.cerberus.SquireCerberus;
import gg.squire.basics.cerberus.SquireCerberusConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.construction.tasks.ConstructionManager;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.GameState;
import net.runelite.api.Item;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;

@TaskDesc(name="Checking State", priority=2147482310)
public class CheckingStateTask
extends Task {
    private final  a aq;

    private final  SquireCerberus ao;
    private final  SquireCerberusConfig ap;

    private static boolean lIlllllllll(int n2) {
        return n2 == 0;
    }

    @Inject
    public CheckingStateTask(SquireCerberus squireCerberus, SquireCerberusConfig squireCerberusConfig, a a2) {
        this.ao = squireCerberus;
        this.ap = squireCerberusConfig;
        this.aq = a2;
    }

    public boolean run() {
        Item lIlIlllIIIlllIl;
        m lIlIlllIIlIIIII;
        if (m.lIllllllIll(Game.getState(), GameState.LOGGED_IN)) {
            return llIllllII[0];
        }
        if (m.lIlllllllII(Players.getLocal())) {
            return llIllllII[0];
        }
        int[] nArray = new int[llIllllII[1]];
        nArray[m.llIllllII[0]] = llIllllII[2];
        Item lIlIlllIIIlllll = Inventory.getFirst((int[])nArray);
        if (m.lIlllllllIl(lIlIlllIIIlllll)) {
            lIlIlllIIIlllll.interact(llIlllIll[llIllllII[0]]);
        }
        if (m.lIllllllllI(lIlIlllIIlIIIII.ao.r() ? 1 : 0)) {
            return llIllllII[0];
        }
        if (m.lIlllllllIl(lIlIlllIIlIIIII.aq.k())) {
            return llIllllII[0];
        }
        if (m.lIlllllllll(lIlIlllIIlIIIII.ao.p().isEmpty() ? 1 : 0)) {
            return llIllllII[0];
        }
        if (m.llIIIIIIIII(Inventory.getCount(item -> {
            int n2;
            if (m.lIlllllllll(item.getName().contains(llIlllIll[llIllllII[9]]) ? 1 : 0)) {
                String[] stringArray = new String[llIllllII[1]];
                stringArray[m.llIllllII[0]] = llIlllIll[llIllllII[10]];
                if (m.lIllllllllI(item.hasAction(stringArray) ? 1 : 0)) {
                    n2 = llIllllII[1];

                    if ((0x9A ^ 0x9E) > 2) return n2 != 0;
                    return false;
                }
            }
            n2 = llIllllII[0];
            return n2 != 0;
        }), lIlIlllIIlIIIII.ap.bankUnderAmount())) {
            Log.info((String)llIlllIll[llIllllII[1]]);
            lIlIlllIIlIIIII.ao.b(llIllllII[1]);
        }
        Item lIlIlllIIIllllI = Inventory.getFirst(item -> {
            int n2;
            block3: {
                block2: {
                    if (!m.lIlllllllll(item.getName().toLowerCase().contains(llIlllIll[llIllllII[6]]) ? 1 : 0)) break block2;
                    if (!m.lIllllllllI(item.getName().toLowerCase().contains(llIlllIll[llIllllII[7]]) ? 1 : 0)) break block3;
                    String[] stringArray = new String[llIllllII[1]];
                    stringArray[m.llIllllII[0]] = llIlllIll[llIllllII[8]];
                    if (!m.lIllllllllI(item.hasAction(stringArray) ? 1 : 0)) break block3;
                }
                n2 = llIllllII[1];

                if (3 >= 0) return n2 != 0;
                return false;
            }
            n2 = llIllllII[0];
            return n2 != 0;
        });
        if (m.lIlllllllll(Prayers.getPoints()) && m.lIlllllllII(lIlIlllIIIllllI)) {
            Log.info((String)llIlllIll[llIllllII[3]]);
            lIlIlllIIlIIIII.ao.b(llIllllII[1]);
        }
        if (m.lIlllllllII(lIlIlllIIIlllIl = Inventory.getFirst(item -> {
            String[] stringArray = new String[llIllllII[1]];
            stringArray[m.llIllllII[0]] = llIlllIll[llIllllII[5]];
            return item.hasAction(stringArray);
        })) && m.llIIIIIIIII(Combat.getCurrentHealth(), lIlIlllIIlIIIII.ap.eatAtHealth())) {
            Log.info((String)llIlllIll[llIllllII[4]]);
            lIlIlllIIlIIIII.ao.b(llIllllII[1]);
        }
        return llIllllII[0];
    }

    private static boolean lIllllllllI(int n2) {
        return n2 != 0;
    }

    private static boolean lIlllllllIl(Object object) {
        return object != null;
    }

    private static void lIllllllIIl() {
        llIlllIll = new String[llIllllII[11]];
        m.llIlllIll[m.llIllllII[0]] = "Drop";
        m.llIlllIll[m.llIllllII[1]] = "We're low on food, need to bank";
        m.llIlllIll[m.llIllllII[3]] = "No prayer points, need to bank";
        m.llIlllIll[m.llIllllII[4]] = "No food or not enough food";
        m.llIlllIll[m.llIllllII[5]] = "Eat";
        m.llIlllIll[m.llIllllII[6]] = "prayer";
        m.llIlllIll[m.llIllllII[7]] = "restore";
        m.llIlllIll[m.llIllllII[8]] = "Drink";
        m.llIlllIll[m.llIllllII[9]] = "Summer pie";
        m.llIlllIll[m.llIllllII[10]] = "Eat";
    }

    private static boolean lIllllllIll(Object object, Object object2) {
        return object != object2;
    }

    static {
        m.lIllllllIlI();
        m.lIllllllIIl();
    }

    private static boolean llIIIIIIIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlllllllII(Object object) {
        return object == null;
    }

        return String.valueOf(lIlIllIllllllll);
    }
}

