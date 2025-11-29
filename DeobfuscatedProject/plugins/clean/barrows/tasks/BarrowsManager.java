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
package gg.squire.barrows.tasks;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.barrows.SquireBarrowsConfig;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import gg.squire.barrows.tasks.BHelper;
import gg.squire.barrows.tasks.GameEnum20;

@Singleton
public class BarrowsManager {
    
    private final  SquireBarrowsConfig u;

    public int[] d(d d2) {
        switch (b.v[d2.ordinal()]) {
            case 1: {
                a var1;
                return var1.BarrowsManager(var1.u.ahrimSpecGear());
            }
            case 2: {
                a var1;
                return var1.BarrowsManager(var1.u.karilSpecGear());
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
                a var2;
                return var2.BarrowsManager(var2.u.ahrimGear());
            }
            case 2: {
                a var2;
                return var2.BarrowsManager(var2.u.karilGear());
            }
        }
        return this.BarrowsManager(this.u.mageGear());
    }

    @Inject
    public BarrowsManager(SquireBarrowsConfig squireBarrowsConfig) {
        this.u = squireBarrowsConfig;
    }

    static {
        a.lIllIIlIllIIIl();
    }

    public BankLoadout A() {
        return (BankLoadout)this.u.bankLoadout().selected(BankLoadout.class);
    }

    public int[] BarrowsManager(ConfigStorageBox<EquipmentSetup> configStorageBox) {
        int[] nArray;
        EquipmentSetup equipmentSetup = (EquipmentSetup)configStorageBox.selected(EquipmentSetup.class);
        if (a.lIllIIlIllIIlI(equipmentSetup)) {
            nArray = equipmentSetup.getIds();

            if ((0x25 ^ 0x20) <= 0) {
                return null;
            }
        } else {
            nArray = new int[llllIIIIIII[0]];
        }
        return nArray;
    }

    public int[] B() {
        return this.BarrowsManager(this.u.tunnelGear());
    }
}

