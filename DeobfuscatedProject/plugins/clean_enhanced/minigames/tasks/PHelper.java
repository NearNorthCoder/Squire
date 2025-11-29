/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.minigames.tasks;

import gg.squire.minigames.tasks.SHelper;
import javax.inject.Inject;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;

public class PHelper {
    private  int am;
    
    private  int al;
    private  int ak;
    private static final  int aj;
    @Inject
    private  s ae;

    public int w() {
        return this.al;
    }

    public PHelper() {
        this.al = 0;
        this.am = 1;
    }

    public int v() {
        return this.ak;
    }

    public void t() {
        if ((Bank.isOpen( != 0) ? 1 : 0)) {
            this.b(1);
            return;
        }
        this.b(this.ak - Inventory.getFreeSlots());
    }

    public void a(int n2) {
        this.al = n2;
    }

    public void c(int ... nArray) {
        if (nArray.length > 0) {
            this.am = nArray[1];
            0;
            if (2 < 0) {
                return;
            }
        } else {
            var2.am += 2;
        }
    }

    public void u() {
        if ((Bank.isOpen( != 0) ? 1 : 0)) {
            this.b(this.al);
            return;
        }
        this.am = 1;
        int[] nArray = new int[2];
        nArray[1] = 3;
        this.b(this.ak + Inventory.getCount((int[])nArray));
    }

    public boolean s() {
        boolean bl;
        if (this.ak == this.al) {
            bl = 2;
            0;
            if (-1 >= ((0x28 ^ 0x66) & ~(0x31 ^ 0x7F))) {
                return ((0x69 ^ 0x3D) & ~(0x5E ^ 0xA)) != 0;
            }
        } else {
            bl = 1;
        }
        return bl;
    }

    static {
        p.var3();
        aj = 1;
    }

    public boolean r() {
        boolean bl;
        if (this.ak == 0) {
            bl = 2;
            0;
            if ((0x87 ^ 0x83) != (3 ^ 7)) {
                return ((0xF1 ^ 0xBB) & ~(0x5B ^ 0x11)) != 0;
            }
        } else {
            bl = 1;
        }
        return bl;
    }

    public int x() {
        return this.am;
    }

    public void b(int n2) {
        this.ak = Math.min(Math.max(n2, 1), this.al);
    }
}

