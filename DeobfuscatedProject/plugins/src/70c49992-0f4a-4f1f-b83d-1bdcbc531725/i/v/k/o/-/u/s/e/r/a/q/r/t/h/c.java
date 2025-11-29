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
package i.v.k.o.-.u.s.e.r.a.q.r.t.h;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
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

public final class c
extends Enum<c> {
    private static /* synthetic */ int[] lIlIlIllIIlIl;
    private final /* synthetic */ List<Integer> regionIDs;
    private static /* synthetic */ String[] lIlIlIllIIlII;
    public static final /* synthetic */ /* enum */ c FEROX_ENCLAVE;
    private final /* synthetic */ BooleanSupplier openBank;
    private final /* synthetic */ BooleanSupplier traverse;
    private static final /* synthetic */ c[] $VALUES;

    public List<Integer> j() {
        return this.regionIDs;
    }

    private static String lIlllllllIIIlII(String llllllllllllllIllIlIlIIlIIIlllIl, String llllllllllllllIllIlIlIIlIIIlllII) {
        llllllllllllllIllIlIlIIlIIIlllIl = new String(Base64.getDecoder().decode(llllllllllllllIllIlIlIIlIIIlllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIlIlIIlIIlIIIII = new StringBuilder();
        char[] llllllllllllllIllIlIlIIlIIIlllll = llllllllllllllIllIlIlIIlIIIlllII.toCharArray();
        int llllllllllllllIllIlIlIIlIIIllllI = lIlIlIllIIlIl[0];
        char[] llllllllllllllIllIlIlIIlIIIllIII = llllllllllllllIllIlIlIIlIIIlllIl.toCharArray();
        int llllllllllllllIllIlIlIIlIIIlIlll = llllllllllllllIllIlIlIIlIIIllIII.length;
        int llllllllllllllIllIlIlIIlIIIlIllI = lIlIlIllIIlIl[0];
        while (c.lIlllllllIIlIll(llllllllllllllIllIlIlIIlIIIlIllI, llllllllllllllIllIlIlIIlIIIlIlll)) {
            char llllllllllllllIllIlIlIIlIIlIIIll = llllllllllllllIllIlIlIIlIIIllIII[llllllllllllllIllIlIlIIlIIIlIllI];
            llllllllllllllIllIlIlIIlIIlIIIII.append((char)(llllllllllllllIllIlIlIIlIIlIIIll ^ llllllllllllllIllIlIlIIlIIIlllll[llllllllllllllIllIlIlIIlIIIllllI % llllllllllllllIllIlIlIIlIIIlllll.length]));
            "".length();
            ++llllllllllllllIllIlIlIIlIIIllllI;
            ++llllllllllllllIllIlIlIIlIIIlIllI;
            "".length();
            if (-" ".length() < "  ".length()) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIlIlIIlIIlIIIII);
    }

    public BooleanSupplier i() {
        return this.traverse;
    }

    private static String lIlllllllIIIlIl(String llllllllllllllIllIlIlIIlIIllIIlI, String llllllllllllllIllIlIlIIlIIllIIIl) {
        try {
            SecretKeySpec llllllllllllllIllIlIlIIlIIllIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIlIIlIIllIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIlIlIIlIIllIlII = Cipher.getInstance("Blowfish");
            llllllllllllllIllIlIlIIlIIllIlII.init(lIlIlIllIIlIl[5], llllllllllllllIllIlIlIIlIIllIlIl);
            return new String(llllllllllllllIllIlIlIIlIIllIlII.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIlIIlIIllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIlIlIIlIIllIIll) {
            llllllllllllllIllIlIlIIlIIllIIll.printStackTrace();
            return null;
        }
    }

    private static void lIlllllllIIIllI() {
        lIlIlIllIIlII = new String[lIlIlIllIIlIl[8]];
        c.lIlIlIllIIlII[c.lIlIlIllIIlIl[0]] = c.lIlllllllIIIlII("ESUi", "DVGwy");
        c.lIlIlIllIIlII[c.lIlIlIllIIlIl[3]] = c.lIlllllllIIIlIl("N5lX5Oj1ObGb5vn4d2R+NQ==", "EizFa");
        c.lIlIlIllIIlII[c.lIlIlIllIIlIl[5]] = c.lIlllllllIIIlII("Eg0EHikLDRgSPRUeEw==", "THVQq");
    }

    public BooleanSupplier k() {
        return this.openBank;
    }

    public static c valueOf(String string) {
        return Enum.valueOf(c.class, string);
    }

    private c(BooleanSupplier booleanSupplier, int n3, BooleanSupplier booleanSupplier2) {
        this.traverse = booleanSupplier;
        this.regionIDs = List.of(Integer.valueOf(n3));
        this.openBank = booleanSupplier2;
    }

    static {
        c.lIlllllllIIIlll();
        c.lIlllllllIIIllI();
        FEROX_ENCLAVE = new c(() -> {
            if (c.lIlllllllIIlIlI(Movement.shouldWalk() ? 1 : 0)) {
                Movement.walkTo((int)lIlIlIllIIlIl[1], (int)lIlIlIllIIlIl[2]);
                "".length();
            }
            return lIlIlIllIIlIl[3];
        }, List.of(Integer.valueOf(lIlIlIllIIlIl[6]), Integer.valueOf(lIlIlIllIIlIl[7])), () -> {
            if (c.lIlllllllIIlIII(Movement.shouldWalk() ? 1 : 0)) {
                return lIlIlIllIIlIl[0];
            }
            Player llllllllllllllIllIlIlIIlIIllllll = Players.getLocal();
            TileObject llllllllllllllIllIlIlIIlIIlllllI = TileObjects.getNearest(tileObject -> {
                int n2;
                if (c.lIlllllllIIlIlI(tileObject.getName().equals(lIlIlIllIIlII[lIlIlIllIIlIl[3]]) ? 1 : 0) && c.lIlllllllIIlIll(tileObject.distanceTo((Locatable)llllllllllllllIllIlIlIIlIIllllll), lIlIlIllIIlIl[4])) {
                    n2 = lIlIlIllIIlIl[3];
                    "".length();
                    if (-"  ".length() > 0) {
                        return ((0x2C ^ 0xD) & ~(0x66 ^ 0x47)) != 0;
                    }
                } else {
                    n2 = lIlIlIllIIlIl[0];
                }
                return n2 != 0;
            });
            if (c.lIlllllllIIlIIl(llllllllllllllIllIlIlIIlIIlllllI)) {
                Movement.walkTo((int)lIlIlIllIIlIl[1], (int)lIlIlIllIIlIl[2]);
                "".length();
                "".length();
                if (null != null) {
                    return ((0x28 ^ 9) & ~(0x73 ^ 0x52)) != 0;
                }
            } else {
                llllllllllllllIllIlIlIIlIIlllllI.interact(lIlIlIllIIlII[lIlIlIllIIlIl[0]]);
            }
            return lIlIlIllIIlIl[3];
        });
        c[] cArray = new c[lIlIlIllIIlIl[3]];
        cArray[c.lIlIlIllIIlIl[0]] = FEROX_ENCLAVE;
        $VALUES = cArray;
    }

    private static boolean lIlllllllIIlIII(int n2) {
        return n2 == 0;
    }

    public static c[] values() {
        return (c[])$VALUES.clone();
    }

    private static void lIlllllllIIIlll() {
        lIlIlIllIIlIl = new int[9];
        c.lIlIlIllIIlIl[0] = (0x27 ^ 0x23 ^ (0x79 ^ 0x1C)) & (0xCB ^ 0x8A ^ (0x78 ^ 0x58) ^ -" ".length());
        c.lIlIlIllIIlIl[1] = -(0xFFFFDEE9 & 0x33D7) & (0xFFFFBEFA & 0x5FFF);
        c.lIlIlIllIIlIl[2] = 0xFFFFBFAF & 0x4E7F;
        c.lIlIlIllIIlIl[3] = " ".length();
        c.lIlIlIllIIlIl[4] = 0x9C ^ 0x90;
        c.lIlIlIllIIlIl[5] = "  ".length();
        c.lIlIlIllIIlIl[6] = -(0xFFFF8F5F & 0x7FA5) & (0xFFFFFF7F & 0x3FBC);
        c.lIlIlIllIIlIl[7] = 0xFFFFB9FA & 0x773D;
        c.lIlIlIllIIlIl[8] = "   ".length();
    }

    private static boolean lIlllllllIIlIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlllllllIIlIlI(int n2) {
        return n2 != 0;
    }

    private static boolean lIlllllllIIlIIl(Object object) {
        return object == null;
    }

    private c(BooleanSupplier booleanSupplier, List<Integer> list, BooleanSupplier booleanSupplier2) {
        this.traverse = booleanSupplier;
        this.regionIDs = list;
        this.openBank = booleanSupplier2;
    }
}

