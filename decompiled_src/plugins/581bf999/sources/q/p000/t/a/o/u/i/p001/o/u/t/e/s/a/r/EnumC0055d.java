package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.unethicalite.api.items.Equipment;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.d  reason: invalid package and case insensitive filesystem */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/d.class */
public final class EnumC0055d {
    private final /* synthetic */ int req;
    public static final /* synthetic */ EnumC0055d VOIDWAKER;
    private static /* synthetic */ int[] lIllllllIII;
    private final /* synthetic */ List<Integer> ids;
    private static final /* synthetic */ EnumC0055d[] $VALUES;
    private static /* synthetic */ String[] lIlllllIlll;
    public static final /* synthetic */ EnumC0055d ZARYTE_CROSSBOW;
    public static final /* synthetic */ EnumC0055d DRAGON_CLAWS;
    public static final /* synthetic */ EnumC0055d TOXIC_BLOWPIPE;
    public static final /* synthetic */ EnumC0055d DRAGON_DAGGER;
    public static final /* synthetic */ EnumC0055d OSMUMTENS_FANG;
    public static final /* synthetic */ EnumC0055d BANDOS_GODSWORD;

    static {
        lIIllIlllIIlIl();
        lIIllIlllIIlII();
        DRAGON_DAGGER = new EnumC0055d(lIlllllIlll[lIllllllIII[1]], lIllllllIII[1], List.of(Integer.valueOf(lIllllllIII[3]), Integer.valueOf(lIllllllIII[4]), Integer.valueOf(lIllllllIII[5]), Integer.valueOf(lIllllllIII[6]), Integer.valueOf(lIllllllIII[7])), lIllllllIII[8]);
        BANDOS_GODSWORD = new EnumC0055d(lIlllllIlll[lIllllllIII[9]], lIllllllIII[9], List.of(Integer.valueOf(lIllllllIII[10]), Integer.valueOf(lIllllllIII[11])), lIllllllIII[12]);
        TOXIC_BLOWPIPE = new EnumC0055d(lIlllllIlll[lIllllllIII[13]], lIllllllIII[13], List.of(Integer.valueOf(lIllllllIII[14])), lIllllllIII[12]);
        OSMUMTENS_FANG = new EnumC0055d(lIlllllIlll[lIllllllIII[15]], lIllllllIII[15], List.of(Integer.valueOf(lIllllllIII[16]), Integer.valueOf(lIllllllIII[17])), lIllllllIII[8]);
        DRAGON_CLAWS = new EnumC0055d(lIlllllIlll[lIllllllIII[18]], lIllllllIII[18], List.of(Integer.valueOf(lIllllllIII[19])), lIllllllIII[12]);
        VOIDWAKER = new EnumC0055d(lIlllllIlll[lIllllllIII[20]], lIllllllIII[20], List.of(Integer.valueOf(lIllllllIII[21]), Integer.valueOf(lIllllllIII[22])), lIllllllIII[12]);
        ZARYTE_CROSSBOW = new EnumC0055d(lIlllllIlll[lIllllllIII[23]], lIllllllIII[23], List.of(Integer.valueOf(lIllllllIII[24]), Integer.valueOf(lIllllllIII[25])), lIllllllIII[26]);
        EnumC0055d[] enumC0055dArr = new EnumC0055d[lIllllllIII[27]];
        enumC0055dArr[lIllllllIII[1]] = DRAGON_DAGGER;
        enumC0055dArr[lIllllllIII[9]] = BANDOS_GODSWORD;
        enumC0055dArr[lIllllllIII[13]] = TOXIC_BLOWPIPE;
        enumC0055dArr[lIllllllIII[15]] = OSMUMTENS_FANG;
        enumC0055dArr[lIllllllIII[18]] = DRAGON_CLAWS;
        enumC0055dArr[lIllllllIII[20]] = VOIDWAKER;
        enumC0055dArr[lIllllllIII[23]] = ZARYTE_CROSSBOW;
        $VALUES = enumC0055dArr;
    }

