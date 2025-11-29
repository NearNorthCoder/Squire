/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package gg.squire.cox.tasks;

import com.google.common.collect.Maps;
import java.util.Map;

public final class GameEnum5
extends Enum<z> {
    public static final  /* enum */ z HEAD_ENRAGED_AUTO_RIGHT;
    public static final  /* enum */ z LEFT_HAND_DYING;
    public static final  /* enum */ z HEAD_ENRAGED_MIDDLE_TO_LEFT;
    public static final  /* enum */ z HEAD_DYING;
    public static final  /* enum */ z UNKNOWN;
    public static final  /* enum */ z HEAD_ENRAGED_RIGHT_TO_LEFT;
    public static final  /* enum */ z HEAD_ENRAGED_MIDDLE_TO_RIGHT;
    public static final  /* enum */ z HEAD_ENRAGED_RIGHT;
    public static final  /* enum */ z HEAD_MIDDLE_TO_RIGHT;
    public static final  /* enum */ z HEAD_MIDDLE;
    public static final  /* enum */ z LEFT_HAND_LIGHTNING1;
    public static final  /* enum */ z LEFT_HAND_IDLE2;
    private static final  z[] $VALUES;
    public static final  /* enum */ z HEAD_ENRAGED_RISING_2;
    
    public static final  /* enum */ z HEAD_ENRAGED_MIDDLE;
    public static final  /* enum */ z LEFT_HAND_HEAL2;
    public static final  /* enum */ z HEAD_ENRAGED_AUTO_LEFT;
    private static final  Map<Integer, z> LOOKUP;
    public static final  /* enum */ z HEAD_MIDDLE_TO_LEFT;
    private final  boolean move;
    public static final  /* enum */ z LEFT_HAND_PORTALS2;
    public static final  /* enum */ z LEFT_HAND_HEAL1;
    public static final  /* enum */ z LEFT_HAND_LIGHTNING2;
    private final  int id;
    public static final  /* enum */ z LEFT_HAND_PORTALS1;
    public static final  /* enum */ z LEFT_HAND_CRYSTALS2;
    
    public static final  /* enum */ z HEAD_ENRAGED_LEFT_TO_RIGHT;
    public static final  /* enum */ z HEAD_ENRAGED_RIGHT_TO_MIDDLE;
    public static final  /* enum */ z HEAD_ENRAGED_LEFT_TO_MIDDLE;
    public static final  /* enum */ z HEAD_RISING_2;
    public static final  /* enum */ z HEAD_ENRAGED_LEFT;
    public static final  /* enum */ z HEAD_RISING_1;
    public static final  /* enum */ z HEAD_AUTO_RIGHT;
    public static final  /* enum */ z HEAD_LEFT;
    public static final  /* enum */ z LEFT_HAND_CRIPPLED;
    public static final  /* enum */ z HEAD_AUTO_LEFT;
    public static final  /* enum */ z HEAD_ENRAGED_AUTO_MIDDLE;
    public static final  /* enum */ z LEFT_HAND_CRYSTALS1;
    public static final  /* enum */ z HEAD_RIGHT_TO_MIDDLE;
    public static final  /* enum */ z LEFT_HAND_CRIPPLING;
    public static final  /* enum */ z LEFT_HAND_IDLE1;
    public static final  /* enum */ z HEAD_AUTO_MIDDLE;
    public static final  /* enum */ z LEFT_HAND_UNCRIPPLING1;
    public static final  /* enum */ z HEAD_LEFT_TO_MIDDLE;
    public static final  /* enum */ z HEAD_RIGHT;
    public static final  /* enum */ z HEAD_LEFT_TO_RIGHT;
    public static final  /* enum */ z HEAD_RIGHT_TO_LEFT;
    public static final  /* enum */ z LEFT_HAND_UNCRIPPLING2;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private GameEnum5(int n3, boolean bl2) {
        this.id = n3;
        this.move = bl2;
    }

    public static z[] values() {
        return (z[])$VALUES.clone();
    }

    static {
        z.var9();
        z.var10();
        UNKNOWN = new GameEnum5(1);
        HEAD_RISING_1 = new GameEnum5(3);
        HEAD_RISING_2 = new GameEnum5(5);
        HEAD_MIDDLE = new GameEnum5(7);
        HEAD_RIGHT = new GameEnum5(9);
        HEAD_LEFT = new GameEnum5(var2[11]);
        HEAD_MIDDLE_TO_RIGHT = new GameEnum5(var2[13], 2);
        HEAD_RIGHT_TO_MIDDLE = new GameEnum5(var2[15], 2);
        HEAD_MIDDLE_TO_LEFT = new GameEnum5(var2[17], 2);
        HEAD_LEFT_TO_MIDDLE = new GameEnum5(var2[19], 2);
        HEAD_LEFT_TO_RIGHT = new GameEnum5(var2[21], 2);
        HEAD_RIGHT_TO_LEFT = new GameEnum5(var2[23], 2);
        HEAD_AUTO_MIDDLE = new GameEnum5(var2[25]);
        HEAD_AUTO_RIGHT = new GameEnum5(var2[27]);
        HEAD_AUTO_LEFT = new GameEnum5(var2[29]);
        HEAD_DYING = new GameEnum5(var2[31]);
        LEFT_HAND_IDLE1 = new GameEnum5(var2[33]);
        LEFT_HAND_CRYSTALS1 = new GameEnum5(var2[35]);
        LEFT_HAND_HEAL1 = new GameEnum5(var2[37]);
        LEFT_HAND_LIGHTNING1 = new GameEnum5(var2[39]);
        LEFT_HAND_PORTALS1 = new GameEnum5(var2[41]);
        LEFT_HAND_CRIPPLING = new GameEnum5(var2[43]);
        LEFT_HAND_CRIPPLED = new GameEnum5(var2[45]);
        LEFT_HAND_UNCRIPPLING1 = new GameEnum5(var2[47]);
        LEFT_HAND_UNCRIPPLING2 = new GameEnum5(var2[49]);
        LEFT_HAND_IDLE2 = new GameEnum5(var2[51]);
        LEFT_HAND_CRYSTALS2 = new GameEnum5(var2[53]);
        LEFT_HAND_HEAL2 = new GameEnum5(var2[55]);
        LEFT_HAND_LIGHTNING2 = new GameEnum5(var2[57]);
        LEFT_HAND_PORTALS2 = new GameEnum5(var2[59]);
        LEFT_HAND_DYING = new GameEnum5(var2[61]);
        HEAD_ENRAGED_AUTO_MIDDLE = new GameEnum5(var2[63]);
        HEAD_ENRAGED_AUTO_LEFT = new GameEnum5(var2[65]);
        HEAD_ENRAGED_AUTO_RIGHT = new GameEnum5(var2[67]);
        HEAD_ENRAGED_MIDDLE = new GameEnum5(var2[69]);
        HEAD_ENRAGED_LEFT = new GameEnum5(var2[71]);
        HEAD_ENRAGED_RIGHT = new GameEnum5(var2[73]);
        HEAD_ENRAGED_MIDDLE_TO_LEFT = new GameEnum5(var2[75], 2);
        HEAD_ENRAGED_LEFT_TO_MIDDLE = new GameEnum5(var2[77], 2);
        HEAD_ENRAGED_LEFT_TO_RIGHT = new GameEnum5(var2[79], 2);
        HEAD_ENRAGED_RIGHT_TO_LEFT = new GameEnum5(var2[81], 2);
        HEAD_ENRAGED_MIDDLE_TO_RIGHT = new GameEnum5(var2[83], 2);
        HEAD_ENRAGED_RIGHT_TO_MIDDLE = new GameEnum5(var2[85], 2);
        HEAD_ENRAGED_RISING_2 = new GameEnum5(var2[87]);
        z[] zArray = new z[var2[88]];
        zArray[0] = UNKNOWN;
        zArray[2] = HEAD_RISING_1;
        zArray[4] = HEAD_RISING_2;
        zArray[6] = HEAD_MIDDLE;
        zArray[8] = HEAD_RIGHT;
        zArray[z.var2[10]] = HEAD_LEFT;
        zArray[z.var2[12]] = HEAD_MIDDLE_TO_RIGHT;
        zArray[z.var2[14]] = HEAD_RIGHT_TO_MIDDLE;
        zArray[z.var2[16]] = HEAD_MIDDLE_TO_LEFT;
        zArray[z.var2[18]] = HEAD_LEFT_TO_MIDDLE;
        zArray[z.var2[20]] = HEAD_LEFT_TO_RIGHT;
        zArray[z.var2[22]] = HEAD_RIGHT_TO_LEFT;
        zArray[z.var2[24]] = HEAD_AUTO_MIDDLE;
        zArray[z.var2[26]] = HEAD_AUTO_RIGHT;
        zArray[z.var2[28]] = HEAD_AUTO_LEFT;
        zArray[z.var2[30]] = HEAD_DYING;
        zArray[z.var2[32]] = LEFT_HAND_IDLE1;
        zArray[z.var2[34]] = LEFT_HAND_CRYSTALS1;
        zArray[z.var2[36]] = LEFT_HAND_HEAL1;
        zArray[z.var2[38]] = LEFT_HAND_LIGHTNING1;
        zArray[z.var2[40]] = LEFT_HAND_PORTALS1;
        zArray[z.var2[42]] = LEFT_HAND_CRIPPLING;
        zArray[z.var2[44]] = LEFT_HAND_CRIPPLED;
        zArray[z.var2[46]] = LEFT_HAND_UNCRIPPLING1;
        zArray[z.var2[48]] = LEFT_HAND_UNCRIPPLING2;
        zArray[z.var2[50]] = LEFT_HAND_IDLE2;
        zArray[z.var2[52]] = LEFT_HAND_CRYSTALS2;
        zArray[z.var2[54]] = LEFT_HAND_HEAL2;
        zArray[z.var2[56]] = LEFT_HAND_LIGHTNING2;
        zArray[z.var2[58]] = LEFT_HAND_PORTALS2;
        zArray[z.var2[60]] = LEFT_HAND_DYING;
        zArray[z.var2[62]] = HEAD_ENRAGED_AUTO_MIDDLE;
        zArray[z.var2[64]] = HEAD_ENRAGED_AUTO_LEFT;
        zArray[z.var2[66]] = HEAD_ENRAGED_AUTO_RIGHT;
        zArray[z.var2[68]] = HEAD_ENRAGED_MIDDLE;
        zArray[z.var2[70]] = HEAD_ENRAGED_LEFT;
        zArray[z.var2[72]] = HEAD_ENRAGED_RIGHT;
        zArray[z.var2[74]] = HEAD_ENRAGED_MIDDLE_TO_LEFT;
        zArray[z.var2[76]] = HEAD_ENRAGED_LEFT_TO_MIDDLE;
        zArray[z.var2[78]] = HEAD_ENRAGED_LEFT_TO_RIGHT;
        zArray[z.var2[80]] = HEAD_ENRAGED_RIGHT_TO_LEFT;
        zArray[z.var2[82]] = HEAD_ENRAGED_MIDDLE_TO_RIGHT;
        zArray[z.var2[84]] = HEAD_ENRAGED_RIGHT_TO_MIDDLE;
        zArray[z.var2[86]] = HEAD_ENRAGED_RISING_2;
        $VALUES = zArray;
        LOOKUP = Maps.uniqueIndex(Arrays.asList(z.values()), z::bw);
    }

    private static String var11(String var12, String var13) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var15 = var13.toCharArray();
        int var16 = 0;
        char[] var17 = var12.toCharArray();
        int var18 = var17.length;
        int var19 = 0;
        while (var19 < var18) {
            char var20 = var17[var19];
            var14.append((char)(var20 ^ var15[var16 % var15.length]));
            0;
            ++var16;
            ++var19;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var14);
    }

        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }

    public static z r(int n2) {
        z z2 = LOOKUP.get(n2);
        if ((Object == nullz2)) {
            return UNKNOWN;
        }
        return z2;
    }

    public static z valueOf(String string) {
        return Enum.valueOf(GameEnum5.class, string);
    }

    private GameEnum5(int n3) {
        this.id = n3;
        this.move = 0;
    }

    public int bw() {
        return this.id;
    }

    public boolean bx() {
        return this.move;
    }
}

