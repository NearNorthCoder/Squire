/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.game.ItemManager
 */
package g.r.r.-.t.q.i.u.o.e.s;

import g.r.r.-.t.q.i.u.o.e.s.b;
import java.awt.image.BufferedImage;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.game.ItemManager;

public final class d
extends Enum<d> {
    public static final /* synthetic */ /* enum */ d WATER;
    public static final /* synthetic */ /* enum */ d LAW;
    public static final /* synthetic */ /* enum */ d NATURE;
    public static final /* synthetic */ /* enum */ d AIR;
    public static final /* synthetic */ /* enum */ d CHAOS;
    private final /* synthetic */ int runeId;
    private final /* synthetic */ b cellType;
    public static final /* synthetic */ /* enum */ d EARTH;
    public static final /* synthetic */ /* enum */ d FIRE;
    private final /* synthetic */ int talismanId;
    private static final /* synthetic */ d[] $VALUES;
    public static final /* synthetic */ /* enum */ d MIND;
    private final /* synthetic */ WorldPoint location;
    public static final /* synthetic */ /* enum */ d DEATH;
    private final /* synthetic */ int levelRequired;
    public static final /* synthetic */ /* enum */ d BLOOD;
    private static /* synthetic */ String[] llIIlllIIlII;
    public static final /* synthetic */ /* enum */ d COSMIC;
    private final /* synthetic */ boolean isCatalytic;
    private static /* synthetic */ int[] llIIlllIIlIl;
    private final /* synthetic */ int spriteId;
    public static final /* synthetic */ /* enum */ d BODY;

    private static void lllllllIIlIIII() {
        llIIlllIIlII = new String[llIIlllIIlIl[75]];
        d.llIIlllIIlII[d.llIIlllIIlIl[0]] = d.lllllllIIIllIl("/D57XyKa9xKJ/1qZ141a1Q==", "CkUPg");
        d.llIIlllIIlII[d.llIIlllIIlIl[1]] = d.lllllllIIIlllI("T9jQdXSBl8w=", "RlITH");
        d.llIIlllIIlII[d.llIIlllIIlIl[7]] = d.lllllllIIIllIl("85B3ji3699U=", "rnuIW");
        d.llIIlllIIlII[d.llIIlllIIlIl[12]] = d.lllllllIIIlllI("D3BoxKL02Rc=", "KLEaF");
        d.llIIlllIIlII[d.llIIlllIIlIl[19]] = d.lllllllIIIllIl("rMHpCLW8izI=", "FbozK");
        d.llIIlllIIlII[d.llIIlllIIlIl[13]] = d.lllllllIIIlllI("BEsiuHIh2BI=", "TUEDM");
        d.llIIlllIIlII[d.llIIlllIIlIl[30]] = d.lllllllIIIlllI("XsIeXYfMZ2o=", "jkQFx");
        d.llIIlllIIlII[d.llIIlllIIlIl[37]] = d.lllllllIIIllIl("xHHFM1/Awpw=", "FWFYF");
        d.llIIlllIIlII[d.llIIlllIIlIl[43]] = d.lllllllIIIlllI("JOXvQgZyiMg=", "pATcs");
        d.llIIlllIIlII[d.llIIlllIIlIl[20]] = d.lllllllIIIllll("Pgc4HBk1", "pFlIK");
        d.llIIlllIIlII[d.llIIlllIIlIl[56]] = d.lllllllIIIllll("Gy8C", "WnUeJ");
        d.llIIlllIIlII[d.llIIlllIIlIl[63]] = d.lllllllIIIllIl("efsY8p4o9vM=", "uayEg");
        d.llIIlllIIlII[d.llIIlllIIlIl[69]] = d.lllllllIIIllll("GyEVKBw=", "YmZgX");
    }

    public String U() {
        String string = super.toString();
        return string.charAt(llIIlllIIlIl[0]) + string.substring(llIIlllIIlIl[1]).toLowerCase();
    }

    public boolean Z() {
        return this.isCatalytic;
    }

    public b aa() {
        return this.cellType;
    }

    public BufferedImage b(ItemManager itemManager) {
        return itemManager.getImage(this.talismanId);
    }

    public String T() {
        Object[] objectArray = new Object[llIIlllIIlIl[1]];
        objectArray[d.llIIlllIIlIl[0]] = this.U();
        return String.format(llIIlllIIlII[llIIlllIIlIl[0]], objectArray);
    }

    public static d valueOf(String string) {
        return Enum.valueOf(d.class, string);
    }

    public static d[] values() {
        return (d[])$VALUES.clone();
    }

    public int W() {
        return this.runeId;
    }

    private static boolean lllllllIIlIIlI(int n2, int n3) {
        return n2 < n3;
    }

    public int Y() {
        return this.spriteId;
    }

    public int X() {
        return this.talismanId;
    }

    static {
        d.lllllllIIlIIIl();
        d.lllllllIIlIIII();
        AIR = new d(llIIlllIIlIl[1], llIIlllIIlIl[2], llIIlllIIlIl[3], llIIlllIIlIl[4], llIIlllIIlIl[0], b.WEAK, new WorldPoint(llIIlllIIlIl[5], llIIlllIIlIl[6], llIIlllIIlIl[0]));
        MIND = new d(llIIlllIIlIl[7], llIIlllIIlIl[8], llIIlllIIlIl[9], llIIlllIIlIl[10], llIIlllIIlIl[1], b.WEAK, new WorldPoint(llIIlllIIlIl[11], llIIlllIIlIl[6], llIIlllIIlIl[0]));
        WATER = new d(llIIlllIIlIl[13], llIIlllIIlIl[14], llIIlllIIlIl[15], llIIlllIIlIl[16], llIIlllIIlIl[0], b.MEDIUM, new WorldPoint(llIIlllIIlIl[17], llIIlllIIlIl[18], llIIlllIIlIl[0]));
        EARTH = new d(llIIlllIIlIl[20], llIIlllIIlIl[21], llIIlllIIlIl[22], llIIlllIIlIl[23], llIIlllIIlIl[0], b.STRONG, new WorldPoint(llIIlllIIlIl[17], llIIlllIIlIl[24], llIIlllIIlIl[0]));
        FIRE = new d(llIIlllIIlIl[25], llIIlllIIlIl[26], llIIlllIIlIl[27], llIIlllIIlIl[28], llIIlllIIlIl[0], b.OVERCHARGED, new WorldPoint(llIIlllIIlIl[5], llIIlllIIlIl[29], llIIlllIIlIl[0]));
        BODY = new d(llIIlllIIlIl[31], llIIlllIIlIl[32], llIIlllIIlIl[33], llIIlllIIlIl[34], llIIlllIIlIl[1], b.WEAK, new WorldPoint(llIIlllIIlIl[35], llIIlllIIlIl[36], llIIlllIIlIl[0]));
        COSMIC = new d(llIIlllIIlIl[38], llIIlllIIlIl[39], llIIlllIIlIl[40], llIIlllIIlIl[41], llIIlllIIlIl[1], b.MEDIUM, new WorldPoint(llIIlllIIlIl[42], llIIlllIIlIl[36], llIIlllIIlIl[0]));
        CHAOS = new d(llIIlllIIlIl[44], llIIlllIIlIl[45], llIIlllIIlIl[46], llIIlllIIlIl[47], llIIlllIIlIl[1], b.MEDIUM, new WorldPoint(llIIlllIIlIl[48], llIIlllIIlIl[49], llIIlllIIlIl[0]));
        NATURE = new d(llIIlllIIlIl[50], llIIlllIIlIl[51], llIIlllIIlIl[52], llIIlllIIlIl[53], llIIlllIIlIl[1], b.STRONG, new WorldPoint(llIIlllIIlIl[54], llIIlllIIlIl[55], llIIlllIIlIl[0]));
        LAW = new d(llIIlllIIlIl[57], llIIlllIIlIl[58], llIIlllIIlIl[59], llIIlllIIlIl[60], llIIlllIIlIl[1], b.STRONG, new WorldPoint(llIIlllIIlIl[61], llIIlllIIlIl[62], llIIlllIIlIl[0]));
        DEATH = new d(llIIlllIIlIl[64], llIIlllIIlIl[65], llIIlllIIlIl[66], llIIlllIIlIl[67], llIIlllIIlIl[1], b.OVERCHARGED, new WorldPoint(llIIlllIIlIl[48], llIIlllIIlIl[68], llIIlllIIlIl[0]));
        BLOOD = new d(llIIlllIIlIl[70], llIIlllIIlIl[71], llIIlllIIlIl[72], llIIlllIIlIl[73], llIIlllIIlIl[1], b.OVERCHARGED, new WorldPoint(llIIlllIIlIl[74], llIIlllIIlIl[29], llIIlllIIlIl[0]));
        d[] dArray = new d[llIIlllIIlIl[69]];
        dArray[d.llIIlllIIlIl[0]] = AIR;
        dArray[d.llIIlllIIlIl[1]] = MIND;
        dArray[d.llIIlllIIlIl[7]] = WATER;
        dArray[d.llIIlllIIlIl[12]] = EARTH;
        dArray[d.llIIlllIIlIl[19]] = FIRE;
        dArray[d.llIIlllIIlIl[13]] = BODY;
        dArray[d.llIIlllIIlIl[30]] = COSMIC;
        dArray[d.llIIlllIIlIl[37]] = CHAOS;
        dArray[d.llIIlllIIlIl[43]] = NATURE;
        dArray[d.llIIlllIIlIl[20]] = LAW;
        dArray[d.llIIlllIIlIl[56]] = DEATH;
        dArray[d.llIIlllIIlIl[63]] = BLOOD;
        $VALUES = dArray;
    }

    private static String lllllllIIIlllI(String lllllllllllllllIlIIlIlllllllIlII, String lllllllllllllllIlIIlIlllllllIlIl) {
        try {
            SecretKeySpec lllllllllllllllIlIIlIllllllllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIlllllllIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIlIllllllllIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIlIllllllllIII.init(llIIlllIIlIl[7], lllllllllllllllIlIIlIllllllllIIl);
            return new String(lllllllllllllllIlIIlIllllllllIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIlllllllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIlIlllllllIlll) {
            lllllllllllllllIlIIlIlllllllIlll.printStackTrace();
            return null;
        }
    }

    public WorldPoint ab() {
        return this.location;
    }

    private static void lllllllIIlIIIl() {
        llIIlllIIlIl = new int[76];
        d.llIIlllIIlIl[0] = "   ".length() & ("   ".length() ^ -" ".length());
        d.llIIlllIIlIl[1] = " ".length();
        d.llIIlllIIlIl[2] = -(0xFFFFFBE1 & 0x3D9F) & (0xFFFFFFFF & 0x3BAC);
        d.llIIlllIIlIl[3] = 0xFFFFEB17 & 0x7DEF;
        d.llIIlllIIlIl[4] = 0xFFFFF7E5 & 0x191B;
        d.llIIlllIIlIl[5] = -(0xFFFFF9D7 & 0x37FD) & (0xFFFFFFF5 & 0x3FFF);
        d.llIIlllIIlIl[6] = -(0xFFFFFDA9 & 0x52FF) & (0xFFFFF5FD & 0x7FBF);
        d.llIIlllIIlIl[7] = "  ".length();
        d.llIIlllIIlIl[8] = 0xFFFF863F & 0x7BEE;
        d.llIIlllIIlIl[9] = -(0xFFFFFFF1 & 0x16BF) & (0xFFFFFFBB & Short.MAX_VALUE);
        d.llIIlllIIlIl[10] = -(0xFFFFF777 & 0x4ECD) & (0xFFFFD77F & 0x7FC6);
        d.llIIlllIIlIl[11] = -(0xFFFFFFA7 & 0x31FB) & (0xFFFFBFBF & Short.MAX_VALUE);
        d.llIIlllIIlIl[12] = "   ".length();
        d.llIIlllIIlIl[13] = 55 + 136 - 175 + 157 ^ 92 + 143 - 92 + 25;
        d.llIIlllIIlIl[14] = 0xFFFFCFBB & 0x326F;
        d.llIIlllIIlIl[15] = 0xFFFFEB0E & 0x7DF9;
        d.llIIlllIIlIl[16] = -(0xFFFFF5ED & 0x6ADF) & (0xFFFFF1CF & Short.MAX_VALUE);
        d.llIIlllIIlIl[17] = -(0xFFFFFE9D & 0x51FB) & (0xFFFFFFFF & 0x5EBF);
        d.llIIlllIIlIl[18] = -(0xFFFFC6DF & 0x7B61) & (0xFFFFF7FF & 0x6F5B);
        d.llIIlllIIlIl[19] = 0x7E ^ 0x3D ^ (5 ^ 0x42);
        d.llIIlllIIlIl[20] = 0x24 ^ 0x2D;
        d.llIIlllIIlIl[21] = 0xFFFF866D & 0x7BBF;
        d.llIIlllIIlIl[22] = -(0xFFFF9FA7 & 0x70DF) & (0xFFFFFF9F & 0x79EF);
        d.llIIlllIIlIl[23] = 0xFFFFB93C & 0x57C7;
        d.llIIlllIIlIl[24] = 0xFFFFE575 & 0x3FAA;
        d.llIIlllIIlIl[25] = 0x2F ^ 0x67 ^ (0xC1 ^ 0x87);
        d.llIIlllIIlIl[26] = 0xFFFF922A & 0x6FFF;
        d.llIIlllIIlIl[27] = -(0xFFFFFCCF & 0x1375) & (0xFFFFFBCE & 0x7D7F);
        d.llIIlllIIlIl[28] = 0xFFFFDD4D & 0x33B7;
        d.llIIlllIIlIl[29] = -(0xFFFFE6FB & 0x595D) & (0xFFFFEFFF & 0x757E);
        d.llIIlllIIlIl[30] = 0x2F ^ 0x29;
        d.llIIlllIIlIl[31] = 0xB0 ^ 0xA4;
        d.llIIlllIIlIl[32] = -(0xFFFFFCBB & 0x5FD5) & (0xFFFFFEBF & 0x5FFF);
        d.llIIlllIIlIl[33] = 0xFFFFF96F & 0x6F9F;
        d.llIIlllIIlIl[34] = -(0xFFFFDCFA & 0x6FDF) & (0xFFFFDDFF & 0x7FDF);
        d.llIIlllIIlIl[35] = 0xFFFFFFF9 & 0xE1E;
        d.llIIlllIIlIl[36] = -(0xFFFFEE8D & 0x51F3) & (0xFFFFF797 & 0x6DFF);
        d.llIIlllIIlIl[37] = 0x11 ^ 0x16;
        d.llIIlllIIlIl[38] = 0x14 ^ 0xF;
        d.llIIlllIIlIl[39] = 0xFFFF8A7D & 0x77B6;
        d.llIIlllIIlIl[40] = -(0xFFFFE7C3 & 0x1EFF) & (0xFFFFEFFA & 0x7FD7);
        d.llIIlllIIlIl[41] = -(0xFFFF9FFB & 0x6E7D) & (0xFFFFBFFF & 0x5F7F);
        d.llIIlllIIlIl[42] = 0xFFFFFE75 & 0xFAF;
        d.llIIlllIIlIl[43] = 0x7F ^ 0x36 ^ (0x54 ^ 0x15);
        d.llIIlllIIlIl[44] = 0x88 ^ 0xAB;
        d.llIIlllIIlIl[45] = 0xFFFFBB73 & 0x46BE;
        d.llIIlllIIlIl[46] = -(0xFFFFEFF7 & 0x12F9) & (0xFFFFFFFD & 0x6BFE);
        d.llIIlllIIlIl[47] = -(0xFFFFCE59 & 0x73B7) & (0xFFFFD7DD & 0x7B3A);
        d.llIIlllIIlIl[48] = 0xFFFF8E5D & 0x7FB7;
        d.llIIlllIIlIl[49] = 0xFFFFB73C & 0x6DDF;
        d.llIIlllIIlIl[50] = 0xCE ^ 0xAA ^ (0xC4 ^ 0x8C);
        d.llIIlllIIlIl[51] = 0xFFFFAA35 & 0x57FB;
        d.llIIlllIIlIl[52] = -(0xFFFFD6D7 & 0x3DEB) & (0xFFFFFFFF & 0x7DD3);
        d.llIIlllIIlIl[53] = -(0xFFFFE6E7 & 0x7DFF) & (0xFFFFF5EF & Short.MAX_VALUE);
        d.llIIlllIIlIl[54] = 0xFFFF9F7C & 0x6EA7;
        d.llIIlllIIlIl[55] = -(0xFFFFBE5B & 0x5BFF) & (0xFFFFBF7F & Short.MAX_VALUE);
        d.llIIlllIIlIl[56] = 140 + 94 - 194 + 103 ^ 13 + 22 - -32 + 66;
        d.llIIlllIIlIl[57] = " ".length() ^ (0xB1 ^ 0x86);
        d.llIIlllIIlIl[58] = -(0xFFFFE69D & 0x7967) & (0xFFFFF7B7 & 0x6A7F);
        d.llIIlllIIlIl[59] = 0xFFFFEFBA & 0x7957;
        d.llIIlllIIlIl[60] = -(0xFFFFA5ED & 0x7E73) & (0xFFFFF77B & 0x3DEE);
        d.llIIlllIIlIl[61] = -(0xFFFFFFE7 & 0x11BD) & (0xFFFFBFBF & 0x5FFD);
        d.llIIlllIIlIl[62] = 0xFFFFF57D & 0x2FA6;
        d.llIIlllIIlIl[63] = 0x7B ^ 0x70;
        d.llIIlllIIlIl[64] = 0x6C ^ 0x2D;
        d.llIIlllIIlIl[65] = 0xFFFFFABB & 0x774;
        d.llIIlllIIlIl[66] = 0xFFFFEB6D & 0x7D9F;
        d.llIIlllIIlIl[67] = 0xFFFFB7AB & 0x595F;
        d.llIIlllIIlIl[68] = 0xFFFFA77A & 0x7DA7;
        d.llIIlllIIlIl[69] = 0x80 ^ 0x8C;
        d.llIIlllIIlIl[70] = 0x57 ^ 0x1A;
        d.llIIlllIIlIl[71] = -(0xFFFFDBCD & 0x7D3B) & (0xFFFFFFBF & 0x5B7D);
        d.llIIlllIIlIl[72] = -(0xFFFF9EDB & 0x77B5) & (0xFFFFFFDE & 0x7FBF);
        d.llIIlllIIlIl[73] = -(0xFFFFDCF9 & 0x67F7) & (0xFFFFF7FC & 0x5DFF);
        d.llIIlllIIlIl[74] = -(0xFFFFF1DB & 0x2FE7) & (0xFFFFEFFF & 0x3FDE);
        d.llIIlllIIlIl[75] = 0xB1 ^ 0xC3 ^ 36 + 78 - 41 + 54;
    }

    public int V() {
        return this.levelRequired;
    }

    private d(int n3, int n4, int n5, int n6, boolean bl, b b2, WorldPoint worldPoint) {
        this.levelRequired = n3;
        this.runeId = n4;
        this.talismanId = n5;
        this.spriteId = n6;
        this.isCatalytic = bl;
        this.cellType = b2;
        this.location = worldPoint;
    }

    private static String lllllllIIIllIl(String lllllllllllllllIlIIllIIIIIIllIIl, String lllllllllllllllIlIIllIIIIIIllIlI) {
        try {
            SecretKeySpec lllllllllllllllIlIIllIIIIIIllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIllIIIIIIllIlI.getBytes(StandardCharsets.UTF_8)), llIIlllIIlIl[43]), "DES");
            Cipher lllllllllllllllIlIIllIIIIIIlllIl = Cipher.getInstance("DES");
            lllllllllllllllIlIIllIIIIIIlllIl.init(llIIlllIIlIl[7], lllllllllllllllIlIIllIIIIIIllllI);
            return new String(lllllllllllllllIlIIllIIIIIIlllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIllIIIIIIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIllIIIIIIlllII) {
            lllllllllllllllIlIIllIIIIIIlllII.printStackTrace();
            return null;
        }
    }

    public BufferedImage a(ItemManager itemManager) {
        return itemManager.getImage(this.runeId);
    }

    private static String lllllllIIIllll(String lllllllllllllllIlIIllIIIIIIIlIll, String lllllllllllllllIlIIllIIIIIIIlIlI) {
        lllllllllllllllIlIIllIIIIIIIlIll = new String(Base64.getDecoder().decode(lllllllllllllllIlIIllIIIIIIIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIllIIIIIIIlIIl = new StringBuilder();
        char[] lllllllllllllllIlIIllIIIIIIIlIII = lllllllllllllllIlIIllIIIIIIIlIlI.toCharArray();
        int lllllllllllllllIlIIllIIIIIIIIlll = llIIlllIIlIl[0];
        char[] lllllllllllllllIlIIllIIIIIIIIIIl = lllllllllllllllIlIIllIIIIIIIlIll.toCharArray();
        int lllllllllllllllIlIIllIIIIIIIIIII = lllllllllllllllIlIIllIIIIIIIIIIl.length;
        int lllllllllllllllIlIIlIlllllllllll = llIIlllIIlIl[0];
        while (d.lllllllIIlIIlI(lllllllllllllllIlIIlIlllllllllll, lllllllllllllllIlIIllIIIIIIIIIII)) {
            char lllllllllllllllIlIIllIIIIIIIllII = lllllllllllllllIlIIllIIIIIIIIIIl[lllllllllllllllIlIIlIlllllllllll];
            lllllllllllllllIlIIllIIIIIIIlIIl.append((char)(lllllllllllllllIlIIllIIIIIIIllII ^ lllllllllllllllIlIIllIIIIIIIlIII[lllllllllllllllIlIIllIIIIIIIIlll % lllllllllllllllIlIIllIIIIIIIlIII.length]));
            "".length();
            ++lllllllllllllllIlIIllIIIIIIIIlll;
            ++lllllllllllllllIlIIlIlllllllllll;
            "".length();
            if ((0x44 ^ 0x1F ^ (0x72 ^ 0x2D)) != ((0x5C ^ 0x35 ^ (9 ^ 0x2B)) & (93 + 91 - 180 + 250 ^ 51 + 176 - 137 + 91 ^ -" ".length()))) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIIllIIIIIIIlIIl);
    }
}

