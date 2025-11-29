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
package gg.squire.zulrah.tasks;

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

public final class GameEnum43
extends Enum<a> {
    private final  BooleanSupplier openBank;
    
    private static final  a[] $VALUES;
    public static final  /* enum */ a FEROX_ENCLAVE;
    private final  BooleanSupplier traverse;
    private final  List<Integer> regionIDs;

    private static boolean llIIlIIlIIIIIIl(int n2) {
        return n2 != 0;
    }

        return String.valueOf(var1);
    }

    public static a valueOf(String string) {
        return Enum.valueOf(GameEnum43.class, string);
    }

    public BooleanSupplier f() {
        return this.traverse;
    }

    private GameEnum43(BooleanSupplier booleanSupplier, int n3, BooleanSupplier booleanSupplier2) {
        this.traverse = booleanSupplier;
        this.regionIDs = List.of(Integer.valueOf(n3));
        this.openBank = booleanSupplier2;
    }

    private static boolean llIIlIIIlllllll(int n2) {
        return n2 == 0;
    }

    private GameEnum43(BooleanSupplier booleanSupplier, List<Integer> list, BooleanSupplier booleanSupplier2) {
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
        a.lIllIllIIllIl[a.lIllIllIIllll[0]] = "Use";
        a.lIllIllIIllIl[a.lIllIllIIllll[3]] = "Bank chest";
        a.lIllIllIIllIl[a.lIllIllIIllll[5]] = "FEROX_ENCLAVE";
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
        FEROX_ENCLAVE = new GameEnum43(() -> {
            if (a.llIIlIIlIIIIIIl(Movement.shouldWalk() ? 1 : 0)) {
                Movement.walkTo((int)lIllIllIIllll[1], (int)lIllIllIIllll[2]);

            }
            return lIllIllIIllll[3];
        }, List.of(Integer.valueOf(lIllIllIIllll[6]), Integer.valueOf(lIllIllIIllll[7])), () -> {
            if (a.llIIlIIIlllllll(Movement.shouldWalk() ? 1 : 0)) {
                return lIllIllIIllll[0];
            }
            Player var2 = Players.getLocal();
            TileObject var3 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (a.llIIlIIlIIIIIIl(tileObject.getName().equals(lIllIllIIllIl[lIllIllIIllll[3]]) ? 1 : 0) && a.llIIlIIlIIIIIlI(tileObject.distanceTo((Locatable)var2), lIllIllIIllll[4])) {
                    n2 = lIllIllIIllll[3];

                    if (-1 > 3) {
                        return ((72 + 73 - 35 + 47 ^ 47 + 174 - 76 + 51) & (7 ^ 0x50 ^ (0x18 ^ 0x16) ^ -1)) != 0;
                    }
                } else {
                    n2 = lIllIllIIllll[0];
                }
                return n2 != 0;
            });
            if (a.llIIlIIlIIIIIII(var3)) {
                Movement.walkTo((int)lIllIllIIllll[1], (int)lIllIllIIllll[2]);

                if (-(0x3C ^ 0x38) > 0) {
                    return false;
                }
            } else {
                var3.interact(lIllIllIIllIl[lIllIllIIllll[0]]);
            }
            return lIllIllIIllll[3];
        });
        a[] aArray = new a[lIllIllIIllll[3]];
        aArray[a.lIllIllIIllll[0]] = FEROX_ENCLAVE;
        $VALUES = aArray;
    }
}

