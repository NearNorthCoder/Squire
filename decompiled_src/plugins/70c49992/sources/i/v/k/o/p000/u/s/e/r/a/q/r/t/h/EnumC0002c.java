package i.v.k.o.p000.u.s.e.r.a.q.r.t.h;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
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
/* renamed from: i.v.k.o.-.u.s.e.r.a.q.r.t.h.c  reason: invalid package and case insensitive filesystem */
/* loaded from: 70c49992-0f4a-4f1f-b83d-1bdcbc531725.jar:i/v/k/o/-/u/s/e/r/a/q/r/t/h/c.class */
public final class EnumC0002c {
    private static /* synthetic */ int[] lIlIlIllIIlIl;
    private final /* synthetic */ List<Integer> regionIDs;
    private static /* synthetic */ String[] lIlIlIllIIlII;
    public static final /* synthetic */ EnumC0002c FEROX_ENCLAVE;
    private final /* synthetic */ BooleanSupplier openBank;
    private final /* synthetic */ BooleanSupplier traverse;
    private static final /* synthetic */ EnumC0002c[] $VALUES;

    public List<Integer> j() {
        return this.regionIDs;
    }

    private static String lIlllllllIIIlII(String llllllllllllllIllIlIlIIlIIlIIIlI, String llllllllllllllIllIlIlIIlIIlIIIIl) {
        String llllllllllllllIllIlIlIIlIIlIIIlI2 = new String(Base64.getDecoder().decode(llllllllllllllIllIlIlIIlIIlIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIlIlIIlIIlIIIII = new StringBuilder();
        char[] llllllllllllllIllIlIlIIlIIIlllll = llllllllllllllIllIlIlIIlIIlIIIIl.toCharArray();
        int llllllllllllllIllIlIlIIlIIIllllI = lIlIlIllIIlIl[0];
        char[] charArray = llllllllllllllIllIlIlIIlIIlIIIlI2.toCharArray();
        int length = charArray.length;
        int llllllllllllllIllIlIlIIlIIIlIllI = lIlIlIllIIlIl[0];
        while (lIlllllllIIlIll(llllllllllllllIllIlIlIIlIIIlIllI, length)) {
            llllllllllllllIllIlIlIIlIIlIIIII.append((char) (charArray[llllllllllllllIllIlIlIIlIIIlIllI] ^ llllllllllllllIllIlIlIIlIIIlllll[llllllllllllllIllIlIlIIlIIIllllI % llllllllllllllIllIlIlIIlIIIlllll.length]));
            "".length();
            llllllllllllllIllIlIlIIlIIIllllI++;
            llllllllllllllIllIlIlIIlIIIlIllI++;
            "".length();
            if ((-" ".length()) >= "  ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllIlIlIIlIIlIIIII);
    }

    public BooleanSupplier i() {
        return this.traverse;
    }

    private static String lIlllllllIIIlIl(String llllllllllllllIllIlIlIIlIIllIIlI, String llllllllllllllIllIlIlIIlIIllIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIlIIlIIllIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIlIlIIlIIllIlII = Cipher.getInstance("Blowfish");
            llllllllllllllIllIlIlIIlIIllIlII.init(lIlIlIllIIlIl[5], secretKeySpec);
            return new String(llllllllllllllIllIlIlIIlIIllIlII.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIlIIlIIllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlIlIIlIIllIIll) {
            llllllllllllllIllIlIlIIlIIllIIll.printStackTrace();
            return null;
        }
    }

    private static void lIlllllllIIIllI() {
        lIlIlIllIIlII = new String[lIlIlIllIIlIl[8]];
        lIlIlIllIIlII[lIlIlIllIIlIl[0]] = lIlllllllIIIlII("ESUi", "DVGwy");
        lIlIlIllIIlII[lIlIlIllIIlIl[3]] = lIlllllllIIIlIl("N5lX5Oj1ObGb5vn4d2R+NQ==", "EizFa");
        lIlIlIllIIlII[lIlIlIllIIlIl[5]] = lIlllllllIIIlII("Eg0EHikLDRgSPRUeEw==", "THVQq");
    }

    public BooleanSupplier k() {
        return this.openBank;
    }

    public static EnumC0002c valueOf(String str) {
        return (EnumC0002c) Enum.valueOf(EnumC0002c.class, str);
    }

    private EnumC0002c(String str, int i2, BooleanSupplier booleanSupplier, int i3, BooleanSupplier booleanSupplier2) {
        this.traverse = booleanSupplier;
        this.regionIDs = List.of(Integer.valueOf(i3));
        this.openBank = booleanSupplier2;
    }

    static {
        lIlllllllIIIlll();
        lIlllllllIIIllI();
        FEROX_ENCLAVE = new EnumC0002c(lIlIlIllIIlII[lIlIlIllIIlIl[5]], lIlIlIllIIlIl[0], () -> {
            if (lIlllllllIIlIlI(Movement.shouldWalk() ? 1 : 0)) {
                Movement.walkTo(lIlIlIllIIlIl[1], lIlIlIllIIlIl[2]);
                "".length();
            }
            return lIlIlIllIIlIl[3];
        }, List.of(Integer.valueOf(lIlIlIllIIlIl[6]), Integer.valueOf(lIlIlIllIIlIl[7])), () -> {
            if (lIlllllllIIlIII(Movement.shouldWalk() ? 1 : 0)) {
                return lIlIlIllIIlIl[0];
            }
            Player local = Players.getLocal();
            TileObject nearest = TileObjects.getNearest(tileObject -> {
                if (lIlllllllIIlIlI(tileObject.getName().equals(lIlIlIllIIlII[lIlIlIllIIlIl[3]]) ? 1 : 0) && lIlllllllIIlIll(tileObject.distanceTo(local), lIlIlIllIIlIl[4])) {
                    ?? r0 = lIlIlIllIIlIl[3];
                    "".length();
                    return (-"  ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIlIlIllIIlIl[0];
            });
            if (lIlllllllIIlIIl(nearest)) {
                Movement.walkTo(lIlIlIllIIlIl[1], lIlIlIllIIlIl[2]);
                "".length();
                "".length();
                if (0 != 0) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            } else {
                nearest.interact(lIlIlIllIIlII[lIlIlIllIIlIl[0]]);
            }
            return lIlIlIllIIlIl[3];
        });
        EnumC0002c[] enumC0002cArr = new EnumC0002c[lIlIlIllIIlIl[3]];
        enumC0002cArr[lIlIlIllIIlIl[0]] = FEROX_ENCLAVE;
        $VALUES = enumC0002cArr;
    }

    private static boolean lIlllllllIIlIII(int i2) {
        return i2 == 0;
    }

    public static EnumC0002c[] values() {
        return (EnumC0002c[]) $VALUES.clone();
    }

    private static void lIlllllllIIIlll() {
        lIlIlIllIIlIl = new int[9];
        lIlIlIllIIlIl[0] = ((39 ^ 35) ^ (121 ^ 28)) & (((203 ^ 138) ^ (120 ^ 88)) ^ (-" ".length()));
        lIlIlIllIIlIl[1] = (-((-8471) & 13271)) & (-16646) & 24575;
        lIlIlIllIIlIl[2] = (-16465) & 20095;
        lIlIlIllIIlIl[3] = " ".length();
        lIlIlIllIIlIl[4] = 156 ^ 144;
        lIlIlIllIIlIl[5] = "  ".length();
        lIlIlIllIIlIl[6] = (-((-28833) & 32677)) & (-129) & 16316;
        lIlIlIllIIlIl[7] = (-17926) & 30525;
        lIlIlIllIIlIl[8] = "   ".length();
    }

    private static boolean lIlllllllIIlIll(int i2, int i3) {
        return i2 < i3;
    }

    private static boolean lIlllllllIIlIlI(int i2) {
        return i2 != 0;
    }

    private static boolean lIlllllllIIlIIl(Object obj) {
        return obj == null;
    }

    private EnumC0002c(String str, int i2, BooleanSupplier booleanSupplier, List list, BooleanSupplier booleanSupplier2) {
        this.traverse = booleanSupplier;
        this.regionIDs = list;
        this.openBank = booleanSupplier2;
    }
}
