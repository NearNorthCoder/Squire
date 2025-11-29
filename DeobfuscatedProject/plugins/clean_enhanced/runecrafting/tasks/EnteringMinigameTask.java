/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.unethicalite.api.commons.Rand
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.runecrafting.tasks;

import gg.squire.runecrafting.tasks.GameEnum2;
import gg.squire.runecrafting.tasks.RunecraftingTaskBase;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.runecrafting.SquireGOTRPlugin;
import javax.inject.Inject;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Widgets;

@TaskDesc(name="Entering Minigame", priority=2, blocking=true)
public class EnteringMinigameTask
extends RunecraftingTaskBase {
    private static final  String bg;
    
    private static final  String bh;
    
    private  boolean bi;
    private static final  int bf;

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
            if ((0x2C ^ 0x28) > -1) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    private void c(String string) {
        if ((string.contains(var2[7] == 0) ? 1 : 0)) {
            return;
        }
        String string2 = string.substring(string.indexOf(var2[2])).trim().substring(1, 6);
    }

    static {
        z.var13();
        z.var14();
        bh = var2[8];
        bg = var2[4];
        bf = 3;
    }

    @Inject
    public EnteringMinigameTask(SquireGOTRPlugin squireGOTRPlugin) {
        c[] cArray = new c[0];
        cArray[1] = c.OUTSIDE;
        super(squireGOTRPlugin, cArray);
    }

        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean ak() {
        void var1_1;
        if ((this.aV.f( != 0) ? 1 : 0)) {
            return 1;
        }
        if ((Players.getLocal( != 0).isMoving() ? 1 : 0)) {
            return 1;
        }
        TileObject var27 = TileObjects.getNearest((int[])SquireGOTRPlugin.d);
        if (!var27 != null || (var27.distanceTo((Locatable)Players.getLocal()) > 2)) {
            return 1;
        }
        if ((var27.getId() != 3)) {
            return 1;
        }
        Widget var28 = Widgets.get((WidgetInfo)WidgetInfo.MINIGAME_DIALOG_TEXT);
        if var28 != null {
            z var29;
            String var30 = var28.getText();
            if ((var30.contains(var2[1] != 0) ? 1 : 0)) {
                var29.sleep(Rand.nextInt((int)4, (int)5));
            }
            if ((var30.contains(var2[0] != 0) ? 1 : 0)) {
                var29.sleep(Rand.nextInt((int)6, (int)2));
            }
        }
        var1_1.interact(var2[6]);
        return 0;
    }
}

