/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.slayer.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.slayer.SquireSkipperConfig;
import gg.squire.slayer.SquireSkipperPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Dialog;
import gg.squire.slayer.tasks.GameEnum;

@TaskDesc(name="Attacking")
public class AttackingTask
extends Task {

    private final  SquireSkipperConfig s;
    private final  SquireSkipperPlugin r;

    @Inject
    public AttackingTask(SquireSkipperPlugin squireSkipperPlugin, SquireSkipperConfig squireSkipperConfig) {
        this.r = squireSkipperPlugin;
        this.s = squireSkipperConfig;
    }

    static {
        c.lIlllIlIlIIlIlI();
        c.lIlllIlIlIIlIIl();
    }

    private static boolean lIlllIlIlIIlllI(int n2) {
        return n2 == 0;
    }

        return String.valueOf(var1);
    }

    private static boolean lIlllIlIlIIllIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIlllIlIlIlIIIl(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        c var2;
        if (c.lIlllIlIlIIlIll(Players.getLocal().getInteracting())) {
            return lIlIIlIIllIII[0];
        }
        if (c.lIlllIlIlIIllII((Object)var2.r.b(), (Object)b.MINOTAURS)) {
            if (c.lIlllIlIlIIllIl(Dialog.isOpen() ? 1 : 0) && c.lIlllIlIlIIllIl(Dialog.getName().contains(lIlIIlIIlIlIl[lIlIIlIIllIII[0]]) ? 1 : 0) && c.lIlllIlIlIIllIl(Dialog.canContinue() ? 1 : 0)) {
                System.out.println(lIlIIlIIlIlIl[lIlIIlIIllIII[1]]);
                Dialog.continueSpace();
                return lIlIIlIIllIII[1];
            }
            if (c.lIlllIlIlIIllIl(Dialog.hasOption(string -> string.contains(lIlIIlIIlIlIl[lIlIIlIIllIII[20]])) ? 1 : 0)) {
                Dialog.chooseOption(string -> string.contains(lIlIIlIIlIlIl[lIlIIlIIllIII[19]]));

                return lIlIIlIIllIII[1];
            }
            if (c.lIlllIlIlIIllIl(Dialog.hasOption(string -> string.contains(lIlIIlIIlIlIl[lIlIIlIIllIII[18]])) ? 1 : 0)) {
                Dialog.chooseOption(string -> string.contains(lIlIIlIIlIlIl[lIlIIlIIllIII[17]]));

                return lIlIIlIIllIII[1];
            }
            if (c.lIlllIlIlIIllIl(Dialog.hasOption(string -> string.contains(lIlIIlIIlIlIl[lIlIIlIIllIII[5]])) ? 1 : 0)) {
                Dialog.chooseOption(string -> string.contains(lIlIIlIIlIlIl[lIlIIlIIllIII[16]]));

                return lIlIIlIIllIII[1];
            }
        }
        String[] stringArray = new String[lIlIIlIIllIII[1]];
        stringArray[c.lIlIIlIIllIII[0]] = lIlIIlIIlIlIl[lIlIIlIIllIII[2]];
        if (c.lIlllIlIlIIllIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            String[] stringArray2 = new String[lIlIIlIIllIII[1]];
            stringArray2[c.lIlIIlIIllIII[0]] = lIlIIlIIlIlIl[lIlIIlIIllIII[3]];
            Inventory.getFirst((String[])stringArray2).interact(lIlIIlIIlIlIl[lIlIIlIIllIII[4]]);
            return lIlIIlIIllIII[1];
        }
        if (c.lIlllIlIlIIllIl(var2.r.h() ? 1 : 0)) {
            return lIlIIlIIllIII[0];
        }
        if (c.lIlllIlIlIIlllI(Movement.shouldWalk() ? 1 : 0)) {
            return lIlIIlIIllIII[0];
        }
        b var3 = var2.r.b();
        if (c.lIlllIlIlIIllll((Object)var3)) {
            return lIlIIlIIllIII[0];
        }
        if (c.lIlllIlIlIlIIII(Movement.getRunEnergy(), lIlIIlIIllIII[5]) && c.lIlllIlIlIIlllI(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
            return lIlIIlIIllIII[1];
        }
        if (c.lIlllIlIlIIlllI(var3.l() ? 1 : 0)) {
            var3.p().forEach(n2 -> {
                block2: {
                    void var4;
                    block3: {
                        int[] nArray = new int[lIlIIlIIllIII[1]];
                        nArray[c.lIlIIlIIllIII[0]] = n2;
                        if (!c.lIlllIlIlIIllIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block2;
                        int[] nArray2 = new int[lIlIIlIIllIII[1]];
                        nArray2[c.lIlIIlIIllIII[0]] = n2;
                        Item item = Inventory.getFirst((int[])nArray2);
                        String[] stringArray = new String[lIlIIlIIllIII[1]];
                        stringArray[c.lIlIIlIIllIII[0]] = lIlIIlIIlIlIl[lIlIIlIIllIII[12]];
                        if (!c.lIlllIlIlIIlllI(item.hasAction(stringArray) ? 1 : 0)) break block3;
                        String[] stringArray2 = new String[lIlIIlIIllIII[1]];
                        stringArray2[c.lIlIIlIIllIII[0]] = lIlIIlIIlIlIl[lIlIIlIIllIII[13]];
                        if (!c.lIlllIlIlIIllIl(item.hasAction(stringArray2) ? 1 : 0)) break block2;
                    }
                    String[] stringArray = new String[lIlIIlIIllIII[2]];
                    stringArray[c.lIlIIlIIllIII[0]] = lIlIIlIIlIlIl[lIlIIlIIllIII[14]];
                    stringArray[c.lIlIIlIIllIII[1]] = lIlIIlIIlIlIl[lIlIIlIIllIII[15]];
                    var4.interact(stringArray);
                }
            });
            return lIlIIlIIllIII[1];
        }
        NPC var5 = Combat.getAttackableNPC(nPC -> {
            int n2;
            if (c.lIlllIlIlIIllIl(nPC.getName().toLowerCase().contains(var3.m().toLowerCase()) ? 1 : 0) && c.lIlllIlIlIIlllI(nPC.isDead() ? 1 : 0)) {
                n2 = lIlIIlIIllIII[1];

                if (3 == 0) {
                    return false;
                }
            } else {
                n2 = lIlIIlIIllIII[0];
            }
            return n2 != 0;
        });
        if (c.lIlllIlIlIIllll(var5) && c.lIlllIlIlIIllIl(var2.b(var3) ? 1 : 0)) {
            Log.info((String)lIlIIlIIlIlIl[lIlIIlIIllIII[6]]);
            return lIlIIlIIllIII[0];
        }
        if (c.lIlllIlIlIIllll(var5) && c.lIlllIlIlIIlllI(var2.b(var3) ? 1 : 0)) {
            Log.info((String)lIlIIlIIlIlIl[lIlIIlIIllIII[7]]);
            if (c.lIlllIlIlIIllIl(Movement.shouldWalk() ? 1 : 0)) {
                Movement.walkTo((WorldPoint)var3.n().getCenter());

            }
            return lIlIIlIIllIII[1];
        }
        Player var6 = Players.getLocal();
        if (!c.lIlllIlIlIlIIIl(var6.getWorldLocation().distanceTo(var3.n().getCenter()), lIlIIlIIllIII[8]) || c.lIlllIlIlIIlIll(var5) && c.lIlllIlIlIIlllI(Reachable.isInteractable((Locatable)var5) ? 1 : 0)) {
            Log.info((String)lIlIIlIIlIlIl[lIlIIlIIllIII[9]]);
            if (c.lIlllIlIlIIllIl(Movement.shouldWalk() ? 1 : 0)) {
                Movement.walkTo((WorldPoint)var3.n().getCenter());

            }
            return lIlIIlIIllIII[1];
        }
        var2.r.a(var2.r.g());

        Item var7 = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON);
        if (c.lIlllIlIlIIlIll(var7) && c.lIlllIlIlIlIIlI(var7.getId(), var2.r.i())) {
            System.out.println("Swapping to " + var2.r.i());
            int[] nArray = new int[lIlIIlIIllIII[1]];
            nArray[c.lIlIIlIIllIII[0]] = var2.r.i();
            Inventory.getFirst((int[])nArray).interact(lIlIIlIIlIlIl[lIlIIlIIllIII[10]]);
            var2.r.d(lIlIIlIIllIII[0]);
            return lIlIIlIIllIII[1];
        }
        if (c.lIlllIlIlIIllll(var5)) {
            return lIlIIlIIllIII[0];
        }
        var2_2.interact(lIlIIlIIlIlIl[lIlIIlIIllIII[11]]);
        return lIlIIlIIllIII[1];
    }

    private static boolean lIlllIlIlIlIIII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlllIlIlIIllll(Object object) {
        return object == null;
    }

    private static boolean lIlllIlIlIIlIll(Object object) {
        return object != null;
    }

    public boolean b(b b2) {
        return b2.n().contains((Locatable)Players.getLocal());
    }

    private static void lIlllIlIlIIlIIl() {
        lIlIIlIIlIlIl = new String[lIlIIlIIllIII[21]];
        c.lIlIIlIIlIlIl[c.lIlIIlIIllIII[0]] = "Gate of War";
        c.lIlIIlIIlIlIl[c.lIlIIlIIllIII[1]] = "Trying to continue on Gate of War dialog";
        c.lIlIIlIIlIlIl[c.lIlIIlIIllIII[2]] = "Waterskin(0)";
        c.lIlIIlIIlIlIl[c.lIlIIlIIllIII[3]] = "Waterskin(0)";
        c.lIlIIlIIlIlIl[c.lIlIIlIIllIII[4]] = "Drop";
        c.lIlIIlIIlIlIl[c.lIlIIlIIllIII[6]] = "Waiting for respawns";
        c.lIlIIlIIlIlIl[c.lIlIIlIIllIII[7]] = "Walking towards task location";
        c.lIlIIlIIlIlIl[c.lIlIIlIIllIII[9]] = "Walking to location";
        c.lIlIIlIIlIlIl[c.lIlIIlIIllIII[10]] = "Wield";
        c.lIlIIlIIlIlIl[c.lIlIIlIIllIII[11]] = "Attack";
        c.lIlIIlIIlIlIl[c.lIlIIlIIllIII[12]] = "Equip";
        c.lIlIIlIIlIlIl[c.lIlIIlIIllIII[13]] = "Wield";
        c.lIlIIlIIlIlIl[c.lIlIIlIIllIII[14]] = "Equip";
        c.lIlIIlIIlIlIl[c.lIlIIlIIllIII[15]] = "Wield";
        c.lIlIIlIIlIlIl[c.lIlIIlIIllIII[16]] = "decline";
        c.lIlIIlIIlIlIl[c.lIlIIlIIllIII[5]] = "decline";
        c.lIlIIlIIlIlIl[c.lIlIIlIIllIII[17]] = "no";
        c.lIlIIlIIlIlIl[c.lIlIIlIIllIII[18]] = "no";
        c.lIlIIlIIlIlIl[c.lIlIIlIIllIII[19]] = "report";
        c.lIlIIlIIlIlIl[c.lIlIIlIIllIII[20]] = "report";
    }

    private static boolean lIlllIlIlIIllII(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIlllIlIlIlIIlI(int n2, int n3) {
        return n2 != n3;
    }
}

