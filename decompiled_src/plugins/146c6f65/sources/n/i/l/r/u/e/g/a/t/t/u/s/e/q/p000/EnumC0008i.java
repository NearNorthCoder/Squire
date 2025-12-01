package n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.unethicalite.api.items.Inventory;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.i  reason: invalid package and case insensitive filesystem */
/* loaded from: 146c6f65-5ac8-4fe6-9d9c-0b402720538d.jar:n/i/l/r/u/e/g/a/t/t/u/s/e/q/-/i.class */
public final class EnumC0008i {
    public static final /* synthetic */ EnumC0008i BARK;
    public static final /* synthetic */ EnumC0008i HERB;
    private static /* synthetic */ int[] llIIllIIIIll;
    public static final /* synthetic */ EnumC0008i ORE;
    public static final /* synthetic */ EnumC0008i FISH;
    private final /* synthetic */ int normalToolId;
    private final /* synthetic */ int corruptedToolId;
    public static final /* synthetic */ EnumC0008i WOOL;
    private final /* synthetic */ int normalObjectId;
    private static /* synthetic */ String[] llIIllIIIIlI;
    public static final /* synthetic */ EnumC0008i CRYSTAL_ORB;
    public static final /* synthetic */ EnumC0008i CRYSTALLINE_BOWSTRING;
    private final /* synthetic */ int corruptedObjectId;
    private static final /* synthetic */ EnumC0008i[] $VALUES;
    public static final /* synthetic */ EnumC0008i CRYSTAL_SHARD;
    private final /* synthetic */ int normalItemId;
    private final /* synthetic */ int corruptedItemId;
    public static final /* synthetic */ EnumC0008i CRYSTAL_DUST;
    public static final /* synthetic */ EnumC0008i WEAPON_FRAME;

    public static EnumC0008i[] values() {
        return (EnumC0008i[]) $VALUES.clone();
    }

    public List<Integer> aA() {
        return List.of(Integer.valueOf(this.normalItemId), Integer.valueOf(this.corruptedItemId));
    }

    public static EnumC0008i valueOf(String str) {
        return (EnumC0008i) Enum.valueOf(EnumC0008i.class, str);
    }

    private EnumC0008i(String str, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.normalToolId = i2;
        this.normalItemId = i3;
        this.normalObjectId = i4;
        this.corruptedToolId = i5;
        this.corruptedItemId = i6;
        this.corruptedObjectId = i7;
    }

    private static String llllllIIlIllIl(String lllllllllllllllIlIIlIlllIlIIIlIl, String lllllllllllllllIlIIlIlllIlIIIlII) {
        try {
            SecretKeySpec lllllllllllllllIlIIlIlllIlIIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIlllIlIIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIllIIIIll[3], lllllllllllllllIlIIlIlllIlIIlIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIlllIlIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIlIlllIlIIIllI) {
            lllllllllllllllIlIIlIlllIlIIIllI.printStackTrace();
            return null;
        }
    }

