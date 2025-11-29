/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.IHelper;
import gg.squire.farmer.tasks.GameEnum23;
import gg.squire.farmer.tasks.GameEnum4;

public final class GameEnum12
extends Enum<H> {
    public static final  /* enum */ H LUNAR_SPELL;
    
    private static final  H[] $VALUES;
    
    private final  int id;
    private final  K equipment;
    public static final  /* enum */ H SUPERCOMPOST;
    public static final  /* enum */ H COMPOST;
    public static final  /* enum */ H ULTRACOMPOST;

    static {
        H.var3();
        H.var4();
        COMPOST = new GameEnum12(1, K.COMPOST);
        SUPERCOMPOST = new GameEnum12(3, K.SUPER_COMPOST);
        ULTRACOMPOST = new GameEnum12(5, K.ULTRA_COMPOST);
        LUNAR_SPELL = new GameEnum12(7, null);
        H[] hArray = new H[8];
        hArray[0] = COMPOST;
        hArray[2] = SUPERCOMPOST;
        hArray[4] = ULTRACOMPOST;
        hArray[6] = LUNAR_SPELL;
        $VALUES = hArray;
    }

    public static H[] values() {
        return (H[])$VALUES.clone();
    }

    public static H valueOf(String string) {
        return Enum.valueOf(GameEnum12.class, string);
    }

    private static String var5(String var6, String var7) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var9 = var7.toCharArray();
        int var10 = 0;
        char[] var11 = var6.toCharArray();
        int var12 = var11.length;
        int var13 = 0;
        while (var13 < var12) {
            char var14 = var11[var13];
            var8.append((char)(var14 ^ var9[var10 % var9.length]));
            0;
            ++var10;
            ++var13;
            0;
            if (2 > -1) continue;
            return null;
        }
        return String.valueOf(var8);
    }

    public static H c(au au2) {
        switch (I.bm[au2.ordinal()]) {
            case 1: 
            case 2: {
                return ULTRACOMPOST;
            }
            case 3: 
            case 4: {
                return SUPERCOMPOST;
            }
            case 5: 
            case 6: {
                return COMPOST;
            }
        }
        return null;
    }

    public int aB() {
        return this.id;
    }

    public K aC() {
        return this.equipment;
    }

        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

    private GameEnum12(int n3, K k2) {
        this.id = n3;
        this.equipment = k2;
    }

        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }
}

