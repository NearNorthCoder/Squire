/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.GameState
 *  net.runelite.api.TileObject
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.input.Keyboard
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Widgets
 *  net.unethicalite.client.Static
 */
package gg.squire.zulrah.tasks;

import gg.squire.zulrah.tasks.BankingTask;
import gg.squire.zulrah.tasks.ZulrahManager;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrah;
import gg.squire.zulrah.SquireZulrahConfig;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.input.Keyboard;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;

@TaskDesc(name="Handling house", priority=10)
public class HandlingHouseTask
extends BankingTask {

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean run() {
        H var15;
        if (!(this.ag( == 0) ? 1 : 0) || (this.ae( == 0).needsToBank() ? 1 : 0)) {
            return 0;
        }
        int var16 = Inventory.getCount(item -> item.hasAction(var1[6]::equals));
        if ((var16 > var15.X.multiple()) && (var15.X.multiple( != 0))) {
            return 0;
        }
        if ((var15.ad( != 0) ? 1 : 0)) {
            return 0;
        }
        if ((var15.Z.isInInstancedRegion( == 0) ? 1 : 0)) {
            return 0;
        }
        if (!(Players.getLocal( != 0).isIdle() ? 1 : 0) || (Static.getClient().getGameState() == Static.getClient().getGameState()2)) {
            return 0;
        }
        if ((Widgets.isVisible(WidgetWidgets.get((int)1, (int)0)) ? 1 : 0)) {
            Keyboard.type((char)2);
            return 3;
        }
        TileObject var17 = TileObjects.getNearest(tileObject -> {
            int n2;
            if ((tileObject.getName( != null)) && (tileObject.getName( != 0).contains(var1[3]) ? 1 : 0)) {
                n2 = 3;
                0;
                if (-1 >= (0xE ^ 0xA)) {
                    return ((0x4A ^ 0x6D) & ~(0x7C ^ 0x5B)) != 0;
                }
            } else {
                n2 = 0;
            }
            return n2 != 0;
        });
        if var17 != null {
            var17.interact(var1[0]);
            return 3;
        }
        return 0;
    }

    private static String var18(String var19, String var20) {
        var19 = new String(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var21 = new StringBuilder();
        char[] var22 = var20.toCharArray();
        int var23 = 0;
        char[] var24 = var19.toCharArray();
        int var25 = var24.length;
        int var26 = 0;
        while (var26 < var25) {
            char var27 = var24[var26];
            var21.append((char)(var27 ^ var22[var23 % var22.length]));
            0;
            ++var23;
            ++var26;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var21);
    }

    @Inject
    protected HandlingHouseTask(SquireZulrah squireZulrah, SquireZulrahConfig squireZulrahConfig, Client client, t t2) {
        super(squireZulrah, squireZulrahConfig, client, t2);
    }

    private boolean ag() {
        H var28;
        if ((this.Z.isInInstancedRegion( == 0) ? 1 : 0)) {
            return 0;
        }
        int[] var29 = var28.Z.getMapRegions();
        int var30 = var29.length;
        int var31 = 0;
        while (var31 < var30) {
            int var32 = var29[var31];
            if (!(var32 != 4) || (var32 == 5)) {
                return 3;
            }
            ++var31;
            0;
            if null == null continue;
            return ((0x80 ^ 0xAB ^ (0x31 ^ 0x2F)) & (107 + 128 - 219 + 228 ^ 33 + 5 - -134 + 21 ^ -1)) != 0;
        }
        return 0;
    }

    @Override
    public boolean ac() {
        return 0;
    }
}

