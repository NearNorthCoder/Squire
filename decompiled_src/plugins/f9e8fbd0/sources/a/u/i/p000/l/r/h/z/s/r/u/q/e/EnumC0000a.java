package a.u.i.p000.l.r.h.z.s.r.u.q.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.BooleanSupplier;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: a.u.i.-.l.r.h.z.s.r.u.q.e.a  reason: invalid package and case insensitive filesystem */
/* loaded from: f9e8fbd0-4571-4716-b37b-883b4ae7fc62.jar:a/u/i/-/l/r/h/z/s/r/u/q/e/a.class */
public final class EnumC0000a {
    private final /* synthetic */ BooleanSupplier openBank;
    private static /* synthetic */ String[] lIllIllIIllIl;
    private static final /* synthetic */ EnumC0000a[] $VALUES;
    public static final /* synthetic */ EnumC0000a FEROX_ENCLAVE;
    private final /* synthetic */ BooleanSupplier traverse;
    private final /* synthetic */ List<Integer> regionIDs;
    private static /* synthetic */ int[] lIllIllIIllll;

    private static String llIIlIIIlllIlll(String llllllllllllllIllIIIlIlIlllIIIII, String llllllllllllllIllIIIlIlIllIlllll) {
        try {
            SecretKeySpec llllllllllllllIllIIIlIlIlllIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIlIlIllIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllIllIIllll[5], llllllllllllllIllIIIlIlIlllIIIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIlIlIlllIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIIlIlIlllIIIIl) {
            llllllllllllllIllIIIlIlIlllIIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean llIIlIIlIIIIIIl(int i) {
        return i != 0;
    }

    private static String llIIlIIIllllIIl(String llllllllllllllIllIIIlIlIllllIlIl, String llllllllllllllIllIIIlIlIllllIlII) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllIIIlIlIllllIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIllIIIlIlIllllIlII.toCharArray();
        int llllllllllllllIllIIIlIlIllllIIIl = lIllIllIIllll[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIllIllIIllll[0];
        while (llIIlIIlIIIIIlI(i, length)) {
            char llllllllllllllIllIIIlIlIllllIllI = charArray2[i];
            sb.append((char) (llllllllllllllIllIIIlIlIllllIllI ^ charArray[llllllllllllllIllIIIlIlIllllIIIl % charArray.length]));
            "".length();
            llllllllllllllIllIIIlIlIllllIIIl++;
            i++;
            "".length();
            if ("  ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    public static EnumC0000a valueOf(String str) {
        return (EnumC0000a) Enum.valueOf(EnumC0000a.class, str);
    }

    public BooleanSupplier f() {
        return this.traverse;
    }

    private EnumC0000a(String str, int i, BooleanSupplier booleanSupplier, int i2, BooleanSupplier booleanSupplier2) {
        this.traverse = booleanSupplier;
        this.regionIDs = List.of(Integer.valueOf(i2));
        this.openBank = booleanSupplier2;
    }

    private static void llIIlIIIllllllI() {
        lIllIllIIllll = new int[10];
        lIllIllIIllll[0] = ((((181 + 87) - 170) + 120) ^ (((58 + 104) - 112) + 80)) & (((88 ^ 8) ^ (137 ^ 129)) ^ (-" ".length()));
        lIllIllIIllll[1] = (-((-1297) & 26454)) & (-385) & 28671;
        lIllIllIIllll[2] = (-12753) & 16383;
        lIllIllIIllll[3] = " ".length();
        lIllIllIIllll[4] = 69 ^ 73;
        lIllIllIIllll[5] = "  ".length();
        lIllIllIIllll[6] = (-((-24851) & 28503)) & (-257) & 16252;
        lIllIllIIllll[7] = (-((-14353) & 32340)) & (-129) & 30715;
        lIllIllIIllll[8] = "   ".length();
        lIllIllIIllll[9] = 98 ^ 106;
    }

    private static boolean llIIlIIIlllllll(int i) {
        return i == 0;
    }

    private EnumC0000a(String str, int i, BooleanSupplier booleanSupplier, List list, BooleanSupplier booleanSupplier2) {
        this.traverse = booleanSupplier;
        this.regionIDs = list;
        this.openBank = booleanSupplier2;
    }

    private static boolean llIIlIIlIIIIIII(Object obj) {
        return obj == null;
    }

    public BooleanSupplier h() {
        return this.openBank;
    }

    public List<Integer> g() {
        return this.regionIDs;
    }

    private static void llIIlIIIllllIlI() {
        lIllIllIIllIl = new String[lIllIllIIllll[8]];
        lIllIllIIllIl[lIllIllIIllll[0]] = llIIlIIIlllIllI("pKONNvmAsUo=", "tSCaj");
        lIllIllIIllIl[lIllIllIIllll[3]] = llIIlIIIlllIlll("+gSPasvuSkusia836iJWjA==", "ZsbJx");
        lIllIllIIllIl[lIllIllIIllll[5]] = llIIlIIIllllIIl("LQ0wNxA0DSw7BCoeJw==", "kHbxH");
    }

    private static String llIIlIIIlllIllI(String llllllllllllllIllIIIlIlIllIlIIll, String llllllllllllllIllIIIlIlIllIlIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIlIlIllIlIIII.getBytes(StandardCharsets.UTF_8)), lIllIllIIllll[9]), "DES");
            Cipher llllllllllllllIllIIIlIlIllIlIlIl = Cipher.getInstance("DES");
            llllllllllllllIllIIIlIlIllIlIlIl.init(lIllIllIIllll[5], secretKeySpec);
            return new String(llllllllllllllIllIIIlIlIllIlIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIlIlIllIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIIlIlIllIlIlII) {
            llllllllllllllIllIIIlIlIllIlIlII.printStackTrace();
            return null;
        }
    }

    private static boolean llIIlIIlIIIIIlI(int i, int i2) {
        return i < i2;
    }

    public static EnumC0000a[] values() {
        return (EnumC0000a[]) $VALUES.clone();
    }

    static {
        llIIlIIIllllllI();
        llIIlIIIllllIlI();
        FEROX_ENCLAVE = new EnumC0000a(lIllIllIIllIl[lIllIllIIllll[5]], lIllIllIIllll[0], () -> {
            if (llIIlIIlIIIIIIl(Movement.shouldWalk() ? 1 : 0)) {
                Movement.walkTo(lIllIllIIllll[1], lIllIllIIllll[2]);
                "".length();
            }
            return lIllIllIIllll[3];
        }, List.of(Integer.valueOf(lIllIllIIllll[6]), Integer.valueOf(lIllIllIIllll[7])), () -> {
            if (llIIlIIIlllllll(Movement.shouldWalk() ? 1 : 0)) {
                return lIllIllIIllll[0];
            }
            Player local = Players.getLocal();
            TileObject nearest = TileObjects.getNearest(tileObject -> {
                if (llIIlIIlIIIIIIl(tileObject.getName().equals(lIllIllIIllIl[lIllIllIIllll[3]]) ? 1 : 0) && llIIlIIlIIIIIlI(tileObject.distanceTo(local), lIllIllIIllll[4])) {
                    ?? r0 = lIllIllIIllll[3];
                    "".length();
                    return (-" ".length()) > "   ".length() ? ((((72 + 73) - 35) + 47) ^ (((47 + 174) - 76) + 51)) & (((7 ^ 80) ^ (24 ^ 22)) ^ (-" ".length())) : r0;
                }
                return lIllIllIIllll[0];
            });
            if (llIIlIIlIIIIIII(nearest)) {
                Movement.walkTo(lIllIllIIllll[1], lIllIllIIllll[2]);
                "".length();
                "".length();
                if ((-(60 ^ 56)) > 0) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            } else {
                nearest.interact(lIllIllIIllIl[lIllIllIIllll[0]]);
            }
            return lIllIllIIllll[3];
        });
        EnumC0000a[] enumC0000aArr = new EnumC0000a[lIllIllIIllll[3]];
        enumC0000aArr[lIllIllIIllll[0]] = FEROX_ENCLAVE;
        $VALUES = enumC0000aArr;
    }
}
