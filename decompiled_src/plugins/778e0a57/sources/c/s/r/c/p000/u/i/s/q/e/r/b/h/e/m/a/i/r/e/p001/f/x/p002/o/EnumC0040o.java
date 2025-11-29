package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;

import com.openosrs.client.game.NPCStats;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.o  reason: invalid package and case insensitive filesystem */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/o.class */
public final class EnumC0040o {
    private static /* synthetic */ int[] lIlIIIIlIIlI;
    private static /* synthetic */ String[] lIlIIIIlIIIl;
    public static final /* synthetic */ EnumC0040o ABYSSAL_PORTAL;
    public static final /* synthetic */ EnumC0040o VASA_CRYSTAL;
    public static final /* synthetic */ EnumC0040o OLM_HEAD;
    private /* synthetic */ NPCStats npcStats;
    public static final /* synthetic */ EnumC0040o OLM_RIGHT_HAND;
    public static final /* synthetic */ EnumC0040o OLM_LEFT_HAND;
    public static final /* synthetic */ EnumC0040o ICE_DEMON;
    private static final /* synthetic */ EnumC0040o[] $VALUES;
    public static final /* synthetic */ EnumC0040o TEKTON;
    public static final /* synthetic */ EnumC0040o MUTTADILE;
    public static final /* synthetic */ EnumC0040o VASA;

