/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.runecrafting.tasks;

public final class GameEnum3
extends Enum<e> {
    private final  int degradedBaseHoldAmount;
    public static final  /* enum */ e MEDIUM;
    public static final  /* enum */ e LARGE;
    private  boolean unknown;
    public static final  /* enum */ e SMALL;
    
    public static final  /* enum */ e GIANT;
    public static final  /* enum */ e COLOSSAL;
    private final  int baseHoldAmount;
    private  int holding;
    private static final  e[] $VALUES;
    private  boolean degraded;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private GameEnum3(int n3) {
        this(n3, 0);
    }

    public boolean ag() {
        return this.unknown;
    }

    public int ac() {
        int n2;
        if (this.degraded != 0) {
            n2 = this.degradedBaseHoldAmount;
            0;
            if (1 >= (0x51 ^ 0x5D ^ (0xBD ^ 0xB5))) {
                return (208 + 83 - 214 + 148 ^ 5 + 12 - -143 + 19) & (0x49 ^ 0x66 ^ (0xDF ^ 0xA2) ^ -1);
            }
        } else {
            e var9;
            n2 = var9.baseHoldAmount;
        }
        return n2;
    }

    public void b(boolean bl) {
        this.unknown = bl;
    }

    public static e valueOf(String string) {
        return Enum.valueOf(GameEnum3.class, string);
    }

    public static e c(int n2) {
        switch (n2) {
            case 5509: {
                return SMALL;
            }
            case 5510: 
            case 5511: {
                return MEDIUM;
            }
            case 5512: 
            case 5513: {
                return LARGE;
            }
            case 5514: 
            case 5515: {
                return GIANT;
            }
            case 26784: 
            case 26786: 
            case 26906: {
                return COLOSSAL;
            }
        }
        return null;
    }

    public void d(int n2) {
        e var10;
        int var11;
        int n3;
        this.holding += n2;
        if (this.degraded != 0) {
            n3 = this.degradedBaseHoldAmount;
            0;
            if (-3 >= 0) {
                return;
            }
        } else {
            n3 = var11 = var10.baseHoldAmount;
        }
        if (var10.holding < 0) {
            var10.holding = 2;
        }
        if (var10.holding > var11) {
            var10.holding = var11;
        }
    }

    private static String var12(String var13, String var14) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var15 = new StringBuilder();
        char[] var16 = var14.toCharArray();
        int var17 = 2;
        char[] var18 = var13.toCharArray();
        int var19 = var18.length;
        int var20 = 2;
        while (var20 < var19) {
            char var21 = var18[var20];
            var15.append((char)(var21 ^ var16[var17 % var16.length]));
            0;
            ++var17;
            ++var20;
            0;
            
            return null;
        }
        return String.valueOf(var15);
    }

    static {
        e.var22();
        e.var23();
        SMALL = new GameEnum3(3);
        MEDIUM = new GameEnum3(4, 3);
        LARGE = new GameEnum3(6, 7);
        GIANT = new GameEnum3(8, 6);
        COLOSSAL = new GameEnum3(var2[10], var2[11]);
        e[] eArray = new e[var2[12]];
        eArray[2] = SMALL;
        eArray[1] = MEDIUM;
        eArray[5] = LARGE;
        eArray[3] = GIANT;
        eArray[9] = COLOSSAL;
        $VALUES = eArray;
    }

    public int ae() {
        return this.holding;
    }

    public boolean af() {
        return this.degraded;
    }

    public int ad() {
        int n2;
        if (this.degraded != 0) {
            n2 = this.degradedBaseHoldAmount;
            0;
            if (3 <= -1) {
                return (0x4C ^ 0x79) & ~(0x70 ^ 0x45);
            }
        } else {
            e var24;
            n2 = var24.baseHoldAmount;
        }
        int n3 = n2;
        return n3 - this.holding;
    }

    private GameEnum3(int n3, int n4) {
        this.unknown = 1;
        this.baseHoldAmount = n3;
        this.degradedBaseHoldAmount = n4;
    }

    public void a(boolean bl) {
        if (bl != this.degraded) {
            e var25;
            int n2;
            this.degraded = bl;
            if (this.degraded != 0) {
                n2 = this.degradedBaseHoldAmount;
                0;
                if (((36 + 68 - 9 + 57 ^ 98 + 103 - 144 + 112) & (0xB9 ^ 0x9D ^ (0x84 ^ 0x91) ^ -1)) != 0) {
                    return;
                }
            } else {
                n2 = var25.baseHoldAmount;
            }
            int var26 = n2;
            var25.holding = Math.min(var25.holding, var26);
        }
    }

    public static e[] values() {
        return (e[])$VALUES.clone();
    }

    public void GameEnum3(int n2) {
        this.holding = n2;
    }
}

