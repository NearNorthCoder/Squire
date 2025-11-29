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

import java.util.function.BooleanSupplier;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;

public final class GameEnum5
extends Enum<w> {
    public static final  /* enum */ w PORT_PHASMATYS;
    public static final  /* enum */ w VER_SINHAZA;
    private final  BooleanSupplier openBank;
    private final  BooleanSupplier traverse;
    private static final  w[] $VALUES;
    
    private final  int regionID;

    public static w valueOf(String string) {
        return Enum.valueOf(GameEnum5.class, string);
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private GameEnum5(BooleanSupplier booleanSupplier, int n3, BooleanSupplier booleanSupplier2) {
        this.traverse = booleanSupplier;
        this.regionID = n3;
        this.openBank = booleanSupplier2;
    }

    private static boolean var9(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var10(int n2) {
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

        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    private static void var17() {
        var2 = new int[15];
        w.var2[0] = (0x94 ^ 0x8B ^ (0x28 ^ 0x7D)) & (161 + 101 - 107 + 38 ^ 92 + 52 - 116 + 111 ^ -1);
        w.var2[1] = -(0xFFFFDDD7 & 0x633D) & (0xFFFFFF7C & 0x4FFF);
        w.var2[2] = 0xFFFFCD8A & 0x3FFF;
        w.var2[3] = 1;
        w.var2[4] = 0x20 ^ 0x2C;
        w.var2[5] = 0xFFFFEEED & 0x1F56;
        w.var2[6] = 0xFFFFADD8 & 0x5EAF;
        w.var2[7] = 2;
        w.var2[8] = 3;
        w.var2[9] = 69 + 55 - 121 + 169 ^ 65 + 120 - 171 + 154;
        w.var2[10] = -(0xFFFFC6CB & 0x79FD) & (0xFFFFFFFE & 0x79FB);
        w.var2[11] = 11 + 120 - 9 + 30 ^ 108 + 87 - 181 + 143;
        w.var2[12] = 0xFFFFFFB7 & 0x397E;
        w.var2[13] = 146 + 22 - 131 + 152 ^ 156 + 186 - 327 + 172;
        w.var2[14] = 61 + 56 - 88 + 103 ^ 58 + 4 - 50 + 128;
    }

    private static boolean var18(int n2) {
        return n2 != 0;
    }

    static {
        w.var17();
        w.var19();
        VER_SINHAZA = new GameEnum5(() -> {
            if (w.var18(Movement.shouldWalk() ? 1 : 0)) {
                Movement.walkTo((int)var2[5], (int)var2[6]);
                0;
            }
            return var2[3];
        }, var2[10], () -> {
            if (w.var10(Movement.shouldWalk() ? 1 : 0)) {
                return var2[0];
            }
            Player var20 = Players.getLocal();
            TileObject var21 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (w.var18(tileObject.getName().equals(var1[var2[8]]) ? 1 : 0) && w.var9(tileObject.distanceTo((Locatable)var20), var2[4])) {
                    n2 = var2[3];
                    0;
                    if null != null {
                        return ((15 + 18 - -117 + 91 ^ 133 + 173 - 237 + 117) & (0x79 ^ 0x7C ^ (0x61 ^ 0x2F) ^ -1)) != 0;
                    }
                } else {
                    n2 = var2[0];
                }
                return n2 != 0;
            });
            if (w.var22(var21)) {
                Movement.walkTo((int)var2[5], (int)var2[6]);
                0;
                0;
                if ((0xB9 ^ 0xBD) <= -1) {
                    return ((0xED ^ 0xBB) & ~(0xE2 ^ 0xB4)) != 0;
                }
            } else {
                var21.interact(var1[var2[7]]);
            }
            return var2[3];
        });
        PORT_PHASMATYS = new GameEnum5(() -> {
            if (w.var18(Movement.shouldWalk() ? 1 : 0)) {
                Movement.walkTo((int)var2[1], (int)var2[2]);
                0;
            }
            return var2[3];
        }, var2[12], () -> {
            if (w.var10(Movement.shouldWalk() ? 1 : 0)) {
                return var2[0];
            }
            Player var23 = Players.getLocal();
            TileObject var24 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (w.var18(tileObject.getName().equals(var1[var2[3]]) ? 1 : 0) && w.var9(tileObject.distanceTo((Locatable)var23), var2[4])) {
                    n2 = var2[3];
                    0;
                    if (1 <= 0) {
                        return ((67 + 51 - 92 + 127 ^ 23 + 48 - -66 + 6) & (103 + 7 - 15 + 95 ^ 35 + 56 - -29 + 48 ^ -1)) != 0;
                    }
                } else {
                    n2 = var2[0];
                }
                return n2 != 0;
            });
            if (w.var22(var24)) {
                Movement.walkTo((int)var2[1], (int)var2[2]);
                0;
                0;
                if null != null {
                    return ((0xF9 ^ 0x9A) & ~(0xA5 ^ 0xC6)) != 0;
                }
            } else {
                var24.interact(var1[var2[0]]);
            }
            return var2[3];
        });
        w[] wArray = new w[var2[7]];
        wArray[w.var2[0]] = VER_SINHAZA;
        wArray[w.var2[3]] = PORT_PHASMATYS;
        $VALUES = wArray;
    }

    private static void var19() {
        var1 = new String[var2[13]];
        w.var1[w.var2[0]] = "Bank";
        w.var1[w.var2[3]] = "Bank booth";
        w.var1[w.var2[7]] = "Bank";
        w.var1[w.var2[8]] = "Bank booth";
        w.var1[w.var2[9]] = "VER_SINHAZA";
        w.var1[w.var2[11]] = "PORT_PHASMATYS";
    }

    private static boolean var22(Object object) {
        return object == null;
    }
}

