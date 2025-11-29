/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Equipment
 */
package gg.squire.autotoa.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.unethicalite.api.items.Equipment;

public final class GameEnum126
extends Enum<d> {
    private final  int req;
    public static final  /* enum */ d VOIDWAKER;
    
    private final  List<Integer> ids;
    private static final  d[] $VALUES;
    
    public static final  /* enum */ d ZARYTE_CROSSBOW;
    public static final  /* enum */ d DRAGON_CLAWS;
    public static final  /* enum */ d TOXIC_BLOWPIPE;
    public static final  /* enum */ d DRAGON_DAGGER;
    public static final  /* enum */ d OSMUMTENS_FANG;
    public static final  /* enum */ d BANDOS_GODSWORD;

    static {
        d.lIIllIlllIIlIl();
        d.lIIllIlllIIlII();
        DRAGON_DAGGER = new GameEnum126(List.of(Integer.valueOf(lIllllllIII[3]), Integer.valueOf(lIllllllIII[4]), Integer.valueOf(lIllllllIII[5]), Integer.valueOf(lIllllllIII[6]), Integer.valueOf(lIllllllIII[7])), lIllllllIII[8]);
        BANDOS_GODSWORD = new GameEnum126(List.of(Integer.valueOf(lIllllllIII[10]), Integer.valueOf(lIllllllIII[11])), lIllllllIII[12]);
        TOXIC_BLOWPIPE = new GameEnum126(List.of(Integer.valueOf(lIllllllIII[14])), lIllllllIII[12]);
        OSMUMTENS_FANG = new GameEnum126(List.of(Integer.valueOf(lIllllllIII[16]), Integer.valueOf(lIllllllIII[17])), lIllllllIII[8]);
        DRAGON_CLAWS = new GameEnum126(List.of(Integer.valueOf(lIllllllIII[19])), lIllllllIII[12]);
        VOIDWAKER = new GameEnum126(List.of(Integer.valueOf(lIllllllIII[21]), Integer.valueOf(lIllllllIII[22])), lIllllllIII[12]);
        ZARYTE_CROSSBOW = new GameEnum126(List.of(Integer.valueOf(lIllllllIII[24]), Integer.valueOf(lIllllllIII[25])), lIllllllIII[26]);
        d[] dArray = new d[lIllllllIII[27]];
        dArray[d.lIllllllIII[1]] = DRAGON_DAGGER;
        dArray[d.lIllllllIII[9]] = BANDOS_GODSWORD;
        dArray[d.lIllllllIII[13]] = TOXIC_BLOWPIPE;
        dArray[d.lIllllllIII[15]] = OSMUMTENS_FANG;
        dArray[d.lIllllllIII[18]] = DRAGON_CLAWS;
        dArray[d.lIllllllIII[20]] = VOIDWAKER;
        dArray[d.lIllllllIII[23]] = ZARYTE_CROSSBOW;
        $VALUES = dArray;
    }

    /*
     * WARNING - void declaration
     */
    public static int b(int ... nArray) {
        void var1;
        d[] dArray = d.values();
        int n2 = dArray.length;
        int var2 = lIllllllIII[1];
        while (d.lIIllIlllIIlll(var2, (int)var1)) {
            int[] var3;
            void var4;
            void var5 = var4[var2];
            int[] var6 = var3;
            int var7 = var6.length;
            int var8 = lIllllllIII[1];
            while (d.lIIllIlllIIlll(var8, var7)) {
                int var9 = var6[var8];
                if (d.lIIllIlllIlIII(var5.p().contains(var9) ? 1 : 0)) {
                    return var5.o();
                }
                ++var8;

                if (((0x1B ^ 0x79) & ~(0xA4 ^ 0xC6)) == 0) continue;
                return 2 & ~2;
            }
            ++var2;

            if (3 > 1) continue;
            return (0x6E ^ 0x2E) & ~(0xF4 ^ 0xB4);
        }
        return lIllllllIII[0];
    }

    public static d[] values() {
        return (d[])$VALUES.clone();
    }

    private static boolean lIIllIlllIlIII(int n2) {
        return n2 != 0;
    }

    private GameEnum126(List<Integer> list, int n3) {
        this.ids = list;
        this.req = n3;
    }

    private static void lIIllIlllIIlII() {
        lIlllllIlll = new String[lIllllllIII[27]];
        d.lIlllllIlll[d.lIllllllIII[1]] = "DRAGON_DAGGER";
        d.lIlllllIlll[d.lIllllllIII[9]] = "BANDOS_GODSWORD";
        d.lIlllllIlll[d.lIllllllIII[13]] = "TOXIC_BLOWPIPE";
        d.lIlllllIlll[d.lIllllllIII[15]] = "OSMUMTENS_FANG";
        d.lIlllllIlll[d.lIllllllIII[18]] = "DRAGON_CLAWS";
        d.lIlllllIlll[d.lIllllllIII[20]] = "VOIDWAKER";
        d.lIlllllIlll[d.lIllllllIII[23]] = "ZARYTE_CROSSBOW";
    }

    public static d valueOf(String string) {
        return Enum.valueOf(GameEnum126.class, string);
    }

    public int o() {
        return this.req / lIllllllIII[2];
    }

    public int q() {
        return this.req;
    }

        return String.valueOf(var10);
    }

    private static boolean lIIllIlllIIllI(Object object) {
        return object == null;
    }

    private static boolean lIIllIlllIIlll(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public static int n() {
        Item item = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON);
        if (d.lIIllIlllIIllI(item)) {
            return lIllllllIII[0];
        }
        d[] var11 = d.values();
        int var12 = var11.length;
        int var13 = lIllllllIII[1];
        while (d.lIIllIlllIIlll(var13, var12)) {
            void var14;
            d var15 = var11[var13];
            if (d.lIIllIlllIlIII(var15.p().contains(var14.getId()) ? 1 : 0)) {
                return var15.o();
            }
            ++var13;

            if (2 > 0) continue;
            return (0xE5 ^ 0xB7) & ~(0x63 ^ 0x31);
        }
        return lIllllllIII[0];
    }

    public List<Integer> p() {
        return this.ids;
    }
}

