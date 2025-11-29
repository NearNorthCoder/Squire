/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import -.m.e.a.u.s.r.r.q.i.r.e.f.A;
import -.m.e.a.u.s.r.r.q.i.r.e.f.Q;
import -.m.e.a.u.s.r.r.q.i.r.e.f.R;
import -.m.e.a.u.s.r.r.q.i.r.e.f.S;
import -.m.e.a.u.s.r.r.q.i.r.e.f.T;
import -.m.e.a.u.s.r.r.q.i.r.e.f.U;
import -.m.e.a.u.s.r.r.q.i.r.e.f.V;
import -.m.e.a.u.s.r.r.q.i.r.e.f.W;
import -.m.e.a.u.s.r.r.q.i.r.e.f.X;
import -.m.e.a.u.s.r.r.q.i.r.e.f.Y;
import -.m.e.a.u.s.r.r.q.i.r.e.f.Z;
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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public abstract class P
extends Enum<P> {
    public static final /* synthetic */ /* enum */ P GRAPES;
    public static final /* synthetic */ /* enum */ P SPIRIT_TREE;
    public static final /* synthetic */ /* enum */ P HESPORI;
    public static final /* synthetic */ /* enum */ P BELLADONNA;
    private static final /* synthetic */ P[] $VALUES;
    public static final /* synthetic */ /* enum */ P HERB;
    public static final /* synthetic */ /* enum */ P SEAWEED;
    public static final /* synthetic */ /* enum */ P GIANT_COMPOST;
    public static final /* synthetic */ /* enum */ P CRYSTAL_TREE;
    private final /* synthetic */ String unplanted;
    public static final /* synthetic */ /* enum */ P CACTUS;
    public static final /* synthetic */ /* enum */ P BUSH;
    public static final /* synthetic */ /* enum */ P TREE;
    public static final /* synthetic */ /* enum */ P HOPS;
    private final /* synthetic */ boolean healthCheckRequired;
    public static final /* synthetic */ /* enum */ P CALQUAT;
    public static final /* synthetic */ /* enum */ P FRUIT_TREE;
    public static final /* synthetic */ /* enum */ P ALLOTMENT;
    private final /* synthetic */ String name;
    public static final /* synthetic */ /* enum */ P HARDWOOD_TREE;
    private static /* synthetic */ int[] llIIIIllIIll;
    private final /* synthetic */ A runType;
    public static final /* synthetic */ /* enum */ P CELASTRUS;
    public static final /* synthetic */ /* enum */ P MUSHROOM;
    private final /* synthetic */ String planted;
    private static /* synthetic */ String[] llIIIIllIIlI;
    public static final /* synthetic */ /* enum */ P ANIMA;
    public static final /* synthetic */ /* enum */ P FLOWER;
    public static final /* synthetic */ /* enum */ P REDWOOD;
    public static final /* synthetic */ /* enum */ P COMPOST;

    static {
        P.llllIIllIIIlIl();
        P.llllIIllIIIlII();
        BELLADONNA = new Q(A.SPECIAL, llIIIIllIIlI[llIIIIllIIll[0]], llIIIIllIIll[1]);
        MUSHROOM = new ab(A.SPECIAL, llIIIIllIIlI[llIIIIllIIll[3]], llIIIIllIIll[1]);
        HESPORI = new af(A.SPECIAL, llIIIIllIIlI[llIIIIllIIll[5]], llIIIIllIIll[0]);
        ALLOTMENT = new ag(A.ALLOTMENT, llIIIIllIIlI[llIIIIllIIll[7]], llIIIIllIIll[1]);
        HERB = new ah(A.HERB, llIIIIllIIlI[llIIIIllIIll[9]], llIIIIllIIlI[llIIIIllIIll[10]], llIIIIllIIll[1]);
        FLOWER = new ai(A.FLOWER, llIIIIllIIlI[llIIIIllIIll[12]], llIIIIllIIll[1]);
        BUSH = new aj(A.BUSH, llIIIIllIIlI[llIIIIllIIll[14]], llIIIIllIIll[0]);
        FRUIT_TREE = new ak(A.FRUIT_TREE, llIIIIllIIlI[llIIIIllIIll[16]], llIIIIllIIll[0]);
        HOPS = new al(A.HOPS, llIIIIllIIlI[llIIIIllIIll[18]], llIIIIllIIll[1]);
        TREE = new R(A.TREE, llIIIIllIIlI[llIIIIllIIll[20]], llIIIIllIIll[0]);
        HARDWOOD_TREE = new S(A.TREE, llIIIIllIIlI[llIIIIllIIll[22]], llIIIIllIIll[0]);
        REDWOOD = new T(A.TREE, llIIIIllIIlI[llIIIIllIIll[24]], llIIIIllIIll[0]);
        SPIRIT_TREE = new U(A.TREE, llIIIIllIIlI[llIIIIllIIll[26]], llIIIIllIIll[0]);
        ANIMA = new V(A.SPECIAL, llIIIIllIIlI[llIIIIllIIll[28]], llIIIIllIIll[1]);
        CACTUS = new W(A.SPECIAL, llIIIIllIIlI[llIIIIllIIll[30]], llIIIIllIIll[0]);
        SEAWEED = new X(A.SPECIAL, llIIIIllIIlI[llIIIIllIIll[32]], llIIIIllIIll[1]);
        CALQUAT = new Y(A.FRUIT_TREE, llIIIIllIIlI[llIIIIllIIll[34]], llIIIIllIIll[0]);
        CELASTRUS = new Z(A.FRUIT_TREE, llIIIIllIIlI[llIIIIllIIll[36]], llIIIIllIIll[0]);
        GRAPES = new aa(A.GRAPE, llIIIIllIIlI[llIIIIllIIll[38]], llIIIIllIIll[0]);
        CRYSTAL_TREE = new ac(A.FRUIT_TREE, llIIIIllIIlI[llIIIIllIIll[40]], llIIIIllIIll[0]);
        COMPOST = new ad(A.SPECIAL, llIIIIllIIlI[llIIIIllIIll[42]], llIIIIllIIll[0]);
        GIANT_COMPOST = new ae(A.SPECIAL, llIIIIllIIlI[llIIIIllIIll[44]], llIIIIllIIll[0]);
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

    private static String llllIIllIIIIIl(String var10, String var11) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var2 = new StringBuilder();
        char[] var9 = var11.toCharArray();
        int var12 = llIIIIllIIll[1];
        char[] var15 = var10.toCharArray();
        int var16 = var15.length;
        int var4 = llIIIIllIIll[1];
        while (P.llllIIllIIlIII(var4, var16)) {
            char var5 = var15[var4];
            var2.append((char)(var5 ^ var9[var12 % var9.length]));
            0;
            ++var12;
            ++var4;
            0;
            if ((19 + 152 - 98 + 104 ^ 172 + 38 - 154 + 124) != 0) continue;
            return null;
        }
        return String.valueOf(var2);
    }

    public boolean aT() {
        boolean bl;
        if (!P.llllIIllIIIllI((Object)this, (Object)HERB) || !P.llllIIllIIIllI((Object)this, (Object)BUSH) || !P.llllIIllIIIllI((Object)this, (Object)SEAWEED) || P.llllIIllIIIlll((Object)this, (Object)GRAPES)) {
            bl = llIIIIllIIll[0];
            0;
            if (((179 + 84 - 134 + 76 ^ 118 + 49 - 164 + 145) & (0x31 ^ 0x6B ^ 3 ^ -1)) != 0) {
                return ((0x7B ^ 0x20 ^ (0xA0 ^ 0xB2)) & (63 + 120 - 53 + 110 ^ 72 + 78 - -31 + 4 ^ -1)) != 0;
            }
        } else {
            bl = llIIIIllIIll[1];
        }
        return bl;
    }

    private static void llllIIllIIIlIl() {
        llIIIIllIIll = new int[46];
        P.llIIIIllIIll[0] = 1;
        P.llIIIIllIIll[1] = (0x2E ^ 0x28) & ~(0xC7 ^ 0xC1);
        P.llIIIIllIIll[2] = 2;
        P.llIIIIllIIll[3] = 3;
        P.llIIIIllIIll[4] = 0x7E ^ 0x7A;
        P.llIIIIllIIll[5] = 9 + 8 - 2 + 127 ^ 82 + 111 - 82 + 28;
        P.llIIIIllIIll[6] = 0x6C ^ 0x6A;
        P.llIIIIllIIll[7] = 0xBD ^ 0x9E ^ (0x33 ^ 0x17);
        P.llIIIIllIIll[8] = 0x9D ^ 0x95;
        P.llIIIIllIIll[9] = 0x87 ^ 0x8E;
        P.llIIIIllIIll[10] = 0xAA ^ 0x83 ^ (0xF ^ 0x2C);
        P.llIIIIllIIll[11] = 104 + 143 - 214 + 142 ^ 126 + 69 - 140 + 109;
        P.llIIIIllIIll[12] = 0xDA ^ 0x95 ^ (0xC2 ^ 0x81);
        P.llIIIIllIIll[13] = 0x3D ^ 0x30;
        P.llIIIIllIIll[14] = 0x43 ^ 0x57 ^ (0xB2 ^ 0xA8);
        P.llIIIIllIIll[15] = 0x7E ^ 0x71;
        P.llIIIIllIIll[16] = 0x98 ^ 0x88;
        P.llIIIIllIIll[17] = 0xFD ^ 0xBC ^ (0x91 ^ 0xC1);
        P.llIIIIllIIll[18] = 0x5C ^ 0x44 ^ (0x8C ^ 0x86);
        P.llIIIIllIIll[19] = 0x3F ^ 0x2E ^ 2;
        P.llIIIIllIIll[20] = 55 + 166 - 159 + 121 ^ 59 + 110 - 17 + 11;
        P.llIIIIllIIll[21] = 0x1A ^ 0xF;
        P.llIIIIllIIll[22] = 12 + 16 - -13 + 112 ^ 77 + 55 - 105 + 116;
        P.llIIIIllIIll[23] = 0xB6 ^ 0xA1;
        P.llIIIIllIIll[24] = 0x48 ^ 1 ^ (0x47 ^ 0x16);
        P.llIIIIllIIll[25] = 0x8F ^ 0x96;
        P.llIIIIllIIll[26] = 0x37 ^ 0x2D;
        P.llIIIIllIIll[27] = 0xC3 ^ 0xA6 ^ (0xC0 ^ 0xBE);
        P.llIIIIllIIll[28] = 0x41 ^ 0x3A ^ (0xA7 ^ 0xC0);
        P.llIIIIllIIll[29] = 0x43 ^ 0xD ^ (0xC2 ^ 0x91);
        P.llIIIIllIIll[30] = 0x86 ^ 0x98;
        P.llIIIIllIIll[31] = 0xEC ^ 0xB1 ^ (0x42 ^ 0);
        P.llIIIIllIIll[32] = 64 + 87 - 60 + 100 ^ 43 + 105 - 4 + 15;
        P.llIIIIllIIll[33] = 0x2E ^ 0x3C ^ (0x85 ^ 0xB6);
        P.llIIIIllIIll[34] = 5 + 145 - 147 + 150 ^ 45 + 9 - -10 + 123;
        P.llIIIIllIIll[35] = 104 + 52 - -3 + 17 ^ 0 + 134 - 90 + 103;
        P.llIIIIllIIll[36] = 0x47 ^ 0x63;
        P.llIIIIllIIll[37] = 0xD ^ 0x28;
        P.llIIIIllIIll[38] = 0xB5 ^ 0x93;
        P.llIIIIllIIll[39] = 77 + 27 - -20 + 30 ^ 106 + 91 - 168 + 160;
        P.llIIIIllIIll[40] = 0x94 ^ 0xBC;
        P.llIIIIllIIll[41] = 64 + 133 - 133 + 169 ^ 135 + 70 - 130 + 117;
        P.llIIIIllIIll[42] = 0x34 ^ 0x1E;
        P.llIIIIllIIll[43] = 1 ^ 0x2A;
        P.llIIIIllIIll[44] = 8 ^ 0x24;
        P.llIIIIllIIll[45] = 0xFF ^ 0xC5 ^ (0x40 ^ 0x57);
    }

    private static boolean llllIIllIIIlll(Object object, Object object2) {
        return object == object2;
    }

    public boolean aS() {
        boolean bl;
        if (!P.llllIIllIIIllI((Object)this, (Object)TREE) || P.llllIIllIIIlll((Object)this, (Object)FRUIT_TREE)) {
            bl = llIIIIllIIll[0];
            0;
            if (3 > 3) {
                return false;
            }
        } else {
            bl = llIIIIllIIll[1];
        }
        return bl;
    }

    P(A a2, String string2, boolean bl) {
        this(a2, string2, string2, bl);
    }

    private static void llllIIllIIIlII() {
        llIIIIllIIlI = new String[llIIIIllIIll[45]];
        P.llIIIIllIIlI[P.llIIIIllIIll[1]] = P."BELLADONNA";
        P.llIIIIllIIlI[P.llIIIIllIIll[0]] = P."";
        P.llIIIIllIIlI[P.llIIIIllIIll[2]] = P."MUSHROOM";
        P.llIIIIllIIlI[P.llIIIIllIIll[3]] = P."";
        P.llIIIIllIIlI[P.llIIIIllIIll[4]] = P."HESPORI";
        P.llIIIIllIIlI[P.llIIIIllIIll[5]] = P."";
        P.llIIIIllIIlI[P.llIIIIllIIll[6]] = P."ALLOTMENT";
        P.llIIIIllIIlI[P.llIIIIllIIll[7]] = P."Allotment";
        P.llIIIIllIIlI[P.llIIIIllIIll[8]] = P."HERB";
        P.llIIIIllIIlI[P.llIIIIllIIll[9]] = P."Herb patch";
        P.llIIIIllIIlI[P.llIIIIllIIll[10]] = P."Herbs";
        P.llIIIIllIIlI[P.llIIIIllIIll[11]] = P."FLOWER";
        P.llIIIIllIIlI[P.llIIIIllIIll[12]] = P."Flower Patch";
        P.llIIIIllIIlI[P.llIIIIllIIll[13]] = P."BUSH";
        P.llIIIIllIIlI[P.llIIIIllIIll[14]] = P."";
        P.llIIIIllIIlI[P.llIIIIllIIll[15]] = P."FRUIT_TREE";
        P.llIIIIllIIlI[P.llIIIIllIIll[16]] = P."";
        P.llIIIIllIIlI[P.llIIIIllIIll[17]] = P."HOPS";
        P.llIIIIllIIlI[P.llIIIIllIIll[18]] = P."";
        P.llIIIIllIIlI[P.llIIIIllIIll[19]] = P."TREE";
        P.llIIIIllIIlI[P.llIIIIllIIll[20]] = P."";
        P.llIIIIllIIlI[P.llIIIIllIIll[21]] = P."HARDWOOD_TREE";
        P.llIIIIllIIlI[P.llIIIIllIIll[22]] = P."Hardwood Trees";
        P.llIIIIllIIlI[P.llIIIIllIIll[23]] = P."REDWOOD";
        P.llIIIIllIIlI[P.llIIIIllIIll[24]] = P."Redwood Trees";
        P.llIIIIllIIlI[P.llIIIIllIIll[25]] = P."SPIRIT_TREE";
        P.llIIIIllIIlI[P.llIIIIllIIll[26]] = P."Spirit Trees";
        P.llIIIIllIIlI[P.llIIIIllIIll[27]] = P."ANIMA";
        P.llIIIIllIIlI[P.llIIIIllIIll[28]] = P."";
        P.llIIIIllIIlI[P.llIIIIllIIll[29]] = P."CACTUS";
        P.llIIIIllIIlI[P.llIIIIllIIll[30]] = P."Cactus";
        P.llIIIIllIIlI[P.llIIIIllIIll[31]] = P."SEAWEED";
        P.llIIIIllIIlI[P.llIIIIllIIll[32]] = P."Seaweed";
        P.llIIIIllIIlI[P.llIIIIllIIll[33]] = P."CALQUAT";
        P.llIIIIllIIlI[P.llIIIIllIIll[34]] = P."Calquat";
        P.llIIIIllIIlI[P.llIIIIllIIll[35]] = P."CELASTRUS";
        P.llIIIIllIIlI[P.llIIIIllIIll[36]] = P."Celastrus";
        P.llIIIIllIIlI[P.llIIIIllIIll[37]] = P."GRAPES";
        P.llIIIIllIIlI[P.llIIIIllIIll[38]] = P."";
        P.llIIIIllIIlI[P.llIIIIllIIll[39]] = P."CRYSTAL_TREE";
        P.llIIIIllIIlI[P.llIIIIllIIll[40]] = P."Crystal Tree";
        P.llIIIIllIIlI[P.llIIIIllIIll[41]] = P."COMPOST";
        P.llIIIIllIIlI[P.llIIIIllIIll[42]] = P."Compost Bin";
        P.llIIIIllIIlI[P.llIIIIllIIll[43]] = P."GIANT_COMPOST";
        P.llIIIIllIIlI[P.llIIIIllIIll[44]] = P."Big Compost Bin";
    }

    public boolean aR() {
        boolean bl;
        if (!P.llllIIllIIIllI((Object)this, (Object)COMPOST) || P.llllIIllIIIlll((Object)this, (Object)GIANT_COMPOST)) {
            bl = llIIIIllIIll[0];
            0;
            
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

    P(A a2, String string2, String string3, boolean bl) {
        this(a2, string2, string2, string3, bl);
    }

    private static String llllIIllIIIIll(String var7, String var6) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var13 = Cipher.getInstance("Blowfish");
            var13.init(llIIIIllIIll[2], var3);
            return new String(var13.doFinal(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    private static String llllIIllIIIIlI(String var1, String var19) {
        try {
            SecretKeySpec var14 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var19.getBytes(StandardCharsets.UTF_8)), llIIIIllIIll[8]), "DES");
            Cipher var8 = Cipher.getInstance("DES");
            var8.init(llIIIIllIIll[2], var14);
            return new String(var8.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
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
        return Enum.valueOf(P.class, string);
    }

    private P(A a2, String string2, String string3, String string4, boolean bl) {
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

