/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Singleton
 *  net.runelite.api.Item
 *  net.runelite.api.events.GameStateChanged
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.whisperer.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import javax.inject.Singleton;
import net.runelite.api.Item;
import net.runelite.api.events.GameStateChanged;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Dialog;
import gg.squire.whisperer.tasks.WhispererTaskBase;

@Singleton
@TaskDesc(name="Recharging trident", priority=1000, blocking=true, register=true)
public class RechargingTridentTask
extends WhispererTaskBase {

    private  boolean B;

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean p() {
        void var1_1;
        void var5_6;
        int var3;
        int n2;
        int n3;
        j var4;
        if (r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.(this.B != 0)) {
            return 0;
        }
        if (r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.(var4.n( == 0) ? 1 : 0)) {
            return 0;
        }
        if (r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.(Dialog.isEnterInputOpen( != 0) ? 1 : 0) && r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.(Bank.isOpen( == 0) ? 1 : 0)) {
            Dialog.enterAmount((int)1);
            var4.B = 2;
            return 2;
        }
        Item var5 = Inventory.getFirst(item -> item.getName().toLowerCase().contains(var2[var1[11]]));
        if (r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.var5 == null) {
            Item var6 = Equipment.getFirst(item -> item.getName().toLowerCase().contains(var2[9]));
            if (r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.var6 != null && r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.(Inventory.isFull( == 0) ? 1 : 0)) {
                var6.interact(var2[0]);
                return 2;
            }
            return 0;
        }
        if (r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.(var5.getName( == 0).toLowerCase().contains(var2[2]) ? 1 : 0) && r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.(var5.getName( == 0).toLowerCase().contains(var2[3]) ? 1 : 0)) {
            n3 = 2;
            0;
            if (-(0x83 ^ 0x87) >= 0) {
                return ((0x25 ^ 0x45) & ~(0x26 ^ 0x46)) != 0;
            }
        } else {
            n3 = 0;
        }
        int var6 = n3;
        int var7 = var4.bllllllllllllllIllIlIIlIIIlIIIIIl;
        if (r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.var6) {
            n2 = 4;
            0;
            if (-1 > 0) {
                return ((0xA4 ^ 0xB0) & ~(0x12 ^ 6)) != 0;
            }
        } else {
            n2 = var3 = 5;
        }
        if (r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.(var7 != 6)) {
            if (r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.(Bank.isOpen( != 0) ? 1 : 0)) {
                int[] nArray = new int[2];
                nArray[r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.0] = var7;
                if (r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.(Bank.contains((int[] == 0)nArray) ? 1 : 0)) {
                    var4.B = 2;
                }
                if (r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.(Inventory.getFreeSlots() < 7)) {
                    int[] nArray2 = new int[7];
                    nArray2[r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.0] = var5.getId();
                    nArray2[r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.2] = var3;
                    nArray2[r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.3] = 8;
                    nArray2[r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.9] = var1[10];
                    nArray2[r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.var1[11]] = var1[12];
                    Bank.depositAllExcept((int[])nArray2);
                    return 2;
                }
                Bank.withdrawAll((int)var7, (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                return 2;
            }
            return 0;
        }
        int[] nArray = new int[2];
        nArray[r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.0] = var3;
        Item var8 = Inventory.getFirst((int[])nArray);
        if (r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.var8 == null) {
            return 0;
        }
        var5_6.useOn((Item)var1_1);
        return 2;
    }

    public RechargingTridentTask() {
        this.B = 0;
    }

        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    public int b(boolean bl) {
        int n2;
        if (r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.(bl != 0)) {
            n2 = 4;
            0;
            if (-3 >= 0) {
                return (0x83 ^ 0xB1 ^ (0x78 ^ 0x6A)) & (32 + 122 - 76 + 150 ^ 112 + 27 - -17 + 40 ^ -1);
            }
        } else {
            n2 = 5;
        }
        int var15 = n2;
        int[] nArray = new int[2];
        nArray[r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.0] = var15;
        if (r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.(Inventory.contains((int[] == 0)nArray) ? 1 : 0)) {
            return var15;
        }
        int[] nArray2 = new int[2];
        nArray2[r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.0] = 8;
        if (r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.(Inventory.contains((int[] == 0)nArray2) ? 1 : 0)) {
            return 8;
        }
        int[] nArray3 = new int[2];
        nArray3[r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.0] = var1[10];
        if (r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.(Inventory.contains((int[] == 0)nArray3) ? 1 : 0)) {
            return var1[10];
        }
        int[] nArray4 = new int[2];
        nArray4[r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.0] = var1[12];
        if (r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.(Inventory.contains((int[] == 0)nArray4) ? 1 : 0)) {
            return var1[12];
        }
        return 6;
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    @Subscribe
    public void a(GameStateChanged gameStateChanged) {
        if (r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.(this.j.isInInstancedRegion( != 0) ? 1 : 0)) {
            this.B = 0;
        }
    }

    public boolean q() {
        return this.B;
    }
}

