/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.GameState
 *  net.runelite.api.InventoryID
 *  net.runelite.api.Item
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Tab
 *  net.unethicalite.api.widgets.Widgets
 *  net.unethicalite.client.managers.InventoryManager
 */
package gg.squire.barrows.tasks;

import gg.squire.barrows.SquireBarrows;
import gg.squire.barrows.SquireBarrowsConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Instant;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.GameState;
import net.runelite.api.InventoryID;
import net.runelite.api.Item;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Tab;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.managers.InventoryManager;

@TaskDesc(name="Checking State", priority=2147482310)
public class CheckingStateTask
extends Task {
    private final  SquireBarrowsConfig E;

    private final  Instant F;
    private final  SquireBarrows D;

    static {
        h.lIllIIllIlIlIl();
        h.lIllIIllIlIlII();
    }

    @Inject
    public CheckingStateTask(SquireBarrows squireBarrows, SquireBarrowsConfig squireBarrowsConfig) {
        this.F = Instant.now();
        this.D = squireBarrows;
        this.E = squireBarrowsConfig;
    }

    private static boolean lIllIIllIllIll(int n2) {
        return n2 != 0;
    }

    public boolean run() {
        h var1;
        if (h.lIllIIllIlIllI(Game.getState(), GameState.LOGGED_IN)) {
            return llllIIIlIII[0];
        }
        if (h.lIllIIllIlIlll(Players.getLocal())) {
            return llllIIIlIII[0];
        }
        if (!h.lIllIIllIllIII(Game.isInCutscene() ? 1 : 0) || h.lIllIIllIlIlll(InventoryManager.getCachedContainers().get(InventoryID.INVENTORY.getId()))) {
            return llllIIIlIII[0];
        }
        Widget var2 = Widgets.fromId((int)llllIIIlIII[1]);
        if (h.lIllIIllIlIlll(var2)) {
            return llllIIIlIII[0];
        }
        WidgetInfo var3 = Tab.INVENTORY.getWidgetInfo();
        if (!h.lIllIIllIllIIl(var3) || h.lIllIIllIllIII(Widgets.isVisible((Widget)Widgets.get((WidgetInfo)var3)) ? 1 : 0)) {
            return llllIIIlIII[0];
        }
        int[] nArray = new int[llllIIIlIII[2]];
        nArray[h.llllIIIlIII[0]] = llllIIIlIII[3];
        Item var4 = Inventory.getFirst((int[])nArray);
        if (h.lIllIIllIllIIl(var4)) {
            Inventory.dropAll(item -> {
                boolean bl;
                if (h.lIllIIllIlllIl(item.getId(), llllIIIlIII[3])) {
                    bl = llllIIIlIII[2];

                    }
                } else {
                    bl = llllIIIlIII[0];
                }
                return bl;
            });

            return llllIIIlIII[2];
        }
        if (h.lIllIIllIllIlI(Inventory.getFreeSlots(), llllIIIlIII[4]) && h.lIllIIllIllIII(Inventory.contains(item -> {
            String[] stringArray = new String[llllIIIlIII[2]];
            stringArray[h.llllIIIlIII[0]] = llllIIIIlll[llllIIIlIII[12]];
            return item.hasAction(stringArray);
        }) ? 1 : 0)) {
            Log.info((String)llllIIIIlll[llllIIIlIII[0]]);
            var1.D.a(llllIIIlIII[2]);
        }
        int n2 = Inventory.contains(item -> {
            int n2;
            if (!h.lIllIIllIllIII(item.getName().toLowerCase().contains(llllIIIIlll[llllIIIlIII[10]]) ? 1 : 0) || h.lIllIIllIllIll(item.getName().toLowerCase().contains(llllIIIIlll[llllIIIlIII[11]]) ? 1 : 0)) {
                n2 = llllIIIlIII[2];

                }
            } else {
                n2 = llllIIIlIII[0];
            }
            return n2 != 0;
        });
        if (h.lIllIIllIllIll(var1.E.bankForPrayer() ? 1 : 0) && h.lIllIIllIllIII(n2)) {
            Log.info((String)llllIIIIlll[llllIIIlIII[2]]);
            var1.D.a(llllIIIlIII[2]);
        }
        Item var5 = Inventory.getFirst(item -> {
            String[] stringArray = new String[llllIIIlIII[2]];
            stringArray[h.llllIIIlIII[0]] = llllIIIIlll[llllIIIlIII[9]];
            return item.hasAction(stringArray);
        });
        if (h.lIllIIllIllIll(var1.E.bankForFood() ? 1 : 0) && h.lIllIIllIlIlll(var5) && (!h.lIllIIllIlllII(Combat.getCurrentHealth(), var1.E.eatAtHp()) || h.lIllIIllIllIII(var1.D.m() ? 1 : 0))) {
            Log.info((String)llllIIIIlll[llllIIIlIII[4]]);
            var1.D.a(llllIIIlIII[2]);
        }
        if (h.lIllIIllIllIII(var1.E.useHouse() ? 1 : 0) && h.lIllIIllIllIll(var1.D.v() ? 1 : 0)) {
            if (h.lIllIIllIllIII(var1.D.CheckingStateTask() ? 1 : 0)) {
                var1.D.b(llllIIIlIII[0]);
                return llllIIIlIII[2];
            }
            Log.info((String)llllIIIIlll[llllIIIlIII[5]]);
            return var1.J();
        }
        return llllIIIlIII[0];
    }

    private static boolean lIllIIllIllIlI(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var6);
    }

    private boolean J() {
        WorldPoint worldPoint = new WorldPoint(llllIIIlIII[6], llllIIIlIII[7], llllIIIlIII[0]);
        if (h.lIllIIllIllIII(Movement.shouldWalk() ? 1 : 0)) {
            return llllIIIlIII[2];
        }
        System.out.println(llllIIIIlll[llllIIIlIII[8]]);
        Movement.walkTo((WorldPoint)worldPoint);

        return llllIIIlIII[2];
    }

    private static boolean lIllIIllIllIIl(Object object) {
        return object != null;
    }

    private static boolean lIllIIllIlIllI(Object object, Object object2) {
        return object != object2;
    }

    private static void lIllIIllIlIlII() {
        llllIIIIlll = new String[llllIIIlIII[13]];
        h.llllIIIIlll[h.llllIIIlIII[0]] = "Inventory full, need to bank loot";
        h.llllIIIIlll[h.llllIIIlIII[2]] = "Out of prayer restores, need to bank";
        h.llllIIIIlll[h.llllIIIlIII[4]] = "No food or not enough food";
        h.llllIIIIlll[h.llllIIIlIII[5]] = "We have looted chest, but it doesn't seem like we need to bank yet.";
        h.llllIIIIlll[h.llllIIIlIII[8]] = "Reset walking";
        h.llllIIIIlll[h.llllIIIlIII[9]] = "Eat";
        h.llllIIIIlll[h.llllIIIlIII[10]] = "prayer";
        h.llllIIIIlll[h.llllIIIlIII[11]] = "restore";
        h.llllIIIIlll[h.llllIIIlIII[12]] = "Eat";
    }

    private static boolean lIllIIllIlIlll(Object object) {
        return object == null;
    }

    private static boolean lIllIIllIllIII(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIIllIlllII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIllIIllIlllIl(int n2, int n3) {
        return n2 == n3;
    }
}

