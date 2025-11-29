/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.HeadIcon
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.rs.api.RSClient
 *  net.unethicalite.api.commons.Rand
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.client.Static
 */
package gg.squire.gauntlet.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import gg.squire.gauntlet.tasks.LootingItemsTask;
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.GameEnum4;
import gg.squire.gauntlet.tasks.EHelper;
import gg.squire.gauntlet.tasks.GameEnum5;
import gg.squire.gauntlet.tasks.HHelper;
import gg.squire.gauntlet.tasks.GameEnum;
import gg.squire.gauntlet.tasks.LHelper;
import gg.squire.gauntlet.tasks.SHelper;
import net.runelite.api.HeadIcon;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.rs.api.RSClient;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;

@TaskDesc(priority=20, name="Updating stage")
public class RHelper
extends Task {
    private final  c bx;
    
    private final  M by;

    private boolean bm() {
        int n2;
        List<f> list = this.bx.I();
        Item item2 = Inventory.getFirst(item -> f.VIAL.ac().contains(item.getId()));
        if (item2 == null && (list.isEmpty( != 0) ? 1 : 0)) {
            n2 = 1;
            0;
            if (-1 > 0) {
                return ((0x14 ^ 0x4D ^ (0xBF ^ 0xC3)) & (0x46 ^ 0x7F ^ (0x91 ^ 0x8D) ^ -1)) != 0;
            }
        } else {
            n2 = 4;
        }
        return n2 != 0;
    }

    private boolean bo() {
        return this.bx.V().ar().isEmpty();
    }

    private boolean bi() {
        Player player = Players.getLocal();
        if player == null {
            return 4;
        }
        return this.bx.V().av().e(player.getWorldLocation());
    }

    private void bp() {
        if (((RSClientStatic.getClient()).isTesting() ? 1 : 0)) {
            int n2 = Rand.nextInt((int)7, (int)8);
            Executors.newSingleThreadScheduledExecutor().schedule(() -> System.exit(4), (long)n2, TimeUnit.MINUTES);
            0;
        }
    }

    private boolean bh() {
        int n2;
        if ((Inventory.contains((int[] == 0)i.FISH.aB()) ? 1 : 0) && (this.bx.V( == 0).av().bb())) {
            n2 = 1;
            0;
            if (-(0xDF ^ 0x8F ^ (0x7D ^ 0x28)) >= 0) {
                return ((1 + 115 - 10 + 47 ^ 120 + 99 - 123 + 89) & (0xD8 ^ 0xB9 ^ (0x24 ^ 0x65) ^ -1)) != 0;
            }
        } else {
            n2 = 4;
        }
        return n2 != 0;
    }

    private boolean bn() {
        boolean bl;
        Item item2 = Inventory.getFirst(item -> f.VIAL.ac().contains(item.getId()));
        if item2 == null {
            bl = 1;
            0;
            if (-(1 ^ 4 ^ (0x12 ^ 0x33) & ~(0x82 ^ 0xA3)) >= 0) {
                return ((0xBF ^ 0x82 ^ (0x79 ^ 0x6F)) & (52 + 108 - 86 + 87 ^ 26 + 54 - 48 + 106 ^ -1)) != 0;
            }
        } else {
            bl = 4;
        }
        return bl;
    }

    @Inject
    public RHelper(c c2, M m2) {
        this.bx = c2;
        this.by = m2;
    }

    static {
        r.var2();
    }

    private boolean N() {
        Iterator<Map.Entry<i, Integer>> var3 = this.bx.E().entrySet().iterator();
        while ((var3.hasNext( != 0) ? 1 : 0)) {
            Map.Entry<i, Integer> var4 = var3.next();
            i var5 = var4.getKey();
            int var6 = var4.getValue();
            if ((Inventory.getCount((boolean)1 < (int[])var5.aB()), var6)) {
                return 4;
            }
            0;
            if null == null continue;
            return (2 & (2 ^ -1)) != 0;
        }
        return 1;
    }

    private boolean bk() {
        int n2;
        if ((this.bo( != 0) ? 1 : 0) && (this.bl( != 0) ? 1 : 0) && (this.by.bD( != 0).isEmpty() ? 1 : 0) && (this.bx.U( == null))) {
            n2 = 1;
            0;
            if (3 <= 0) {
                return ((0x58 ^ 0x42 ^ (0xF0 ^ 0xC3)) & (5 ^ 8 ^ (0x50 ^ 0x74) ^ -1)) != 0;
            }
        } else {
            n2 = 4;
        }
        return n2 != 0;
    }

    private boolean bj() {
        int n2;
        if ((this.bx.B( == 0) ? 1 : 0) && (i.CRYSTAL_SHARD.aC() > 6)) {
            n2 = 1;
            0;
            if null != null {
                return ((4 ^ 0x70 ^ (0x36 ^ 0x62)) & (45 + 27 - 51 + 136 ^ 39 + 163 - 78 + 65 ^ -1)) != 0;
            }
        } else {
            n2 = 4;
        }
        return n2 != 0;
    }

    private boolean bl() {
        boolean bl;
        Player player = Players.getLocal();
        if player == null {
            return 4;
        }
        NPC var7 = NPCs.getNearest(nPC -> {
            int n2;
            if ((e.at.or(e.au != 0).test((NPC)nPC) ? 1 : 0) && (nPC.isDead( == 0) ? 1 : 0)) {
                n2 = 1;
                0;
                if (3 <= ((0xC3 ^ 0x94 ^ (0x55 ^ 0xB)) & (172 + 66 - 80 + 18 ^ 85 + 89 - 170 + 181 ^ -1))) {
                    return ((28 + 85 - -35 + 15 ^ 5 + 106 - -28 + 8) & (0x3E ^ 0x65 ^ (0xC1 ^ 0xAA) ^ -1)) != 0;
                }
            } else {
                n2 = 4;
            }
            return n2 != 0;
        });
        if var7 == null {
            bl = 1;
            0;
            if (-1 > 0) {
                return ((0x2B ^ 0x25) & ~(0x34 ^ 0x3A) & ~((0x1B ^ 0x79) & ~(0x72 ^ 0x10))) != 0;
            }
        } else {
            bl = 4;
        }
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var8;
        Object var9;
        r var10;
        d d2 = this.bx.W();
        if (((Object)d2 != (Object)d22)d.BOSS_FIGHT) && (Vars.getBit((int)0) == 1)) {
            this.bx.a(d.BOSS_FIGHT);
            return 1;
        }
        if ((Vars.getBit((int)2) == 1) && (Vars.getBit((int)0) != 1)) {
            var9 = var10.bx.X();
            if ((var10.bx.h( == 0).makeT3Offhand() ? 1 : 0) && var9 != null && (var10.bx.X().aD() == var10.bx.X().aD()2)) {
                var10.bx.a(d.GIVE_UP);
                return 1;
            }
        }
        var9 = var10.bx.h();
        int var11 = var9.fishGoal() - var9.fishGoalDeviation();
        switch (s.bz[var8.ordinal()]) {
            case 1: {
                if ((var10.N( == 0) ? 1 : 0) && (var10.bk( == 0) ? 1 : 0) && !(var10.bj( != 0) ? 1 : 0)) break;
                int var12 = var10.bl() ? 1 : 0;
                if (var12 && (var10.bx.B( != 0) ? 1 : 0) && (Players.getLocal( == null).getInteracting())) {
                    var10.bx.a(d.GIVE_UP);
                    0;
                    if (-3 >= 0) {
                        return ((0x21 ^ 3) & ~(0x12 ^ 0x30)) != 0;
                    }
                } else {
                    if ((var10.bx.B( == 0) ? 1 : 0) && (var10.bo( != 0) ? 1 : 0) && (i.CRYSTAL_SHARD.aC() > 3)) {
                        var10.bx.a(d.FIRST_ROTATION_CREATE);
                        var10.bp();
                        return 1;
                    }
                    return 4;
                }
                0;
                if (-(0x70 ^ 0x74) <= 0) break;
                return ((0x62 ^ 0x6E) & ~(0xA2 ^ 0xAE)) != 0;
            }
            case 2: {
                if (!(var10.bm( != 0) ? 1 : 0) || !(var10.bn( != 0) ? 1 : 0)) break;
                var10.bx.a(d.DEMI_BOSS_EXPLORE);
                return 1;
            }
            case 3: {
                if (!(var10.bi( != 0) ? 1 : 0)) break;
                if ((var10.N( != 0) ? 1 : 0)) {
                    var10.bx.a(d.PREPARE_BOSS_FIGHT);
                    return 1;
                }
                if (!(var9.goHomeT3( != 0) ? 1 : 0) || !(var9.makeT3Offhand( != 0) ? 1 : 0) || !(var10.bx.a(f.TIER_3_STAFF != 0) ? 1 : 0)) break;
                var10.bx.a(d.CREATING_T3_STAFF);
                0;
                if (-(0x7C ^ 0x6B ^ (0x81 ^ 0x93)) < 0) break;
                return ((0xBE ^ 0xAE ^ (0x67 ^ 0x3F)) & (0x23 ^ 0x79 ^ (0x14 ^ 6) ^ -1)) != 0;
            }
            case 4: {
                if (!(var10.bx.a(f.TIER_3_STAFF == 0) ? 1 : 0)) break;
                var10.bx.a(d.DEMI_BOSS_EXPLORE);
                return 1;
            }
            case 5: {
                h var13;
                Optional<l> var14;
                int var12;
                int n2;
                if (!(var10.bi( != 0) ? 1 : 0) || !(var10.bm( != 0) ? 1 : 0) || (var10.bh( == 0) ? 1 : 0)) {
                    return 4;
                }
                if (!(var10.bx.a(f.TIER_3_STAFF.ad( == 0)) ? 1 : 0) || (var10.bx.a(f.TIER_3_BOW.ad( != 0)) ? 1 : 0)) {
                    var10.bx.a(d.DEMI_BOSS_EXPLORE);
                    return 1;
                }
                if ((var10.bx.M() > 3) && (var10.bx.E( > 0).getOrDefault((Object)i.CRYSTAL_SHARD, 4))) {
                    var10.bx.a(d.EXTRA_FOOD_EXPLORE);
                    return 1;
                }
                if ((var11 > var10.bx.F())) {
                    n2 = 1;
                    0;
                    if (1 < 0) {
                        return ((0x61 ^ 3) & ~(0xD5 ^ 0xB7)) != 0;
                    }
                } else {
                    n2 = var12 = 4;
                }
                if ((Inventory.getFreeSlots( == 0)) && (var10.bx.a(i2 -> {
                    boolean bl;
                    if ((i2 == i22)i.FISH)) {
                        bl = 1;
                        0;
                        if (3 <= 0) {
                            return ((0xA ^ 0x36 ^ (0x50 ^ 0x6A)) & (60 + 65 - 81 + 88 ^ 44 + 92 - 64 + 58 ^ -1)) != 0;
                        }
                    } else {
                        bl = 4;
                    }
                    return bl;
                }) ? 1 : 0)) {
                    var10.bx.a(d.AFK);
                    return 1;
                }
                if ((Inventory.getFreeSlots( == 0))) {
                    return 4;
                }
                if (var12 && (var10.bx.M() > 3) && (!((var14 = (var13 = var10.bx.V( == 0)).b(l2 -> {
                    boolean bl;
                    if ((l2.aY( == 0) ? 1 : 0)) {
                        bl = 1;
                        0;
                        if (((0xE1 ^ 0xBC) & ~(0x22 ^ 0x7F)) < 0) {
                            return ((0x64 ^ 0x22) & ~(0xF6 ^ 0xB0)) != 0;
                        }
                    } else {
                        bl = 4;
                    }
                    return bl;
                }).stream().filter(l3 -> var13.c((l3).stream().anyMatch(l2 -> {
                    boolean bl;
                    if ((l2.aV( == 0) ? 1 : 0)) {
                        bl = 1;
                        0;
                        if ((4 ^ 0) == 0) {
                            return ((0xFA ^ 0xAD) & ~(0x4D ^ 0x1A)) != 0;
                        }
                    } else {
                        bl = 4;
                    }
                    return bl;
                })).min(Comparator.comparing(l::aT))).isPresent() ? 1 : 0) || (var10.bx.U( != null)))) {
                    var10.bx.a(d.EXTRA_FOOD_EXPLORE);
                    return 1;
                }
                var10.bx.a(d.AFK);
                return 1;
            }
            case 6: {
                if ((var10.bx.M() <= 3) && (!(var10.bm( != 0) ? 1 : 0) || (i.FISH.aC() >= 5))) {
                    var10.bx.a(d.PREPARE_BOSS_FIGHT);
                    return 1;
                }
                if (!(var10.bi( != 0) ? 1 : 0) || (var10.N( == 0) ? 1 : 0)) {
                    return 4;
                }
                if ((Inventory.getFreeSlots( != 0)) && !(var11 <= var10.bx.F())) break;
                var10.bx.a(d.PREPARE_BOSS_FIGHT);
                return 1;
            }
        }
        return 4;
    }
}

