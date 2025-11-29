/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.bandos.tasks;

import java.util.HashMap;
import gg.squire.bandos.tasks.GHelper;

class BandosManager
extends HashMap<String, Integer> {
    final  g w;

    private static boolean var3(int n2, int n3) {
        return n2 < n3;
    }

    static {
        h.var4();
        h.var5();
    }

        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    private static void var4() {
        var2 = new int[17];
        h.var2[0] = (0x28 ^ 0x1E ^ (2 ^ 0x1F)) & (0xD8 ^ 0x9E ^ (0xD0 ^ 0xBD) ^ -1);
        h.var2[1] = 0x1D ^ 0xB;
        h.var2[2] = 1;
        h.var2[3] = 2;
        h.var2[4] = 3;
        h.var2[5] = 0xAC ^ 0xB8;
        h.var2[6] = 6 ^ 2;
        h.var2[7] = 7 ^ 0x15;
        h.var2[8] = 0x17 ^ 0x6D ^ 18 + 100 - 55 + 64;
        h.var2[9] = 91 + 54 - 27 + 29 ^ 96 + 40 - 66 + 61;
        h.var2[10] = 0xB2 ^ 0xB4;
        h.var2[11] = 0x21 ^ 0x2F;
        h.var2[12] = 0x9C ^ 0x9B;
        h.var2[13] = 0x2A ^ 0x21;
        h.var2[14] = 0xBF ^ 0xB7;
        h.var2[15] = 0x73 ^ 0x7A;
        h.var2[16] = 0xCB ^ 0xC1;
    }

    private static void var5() {
        var1 = new String[var2[16]];
        h.var1[h.var2[0]] = "Anglerfish";
        h.var1[h.var2[2]] = "Manta ray";
        h.var1[h.var2[3]] = "Summer pie";
        h.var1[h.var2[4]] = "Shark";
        h.var1[h.var2[6]] = "Cooked karambwan";
        h.var1[h.var2[8]] = "Monkfish";
        h.var1[h.var2[10]] = "Chilli potato";
        h.var1[h.var2[12]] = "Half a summer pie";
        h.var1[h.var2[14]] = "Peach";
        h.var1[h.var2[15]] = "Bones";
    }

    private static String var18(String var19, String var20) {
        var19 = new String(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var21 = new StringBuilder();
        char[] var22 = var20.toCharArray();
        int var23 = var2[0];
        char[] var24 = var19.toCharArray();
        int var25 = var24.length;
        int var26 = var2[0];
        while (h.var3(var26, var25)) {
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

    BandosManager(g g2) {
        this.w = g2;
        this.put(var1[var2[0]], var2[1]);
        0;
        this.put(var1[var2[2]], var2[1]);
        0;
        this.put(var1[var2[3]], var2[1]);
        0;
        this.put(var1[var2[4]], var2[5]);
        0;
        this.put(var1[var2[6]], var2[7]);
        0;
        this.put(var1[var2[8]], var2[9]);
        0;
        this.put(var1[var2[10]], var2[11]);
        0;
        this.put(var1[var2[12]], var2[13]);
        0;
        this.put(var1[var2[14]], var2[14]);
        0;
        this.put(var1[var2[15]], var2[14]);
        0;
    }
}

