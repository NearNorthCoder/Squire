/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Skill
 *  net.runelite.api.TileItem
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Reachable
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.GameEnum38;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.TileItem;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;

@TaskDesc(name="Pickup Dropped Brew", priority=30000, blocking=true)
public class PickupDroppedBrewTask
extends Task {
    
    private final  SquireChambersConfig cK;
    
    private final  SquireChambersPlugin cJ;

    private static boolean llIlllllIlIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIlllllIlIlIl(int n2, int n3) {
        return n2 == n3;
    }

    static {
        ag.llIlllllIIlllI();
        ag.llIlllllIIllIl();
    }

    private static boolean llIlllllIIllll(int n2) {
        return n2 == 0;
    }

    private static boolean llIlllllIlIIll(int n2) {
        return n2 > 0;
    }

    private static boolean llIlllllIlIIlI(int n2) {
        return n2 != 0;
    }

    protected int cp() {
        return Inventory.getCount(item -> item.getName().startsWith(lIlIlIlllIlI[lIlIlIlllIll[8]]));
    }

    protected int cq() {
        return Inventory.getCount(item -> item.getName().startsWith(lIlIlIlllIlI[lIlIlIlllIll[7]]));
    }

    @Inject
    public PickupDroppedBrewTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig) {
        this.cJ = squireChambersPlugin;
        this.cK = squireChambersConfig;
    }

    private static boolean llIlllllIlIlII(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_4;
        int lllllllllllllllIllIIllIlIllllllI22;
        NPC var1;
        ag var2;
        if (ag.llIlllllIIllll(this.cK.pickupBrews() ? 1 : 0)) {
            return lIlIlIlllIll[0];
        }
        if (ag.llIlllllIIllll(var2.cJ.E() ? 1 : 0)) {
            return lIlIlIlllIll[0];
        }
        if (ag.llIlllllIlIIII((Object)var2.cJ.L().aM(), (Object)N.SCAVENGERS)) {
            return lIlIlIlllIll[0];
        }
        if (ag.llIlllllIlIIII((Object)var2.cJ.L().aM(), (Object)N.TIGHTROPE)) {
            String[] stringArray = new String[lIlIlIlllIll[1]];
            stringArray[ag.lIlIlIlllIll[0]] = lIlIlIlllIlI[lIlIlIlllIll[0]];
            if (ag.llIlllllIIllll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                return lIlIlIlllIll[0];
            }
        }
        if (ag.llIlllllIlIIIl(var1 = NPCs.getNearest(nPC -> {
            int n2;
            String[] stringArray = new String[lIlIlIlllIll[1]];
            stringArray[ag.lIlIlIlllIll[0]] = lIlIlIlllIlI[lIlIlIlllIll[4]];
            if (ag.llIlllllIlIIlI(nPC.hasAction(stringArray) ? 1 : 0) && ag.llIlllllIlIIlI(this.cJ.L().a((Locatable)nPC) ? 1 : 0)) {
                n2 = lIlIlIlllIll[1];

                if (-(30 + 108 - 94 + 107 ^ 17 + 100 - 107 + 136) >= 0) {
                    return ((41 + 102 - -17 + 38 ^ 108 + 118 - 65 + 33) & (0x12 ^ 0x37 ^ (0x41 ^ 0x60) ^ -1)) != 0;
                }
            } else {
                n2 = lIlIlIlllIll[0];
            }
            return n2 != 0;
        }))) {
            return lIlIlIlllIll[0];
        }
        if (ag.llIlllllIlIIlI(Inventory.isFull() ? 1 : 0)) {
            return lIlIlIlllIll[0];
        }
        if (ag.llIlllllIlIIII((Object)var2.cJ.L().aM(), (Object)N.ICE_DEMON) && ag.llIlllllIlIIll(lllllllllllllllIllIIllIlIllllllI22 = lIlIlIlllIll[2] - var2.cJ.K() + (lIlIlIlllIll[3] - Skills.getLevel((Skill)Skill.WOODCUTTING)) / lIlIlIlllIll[4])) {
            return lIlIlIlllIll[0];
        }
        if (ag.llIlllllIlIIII((Object)var2.cJ.L().aM(), (Object)N.THIEVING) && ag.llIlllllIlIIll(lllllllllllllllIllIIllIlIllllllI22 = lIlIlIlllIll[5] - var2.cJ.J() + (lIlIlIlllIll[3] - Skills.getLevel((Skill)Skill.THIEVING)) / lIlIlIlllIll[6])) {
            return lIlIlIlllIll[0];
        }
        TileItem lllllllllllllllIllIIllIlIllllllI22 = TileItems.getNearest(tileItem -> {
            int n2;
            if (ag.llIlllllIlIlIl(tileItem.getId(), lIlIlIlllIll[10]) && ag.llIlllllIlIIlI(Reachable.isWalkable((WorldPoint)tileItem.getWorldLocation()) ? 1 : 0)) {
                n2 = lIlIlIlllIll[1];

                if (((0xF5 ^ 0xAF) & ~(0x49 ^ 0x13)) > (0xE ^ 0xA)) {
                    return false;
                }
            } else {
                n2 = lIlIlIlllIll[0];
            }
            return n2 != 0;
        });
        if (ag.llIlllllIlIIIl(lllllllllllllllIllIIllIlIllllllI22)) {
            return lIlIlIlllIll[0];
        }
        TileItem var3 = TileItems.getNearest(tileItem -> {
            int n2;
            if (ag.llIlllllIlIIlI(tileItem.getName().toLowerCase().contains(lIlIlIlllIlI[lIlIlIlllIll[9]]) ? 1 : 0) && ag.llIlllllIlIIlI(this.cJ.L().a((Locatable)tileItem) ? 1 : 0) && ag.llIlllllIlIIlI(Reachable.isWalkable((WorldPoint)tileItem.getWorldLocation()) ? 1 : 0)) {
                n2 = lIlIlIlllIll[1];

                if (1 <= 0) {
                    return false;
                }
            } else {
                n2 = lIlIlIlllIll[0];
            }
            return n2 != 0;
        });
        if (ag.llIlllllIlIlII(var3)) {
            return lIlIlIlllIll[0];
        }
        var3_4.interact(lIlIlIlllIlI[lIlIlIlllIll[1]]);
        return lIlIlIlllIll[1];
    }

    private static boolean llIlllllIlIIIl(Object object) {
        return object != null;
    }

    private static void llIlllllIIllIl() {
        lIlIlIlllIlI = new String[lIlIlIlllIll[11]];
        ag.lIlIlIlllIlI[ag.lIlIlIlllIll[0]] = "Keystone crystal";
        ag.lIlIlIlllIlI[ag.lIlIlIlllIll[1]] = "Take";
        ag.lIlIlIlllIlI[ag.lIlIlIlllIll[7]] = "Revitalisation";
        ag.lIlIlIlllIlI[ag.lIlIlIlllIll[8]] = "Xeric's aid";
        ag.lIlIlIlllIlI[ag.lIlIlIlllIll[9]] = "saradomin brew";
        ag.lIlIlIlllIlI[ag.lIlIlIlllIll[4]] = "Attack";
    }

        return String.valueOf(var4);
    }

    private static boolean llIlllllIlIIII(Object object, Object object2) {
        return object == object2;
    }
}

