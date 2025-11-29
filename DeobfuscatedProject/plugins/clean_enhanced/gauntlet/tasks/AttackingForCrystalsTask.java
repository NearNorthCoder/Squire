/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Predicates
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.client.Static
 */
package gg.squire.gauntlet.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Predicate;
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.GameEnum4;
import gg.squire.gauntlet.tasks.EHelper;
import gg.squire.gauntlet.tasks.GameEnum5;
import gg.squire.gauntlet.tasks.GameEnum3;
import gg.squire.gauntlet.tasks.HHelper;
import gg.squire.gauntlet.tasks.GameEnum;
import gg.squire.gauntlet.tasks.LHelper;
import gg.squire.gauntlet.tasks.GauntletTaskBase;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Predicates;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;

@TaskDesc(name="Attacking for Crystals", priority=2, blocking=true)
public class AttackingForCrystalsTask
extends GauntletTaskBase {
    
    private  int cc;
    private final  b cb;

    @Inject
    public AttackingForCrystalsTask(c c2, b b2) {
        d[] dArray = new d[0];
        dArray[1] = d.FIRST_ROTATION_EXPLORE;
        dArray[2] = d.DEMI_BOSS_EXPLORE;
        dArray[3] = d.EXTRA_FOOD_EXPLORE;
        super(c2, dArray);
        this.cc = 1;
        this.cb = b2;
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean be() {
        WorldPoint var9;
        int n2;
        int var10;
        int n3;
        void var11;
        R var12;
        Player player = Players.getLocal();
        if player == null {
            return 1;
        }
        int var13 = Static.getClient().getTickCount();
        if (!(var12.ba.A( != 0) ? 1 : 0) || (var12.ba.S( == 0) ? 1 : 0)) {
            return 1;
        }
        if ((Object != nulllllllllllllllllIlIIlIllIIllIIllI.ba.J()) && (var11.getInteracting( != null))) {
            return 1;
        }
        if ((var12.cc > 0) && (var13 - var12.cc < 4)) {
            return 1;
        }
        if ((var11.getInteracting( != null)) && ((Object)var12.ba.W() != (Object)var12.ba.W()2)d.FIRST_ROTATION_EXPLORE)) {
            var12.cc = var13;
            return 2;
        }
        Map<i, Integer> var14 = var12.ba.E();
        if ((var14.containsKey((Object == 0)i.CRYSTAL_SHARD) ? 1 : 0)) {
            return 1;
        }
        int var15 = var14.get((Object)i.CRYSTAL_SHARD);
        if (var15 < 0) {
            return 1;
        }
        int var16 = i.CRYSTAL_SHARD.aC();
        l var17 = var12.ba.T();
        if (((Object)var12.ba.W() == (Object)var12.ba.W()2)d.DEMI_BOSS_EXPLORE)) {
            n3 = 2;
            0;
            if null != null {
                return ((0xF ^ 0x29) & ~(0x23 ^ 5)) != 0;
            }
        } else {
            n3 = 1;
        }
        if (!(var10 = n3 == 0) || ((Object)var12.ba.W() == (Object)var12.ba.W()2)d.EXTRA_FOOD_EXPLORE)) {
            n2 = 2;
            0;
            if (-1 > (0xE ^ 0xA)) {
                return ((0xF3 ^ 0x90) & ~(0x68 ^ 0xB)) != 0;
            }
        } else {
            n2 = 1;
        }
        int var18 = n2;
        NPC var19 = null;
        if var10 {
            if ((var12.ba.E( != 0).entrySet().stream().anyMatch(entry -> {
                int n2;
                if (((Integer > 0)entry.getValue()) && (entry.getKey() != entry.getKey()2)i.CRYSTAL_SHARD)) {
                    n2 = 2;
                    0;
                    if null != null {
                        return ((0x5D ^ 0xF) & ~(0x95 ^ 0xC7)) != 0;
                    }
                } else {
                    n2 = 1;
                }
                return n2 != 0;
            }) ? 1 : 0)) {
                if (!(var15 >= 5)) return 1;
                var9 = NPCs.getNearest((Predicate)Predicates.ids((int[])e.as[2]));
                if (!var9 != null || (var9.distanceTo((Locatable)var11) > 6)) {
                    return 1;
                }
                if ((Players.getLocal( == 0).isMoving() ? 1 : 0)) {
                    return 1;
                }
                var19 = var9;
                0;
                if (1 != 1) {
                    return ((86 + 64 - -9 + 78 ^ 71 + 136 - 68 + 3) & (28 + 150 - 134 + 119 ^ 124 + 171 - 174 + 71 ^ -1)) != 0;
                }
            }
        } else if ((var12.ba.B( == 0) ? 1 : 0) && (var16 > 7)) {
            return 1;
        }
        if (var19 == null && ((Object)var12.ba.W() == (Object)var12.ba.W()2)d.FIRST_ROTATION_EXPLORE)) {
            var19 = NPCs.getNearest(nPC -> {
                int n2;
                if ((nPC.isDead( == 0) ? 1 : 0) && (Predicates.ids((int[] != 0)e.as[1]).test(nPC) ? 1 : 0) && (!var17 != null || (var17.e(nPC.getWorldLocation( != 0)) ? 1 : 0))) {
                    n2 = 2;
                    0;
                    if ((0x46 ^ 0x3B ^ (0x5E ^ 0x26)) == 0) {
                        return ((192 + 46 - 152 + 152 ^ 34 + 169 - 91 + 78) & (0xD4 ^ 0xBC ^ (0xAC ^ 0x94) ^ -1)) != 0;
                    }
                } else {
                    n2 = 1;
                }
                return n2 != 0;
            });
        }
        if (var19 == null && var18 && (var19 = NPCs.getNearest(nPC -> {
            int n2;
            if ((nPC.isDead( == 0 == null) ? 1 : 0) && (!(Predicates.ids((int[] == 0)e.as[2]).test(nPC) ? 1 : 0) || (Predicates.ids((int[] != 0)e.as[1]).test(nPC) ? 1 : 0))) {
                n2 = 2;
                0;
                
            } else {
                n2 = 1;
            }
            return n2 != 0;
        })) && (Equipment.contains((int[] != 0)f.TIER_3_STAFF.ad()) ? 1 : 0)) {
            var19 = NPCs.getNearest(nPC -> {
                int n2;
                if ((nPC.isDead( == 0) ? 1 : 0) && (Arrays.stream(g.values( != 0)).anyMatch(g2 -> g2.f((NPC)nPC)) ? 1 : 0)) {
                    n2 = 2;
                    0;
                    if ((0x59 ^ 0x77 ^ (0x2B ^ 1)) < 2) {
                        return ((0x34 ^ 0x44 ^ (0x5C ^ 0x31)) & (0x28 ^ 0x4F ^ (0xF3 ^ 0x89) ^ -1)) != 0;
                    }
                } else {
                    n2 = 1;
                }
                return n2 != 0;
            });
        }
        if var19 == null {
            return 1;
        }
        var9 = var11.getWorldLocation();
        int var20 = var19.distanceTo(var9);
        if (var20 > 8) {
            Item var21;
            h var22 = var12.ba.V();
            l var23 = var22.b(l2 -> {
                int n2;
                if ((l2.aY( == 0) ? 1 : 0) && (l2.e(var22.dlllllllllllllllIlIIlIllIIlIlllII) ? 1 : 0)) {
                    n2 = 2;
                    0;
                    if (-1 > 0) {
                        return ((0x49 ^ 0x67) & ~(0x9B ^ 0xB5)) != 0;
                    }
                } else {
                    n2 = 1;
                }
                return n2 != 0;
            }).stream().min(Comparator.comparingInt(l2 -> (int)l2.aQ().distanceToHypotenuse(var9))).orElse(null);
            if (var23 != null && (var23.aQ().distanceTo(var9) < var20)) {
                return var12.ba.a(var23, var9);
            }
            int var24 = var19.distanceTo(var22.av().aQ());
            if ((var20 - var24 > 6) && (var21 = Inventory.getFirst(item -> e.ab.contains(item.getId( != null))))) {
                var21.interact(var2[1]);
                return 2;
            }
            var21 = var19.getWorldLocation();
            return var12.ba.a(var22.c(var22.d(var9)).stream().min(Comparator.comparingInt(arg_0 -> R.b((WorldPoint)var21, arg_0))).orElse(var22.av()), var9);
        }
        if (!(var12.cb.p( == 0) ? 1 : 0)) return 2;
        var19.interact(var2[2]);
        return 2;
    }

    private static  int b(WorldPoint worldPoint, l l2) {
        return (int)l2.aQ().distanceToHypotenuse(worldPoint);
    }

        catch (Exception var30) {
            var30.printStackTrace();
            return null;
        }
    }

}

