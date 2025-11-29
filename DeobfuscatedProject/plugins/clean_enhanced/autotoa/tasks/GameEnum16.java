/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.autotoa.tasks;

public final class GameEnum16
extends Enum<bi> {
    private static final  bi[] $VALUES;
    
    public static final  /* enum */ bi SWARM;
    public static final  /* enum */ bi ATTACK;
    public static final  /* enum */ bi MAGE;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static boolean var9(int n2, int n3) {
        return n2 < n3;
    }

        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    public static bi[] values() {
        return (bi[])$VALUES.clone();
    }

    static {
        bi.var16();
        bi.var17();
        ATTACK = new GameEnum16();
        SWARM = new GameEnum16();
        MAGE = new GameEnum16();
        bi[] biArray = new bi[var2[3]];
        biArray[bi.var2[0]] = ATTACK;
        biArray[bi.var2[1]] = SWARM;
        biArray[bi.var2[2]] = MAGE;
        $VALUES = biArray;
    }

    private static String var18(String var19, String var20) {
        var19 = new String(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var21 = new StringBuilder();
        char[] var22 = var20.toCharArray();
        int var23 = var2[0];
        char[] var24 = var19.toCharArray();
        int var25 = var24.length;
        int var26 = var2[0];
        while (bi.var9(var26, var25)) {
            char var27 = var24[var26];
            var21.append((char)(var27 ^ var22[var23 % var22.length]));
            0;
            ++var23;
            ++var26;
            0;
            
            return null;
        }
        return String.valueOf(var21);
    }

    private static void var17() {
        var1 = new String[var2[3]];
        bi.var1[bi.var2[0]] = "ATTACK";
        bi.var1[bi.var2[1]] = "SWARM";
        bi.var1[bi.var2[2]] = "MAGE";
    }

    private static void var16() {
        var2 = new int[5];
        bi.var2[0] = (0x1A ^ 0x7A ^ (1 ^ 0x5E)) & (0x39 ^ 0x58 ^ (0xE2 ^ 0xBC) ^ -1);
        bi.var2[1] = 1;
        bi.var2[2] = 2;
        bi.var2[3] = 3;
        bi.var2[4] = 0x33 ^ 0x4E ^ (0xB5 ^ 0xC0);
    }

    public static bi valueOf(String string) {
        return Enum.valueOf(GameEnum16.class, string);
    }
}

