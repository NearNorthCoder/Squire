/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Gear
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.movement.pathfinder.TeleportLoader
 */
package gg.squire.corp.tasks;

import gg.squire.corp.tasks.CorpTaskBase;
import gg.squire.corp.tasks.SHelper;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.corp.SquireCorp;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Gear;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.TeleportLoader;

@TaskDesc(name="Attacking corporeal beast")
@Singleton
public class AttackingCorporealBeastTask
extends CorpTaskBase {
    
    @Inject
    private  SquireCorp p;
    @Inject
    private  s a;

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        h var1;
        if (h.lllIIIlIllIIII(this.a.u(), lIlIlllllIlI[0])) {
            return lIlIlllllIlI[1];
        }
        NPC var2 = var1.f();
        if (!h.lllIIIlIllIIIl(var2) || !h.lllIIIlIllIIlI(Reachable.isInteractable((Locatable)var2) ? 1 : 0) || h.lllIIIlIllIIlI(var2.isDead() ? 1 : 0)) {
            return lIlIlllllIlI[1];
        }
        Player var3 = Players.getNearest(player -> {
            int n2;
            if (h.lllIIIlIlllIII(player, Players.getLocal()) && h.lllIIIlIllIllI(player.getInteracting(), var2) && h.lllIIIlIllIlIl(player.isFriend() ? 1 : 0)) {
                n2 = lIlIlllllIlI[2];

                if (1 >= 2) {
                    return ((0xC5 ^ 0xAC ^ (0x25 ^ 0x48)) & (0x12 ^ 0x75 ^ (0x10 ^ 0x73) ^ -1)) != 0;
                }
            } else {
                n2 = lIlIlllllIlI[1];
            }
            return n2 != 0;
        });
        if (h.lllIIIlIllIIIl(var3)) {
            var1.p.c(lIlIlllllIlI[2]);
            return lIlIlllllIlI[1];
        }
        if (h.lllIIIlIllIIll(Combat.getCurrentHealth(), lIlIlllllIlI[3])) {
            TeleportLoader.enterHouse();

            return lIlIlllllIlI[1];
        }
        if (h.lllIIIlIllIlII(Combat.getSpecEnergy(), lIlIlllllIlI[4]) && h.lllIIIlIllIIlI(var1.a(var2) ? 1 : 0)) {
            String[] stringArray = new String[lIlIlllllIlI[2]];
            stringArray[h.lIlIlllllIlI[1]] = lIlIlllllIIl[lIlIlllllIlI[1]];
            Item var4 = Inventory.getFirst((String[])stringArray);
            if (h.lllIIIlIllIIIl(var4)) {
                var4.interact(lIlIlllllIIl[lIlIlllllIlI[2]]);
            }
            if (h.lllIIIlIllIlIl(Combat.isSpecEnabled() ? 1 : 0)) {
                Combat.toggleSpec();
            }

            if (3 >= (157 + 48 - 44 + 6 ^ 15 + 110 - 120 + 158)) {
                return false;
            }
        } else if (h.lllIIIlIllIlII(Combat.getSpecEnergy(), lIlIlllllIlI[5]) && h.lllIIIlIllIlIl(var1.a(var2) ? 1 : 0)) {
            int[] nArray = new int[lIlIlllllIlI[2]];
            nArray[h.lIlIlllllIlI[1]] = lIlIlllllIlI[6];
            Item var4 = Inventory.getFirst((int[])nArray);
            if (h.lllIIIlIllIIIl(var4)) {
                var4.interact(lIlIlllllIIl[lIlIlllllIlI[7]]);
            }
            if (h.lllIIIlIllIlIl(Combat.isSpecEnabled() ? 1 : 0)) {
                Combat.toggleSpec();
            }

            if (1 != 1) {
                return false;
            }
        } else {
            EquipmentSetup var4 = (EquipmentSetup)var1.o.fightLoadout().selected(EquipmentSetup.class);
            if (h.lllIIIlIllIlIl(Gear.isEquipped((int[])var4.getIds()) ? 1 : 0)) {
                Gear.swapTo((EquipmentSetup)var4);

            }
        }
        if (h.lllIIIlIllIllI(Players.getLocal().getInteracting(), var2)) {
            return lIlIlllllIlI[1];
        }
        var1_1.interact(lIlIlllllIIl[lIlIlllllIlI[8]]);
        return lIlIlllllIlI[2];
    }

    private static boolean lllIIIlIllIllI(Object object, Object object2) {
        return object == object2;
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(NPC nPC) {
        int n2;
        void var5;
        String[] stringArray = new String[lIlIlllllIlI[2]];
        stringArray[h.lIlIlllllIlI[1]] = lIlIlllllIIl[lIlIlllllIlI[9]];
        if (h.lllIIIlIllIlIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            String[] stringArray2 = new String[lIlIlllllIlI[2]];
            stringArray2[h.lIlIlllllIlI[1]] = lIlIlllllIIl[lIlIlllllIlI[10]];
            if (h.lllIIIlIllIlIl(Equipment.contains((String[])stringArray2) ? 1 : 0)) {
                return lIlIlllllIlI[1];
            }
        }
        if (h.lllIIIlIllIIll(var5.getHealthRatio(), lIlIlllllIlI[11]) && h.lllIIIlIllIlll(var5.getHealthRatio(), lIlIlllllIlI[2])) {
            n2 = lIlIlllllIlI[2];

            if (((4 ^ 0x1A ^ (0xD ^ 0x5A)) & (0xA8 ^ 0xB0 ^ (0xC2 ^ 0x93) ^ -1)) != 0) {
                return ((0xF ^ 0x44 ^ (8 ^ 2)) & (0x59 ^ 0x6B ^ (0xFE ^ 0x8D) ^ -1)) != 0;
            }
        } else {
            n2 = lIlIlllllIlI[1];
        }
        return n2 != 0;
    }

    private static boolean lllIIIlIllIIlI(int n2) {
        return n2 != 0;
    }

    private static boolean lllIIIlIlllIII(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lllIIIlIllIlII(int n2, int n3) {
        return n2 >= n3;
    }

        return String.valueOf(var6);
    }

    private static boolean lllIIIlIllIlIl(int n2) {
        return n2 == 0;
    }

    private static boolean lllIIIlIllIlll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lllIIIlIllIIII(int n2, int n3) {
        return n2 != n3;
    }

    private static void lllIIIlIlIlllI() {
        lIlIlllllIIl = new String[lIlIlllllIlI[12]];
        h.lIlIlllllIIl[h.lIlIlllllIlI[1]] = "Crystal halberd";
        h.lIlIlllllIIl[h.lIlIlllllIlI[2]] = "Wield";
        h.lIlIlllllIIl[h.lIlIlllllIlI[7]] = "Wield";
        h.lIlIlllllIIl[h.lIlIlllllIlI[8]] = "Attack";
        h.lIlIlllllIIl[h.lIlIlllllIlI[9]] = "Crystal halberd";
        h.lIlIlllllIIl[h.lIlIlllllIlI[10]] = "Crystal halberd";
    }

    private static boolean lllIIIlIllIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllIIIlIllIIIl(Object object) {
        return object != null;
    }

    static {
        h.lllIIIlIlIllll();
        h.lllIIIlIlIlllI();
    }
}

