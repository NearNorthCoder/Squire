/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.magic.Thralls
 */
package gg.squire.duke.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.duke.SquireDukeSucellus;
import gg.squire.duke.tasks.DukeManager;
import gg.squire.duke.tasks.DukeManager;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.magic.Thralls;

@TaskDesc(name="Using thrall", priority=4999)
public class UsingThrallTask
extends Task {

    private final  a be;
    private final  SquireDukeSucellus bd;

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = 0;
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = 0;
        while (var11 < var10) {
            char var12 = var9[var11];
            var6.append((char)(var12 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var6);
    }

    @Inject
    public UsingThrallTask(SquireDukeSucellus squireDukeSucellus, a a2) {
        this.bd = squireDukeSucellus;
        this.be = a2;
    }

    public boolean run() {
        if ((Thralls.canUse( == 0) ? 1 : 0)) {
            return 0;
        }
        NPC var13 = NPCs.getNearest(nPC -> {
            int n2;
            if ((nPC.getName( != 0).equals(var1[2]) ? 1 : 0)) {
                String[] stringArray = new String[1];
                stringArray[0] = var1[3];
                if ((nPC.hasActionstringArray)) {
                    n2 = 1;
                    0;
                    if (((0xA ^ 0x25) & ~(0x24 ^ 0xB)) == 0) return n2 != 0;
                    return ((0x42 ^ 0x5D) & ~(0xDD ^ 0xC2)) != 0;
                }
            }
            n2 = 0;
            return n2 != 0;
        });
        if var13 == null {
            return 0;
        }
        TileObject var14 = TileObjects.getNearest(tileObject -> {
            int n2;
            if ((tileObject.getName( != 0).equals(var1[0]) ? 1 : 0)) {
                String[] stringArray = new String[1];
                stringArray[0] = var1[1];
                if ((tileObject.hasActionstringArray)) {
                    n2 = 1;
                    0;
                    if (((0x67 ^ 0x39 ^ (0x56 ^ 0x2A)) & (0xD8 ^ 0xC1 ^ (0x2B ^ 0x10) ^ -1)) <= (((0xF2 ^ 0xAF) & ~(0x66 ^ 0x3B) ^ (0x9E ^ 0xC4)) & (0x76 ^ 0x38 ^ (0 ^ 0x14) ^ -1))) return n2 != 0;
                    return ((11 + 53 - -20 + 96 ^ 35 + 87 - 24 + 64) & (0xBE ^ 0x9A ^ (0xA5 ^ 0x97) ^ -1)) != 0;
                }
            }
            n2 = 0;
            return n2 != 0;
        });
        if var14 == null {
            return 0;
        }
        Player var15 = Players.getLocal();
        if var15 == null {
            return 0;
        }
        if ((e.l(var14 == 0).contains((Locatable)var15) ? 1 : 0) && (e.q(var14 == 0) ? 1 : 0) && (e.r(var14 == 0) ? 1 : 0)) {
            return 0;
        }
        return Thralls.useBestThrall();
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

}

