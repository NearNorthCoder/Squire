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
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

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
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.W;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aS;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.v;

/* TASK: Handling babboon prayers -> HandlingbabboonprayersTask */
@TaskDesc(name="Handling babboon prayers", priority=0x7FFFFFFF, register=true)
public class aR
extends W {
    private static final /* synthetic */ int em;
    private final /* synthetic */ Map<Integer, List<aS>> en;
    private static final /* synthetic */ int el;
    private static /* synthetic */ int[] llIlIlllllI;
    private static /* synthetic */ String[] llIlIllllIl;
    private static final /* synthetic */ int ek;

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
                0;
                if ((0x56 ^ 0x52) < 0) {
                    return false;
                }
            } else {
                n2 = llIlIlllllI[3];
            }
            return n2 != 0;
        }))) {
            bl2 = llIlIlllllI[1];
            0;
            if (2 != 2) {
                return false;
            }
        } else {
            bl2 = llIlIlllllI[3];
        }
        return bl2;
    }

    @Inject
    public aR(SquireAutoTOA squireAutoTOA, TOAConfig tOAConfig) {
        super(squireAutoTOA, tOAConfig);
        this.en = new HashMap<Integer, List<aS>>();
    }

    /*
     * WARNING - void declaration
     */
    private Prayer m(int n2) {
        void var14;
        Collection collection = this.en.get(n2);
        if (!aR.lIlIlIIIIlIlll(collection) || aR.lIlIlIIIIllIlI(collection.isEmpty() ? 1 : 0)) {
            return null;
        }
        Prayer var13 = null;
        int var37 = llIlIlllllI[3];
        int var1 = llIlIlllllI[3];
        int var31 = llIlIlllllI[3];
        Iterator var8 = var14.iterator();
        while (aR.lIlIlIIIIllIlI(var8.hasNext() ? 1 : 0)) {
            aS var38 = (aS)var8.next();
            if (!aR.lIlIlIIIIlIlll(var38.bH())) continue;
            if (aR.lIlIlIIIIllIlI(var38.bH().isDead() ? 1 : 0)) {
                0;
                
                return null;
            }
            if (aR.lIlIlIIIIllIll(var38.bI(), Prayer.PROTECT_FROM_MELEE) && aR.lIlIlIIIIlllII(var13)) {
                ++var31;
                var13 = Prayer.PROTECT_FROM_MELEE;
            }
            if (aR.lIlIlIIIIllIll(var38.bI(), Prayer.PROTECT_FROM_MAGIC) && (!aR.lIlIlIIIIlllIl(var13, Prayer.PROTECT_FROM_MELEE) || aR.lIlIlIIIIlllII(var13))) {
                var37 += 2;
                var13 = Prayer.PROTECT_FROM_MAGIC;
            }
            if (aR.lIlIlIIIIllIll(var38.bI(), Prayer.PROTECT_FROM_MISSILES)) {
                var1 += 2;
                var13 = Prayer.PROTECT_FROM_MISSILES;
            }
            0;
            if ((44 + 7 - -7 + 108 ^ 47 + 89 - -13 + 14) > 0) continue;
            return null;
        }
        if (aR.lIlIlIIIIllIII(var37, var1) && aR.lIlIlIIIIllIII(var37, var31)) {
            return Prayer.PROTECT_FROM_MAGIC;
        }
        if (aR.lIlIlIIIIllIII(var31, var1)) {
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

    private static String lIlIlIIIIlIIll(String var34, String var32) {
        try {
            SecretKeySpec var30 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var32.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var5 = Cipher.getInstance("Blowfish");
            var5.init(llIlIlllllI[0], var30);
            return new String(var5.doFinal(Base64.getDecoder().decode(var34.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlIIIlIIIII(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public List<Prayer> aN() {
        aR var33;
        NPC var25;
        Prayer var7;
        void var16;
        void var26;
        int n2 = NPCs.getAll(nPC -> {
            int n2;
            if (aR.lIlIlIIIIllIlI(nPC.getName().equals(llIlIllllIl[llIlIlllllI[12]]) ? 1 : 0) && aR.lIlIlIIIIlllll(nPC.isDead() ? 1 : 0)) {
                n2 = llIlIlllllI[1];
                0;
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
                0;
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
            0;
            
            }
        } else if (aR.lIlIlIIIIlIllI((int)var26, (int)var16)) {
            var7 = Prayer.PROTECT_FROM_MISSILES;
            0;
            if (1 != 1) {
                return null;
            }
        } else {
            var25 = NPCs.getNearest(nPC -> {
                boolean bl2;
                NPC var10;
                if ((!aR.lIlIlIIIIlllll(nPC.getName().equals(llIlIllllIl[llIlIlllllI[9]]) ? 1 : 0) || aR.lIlIlIIIIllIlI(nPC.getName().equals(llIlIllllIl[llIlIlllllI[10]]) ? 1 : 0)) && aR.lIlIlIIIIlllll(var10.isDead() ? 1 : 0)) {
                    bl2 = llIlIlllllI[1];
                    0;
                    if ((0x44 ^ 0x18 ^ (0xC1 ^ 0x99)) <= 2) {
                        return ((0xDE ^ 0x9D ^ (0x5A ^ 0x2A)) & (55 + 25 - 66 + 227 ^ 80 + 39 - -19 + 56 ^ -1)) != 0;
                    }
                } else {
                    bl2 = llIlIlllllI[3];
                }
                return bl2;
            });
            if (!aR.lIlIlIIIIlIlll(var25) || aR.lIlIlIIIIllIII(var25.distanceTo((Locatable)Players.getLocal()), llIlIlllllI[0])) {
                if (aR.lIlIlIIIIllIIl((int)var16)) {
                    var7 = Prayer.PROTECT_FROM_MAGIC;
                    0;
                    
                    }
                }
            } else {
                var7 = Prayer.PROTECT_FROM_MELEE;
            }
        }
        if (aR.lIlIlIIIIlIlll(var25 = var33.m(Static.getClient().getTickCount() + llIlIlllllI[1]))) {
            var7 = var25;
        }
        if (aR.lIlIlIIIIlIlll(var7)) {
            return List.of(var33.aQ(), var7);
        }
        return List.of(this.aQ());
    }

    private static boolean lIlIlIIIIllllI(int n2, int n3) {
        return n2 == n3;
    }

    private static String lIlIlIIIIlIIIl(String var4, String var17) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var3 = new StringBuilder();
        char[] var27 = var17.toCharArray();
        int var9 = llIlIlllllI[3];
        char[] var18 = var4.toCharArray();
        int var36 = var18.length;
        int var11 = llIlIlllllI[3];
        while (aR.lIlIlIIIlIIIII(var11, var36)) {
            char var24 = var18[var11];
            var3.append((char)(var24 ^ var27[var9 % var27.length]));
            0;
            ++var9;
            ++var11;
            0;
            if ((0x14 ^ 0x10) != 0) continue;
            return null;
        }
        return String.valueOf(var3);
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
            0;
            this.en.put(n2, arrayList);
            0;
            0;
            if (3 < 1) {
                return;
            }
        } else {
            void var6;
            void var12;
            aR var2;
            List<aS> var23 = var2.en.get((int)var12);
            var23.add((aS)var6);
            0;
            var2.en.put((int)var12, var23);
            0;
        }
    }

    private static void lIlIlIIIIlIlII() {
        llIlIllllIl = new String[llIlIlllllI[15]];
        aR.llIlIllllIl[aR.llIlIlllllI[3]] = aR."Baboon Mage";
        aR.llIlIllllIl[aR.llIlIlllllI[1]] = aR."Baboon Thrower";
        aR.llIlIllllIl[aR.llIlIlllllI[0]] = aR."Baboon Brawler";
        aR.llIlIllllIl[aR.llIlIlllllI[7]] = aR."Baboon Thrall";
        aR.llIlIllllIl[aR.llIlIlllllI[8]] = aR."Baboon";
        aR.llIlIllllIl[aR.llIlIlllllI[9]] = aR."Baboon Brawler";
        aR.llIlIllllIl[aR.llIlIlllllI[10]] = aR."Baboon Thrall";
        aR.llIlIllllIl[aR.llIlIlllllI[11]] = aR."Baboon Mage";
        aR.llIlIllllIl[aR.llIlIlllllI[12]] = aR."Baboon Thrower";
    }

    private static boolean lIlIlIIIIlIllI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIlIIIIllIlI(int n2) {
        return n2 != 0;
    }

    private static String lIlIlIIIIlIIlI(String var39, String var15) {
        try {
            SecretKeySpec var19 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var15.getBytes(StandardCharsets.UTF_8)), llIlIlllllI[12]), "DES");
            Cipher var22 = Cipher.getInstance("DES");
            var22.init(llIlIlllllI[0], var19);
            return new String(var22.doFinal(Base64.getDecoder().decode(var39.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
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

    private static void lIlIlIIIIlIlIl() {
        llIlIlllllI = new int[16];
        aR.llIlIlllllI[0] = 2;
        aR.llIlIlllllI[1] = 1;
        aR.llIlIlllllI[2] = -(0x35 ^ 0x10) & (0xFFFFFB77 & 0x3FFE);
        aR.llIlIlllllI[3] = (0xFA ^ 0xC2 ^ (5 ^ 0x1D)) & (22 + 74 - -34 + 51 ^ 3 + 5 - -77 + 64 ^ -1);
        aR.llIlIlllllI[4] = 0xFFFFEEBE & 0x3753;
        aR.llIlIlllllI[5] = 0xFFFFE759 & 0x3EB7;
        aR.llIlIlllllI[6] = 0xFFFFBF6E & 0x669F;
        aR.llIlIlllllI[7] = 3;
        aR.llIlIlllllI[8] = 0x47 ^ 0x43;
        aR.llIlIlllllI[9] = 124 + 156 - 183 + 94 ^ 28 + 33 - -4 + 121;
        aR.llIlIlllllI[10] = 0x81 ^ 0x87;
        aR.llIlIlllllI[11] = 0x1D ^ 0x1A;
        aR.llIlIlllllI[12] = 0 ^ 8;
        aR.llIlIlllllI[13] = 0xFFFFCDCA & 0x3AF7;
        aR.llIlIlllllI[14] = -(0xFFFFB3FD & 0x6D2B) & (0xFFFFB9EF & 0x6FFF);
        aR.llIlIlllllI[15] = 0xE8 ^ 0x83 ^ (0x72 ^ 0x10);
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(AnimationChanged animationChanged) {
        aR var35;
        void var28;
        Actor actor = animationChanged.getActor();
        if (aR.lIlIlIIIIllIlI(actor instanceof Player)) {
            return;
        }
        NPC var29 = (NPC)var28;
        if (aR.lIlIlIIIIllllI(var29.getAnimation(), llIlIlllllI[4]) && aR.lIlIlIIIIllIlI(var29.getName().equals(llIlIllllIl[llIlIlllllI[3]]) ? 1 : 0)) {
            var35.a((Actor)var29, Prayer.PROTECT_FROM_MAGIC);
        }
        if (aR.lIlIlIIIIllllI(var29.getAnimation(), llIlIlllllI[5]) && aR.lIlIlIIIIllIlI(var29.getName().equals(llIlIllllIl[llIlIlllllI[1]]) ? 1 : 0)) {
            var35.a((Actor)var29, Prayer.PROTECT_FROM_MISSILES);
        }
        if (aR.lIlIlIIIIllllI(var29.getAnimation(), llIlIlllllI[6]) && (!aR.lIlIlIIIIlllll(var29.getName().equals(llIlIllllIl[llIlIlllllI[0]]) ? 1 : 0) || aR.lIlIlIIIIllIlI(var29.getName().equals(llIlIllllIl[llIlIlllllI[7]]) ? 1 : 0))) {
            var35.a((Actor)var29, Prayer.PROTECT_FROM_MELEE);
        }
    }
}

