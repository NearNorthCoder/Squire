package s.r.e.p000.q.i.a.r.b.h.u.r.e.b.i.o;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldPoint;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.a  reason: invalid package */
/* loaded from: df6d2a51-cc28-47f1-b346-c5a30f777aad.jar:s/r/e/-/q/i/a/r/b/h/u/r/e/b/i/o/a.class */
public final class a {
    public static final /* synthetic */ a TRAIL_31339;
    public static final /* synthetic */ a TRAIL_31354;
    public static final /* synthetic */ a TRAIL_31342;
    private /* synthetic */ int state = lllIIllIlIII[0];
    private final /* synthetic */ WorldPoint loc1;
    private final /* synthetic */ WorldPoint loc3;
    public static final /* synthetic */ a TRAIL_31333;
    public static final /* synthetic */ a TRAIL_31372;
    public static final /* synthetic */ a TRAIL_31360;
    public static final /* synthetic */ a TRAIL_31369;
    public static final /* synthetic */ a TRAIL_31351;
    private final /* synthetic */ WorldPoint loc4;
    private final /* synthetic */ int varp;
    public static final /* synthetic */ a TRAIL_31306;
    public static final /* synthetic */ a TRAIL_31330;
    public static final /* synthetic */ a TRAIL_31366;
    public static final /* synthetic */ a TRAIL_31363;
    public static final /* synthetic */ a TRAIL_31348;
    private final /* synthetic */ int id;
    public static final /* synthetic */ a TRAIL_31309;
    private static /* synthetic */ String[] lllIIllIIlIl;
    public static final /* synthetic */ a TRAIL_31321;
    public static final /* synthetic */ a TRAIL_31303;
    private static final /* synthetic */ a[] $VALUES;
    public static final /* synthetic */ a TRAIL_31336;
    public static final /* synthetic */ a TRAIL_31318;
    public static final /* synthetic */ a TRAIL_31312;
    private final /* synthetic */ WorldPoint loc2;
    public static final /* synthetic */ a TRAIL_31345;
    public static final /* synthetic */ a TRAIL_31327;
    private static /* synthetic */ int[] lllIIllIlIII;
    public static final /* synthetic */ a TRAIL_31324;
    public static final /* synthetic */ a TRAIL_31357;
    public static final /* synthetic */ a TRAIL_31315;

