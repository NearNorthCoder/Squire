/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.FarmerManager;
import gg.squire.farmer.tasks.GameEnum10;
import gg.squire.farmer.tasks.GameEnum4;
import java.util.ArrayList;
import java.util.List;
import net.unethicalite.api.items.Inventory;

public final class GameEnum2
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

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = 1;
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = 1;
        while (var11 < var10) {
            char var12 = var9[var11];
            var6.append((char)(var12 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if ((0xB2 ^ 0xB7) > 0) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    public au aY() {
        return this.produce;
    }

    /*
     * WARNING - void declaration
     */
    public static boolean H(N n2) {
        void var13;
        P p2 = n2.aL();
        av[] avArray = av.values();
        int n3 = avArray.length;
        int var14 = 1;
        while ((var14 < (int)var13)) {
            void var15;
            void var16;
            void var17 = var16[var14];
            au var18 = var17.aY();
            if (((Object)var18.bh() != (Object)var18.bh()2)) {
                0;
                if (2 > (0xA6 ^ 0xA9 ^ (0x4E ^ 0x45))) {
                    return ((34 + 10 - -143 + 1 ^ 30 + 11 - 40 + 142) & (0x18 ^ 0x42 ^ (0xFD ^ 0x94) ^ -1)) != 0;
                }
            } else {
                int[] nArray = new int[0];
                nArray[1] = var17.aA();
                if ((Inventory.getCount((boolean)0 >= (int[])nArray), var17.bl())) {
                    return 0;
                }
            }
            ++var14;
            0;
            if (-1 < ((0x98 ^ 0xA6) & ~(0x69 ^ 0x57))) continue;
            return ((0xB7 ^ 0xA2) & ~(0x98 ^ 0x8D)) != 0;
        }
        return 1;
    }

        catch (Exception var24) {
            var24.printStackTrace();
            return null;
        }
    }

    private GameEnum2(int n3, int n4, au au2) {
        this.seed = n3;
        this.amount = n4;
        this.produce = au2;
    }

        catch (Exception var30) {
            var30.printStackTrace();
            return null;
        }
    }

    public int aA() {
        return this.seed;
    }

    public static av[] values() {
        return (av[])$VALUES.clone();
    }

    /*
     * WARNING - void declaration
     */
    public static List<Integer> c(P p2) {
        void var31;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        av[] avArray = av.values();
        int n2 = avArray.length;
        int var32 = 1;
        while ((var32 < (int)var31)) {
            P var33;
            void var34;
            void var35 = var34[var32];
            au var36 = var35.aY();
            if (((Object)var36.bh() == (Object)var36.bh()2)var33)) {
                void var37;
                var37.add(var35.aA());
                0;
            }
            ++var32;
            0;
            if (2 > ((0x25 ^ 0x2D) & ~(0x2B ^ 0x23))) continue;
            return null;
        }
        return arrayList;
    }

    private GameEnum2(int n3, au au2) {
        this(n3, 0, au2);
    }

    public static av valueOf(String string) {
        return Enum.valueOf(GameEnum2.class, string);
    }

}

