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

    private static String llIIlIIIlllIlll(String var18, String var2) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var1 = Cipher.getInstance("Blowfish");
            var1.init(lIllIllIIllll[5], var5);
            return new String(var1.doFinal(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    private static boolean llIIlIIlIIIIIIl(int n2) {
        return n2 != 0;
    }

    private static String llIIlIIIllllIIl(String var13, String var17) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var19 = new StringBuilder();
        char[] var14 = var17.toCharArray();
        int var16 = lIllIllIIllll[0];
        char[] var7 = var13.toCharArray();
        int var20 = var7.length;
        int var15 = lIllIllIIllll[0];
        while (a.llIIlIIlIIIIIlI(var15, var20)) {
            char var9 = var7[var15];
            var19.append((char)(var9 ^ var14[var16 % var14.length]));
            0;
            ++var16;
            ++var15;
            0;
            if (2 > 0) continue;
            return null;
        }
        return String.valueOf(var19);
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
        a.lIllIllIIllll[0] = (181 + 87 - 170 + 120 ^ 58 + 104 - 112 + 80) & (0x58 ^ 8 ^ (0x89 ^ 0x81) ^ -1);
        a.lIllIllIIllll[1] = -(0xFFFFFAEF & 0x6756) & (0xFFFFFE7F & 0x6FFF);
        a.lIllIllIIllll[2] = 0xFFFFCE2F & 0x3FFF;
        a.lIllIllIIllll[3] = 1;
        a.lIllIllIIllll[4] = 0x45 ^ 0x49;
        a.lIllIllIIllll[5] = 2;
        a.lIllIllIIllll[6] = -(0xFFFF9EED & 0x6F57) & (0xFFFFFEFF & 0x3F7C);
        a.lIllIllIIllll[7] = -(0xFFFFC7EF & 0x7E54) & (0xFFFFFF7F & 0x77FB);
        a.lIllIllIIllll[8] = 3;
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
        a.lIllIllIIllIl[a.lIllIllIIllll[0]] = a."Use";
        a.lIllIllIIllIl[a.lIllIllIIllll[3]] = a."Bank chest";
        a.lIllIllIIllIl[a.lIllIllIIllll[5]] = a."FEROX_ENCLAVE";
    }

    private static String llIIlIIIlllIllI(String var4, String var8) {
        try {
            SecretKeySpec var12 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var8.getBytes(StandardCharsets.UTF_8)), lIllIllIIllll[9]), "DES");
            Cipher var21 = Cipher.getInstance("DES");
            var21.init(lIllIllIIllll[5], var12);
            return new String(var21.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
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
                0;
            }
            return lIllIllIIllll[3];
        }, List.of(Integer.valueOf(lIllIllIIllll[6]), Integer.valueOf(lIllIllIIllll[7])), () -> {
            if (a.llIIlIIIlllllll(Movement.shouldWalk() ? 1 : 0)) {
                return lIllIllIIllll[0];
            }
            Player var10 = Players.getLocal();
            TileObject var11 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (a.llIIlIIlIIIIIIl(tileObject.getName().equals(lIllIllIIllIl[lIllIllIIllll[3]]) ? 1 : 0) && a.llIIlIIlIIIIIlI(tileObject.distanceTo((Locatable)var10), lIllIllIIllll[4])) {
                    n2 = lIllIllIIllll[3];
                    0;
                    if (-1 > 3) {
                        return ((72 + 73 - 35 + 47 ^ 47 + 174 - 76 + 51) & (7 ^ 0x50 ^ (0x18 ^ 0x16) ^ -1)) != 0;
                    }
                } else {
                    n2 = lIllIllIIllll[0];
                }
                return n2 != 0;
            });
            if (a.llIIlIIlIIIIIII(var11)) {
                Movement.walkTo((int)lIllIllIIllll[1], (int)lIllIllIIllll[2]);
                0;
                0;
                if (-(0x3C ^ 0x38) > 0) {
                    return false;
                }
            } else {
                var11.interact(lIllIllIIllIl[lIllIllIIllll[0]]);
            }
            return lIllIllIIllll[3];
        });
        a[] aArray = new a[lIllIllIIllll[3]];
        aArray[a.lIllIllIIllll[0]] = FEROX_ENCLAVE;
        $VALUES = aArray;
    }
}

