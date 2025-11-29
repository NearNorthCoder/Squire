/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldPoint;

public final class a
extends Enum<a> {
    public static final /* synthetic */ /* enum */ a TRAIL_31339;
    public static final /* synthetic */ /* enum */ a TRAIL_31354;
    public static final /* synthetic */ /* enum */ a TRAIL_31342;
    private /* synthetic */ int state;
    private final /* synthetic */ WorldPoint loc1;
    private final /* synthetic */ WorldPoint loc3;
    public static final /* synthetic */ /* enum */ a TRAIL_31333;
    public static final /* synthetic */ /* enum */ a TRAIL_31372;
    public static final /* synthetic */ /* enum */ a TRAIL_31360;
    public static final /* synthetic */ /* enum */ a TRAIL_31369;
    public static final /* synthetic */ /* enum */ a TRAIL_31351;
    private final /* synthetic */ WorldPoint loc4;
    private final /* synthetic */ int varp;
    public static final /* synthetic */ /* enum */ a TRAIL_31306;
    public static final /* synthetic */ /* enum */ a TRAIL_31330;
    public static final /* synthetic */ /* enum */ a TRAIL_31366;
    public static final /* synthetic */ /* enum */ a TRAIL_31363;
    public static final /* synthetic */ /* enum */ a TRAIL_31348;
    private final /* synthetic */ int id;
    public static final /* synthetic */ /* enum */ a TRAIL_31309;
    private static /* synthetic */ String[] lllIIllIIlIl;
    public static final /* synthetic */ /* enum */ a TRAIL_31321;
    public static final /* synthetic */ /* enum */ a TRAIL_31303;
    private static final /* synthetic */ a[] $VALUES;
    public static final /* synthetic */ /* enum */ a TRAIL_31336;
    public static final /* synthetic */ /* enum */ a TRAIL_31318;
    public static final /* synthetic */ /* enum */ a TRAIL_31312;
    private final /* synthetic */ WorldPoint loc2;
    public static final /* synthetic */ /* enum */ a TRAIL_31345;
    public static final /* synthetic */ /* enum */ a TRAIL_31327;
    private static /* synthetic */ int[] lllIIllIlIII;
    public static final /* synthetic */ /* enum */ a TRAIL_31324;
    public static final /* synthetic */ /* enum */ a TRAIL_31357;
    public static final /* synthetic */ /* enum */ a TRAIL_31315;

    static {
        a.lIIIlIlIlIlIlIl();
        a.lIIIlIlIlIIllIl();
        TRAIL_31303 = new a(lllIIllIlIII[4], lllIIllIlIII[5], null, new WorldPoint(lllIIllIlIII[6], lllIIllIlIII[7], lllIIllIlIII[3]), null, new WorldPoint(lllIIllIlIII[8], lllIIllIlIII[7], lllIIllIlIII[3]));
        TRAIL_31306 = new a(lllIIllIlIII[9], lllIIllIlIII[10], null, new WorldPoint(lllIIllIlIII[11], lllIIllIlIII[12], lllIIllIlIII[3]), null, new WorldPoint(lllIIllIlIII[13], lllIIllIlIII[14], lllIIllIlIII[3]));
        TRAIL_31309 = new a(lllIIllIlIII[15], lllIIllIlIII[16], null, new WorldPoint(lllIIllIlIII[17], lllIIllIlIII[18], lllIIllIlIII[3]), null, new WorldPoint(lllIIllIlIII[17], lllIIllIlIII[19], lllIIllIlIII[3]));
        TRAIL_31312 = new a(lllIIllIlIII[21], lllIIllIlIII[22], new WorldPoint(lllIIllIlIII[8], lllIIllIlIII[7], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[23], lllIIllIlIII[24], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[6], lllIIllIlIII[7], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[25], lllIIllIlIII[26], lllIIllIlIII[3]));
        TRAIL_31315 = new a(lllIIllIlIII[28], lllIIllIlIII[29], new WorldPoint(lllIIllIlIII[8], lllIIllIlIII[7], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[30], lllIIllIlIII[31], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[6], lllIIllIlIII[7], lllIIllIlIII[3]), null);
        TRAIL_31318 = new a(lllIIllIlIII[33], lllIIllIlIII[34], new WorldPoint(lllIIllIlIII[13], lllIIllIlIII[14], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[30], lllIIllIlIII[31], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[11], lllIIllIlIII[12], lllIIllIlIII[3]), null);
        TRAIL_31321 = new a(lllIIllIlIII[36], lllIIllIlIII[37], new WorldPoint(lllIIllIlIII[13], lllIIllIlIII[14], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[38], lllIIllIlIII[39], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[11], lllIIllIlIII[12], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[40], lllIIllIlIII[41], lllIIllIlIII[3]));
        TRAIL_31324 = new a(lllIIllIlIII[43], lllIIllIlIII[44], new WorldPoint(lllIIllIlIII[17], lllIIllIlIII[19], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[45], lllIIllIlIII[46], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[17], lllIIllIlIII[18], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[45], lllIIllIlIII[47], lllIIllIlIII[3]));
        TRAIL_31327 = new a(lllIIllIlIII[49], lllIIllIlIII[50], new WorldPoint(lllIIllIlIII[17], lllIIllIlIII[19], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[51], lllIIllIlIII[52], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[17], lllIIllIlIII[18], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[53], lllIIllIlIII[52], lllIIllIlIII[3]));
        TRAIL_31330 = new a(lllIIllIlIII[55], lllIIllIlIII[56], new WorldPoint(lllIIllIlIII[25], lllIIllIlIII[26], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[57], lllIIllIlIII[58], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[23], lllIIllIlIII[24], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[59], lllIIllIlIII[60], lllIIllIlIII[3]));
        TRAIL_31333 = new a(lllIIllIlIII[62], lllIIllIlIII[63], new WorldPoint(lllIIllIlIII[25], lllIIllIlIII[26], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[53], lllIIllIlIII[52], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[23], lllIIllIlIII[24], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[51], lllIIllIlIII[52], lllIIllIlIII[3]));
        TRAIL_31336 = new a(lllIIllIlIII[65], lllIIllIlIII[66], new WorldPoint(lllIIllIlIII[30], lllIIllIlIII[31], lllIIllIlIII[3]), null, null, null);
        TRAIL_31339 = new a(lllIIllIlIII[68], lllIIllIlIII[69], new WorldPoint(lllIIllIlIII[30], lllIIllIlIII[31], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[23], lllIIllIlIII[24], lllIIllIlIII[3]), null, new WorldPoint(lllIIllIlIII[25], lllIIllIlIII[26], lllIIllIlIII[3]));
        TRAIL_31342 = new a(lllIIllIlIII[71], lllIIllIlIII[72], new WorldPoint(lllIIllIlIII[40], lllIIllIlIII[41], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[17], lllIIllIlIII[19], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[38], lllIIllIlIII[39], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[17], lllIIllIlIII[18], lllIIllIlIII[3]));
        TRAIL_31345 = new a(lllIIllIlIII[74], lllIIllIlIII[75], new WorldPoint(lllIIllIlIII[40], lllIIllIlIII[41], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[45], lllIIllIlIII[46], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[38], lllIIllIlIII[39], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[45], lllIIllIlIII[47], lllIIllIlIII[3]));
        TRAIL_31348 = new a(lllIIllIlIII[77], lllIIllIlIII[78], new WorldPoint(lllIIllIlIII[45], lllIIllIlIII[47], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[79], lllIIllIlIII[80], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[45], lllIIllIlIII[46], lllIIllIlIII[3]), null);
        TRAIL_31351 = new a(lllIIllIlIII[82], lllIIllIlIII[83], new WorldPoint(lllIIllIlIII[45], lllIIllIlIII[47], lllIIllIlIII[3]), null, new WorldPoint(lllIIllIlIII[45], lllIIllIlIII[46], lllIIllIlIII[3]), null);
        TRAIL_31354 = new a(lllIIllIlIII[85], lllIIllIlIII[86], new WorldPoint(lllIIllIlIII[53], lllIIllIlIII[52], lllIIllIlIII[3]), null, new WorldPoint(lllIIllIlIII[51], lllIIllIlIII[52], lllIIllIlIII[3]), null);
        TRAIL_31357 = new a(lllIIllIlIII[88], lllIIllIlIII[89], new WorldPoint(lllIIllIlIII[59], lllIIllIlIII[60], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[57], lllIIllIlIII[90], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[57], lllIIllIlIII[58], lllIIllIlIII[3]), null);
        TRAIL_31360 = new a(lllIIllIlIII[92], lllIIllIlIII[93], new WorldPoint(lllIIllIlIII[59], lllIIllIlIII[60], lllIIllIlIII[3]), null, new WorldPoint(lllIIllIlIII[57], lllIIllIlIII[58], lllIIllIlIII[3]), null);
        TRAIL_31363 = new a(lllIIllIlIII[95], lllIIllIlIII[96], new WorldPoint(lllIIllIlIII[57], lllIIllIlIII[58], lllIIllIlIII[3]), null, new WorldPoint(lllIIllIlIII[59], lllIIllIlIII[60], lllIIllIlIII[3]), null);
        TRAIL_31366 = new a(lllIIllIlIII[98], lllIIllIlIII[99], null, null, null, null);
        TRAIL_31369 = new a(lllIIllIlIII[101], lllIIllIlIII[102], new WorldPoint(lllIIllIlIII[79], lllIIllIlIII[80], lllIIllIlIII[3]), null, null, null);
        TRAIL_31372 = new a(lllIIllIlIII[104], lllIIllIlIII[105], new WorldPoint(lllIIllIlIII[57], lllIIllIlIII[90], lllIIllIlIII[3]), null, null, null);
        a[] aArray = new a[lllIIllIlIII[106]];
        aArray[a.lllIIllIlIII[3]] = TRAIL_31303;
        aArray[a.lllIIllIlIII[1]] = TRAIL_31306;
        aArray[a.lllIIllIlIII[2]] = TRAIL_31309;
        aArray[a.lllIIllIlIII[20]] = TRAIL_31312;
        aArray[a.lllIIllIlIII[27]] = TRAIL_31315;
        aArray[a.lllIIllIlIII[32]] = TRAIL_31318;
        aArray[a.lllIIllIlIII[35]] = TRAIL_31321;
        aArray[a.lllIIllIlIII[42]] = TRAIL_31324;
        aArray[a.lllIIllIlIII[48]] = TRAIL_31327;
        aArray[a.lllIIllIlIII[54]] = TRAIL_31330;
        aArray[a.lllIIllIlIII[61]] = TRAIL_31333;
        aArray[a.lllIIllIlIII[64]] = TRAIL_31336;
        aArray[a.lllIIllIlIII[67]] = TRAIL_31339;
        aArray[a.lllIIllIlIII[70]] = TRAIL_31342;
        aArray[a.lllIIllIlIII[73]] = TRAIL_31345;
        aArray[a.lllIIllIlIII[76]] = TRAIL_31348;
        aArray[a.lllIIllIlIII[81]] = TRAIL_31351;
        aArray[a.lllIIllIlIII[84]] = TRAIL_31354;
        aArray[a.lllIIllIlIII[87]] = TRAIL_31357;
        aArray[a.lllIIllIlIII[91]] = TRAIL_31360;
        aArray[a.lllIIllIlIII[94]] = TRAIL_31363;
        aArray[a.lllIIllIlIII[97]] = TRAIL_31366;
        aArray[a.lllIIllIlIII[100]] = TRAIL_31369;
        aArray[a.lllIIllIlIII[103]] = TRAIL_31372;
        $VALUES = aArray;
    }

    private static boolean lIIIlIlIlIlIlll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIlIlIlIlIllI(int n2, int n3) {
        return n2 == n3;
    }

    private static String lIIIlIlIlIIIIlI(String lllllllllllllllIIllIlIIIIIllIIIl, String lllllllllllllllIIllIlIIIIIllIIII) {
        try {
            SecretKeySpec lllllllllllllllIIllIlIIIIIllIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIIIIIllIIII.getBytes(StandardCharsets.UTF_8)), lllIIllIlIII[48]), "DES");
            Cipher lllllllllllllllIIllIlIIIIIllIlIl = Cipher.getInstance("DES");
            lllllllllllllllIIllIlIIIIIllIlIl.init(lllIIllIlIII[2], lllllllllllllllIIllIlIIIIIllIllI);
            return new String(lllllllllllllllIIllIlIIIIIllIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIIIIIllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIlIIIIIllIlII) {
            lllllllllllllllIIllIlIIIIIllIlII.printStackTrace();
            return null;
        }
    }

    private static void lIIIlIlIlIIllIl() {
        lllIIllIIlIl = new String[lllIIllIlIII[106]];
        a.lllIIllIIlIl[a.lllIIllIlIII[3]] = a.lIIIlIlIlIIIIII("InqWqUg0f+zYbFDneCfWOg==", "YWnlp");
        a.lllIIllIIlIl[a.lllIIllIlIII[1]] = a.lIIIlIlIlIIIIlI("NY8W+2Cglj3CG9NtZ1Fqew==", "eTKxf");
        a.lllIIllIIlIl[a.lllIIllIlIII[2]] = a.lIIIlIlIlIIIIll("BRACJC8OcXJeU2g=", "QBCmc");
        a.lllIIllIIlIl[a.lllIIllIlIII[20]] = a.lIIIlIlIlIIIIII("emh8k5rbUVr3vNXXjlRz3Q==", "BYRFz");
        a.lllIIllIIlIl[a.lllIIllIlIII[27]] = a.lIIIlIlIlIIIIll("FSsXHBweSmdmYXQ=", "AyVUP");
        a.lllIIllIIlIl[a.lllIIllIlIII[32]] = a.lIIIlIlIlIIIIII("CBwtPuiQk47xLUyHWYQ62Q==", "tfWkd");
        a.lllIIllIIlIl[a.lllIIllIlIII[35]] = a.lIIIlIlIlIIIIlI("gLN33TLcCy/278Te6sqNmA==", "nYACp");
        a.lllIIllIIlIl[a.lllIIllIlIII[42]] = a.lIIIlIlIlIIIIII("AXQcDCkCHT4rMFtJcfKVZQ==", "PsQit");
        a.lllIIllIIlIl[a.lllIIllIlIII[48]] = a.lIIIlIlIlIIIIll("Fj0CED8dXHJqQXU=", "BoCYs");
        a.lllIIllIIlIl[a.lllIIllIlIII[54]] = a.lIIIlIlIlIIIIll("IxUWLwsodGZVdEc=", "wGWfG");
        a.lllIIllIIlIl[a.lllIIllIlIII[61]] = a.lIIIlIlIlIIIIlI("Br92hVl1qN3OzgvqVx2chA==", "WegKP");
        a.lllIIllIIlIl[a.lllIIllIlIII[64]] = a.lIIIlIlIlIIIIll("OgQ1By4xZUV9UVg=", "nVtNb");
        a.lllIIllIIlIl[a.lllIIllIlIII[67]] = a.lIIIlIlIlIIIIll("ERETJAcacGNeeHw=", "ECRmK");
        a.lllIIllIIlIl[a.lllIIllIlIII[70]] = a.lIIIlIlIlIIIIlI("vtY64YLYDiPzFDw7ggzw5Q==", "QYEYl");
        a.lllIIllIIlIl[a.lllIIllIlIII[73]] = a.lIIIlIlIlIIIIll("LDQkExUnVVRpbU0=", "xfeZY");
        a.lllIIllIIlIl[a.lllIIllIlIII[76]] = a.lIIIlIlIlIIIIll("BT4mJxYOX1Zdbmk=", "QlgnZ");
        a.lllIIllIIlIl[a.lllIIllIlIII[81]] = a.lIIIlIlIlIIIIll("BjoEHD8NW3RmRmM=", "RhEUs");
        a.lllIIllIIlIl[a.lllIIllIlIII[84]] = a.lIIIlIlIlIIIIlI("oS7UmRYsEIoXykMam+rwtg==", "CZqLp");
        a.lllIIllIIlIl[a.lllIIllIlIII[87]] = a.lIIIlIlIlIIIIlI("OOHG8IFihQj95yFRUilEwQ==", "ZevSc");
        a.lllIIllIIlIl[a.lllIIllIlIII[91]] = a.lIIIlIlIlIIIIlI("fFuNwoz1WA2dL1iYP+f/5A==", "TSAvN");
        a.lllIIllIIlIl[a.lllIIllIlIII[94]] = a.lIIIlIlIlIIIIlI("b5Zn8J4BW63i4730dDOxIQ==", "wGOll");
        a.lllIIllIIlIl[a.lllIIllIlIII[97]] = a.lIIIlIlIlIIIIlI("kWCQN0DDr99w3qNhEQoh1w==", "SDvOE");
        a.lllIIllIIlIl[a.lllIIllIlIII[100]] = a.lIIIlIlIlIIIIll("ET4xDgYaX0F0fHw=", "ElpGJ");
        a.lllIIllIIlIl[a.lllIIllIlIII[103]] = a.lIIIlIlIlIIIIII("jjg8f3po4J0xNKeDvyTC5w==", "OZNfw");
    }

    public int b() {
        return this.varp;
    }

    public static a valueOf(String string) {
        return Enum.valueOf(a.class, string);
    }

    private static void lIIIlIlIlIlIlIl() {
        lllIIllIlIII = new int[107];
        a.lllIIllIlIII[0] = -" ".length();
        a.lllIIllIlIII[1] = " ".length();
        a.lllIIllIlIII[2] = "  ".length();
        a.lllIIllIlIII[3] = (0x72 ^ 0x77) & ~(0x87 ^ 0x82);
        a.lllIIllIlIII[4] = -(139 + 140 - 166 + 48) & (0xFFFFFAEF & 0x7FF7);
        a.lllIIllIlIII[5] = 0xFFFF9FFD & 0x766B;
        a.lllIIllIlIII[6] = -(0xFFFFF133 & 0x3FCF) & (0xFFFFFFFB & 0x3F77);
        a.lllIIllIlIII[7] = 0xFFFF9F3B & 0x6FE7;
        a.lllIIllIlIII[8] = -(0xFFFFF3AB & 0x6D5D) & (0xFFFFFF7B & 0x6FFF);
        a.lllIIllIlIII[9] = 0xFFFFFB4F & 0x7EFA;
        a.lllIIllIlIII[10] = -(0xFFFFF39F & 0x2D75) & (0xFFFFBF7E & 0x77FF);
        a.lllIIllIlIII[11] = -(0xFFFFF7AF & 0x39D5) & (0xFFFFFFFE & 0x3FDD);
        a.lllIIllIlIII[12] = 0xFFFFAF37 & 0x5FFA;
        a.lllIIllIlIII[13] = 0xFFFFBF76 & 0x4EDF;
        a.lllIIllIlIII[14] = -(0xFFFFEF59 & 0x70E7) & (0xFFFFFFFF & 0x6F71);
        a.lllIIllIlIII[15] = 0xFFFFFA7D & 0x7FCF;
        a.lllIIllIlIII[16] = 0xFFFF96FB & 0x7F6F;
        a.lllIIllIlIII[17] = 0xFFFFBFED & 0x4E73;
        a.lllIIllIlIII[18] = -(0xFFFFF5FD & 0x7A0F) & (0xFFFFFF3F & 0x7FDF);
        a.lllIIllIlIII[19] = 0xFFFFCF56 & 0x3FBD;
        a.lllIIllIlIII[20] = "   ".length();
        a.lllIIllIlIII[21] = 0xFFFFFFDE & 0x7A71;
        a.lllIIllIlIII[22] = 0xFFFFFFEF & 0x167C;
        a.lllIIllIlIII[23] = -(0xFFFFC7AF & 0x39D2) & (0xFFFFDFFF & 0x2FFF);
        a.lllIIllIlIII[24] = 0xFFFFDF67 & 0x2FBD;
        a.lllIIllIlIII[25] = 0xFFFFEF7F & 0x1EFC;
        a.lllIIllIlIII[26] = -(0xFFFFDCE7 & 0x335B) & (0xFFFF9FF7 & 0x7F6E);
        a.lllIIllIlIII[27] = 0x79 ^ 0x7D;
        a.lllIIllIlIII[28] = -(0xFFFFEDEF & 0x163D) & (0xFFFFFFFF & 0x7E7F);
        a.lllIIllIlIII[29] = 0xFFFF9E7F & 0x77ED;
        a.lllIIllIlIII[30] = -(0x69 ^ 0x64) & (0xFFFFFEFE & 0xF9D);
        a.lllIIllIlIII[31] = -(0xFFFFF63B & 0x79CF) & (0xFFFFFF7F & 0x7FBF);
        a.lllIIllIlIII[32] = 119 + 67 - 124 + 80 ^ 45 + 135 - 66 + 25;
        a.lllIIllIlIII[33] = 0xFFFFFF57 & 0x7AFE;
        a.lllIIllIlIII[34] = 0xFFFFD7FF & 0x3E6E;
        a.lllIIllIlIII[35] = 127 + 100 - 147 + 66 ^ 87 + 56 - 99 + 104;
        a.lllIIllIlIII[36] = -" ".length() & (0xFFFFFAD9 & 0x7F7F);
        a.lllIIllIlIII[37] = 0xFFFF97FF & 0x7E6F;
        a.lllIIllIlIII[38] = 0xFFFFCFD7 & 0x3E7B;
        a.lllIIllIlIII[39] = -(0xFFFFFCF3 & 0x738E) & (0xFFFFFFBF & 0x7FD7);
        a.lllIIllIlIII[40] = 0xFFFFDF5F & 0x2EF4;
        a.lllIIllIlIII[41] = 0xFFFFAF39 & 0x5FDF;
        a.lllIIllIlIII[42] = 31 + 59 - 43 + 112 ^ 68 + 95 - 107 + 96;
        a.lllIIllIlIII[43] = -(0xFFFFBDFB & 0x43A6) & (0xFFFFFFFF & 0x7BFD);
        a.lllIIllIlIII[44] = 0xFFFFFEFA & 0x1775;
        a.lllIIllIlIII[45] = 0xFFFFEE7F & 0x1FE0;
        a.lllIIllIlIII[46] = -(0xFFFF994F & 0x77B3) & (0xFFFF9FFE & Short.MAX_VALUE);
        a.lllIIllIlIII[47] = -(0xFFFFDC8F & 0x7372) & (0xFFFFFFFF & 0x5EFF);
        a.lllIIllIlIII[48] = 0xE9 ^ 0xA0 ^ (0x6D ^ 0x2C);
        a.lllIIllIlIII[49] = 0xFFFFFE7F & 0x7BDF;
        a.lllIIllIlIII[50] = -(0xFFFFC549 & 0x7AB7) & (0xFFFFD6FB & 0x7F75);
        a.lllIIllIlIII[51] = -(0xFFFFF50D & 0x7BFF) & (0xFFFFFF7E & Short.MAX_VALUE);
        a.lllIIllIlIII[52] = 0xFFFFBF77 & 0x4F8F;
        a.lllIIllIlIII[53] = 0xFFFFFFEE & 0xE7F;
        a.lllIIllIlIII[54] = 0x8D ^ 0xA1 ^ (0xB0 ^ 0x95);
        a.lllIIllIlIII[55] = 0xFFFFFFE7 & 0x7A7A;
        a.lllIIllIlIII[56] = -(0xFFFFED6F & 0x3B9D) & (0xFFFFBF7F & 0x7FFE);
        a.lllIIllIlIII[57] = 0xFFFFEF91 & 0x1EEF;
        a.lllIIllIlIII[58] = -(0xFFFFEFDB & 0x30E5) & (0xFFFFEFDA & 0x3FEF);
        a.lllIIllIlIII[59] = -(0xFFFFE759 & 0x19F7) & (0xFFFFBFD3 & 0x4FFF);
        a.lllIIllIlIII[60] = 0xFFFF9FAB & 0x6F5F;
        a.lllIIllIlIII[61] = 0x1D ^ 0x17;
        a.lllIIllIlIII[62] = -(0xFFFFBBBB & 0x45CD) & (0xFFFFFFFF & 0x7BED);
        a.lllIIllIlIII[63] = 0xFFFF969B & 0x7FEC;
        a.lllIIllIlIII[64] = 0x43 ^ 0x48;
        a.lllIIllIlIII[65] = 0xFFFFFB78 & 0x7EEF;
        a.lllIIllIlIII[66] = -(0xFFFFF9E3 & 0x6F7F) & (0xFFFFFFFB & 0x7FEF);
        a.lllIIllIlIII[67] = 0x31 ^ 0x3D;
        a.lllIIllIlIII[68] = -(0xFFFFFDB5 & 0x34F) & (0xFFFFFF6F & 0x7BFF);
        a.lllIIllIlIII[69] = 0xFFFFB79A & 0x5EEF;
        a.lllIIllIlIII[70] = 132 + 21 - 44 + 43 ^ 34 + 12 - 18 + 121;
        a.lllIIllIlIII[71] = 0xFFFFFBEE & 0x7E7F;
        a.lllIIllIlIII[72] = 0xFFFFFEBF & 0x17CB;
        a.lllIIllIlIII[73] = 0x99 ^ 0x97;
        a.lllIIllIlIII[74] = 0xFFFFFF7B & 0x7AF5;
        a.lllIIllIlIII[75] = 0xFFFFD6ED & 0x3F9E;
        a.lllIIllIlIII[76] = 0x7A ^ 0x75;
        a.lllIIllIlIII[77] = 0xFFFFFB75 & 0x7EFE;
        a.lllIIllIlIII[78] = -(0xFFFFFA31 & 0x4DDF) & (0xFFFFFFBD & 0x5EDF);
        a.lllIIllIlIII[79] = 0xFFFFBE7A & 0x4FFF;
        a.lllIIllIlIII[80] = 0xFFFFFFF7 & 0xEEB;
        a.lllIIllIlIII[81] = 0x76 ^ 0x66;
        a.lllIIllIlIII[82] = -(0xFFFFF7C9 & 0xDBF) & (0xFFFFFFFF & Short.MAX_VALUE);
        a.lllIIllIlIII[83] = -(0xFFFFDAE6 & 0x6D3B) & (0xFFFFDEAF & Short.MAX_VALUE);
        a.lllIIllIlIII[84] = 103 + 5 - 68 + 141 ^ 99 + 90 - 137 + 112;
        a.lllIIllIlIII[85] = -(0xFFFF9D8D & 0x6677) & (0xFFFFFEFF & 0x7F7E);
        a.lllIIllIlIII[86] = -(0xFFFFEFFD & 0x7813) & (0xFFFFFEBF & 0x7FDF);
        a.lllIIllIlIII[87] = 91 + 144 - 93 + 36 ^ 53 + 18 - 43 + 132;
        a.lllIIllIlIII[88] = -(0xFFFFFDE5 & 0x61B) & (0xFFFFFEFF & 0x7F7D);
        a.lllIIllIlIII[89] = -(0xFFFFFB7A & 0x65A7) & (0xFFFFF7FD & 0x7FB3);
        a.lllIIllIlIII[90] = 0xFFFFDFC8 & 0x2F37;
        a.lllIIllIlIII[91] = 0x8E ^ 0xAB ^ (0x64 ^ 0x52);
        a.lllIIllIlIII[92] = 0xFFFFFBD9 & 0x7EA6;
        a.lllIIllIlIII[93] = -(0xFFFFF1FF & 0x6F23) & (0xFFFFFFFF & 0x77B3);
        a.lllIIllIlIII[94] = 0x32 ^ 0x26;
        a.lllIIllIlIII[95] = -(0xFB ^ 0xA2) & (0xFFFFFBFF & 0x7EDB);
        a.lllIIllIlIII[96] = 0xFFFFB6F3 & 0x5F7F;
        a.lllIIllIlIII[97] = 0x2A ^ 0x39 ^ (0x3B ^ 0x3D);
        a.lllIIllIlIII[98] = 0xFFFFFF87 & 0x7AFE;
        a.lllIIllIlIII[99] = -(0xFFFFFB9F & 0x6DE2) & (0xFFFFFFF5 & Short.MAX_VALUE);
        a.lllIIllIlIII[100] = 0x35 ^ 0x23;
        a.lllIIllIlIII[101] = -(0xFFFF9C35 & 0x67EB) & (0xFFFFFEAB & 0x7FFD);
        a.lllIIllIlIII[102] = -(0xFFFFFFFF & 0x6983) & (0xFFFFFFFF & 0x7FF7);
        a.lllIIllIlIII[103] = 0x40 ^ 0x57;
        a.lllIIllIlIII[104] = -(0xFFFFC5FF & 0x3E53) & (0xFFFFFEFE & 0x7FDF);
        a.lllIIllIlIII[105] = -(0xFFFFCD2B & 0x3BDD) & (0xFFFF9FFF & 0x7F7E);
        a.lllIIllIlIII[106] = 0x54 ^ 0x4C;
    }

    public int a() {
        return this.id;
    }

    public WorldPoint[] d() {
        a lllllllllllllllIIllIlIIIIIlllIll;
        if (a.lIIIlIlIlIlIllI(this.state, lllIIllIlIII[1])) {
            WorldPoint[] worldPointArray = new WorldPoint[lllIIllIlIII[2]];
            worldPointArray[a.lllIIllIlIII[3]] = this.loc1;
            worldPointArray[a.lllIIllIlIII[1]] = this.loc3;
            return worldPointArray;
        }
        if (a.lIIIlIlIlIlIllI(lllllllllllllllIIllIlIIIIIlllIll.state, lllIIllIlIII[2])) {
            WorldPoint[] worldPointArray = new WorldPoint[lllIIllIlIII[2]];
            worldPointArray[a.lllIIllIlIII[3]] = lllllllllllllllIIllIlIIIIIlllIll.loc2;
            worldPointArray[a.lllIIllIlIII[1]] = lllllllllllllllIIllIlIIIIIlllIll.loc4;
            return worldPointArray;
        }
        return new WorldPoint[lllIIllIlIII[3]];
    }

    private static String lIIIlIlIlIIIIll(String lllllllllllllllIIllIlIIIIIIllllI, String lllllllllllllllIIllIlIIIIIlIIIlI) {
        lllllllllllllllIIllIlIIIIIIllllI = new String(Base64.getDecoder().decode(lllllllllllllllIIllIlIIIIIIllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIlIIIIIlIIIIl = new StringBuilder();
        char[] lllllllllllllllIIllIlIIIIIlIIIII = lllllllllllllllIIllIlIIIIIlIIIlI.toCharArray();
        int lllllllllllllllIIllIlIIIIIIlllll = lllIIllIlIII[3];
        char[] lllllllllllllllIIllIlIIIIIIllIIl = lllllllllllllllIIllIlIIIIIIllllI.toCharArray();
        int lllllllllllllllIIllIlIIIIIIllIII = lllllllllllllllIIllIlIIIIIIllIIl.length;
        int lllllllllllllllIIllIlIIIIIIlIlll = lllIIllIlIII[3];
        while (a.lIIIlIlIlIlIlll(lllllllllllllllIIllIlIIIIIIlIlll, lllllllllllllllIIllIlIIIIIIllIII)) {
            char lllllllllllllllIIllIlIIIIIlIIlII = lllllllllllllllIIllIlIIIIIIllIIl[lllllllllllllllIIllIlIIIIIIlIlll];
            lllllllllllllllIIllIlIIIIIlIIIIl.append((char)(lllllllllllllllIIllIlIIIIIlIIlII ^ lllllllllllllllIIllIlIIIIIlIIIII[lllllllllllllllIIllIlIIIIIIlllll % lllllllllllllllIIllIlIIIIIlIIIII.length]));
            "".length();
            ++lllllllllllllllIIllIlIIIIIIlllll;
            ++lllllllllllllllIIllIlIIIIIIlIlll;
            "".length();
            if ("   ".length() > 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIllIlIIIIIlIIIIl);
    }

    public void a(int n2) {
        this.state = n2;
    }

    private a(int n3, int n4, WorldPoint worldPoint, WorldPoint worldPoint2, WorldPoint worldPoint3, WorldPoint worldPoint4) {
        this.state = lllIIllIlIII[0];
        this.id = n3;
        this.varp = n4;
        this.loc1 = worldPoint;
        this.loc2 = worldPoint2;
        this.loc3 = worldPoint3;
        this.loc4 = worldPoint4;
    }

    private static String lIIIlIlIlIIIIII(String lllllllllllllllIIllIlIIIIIIIllII, String lllllllllllllllIIllIlIIIIIIIlIll) {
        try {
            SecretKeySpec lllllllllllllllIIllIlIIIIIIlIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIIIIIIIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIlIIIIIIlIIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIlIIIIIIlIIII.init(lllIIllIlIII[2], lllllllllllllllIIllIlIIIIIIlIIIl);
            return new String(lllllllllllllllIIllIlIIIIIIlIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIIIIIIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIlIIIIIIIllll) {
            lllllllllllllllIIllIlIIIIIIIllll.printStackTrace();
            return null;
        }
    }

    public static a[] values() {
        return (a[])$VALUES.clone();
    }

    public int c() {
        return this.state;
    }
}

