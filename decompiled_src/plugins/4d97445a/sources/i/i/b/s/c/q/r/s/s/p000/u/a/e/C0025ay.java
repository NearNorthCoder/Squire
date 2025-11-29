package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import gg.squire.basics.gearloadouts.GearLoadoutPlugin;
import java.awt.event.KeyEvent;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import net.runelite.client.input.KeyListener;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.ay  reason: invalid package and case insensitive filesystem */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/ay.class */
public class C0025ay implements KeyListener {
    final /* synthetic */ GearLoadoutPlugin dI;

    public void keyReleased(KeyEvent keyEvent) {
    }

    public C0025ay(GearLoadoutPlugin gearLoadoutPlugin) {
        this.dI = gearLoadoutPlugin;
    }

    public void keyTyped(KeyEvent keyEvent) {
    }

    private static boolean llIIlllIlIl(int i2, int i3) {
        return i2 == i3;
    }

    public void keyPressed(KeyEvent keyEvent) {
        for (EquipmentSetup equipmentSetup : this.dI.dC) {
            if (llIIlllIlIl(keyEvent.getKeyCode(), equipmentSetup.getHotkey())) {
                if (llIIlllIllI(equipmentSetup.isActive() ? 1 : 0)) {
                    "".length();
                    if ((-"  ".length()) > 0) {
                        return;
                    }
                } else {
                    ExecutorService executorService = this.dI.dE;
                    Objects.requireNonNull(equipmentSetup);
                    "".length();
                    executorService.submit(this::swap);
                    "".length();
                    "".length();
                    if ("  ".length() == ((207 ^ 148) & ((17 ^ 74) ^ (-1)))) {
                        return;
                    }
                }
            }
        }
    }

    private static boolean llIIlllIllI(int i2) {
        return i2 == 0;
    }

    private static boolean llIIlllIlII(int i2) {
        return i2 != 0;
    }
}
