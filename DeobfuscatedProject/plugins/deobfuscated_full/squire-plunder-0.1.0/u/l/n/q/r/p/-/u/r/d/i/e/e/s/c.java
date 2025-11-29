/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldArea
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Skills
 */
package u.l.n.q.r.p.-.u.r.d.i.e.e.s;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;

public final class c
extends Enum<c> {
    private /* synthetic */ WorldArea worldArea;
    public static final /* synthetic */ /* enum */ c ROOM_ONE;
    private /* synthetic */ int minimumLevel;
    public static final /* synthetic */ /* enum */ c ROOM_SEVEN;
    public static final /* synthetic */ /* enum */ c ROOM_THREE;
    private static /* synthetic */ String[] llllllIIIlll;
    public static final /* synthetic */ /* enum */ c ROOM_FIVE;
    public static final /* synthetic */ /* enum */ c ROOM_FOUR;
    public static final /* synthetic */ /* enum */ c ROOM_TWO;
    public static final /* synthetic */ /* enum */ c ROOM_SIX;
    private static final /* synthetic */ c[] $VALUES;
    private static /* synthetic */ int[] llllllIIlIII;
    public static final /* synthetic */ /* enum */ c ROOM_EIGHT;

    private static String lIIlIlIIIIIIllI(String var18, String var14) {
        try {
            SecretKeySpec var16 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var14.getBytes(StandardCharsets.UTF_8)), llllllIIlIII[40]), "DES");
            Cipher var21 = Cipher.getInstance("DES");
            var21.init(llllllIIlIII[10], var16);
            return new String(var21.doFinal(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var28) {
            var28.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlIIIIIlIll(Object object) {
        return object == null;
    }

    private static void lIIlIlIIIIIIlll() {
        llllllIIIlll = new String[llllllIIlIII[40]];
        c.llllllIIIlll[c.llllllIIlIII[0]] = c."ROOM_ONE";
        c.llllllIIIlll[c.llllllIIlIII[1]] = c."ROOM_TWO";
        c.llllllIIIlll[c.llllllIIlIII[10]] = c."ROOM_THREE";
        c.llllllIIIlll[c.llllllIIlIII[16]] = c."ROOM_FOUR";
        c.llllllIIIlll[c.llllllIIlIII[22]] = c."ROOM_FIVE";
        c.llllllIIIlll[c.llllllIIlIII[28]] = c."ROOM_SIX";
        c.llllllIIIlll[c.llllllIIlIII[32]] = c."ROOM_SEVEN";
        c.llllllIIIlll[c.llllllIIlIII[36]] = c."ROOM_EIGHT";
    }

    private static String lIIlIlIIIIIIlIl(String var25, String var4) {
        var25 = new String(Base64.getDecoder().decode(var25.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var27 = new StringBuilder();
        char[] var26 = var4.toCharArray();
        int var2 = llllllIIlIII[0];
        char[] var7 = var25.toCharArray();
        int var24 = var7.length;
        int var20 = llllllIIlIII[0];
        while (c.lIIlIlIIIIIlIIl(var20, var24)) {
            char var9 = var7[var20];
            var27.append((char)(var9 ^ var26[var2 % var26.length]));
            0;
            ++var2;
            ++var20;
            0;
            if (-(0x51 ^ 0x55) < 0) continue;
            return null;
        }
        return String.valueOf(var27);
    }

    static {
        c.lIIlIlIIIIIlIII();
        c.lIIlIlIIIIIIlll();
        ROOM_ONE = new c(llllllIIlIII[2], new WorldArea(llllllIIlIII[3], llllllIIlIII[4], llllllIIlIII[5], llllllIIlIII[5], llllllIIlIII[0]));
        ROOM_TWO = new c(llllllIIlIII[6], new WorldArea(llllllIIlIII[7], llllllIIlIII[8], llllllIIlIII[9], llllllIIlIII[5], llllllIIlIII[0]));
        ROOM_THREE = new c(llllllIIlIII[11], new WorldArea(llllllIIlIII[12], llllllIIlIII[13], llllllIIlIII[14], llllllIIlIII[15], llllllIIlIII[0]));
        ROOM_FOUR = new c(llllllIIlIII[17], new WorldArea(llllllIIlIII[18], llllllIIlIII[19], llllllIIlIII[20], llllllIIlIII[21], llllllIIlIII[0]));
        ROOM_FIVE = new c(llllllIIlIII[23], new WorldArea(llllllIIlIII[24], llllllIIlIII[25], llllllIIlIII[26], llllllIIlIII[27], llllllIIlIII[0]));
        ROOM_SIX = new c(llllllIIlIII[29], new WorldArea(llllllIIlIII[30], llllllIIlIII[31], llllllIIlIII[21], llllllIIlIII[20], llllllIIlIII[0]));
        ROOM_SEVEN = new c(llllllIIlIII[33], new WorldArea(llllllIIlIII[34], llllllIIlIII[35], llllllIIlIII[2], llllllIIlIII[5], llllllIIlIII[0]));
        ROOM_EIGHT = new c(llllllIIlIII[37], new WorldArea(llllllIIlIII[38], llllllIIlIII[35], llllllIIlIII[39], llllllIIlIII[2], llllllIIlIII[0]));
        c[] cArray = new c[llllllIIlIII[40]];
        cArray[c.llllllIIlIII[0]] = ROOM_ONE;
        cArray[c.llllllIIlIII[1]] = ROOM_TWO;
        cArray[c.llllllIIlIII[10]] = ROOM_THREE;
        cArray[c.llllllIIlIII[16]] = ROOM_FOUR;
        cArray[c.llllllIIlIII[22]] = ROOM_FIVE;
        cArray[c.llllllIIlIII[28]] = ROOM_SIX;
        cArray[c.llllllIIlIII[32]] = ROOM_SEVEN;
        cArray[c.llllllIIlIII[36]] = ROOM_EIGHT;
        $VALUES = cArray;
    }

    private static boolean lIIlIlIIIIIlIlI(int n2) {
        return n2 != 0;
    }

    private static String lIIlIlIIIIIIlII(String var11, String var1) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var23 = Cipher.getInstance("Blowfish");
            var23.init(llllllIIlIII[10], var5);
            return new String(var23.doFinal(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static boolean g() {
        boolean bl;
        void var8;
        void var10;
        int n2 = Skills.getBoostedLevel((Skill)Skill.THIEVING);
        c c2 = c.f();
        if (c.lIIlIlIIIIIlIll((Object)c2)) {
            return llllllIIlIII[0];
        }
        c var13 = c.d((c)var10);
        if (c.lIIlIlIIIIIlIll((Object)var13)) {
            return llllllIIlIII[0];
        }
        int var3 = var13.h();
        if (c.lIIlIlIIIIIllII((int)var8, var3)) {
            bl = llllllIIlIII[1];
            0;
            if (-1 >= ((0x4C ^ 3) & ~(0xDE ^ 0x91))) {
                return false;
            }
        } else {
            bl = llllllIIlIII[0];
        }
        return bl;
    }

    public int h() {
        return this.minimumLevel;
    }

    public WorldArea i() {
        return this.worldArea;
    }

    public static c valueOf(String string) {
        return Enum.valueOf(c.class, string);
    }

    public static c[] values() {
        return (c[])$VALUES.clone();
    }

    private static void lIIlIlIIIIIlIII() {
        llllllIIlIII = new int[41];
        c.llllllIIlIII[0] = (0x63 ^ 0x38 ^ (0x59 ^ 0x2B)) & (0xD6 ^ 0x95 ^ (0xD7 ^ 0xBD) ^ -1);
        c.llllllIIlIII[1] = 1;
        c.llllllIIlIII[2] = 132 + 77 - 111 + 40 ^ 68 + 123 - 76 + 44;
        c.llllllIIlIII[3] = 0xFFFF8FFE & 0x777F;
        c.llllllIIlIII[4] = -(0xFFFFE5D7 & 0x7EB9) & (0xFFFFF7FF & 0x7DFF);
        c.llllllIIlIII[5] = 0xE ^ 0x1D;
        c.llllllIIlIII[6] = 0x18 ^ 7;
        c.llllllIIlIII[7] = -(0xFFFF9FE7 & 0x701F) & (0xFFFF9F9F & 0x77FF);
        c.llllllIIlIII[8] = -(0xFFFFFE0D & 0x6FF3) & (0xFFFFFFFE & 0x7F6F);
        c.llllllIIlIII[9] = 0xBC ^ 0xAE;
        c.llllllIIlIII[10] = 2;
        c.llllllIIlIII[11] = 0x5F ^ 0x74 ^ 2;
        c.llllllIIlIII[12] = -(0xFFFFB0EF & 0x5F5B) & (0xFFFFB7FB & 0x5FFE);
        c.llllllIIlIII[13] = -(0xFFFF9C52 & 0x6BBF) & (0xFFFFFD7D & 0x1BF7);
        c.llllllIIlIII[14] = 0xAB ^ 0xA6;
        c.llllllIIlIII[15] = 187 + 132 - 188 + 87 ^ 51 + 26 - 25 + 142;
        c.llllllIIlIII[16] = 3;
        c.llllllIIlIII[17] = 0x39 ^ 0xA;
        c.llllllIIlIII[18] = 0xFFFF9FF1 & 0x678F;
        c.llllllIIlIII[19] = 0xFFFFBF7F & 0x51DF;
        c.llllllIIlIII[20] = 0xF3 ^ 0xB1 ^ (3 ^ 0x56);
        c.llllllIIlIII[21] = 0xB9 ^ 0xC4 ^ (0xE6 ^ 0x95);
        c.llllllIIlIII[22] = 0x4C ^ 0x48;
        c.llllllIIlIII[23] = 0xEE ^ 0xA2 ^ (0x53 ^ 0x22);
        c.llllllIIlIII[24] = -(0xFFFFCC7F & 0x7BE5) & (0xFFFFDFFF & 0x6FFF);
        c.llllllIIlIII[25] = 0xFFFFBD7F & 0x53D9;
        c.llllllIIlIII[26] = 0x2D ^ 0x39;
        c.llllllIIlIII[27] = 8 ^ 0x18;
        c.llllllIIlIII[28] = 0xFD ^ 0xC6 ^ (0xAB ^ 0x95);
        c.llllllIIlIII[29] = 1 ^ (9 ^ 0x4F);
        c.llllllIIlIII[30] = 0xFFFFDFFF & 0x277F;
        c.llllllIIlIII[31] = -(0xFFFFEE3B & 0x3FFD) & (0xFFFFFF7D & 0x3FFF);
        c.llllllIIlIII[32] = 60 + 39 - 18 + 103 ^ 125 + 180 - 267 + 152;
        c.llllllIIlIII[33] = 0x45 ^ 0x14;
        c.llllllIIlIII[34] = -(0xFFFFF9EF & 0x2679) & (0xFFFFEFFF & 0x37F9);
        c.llllllIIlIII[35] = 0xFFFF9FDA & 0x7167;
        c.llllllIIlIII[36] = 0xA3 ^ 0xA4;
        c.llllllIIlIII[37] = 0x75 ^ 0x6A ^ (0x59 ^ 0x1D);
        c.llllllIIlIII[38] = 0xFFFFEFAE & 0x17FD;
        c.llllllIIlIII[39] = 0x31 ^ 0x37 ^ (0x29 ^ 0x3E);
        c.llllllIIlIII[40] = 0x4B ^ 0x43;
    }

    private c(int n3, WorldArea worldArea) {
        this.minimumLevel = n3;
        this.worldArea = worldArea;
    }

    private static boolean lIIlIlIIIIIllII(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * WARNING - void declaration
     */
    public static c f() {
        void var22;
        Player player = Players.getLocal();
        c[] cArray = c.values();
        int n2 = cArray.length;
        int var15 = llllllIIlIII[0];
        while (c.lIIlIlIIIIIlIIl(var15, (int)var22)) {
            void var19;
            void var12;
            void var6 = var12[var15];
            if (c.lIIlIlIIIIIlIlI(var6.i().contains((Locatable)var19) ? 1 : 0)) {
                return var6;
            }
            ++var15;
            0;
            if (-2 <= 0) continue;
            return null;
        }
        return null;
    }

    private static c d(c c2) {
        int n2 = c2.ordinal();
        int n3 = n2 + llllllIIlIII[1];
        if (c.lIIlIlIIIIIllII(n3, c.values().length)) {
            return null;
        }
        return c.values()[n3];
    }

    private static boolean lIIlIlIIIIIlIIl(int n2, int n3) {
        return n2 < n3;
    }
}

