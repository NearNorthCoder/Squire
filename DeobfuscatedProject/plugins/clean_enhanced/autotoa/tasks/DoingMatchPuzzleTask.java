/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.GroundObject
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Reachable
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Comparator;
import java.util.List;
import net.runelite.api.Client;
import net.runelite.api.GroundObject;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Reachable;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Doing match puzzle", priority=50, blocking=true)
public class DoingMatchPuzzleTask
extends AutotoaManager {

    @Inject
    protected DoingMatchPuzzleTask(Client client, z z2, TOAConfig tOAConfig, p p2) {
        super(client, z2, tOAConfig, p2);
    }

    private static boolean var3(int n2) {
        return n2 != 0;
    }

    private static boolean var4(int n2, int n3) {
        return n2 < n3;
    }

    public GroundObject cb() {
        List list = TileObjects.getAll(tileObject -> {
            String[] stringArray = new String[var2[0]];
            stringArray[bo.var2[1]] = var1[var2[2]];
            return tileObject.hasAction(stringArray);
        });
        TileObject tileObject2 = list.stream().min(Comparator.comparingInt(TileObject::getId).thenComparingInt(tileObject -> tileObject.getWorldLocation().distanceTo((Locatable)Players.getLocal()))).orElse(null);
        if (bo.var3(tileObject2 instanceof GroundObject)) {
            return (GroundObject)tileObject2;
        }
        return null;
    }

    private static void var5() {
        var2 = new int[5];
        bo.var2[0] = 1;
        bo.var2[1] = (7 ^ 0x54 ^ (0x84 ^ 0x8B)) & (0x71 ^ 0x15 ^ (0x82 ^ 0xBA) ^ -1);
        bo.var2[2] = 2;
        bo.var2[3] = 3;
        bo.var2[4] = 0xB7 ^ 0xBF;
    }

    static {
        bo.var5();
        bo.var6();
    }

    @Override
    public boolean bk() {
        String[] stringArray = new String[var2[0]];
        stringArray[bo.var2[1]] = var1[var2[1]];
        return TileObjects.getAll((String[])stringArray).stream().anyMatch(Reachable::isInteractable);
    }

        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }

    private static boolean var13(Object object) {
        return object == null;
    }

    private static String var14(String var15, String var16) {
        var15 = new String(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var17 = new StringBuilder();
        char[] var18 = var16.toCharArray();
        int var19 = var2[1];
        char[] var20 = var15.toCharArray();
        int var21 = var20.length;
        int var22 = var2[1];
        while (bo.var4(var22, var21)) {
            char var23 = var20[var22];
            var17.append((char)(var23 ^ var18[var19 % var18.length]));
            0;
            ++var19;
            ++var22;
            0;
            if (-3 < 0) continue;
            return null;
        }
        return String.valueOf(var17);
    }

    private static void var6() {
        var1 = new String[var2[3]];
        bo.var1[bo.var2[1]] = "Symbol";
        bo.var1[bo.var2[0]] = "Activate";
        bo.var1[bo.var2[2]] = "Activate";
    }

    @Override
    public boolean bY() {
        GroundObject groundObject = this.cb();
        if (bo.var13(groundObject)) {
            return var2[1];
        }
        groundObject.interact(var1[var2[0]]);
        return var2[0];
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int bZ() {
        int n2;
        GroundObject groundObject = this.cb();
        if (bo.var13(groundObject)) {
            n2 = var2[1];
            0;
            if (3 <= -1) {
                return (0x82 ^ 0xBB) & ~(0x49 ^ 0x70);
            }
        } else {
            void var24;
            n2 = var24.getWorldX();
        }
        return n2;
    }

    @Override
    public boolean bj() {
        boolean bl2;
        if (bo.var13(this.cb())) {
            bl2 = var2[0];
            0;
            if (((2 ^ (0xCD ^ 0x9E)) & (0x70 ^ 0x31 ^ (0x9B ^ 0x8B) ^ -1)) == 1) {
                return ((213 + 223 - 414 + 219 ^ 58 + 110 - 133 + 150) & (48 + 162 - 32 + 35 ^ 37 + 48 - 76 + 148 ^ -1)) != 0;
            }
        } else {
            bl2 = var2[1];
        }
        return bl2;
    }
}

