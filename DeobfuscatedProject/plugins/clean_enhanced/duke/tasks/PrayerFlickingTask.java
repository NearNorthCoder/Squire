/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.client.Static
 */
package gg.squire.duke.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.duke.SquireDukeSucellus;
import gg.squire.duke.SquireDukeSucellusConfig;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.client.Static;

@TaskDesc(name="Prayer Flicking", priority=0x7FFFFFFE)
public class PrayerFlickingTask
extends Task {
    private final  SquireDukeSucellus aZ;
    
    private final  SquireDukeSucellusConfig ba;

    public boolean run() {
        if ((Prayers.getPoints( <= 0))) {
            return 0;
        }
        NPC var3 = NPCs.getNearest(nPC -> {
            int n2;
            if ((nPC.getName( != 0).equals(var1[5]) ? 1 : 0)) {
                String[] stringArray = new String[4];
                stringArray[0] = var1[3];
                if ((nPC.hasActionstringArray)) {
                    n2 = 4;
                    0;
                    if (3 > -1) return n2 != 0;
                    return (2 & (2 ^ -1)) != 0;
                }
            }
            n2 = 0;
            return n2 != 0;
        });
        if var3 == null {
            Prayers.disableAll();
            return 0;
        }
        TileObject var4 = TileObjects.getNearest(tileObject -> {
            int n2;
            if ((tileObject.getName( != 0).equals(var1[0]) ? 1 : 0)) {
                String[] stringArray = new String[4];
                stringArray[0] = var1[4];
                if ((tileObject.hasActionstringArray)) {
                    n2 = 4;
                    0;
                    if (-1 <= 3) return n2 != 0;
                    return ((0xE4 ^ 0xB7) & ~(0xE8 ^ 0xBB)) != 0;
                }
            }
            n2 = 0;
            return n2 != 0;
        });
        if var4 == null {
            return 0;
        }
        Prayers.flick(this.V());
        0;
        return 0;
    }

    @Inject
    public PrayerFlickingTask(SquireDukeSucellus squireDukeSucellus, SquireDukeSucellusConfig squireDukeSucellusConfig) {
        this.aZ = squireDukeSucellus;
        this.ba = squireDukeSucellusConfig;
    }

    private static String var5(String var6, String var7) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var9 = var7.toCharArray();
        int var10 = 0;
        char[] var11 = var6.toCharArray();
        int var12 = var11.length;
        int var13 = 0;
        while (var13 < var12) {
            char var14 = var11[var13];
            var8.append((char)(var14 ^ var9[var10 % var9.length]));
            0;
            ++var10;
            ++var13;
            0;
            if (1 > 0) continue;
            return null;
        }
        return String.valueOf(var8);
    }

    /*
     * WARNING - void declaration
     */
    private List<Prayer> V() {
        ArrayList<Prayer> arrayList = new ArrayList<Prayer>();
        if ((Static.getClient().getVarbitValue(1) != 2)) {
            Prayer[] prayerArray = new Prayer[3];
            prayerArray[0] = Prayer.INCREDIBLE_REFLEXES;
            prayerArray[4] = Prayer.ULTIMATE_STRENGTH;
            prayerArray[5] = Prayer.STEEL_SKIN;
            List<Prayer> list = Arrays.asList(prayerArray);
            arrayList.addAll(list);
            0;
            0;
            if ((0x59 ^ 0x5C) <= 0) {
                return null;
            }
        } else {
            void var15;
            var15.add(Prayer.PIETY);
            0;
        }
        arrayList.add(Prayer.PROTECT_FROM_MELEE);
        0;
        return arrayList;
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

}

