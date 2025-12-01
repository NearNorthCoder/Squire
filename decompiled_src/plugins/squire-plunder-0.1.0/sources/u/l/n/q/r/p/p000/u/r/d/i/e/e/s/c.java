package u.l.n.q.r.p.p000.u.r.d.i.e.e.s;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Player;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: u.l.n.q.r.p.-.u.r.d.i.e.e.s.c  reason: invalid package */
/* loaded from: squire-plunder-0.1.0.jar:u/l/n/q/r/p/-/u/r/d/i/e/e/s/c.class */
public final class c {
    private /* synthetic */ WorldArea worldArea;
    public static final /* synthetic */ c ROOM_ONE;
    private /* synthetic */ int minimumLevel;
    public static final /* synthetic */ c ROOM_SEVEN;
    public static final /* synthetic */ c ROOM_THREE;
    private static /* synthetic */ String[] llllllIIIlll;
    public static final /* synthetic */ c ROOM_FIVE;
    public static final /* synthetic */ c ROOM_FOUR;
    public static final /* synthetic */ c ROOM_TWO;
    public static final /* synthetic */ c ROOM_SIX;
    private static final /* synthetic */ c[] $VALUES;
    private static /* synthetic */ int[] llllllIIlIII;
    public static final /* synthetic */ c ROOM_EIGHT;

