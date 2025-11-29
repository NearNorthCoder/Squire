/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.autotoa.tasks;

public final class GameEnum13
extends Enum<l> {
    public static final  /* enum */ l APMEKEN;
    private static final  l[] $VALUES;
    private final  int doorId;
    private final  String name;
    public static final  /* enum */ l HET;
    
    public static final  /* enum */ l CRONDIS;
    public static final  /* enum */ l SCABARAS;

    private static void var3() {
        var2 = new int[13];
        l.var2[0] = (0x86 ^ 0xA4) & ~(0x78 ^ 0x5A);
        l.var2[1] = 1;
        l.var2[2] = -(0xFFFFBB3D & 0x46EB) & (0xFFFFBE7F & 0xF7F9);
        l.var2[3] = 2;
        l.var2[4] = 3;
        l.var2[5] = -(0x47 ^ 0x66) & (0xFFFFFFEF & 0xB47B);
        l.var2[6] = 0x79 ^ 0x38 ^ (0x50 ^ 0x15);
        l.var2[7] = 0 ^ 5;
        l.var2[8] = -(0xFFFFFFBF & 0x49E3) & (0xFFFFFDFE & 0xFFF7);
        l.var2[9] = 0 ^ 6;
        l.var2[10] = 0x97 ^ 0x90;
        l.var2[11] = 0xFFFFBF5E & 0xF4EF;
        l.var2[12] = 0x4C ^ 0x44;
    }

    public String GameEnum13() {
        return this.name;
    }

    public int F() {
        return this.doorId;
    }

    static {
        l.var3();
        l.var4();
        CRONDIS = new GameEnum13(var1[var2[1]], var2[2]);
        SCABARAS = new GameEnum13(var1[var2[4]], var2[5]);
        HET = new GameEnum13(var1[var2[7]], var2[8]);
        APMEKEN = new GameEnum13(var1[var2[10]], var2[11]);
        l[] lArray = new l[var2[6]];
        lArray[l.var2[0]] = CRONDIS;
        lArray[l.var2[1]] = SCABARAS;
        lArray[l.var2[3]] = HET;
        lArray[l.var2[4]] = APMEKEN;
        $VALUES = lArray;
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    public static l valueOf(String string) {
        return Enum.valueOf(GameEnum13.class, string);
    }

    private static String var11(String var12, String var13) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var15 = var13.toCharArray();
        int var16 = var2[0];
        char[] var17 = var12.toCharArray();
        int var18 = var17.length;
        int var19 = var2[0];
        while (l.var20(var19, var18)) {
            char var21 = var17[var19];
            var14.append((char)(var21 ^ var15[var16 % var15.length]));
            0;
            ++var16;
            ++var19;
            0;
            if (-1 < ((0x4F ^ 0x21 ^ (5 ^ 0x53)) & (3 ^ (0x6D ^ 0x56) ^ -1))) continue;
            return null;
        }
        return String.valueOf(var14);
    }

    private static boolean var20(int n2, int n3) {
        return n2 < n3;
    }

    private static void var4() {
        var1 = new String[var2[12]];
        l.var1[l.var2[0]] = "CRONDIS";
        l.var1[l.var2[1]] = "Path of Crondis";
        l.var1[l.var2[3]] = "SCABARAS";
        l.var1[l.var2[4]] = "Path of Scabaras";
        l.var1[l.var2[6]] = "HET";
        l.var1[l.var2[7]] = "Path of Het";
        l.var1[l.var2[9]] = "APMEKEN";
        l.var1[l.var2[10]] = "Path of Apmeken";
    }

    private GameEnum13(String string2, int n3) {
        this.name = string2;
        this.doorId = n3;
    }

    public static l[] values() {
        return (l[])$VALUES.clone();
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }
}

