/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.input.KeyListener
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import gg.squire.basics.gearloadouts.GearLoadoutPlugin;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import net.runelite.client.input.KeyListener;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;

public class ay
implements KeyListener {
    final /* synthetic */ GearLoadoutPlugin dI;

    public void keyReleased(KeyEvent keyEvent) {
    }

    public ay(GearLoadoutPlugin gearLoadoutPlugin) {
        this.dI = gearLoadoutPlugin;
    }

    public void keyTyped(KeyEvent keyEvent) {
    }

    private static boolean llIIlllIlIl(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    public void keyPressed(KeyEvent keyEvent) {
        Iterator<EquipmentSetup> lIlIIllllllIIII = this.dI.dC.iterator();
        while (ay.llIIlllIlII(lIlIIllllllIIII.hasNext() ? 1 : 0)) {
            ay lIlIIllllllIIlI;
            void lIlIIllllllIIIl;
            EquipmentSetup lIlIIlllllIllll = lIlIIllllllIIII.next();
            if (!ay.llIIlllIlIl(lIlIIllllllIIIl.getKeyCode(), lIlIIlllllIllll.getHotkey())) continue;
            if (ay.llIIlllIllI(lIlIIlllllIllll.isActive() ? 1 : 0)) {
                "".length();
                if (-"  ".length() <= 0) continue;
                return;
            }
            ExecutorService executorService = lIlIIllllllIIlI.dI.dE;
            EquipmentSetup equipmentSetup = lIlIIlllllIllll;
            Objects.requireNonNull(equipmentSetup);
            "".length();
            executorService.submit(() -> ((EquipmentSetup)equipmentSetup).swap());
            "".length();
            "".length();
            if ("  ".length() != ((0xCF ^ 0x94) & ~(0x11 ^ 0x4A))) continue;
            return;
        }
    }

    private static boolean llIIlllIllI(int n2) {
        return n2 == 0;
    }

    private static boolean llIIlllIlII(int n2) {
        return n2 != 0;
    }
}