    private static String lIIlIlIIIIIIllI(String lllllllllllllllIIlIIllllIIIlIIII, String lllllllllllllllIIlIIllllIIIIllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIllllIIIIllll.getBytes(StandardCharsets.UTF_8)), llllllIIlIII[40]), "DES");
            Cipher lllllllllllllllIIlIIllllIIIlIIlI = Cipher.getInstance("DES");
            lllllllllllllllIIlIIllllIIIlIIlI.init(llllllIIlIII[10], secretKeySpec);
            return new String(lllllllllllllllIIlIIllllIIIlIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIllllIIIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIllllIIIlIIIl) {
            lllllllllllllllIIlIIllllIIIlIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlIIIIIlIll(Object obj) {
        return obj == null;
    }

    private static void lIIlIlIIIIIIlll() {
        llllllIIIlll = new String[llllllIIlIII[40]];
        llllllIIIlll[llllllIIlIII[0]] = lIIlIlIIIIIIlII("0o/sX2A1f7ynveb4+PWihw==", "gZQjW");
        llllllIIIlll[llllllIIlIII[1]] = lIIlIlIIIIIIlIl("GC4+LzIeNj4=", "Jaqbm");
        llllllIIIlll[llllllIIlIII[10]] = lIIlIlIIIIIIllI("xTIehBMB5TqxJDltOPy7+g==", "KqCQf");
        llllllIIIlll[llllllIIlIII[16]] = lIIlIlIIIIIIlII("0f5MW3EgHZhJBnRyxlxy+Q==", "xDjzt");
        llllllIIIlll[llllllIIlIII[22]] = lIIlIlIIIIIIlIl("Hw4EBxwLCB0P", "MAKJC");
        llllllIIIlll[llllllIIlIII[28]] = lIIlIlIIIIIIlII("P0p6xMm7G37cLluUWBI1uA==", "kpKsM");
        llllllIIIlll[llllllIIlIII[32]] = lIIlIlIIIIIIlII("uiheFoyg0FXQquv9NLb3zg==", "pyjiW");
        llllllIIIlll[llllllIIlIII[36]] = lIIlIlIIIIIIllI("yVHaqOoMuDX/TK+daW898A==", "tCZRA");
    }

    private static String lIIlIlIIIIIIlIl(String lllllllllllllllIIlIIlllIlllllIll, String lllllllllllllllIIlIIlllIllllllll) {
        String lllllllllllllllIIlIIlllIlllllIll2 = new String(Base64.getDecoder().decode(lllllllllllllllIIlIIlllIlllllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIIlllIlllllllI = new StringBuilder();
        char[] charArray = lllllllllllllllIIlIIlllIllllllll.toCharArray();
        int lllllllllllllllIIlIIlllIllllllII = llllllIIlIII[0];
        char[] charArray2 = lllllllllllllllIIlIIlllIlllllIll2.toCharArray();
        int lllllllllllllllIIlIIlllIllllIlIl = charArray2.length;
        int i = llllllIIlIII[0];
        while (lIIlIlIIIIIlIIl(i, lllllllllllllllIIlIIlllIllllIlIl)) {
            char lllllllllllllllIIlIIllllIIIIIIIl = charArray2[i];
            lllllllllllllllIIlIIlllIlllllllI.append((char) (lllllllllllllllIIlIIllllIIIIIIIl ^ charArray[lllllllllllllllIIlIIlllIllllllII % charArray.length]));
            "".length();
            lllllllllllllllIIlIIlllIllllllII++;
            i++;
            "".length();
            if ((-(81 ^ 85)) >= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIlIIlllIlllllllI);
    }

    static {
        lIIlIlIIIIIlIII();
        lIIlIlIIIIIIlll();
        ROOM_ONE = new c(llllllIIIlll[llllllIIlIII[0]], llllllIIlIII[0], llllllIIlIII[2], new WorldArea(llllllIIlIII[3], llllllIIlIII[4], llllllIIlIII[5], llllllIIlIII[5], llllllIIlIII[0]));
        ROOM_TWO = new c(llllllIIIlll[llllllIIlIII[1]], llllllIIlIII[1], llllllIIlIII[6], new WorldArea(llllllIIlIII[7], llllllIIlIII[8], llllllIIlIII[9], llllllIIlIII[5], llllllIIlIII[0]));
        ROOM_THREE = new c(llllllIIIlll[llllllIIlIII[10]], llllllIIlIII[10], llllllIIlIII[11], new WorldArea(llllllIIlIII[12], llllllIIlIII[13], llllllIIlIII[14], llllllIIlIII[15], llllllIIlIII[0]));
        ROOM_FOUR = new c(llllllIIIlll[llllllIIlIII[16]], llllllIIlIII[16], llllllIIlIII[17], new WorldArea(llllllIIlIII[18], llllllIIlIII[19], llllllIIlIII[20], llllllIIlIII[21], llllllIIlIII[0]));
        ROOM_FIVE = new c(llllllIIIlll[llllllIIlIII[22]], llllllIIlIII[22], llllllIIlIII[23], new WorldArea(llllllIIlIII[24], llllllIIlIII[25], llllllIIlIII[26], llllllIIlIII[27], llllllIIlIII[0]));
        ROOM_SIX = new c(llllllIIIlll[llllllIIlIII[28]], llllllIIlIII[28], llllllIIlIII[29], new WorldArea(llllllIIlIII[30], llllllIIlIII[31], llllllIIlIII[21], llllllIIlIII[20], llllllIIlIII[0]));
        ROOM_SEVEN = new c(llllllIIIlll[llllllIIlIII[32]], llllllIIlIII[32], llllllIIlIII[33], new WorldArea(llllllIIlIII[34], llllllIIlIII[35], llllllIIlIII[2], llllllIIlIII[5], llllllIIlIII[0]));
        ROOM_EIGHT = new c(llllllIIIlll[llllllIIlIII[36]], llllllIIlIII[36], llllllIIlIII[37], new WorldArea(llllllIIlIII[38], llllllIIlIII[35], llllllIIlIII[39], llllllIIlIII[2], llllllIIlIII[0]));
        c[] cVarArr = new c[llllllIIlIII[40]];
        cVarArr[llllllIIlIII[0]] = ROOM_ONE;
        cVarArr[llllllIIlIII[1]] = ROOM_TWO;
        cVarArr[llllllIIlIII[10]] = ROOM_THREE;
        cVarArr[llllllIIlIII[16]] = ROOM_FOUR;
        cVarArr[llllllIIlIII[22]] = ROOM_FIVE;
        cVarArr[llllllIIlIII[28]] = ROOM_SIX;
        cVarArr[llllllIIlIII[32]] = ROOM_SEVEN;
        cVarArr[llllllIIlIII[36]] = ROOM_EIGHT;
        $VALUES = cVarArr;
    }

    private static boolean lIIlIlIIIIIlIlI(int i) {
        return i != 0;
    }

    private static String lIIlIlIIIIIIlII(String lllllllllllllllIIlIIlllIlllIlIll, String lllllllllllllllIIlIIlllIlllIlIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIlllIlllIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIIlllIlllIllIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIIlllIlllIllIl.init(llllllIIlIII[10], secretKeySpec);
            return new String(lllllllllllllllIIlIIlllIlllIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIlllIlllIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIlllIlllIllII) {
            lllllllllllllllIIlIIlllIlllIllII.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    public static boolean g() {
        int boostedLevel = Skills.getBoostedLevel(Skill.THIEVING);
        c f = f();
        if (lIIlIlIIIIIlIll(f)) {
            return llllllIIlIII[0];
        }
        c d = d(f);
        if (!lIIlIlIIIIIlIll(d) && lIIlIlIIIIIllII(boostedLevel, d.h())) {
            ?? r0 = llllllIIlIII[1];
            "".length();
            return (-" ".length()) >= ((76 ^ 3) & ((222 ^ 145) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llllllIIlIII[0];
    }

    public int h() {
        return this.minimumLevel;
    }

    public WorldArea i() {
        return this.worldArea;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    private static void lIIlIlIIIIIlIII() {
        llllllIIlIII = new int[41];
        llllllIIlIII[0] = ((99 ^ 56) ^ (89 ^ 43)) & (((214 ^ 149) ^ (215 ^ 189)) ^ (-" ".length()));
        llllllIIlIII[1] = " ".length();
        llllllIIlIII[2] = (((132 + 77) - 111) + 40) ^ (((68 + 123) - 76) + 44);
        llllllIIlIII[3] = (-28674) & 30591;
        llllllIIlIII[4] = (-((-6697) & 32441)) & (-2049) & 32255;
        llllllIIlIII[5] = 14 ^ 29;
        llllllIIlIII[6] = 24 ^ 7;
        llllllIIlIII[7] = (-((-24601) & 28703)) & (-24673) & 30719;
        llllllIIlIII[8] = (-((-499) & 28659)) & (-2) & 32623;
        llllllIIlIII[9] = 188 ^ 174;
        llllllIIlIII[10] = "  ".length();
        llllllIIlIII[11] = (95 ^ 116) ^ "  ".length();
        llllllIIlIII[12] = (-((-20241) & 24411)) & (-18437) & 24574;
        llllllIIlIII[13] = (-((-25518) & 27583)) & (-643) & 7159;
        llllllIIlIII[14] = 171 ^ 166;
        llllllIIlIII[15] = (((187 + 132) - 188) + 87) ^ (((51 + 26) - 25) + 142);
        llllllIIlIII[16] = "   ".length();
        llllllIIlIII[17] = 57 ^ 10;
        llllllIIlIII[18] = (-24591) & 26511;
        llllllIIlIII[19] = (-16513) & 20959;
        llllllIIlIII[20] = (243 ^ 177) ^ (3 ^ 86);
        llllllIIlIII[21] = (185 ^ 196) ^ (230 ^ 149);
        llllllIIlIII[22] = 76 ^ 72;
        llllllIIlIII[23] = (238 ^ 162) ^ (83 ^ 34);
        llllllIIlIII[24] = (-((-13185) & 31717)) & (-8193) & 28671;
        llllllIIlIII[25] = (-17025) & 21465;
        llllllIIlIII[26] = 45 ^ 57;
        llllllIIlIII[27] = 8 ^ 24;
        llllllIIlIII[28] = (253 ^ 198) ^ (171 ^ 149);
        llllllIIlIII[29] = " ".length() ^ (9 ^ 79);
        llllllIIlIII[30] = (-8193) & 10111;
        llllllIIlIII[31] = (-((-4549) & 16381)) & (-131) & 16383;
        llllllIIlIII[32] = (((60 + 39) - 18) + 103) ^ (((125 + 180) - 267) + 152);
        llllllIIlIII[33] = 69 ^ 20;
        llllllIIlIII[34] = (-((-1553) & 9849)) & (-4097) & 14329;
        llllllIIlIII[35] = (-24614) & 29031;
        llllllIIlIII[36] = 163 ^ 164;
        llllllIIlIII[37] = (117 ^ 106) ^ (89 ^ 29);
        llllllIIlIII[38] = (-4178) & 6141;
        llllllIIlIII[39] = (49 ^ 55) ^ (41 ^ 62);
        llllllIIlIII[40] = 75 ^ 67;
    }

    private c(String str, int i, int i2, WorldArea worldArea) {
        this.minimumLevel = i2;
        this.worldArea = worldArea;
    }

    private static boolean lIIlIlIIIIIllII(int i, int i2) {
        return i >= i2;
    }

    public static c f() {
        Player local = Players.getLocal();
        c[] values = values();
        int length = values.length;
        int lllllllllllllllIIlIIllllIIlIIlll = llllllIIlIII[0];
        while (lIIlIlIIIIIlIIl(lllllllllllllllIIlIIllllIIlIIlll, length)) {
            c cVar = values[lllllllllllllllIIlIIllllIIlIIlll];
            if (lIIlIlIIIIIlIlI(cVar.i().contains(local) ? 1 : 0)) {
                return cVar;
            }
            lllllllllllllllIIlIIllllIIlIIlll++;
            "".length();
            if ((-"  ".length()) > 0) {
                return null;
            }
        }
        return null;
    }

    private static c d(c cVar) {
        int ordinal = cVar.ordinal() + llllllIIlIII[1];
        if (lIIlIlIIIIIllII(ordinal, values().length)) {
            return null;
        }
        return values()[ordinal];
    }

    private static boolean lIIlIlIIIIIlIIl(int i, int i2) {
        return i < i2;
    }
}