    static {
        llIlIlIIllIlll();
        llIlIlIIllIllI();
        VASA = new EnumC0040o(lIlIIIIlIIIl[lIlIIIIlIIlI[0]], lIlIIIIlIIlI[0], NPCStats.builder().hitpoints(lIlIIIIlIIlI[1]).attackLevel(lIlIIIIlIIlI[2]).strengthLevel(lIlIIIIlIIlI[2]).defenceLevel(lIlIIIIlIIlI[3]).magic(lIlIIIIlIIlI[4]).range(lIlIIIIlIIlI[4]).stabDef(lIlIIIIlIIlI[5]).slashDef(lIlIIIIlIIlI[6]).crushDef(lIlIIIIlIIlI[7]).magicDef(lIlIIIIlIIlI[8]).build());
        VASA_CRYSTAL = new EnumC0040o(lIlIIIIlIIIl[lIlIIIIlIIlI[2]], lIlIIIIlIIlI[2], NPCStats.builder().hitpoints(lIlIIIIlIIlI[9]).attackLevel(lIlIIIIlIIlI[2]).strengthLevel(lIlIIIIlIIlI[2]).defenceLevel(lIlIIIIlIIlI[10]).magic(lIlIIIIlIIlI[10]).range(lIlIIIIlIIlI[2]).stabDef(lIlIIIIlIIlI[11]).slashDef(lIlIIIIlIIlI[12]).crushDef(lIlIIIIlIIlI[12]).magicDef(lIlIIIIlIIlI[0]).build());
        TEKTON = new EnumC0040o(lIlIIIIlIIIl[lIlIIIIlIIlI[13]], lIlIIIIlIIlI[13], NPCStats.builder().hitpoints(lIlIIIIlIIlI[1]).attackLevel(lIlIIIIlIIlI[14]).strengthLevel(lIlIIIIlIIlI[14]).defenceLevel(lIlIIIIlIIlI[15]).magic(lIlIIIIlIIlI[15]).range(lIlIIIIlIIlI[2]).stabDef(lIlIIIIlIIlI[16]).slashDef(lIlIIIIlIIlI[17]).crushDef(lIlIIIIlIIlI[18]).magicDef(lIlIIIIlIIlI[0]).build());
        MUTTADILE = new EnumC0040o(lIlIIIIlIIIl[lIlIIIIlIIlI[19]], lIlIIIIlIIlI[19], NPCStats.builder().hitpoints(lIlIIIIlIIlI[20]).attackLevel(lIlIIIIlIIlI[20]).strengthLevel(lIlIIIIlIIlI[20]).defenceLevel(lIlIIIIlIIlI[21]).magic(lIlIIIIlIIlI[20]).range(lIlIIIIlIIlI[20]).stabDef(lIlIIIIlIIlI[11]).slashDef(lIlIIIIlIIlI[22]).crushDef(lIlIIIIlIIlI[23]).magicDef(lIlIIIIlIIlI[24]).build());
        ABYSSAL_PORTAL = new EnumC0040o(lIlIIIIlIIIl[lIlIIIIlIIlI[25]], lIlIIIIlIIlI[25], NPCStats.builder().hitpoints(lIlIIIIlIIlI[20]).attackLevel(lIlIIIIlIIlI[2]).strengthLevel(lIlIIIIlIIlI[2]).defenceLevel(lIlIIIIlIIlI[26]).magic(lIlIIIIlIIlI[26]).range(lIlIIIIlIIlI[2]).stabDef(lIlIIIIlIIlI[0]).slashDef(lIlIIIIlIIlI[0]).crushDef(lIlIIIIlIIlI[0]).magicDef(lIlIIIIlIIlI[0]).build());
        ICE_DEMON = new EnumC0040o(lIlIIIIlIIIl[lIlIIIIlIIlI[27]], lIlIIIIlIIlI[27], NPCStats.builder().hitpoints(lIlIIIIlIIlI[28]).attackLevel(lIlIIIIlIIlI[2]).strengthLevel(lIlIIIIlIIlI[2]).defenceLevel(lIlIIIIlIIlI[29]).magic(lIlIIIIlIIlI[14]).range(lIlIIIIlIIlI[14]).stabDef(lIlIIIIlIIlI[30]).slashDef(lIlIIIIlIIlI[30]).crushDef(lIlIIIIlIIlI[9]).magicDef(lIlIIIIlIIlI[23]).rangeDef(lIlIIIIlIIlI[28]).build());
        OLM_RIGHT_HAND = new EnumC0040o(lIlIIIIlIIIl[lIlIIIIlIIlI[31]], lIlIIIIlIIlI[31], NPCStats.builder().hitpoints(lIlIIIIlIIlI[32]).attackLevel(lIlIIIIlIIlI[20]).strengthLevel(lIlIIIIlIIlI[20]).defenceLevel(lIlIIIIlIIlI[3]).magic(lIlIIIIlIIlI[33]).range(lIlIIIIlIIlI[20]).stabDef(lIlIIIIlIIlI[0]).slashDef(lIlIIIIlIIlI[0]).crushDef(lIlIIIIlIIlI[0]).magicDef(lIlIIIIlIIlI[34]).rangeDef(lIlIIIIlIIlI[0]).build());
        OLM_LEFT_HAND = new EnumC0040o(lIlIIIIlIIIl[lIlIIIIlIIlI[35]], lIlIIIIlIIlI[35], NPCStats.builder().hitpoints(lIlIIIIlIIlI[32]).attackLevel(lIlIIIIlIIlI[20]).strengthLevel(lIlIIIIlIIlI[20]).defenceLevel(lIlIIIIlIIlI[3]).magic(lIlIIIIlIIlI[3]).range(lIlIIIIlIIlI[20]).stabDef(lIlIIIIlIIlI[34]).slashDef(lIlIIIIlIIlI[34]).crushDef(lIlIIIIlIIlI[34]).magicDef(lIlIIIIlIIlI[36]).rangeDef(lIlIIIIlIIlI[36]).build());
        OLM_HEAD = new EnumC0040o(lIlIIIIlIIIl[lIlIIIIlIIlI[37]], lIlIIIIlIIlI[37], NPCStats.builder().hitpoints(lIlIIIIlIIlI[32]).attackLevel(lIlIIIIlIIlI[20]).strengthLevel(lIlIIIIlIIlI[20]).defenceLevel(lIlIIIIlIIlI[3]).magic(lIlIIIIlIIlI[3]).range(lIlIIIIlIIlI[20]).stabDef(lIlIIIIlIIlI[36]).slashDef(lIlIIIIlIIlI[36]).crushDef(lIlIIIIlIIlI[36]).magicDef(lIlIIIIlIIlI[36]).rangeDef(lIlIIIIlIIlI[36]).build());
        EnumC0040o[] enumC0040oArr = new EnumC0040o[lIlIIIIlIIlI[38]];
        enumC0040oArr[lIlIIIIlIIlI[0]] = VASA;
        enumC0040oArr[lIlIIIIlIIlI[2]] = VASA_CRYSTAL;
        enumC0040oArr[lIlIIIIlIIlI[13]] = TEKTON;
        enumC0040oArr[lIlIIIIlIIlI[19]] = MUTTADILE;
        enumC0040oArr[lIlIIIIlIIlI[25]] = ABYSSAL_PORTAL;
        enumC0040oArr[lIlIIIIlIIlI[27]] = ICE_DEMON;
        enumC0040oArr[lIlIIIIlIIlI[31]] = OLM_RIGHT_HAND;
        enumC0040oArr[lIlIIIIlIIlI[35]] = OLM_LEFT_HAND;
        enumC0040oArr[lIlIIIIlIIlI[37]] = OLM_HEAD;
        $VALUES = enumC0040oArr;
    }

