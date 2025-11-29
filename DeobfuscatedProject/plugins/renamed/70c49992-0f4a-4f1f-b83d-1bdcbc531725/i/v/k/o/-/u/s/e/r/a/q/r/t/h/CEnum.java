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

public final class CEnum
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

    private static String lIlllllllIIIlII(String var16, String var1) {
        var16 = new String(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var14 = var1.toCharArray();
        int var3 = lIlIlIllIIlIl[0];
        char[] var5 = var16.toCharArray();
        int var6 = var5.length;
        int var4 = lIlIlIllIIlIl[0];
        while (c.lIlllllllIIlIll(var4, var6)) {
            char var10 = var5[var4];
            var8.append((char)(var10 ^ var14[var3 % var14.length]));
            0;
            ++var3;
            ++var4;
            0;
            if (-1 < 2) continue;
            return null;
        }
        return String.valueOf(var8);
    }

    public BooleanSupplier i() {
        return this.traverse;
    }

    private static String lIlllllllIIIlIl(String var11, String var13) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var13.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var15 = Cipher.getInstance("Blowfish");
            var15.init(lIlIlIllIIlIl[5], var2);
            return new String(var15.doFinal(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }

    private static void lIlllllllIIIllI() {
        lIlIlIllIIlII = new String[lIlIlIllIIlIl[8]];
        c.lIlIlIllIIlII[c.lIlIlIllIIlIl[0]] = c."Use";
        c.lIlIlIllIIlII[c.lIlIlIllIIlIl[3]] = c."Bank chest";
        c.lIlIlIllIIlII[c.lIlIlIllIIlIl[5]] = c."FEROX_ENCLAVE";
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
                0;
            }
            return lIlIlIllIIlIl[3];
        }, List.of(Integer.valueOf(lIlIlIllIIlIl[6]), Integer.valueOf(lIlIlIllIIlIl[7])), () -> {
            if (c.lIlllllllIIlIII(Movement.shouldWalk() ? 1 : 0)) {
                return lIlIlIllIIlIl[0];
            }
            Player var7 = Players.getLocal();
            TileObject var9 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (c.lIlllllllIIlIlI(tileObject.getName().equals(lIlIlIllIIlII[lIlIlIllIIlIl[3]]) ? 1 : 0) && c.lIlllllllIIlIll(tileObject.distanceTo((Locatable)var7), lIlIlIllIIlIl[4])) {
                    n2 = lIlIlIllIIlIl[3];
                    0;
                    if (-2 > 0) {
                        return false;
                    }
                } else {
                    n2 = lIlIlIllIIlIl[0];
                }
                return n2 != 0;
            });
            if (c.lIlllllllIIlIIl(var9)) {
                Movement.walkTo((int)lIlIlIllIIlIl[1], (int)lIlIlIllIIlIl[2]);
                0;
                0;
                
                }
            } else {
                var9.interact(lIlIlIllIIlII[lIlIlIllIIlIl[0]]);
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
        c.lIlIlIllIIlIl[0] = (0x27 ^ 0x23 ^ (0x79 ^ 0x1C)) & (0xCB ^ 0x8A ^ (0x78 ^ 0x58) ^ -1);
        c.lIlIlIllIIlIl[1] = -(0xFFFFDEE9 & 0x33D7) & (0xFFFFBEFA & 0x5FFF);
        c.lIlIlIllIIlIl[2] = 0xFFFFBFAF & 0x4E7F;
        c.lIlIlIllIIlIl[3] = 1;
        c.lIlIlIllIIlIl[4] = 0x9C ^ 0x90;
        c.lIlIlIllIIlIl[5] = 2;
        c.lIlIlIllIIlIl[6] = -(0xFFFF8F5F & 0x7FA5) & (0xFFFFFF7F & 0x3FBC);
        c.lIlIlIllIIlIl[7] = 0xFFFFB9FA & 0x773D;
        c.lIlIlIllIIlIl[8] = 3;
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

