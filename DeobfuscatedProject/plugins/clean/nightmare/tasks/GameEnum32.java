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
package gg.squire.nightmare.tasks;

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

public final class GameEnum32
extends Enum<w> {
    public static final  /* enum */ w PORT_PHASMATYS;
    public static final  /* enum */ w VER_SINHAZA;
    private final  BooleanSupplier openBank;
    private final  BooleanSupplier traverse;
    private static final  w[] $VALUES;
    
    private final  int regionID;

    public static w valueOf(String string) {
        return Enum.valueOf(GameEnum32.class, string);
    }

    private GameEnum32(BooleanSupplier booleanSupplier, int n3, BooleanSupplier booleanSupplier2) {
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

    private static boolean lIIlIIIIlIIlIll(int n2) {
        return n2 != 0;
    }

    static {
        w.lIIlIIIIlIIlIII();
        w.lIIlIIIIlIIIIII();
        VER_SINHAZA = new GameEnum32(() -> {
            if (w.lIIlIIIIlIIlIll(Movement.shouldWalk() ? 1 : 0)) {
                Movement.walkTo((int)llllIlIIlIll[5], (int)llllIlIIlIll[6]);

            }
            return llllIlIIlIll[3];
        }, llllIlIIlIll[10], () -> {
            if (w.lIIlIIIIlIIlIIl(Movement.shouldWalk() ? 1 : 0)) {
                return llllIlIIlIll[0];
            }
            Player var1 = Players.getLocal();
            TileObject var2 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (w.lIIlIIIIlIIlIll(tileObject.getName().equals(llllIlIIlIII[llllIlIIlIll[8]]) ? 1 : 0) && w.lIIlIIIIlIIllII(tileObject.distanceTo((Locatable)var1), llllIlIIlIll[4])) {
                    n2 = llllIlIIlIll[3];

                    }
                } else {
                    n2 = llllIlIIlIll[0];
                }
                return n2 != 0;
            });
            if (w.lIIlIIIIlIIlIlI(var2)) {
                Movement.walkTo((int)llllIlIIlIll[5], (int)llllIlIIlIll[6]);

                if ((0xB9 ^ 0xBD) <= -1) {
                    return false;
                }
            } else {
                var2.interact(llllIlIIlIII[llllIlIIlIll[7]]);
            }
            return llllIlIIlIll[3];
        });
        PORT_PHASMATYS = new GameEnum32(() -> {
            if (w.lIIlIIIIlIIlIll(Movement.shouldWalk() ? 1 : 0)) {
                Movement.walkTo((int)llllIlIIlIll[1], (int)llllIlIIlIll[2]);

            }
            return llllIlIIlIll[3];
        }, llllIlIIlIll[12], () -> {
            if (w.lIIlIIIIlIIlIIl(Movement.shouldWalk() ? 1 : 0)) {
                return llllIlIIlIll[0];
            }
            Player var3 = Players.getLocal();
            TileObject var4 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (w.lIIlIIIIlIIlIll(tileObject.getName().equals(llllIlIIlIII[llllIlIIlIll[3]]) ? 1 : 0) && w.lIIlIIIIlIIllII(tileObject.distanceTo((Locatable)var3), llllIlIIlIll[4])) {
                    n2 = llllIlIIlIll[3];

                    if (1 <= 0) {
                        return false;
                    }
                } else {
                    n2 = llllIlIIlIll[0];
                }
                return n2 != 0;
            });
            if (w.lIIlIIIIlIIlIlI(var4)) {
                Movement.walkTo((int)llllIlIIlIll[1], (int)llllIlIIlIll[2]);

                }
            } else {
                var4.interact(llllIlIIlIII[llllIlIIlIll[0]]);
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
        w.llllIlIIlIII[w.llllIlIIlIll[0]] = "Bank";
        w.llllIlIIlIII[w.llllIlIIlIll[3]] = "Bank booth";
        w.llllIlIIlIII[w.llllIlIIlIll[7]] = "Bank";
        w.llllIlIIlIII[w.llllIlIIlIll[8]] = "Bank booth";
        w.llllIlIIlIII[w.llllIlIIlIll[9]] = "VER_SINHAZA";
        w.llllIlIIlIII[w.llllIlIIlIll[11]] = "PORT_PHASMATYS";
    }

    private static boolean lIIlIIIIlIIlIlI(Object object) {
        return object == null;
    }
}

