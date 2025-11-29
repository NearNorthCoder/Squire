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
import gg.squire.gauntlet.tasks.GameEnum38;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.e;
import gg.squire.gauntlet.tasks.GameEnum39;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.h;
import gg.squire.gauntlet.tasks.GameEnum;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.l;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.s;
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
public class r
extends Task {
    private final  c bx;
    
    private final  M by;

    private boolean bm() {
        int n2;
        List<f> list = this.bx.I();
        Item item2 = Inventory.getFirst(item -> f.VIAL.ac().contains(item.getId()));
        if (r.lllllllllllIII(item2) && r.llllllllllIlll(list.isEmpty() ? 1 : 0)) {
            n2 = llIIlllIllIl[1];

        } else {
            n2 = llIIlllIllIl[4];
        }
        return n2 != 0;
    }

    private boolean bo() {
        return this.bx.V().ar().isEmpty();
    }

    private boolean bi() {
        Player player = Players.getLocal();
        if (r.lllllllllllIII(player)) {
            return llIIlllIllIl[4];
        }
        return this.bx.V().av().e(player.getWorldLocation());
    }

    private void bp() {
        if (r.llllllllllIlll(((RSClient)Static.getClient()).isTesting() ? 1 : 0)) {
            int n2 = Rand.nextInt((int)llIIlllIllIl[7], (int)llIIlllIllIl[8]);
            Executors.newSingleThreadScheduledExecutor().schedule(() -> System.exit(llIIlllIllIl[4]), (long)n2, TimeUnit.MINUTES);

        }
    }

    private static boolean llllllllllIlIl(Object object) {
        return object != null;
    }

    private static boolean llllllllllIlll(int n2) {
        return n2 != 0;
    }

    private static boolean lllllllllllIlI(int n2) {
        return n2 > 0;
    }

    private static boolean lllllllllllIII(Object object) {
        return object == null;
    }

    private boolean bh() {
        int n2;
        if (r.llllllllllIlII(Inventory.contains((int[])i.FISH.aB()) ? 1 : 0) && r.llllllllllIlII(this.bx.V().av().bb())) {
            n2 = llIIlllIllIl[1];

            if (-(0xDF ^ 0x8F ^ (0x7D ^ 0x28)) >= 0) {
                return ((1 + 115 - 10 + 47 ^ 120 + 99 - 123 + 89) & (0xD8 ^ 0xB9 ^ (0x24 ^ 0x65) ^ -1)) != 0;
            }
        } else {
            n2 = llIIlllIllIl[4];
        }
        return n2 != 0;
    }

    private static boolean llllllllllllII(int n2, int n3) {
        return n2 >= n3;
    }

    private boolean bn() {
        boolean bl;
        Item item2 = Inventory.getFirst(item -> f.VIAL.ac().contains(item.getId()));
        if (r.lllllllllllIII(item2)) {
            bl = llIIlllIllIl[1];

            if (-(1 ^ 4 ^ (0x12 ^ 0x33) & ~(0x82 ^ 0xA3)) >= 0) {
                return ((0xBF ^ 0x82 ^ (0x79 ^ 0x6F)) & (52 + 108 - 86 + 87 ^ 26 + 54 - 48 + 106 ^ -1)) != 0;
            }
        } else {
            bl = llIIlllIllIl[4];
        }
        return bl;
    }

    private static boolean lllllllllllIIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llllllllllIllI(Object object, Object object2) {
        return object == object2;
    }

    @Inject
    public r(c c2, M m2) {
        this.bx = c2;
        this.by = m2;
    }

    private static boolean llllllllllIIll(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean llllllllllllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llllllllllIlII(int n2) {
        return n2 == 0;
    }

    private static boolean llllllllllIIIl(Object object, Object object2) {
        return object != object2;
    }

    static {
        r.llllllllllIIII();
    }

    private static boolean lllllllllllIll(int n2, int n3) {
        return n2 <= n3;
    }

    private boolean N() {
        Iterator<Map.Entry<i, Integer>> var1 = this.bx.E().entrySet().iterator();
        while (r.llllllllllIlll(var1.hasNext() ? 1 : 0)) {
            Map.Entry<i, Integer> var2 = var1.next();
            i var3 = var2.getKey();
            int var4 = var2.getValue();
            if (r.llllllllllllIl(Inventory.getCount((boolean)llIIlllIllIl[1], (int[])var3.aB()), var4)) {
                return llIIlllIllIl[4];
            }

            return (2 & (2 ^ -1)) != 0;
        }
        return llIIlllIllIl[1];
    }

    private boolean bk() {
        int n2;
        if (r.llllllllllIlll(this.bo() ? 1 : 0) && r.llllllllllIlll(this.bl() ? 1 : 0) && r.llllllllllIlll(this.by.bD().isEmpty() ? 1 : 0) && r.lllllllllllIII(this.bx.U())) {
            n2 = llIIlllIllIl[1];

            if (3 <= 0) {
                return ((0x58 ^ 0x42 ^ (0xF0 ^ 0xC3)) & (5 ^ 8 ^ (0x50 ^ 0x74) ^ -1)) != 0;
            }
        } else {
            n2 = llIIlllIllIl[4];
        }
        return n2 != 0;
    }

    private boolean bj() {
        int n2;
        if (r.llllllllllIlII(this.bx.B() ? 1 : 0) && r.lllllllllllIIl(i.CRYSTAL_SHARD.aC(), llIIlllIllIl[6])) {
            n2 = llIIlllIllIl[1];

            }
        } else {
            n2 = llIIlllIllIl[4];
        }
        return n2 != 0;
    }

    private static boolean llllllllllIIlI(int n2, int n3) {
        return n2 == n3;
    }

    private boolean bl() {
        boolean bl;
        Player player = Players.getLocal();
        if (r.lllllllllllIII(player)) {
            return llIIlllIllIl[4];
        }
        NPC var5 = NPCs.getNearest(nPC -> {
            int n2;
            if (r.llllllllllIlll(e.at.or(e.au).test((NPC)nPC) ? 1 : 0) && r.llllllllllIlII(nPC.isDead() ? 1 : 0)) {
                n2 = llIIlllIllIl[1];

                if (3 <= ((0xC3 ^ 0x94 ^ (0x55 ^ 0xB)) & (172 + 66 - 80 + 18 ^ 85 + 89 - 170 + 181 ^ -1))) {
                    return ((28 + 85 - -35 + 15 ^ 5 + 106 - -28 + 8) & (0x3E ^ 0x65 ^ (0xC1 ^ 0xAA) ^ -1)) != 0;
                }
            } else {
                n2 = llIIlllIllIl[4];
            }
            return n2 != 0;
        });
        if (r.lllllllllllIII(var5)) {
            bl = llIIlllIllIl[1];

        } else {
            bl = llIIlllIllIl[4];
        }
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var6;
        Object var7;
        r var8;
        d d2 = this.bx.W();
        if (r.llllllllllIIIl((Object)d2, (Object)d.BOSS_FIGHT) && r.llllllllllIIlI(Vars.getBit((int)llIIlllIllIl[0]), llIIlllIllIl[1])) {
            this.bx.a(d.BOSS_FIGHT);
            return llIIlllIllIl[1];
        }
        if (r.llllllllllIIlI(Vars.getBit((int)llIIlllIllIl[2]), llIIlllIllIl[1]) && r.llllllllllIIll(Vars.getBit((int)llIIlllIllIl[0]), llIIlllIllIl[1])) {
            var7 = var8.bx.X();
            if (r.llllllllllIlII(var8.bx.h().makeT3Offhand() ? 1 : 0) && r.llllllllllIlIl(var7) && r.llllllllllIllI(var8.bx.X().aD(), HeadIcon.MAGIC)) {
                var8.bx.a(d.GIVE_UP);
                return llIIlllIllIl[1];
            }
        }
        var7 = var8.bx.h();
        int var9 = var7.fishGoal() - var7.fishGoalDeviation();
        switch (s.bz[var6.ordinal()]) {
            case 1: {
                if (r.llllllllllIlII(var8.N() ? 1 : 0) && r.llllllllllIlII(var8.bk() ? 1 : 0) && !r.llllllllllIlll(var8.bj() ? 1 : 0)) break;
                int var10 = var8.bl() ? 1 : 0;
                if (r.llllllllllIlll(var10) && r.llllllllllIlll(var8.bx.B() ? 1 : 0) && r.lllllllllllIII(Players.getLocal().getInteracting())) {
                    var8.bx.a(d.GIVE_UP);

                } else {
                    if (r.llllllllllIlII(var8.bx.B() ? 1 : 0) && r.llllllllllIlll(var8.bo() ? 1 : 0) && r.lllllllllllIIl(i.CRYSTAL_SHARD.aC(), llIIlllIllIl[3])) {
                        var8.bx.a(d.FIRST_ROTATION_CREATE);
                        var8.bp();
                        return llIIlllIllIl[1];
                    }
                    return llIIlllIllIl[4];
                }

                if (-(0x70 ^ 0x74) <= 0) break;
                return false;
            }
            case 2: {
                if (!r.llllllllllIlll(var8.bm() ? 1 : 0) || !r.llllllllllIlll(var8.bn() ? 1 : 0)) break;
                var8.bx.a(d.DEMI_BOSS_EXPLORE);
                return llIIlllIllIl[1];
            }
            case 3: {
                if (!r.llllllllllIlll(var8.bi() ? 1 : 0)) break;
                if (r.llllllllllIlll(var8.N() ? 1 : 0)) {
                    var8.bx.a(d.PREPARE_BOSS_FIGHT);
                    return llIIlllIllIl[1];
                }
                if (!r.llllllllllIlll(var7.goHomeT3() ? 1 : 0) || !r.llllllllllIlll(var7.makeT3Offhand() ? 1 : 0) || !r.llllllllllIlll(var8.bx.a(f.TIER_3_STAFF) ? 1 : 0)) break;
                var8.bx.a(d.CREATING_T3_STAFF);

                if (-(0x7C ^ 0x6B ^ (0x81 ^ 0x93)) < 0) break;
                return ((0xBE ^ 0xAE ^ (0x67 ^ 0x3F)) & (0x23 ^ 0x79 ^ (0x14 ^ 6) ^ -1)) != 0;
            }
            case 4: {
                if (!r.llllllllllIlII(var8.bx.a(f.TIER_3_STAFF) ? 1 : 0)) break;
                var8.bx.a(d.DEMI_BOSS_EXPLORE);
                return llIIlllIllIl[1];
            }
            case 5: {
                h var11;
                Optional<l> var12;
                int var10;
                int n2;
                if (!r.llllllllllIlll(var8.bi() ? 1 : 0) || !r.llllllllllIlll(var8.bm() ? 1 : 0) || r.llllllllllIlII(var8.bh() ? 1 : 0)) {
                    return llIIlllIllIl[4];
                }
                if (!r.llllllllllIlII(var8.bx.a(f.TIER_3_STAFF.ad()) ? 1 : 0) || r.llllllllllIlll(var8.bx.a(f.TIER_3_BOW.ad()) ? 1 : 0)) {
                    var8.bx.a(d.DEMI_BOSS_EXPLORE);
                    return llIIlllIllIl[1];
                }
                if (r.lllllllllllIIl(var8.bx.M(), llIIlllIllIl[3]) && r.lllllllllllIlI(var8.bx.E().getOrDefault((Object)i.CRYSTAL_SHARD, llIIlllIllIl[4]))) {
                    var8.bx.a(d.EXTRA_FOOD_EXPLORE);
                    return llIIlllIllIl[1];
                }
                if (r.lllllllllllIIl(var9, var8.bx.F())) {
                    n2 = llIIlllIllIl[1];

                    if (1 < 0) {
                        return false;
                    }
                } else {
                    n2 = var10 = llIIlllIllIl[4];
                }
                if (r.llllllllllIlII(Inventory.getFreeSlots()) && r.llllllllllIlll(var8.bx.a(i2 -> {
                    boolean bl;
                    if (r.llllllllllIllI(i2, (Object)i.FISH)) {
                        bl = llIIlllIllIl[1];

                        if (3 <= 0) {
                            return ((0xA ^ 0x36 ^ (0x50 ^ 0x6A)) & (60 + 65 - 81 + 88 ^ 44 + 92 - 64 + 58 ^ -1)) != 0;
                        }
                    } else {
                        bl = llIIlllIllIl[4];
                    }
                    return bl;
                }) ? 1 : 0)) {
                    var8.bx.a(d.AFK);
                    return llIIlllIllIl[1];
                }
                if (r.llllllllllIlII(Inventory.getFreeSlots())) {
                    return llIIlllIllIl[4];
                }
                if (r.llllllllllIlll(var10) && r.lllllllllllIIl(var8.bx.M(), llIIlllIllIl[3]) && (!r.llllllllllIlII((var12 = (var11 = var8.bx.V()).b(l2 -> {
                    boolean bl;
                    if (r.llllllllllIlII(l2.aY() ? 1 : 0)) {
                        bl = llIIlllIllIl[1];

                        if (((0xE1 ^ 0xBC) & ~(0x22 ^ 0x7F)) < 0) {
                            return false;
                        }
                    } else {
                        bl = llIIlllIllIl[4];
                    }
                    return bl;
                }).stream().filter(l3 -> var11.c((l)l3).stream().anyMatch(l2 -> {
                    boolean bl;
                    if (r.llllllllllIlII(l2.aV() ? 1 : 0)) {
                        bl = llIIlllIllIl[1];

                        if ((4 ^ 0) == 0) {
                            return false;
                        }
                    } else {
                        bl = llIIlllIllIl[4];
                    }
                    return bl;
                })).min(Comparator.comparing(l::aT))).isPresent() ? 1 : 0) || r.llllllllllIlIl(var8.bx.U()))) {
                    var8.bx.a(d.EXTRA_FOOD_EXPLORE);
                    return llIIlllIllIl[1];
                }
                var8.bx.a(d.AFK);
                return llIIlllIllIl[1];
            }
            case 6: {
                if (r.lllllllllllIll(var8.bx.M(), llIIlllIllIl[3]) && (!r.llllllllllIlll(var8.bm() ? 1 : 0) || r.llllllllllllII(i.FISH.aC(), llIIlllIllIl[5]))) {
                    var8.bx.a(d.PREPARE_BOSS_FIGHT);
                    return llIIlllIllIl[1];
                }
                if (!r.llllllllllIlll(var8.bi() ? 1 : 0) || r.llllllllllIlII(var8.N() ? 1 : 0)) {
                    return llIIlllIllIl[4];
                }
                if (r.llllllllllIlll(Inventory.getFreeSlots()) && !r.lllllllllllIll(var9, var8.bx.F())) break;
                var8.bx.a(d.PREPARE_BOSS_FIGHT);
                return llIIlllIllIl[1];
            }
        }
        return llIIlllIllIl[4];
    }
}

