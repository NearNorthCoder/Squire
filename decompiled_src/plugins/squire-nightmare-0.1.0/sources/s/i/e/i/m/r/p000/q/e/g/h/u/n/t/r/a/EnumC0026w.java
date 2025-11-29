package s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
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
/* renamed from: s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.w  reason: invalid package and case insensitive filesystem */
/* loaded from: squire-nightmare-0.1.0.jar:s/i/e/i/m/r/-/q/e/g/h/u/n/t/r/a/w.class */
public final class EnumC0026w {
    public static final /* synthetic */ EnumC0026w PORT_PHASMATYS;
    public static final /* synthetic */ EnumC0026w VER_SINHAZA;
    private final /* synthetic */ BooleanSupplier openBank;
    private final /* synthetic */ BooleanSupplier traverse;
    private static final /* synthetic */ EnumC0026w[] $VALUES;
    private static /* synthetic */ String[] llllIlIIlIII;
    private final /* synthetic */ int regionID;
    private static /* synthetic */ int[] llllIlIIlIll;

    public static EnumC0026w valueOf(String str) {
        return (EnumC0026w) Enum.valueOf(EnumC0026w.class, str);
    }

    private static String lIIlIIIIIlllIll(String lllllllllllllllIIlIllIlIlllIIlll, String lllllllllllllllIIlIllIlIlllIIllI) {
        try {
            SecretKeySpec lllllllllllllllIIlIllIlIlllIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllIlIlllIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIllIlIlllIlIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIllIlIlllIlIIl.init(llllIlIIlIll[7], lllllllllllllllIIlIllIlIlllIlIlI);
            return new String(lllllllllllllllIIlIllIlIlllIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllIlIlllIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIllIlIlllIlIII) {
            lllllllllllllllIIlIllIlIlllIlIII.printStackTrace();
            return null;
        }
    }

    private EnumC0026w(String str, int i, BooleanSupplier booleanSupplier, int i2, BooleanSupplier booleanSupplier2) {
        this.traverse = booleanSupplier;
        this.regionID = i2;
        this.openBank = booleanSupplier2;
    }

    private static boolean lIIlIIIIlIIllII(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIlIIIIlIIlIIl(int i) {
        return i == 0;
    }

    public static EnumC0026w[] values() {
        return (EnumC0026w[]) $VALUES.clone();
    }

    public int bJ() {
        return this.regionID;
    }

    public BooleanSupplier bK() {
        return this.openBank;
    }

    public BooleanSupplier bI() {
        return this.traverse;
    }

    private static String lIIlIIIIIllllII(String lllllllllllllllIIlIllIlIllllIlII, String lllllllllllllllIIlIllIlIllllIIll) {
        try {
            SecretKeySpec lllllllllllllllIIlIllIlIllllIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllIlIllllIIll.getBytes(StandardCharsets.UTF_8)), llllIlIIlIll[14]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llllIlIIlIll[7], lllllllllllllllIIlIllIlIllllIlll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllIlIllllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIllIlIllllIlIl) {
            lllllllllllllllIIlIllIlIllllIlIl.printStackTrace();
            return null;
        }
    }

    private static void lIIlIIIIlIIlIII() {
        llllIlIIlIll = new int[15];
        llllIlIIlIll[0] = ((148 ^ 139) ^ (40 ^ 125)) & (((((161 + 101) - 107) + 38) ^ (((92 + 52) - 116) + 111)) ^ (-" ".length()));
        llllIlIIlIll[1] = (-((-8745) & 25405)) & (-132) & 20479;
        llllIlIIlIll[2] = (-12918) & 16383;
        llllIlIIlIll[3] = " ".length();
        llllIlIIlIll[4] = 32 ^ 44;
        llllIlIIlIll[5] = (-4371) & 8022;
        llllIlIIlIll[6] = (-21032) & 24239;
        llllIlIIlIll[7] = "  ".length();
        llllIlIIlIll[8] = "   ".length();
        llllIlIIlIll[9] = (((69 + 55) - 121) + 169) ^ (((65 + 120) - 171) + 154);
        llllIlIIlIll[10] = (-((-14645) & 31229)) & (-2) & 31227;
        llllIlIIlIll[11] = (((11 + 120) - 9) + 30) ^ (((108 + 87) - 181) + 143);
        llllIlIIlIll[12] = (-73) & 14718;
        llllIlIIlIll[13] = (((146 + 22) - 131) + 152) ^ (((156 + 186) - 327) + 172);
        llllIlIIlIll[14] = (((61 + 56) - 88) + 103) ^ (((58 + 4) - 50) + 128);
    }

    private static boolean lIIlIIIIlIIlIll(int i) {
        return i != 0;
    }

    static {
        lIIlIIIIlIIlIII();
        lIIlIIIIlIIIIII();
        VER_SINHAZA = new EnumC0026w(llllIlIIlIII[llllIlIIlIll[9]], llllIlIIlIll[0], () -> {
            if (lIIlIIIIlIIlIll(Movement.shouldWalk() ? 1 : 0)) {
                Movement.walkTo(llllIlIIlIll[5], llllIlIIlIll[6]);
                "".length();
            }
            return llllIlIIlIll[3];
        }, llllIlIIlIll[10], () -> {
            if (lIIlIIIIlIIlIIl(Movement.shouldWalk() ? 1 : 0)) {
                return llllIlIIlIll[0];
            }
            Player local = Players.getLocal();
            TileObject nearest = TileObjects.getNearest(tileObject -> {
                if (lIIlIIIIlIIlIll(tileObject.getName().equals(llllIlIIlIII[llllIlIIlIll[8]]) ? 1 : 0) && lIIlIIIIlIIllII(tileObject.distanceTo(local), llllIlIIlIll[4])) {
                    ?? r0 = llllIlIIlIll[3];
                    "".length();
                    return 0 != 0 ? ((((15 + 18) - (-117)) + 91) ^ (((133 + 173) - 237) + 117)) & (((121 ^ 124) ^ (97 ^ 47)) ^ (-" ".length())) : r0;
                }
                return llllIlIIlIll[0];
            });
            if (lIIlIIIIlIIlIlI(nearest)) {
                Movement.walkTo(llllIlIIlIll[5], llllIlIIlIll[6]);
                "".length();
                "".length();
                if ((185 ^ 189) <= (-" ".length())) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            } else {
                nearest.interact(llllIlIIlIII[llllIlIIlIll[7]]);
            }
            return llllIlIIlIll[3];
        });
        PORT_PHASMATYS = new EnumC0026w(llllIlIIlIII[llllIlIIlIll[11]], llllIlIIlIll[3], () -> {
            if (lIIlIIIIlIIlIll(Movement.shouldWalk() ? 1 : 0)) {
                Movement.walkTo(llllIlIIlIll[1], llllIlIIlIll[2]);
                "".length();
            }
            return llllIlIIlIll[3];
        }, llllIlIIlIll[12], () -> {
            if (lIIlIIIIlIIlIIl(Movement.shouldWalk() ? 1 : 0)) {
                return llllIlIIlIll[0];
            }
            Player local = Players.getLocal();
            TileObject nearest = TileObjects.getNearest(tileObject -> {
                if (lIIlIIIIlIIlIll(tileObject.getName().equals(llllIlIIlIII[llllIlIIlIll[3]]) ? 1 : 0) && lIIlIIIIlIIllII(tileObject.distanceTo(local), llllIlIIlIll[4])) {
                    ?? r0 = llllIlIIlIll[3];
                    "".length();
                    return " ".length() <= 0 ? ((((67 + 51) - 92) + 127) ^ (((23 + 48) - (-66)) + 6)) & (((((103 + 7) - 15) + 95) ^ (((35 + 56) - (-29)) + 48)) ^ (-" ".length())) : r0;
                }
                return llllIlIIlIll[0];
            });
            if (lIIlIIIIlIIlIlI(nearest)) {
                Movement.walkTo(llllIlIIlIll[1], llllIlIIlIll[2]);
                "".length();
                "".length();
                if (0 != 0) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            } else {
                nearest.interact(llllIlIIlIII[llllIlIIlIll[0]]);
            }
            return llllIlIIlIll[3];
        });
        EnumC0026w[] enumC0026wArr = new EnumC0026w[llllIlIIlIll[7]];
        enumC0026wArr[llllIlIIlIll[0]] = VER_SINHAZA;
        enumC0026wArr[llllIlIIlIll[3]] = PORT_PHASMATYS;
        $VALUES = enumC0026wArr;
    }

    private static void lIIlIIIIlIIIIII() {
        llllIlIIlIII = new String[llllIlIIlIll[13]];
        llllIlIIlIII[llllIlIIlIll[0]] = lIIlIIIIIlllIll("JifyvEc7uZM=", "uUdvD");
        llllIlIIlIII[llllIlIIlIll[3]] = lIIlIIIIIlllIll("Zr3Wt7bQqa1vPDjKZOvs4g==", "QDjJf");
        llllIlIIlIII[llllIlIIlIll[7]] = lIIlIIIIIllllII("4qx67g4VuAk=", "KEFDL");
        llllIlIIlIII[llllIlIIlIll[8]] = lIIlIIIIIlllIll("e8A6EPlafa74sLknOuWErA==", "nwusa");
        llllIlIIlIII[llllIlIIlIll[9]] = lIIlIIIIIllllII("wEBcahPVHTzG23Vdu0qfwg==", "KGysE");
        llllIlIIlIII[llllIlIIlIll[11]] = lIIlIIIIIllllII("2s8MqV7E0nrQvaQlkJQ6/g==", "PGdQR");
    }

    private static boolean lIIlIIIIlIIlIlI(Object obj) {
        return obj == null;
    }
}
