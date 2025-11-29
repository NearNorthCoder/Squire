/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$Inventory
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 */
package gg.squire.nightmare.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import gg.squire.nightmare.tasks.NightmareTaskBase;
import gg.squire.nightmare.tasks.NightmareManager;
import gg.squire.nightmare.tasks.NightmareManager;

@TaskDesc(name="Retrieving teleport for death walking.", priority=0x7FFFFFFF, blocking=true)
public class RetrievingTeleportForDeathWalkingTask
extends NightmareTaskBase {

    private static boolean lIIlIIIIlIIIIll(int n2) {
        return n2 != 0;
    }

    @Inject
    protected RetrievingTeleportForDeathWalkingTask(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, h h2) {
        super(squireNightmareConfig, squireNightmarePlugin, h2);
    }

    @Override
    public boolean bY() {
        BankLocation var1;
        X var2;
        if (X.lIIlIIIIlIIIIlI(this.cV.enableBanking() ? 1 : 0)) {
            return llllIlIIlIlI[0];
        }
        if (X.lIIlIIIIlIIIIlI(var2.cW.ad() ? 1 : 0)) {
            return llllIlIIlIlI[0];
        }
        int[] nArray = new int[llllIlIIlIlI[1]];
        nArray[X.llllIlIIlIlI[0]] = llllIlIIlIlI[2];
        nArray[X.llllIlIIlIlI[3]] = llllIlIIlIlI[4];
        if (X.lIIlIIIIlIIIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return llllIlIIlIlI[0];
        }
        TileObject var3 = TileObjects.getNearest(tileObject -> tileObject.getName().contains(llllIlIIlIIl[llllIlIIlIlI[6]]));
        if (X.lIIlIIIIlIIIlII(var3)) {
            return llllIlIIlIlI[0];
        }
        if (X.lIIlIIIIlIIIIll(Bank.isOpen() ? 1 : 0)) {
            var1 = item -> {
                int n2;
                if (X.lIIlIIIIlIIIIll(item.getName().toLowerCase().contains(llllIlIIlIIl[llllIlIIlIlI[1]]) ? 1 : 0) && X.lIIlIIIIlIIIIlI(item.isPlaceholder() ? 1 : 0)) {
                    n2 = llllIlIIlIlI[3];

                    if ((0x47 ^ 0x40 ^ 3) == 1) {
                        return ((0x59 ^ 0x35 ^ (0x4C ^ 0x11)) & (21 + 166 - 70 + 57 ^ 150 + 12 - 133 + 130 ^ -1)) != 0;
                    }
                } else {
                    n2 = llllIlIIlIlI[0];
                }
                return n2 != 0;
            };
            if (X.lIIlIIIIlIIIIll(var2.cb() ? 1 : 0) && X.lIIlIIIIlIIIIll(Bank.contains((Predicate)var1) ? 1 : 0)) {
                return var2.a((Predicate<Item>)var1);
            }
            if (X.lIIlIIIIlIIIIll(j.aU() ? 1 : 0)) {
                int[] nArray2 = new int[llllIlIIlIlI[3]];
                nArray2[X.llllIlIIlIlI[0]] = llllIlIIlIlI[4];
                Item var4 = Bank.getFirst((int[])nArray2);
                if (X.lIIlIIIIlIIIlIl(var4)) {
                    int[] nArray3 = new int[llllIlIIlIlI[3]];
                    nArray3[X.llllIlIIlIlI[0]] = llllIlIIlIlI[2];
                    var4 = Bank.getFirst((int[])nArray3);
                }
                if (X.lIIlIIIIlIIIlII(var4)) {
                    Bank.withdraw((int)var4.getId(), (int)llllIlIIlIlI[3], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                    var2.sleep(llllIlIIlIlI[1]);
                    return llllIlIIlIlI[3];
                }

                if (((0 ^ 0x33) & ~(0x9D ^ 0xAE)) != 0) {
                    return false;
                }
            } else {
                int[] nArray4 = new int[llllIlIIlIlI[3]];
                nArray4[X.llllIlIIlIlI[0]] = llllIlIIlIlI[2];
                Item var4 = Bank.getFirst((int[])nArray4);
                if (X.lIIlIIIIlIIIlIl(var4)) {
                    int[] nArray5 = new int[llllIlIIlIlI[3]];
                    nArray5[X.llllIlIIlIlI[0]] = llllIlIIlIlI[4];
                    var4 = Bank.getFirst((int[])nArray5);
                }
                if (X.lIIlIIIIlIIIlII(var4)) {
                    Bank.withdraw((int)var4.getId(), (int)llllIlIIlIlI[3], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                    var2.sleep(llllIlIIlIlI[1]);
                    return llllIlIIlIlI[3];
                }
            }
        }
        if (X.lIIlIIIIlIIIIlI(Movement.shouldWalk() ? 1 : 0)) {
            return llllIlIIlIlI[0];
        }
        var1 = BankLocation.getNearest();
        if (X.lIIlIIIIlIIIllI(var1.getArea().distanceTo(Players.getLocal().getWorldLocation()), llllIlIIlIlI[5])) {
            Movement.walkTo((WorldArea)var1.getArea());

            return llllIlIIlIlI[3];
        }
        return Bank.open();
    }

    private static void lIIlIIIIIllllll() {
        llllIlIIlIIl = new String[llllIlIIlIlI[5]];
        X.llllIlIIlIIl[X.llllIlIIlIlI[0]] = "Drink";
        X.llllIlIIlIIl[X.llllIlIIlIlI[3]] = "Eat";
        X.llllIlIIlIIl[X.llllIlIIlIlI[1]] = "stamina potion";
        X.llllIlIIlIIl[X.llllIlIIlIlI[6]] = "Pool of Nightmares";
    }

    private static boolean lIIlIIIIlIIIIlI(int n2) {
        return n2 == 0;
    }

        return String.valueOf(var5);
    }

    private static boolean lIIlIIIIlIIIlIl(Object object) {
        return object == null;
    }

    static {
        X.lIIlIIIIlIIIIIl();
        X.lIIlIIIIIllllll();
    }

    private static boolean lIIlIIIIlIIIlll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlIIIIlIIIlII(Object object) {
        return object != null;
    }

    protected boolean a(Predicate<Item> predicate) {
        if (X.lIIlIIIIlIIIlII(Bank.Inventory.getFirst(predicate))) {
            String[] stringArray = new String[llllIlIIlIlI[1]];
            stringArray[X.llllIlIIlIlI[0]] = llllIlIIlIIl[llllIlIIlIlI[0]];
            stringArray[X.llllIlIIlIlI[3]] = llllIlIIlIIl[llllIlIIlIlI[3]];
            Bank.Inventory.getFirst(predicate).interact(stringArray);
            return llllIlIIlIlI[3];
        }
        if (X.lIIlIIIIlIIIlll(Inventory.getFreeSlots(), llllIlIIlIlI[3])) {
            Bank.depositInventory();
            return llllIlIIlIlI[3];
        }
        Bank.withdraw(predicate, (int)llllIlIIlIlI[3], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
        return llllIlIIlIlI[3];
    }

    private static boolean lIIlIIIIlIIIllI(int n2, int n3) {
        return n2 > n3;
    }
}

