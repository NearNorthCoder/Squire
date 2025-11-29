/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.openosrs.client.game.NPCStats
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import com.openosrs.client.game.NPCStats;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class o
extends Enum<o> {
    private static /* synthetic */ int[] lIlIIIIlIIlI;
    private static /* synthetic */ String[] lIlIIIIlIIIl;
    public static final /* synthetic */ /* enum */ o ABYSSAL_PORTAL;
    public static final /* synthetic */ /* enum */ o VASA_CRYSTAL;
    public static final /* synthetic */ /* enum */ o OLM_HEAD;
    private /* synthetic */ NPCStats npcStats;
    public static final /* synthetic */ /* enum */ o OLM_RIGHT_HAND;
    public static final /* synthetic */ /* enum */ o OLM_LEFT_HAND;
    public static final /* synthetic */ /* enum */ o ICE_DEMON;
    private static final /* synthetic */ o[] $VALUES;
    public static final /* synthetic */ /* enum */ o TEKTON;
    public static final /* synthetic */ /* enum */ o MUTTADILE;
    public static final /* synthetic */ /* enum */ o VASA;

    static {
        o.llIlIlIIllIlll();
        o.llIlIlIIllIllI();
        VASA = new o(NPCStats.builder().hitpoints(lIlIIIIlIIlI[1]).attackLevel(lIlIIIIlIIlI[2]).strengthLevel(lIlIIIIlIIlI[2]).defenceLevel(lIlIIIIlIIlI[3]).magic(lIlIIIIlIIlI[4]).range(lIlIIIIlIIlI[4]).stabDef(lIlIIIIlIIlI[5]).slashDef(lIlIIIIlIIlI[6]).crushDef(lIlIIIIlIIlI[7]).magicDef(lIlIIIIlIIlI[8]).build());
        VASA_CRYSTAL = new o(NPCStats.builder().hitpoints(lIlIIIIlIIlI[9]).attackLevel(lIlIIIIlIIlI[2]).strengthLevel(lIlIIIIlIIlI[2]).defenceLevel(lIlIIIIlIIlI[10]).magic(lIlIIIIlIIlI[10]).range(lIlIIIIlIIlI[2]).stabDef(lIlIIIIlIIlI[11]).slashDef(lIlIIIIlIIlI[12]).crushDef(lIlIIIIlIIlI[12]).magicDef(lIlIIIIlIIlI[0]).build());
        TEKTON = new o(NPCStats.builder().hitpoints(lIlIIIIlIIlI[1]).attackLevel(lIlIIIIlIIlI[14]).strengthLevel(lIlIIIIlIIlI[14]).defenceLevel(lIlIIIIlIIlI[15]).magic(lIlIIIIlIIlI[15]).range(lIlIIIIlIIlI[2]).stabDef(lIlIIIIlIIlI[16]).slashDef(lIlIIIIlIIlI[17]).crushDef(lIlIIIIlIIlI[18]).magicDef(lIlIIIIlIIlI[0]).build());
        MUTTADILE = new o(NPCStats.builder().hitpoints(lIlIIIIlIIlI[20]).attackLevel(lIlIIIIlIIlI[20]).strengthLevel(lIlIIIIlIIlI[20]).defenceLevel(lIlIIIIlIIlI[21]).magic(lIlIIIIlIIlI[20]).range(lIlIIIIlIIlI[20]).stabDef(lIlIIIIlIIlI[11]).slashDef(lIlIIIIlIIlI[22]).crushDef(lIlIIIIlIIlI[23]).magicDef(lIlIIIIlIIlI[24]).build());
        ABYSSAL_PORTAL = new o(NPCStats.builder().hitpoints(lIlIIIIlIIlI[20]).attackLevel(lIlIIIIlIIlI[2]).strengthLevel(lIlIIIIlIIlI[2]).defenceLevel(lIlIIIIlIIlI[26]).magic(lIlIIIIlIIlI[26]).range(lIlIIIIlIIlI[2]).stabDef(lIlIIIIlIIlI[0]).slashDef(lIlIIIIlIIlI[0]).crushDef(lIlIIIIlIIlI[0]).magicDef(lIlIIIIlIIlI[0]).build());
        ICE_DEMON = new o(NPCStats.builder().hitpoints(lIlIIIIlIIlI[28]).attackLevel(lIlIIIIlIIlI[2]).strengthLevel(lIlIIIIlIIlI[2]).defenceLevel(lIlIIIIlIIlI[29]).magic(lIlIIIIlIIlI[14]).range(lIlIIIIlIIlI[14]).stabDef(lIlIIIIlIIlI[30]).slashDef(lIlIIIIlIIlI[30]).crushDef(lIlIIIIlIIlI[9]).magicDef(lIlIIIIlIIlI[23]).rangeDef(lIlIIIIlIIlI[28]).build());
        OLM_RIGHT_HAND = new o(NPCStats.builder().hitpoints(lIlIIIIlIIlI[32]).attackLevel(lIlIIIIlIIlI[20]).strengthLevel(lIlIIIIlIIlI[20]).defenceLevel(lIlIIIIlIIlI[3]).magic(lIlIIIIlIIlI[33]).range(lIlIIIIlIIlI[20]).stabDef(lIlIIIIlIIlI[0]).slashDef(lIlIIIIlIIlI[0]).crushDef(lIlIIIIlIIlI[0]).magicDef(lIlIIIIlIIlI[34]).rangeDef(lIlIIIIlIIlI[0]).build());
        OLM_LEFT_HAND = new o(NPCStats.builder().hitpoints(lIlIIIIlIIlI[32]).attackLevel(lIlIIIIlIIlI[20]).strengthLevel(lIlIIIIlIIlI[20]).defenceLevel(lIlIIIIlIIlI[3]).magic(lIlIIIIlIIlI[3]).range(lIlIIIIlIIlI[20]).stabDef(lIlIIIIlIIlI[34]).slashDef(lIlIIIIlIIlI[34]).crushDef(lIlIIIIlIIlI[34]).magicDef(lIlIIIIlIIlI[36]).rangeDef(lIlIIIIlIIlI[36]).build());
        OLM_HEAD = new o(NPCStats.builder().hitpoints(lIlIIIIlIIlI[32]).attackLevel(lIlIIIIlIIlI[20]).strengthLevel(lIlIIIIlIIlI[20]).defenceLevel(lIlIIIIlIIlI[3]).magic(lIlIIIIlIIlI[3]).range(lIlIIIIlIIlI[20]).stabDef(lIlIIIIlIIlI[36]).slashDef(lIlIIIIlIIlI[36]).crushDef(lIlIIIIlIIlI[36]).magicDef(lIlIIIIlIIlI[36]).rangeDef(lIlIIIIlIIlI[36]).build());
        o[] oArray = new o[lIlIIIIlIIlI[38]];
        oArray[o.lIlIIIIlIIlI[0]] = VASA;
        oArray[o.lIlIIIIlIIlI[2]] = VASA_CRYSTAL;
        oArray[o.lIlIIIIlIIlI[13]] = TEKTON;
        oArray[o.lIlIIIIlIIlI[19]] = MUTTADILE;
        oArray[o.lIlIIIIlIIlI[25]] = ABYSSAL_PORTAL;
        oArray[o.lIlIIIIlIIlI[27]] = ICE_DEMON;
        oArray[o.lIlIIIIlIIlI[31]] = OLM_RIGHT_HAND;
        oArray[o.lIlIIIIlIIlI[35]] = OLM_LEFT_HAND;
        oArray[o.lIlIIIIlIIlI[37]] = OLM_HEAD;
        $VALUES = oArray;
    }

    private o(NPCStats nPCStats) {
        this.npcStats = nPCStats;
    }

    private static boolean llIlIlIIlllIII(int n2, int n3) {
        return n2 < n3;
    }

    private static String llIlIlIIllIIll(String var11, String var2) {
        var11 = new String(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var7 = new StringBuilder();
        char[] var18 = var2.toCharArray();
        int var9 = lIlIIIIlIIlI[0];
        char[] var14 = var11.toCharArray();
        int var12 = var14.length;
        int var5 = lIlIIIIlIIlI[0];
        while (o.llIlIlIIlllIII(var5, var12)) {
            char var3 = var14[var5];
            var7.append((char)(var3 ^ var18[var9 % var18.length]));
            0;
            ++var9;
            ++var5;
            0;
            if (2 < 3) continue;
            return null;
        }
        return String.valueOf(var7);
    }

    private static void llIlIlIIllIlll() {
        lIlIIIIlIIlI = new int[39];
        o.lIlIIIIlIIlI[0] = (0x3A ^ 0x55 ^ (0x10 ^ 0x32)) & (0x29 ^ 0x55 ^ (0x8A ^ 0xBB) ^ -1);
        o.lIlIIIIlIIlI[1] = -(0xFFFFEEDF & 0x7FF3) & (0xFFFFFFFF & 0x6FFE);
        o.lIlIIIIlIIlI[2] = 1;
        o.lIlIIIIlIIlI[3] = 47 + 7 - 43 + 116 + (0xC6 ^ 0xB5) - (139 + 161 - 190 + 75) + (0x14 ^ 0x62);
        o.lIlIIIIlIIlI[4] = 196 + 198 - 375 + 211;
        o.lIlIIIIlIIlI[5] = (0x17 ^ 0x12) + (6 + 144 - 138 + 142) - (0xC3 ^ 0x82) + (0xC7 ^ 0x8B);
        o.lIlIIIIlIIlI[6] = 38 + 109 - 118 + 161;
        o.lIlIIIIlIIlI[7] = 0x4F ^ 0x62 ^ (0x7C ^ 0x79);
        o.lIlIIIIlIIlI[8] = 0xFFFFE7B1 & 0x19DE;
        o.lIlIIIIlIIlI[9] = 0xC9 ^ 0xB1;
        o.lIlIIIIlIIlI[10] = 28 + 34 - 31 + 176 ^ 106 + 57 - 160 + 168;
        o.lIlIIIIlIIlI[11] = -(0x99 ^ 0x9C);
        o.lIlIIIIlIIlI[12] = 103 + 79 - 152 + 150;
        o.lIlIIIIlIIlI[13] = 2;
        o.lIlIIIIlIIlI[14] = -(0xFFFFEFFE & 0x387B) & (0xFFFFE9FF & 0x3FFF);
        o.lIlIIIIlIIlI[15] = 47 + 27 - 36 + 130 + (106 + 32 - 11 + 47) - (222 + 18 - 164 + 170) + (0xD9 ^ 0xB4);
        o.lIlIIIIlIIlI[16] = 122 + 149 - 160 + 44;
        o.lIlIIIIlIIlI[17] = (0x54 ^ 0x41) + (0x59 ^ 0x6D) - -(0xC2 ^ 0x92) + (0x25 ^ 0x29);
        o.lIlIIIIlIIlI[18] = 0xF ^ 0x66;
        o.lIlIIIIlIIlI[19] = 3;
        o.lIlIIIIlIIlI[20] = 150 + 162 - 247 + 99 + (0x22 ^ 0x3E) - -(7 ^ 0x25) + (0xB1 ^ 0xA9);
        o.lIlIIIIlIIlI[21] = (0x5D ^ 0xC) + (0x29 ^ 0x69) - (0xF1 ^ 0xB1) + (79 + 96 - 92 + 56);
        o.lIlIIIIlIIlI[22] = 0x6F ^ 0x61 ^ (0xD4 ^ 0x88);
        o.lIlIIIIlIIlI[23] = 0x4D ^ 0x73 ^ 2;
        o.lIlIIIIlIIlI[24] = 0x4C ^ 0x71 ^ (0x3D ^ 0x4B);
        o.lIlIIIIlIIlI[25] = 0x96 ^ 0xBC ^ (0x83 ^ 0xAD);
        o.lIlIIIIlIIlI[26] = (0x6D ^ 0x57) + (33 + 103 - 64 + 86) - (43 + 113 - 82 + 140) + (49 + 0 - -66 + 59);
        o.lIlIIIIlIIlI[27] = 0xC1 ^ 0xC4;
        o.lIlIIIIlIIlI[28] = (0x24 ^ 0x47) + (0xD4 ^ 0x92) - (0xA5 ^ 0x9A) + (0x98 ^ 0xBA);
        o.lIlIIIIlIIlI[29] = (0xC9 ^ 0xC1) + (0x7B ^ 6) - -(0x4A ^ 0x4D) + (0x74 ^ 0x60);
        o.lIlIIIIlIIlI[30] = 0x23 ^ 0x65;
        o.lIlIIIIlIIlI[31] = 0x32 ^ 0x3E ^ (0x66 ^ 0x6C);
        o.lIlIIIIlIIlI[32] = 0xFFFFAB7C & 0x56DB;
        o.lIlIIIIlIIlI[33] = 0x39 ^ 0x6E;
        o.lIlIIIIlIIlI[34] = 138 + 119 - 234 + 122 ^ 67 + 46 - 90 + 140;
        o.lIlIIIIlIIlI[35] = 97 + 104 - 171 + 139 ^ 52 + 37 - 2 + 87;
        o.lIlIIIIlIIlI[36] = 21 + 12 - -25 + 142;
        o.lIlIIIIlIIlI[37] = 0xB ^ 0x4D ^ (0xF9 ^ 0xB7);
        o.lIlIIIIlIIlI[38] = 0x95 ^ 0xC7 ^ (0xCA ^ 0x91);
    }

    private static void llIlIlIIllIllI() {
        lIlIIIIlIIIl = new String[lIlIIIIlIIlI[38]];
        o.lIlIIIIlIIIl[o.lIlIIIIlIIlI[0]] = o."VASA";
        o.lIlIIIIlIIIl[o.lIlIIIIlIIlI[2]] = o."VASA_CRYSTAL";
        o.lIlIIIIlIIIl[o.lIlIIIIlIIlI[13]] = o."TEKTON";
        o.lIlIIIIlIIIl[o.lIlIIIIlIIlI[19]] = o."MUTTADILE";
        o.lIlIIIIlIIIl[o.lIlIIIIlIIlI[25]] = o."ABYSSAL_PORTAL";
        o.lIlIIIIlIIIl[o.lIlIIIIlIIlI[27]] = o."ICE_DEMON";
        o.lIlIIIIlIIIl[o.lIlIIIIlIIlI[31]] = o."OLM_RIGHT_HAND";
        o.lIlIIIIlIIIl[o.lIlIIIIlIIlI[35]] = o."OLM_LEFT_HAND";
        o.lIlIIIIlIIIl[o.lIlIIIIlIIlI[37]] = o."OLM_HEAD";
    }

    private static String llIlIlIIllIlIl(String var15, String var4) {
        try {
            SecretKeySpec var6 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), lIlIIIIlIIlI[37]), "DES");
            Cipher var10 = Cipher.getInstance("DES");
            var10.init(lIlIIIIlIIlI[13], var6);
            return new String(var10.doFinal(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    private static String llIlIlIIllIlII(String var1, String var19) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var19.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var17 = Cipher.getInstance("Blowfish");
            var17.init(lIlIIIIlIIlI[13], var8);
            return new String(var17.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    public static o valueOf(String string) {
        return Enum.valueOf(o.class, string);
    }

    public NPCStats aO() {
        return this.npcStats;
    }

    public static o[] values() {
        return (o[])$VALUES.clone();
    }
}

