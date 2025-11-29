/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Actor
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.Prayer
 *  net.runelite.api.events.AnimationChanged
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.client.Static
 */
package gg.squire.autotoa.tasks;

import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import net.runelite.api.Actor;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Prayer;
import net.runelite.api.events.AnimationChanged;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.client.Static;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.GameEnum10;

@TaskDesc(name="Handling babboon prayers", priority=0x7FFFFFFF, register=true)
public class HandlingBabboonPrayersTask
extends AutotoaManager {
    private static final  int em;
    private final  Map<Integer, List<aS>> en;
    private static final  int el;

    private static final  int ek;

    private static boolean var3(Object object) {
        return object == null;
    }

    @Override
    public boolean aL() {
        boolean bl2;
        if (aR.var4(NPCs.getNearest(nPC -> {
            int n2;
            if (aR.var5(nPC.getName().contains(var2[var1[8]]) ? 1 : 0) && aR.var6(nPC.isDead() ? 1 : 0)) {
                n2 = var1[1];
                0;
                if ((0x56 ^ 0x52) < 0) {
                    return ((0x6B ^ 8) & ~(0x59 ^ 0x3A)) != 0;
                }
            } else {
                n2 = var1[3];
            }
            return n2 != 0;
        }))) {
            bl2 = var1[1];
            0;
            if (2 != 2) {
                return ((0xB6 ^ 0x9E) & ~(0x1A ^ 0x32)) != 0;
            }
        } else {
            bl2 = var1[3];
        }
        return bl2;
    }

    @Inject
    public HandlingBabboonPrayersTask(SquireAutoTOA squireAutoTOA, TOAConfig tOAConfig) {
        super(squireAutoTOA, tOAConfig);
        this.en = new HashMap<Integer, List<aS>>();
    }

    /*
     * WARNING - void declaration
     */
    private Prayer m(int n2) {
        void var7;
        Collection collection = this.en.get(n2);
        if (!aR.var4(collection) || aR.var5(collection.isEmpty() ? 1 : 0)) {
            return null;
        }
        Prayer var8 = null;
        int var9 = var1[3];
        int var10 = var1[3];
        int var11 = var1[3];
        Iterator var12 = var7.iterator();
        while (aR.var5(var12.hasNext() ? 1 : 0)) {
            aS var13 = (aS)var12.next();
            if (!aR.var4(var13.bH())) continue;
            if (aR.var5(var13.bH().isDead() ? 1 : 0)) {
                0;
                if null == null continue;
                return null;
            }
            if (aR.var14(var13.bI(), Prayer.PROTECT_FROM_MELEE) && aR.var3(var8)) {
                ++var11;
                var8 = Prayer.PROTECT_FROM_MELEE;
            }
            if (aR.var14(var13.bI(), Prayer.PROTECT_FROM_MAGIC) && (!aR.var15(var8, Prayer.PROTECT_FROM_MELEE) || aR.var3(var8))) {
                var9 += 2;
                var8 = Prayer.PROTECT_FROM_MAGIC;
            }
            if (aR.var14(var13.bI(), Prayer.PROTECT_FROM_MISSILES)) {
                var10 += 2;
                var8 = Prayer.PROTECT_FROM_MISSILES;
            }
            0;
            if ((44 + 7 - -7 + 108 ^ 47 + 89 - -13 + 14) > 0) continue;
            return null;
        }
        if (aR.var16(var9, var10) && aR.var16(var9, var11)) {
            return Prayer.PROTECT_FROM_MAGIC;
        }
        if (aR.var16(var11, var10)) {
            return Prayer.PROTECT_FROM_MELEE;
        }
        return Prayer.PROTECT_FROM_MISSILES;
    }

    private static boolean var15(Object object, Object object2) {
        return object != object2;
    }

    private static boolean var17(int n2) {
        return n2 > 0;
    }

    @Override
    public int aO() {
        return var1[2];
    }

    private static boolean var16(int n2, int n3) {
        return n2 >= n3;
    }

        catch (Exception var23) {
            var23.printStackTrace();
            return null;
        }
    }

    private static boolean var24(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public List<Prayer> aN() {
        aR var25;
        NPC var26;
        Prayer var27;
        void var28;
        void var29;
        int n2 = NPCs.getAll(nPC -> {
            int n2;
            if (aR.var5(nPC.getName().equals(var2[var1[12]]) ? 1 : 0) && aR.var6(nPC.isDead() ? 1 : 0)) {
                n2 = var1[1];
                0;
                if (-1 >= (0x91 ^ 0x95)) {
                    return ((0x52 ^ 0x75) & ~(0xB7 ^ 0x90)) != 0;
                }
            } else {
                n2 = var1[3];
            }
            return n2 != 0;
        }).size();
        int n3 = NPCs.getAll(nPC -> {
            int n2;
            if (aR.var5(nPC.getName().equals(var2[var1[11]]) ? 1 : 0) && aR.var6(nPC.isDead() ? 1 : 0)) {
                n2 = var1[1];
                0;
                if (3 < 0) {
                    return ((0xDE ^ 0x84) & ~(0x63 ^ 0x39)) != 0;
                }
            } else {
                n2 = var1[3];
            }
            return n2 != 0;
        }).size();
        Prayer prayer = Prayer.PROTECT_FROM_MELEE;
        if (aR.var30(n3, n2)) {
            prayer = Prayer.PROTECT_FROM_MAGIC;
            0;
            if null != null {
                return null;
            }
        } else if (aR.var30((int)var29, (int)var28)) {
            var27 = Prayer.PROTECT_FROM_MISSILES;
            0;
            if (1 != 1) {
                return null;
            }
        } else {
            var26 = NPCs.getNearest(nPC -> {
                boolean bl2;
                NPC var31;
                if ((!aR.var6(nPC.getName().equals(var2[var1[9]]) ? 1 : 0) || aR.var5(nPC.getName().equals(var2[var1[10]]) ? 1 : 0)) && aR.var6(var31.isDead() ? 1 : 0)) {
                    bl2 = var1[1];
                    0;
                    if ((0x44 ^ 0x18 ^ (0xC1 ^ 0x99)) <= 2) {
                        return ((0xDE ^ 0x9D ^ (0x5A ^ 0x2A)) & (55 + 25 - 66 + 227 ^ 80 + 39 - -19 + 56 ^ -1)) != 0;
                    }
                } else {
                    bl2 = var1[3];
                }
                return bl2;
            });
            if (!aR.var4(var26) || aR.var16(var26.distanceTo((Locatable)Players.getLocal()), var1[0])) {
                if (aR.var17((int)var28)) {
                    var27 = Prayer.PROTECT_FROM_MAGIC;
                    0;
                    if null != null {
                        return null;
                    }
                }
            } else {
                var27 = Prayer.PROTECT_FROM_MELEE;
            }
        }
        if (aR.var4(var26 = var25.m(Static.getClient().getTickCount() + var1[1]))) {
            var27 = var26;
        }
        if (aR.var4(var27)) {
            return List.of(var25.aQ(), var27);
        }
        return List.of(this.aQ());
    }

    private static boolean var32(int n2, int n3) {
        return n2 == n3;
    }

    private static String var33(String var34, String var35) {
        var34 = new String(Base64.getDecoder().decode(var34.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var36 = new StringBuilder();
        char[] var37 = var35.toCharArray();
        int var38 = var1[3];
        char[] var39 = var34.toCharArray();
        int var40 = var39.length;
        int var41 = var1[3];
        while (aR.var24(var41, var40)) {
            char var42 = var39[var41];
            var36.append((char)(var42 ^ var37[var38 % var37.length]));
            0;
            ++var38;
            ++var41;
            0;
            if ((0x14 ^ 0x10) != 0) continue;
            return null;
        }
        return String.valueOf(var36);
    }

    @Override
    public v aT() {
        return v.FLICK;
    }

    private static boolean var4(Object object) {
        return object != null;
    }

    @Override
    public boolean aS() {
        return var1[1];
    }

    /*
     * WARNING - void declaration
     */
    private void a(Actor actor, Prayer prayer) {
        int n2 = Static.getClient().getTickCount() + var1[8];
        aS aS2 = new aS(actor, prayer);
        if (aR.var6(this.en.containsKey(n2) ? 1 : 0)) {
            ArrayList<aS> arrayList = new ArrayList<aS>();
            arrayList.add(aS2);
            0;
            this.en.put(n2, arrayList);
            0;
            0;
            if (3 < 1) {
                return;
            }
        } else {
            void var43;
            void var44;
            aR var45;
            List<aS> var46 = var45.en.get((int)var44);
            var46.add((aS)var43);
            0;
            var45.en.put((int)var44, var46);
            0;
        }
    }

    private static void var47() {
        var2 = new String[var1[15]];
        aR.var2[aR.var1[3]] = "Baboon Mage";
        aR.var2[aR.var1[1]] = "Baboon Thrower";
        aR.var2[aR.var1[0]] = "Baboon Brawler";
        aR.var2[aR.var1[7]] = "Baboon Thrall";
        aR.var2[aR.var1[8]] = "Baboon";
        aR.var2[aR.var1[9]] = "Baboon Brawler";
        aR.var2[aR.var1[10]] = "Baboon Thrall";
        aR.var2[aR.var1[11]] = "Baboon Mage";
        aR.var2[aR.var1[12]] = "Baboon Thrower";
    }

    private static boolean var30(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean var5(int n2) {
        return n2 != 0;
    }

        catch (Exception var53) {
            var53.printStackTrace();
            return null;
        }
    }

    static {
        aR.var54();
        aR.var47();
        ek = var1[13];
        em = var1[6];
        el = var1[14];
    }

    private static boolean var6(int n2) {
        return n2 == 0;
    }

    private static boolean var14(Object object, Object object2) {
        return object == object2;
    }

    private static void var54() {
        var1 = new int[16];
        aR.var1[0] = 2;
        aR.var1[1] = 1;
        aR.var1[2] = -(0x35 ^ 0x10) & (0xFFFFFB77 & 0x3FFE);
        aR.var1[3] = (0xFA ^ 0xC2 ^ (5 ^ 0x1D)) & (22 + 74 - -34 + 51 ^ 3 + 5 - -77 + 64 ^ -1);
        aR.var1[4] = 0xFFFFEEBE & 0x3753;
        aR.var1[5] = 0xFFFFE759 & 0x3EB7;
        aR.var1[6] = 0xFFFFBF6E & 0x669F;
        aR.var1[7] = 3;
        aR.var1[8] = 0x47 ^ 0x43;
        aR.var1[9] = 124 + 156 - 183 + 94 ^ 28 + 33 - -4 + 121;
        aR.var1[10] = 0x81 ^ 0x87;
        aR.var1[11] = 0x1D ^ 0x1A;
        aR.var1[12] = 0 ^ 8;
        aR.var1[13] = 0xFFFFCDCA & 0x3AF7;
        aR.var1[14] = -(0xFFFFB3FD & 0x6D2B) & (0xFFFFB9EF & 0x6FFF);
        aR.var1[15] = 0xE8 ^ 0x83 ^ (0x72 ^ 0x10);
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(AnimationChanged animationChanged) {
        aR var55;
        void var56;
        Actor actor = animationChanged.getActor();
        if (aR.var5(actor instanceof Player)) {
            return;
        }
        NPC var57 = (NPC)var56;
        if (aR.var32(var57.getAnimation(), var1[4]) && aR.var5(var57.getName().equals(var2[var1[3]]) ? 1 : 0)) {
            var55.a((Actor)var57, Prayer.PROTECT_FROM_MAGIC);
        }
        if (aR.var32(var57.getAnimation(), var1[5]) && aR.var5(var57.getName().equals(var2[var1[1]]) ? 1 : 0)) {
            var55.a((Actor)var57, Prayer.PROTECT_FROM_MISSILES);
        }
        if (aR.var32(var57.getAnimation(), var1[6]) && (!aR.var6(var57.getName().equals(var2[var1[0]]) ? 1 : 0) || aR.var5(var57.getName().equals(var2[var1[7]]) ? 1 : 0))) {
            var55.a((Actor)var57, Prayer.PROTECT_FROM_MELEE);
        }
    }
}

