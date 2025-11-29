/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 */
package q.s.-.i.r.e.r.w.r.s.o.u.b.a;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.barrows.SquireBarrowsConfig;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import q.s.-.i.r.e.r.w.r.s.o.u.b.a.b;
import q.s.-.i.r.e.r.w.r.s.o.u.b.a.d;

@Singleton
public class a {
    private static /* synthetic */ int[] llllIIIIIII;
    private final /* synthetic */ SquireBarrowsConfig u;

    public int[] d(d d2) {
        switch (b.v[d2.ordinal()]) {
            case 1: {
                a llllllllllllllllIIIllllIllIIllll;
                return llllllllllllllllIIIllllIllIIllll.a(llllllllllllllllIIIllllIllIIllll.u.ahrimSpecGear());
            }
            case 2: {
                a llllllllllllllllIIIllllIllIIllll;
                return llllllllllllllllIIIllllIllIIllll.a(llllllllllllllllIIIllllIllIIllll.u.karilSpecGear());
            }
        }
        return new int[llllIIIIIII[0]];
    }

    private static boolean lIllIIlIllIIlI(Object object) {
        return object != null;
    }

    public int[] c(d d2) {
        switch (b.v[d2.ordinal()]) {
            case 1: {
                a llllllllllllllllIIIllllIllIlIIll;
                return llllllllllllllllIIIllllIllIlIIll.a(llllllllllllllllIIIllllIllIlIIll.u.ahrimGear());
            }
            case 2: {
                a llllllllllllllllIIIllllIllIlIIll;
                return llllllllllllllllIIIllllIllIlIIll.a(llllllllllllllllIIIllllIllIlIIll.u.karilGear());
            }
        }
        return this.a(this.u.mageGear());
    }

    @Inject
    public a(SquireBarrowsConfig squireBarrowsConfig) {
        this.u = squireBarrowsConfig;
    }

    private static void lIllIIlIllIIIl() {
        llllIIIIIII = new int[1];
        a.llllIIIIIII[0] = (4 ^ 0x66 ^ (0x72 ^ 0x19)) & (0xB3 ^ 0xB5 ^ (0x73 ^ 0x7C) ^ -" ".length());
    }

    static {
        a.lIllIIlIllIIIl();
    }

    public BankLoadout A() {
        return (BankLoadout)this.u.bankLoadout().selected(BankLoadout.class);
    }

    public int[] a(ConfigStorageBox<EquipmentSetup> configStorageBox) {
        int[] nArray;
        EquipmentSetup equipmentSetup = (EquipmentSetup)configStorageBox.selected(EquipmentSetup.class);
        if (a.lIllIIlIllIIlI(equipmentSetup)) {
            nArray = equipmentSetup.getIds();
            "".length();
            if ((0x25 ^ 0x20) <= 0) {
                return null;
            }
        } else {
            nArray = new int[llllIIIIIII[0]];
        }
        return nArray;
    }

    public int[] B() {
        return this.a(this.u.tunnelGear());
    }
}

