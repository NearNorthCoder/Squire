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
        int lllllllllllllllIllIIlIlIlIllIlII = n2;
        int[] nArray = new int[lIlIllIlIIIl[1]];
        nArray[Z.lIlIllIlIIIl[0]] = lllllllllllllllIllIIlIlIlIllIlII;
        if (Z.lllIIIIIIllIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return lllllllllllllllIllIIlIlIlIllIlII;
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

    private static String lllIIIIIIlIlIl(String lllllllllllllllIllIIlIlIlIIllIll, String lllllllllllllllIllIIlIlIlIIlllII) {
        try {
            SecretKeySpec lllllllllllllllIllIIlIlIlIlIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIlIlIlIIlllII.getBytes(StandardCharsets.UTF_8)), lIlIllIlIIIl[15]), "DES");
            Cipher lllllllllllllllIllIIlIlIlIIlllll = Cipher.getInstance("DES");
            lllllllllllllllIllIIlIlIlIIlllll.init(lIlIllIlIIIl[3], lllllllllllllllIllIIlIlIlIlIIIII);
            return new String(lllllllllllllllIllIIlIlIlIIlllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIlIlIlIIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIIlIlIlIIllllI) {
            lllllllllllllllIllIIlIlIlIIllllI.printStackTrace();
            return null;
        }
    }

    private static String lllIIIIIIlIIll(String lllllllllllllllIllIIlIlIlIIIlIII, String lllllllllllllllIllIIlIlIlIIIllII) {
        lllllllllllllllIllIIlIlIlIIIlIII = new String(Base64.getDecoder().decode(lllllllllllllllIllIIlIlIlIIIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIIlIlIlIIIlIll = new StringBuilder();
        char[] lllllllllllllllIllIIlIlIlIIIlIlI = lllllllllllllllIllIIlIlIlIIIllII.toCharArray();
        int lllllllllllllllIllIIlIlIlIIIlIIl = lIlIllIlIIIl[0];
        char[] lllllllllllllllIllIIlIlIlIIIIIll = lllllllllllllllIllIIlIlIlIIIlIII.toCharArray();
        int lllllllllllllllIllIIlIlIlIIIIIlI = lllllllllllllllIllIIlIlIlIIIIIll.length;
        int lllllllllllllllIllIIlIlIlIIIIIIl = lIlIllIlIIIl[0];
        while (Z.lllIIIIIIlllII(lllllllllllllllIllIIlIlIlIIIIIIl, lllllllllllllllIllIIlIlIlIIIIIlI)) {
            char lllllllllllllllIllIIlIlIlIIIlllI = lllllllllllllllIllIIlIlIlIIIIIll[lllllllllllllllIllIIlIlIlIIIIIIl];
            lllllllllllllllIllIIlIlIlIIIlIll.append((char)(lllllllllllllllIllIIlIlIlIIIlllI ^ lllllllllllllllIllIIlIlIlIIIlIlI[lllllllllllllllIllIIlIlIlIIIlIIl % lllllllllllllllIllIIlIlIlIIIlIlI.length]));
            0;
            ++lllllllllllllllIllIIlIlIlIIIlIIl;
            ++lllllllllllllllIllIIlIlIlIIIIIIl;
            0;
            if (null == null) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIllIIlIlIlIIIlIll);
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

    private static String lllIIIIIIlIlII(String lllllllllllllllIllIIlIlIlIlIlIII, String lllllllllllllllIllIIlIlIlIlIlIIl) {
        try {
            SecretKeySpec lllllllllllllllIllIIlIlIlIlIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIlIlIlIlIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIIlIlIlIlIllII = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIIlIlIlIlIllII.init(lIlIllIlIIIl[3], lllllllllllllllIllIIlIlIlIlIllIl);
            return new String(lllllllllllllllIllIIlIlIlIlIllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIlIlIlIlIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIIlIlIlIlIlIll) {
            lllllllllllllllIllIIlIlIlIlIlIll.printStackTrace();
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
        int lllllllllllllllIllIIlIlIlIlllIll;
        int n2;
        Z lllllllllllllllIllIIlIlIlIllllll;
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
        Item lllllllllllllllIllIIlIlIlIlllllI = Inventory.getFirst(item -> item.getName().toLowerCase().contains(lIlIllIlIIII[lIlIllIlIIIl[13]]));
        if (Z.lllIIIIIIllIlI(lllllllllllllllIllIIlIlIlIlllllI)) {
            Item lllllllllllllllIllIIlIlIlIllllIl = Equipment.getFirst(item -> item.getName().toLowerCase().contains(lIlIllIlIIII[lIlIllIlIIIl[7]]));
            if (Z.lllIIIIIIllIlI(lllllllllllllllIllIIlIlIlIllllIl)) {
                cw = lIlIllIlIIIl[1];
                return lIlIllIlIIIl[0];
            }
            lllllllllllllllIllIIlIlIlIllllIl.interact(lIlIllIlIIII[lIlIllIlIIIl[0]]);
            return lIlIllIlIIIl[1];
        }
        if (Z.lllIIIIIIllIII(lllllllllllllllIllIIlIlIlIlllllI.getName().toLowerCase().contains(lIlIllIlIIII[lIlIllIlIIIl[1]]) ? 1 : 0) && Z.lllIIIIIIllIII(lllllllllllllllIllIIlIlIlIlllllI.getName().toLowerCase().contains(lIlIllIlIIII[lIlIllIlIIIl[3]]) ? 1 : 0)) {
            n3 = lIlIllIlIIIl[1];
            0;
            if (((0x7E ^ 0x31 ^ (0x78 ^ 0x56)) & (0xEE ^ 0x98 ^ (0x95 ^ 0x82) ^ -1)) > 0) {
                return ((0x70 ^ 0x3D ^ 2) & (32 + 86 - -83 + 16 ^ 9 + 80 - -3 + 58 ^ -1)) != 0;
            }
        } else {
            n3 = lIlIllIlIIIl[0];
        }
        int lllllllllllllllIllIIlIlIlIllllIl = n3;
        int lllllllllllllllIllIIlIlIlIllllII = lllllllllllllllIllIIlIlIlIllllll.h(lllllllllllllllIllIIlIlIlIllllIl != 0);
        if (Z.lllIIIIIIllIIl(lllllllllllllllIllIIlIlIlIllllIl)) {
            n2 = lIlIllIlIIIl[4];
            0;
            if (3 == 0) {
                return ((0x9C ^ 0xB6 ^ (0x23 ^ 0x1D)) & (100 + 8 - 90 + 121 ^ 100 + 115 - 99 + 43 ^ -1)) != 0;
            }
        } else {
            n2 = lllllllllllllllIllIIlIlIlIlllIll = lIlIllIlIIIl[5];
        }
        if (Z.lllIIIIIIllIll(lllllllllllllllIllIIlIlIlIllllII, lIlIllIlIIIl[6])) {
            if (Z.lllIIIIIIllIII(Bank.isEmpty() ? 1 : 0)) {
                int[] nArray = new int[lIlIllIlIIIl[1]];
                nArray[Z.lIlIllIlIIIl[0]] = lllllllllllllllIllIIlIlIlIllllII;
                if (Z.lllIIIIIIllIII(Bank.contains((int[])nArray) ? 1 : 0)) {
                    cw = lIlIllIlIIIl[1];
                }
            }
            if (Z.lllIIIIIIllIIl(Bank.isOpen() ? 1 : 0)) {
                if (Z.lllIIIIIIlllII(Inventory.getFreeSlots(), lIlIllIlIIIl[7])) {
                    int[] nArray = new int[lIlIllIlIIIl[7]];
                    nArray[Z.lIlIllIlIIIl[0]] = lllllllllllllllIllIIlIlIlIlllllI.getId();
                    nArray[Z.lIlIllIlIIIl[1]] = lllllllllllllllIllIIlIlIlIlllIll;
                    nArray[Z.lIlIllIlIIIl[3]] = lIlIllIlIIIl[8];
                    nArray[Z.lIlIllIlIIIl[9]] = lIlIllIlIIIl[10];
                    nArray[Z.lIlIllIlIIIl[11]] = lIlIllIlIIIl[12];
                    Bank.depositAllExcept((int[])nArray);
                    return lIlIllIlIIIl[1];
                }
                Bank.withdrawAll((int)lllllllllllllllIllIIlIlIlIllllII, (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                return lIlIllIlIIIl[1];
            }
            int[] nArray = new int[lIlIllIlIIIl[1]];
            nArray[Z.lIlIllIlIIIl[0]] = lllllllllllllllIllIIlIlIlIllllII;
            if (!Z.lllIIIIIIllIII(Bank.contains((int[])nArray) ? 1 : 0) || Z.lllIIIIIIllIIl(Bank.isEmpty() ? 1 : 0)) {
                TileObject lllllllllllllllIllIIlIlIlIlllIlI = TileObjects.getNearest(tileObject -> {
                    int n2;
                    if (Z.lllIIIIIIllIIl(tileObject.getName().equals(lIlIllIlIIII[lIlIllIlIIIl[9]]) ? 1 : 0)) {
                        String[] stringArray = new String[lIlIllIlIIIl[1]];
                        stringArray[Z.lIlIllIlIIIl[0]] = lIlIllIlIIII[lIlIllIlIIIl[11]];
                        if (Z.lllIIIIIIllIIl(tileObject.hasAction(stringArray) ? 1 : 0)) {
                            n2 = lIlIllIlIIIl[1];
                            0;
                            if (((0x4F ^ 0x11) & ~(8 ^ 0x56)) == 0) return n2 != 0;
                            return ((0x95 ^ 0x8E) & ~(0x25 ^ 0x3E)) != 0;
                        }
                    }
                    n2 = lIlIllIlIIIl[0];
                    return n2 != 0;
                });
                if (Z.lllIIIIIIlllIl(lllllllllllllllIllIIlIlIlIlllIlI) && Z.lllIIIIIIllllI(Players.getLocal().distanceTo((Locatable)lllllllllllllllIllIIlIlIlIlllIlI), lIlIllIlIIIl[13])) {
                    Movement.setDestination((WorldPoint)lllllllllllllllIllIIlIlIlIlllIlI.getWorldLocation());
                    return lIlIllIlIIIl[1];
                }
                Bank.open();
                0;
                return lIlIllIlIIIl[1];
            }
        }
        int[] nArray = new int[lIlIllIlIIIl[1]];
        nArray[Z.lIlIllIlIIIl[0]] = lllllllllllllllIllIIlIlIlIlllIll;
        Item lllllllllllllllIllIIlIlIlIlllIlI = Inventory.getFirst((int[])nArray);
        if (Z.lllIIIIIIllIlI(lllllllllllllllIllIIlIlIlIlllIlI)) {
            return lIlIllIlIIIl[0];
        }
        var5_7.useOn((Item)var1_1);
        return lIlIllIlIIIl[1];
    }

    private static boolean lllIIIIIIllIIl(int n2) {
        return n2 != 0;
    }
}

