/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.FarmerManager;
import gg.squire.farmer.tasks.GameEnum19;
import gg.squire.farmer.tasks.GameEnum4;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.unethicalite.api.items.Inventory;

public final class GameEnum1
extends Enum<av> {
    public static final  /* enum */ av CADANTINE;
    public static final  /* enum */ av IRIT;
    public static final  /* enum */ av WHITE_BERRY;
    private static final  av[] $VALUES;
    public static final  /* enum */ av LANTADYME;
    private final  int amount;
    public static final  /* enum */ av SNAPE_GRASS;
    public static final  /* enum */ av RANNAR_WEED;
    private final  au produce;
    public static final  /* enum */ av GUAM;
    public static final  /* enum */ av HARRALANDER;
    public static final  /* enum */ av SEAWEED;
    public static final  /* enum */ av STRAWEBERRIES;
    public static final  /* enum */ av AVANTOE;
    public static final  /* enum */ av GRAPES;
    public static final  /* enum */ av SNAPDRAGON;
    public static final  /* enum */ av TARROMIN;
    public static final  /* enum */ av TOADFLAX;
    public static final  /* enum */ av JANGERBERRIES;
    
    public static final  /* enum */ av DWARF_WEED;
    public static final  /* enum */ av KWUARM;
    public static final  /* enum */ av ONIONS;
    public static final  /* enum */ av NASTURTIUM;
    public static final  /* enum */ av MARIGOLD;
    public static final  /* enum */ av TORSTOL;
    public static final  /* enum */ av LIMPWURT;
    public static final  /* enum */ av DEFAULT;
    private final  int seed;
    public static final  /* enum */ av SWEETCORN;
    public static final  /* enum */ av WATERMELON;
    public static final  /* enum */ av POISON_IVY;

    public int bl() {
        return this.amount;
    }

        return String.valueOf(var1);
    }

    public au aY() {
        return this.produce;
    }

    /*
     * WARNING - void declaration
     */
    public static boolean H(N n2) {
        void var2;
        P p2 = n2.aL();
        av[] avArray = av.values();
        int n3 = avArray.length;
        int var3 = llIIIlIlIlll[1];
        while (av.llllIlIlIlIIlI(var3, (int)var2)) {
            void var4;
            void var5;
            void var6 = var5[var3];
            au var7 = var6.aY();
            if (av.llllIlIlIlIlII((Object)var7.bh(), var4)) {

                if (2 > (0xA6 ^ 0xA9 ^ (0x4E ^ 0x45))) {
                    return ((34 + 10 - -143 + 1 ^ 30 + 11 - 40 + 142) & (0x18 ^ 0x42 ^ (0xFD ^ 0x94) ^ -1)) != 0;
                }
            } else {
                int[] nArray = new int[llIIIlIlIlll[0]];
                nArray[av.llIIIlIlIlll[1]] = var6.aA();
                if (av.llllIlIlIlIlIl(Inventory.getCount((boolean)llIIIlIlIlll[0], (int[])nArray), var6.bl())) {
                    return llIIIlIlIlll[0];
                }
            }
            ++var3;

            if (-1 < ((0x98 ^ 0xA6) & ~(0x69 ^ 0x57))) continue;
            return false;
        }
        return llIIIlIlIlll[1];
    }

    private GameEnum1(int n3, int n4, au au2) {
        this.seed = n3;
        this.amount = n4;
        this.produce = au2;
    }

    private static void llllIlIlIIlIll() {
        llIIIlIlIlIl = new String[llIIIlIlIlll[54]];
        av.llIIIlIlIlIl[av.llIIIlIlIlll[1]] = "GUAM";
        av.llIIIlIlIlIl[av.llIIIlIlIlll[0]] = "TARROMIN";
        av.llIIIlIlIlIl[av.llIIIlIlIlll[4]] = "HARRALANDER";
        av.llIIIlIlIlIl[av.llIIIlIlIlll[6]] = "RANNAR_WEED";
        av.llIIIlIlIlIl[av.llIIIlIlIlll[8]] = "SNAPDRAGON";
        av.llIIIlIlIlIl[av.llIIIlIlIlll[10]] = "TOADFLAX";
        av.llIIIlIlIlIl[av.llIIIlIlIlll[12]] = "IRIT";
        av.llIIIlIlIlIl[av.llIIIlIlIlll[14]] = "CADANTINE";
        av.llIIIlIlIlIl[av.llIIIlIlIlll[16]] = "LANTADYME";
        av.llIIIlIlIlIl[av.llIIIlIlIlll[18]] = "DWARF_WEED";
        av.llIIIlIlIlIl[av.llIIIlIlIlll[20]] = "TORSTOL";
        av.llIIIlIlIlIl[av.llIIIlIlIlll[22]] = "AVANTOE";
        av.llIIIlIlIlIl[av.llIIIlIlIlll[24]] = "KWUARM";
        av.llIIIlIlIlIl[av.llIIIlIlIlll[26]] = "SNAPE_GRASS";
        av.llIIIlIlIlIl[av.llIIIlIlIlll[28]] = "WATERMELON";
        av.llIIIlIlIlIl[av.llIIIlIlIlll[30]] = "ONIONS";
        av.llIIIlIlIlIl[av.llIIIlIlIlll[32]] = "SWEETCORN";
        av.llIIIlIlIlIl[av.llIIIlIlIlll[34]] = "STRAWEBERRIES";
        av.llIIIlIlIlIl[av.llIIIlIlIlll[36]] = "LIMPWURT";
        av.llIIIlIlIlIl[av.llIIIlIlIlll[38]] = "MARIGOLD";
        av.llIIIlIlIlIl[av.llIIIlIlIlll[40]] = "NASTURTIUM";
        av.llIIIlIlIlIl[av.llIIIlIlIlll[42]] = "WHITE_BERRY";
        av.llIIIlIlIlIl[av.llIIIlIlIlll[44]] = "POISON_IVY";
        av.llIIIlIlIlIl[av.llIIIlIlIlll[46]] = "JANGERBERRIES";
        av.llIIIlIlIlIl[av.llIIIlIlIlll[48]] = "SEAWEED";
        av.llIIIlIlIlIl[av.llIIIlIlIlll[50]] = "GRAPES";
        av.llIIIlIlIlIl[av.llIIIlIlIlll[52]] = "DEFAULT";
    }

    private static boolean llllIlIlIlIIll(Object object, Object object2) {
        return object == object2;
    }

    public int aA() {
        return this.seed;
    }

    private static boolean llllIlIlIlIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llllIlIlIlIlIl(int n2, int n3) {
        return n2 >= n3;
    }

    public static av[] values() {
        return (av[])$VALUES.clone();
    }

    /*
     * WARNING - void declaration
     */
    public static List<Integer> c(P p2) {
        void var8;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        av[] avArray = av.values();
        int n2 = avArray.length;
        int var9 = llIIIlIlIlll[1];
        while (av.llllIlIlIlIIlI(var9, (int)var8)) {
            P var10;
            void var11;
            void var12 = var11[var9];
            au var13 = var12.aY();
            if (av.llllIlIlIlIIll((Object)var13.bh(), (Object)var10)) {
                void var14;
                var14.add(var12.aA());

            }
            ++var9;

            if (2 > ((0x25 ^ 0x2D) & ~(0x2B ^ 0x23))) continue;
            return null;
        }
        return arrayList;
    }

    private static boolean llllIlIlIlIlII(Object object, Object object2) {
        return object != object2;
    }

    private GameEnum1(int n3, au au2) {
        this(n3, llIIIlIlIlll[0], au2);
    }

    public static av valueOf(String string) {
        return Enum.valueOf(GameEnum1.class, string);
    }

    static {
        av.llllIlIlIlIIIl();
        av.llllIlIlIIlIll();
        GUAM = new GameEnum1(llIIIlIlIlll[2], au.GUAM);
        TARROMIN = new GameEnum1(llIIIlIlIlll[3], au.TARROMIN);
        HARRALANDER = new GameEnum1(llIIIlIlIlll[5], au.HARRALANDER);
        RANNAR_WEED = new GameEnum1(llIIIlIlIlll[7], au.RANARR);
        SNAPDRAGON = new GameEnum1(llIIIlIlIlll[9], au.SNAPDRAGON);
        TOADFLAX = new GameEnum1(llIIIlIlIlll[11], au.TOADFLAX);
        IRIT = new GameEnum1(llIIIlIlIlll[13], au.IRIT);
        CADANTINE = new GameEnum1(llIIIlIlIlll[15], au.CADANTINE);
        LANTADYME = new GameEnum1(llIIIlIlIlll[17], au.LANTADYME);
        DWARF_WEED = new GameEnum1(llIIIlIlIlll[19], au.DWARF_WEED);
        TORSTOL = new GameEnum1(llIIIlIlIlll[21], au.TORSTOL);
        AVANTOE = new GameEnum1(llIIIlIlIlll[23], au.AVANTOE);
        KWUARM = new GameEnum1(llIIIlIlIlll[25], au.KWUARM);
        SNAPE_GRASS = new GameEnum1(llIIIlIlIlll[27], llIIIlIlIlll[6], au.SNAPE_GRASS);
        WATERMELON = new GameEnum1(llIIIlIlIlll[29], llIIIlIlIlll[6], au.WATERMELON);
        ONIONS = new GameEnum1(llIIIlIlIlll[31], llIIIlIlIlll[6], au.ONION);
        SWEETCORN = new GameEnum1(llIIIlIlIlll[33], llIIIlIlIlll[6], au.SWEETCORN);
        STRAWEBERRIES = new GameEnum1(llIIIlIlIlll[35], llIIIlIlIlll[6], au.STRAWBERRY);
        LIMPWURT = new GameEnum1(llIIIlIlIlll[37], au.LIMPWURT);
        MARIGOLD = new GameEnum1(llIIIlIlIlll[39], au.MARIGOLD);
        NASTURTIUM = new GameEnum1(llIIIlIlIlll[41], au.NASTURTIUM);
        WHITE_BERRY = new GameEnum1(llIIIlIlIlll[43], au.WHITEBERRIES);
        POISON_IVY = new GameEnum1(llIIIlIlIlll[45], au.POISON_IVY);
        JANGERBERRIES = new GameEnum1(llIIIlIlIlll[47], au.JANGERBERRIES);
        SEAWEED = new GameEnum1(llIIIlIlIlll[49], au.SEAWEED);
        GRAPES = new GameEnum1(llIIIlIlIlll[51], au.GRAPE);
        DEFAULT = new GameEnum1(llIIIlIlIlll[53], null);
        av[] avArray = new av[llIIIlIlIlll[54]];
        avArray[av.llIIIlIlIlll[1]] = GUAM;
        avArray[av.llIIIlIlIlll[0]] = TARROMIN;
        avArray[av.llIIIlIlIlll[4]] = HARRALANDER;
        avArray[av.llIIIlIlIlll[6]] = RANNAR_WEED;
        avArray[av.llIIIlIlIlll[8]] = SNAPDRAGON;
        avArray[av.llIIIlIlIlll[10]] = TOADFLAX;
        avArray[av.llIIIlIlIlll[12]] = IRIT;
        avArray[av.llIIIlIlIlll[14]] = CADANTINE;
        avArray[av.llIIIlIlIlll[16]] = LANTADYME;
        avArray[av.llIIIlIlIlll[18]] = DWARF_WEED;
        avArray[av.llIIIlIlIlll[20]] = TORSTOL;
        avArray[av.llIIIlIlIlll[22]] = AVANTOE;
        avArray[av.llIIIlIlIlll[24]] = KWUARM;
        avArray[av.llIIIlIlIlll[26]] = SNAPE_GRASS;
        avArray[av.llIIIlIlIlll[28]] = WATERMELON;
        avArray[av.llIIIlIlIlll[30]] = ONIONS;
        avArray[av.llIIIlIlIlll[32]] = SWEETCORN;
        avArray[av.llIIIlIlIlll[34]] = STRAWEBERRIES;
        avArray[av.llIIIlIlIlll[36]] = LIMPWURT;
        avArray[av.llIIIlIlIlll[38]] = MARIGOLD;
        avArray[av.llIIIlIlIlll[40]] = NASTURTIUM;
        avArray[av.llIIIlIlIlll[42]] = WHITE_BERRY;
        avArray[av.llIIIlIlIlll[44]] = POISON_IVY;
        avArray[av.llIIIlIlIlll[46]] = JANGERBERRIES;
        avArray[av.llIIIlIlIlll[48]] = SEAWEED;
        avArray[av.llIIIlIlIlll[50]] = GRAPES;
        avArray[av.llIIIlIlIlll[52]] = DEFAULT;
        $VALUES = avArray;
    }
}

