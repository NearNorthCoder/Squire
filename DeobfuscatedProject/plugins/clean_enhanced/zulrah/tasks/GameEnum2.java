/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.zulrah.tasks;

import java.util.ArrayList;
import java.util.List;

public final class GameEnum2
extends Enum<o> {
    private static final  o[] $VALUES;
    public static final  /* enum */ o IGNORE;
    public static final  /* enum */ o ANTI_POISON;
    private final  List<Integer> items;
    public static final  /* enum */ o CURE_SELF;
    public static final  /* enum */ o ANTI_VENOM;

    public static final  /* enum */ o ANTI_DOTE;
    private final  String name;

    public String k() {
        return this.name;
    }

    static {
        o.var3();
        o.var4();
        int[] nArray = new int[3];
        nArray[0] = 4;
        nArray[1] = 5;
        nArray[2] = 6;
        nArray[7] = 8;
        nArray[9] = var2[10];
        nArray[o.var2[11]] = var2[12];
        ANTI_VENOM = new GameEnum2(var1[2], nArray);
        int[] nArray2 = new int[2];
        nArray2[0] = var2[13];
        nArray2[1] = var2[14];
        ANTI_DOTE = new GameEnum2(var1[9], nArray2);
        int[] nArray3 = new int[3];
        nArray3[0] = var2[15];
        nArray3[1] = var2[16];
        nArray3[2] = var2[17];
        nArray3[7] = var2[18];
        nArray3[9] = var2[19];
        nArray3[o.var2[11]] = var2[20];
        ANTI_POISON = new GameEnum2(var1[3], nArray3);
        int[] nArray4 = new int[2];
        nArray4[0] = var2[22];
        nArray4[1] = var2[23];
        CURE_SELF = new GameEnum2(nArray4);
        IGNORE = new GameEnum2(new int[0]);
        o[] oArray = new o[var2[11]];
        oArray[0] = ANTI_VENOM;
        oArray[1] = ANTI_DOTE;
        oArray[2] = ANTI_POISON;
        oArray[7] = CURE_SELF;
        oArray[9] = IGNORE;
        $VALUES = oArray;
    }

    public static o valueOf(String string) {
        return Enum.valueOf(GameEnum2.class, string);
    }

    public static o[] values() {
        return (o[])$VALUES.clone();
    }

    private GameEnum2(int ... nArray) {
        this(var1[0], nArray);
    }

    /*
     * WARNING - void declaration
     */
    private GameEnum2(String string2, int ... nArray) {
        void var5;
        this.name = string2;
        this.items = new ArrayList<Integer>();
        int[] nArray2 = nArray;
        int n3 = nArray2.length;
        int var6 = 0;
        while ((var6 < (int)var5)) {
            o var7;
            void var8;
            void var9 = var8[var6];
            var7.items.add((int)var9);
            0;
            ++var6;
            0;
            if null == null continue;
            throw null;
        }
    }

    public List<Integer> I() {
        return this.items;
    }

        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    private static String var16(String var17, String var18) {
        var17 = new String(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var19 = new StringBuilder();
        char[] var20 = var18.toCharArray();
        int var21 = 0;
        char[] var22 = var17.toCharArray();
        int var23 = var22.length;
        int var24 = 0;
        while (var24 < var23) {
            char var25 = var22[var24];
            var19.append((char)(var25 ^ var20[var21 % var20.length]));
            0;
            ++var21;
            ++var24;
            0;
            if (((0x8B ^ 0xBF ^ (0x62 ^ 0x58)) & (0xBD ^ 0xAF ^ (0x16 ^ 0xA) ^ -1)) == 0) continue;
            return null;
        }
        return String.valueOf(var19);
    }

        catch (Exception var31) {
            var31.printStackTrace();
            return null;
        }
    }
}