    private static String llllllIIlIllII(String lllllllllllllllIlIIlIlllIlIllIlI, String lllllllllllllllIlIIlIlllIlIllIIl) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlIIlIlllIlIllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIlIIlIlllIlIllIIl.toCharArray();
        int lllllllllllllllIlIIlIlllIlIlIllI = llIIllIIIIll[2];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = llIIllIIIIll[2];
        while (llllllIIllIIlI(i, length)) {
            char lllllllllllllllIlIIlIlllIlIllIll = charArray2[i];
            sb.append((char) (lllllllllllllllIlIIlIlllIlIllIll ^ charArray[lllllllllllllllIlIIlIlllIlIlIllI % charArray.length]));
            "".length();
            lllllllllllllllIlIIlIlllIlIlIllI++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void llllllIIlIllll() {
        llIIllIIIIlI = new String[llIIllIIIIll[46]];
        llIIllIIIIlI[llIIllIIIIll[2]] = llllllIIlIllII("KSA/", "frzpG");
        llIIllIIIIlI[llIIllIIIIll[1]] = llllllIIlIllII("BAAbKQ==", "LEIks");
        llIIllIIIIlI[llIIllIIIIll[3]] = llllllIIlIllII("NAc7FQ==", "cHtYr");
        llIIllIIIIlI[llIIllIIIIll[18]] = llllllIIlIllII("FCgoKQ==", "Vizbl");
        llIIllIIIIlI[llIIllIIIIll[25]] = llllllIIlIllII("CT4AMg==", "OwSzv");
        llIIllIIIIlI[llIIllIIIIll[31]] = llllllIIlIllIl("iLbDSPPxFtP8hTMMgxw64Q==", "tQLJv");
        llIIllIIIIlI[llIIllIIIIll[34]] = llllllIIlIllIl("duZxP5OKPiuz0b7HX/R39g==", "DBFjg");
        llIIllIIIIlI[llIIllIIIIll[37]] = llllllIIlIllIl("JHZqfkm8842TNEA4cAP6EQ==", "jsLrI");
        llIIllIIIIlI[llIIllIIIIll[40]] = llllllIIlIlllI("ii3m4agwCwFUWerrPmNCBA==", "bGXCX");
        llIIllIIIIlI[llIIllIIIIll[43]] = llllllIIlIllIl("hkBRz7TY3Oy4OoLboYJDMzbUX0WwITc3", "nowqN");
    }

    private static void llllllIIllIIII() {
        llIIllIIIIll = new int[47];
        llIIllIIIIll[0] = -" ".length();
        llIIllIIIIll[1] = " ".length();
        llIIllIIIIll[2] = (26 ^ 73) & ((228 ^ 183) ^ (-1));
        llIIllIIIIll[3] = "  ".length();
        llIIllIIIIll[4] = (-8769) & 32631;
        llIIllIIIIll[5] = (-((-24713) & 25257)) & (-131) & 24551;
        llIIllIIIIll[6] = (-((-18593) & 23223)) & (-24842) & 65535;
        llIIllIIIIll[7] = (-((-4877) & 13309)) & (-1) & 32254;
        llIIllIIIIll[8] = (-((-20809) & 29675)) & (-65) & 32767;
        llIIllIIIIll[9] = (-28929) & 64895;
        llIIllIIIIll[10] = (-((-6417) & 14749)) & (-561) & 32767;
        llIIllIIIIll[11] = (-((-6214) & 22599)) & (-12801) & 65255;
        llIIllIIIIll[12] = (-((-4547) & 5091)) & (-1) & 24379;
        llIIllIIIIll[13] = (-((-3085) & 8029)) & (-16427) & 57343;
        llIIllIIIIll[14] = (-((-5653) & 13855)) & (-49) & 32126;
        llIIllIIIIll[15] = (-8468) & 44539;
        llIIllIIIIll[16] = (-((-17989) & 26214)) & (-129) & 32189;
        llIIllIIIIll[17] = (-((-6533) & 31629)) & (-4353) & 65423;
        llIIllIIIIll[18] = "   ".length();
        llIIllIIIIll[19] = (-137) & 23998;
        llIIllIIIIll[20] = (-((-16738) & 25083)) & (-513) & 32735;
        llIIllIIIIll[21] = (-16898) & 52963;
        llIIllIIIIll[22] = (-753) & 24573;
        llIIllIIIIll[23] = (-((-1281) & 1921)) & (-33) & 24510;
        llIIllIIIIll[24] = (-((-3075) & 32039)) & (-73) & 65005;
        llIIllIIIIll[25] = (91 ^ 87) ^ (207 ^ 199);
        llIIllIIIIll[26] = (-8257) & 32120;
        llIIllIIIIll[27] = (-535) & 24406;
        llIIllIIIIll[28] = (-((-3209) & 32652)) & (-9) & 65519;
        llIIllIIIIll[29] = (-((-23335) & 31591)) & (-641) & 32719;
        llIIllIIIIll[30] = (-((-8835) & 29679)) & (-8209) & 65023;
        llIIllIIIIll[31] = ((244 ^ 165) & ((147 ^ 194) ^ (-1))) ^ (143 ^ 138);
        llIIllIIIIll[32] = (-((-25993) & 26573)) & (-129) & 24574;
        llIIllIIIIll[33] = (-585) & 24408;
        llIIllIIIIll[34] = 1 ^ 7;
        llIIllIIIIll[35] = (-((-29067) & 29583)) & (-8385) & 32767;
        llIIllIIIIll[36] = (-(165 ^ 172)) & (-8258) & 32095;
        llIIllIIIIll[37] = 44 ^ 43;
        llIIllIIIIll[38] = (-1) & 23871;
        llIIllIIIIll[39] = (-705) & 24538;
        llIIllIIIIll[40] = 123 ^ 115;
        llIIllIIIIll[41] = (-8257) & 32126;
        llIIllIIIIll[42] = (-((-6233) & 6911)) & (-1) & 24511;
        llIIllIIIIll[43] = 7 ^ 14;
        llIIllIIIIll[44] = (-8897) & 32765;
        llIIllIIIIll[45] = (-(40 ^ 64)) & (-641) & 24575;
        llIIllIIIIll[46] = (168 ^ 198) ^ (108 ^ 8);
    }

    private static boolean llllllIIllIIlI(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    public int aC() {
        return Inventory.getCount((boolean) llIIllIIIIll[1], aB());
    }

    public List<Integer> ay() {
        return List.of(Integer.valueOf(this.normalToolId), Integer.valueOf(this.corruptedToolId));
    }

    static {
        llllllIIllIIII();
        llllllIIlIllll();
        ORE = new EnumC0008i(llIIllIIIIlI[llIIllIIIIll[2]], llIIllIIIIll[2], llIIllIIIIll[4], llIIllIIIIll[5], llIIllIIIIll[6], llIIllIIIIll[7], llIIllIIIIll[8], llIIllIIIIll[9]);
        HERB = new EnumC0008i(llIIllIIIIlI[llIIllIIIIll[1]], llIIllIIIIll[1], llIIllIIIIll[0], llIIllIIIIll[10], llIIllIIIIll[11], llIIllIIIIll[0], llIIllIIIIll[12], llIIllIIIIll[13]);
        WOOL = new EnumC0008i(llIIllIIIIlI[llIIllIIIIll[3]], llIIllIIIIll[3], llIIllIIIIll[0], llIIllIIIIll[14], llIIllIIIIll[15], llIIllIIIIll[0], llIIllIIIIll[16], llIIllIIIIll[17]);
        BARK = new EnumC0008i(llIIllIIIIlI[llIIllIIIIll[18]], llIIllIIIIll[18], llIIllIIIIll[19], llIIllIIIIll[20], llIIllIIIIll[21], llIIllIIIIll[22], llIIllIIIIll[23], llIIllIIIIll[24]);
        FISH = new EnumC0008i(llIIllIIIIlI[llIIllIIIIll[25]], llIIllIIIIll[25], llIIllIIIIll[26], llIIllIIIIll[27], llIIllIIIIll[28], llIIllIIIIll[29], llIIllIIIIll[27], llIIllIIIIll[30]);
        CRYSTAL_SHARD = new EnumC0008i(llIIllIIIIlI[llIIllIIIIll[31]], llIIllIIIIll[31], llIIllIIIIll[0], llIIllIIIIll[32], llIIllIIIIll[0], llIIllIIIIll[0], llIIllIIIIll[33], llIIllIIIIll[0]);
        CRYSTAL_DUST = new EnumC0008i(llIIllIIIIlI[llIIllIIIIll[34]], llIIllIIIIll[34], llIIllIIIIll[0], llIIllIIIIll[35], llIIllIIIIll[0], llIIllIIIIll[0], llIIllIIIIll[36], llIIllIIIIll[0]);
        WEAPON_FRAME = new EnumC0008i(llIIllIIIIlI[llIIllIIIIll[37]], llIIllIIIIll[37], llIIllIIIIll[0], llIIllIIIIll[38], llIIllIIIIll[0], llIIllIIIIll[0], llIIllIIIIll[39], llIIllIIIIll[0]);
        CRYSTAL_ORB = new EnumC0008i(llIIllIIIIlI[llIIllIIIIll[40]], llIIllIIIIll[40], llIIllIIIIll[0], llIIllIIIIll[41], llIIllIIIIll[0], llIIllIIIIll[0], llIIllIIIIll[42], llIIllIIIIll[0]);
        CRYSTALLINE_BOWSTRING = new EnumC0008i(llIIllIIIIlI[llIIllIIIIll[43]], llIIllIIIIll[43], llIIllIIIIll[0], llIIllIIIIll[44], llIIllIIIIll[0], llIIllIIIIll[0], llIIllIIIIll[45], llIIllIIIIll[0]);
        EnumC0008i[] enumC0008iArr = new EnumC0008i[llIIllIIIIll[46]];
        enumC0008iArr[llIIllIIIIll[2]] = ORE;
        enumC0008iArr[llIIllIIIIll[1]] = HERB;
        enumC0008iArr[llIIllIIIIll[3]] = WOOL;
        enumC0008iArr[llIIllIIIIll[18]] = BARK;
        enumC0008iArr[llIIllIIIIll[25]] = FISH;
        enumC0008iArr[llIIllIIIIll[31]] = CRYSTAL_SHARD;
        enumC0008iArr[llIIllIIIIll[34]] = CRYSTAL_DUST;
        enumC0008iArr[llIIllIIIIll[37]] = WEAPON_FRAME;
        enumC0008iArr[llIIllIIIIll[40]] = CRYSTAL_ORB;
        enumC0008iArr[llIIllIIIIll[43]] = CRYSTALLINE_BOWSTRING;
        $VALUES = enumC0008iArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public boolean ax() {
        if (llllllIIllIIIl(this.normalToolId, llIIllIIIIll[0])) {
            ?? r0 = llIIllIIIIll[1];
            "".length();
            return "   ".length() != "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llIIllIIIIll[2];
    }

    public int[] aB() {
        int[] iArr = new int[llIIllIIIIll[3]];
        iArr[llIIllIIIIll[2]] = this.normalItemId;
        iArr[llIIllIIIIll[1]] = this.corruptedItemId;
        return iArr;
    }

    private static boolean llllllIIllIIIl(int i, int i2) {
        return i != i2;
    }

    private static String llllllIIlIlllI(String lllllllllllllllIlIIlIlllIllIlIlI, String lllllllllllllllIlIIlIlllIllIlIIl) {
        try {
            SecretKeySpec lllllllllllllllIlIIlIlllIllIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIlllIllIlIIl.getBytes(StandardCharsets.UTF_8)), llIIllIIIIll[40]), "DES");
            Cipher lllllllllllllllIlIIlIlllIllIllII = Cipher.getInstance("DES");
            lllllllllllllllIlIIlIlllIllIllII.init(llIIllIIIIll[3], lllllllllllllllIlIIlIlllIllIllIl);
            return new String(lllllllllllllllIlIIlIlllIllIllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIlllIllIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIlIlllIllIlIll) {
            lllllllllllllllIlIIlIlllIllIlIll.printStackTrace();
            return null;
        }
    }

    public List<Integer> az() {
        return List.of(Integer.valueOf(this.normalObjectId), Integer.valueOf(this.corruptedObjectId));
    }
}
