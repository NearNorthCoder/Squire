/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 */
package s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.function.BooleanSupplier;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;

public final class w
extends Enum<w> {
    public static final /* synthetic */ /* enum */ w PORT_PHASMATYS;
    public static final /* synthetic */ /* enum */ w VER_SINHAZA;
    private final /* synthetic */ BooleanSupplier openBank;
    private final /* synthetic */ BooleanSupplier traverse;
    private static final /* synthetic */ w[] $VALUES;
    private static /* synthetic */ String[] llllIlIIlIII;
    private final /* synthetic */ int regionID;
    private static /* synthetic */ int[] llllIlIIlIll;

    public static w valueOf(String string) {
        return Enum.valueOf(w.class, string);
    }

    private static String lIIlIIIIIlllIll(String lllllllllllllllIIlIllIlIlllIIlIl, String lllllllllllllllIIlIllIlIlllIIllI) {
        try {
            SecretKeySpec lllllllllllllllIIlIllIlIlllIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllIlIlllIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIllIlIlllIlIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIllIlIlllIlIIl.init(llllIlIIlIll[7], lllllllllllllllIIlIllIlIlllIlIlI);
            return new String(lllllllllllllllIIlIllIlIlllIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllIlIlllIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIllIlIlllIlIII) {
            lllllllllllllllIIlIllIlIlllIlIII.printStackTrace();
            return null;
        }
    }

    private w(BooleanSupplier booleanSupplier, int n3, BooleanSupplier booleanSupplier2) {
        this.traverse = booleanSupplier;
        this.regionID = n3;
        this.openBank = booleanSupplier2;
    }

    private static boolean lIIlIIIIlIIllII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlIIIIlIIlIIl(int n2) {
        return n2 == 0;
    }

    public static w[] values() {
        return (w[])$VALUES.clone();
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

    private static String lIIlIIIIIllllII(String lllllllllllllllIIlIllIlIllllIIlI, String lllllllllllllllIIlIllIlIllllIIll) {
        try {
            SecretKeySpec lllllllllllllllIIlIllIlIllllIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllIlIllllIIll.getBytes(StandardCharsets.UTF_8)), llllIlIIlIll[14]), "DES");
            Cipher lllllllllllllllIIlIllIlIllllIllI = Cipher.getInstance("DES");
            lllllllllllllllIIlIllIlIllllIllI.init(llllIlIIlIll[7], lllllllllllllllIIlIllIlIllllIlll);
            return new String(lllllllllllllllIIlIllIlIllllIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllIlIllllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIllIlIllllIlIl) {
            lllllllllllllllIIlIllIlIllllIlIl.printStackTrace();
            return null;
        }
    }

    private static void lIIlIIIIlIIlIII() {
        llllIlIIlIll = new int[15];
        w.llllIlIIlIll[0] = (0x94 ^ 0x8B ^ (0x28 ^ 0x7D)) & (161 + 101 - 107 + 38 ^ 92 + 52 - 116 + 111 ^ -" ".length());
        w.llllIlIIlIll[1] = -(0xFFFFDDD7 & 0x633D) & (0xFFFFFF7C & 0x4FFF);
        w.llllIlIIlIll[2] = 0xFFFFCD8A & 0x3FFF;
        w.llllIlIIlIll[3] = " ".length();
        w.llllIlIIlIll[4] = 0x20 ^ 0x2C;
        w.llllIlIIlIll[5] = 0xFFFFEEED & 0x1F56;
        w.llllIlIIlIll[6] = 0xFFFFADD8 & 0x5EAF;
        w.llllIlIIlIll[7] = "  ".length();
        w.llllIlIIlIll[8] = "   ".length();
        w.llllIlIIlIll[9] = 69 + 55 - 121 + 169 ^ 65 + 120 - 171 + 154;
        w.llllIlIIlIll[10] = -(0xFFFFC6CB & 0x79FD) & (0xFFFFFFFE & 0x79FB);
        w.llllIlIIlIll[11] = 11 + 120 - 9 + 30 ^ 108 + 87 - 181 + 143;
        w.llllIlIIlIll[12] = 0xFFFFFFB7 & 0x397E;
        w.llllIlIIlIll[13] = 146 + 22 - 131 + 152 ^ 156 + 186 - 327 + 172;
        w.llllIlIIlIll[14] = 61 + 56 - 88 + 103 ^ 58 + 4 - 50 + 128;
    }

    private static boolean lIIlIIIIlIIlIll(int n2) {
        return n2 != 0;
    }

    static {
        w.lIIlIIIIlIIlIII();
        w.lIIlIIIIlIIIIII();
        VER_SINHAZA = new w(() -> {
            if (w.lIIlIIIIlIIlIll(Movement.shouldWalk() ? 1 : 0)) {
                Movement.walkTo((int)llllIlIIlIll[5], (int)llllIlIIlIll[6]);
                "".length();
            }
            return llllIlIIlIll[3];
        }, llllIlIIlIll[10], () -> {
            if (w.lIIlIIIIlIIlIIl(Movement.shouldWalk() ? 1 : 0)) {
                return llllIlIIlIll[0];
            }
            Player lllllllllllllllIIlIllIllIIIIIlII = Players.getLocal();
            TileObject lllllllllllllllIIlIllIllIIIIIIlI = TileObjects.getNearest(tileObject -> {
                int n2;
                if (w.lIIlIIIIlIIlIll(tileObject.getName().equals(llllIlIIlIII[llllIlIIlIll[8]]) ? 1 : 0) && w.lIIlIIIIlIIllII(tileObject.distanceTo((Locatable)lllllllllllllllIIlIllIllIIIIIlII), llllIlIIlIll[4])) {
                    n2 = llllIlIIlIll[3];
                    "".length();
                    if (null != null) {
                        return ((15 + 18 - -117 + 91 ^ 133 + 173 - 237 + 117) & (0x79 ^ 0x7C ^ (0x61 ^ 0x2F) ^ -" ".length())) != 0;
                    }
                } else {
                    n2 = llllIlIIlIll[0];
                }
                return n2 != 0;
            });
            if (w.lIIlIIIIlIIlIlI(lllllllllllllllIIlIllIllIIIIIIlI)) {
                Movement.walkTo((int)llllIlIIlIll[5], (int)llllIlIIlIll[6]);
                "".length();
                "".length();
                if ((0xB9 ^ 0xBD) <= -" ".length()) {
                    return ((0xED ^ 0xBB) & ~(0xE2 ^ 0xB4)) != 0;
                }
            } else {
                lllllllllllllllIIlIllIllIIIIIIlI.interact(llllIlIIlIII[llllIlIIlIll[7]]);
            }
            return llllIlIIlIll[3];
        });
        PORT_PHASMATYS = new w(() -> {
            if (w.lIIlIIIIlIIlIll(Movement.shouldWalk() ? 1 : 0)) {
                Movement.walkTo((int)llllIlIIlIll[1], (int)llllIlIIlIll[2]);
                "".length();
            }
            return llllIlIIlIll[3];
        }, llllIlIIlIll[12], () -> {
            if (w.lIIlIIIIlIIlIIl(Movement.shouldWalk() ? 1 : 0)) {
                return llllIlIIlIll[0];
            }
            Player lllllllllllllllIIlIllIllIIIllIII = Players.getLocal();
            TileObject lllllllllllllllIIlIllIllIIIlIllI = TileObjects.getNearest(tileObject -> {
                int n2;
                if (w.lIIlIIIIlIIlIll(tileObject.getName().equals(llllIlIIlIII[llllIlIIlIll[3]]) ? 1 : 0) && w.lIIlIIIIlIIllII(tileObject.distanceTo((Locatable)lllllllllllllllIIlIllIllIIIllIII), llllIlIIlIll[4])) {
                    n2 = llllIlIIlIll[3];
                    "".length();
                    if (" ".length() <= 0) {
                        return ((67 + 51 - 92 + 127 ^ 23 + 48 - -66 + 6) & (103 + 7 - 15 + 95 ^ 35 + 56 - -29 + 48 ^ -" ".length())) != 0;
                    }
                } else {
                    n2 = llllIlIIlIll[0];
                }
                return n2 != 0;
            });
            if (w.lIIlIIIIlIIlIlI(lllllllllllllllIIlIllIllIIIlIllI)) {
                Movement.walkTo((int)llllIlIIlIll[1], (int)llllIlIIlIll[2]);
                "".length();
                "".length();
                if (null != null) {
                    return ((0xF9 ^ 0x9A) & ~(0xA5 ^ 0xC6)) != 0;
                }
            } else {
                lllllllllllllllIIlIllIllIIIlIllI.interact(llllIlIIlIII[llllIlIIlIll[0]]);
            }
            return llllIlIIlIll[3];
        });
        w[] wArray = new w[llllIlIIlIll[7]];
        wArray[w.llllIlIIlIll[0]] = VER_SINHAZA;
        wArray[w.llllIlIIlIll[3]] = PORT_PHASMATYS;
        $VALUES = wArray;
    }

    private static void lIIlIIIIlIIIIII() {
        llllIlIIlIII = new String[llllIlIIlIll[13]];
        w.llllIlIIlIII[w.llllIlIIlIll[0]] = w.lIIlIIIIIlllIll("JifyvEc7uZM=", "uUdvD");
        w.llllIlIIlIII[w.llllIlIIlIll[3]] = w.lIIlIIIIIlllIll("Zr3Wt7bQqa1vPDjKZOvs4g==", "QDjJf");
        w.llllIlIIlIII[w.llllIlIIlIll[7]] = w.lIIlIIIIIllllII("4qx67g4VuAk=", "KEFDL");
        w.llllIlIIlIII[w.llllIlIIlIll[8]] = w.lIIlIIIIIlllIll("e8A6EPlafa74sLknOuWErA==", "nwusa");
        w.llllIlIIlIII[w.llllIlIIlIll[9]] = w.lIIlIIIIIllllII("wEBcahPVHTzG23Vdu0qfwg==", "KGysE");
        w.llllIlIIlIII[w.llllIlIIlIll[11]] = w.lIIlIIIIIllllII("2s8MqV7E0nrQvaQlkJQ6/g==", "PGdQR");
    }

    private static boolean lIIlIIIIlIIlIlI(Object object) {
        return object == null;
    }
}