    static {
        lIIIlIlIlIlIlIl();
        lIIIlIlIlIIllIl();
        TRAIL_31303 = new a(lllIIllIIlIl[lllIIllIlIII[3]], lllIIllIlIII[3], lllIIllIlIII[4], lllIIllIlIII[5], null, new WorldPoint(lllIIllIlIII[6], lllIIllIlIII[7], lllIIllIlIII[3]), null, new WorldPoint(lllIIllIlIII[8], lllIIllIlIII[7], lllIIllIlIII[3]));
        TRAIL_31306 = new a(lllIIllIIlIl[lllIIllIlIII[1]], lllIIllIlIII[1], lllIIllIlIII[9], lllIIllIlIII[10], null, new WorldPoint(lllIIllIlIII[11], lllIIllIlIII[12], lllIIllIlIII[3]), null, new WorldPoint(lllIIllIlIII[13], lllIIllIlIII[14], lllIIllIlIII[3]));
        TRAIL_31309 = new a(lllIIllIIlIl[lllIIllIlIII[2]], lllIIllIlIII[2], lllIIllIlIII[15], lllIIllIlIII[16], null, new WorldPoint(lllIIllIlIII[17], lllIIllIlIII[18], lllIIllIlIII[3]), null, new WorldPoint(lllIIllIlIII[17], lllIIllIlIII[19], lllIIllIlIII[3]));
        TRAIL_31312 = new a(lllIIllIIlIl[lllIIllIlIII[20]], lllIIllIlIII[20], lllIIllIlIII[21], lllIIllIlIII[22], new WorldPoint(lllIIllIlIII[8], lllIIllIlIII[7], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[23], lllIIllIlIII[24], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[6], lllIIllIlIII[7], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[25], lllIIllIlIII[26], lllIIllIlIII[3]));
        TRAIL_31315 = new a(lllIIllIIlIl[lllIIllIlIII[27]], lllIIllIlIII[27], lllIIllIlIII[28], lllIIllIlIII[29], new WorldPoint(lllIIllIlIII[8], lllIIllIlIII[7], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[30], lllIIllIlIII[31], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[6], lllIIllIlIII[7], lllIIllIlIII[3]), null);
        TRAIL_31318 = new a(lllIIllIIlIl[lllIIllIlIII[32]], lllIIllIlIII[32], lllIIllIlIII[33], lllIIllIlIII[34], new WorldPoint(lllIIllIlIII[13], lllIIllIlIII[14], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[30], lllIIllIlIII[31], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[11], lllIIllIlIII[12], lllIIllIlIII[3]), null);
        TRAIL_31321 = new a(lllIIllIIlIl[lllIIllIlIII[35]], lllIIllIlIII[35], lllIIllIlIII[36], lllIIllIlIII[37], new WorldPoint(lllIIllIlIII[13], lllIIllIlIII[14], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[38], lllIIllIlIII[39], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[11], lllIIllIlIII[12], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[40], lllIIllIlIII[41], lllIIllIlIII[3]));
        TRAIL_31324 = new a(lllIIllIIlIl[lllIIllIlIII[42]], lllIIllIlIII[42], lllIIllIlIII[43], lllIIllIlIII[44], new WorldPoint(lllIIllIlIII[17], lllIIllIlIII[19], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[45], lllIIllIlIII[46], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[17], lllIIllIlIII[18], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[45], lllIIllIlIII[47], lllIIllIlIII[3]));
        TRAIL_31327 = new a(lllIIllIIlIl[lllIIllIlIII[48]], lllIIllIlIII[48], lllIIllIlIII[49], lllIIllIlIII[50], new WorldPoint(lllIIllIlIII[17], lllIIllIlIII[19], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[51], lllIIllIlIII[52], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[17], lllIIllIlIII[18], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[53], lllIIllIlIII[52], lllIIllIlIII[3]));
        TRAIL_31330 = new a(lllIIllIIlIl[lllIIllIlIII[54]], lllIIllIlIII[54], lllIIllIlIII[55], lllIIllIlIII[56], new WorldPoint(lllIIllIlIII[25], lllIIllIlIII[26], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[57], lllIIllIlIII[58], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[23], lllIIllIlIII[24], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[59], lllIIllIlIII[60], lllIIllIlIII[3]));
        TRAIL_31333 = new a(lllIIllIIlIl[lllIIllIlIII[61]], lllIIllIlIII[61], lllIIllIlIII[62], lllIIllIlIII[63], new WorldPoint(lllIIllIlIII[25], lllIIllIlIII[26], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[53], lllIIllIlIII[52], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[23], lllIIllIlIII[24], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[51], lllIIllIlIII[52], lllIIllIlIII[3]));
        TRAIL_31336 = new a(lllIIllIIlIl[lllIIllIlIII[64]], lllIIllIlIII[64], lllIIllIlIII[65], lllIIllIlIII[66], new WorldPoint(lllIIllIlIII[30], lllIIllIlIII[31], lllIIllIlIII[3]), null, null, null);
        TRAIL_31339 = new a(lllIIllIIlIl[lllIIllIlIII[67]], lllIIllIlIII[67], lllIIllIlIII[68], lllIIllIlIII[69], new WorldPoint(lllIIllIlIII[30], lllIIllIlIII[31], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[23], lllIIllIlIII[24], lllIIllIlIII[3]), null, new WorldPoint(lllIIllIlIII[25], lllIIllIlIII[26], lllIIllIlIII[3]));
        TRAIL_31342 = new a(lllIIllIIlIl[lllIIllIlIII[70]], lllIIllIlIII[70], lllIIllIlIII[71], lllIIllIlIII[72], new WorldPoint(lllIIllIlIII[40], lllIIllIlIII[41], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[17], lllIIllIlIII[19], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[38], lllIIllIlIII[39], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[17], lllIIllIlIII[18], lllIIllIlIII[3]));
        TRAIL_31345 = new a(lllIIllIIlIl[lllIIllIlIII[73]], lllIIllIlIII[73], lllIIllIlIII[74], lllIIllIlIII[75], new WorldPoint(lllIIllIlIII[40], lllIIllIlIII[41], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[45], lllIIllIlIII[46], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[38], lllIIllIlIII[39], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[45], lllIIllIlIII[47], lllIIllIlIII[3]));
        TRAIL_31348 = new a(lllIIllIIlIl[lllIIllIlIII[76]], lllIIllIlIII[76], lllIIllIlIII[77], lllIIllIlIII[78], new WorldPoint(lllIIllIlIII[45], lllIIllIlIII[47], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[79], lllIIllIlIII[80], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[45], lllIIllIlIII[46], lllIIllIlIII[3]), null);
        TRAIL_31351 = new a(lllIIllIIlIl[lllIIllIlIII[81]], lllIIllIlIII[81], lllIIllIlIII[82], lllIIllIlIII[83], new WorldPoint(lllIIllIlIII[45], lllIIllIlIII[47], lllIIllIlIII[3]), null, new WorldPoint(lllIIllIlIII[45], lllIIllIlIII[46], lllIIllIlIII[3]), null);
        TRAIL_31354 = new a(lllIIllIIlIl[lllIIllIlIII[84]], lllIIllIlIII[84], lllIIllIlIII[85], lllIIllIlIII[86], new WorldPoint(lllIIllIlIII[53], lllIIllIlIII[52], lllIIllIlIII[3]), null, new WorldPoint(lllIIllIlIII[51], lllIIllIlIII[52], lllIIllIlIII[3]), null);
        TRAIL_31357 = new a(lllIIllIIlIl[lllIIllIlIII[87]], lllIIllIlIII[87], lllIIllIlIII[88], lllIIllIlIII[89], new WorldPoint(lllIIllIlIII[59], lllIIllIlIII[60], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[57], lllIIllIlIII[90], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[57], lllIIllIlIII[58], lllIIllIlIII[3]), null);
        TRAIL_31360 = new a(lllIIllIIlIl[lllIIllIlIII[91]], lllIIllIlIII[91], lllIIllIlIII[92], lllIIllIlIII[93], new WorldPoint(lllIIllIlIII[59], lllIIllIlIII[60], lllIIllIlIII[3]), null, new WorldPoint(lllIIllIlIII[57], lllIIllIlIII[58], lllIIllIlIII[3]), null);
        TRAIL_31363 = new a(lllIIllIIlIl[lllIIllIlIII[94]], lllIIllIlIII[94], lllIIllIlIII[95], lllIIllIlIII[96], new WorldPoint(lllIIllIlIII[57], lllIIllIlIII[58], lllIIllIlIII[3]), null, new WorldPoint(lllIIllIlIII[59], lllIIllIlIII[60], lllIIllIlIII[3]), null);
        TRAIL_31366 = new a(lllIIllIIlIl[lllIIllIlIII[97]], lllIIllIlIII[97], lllIIllIlIII[98], lllIIllIlIII[99], null, null, null, null);
        TRAIL_31369 = new a(lllIIllIIlIl[lllIIllIlIII[100]], lllIIllIlIII[100], lllIIllIlIII[101], lllIIllIlIII[102], new WorldPoint(lllIIllIlIII[79], lllIIllIlIII[80], lllIIllIlIII[3]), null, null, null);
        TRAIL_31372 = new a(lllIIllIIlIl[lllIIllIlIII[103]], lllIIllIlIII[103], lllIIllIlIII[104], lllIIllIlIII[105], new WorldPoint(lllIIllIlIII[57], lllIIllIlIII[90], lllIIllIlIII[3]), null, null, null);
        a[] aVarArr = new a[lllIIllIlIII[106]];
        aVarArr[lllIIllIlIII[3]] = TRAIL_31303;
        aVarArr[lllIIllIlIII[1]] = TRAIL_31306;
        aVarArr[lllIIllIlIII[2]] = TRAIL_31309;
        aVarArr[lllIIllIlIII[20]] = TRAIL_31312;
        aVarArr[lllIIllIlIII[27]] = TRAIL_31315;
        aVarArr[lllIIllIlIII[32]] = TRAIL_31318;
        aVarArr[lllIIllIlIII[35]] = TRAIL_31321;
        aVarArr[lllIIllIlIII[42]] = TRAIL_31324;
        aVarArr[lllIIllIlIII[48]] = TRAIL_31327;
        aVarArr[lllIIllIlIII[54]] = TRAIL_31330;
        aVarArr[lllIIllIlIII[61]] = TRAIL_31333;
        aVarArr[lllIIllIlIII[64]] = TRAIL_31336;
        aVarArr[lllIIllIlIII[67]] = TRAIL_31339;
        aVarArr[lllIIllIlIII[70]] = TRAIL_31342;
        aVarArr[lllIIllIlIII[73]] = TRAIL_31345;
        aVarArr[lllIIllIlIII[76]] = TRAIL_31348;
        aVarArr[lllIIllIlIII[81]] = TRAIL_31351;
        aVarArr[lllIIllIlIII[84]] = TRAIL_31354;
        aVarArr[lllIIllIlIII[87]] = TRAIL_31357;
        aVarArr[lllIIllIlIII[91]] = TRAIL_31360;
        aVarArr[lllIIllIlIII[94]] = TRAIL_31363;
        aVarArr[lllIIllIlIII[97]] = TRAIL_31366;
        aVarArr[lllIIllIlIII[100]] = TRAIL_31369;
        aVarArr[lllIIllIlIII[103]] = TRAIL_31372;
        $VALUES = aVarArr;
    }

