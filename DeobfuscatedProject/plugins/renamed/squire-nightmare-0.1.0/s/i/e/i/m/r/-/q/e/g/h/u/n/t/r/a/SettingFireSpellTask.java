/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.C_Unknown;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.j_Unknown;

/* TASK: Setting fire spell -> SettingfirespellTask */
@TaskDesc(name="Setting fire spell", priority=0x7FFFFFFF, blocking=true)
public class SettingFireSpellTask
extends C_Unknown {
    private static final /* synthetic */ Logger dB;
    private static /* synthetic */ int[] lllIlllIIlIl;

    private static boolean lIIIllIlllIIIII(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean bY() {
        Z var2;
        if (Z.lIIIllIlllIIIII(this.cK.useFireSpells() ? 1 : 0)) {
            return lllIlllIIlIl[0];
        }
        if (Z.lIIIllIlllIIIII(var2.cM.av() ? 1 : 0)) {
            return lllIlllIIlIl[0];
        }
        EquipmentSetup var1 = (EquipmentSetup)var2.cK.totemGear().selected(EquipmentSetup.class);
        if (Z.lIIIllIlllIIIII(var1.isFullyEquipped() ? 1 : 0)) {
            var1.swap();
            return lllIlllIIlIl[1];
        }
        if (Z.lIIIllIlllIIIII(Magic.isAutoCasting() ? 1 : 0)) {
            Magic.autoCast((Spell)var2.cK.fireSpell().bF());
            0;
            var2.cM.t(lllIlllIIlIl[0]);
            return lllIlllIIlIl[1];
        }
        return lllIlllIIlIl[0];
    }

    @Inject
    protected Z(j j2, Client client, SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin) {
        super(j2, client, squireNightmareConfig, squireNightmarePlugin);
    }

    private static void lIIIllIllIlllll() {
        lllIlllIIlIl = new int[2];
        Z.lllIlllIIlIl[0] = (0xC4 ^ 0x84) & ~(3 ^ 0x43);
        Z.lllIlllIIlIl[1] = 1;
    }

    static {
        Z.lIIIllIllIlllll();
        dB = LoggerFactory.getLogger(Z.class);
    }
}

