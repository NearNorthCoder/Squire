/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.util.Log
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.unethicalite.api.game.Skills
 */
package r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-;

import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;
import r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-.d_Unknown;
import r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-.FEnum;

public final class CEnum
extends Enum<c> {
    private static final /* synthetic */ c[] $VALUES;
    private static /* synthetic */ String[] lIlIIIIIIllll;
    public static final /* synthetic */ /* enum */ c BOLOGANO;
    public static final /* synthetic */ /* enum */ c GOLOVANOVA;
    public static final /* synthetic */ /* enum */ c BEST_OPTION;
    private static /* synthetic */ int[] lIlIIIIIlIIIl;
    public static final /* synthetic */ /* enum */ c LOGAVANO;

    public static c[] values() {
        return (c[])$VALUES.clone();
    }

    private static void lIllIllIllIllII() {
        lIlIIIIIlIIIl = new int[9];
        c.lIlIIIIIlIIIl[0] = 0x52 ^ 0x18;
        c.lIlIIIIIlIIIl[1] = 124 + 111 - 141 + 38 ^ 59 + 131 - 123 + 111;
        c.lIlIIIIIlIIIl[2] = (0x30 ^ 0x1C ^ (0x7B ^ 0x13)) & (0x3D ^ 0x31 ^ (0xC1 ^ 0x89) ^ -1);
        c.lIlIIIIIlIIIl[3] = 1;
        c.lIlIIIIIlIIIl[4] = 2;
        c.lIlIIIIIlIIIl[5] = 3;
        c.lIlIIIIIlIIIl[6] = 0x9B ^ 0x9F;
        c.lIlIIIIIlIIIl[7] = 0x1F ^ 0x1A;
        c.lIlIIIIIlIIIl[8] = 0x5F ^ 0x5A ^ (0x79 ^ 0x74);
    }

    private static void lIllIllIllIlIll() {
        lIlIIIIIIllll = new String[lIlIIIIIlIIIl[7]];
        c.lIlIIIIIIllll[c.lIlIIIIIlIIIl[2]] = c."No matching type found for {}";
        c.lIlIIIIIIllll[c.lIlIIIIIlIIIl[3]] = c."GOLOVANOVA";
        c.lIlIIIIIIllll[c.lIlIIIIIlIIIl[4]] = c."BOLOGANO";
        c.lIlIIIIIIllll[c.lIlIIIIIlIIIl[5]] = c."LOGAVANO";
        c.lIlIIIIIIllll[c.lIlIIIIIlIIIl[6]] = c."BEST_OPTION";
    }

    private static String lIllIllIlIlllll(String var18, String var20) {
        try {
            SecretKeySpec var19 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var20.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var5 = Cipher.getInstance("Blowfish");
            var5.init(lIlIIIIIlIIIl[4], var19);
            return new String(var5.doFinal(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIllIllIllll(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIllIllIlllI(Object object) {
        return object == null;
    }

    private static boolean lIllIllIllIllIl(int n2, int n3) {
        return n2 >= n3;
    }

    public f i() {
        switch (d.n[this.ordinal()]) {
            case 1: {
                return f.GOLOVANOVA;
            }
            case 2: {
                return f.BOLOGANO;
            }
            case 3: {
                return f.LOGAVANO;
            }
            case 4: {
                int var12 = Skills.getLevel((Skill)Skill.FARMING);
                if (c.lIllIllIllIllIl(var12, lIlIIIIIlIIIl[0])) {
                    return f.LOGAVANO;
                }
                if (c.lIllIllIllIllIl(var12, lIlIIIIIlIIIl[1])) {
                    return f.BOLOGANO;
                }
                return f.GOLOVANOVA;
            }
        }
        return null;
    }

    public static c valueOf(String string) {
        return Enum.valueOf(c.class, string);
    }

    private static String lIllIllIllIlIIl(String var23, String var8) {
        var23 = new String(Base64.getDecoder().decode(var23.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var4 = new StringBuilder();
        char[] var13 = var8.toCharArray();
        int var6 = lIlIIIIIlIIIl[2];
        char[] var9 = var23.toCharArray();
        int var7 = var9.length;
        int var21 = lIlIIIIIlIIIl[2];
        while (c.lIllIllIlllIIII(var21, var7)) {
            char var16 = var9[var21];
            var4.append((char)(var16 ^ var13[var6 % var13.length]));
            0;
            ++var6;
            ++var21;
            0;
            
            return null;
        }
        return String.valueOf(var4);
    }

    private static String lIllIllIllIlIlI(String var3, String var10) {
        try {
            SecretKeySpec var22 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var10.getBytes(StandardCharsets.UTF_8)), lIlIIIIIlIIIl[8]), "DES");
            Cipher var2 = Cipher.getInstance("DES");
            var2.init(lIlIIIIIlIIIl[4], var22);
            return new String(var2.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    static {
        c.lIllIllIllIllII();
        c.lIllIllIllIlIll();
        GOLOVANOVA = new c();
        BOLOGANO = new c();
        LOGAVANO = new c();
        BEST_OPTION = new c();
        c[] cArray = new c[lIlIIIIIlIIIl[6]];
        cArray[c.lIlIIIIIlIIIl[2]] = GOLOVANOVA;
        cArray[c.lIlIIIIIlIIIl[3]] = BOLOGANO;
        cArray[c.lIlIIIIIlIIIl[4]] = LOGAVANO;
        cArray[c.lIlIIIIIlIIIl[5]] = BEST_OPTION;
        $VALUES = cArray;
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(Item item) {
        boolean bl;
        void var1;
        void var15;
        f f2 = this.i();
        if (c.lIllIllIllIlllI((Object)f2)) {
            Object[] objectArray = new Object[lIlIIIIIlIIIl[3]];
            objectArray[c.lIlIIIIIlIIIl[2]] = this;
            Log.info((String)lIlIIIIIIllll[lIlIIIIIlIIIl[2]], (Object[])objectArray);
            return lIlIIIIIlIIIl[2];
        }
        String var11 = var15.j();
        if (c.lIllIllIllIllll(var1.getName().contains(var11) ? 1 : 0)) {
            bl = lIlIIIIIlIIIl[3];
            0;
            if (-1 != -1) {
                return ((0xAB ^ 0xC5 ^ (0x7E ^ 0x3E)) & (88 + 8 - 55 + 124 ^ 108 + 39 - 53 + 45 ^ -1)) != 0;
            }
        } else {
            bl = lIlIIIIIlIIIl[2];
        }
        return bl;
    }

    private static boolean lIllIllIlllIIII(int n2, int n3) {
        return n2 < n3;
    }
}

