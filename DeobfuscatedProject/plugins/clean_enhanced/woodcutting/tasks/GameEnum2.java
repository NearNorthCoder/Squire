/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.woodcutting.tasks;

public final class GameEnum2
extends Enum<a> {
    public static final  /* enum */ a MAHOGANY;
    public static final  /* enum */ a TEAK;
    private final  int logId;
    public static final  /* enum */ a WILLOW;
    
    public static final  /* enum */ a OAK;
    public static final  /* enum */ a REDWOOD;
    private static final  a[] $VALUES;
    public static final  /* enum */ a MAGIC;
    public static final  /* enum */ a YEW;
    public static final  /* enum */ a MAPLE;
    public static final  /* enum */ a BLISTERWOOD;
    
    private final  String treeName;
    public static final  /* enum */ a TREE;

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = 0;
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = 0;
        while (var11 < llllllllllllllIllIIllIIllIIllllI2) {
            char var12 = var9[var11];
            var6.append((char)(var12 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if (-1 == -1) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    public int s() {
        return this.logId;
    }

    static {
        a.var13();
        a.var14();
        TREE = new GameEnum2(var2[1], 2);
        OAK = new GameEnum2(var2[4], 5);
        WILLOW = new GameEnum2(var2[7], 8);
        TEAK = new GameEnum2(var2[var1[10]], var1[11]);
        MAPLE = new GameEnum2(var2[var1[13]], var1[14]);
        MAHOGANY = new GameEnum2(var2[var1[16]], var1[17]);
        YEW = new GameEnum2(var2[var1[19]], var1[20]);
        BLISTERWOOD = new GameEnum2(var2[var1[22]], var1[23]);
        MAGIC = new GameEnum2(var2[var1[25]], var1[26]);
        REDWOOD = new GameEnum2(var2[var1[28]], var1[29]);
        a[] aArray = new a[var1[15]];
        aArray[0] = TREE;
        aArray[1] = OAK;
        aArray[3] = WILLOW;
        aArray[4] = TEAK;
        aArray[6] = MAPLE;
        aArray[7] = MAHOGANY;
        aArray[9] = YEW;
        aArray[a.var1[10]] = BLISTERWOOD;
        aArray[a.var1[12]] = MAGIC;
        aArray[a.var1[13]] = REDWOOD;
        $VALUES = aArray;
    }

    public String r() {
        return this.treeName;
    }

        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

    private GameEnum2(String string2, int n2) {
        this.treeName = string2;
        this.logId = n2;
    }

    public static a[] values() {
        return (a[])$VALUES.clone();
    }

    public static a valueOf(String string) {
        return Enum.valueOf(GameEnum2.class, string);
    }

        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }
}

