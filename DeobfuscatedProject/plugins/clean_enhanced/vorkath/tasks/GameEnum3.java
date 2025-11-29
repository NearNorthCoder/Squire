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

import java.util.List;
import java.util.function.BooleanSupplier;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;

public final class GameEnum3
extends Enum<c> {
    
    private final  List<Integer> regionIDs;
    
    public static final  /* enum */ c FEROX_ENCLAVE;
    private final  BooleanSupplier openBank;
    private final  BooleanSupplier traverse;
    private static final  c[] $VALUES;

    public List<Integer> j() {
        return this.regionIDs;
    }

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = var1[0];
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = var1[0];
        while (c.var12(var11, var10)) {
            char var13 = var9[var11];
            var6.append((char)(var13 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if (-1 < 2) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    public BooleanSupplier i() {
        return this.traverse;
    }

        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    private static void var20() {
        var2 = new String[var1[8]];
        c.var2[c.var1[0]] = "Use";
        c.var2[c.var1[3]] = "Bank chest";
        c.var2[c.var1[5]] = "FEROX_ENCLAVE";
    }

    public BooleanSupplier k() {
        return this.openBank;
    }

    public static c valueOf(String string) {
        return Enum.valueOf(GameEnum3.class, string);
    }

    private GameEnum3(BooleanSupplier booleanSupplier, int n3, BooleanSupplier booleanSupplier2) {
        this.traverse = booleanSupplier;
        this.regionIDs = List.of(Integer.valueOf(n3));
        this.openBank = booleanSupplier2;
    }

    static {
        c.var21();
        c.var20();
        FEROX_ENCLAVE = new GameEnum3(() -> {
            if (c.var22(Movement.shouldWalk() ? 1 : 0)) {
                Movement.walkTo((int)var1[1], (int)var1[2]);
                0;
            }
            return var1[3];
        }, List.of(Integer.valueOf(var1[6]), Integer.valueOf(var1[7])), () -> {
            if (c.var23(Movement.shouldWalk() ? 1 : 0)) {
                return var1[0];
            }
            Player var24 = Players.getLocal();
            TileObject var25 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (c.var22(tileObject.getName().equals(var2[var1[3]]) ? 1 : 0) && c.var12(tileObject.distanceTo((Locatable)var24), var1[4])) {
                    n2 = var1[3];
                    0;
                    if (-2 > 0) {
                        return ((0x2C ^ 0xD) & ~(0x66 ^ 0x47)) != 0;
                    }
                } else {
                    n2 = var1[0];
                }
                return n2 != 0;
            });
            if (c.var26(var25)) {
                Movement.walkTo((int)var1[1], (int)var1[2]);
                0;
                0;
                if null != null {
                    return ((0x28 ^ 9) & ~(0x73 ^ 0x52)) != 0;
                }
            } else {
                var25.interact(var2[var1[0]]);
            }
            return var1[3];
        });
        c[] cArray = new c[var1[3]];
        cArray[c.var1[0]] = FEROX_ENCLAVE;
        $VALUES = cArray;
    }

    private static boolean var23(int n2) {
        return n2 == 0;
    }

    public static c[] values() {
        return (c[])$VALUES.clone();
    }

    private static void var21() {
        var1 = new int[9];
        c.var1[0] = (0x27 ^ 0x23 ^ (0x79 ^ 0x1C)) & (0xCB ^ 0x8A ^ (0x78 ^ 0x58) ^ -1);
        c.var1[1] = -(0xFFFFDEE9 & 0x33D7) & (0xFFFFBEFA & 0x5FFF);
        c.var1[2] = 0xFFFFBFAF & 0x4E7F;
        c.var1[3] = 1;
        c.var1[4] = 0x9C ^ 0x90;
        c.var1[5] = 2;
        c.var1[6] = -(0xFFFF8F5F & 0x7FA5) & (0xFFFFFF7F & 0x3FBC);
        c.var1[7] = 0xFFFFB9FA & 0x773D;
        c.var1[8] = 3;
    }

    private static boolean var12(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var22(int n2) {
        return n2 != 0;
    }

    private static boolean var26(Object object) {
        return object == null;
    }

    private GameEnum3(BooleanSupplier booleanSupplier, List<Integer> list, BooleanSupplier booleanSupplier2) {
        this.traverse = booleanSupplier;
        this.regionIDs = list;
        this.openBank = booleanSupplier2;
    }
}

