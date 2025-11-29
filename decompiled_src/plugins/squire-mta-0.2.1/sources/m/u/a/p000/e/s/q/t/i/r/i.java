package m.u.a.p000.e.s.q.t.i.r;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.unethicalite.api.widgets.Widgets;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: m.u.a.-.e.s.q.t.i.r.i  reason: invalid package */
/* loaded from: squire-mta-0.2.1.jar:m/u/a/-/e/s/q/t/i/r/i.class */
public final class i {
    private final /* synthetic */ int widgetId;
    public static final /* synthetic */ i PENTAMID;
    private final /* synthetic */ int groupId;
    private static /* synthetic */ int[] lllIllIIIIlI;
    private static /* synthetic */ String[] lllIllIIIIII;
    public static final /* synthetic */ i CUBE;
    private static final /* synthetic */ i[] $VALUES;
    public static final /* synthetic */ i CYLINDER;
    public static final /* synthetic */ i ICOSAHEDRON;
    private final /* synthetic */ String itemName;
    private final /* synthetic */ String pile_name;

    private static boolean lIIIllIIllIlIIl(int i, int i2) {
        return i < i2;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }

    private static String lIIIllIIllIIIII(String lllllllllllllllIIllIlIIIlllIIIII, String lllllllllllllllIIllIlIIIllIlllll) {
        try {
            SecretKeySpec lllllllllllllllIIllIlIIIlllIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIIIllIlllll.getBytes(StandardCharsets.UTF_8)), lllIllIIIIlI[12]), "DES");
            Cipher lllllllllllllllIIllIlIIIlllIIIlI = Cipher.getInstance("DES");
            lllllllllllllllIIllIlIIIlllIIIlI.init(lllIllIIIIlI[4], lllllllllllllllIIllIlIIIlllIIIll);
            return new String(lllllllllllllllIIllIlIIIlllIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIIIlllIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIlIIIlllIIIIl) {
            lllllllllllllllIIllIlIIIlllIIIIl.printStackTrace();
            return null;
        }
    }

    static {
        lIIIllIIllIlIII();
        lIIIllIIllIIlll();
        CUBE = new i(lllIllIIIIII[lllIllIIIIlI[0]], lllIllIIIIlI[0], lllIllIIIIII[lllIllIIIIlI[1]], lllIllIIIIlI[2], lllIllIIIIlI[3], lllIllIIIIII[lllIllIIIIlI[4]]);
        CYLINDER = new i(lllIllIIIIII[lllIllIIIIlI[5]], lllIllIIIIlI[1], lllIllIIIIII[lllIllIIIIlI[6]], lllIllIIIIlI[2], lllIllIIIIlI[7], lllIllIIIIII[lllIllIIIIlI[8]]);
        PENTAMID = new i(lllIllIIIIII[lllIllIIIIlI[9]], lllIllIIIIlI[4], lllIllIIIIII[lllIllIIIIlI[10]], lllIllIIIIlI[2], lllIllIIIIlI[11], lllIllIIIIII[lllIllIIIIlI[12]]);
        ICOSAHEDRON = new i(lllIllIIIIII[lllIllIIIIlI[13]], lllIllIIIIlI[5], lllIllIIIIII[lllIllIIIIlI[3]], lllIllIIIIlI[2], lllIllIIIIlI[14], lllIllIIIIII[lllIllIIIIlI[15]]);
        i[] iVarArr = new i[lllIllIIIIlI[6]];
        iVarArr[lllIllIIIIlI[0]] = CUBE;
        iVarArr[lllIllIIIIlI[1]] = CYLINDER;
        iVarArr[lllIllIIIIlI[4]] = PENTAMID;
        iVarArr[lllIllIIIIlI[5]] = ICOSAHEDRON;
        $VALUES = iVarArr;
    }

    public String y() {
        return this.pile_name;
    }

    private static String lIIIllIIllIIIIl(String lllllllllllllllIIllIlIIIllIlIIII, String lllllllllllllllIIllIlIIIllIIllll) {
        String lllllllllllllllIIllIlIIIllIlIIII2 = new String(Base64.getDecoder().decode(lllllllllllllllIIllIlIIIllIlIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIIllIlIIIllIIllIl = lllllllllllllllIIllIlIIIllIIllll.toCharArray();
        int lllllllllllllllIIllIlIIIllIIllII = lllIllIIIIlI[0];
        char[] charArray = lllllllllllllllIIllIlIIIllIlIIII2.toCharArray();
        int length = charArray.length;
        int i = lllIllIIIIlI[0];
        while (lIIIllIIllIlIIl(i, length)) {
            sb.append((char) (charArray[i] ^ lllllllllllllllIIllIlIIIllIIllIl[lllllllllllllllIIllIlIIIllIIllII % lllllllllllllllIIllIlIIIllIIllIl.length]));
            "".length();
            lllllllllllllllIIllIlIIIllIIllII++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void lIIIllIIllIIlll() {
        lllIllIIIIII = new String[lllIllIIIIlI[7]];
        lllIllIIIIII[lllIllIIIIlI[0]] = lIIIllIIllIIIII("hGYoSCRIDEs=", "WAseb");
        lllIllIIIIII[lllIllIIIIlI[1]] = lIIIllIIllIIIIl("GRA6Jg==", "ZeXCA");
        lllIllIIIIII[lllIllIIIIlI[4]] = lIIIllIIllIIIIl("EwUnLngAGSku", "PpEKX");
        lllIllIIIIII[lllIllIIIIlI[5]] = lIIIllIIllIIIlI("h9pVmcJT5JnYHCOtRa2JYQ==", "MLnmk");
        lllIllIIIIII[lllIllIIIIlI[6]] = lIIIllIIllIIIII("5gbmT0E7o+RE8WFW7OlYNw==", "fqCnR");
        lllIllIIIIII[lllIllIIIIlI[8]] = lIIIllIIllIIIlI("8MEaH4mCNdir98uotwHtPg==", "nkIPy");
        lllIllIIIIII[lllIllIIIIlI[9]] = lIIIllIIllIIIlI("6Y3Qy+pCdM+IwWLyPNIkEw==", "IvVfz");
        lllIllIIIIII[lllIllIIIIlI[10]] = lIIIllIIllIIIlI("C6T6C6KbXFaeDoiu46MGlQ==", "kDzaB");
        lllIllIIIIII[lllIllIIIIlI[12]] = lIIIllIIllIIIlI("NKqov1riXy9Spuv8ZBQGBg==", "TkThv");
        lllIllIIIIII[lllIllIIIIlI[13]] = lIIIllIIllIIIlI("gxvUz9tPAw/c7rRifhvFyA==", "nfZVX");
        lllIllIIIIII[lllIllIIIIlI[3]] = lIIIllIIllIIIlI("EocvAIUj8ihShUNX3rzFDg==", "qtzsq");
        lllIllIIIIII[lllIllIIIIlI[15]] = lIIIllIIllIIIlI("EWx0fQ0PJrogDYn4UcCHZoj05efVJ3tN", "OfLpn");
    }

    public int x() {
        return this.widgetId;
    }

    public String v() {
        return this.itemName;
    }

    private static void lIIIllIIllIlIII() {
        lllIllIIIIlI = new int[16];
        lllIllIIIIlI[0] = ((((124 + 88) - 68) + 4) ^ (((179 + 28) - 79) + 52)) & (((114 ^ 87) ^ (4 ^ 1)) ^ (-" ".length()));
        lllIllIIIIlI[1] = " ".length();
        lllIllIIIIlI[2] = ((14 + 75) - (-62)) + 44;
        lllIllIIIIlI[3] = 37 ^ 47;
        lllIllIIIIlI[4] = "  ".length();
        lllIllIIIIlI[5] = "   ".length();
        lllIllIIIIlI[6] = (199 ^ 182) ^ (193 ^ 180);
        lllIllIIIIlI[7] = (64 ^ 27) ^ (76 ^ 27);
        lllIllIIIIlI[8] = (69 ^ 18) ^ (16 ^ 66);
        lllIllIIIIlI[9] = (32 ^ 96) ^ (126 ^ 56);
        lllIllIIIIlI[10] = (41 ^ 4) ^ (20 ^ 62);
        lllIllIIIIlI[11] = (49 ^ 107) ^ (197 ^ 145);
        lllIllIIIIlI[12] = 169 ^ 161;
        lllIllIIIIlI[13] = (111 ^ 80) ^ (140 ^ 186);
        lllIllIIIIlI[14] = (30 ^ 7) ^ (206 ^ 199);
        lllIllIIIIlI[15] = (51 ^ 22) ^ (128 ^ 174);
    }

    public int w() {
        return this.groupId;
    }

    private i(String str, int i, String str2, int i2, int i3, String str3) {
        this.itemName = str2;
        this.groupId = i2;
        this.widgetId = i3;
        this.pile_name = str3;
    }

    private static String lIIIllIIllIIIlI(String lllllllllllllllIIllIlIIIlllIlIll, String lllllllllllllllIIllIlIIIlllIllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIIIlllIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllIllIIIIlI[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIIIlllIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIlIIIlllIlllI) {
            lllllllllllllllIIllIlIIIlllIlllI.printStackTrace();
            return null;
        }
    }

    public boolean z() {
        return Widgets.isVisible(Widgets.get(this.groupId, this.widgetId));
    }
}
