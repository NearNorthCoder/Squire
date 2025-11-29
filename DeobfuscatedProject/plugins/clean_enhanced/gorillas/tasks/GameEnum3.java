/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.gorillas.tasks;

public final class GameEnum3
extends Enum<d> {
    
    public static final  /* enum */ d MAGIC;
    public static final  /* enum */ d RANGED;
    private static final  d[] $VALUES;
    
    public static final  /* enum */ d MELEE;
    public static final  /* enum */ d BOULDER;

    static {
        d.var3();
        d.var4();
        MAGIC = new GameEnum3();
        RANGED = new GameEnum3();
        MELEE = new GameEnum3();
        BOULDER = new GameEnum3();
        d[] dArray = new d[4];
        dArray[0] = MAGIC;
        dArray[1] = RANGED;
        dArray[2] = MELEE;
        dArray[3] = BOULDER;
        $VALUES = dArray;
    }

    public static d[] values() {
        return (d[])$VALUES.clone();
    }

    public static d valueOf(String string) {
        return Enum.valueOf(GameEnum3.class, string);
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
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
            
            return null;
        }
        return String.valueOf(var20);
    }
}

