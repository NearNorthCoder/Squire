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
package s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a;

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
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.Y;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.h;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.j;

@TaskDesc(name="Retrieving teleport for death walking.", priority=0x7FFFFFFF, blocking=true)
public class X
extends Y {
    private static /* synthetic */ int[] llllIlIIlIlI;
    private static /* synthetic */ String[] llllIlIIlIIl;

    private static boolean lIIlIIIIlIIIIll(int n2) {
        return n2 != 0;
    }

    @Inject
    protected X(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, h h2) {
        super(squireNightmareConfig, squireNightmarePlugin, h2);
    }

    @Override
    public boolean bY() {
        BankLocation lllllllllllllllIIlIllIllIlIIIllI;
        X lllllllllllllllIIlIllIllIlIIlIII;
        if (X.lIIlIIIIlIIIIlI(this.cV.enableBanking() ? 1 : 0)) {
            return llllIlIIlIlI[0];
        }
        if (X.lIIlIIIIlIIIIlI(lllllllllllllllIIlIllIllIlIIlIII.cW.ad() ? 1 : 0)) {
            return llllIlIIlIlI[0];
        }
        int[] nArray = new int[llllIlIIlIlI[1]];
        nArray[X.llllIlIIlIlI[0]] = llllIlIIlIlI[2];
        nArray[X.llllIlIIlIlI[3]] = llllIlIIlIlI[4];
        if (X.lIIlIIIIlIIIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return llllIlIIlIlI[0];
        }
        TileObject lllllllllllllllIIlIllIllIlIIIlll = TileObjects.getNearest(tileObject -> tileObject.getName().contains(llllIlIIlIIl[llllIlIIlIlI[6]]));
        if (X.lIIlIIIIlIIIlII(lllllllllllllllIIlIllIllIlIIIlll)) {
            return llllIlIIlIlI[0];
        }
        if (X.lIIlIIIIlIIIIll(Bank.isOpen() ? 1 : 0)) {
            lllllllllllllllIIlIllIllIlIIIllI = item -> {
                int n2;
                if (X.lIIlIIIIlIIIIll(item.getName().toLowerCase().contains(llllIlIIlIIl[llllIlIIlIlI[1]]) ? 1 : 0) && X.lIIlIIIIlIIIIlI(item.isPlaceholder() ? 1 : 0)) {
                    n2 = llllIlIIlIlI[3];
                    "".length();
                    if ((0x47 ^ 0x40 ^ "   ".length()) == " ".length()) {
                        return ((0x59 ^ 0x35 ^ (0x4C ^ 0x11)) & (21 + 166 - 70 + 57 ^ 150 + 12 - 133 + 130 ^ -" ".length())) != 0;
                    }
                } else {
                    n2 = llllIlIIlIlI[0];
                }
                return n2 != 0;
            };
            if (X.lIIlIIIIlIIIIll(lllllllllllllllIIlIllIllIlIIlIII.cb() ? 1 : 0) && X.lIIlIIIIlIIIIll(Bank.contains((Predicate)lllllllllllllllIIlIllIllIlIIIllI) ? 1 : 0)) {
                return lllllllllllllllIIlIllIllIlIIlIII.a((Predicate<Item>)lllllllllllllllIIlIllIllIlIIIllI);
            }
            if (X.lIIlIIIIlIIIIll(j.aU() ? 1 : 0)) {
                int[] nArray2 = new int[llllIlIIlIlI[3]];
                nArray2[X.llllIlIIlIlI[0]] = llllIlIIlIlI[4];
                Item lllllllllllllllIIlIllIllIlIIIlIl = Bank.getFirst((int[])nArray2);
                if (X.lIIlIIIIlIIIlIl(lllllllllllllllIIlIllIllIlIIIlIl)) {
                    int[] nArray3 = new int[llllIlIIlIlI[3]];
                    nArray3[X.llllIlIIlIlI[0]] = llllIlIIlIlI[2];
                    lllllllllllllllIIlIllIllIlIIIlIl = Bank.getFirst((int[])nArray3);
                }
                if (X.lIIlIIIIlIIIlII(lllllllllllllllIIlIllIllIlIIIlIl)) {
                    Bank.withdraw((int)lllllllllllllllIIlIllIllIlIIIlIl.getId(), (int)llllIlIIlIlI[3], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                    lllllllllllllllIIlIllIllIlIIlIII.sleep(llllIlIIlIlI[1]);
                    return llllIlIIlIlI[3];
                }
                "".length();
                if (((0 ^ 0x33) & ~(0x9D ^ 0xAE)) != 0) {
                    return ((0xB0 ^ 0x89) & ~(0x92 ^ 0xAB)) != 0;
                }
            } else {
                int[] nArray4 = new int[llllIlIIlIlI[3]];
                nArray4[X.llllIlIIlIlI[0]] = llllIlIIlIlI[2];
                Item lllllllllllllllIIlIllIllIlIIIlIl = Bank.getFirst((int[])nArray4);
                if (X.lIIlIIIIlIIIlIl(lllllllllllllllIIlIllIllIlIIIlIl)) {
                    int[] nArray5 = new int[llllIlIIlIlI[3]];
                    nArray5[X.llllIlIIlIlI[0]] = llllIlIIlIlI[4];
                    lllllllllllllllIIlIllIllIlIIIlIl = Bank.getFirst((int[])nArray5);
                }
                if (X.lIIlIIIIlIIIlII(lllllllllllllllIIlIllIllIlIIIlIl)) {
                    Bank.withdraw((int)lllllllllllllllIIlIllIllIlIIIlIl.getId(), (int)llllIlIIlIlI[3], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                    lllllllllllllllIIlIllIllIlIIlIII.sleep(llllIlIIlIlI[1]);
                    return llllIlIIlIlI[3];
                }
            }
        }
        if (X.lIIlIIIIlIIIIlI(Movement.shouldWalk() ? 1 : 0)) {
            return llllIlIIlIlI[0];
        }
        lllllllllllllllIIlIllIllIlIIIllI = BankLocation.getNearest();
        if (X.lIIlIIIIlIIIllI(lllllllllllllllIIlIllIllIlIIIllI.getArea().distanceTo(Players.getLocal().getWorldLocation()), llllIlIIlIlI[5])) {
            Movement.walkTo((WorldArea)lllllllllllllllIIlIllIllIlIIIllI.getArea());
            "".length();
            return llllIlIIlIlI[3];
        }
        return Bank.open();
    }

    private static void lIIlIIIIIllllll() {
        llllIlIIlIIl = new String[llllIlIIlIlI[5]];
        X.llllIlIIlIIl[X.llllIlIIlIlI[0]] = X.lIIlIIIIIllllIl("PAArGzE=", "xrBuZ");
        X.llllIlIIlIIl[X.llllIlIIlIlI[3]] = X.lIIlIIIIIllllIl("Fygu", "RIZNV");
        X.llllIlIIlIIl[X.llllIlIIlIlI[1]] = X.lIIlIIIIIllllIl("BhAmPx0bBWciGwENKDw=", "udGRt");
        X.llllIlIIlIIl[X.llllIlIIlIlI[6]] = X.lIIlIIIIIlllllI("IAiOfjYOmQfGXjNKBfJ0jib7xcqxjcSd", "aYGvA");
    }

    private static boolean lIIlIIIIlIIIIlI(int n2) {
        return n2 == 0;
    }

    private static String lIIlIIIIIllllIl(String lllllllllllllllIIlIllIllIIllIllI, String lllllllllllllllIIlIllIllIIllIlIl) {
        lllllllllllllllIIlIllIllIIllIllI = new String(Base64.getDecoder().decode(lllllllllllllllIIlIllIllIIllIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIllIllIIllIlII = new StringBuilder();
        char[] lllllllllllllllIIlIllIllIIllIIll = lllllllllllllllIIlIllIllIIllIlIl.toCharArray();
        int lllllllllllllllIIlIllIllIIllIIlI = llllIlIIlIlI[0];
        char[] lllllllllllllllIIlIllIllIIlIllII = lllllllllllllllIIlIllIllIIllIllI.toCharArray();
        int lllllllllllllllIIlIllIllIIlIlIll = lllllllllllllllIIlIllIllIIlIllII.length;
        int lllllllllllllllIIlIllIllIIlIlIlI = llllIlIIlIlI[0];
        while (X.lIIlIIIIlIIIlll(lllllllllllllllIIlIllIllIIlIlIlI, lllllllllllllllIIlIllIllIIlIlIll)) {
            char lllllllllllllllIIlIllIllIIllIlll = lllllllllllllllIIlIllIllIIlIllII[lllllllllllllllIIlIllIllIIlIlIlI];
            lllllllllllllllIIlIllIllIIllIlII.append((char)(lllllllllllllllIIlIllIllIIllIlll ^ lllllllllllllllIIlIllIllIIllIIll[lllllllllllllllIIlIllIllIIllIIlI % lllllllllllllllIIlIllIllIIllIIll.length]));
            "".length();
            ++lllllllllllllllIIlIllIllIIllIIlI;
            ++lllllllllllllllIIlIllIllIIlIlIlI;
            "".length();
            if (((0x53 ^ 0x43) & ~(0x76 ^ 0x66)) >= ((0x99 ^ 0xBF) & ~(0x4A ^ 0x6C))) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlIllIllIIllIlII);
    }

    private static boolean lIIlIIIIlIIIlIl(Object object) {
        return object == null;
    }

    static {
        X.lIIlIIIIlIIIIIl();
        X.lIIlIIIIIllllll();
    }

    private static String lIIlIIIIIlllllI(String lllllllllllllllIIlIllIllIIlIIIIl, String lllllllllllllllIIlIllIllIIIllllI) {
        try {
            SecretKeySpec lllllllllllllllIIlIllIllIIlIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllIllIIIllllI.getBytes(StandardCharsets.UTF_8)), llllIlIIlIlI[7]), "DES");
            Cipher lllllllllllllllIIlIllIllIIlIIIll = Cipher.getInstance("DES");
            lllllllllllllllIIlIllIllIIlIIIll.init(llllIlIIlIlI[1], lllllllllllllllIIlIllIllIIlIIlII);
            return new String(lllllllllllllllIIlIllIllIIlIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllIllIIlIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIllIllIIlIIIlI) {
            lllllllllllllllIIlIllIllIIlIIIlI.printStackTrace();
            return null;
        }
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

    private static void lIIlIIIIlIIIIIl() {
        llllIlIIlIlI = new int[8];
        X.llllIlIIlIlI[0] = (0xA5 ^ 0x83) & ~(0x5B ^ 0x7D);
        X.llllIlIIlIlI[1] = "  ".length();
        X.llllIlIIlIlI[2] = 0xFFFF999B & 0x76FF;
        X.llllIlIIlIlI[3] = " ".length();
        X.llllIlIIlIlI[4] = 0xFFFFF7B8 & 0x5FC7;
        X.llllIlIIlIlI[5] = 107 + 131 - 139 + 82 ^ 35 + 22 - 39 + 159;
        X.llllIlIIlIlI[6] = "   ".length();
        X.llllIlIIlIlI[7] = 146 + 148 - 206 + 119 ^ 57 + 132 - 140 + 150;
    }

    private static boolean lIIlIIIIlIIIllI(int n2, int n3) {
        return n2 > n3;
    }
}

