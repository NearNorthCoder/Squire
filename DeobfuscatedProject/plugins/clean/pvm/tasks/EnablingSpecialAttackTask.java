/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Equipment
 */
package gg.squire.pvm.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.pvm.SquireShamanConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;
import gg.squire.pvm.tasks.CHelper;

@TaskDesc(name="Enabling special attack", priority=10)
public class EnablingSpecialAttackTask
extends Task {

    private final  SquireShamanConfig al;
    private final  c ak;

    private static boolean lIlIllllIIlllIl(Object object) {
        return object == null;
    }

    private static boolean lIlIllllIIlllll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIllllIlIIIII(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIlIllllIIllIIl() {
        lIIllIIIllIII = new String[lIIllIIIllIIl[5]];
        s.lIIllIIIllIII[s.lIIllIIIllIIl[0]] = "blowpipe";
        s.lIIllIIIllIII[s.lIIllIIIllIIl[3]] = "magic shortbow";
    }

    static {
        s.lIlIllllIIllIlI();
        s.lIlIllllIIllIIl();
    }

    public boolean run() {
        Player player = Players.getLocal();
        if (s.lIlIllllIIllIll(this.al.room().x().contains((Locatable)player) ? 1 : 0)) {
            return lIIllIIIllIIl[0];
        }
        if (s.lIlIllllIIlllII(Combat.isSpecEnabled() ? 1 : 0)) {
            return lIIllIIIllIIl[0];
        }
        Item var1 = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON);
        if (s.lIlIllllIIlllIl(var1)) {
            return lIIllIIIllIIl[0];
        }
        String var2 = var1.getName().toLowerCase();
        if (s.lIlIllllIIlllII(var2.contains(lIIllIIIllIII[lIIllIIIllIIl[0]]) ? 1 : 0) && s.lIlIllllIIllllI(Combat.getSpecEnergy(), lIIllIIIllIIl[1]) && s.lIlIllllIIlllll(Combat.getMissingHealth(), lIIllIIIllIIl[2])) {
            Combat.toggleSpec();
            return lIIllIIIllIIl[3];
        }
        if (s.lIlIllllIIlllII(var2.contains(lIIllIIIllIII[lIIllIIIllIIl[3]]) ? 1 : 0) && s.lIlIllllIIllllI(Combat.getSpecEnergy(), lIIllIIIllIIl[4])) {
            Combat.toggleSpec();
            return lIIllIIIllIIl[3];
        }
        return lIIllIIIllIIl[0];
    }

        return String.valueOf(var3);
    }

    private static boolean lIlIllllIIllllI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIllllIIlllII(int n2) {
        return n2 != 0;
    }

    @Inject
    public EnablingSpecialAttackTask(c c2, SquireShamanConfig squireShamanConfig) {
        this.ak = c2;
        this.al = squireShamanConfig;
    }

    private static boolean lIlIllllIIllIll(int n2) {
        return n2 == 0;
    }
}