    public static int b(int... iArr) {
        EnumC0055d[] values = values();
        int length = values.length;
        int i = lIllllllIII[1];
        while (lIIllIlllIIlll(i, length)) {
            EnumC0055d enumC0055d = values[i];
            int length2 = iArr.length;
            int i2 = lIllllllIII[1];
            while (lIIllIlllIIlll(i2, length2)) {
                if (lIIllIlllIlIII(enumC0055d.p().contains(Integer.valueOf(iArr[i2])) ? 1 : 0)) {
                    return enumC0055d.o();
                }
                i2++;
                "".length();
                if ((true ^ true) & ((true ^ true) ^ true)) {
                    return "  ".length() & ("  ".length() ^ (-1));
                }
            }
            i++;
            "".length();
            if ("   ".length() <= " ".length()) {
                return (110 ^ 46) & ((244 ^ 180) ^ (-1));
            }
        }
        return lIllllllIII[0];
    }

    public static EnumC0055d[] values() {
        return (EnumC0055d[]) $VALUES.clone();
    }

    private static boolean lIIllIlllIlIII(int i) {
        return i != 0;
    }

    private static void lIIllIlllIIlIl() {
        lIllllllIII = new int[29];
        lIllllllIII[0] = (-" ".length()) & (-1) & Integer.MAX_VALUE;
        lIllllllIII[1] = (89 ^ 121) & ((77 ^ 109) ^ (-1));
        lIllllllIII[2] = 69 ^ 79;
        lIllllllIII[3] = (-((-2237) & 19389)) & (-12353) & 30719;
        lIllllllIII[4] = (-29185) & 30415;
        lIllllllIII[5] = (-9) & 20415;
        lIllllllIII[6] = (-10632) & 16311;
        lIllllllIII[7] = (-((-24681) & 24958)) & (-24705) & 30679;
        lIllllllIII[8] = ((181 + 122) - 290) + 237;
        lIllllllIII[9] = " ".length();
        lIllllllIII[10] = (-419) & 12222;
        lIllllllIII[11] = (-((-21506) & 29799)) & (-1) & 28663;
        lIllllllIII[12] = (-22530) & 23029;
        lIllllllIII[13] = "  ".length();
        lIllllllIII[14] = (-((-18675) & 19699)) & (-16769) & 30718;
        lIllllllIII[15] = "   ".length();
        lIllllllIII[16] = (-2325) & 28543;
        lIllllllIII[17] = (-401) & 27646;
        lIllllllIII[18] = (148 ^ 159) ^ (110 ^ 97);
        lIllllllIII[19] = (-(((10 + 75) - (-54)) + 24)) & (-9) & 13822;
        lIllllllIII[20] = (137 ^ 149) ^ (20 ^ 13);
        lIllllllIII[21] = (-((-11297) & 11574)) & (-641) & 28607;
        lIllllllIII[22] = (-((-1307) & 5947)) & (-1) & 32509;
        lIllllllIII[23] = 108 ^ 106;
        lIllllllIII[24] = (-((-1822) & 5983)) & (-2177) & 32711;
        lIllllllIII[25] = (-((-641) & 6093)) & (-130) & 32767;
        lIllllllIII[26] = (-((-2250) & 24011)) & (-1) & 22511;
        lIllllllIII[27] = 89 ^ 94;
        lIllllllIII[28] = (128 ^ 141) ^ (104 ^ 109);
    }

    private EnumC0055d(String str, int i, List list, int i2) {
        this.ids = list;
        this.req = i2;
    }

