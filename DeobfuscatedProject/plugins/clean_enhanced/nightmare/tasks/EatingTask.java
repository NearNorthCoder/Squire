/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.TileItem
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.client.Static
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.nightmare.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import gg.squire.nightmare.tasks.NightmareManager;

@TaskDesc(name="Eating", priority=501)
public class EatingTask
extends Task {
    
    private static final  Logger ej;
    private final  SquireNightmarePlugin el;
    private final  h em;
    
    private final  SquireNightmareConfig ek;

    private static boolean var3(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var4(Object object) {
        return object != null;
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private static boolean var11(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var12(Object object) {
        return object == null;
    }

    public boolean run() {
        TileItem var13;
        aq var14;
        block16: {
            Item var15;
            block18: {
                block17: {
                    if (aq.var16(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
                        return var2[0];
                    }
                    if (aq.var17(var14.el.EatingTask() ? 1 : 0)) {
                        return var2[0];
                    }
                    NPC var18 = SquireNightmarePlugin.d();
                    if (aq.var12(var18)) {
                        return var2[0];
                    }
                    String[] stringArray = new String[var2[1]];
                    stringArray[aq.var2[0]] = var1[var2[0]];
                    if (aq.var16(var18.hasAction(stringArray) ? 1 : 0)) {
                        int[] nArray = new int[var2[1]];
                        nArray[aq.var2[0]] = var2[2];
                        if (aq.var17(Inventory.contains((int[])nArray) ? 1 : 0) && aq.var4(var14.em.aH()) && aq.var19(aq.var20(Combat.getHealthPercent(), 100.0))) {
                            int[] nArray2 = new int[var2[1]];
                            nArray2[aq.var2[0]] = var2[2];
                            var15 = Inventory.getFirst((int[])nArray2);
                            if (aq.var4(var15)) {
                                ej.info(var1[var2[1]]);
                                var15.interact(var1[var2[3]]);
                                var14.sleep(var2[4]);
                                return var2[1];
                            }
                        }
                    }
                    String[] stringArray2 = new String[var2[1]];
                    stringArray2[aq.var2[0]] = var1[var2[4]];
                    if (aq.var17(var18.hasAction(stringArray2) ? 1 : 0)) {
                        return var2[0];
                    }
                    var15 = Inventory.getFirst(item -> item.hasAction(var1[var2[21]]::equals));
                    if (!aq.var4(var15)) break block16;
                    if (!aq.var16(var14.cD() ? 1 : 0)) break block17;
                    String[] stringArray3 = new String[var2[1]];
                    stringArray3[aq.var2[0]] = var1[var2[5]];
                    if (!aq.var16(var18.hasAction(stringArray3) ? 1 : 0)) break block18;
                }
                if (aq.var19(aq.var20(Combat.getHealthPercent(), var14.ek.restoreHealthPercentBetweenPhase()))) {
                    Object[] objectArray = new Object[var2[1]];
                    objectArray[aq.var2[0]] = var14.ek.restoreHealthPercentBetweenPhase();
                    Log.info((String)var1[var2[6]], (Object[])objectArray);
                    var15.interact(var1[var2[7]]);
                    var14.sleep(var2[4]);
                    return var2[1];
                }
            }
            var13 = NPCs.getNearest(nPC -> {
                int n2;
                if (aq.var17(nPC.getName().equals(var1[var2[19]]) ? 1 : 0) && aq.var11(nPC.getAnimation(), var2[20])) {
                    n2 = var2[1];
                    0;
                    if (3 <= 0) {
                        return ((0x64 ^ 7 ^ (0x70 ^ 0x45)) & (0xC7 ^ 0xC0 ^ (0x2F ^ 0x7E) ^ -1)) != 0;
                    }
                } else {
                    n2 = var2[0];
                }
                return n2 != 0;
            });
            if (aq.var21(var14.d().getId(), var2[8]) && aq.var4(var13) && aq.var19(aq.var20(Combat.getHealthPercent(), var14.ek.restoreHealthPercentBetweenPhase()))) {
                ej.info(var1[var2[9]]);
                var15.interact(var1[var2[10]]);
                var14.sleep(var2[4]);
                return var2[1];
            }
            if (aq.var3(Combat.getCurrentHealth(), var14.ek.eatAt())) {
                ej.info(var1[var2[11]], (Object)var15.getName(), (Object)var14.ek.eatAt());
                var15.interact(var1[var2[12]]);
                var14.sleep(var2[4]);
                return var2[1];
            }
        }
        if (aq.var4(var13 = var14.em.aH()) && aq.var22(Inventory.getFreeSlots(), var2[1])) {
            if (aq.var17(var14.cD() ? 1 : 0)) {
                ej.info(var1[var2[13]], (Object)var13.getName(), (Object)var13.distanceTo((Locatable)Players.getLocal()));
                var13.interact(var1[var2[14]]);
                var14.sleep(var2[3]);
                return var2[1];
            }
            if (aq.var16(var13.distanceTo((Locatable)Players.getLocal()))) {
                ej.info(var1[var2[15]], (Object)var13.getName());
                var13.interact(var1[var2[16]]);
                var14.sleep(var2[3]);
                return var2[1];
            }
        }
        return var2[0];
    }

    private static boolean var16(int n2) {
        return n2 == 0;
    }

        catch (Exception var28) {
            var28.printStackTrace();
            return null;
        }
    }

    @Inject
    protected EatingTask(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, h h2) {
        this.ek = squireNightmareConfig;
        this.el = squireNightmarePlugin;
        this.em = h2;
    }

    private NPC d() {
        return SquireNightmarePlugin.d();
    }

    private static boolean var21(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean var22(int n2, int n3) {
        return n2 > n3;
    }

    private boolean cD() {
        boolean bl;
        aq var29;
        if (aq.var12(this.d())) {
            return var2[0];
        }
        String[] stringArray = new String[var2[1]];
        stringArray[aq.var2[0]] = var1[var2[17]];
        if (!aq.var16(var29.d().hasAction(stringArray) ? 1 : 0) || aq.var11(var29.d().getAnimation(), var2[18])) {
            bl = var2[1];
            0;
            if (-(0x48 ^ 5 ^ (0xC5 ^ 0x8C)) >= 0) {
                return ((149 + 119 - 134 + 84 ^ 136 + 132 - 207 + 95) & (84 + 172 - 178 + 117 ^ 77 + 99 - 152 + 109 ^ -1)) != 0;
            }
        } else {
            bl = var2[0];
        }
        return bl;
    }

    private static boolean var17(int n2) {
        return n2 != 0;
    }

    private static void var30() {
        var1 = new String[var2[22]];
        aq.var1[aq.var2[0]] = "Attack";
        aq.var1[aq.var2[1]] = "Eating tuna to full health";
        aq.var1[aq.var2[3]] = "Eat";
        aq.var1[aq.var2[4]] = "Disturb";
        aq.var1[aq.var2[5]] = "Attack";
        aq.var1[aq.var2[6]] = "Eating food since we have downtime, and we're below {} hp.";
        aq.var1[aq.var2[7]] = "Eat";
        aq.var1[aq.var2[9]] = "oh no a guy made it through and we gota eat now LOL";
        aq.var1[aq.var2[10]] = "Eat";
        aq.var1[aq.var2[11]] = "eating food: {} in-fight since we're below {} hp";
        aq.var1[aq.var2[12]] = "Eat";
        aq.var1[aq.var2[13]] = "retrieving food: {} mid-fight since we have room! It's {} tiles away, and pnm is transitioning.";
        aq.var1[aq.var2[14]] = "Take";
        aq.var1[aq.var2[15]] = "retrieving food: {} since we're standing on it anyway.";
        aq.var1[aq.var2[16]] = "Take";
        aq.var1[aq.var2[17]] = "Disturb";
        aq.var1[aq.var2[19]] = "Sleepwalker";
        aq.var1[aq.var2[21]] = "Eat";
    }

    private static String var31(String var32, String var33) {
        var32 = new String(Base64.getDecoder().decode(var32.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var34 = new StringBuilder();
        char[] var35 = var33.toCharArray();
        int var36 = var2[0];
        char[] var37 = var32.toCharArray();
        int var38 = var37.length;
        int var39 = var2[0];
        while (aq.var3(var39, var38)) {
            char var40 = var37[var39];
            var34.append((char)(var40 ^ var35[var36 % var35.length]));
            0;
            ++var36;
            ++var39;
            0;
            if ((40 + 46 - 79 + 130 ^ 128 + 56 - 179 + 136) == (23 + 4 - -37 + 108 ^ 20 + 117 - 80 + 111)) continue;
            return null;
        }
        return String.valueOf(var34);
    }

    private static void var41() {
        var2 = new int[23];
        aq.var2[0] = (3 + 79 - -42 + 16 ^ 89 + 13 - -54 + 28) & (96 + 55 - 125 + 148 ^ 139 + 152 - 203 + 66 ^ -1);
        aq.var2[1] = 1;
        aq.var2[2] = -(0xFFFFCCDD & 0x7733) & (0xFFFFE7FD & 0x5D7F);
        aq.var2[3] = 2;
        aq.var2[4] = 3;
        aq.var2[5] = 64 + 9 - -23 + 59 ^ 31 + 82 - 60 + 106;
        aq.var2[6] = 0x39 ^ 0x3C;
        aq.var2[7] = 0xE ^ 0x58 ^ (0xF4 ^ 0xA4);
        aq.var2[8] = -(0xFFFFC4FD & 0x7F6B) & (0xFFFFFFFF & 0x6FFA);
        aq.var2[9] = 0x8D ^ 0x8A;
        aq.var2[10] = 0x43 ^ 0x4B;
        aq.var2[11] = 0x9E ^ 0x97;
        aq.var2[12] = 0x96 ^ 0x9C;
        aq.var2[13] = 0x3C ^ 0x37;
        aq.var2[14] = 0x42 ^ 0x4E;
        aq.var2[15] = 0x3F ^ 0x32;
        aq.var2[16] = 0x6F ^ 0x3F ^ (0xEA ^ 0xB4);
        aq.var2[17] = 0x24 ^ 0x2B;
        aq.var2[18] = 0xFFFFBBDF & 0x65BC;
        aq.var2[19] = 149 + 152 - 156 + 8 ^ 125 + 127 - 187 + 72;
        aq.var2[20] = -(0xFFFFDEB5 & 0x754F) & (0xFFFFF77F & 0x7DFF);
        aq.var2[21] = 2 ^ 0x6D ^ (0xD ^ 0x73);
        aq.var2[22] = 0xDB ^ 0x95 ^ (0x6C ^ 0x30);
    }

    private static boolean var19(int n2) {
        return n2 < 0;
    }

    static {
        aq.var41();
        aq.var30();
        ej = LoggerFactory.getLogger(EatingTask.class);
    }

    private static int var20(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }
}