    private EnumC0040o(String str, int i, NPCStats nPCStats) {
        this.npcStats = nPCStats;
    }

    private static boolean llIlIlIIlllIII(int i, int i2) {
        return i < i2;
    }

    private static String llIlIlIIllIIll(String lllllllllllllllIlllIIIllIIIIIIII, String lllllllllllllllIlllIIIlIllllllll) {
        String lllllllllllllllIlllIIIllIIIIIIII2 = new String(Base64.getDecoder().decode(lllllllllllllllIlllIIIllIIIIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlllIIIlIlllllllI = new StringBuilder();
        char[] charArray = lllllllllllllllIlllIIIlIllllllll.toCharArray();
        int lllllllllllllllIlllIIIlIllllllII = lIlIIIIlIIlI[0];
        char[] charArray2 = lllllllllllllllIlllIIIllIIIIIIII2.toCharArray();
        int length = charArray2.length;
        int i = lIlIIIIlIIlI[0];
        while (llIlIlIIlllIII(i, length)) {
            char lllllllllllllllIlllIIIlIllllIIll = charArray2[i];
            lllllllllllllllIlllIIIlIlllllllI.append((char) (lllllllllllllllIlllIIIlIllllIIll ^ charArray[lllllllllllllllIlllIIIlIllllllII % charArray.length]));
            "".length();
            lllllllllllllllIlllIIIlIllllllII++;
            i++;
            "".length();
            if ("  ".length() >= "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlllIIIlIlllllllI);
    }

    private static void llIlIlIIllIlll() {
        lIlIIIIlIIlI = new int[39];
        lIlIIIIlIIlI[0] = ((58 ^ 85) ^ (16 ^ 50)) & (((41 ^ 85) ^ (138 ^ 187)) ^ (-" ".length()));
        lIlIIIIlIIlI[1] = (-((-4385) & 32755)) & (-1) & 28670;
        lIlIIIIlIIlI[2] = " ".length();
        lIlIIIIlIIlI[3] = (((((47 + 7) - 43) + 116) + (198 ^ 181)) - (((139 + 161) - 190) + 75)) + (20 ^ 98);
        lIlIIIIlIIlI[4] = ((196 + 198) - 375) + 211;
        lIlIIIIlIIlI[5] = (((23 ^ 18) + (((6 + 144) - 138) + 142)) - (195 ^ 130)) + (199 ^ 139);
        lIlIIIIlIIlI[6] = ((38 + 109) - 118) + 161;
        lIlIIIIlIIlI[7] = (79 ^ 98) ^ (124 ^ 121);
        lIlIIIIlIIlI[8] = (-6223) & 6622;
        lIlIIIIlIIlI[9] = 201 ^ 177;
        lIlIIIIlIIlI[10] = (((28 + 34) - 31) + 176) ^ (((106 + 57) - 160) + 168);
        lIlIIIIlIIlI[11] = -(153 ^ 156);
        lIlIIIIlIIlI[12] = ((103 + 79) - 152) + 150;
        lIlIIIIlIIlI[13] = "  ".length();
        lIlIIIIlIIlI[14] = (-((-4098) & 14459)) & (-5633) & 16383;
        lIlIIIIlIIlI[15] = (((((47 + 27) - 36) + 130) + (((106 + 32) - 11) + 47)) - (((222 + 18) - 164) + 170)) + (217 ^ 180);
        lIlIIIIlIIlI[16] = ((122 + 149) - 160) + 44;
        lIlIIIIlIIlI[17] = (((84 ^ 65) + (89 ^ 109)) - (-(194 ^ 146))) + (37 ^ 41);
        lIlIIIIlIIlI[18] = 15 ^ 102;
        lIlIIIIlIIlI[19] = "   ".length();
        lIlIIIIlIIlI[20] = (((((150 + 162) - 247) + 99) + (34 ^ 62)) - (-(7 ^ 37))) + (177 ^ 169);
        lIlIIIIlIIlI[21] = (((93 ^ 12) + (41 ^ 105)) - (241 ^ 177)) + ((79 + 96) - 92) + 56;
        lIlIIIIlIIlI[22] = (111 ^ 97) ^ (212 ^ 136);
        lIlIIIIlIIlI[23] = (77 ^ 115) ^ "  ".length();
        lIlIIIIlIIlI[24] = (76 ^ 113) ^ (61 ^ 75);
        lIlIIIIlIIlI[25] = (150 ^ 188) ^ (131 ^ 173);
        lIlIIIIlIIlI[26] = (((109 ^ 87) + (((33 + 103) - 64) + 86)) - (((43 + 113) - 82) + 140)) + ((49 + 0) - (-66)) + 59;
        lIlIIIIlIIlI[27] = 193 ^ 196;
        lIlIIIIlIIlI[28] = (((36 ^ 71) + (212 ^ 146)) - (165 ^ 154)) + (152 ^ 186);
        lIlIIIIlIIlI[29] = (((201 ^ 193) + (123 ^ 6)) - (-(74 ^ 77))) + (116 ^ 96);
        lIlIIIIlIIlI[30] = 35 ^ 101;
        lIlIIIIlIIlI[31] = (50 ^ 62) ^ (102 ^ 108);
        lIlIIIIlIIlI[32] = (-21636) & 22235;
        lIlIIIIlIIlI[33] = 57 ^ 110;
        lIlIIIIlIIlI[34] = (((138 + 119) - 234) + 122) ^ (((67 + 46) - 90) + 140);
        lIlIIIIlIIlI[35] = (((97 + 104) - 171) + 139) ^ (((52 + 37) - 2) + 87);
        lIlIIIIlIIlI[36] = ((21 + 12) - (-25)) + 142;
        lIlIIIIlIIlI[37] = (11 ^ 77) ^ (249 ^ 183);
        lIlIIIIlIIlI[38] = (149 ^ 199) ^ (202 ^ 145);
    }

    private static void llIlIlIIllIllI() {
        lIlIIIIlIIIl = new String[lIlIIIIlIIlI[38]];
        lIlIIIIlIIIl[lIlIIIIlIIlI[0]] = llIlIlIIllIIll("OiQjGA==", "lepYM");
        lIlIIIIlIIIl[lIlIIIIlIIlI[2]] = llIlIlIIllIIll("HQgAOT4IGworNQoF", "KISxa");
        lIlIIIIlIIIl[lIlIIIIlIIlI[13]] = llIlIlIIllIlII("+osOGBVNox0=", "ofBAf");
        lIlIIIIlIIIl[lIlIIIIlIIlI[19]] = llIlIlIIllIIll("NwEOEwo+HRYC", "zTZGK");
        lIlIIIIlIIIl[lIlIIIIlIIlI[25]] = llIlIlIIllIlIl("HUZ9JOfWA0oF+NR+TEl2TQ==", "TwkmP");
        lIlIIIIlIIIl[lIlIIIIlIIlI[27]] = llIlIlIIllIIll("MTY2PCA9ODwt", "xuscd");
        lIlIIIIlIIIl[lIlIIIIlIIlI[31]] = llIlIlIIllIlII("8S6Qx1f4nTdf0XFIWNCACw==", "PgGyM");
        lIlIIIIlIIIl[lIlIIIIlIIlI[35]] = llIlIlIIllIIll("HgQFGRQUDhwZEBAGDA==", "QHHFX");
        lIlIIIIlIIIl[lIlIIIIlIIlI[37]] = llIlIlIIllIlII("YabaC2TjI/vpDgUsqTjUNg==", "BHuor");
    }

    private static String llIlIlIIllIlIl(String lllllllllllllllIlllIIIlIllIllllI, String lllllllllllllllIlllIIIlIllIlllIl) {
        try {
            SecretKeySpec lllllllllllllllIlllIIIlIlllIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIIIlIllIlllIl.getBytes(StandardCharsets.UTF_8)), lIlIIIIlIIlI[37]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIIIIlIIlI[13], lllllllllllllllIlllIIIlIlllIIIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIIIlIllIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIIIlIllIlllll) {
            lllllllllllllllIlllIIIlIllIlllll.printStackTrace();
            return null;
        }
    }

    private static String llIlIlIIllIlII(String lllllllllllllllIlllIIIlIlllIlIll, String lllllllllllllllIlllIIIlIlllIlIlI) {
        try {
            SecretKeySpec lllllllllllllllIlllIIIlIlllIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIIIlIlllIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIIIIlIIlI[13], lllllllllllllllIlllIIIlIlllIlllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIIIlIlllIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIIIlIlllIllII) {
            lllllllllllllllIlllIIIlIlllIllII.printStackTrace();
            return null;
        }
    }

    public static EnumC0040o valueOf(String str) {
        return (EnumC0040o) Enum.valueOf(EnumC0040o.class, str);
    }

    public NPCStats aO() {
        return this.npcStats;
    }

    public static EnumC0040o[] values() {
        return (EnumC0040o[]) $VALUES.clone();
    }
}
