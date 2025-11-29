/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.TileObject
 *  net.runelite.api.World
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Worlds
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.construction.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.construction.SquirePlankerConfig;
import net.runelite.api.TileObject;
import net.runelite.api.World;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.widgets.Widgets;

@TaskDesc(name="Teleporting", priority=5)
public class TeleportingTask
extends Task {
    private final  SquirePlankerConfig o;

    @Inject
    public TeleportingTask(SquirePlankerConfig squirePlankerConfig) {
        this.o = squirePlankerConfig;
    }

    public boolean run() {
        e var3;
        if (e.var4(this.o.spell() ? 1 : 0)) {
            return var1[0];
        }
        String[] stringArray = new String[var1[1]];
        stringArray[e.var1[0]] = var2[var1[0]];
        stringArray[e.var1[2]] = var2[var1[2]];
        TileObject var5 = TileObjects.getNearest((String[])stringArray);
        int[] nArray = new int[var1[2]];
        nArray[e.var1[0]] = var3.o.plank().d();
        if (e.var4(Inventory.contains((int[])nArray) ? 1 : 0) && e.var6(var5)) {
            Widget var7 = Widgets.get((WidgetInfo)SpellBook.Standard.TELEPORT_TO_HOUSE.getWidget());
            if (e.var6(var7)) {
                if (e.var4(var7.hasAction(var2[var1[1]]::equals) ? 1 : 0)) {
                    var7.interact(var2[var1[3]]);
                    0;
                    if (-3 > 0) {
                        return ((0x25 ^ 5) & ~(0xBE ^ 0x9E)) != 0;
                    }
                } else {
                    var7.interact(var2[var1[4]]);
                }
                var3.sleep(var1[5]);
                return var1[2];
            }
            0;
            if null != null {
                return ((0x8D ^ 0xA8 ^ (0x1E ^ 0x64)) & (0xF ^ 0x17 ^ (0x72 ^ 0x35) ^ -1)) != 0;
            }
        } else {
            int[] nArray2 = new int[var1[2]];
            nArray2[e.var1[0]] = var3.o.plank().d();
            if (e.var8(Inventory.contains((int[])nArray2) ? 1 : 0) && e.var9(var5)) {
                int n;
                if (e.var4(var3.o.ironMode() ? 1 : 0)) {
                    TileObject var7 = TileObjects.getNearest(tileObject -> {
                        boolean bl;
                        if (!e.var8(tileObject.getName().contains(var2[var1[8]]) ? 1 : 0) || e.var4(tileObject.getName().contains(var2[var1[9]]) ? 1 : 0)) {
                            bl = var1[2];
                            0;
                            if (-1 == 1) {
                                return ((0x60 ^ 0x39) & ~(0xE6 ^ 0xBF)) != 0;
                            }
                        } else {
                            bl = var1[0];
                        }
                        return bl;
                    });
                    World var10 = Worlds.getCurrentWorld();
                    if (e.var4(var10.isAllPkWorld() ? 1 : 0)) {
                        Log.info((String)var2[var1[5]]);
                        return var1[0];
                    }
                    if (e.var6(var7)) {
                        var7.interact(string -> string.contains(var2[var1[7]]));
                        return var1[2];
                    }
                }
                Magic.cast((SpeSpellBook.Standard.CAMELOT_TELEPORT);
                if (e.var4(var3.o.slowmode() ? 1 : 0)) {
                    n = var1[6];
                    0;
                    if ((0xC4 ^ 0xC0) <= 2) {
                        return ((0x89 ^ 0xC4) & ~(0x58 ^ 0x15)) != 0;
                    }
                } else {
                    n = var1[5];
                }
                var3.sleep(n);
            }
        }
        return var1[2];
    }

    private static boolean var9(Object object) {
        return object == null;
    }

        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    private static void var17() {
        var2 = new String[var1[10]];
        e.var2[e.var1[0]] = "Bank chest";
        e.var2[e.var1[2]] = "Bank booth";
        e.var2[e.var1[1]] = "Inside";
        e.var2[e.var1[3]] = "Inside";
        e.var2[e.var1[4]] = "Cast";
        e.var2[e.var1[5]] = "Please do not use this feature on a PvP world.";
        e.var2[e.var1[7]] = "Seers";
        e.var2[e.var1[8]] = "Seers";
        e.var2[e.var1[9]] = "Camelot";
    }

    private static boolean var8(int n) {
        return n == 0;
    }

    private static boolean var4(int n) {
        return n != 0;
    }

    private static boolean var18(int n, int n2) {
        return n < n2;
    }

        catch (Exception var24) {
            var24.printStackTrace();
            return null;
        }
    }

    private static void var25() {
        var1 = new int[11];
        e.var1[0] = (0xCF ^ 0x88 ^ (0xE0 ^ 0xA9)) & (62 + 165 - 115 + 66 ^ 142 + 128 - 152 + 70 ^ -1);
        e.var1[1] = 2;
        e.var1[2] = 1;
        e.var1[3] = 3;
        e.var1[4] = 111 + 1 - 35 + 119 ^ 107 + 35 - 49 + 99;
        e.var1[5] = 0x6B ^ 0x61 ^ (0x96 ^ 0x99);
        e.var1[6] = 0xBF ^ 0xB0;
        e.var1[7] = 0x53 ^ 0x55;
        e.var1[8] = 0x71 ^ 0x76;
        e.var1[9] = 0x20 ^ 0x28;
        e.var1[10] = 0x78 ^ 0x71;
    }

    static {
        e.var25();
        e.var17();
    }

    private static boolean var6(Object object) {
        return object != null;
    }

    private static String var26(String var27, String var28) {
        var27 = new String(Base64.getDecoder().decode(var27.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var29 = new StringBuilder();
        char[] var30 = var28.toCharArray();
        int var31 = var1[0];
        char[] var32 = var27.toCharArray();
        int var33 = var32.length;
        int var34 = var1[0];
        while (e.var18(var34, var33)) {
            char var35 = var32[var34];
            var29.append((char)(var35 ^ var30[var31 % var30.length]));
            0;
            ++var31;
            ++var34;
            0;
            if (-(93 + 152 - 185 + 122 ^ 27 + 27 - -83 + 42) < 0) continue;
            return null;
        }
        return String.valueOf(var29);
    }
}

