/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.mixology.tasks;

public class MixologyManager {
    public static final  int ac;
    
    public static final  String ad;
    
    public static final  int aa;
    public static final  int ab;

    private static void var3() {
        var1 = new int[5];
        r.var1[0] = 1;
        r.var1[1] = 3;
        r.var1[2] = (0xCA ^ 0x88) & ~(0x5C ^ 0x1E);
        r.var1[3] = 2;
        r.var1[4] = 0x3A ^ 0x51 ^ (0x5E ^ 0x3D);
    }

    private static void var4() {
        var2 = new String[var1[0]];
        r.var2[r.var1[2]] = "Digweed";
    }

    static {
        r.var3();
        r.var4();
        aa = var1[0];
        ac = var1[1];
        ad = var2[var1[2]];
        ab = var1[3];
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }
}

