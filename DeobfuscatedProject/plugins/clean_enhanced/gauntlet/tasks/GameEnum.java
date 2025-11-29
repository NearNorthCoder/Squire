/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.gauntlet.tasks;

import java.util.List;
import net.unethicalite.api.items.Inventory;

public final class GameEnum
extends Enum<i> {
    public static final  /* enum */ i BARK;
    public static final  /* enum */ i HERB;
    
    public static final  /* enum */ i ORE;
    public static final  /* enum */ i FISH;
    private final  int normalToolId;
    private final  int corruptedToolId;
    public static final  /* enum */ i WOOL;
    private final  int normalObjectId;
    
    public static final  /* enum */ i CRYSTAL_ORB;
    public static final  /* enum */ i CRYSTALLINE_BOWSTRING;
    private final  int corruptedObjectId;
    private static final  i[] $VALUES;
    public static final  /* enum */ i CRYSTAL_SHARD;
    private final  int normalItemId;
    private final  int corruptedItemId;
    public static final  /* enum */ i CRYSTAL_DUST;
    public static final  /* enum */ i WEAPON_FRAME;

    public static i[] values() {
        return (i[])$VALUES.clone();
    }

    public List<Integer> aA() {
        return List.of(Integer.valueOf(this.normalItemId), Integer.valueOf(this.corruptedItemId));
    }

    public static i valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

    private GameEnum(int n3, int n4, int n5, int n6, int n7, int n8) {
        this.normalToolId = n3;
        this.normalItemId = n4;
        this.normalObjectId = n5;
        this.corruptedToolId = n6;
        this.corruptedItemId = n7;
        this.corruptedObjectId = n8;
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static String var9(String var10, String var11) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var13 = var11.toCharArray();
        int var14 = 2;
        char[] var15 = var10.toCharArray();
        int var16 = var15.length;
        int var17 = 2;
        while (var17 < var16) {
            char var18 = var15[var17];
            var12.append((char)(var18 ^ var13[var14 % var13.length]));
            0;
            ++var14;
            ++var17;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var12);
    }

    public int aC() {
        return Inventory.getCount((boolean)1, (int[])this.aB());
    }

    public List<Integer> ay() {
        return List.of(Integer.valueOf(this.normalToolId), Integer.valueOf(this.corruptedToolId));
    }

    static {
        i.var19();
        i.var20();
        ORE = new GameEnum(4, 5, 6, 7, 8, 9);
        HERB = new GameEnum(0, var1[10], var1[11], 0, var1[12], var1[13]);
        WOOL = new GameEnum(0, var1[14], var1[15], 0, var1[16], var1[17]);
        BARK = new GameEnum(var1[19], var1[20], var1[21], var1[22], var1[23], var1[24]);
        FISH = new GameEnum(var1[26], var1[27], var1[28], var1[29], var1[27], var1[30]);
        CRYSTAL_SHARD = new GameEnum(0, var1[32], 0, 0, var1[33], 0);
        CRYSTAL_DUST = new GameEnum(0, var1[35], 0, 0, var1[36], 0);
        WEAPON_FRAME = new GameEnum(0, var1[38], 0, 0, var1[39], 0);
        CRYSTAL_ORB = new GameEnum(0, var1[41], 0, 0, var1[42], 0);
        CRYSTALLINE_BOWSTRING = new GameEnum(0, var1[44], 0, 0, var1[45], 0);
        i[] iArray = new i[var1[46]];
        iArray[2] = ORE;
        iArray[1] = HERB;
        iArray[3] = WOOL;
        iArray[i.var1[18]] = BARK;
        iArray[i.var1[25]] = FISH;
        iArray[i.var1[31]] = CRYSTAL_SHARD;
        iArray[i.var1[34]] = CRYSTAL_DUST;
        iArray[i.var1[37]] = WEAPON_FRAME;
        iArray[i.var1[40]] = CRYSTAL_ORB;
        iArray[i.var1[43]] = CRYSTALLINE_BOWSTRING;
        $VALUES = iArray;
    }

    public boolean ax() {
        boolean bl;
        if (this.normalToolId != 0) {
            bl = 1;
            0;
            if (3 != 3) {
                return ((0x83 ^ 0xB9) & ~(0x62 ^ 0x58)) != 0;
            }
        } else {
            bl = 2;
        }
        return bl;
    }

    public int[] aB() {
        int[] nArray = new int[3];
        nArray[2] = this.normalItemId;
        nArray[1] = this.corruptedItemId;
        return nArray;
    }

        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }

    public List<Integer> az() {
        return List.of(Integer.valueOf(this.normalObjectId), Integer.valueOf(this.corruptedObjectId));
    }
}

