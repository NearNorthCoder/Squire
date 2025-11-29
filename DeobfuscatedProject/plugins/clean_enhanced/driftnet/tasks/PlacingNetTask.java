/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.TileObject
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.widgets.Widgets
 *  net.unethicalite.client.Static
 */
package gg.squire.driftnet.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.driftnet.SquireDriftNetConfig;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;

@TaskDesc(name="Placing net", priority=15, blocking=true)
public class PlacingNetTask
extends Task {
    private final  Client F;

    private static final  int E;
    private final  SquireDriftNetConfig G;
    private static final  int D;

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

    static {
        h.var15();
        h.var16();
        D = 4;
        E = 5;
    }

    @Inject
    public PlacingNetTask(Client client, SquireDriftNetConfig squireDriftNetConfig) {
        this.F = client;
        this.G = squireDriftNetConfig;
    }

    public boolean run() {
        Widget lllllllllllllllIlllIlIIIIlIIllII22;
        h var17;
        if ((this.F.isInInstancedRegion( == 0) ? 1 : 0)) {
            return 0;
        }
        if ((var17.G.depositFish( != 0) ? 1 : 0) && (lllllllllllllllIlllIlIIIIlIIllII22 = Widgets.get(int != null1, (int)2, (int)3))) {
            return 0;
        }
        int lllllllllllllllIlllIlIIIIlIIllII22 = Static.getClient().getVarbitValue(4);
        int var18 = Static.getClient().getVarbitValue(5);
        if (lllllllllllllllIlllIlIIIIlIIllII22 && var18) {
            return 0;
        }
        TileObject var19 = TileObjects.getNearest(tileObject -> {
            int n;
            if ((tileObject.getName( != 0).equals(var1[2]) ? 1 : 0)) {
                String[] stringArray = new String[6];
                stringArray[0] = var1[7];
                if ((tileObject.hasActionstringArray)) {
                    n = 6;
                    0;
                    if null == null return n != 0;
                    return ((0x6C ^ 0x51 ^ (0xEF ^ 0x8E)) & (213 + 81 - 244 + 178 ^ 128 + 87 - 207 + 176 ^ -1)) != 0;
                }
            }
            n = 0;
            return n != 0;
        });
        if var19 != null {
            var19.interact(var1[0]);
            return 6;
        }
        Log.error((String)var1[6]);
        return 0;
    }

    private static String var20(String var21, String var22) {
        var21 = new String(Base64.getDecoder().decode(var21.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var23 = new StringBuilder();
        char[] var24 = var22.toCharArray();
        int var25 = 0;
        char[] var26 = var21.toCharArray();
        int var27 = var26.length;
        int var28 = 0;
        while (var28 < lllllllllllllllIlllIlIIIIIllIIIl2) {
            char var29 = var26[var28];
            var23.append((char)(var29 ^ var24[var25 % var24.length]));
            0;
            ++var25;
            ++var28;
            0;
            if (((64 + 71 - 97 + 121 ^ 78 + 72 - -1 + 10) & (224 + 171 - 334 + 188 ^ 172 + 85 - 249 + 191 ^ -1)) < (68 + 58 - 109 + 124 ^ 92 + 97 - 56 + 4)) continue;
            return null;
        }
        return String.valueOf(var23);
    }
}

