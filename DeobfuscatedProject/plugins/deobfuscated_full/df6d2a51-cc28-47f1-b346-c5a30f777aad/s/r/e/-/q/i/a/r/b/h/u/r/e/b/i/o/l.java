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
package s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o;

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
import s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.d;
import s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.e;
import squire.gg.hunter.SquireHerbiboarConfig;
import squire.gg.hunter.SquireHerbiboarPlugin;

/* TASK: Banking -> BankingTask */
@TaskDesc(name="Banking", priority=2)
public class l
extends Task {
    private static final /* synthetic */ WorldPoint ad;
    private static final /* synthetic */ Logger ac;
    private static /* synthetic */ int[] lllIIlllIlII;
    /* synthetic */ Predicate<Item> ah;
    private final /* synthetic */ SquireHerbiboarConfig ae;
    /* synthetic */ Predicate<Item> ai;
    private final /* synthetic */ SquireHerbiboarPlugin af;
    private static /* synthetic */ String[] lllIIlllIIll;
    private final /* synthetic */ d ag;

    private static String lIIIlIlIlllIlIl(String var24, String var4) {
        try {
            SecretKeySpec var11 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var8 = Cipher.getInstance("Blowfish");
            var8.init(lllIIlllIlII[4], var11);
            return new String(var8.doFinal(Base64.getDecoder().decode(var24.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlIlIllllllI(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    public static boolean a(Predicate<Item> predicate) {
        boolean bl;
        void var2;
        int n2 = lllIIlllIlII[0];
        Iterator var22 = Inventory.getAll(predicate).iterator();
        while (l.lIIIlIlIllllIlI(var22.hasNext() ? 1 : 0)) {
            Item var28 = (Item)var22.next();
            int[] nArray = new int[lllIIlllIlII[1]];
            nArray[l.lllIIlllIlII[2]] = var28.getId();
            Bank.depositAll((int[])nArray);
            if (l.lIIIlIlIllllIll((int)(--var2))) {
                return lllIIlllIlII[1];
            }
            0;
            if (3 != 0) continue;
            return false;
        }
        if (l.lIIIlIlIlllllII((int)var2, lllIIlllIlII[0])) {
            bl = lllIIlllIlII[1];
            0;
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

    private static void lIIIlIlIllllIIl() {
        lllIIlllIlII = new int[11];
        l.lllIIlllIlII[0] = 65 + 89 - 127 + 103 ^ 122 + 134 - 216 + 98;
        l.lllIIlllIlII[1] = 1;
        l.lllIIlllIlII[2] = (0xBA ^ 0xA5) & ~(0x88 ^ 0x97);
        l.lllIIlllIlII[3] = 0xB8 ^ 0x9F ^ (5 ^ 0x27);
        l.lllIIlllIlII[4] = 2;
        l.lllIIlllIlII[5] = 3;
        l.lllIIlllIlII[6] = 0x2C ^ 0x58 ^ (0xE ^ 0x7E);
        l.lllIIlllIlII[7] = 50 + 20 - -105 + 17 ^ 159 + 1 - -16 + 22;
        l.lllIIlllIlII[8] = 0x13 ^ 3 ^ (0x80 ^ 0x97);
        l.lllIIlllIlII[9] = 0xFFFFCEFD & 0x3F9E;
        l.lllIIlllIlII[10] = 0xFFFFCFFE & 0x3EDD;
    }

    private static boolean lIIIlIlIlllllII(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIIIlIlIlllIlll(String var17, String var26) {
        var17 = new String(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var20 = new StringBuilder();
        char[] var7 = var26.toCharArray();
        int var1 = lllIIlllIlII[2];
        char[] var30 = var17.toCharArray();
        int var5 = var30.length;
        int var31 = lllIIlllIlII[2];
        while (l.lIIIlIlIlllllII(var31, var5)) {
            char var13 = var30[var31];
            var20.append((char)(var13 ^ var7[var1 % var7.length]));
            0;
            ++var1;
            ++var31;
            0;
            if ((0x4D ^ 0x23 ^ (0xFB ^ 0x91)) > 1) continue;
            return null;
        }
        return String.valueOf(var20);
    }

    private static boolean lIIIlIllIIIIIII(int n2) {
        return n2 > 0;
    }

    private static boolean lIIIlIlIlllllll(Object object, Object object2) {
        return object != object2;
    }

    private static String lIIIlIlIlllIllI(String var27, String var19) {
        try {
            SecretKeySpec var25 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var19.getBytes(StandardCharsets.UTF_8)), lllIIlllIlII[0]), "DES");
            Cipher var6 = Cipher.getInstance("DES");
            var6.init(lllIIlllIlII[4], var25);
            return new String(var6.doFinal(Base64.getDecoder().decode(var27.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlIlIllllIll(int n2) {
        return n2 <= 0;
    }

    @Inject
    public l(SquireHerbiboarConfig squireHerbiboarConfig, SquireHerbiboarPlugin squireHerbiboarPlugin, d d2) {
        this.ah = item -> {
            int n2;
            if (!l.lIIIlIlIlllllIl(item.getName().toLowerCase().contains(lllIIlllIIll[lllIIlllIlII[3]]) ? 1 : 0) || !l.lIIIlIlIlllllIl(item.getName().toLowerCase().contains(lllIIlllIIll[lllIIlllIlII[7]]) ? 1 : 0) || l.lIIIlIlIllllIlI(item.getName().toLowerCase().contains(lllIIlllIIll[lllIIlllIlII[8]]) ? 1 : 0)) {
                n2 = lllIIlllIlII[1];
                0;
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
        l.lllIIlllIIll[l.lllIIlllIlII[2]] = l."Empty";
        l.lllIIlllIIll[l.lllIIlllIlII[1]] = l."sack";
        l.lllIIlllIIll[l.lllIIlllIlII[4]] = l."sack";
        l.lllIIlllIIll[l.lllIIlllIlII[5]] = l."grimy";
        l.lllIIlllIIll[l.lllIIlllIlII[6]] = l."herb sack";
        l.lllIIlllIIll[l.lllIIlllIlII[3]] = l."grimy";
        l.lllIIlllIIll[l.lllIIlllIlII[7]] = l."fossil";
        l.lllIIlllIIll[l.lllIIlllIlII[8]] = l."numulite";
    }

    public boolean run() {
        l var9;
        if (l.lIIIlIlIlllllIl(this.af.f() ? 1 : 0)) {
            return lllIIlllIlII[2];
        }
        if (l.lIIIlIlIlllllIl(Movement.shouldWalk() ? 1 : 0)) {
            return lllIIlllIlII[2];
        }
        Player var3 = Players.getLocal();
        if (l.lIIIlIlIlllllIl(Bank.isOpen() ? 1 : 0)) {
            if (l.lIIIlIlIllllllI(var3.distanceTo(ad), lllIIlllIlII[3])) {
                Movement.walkTo((WorldPoint)ad);
                0;
                return lllIIlllIlII[1];
            }
            return Bank.open();
        }
        if (l.lIIIlIlIllllIlI(var9.ae.useHerbSack() ? 1 : 0) && l.lIIIlIlIllllIlI(Inventory.contains(item -> item.getName().toLowerCase().contains(lllIIlllIIll[lllIIlllIlII[5]])) ? 1 : 0)) {
            var9.af.b(lllIIlllIlII[2]);
        }
        if (l.lIIIlIlIllllIlI(Inventory.contains(var9.ah) ? 1 : 0)) {
            l.a(var9.ah);
            0;
            return lllIIlllIlII[1];
        }
        if (l.lIIIlIlIllllIlI(var9.ae.useHerbSack() ? 1 : 0) && l.lIIIlIlIlllllIl(Inventory.contains(var9.ai) ? 1 : 0)) {
            Bank.withdraw(var9.ai, (int)lllIIlllIlII[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
        }
        if (l.lIIIlIlIllllIlI(var9.ae.useHerbSack() ? 1 : 0) && l.lIIIlIlIlllllIl(var9.af.g() ? 1 : 0) && l.lIIIlIlIllllIlI(Inventory.contains(item -> item.getName().toLowerCase().contains(lllIIlllIIll[lllIIlllIlII[4]])) ? 1 : 0)) {
            Bank.Inventory.getFirst(item -> item.getName().toLowerCase().contains(lllIIlllIIll[lllIIlllIlII[1]])).interact(lllIIlllIIll[lllIIlllIlII[2]]);
            return lllIIlllIlII[1];
        }
        e var21 = var9.ae.useEnergyRestoration();
        if (l.lIIIlIlIlllllll((Object)var21, (Object)e.NONE)) {
            int var12 = var9.ae.quantity();
            int[] var29 = var21.j();
            int var10 = var29.length;
            int var18 = lllIIlllIlII[2];
            while (l.lIIIlIlIlllllII(var18, var10)) {
                int var14 = var29[var18];
                int[] nArray = new int[lllIIlllIlII[1]];
                nArray[l.lllIIlllIlII[2]] = var14;
                if (l.lIIIlIlIllllIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray2 = new int[lllIIlllIlII[1]];
                    nArray2[l.lllIIlllIlII[2]] = var14;
                    int var23 = Bank.getCount((boolean)lllIIlllIlII[1], (int[])nArray2);
                    Bank.withdraw((int)var14, (int)var9.ae.quantity(), (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                    if (l.lIIIlIlIllllIll(var12 -= var23)) {
                        0;
                        if (-(95 + 122 - 60 + 26 ^ 2 + 132 - -41 + 4) < 0) break;
                        return ((8 + 47 - -113 + 68 ^ 112 + 5 - -40 + 5) & (0x91 ^ 0xB5 ^ (0x30 ^ 0x5A) ^ -1)) != 0;
                    }
                }
                ++var18;
                0;
                
                return ((0x76 ^ 0x6C ^ (0x5E ^ 0x50)) & (0x18 ^ 5 ^ (0x9D ^ 0x94) ^ -1)) != 0;
            }
            if (l.lIIIlIllIIIIIII(var12)) {
                Log.debug((String)("We ran out of " + String.valueOf((Object)var9.ae.useEnergyRestoration()) + ", stopping"));
                var9.af.forceStop();
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
        ac = LoggerFactory.getLogger(l.class);
        ad = new WorldPoint(lllIIlllIlII[9], lllIIlllIlII[10], lllIIlllIlII[2]);
    }
}

