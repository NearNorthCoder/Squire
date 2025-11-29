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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.GameEnum38;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.e;
import gg.squire.gauntlet.tasks.GameEnum39;
import gg.squire.gauntlet.tasks.GameEnum18;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.h;
import gg.squire.gauntlet.tasks.GameEnum;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.l;
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

    private static void llllllIlIlIIIl() {
        llIIllIIlIlI = new String[llIIllIIlIll[3]];
        R.llIIllIIlIlI[R.llIIllIIlIll[1]] = "Activate";
        R.llIIllIIlIlI[R.llIIllIIlIll[2]] = "Attack";
    }

    private static boolean llllllIlIllIIl(Object object, Object object2) {
        return object != object2;
    }

    @Inject
    public AttackingForCrystalsTask(c c2, b b2) {
        d[] dArray = new d[llIIllIIlIll[0]];
        dArray[R.llIIllIIlIll[1]] = d.FIRST_ROTATION_EXPLORE;
        dArray[R.llIIllIIlIll[2]] = d.DEMI_BOSS_EXPLORE;
        dArray[R.llIIllIIlIll[3]] = d.EXTRA_FOOD_EXPLORE;
        super(c2, dArray);
        this.cc = llIIllIIlIll[1];
        this.cb = b2;
    }

    private static boolean llllllIlIlIlIl(int n2) {
        return n2 == 0;
    }

    private static boolean llllllIlIllIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llllllIlIlIIll(Object object) {
        return object == null;
    }

    static {
        R.llllllIlIlIIlI();
        R.llllllIlIlIIIl();
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean be() {
        WorldPoint var1;
        int n2;
        int var2;
        int n3;
        void var3;
        R var4;
        Player player = Players.getLocal();
        if (R.llllllIlIlIIll(player)) {
            return llIIllIIlIll[1];
        }
        int var5 = Static.getClient().getTickCount();
        if (!R.llllllIlIlIlII(var4.ba.A() ? 1 : 0) || R.llllllIlIlIlIl(var4.ba.S() ? 1 : 0)) {
            return llIIllIIlIll[1];
        }
        if (R.llllllIlIlIllI((Object)var4.ba.J()) && R.llllllIlIlIllI(var3.getInteracting())) {
            return llIIllIIlIll[1];
        }
        if (R.llllllIlIlIlll(var4.cc) && R.llllllIlIllIII(var5 - var4.cc, llIIllIIlIll[4])) {
            return llIIllIIlIll[1];
        }
        if (R.llllllIlIlIllI(var3.getInteracting()) && R.llllllIlIllIIl((Object)var4.ba.W(), (Object)d.FIRST_ROTATION_EXPLORE)) {
            var4.cc = var5;
            return llIIllIIlIll[2];
        }
        Map<i, Integer> var6 = var4.ba.E();
        if (R.llllllIlIlIlIl(var6.containsKey((Object)i.CRYSTAL_SHARD) ? 1 : 0)) {
            return llIIllIIlIll[1];
        }
        int var7 = var6.get((Object)i.CRYSTAL_SHARD);
        if (R.llllllIlIllIlI(var7)) {
            return llIIllIIlIll[1];
        }
        int var8 = i.CRYSTAL_SHARD.aC();
        l var9 = var4.ba.T();
        if (R.llllllIlIllIll((Object)var4.ba.W(), (Object)d.DEMI_BOSS_EXPLORE)) {
            n3 = llIIllIIlIll[2];

            }
        } else {
            n3 = llIIllIIlIll[1];
        }
        if (!R.llllllIlIlIlIl(var2 = n3) || R.llllllIlIllIll((Object)var4.ba.W(), (Object)d.EXTRA_FOOD_EXPLORE)) {
            n2 = llIIllIIlIll[2];

            if (-1 > (0xE ^ 0xA)) {
                return false;
            }
        } else {
            n2 = llIIllIIlIll[1];
        }
        int var10 = n2;
        NPC var11 = null;
        if (R.llllllIlIlIlII(var2)) {
            if (R.llllllIlIlIlII(var4.ba.E().entrySet().stream().anyMatch(entry -> {
                int n2;
                if (R.llllllIlIlIlll((Integer)entry.getValue()) && R.llllllIlIllIIl(entry.getKey(), (Object)i.CRYSTAL_SHARD)) {
                    n2 = llIIllIIlIll[2];

                    }
                } else {
                    n2 = llIIllIIlIll[1];
                }
                return n2 != 0;
            }) ? 1 : 0)) {
                if (!R.llllllIlIlllII(var7, llIIllIIlIll[5])) return llIIllIIlIll[1];
                var1 = NPCs.getNearest((Predicate)Predicates.ids((int[])e.as[llIIllIIlIll[2]]));
                if (!R.llllllIlIlIllI(var1) || R.llllllIlIlllIl(var1.distanceTo((Locatable)var3), llIIllIIlIll[6])) {
                    return llIIllIIlIll[1];
                }
                if (R.llllllIlIlIlIl(Players.getLocal().isMoving() ? 1 : 0)) {
                    return llIIllIIlIll[1];
                }
                var11 = var1;

                if (1 != 1) {
                    return false;
                }
            }
        } else if (R.llllllIlIlIlIl(var4.ba.B() ? 1 : 0) && R.llllllIlIlllIl(var8, llIIllIIlIll[7])) {
            return llIIllIIlIll[1];
        }
        if (R.llllllIlIlIIll(var11) && R.llllllIlIllIll((Object)var4.ba.W(), (Object)d.FIRST_ROTATION_EXPLORE)) {
            var11 = NPCs.getNearest(nPC -> {
                int n2;
                if (R.llllllIlIlIlIl(nPC.isDead() ? 1 : 0) && R.llllllIlIlIlII(Predicates.ids((int[])e.as[llIIllIIlIll[1]]).test(nPC) ? 1 : 0) && (!R.llllllIlIlIllI(var9) || R.llllllIlIlIlII(var9.e(nPC.getWorldLocation()) ? 1 : 0))) {
                    n2 = llIIllIIlIll[2];

                    if ((0x46 ^ 0x3B ^ (0x5E ^ 0x26)) == 0) {
                        return ((192 + 46 - 152 + 152 ^ 34 + 169 - 91 + 78) & (0xD4 ^ 0xBC ^ (0xAC ^ 0x94) ^ -1)) != 0;
                    }
                } else {
                    n2 = llIIllIIlIll[1];
                }
                return n2 != 0;
            });
        }
        if (R.llllllIlIlIIll(var11) && R.llllllIlIlIlII(var10) && R.llllllIlIlIIll(var11 = NPCs.getNearest(nPC -> {
            int n2;
            if (R.llllllIlIlIlIl(nPC.isDead() ? 1 : 0) && (!R.llllllIlIlIlIl(Predicates.ids((int[])e.as[llIIllIIlIll[2]]).test(nPC) ? 1 : 0) || R.llllllIlIlIlII(Predicates.ids((int[])e.as[llIIllIIlIll[1]]).test(nPC) ? 1 : 0))) {
                n2 = llIIllIIlIll[2];

                if (2 == 0) {
                    return false;
                }
            } else {
                n2 = llIIllIIlIll[1];
            }
            return n2 != 0;
        })) && R.llllllIlIlIlII(Equipment.contains((int[])f.TIER_3_STAFF.ad()) ? 1 : 0)) {
            var11 = NPCs.getNearest(nPC -> {
                int n2;
                if (R.llllllIlIlIlIl(nPC.isDead() ? 1 : 0) && R.llllllIlIlIlII(Arrays.stream(g.values()).anyMatch(g2 -> g2.f((NPC)nPC)) ? 1 : 0)) {
                    n2 = llIIllIIlIll[2];

                    if ((0x59 ^ 0x77 ^ (0x2B ^ 1)) < 2) {
                        return ((0x34 ^ 0x44 ^ (0x5C ^ 0x31)) & (0x28 ^ 0x4F ^ (0xF3 ^ 0x89) ^ -1)) != 0;
                    }
                } else {
                    n2 = llIIllIIlIll[1];
                }
                return n2 != 0;
            });
        }
        if (R.llllllIlIlIIll(var11)) {
            return llIIllIIlIll[1];
        }
        var1 = var3.getWorldLocation();
        int var12 = var11.distanceTo(var1);
        if (R.llllllIlIlllIl(var12, llIIllIIlIll[8])) {
            Item var13;
            h var14 = var4.ba.V();
            l var15 = var14.b(l2 -> {
                int n2;
                if (R.llllllIlIlIlIl(l2.aY() ? 1 : 0) && R.llllllIlIlIlII(l2.e(var14.d(var1)) ? 1 : 0)) {
                    n2 = llIIllIIlIll[2];

                } else {
                    n2 = llIIllIIlIll[1];
                }
                return n2 != 0;
            }).stream().min(Comparator.comparingInt(l2 -> (int)l2.aQ().distanceToHypotenuse(var1))).orElse(null);
            if (R.llllllIlIlIllI(var15) && R.llllllIlIllIII(var15.aQ().distanceTo(var1), var12)) {
                return var4.ba.a(var15, var1);
            }
            int var16 = var11.distanceTo(var14.av().aQ());
            if (R.llllllIlIlllIl(var12 - var16, llIIllIIlIll[6]) && R.llllllIlIlIllI(var13 = Inventory.getFirst(item -> e.ab.contains(item.getId())))) {
                var13.interact(llIIllIIlIlI[llIIllIIlIll[1]]);
                return llIIllIIlIll[2];
            }
            var13 = var11.getWorldLocation();
            return var4.ba.a(var14.c(var14.d(var1)).stream().min(Comparator.comparingInt(arg_0 -> R.b((WorldPoint)var13, arg_0))).orElse(var14.av()), var1);
        }
        if (!R.llllllIlIlIlIl(var4.cb.p() ? 1 : 0)) return llIIllIIlIll[2];
        var11.interact(llIIllIIlIlI[llIIllIIlIll[2]]);
        return llIIllIIlIll[2];
    }

    private static  int b(WorldPoint worldPoint, l l2) {
        return (int)l2.aQ().distanceToHypotenuse(worldPoint);
    }

    private static boolean llllllIlIlllIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llllllIlIllIlI(int n2) {
        return n2 < 0;
    }

    private static boolean llllllIlIlIlII(int n2) {
        return n2 != 0;
    }

    private static boolean llllllIlIlllII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llllllIlIlIlll(int n2) {
        return n2 > 0;
    }

    private static boolean llllllIlIlIllI(Object object) {
        return object != null;
    }

    private static boolean llllllIlIllIll(Object object, Object object2) {
        return object == object2;
    }
}

