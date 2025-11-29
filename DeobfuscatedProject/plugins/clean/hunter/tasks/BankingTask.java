/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Item
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$Inventory
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.hunter.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import gg.squire.hunter.tasks.CheckingSuppliesTask;
import gg.squire.hunter.tasks.GameEnum9;
import squire.gg.hunter.SquireHerbiboarConfig;
import squire.gg.hunter.SquireHerbiboarPlugin;

@TaskDesc(name="Banking", priority=2)
public class BankingTask
extends Task {
    private static final  WorldPoint ad;
    private static final  Logger ac;
    
     Predicate<Item> ah;
    private final  SquireHerbiboarConfig ae;
     Predicate<Item> ai;
    private final  SquireHerbiboarPlugin af;
    
    private final  d ag;

    private static boolean lIIIlIlIllllllI(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    public static boolean a(Predicate<Item> predicate) {
        boolean bl;
        void var1;
        int n2 = lllIIlllIlII[0];
        Iterator var2 = Inventory.getAll(predicate).iterator();
        while (l.lIIIlIlIllllIlI(var2.hasNext() ? 1 : 0)) {
            Item var3 = (Item)var2.next();
            int[] nArray = new int[lllIIlllIlII[1]];
            nArray[l.lllIIlllIlII[2]] = var3.getId();
            Bank.depositAll((int[])nArray);
            if (l.lIIIlIlIllllIll((int)(--var1))) {
                return lllIIlllIlII[1];
            }

            if (3 != 0) continue;
            return false;
        }
        if (l.lIIIlIlIlllllII((int)var1, lllIIlllIlII[0])) {
            bl = lllIIlllIlII[1];

            if (((0xB3 ^ 0xA7) & ~(0x2A ^ 0x3E)) >= (0x54 ^ 0x50)) {
                return false;
            }
        } else {
            bl = lllIIlllIlII[2];
        }
        return bl;
    }

    private static boolean lIIIlIlIlllllIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIlIlIlllllII(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var4);
    }

    private static boolean lIIIlIllIIIIIII(int n2) {
        return n2 > 0;
    }

    private static boolean lIIIlIlIlllllll(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIIIlIlIllllIll(int n2) {
        return n2 <= 0;
    }

    @Inject
    public BankingTask(SquireHerbiboarConfig squireHerbiboarConfig, SquireHerbiboarPlugin squireHerbiboarPlugin, d d2) {
        this.ah = item -> {
            int n2;
            if (!l.lIIIlIlIlllllIl(item.getName().toLowerCase().contains(lllIIlllIIll[lllIIlllIlII[3]]) ? 1 : 0) || !l.lIIIlIlIlllllIl(item.getName().toLowerCase().contains(lllIIlllIIll[lllIIlllIlII[7]]) ? 1 : 0) || l.lIIIlIlIllllIlI(item.getName().toLowerCase().contains(lllIIlllIIll[lllIIlllIlII[8]]) ? 1 : 0)) {
                n2 = lllIIlllIlII[1];

                if (1 > 1) {
                    return false;
                }
            } else {
                n2 = lllIIlllIlII[2];
            }
            return n2 != 0;
        };
        this.ai = item -> item.getName().toLowerCase().contains(lllIIlllIIll[lllIIlllIlII[6]]);
        this.ae = squireHerbiboarConfig;
        this.af = squireHerbiboarPlugin;
        this.ag = d2;
    }

    private static void lIIIlIlIllllIII() {
        lllIIlllIIll = new String[lllIIlllIlII[0]];
        l.lllIIlllIIll[l.lllIIlllIlII[2]] = "Empty";
        l.lllIIlllIIll[l.lllIIlllIlII[1]] = "sack";
        l.lllIIlllIIll[l.lllIIlllIlII[4]] = "sack";
        l.lllIIlllIIll[l.lllIIlllIlII[5]] = "grimy";
        l.lllIIlllIIll[l.lllIIlllIlII[6]] = "herb sack";
        l.lllIIlllIIll[l.lllIIlllIlII[3]] = "grimy";
        l.lllIIlllIIll[l.lllIIlllIlII[7]] = "fossil";
        l.lllIIlllIIll[l.lllIIlllIlII[8]] = "numulite";
    }

    public boolean run() {
        l var5;
        if (l.lIIIlIlIlllllIl(this.af.f() ? 1 : 0)) {
            return lllIIlllIlII[2];
        }
        if (l.lIIIlIlIlllllIl(Movement.shouldWalk() ? 1 : 0)) {
            return lllIIlllIlII[2];
        }
        Player var6 = Players.getLocal();
        if (l.lIIIlIlIlllllIl(Bank.isOpen() ? 1 : 0)) {
            if (l.lIIIlIlIllllllI(var6.distanceTo(ad), lllIIlllIlII[3])) {
                Movement.walkTo((WorldPoint)ad);

                return lllIIlllIlII[1];
            }
            return Bank.open();
        }
        if (l.lIIIlIlIllllIlI(var5.ae.useHerbSack() ? 1 : 0) && l.lIIIlIlIllllIlI(Inventory.contains(item -> item.getName().toLowerCase().contains(lllIIlllIIll[lllIIlllIlII[5]])) ? 1 : 0)) {
            var5.af.b(lllIIlllIlII[2]);
        }
        if (l.lIIIlIlIllllIlI(Inventory.contains(var5.ah) ? 1 : 0)) {
            l.a(var5.ah);

            return lllIIlllIlII[1];
        }
        if (l.lIIIlIlIllllIlI(var5.ae.useHerbSack() ? 1 : 0) && l.lIIIlIlIlllllIl(Inventory.contains(var5.ai) ? 1 : 0)) {
            Bank.withdraw(var5.ai, (int)lllIIlllIlII[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
        }
        if (l.lIIIlIlIllllIlI(var5.ae.useHerbSack() ? 1 : 0) && l.lIIIlIlIlllllIl(var5.af.g() ? 1 : 0) && l.lIIIlIlIllllIlI(Inventory.contains(item -> item.getName().toLowerCase().contains(lllIIlllIIll[lllIIlllIlII[4]])) ? 1 : 0)) {
            Bank.Inventory.getFirst(item -> item.getName().toLowerCase().contains(lllIIlllIIll[lllIIlllIlII[1]])).interact(lllIIlllIIll[lllIIlllIlII[2]]);
            return lllIIlllIlII[1];
        }
        e var7 = var5.ae.useEnergyRestoration();
        if (l.lIIIlIlIlllllll((Object)var7, (Object)e.NONE)) {
            int var8 = var5.ae.quantity();
            int[] var9 = var7.j();
            int var10 = var9.length;
            int var11 = lllIIlllIlII[2];
            while (l.lIIIlIlIlllllII(var11, var10)) {
                int var12 = var9[var11];
                int[] nArray = new int[lllIIlllIlII[1]];
                nArray[l.lllIIlllIlII[2]] = var12;
                if (l.lIIIlIlIllllIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray2 = new int[lllIIlllIlII[1]];
                    nArray2[l.lllIIlllIlII[2]] = var12;
                    int var13 = Bank.getCount((boolean)lllIIlllIlII[1], (int[])nArray2);
                    Bank.withdraw((int)var12, (int)var5.ae.quantity(), (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                    if (l.lIIIlIlIllllIll(var8 -= var13)) {

                        if (-(95 + 122 - 60 + 26 ^ 2 + 132 - -41 + 4) < 0) break;
                        return ((8 + 47 - -113 + 68 ^ 112 + 5 - -40 + 5) & (0x91 ^ 0xB5 ^ (0x30 ^ 0x5A) ^ -1)) != 0;
                    }
                }
                ++var11;

                return ((0x76 ^ 0x6C ^ (0x5E ^ 0x50)) & (0x18 ^ 5 ^ (0x9D ^ 0x94) ^ -1)) != 0;
            }
            if (l.lIIIlIllIIIIIII(var8)) {
                Log.debug((String)("We ran out of " + String.valueOf((Object)var5.ae.useEnergyRestoration()) + ", stopping"));
                var5.af.forceStop();
                return lllIIlllIlII[1];
            }
        }
        this.af.a(lllIIlllIlII[2]);
        Bank.close();
        return lllIIlllIlII[2];
    }

    private static boolean lIIIlIlIllllIlI(int n2) {
        return n2 != 0;
    }

    static {
        l.lIIIlIlIllllIIl();
        l.lIIIlIlIllllIII();
        ac = LoggerFactory.getLogger(BankingTask.class);
        ad = new WorldPoint(lllIIlllIlII[9], lllIIlllIlII[10], lllIIlllIlII[2]);
    }
}

