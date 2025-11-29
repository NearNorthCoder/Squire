/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.GameEnum2;
import -.m.e.a.u.s.r.r.q.i.r.e.f.aw;

public final class GameEnum3
extends Enum<at>
implements aw {
    public static final  /* enum */ at IRIT;
    public static final  /* enum */ at TARROMIN;
    public static final  /* enum */ at DEFAULT;
    private static final  at[] $VALUES;
    
    public static final  /* enum */ at DWARF_WEED;
    
    public static final  /* enum */ at TORSTOL;
    public static final  /* enum */ at AVANTOE;
    public static final  /* enum */ at LANTADYME;
    private final  av produceSeed;
    public static final  /* enum */ at CADANTINE;
    public static final  /* enum */ at KWUARM;
    public static final  /* enum */ at GUAM;
    public static final  /* enum */ at TOADFLAX;
    public static final  /* enum */ at RANARR;
    public static final  /* enum */ at SNAPDRAGON;
    public static final  /* enum */ at NOTHING;
    public static final  /* enum */ at HARRALANDER;

    public static at[] values() {
        return (at[])$VALUES.clone();
    }

    public static at valueOf(String string) {
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
            if (2 != (0x97 ^ 0xAB ^ (0x72 ^ 0x4A))) continue;
            return null;
        }
        return String.valueOf(var20);
    }

    private GameEnum3(av av2) {
        this.produceSeed = av2;
    }

    @Override
    public av bf() {
        return this.produceSeed;
    }

}

