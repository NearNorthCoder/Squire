/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Gear
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.movement.pathfinder.TeleportLoader
 */
package gg.squire.corp.tasks;

import gg.squire.corp.tasks.CorpTaskBase;
import gg.squire.corp.tasks.SHelper;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.corp.SquireCorp;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Gear;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.TeleportLoader;

@TaskDesc(name="Specing Corp")
public class SpecingCorpTask
extends CorpTaskBase {
    @Inject
    private  s a;
    
    @Inject
    private  SquireCorp p;

    private static boolean lllIIIlIIIIIlI(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lllIIIlIIIIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllIIIIlllllII(int n2) {
        return n2 == 0;
    }

    private static boolean lllIIIIlllllll(Object object) {
        return object == null;
    }

    private static boolean lllIIIlIIIIIII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lllIIIIlllllIl(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        r var1;
        if (r.lllIIIIlllllII(this.g() ? 1 : 0)) {
            return lIlIlllIlllI[0];
        }
        NPC var2 = var1.f();
        if (!r.lllIIIIlllllIl(var2) || !r.lllIIIIllllllI(Reachable.isInteractable((Locatable)var2) ? 1 : 0) || r.lllIIIIllllllI(var2.isDead() ? 1 : 0)) {
            return lIlIlllIlllI[0];
        }
        Player var3 = Players.getNearest(player -> {
            int n2;
            if (r.lllIIIlIIIIIlI(player, Players.getLocal()) && r.lllIIIlIIIIIll(player.getInteracting(), var2) && r.lllIIIIlllllII(player.isFriend() ? 1 : 0)) {
                n2 = lIlIlllIlllI[1];

                if (1 != 1) {
                    return ((0xB3 ^ 0x9D ^ (0x5A ^ 0x66)) & (0x4A ^ 3 ^ (0x27 ^ 0x7C) ^ -1)) != 0;
                }
            } else {
                n2 = lIlIlllIlllI[0];
            }
            return n2 != 0;
        });
        if (r.lllIIIIlllllIl(var3)) {
            var1.p.c(lIlIlllIlllI[1]);
            return lIlIlllIlllI[0];
        }
        EquipmentSetup var4 = var1.a.t();
        if (r.lllIIIIlllllll(var4)) {
            return lIlIlllIlllI[0];
        }
        if (!r.lllIIIlIIIIIII(Combat.getSpecEnergy(), lIlIlllIlllI[2]) || r.lllIIIlIIIIIIl(Combat.getCurrentHealth(), lIlIlllIlllI[3])) {
            TeleportLoader.enterHouse();

            return lIlIlllIlllI[0];
        }
        if (r.lllIIIIlllllII(Gear.isEquipped((int[])var4.getIds()) ? 1 : 0)) {
            Gear.swapTo((EquipmentSetup)var4);

            return lIlIlllIlllI[1];
        }
        if (r.lllIIIIlllllII(Combat.isSpecEnabled() ? 1 : 0)) {
            Combat.toggleSpec();
        }
        var1_1.interact(lIlIlllIllIl[lIlIlllIlllI[0]]);
        this.p.b(lIlIlllIlllI[1]);
        return lIlIlllIlllI[1];
    }

    private static void lllIIIIllllIlI() {
        lIlIlllIllIl = new String[lIlIlllIlllI[1]];
        r.lIlIlllIllIl[r.lIlIlllIlllI[0]] = "Attack";
    }

    static {
        r.lllIIIIllllIll();
        r.lllIIIIllllIlI();
    }

        return String.valueOf(var5);
    }

    private static boolean lllIIIIllllllI(int n2) {
        return n2 != 0;
    }

    private static boolean lllIIIlIIIIIll(Object object, Object object2) {
        return object == object2;
    }
}

