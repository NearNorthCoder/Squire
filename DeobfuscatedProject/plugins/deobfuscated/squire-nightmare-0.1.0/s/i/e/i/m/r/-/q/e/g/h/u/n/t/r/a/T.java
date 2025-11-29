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
package s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a;

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
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.S;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.h;

@TaskDesc(name="Selling drops (Restocking)", priority=14674, blocking=true)
public class T
extends S {
    private static /* synthetic */ int[] llllIlIlIlII;
    private static /* synthetic */ String[] llllIlIlIIIl;

    private static boolean lIIlIIIIlllllII(int n2) {
        return n2 != 0;
    }

    @Inject
    protected T(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, h h2) {
        super(squireNightmareConfig, squireNightmarePlugin, h2);
    }

    @Override
    public boolean ci() {
        T lllllllllllllllIIlIllIIllIlllIlI;
        if (T.lIIlIIIIllllIll(this.cW.D() ? 1 : 0)) {
            return llllIlIlIlII[0];
        }
        if (T.lIIlIIIIlllllII(lllllllllllllllIIlIllIIllIlllIlI.cW.C() ? 1 : 0)) {
            return llllIlIlIlII[0];
        }
        Player lllllllllllllllIIlIllIIllIlllIIl = Players.getLocal();
        if (T.lIIlIIIIllllIll(ds.contains(lllllllllllllllIIlIllIIllIlllIIl.getWorldLocation()) ? 1 : 0)) {
            return llllIlIlIlII[0];
        }
        if (T.lIIlIIIIlllllII(Bank.isOpen() ? 1 : 0) && T.lIIlIIIIllllIll(lllllllllllllllIIlIllIIllIlllIlI.cl() ? 1 : 0) && T.lIIlIIIIlllllII(lllllllllllllllIIlIllIIllIlllIlI.cm() ? 1 : 0)) {
            Log.info((String)llllIlIlIIIl[llllIlIlIlII[0]]);
            Object[] objectArray = new Object[llllIlIlIlII[2]];
            objectArray[T.llllIlIlIlII[0]] = lllllllllllllllIIlIllIIllIlllIlI.cl();
            objectArray[T.llllIlIlIlII[1]] = lllllllllllllllIIlIllIIllIlllIlI.cm();
            Log.info((String)llllIlIlIIIl[llllIlIlIlII[1]], (Object[])objectArray);
            lllllllllllllllIIlIllIIllIlllIlI.cW.f(llllIlIlIlII[0]);
            lllllllllllllllIIlIllIIllIlllIlI.cW.e(llllIlIlIlII[1]);
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
        Item lllllllllllllllIIlIllIIllIlllIII = Inventory.getFirst(item -> {
            int n2;
            int n3 = item.getId();
            if (T.lIIlIIIIlllllII(item.isNoted() ? 1 : 0)) {
                n2 = llllIlIlIlII[1];
                0;
                if ((1 ^ 5) > (0x85 ^ 0x81)) {
                    return ((0x58 ^ 4) & ~(0x54 ^ 8)) != 0;
                }
            } else {
                n2 = llllIlIlIlII[0];
            }
            return dt.contains(n3 - n2);
        });
        if (T.lIIlIIIIlllllIl(lllllllllllllllIIlIllIIllIlllIII)) {
            Log.info((String)llllIlIlIIIl[llllIlIlIlII[3]]);
            if (T.lIIlIIIIlllllII(lllllllllllllllIIlIllIIllIlllIlI.cm() ? 1 : 0) && T.lIIlIIIIlllllII(GrandExchange.isEmpty() ? 1 : 0)) {
                Log.info((String)llllIlIlIIIl[llllIlIlIlII[4]]);
                lllllllllllllllIIlIllIIllIlllIlI.cW.f(llllIlIlIlII[0]);
                lllllllllllllllIIlIllIIllIlllIlI.cW.e(llllIlIlIlII[1]);
                return llllIlIlIlII[1];
            }
            Log.info((String)llllIlIlIIIl[llllIlIlIlII[5]]);
            return llllIlIlIlII[0];
        }
        if (T.lIIlIIIIllllIll(GrandExchange.isSelling() ? 1 : 0)) {
            Log.info((String)("[SellDrops]: Selling " + lllllllllllllllIIlIllIIllIlllIII.getName() + " for " + Prices.getItemPrice((int)lllllllllllllllIIlIllIIllIlllIII.getId()) + " GP"));
            int[] nArray = new int[llllIlIlIlII[1]];
            nArray[T.llllIlIlIlII[0]] = lllllllllllllllIIlIllIIllIlllIII.getId();
            GrandExchange.sell((int[])nArray);
            0;
            if (null != null) {
                return ((0x6D ^ 0x48) & ~(3 ^ 0x26)) != 0;
            }
        } else {
            int lllllllllllllllIIlIllIIllIllIlll = (int)((double)Prices.getItemPrice((int)lllllllllllllllIIlIllIIllIlllIII.getId()) * 0.8);
            Log.info((String)("[SellDrops]: Setting price to " + lllllllllllllllIIlIllIIllIllIlll + " GP"));
            GrandExchange.setPrice((int)lllllllllllllllIIlIllIIllIllIlll);
            GrandExchange.confirm();
        }
        return llllIlIlIlII[1];
    }

    private static void lIIlIIIIllllIlI() {
        llllIlIlIlII = new int[8];
        T.llllIlIlIlII[0] = (0x8B ^ 0xA3) & ~(0x84 ^ 0xAC);
        T.llllIlIlIlII[1] = 1;
        T.llllIlIlIlII[2] = 2;
        T.llllIlIlIlII[3] = 3;
        T.llllIlIlIlII[4] = 35 + 79 - 72 + 133 ^ 125 + 143 - 214 + 117;
        T.llllIlIlIlII[5] = 0x1E ^ 0x1B;
        T.llllIlIlIlII[6] = 3 ^ 5;
        T.llllIlIlIlII[7] = 0xC8 ^ 0xC3 ^ 3;
    }

    private static String lIIlIIIIllIlIll(String lllllllllllllllIIlIllIIllIIlIIII, String lllllllllllllllIIlIllIIllIIIlIlI) {
        lllllllllllllllIIlIllIIllIIlIIII = new String(Base64.getDecoder().decode(lllllllllllllllIIlIllIIllIIlIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIllIIllIIIlllI = new StringBuilder();
        char[] lllllllllllllllIIlIllIIllIIIllIl = lllllllllllllllIIlIllIIllIIIlIlI.toCharArray();
        int lllllllllllllllIIlIllIIllIIIllII = llllIlIlIlII[0];
        char[] lllllllllllllllIIlIllIIllIIIIllI = lllllllllllllllIIlIllIIllIIlIIII.toCharArray();
        int lllllllllllllllIIlIllIIllIIIIlIl = lllllllllllllllIIlIllIIllIIIIllI.length;
        int lllllllllllllllIIlIllIIllIIIIlII = llllIlIlIlII[0];
        while (T.lIIlIIIIllllllI(lllllllllllllllIIlIllIIllIIIIlII, lllllllllllllllIIlIllIIllIIIIlIl)) {
            char lllllllllllllllIIlIllIIllIIlIIIl = lllllllllllllllIIlIllIIllIIIIllI[lllllllllllllllIIlIllIIllIIIIlII];
            lllllllllllllllIIlIllIIllIIIlllI.append((char)(lllllllllllllllIIlIllIIllIIlIIIl ^ lllllllllllllllIIlIllIIllIIIllIl[lllllllllllllllIIlIllIIllIIIllII % lllllllllllllllIIlIllIIllIIIllIl.length]));
            0;
            ++lllllllllllllllIIlIllIIllIIIllII;
            ++lllllllllllllllIIlIllIIllIIIIlII;
            0;
            if (null == null) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlIllIIllIIIlllI);
    }

    static {
        T.lIIlIIIIllllIlI();
        T.lIIlIIIIlllIIlI();
    }

    private static void lIIlIIIIlllIIlI() {
        llllIlIlIIIl = new String[llllIlIlIlII[6]];
        T.llllIlIlIIIl[T.llllIlIlIlII[0]] = T."[SellDrops]: No sellable items in bank or inventory, moving on.";
        T.llllIlIlIIIl[T.llllIlIlIlII[1]] = T."Bank contains sellable: {}, noDropsInInventory: {}";
        T.llllIlIlIIIl[T.llllIlIlIlII[2]] = T."[SellDrops]: Collecting items from GE.";
        T.llllIlIlIIIl[T.llllIlIlIlII[3]] = T."[SellDrops]: Cannot find any items to sell.";
        T.llllIlIlIIIl[T.llllIlIlIlII[4]] = T."[SellDrops]: We have sold all items and collected the money, moving on.";
        T.llllIlIlIIIl[T.llllIlIlIlII[5]] = T."[SellDrops]: We have not sold all items yet, waiting for GE to update.";
    }

    private static boolean lIIlIIIIllllllI(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIIlIIIIllIllIl(String lllllllllllllllIIlIllIIllIIllllI, String lllllllllllllllIIlIllIIllIIlllll) {
        try {
            SecretKeySpec lllllllllllllllIIlIllIIllIlIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllIIllIIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIllIIllIlIIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIllIIllIlIIIlI.init(llllIlIlIlII[2], lllllllllllllllIIlIllIIllIlIIIll);
            return new String(lllllllllllllllIIlIllIIllIlIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllIIllIIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIllIIllIlIIIIl) {
            lllllllllllllllIIlIllIIllIlIIIIl.printStackTrace();
            return null;
        }
    }

    private static String lIIlIIIIlllIIIl(String lllllllllllllllIIlIllIIllIlIllIl, String lllllllllllllllIIlIllIIllIlIlIlI) {
        try {
            SecretKeySpec lllllllllllllllIIlIllIIllIllIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllIIllIlIlIlI.getBytes(StandardCharsets.UTF_8)), llllIlIlIlII[7]), "DES");
            Cipher lllllllllllllllIIlIllIIllIlIllll = Cipher.getInstance("DES");
            lllllllllllllllIIlIllIIllIlIllll.init(llllIlIlIlII[2], lllllllllllllllIIlIllIIllIllIIII);
            return new String(lllllllllllllllIIlIllIIllIlIllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllIIllIlIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIllIIllIlIlllI) {
            lllllllllllllllIIlIllIIllIlIlllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIIIlllllIl(Object object) {
        return object == null;
    }

    private static boolean lIIlIIIIllllIll(int n2) {
        return n2 == 0;
    }
}

