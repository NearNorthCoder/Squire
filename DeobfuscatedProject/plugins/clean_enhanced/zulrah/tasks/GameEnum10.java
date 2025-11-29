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

import java.util.List;
import java.util.function.BooleanSupplier;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;

public final class GameEnum10
extends Enum<a> {
    private final  BooleanSupplier openBank;
    
    private static final  a[] $VALUES;
    public static final  /* enum */ a FEROX_ENCLAVE;
    private final  BooleanSupplier traverse;
    private final  List<Integer> regionIDs;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static String var9(String var10, String var11) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var13 = var11.toCharArray();
        int var14 = 0;
        char[] var15 = var10.toCharArray();
        int var16 = var15.length;
        int var17 = 0;
        while (var17 < var16) {
            char var18 = var15[var17];
            var12.append((char)(var18 ^ var13[var14 % var13.length]));
            0;
            ++var14;
            ++var17;
            0;
            if (2 > 0) continue;
            return null;
        }
        return String.valueOf(var12);
    }

    public static a valueOf(String string) {
        return Enum.valueOf(GameEnum10.class, string);
    }

    public BooleanSupplier f() {
        return this.traverse;
    }

    private GameEnum10(BooleanSupplier booleanSupplier, int n3, BooleanSupplier booleanSupplier2) {
        this.traverse = booleanSupplier;
        this.regionIDs = List.of(Integer.valueOf(n3));
        this.openBank = booleanSupplier2;
    }

    private GameEnum10(BooleanSupplier booleanSupplier, List<Integer> list, BooleanSupplier booleanSupplier2) {
        this.traverse = booleanSupplier;
        this.regionIDs = list;
        this.openBank = booleanSupplier2;
    }

    public BooleanSupplier h() {
        return this.openBank;
    }

    public List<Integer> g() {
        return this.regionIDs;
    }

        catch (Exception var24) {
            var24.printStackTrace();
            return null;
        }
    }

    public static a[] values() {
        return (a[])$VALUES.clone();
    }

    static {
        a.var25();
        a.var26();
        FEROX_ENCLAVE = new GameEnum10(() -> {
            if ((Movement.shouldWalk( != 0) ? 1 : 0)) {
                Movement.walkTo((int)1, (int)2);
                0;
            }
            return 3;
        }, List.of(Integer.valueOf(6), Integer.valueOf(7)), () -> {
            if ((Movement.shouldWalk( == 0) ? 1 : 0)) {
                return 0;
            }
            Player var27 = Players.getLocal();
            TileObject var28 = TileObjects.getNearest(tileObject -> {
                int n2;
                if ((tileObject.getName( != 0).equals(var1[3]) ? 1 : 0) && (tileObject.distanceTo((Locatable)var27) < 4)) {
                    n2 = 3;
                    0;
                    if (-1 > 3) {
                        return ((72 + 73 - 35 + 47 ^ 47 + 174 - 76 + 51) & (7 ^ 0x50 ^ (0x18 ^ 0x16) ^ -1)) != 0;
                    }
                } else {
                    n2 = 0;
                }
                return n2 != 0;
            });
            if var28 == null {
                Movement.walkTo((int)1, (int)2);
                0;
                0;
                if (-(0x3C ^ 0x38) > 0) {
                    return ((0xA ^ 0x15) & ~(0x92 ^ 0x8D)) != 0;
                }
            } else {
                var28.interact(var1[0]);
            }
            return 3;
        });
        a[] aArray = new a[3];
        aArray[0] = FEROX_ENCLAVE;
        $VALUES = aArray;
    }
}

