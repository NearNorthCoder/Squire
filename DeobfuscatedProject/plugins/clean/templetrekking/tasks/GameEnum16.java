/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.templetrekking.tasks;

import e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u.e;
import e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u.f;
import e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u.g;
import e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u.h;
import e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u.i;
import e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u.j;
import e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u.k;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum16
extends Enum<d> {
    private static final  d[] $VALUES;
    public static final  /* enum */ d LOBSTER;
    public static final  /* enum */ d XP_TOME;
    
    private final  List<Integer> rewardIds;
    public static final  /* enum */ d WATERMELON_SEED;
    public static final  /* enum */ d PURE_ESSENCE;
    
    public static final  /* enum */ d SILVER_BAR;
    public static final  /* enum */ d BOW_STRING;
    public static final  /* enum */ d COAL_AND_IRON;
    private final  int interfaceId;
    private final  String name;
    public static final  /* enum */ d HERB;

        return String.valueOf(var1);
    }

    public static d[] values() {
        return (d[])$VALUES.clone();
    }

    public String y() {
        return this.name;
    }

    private GameEnum16(int n3, List<Integer> list, String string2) {
        this.interfaceId = n3;
        this.rewardIds = list;
        this.name = string2;
    }

    public static d valueOf(String string) {
        return Enum.valueOf(GameEnum16.class, string);
    }

    public List<Integer> w() {
        return this.rewardIds;
    }

    private static void lIlIlllllllIIlI() {
        lIIllIIlIllll = new String[lIIllIIllIIIl[19]];
        d.lIIllIIlIllll[d.lIIllIIllIIIl[0]] = "PURE_ESSENCE";
        d.lIIllIIlIllll[d.lIIllIIllIIIl[1]] = "Pure essence";
        d.lIIllIIlIllll[d.lIIllIIllIIIl[2]] = "BOW_STRING";
        d.lIIllIIlIllll[d.lIIllIIllIIIl[3]] = "Bow string";
        d.lIIllIIlIllll[d.lIIllIIllIIIl[4]] = "SILVER_BAR";
        d.lIIllIIlIllll[d.lIIllIIllIIIl[5]] = "Silver bar";
        d.lIIllIIlIllll[d.lIIllIIllIIIl[6]] = "HERB";
        d.lIIllIIlIllll[d.lIIllIIllIIIl[10]] = "Herbs";
        d.lIIllIIlIllll[d.lIIllIIllIIIl[11]] = "COAL_AND_IRON";
        d.lIIllIIlIllll[d.lIIllIIllIIIl[12]] = "Ores";
        d.lIIllIIlIllll[d.lIIllIIllIIIl[13]] = "WATERMELON_SEED";
        d.lIIllIIlIllll[d.lIIllIIllIIIl[14]] = "Watermelon seed";
        d.lIIllIIlIllll[d.lIIllIIllIIIl[15]] = "LOBSTER";
        d.lIIllIIlIllll[d.lIIllIIllIIIl[16]] = "Raw lobster";
        d.lIIllIIlIllll[d.lIIllIIllIIIl[17]] = "XP_TOME";
        d.lIIllIIlIllll[d.lIIllIIllIIIl[18]] = "Reward tomes";
    }

    private static boolean lIlIlllllllIlII(int n2, int n3) {
        return n2 < n3;
    }

    public int x() {
        return this.interfaceId;
    }

    static {
        d.lIlIlllllllIIll();
        d.lIlIlllllllIIlI();
        PURE_ESSENCE = new GameEnum16(lIIllIIllIIIl[0], new e(), lIIllIIlIllll[lIIllIIllIIIl[1]]);
        BOW_STRING = new GameEnum16(lIIllIIllIIIl[1], new f(), lIIllIIlIllll[lIIllIIllIIIl[3]]);
        SILVER_BAR = new GameEnum16(lIIllIIllIIIl[2], new g(), lIIllIIlIllll[lIIllIIllIIIl[5]]);
        HERB = new GameEnum16(lIIllIIllIIIl[3], List.of(Integer.valueOf(lIIllIIllIIIl[7]), Integer.valueOf(lIIllIIllIIIl[8]), Integer.valueOf(lIIllIIllIIIl[9])), lIIllIIlIllll[lIIllIIllIIIl[10]]);
        COAL_AND_IRON = new GameEnum16(lIIllIIllIIIl[4], new h(), lIIllIIlIllll[lIIllIIllIIIl[12]]);
        WATERMELON_SEED = new GameEnum16(lIIllIIllIIIl[5], new i(), lIIllIIlIllll[lIIllIIllIIIl[14]]);
        LOBSTER = new GameEnum16(lIIllIIllIIIl[6], new j(), lIIllIIlIllll[lIIllIIllIIIl[16]]);
        XP_TOME = new GameEnum16(lIIllIIllIIIl[10], new k(), lIIllIIlIllll[lIIllIIllIIIl[18]]);
        d[] dArray = new d[lIIllIIllIIIl[11]];
        dArray[d.lIIllIIllIIIl[0]] = PURE_ESSENCE;
        dArray[d.lIIllIIllIIIl[1]] = BOW_STRING;
        dArray[d.lIIllIIllIIIl[2]] = SILVER_BAR;
        dArray[d.lIIllIIllIIIl[3]] = HERB;
        dArray[d.lIIllIIllIIIl[4]] = COAL_AND_IRON;
        dArray[d.lIIllIIllIIIl[5]] = WATERMELON_SEED;
        dArray[d.lIIllIIllIIIl[6]] = LOBSTER;
        dArray[d.lIIllIIllIIIl[10]] = XP_TOME;
        $VALUES = dArray;
    }
}

