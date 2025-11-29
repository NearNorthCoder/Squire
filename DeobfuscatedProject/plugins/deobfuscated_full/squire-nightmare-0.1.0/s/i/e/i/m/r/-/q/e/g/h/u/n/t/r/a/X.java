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

/* TASK: Retrieving teleport for death walking. -> Retrievingteleportfordeathwalking.Task */
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
        BankLocation var13;
        X var4;
        if (X.lIIlIIIIlIIIIlI(this.cV.enableBanking() ? 1 : 0)) {
            return llllIlIIlIlI[0];
        }
        if (X.lIIlIIIIlIIIIlI(var4.cW.ad() ? 1 : 0)) {
            return llllIlIIlIlI[0];
        }
        int[] nArray = new int[llllIlIIlIlI[1]];
        nArray[X.llllIlIIlIlI[0]] = llllIlIIlIlI[2];
        nArray[X.llllIlIIlIlI[3]] = llllIlIIlIlI[4];
        if (X.lIIlIIIIlIIIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return llllIlIIlIlI[0];
        }
        TileObject var11 = TileObjects.getNearest(tileObject -> tileObject.getName().contains(llllIlIIlIIl[llllIlIIlIlI[6]]));
        if (X.lIIlIIIIlIIIlII(var11)) {
            return llllIlIIlIlI[0];
        }
        if (X.lIIlIIIIlIIIIll(Bank.isOpen() ? 1 : 0)) {
            var13 = item -> {
                int n2;
                if (X.lIIlIIIIlIIIIll(item.getName().toLowerCase().contains(llllIlIIlIIl[llllIlIIlIlI[1]]) ? 1 : 0) && X.lIIlIIIIlIIIIlI(item.isPlaceholder() ? 1 : 0)) {
                    n2 = llllIlIIlIlI[3];
                    0;
                    if ((0x47 ^ 0x40 ^ 3) == 1) {
                        return ((0x59 ^ 0x35 ^ (0x4C ^ 0x11)) & (21 + 166 - 70 + 57 ^ 150 + 12 - 133 + 130 ^ -1)) != 0;
                    }
                } else {
                    n2 = llllIlIIlIlI[0];
                }
                return n2 != 0;
            };
            if (X.lIIlIIIIlIIIIll(var4.cb() ? 1 : 0) && X.lIIlIIIIlIIIIll(Bank.contains((Predicate)var13) ? 1 : 0)) {
                return var4.a((Predicate<Item>)var13);
            }
            if (X.lIIlIIIIlIIIIll(j.aU() ? 1 : 0)) {
                int[] nArray2 = new int[llllIlIIlIlI[3]];
                nArray2[X.llllIlIIlIlI[0]] = llllIlIIlIlI[4];
                Item var18 = Bank.getFirst((int[])nArray2);
                if (X.lIIlIIIIlIIIlIl(var18)) {
                    int[] nArray3 = new int[llllIlIIlIlI[3]];
                    nArray3[X.llllIlIIlIlI[0]] = llllIlIIlIlI[2];
                    var18 = Bank.getFirst((int[])nArray3);
                }
                if (X.lIIlIIIIlIIIlII(var18)) {
                    Bank.withdraw((int)var18.getId(), (int)llllIlIIlIlI[3], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                    var4.sleep(llllIlIIlIlI[1]);
                    return llllIlIIlIlI[3];
                }
                0;
                if (((0 ^ 0x33) & ~(0x9D ^ 0xAE)) != 0) {
                    return false;
                }
            } else {
                int[] nArray4 = new int[llllIlIIlIlI[3]];
                nArray4[X.llllIlIIlIlI[0]] = llllIlIIlIlI[2];
                Item var18 = Bank.getFirst((int[])nArray4);
                if (X.lIIlIIIIlIIIlIl(var18)) {
                    int[] nArray5 = new int[llllIlIIlIlI[3]];
                    nArray5[X.llllIlIIlIlI[0]] = llllIlIIlIlI[4];
                    var18 = Bank.getFirst((int[])nArray5);
                }
                if (X.lIIlIIIIlIIIlII(var18)) {
                    Bank.withdraw((int)var18.getId(), (int)llllIlIIlIlI[3], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                    var4.sleep(llllIlIIlIlI[1]);
                    return llllIlIIlIlI[3];
                }
            }
        }
        if (X.lIIlIIIIlIIIIlI(Movement.shouldWalk() ? 1 : 0)) {
            return llllIlIIlIlI[0];
        }
        var13 = BankLocation.getNearest();
        if (X.lIIlIIIIlIIIllI(var13.getArea().distanceTo(Players.getLocal().getWorldLocation()), llllIlIIlIlI[5])) {
            Movement.walkTo((WorldArea)var13.getArea());
            0;
            return llllIlIIlIlI[3];
        }
        return Bank.open();
    }

    private static void lIIlIIIIIllllll() {
        llllIlIIlIIl = new String[llllIlIIlIlI[5]];
        X.llllIlIIlIIl[X.llllIlIIlIlI[0]] = X."Drink";
        X.llllIlIIlIIl[X.llllIlIIlIlI[3]] = X."Eat";
        X.llllIlIIlIIl[X.llllIlIIlIlI[1]] = X."stamina potion";
        X.llllIlIIlIIl[X.llllIlIIlIlI[6]] = X."Pool of Nightmares";
    }

    private static boolean lIIlIIIIlIIIIlI(int n2) {
        return n2 == 0;
    }

    private static String lIIlIIIIIllllIl(String var5, String var2) {
        var5 = new String(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var9 = var2.toCharArray();
        int var7 = llllIlIIlIlI[0];
        char[] var1 = var5.toCharArray();
        int var12 = var1.length;
        int var14 = llllIlIIlIlI[0];
        while (X.lIIlIIIIlIIIlll(var14, var12)) {
            char var10 = var1[var14];
            var8.append((char)(var10 ^ var9[var7 % var9.length]));
            0;
            ++var7;
            ++var14;
            0;
            if (((0x53 ^ 0x43) & ~(0x76 ^ 0x66)) >= ((0x99 ^ 0xBF) & ~(0x4A ^ 0x6C))) continue;
            return null;
        }
        return String.valueOf(var8);
    }

    private static boolean lIIlIIIIlIIIlIl(Object object) {
        return object == null;
    }

    static {
        X.lIIlIIIIlIIIIIl();
        X.lIIlIIIIIllllll();
    }

    private static String lIIlIIIIIlllllI(String var15, String var16) {
        try {
            SecretKeySpec var17 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var16.getBytes(StandardCharsets.UTF_8)), llllIlIIlIlI[7]), "DES");
            Cipher var6 = Cipher.getInstance("DES");
            var6.init(llllIlIIlIlI[1], var17);
            return new String(var6.doFinal(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
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
        X.llllIlIIlIlI[1] = 2;
        X.llllIlIIlIlI[2] = 0xFFFF999B & 0x76FF;
        X.llllIlIIlIlI[3] = 1;
        X.llllIlIIlIlI[4] = 0xFFFFF7B8 & 0x5FC7;
        X.llllIlIIlIlI[5] = 107 + 131 - 139 + 82 ^ 35 + 22 - 39 + 159;
        X.llllIlIIlIlI[6] = 3;
        X.llllIlIIlIlI[7] = 146 + 148 - 206 + 119 ^ 57 + 132 - 140 + 150;
    }

    private static boolean lIIlIIIIlIIIllI(int n2, int n3) {
        return n2 > n3;
    }
}

