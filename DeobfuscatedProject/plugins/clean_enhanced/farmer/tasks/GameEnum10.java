/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.GameEnum17;
import gg.squire.farmer.tasks.QHelper;
import gg.squire.farmer.tasks.RHelper;
import gg.squire.farmer.tasks.SHelper;
import gg.squire.farmer.tasks.THelper;
import gg.squire.farmer.tasks.UHelper;
import gg.squire.farmer.tasks.VHelper;
import gg.squire.farmer.tasks.WHelper;
import gg.squire.farmer.tasks.XHelper;
import gg.squire.farmer.tasks.YHelper;
import gg.squire.farmer.tasks.ZHelper;
import -.m.e.a.u.s.r.r.q.i.r.e.f.aa;
import -.m.e.a.u.s.r.r.q.i.r.e.f.ab;
import -.m.e.a.u.s.r.r.q.i.r.e.f.ac;
import -.m.e.a.u.s.r.r.q.i.r.e.f.ad;
import -.m.e.a.u.s.r.r.q.i.r.e.f.ae;
import -.m.e.a.u.s.r.r.q.i.r.e.f.af;
import -.m.e.a.u.s.r.r.q.i.r.e.f.ag;
import -.m.e.a.u.s.r.r.q.i.r.e.f.ah;
import -.m.e.a.u.s.r.r.q.i.r.e.f.ai;
import -.m.e.a.u.s.r.r.q.i.r.e.f.aj;
import -.m.e.a.u.s.r.r.q.i.r.e.f.ak;
import -.m.e.a.u.s.r.r.q.i.r.e.f.al;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an;
import javax.annotation.Nullable;

