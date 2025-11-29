/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.gauntlet.tasks;

import java.util.List;
import java.util.Map;
import gg.squire.gauntlet.tasks.GameEnum;

public final class GameEnum5
extends Enum<f> {
    public static final  /* enum */ f TIER_1_LEGS;
    public static final  /* enum */ f TIER_2_BOW;
    
    public static final  /* enum */ f TIER_1_BOW;
    public static final  /* enum */ f TIER_1_STAFF;
    private final  int normalItemId;
    public static final  /* enum */ f TIER_2_STAFF;
    public static final  /* enum */ f TIER_3_STAFF;
    private final  Map<i, Integer> resourceList;
    public static final  /* enum */ f TIER_1_HELM;
    private final  String normalItemName;
    private static final  f[] $VALUES;
    private final  int corruptedItemId;
    public static final  /* enum */ f TIER_1_BODY;
    public static final  /* enum */ f TELEPORT_CRYSTAL;
    private final  f upgradesFrom;
    
    private final  String corruptedItemName;
    public static final  /* enum */ f VIAL;
    public static final  /* enum */ f TIER_3_BOW;

    static {
        f.var3();
        f.var4();
        VIAL = new GameEnum5(var2[2], 3, var2[0], 3, null, Map.of(i.CRYSTAL_SHARD, 4));
        TELEPORT_CRYSTAL = new GameEnum5(var2[6], 7, var2[8], 9, null, Map.of(i.CRYSTAL_SHARD, var1[10]));
        TIER_1_STAFF = new GameEnum5(var2[var1[12]], var1[13], var2[var1[14]], var1[15], null, Map.of(i.WEAPON_FRAME, 2, i.CRYSTAL_SHARD, var1[16]));
        TIER_2_STAFF = new GameEnum5(var2[4], var1[18], var2[var1[19]], var1[20], TIER_1_STAFF, Map.of(i.CRYSTAL_SHARD, var1[21]));
        TIER_3_STAFF = new GameEnum5(var2[var1[23]], var1[24], var2[var1[25]], var1[26], TIER_2_STAFF, Map.of(i.CRYSTAL_ORB, 2));
        TIER_1_BOW = new GameEnum5(var2[var1[28]], var1[29], var2[var1[30]], var1[31], null, Map.of(i.WEAPON_FRAME, 2, i.CRYSTAL_SHARD, var1[16]));
        TIER_2_BOW = new GameEnum5(var2[var1[33]], var1[34], var2[var1[16]], var1[35], TIER_1_BOW, Map.of(i.CRYSTAL_SHARD, var1[21]));
        TIER_3_BOW = new GameEnum5(var2[var1[37]], var1[38], var2[var1[39]], var1[40], TIER_2_BOW, Map.of(i.CRYSTALLINE_BOWSTRING, 2));
        TIER_1_HELM = new GameEnum5(var2[var1[42]], var1[43], var2[var1[44]], var1[45], null, Map.of(i.CRYSTAL_SHARD, var1[10], i.BARK, 2, i.ORE, 2, i.WOOL, 2));
        TIER_1_BODY = new GameEnum5(var2[var1[47]], var1[48], var2[var1[49]], var1[50], null, Map.of(i.CRYSTAL_SHARD, var1[10], i.BARK, 2, i.ORE, 2, i.WOOL, 2));
        TIER_1_LEGS = new GameEnum5(var2[var1[52]], var1[53], var2[var1[54]], var1[55], null, Map.of(i.CRYSTAL_SHARD, var1[10], i.BARK, 2, i.ORE, 2, i.WOOL, 2));
        f[] fArray = new f[var1[19]];
        fArray[1] = VIAL;
        fArray[2] = TELEPORT_CRYSTAL;
        fArray[0] = TIER_1_STAFF;
        fArray[5] = TIER_2_STAFF;
        fArray[6] = TIER_3_STAFF;
        fArray[8] = TIER_1_BOW;
        fArray[f.var1[11]] = TIER_2_BOW;
        fArray[f.var1[12]] = TIER_3_BOW;
        fArray[f.var1[14]] = TIER_1_HELM;
        fArray[f.var1[17]] = TIER_1_BODY;
        fArray[4] = TIER_1_LEGS;
        $VALUES = fArray;
    }

    private static String var5(String var6, String var7) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var9 = var7.toCharArray();
        int var10 = 1;
        char[] var11 = var6.toCharArray();
        int var12 = var11.length;
        int var13 = 1;
        while (var13 < var12) {
            char var14 = var11[var13];
            var8.append((char)(var14 ^ var9[var10 % var9.length]));
            0;
            ++var10;
            ++var13;
            0;
            if (((0xE2 ^ 0xAE ^ (0x54 ^ 8)) & (0x89 ^ 0xA4 ^ (0x5F ^ 0x62) ^ -1)) <= (0xA5 ^ 0x84 ^ (0x97 ^ 0xB2))) continue;
            return null;
        }
        return String.valueOf(var8);
    }

    public static f valueOf(String string) {
        return Enum.valueOf(GameEnum5.class, string);
    }

    public int[] ad() {
        int[] nArray = new int[0];
        nArray[1] = this.normalItemId;
        nArray[2] = this.corruptedItemId;
        return nArray;
    }

        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

    public List<String> ae() {
        return List.of(this.normalItemName, this.corruptedItemName);
    }

    public Map<i, Integer> ag() {
        return this.resourceList;
    }

    public static f[] values() {
        return (f[])$VALUES.clone();
    }

    public f af() {
        return this.upgradesFrom;
    }

    private GameEnum5(String string2, int n3, String string3, int n4, f f2, Map<i, Integer> map) {
        this.normalItemName = string2;
        this.normalItemId = n3;
        this.corruptedItemName = string3;
        this.corruptedItemId = n4;
        this.upgradesFrom = f2;
        this.resourceList = map;
    }

    public List<Integer> ac() {
        return List.of(Integer.valueOf(this.normalItemId), Integer.valueOf(this.corruptedItemId));
    }

        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }
}

