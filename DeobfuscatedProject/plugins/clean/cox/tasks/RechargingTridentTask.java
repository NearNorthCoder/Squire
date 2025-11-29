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
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.CoxTaskBase;
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
public class RechargingTridentTask
extends CoxTaskBase {

    public int h(boolean bl2) {
        int n2;
        if (Z.lllIIIIIIllIIl(bl2 ? 1 : 0)) {
            n2 = lIlIllIlIIIl[4];

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

        return String.valueOf(var2);
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
        Z.lIlIllIlIIII[Z.lIlIllIlIIIl[0]] = "Remove";
        Z.lIlIllIlIIII[Z.lIlIllIlIIIl[1]] = "toxic";
        Z.lIlIllIlIIII[Z.lIlIllIlIIIl[3]] = "swamp";
        Z.lIlIllIlIIII[Z.lIlIllIlIIIl[9]] = "Bank chest";
        Z.lIlIllIlIIII[Z.lIlIllIlIIIl[11]] = "Use";
        Z.lIlIllIlIIII[Z.lIlIllIlIIIl[7]] = "trident";
        Z.lIlIllIlIIII[Z.lIlIllIlIIIl[13]] = "trident";
    }

    private static boolean lllIIIIIIllllI(int n2, int n3) {
        return n2 > n3;
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
        int var3;
        int n2;
        Z var4;
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
        Item var5 = Inventory.getFirst(item -> item.getName().toLowerCase().contains(lIlIllIlIIII[lIlIllIlIIIl[13]]));
        if (Z.lllIIIIIIllIlI(var5)) {
            Item var6 = Equipment.getFirst(item -> item.getName().toLowerCase().contains(lIlIllIlIIII[lIlIllIlIIIl[7]]));
            if (Z.lllIIIIIIllIlI(var6)) {
                cw = lIlIllIlIIIl[1];
                return lIlIllIlIIIl[0];
            }
            var6.interact(lIlIllIlIIII[lIlIllIlIIIl[0]]);
            return lIlIllIlIIIl[1];
        }
        if (Z.lllIIIIIIllIII(var5.getName().toLowerCase().contains(lIlIllIlIIII[lIlIllIlIIIl[1]]) ? 1 : 0) && Z.lllIIIIIIllIII(var5.getName().toLowerCase().contains(lIlIllIlIIII[lIlIllIlIIIl[3]]) ? 1 : 0)) {
            n3 = lIlIllIlIIIl[1];

            if (((0x7E ^ 0x31 ^ (0x78 ^ 0x56)) & (0xEE ^ 0x98 ^ (0x95 ^ 0x82) ^ -1)) > 0) {
                return false;
            }
        } else {
            n3 = lIlIllIlIIIl[0];
        }
        int var6 = n3;
        int var7 = var4.h(var6 != 0);
        if (Z.lllIIIIIIllIIl(var6)) {
            n2 = lIlIllIlIIIl[4];

            if (3 == 0) {
                return ((0x9C ^ 0xB6 ^ (0x23 ^ 0x1D)) & (100 + 8 - 90 + 121 ^ 100 + 115 - 99 + 43 ^ -1)) != 0;
            }
        } else {
            n2 = var3 = lIlIllIlIIIl[5];
        }
        if (Z.lllIIIIIIllIll(var7, lIlIllIlIIIl[6])) {
            if (Z.lllIIIIIIllIII(Bank.isEmpty() ? 1 : 0)) {
                int[] nArray = new int[lIlIllIlIIIl[1]];
                nArray[Z.lIlIllIlIIIl[0]] = var7;
                if (Z.lllIIIIIIllIII(Bank.contains((int[])nArray) ? 1 : 0)) {
                    cw = lIlIllIlIIIl[1];
                }
            }
            if (Z.lllIIIIIIllIIl(Bank.isOpen() ? 1 : 0)) {
                if (Z.lllIIIIIIlllII(Inventory.getFreeSlots(), lIlIllIlIIIl[7])) {
                    int[] nArray = new int[lIlIllIlIIIl[7]];
                    nArray[Z.lIlIllIlIIIl[0]] = var5.getId();
                    nArray[Z.lIlIllIlIIIl[1]] = var3;
                    nArray[Z.lIlIllIlIIIl[3]] = lIlIllIlIIIl[8];
                    nArray[Z.lIlIllIlIIIl[9]] = lIlIllIlIIIl[10];
                    nArray[Z.lIlIllIlIIIl[11]] = lIlIllIlIIIl[12];
                    Bank.depositAllExcept((int[])nArray);
                    return lIlIllIlIIIl[1];
                }
                Bank.withdrawAll((int)var7, (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                return lIlIllIlIIIl[1];
            }
            int[] nArray = new int[lIlIllIlIIIl[1]];
            nArray[Z.lIlIllIlIIIl[0]] = var7;
            if (!Z.lllIIIIIIllIII(Bank.contains((int[])nArray) ? 1 : 0) || Z.lllIIIIIIllIIl(Bank.isEmpty() ? 1 : 0)) {
                TileObject var8 = TileObjects.getNearest(tileObject -> {
                    int n2;
                    if (Z.lllIIIIIIllIIl(tileObject.getName().equals(lIlIllIlIIII[lIlIllIlIIIl[9]]) ? 1 : 0)) {
                        String[] stringArray = new String[lIlIllIlIIIl[1]];
                        stringArray[Z.lIlIllIlIIIl[0]] = lIlIllIlIIII[lIlIllIlIIIl[11]];
                        if (Z.lllIIIIIIllIIl(tileObject.hasAction(stringArray) ? 1 : 0)) {
                            n2 = lIlIllIlIIIl[1];

                            if (((0x4F ^ 0x11) & ~(8 ^ 0x56)) == 0) return n2 != 0;
                            return false;
                        }
                    }
                    n2 = lIlIllIlIIIl[0];
                    return n2 != 0;
                });
                if (Z.lllIIIIIIlllIl(var8) && Z.lllIIIIIIllllI(Players.getLocal().distanceTo((Locatable)var8), lIlIllIlIIIl[13])) {
                    Movement.setDestination((WorldPoint)var8.getWorldLocation());
                    return lIlIllIlIIIl[1];
                }
                Bank.open();

                return lIlIllIlIIIl[1];
            }
        }
        int[] nArray = new int[lIlIllIlIIIl[1]];
        nArray[Z.lIlIllIlIIIl[0]] = var3;
        Item var8 = Inventory.getFirst((int[])nArray);
        if (Z.lllIIIIIIllIlI(var8)) {
            return lIlIllIlIIIl[0];
        }
        var5_7.useOn((Item)var1_1);
        return lIlIllIlIIIl[1];
    }

    private static boolean lllIIIIIIllIIl(int n2) {
        return n2 != 0;
    }
}

