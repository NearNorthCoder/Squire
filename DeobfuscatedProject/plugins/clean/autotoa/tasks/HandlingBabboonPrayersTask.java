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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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
import gg.squire.autotoa.tasks.AutotoaTaskBase;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aS;
import gg.squire.autotoa.tasks.GameEnum80;

@TaskDesc(name="Handling babboon prayers", priority=0x7FFFFFFF, register=true)
public class HandlingBabboonPrayersTask
extends AutotoaTaskBase {
    private static final  int em;
    private final  Map<Integer, List<aS>> en;
    private static final  int el;

    private static final  int ek;

    private static boolean lIlIlIIIIlllII(Object object) {
        return object == null;
    }

    @Override
    public boolean aL() {
        boolean bl2;
        if (aR.lIlIlIIIIlIlll(NPCs.getNearest(nPC -> {
            int n2;
            if (aR.lIlIlIIIIllIlI(nPC.getName().contains(llIlIllllIl[llIlIlllllI[8]]) ? 1 : 0) && aR.lIlIlIIIIlllll(nPC.isDead() ? 1 : 0)) {
                n2 = llIlIlllllI[1];

                if ((0x56 ^ 0x52) < 0) {
                    return false;
                }
            } else {
                n2 = llIlIlllllI[3];
            }
            return n2 != 0;
        }))) {
            bl2 = llIlIlllllI[1];

            if (2 != 2) {
                return false;
            }
        } else {
            bl2 = llIlIlllllI[3];
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
        void var1;
        Collection collection = this.en.get(n2);
        if (!aR.lIlIlIIIIlIlll(collection) || aR.lIlIlIIIIllIlI(collection.isEmpty() ? 1 : 0)) {
            return null;
        }
        Prayer var2 = null;
        int var3 = llIlIlllllI[3];
        int var4 = llIlIlllllI[3];
        int var5 = llIlIlllllI[3];
        Iterator var6 = var1.iterator();
        while (aR.lIlIlIIIIllIlI(var6.hasNext() ? 1 : 0)) {
            aS var7 = (aS)var6.next();
            if (!aR.lIlIlIIIIlIlll(var7.bH())) continue;
            if (aR.lIlIlIIIIllIlI(var7.bH().isDead() ? 1 : 0)) {

                return null;
            }
            if (aR.lIlIlIIIIllIll(var7.bI(), Prayer.PROTECT_FROM_MELEE) && aR.lIlIlIIIIlllII(var2)) {
                ++var5;
                var2 = Prayer.PROTECT_FROM_MELEE;
            }
            if (aR.lIlIlIIIIllIll(var7.bI(), Prayer.PROTECT_FROM_MAGIC) && (!aR.lIlIlIIIIlllIl(var2, Prayer.PROTECT_FROM_MELEE) || aR.lIlIlIIIIlllII(var2))) {
                var3 += 2;
                var2 = Prayer.PROTECT_FROM_MAGIC;
            }
            if (aR.lIlIlIIIIllIll(var7.bI(), Prayer.PROTECT_FROM_MISSILES)) {
                var4 += 2;
                var2 = Prayer.PROTECT_FROM_MISSILES;
            }

            if ((44 + 7 - -7 + 108 ^ 47 + 89 - -13 + 14) > 0) continue;
            return null;
        }
        if (aR.lIlIlIIIIllIII(var3, var4) && aR.lIlIlIIIIllIII(var3, var5)) {
            return Prayer.PROTECT_FROM_MAGIC;
        }
        if (aR.lIlIlIIIIllIII(var5, var4)) {
            return Prayer.PROTECT_FROM_MELEE;
        }
        return Prayer.PROTECT_FROM_MISSILES;
    }

    private static boolean lIlIlIIIIlllIl(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIlIlIIIIllIIl(int n2) {
        return n2 > 0;
    }

    @Override
    public int aO() {
        return llIlIlllllI[2];
    }

    private static boolean lIlIlIIIIllIII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIlIIIlIIIII(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public List<Prayer> aN() {
        aR var8;
        NPC var9;
        Prayer var10;
        void var11;
        void var12;
        int n2 = NPCs.getAll(nPC -> {
            int n2;
            if (aR.lIlIlIIIIllIlI(nPC.getName().equals(llIlIllllIl[llIlIlllllI[12]]) ? 1 : 0) && aR.lIlIlIIIIlllll(nPC.isDead() ? 1 : 0)) {
                n2 = llIlIlllllI[1];

                if (-1 >= (0x91 ^ 0x95)) {
                    return false;
                }
            } else {
                n2 = llIlIlllllI[3];
            }
            return n2 != 0;
        }).size();
        int n3 = NPCs.getAll(nPC -> {
            int n2;
            if (aR.lIlIlIIIIllIlI(nPC.getName().equals(llIlIllllIl[llIlIlllllI[11]]) ? 1 : 0) && aR.lIlIlIIIIlllll(nPC.isDead() ? 1 : 0)) {
                n2 = llIlIlllllI[1];

                if (3 < 0) {
                    return false;
                }
            } else {
                n2 = llIlIlllllI[3];
            }
            return n2 != 0;
        }).size();
        Prayer prayer = Prayer.PROTECT_FROM_MELEE;
        if (aR.lIlIlIIIIlIllI(n3, n2)) {
            prayer = Prayer.PROTECT_FROM_MAGIC;

            }
        } else if (aR.lIlIlIIIIlIllI((int)var12, (int)var11)) {
            var10 = Prayer.PROTECT_FROM_MISSILES;

            if (1 != 1) {
                return null;
            }
        } else {
            var9 = NPCs.getNearest(nPC -> {
                boolean bl2;
                NPC var13;
                if ((!aR.lIlIlIIIIlllll(nPC.getName().equals(llIlIllllIl[llIlIlllllI[9]]) ? 1 : 0) || aR.lIlIlIIIIllIlI(nPC.getName().equals(llIlIllllIl[llIlIlllllI[10]]) ? 1 : 0)) && aR.lIlIlIIIIlllll(var13.isDead() ? 1 : 0)) {
                    bl2 = llIlIlllllI[1];

                    if ((0x44 ^ 0x18 ^ (0xC1 ^ 0x99)) <= 2) {
                        return ((0xDE ^ 0x9D ^ (0x5A ^ 0x2A)) & (55 + 25 - 66 + 227 ^ 80 + 39 - -19 + 56 ^ -1)) != 0;
                    }
                } else {
                    bl2 = llIlIlllllI[3];
                }
                return bl2;
            });
            if (!aR.lIlIlIIIIlIlll(var9) || aR.lIlIlIIIIllIII(var9.distanceTo((Locatable)Players.getLocal()), llIlIlllllI[0])) {
                if (aR.lIlIlIIIIllIIl((int)var11)) {
                    var10 = Prayer.PROTECT_FROM_MAGIC;

                    }
                }
            } else {
                var10 = Prayer.PROTECT_FROM_MELEE;
            }
        }
        if (aR.lIlIlIIIIlIlll(var9 = var8.m(Static.getClient().getTickCount() + llIlIlllllI[1]))) {
            var10 = var9;
        }
        if (aR.lIlIlIIIIlIlll(var10)) {
            return List.of(var8.aQ(), var10);
        }
        return List.of(this.aQ());
    }

    private static boolean lIlIlIIIIllllI(int n2, int n3) {
        return n2 == n3;
    }

        return String.valueOf(var14);
    }

    @Override
    public v aT() {
        return v.FLICK;
    }

    private static boolean lIlIlIIIIlIlll(Object object) {
        return object != null;
    }

    @Override
    public boolean aS() {
        return llIlIlllllI[1];
    }

    /*
     * WARNING - void declaration
     */
    private void a(Actor actor, Prayer prayer) {
        int n2 = Static.getClient().getTickCount() + llIlIlllllI[8];
        aS aS2 = new aS(actor, prayer);
        if (aR.lIlIlIIIIlllll(this.en.containsKey(n2) ? 1 : 0)) {
            ArrayList<aS> arrayList = new ArrayList<aS>();
            arrayList.add(aS2);

            this.en.put(n2, arrayList);

            if (3 < 1) {
                return;
            }
        } else {
            void var15;
            void var16;
            aR var17;
            List<aS> var18 = var17.en.get((int)var16);
            var18.add((aS)var15);

            var17.en.put((int)var16, var18);

        }
    }

    private static void lIlIlIIIIlIlII() {
        llIlIllllIl = new String[llIlIlllllI[15]];
        aR.llIlIllllIl[aR.llIlIlllllI[3]] = "Baboon Mage";
        aR.llIlIllllIl[aR.llIlIlllllI[1]] = "Baboon Thrower";
        aR.llIlIllllIl[aR.llIlIlllllI[0]] = "Baboon Brawler";
        aR.llIlIllllIl[aR.llIlIlllllI[7]] = "Baboon Thrall";
        aR.llIlIllllIl[aR.llIlIlllllI[8]] = "Baboon";
        aR.llIlIllllIl[aR.llIlIlllllI[9]] = "Baboon Brawler";
        aR.llIlIllllIl[aR.llIlIlllllI[10]] = "Baboon Thrall";
        aR.llIlIllllIl[aR.llIlIlllllI[11]] = "Baboon Mage";
        aR.llIlIllllIl[aR.llIlIlllllI[12]] = "Baboon Thrower";
    }

    private static boolean lIlIlIIIIlIllI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIlIIIIllIlI(int n2) {
        return n2 != 0;
    }

    static {
        aR.lIlIlIIIIlIlIl();
        aR.lIlIlIIIIlIlII();
        ek = llIlIlllllI[13];
        em = llIlIlllllI[6];
        el = llIlIlllllI[14];
    }

    private static boolean lIlIlIIIIlllll(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIlIIIIllIll(Object object, Object object2) {
        return object == object2;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(AnimationChanged animationChanged) {
        aR var19;
        void var20;
        Actor actor = animationChanged.getActor();
        if (aR.lIlIlIIIIllIlI(actor instanceof Player)) {
            return;
        }
        NPC var21 = (NPC)var20;
        if (aR.lIlIlIIIIllllI(var21.getAnimation(), llIlIlllllI[4]) && aR.lIlIlIIIIllIlI(var21.getName().equals(llIlIllllIl[llIlIlllllI[3]]) ? 1 : 0)) {
            var19.a((Actor)var21, Prayer.PROTECT_FROM_MAGIC);
        }
        if (aR.lIlIlIIIIllllI(var21.getAnimation(), llIlIlllllI[5]) && aR.lIlIlIIIIllIlI(var21.getName().equals(llIlIllllIl[llIlIlllllI[1]]) ? 1 : 0)) {
            var19.a((Actor)var21, Prayer.PROTECT_FROM_MISSILES);
        }
        if (aR.lIlIlIIIIllllI(var21.getAnimation(), llIlIlllllI[6]) && (!aR.lIlIlIIIIlllll(var21.getName().equals(llIlIllllIl[llIlIlllllI[0]]) ? 1 : 0) || aR.lIlIlIIIIllIlI(var21.getName().equals(llIlIllllIl[llIlIlllllI[7]]) ? 1 : 0))) {
            var19.a((Actor)var21, Prayer.PROTECT_FROM_MELEE);
        }
    }
}

