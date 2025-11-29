/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.minigames.tasks;

public final class GameEnum2
extends Enum<a> {
    public static final  /* enum */ a MELEE;
    public static final  /* enum */ a RANGED;
    public static final  /* enum */ a MAGIC;
    
    private static final  a[] $VALUES;
    
    public static final  /* enum */ a MIXED;

    static {
        a.var3();
        a.var4();
        MELEE = new GameEnum2();
        RANGED = new GameEnum2();
        MAGIC = new GameEnum2();
        MIXED = new GameEnum2();
        a[] aArray = new a[4];
        aArray[0] = MELEE;
        aArray[1] = RANGED;
        aArray[2] = MAGIC;
        aArray[3] = MIXED;
        $VALUES = aArray;
    }

    public static a valueOf(String string) {
        return Enum.valueOf(GameEnum2.class, string);
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    public static a[] values() {
        return (a[])$VALUES.clone();
    }

        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    private static String var17(String var18, String var19) {
        var18 = new String(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var20 = new StringBuilder();
        char[] var21 = var19.toCharArray();
        int var22 = 0;
        char[] var23 = var18.toCharArray();
        int var24 = var23.length;
        int var25 = 0;
        while (var25 < var24) {
            char var26 = var23[var25];
            var20.append((char)(var26 ^ var21[var22 % var21.length]));
            0;
            ++var22;
            ++var25;
            0;
            if ((0x24 ^ 0x20) >= (0x8F ^ 0x8B)) continue;
            return null;
        }
        return String.valueOf(var20);
    }

}

