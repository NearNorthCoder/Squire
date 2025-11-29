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
package a.u.i.-.l.r.h.z.s.r.u.q.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.BooleanSupplier;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;

public final class a
extends Enum<a> {
    private final /* synthetic */ BooleanSupplier openBank;
    private static /* synthetic */ String[] lIllIllIIllIl;
    private static final /* synthetic */ a[] $VALUES;
    public static final /* synthetic */ /* enum */ a FEROX_ENCLAVE;
    private final /* synthetic */ BooleanSupplier traverse;
    private final /* synthetic */ List<Integer> regionIDs;
    private static /* synthetic */ int[] lIllIllIIllll;

    private static String llIIlIIIlllIlll(String llllllllllllllIllIIIlIlIllIllllI, String llllllllllllllIllIIIlIlIllIlllll) {
        try {
            SecretKeySpec llllllllllllllIllIIIlIlIlllIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIlIlIllIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIIIlIlIlllIIIlI = Cipher.getInstance("Blowfish");
            llllllllllllllIllIIIlIlIlllIIIlI.init(lIllIllIIllll[5], llllllllllllllIllIIIlIlIlllIIIll);
            return new String(llllllllllllllIllIIIlIlIlllIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIlIlIllIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIIlIlIlllIIIIl) {
            llllllllllllllIllIIIlIlIlllIIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean llIIlIIlIIIIIIl(int n2) {
        return n2 != 0;
    }

    private static String llIIlIIIllllIIl(String llllllllllllllIllIIIlIlIllllIlIl, String llllllllllllllIllIIIlIlIllllIlII) {
        llllllllllllllIllIIIlIlIllllIlIl = new String(Base64.getDecoder().decode(llllllllllllllIllIIIlIlIllllIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIIIlIlIllllIIll = new StringBuilder();
        char[] llllllllllllllIllIIIlIlIllllIIlI = llllllllllllllIllIIIlIlIllllIlII.toCharArray();
        int llllllllllllllIllIIIlIlIllllIIIl = lIllIllIIllll[0];
        char[] llllllllllllllIllIIIlIlIlllIlIll = llllllllllllllIllIIIlIlIllllIlIl.toCharArray();
        int llllllllllllllIllIIIlIlIlllIlIlI = llllllllllllllIllIIIlIlIlllIlIll.length;
        int llllllllllllllIllIIIlIlIlllIlIIl = lIllIllIIllll[0];
        while (a.llIIlIIlIIIIIlI(llllllllllllllIllIIIlIlIlllIlIIl, llllllllllllllIllIIIlIlIlllIlIlI)) {
            char llllllllllllllIllIIIlIlIllllIllI = llllllllllllllIllIIIlIlIlllIlIll[llllllllllllllIllIIIlIlIlllIlIIl];
            llllllllllllllIllIIIlIlIllllIIll.append((char)(llllllllllllllIllIIIlIlIllllIllI ^ llllllllllllllIllIIIlIlIllllIIlI[llllllllllllllIllIIIlIlIllllIIIl % llllllllllllllIllIIIlIlIllllIIlI.length]));
            "".length();
            ++llllllllllllllIllIIIlIlIllllIIIl;
            ++llllllllllllllIllIIIlIlIlllIlIIl;
            "".length();
            if ("  ".length() > 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIIIlIlIllllIIll);
    }

    public static a valueOf(String string) {
        return Enum.valueOf(a.class, string);
    }

    public BooleanSupplier f() {
        return this.traverse;
    }

    private a(BooleanSupplier booleanSupplier, int n3, BooleanSupplier booleanSupplier2) {
        this.traverse = booleanSupplier;
        this.regionIDs = List.of(Integer.valueOf(n3));
        this.openBank = booleanSupplier2;
    }

    private static void llIIlIIIllllllI() {
        lIllIllIIllll = new int[10];
        a.lIllIllIIllll[0] = (181 + 87 - 170 + 120 ^ 58 + 104 - 112 + 80) & (0x58 ^ 8 ^ (0x89 ^ 0x81) ^ -" ".length());
        a.lIllIllIIllll[1] = -(0xFFFFFAEF & 0x6756) & (0xFFFFFE7F & 0x6FFF);
        a.lIllIllIIllll[2] = 0xFFFFCE2F & 0x3FFF;
        a.lIllIllIIllll[3] = " ".length();
        a.lIllIllIIllll[4] = 0x45 ^ 0x49;
        a.lIllIllIIllll[5] = "  ".length();
        a.lIllIllIIllll[6] = -(0xFFFF9EED & 0x6F57) & (0xFFFFFEFF & 0x3F7C);
        a.lIllIllIIllll[7] = -(0xFFFFC7EF & 0x7E54) & (0xFFFFFF7F & 0x77FB);
        a.lIllIllIIllll[8] = "   ".length();
        a.lIllIllIIllll[9] = 0x62 ^ 0x6A;
    }

    private static boolean llIIlIIIlllllll(int n2) {
        return n2 == 0;
    }

    private a(BooleanSupplier booleanSupplier, List<Integer> list, BooleanSupplier booleanSupplier2) {
        this.traverse = booleanSupplier;
        this.regionIDs = list;
        this.openBank = booleanSupplier2;
    }

    private static boolean llIIlIIlIIIIIII(Object object) {
        return object == null;
    }

    public BooleanSupplier h() {
        return this.openBank;
    }

    public List<Integer> g() {
        return this.regionIDs;
    }

    private static void llIIlIIIllllIlI() {
        lIllIllIIllIl = new String[lIllIllIIllll[8]];
        a.lIllIllIIllIl[a.lIllIllIIllll[0]] = a.llIIlIIIlllIllI("pKONNvmAsUo=", "tSCaj");
        a.lIllIllIIllIl[a.lIllIllIIllll[3]] = a.llIIlIIIlllIlll("+gSPasvuSkusia836iJWjA==", "ZsbJx");
        a.lIllIllIIllIl[a.lIllIllIIllll[5]] = a.llIIlIIIllllIIl("LQ0wNxA0DSw7BCoeJw==", "kHbxH");
    }

    private static String llIIlIIIlllIllI(String llllllllllllllIllIIIlIlIllIlIIIl, String llllllllllllllIllIIIlIlIllIlIIlI) {
        try {
            SecretKeySpec llllllllllllllIllIIIlIlIllIlIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIlIlIllIlIIlI.getBytes(StandardCharsets.UTF_8)), lIllIllIIllll[9]), "DES");
            Cipher llllllllllllllIllIIIlIlIllIlIlIl = Cipher.getInstance("DES");
            llllllllllllllIllIIIlIlIllIlIlIl.init(lIllIllIIllll[5], llllllllllllllIllIIIlIlIllIlIllI);
            return new String(llllllllllllllIllIIIlIlIllIlIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIlIlIllIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIIlIlIllIlIlII) {
            llllllllllllllIllIIIlIlIllIlIlII.printStackTrace();
            return null;
        }
    }

    private static boolean llIIlIIlIIIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    public static a[] values() {
        return (a[])$VALUES.clone();
    }

    static {
        a.llIIlIIIllllllI();
        a.llIIlIIIllllIlI();
        FEROX_ENCLAVE = new a(() -> {
            if (a.llIIlIIlIIIIIIl(Movement.shouldWalk() ? 1 : 0)) {
                Movement.walkTo((int)lIllIllIIllll[1], (int)lIllIllIIllll[2]);
                "".length();
            }
            return lIllIllIIllll[3];
        }, List.of(Integer.valueOf(lIllIllIIllll[6]), Integer.valueOf(lIllIllIIllll[7])), () -> {
            if (a.llIIlIIIlllllll(Movement.shouldWalk() ? 1 : 0)) {
                return lIllIllIIllll[0];
            }
            Player llllllllllllllIllIIIlIllIIIIIlIl = Players.getLocal();
            TileObject llllllllllllllIllIIIlIllIIIIIlII = TileObjects.getNearest(tileObject -> {
                int n2;
                if (a.llIIlIIlIIIIIIl(tileObject.getName().equals(lIllIllIIllIl[lIllIllIIllll[3]]) ? 1 : 0) && a.llIIlIIlIIIIIlI(tileObject.distanceTo((Locatable)llllllllllllllIllIIIlIllIIIIIlIl), lIllIllIIllll[4])) {
                    n2 = lIllIllIIllll[3];
                    "".length();
                    if (-" ".length() > "   ".length()) {
                        return ((72 + 73 - 35 + 47 ^ 47 + 174 - 76 + 51) & (7 ^ 0x50 ^ (0x18 ^ 0x16) ^ -" ".length())) != 0;
                    }
                } else {
                    n2 = lIllIllIIllll[0];
                }
                return n2 != 0;
            });
            if (a.llIIlIIlIIIIIII(llllllllllllllIllIIIlIllIIIIIlII)) {
                Movement.walkTo((int)lIllIllIIllll[1], (int)lIllIllIIllll[2]);
                "".length();
                "".length();
                if (-(0x3C ^ 0x38) > 0) {
                    return ((0xA ^ 0x15) & ~(0x92 ^ 0x8D)) != 0;
                }
            } else {
                llllllllllllllIllIIIlIllIIIIIlII.interact(lIllIllIIllIl[lIllIllIIllll[0]]);
            }
            return lIllIllIIllll[3];
        });
        a[] aArray = new a[lIllIllIIllll[3]];
        aArray[a.lIllIllIIllll[0]] = FEROX_ENCLAVE;
        $VALUES = aArray;
    }
}