public abstract class GameEnum10
extends Enum<P> {
    public static final  /* enum */ P GRAPES;
    public static final  /* enum */ P SPIRIT_TREE;
    public static final  /* enum */ P HESPORI;
    public static final  /* enum */ P BELLADONNA;
    private static final  P[] $VALUES;
    public static final  /* enum */ P HERB;
    public static final  /* enum */ P SEAWEED;
    public static final  /* enum */ P GIANT_COMPOST;
    public static final  /* enum */ P CRYSTAL_TREE;
    private final  String unplanted;
    public static final  /* enum */ P CACTUS;
    public static final  /* enum */ P BUSH;
    public static final  /* enum */ P TREE;
    public static final  /* enum */ P HOPS;
    private final  boolean healthCheckRequired;
    public static final  /* enum */ P CALQUAT;
    public static final  /* enum */ P FRUIT_TREE;
    public static final  /* enum */ P ALLOTMENT;
    private final  String name;
    public static final  /* enum */ P HARDWOOD_TREE;
    
    private final  A runType;
    public static final  /* enum */ P CELASTRUS;
    public static final  /* enum */ P MUSHROOM;
    private final  String planted;
    
    public static final  /* enum */ P ANIMA;
    public static final  /* enum */ P FLOWER;
    public static final  /* enum */ P REDWOOD;
    public static final  /* enum */ P COMPOST;

    static {
        P.var3();
        P.var4();
        BELLADONNA = new QHelper(A.SPECIAL, var2[0], 1);
        MUSHROOM = new ab(A.SPECIAL, var2[3], 1);
        HESPORI = new af(A.SPECIAL, var2[5], 0);
        ALLOTMENT = new ag(A.ALLOTMENT, var2[7], 1);
        HERB = new ah(A.HERB, var2[9], var2[var1[10]], 1);
        FLOWER = new ai(A.FLOWER, var2[var1[12]], 1);
        BUSH = new aj(A.BUSH, var2[var1[14]], 0);
        FRUIT_TREE = new ak(A.FRUIT_TREE, var2[var1[16]], 0);
        HOPS = new al(A.HOPS, var2[var1[18]], 1);
        TREE = new RHelper(A.TREE, var2[var1[20]], 0);
        HARDWOOD_TREE = new SHelper(A.TREE, var2[var1[22]], 0);
        REDWOOD = new THelper(A.TREE, var2[var1[24]], 0);
        SPIRIT_TREE = new UHelper(A.TREE, var2[var1[26]], 0);
        ANIMA = new VHelper(A.SPECIAL, var2[var1[28]], 1);
        CACTUS = new WHelper(A.SPECIAL, var2[var1[30]], 0);
        SEAWEED = new XHelper(A.SPECIAL, var2[var1[32]], 1);
        CALQUAT = new YHelper(A.FRUIT_TREE, var2[var1[34]], 0);
        CELASTRUS = new ZHelper(A.FRUIT_TREE, var2[var1[36]], 0);
        GRAPES = new aa(A.GRAPE, var2[var1[38]], 0);
        CRYSTAL_TREE = new ac(A.FRUIT_TREE, var2[var1[40]], 0);
        COMPOST = new ad(A.SPECIAL, var2[var1[42]], 0);
        GIANT_COMPOST = new ae(A.SPECIAL, var2[var1[44]], 0);
        P[] pArray = new P[var1[22]];
        pArray[1] = BELLADONNA;
        pArray[0] = MUSHROOM;
        pArray[2] = HESPORI;
        pArray[3] = ALLOTMENT;
        pArray[4] = HERB;
        pArray[5] = FLOWER;
        pArray[6] = BUSH;
        pArray[7] = FRUIT_TREE;
        pArray[8] = HOPS;
        pArray[9] = TREE;
        pArray[P.var1[10]] = HARDWOOD_TREE;
        pArray[P.var1[11]] = REDWOOD;
        pArray[P.var1[12]] = SPIRIT_TREE;
        pArray[P.var1[13]] = ANIMA;
        pArray[P.var1[14]] = CACTUS;
        pArray[P.var1[15]] = SEAWEED;
        pArray[P.var1[16]] = CALQUAT;
        pArray[P.var1[17]] = CELASTRUS;
        pArray[P.var1[18]] = GRAPES;
        pArray[P.var1[19]] = CRYSTAL_TREE;
        pArray[P.var1[20]] = COMPOST;
        pArray[P.var1[21]] = GIANT_COMPOST;
        $VALUES = pArray;
    }

    private static String var5(String var6, String var7) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var9 = var7.toCharArray();
        int var10 = 1;
        char[] var11 = var6.toCharArray();
        int var12 = var11.length;
        int var13 = 1;
        while (var13 < var12) {
            char var14 = var11[var13];
            var8.append((char)(var14 ^ var9[var10 % var9.length]));
            0;
            ++var10;
            ++var13;
            0;
            if ((19 + 152 - 98 + 104 ^ 172 + 38 - 154 + 124) != 0) continue;
            return null;
        }
        return String.valueOf(var8);
    }

    public boolean aT() {
        boolean bl;
        if (!((Object)this != (Object)this2)HERB) || !((Object)this != (Object)this2)BUSH) || !((Object)this != (Object)this2)SEAWEED) || ((Object)this == (Object)this2)GRAPES)) {
            bl = 0;
            0;
            if (((179 + 84 - 134 + 76 ^ 118 + 49 - 164 + 145) & (0x31 ^ 0x6B ^ 3 ^ -1)) != 0) {
                return ((0x7B ^ 0x20 ^ (0xA0 ^ 0xB2)) & (63 + 120 - 53 + 110 ^ 72 + 78 - -31 + 4 ^ -1)) != 0;
            }
        } else {
            bl = 1;
        }
        return bl;
    }

    public boolean aS() {
        boolean bl;
        if (!((Object)this != (Object)this2)TREE) || ((Object)this == (Object)this2)FRUIT_TREE)) {
            bl = 0;
            0;
            if (3 > 3) {
                return ((0xA6 ^ 0x98) & ~(0x63 ^ 0x5D)) != 0;
            }
        } else {
            bl = 1;
        }
        return bl;
    }

    GameEnum10(A a2, String string2, boolean bl) {
        this(a2, string2, string2, bl);
    }

    public boolean aR() {
        boolean bl;
        if (!((Object)this != (Object)this2)COMPOST) || ((Object)this == (Object)this2)GIANT_COMPOST)) {
            bl = 0;
            0;
            if null != null {
                return ((0x1A ^ 0x1D) & ~(0x8D ^ 0x8A)) != 0;
            }
        } else {
            bl = 1;
        }
        return bl;
    }

    public String aV() {
        return this.unplanted;
    }

    public A aU() {
        return this.runType;
    }

    GameEnum10(A a2, String string2, String string3, boolean bl) {
        this(a2, string2, string2, string3, bl);
    }

        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }

    public String aW() {
        return this.planted;
    }

    public String ac() {
        return this.name;
    }

    public boolean aX() {
        return this.healthCheckRequired;
    }

    public static P valueOf(String string) {
        return Enum.valueOf(GameEnum10.class, string);
    }

    private GameEnum10(A a2, String string2, String string3, String string4, boolean bl) {
        this.runType = a2;
        this.name = string2;
        this.healthCheckRequired = bl;
        this.unplanted = string3;
        this.planted = string4;
    }

    @Nullable
    public abstract an f(int var1);

    public static P[] values() {
        return (P[])$VALUES.clone();
    }
}

