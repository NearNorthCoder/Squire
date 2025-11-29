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
package gg.squire.nightmare.tasks;

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
import gg.squire.nightmare.tasks.NightmareTaskBase;
import gg.squire.nightmare.tasks.NightmareManager;

@TaskDesc(name="Setting fire spell", priority=0x7FFFFFFF, blocking=true)
public class SettingFireSpellTask
extends NightmareTaskBase {
    private static final  Logger dB;

    private static boolean lIIIllIlllIIIII(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean bY() {
        Z var1;
        if (Z.lIIIllIlllIIIII(this.cK.useFireSpells() ? 1 : 0)) {
            return lllIlllIIlIl[0];
        }
        if (Z.lIIIllIlllIIIII(var1.cM.av() ? 1 : 0)) {
            return lllIlllIIlIl[0];
        }
        EquipmentSetup var2 = (EquipmentSetup)var1.cK.totemGear().selected(EquipmentSetup.class);
        if (Z.lIIIllIlllIIIII(var2.isFullyEquipped() ? 1 : 0)) {
            var2.swap();
            return lllIlllIIlIl[1];
        }
        if (Z.lIIIllIlllIIIII(Magic.isAutoCasting() ? 1 : 0)) {
            Magic.autoCast((Spell)var1.cK.fireSpell().bF());

            var1.cM.t(lllIlllIIlIl[0]);
            return lllIlllIIlIl[1];
        }
        return lllIlllIIlIl[0];
    }

    @Inject
    protected SettingFireSpellTask(j j2, Client client, SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin) {
        super(j2, client, squireNightmareConfig, squireNightmarePlugin);
    }

    static {
        Z.lIIIllIllIlllll();
        dB = LoggerFactory.getLogger(SettingFireSpellTask.class);
    }
}

