/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.zammy.tasks;

import java.util.HashMap;
import gg.squire.zammy.tasks.GHelper;

class ZammyManager
extends HashMap<String, Integer> {
    
    final  g q;

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = 0;
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = 0;
        while (var11 < var10) {
            char var12 = var9[var11];
            var6.append((char)(var12 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if (-1 < (3 & ~3)) continue;
            return null;
        }
        return String.valueOf(var6);
    }

        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    ZammyManager(g g2) {
        this.q = g2;
        this.put(var1[0], 1);
        0;
        this.put(var1[2], 1);
        0;
        this.put(var1[3], 1);
        0;
        this.put(var1[4], 5);
        0;
        this.put(var1[6], 7);
        0;
        this.put(var1[8], 9);
        0;
        this.put(var1[var2[10]], var2[11]);
        0;
        this.put(var1[var2[12]], var2[13]);
        0;
        this.put(var1[var2[14]], var2[14]);
        0;
    }

        catch (Exception var24) {
            var24.printStackTrace();
            return null;
        }
    }
}

