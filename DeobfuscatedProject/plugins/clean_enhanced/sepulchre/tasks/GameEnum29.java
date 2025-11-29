/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.util.Log
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.Skill
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.unethicalite.api.coords.RegionPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.sepulchre.tasks;

import gg.squire.sepulchre.tasks.BHelper;
import gg.squire.client.util.Log;
import gg.squire.sepulchre.SquireSepulchre;
import java.util.List;
import java.util.function.Supplier;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.movement.Movement;

public final class GameEnum29
extends Enum<h> {
    private  Supplier<WorldArea> area;
    public static final  /* enum */ h FLOOR_IV;
    
    public static final  /* enum */ h FLOOR_II;
    public static final  /* enum */ h FLOOR_I;
    public static final  /* enum */ h FLOOR_V;
    
    private  int nextReq;
    public static final  /* enum */ h FLOOR_III;
    private static final  h[] $VALUES;

    private static void var3() {
        var1 = new int[30];
        h.var1[0] = 2 & ~2;
        h.var1[1] = 1;
        h.var1[2] = 85 + 105 - 140 + 188 ^ 24 + 121 - 113 + 158;
        h.var1[3] = 2;
        h.var1[4] = 3;
        h.var1[5] = 0x5A ^ 0x6C ^ (0xAD ^ 0x9F);
        h.var1[6] = 0xE ^ 0x43 ^ (0xD3 ^ 0x9B);
        h.var1[7] = 0xE8 ^ 0xC1 ^ (0x59 ^ 0x76);
        h.var1[8] = 0x74 ^ 0x73;
        h.var1[9] = 0xF3 ^ 0xA7 ^ (0x65 ^ 0x39);
        h.var1[10] = 0x1D ^ 0x26 ^ (0x8D ^ 0xBF);
        h.var1[11] = 0x33 ^ 0x39;
        h.var1[12] = 0x3B ^ 0x30;
        h.var1[13] = 0x27 ^ 0x49 ^ (0x51 ^ 0x24);
        h.var1[14] = 0x4B ^ 0x75;
        h.var1[15] = 2 + 52 - -94 + 35 ^ 13 + 126 - 95 + 143;
        h.var1[16] = 0x15 ^ 0x23 ^ (0xD0 ^ 0xAE);
        h.var1[17] = 0x63 ^ 0x6E;
        h.var1[18] = 0x65 ^ 0x47;
        h.var1[19] = 0xB4 ^ 0x93 ^ (0x7D ^ 8);
        h.var1[20] = 0x12 ^ 0x1C;
        h.var1[21] = 111 + 95 - 127 + 77 ^ 47 + 113 - 79 + 52;
        h.var1[22] = 0x8B ^ 0xC3 ^ (0x4E ^ 0x13);
        h.var1[23] = 0xA3 ^ 0xAC;
        h.var1[24] = 0x10 ^ 3;
        h.var1[25] = 0xCF ^ 0x93;
        h.var1[26] = 103 + 24 - 35 + 71 ^ 161 + 133 - 108 + 3;
        h.var1[27] = 99 + 78 - 113 + 75 ^ 118 + 58 - 61 + 55;
        h.var1[28] = 0x8B ^ 0x82 ^ (0xE1 ^ 0x86);
        h.var1[29] = 0x4A ^ 0x43 ^ (0x6B ^ 0x72);
    }

    public Supplier<WorldArea> K() {
        return this.area;
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    private static boolean var10(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J() {
        void var3_3;
        void var11;
        h var12;
        Player player = Players.getLocal();
        if (h.var13(player)) {
            return var1[0];
        }
        if (h.var14(var12.a((Locatable)var11) ? 1 : 0)) {
            return var1[0];
        }
        TileObject var15 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (h.var16(tileObject.getName().toLowerCase().startsWith(var2[var1[9]]) ? 1 : 0)) {
                String[] stringArray = new String[var1[1]];
                stringArray[h.var1[0]] = var2[var1[10]];
                if (h.var16(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    String[] stringArray2 = new String[var1[1]];
                    stringArray2[h.var1[0]] = var2[var1[11]];
                    if (h.var16(tileObject.hasAction(stringArray2) ? 1 : 0)) {
                        n2 = var1[1];
                        0;
                        if (-2 < 0) return n2 != 0;
                        return (1 & ~1) != 0;
                    }
                }
            }
            n2 = var1[0];
            return n2 != 0;
        });
        if (h.var13(var15)) {
            Log.error((String)var2[var1[0]]);
            return var1[0];
        }
        if (h.var10(Skills.getLevel((SkiSkill.AGILITY), var12.nextReq)) {
            var15.interact(var2[var1[1]]);
            return var1[1];
        }
        if (h.var10(Movement.getRunEnergy(), var1[2])) {
            var15.interact(var2[var1[3]]);
            return var1[1];
        }
        TileObject var17 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (h.var16(tileObject.getName().startsWith(var2[var1[7]]) ? 1 : 0)) {
                String[] stringArray = new String[var1[1]];
                stringArray[h.var1[0]] = var2[var1[8]];
                if (h.var16(tileObject.hasAction(stringArray) ? 1 : 0) && h.var16(this.area.get().contains((Locatable)tileObject) ? 1 : 0)) {
                    n2 = var1[1];
                    0;
                    if null == null return n2 != 0;
                    return ((0x14 ^ 0x28 ^ (0x2D ^ 0x18)) & (67 + 0 - 59 + 125 ^ 123 + 16 - 33 + 34 ^ -1)) != 0;
                }
            }
            n2 = var1[0];
            return n2 != 0;
        });
        if (h.var13(var17)) {
            var15.interact(var2[var1[4]]);
            System.out.println(var2[var1[5]]);
            return var1[0];
        }
        var3_3.interact(var2[var1[6]]);
        return var1[1];
    }

    public void a(SquireSepulchre squireSepulchre) {
        squireSepulchre.a(List.of(this.area.get()));
        squireSepulchre.a(this.name());
    }

    public static h[] values() {
        return (h[])$VALUES.clone();
    }

    private static boolean var14(int n2) {
        return n2 == 0;
    }

    static {
        h.var3();
        h.var18();
        FLOOR_I = new GameEnum29(new RegionPoint(var1[13], var1[13], var1[1], b.C), var1[12], var1[12], var1[14]);
        FLOOR_II = new GameEnum29(new RegionPoint(var1[13], var1[13], var1[1], b.G), var1[12], var1[12], var1[16]);
        FLOOR_III = new GameEnum29(new RegionPoint(var1[13], var1[18], var1[1], b.J), var1[12], var1[5], var1[19]);
        FLOOR_IV = new GameEnum29(new RegionPoint(var1[21], var1[22], var1[1], b.L), var1[23], var1[24], var1[25]);
        FLOOR_V = new GameEnum29(new RegionPoint(var1[26], var1[27], var1[0], b.N), var1[6], var1[5], var1[28]);
        h[] hArray = new h[var1[6]];
        hArray[h.var1[0]] = FLOOR_I;
        hArray[h.var1[1]] = FLOOR_II;
        hArray[h.var1[3]] = FLOOR_III;
        hArray[h.var1[4]] = FLOOR_IV;
        hArray[h.var1[5]] = FLOOR_V;
        $VALUES = hArray;
    }

    private static boolean var16(int n2) {
        return n2 != 0;
    }

    private static void var18() {
        var2 = new String[var1[29]];
        h.var2[h.var1[0]] = "obelisk is null";
        h.var2[h.var1[1]] = "Quick-exit";
        h.var2[h.var1[3]] = "Activate";
        h.var2[h.var1[4]] = "Quick-exit";
        h.var2[h.var1[5]] = "we null";
        h.var2[h.var1[6]] = "Climb-down";
        h.var2[h.var1[7]] = "Stairs";
        h.var2[h.var1[8]] = "Climb-down";
        h.var2[h.var1[9]] = "magical obelisk";
        h.var2[h.var1[10]] = "Activate";
        h.var2[h.var1[11]] = "Quick-exit";
        h.var2[h.var1[12]] = "FLOOR_I";
        h.var2[h.var1[15]] = "FLOOR_II";
        h.var2[h.var1[17]] = "FLOOR_III";
        h.var2[h.var1[20]] = "FLOOR_IV";
        h.var2[h.var1[23]] = "FLOOR_V";
    }

    private static boolean var13(Object object) {
        return object == null;
    }

    private static String var19(String var20, String var21) {
        var20 = new String(Base64.getDecoder().decode(var20.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var22 = new StringBuilder();
        char[] var23 = var21.toCharArray();
        int var24 = var1[0];
        char[] var25 = var20.toCharArray();
        int var26 = var25.length;
        int var27 = var1[0];
        while (h.var10(var27, var26)) {
            char var28 = var25[var27];
            var22.append((char)(var28 ^ var23[var24 % var23.length]));
            0;
            ++var24;
            ++var27;
            0;
            if (-2 <= 0) continue;
            return null;
        }
        return String.valueOf(var22);
    }

    public boolean a(Locatable locatable) {
        if (h.var16(this.area.get().contains(locatable) ? 1 : 0)) {
            return var1[1];
        }
        return var1[0];
    }

        catch (Exception var34) {
            var34.printStackTrace();
            return null;
        }
    }

    private GameEnum29(RegionPoint regionPoint, int n3, int n4, int n5) {
        this.area = () -> new WorldArea(SquireSepulchre.a(regionPoint), n3, n4);
        this.nextReq = n5;
    }

    public static h valueOf(String string) {
        return Enum.valueOf(GameEnum29.class, string);
    }
}

