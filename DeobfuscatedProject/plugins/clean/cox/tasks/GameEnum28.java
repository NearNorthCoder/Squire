/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package gg.squire.cox.tasks;

import com.google.common.collect.Maps;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum28
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

    private GameEnum28(int n3, boolean bl2) {
        this.id = n3;
        this.move = bl2;
    }

    private static boolean llIlIIlIllIIlI(Object object) {
        return object == null;
    }

    public static z[] values() {
        return (z[])$VALUES.clone();
    }

    static {
        z.llIlIIlIllIIIl();
        z.llIlIIlIllIIII();
        UNKNOWN = new GameEnum28(lIIlllllIlll[1]);
        HEAD_RISING_1 = new GameEnum28(lIIlllllIlll[3]);
        HEAD_RISING_2 = new GameEnum28(lIIlllllIlll[5]);
        HEAD_MIDDLE = new GameEnum28(lIIlllllIlll[7]);
        HEAD_RIGHT = new GameEnum28(lIIlllllIlll[9]);
        HEAD_LEFT = new GameEnum28(lIIlllllIlll[11]);
        HEAD_MIDDLE_TO_RIGHT = new GameEnum28(lIIlllllIlll[13], lIIlllllIlll[2]);
        HEAD_RIGHT_TO_MIDDLE = new GameEnum28(lIIlllllIlll[15], lIIlllllIlll[2]);
        HEAD_MIDDLE_TO_LEFT = new GameEnum28(lIIlllllIlll[17], lIIlllllIlll[2]);
        HEAD_LEFT_TO_MIDDLE = new GameEnum28(lIIlllllIlll[19], lIIlllllIlll[2]);
        HEAD_LEFT_TO_RIGHT = new GameEnum28(lIIlllllIlll[21], lIIlllllIlll[2]);
        HEAD_RIGHT_TO_LEFT = new GameEnum28(lIIlllllIlll[23], lIIlllllIlll[2]);
        HEAD_AUTO_MIDDLE = new GameEnum28(lIIlllllIlll[25]);
        HEAD_AUTO_RIGHT = new GameEnum28(lIIlllllIlll[27]);
        HEAD_AUTO_LEFT = new GameEnum28(lIIlllllIlll[29]);
        HEAD_DYING = new GameEnum28(lIIlllllIlll[31]);
        LEFT_HAND_IDLE1 = new GameEnum28(lIIlllllIlll[33]);
        LEFT_HAND_CRYSTALS1 = new GameEnum28(lIIlllllIlll[35]);
        LEFT_HAND_HEAL1 = new GameEnum28(lIIlllllIlll[37]);
        LEFT_HAND_LIGHTNING1 = new GameEnum28(lIIlllllIlll[39]);
        LEFT_HAND_PORTALS1 = new GameEnum28(lIIlllllIlll[41]);
        LEFT_HAND_CRIPPLING = new GameEnum28(lIIlllllIlll[43]);
        LEFT_HAND_CRIPPLED = new GameEnum28(lIIlllllIlll[45]);
        LEFT_HAND_UNCRIPPLING1 = new GameEnum28(lIIlllllIlll[47]);
        LEFT_HAND_UNCRIPPLING2 = new GameEnum28(lIIlllllIlll[49]);
        LEFT_HAND_IDLE2 = new GameEnum28(lIIlllllIlll[51]);
        LEFT_HAND_CRYSTALS2 = new GameEnum28(lIIlllllIlll[53]);
        LEFT_HAND_HEAL2 = new GameEnum28(lIIlllllIlll[55]);
        LEFT_HAND_LIGHTNING2 = new GameEnum28(lIIlllllIlll[57]);
        LEFT_HAND_PORTALS2 = new GameEnum28(lIIlllllIlll[59]);
        LEFT_HAND_DYING = new GameEnum28(lIIlllllIlll[61]);
        HEAD_ENRAGED_AUTO_MIDDLE = new GameEnum28(lIIlllllIlll[63]);
        HEAD_ENRAGED_AUTO_LEFT = new GameEnum28(lIIlllllIlll[65]);
        HEAD_ENRAGED_AUTO_RIGHT = new GameEnum28(lIIlllllIlll[67]);
        HEAD_ENRAGED_MIDDLE = new GameEnum28(lIIlllllIlll[69]);
        HEAD_ENRAGED_LEFT = new GameEnum28(lIIlllllIlll[71]);
        HEAD_ENRAGED_RIGHT = new GameEnum28(lIIlllllIlll[73]);
        HEAD_ENRAGED_MIDDLE_TO_LEFT = new GameEnum28(lIIlllllIlll[75], lIIlllllIlll[2]);
        HEAD_ENRAGED_LEFT_TO_MIDDLE = new GameEnum28(lIIlllllIlll[77], lIIlllllIlll[2]);
        HEAD_ENRAGED_LEFT_TO_RIGHT = new GameEnum28(lIIlllllIlll[79], lIIlllllIlll[2]);
        HEAD_ENRAGED_RIGHT_TO_LEFT = new GameEnum28(lIIlllllIlll[81], lIIlllllIlll[2]);
        HEAD_ENRAGED_MIDDLE_TO_RIGHT = new GameEnum28(lIIlllllIlll[83], lIIlllllIlll[2]);
        HEAD_ENRAGED_RIGHT_TO_MIDDLE = new GameEnum28(lIIlllllIlll[85], lIIlllllIlll[2]);
        HEAD_ENRAGED_RISING_2 = new GameEnum28(lIIlllllIlll[87]);
        z[] zArray = new z[lIIlllllIlll[88]];
        zArray[z.lIIlllllIlll[0]] = UNKNOWN;
        zArray[z.lIIlllllIlll[2]] = HEAD_RISING_1;
        zArray[z.lIIlllllIlll[4]] = HEAD_RISING_2;
        zArray[z.lIIlllllIlll[6]] = HEAD_MIDDLE;
        zArray[z.lIIlllllIlll[8]] = HEAD_RIGHT;
        zArray[z.lIIlllllIlll[10]] = HEAD_LEFT;
        zArray[z.lIIlllllIlll[12]] = HEAD_MIDDLE_TO_RIGHT;
        zArray[z.lIIlllllIlll[14]] = HEAD_RIGHT_TO_MIDDLE;
        zArray[z.lIIlllllIlll[16]] = HEAD_MIDDLE_TO_LEFT;
        zArray[z.lIIlllllIlll[18]] = HEAD_LEFT_TO_MIDDLE;
        zArray[z.lIIlllllIlll[20]] = HEAD_LEFT_TO_RIGHT;
        zArray[z.lIIlllllIlll[22]] = HEAD_RIGHT_TO_LEFT;
        zArray[z.lIIlllllIlll[24]] = HEAD_AUTO_MIDDLE;
        zArray[z.lIIlllllIlll[26]] = HEAD_AUTO_RIGHT;
        zArray[z.lIIlllllIlll[28]] = HEAD_AUTO_LEFT;
        zArray[z.lIIlllllIlll[30]] = HEAD_DYING;
        zArray[z.lIIlllllIlll[32]] = LEFT_HAND_IDLE1;
        zArray[z.lIIlllllIlll[34]] = LEFT_HAND_CRYSTALS1;
        zArray[z.lIIlllllIlll[36]] = LEFT_HAND_HEAL1;
        zArray[z.lIIlllllIlll[38]] = LEFT_HAND_LIGHTNING1;
        zArray[z.lIIlllllIlll[40]] = LEFT_HAND_PORTALS1;
        zArray[z.lIIlllllIlll[42]] = LEFT_HAND_CRIPPLING;
        zArray[z.lIIlllllIlll[44]] = LEFT_HAND_CRIPPLED;
        zArray[z.lIIlllllIlll[46]] = LEFT_HAND_UNCRIPPLING1;
        zArray[z.lIIlllllIlll[48]] = LEFT_HAND_UNCRIPPLING2;
        zArray[z.lIIlllllIlll[50]] = LEFT_HAND_IDLE2;
        zArray[z.lIIlllllIlll[52]] = LEFT_HAND_CRYSTALS2;
        zArray[z.lIIlllllIlll[54]] = LEFT_HAND_HEAL2;
        zArray[z.lIIlllllIlll[56]] = LEFT_HAND_LIGHTNING2;
        zArray[z.lIIlllllIlll[58]] = LEFT_HAND_PORTALS2;
        zArray[z.lIIlllllIlll[60]] = LEFT_HAND_DYING;
        zArray[z.lIIlllllIlll[62]] = HEAD_ENRAGED_AUTO_MIDDLE;
        zArray[z.lIIlllllIlll[64]] = HEAD_ENRAGED_AUTO_LEFT;
        zArray[z.lIIlllllIlll[66]] = HEAD_ENRAGED_AUTO_RIGHT;
        zArray[z.lIIlllllIlll[68]] = HEAD_ENRAGED_MIDDLE;
        zArray[z.lIIlllllIlll[70]] = HEAD_ENRAGED_LEFT;
        zArray[z.lIIlllllIlll[72]] = HEAD_ENRAGED_RIGHT;
        zArray[z.lIIlllllIlll[74]] = HEAD_ENRAGED_MIDDLE_TO_LEFT;
        zArray[z.lIIlllllIlll[76]] = HEAD_ENRAGED_LEFT_TO_MIDDLE;
        zArray[z.lIIlllllIlll[78]] = HEAD_ENRAGED_LEFT_TO_RIGHT;
        zArray[z.lIIlllllIlll[80]] = HEAD_ENRAGED_RIGHT_TO_LEFT;
        zArray[z.lIIlllllIlll[82]] = HEAD_ENRAGED_MIDDLE_TO_RIGHT;
        zArray[z.lIIlllllIlll[84]] = HEAD_ENRAGED_RIGHT_TO_MIDDLE;
        zArray[z.lIIlllllIlll[86]] = HEAD_ENRAGED_RISING_2;
        $VALUES = zArray;
        LOOKUP = Maps.uniqueIndex(Arrays.asList(z.values()), z::bw);
    }

        return String.valueOf(var1);
    }

    private static void llIlIIlIllIIII() {
        lIIlllllIIlI = new String[lIIlllllIlll[88]];
        z.lIIlllllIIlI[z.lIIlllllIlll[0]] = "UNKNOWN";
        z.lIIlllllIIlI[z.lIIlllllIlll[2]] = "HEAD_RISING_1";
        z.lIIlllllIIlI[z.lIIlllllIlll[4]] = "HEAD_RISING_2";
        z.lIIlllllIIlI[z.lIIlllllIlll[6]] = "HEAD_MIDDLE";
        z.lIIlllllIIlI[z.lIIlllllIlll[8]] = "HEAD_RIGHT";
        z.lIIlllllIIlI[z.lIIlllllIlll[10]] = "HEAD_LEFT";
        z.lIIlllllIIlI[z.lIIlllllIlll[12]] = "HEAD_MIDDLE_TO_RIGHT";
        z.lIIlllllIIlI[z.lIIlllllIlll[14]] = "HEAD_RIGHT_TO_MIDDLE";
        z.lIIlllllIIlI[z.lIIlllllIlll[16]] = "HEAD_MIDDLE_TO_LEFT";
        z.lIIlllllIIlI[z.lIIlllllIlll[18]] = "HEAD_LEFT_TO_MIDDLE";
        z.lIIlllllIIlI[z.lIIlllllIlll[20]] = "HEAD_LEFT_TO_RIGHT";
        z.lIIlllllIIlI[z.lIIlllllIlll[22]] = "HEAD_RIGHT_TO_LEFT";
        z.lIIlllllIIlI[z.lIIlllllIlll[24]] = "HEAD_AUTO_MIDDLE";
        z.lIIlllllIIlI[z.lIIlllllIlll[26]] = "HEAD_AUTO_RIGHT";
        z.lIIlllllIIlI[z.lIIlllllIlll[28]] = "HEAD_AUTO_LEFT";
        z.lIIlllllIIlI[z.lIIlllllIlll[30]] = "HEAD_DYING";
        z.lIIlllllIIlI[z.lIIlllllIlll[32]] = "LEFT_HAND_IDLE1";
        z.lIIlllllIIlI[z.lIIlllllIlll[34]] = "LEFT_HAND_CRYSTALS1";
        z.lIIlllllIIlI[z.lIIlllllIlll[36]] = "LEFT_HAND_HEAL1";
        z.lIIlllllIIlI[z.lIIlllllIlll[38]] = "LEFT_HAND_LIGHTNING1";
        z.lIIlllllIIlI[z.lIIlllllIlll[40]] = "LEFT_HAND_PORTALS1";
        z.lIIlllllIIlI[z.lIIlllllIlll[42]] = "LEFT_HAND_CRIPPLING";
        z.lIIlllllIIlI[z.lIIlllllIlll[44]] = "LEFT_HAND_CRIPPLED";
        z.lIIlllllIIlI[z.lIIlllllIlll[46]] = "LEFT_HAND_UNCRIPPLING1";
        z.lIIlllllIIlI[z.lIIlllllIlll[48]] = "LEFT_HAND_UNCRIPPLING2";
        z.lIIlllllIIlI[z.lIIlllllIlll[50]] = "LEFT_HAND_IDLE2";
        z.lIIlllllIIlI[z.lIIlllllIlll[52]] = "LEFT_HAND_CRYSTALS2";
        z.lIIlllllIIlI[z.lIIlllllIlll[54]] = "LEFT_HAND_HEAL2";
        z.lIIlllllIIlI[z.lIIlllllIlll[56]] = "LEFT_HAND_LIGHTNING2";
        z.lIIlllllIIlI[z.lIIlllllIlll[58]] = "LEFT_HAND_PORTALS2";
        z.lIIlllllIIlI[z.lIIlllllIlll[60]] = "LEFT_HAND_DYING";
        z.lIIlllllIIlI[z.lIIlllllIlll[62]] = "HEAD_ENRAGED_AUTO_MIDDLE";
        z.lIIlllllIIlI[z.lIIlllllIlll[64]] = "HEAD_ENRAGED_AUTO_LEFT";
        z.lIIlllllIIlI[z.lIIlllllIlll[66]] = "HEAD_ENRAGED_AUTO_RIGHT";
        z.lIIlllllIIlI[z.lIIlllllIlll[68]] = "HEAD_ENRAGED_MIDDLE";
        z.lIIlllllIIlI[z.lIIlllllIlll[70]] = "HEAD_ENRAGED_LEFT";
        z.lIIlllllIIlI[z.lIIlllllIlll[72]] = "HEAD_ENRAGED_RIGHT";
        z.lIIlllllIIlI[z.lIIlllllIlll[74]] = "HEAD_ENRAGED_MIDDLE_TO_LEFT";
        z.lIIlllllIIlI[z.lIIlllllIlll[76]] = "HEAD_ENRAGED_LEFT_TO_MIDDLE";
        z.lIIlllllIIlI[z.lIIlllllIlll[78]] = "HEAD_ENRAGED_LEFT_TO_RIGHT";
        z.lIIlllllIIlI[z.lIIlllllIlll[80]] = "HEAD_ENRAGED_RIGHT_TO_LEFT";
        z.lIIlllllIIlI[z.lIIlllllIlll[82]] = "HEAD_ENRAGED_MIDDLE_TO_RIGHT";
        z.lIIlllllIIlI[z.lIIlllllIlll[84]] = "HEAD_ENRAGED_RIGHT_TO_MIDDLE";
        z.lIIlllllIIlI[z.lIIlllllIlll[86]] = "HEAD_ENRAGED_RISING_2";
    }

    public static z r(int n2) {
        z z2 = LOOKUP.get(n2);
        if (z.llIlIIlIllIIlI((Object)z2)) {
            return UNKNOWN;
        }
        return z2;
    }

    public static z valueOf(String string) {
        return Enum.valueOf(GameEnum28.class, string);
    }

    private static boolean llIlIIlIllIIll(int n2, int n3) {
        return n2 < n3;
    }

    private GameEnum28(int n3) {
        this.id = n3;
        this.move = lIIlllllIlll[0];
    }

    public int bw() {
        return this.id;
    }

    public boolean bx() {
        return this.move;
    }
}

