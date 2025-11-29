package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.an  reason: invalid package and case insensitive filesystem */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/an.class */
public final class EnumC0014an {
    private static /* synthetic */ String[] llIIllIIl;
    private static final /* synthetic */ EnumC0014an[] $VALUES;
    private final /* synthetic */ Predicate<Item> predicate;
    private static /* synthetic */ int[] llIIllIlI;
    private final /* synthetic */ String interaction;
    public static final /* synthetic */ EnumC0014an FISHING_CAPE;
    private final /* synthetic */ int regionId;
    private final /* synthetic */ WorldPoint bankTile;

    private static void lIllIlIIIII() {
        llIIllIlI = new int[9];
        llIIllIlI[0] = " ".length();
        llIIllIlI[1] = ((23 ^ 31) ^ (198 ^ 140)) & (((5 ^ 115) ^ (140 ^ 184)) ^ (-" ".length()));
        llIIllIlI[2] = (-((-7426) & 23995)) & (-2049) & 28415;
        llIIllIlI[3] = (-137) & 9935;
        llIIllIlI[4] = (-((-27321) & 32505)) & (-16523) & 31999;
        llIIllIlI[5] = (-((-2889) & 28650)) & (-325) & 28671;
        llIIllIlI[6] = (-((-19) & 21171)) & (-8193) & 32762;
        llIIllIlI[7] = "  ".length();
        llIIllIlI[8] = 146 ^ 154;
    }

    public static EnumC0014an[] values() {
        return (EnumC0014an[]) $VALUES.clone();
    }

    public WorldPoint bt() {
        return this.bankTile;
    }

    public String bs() {
        return this.interaction;
    }

    private static String lIllIIlllIl(String lIllIIlIlllIlIl, String lIllIIlIlllIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIllIIlIlllIlII.getBytes(StandardCharsets.UTF_8)), llIIllIlI[8]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIllIlI[7], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIllIIlIlllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIllIIlIlllIllI) {
            lIllIIlIlllIllI.printStackTrace();
            return null;
        }
    }

    private EnumC0014an(String str, int i2, Predicate predicate, String str2, int i3, WorldPoint worldPoint) {
        this.predicate = predicate;
        this.interaction = str2;
        this.regionId = i3;
        this.bankTile = worldPoint;
    }

    private static boolean lIllIlIIIIl(int i2, int i3) {
        return i2 == i3;
    }

    private static boolean lIllIlIIIlI(int i2, int i3) {
        return i2 != i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public boolean t(int i2) {
        if (lIllIlIIIIl(this.regionId, i2)) {
            ?? r0 = llIIllIlI[0];
            "".length();
            return (-"   ".length()) >= 0 ? ((231 ^ 156) ^ (93 ^ 45)) & (((138 ^ 133) ^ (147 ^ 151)) ^ (-" ".length())) : r0;
        }
        return llIIllIlI[1];
    }

    public boolean bq() {
        return t(Players.getLocal().getWorldLocation().getRegionID());
    }

    private static void lIllIIlllll() {
        llIIllIIl = new String[llIIllIlI[7]];
        llIIllIIl[llIIllIlI[1]] = lIllIIlllIl("YaSYE8u6qkICKULOaKig/w==", "eMWrd");
        llIIllIIl[llIIllIlI[0]] = lIllIIllllI("JSgWEQINJkU+HgotAQ==", "cAeyk");
    }

    public Predicate<Item> br() {
        return this.predicate;
    }

    private static String lIllIIllllI(String lIllIIlIllIIlIl, String lIllIIlIllIIlII) {
        String str = new String(Base64.getDecoder().decode(lIllIIlIllIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lIllIIlIllIIlII.toCharArray();
        int lIllIIlIllIIIIl = llIIllIlI[1];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i2 = llIIllIlI[1];
        while (lIllIlIIIll(i2, length)) {
            char lIllIIlIlIllIII = charArray2[i2];
            sb.append((char) (lIllIIlIlIllIII ^ charArray[lIllIIlIllIIIIl % charArray.length]));
            "".length();
            lIllIIlIllIIIIl++;
            i2++;
            "".length();
            if ((-(99 ^ 103)) > 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    public static EnumC0014an valueOf(String str) {
        return (EnumC0014an) Enum.valueOf(EnumC0014an.class, str);
    }

    static {
        lIllIlIIIII();
        lIllIIlllll();
        FISHING_CAPE = new EnumC0014an(llIIllIIl[llIIllIlI[1]], llIIllIlI[1], item -> {
            if (!lIllIlIIIlI(item.getId(), llIIllIlI[2]) || lIllIlIIIIl(item.getId(), llIIllIlI[3])) {
                ?? r0 = llIIllIlI[0];
                "".length();
                return ((((114 + 71) - 84) + 26) ^ (219 ^ 160)) <= "  ".length() ? ((140 ^ 164) ^ (19 ^ 91)) & (((88 ^ 77) ^ (15 ^ 122)) ^ (-" ".length())) : r0;
            }
            return llIIllIlI[1];
        }, llIIllIIl[llIIllIlI[0]], llIIllIlI[4], new WorldPoint(llIIllIlI[5], llIIllIlI[6], llIIllIlI[1]));
        EnumC0014an[] enumC0014anArr = new EnumC0014an[llIIllIlI[0]];
        enumC0014anArr[llIIllIlI[1]] = FISHING_CAPE;
        $VALUES = enumC0014anArr;
    }

    private static boolean lIllIlIIIll(int i2, int i3) {
        return i2 < i3;
    }
}
