/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.client.Static
 */
package w.r.e.i.d.r.q.u.e.-.c.u.o.s.o.t.t;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.woodcutting.SquireWoodcutterConfig;
import gg.squire.woodcutting.SquireWoodcutterPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.stream.IntStream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.client.Static;
import w.r.e.i.d.r.q.u.e.-.c.u.o.s.o.t.t.AEnum;

/* TASK: Banking -> BankingTask */
@TaskDesc(name="Banking", priority=100)
public class BankingTask
extends Task {
    private final /* synthetic */ SquireWoodcutterPlugin s;
    private static /* synthetic */ String[] lIllIIIIlIIll;
    private static /* synthetic */ int[] lIllIIIIlIlIl;
    private final /* synthetic */ SquireWoodcutterConfig t;

    private static boolean llIIIlIIIlIllll(int n, int n2) {
        return n == n2;
    }

    private static boolean llIIIlIIIlIllII(int n) {
        return n == 0;
    }

    private static boolean llIIIlIIIlIllIl(Object object, Object object2) {
        return object == object2;
    }

    private static String llIIIlIIIlIIlII(String var13, String var12) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var12.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var19 = Cipher.getInstance("Blowfish");
            var19.init(lIllIIIIlIlIl[2], var3);
            return new String(var19.doFinal(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIlIIIlIlIll(int n) {
        return n != 0;
    }

    private static boolean llIIIlIIIlIlllI(Object object) {
        return object != null;
    }

    private static boolean llIIIlIIIllIIII(int n, int n2) {
        return n < n2;
    }

    static {
        b.llIIIlIIIlIlIlI();
        b.llIIIlIIIlIlIII();
    }

    @Inject
    public b(SquireWoodcutterPlugin squireWoodcutterPlugin, SquireWoodcutterConfig squireWoodcutterConfig) {
        this.s = squireWoodcutterPlugin;
        this.t = squireWoodcutterConfig;
    }

    public boolean run() {
        b var21;
        if (!b.llIIIlIIIlIlIll(this.t.bank() ? 1 : 0) || b.llIIIlIIIlIlIll(this.t.cutLogs() ? 1 : 0)) {
            return lIllIIIIlIlIl[0];
        }
        if (b.llIIIlIIIlIllII(var21.s.p() ? 1 : 0)) {
            if (b.llIIIlIIIlIlIll(Bank.isOpen() ? 1 : 0)) {
                Bank.close();
                return lIllIIIIlIlIl[1];
            }
            return lIllIIIIlIlIl[0];
        }
        if (b.llIIIlIIIlIlIll(Inventory.isEmpty() ? 1 : 0)) {
            var21.s.a(lIllIIIIlIlIl[0]);
            return lIllIIIIlIlIl[1];
        }
        if (b.llIIIlIIIlIllII(Bank.isOpen() ? 1 : 0)) {
            BankLocation var1;
            BankLocation bankLocation;
            if (b.llIIIlIIIlIlIll(Bank.open() ? 1 : 0)) {
                return lIllIIIIlIlIl[1];
            }
            if (b.llIIIlIIIlIlIll(var21.t.fastTickChop() ? 1 : 0)) {
                bankLocation = BankLocation.FOSSIL_ISLAND_CAMP;
                0;
                if (-1 > ((68 + 78 - 77 + 137 ^ 0 + 6 - -145 + 22) & (51 + 57 - 95 + 150 ^ 10 + 24 - -113 + 45 ^ -1))) {
                    return ((0x55 ^ 0x38 ^ (0xB1 ^ 0x8B)) & (0x8E ^ 0x9D ^ (0xEE ^ 0xAA) ^ -1)) != 0;
                }
            } else {
                bankLocation = var1 = BankLocation.getNearest();
            }
            if (b.llIIIlIIIlIllIl((Object)var21.t.tree(), (Object)a.REDWOOD) && b.llIIIlIIIlIlIll(Static.getClient().getPlane())) {
                TileObject var11 = TileObjects.getNearest(tileObject -> {
                    String[] stringArray = new String[lIllIIIIlIlIl[1]];
                    stringArray[b.lIllIIIIlIlIl[0]] = lIllIIIIlIIll[lIllIIIIlIlIl[13]];
                    return tileObject.hasAction(stringArray);
                });
                if (b.llIIIlIIIlIlllI(var11)) {
                    var11.interact(lIllIIIIlIIll[lIllIIIIlIlIl[0]]);
                    return lIllIIIIlIlIl[1];
                }
                Log.info((String)lIllIIIIlIIll[lIllIIIIlIlIl[1]]);
                return lIllIIIIlIlIl[0];
            }
            Movement.walkTo((WorldPoint)var1.getArea().getCenter());
            0;
            return lIllIIIIlIlIl[1];
        }
        if (b.llIIIlIIIlIlIll(Inventory.contains(item -> item.getName().contains(lIllIIIIlIIll[lIllIIIIlIlIl[12]])) ? 1 : 0) && b.llIIIlIIIlIllII(Inventory.isFull() ? 1 : 0)) {
            Log.info((String)lIllIIIIlIIll[lIllIIIIlIlIl[2]]);
            String var1 = Inventory.getFirst(item -> item.getName().contains(lIllIIIIlIIll[lIllIIIIlIlIl[11]])).getName();
            if (b.llIIIlIIIlIlIll(var1.contains(lIllIIIIlIIll[lIllIIIIlIlIl[3]]) ? 1 : 0)) {
                int[] nArray = new int[lIllIIIIlIlIl[1]];
                nArray[b.lIllIIIIlIlIl[0]] = lIllIIIIlIlIl[4];
                if (b.llIIIlIIIlIllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray2 = new int[lIllIIIIlIlIl[1]];
                    nArray2[b.lIllIIIIlIlIl[0]] = lIllIIIIlIlIl[4];
                    if (b.llIIIlIIIlIllII(Bank.contains((int[])nArray2) ? 1 : 0)) {
                        Log.info((String)lIllIIIIlIIll[lIllIIIIlIlIl[5]]);
                        var21.s.forceStop();
                        return lIllIIIIlIlIl[1];
                    }
                    Bank.withdraw((int)lIllIIIIlIlIl[4], (int)lIllIIIIlIlIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                    return lIllIIIIlIlIl[1];
                }
            }
            if (b.llIIIlIIIlIlIll(var1.contains(lIllIIIIlIIll[lIllIIIIlIlIl[6]]) ? 1 : 0)) {
                int[] nArray = new int[lIllIIIIlIlIl[1]];
                nArray[b.lIllIIIIlIlIl[0]] = lIllIIIIlIlIl[7];
                if (b.llIIIlIIIlIllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray3 = new int[lIllIIIIlIlIl[1]];
                    nArray3[b.lIllIIIIlIlIl[0]] = lIllIIIIlIlIl[7];
                    if (b.llIIIlIIIlIllII(Bank.contains((int[])nArray3) ? 1 : 0)) {
                        Log.info((String)lIllIIIIlIIll[lIllIIIIlIlIl[8]]);
                        var21.s.forceStop();
                        return lIllIIIIlIlIl[1];
                    }
                    Bank.withdraw((int)lIllIIIIlIlIl[7], (int)lIllIIIIlIlIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                    return lIllIIIIlIlIl[1];
                }
            }
        }
        Log.info((String)lIllIIIIlIIll[lIllIIIIlIlIl[9]]);
        Bank.depositAllExcept(item -> {
            boolean bl;
            if (!b.llIIIlIIIlIllII(item.getName().toLowerCase().contains(lIllIIIIlIIll[lIllIIIIlIlIl[10]]) ? 1 : 0) || b.llIIIlIIIlIlIll(IntStream.of(this.s.i()).anyMatch(n -> {
                boolean bl;
                if (b.llIIIlIIIlIllll(item.getId(), n)) {
                    bl = lIllIIIIlIlIl[1];
                    0;
                    if ((0x60 ^ 0x64) == 0) {
                        return false;
                    }
                } else {
                    bl = lIllIIIIlIlIl[0];
                }
                return bl;
            }) ? 1 : 0)) {
                bl = lIllIIIIlIlIl[1];
                0;
                if (((0x8A ^ 0x9E) & ~(0x5B ^ 0x4F)) > 0) {
                    return false;
                }
            } else {
                bl = lIllIIIIlIlIl[0];
            }
            return bl;
        });
        return lIllIIIIlIlIl[1];
    }

    private static String llIIIlIIIlIIIll(String var8, String var2) {
        try {
            SecretKeySpec var20 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), lIllIIIIlIlIl[10]), "DES");
            Cipher var18 = Cipher.getInstance("DES");
            var18.init(lIllIIIIlIlIl[2], var20);
            return new String(var18.doFinal(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private static void llIIIlIIIlIlIII() {
        lIllIIIIlIIll = new String[lIllIIIIlIlIl[14]];
        b.lIllIIIIlIIll[b.lIllIIIIlIlIl[0]] = b."Climb-down";
        b.lIllIIIIlIIll[b.lIllIIIIlIlIl[1]] = b."Cannot find the ladder to go down to the bank";
        b.lIllIIIIlIIll[b.lIllIIIIlIlIl[2]] = b."We failed a 3t cycle, trying to withdraw a new log.";
        b.lIllIIIIlIIll[b.lIllIIIIlIlIl[3]] = b."Mahogany";
        b.lIllIIIIlIIll[b.lIllIIIIlIlIl[5]] = b."We are out of mahogany logs, stopping the script.";
        b.lIllIIIIlIIll[b.lIllIIIIlIlIl[6]] = b."Teak";
        b.lIllIIIIlIIll[b.lIllIIIIlIlIl[8]] = b."We are out of teak logs, stopping the script.";
        b.lIllIIIIlIIll[b.lIllIIIIlIlIl[9]] = b."Depositing all items except for the exceptions";
        b.lIllIIIIlIIll[b.lIllIIIIlIlIl[10]] = b."axe";
        b.lIllIIIIlIIll[b.lIllIIIIlIlIl[11]] = b."stock";
        b.lIllIIIIlIIll[b.lIllIIIIlIlIl[12]] = b."stock";
        b.lIllIIIIlIIll[b.lIllIIIIlIlIl[13]] = b."Climb-down";
    }

    private static String llIIIlIIIlIIllI(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var16 = var5.toCharArray();
        int var9 = lIllIIIIlIlIl[0];
        char[] var6 = var4.toCharArray();
        int var7 = var6.length;
        int var17 = lIllIIIIlIlIl[0];
        while (b.llIIIlIIIllIIII(var17, var7)) {
            char var15 = var6[var17];
            var14.append((char)(var15 ^ var16[var9 % var16.length]));
            0;
            ++var9;
            ++var17;
            0;
            
            return null;
        }
        return String.valueOf(var14);
    }

    private static void llIIIlIIIlIlIlI() {
        lIllIIIIlIlIl = new int[15];
        b.lIllIIIIlIlIl[0] = (0xAA ^ 0x97) & ~(0x61 ^ 0x5C);
        b.lIllIIIIlIlIl[1] = 1;
        b.lIllIIIIlIlIl[2] = 2;
        b.lIllIIIIlIlIl[3] = 3;
        b.lIllIIIIlIlIl[4] = 0xFFFFD9BC & 0x3EFF;
        b.lIllIIIIlIlIl[5] = 0x13 ^ 0x17;
        b.lIllIIIIlIlIl[6] = 24 + 121 - 45 + 74 ^ 85 + 30 - 7 + 63;
        b.lIllIIIIlIlIl[7] = 0xFFFFDEBF & 0x39FD;
        b.lIllIIIIlIlIl[8] = 0xC9 ^ 0xAC ^ (0x76 ^ 0x15);
        b.lIllIIIIlIlIl[9] = 120 + 63 - 133 + 138 ^ 172 + 103 - 142 + 54;
        b.lIllIIIIlIlIl[10] = 113 + 106 - 217 + 165 ^ 11 + 60 - -69 + 35;
        b.lIllIIIIlIlIl[11] = 0x95 ^ 0x86 ^ (0xB4 ^ 0xAE);
        b.lIllIIIIlIlIl[12] = 0x1C ^ 0x16;
        b.lIllIIIIlIlIl[13] = 1 ^ 0x47 ^ (0x44 ^ 9);
        b.lIllIIIIlIlIl[14] = 0xDC ^ 0xB0 ^ (0xF9 ^ 0x99);
    }
}