    private static void lIIllIlllIIlII() {
        lIlllllIlll = new String[lIllllllIII[27]];
        lIlllllIlll[lIllllllIII[1]] = lIIllIlllIIIIl("GYtHRXkMYUvKQEIq56APzA==", "AtKyF");
        lIlllllIlll[lIllllllIII[9]] = lIIllIlllIIIlI("cViC0kIqGYDYHUlbz6Jtbw==", "bwZoI");
        lIlllllIlll[lIllllllIII[13]] = lIIllIlllIIIll("OywsAjUwITgEIT8qJA4=", "octKv");
        lIlllllIlll[lIllllllIII[15]] = lIIllIlllIIIlI("5azHe4SAStBMvlP5UnBSNQ==", "XhbXo");
        lIlllllIlll[lIllllllIII[18]] = lIIllIlllIIIIl("Z4uefknTgWmAl1ZO0pKDqg==", "nwOEk");
        lIlllllIlll[lIllllllIII[20]] = lIIllIlllIIIlI("tJkqwhqiMXALS3nPbQZaVQ==", "eUAyP");
        lIlllllIlll[lIllllllIII[23]] = lIIllIlllIIIIl("dlW1cS4AQmxMXw0zS19yXg==", "OFYzf");
    }

    public static EnumC0055d valueOf(String str) {
        return (EnumC0055d) Enum.valueOf(EnumC0055d.class, str);
    }

    public int o() {
        return this.req / lIllllllIII[2];
    }

    public int q() {
        return this.req;
    }

    private static String lIIllIlllIIIIl(String llllllllllllllllIlIIlIIlIlIlIIlI, String llllllllllllllllIlIIlIIlIlIlIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIlIIlIlIlIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllllllIII[13], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIlIIlIlIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIIlIIlIlIlIIll) {
            llllllllllllllllIlIIlIIlIlIlIIll.printStackTrace();
            return null;
        }
    }

    private static String lIIllIlllIIIll(String llllllllllllllllIlIIlIIlIlIIIIlI, String llllllllllllllllIlIIlIIlIlIIIIIl) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllIlIIlIIlIlIIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIlIIlIIlIlIIIIII = new StringBuilder();
        char[] charArray = llllllllllllllllIlIIlIIlIlIIIIIl.toCharArray();
        int llllllllllllllllIlIIlIIlIIlllllI = lIllllllIII[1];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIllllllIII[1];
        while (lIIllIlllIIlll(i, length)) {
            char llllllllllllllllIlIIlIIlIIllIlIl = charArray2[i];
            llllllllllllllllIlIIlIIlIlIIIIII.append((char) (llllllllllllllllIlIIlIIlIIllIlIl ^ charArray[llllllllllllllllIlIIlIIlIIlllllI % charArray.length]));
            "".length();
            llllllllllllllllIlIIlIIlIIlllllI++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllIlIIlIIlIlIIIIII);
    }

    private static boolean lIIllIlllIIllI(Object obj) {
        return obj == null;
    }

    private static boolean lIIllIlllIIlll(int i, int i2) {
        return i < i2;
    }

    public static int n() {
        Item fromSlot = Equipment.fromSlot(EquipmentInventorySlot.WEAPON);
        if (lIIllIlllIIllI(fromSlot)) {
            return lIllllllIII[0];
        }
        EnumC0055d[] values = values();
        int llllllllllllllllIlIIlIIlIllllIll = values.length;
        int i = lIllllllIII[1];
        while (lIIllIlllIIlll(i, llllllllllllllllIlIIlIIlIllllIll)) {
            EnumC0055d enumC0055d = values[i];
            if (lIIllIlllIlIII(enumC0055d.p().contains(Integer.valueOf(fromSlot.getId())) ? 1 : 0)) {
                return enumC0055d.o();
            }
            i++;
            "".length();
            if ("  ".length() <= 0) {
                return (229 ^ 183) & ((99 ^ 49) ^ (-1));
            }
        }
        return lIllllllIII[0];
    }

    private static String lIIllIlllIIIlI(String llllllllllllllllIlIIlIIlIlIlllll, String llllllllllllllllIlIIlIIlIlIllllI) {
        try {
            SecretKeySpec llllllllllllllllIlIIlIIlIllIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIlIIlIlIllllI.getBytes(StandardCharsets.UTF_8)), lIllllllIII[28]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIllllllIII[13], llllllllllllllllIlIIlIIlIllIIIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIlIIlIlIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIIlIIlIllIIIII) {
            llllllllllllllllIlIIlIIlIllIIIII.printStackTrace();
            return null;
        }
    }

    public List<Integer> p() {
        return this.ids;
    }
}
