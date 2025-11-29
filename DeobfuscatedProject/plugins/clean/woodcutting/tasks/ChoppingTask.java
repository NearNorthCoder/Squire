/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.client.Static
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.woodcutting.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.woodcutting.SquireWoodcutterConfig;
import gg.squire.woodcutting.SquireWoodcutterPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import gg.squire.woodcutting.tasks.GameEnum6;

@TaskDesc(name="Chopping", priority=25, register=true)
public class ChoppingTask
extends Task {
    private final  int[] x;
    private static final  Logger u;
    private final  int[] y;
    
    private final  SquireWoodcutterConfig v;
    
    private final  SquireWoodcutterPlugin w;

    @Inject
    public ChoppingTask(SquireWoodcutterPlugin squireWoodcutterPlugin, SquireWoodcutterConfig squireWoodcutterConfig) {
        int[] nArray = new int[lIllIIIlIIIIl[0]];
        nArray[c.lIllIIIlIIIIl[1]] = lIllIIIlIIIIl[2];
        nArray[c.lIllIIIlIIIIl[3]] = lIllIIIlIIIIl[4];
        nArray[c.lIllIIIlIIIIl[5]] = lIllIIIlIIIIl[6];
        nArray[c.lIllIIIlIIIIl[7]] = lIllIIIlIIIIl[8];
        this.x = nArray;
        int[] nArray2 = new int[lIllIIIlIIIIl[0]];
        nArray2[c.lIllIIIlIIIIl[1]] = lIllIIIlIIIIl[9];
        nArray2[c.lIllIIIlIIIIl[3]] = lIllIIIlIIIIl[10];
        nArray2[c.lIllIIIlIIIIl[5]] = lIllIIIlIIIIl[11];
        nArray2[c.lIllIIIlIIIIl[7]] = lIllIIIlIIIIl[12];
        this.y = nArray2;
        this.w = squireWoodcutterPlugin;
        this.v = squireWoodcutterConfig;
    }

    private static boolean llIIIlIIlIlIlll(int n) {
        return n != 0;
    }

    private static boolean llIIIlIIlIllIlI(Object object) {
        return object == null;
    }

    public boolean run() {
        c var1;
        if (c.llIIIlIIlIlIlll(this.v.fastTickChop() ? 1 : 0)) {
            return lIllIIIlIIIIl[1];
        }
        if (!c.llIIIlIIlIllIII(Bank.isOpen() ? 1 : 0) || c.llIIIlIIlIlIlll(Inventory.isFull() ? 1 : 0)) {
            return lIllIIIlIIIIl[1];
        }
        if (c.llIIIlIIlIlIlll(var1.w.p() ? 1 : 0)) {
            return lIllIIIlIIIIl[1];
        }
        if (c.llIIIlIIlIllIIl((Object)var1.v.tree(), (Object)a.REDWOOD) && c.llIIIlIIlIllIII(Static.getClient().getPlane())) {
            TileObject var2 = TileObjects.getNearest(tileObject -> {
                String[] stringArray = new String[lIllIIIlIIIIl[3]];
                stringArray[c.lIllIIIlIIIIl[1]] = lIllIIIIlllIl[lIllIIIlIIIIl[16]];
                return tileObject.hasAction(stringArray);
            });
            if (c.llIIIlIIlIllIlI(var2)) {
                return lIllIIIlIIIIl[1];
            }
            var2.interact(lIllIIIIlllIl[lIllIIIlIIIIl[1]]);
            return lIllIIIlIIIIl[3];
        }
        if (c.llIIIlIIlIllIII(var1.v.tickChop() ? 1 : 0) && c.llIIIlIIlIlIlll(Players.getLocal().isAnimating() ? 1 : 0)) {
            return lIllIIIlIIIIl[1];
        }
        Predicate<String> var2 = string -> {
            int n;
            if (c.llIIIlIIlIllIll(string) && (!c.llIIIlIIlIllIII(string.startsWith(lIllIIIIlllIl[lIllIIIlIIIIl[0]]) ? 1 : 0) || c.llIIIlIIlIlIlll(string.equals(lIllIIIIlllIl[lIllIIIlIIIIl[14]]) ? 1 : 0))) {
                n = lIllIIIlIIIIl[3];

                if ((0x55 ^ 0x14 ^ (0xD8 ^ 0x9C)) <= 0) {
                    return ((52 + 188 - 152 + 159 ^ 106 + 88 - 84 + 60) & (0xAD ^ 0x8E ^ (1 ^ 0x7F) ^ -1)) != 0;
                }
            } else {
                n = lIllIIIlIIIIl[1];
            }
            return n != 0;
        };
        TileObject var3 = TileObjects.getNearest(tileObject -> {
            int n;
            if (c.llIIIlIIlIlIlll(tileObject.getName().startsWith(this.v.tree().r()) ? 1 : 0) && c.llIIIlIIlIlllIl(tileObject.distanceTo((Locatable)Players.getLocal()), lIllIIIlIIIIl[15]) && c.llIIIlIIlIlIlll(tileObject.hasAction(var2) ? 1 : 0)) {
                n = lIllIIIlIIIIl[3];

                if (-1 >= 2) {
                    return false;
                }
            } else {
                n = lIllIIIlIIIIl[1];
            }
            return n != 0;
        });
        if (!c.llIIIlIIlIllIll(var3) || !c.llIIIlIIlIlllII(Players.getLocal().distanceTo(var1.w.o().getCenter()), lIllIIIlIIIIl[13]) || c.llIIIlIIlIllIII(Reachable.isInteractable((Locatable)var3) ? 1 : 0)) {
            Movement.walkTo((WorldArea)var1.w.o());

            return lIllIIIlIIIIl[3];
        }
        if (c.llIIIlIIlIlIlll(var1.v.tickChop() ? 1 : 0)) {
            if (c.llIIIlIIlIllIII(Inventory.contains((int[])var1.x) ? 1 : 0) && c.llIIIlIIlIlIlll(Inventory.contains((int[])var1.y) ? 1 : 0)) {
                Log.info((String)lIllIIIIlllIl[lIllIIIlIIIIl[3]]);
                Inventory.getFirst((int[])var1.y).interact(lIllIIIIlllIl[lIllIIIlIIIIl[5]]);
                return lIllIIIlIIIIl[3];
            }
            if (c.llIIIlIIlIllIII(var1.w.d() ? 1 : 0)) {
                System.out.println(lIllIIIIlllIl[lIllIIIlIIIIl[7]]);
                return lIllIIIlIIIIl[1];
            }
            var1.w.h();
            var3.interact(var2);
            var1.sleep(lIllIIIlIIIIl[7]);
            return lIllIIIlIIIIl[3];
        }
        if (c.llIIIlIIlIlIlll(Movement.shouldWalk() ? 1 : 0)) {
            var3.interact(var2);
            var1.sleep(lIllIIIlIIIIl[14]);
            return lIllIIIlIIIIl[3];
        }
        return lIllIIIlIIIIl[1];
    }

    static {
        c.llIIIlIIlIlIllI();
        c.llIIIlIIlIIllII();
        u = LoggerFactory.getLogger(ChoppingTask.class);
    }

        return String.valueOf(var4);
    }

    private static boolean llIIIlIIlIllIIl(Object object, Object object2) {
        return object == object2;
    }

    private static void llIIIlIIlIIllII() {
        lIllIIIIlllIl = new String[lIllIIIlIIIIl[17]];
        c.lIllIIIIlllIl[c.lIllIIIlIIIIl[1]] = "Climb-up";
        c.lIllIIIIlllIl[c.lIllIIIlIIIIl[3]] = "Cleaning herb";
        c.lIllIIIIlllIl[c.lIllIIIlIIIIl[5]] = "Clean";
        c.lIllIIIIlllIl[c.lIllIIIlIIIIl[7]] = "We are missing an item to properly 3 tick.";
        c.lIllIIIIlllIl[c.lIllIIIlIIIIl[0]] = "Chop";
        c.lIllIIIIlllIl[c.lIllIIIlIIIIl[14]] = "Cut";
        c.lIllIIIIlllIl[c.lIllIIIlIIIIl[16]] = "Climb-up";
    }

    private static boolean llIIIlIIlIlllII(int n, int n2) {
        return n < n2;
    }

    private static boolean llIIIlIIlIllIll(Object object) {
        return object != null;
    }

    private static boolean llIIIlIIlIllIII(int n) {
        return n == 0;
    }

    private static boolean llIIIlIIlIlllIl(int n, int n2) {
        return n <= n2;
    }

}

