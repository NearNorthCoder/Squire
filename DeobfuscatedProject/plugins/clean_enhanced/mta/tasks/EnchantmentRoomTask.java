/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.commons.Rand
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 */
package gg.squire.mta.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mta.SquireMTA;
import java.util.List;
import java.util.stream.Stream;
import gg.squire.mta.tasks.GameEnum4;
import gg.squire.mta.tasks.MtaManager;
import gg.squire.mta.tasks.GHelper;
import gg.squire.mta.tasks.MtaManager;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;

@TaskDesc(name="Enchantment room", priority=6, blocking=true)
public class EnchantmentRoomTask
extends MtaManager<e> {
    private static final  int at;
    private static final  int as;
    
    private  int au;

    private static void var3() {
        var1 = new String[var2[10]];
        r.var1[r.var2[1]] = "Suggestion null";
        r.var1[r.var2[2]] = "Coins";
        r.var1[r.var2[3]] = "Coin Collector";
        r.var1[r.var2[6]] = "Suggestion empty";
        r.var1[r.var2[7]] = "Suggestion not null";
        r.var1[r.var2[8]] = "Unknown";
        r.var1[r.var2[9]] = "Unknown";
    }

    private static boolean var4(Object object) {
        return object == null;
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private static String var11(String var12, String var13) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var15 = var13.toCharArray();
        int var16 = var2[1];
        char[] var17 = var12.toCharArray();
        int var18 = var17.length;
        int var19 = var2[1];
        while (r.var20(var19, var18)) {
            char var21 = var17[var19];
            var14.append((char)(var21 ^ var15[var16 % var15.length]));
            0;
            ++var16;
            ++var19;
            0;
            if (-1 <= 0) continue;
            return null;
        }
        return String.valueOf(var14);
    }

    private static boolean var22(int n2) {
        return n2 != 0;
    }

    private static boolean var23(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean var24(int n2, int n3) {
        return n2 == n3;
    }

    @Inject
    private EnchantmentRoomTask(e e2, SquireMTA squireMTA) {
        super(e2, squireMTA);
        this.au = var2[0];
    }

    private static void var25() {
        var2 = new int[12];
        r.var2[0] = -(0xFFFFBCFF & 0x6F14) & (0xFFFFEFFB & 0x3FFF);
        r.var2[1] = (0xD2 ^ 0x8F) & ~(0x60 ^ 0x3D);
        r.var2[2] = 1;
        r.var2[3] = 2;
        r.var2[4] = -(0xFFFFF44E & 0x3BB7) & (0xFFFFB3FF & 0x7F25);
        r.var2[5] = -(0xFFFFED63 & 0x7ADF) & (0xFFFFEF57 & 0x7DFE);
        r.var2[6] = 3;
        r.var2[7] = 83 + 23 - 41 + 91 ^ 108 + 101 - 107 + 50;
        r.var2[8] = 0xB3 ^ 0x84 ^ (0x14 ^ 0x26);
        r.var2[9] = 1 ^ 7;
        r.var2[10] = 0x61 ^ 0x66;
        r.var2[11] = 0xCF ^ 0xC7;
    }

    private static boolean var26(Object object, Object object2) {
        return object == object2;
    }

    @Override
    public Spell L() {
        return SpellBook.Standard.HIGH_LEVEL_ALCHEMY;
    }

    @Override
    public boolean a(Item item) {
        List<String> list = ((e)this.aB).o();
        return list.contains(item.getName());
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean M() {
        void var27;
        r var28;
        g g3 = ((e)this.aB).n();
        if (r.var4(g3)) {
            System.out.println(var1[var2[1]]);
            Arrays.stream(((e)this.aB).p()).filter(g2 -> g2.s().j().equals(var1[var2[9]])).findFirst().ifPresent(g2 -> g2.EnchantmentRoomTask().interact(var2[1]));
            return var2[2];
        }
        String[] stringArray = new String[var2[2]];
        stringArray[r.var2[1]] = var1[var2[2]];
        int var29 = Inventory.getCount((boolean)var2[2], (String[])stringArray);
        if (r.var23(var29, var28.au)) {
            String[] stringArray2 = new String[var2[2]];
            stringArray2[r.var2[1]] = var1[var2[3]];
            TileObject var30 = TileObjects.getNearest((String[])stringArray2);
            if (r.var4(var30)) {
                return var2[1];
            }
            var30.interact(var2[1]);
            return var2[2];
        }
        if (r.var31(var29)) {
            var28.au = Rand.nextInt((int)var2[4], (int)var2[5]);
        }
        int[] nArray = new int[var2[2]];
        nArray[r.var2[1]] = ((e)var28.aB).l().i();
        Item var30 = Inventory.getFirst((int[])nArray);
        if (r.var32(var30)) {
            Magic.cast((Spevar28.L(), (Item)var30);
            return var2[2];
        }
        if (r.var22(Inventory.isFull() ? 1 : 0)) {
            Item var33 = Inventory.getFirst(item -> Stream.of(d.values()).anyMatch(d2 -> {
                boolean bl;
                if (r.var24(d2.i(), item.getId())) {
                    bl = var2[2];
                    0;
                    if (-2 > 0) {
                        return ((0xF4 ^ 0x9D ^ (0xC2 ^ 0xB6)) & (115 + 55 - 65 + 43 ^ 134 + 4 - 93 + 92 ^ -1)) != 0;
                    }
                } else {
                    bl = var2[1];
                }
                return bl;
            }));
            if (r.var4(var33)) {
                return var2[1];
            }
            Magic.cast((Spevar28.L(), (Item)var33);
            return var2[2];
        }
        if (r.var26((Object)var27.s(), (Object)d.EMPTY)) {
            System.out.println(var1[var2[6]]);
            Arrays.stream(((e)var28.aB).p()).filter(g2 -> g2.s().j().equals(var1[var2[8]])).findFirst().ifPresent(g2 -> g2.EnchantmentRoomTask().interact(var2[1]));
            return var2[2];
        }
        System.out.println(var1[var2[7]]);
        g3.EnchantmentRoomTask().interact(var2[1]);
        return var2[2];
    }

        catch (Exception var39) {
            var39.printStackTrace();
            return null;
        }
    }

    private static boolean var32(Object object) {
        return object != null;
    }

    private static boolean var31(int n2) {
        return n2 == 0;
    }

    static {
        r.var25();
        r.var3();
        as = var2[4];
        at = var2[5];
    }

    private static boolean var20(int n2, int n3) {
        return n2 < n3;
    }
}

