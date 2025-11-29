/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.runelite.api.Player
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Prices
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.GrandExchange
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.nightmare.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Prices;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.GrandExchange;
import net.unethicalite.api.items.Inventory;
import gg.squire.nightmare.tasks.NightmareTaskBase;
import gg.squire.nightmare.tasks.NightmareManager;

@TaskDesc(name="Selling drops (Restocking)", priority=14674, blocking=true)
public class SellingDropsRestockingTask
extends NightmareTaskBase {

    private static boolean lIIlIIIIlllllII(int n2) {
        return n2 != 0;
    }

    @Inject
    protected SellingDropsRestockingTask(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, h h2) {
        super(squireNightmareConfig, squireNightmarePlugin, h2);
    }

    @Override
    public boolean ci() {
        T var1;
        if (T.lIIlIIIIllllIll(this.cW.D() ? 1 : 0)) {
            return llllIlIlIlII[0];
        }
        if (T.lIIlIIIIlllllII(var1.cW.C() ? 1 : 0)) {
            return llllIlIlIlII[0];
        }
        Player var2 = Players.getLocal();
        if (T.lIIlIIIIllllIll(ds.contains(var2.getWorldLocation()) ? 1 : 0)) {
            return llllIlIlIlII[0];
        }
        if (T.lIIlIIIIlllllII(Bank.isOpen() ? 1 : 0) && T.lIIlIIIIllllIll(var1.cl() ? 1 : 0) && T.lIIlIIIIlllllII(var1.cm() ? 1 : 0)) {
            Log.info((String)llllIlIlIIIl[llllIlIlIlII[0]]);
            Object[] objectArray = new Object[llllIlIlIlII[2]];
            objectArray[T.llllIlIlIlII[0]] = var1.cl();
            objectArray[T.llllIlIlIlII[1]] = var1.cm();
            Log.info((String)llllIlIlIIIl[llllIlIlIlII[1]], (Object[])objectArray);
            var1.cW.f(llllIlIlIlII[0]);
            var1.cW.e(llllIlIlIlII[1]);
            return llllIlIlIlII[1];
        }
        if (T.lIIlIIIIllllIll(GrandExchange.isOpen() ? 1 : 0)) {
            GrandExchange.open();
            return llllIlIlIlII[1];
        }
        if (T.lIIlIIIIlllllII(GrandExchange.canCollect() ? 1 : 0)) {
            Log.info((String)llllIlIlIIIl[llllIlIlIlII[2]]);
            GrandExchange.collect();
            return llllIlIlIlII[1];
        }
        Item var3 = Inventory.getFirst(item -> {
            int n2;
            int n3 = item.getId();
            if (T.lIIlIIIIlllllII(item.isNoted() ? 1 : 0)) {
                n2 = llllIlIlIlII[1];

                if ((1 ^ 5) > (0x85 ^ 0x81)) {
                    return false;
                }
            } else {
                n2 = llllIlIlIlII[0];
            }
            return dt.contains(n3 - n2);
        });
        if (T.lIIlIIIIlllllIl(var3)) {
            Log.info((String)llllIlIlIIIl[llllIlIlIlII[3]]);
            if (T.lIIlIIIIlllllII(var1.cm() ? 1 : 0) && T.lIIlIIIIlllllII(GrandExchange.isEmpty() ? 1 : 0)) {
                Log.info((String)llllIlIlIIIl[llllIlIlIlII[4]]);
                var1.cW.f(llllIlIlIlII[0]);
                var1.cW.e(llllIlIlIlII[1]);
                return llllIlIlIlII[1];
            }
            Log.info((String)llllIlIlIIIl[llllIlIlIlII[5]]);
            return llllIlIlIlII[0];
        }
        if (T.lIIlIIIIllllIll(GrandExchange.isSelling() ? 1 : 0)) {
            Log.info((String)("[SellDrops]: Selling " + var3.getName() + " for " + Prices.getItemPrice((int)var3.getId()) + " GP"));
            int[] nArray = new int[llllIlIlIlII[1]];
            nArray[T.llllIlIlIlII[0]] = var3.getId();
            GrandExchange.sell((int[])nArray);

            }
        } else {
            int var4 = (int)((double)Prices.getItemPrice((int)var3.getId()) * 0.8);
            Log.info((String)("[SellDrops]: Setting price to " + var4 + " GP"));
            GrandExchange.setPrice((int)var4);
            GrandExchange.confirm();
        }
        return llllIlIlIlII[1];
    }

        return String.valueOf(var5);
    }

    static {
        T.lIIlIIIIllllIlI();
        T.lIIlIIIIlllIIlI();
    }

    private static void lIIlIIIIlllIIlI() {
        llllIlIlIIIl = new String[llllIlIlIlII[6]];
        T.llllIlIlIIIl[T.llllIlIlIlII[0]] = "[SellDrops]: No sellable items in bank or inventory, moving on.";
        T.llllIlIlIIIl[T.llllIlIlIlII[1]] = "Bank contains sellable: {}, noDropsInInventory: {}";
        T.llllIlIlIIIl[T.llllIlIlIlII[2]] = "[SellDrops]: Collecting items from GE.";
        T.llllIlIlIIIl[T.llllIlIlIlII[3]] = "[SellDrops]: Cannot find any items to sell.";
        T.llllIlIlIIIl[T.llllIlIlIlII[4]] = "[SellDrops]: We have sold all items and collected the money, moving on.";
        T.llllIlIlIIIl[T.llllIlIlIlII[5]] = "[SellDrops]: We have not sold all items yet, waiting for GE to update.";
    }

    private static boolean lIIlIIIIllllllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlIIIIlllllIl(Object object) {
        return object == null;
    }

    private static boolean lIIlIIIIllllIll(int n2) {
        return n2 == 0;
    }
}

