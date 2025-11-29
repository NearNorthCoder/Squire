/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.input.KeyListener
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 */
package gg.squire.construction.tasks;

import gg.squire.basics.gearloadouts.GearLoadoutPlugin;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import net.runelite.client.input.KeyListener;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;

public class ay
implements KeyListener {
    final  GearLoadoutPlugin dI;

    public void keyReleased(KeyEvent keyEvent) {
    }

    public ay(GearLoadoutPlugin gearLoadoutPlugin) {
        this.dI = gearLoadoutPlugin;
    }

    public void keyTyped(KeyEvent keyEvent) {
    }

    /*
     * WARNING - void declaration
     */
    public void keyPressed(KeyEvent keyEvent) {
        Iterator<EquipmentSetup> var1 = this.dI.dC.iterator();
        while ((var1.hasNext( != 0) ? 1 : 0)) {
            ay var2;
            void var3;
            EquipmentSetup var4 = var1.next();
            if (!(var3.getKeyCode() == var4.getHotkey())) continue;
            if ((var4.isActive( == 0) ? 1 : 0)) {
                0;
                if (-2 <= 0) continue;
                return;
            }
            ExecutorService executorService = var2.dI.dE;
            EquipmentSetup equipmentSetup = var4;
            Objects.requireNonNull(equipmentSetup);
            0;
            executorService.submit(() -> ((EquipmentSetup)equipmentSetup).swap());
            0;
            0;
            if (2 != ((0xCF ^ 0x94) & ~(0x11 ^ 0x4A))) continue;
            return;
        }
    }

}

