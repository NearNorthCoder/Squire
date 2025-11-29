/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 */
package gg.squire.construction.tasks;

import com.google.inject.Inject;
import gg.squire.basics.combat.Cannon.CannonReloader;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;

@TaskDesc(name="Repairing cannon", priority=5, blocking=true)
public class RepairingCannonTask
extends Task {
    private static  String[] lIIIIllIl;
    private final  CannonReloader bS;
    private static  int[] lIIIIlllI;

    @Inject
    public RepairingCannonTask(CannonReloader cannonReloader) {
        this.bS = cannonReloader;
    }

        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var7;
        String[] stringArray = new String[0];
        stringArray[1] = lIIIIllIl[1];
        TileObject tileObject = TileObjects.getNearest((String[])stringArray);
        if tileObject == null {
            return 1;
        }
        String[] stringArray2 = new String[0];
        stringArray2[1] = lIIIIllIl[0];
        if ((var7.hasAction(stringArray2 == 0) ? 1 : 0)) {
            return 1;
        }
        if ((Players.getLocal( != 0).isAnimating() ? 1 : 0)) {
            return 0;
        }
        tileObject.interact(lIIIIllIl[2]);
        return 0;
    }

        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    private static String var14(String var15, String var16) {
        var15 = new String(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var17 = new StringBuilder();
        char[] var18 = var16.toCharArray();
        int var19 = 1;
        char[] var20 = var15.toCharArray();
        int var21 = var20.length;
        int var22 = 1;
        while (var22 < var21) {
            char var23 = var20[var22];
            var17.append((char)(var23 ^ var18[var19 % var18.length]));
            0;
            ++var19;
            ++var22;
            0;
            if (-1 <= 2) continue;
            return null;
        }
        return String.valueOf(var17);
    }

}

