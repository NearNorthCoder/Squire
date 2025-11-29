/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.GameObject
 *  net.runelite.api.Item
 *  net.runelite.api.Player
 *  net.unethicalite.api.commons.Rand
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.gauntlet.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.util.Optional;
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.GameEnum4;
import gg.squire.gauntlet.tasks.HHelper;
import gg.squire.gauntlet.tasks.GameEnum;
import gg.squire.gauntlet.tasks.LHelper;
import gg.squire.gauntlet.tasks.GauntletTaskBase;
import net.runelite.api.GameObject;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Harvesting resources", priority=2, blocking=true)
public class HarvestingResourcesTask
extends GauntletTaskBase {

    private final  String[] bW;
    private final  b bV;

    static {
        L.var3();
        L.var4();
    }

    private static void var3() {
        var1 = new int[9];
        L.var1[0] = 0x80 ^ 0xA5 ^ (0x9D ^ 0xBC);
        L.var1[1] = 2 & (2 ^ -1);
        L.var1[2] = 1;
        L.var1[3] = 2;
        L.var1[4] = 3;
        L.var1[5] = 0xB9 ^ 0xAD;
        L.var1[6] = 0x98 ^ 0x9D;
        L.var1[7] = 0x30 ^ 0x36;
        L.var1[8] = 0x77 ^ 0x7F;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean be() {
        L var5;
        Player player = Players.getLocal();
        if (L.var6(player)) {
            return var1[1];
        }
        if (L.var7(var5.ba.M(), var1[5])) {
            return var1[1];
        }
        Item var8 = var5.bC();
        if (L.var9(var8)) {
            var8.interact(var2[var1[0]]);
            return var1[2];
        }
        if (L.var10(var5.ba.R() ? 1 : 0)) {
            return var1[1];
        }
        if (L.var10(Inventory.isFull() ? 1 : 0)) {
            return var1[1];
        }
        if (L.var10(var5.bV.p() ? 1 : 0)) {
            return var1[2];
        }
        Player var11 = Players.getLocal();
        GameObject var12 = var5.ba.U();
        if (L.var9(var12)) {
            void var13;
            if (L.var9(var11.getInteracting())) {
                var5.bV.e(Rand.nextInt((int)var1[3], (int)var1[0]));
                return var1[2];
            }
            h var14 = var5.ba.V();
            if (L.var6(var14)) {
                return var1[1];
            }
            l var15 = var14.d(var12.getWorldLocation());
            if (L.var6(var15)) {
                return var1[1];
            }
            if (L.var16(var15.e(var13.getWorldLocation()) ? 1 : 0)) {
                return var5.ba.a(var15, var13.getWorldLocation());
            }
            if (L.var10(var12.hasAction(var5.bW) ? 1 : 0)) {
                var12.interact(var5.bW);
                var5.bV.e(Rand.nextInt((int)var1[3], (int)var1[0]));
                return var1[2];
            }
            Object[] objectArray = new Object[var1[3]];
            objectArray[L.var1[1]] = var12.getName();
            objectArray[L.var1[2]] = var12.getActions();
            Log.info((String)var2[var1[6]], (Object[])objectArray);
            return var1[1];
        }
        return var1[1];
    }

        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }

    private static boolean var16(int n2) {
        return n2 == 0;
    }

    private static boolean var9(Object object) {
        return object != null;
    }

    private static boolean var23(Object object, Object object2) {
        return object == object2;
    }

    private static boolean var7(int n2, int n3) {
        return n2 <= n3;
    }

    @Inject
    public HarvestingResourcesTask(c c2, b b2) {
        d[] dArray = new d[var1[0]];
        dArray[L.var1[1]] = d.FIRST_ROTATION_EXPLORE;
        dArray[L.var1[2]] = d.DEMI_BOSS_EXPLORE;
        dArray[L.var1[3]] = d.EXTRA_FOOD_EXPLORE;
        dArray[L.var1[4]] = d.PREPARE_BOSS_FIGHT;
        super(c2, dArray);
        String[] stringArray = new String[var1[0]];
        stringArray[L.var1[1]] = var2[var1[1]];
        stringArray[L.var1[2]] = var2[var1[2]];
        stringArray[L.var1[3]] = var2[var1[3]];
        stringArray[L.var1[4]] = var2[var1[4]];
        this.bW = stringArray;
        this.bV = b2;
    }

    private static boolean var24(int n2) {
        return n2 <= 0;
    }

        catch (Exception var30) {
            var30.printStackTrace();
            return null;
        }
    }

    private static void var4() {
        var2 = new String[var1[7]];
        L.var2[L.var1[1]] = "Chop";
        L.var2[L.var1[2]] = "Mine";
        L.var2[L.var1[3]] = "Fish";
        L.var2[L.var1[4]] = "Pick";
        L.var2[L.var1[0]] = "Drop";
        L.var2[L.var1[6]] = "No action found for target: {}, available actions: {}";
    }

    private static boolean var6(Object object) {
        return object == null;
    }

    private static String var31(String var32, String var33) {
        var32 = new String(Base64.getDecoder().decode(var32.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var34 = new StringBuilder();
        char[] var35 = var33.toCharArray();
        int var36 = var1[1];
        char[] var37 = var32.toCharArray();
        int var38 = var37.length;
        int var39 = var1[1];
        while (L.var40(var39, var38)) {
            char var41 = var37[var39];
            var34.append((char)(var41 ^ var35[var36 % var35.length]));
            0;
            ++var36;
            ++var39;
            0;
            if (-(0x5C ^ 0x58) < 0) continue;
            return null;
        }
        return String.valueOf(var34);
    }

    private static boolean var10(int n2) {
        return n2 != 0;
    }

    private static  boolean a(Item item, i i2) {
        return i2.ay().contains(item.getId());
    }

    private static boolean var42(int n2) {
        return n2 > 0;
    }

    private static boolean var40(int n2, int n3) {
        return n2 < n3;
    }

    private Item bC() {
        return Inventory.getFirst(item -> {
            boolean bl;
            void var43;
            Optional<i> lllllllllllllllIlIIIllllllIlIIlI2;
            L var44;
            if (L.var10(i.FISH.ay().contains(item.getId()) ? 1 : 0)) {
                if (!L.var23((Object)this.ba.W(), (Object)d.DEMI_BOSS_EXPLORE) || L.var42(Inventory.getFreeSlots())) {
                    return var1[1];
                }
                int lllllllllllllllIlIIIllllllIlIIlI2 = var44.ba.E().getOrDefault((Object)i.FISH, var1[1]);
                if (L.var23((Object)var44.ba.W(), (Object)d.DEMI_BOSS_EXPLORE) && L.var42(lllllllllllllllIlIIIllllllIlIIlI2)) {
                    return var1[1];
                }
            }
            if (L.var10((lllllllllllllllIlIIIllllllIlIIlI2 = Arrays.stream(i.values()).filter(arg_0 -> L.a((Item)var43, arg_0)).findFirst()).isEmpty() ? 1 : 0)) {
                return var1[1];
            }
            int var45 = var44.ba.E().getOrDefault((Object)lllllllllllllllIlIIIllllllIlIIlI2.get(), var1[1]);
            if (L.var24(var45)) {
                bl = var1[2];
                0;
                if (((0xAC ^ 0xA9) & ~(2 ^ 7)) != 0) {
                    return (3 & ~3) != 0;
                }
            } else {
                bl = var1[1];
            }
            return bl;
        });
    }
}

