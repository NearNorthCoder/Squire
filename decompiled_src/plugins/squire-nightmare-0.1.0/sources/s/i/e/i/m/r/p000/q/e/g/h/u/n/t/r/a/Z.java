package s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.magic.Magic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@TaskDesc(name = "Setting fire spell", priority = Integer.MAX_VALUE, blocking = true)
/* renamed from: s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.Z  reason: invalid package */
/* loaded from: squire-nightmare-0.1.0.jar:s/i/e/i/m/r/-/q/e/g/h/u/n/t/r/a/Z.class */
public class Z extends C {
    private static final /* synthetic */ Logger dB;
    private static /* synthetic */ int[] lllIlllIIlIl;

    private static boolean lIIIllIlllIIIII(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean] */
    @Override // s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.C
    public boolean bY() {
        if (!lIIIllIlllIIIII(this.cK.useFireSpells() ? 1 : 0) && !lIIIllIlllIIIII(this.cM.av() ? 1 : 0)) {
            EquipmentSetup equipmentSetup = (EquipmentSetup) this.cK.totemGear().selected(EquipmentSetup.class);
            if (lIIIllIlllIIIII(equipmentSetup.isFullyEquipped() ? 1 : 0)) {
                equipmentSetup.swap();
                return lllIlllIIlIl[1];
            } else if (lIIIllIlllIIIII(Magic.isAutoCasting() ? 1 : 0)) {
                Magic.autoCast(this.cK.fireSpell().bF());
                "".length();
                this.cM.t(lllIlllIIlIl[0]);
                return lllIlllIIlIl[1];
            } else {
                return lllIlllIIlIl[0];
            }
        }
        return lllIlllIIlIl[0];
    }

    @Inject
    protected Z(C0013j c0013j, Client client, SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin) {
        super(c0013j, client, squireNightmareConfig, squireNightmarePlugin);
    }

    private static void lIIIllIllIlllll() {
        lllIlllIIlIl = new int[2];
        lllIlllIIlIl[0] = (196 ^ 132) & ((3 ^ 67) ^ (-1));
        lllIlllIIlIl[1] = " ".length();
    }

    static {
        lIIIllIllIlllll();
        dB = LoggerFactory.getLogger(Z.class);
    }
}
