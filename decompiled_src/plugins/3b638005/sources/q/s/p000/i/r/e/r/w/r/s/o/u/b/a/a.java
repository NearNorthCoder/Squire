package q.s.p000.i.r.e.r.w.r.s.o.u.b.a;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.barrows.SquireBarrowsConfig;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
@Singleton
/* renamed from: q.s.-.i.r.e.r.w.r.s.o.u.b.a.a  reason: invalid package */
/* loaded from: 3b638005-922a-492f-9405-93e6a5194477.jar:q/s/-/i/r/e/r/w/r/s/o/u/b/a/a.class */
public class a {
    private static /* synthetic */ int[] llllIIIIIII;
    private final /* synthetic */ SquireBarrowsConfig u;

    public int[] d(d dVar) {
        switch (b.v[dVar.ordinal()]) {
            case 1:
                return a(this.u.ahrimSpecGear());
            case 2:
                return a(this.u.karilSpecGear());
            default:
                return new int[llllIIIIIII[0]];
        }
    }

    private static boolean lIllIIlIllIIlI(Object obj) {
        return obj != null;
    }

    public int[] c(d dVar) {
        switch (b.v[dVar.ordinal()]) {
            case 1:
                return a(this.u.ahrimGear());
            case 2:
                return a(this.u.karilGear());
            default:
                return a(this.u.mageGear());
        }
    }

    @Inject
    public a(SquireBarrowsConfig squireBarrowsConfig) {
        this.u = squireBarrowsConfig;
    }

    private static void lIllIIlIllIIIl() {
        llllIIIIIII = new int[1];
        llllIIIIIII[0] = ((4 ^ 102) ^ (114 ^ 25)) & (((179 ^ 181) ^ (115 ^ 124)) ^ (-" ".length()));
    }

    static {
        lIllIIlIllIIIl();
    }

    public BankLoadout A() {
        return (BankLoadout) this.u.bankLoadout().selected(BankLoadout.class);
    }

    public int[] a(ConfigStorageBox<EquipmentSetup> configStorageBox) {
        EquipmentSetup equipmentSetup = (EquipmentSetup) configStorageBox.selected(EquipmentSetup.class);
        if (lIllIIlIllIIlI(equipmentSetup)) {
            int[] ids = equipmentSetup.getIds();
            "".length();
            if ((37 ^ 32) <= 0) {
                return null;
            }
            return ids;
        }
        return new int[llllIIIIIII[0]];
    }

    public int[] B() {
        return a(this.u.tunnelGear());
    }
}
