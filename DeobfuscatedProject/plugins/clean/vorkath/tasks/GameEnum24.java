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
package gg.squire.vorkath.tasks;

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

public final class GameEnum24
extends Enum<c> {
    
    private final  List<Integer> regionIDs;
    
    public static final  /* enum */ c FEROX_ENCLAVE;
    private final  BooleanSupplier openBank;
    private final  BooleanSupplier traverse;
    private static final  c[] $VALUES;

    public List<Integer> j() {
        return this.regionIDs;
    }

        return String.valueOf(var1);
    }

    public BooleanSupplier i() {
        return this.traverse;
    }

    private static void lIlllllllIIIllI() {
        lIlIlIllIIlII = new String[lIlIlIllIIlIl[8]];
        c.lIlIlIllIIlII[c.lIlIlIllIIlIl[0]] = "Use";
        c.lIlIlIllIIlII[c.lIlIlIllIIlIl[3]] = "Bank chest";
        c.lIlIlIllIIlII[c.lIlIlIllIIlIl[5]] = "FEROX_ENCLAVE";
    }

    public BooleanSupplier k() {
        return this.openBank;
    }

    public static c valueOf(String string) {
        return Enum.valueOf(GameEnum24.class, string);
    }

    private GameEnum24(BooleanSupplier booleanSupplier, int n3, BooleanSupplier booleanSupplier2) {
        this.traverse = booleanSupplier;
        this.regionIDs = List.of(Integer.valueOf(n3));
        this.openBank = booleanSupplier2;
    }

    static {
        c.lIlllllllIIIlll();
        c.lIlllllllIIIllI();
        FEROX_ENCLAVE = new GameEnum24(() -> {
            if (c.lIlllllllIIlIlI(Movement.shouldWalk() ? 1 : 0)) {
                Movement.walkTo((int)lIlIlIllIIlIl[1], (int)lIlIlIllIIlIl[2]);

            }
            return lIlIlIllIIlIl[3];
        }, List.of(Integer.valueOf(lIlIlIllIIlIl[6]), Integer.valueOf(lIlIlIllIIlIl[7])), () -> {
            if (c.lIlllllllIIlIII(Movement.shouldWalk() ? 1 : 0)) {
                return lIlIlIllIIlIl[0];
            }
            Player var2 = Players.getLocal();
            TileObject var3 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (c.lIlllllllIIlIlI(tileObject.getName().equals(lIlIlIllIIlII[lIlIlIllIIlIl[3]]) ? 1 : 0) && c.lIlllllllIIlIll(tileObject.distanceTo((Locatable)var2), lIlIlIllIIlIl[4])) {
                    n2 = lIlIlIllIIlIl[3];

                } else {
                    n2 = lIlIlIllIIlIl[0];
                }
                return n2 != 0;
            });
            if (c.lIlllllllIIlIIl(var3)) {
                Movement.walkTo((int)lIlIlIllIIlIl[1], (int)lIlIlIllIIlIl[2]);

                }
            } else {
                var3.interact(lIlIlIllIIlII[lIlIlIllIIlIl[0]]);
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

    private static boolean lIlllllllIIlIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlllllllIIlIlI(int n2) {
        return n2 != 0;
    }

    private static boolean lIlllllllIIlIIl(Object object) {
        return object == null;
    }

    private GameEnum24(BooleanSupplier booleanSupplier, List<Integer> list, BooleanSupplier booleanSupplier2) {
        this.traverse = booleanSupplier;
        this.regionIDs = list;
        this.openBank = booleanSupplier2;
    }
}

