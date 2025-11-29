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

    private static String lIIIlIlIlllIlIl(String lllllllllllllllIIllIIllIlllllIlI, String lllllllllllllllIIllIIllIllllIlll) {
        try {
            SecretKeySpec lllllllllllllllIIllIIllIllllllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIllIllllIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIIllIllllllII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIIllIllllllII.init(lllIIlllIlII[4], lllllllllllllllIIllIIllIllllllIl);
            return new String(lllllllllllllllIIllIIllIllllllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIllIlllllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIIllIlllllIll) {
            lllllllllllllllIIllIIllIlllllIll.printStackTrace();
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
        void lllllllllllllllIIllIIlllIIlIIlIl;
        int n2 = lllIIlllIlII[0];
        Iterator lllllllllllllllIIllIIlllIIlIIlII = Inventory.getAll(predicate).iterator();
        while (l.lIIIlIlIllllIlI(lllllllllllllllIIllIIlllIIlIIlII.hasNext() ? 1 : 0)) {
            Item lllllllllllllllIIllIIlllIIlIIIll = (Item)lllllllllllllllIIllIIlllIIlIIlII.next();
            int[] nArray = new int[lllIIlllIlII[1]];
            nArray[l.lllIIlllIlII[2]] = lllllllllllllllIIllIIlllIIlIIIll.getId();
            Bank.depositAll((int[])nArray);
            if (l.lIIIlIlIllllIll((int)(--lllllllllllllllIIllIIlllIIlIIlIl))) {
                return lllIIlllIlII[1];
            }
            0;
            if (3 != 0) continue;
            return ((0x67 ^ 0x7F) & ~(6 ^ 0x1E)) != 0;
        }
        if (l.lIIIlIlIlllllII((int)lllllllllllllllIIllIIlllIIlIIlIl, lllIIlllIlII[0])) {
            bl = lllIIlllIlII[1];
            0;
            if (((0xB3 ^ 0xA7) & ~(0x2A ^ 0x3E)) >= (0x54 ^ 0x50)) {
                return ((0xF ^ 0x57) & ~(0x6E ^ 0x36)) != 0;
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

    private static String lIIIlIlIlllIlll(String lllllllllllllllIIllIIllIlllIIlIl, String lllllllllllllllIIllIIllIlllIlIIl) {
        lllllllllllllllIIllIIllIlllIIlIl = new String(Base64.getDecoder().decode(lllllllllllllllIIllIIllIlllIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIIllIlllIlIII = new StringBuilder();
        char[] lllllllllllllllIIllIIllIlllIIlll = lllllllllllllllIIllIIllIlllIlIIl.toCharArray();
        int lllllllllllllllIIllIIllIlllIIllI = lllIIlllIlII[2];
        char[] lllllllllllllllIIllIIllIlllIIIII = lllllllllllllllIIllIIllIlllIIlIl.toCharArray();
        int lllllllllllllllIIllIIllIllIlllll = lllllllllllllllIIllIIllIlllIIIII.length;
        int lllllllllllllllIIllIIllIllIllllI = lllIIlllIlII[2];
        while (l.lIIIlIlIlllllII(lllllllllllllllIIllIIllIllIllllI, lllllllllllllllIIllIIllIllIlllll)) {
            char lllllllllllllllIIllIIllIlllIlIll = lllllllllllllllIIllIIllIlllIIIII[lllllllllllllllIIllIIllIllIllllI];
            lllllllllllllllIIllIIllIlllIlIII.append((char)(lllllllllllllllIIllIIllIlllIlIll ^ lllllllllllllllIIllIIllIlllIIlll[lllllllllllllllIIllIIllIlllIIllI % lllllllllllllllIIllIIllIlllIIlll.length]));
            0;
            ++lllllllllllllllIIllIIllIlllIIllI;
            ++lllllllllllllllIIllIIllIllIllllI;
            0;
            if ((0x4D ^ 0x23 ^ (0xFB ^ 0x91)) > 1) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIllIIllIlllIlIII);
    }

    private static boolean lIIIlIllIIIIIII(int n2) {
        return n2 > 0;
    }

    private static boolean lIIIlIlIlllllll(Object object, Object object2) {
        return object != object2;
    }

    private static String lIIIlIlIlllIllI(String lllllllllllllllIIllIIlllIIIIIlIl, String lllllllllllllllIIllIIlllIIIIIlII) {
        try {
            SecretKeySpec lllllllllllllllIIllIIlllIIIIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIlllIIIIIlII.getBytes(StandardCharsets.UTF_8)), lllIIlllIlII[0]), "DES");
            Cipher lllllllllllllllIIllIIlllIIIIlIIl = Cipher.getInstance("DES");
            lllllllllllllllIIllIIlllIIIIlIIl.init(lllIIlllIlII[4], lllllllllllllllIIllIIlllIIIIlIlI);
            return new String(lllllllllllllllIIllIIlllIIIIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIlllIIIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIIlllIIIIlIII) {
            lllllllllllllllIIllIIlllIIIIlIII.printStackTrace();
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
                    return ((0xCE ^ 0x87) & ~(0x12 ^ 0x5B)) != 0;
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
        l lllllllllllllllIIllIIlllIIIllIIl;
        if (l.lIIIlIlIlllllIl(this.af.f() ? 1 : 0)) {
            return lllIIlllIlII[2];
        }
        if (l.lIIIlIlIlllllIl(Movement.shouldWalk() ? 1 : 0)) {
            return lllIIlllIlII[2];
        }
        Player lllllllllllllllIIllIIlllIIIllIII = Players.getLocal();
        if (l.lIIIlIlIlllllIl(Bank.isOpen() ? 1 : 0)) {
            if (l.lIIIlIlIllllllI(lllllllllllllllIIllIIlllIIIllIII.distanceTo(ad), lllIIlllIlII[3])) {
                Movement.walkTo((WorldPoint)ad);
                0;
                return lllIIlllIlII[1];
            }
            return Bank.open();
        }
        if (l.lIIIlIlIllllIlI(lllllllllllllllIIllIIlllIIIllIIl.ae.useHerbSack() ? 1 : 0) && l.lIIIlIlIllllIlI(Inventory.contains(item -> item.getName().toLowerCase().contains(lllIIlllIIll[lllIIlllIlII[5]])) ? 1 : 0)) {
            lllllllllllllllIIllIIlllIIIllIIl.af.b(lllIIlllIlII[2]);
        }
        if (l.lIIIlIlIllllIlI(Inventory.contains(lllllllllllllllIIllIIlllIIIllIIl.ah) ? 1 : 0)) {
            l.a(lllllllllllllllIIllIIlllIIIllIIl.ah);
            0;
            return lllIIlllIlII[1];
        }
        if (l.lIIIlIlIllllIlI(lllllllllllllllIIllIIlllIIIllIIl.ae.useHerbSack() ? 1 : 0) && l.lIIIlIlIlllllIl(Inventory.contains(lllllllllllllllIIllIIlllIIIllIIl.ai) ? 1 : 0)) {
            Bank.withdraw(lllllllllllllllIIllIIlllIIIllIIl.ai, (int)lllIIlllIlII[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
        }
        if (l.lIIIlIlIllllIlI(lllllllllllllllIIllIIlllIIIllIIl.ae.useHerbSack() ? 1 : 0) && l.lIIIlIlIlllllIl(lllllllllllllllIIllIIlllIIIllIIl.af.g() ? 1 : 0) && l.lIIIlIlIllllIlI(Inventory.contains(item -> item.getName().toLowerCase().contains(lllIIlllIIll[lllIIlllIlII[4]])) ? 1 : 0)) {
            Bank.Inventory.getFirst(item -> item.getName().toLowerCase().contains(lllIIlllIIll[lllIIlllIlII[1]])).interact(lllIIlllIIll[lllIIlllIlII[2]]);
            return lllIIlllIlII[1];
        }
        e lllllllllllllllIIllIIlllIIIlIlll = lllllllllllllllIIllIIlllIIIllIIl.ae.useEnergyRestoration();
        if (l.lIIIlIlIlllllll((Object)lllllllllllllllIIllIIlllIIIlIlll, (Object)e.NONE)) {
            int lllllllllllllllIIllIIlllIIIlIllI = lllllllllllllllIIllIIlllIIIllIIl.ae.quantity();
            int[] lllllllllllllllIIllIIlllIIIlIlIl = lllllllllllllllIIllIIlllIIIlIlll.j();
            int lllllllllllllllIIllIIlllIIIlIlII = lllllllllllllllIIllIIlllIIIlIlIl.length;
            int lllllllllllllllIIllIIlllIIIlIIll = lllIIlllIlII[2];
            while (l.lIIIlIlIlllllII(lllllllllllllllIIllIIlllIIIlIIll, lllllllllllllllIIllIIlllIIIlIlII)) {
                int lllllllllllllllIIllIIlllIIIlIIlI = lllllllllllllllIIllIIlllIIIlIlIl[lllllllllllllllIIllIIlllIIIlIIll];
                int[] nArray = new int[lllIIlllIlII[1]];
                nArray[l.lllIIlllIlII[2]] = lllllllllllllllIIllIIlllIIIlIIlI;
                if (l.lIIIlIlIllllIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray2 = new int[lllIIlllIlII[1]];
                    nArray2[l.lllIIlllIlII[2]] = lllllllllllllllIIllIIlllIIIlIIlI;
                    int lllllllllllllllIIllIIlllIIIlIIIl = Bank.getCount((boolean)lllIIlllIlII[1], (int[])nArray2);
                    Bank.withdraw((int)lllllllllllllllIIllIIlllIIIlIIlI, (int)lllllllllllllllIIllIIlllIIIllIIl.ae.quantity(), (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                    if (l.lIIIlIlIllllIll(lllllllllllllllIIllIIlllIIIlIllI -= lllllllllllllllIIllIIlllIIIlIIIl)) {
                        0;
                        if (-(95 + 122 - 60 + 26 ^ 2 + 132 - -41 + 4) < 0) break;
                        return ((8 + 47 - -113 + 68 ^ 112 + 5 - -40 + 5) & (0x91 ^ 0xB5 ^ (0x30 ^ 0x5A) ^ -1)) != 0;
                    }
                }
                ++lllllllllllllllIIllIIlllIIIlIIll;
                0;
                if (null == null) continue;
                return ((0x76 ^ 0x6C ^ (0x5E ^ 0x50)) & (0x18 ^ 5 ^ (0x9D ^ 0x94) ^ -1)) != 0;
            }
            if (l.lIIIlIllIIIIIII(lllllllllllllllIIllIIlllIIIlIllI)) {
                Log.debug((String)("We ran out of " + String.valueOf((Object)lllllllllllllllIIllIIlllIIIllIIl.ae.useEnergyRestoration()) + ", stopping"));
                lllllllllllllllIIllIIlllIIIllIIl.af.forceStop();
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

