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
package n.i.l.r.u.e.g.a.t.t.u.s.e.q.-;

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
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.b_Unknown;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.c_Unknown;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.DEnum;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.e_Unknown;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.FEnum;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.GEnum;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.h_Unknown;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.HerbType;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.l_Unknown;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.n_Unknown;
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

/* TASK: Attacking for Crystals -> AttackingforcrystalsTask */
@TaskDesc(name="Attacking for Crystals", priority=2, blocking=true)
public class AttackingForCrystalsTask
extends n_Unknown {
    private static /* synthetic */ int[] llIIllIIlIll;
    private /* synthetic */ int cc;
    private final /* synthetic */ b cb;
    private static /* synthetic */ String[] llIIllIIlIlI;

    private static void llllllIlIlIIIl() {
        llIIllIIlIlI = new String[llIIllIIlIll[3]];
        R.llIIllIIlIlI[R.llIIllIIlIll[1]] = R."Activate";
        R.llIIllIIlIlI[R.llIIllIIlIll[2]] = R."Attack";
    }

    private static boolean llllllIlIllIIl(Object object, Object object2) {
        return object != object2;
    }

    @Inject
    public R(c c2, b b2) {
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

    private static String llllllIlIIllll(String var25, String var15) {
        try {
            SecretKeySpec var11 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var15.getBytes(StandardCharsets.UTF_8)), llIIllIIlIll[9]), "DES");
            Cipher var20 = Cipher.getInstance("DES");
            var20.init(llIIllIIlIll[3], var11);
            return new String(var20.doFinal(Base64.getDecoder().decode(var25.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var19) {
            var19.printStackTrace();
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
        WorldPoint var16;
        int n2;
        int var26;
        int n3;
        void var14;
        R var23;
        Player player = Players.getLocal();
        if (R.llllllIlIlIIll(player)) {
            return llIIllIIlIll[1];
        }
        int var13 = Static.getClient().getTickCount();
        if (!R.llllllIlIlIlII(var23.ba.A() ? 1 : 0) || R.llllllIlIlIlIl(var23.ba.S() ? 1 : 0)) {
            return llIIllIIlIll[1];
        }
        if (R.llllllIlIlIllI((Object)var23.ba.J()) && R.llllllIlIlIllI(var14.getInteracting())) {
            return llIIllIIlIll[1];
        }
        if (R.llllllIlIlIlll(var23.cc) && R.llllllIlIllIII(var13 - var23.cc, llIIllIIlIll[4])) {
            return llIIllIIlIll[1];
        }
        if (R.llllllIlIlIllI(var14.getInteracting()) && R.llllllIlIllIIl((Object)var23.ba.W(), (Object)d.FIRST_ROTATION_EXPLORE)) {
            var23.cc = var13;
            return llIIllIIlIll[2];
        }
        Map<i, Integer> var21 = var23.ba.E();
        if (R.llllllIlIlIlIl(var21.containsKey((Object)i.CRYSTAL_SHARD) ? 1 : 0)) {
            return llIIllIIlIll[1];
        }
        int var1 = var21.get((Object)i.CRYSTAL_SHARD);
        if (R.llllllIlIllIlI(var1)) {
            return llIIllIIlIll[1];
        }
        int var18 = i.CRYSTAL_SHARD.aC();
        l var2 = var23.ba.T();
        if (R.llllllIlIllIll((Object)var23.ba.W(), (Object)d.DEMI_BOSS_EXPLORE)) {
            n3 = llIIllIIlIll[2];
            0;
            
            }
        } else {
            n3 = llIIllIIlIll[1];
        }
        if (!R.llllllIlIlIlIl(var26 = n3) || R.llllllIlIllIll((Object)var23.ba.W(), (Object)d.EXTRA_FOOD_EXPLORE)) {
            n2 = llIIllIIlIll[2];
            0;
            if (-1 > (0xE ^ 0xA)) {
                return false;
            }
        } else {
            n2 = llIIllIIlIll[1];
        }
        int var4 = n2;
        NPC var6 = null;
        if (R.llllllIlIlIlII(var26)) {
            if (R.llllllIlIlIlII(var23.ba.E().entrySet().stream().anyMatch(entry -> {
                int n2;
                if (R.llllllIlIlIlll((Integer)entry.getValue()) && R.llllllIlIllIIl(entry.getKey(), (Object)i.CRYSTAL_SHARD)) {
                    n2 = llIIllIIlIll[2];
                    0;
                    
                    }
                } else {
                    n2 = llIIllIIlIll[1];
                }
                return n2 != 0;
            }) ? 1 : 0)) {
                if (!R.llllllIlIlllII(var1, llIIllIIlIll[5])) return llIIllIIlIll[1];
                var16 = NPCs.getNearest((Predicate)Predicates.ids((int[])e.as[llIIllIIlIll[2]]));
                if (!R.llllllIlIlIllI(var16) || R.llllllIlIlllIl(var16.distanceTo((Locatable)var14), llIIllIIlIll[6])) {
                    return llIIllIIlIll[1];
                }
                if (R.llllllIlIlIlIl(Players.getLocal().isMoving() ? 1 : 0)) {
                    return llIIllIIlIll[1];
                }
                var6 = var16;
                0;
                if (1 != 1) {
                    return false;
                }
            }
        } else if (R.llllllIlIlIlIl(var23.ba.B() ? 1 : 0) && R.llllllIlIlllIl(var18, llIIllIIlIll[7])) {
            return llIIllIIlIll[1];
        }
        if (R.llllllIlIlIIll(var6) && R.llllllIlIllIll((Object)var23.ba.W(), (Object)d.FIRST_ROTATION_EXPLORE)) {
            var6 = NPCs.getNearest(nPC -> {
                int n2;
                if (R.llllllIlIlIlIl(nPC.isDead() ? 1 : 0) && R.llllllIlIlIlII(Predicates.ids((int[])e.as[llIIllIIlIll[1]]).test(nPC) ? 1 : 0) && (!R.llllllIlIlIllI(var2) || R.llllllIlIlIlII(var2.e(nPC.getWorldLocation()) ? 1 : 0))) {
                    n2 = llIIllIIlIll[2];
                    0;
                    if ((0x46 ^ 0x3B ^ (0x5E ^ 0x26)) == 0) {
                        return ((192 + 46 - 152 + 152 ^ 34 + 169 - 91 + 78) & (0xD4 ^ 0xBC ^ (0xAC ^ 0x94) ^ -1)) != 0;
                    }
                } else {
                    n2 = llIIllIIlIll[1];
                }
                return n2 != 0;
            });
        }
        if (R.llllllIlIlIIll(var6) && R.llllllIlIlIlII(var4) && R.llllllIlIlIIll(var6 = NPCs.getNearest(nPC -> {
            int n2;
            if (R.llllllIlIlIlIl(nPC.isDead() ? 1 : 0) && (!R.llllllIlIlIlIl(Predicates.ids((int[])e.as[llIIllIIlIll[2]]).test(nPC) ? 1 : 0) || R.llllllIlIlIlII(Predicates.ids((int[])e.as[llIIllIIlIll[1]]).test(nPC) ? 1 : 0))) {
                n2 = llIIllIIlIll[2];
                0;
                if (2 == 0) {
                    return false;
                }
            } else {
                n2 = llIIllIIlIll[1];
            }
            return n2 != 0;
        })) && R.llllllIlIlIlII(Equipment.contains((int[])f.TIER_3_STAFF.ad()) ? 1 : 0)) {
            var6 = NPCs.getNearest(nPC -> {
                int n2;
                if (R.llllllIlIlIlIl(nPC.isDead() ? 1 : 0) && R.llllllIlIlIlII(Arrays.stream(g.values()).anyMatch(g2 -> g2.f((NPC)nPC)) ? 1 : 0)) {
                    n2 = llIIllIIlIll[2];
                    0;
                    if ((0x59 ^ 0x77 ^ (0x2B ^ 1)) < 2) {
                        return ((0x34 ^ 0x44 ^ (0x5C ^ 0x31)) & (0x28 ^ 0x4F ^ (0xF3 ^ 0x89) ^ -1)) != 0;
                    }
                } else {
                    n2 = llIIllIIlIll[1];
                }
                return n2 != 0;
            });
        }
        if (R.llllllIlIlIIll(var6)) {
            return llIIllIIlIll[1];
        }
        var16 = var14.getWorldLocation();
        int var22 = var6.distanceTo(var16);
        if (R.llllllIlIlllIl(var22, llIIllIIlIll[8])) {
            Item var10;
            h var5 = var23.ba.V();
            l var9 = var5.b(l2 -> {
                int n2;
                if (R.llllllIlIlIlIl(l2.aY() ? 1 : 0) && R.llllllIlIlIlII(l2.e(var5.d(var16)) ? 1 : 0)) {
                    n2 = llIIllIIlIll[2];
                    0;
                    if (-1 > 0) {
                        return false;
                    }
                } else {
                    n2 = llIIllIIlIll[1];
                }
                return n2 != 0;
            }).stream().min(Comparator.comparingInt(l2 -> (int)l2.aQ().distanceToHypotenuse(var16))).orElse(null);
            if (R.llllllIlIlIllI(var9) && R.llllllIlIllIII(var9.aQ().distanceTo(var16), var22)) {
                return var23.ba.a(var9, var16);
            }
            int var17 = var6.distanceTo(var5.av().aQ());
            if (R.llllllIlIlllIl(var22 - var17, llIIllIIlIll[6]) && R.llllllIlIlIllI(var10 = Inventory.getFirst(item -> e.ab.contains(item.getId())))) {
                var10.interact(llIIllIIlIlI[llIIllIIlIll[1]]);
                return llIIllIIlIll[2];
            }
            var10 = var6.getWorldLocation();
            return var23.ba.a(var5.c(var5.d(var16)).stream().min(Comparator.comparingInt(arg_0 -> R.b((WorldPoint)var10, arg_0))).orElse(var5.av()), var16);
        }
        if (!R.llllllIlIlIlIl(var23.cb.p() ? 1 : 0)) return llIIllIIlIll[2];
        var6.interact(llIIllIIlIlI[llIIllIIlIll[2]]);
        return llIIllIIlIll[2];
    }

    private static /* synthetic */ int b(WorldPoint worldPoint, l l2) {
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

    private static String llllllIlIlIIII(String var8, String var24) {
        try {
            SecretKeySpec var7 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var24.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var12 = Cipher.getInstance("Blowfish");
            var12.init(llIIllIIlIll[3], var7);
            return new String(var12.doFinal(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    private static boolean llllllIlIlIlll(int n2) {
        return n2 > 0;
    }

    private static void llllllIlIlIIlI() {
        llIIllIIlIll = new int[10];
        R.llIIllIIlIll[0] = 3;
        R.llIIllIIlIll[1] = (0x6A ^ 0x51) & ~(0x19 ^ 0x22);
        R.llIIllIIlIll[2] = 1;
        R.llIIllIIlIll[3] = 2;
        R.llIIllIIlIll[4] = 0x26 ^ 0x23;
        R.llIIllIIlIll[5] = 0x27 ^ 0x4C ^ (0x4A ^ 0x71);
        R.llIIllIIlIll[6] = 142 + 9 - 9 + 72 ^ 29 + 11 - 11 + 167;
        R.llIIllIIlIll[7] = 0x39 ^ 0x11;
        R.llIIllIIlIll[8] = 0x3C ^ 0x6F ^ (0xF1 ^ 0xA8);
        R.llIIllIIlIll[9] = 35 + 82 - 0 + 10 ^ (0xFE ^ 0x89);
    }

    private static boolean llllllIlIlIllI(Object object) {
        return object != null;
    }

    private static boolean llllllIlIllIll(Object object, Object object2) {
        return object == object2;
    }
}