    private static boolean lIIIlIlIlIlIlll(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIIlIlIlIlIllI(int i, int i2) {
        return i == i2;
    }

    private static String lIIIlIlIlIIIIlI(String lllllllllllllllIIllIlIIIIIllIIll, String lllllllllllllllIIllIlIIIIIllIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIIIIIllIIlI.getBytes(StandardCharsets.UTF_8)), lllIIllIlIII[48]), "DES");
            Cipher lllllllllllllllIIllIlIIIIIllIlIl = Cipher.getInstance("DES");
            lllllllllllllllIIllIlIIIIIllIlIl.init(lllIIllIlIII[2], secretKeySpec);
            return new String(lllllllllllllllIIllIlIIIIIllIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIIIIIllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIlIIIIIllIlII) {
            lllllllllllllllIIllIlIIIIIllIlII.printStackTrace();
            return null;
        }
    }

    private static void lIIIlIlIlIIllIl() {
        lllIIllIIlIl = new String[lllIIllIlIII[106]];
        lllIIllIIlIl[lllIIllIlIII[3]] = lIIIlIlIlIIIIII("InqWqUg0f+zYbFDneCfWOg==", "YWnlp");
        lllIIllIIlIl[lllIIllIlIII[1]] = lIIIlIlIlIIIIlI("NY8W+2Cglj3CG9NtZ1Fqew==", "eTKxf");
        lllIIllIIlIl[lllIIllIlIII[2]] = lIIIlIlIlIIIIll("BRACJC8OcXJeU2g=", "QBCmc");
        lllIIllIIlIl[lllIIllIlIII[20]] = lIIIlIlIlIIIIII("emh8k5rbUVr3vNXXjlRz3Q==", "BYRFz");
        lllIIllIIlIl[lllIIllIlIII[27]] = lIIIlIlIlIIIIll("FSsXHBweSmdmYXQ=", "AyVUP");
        lllIIllIIlIl[lllIIllIlIII[32]] = lIIIlIlIlIIIIII("CBwtPuiQk47xLUyHWYQ62Q==", "tfWkd");
        lllIIllIIlIl[lllIIllIlIII[35]] = lIIIlIlIlIIIIlI("gLN33TLcCy/278Te6sqNmA==", "nYACp");
        lllIIllIIlIl[lllIIllIlIII[42]] = lIIIlIlIlIIIIII("AXQcDCkCHT4rMFtJcfKVZQ==", "PsQit");
        lllIIllIIlIl[lllIIllIlIII[48]] = lIIIlIlIlIIIIll("Fj0CED8dXHJqQXU=", "BoCYs");
        lllIIllIIlIl[lllIIllIlIII[54]] = lIIIlIlIlIIIIll("IxUWLwsodGZVdEc=", "wGWfG");
        lllIIllIIlIl[lllIIllIlIII[61]] = lIIIlIlIlIIIIlI("Br92hVl1qN3OzgvqVx2chA==", "WegKP");
        lllIIllIIlIl[lllIIllIlIII[64]] = lIIIlIlIlIIIIll("OgQ1By4xZUV9UVg=", "nVtNb");
        lllIIllIIlIl[lllIIllIlIII[67]] = lIIIlIlIlIIIIll("ERETJAcacGNeeHw=", "ECRmK");
        lllIIllIIlIl[lllIIllIlIII[70]] = lIIIlIlIlIIIIlI("vtY64YLYDiPzFDw7ggzw5Q==", "QYEYl");
        lllIIllIIlIl[lllIIllIlIII[73]] = lIIIlIlIlIIIIll("LDQkExUnVVRpbU0=", "xfeZY");
        lllIIllIIlIl[lllIIllIlIII[76]] = lIIIlIlIlIIIIll("BT4mJxYOX1Zdbmk=", "QlgnZ");
        lllIIllIIlIl[lllIIllIlIII[81]] = lIIIlIlIlIIIIll("BjoEHD8NW3RmRmM=", "RhEUs");
        lllIIllIIlIl[lllIIllIlIII[84]] = lIIIlIlIlIIIIlI("oS7UmRYsEIoXykMam+rwtg==", "CZqLp");
        lllIIllIIlIl[lllIIllIlIII[87]] = lIIIlIlIlIIIIlI("OOHG8IFihQj95yFRUilEwQ==", "ZevSc");
        lllIIllIIlIl[lllIIllIlIII[91]] = lIIIlIlIlIIIIlI("fFuNwoz1WA2dL1iYP+f/5A==", "TSAvN");
        lllIIllIIlIl[lllIIllIlIII[94]] = lIIIlIlIlIIIIlI("b5Zn8J4BW63i4730dDOxIQ==", "wGOll");
        lllIIllIIlIl[lllIIllIlIII[97]] = lIIIlIlIlIIIIlI("kWCQN0DDr99w3qNhEQoh1w==", "SDvOE");
        lllIIllIIlIl[lllIIllIlIII[100]] = lIIIlIlIlIIIIll("ET4xDgYaX0F0fHw=", "ElpGJ");
        lllIIllIIlIl[lllIIllIlIII[103]] = lIIIlIlIlIIIIII("jjg8f3po4J0xNKeDvyTC5w==", "OZNfw");
    }

    public int b() {
        return this.varp;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    private static void lIIIlIlIlIlIlIl() {
        lllIIllIlIII = new int[107];
        lllIIllIlIII[0] = -" ".length();
        lllIIllIlIII[1] = " ".length();
        lllIIllIlIII[2] = "  ".length();
        lllIIllIlIII[3] = (114 ^ 119) & ((135 ^ 130) ^ (-1));
        lllIIllIlIII[4] = (-(((139 + 140) - 166) + 48)) & (-1297) & 32759;
        lllIIllIlIII[5] = (-24579) & 30315;
        lllIIllIlIII[6] = (-((-3789) & 16335)) & (-5) & 16247;
        lllIIllIlIII[7] = (-24773) & 28647;
        lllIIllIlIII[8] = (-((-3157) & 27997)) & (-133) & 28671;
        lllIIllIlIII[9] = (-1201) & 32506;
        lllIIllIlIII[10] = (-((-3169) & 11637)) & (-16514) & 30719;
        lllIIllIlIII[11] = (-((-2129) & 14805)) & (-2) & 16349;
        lllIIllIlIII[12] = (-20681) & 24570;
        lllIIllIlIII[13] = (-16522) & 20191;
        lllIIllIlIII[14] = (-((-4263) & 28903)) & (-1) & 28529;
        lllIIllIlIII[15] = (-1411) & 32719;
        lllIIllIlIII[16] = (-26885) & 32623;
        lllIIllIlIII[17] = (-16403) & 20083;
        lllIIllIlIII[18] = (-((-2563) & 31247)) & (-193) & 32735;
        lllIIllIlIII[19] = (-12458) & 16317;
        lllIIllIlIII[20] = "   ".length();
        lllIIllIlIII[21] = (-34) & 31345;
        lllIIllIlIII[22] = (-17) & 5756;
        lllIIllIlIII[23] = (-((-14417) & 14802)) & (-8193) & 12287;
        lllIIllIlIII[24] = (-8345) & 12221;
        lllIIllIlIII[25] = (-4225) & 7932;
        lllIIllIlIII[26] = (-((-8985) & 13147)) & (-24585) & 32622;
        lllIIllIlIII[27] = 121 ^ 125;
        lllIIllIlIII[28] = (-((-4625) & 5693)) & (-1) & 32383;
        lllIIllIlIII[29] = (-24961) & 30701;
        lllIIllIlIII[30] = (-(105 ^ 100)) & (-258) & 3997;
        lllIIllIlIII[31] = (-((-2501) & 31183)) & (-129) & 32703;
        lllIIllIlIII[32] = (((119 + 67) - 124) + 80) ^ (((45 + 135) - 66) + 25);
        lllIIllIlIII[33] = (-169) & 31486;
        lllIIllIlIII[34] = (-10241) & 15982;
        lllIIllIlIII[35] = (((127 + 100) - 147) + 66) ^ (((87 + 56) - 99) + 104);
        lllIIllIlIII[36] = (-" ".length()) & (-1319) & 32639;
        lllIIllIlIII[37] = (-26625) & 32367;
        lllIIllIlIII[38] = (-12329) & 15995;
        lllIIllIlIII[39] = (-((-781) & 29582)) & (-65) & 32727;
        lllIIllIlIII[40] = (-8353) & 12020;
        lllIIllIlIII[41] = (-20679) & 24543;
        lllIIllIlIII[42] = (((31 + 59) - 43) + 112) ^ (((68 + 95) - 107) + 96);
        lllIIllIlIII[43] = (-((-16901) & 17318)) & (-1) & 31741;
        lllIIllIlIII[44] = (-262) & 6005;
        lllIIllIlIII[45] = (-4481) & 8160;
        lllIIllIlIII[46] = (-((-26289) & 30643)) & (-24578) & 32767;
        lllIIllIlIII[47] = (-((-9073) & 29554)) & (-1) & 24319;
        lllIIllIlIII[48] = (233 ^ 160) ^ (109 ^ 44);
        lllIIllIlIII[49] = (-385) & 31711;
        lllIIllIlIII[50] = (-((-15031) & 31415)) & (-10501) & 32629;
        lllIIllIlIII[51] = (-((-2803) & 31743)) & (-130) & 32767;
        lllIIllIlIII[52] = (-16521) & 20367;
        lllIIllIlIII[53] = (-18) & 3711;
        lllIIllIlIII[54] = (141 ^ 161) ^ (176 ^ 149);
        lllIIllIlIII[55] = (-25) & 31354;
        lllIIllIlIII[56] = (-((-4753) & 15261)) & (-16513) & 32766;
        lllIIllIlIII[57] = (-4207) & 7919;
        lllIIllIlIII[58] = (-((-4133) & 12517)) & (-4134) & 16367;
        lllIIllIlIII[59] = (-((-6311) & 6647)) & (-16429) & 20479;
        lllIIllIlIII[60] = (-24661) & 28511;
        lllIIllIlIII[61] = 29 ^ 23;
        lllIIllIlIII[62] = (-((-17477) & 17869)) & (-1) & 31725;
        lllIIllIlIII[63] = (-26981) & 32748;
        lllIIllIlIII[64] = 67 ^ 72;
        lllIIllIlIII[65] = (-1160) & 32495;
        lllIIllIlIII[66] = (-((-1565) & 28543)) & (-5) & 32751;
        lllIIllIlIII[67] = 49 ^ 61;
        lllIIllIlIII[68] = (-((-587) & 847)) & (-145) & 31743;
        lllIIllIlIII[69] = (-18534) & 24303;
        lllIIllIlIII[70] = (((132 + 21) - 44) + 43) ^ (((34 + 12) - 18) + 121);
        lllIIllIlIII[71] = (-1042) & 32383;
        lllIIllIlIII[72] = (-321) & 6091;
        lllIIllIlIII[73] = 153 ^ 151;
        lllIIllIlIII[74] = (-133) & 31477;
        lllIIllIlIII[75] = (-10515) & 16286;
        lllIIllIlIII[76] = 122 ^ 117;
        lllIIllIlIII[77] = (-1163) & 32510;
        lllIIllIlIII[78] = (-((-1487) & 19935)) & (-67) & 24287;
        lllIIllIlIII[79] = (-16774) & 20479;
        lllIIllIlIII[80] = (-9) & 3819;
        lllIIllIlIII[81] = 118 ^ 102;
        lllIIllIlIII[82] = (-((-2103) & 3519)) & (-1) & 32767;
        lllIIllIlIII[83] = (-((-9498) & 27963)) & (-8529) & 32767;
        lllIIllIlIII[84] = (((103 + 5) - 68) + 141) ^ (((99 + 90) - 137) + 112);
        lllIIllIlIII[85] = (-((-25203) & 26231)) & (-257) & 32638;
        lllIIllIlIII[86] = (-((-4099) & 30739)) & (-321) & 32735;
        lllIIllIlIII[87] = (((91 + 144) - 93) + 36) ^ (((53 + 18) - 43) + 132);
        lllIIllIlIII[88] = (-((-539) & 1563)) & (-257) & 32637;
        lllIIllIlIII[89] = (-((-1158) & 26023)) & (-2051) & 32691;
        lllIIllIlIII[90] = (-8248) & 12087;
        lllIIllIlIII[91] = (142 ^ 171) ^ (100 ^ 82);
        lllIIllIlIII[92] = (-1063) & 32422;
        lllIIllIlIII[93] = (-((-3585) & 28451)) & (-1) & 30643;
        lllIIllIlIII[94] = 50 ^ 38;
        lllIIllIlIII[95] = (-(251 ^ 162)) & (-1025) & 32475;
        lllIIllIlIII[96] = (-18701) & 24447;
        lllIIllIlIII[97] = (42 ^ 57) ^ (59 ^ 61);
        lllIIllIlIII[98] = (-121) & 31486;
        lllIIllIlIII[99] = (-((-1121) & 28130)) & (-11) & 32767;
        lllIIllIlIII[100] = 53 ^ 35;
        lllIIllIlIII[101] = (-((-25547) & 26603)) & (-341) & 32765;
        lllIIllIlIII[102] = (-((-1) & 27011)) & (-1) & 32759;
        lllIIllIlIII[103] = 64 ^ 87;
        lllIIllIlIII[104] = (-((-14849) & 15955)) & (-258) & 32735;
        lllIIllIlIII[105] = (-((-13013) & 15325)) & (-24577) & 32638;
        lllIIllIlIII[106] = 84 ^ 76;
    }

    public int a() {
        return this.id;
    }

    public WorldPoint[] d() {
        if (lIIIlIlIlIlIllI(this.state, lllIIllIlIII[1])) {
            WorldPoint[] worldPointArr = new WorldPoint[lllIIllIlIII[2]];
            worldPointArr[lllIIllIlIII[3]] = this.loc1;
            worldPointArr[lllIIllIlIII[1]] = this.loc3;
            return worldPointArr;
        } else if (lIIIlIlIlIlIllI(this.state, lllIIllIlIII[2])) {
            WorldPoint[] worldPointArr2 = new WorldPoint[lllIIllIlIII[2]];
            worldPointArr2[lllIIllIlIII[3]] = this.loc2;
            worldPointArr2[lllIIllIlIII[1]] = this.loc4;
            return worldPointArr2;
        } else {
            return new WorldPoint[lllIIllIlIII[3]];
        }
    }

    private static String lIIIlIlIlIIIIll(String lllllllllllllllIIllIlIIIIIlIIIll, String lllllllllllllllIIllIlIIIIIlIIIlI) {
        String lllllllllllllllIIllIlIIIIIlIIIll2 = new String(Base64.getDecoder().decode(lllllllllllllllIIllIlIIIIIlIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIlIIIIIlIIIIl = new StringBuilder();
        char[] lllllllllllllllIIllIlIIIIIlIIIII = lllllllllllllllIIllIlIIIIIlIIIlI.toCharArray();
        int lllllllllllllllIIllIlIIIIIIlllll = lllIIllIlIII[3];
        char[] charArray = lllllllllllllllIIllIlIIIIIlIIIll2.toCharArray();
        int length = charArray.length;
        int i = lllIIllIlIII[3];
        while (lIIIlIlIlIlIlll(i, length)) {
            lllllllllllllllIIllIlIIIIIlIIIIl.append((char) (charArray[i] ^ lllllllllllllllIIllIlIIIIIlIIIII[lllllllllllllllIIllIlIIIIIIlllll % lllllllllllllllIIllIlIIIIIlIIIII.length]));
            "".length();
            lllllllllllllllIIllIlIIIIIIlllll++;
            i++;
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIllIlIIIIIlIIIIl);
    }

    public void a(int i) {
        this.state = i;
    }

    private a(String str, int i, int i2, int i3, WorldPoint worldPoint, WorldPoint worldPoint2, WorldPoint worldPoint3, WorldPoint worldPoint4) {
        this.id = i2;
        this.varp = i3;
        this.loc1 = worldPoint;
        this.loc2 = worldPoint2;
        this.loc3 = worldPoint3;
        this.loc4 = worldPoint4;
    }

    private static String lIIIlIlIlIIIIII(String lllllllllllllllIIllIlIIIIIIIlllI, String lllllllllllllllIIllIlIIIIIIIllIl) {
        try {
            SecretKeySpec lllllllllllllllIIllIlIIIIIIlIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIIIIIIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllIIllIlIII[2], lllllllllllllllIIllIlIIIIIIlIIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIIIIIIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIlIIIIIIIllll) {
            lllllllllllllllIIllIlIIIIIIIllll.printStackTrace();
            return null;
        }
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public int c() {
        return this.state;
    }
}
