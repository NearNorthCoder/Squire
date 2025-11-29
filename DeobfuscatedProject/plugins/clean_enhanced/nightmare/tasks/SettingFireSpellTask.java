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
import gg.squire.nightmare.tasks.NightmareManager;
import gg.squire.nightmare.tasks.NightmareManager;

@TaskDesc(name="Setting fire spell", priority=0x7FFFFFFF, blocking=true)
public class SettingFireSpellTask
extends NightmareManager {
    private static final  Logger dB;

    private static boolean var2(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean bY() {
        Z var3;
        if (Z.var2(this.cK.useFireSpells() ? 1 : 0)) {
            return var1[0];
        }
        if (Z.var2(var3.cM.av() ? 1 : 0)) {
            return var1[0];
        }
        EquipmentSetup var4 = (EquipmentSetup)var3.cK.totemGear().selected(EquipmentSetup.class);
        if (Z.var2(var4.isFullyEquipped() ? 1 : 0)) {
            var4.swap();
            return var1[1];
        }
        if (Z.var2(Magic.isAutoCasting() ? 1 : 0)) {
            Magic.autoCast((Spevar3.cK.fireSpell().bF());
            0;
            var3.cM.t(var1[0]);
            return var1[1];
        }
        return var1[0];
    }

    @Inject
    protected SettingFireSpellTask(j j2, Client client, SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin) {
        super(j2, client, squireNightmareConfig, squireNightmarePlugin);
    }

    private static void var5() {
        var1 = new int[2];
        Z.var1[0] = (0xC4 ^ 0x84) & ~(3 ^ 0x43);
        Z.var1[1] = 1;
    }

    static {
        Z.var5();
        dB = LoggerFactory.getLogger(SettingFireSpellTask.class);
    }
}

