/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.GameStateChanged
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Dialog
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.Y;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GameStateChanged;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;

/* TASK: Recharging trident -> RechargingtridentTask */
@TaskDesc(name="Recharging trident", priority=19010, blocking=true, register=true)
public class Z
extends Y {
    private static /* synthetic */ int[] lIlIllIlIIIl;
    private static /* synthetic */ String[] lIlIllIlIIII;

    public int h(boolean bl2) {
        int n2;
        if (Z.lllIIIIIIllIIl(bl2 ? 1 : 0)) {
            n2 = lIlIllIlIIIl[4];
            0;
            if (-1 > 1) {
                return (0xD ^ 0x5F ^ (0x67 ^ 0x6F)) & (100 + 108 - 53 + 66 ^ 86 + 35 - 50 + 64 ^ -1);
            }
        } else {
            n2 = lIlIllIlIIIl[5];
        }
        int var1 = n2;
        int[] nArray = new int[lIlIllIlIIIl[1]];
        nArray[Z.lIlIllIlIIIl[0]] = var1;
        if (Z.lllIIIIIIllIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return var1;
        }
        int[] nArray2 = new int[lIlIllIlIIIl[1]];
        nArray2[Z.lIlIllIlIIIl[0]] = lIlIllIlIIIl[8];
        if (Z.lllIIIIIIllIII(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            return lIlIllIlIIIl[8];
        }
        int[] nArray3 = new int[lIlIllIlIIIl[1]];
        nArray3[Z.lIlIllIlIIIl[0]] = lIlIllIlIIIl[10];
        if (Z.lllIIIIIIllIII(Inventory.contains((int[])nArray3) ? 1 : 0)) {
            return lIlIllIlIIIl[10];
        }
        int[] nArray4 = new int[lIlIllIlIIIl[1]];
        nArray4[Z.lIlIllIlIIIl[0]] = lIlIllIlIIIl[12];
        if (Z.lllIIIIIIllIII(Inventory.contains((int[])nArray4) ? 1 : 0)) {
            return lIlIllIlIIIl[12];
        }
        return lIlIllIlIIIl[6];
    }

    private static void lllIIIIIIlIlll() {
        lIlIllIlIIIl = new int[16];
        Z.lIlIllIlIIIl[0] = (0x4E ^ 3) & ~(0x6E ^ 0x23);
        Z.lIlIllIlIIIl[1] = 1;
        Z.lIlIllIlIIIl[2] = -(0xFFFFFA79 & 0x6787) & (0xFFFFEFF4 & 0x7BCF);
        Z.lIlIllIlIIIl[3] = 2;
        Z.lIlIllIlIIIl[4] = -(0xFFFFD4F9 & 0x7F07) & (0xFFFFF7F7 & 0x5FEB);
        Z.lIlIllIlIIIl[5] = 0xFFFFF29E & 0x3FE7;
        Z.lIlIllIlIIIl[6] = -1;
        Z.lIlIllIlIIIl[7] = 0x2D ^ 0x28;
        Z.lIlIllIlIIIl[8] = -(0xFFFFF8E7 & 0x7F5A) & (0xFFFFFB7B & 0x7EEF);
        Z.lIlIllIlIIIl[9] = 3;
        Z.lIlIllIlIIIl[10] = -(0xFFFF9FD3 & 0x78AD) & (0xFFFF9EF5 & 0x7BBA);
        Z.lIlIllIlIIIl[11] = 0x40 ^ 0x44;
        Z.lIlIllIlIIIl[12] = -(0xFFFFFBDE & 0xD67) & (0xFFFFFFFF & 0xB77);
        Z.lIlIllIlIIIl[13] = 0x2B ^ 0x6E ^ (0x13 ^ 0x50);
        Z.lIlIllIlIIIl[14] = 0x87 ^ 0x80;
        Z.lIlIllIlIIIl[15] = 116 + 125 - 235 + 141 ^ 58 + 4 - 13 + 106;
    }

    private static String lllIIIIIIlIlIl(String var21, String var15) {
        try {
            SecretKeySpec var11 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var15.getBytes(StandardCharsets.UTF_8)), lIlIllIlIIIl[15]), "DES");
            Cipher var6 = Cipher.getInstance("DES");
            var6.init(lIlIllIlIIIl[3], var11);
            return new String(var6.doFinal(Base64.getDecoder().decode(var21.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var23) {
            var23.printStackTrace();
            return null;
        }
    }

    private static String lllIIIIIIlIIll(String var3, String var8) {
        var3 = new String(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var19 = new StringBuilder();
        char[] var5 = var8.toCharArray();
        int var9 = lIlIllIlIIIl[0];
        char[] var2 = var3.toCharArray();
        int var22 = var2.length;
        int var18 = lIlIllIlIIIl[0];
        while (Z.lllIIIIIIlllII(var18, var22)) {
            char var17 = var2[var18];
            var19.append((char)(var17 ^ var5[var9 % var5.length]));
            0;
            ++var9;
            ++var18;
            0;
            
            return null;
        }
        return String.valueOf(var19);
    }

    static {
        Z.lllIIIIIIlIlll();
        Z.lllIIIIIIlIllI();
    }

    private static boolean lllIIIIIIllIll(int n2, int n3) {
        return n2 != n3;
    }

    private static void lllIIIIIIlIllI() {
        lIlIllIlIIII = new String[lIlIllIlIIIl[14]];
        Z.lIlIllIlIIII[Z.lIlIllIlIIIl[0]] = Z."Remove";
        Z.lIlIllIlIIII[Z.lIlIllIlIIIl[1]] = Z."toxic";
        Z.lIlIllIlIIII[Z.lIlIllIlIIIl[3]] = Z."swamp";
        Z.lIlIllIlIIII[Z.lIlIllIlIIIl[9]] = Z."Bank chest";
        Z.lIlIllIlIIII[Z.lIlIllIlIIIl[11]] = Z."Use";
        Z.lIlIllIlIIII[Z.lIlIllIlIIIl[7]] = Z."trident";
        Z.lIlIllIlIIII[Z.lIlIllIlIIIl[13]] = Z."trident";
    }

    private static boolean lllIIIIIIllllI(int n2, int n3) {
        return n2 > n3;
    }

    private static String lllIIIIIIlIlII(String var20, String var12) {
        try {
            SecretKeySpec var7 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var12.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var4 = Cipher.getInstance("Blowfish");
            var4.init(lIlIllIlIIIl[3], var7);
            return new String(var4.doFinal(Base64.getDecoder().decode(var20.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIIIIIlllIl(Object object) {
        return object != null;
    }

    private static boolean lllIIIIIIllIlI(Object object) {
        return object == null;
    }

    @Subscribe
    public void a(GameStateChanged gameStateChanged) {
        if (Z.lllIIIIIIllIIl(this.u.isInInstancedRegion() ? 1 : 0)) {
            cw = lIlIllIlIIIl[0];
        }
    }

    private static boolean lllIIIIIIlllII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllIIIIIIllIII(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean cg() {
        void var1_1;
        void var5_7;
        int var14;
        int n2;
        Z var10;
        int n3;
        if (Z.lllIIIIIIllIII(this.cr() ? 1 : 0)) {
            return lIlIllIlIIIl[0];
        }
        if (Z.lllIIIIIIllIIl(cw ? 1 : 0)) {
            return lIlIllIlIIIl[0];
        }
        if (Z.lllIIIIIIllIIl(Dialog.canContinue() ? 1 : 0)) {
            cw = lIlIllIlIIIl[1];
        }
        if (Z.lllIIIIIIllIIl(Dialog.isEnterInputOpen() ? 1 : 0)) {
            Dialog.enterAmount((int)lIlIllIlIIIl[2]);
            return lIlIllIlIIIl[1];
        }
        Item var16 = Inventory.getFirst(item -> item.getName().toLowerCase().contains(lIlIllIlIIII[lIlIllIlIIIl[13]]));
        if (Z.lllIIIIIIllIlI(var16)) {
            Item var24 = Equipment.getFirst(item -> item.getName().toLowerCase().contains(lIlIllIlIIII[lIlIllIlIIIl[7]]));
            if (Z.lllIIIIIIllIlI(var24)) {
                cw = lIlIllIlIIIl[1];
                return lIlIllIlIIIl[0];
            }
            var24.interact(lIlIllIlIIII[lIlIllIlIIIl[0]]);
            return lIlIllIlIIIl[1];
        }
        if (Z.lllIIIIIIllIII(var16.getName().toLowerCase().contains(lIlIllIlIIII[lIlIllIlIIIl[1]]) ? 1 : 0) && Z.lllIIIIIIllIII(var16.getName().toLowerCase().contains(lIlIllIlIIII[lIlIllIlIIIl[3]]) ? 1 : 0)) {
            n3 = lIlIllIlIIIl[1];
            0;
            if (((0x7E ^ 0x31 ^ (0x78 ^ 0x56)) & (0xEE ^ 0x98 ^ (0x95 ^ 0x82) ^ -1)) > 0) {
                return false;
            }
        } else {
            n3 = lIlIllIlIIIl[0];
        }
        int var24 = n3;
        int var26 = var10.h(var24 != 0);
        if (Z.lllIIIIIIllIIl(var24)) {
            n2 = lIlIllIlIIIl[4];
            0;
            if (3 == 0) {
                return ((0x9C ^ 0xB6 ^ (0x23 ^ 0x1D)) & (100 + 8 - 90 + 121 ^ 100 + 115 - 99 + 43 ^ -1)) != 0;
            }
        } else {
            n2 = var14 = lIlIllIlIIIl[5];
        }
        if (Z.lllIIIIIIllIll(var26, lIlIllIlIIIl[6])) {
            if (Z.lllIIIIIIllIII(Bank.isEmpty() ? 1 : 0)) {
                int[] nArray = new int[lIlIllIlIIIl[1]];
                nArray[Z.lIlIllIlIIIl[0]] = var26;
                if (Z.lllIIIIIIllIII(Bank.contains((int[])nArray) ? 1 : 0)) {
                    cw = lIlIllIlIIIl[1];
                }
            }
            if (Z.lllIIIIIIllIIl(Bank.isOpen() ? 1 : 0)) {
                if (Z.lllIIIIIIlllII(Inventory.getFreeSlots(), lIlIllIlIIIl[7])) {
                    int[] nArray = new int[lIlIllIlIIIl[7]];
                    nArray[Z.lIlIllIlIIIl[0]] = var16.getId();
                    nArray[Z.lIlIllIlIIIl[1]] = var14;
                    nArray[Z.lIlIllIlIIIl[3]] = lIlIllIlIIIl[8];
                    nArray[Z.lIlIllIlIIIl[9]] = lIlIllIlIIIl[10];
                    nArray[Z.lIlIllIlIIIl[11]] = lIlIllIlIIIl[12];
                    Bank.depositAllExcept((int[])nArray);
                    return lIlIllIlIIIl[1];
                }
                Bank.withdrawAll((int)var26, (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                return lIlIllIlIIIl[1];
            }
            int[] nArray = new int[lIlIllIlIIIl[1]];
            nArray[Z.lIlIllIlIIIl[0]] = var26;
            if (!Z.lllIIIIIIllIII(Bank.contains((int[])nArray) ? 1 : 0) || Z.lllIIIIIIllIIl(Bank.isEmpty() ? 1 : 0)) {
                TileObject var25 = TileObjects.getNearest(tileObject -> {
                    int n2;
                    if (Z.lllIIIIIIllIIl(tileObject.getName().equals(lIlIllIlIIII[lIlIllIlIIIl[9]]) ? 1 : 0)) {
                        String[] stringArray = new String[lIlIllIlIIIl[1]];
                        stringArray[Z.lIlIllIlIIIl[0]] = lIlIllIlIIII[lIlIllIlIIIl[11]];
                        if (Z.lllIIIIIIllIIl(tileObject.hasAction(stringArray) ? 1 : 0)) {
                            n2 = lIlIllIlIIIl[1];
                            0;
                            if (((0x4F ^ 0x11) & ~(8 ^ 0x56)) == 0) return n2 != 0;
                            return false;
                        }
                    }
                    n2 = lIlIllIlIIIl[0];
                    return n2 != 0;
                });
                if (Z.lllIIIIIIlllIl(var25) && Z.lllIIIIIIllllI(Players.getLocal().distanceTo((Locatable)var25), lIlIllIlIIIl[13])) {
                    Movement.setDestination((WorldPoint)var25.getWorldLocation());
                    return lIlIllIlIIIl[1];
                }
                Bank.open();
                0;
                return lIlIllIlIIIl[1];
            }
        }
        int[] nArray = new int[lIlIllIlIIIl[1]];
        nArray[Z.lIlIllIlIIIl[0]] = var14;
        Item var25 = Inventory.getFirst((int[])nArray);
        if (Z.lllIIIIIIllIlI(var25)) {
            return lIlIllIlIIIl[0];
        }
        var5_7.useOn((Item)var1_1);
        return lIlIllIlIIIl[1];
    }

    private static boolean lllIIIIIIllIIl(int n2) {
        return n2 != 0;
    }
}

