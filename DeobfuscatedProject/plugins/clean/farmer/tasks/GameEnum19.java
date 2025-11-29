/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.GameEnum56;
import gg.squire.farmer.tasks.QHelper;
import -.m.e.a.u.s.r.r.q.i.r.e.f.R;
import -.m.e.a.u.s.r.r.q.i.r.e.f.S;
import gg.squire.farmer.tasks.THelper;
import -.m.e.a.u.s.r.r.q.i.r.e.f.U;
import -.m.e.a.u.s.r.r.q.i.r.e.f.V;
import -.m.e.a.u.s.r.r.q.i.r.e.f.W;
import gg.squire.farmer.tasks.XHelper;
import -.m.e.a.u.s.r.r.q.i.r.e.f.Y;
import -.m.e.a.u.s.r.r.q.i.r.e.f.Z;
import -.m.e.a.u.s.r.r.q.i.r.e.f.aa;
import gg.squire.farmer.tasks.ABHelper;
import -.m.e.a.u.s.r.r.q.i.r.e.f.ac;
import gg.squire.farmer.tasks.ADHelper;
import gg.squire.farmer.tasks.AEHelper;
import gg.squire.farmer.tasks.AFHelper;
import gg.squire.farmer.tasks.AGHelper;
import -.m.e.a.u.s.r.r.q.i.r.e.f.ah;
import gg.squire.farmer.tasks.AIHelper;
import -.m.e.a.u.s.r.r.q.i.r.e.f.aj;
import gg.squire.farmer.tasks.AKHelper;
import -.m.e.a.u.s.r.r.q.i.r.e.f.al;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public abstract class GameEnum19
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
        P.llllIIllIIIlIl();
        P.llllIIllIIIlII();
        BELLADONNA = new QHelper(A.SPECIAL, llIIIIllIIlI[llIIIIllIIll[0]], llIIIIllIIll[1]);
        MUSHROOM = new ABHelper(A.SPECIAL, llIIIIllIIlI[llIIIIllIIll[3]], llIIIIllIIll[1]);
        HESPORI = new AFHelper(A.SPECIAL, llIIIIllIIlI[llIIIIllIIll[5]], llIIIIllIIll[0]);
        ALLOTMENT = new AGHelper(A.ALLOTMENT, llIIIIllIIlI[llIIIIllIIll[7]], llIIIIllIIll[1]);
        HERB = new ah(A.HERB, llIIIIllIIlI[llIIIIllIIll[9]], llIIIIllIIlI[llIIIIllIIll[10]], llIIIIllIIll[1]);
        FLOWER = new AIHelper(A.FLOWER, llIIIIllIIlI[llIIIIllIIll[12]], llIIIIllIIll[1]);
        BUSH = new aj(A.BUSH, llIIIIllIIlI[llIIIIllIIll[14]], llIIIIllIIll[0]);
        FRUIT_TREE = new AKHelper(A.FRUIT_TREE, llIIIIllIIlI[llIIIIllIIll[16]], llIIIIllIIll[0]);
        HOPS = new al(A.HOPS, llIIIIllIIlI[llIIIIllIIll[18]], llIIIIllIIll[1]);
        TREE = new R(A.TREE, llIIIIllIIlI[llIIIIllIIll[20]], llIIIIllIIll[0]);
        HARDWOOD_TREE = new S(A.TREE, llIIIIllIIlI[llIIIIllIIll[22]], llIIIIllIIll[0]);
        REDWOOD = new THelper(A.TREE, llIIIIllIIlI[llIIIIllIIll[24]], llIIIIllIIll[0]);
        SPIRIT_TREE = new U(A.TREE, llIIIIllIIlI[llIIIIllIIll[26]], llIIIIllIIll[0]);
        ANIMA = new V(A.SPECIAL, llIIIIllIIlI[llIIIIllIIll[28]], llIIIIllIIll[1]);
        CACTUS = new W(A.SPECIAL, llIIIIllIIlI[llIIIIllIIll[30]], llIIIIllIIll[0]);
        SEAWEED = new XHelper(A.SPECIAL, llIIIIllIIlI[llIIIIllIIll[32]], llIIIIllIIll[1]);
        CALQUAT = new Y(A.FRUIT_TREE, llIIIIllIIlI[llIIIIllIIll[34]], llIIIIllIIll[0]);
        CELASTRUS = new Z(A.FRUIT_TREE, llIIIIllIIlI[llIIIIllIIll[36]], llIIIIllIIll[0]);
        GRAPES = new aa(A.GRAPE, llIIIIllIIlI[llIIIIllIIll[38]], llIIIIllIIll[0]);
        CRYSTAL_TREE = new ac(A.FRUIT_TREE, llIIIIllIIlI[llIIIIllIIll[40]], llIIIIllIIll[0]);
        COMPOST = new ADHelper(A.SPECIAL, llIIIIllIIlI[llIIIIllIIll[42]], llIIIIllIIll[0]);
        GIANT_COMPOST = new AEHelper(A.SPECIAL, llIIIIllIIlI[llIIIIllIIll[44]], llIIIIllIIll[0]);
        P[] pArray = new P[llIIIIllIIll[22]];
        pArray[P.llIIIIllIIll[1]] = BELLADONNA;
        pArray[P.llIIIIllIIll[0]] = MUSHROOM;
        pArray[P.llIIIIllIIll[2]] = HESPORI;
        pArray[P.llIIIIllIIll[3]] = ALLOTMENT;
        pArray[P.llIIIIllIIll[4]] = HERB;
        pArray[P.llIIIIllIIll[5]] = FLOWER;
        pArray[P.llIIIIllIIll[6]] = BUSH;
        pArray[P.llIIIIllIIll[7]] = FRUIT_TREE;
        pArray[P.llIIIIllIIll[8]] = HOPS;
        pArray[P.llIIIIllIIll[9]] = TREE;
        pArray[P.llIIIIllIIll[10]] = HARDWOOD_TREE;
        pArray[P.llIIIIllIIll[11]] = REDWOOD;
        pArray[P.llIIIIllIIll[12]] = SPIRIT_TREE;
        pArray[P.llIIIIllIIll[13]] = ANIMA;
        pArray[P.llIIIIllIIll[14]] = CACTUS;
        pArray[P.llIIIIllIIll[15]] = SEAWEED;
        pArray[P.llIIIIllIIll[16]] = CALQUAT;
        pArray[P.llIIIIllIIll[17]] = CELASTRUS;
        pArray[P.llIIIIllIIll[18]] = GRAPES;
        pArray[P.llIIIIllIIll[19]] = CRYSTAL_TREE;
        pArray[P.llIIIIllIIll[20]] = COMPOST;
        pArray[P.llIIIIllIIll[21]] = GIANT_COMPOST;
        $VALUES = pArray;
    }

        return String.valueOf(var1);
    }

    public boolean aT() {
        boolean bl;
        if (!P.llllIIllIIIllI((Object)this, (Object)HERB) || !P.llllIIllIIIllI((Object)this, (Object)BUSH) || !P.llllIIllIIIllI((Object)this, (Object)SEAWEED) || P.llllIIllIIIlll((Object)this, (Object)GRAPES)) {
            bl = llIIIIllIIll[0];

            if (((179 + 84 - 134 + 76 ^ 118 + 49 - 164 + 145) & (0x31 ^ 0x6B ^ 3 ^ -1)) != 0) {
                return ((0x7B ^ 0x20 ^ (0xA0 ^ 0xB2)) & (63 + 120 - 53 + 110 ^ 72 + 78 - -31 + 4 ^ -1)) != 0;
            }
        } else {
            bl = llIIIIllIIll[1];
        }
        return bl;
    }

    private static boolean llllIIllIIIlll(Object object, Object object2) {
        return object == object2;
    }

    public boolean aS() {
        boolean bl;
        if (!P.llllIIllIIIllI((Object)this, (Object)TREE) || P.llllIIllIIIlll((Object)this, (Object)FRUIT_TREE)) {
            bl = llIIIIllIIll[0];

            if (3 > 3) {
                return false;
            }
        } else {
            bl = llIIIIllIIll[1];
        }
        return bl;
    }

    GameEnum19(A a2, String string2, boolean bl) {
        this(a2, string2, string2, bl);
    }

    private static void llllIIllIIIlII() {
        llIIIIllIIlI = new String[llIIIIllIIll[45]];
        P.llIIIIllIIlI[P.llIIIIllIIll[1]] = "BELLADONNA";
        P.llIIIIllIIlI[P.llIIIIllIIll[0]] = P.llllIIllIIIIIl("", "KBbHB");
        P.llIIIIllIIlI[P.llIIIIllIIll[2]] = "MUSHROOM";
        P.llIIIIllIIlI[P.llIIIIllIIll[3]] = P.llllIIllIIIIlI("tBbeOVX5uvU=", "lveGn");
        P.llIIIIllIIlI[P.llIIIIllIIll[4]] = "HESPORI";
        P.llIIIIllIIlI[P.llIIIIllIIll[5]] = P.llllIIllIIIIIl("", "dRWJB");
        P.llIIIIllIIlI[P.llIIIIllIIll[6]] = "ALLOTMENT";
        P.llIIIIllIIlI[P.llIIIIllIIll[7]] = "Allotment";
        P.llIIIIllIIlI[P.llIIIIllIIll[8]] = "HERB";
        P.llIIIIllIIlI[P.llIIIIllIIll[9]] = "Herb patch";
        P.llIIIIllIIlI[P.llIIIIllIIll[10]] = "Herbs";
        P.llIIIIllIIlI[P.llIIIIllIIll[11]] = "FLOWER";
        P.llIIIIllIIlI[P.llIIIIllIIll[12]] = "Flower Patch";
        P.llIIIIllIIlI[P.llIIIIllIIll[13]] = "BUSH";
        P.llIIIIllIIlI[P.llIIIIllIIll[14]] = P.llllIIllIIIIIl("", "HhCDi");
        P.llIIIIllIIlI[P.llIIIIllIIll[15]] = "FRUIT_TREE";
        P.llIIIIllIIlI[P.llIIIIllIIll[16]] = P.llllIIllIIIIlI("Ba2m8cFQ65w=", "YoudW");
        P.llIIIIllIIlI[P.llIIIIllIIll[17]] = "HOPS";
        P.llIIIIllIIlI[P.llIIIIllIIll[18]] = P.llllIIllIIIIll("BYI129CFvkE=", "iAImi");
        P.llIIIIllIIlI[P.llIIIIllIIll[19]] = "TREE";
        P.llIIIIllIIlI[P.llIIIIllIIll[20]] = P.llllIIllIIIIll("VHIeA2ej0Ws=", "MbpQn");
        P.llIIIIllIIlI[P.llIIIIllIIll[21]] = "HARDWOOD_TREE";
        P.llIIIIllIIlI[P.llIIIIllIIll[22]] = "Hardwood Trees";
        P.llIIIIllIIlI[P.llIIIIllIIll[23]] = "REDWOOD";
        P.llIIIIllIIlI[P.llIIIIllIIll[24]] = "Redwood Trees";
        P.llIIIIllIIlI[P.llIIIIllIIll[25]] = "SPIRIT_TREE";
        P.llIIIIllIIlI[P.llIIIIllIIll[26]] = "Spirit Trees";
        P.llIIIIllIIlI[P.llIIIIllIIll[27]] = "ANIMA";
        P.llIIIIllIIlI[P.llIIIIllIIll[28]] = P.llllIIllIIIIll("nOmuEGqiFG0=", "agvOZ");
        P.llIIIIllIIlI[P.llIIIIllIIll[29]] = "CACTUS";
        P.llIIIIllIIlI[P.llIIIIllIIll[30]] = "Cactus";
        P.llIIIIllIIlI[P.llIIIIllIIll[31]] = "SEAWEED";
        P.llIIIIllIIlI[P.llIIIIllIIll[32]] = "Seaweed";
        P.llIIIIllIIlI[P.llIIIIllIIll[33]] = "CALQUAT";
        P.llIIIIllIIlI[P.llIIIIllIIll[34]] = "Calquat";
        P.llIIIIllIIlI[P.llIIIIllIIll[35]] = "CELASTRUS";
        P.llIIIIllIIlI[P.llIIIIllIIll[36]] = "Celastrus";
        P.llIIIIllIIlI[P.llIIIIllIIll[37]] = "GRAPES";
        P.llIIIIllIIlI[P.llIIIIllIIll[38]] = P.llllIIllIIIIlI("1VDJfTdZTcs=", "tlCYa");
        P.llIIIIllIIlI[P.llIIIIllIIll[39]] = "CRYSTAL_TREE";
        P.llIIIIllIIlI[P.llIIIIllIIll[40]] = "Crystal Tree";
        P.llIIIIllIIlI[P.llIIIIllIIll[41]] = "COMPOST";
        P.llIIIIllIIlI[P.llIIIIllIIll[42]] = "Compost Bin";
        P.llIIIIllIIlI[P.llIIIIllIIll[43]] = "GIANT_COMPOST";
        P.llIIIIllIIlI[P.llIIIIllIIll[44]] = "Big Compost Bin";
    }

    public boolean aR() {
        boolean bl;
        if (!P.llllIIllIIIllI((Object)this, (Object)COMPOST) || P.llllIIllIIIlll((Object)this, (Object)GIANT_COMPOST)) {
            bl = llIIIIllIIll[0];

            }
        } else {
            bl = llIIIIllIIll[1];
        }
        return bl;
    }

    public String aV() {
        return this.unplanted;
    }

    public A aU() {
        return this.runType;
    }

    private static boolean llllIIllIIlIII(int n2, int n3) {
        return n2 < n3;
    }

    GameEnum19(A a2, String string2, String string3, boolean bl) {
        this(a2, string2, string2, string3, bl);
    }

    private static boolean llllIIllIIIllI(Object object, Object object2) {
        return object != object2;
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
        return Enum.valueOf(GameEnum19.class, string);
    }

    private GameEnum19(A a2, String string2, String string3, String string4, boolean bl) {
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

