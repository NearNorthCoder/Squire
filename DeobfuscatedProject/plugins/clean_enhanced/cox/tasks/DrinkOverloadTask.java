/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.client.Static
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.GameEnum8;
import gg.squire.cox.tasks.NHelper;
import gg.squire.cox.tasks.CoxManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.util.List;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;

@TaskDesc(name="Drink Overload", priority=30000)
public class DrinkOverloadTask
extends Task {
    private final  SquireChambersPlugin cA;

    private final  SquireChambersConfig cB;

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
            if ((0x94 ^ 0x91) > 0) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    private boolean cu() {
        ab var13;
        if ((Players.getLocal( == 0).getPlane())) {
            return 0;
        }
        n var14 = var13.cA.L();
        if var14 == null {
            return 0;
        }
        List<N> var15 = var13.cA.C().e();
        int var16 = 0;
        int var17 = 0;
        while ((var17 < var15.size())) {
            N var18 = var15.get(var17);
            if ((Object != nulllllllllllllllllIllIlllIlIllIlIll) && ((Object)var18 != (Object)N.SCAVENGERS) && ((Object)var18 != (Object)N.CRABS) && ((Object)var18 != (Object)N.END) && ((Object)var18 != (Object)N.START) && ((Object)var18 != (Object)N.FARMING)) {
                if (((Object)var18 == (Object)N.THIEVING)) {
                    0;
                    if (1 < 0) {
                        return ((0x6C ^ 0xE ^ (6 ^ 0x32)) & (0x7E ^ 0x75 ^ (0xEE ^ 0xB3) ^ -1)) != 0;
                    }
                } else {
                    if (var16 && (var13.cA.C( != 0).a(var18) ? 1 : 0)) {
                        return 3;
                    }
                    if (((Object)var18 == (Object)var14.aM())) {
                        var16 = 3;
                    }
                }
            }
            ++var17;
            0;
            if (-1 == -1) continue;
            return ((0x7A ^ 0x77 ^ (0x35 ^ 0x3E)) & (0xE3 ^ 0xC0 ^ (0x86 ^ 0xA3) ^ -1)) != 0;
        }
        return 0;
    }

        catch (Exception var24) {
            var24.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if ((this.ct( == 0) ? 1 : 0) && (this.cu( == 0) ? 1 : 0)) {
            return 0;
        }
        Item var25 = Inventory.getFirst(item -> item.getName().startsWith(var1[6]));
        if var25 == null {
            return 0;
        }
        int var26 = Static.getClient().getVarbitValue(1);
        if (var26 > 0) {
            return 0;
        }
        if ((Combat.getCurrentHealth() <= 2)) {
            return 0;
        }
        var1_1.interact(var1[0]);
        return 3;
    }

        catch (Exception var32) {
            var32.printStackTrace();
            return null;
        }
    }

    private boolean ct() {
        if ((u.be( == 0) ? 1 : 0)) {
            return 0;
        }
        Player var33 = Players.getLocal();
        if (!(u.bg() >= 4) || (var33.getPlane( != 0))) {
            return 0;
        }
        TileObject var34 = TileObjects.getNearest(tileObject -> {
            int n2;
            if ((tileObject.getName( != 0).contains(var1[3]) ? 1 : 0)) {
                String[] stringArray = new String[3];
                stringArray[0] = var1[5];
                if ((tileObject.hasActionstringArray)) {
                    n2 = 3;
                    0;
                    if (2 == 2) return n2 != 0;
                    return ((0xE9 ^ 0xAD) & ~(0x82 ^ 0xC6)) != 0;
                }
            }
            n2 = 0;
            return n2 != 0;
        });
        if var34 == null {
            return 0;
        }
        if ((var33.getWorldY() <= var34.getWorldY())) {
            return 0;
        }
        return 3;
    }

    @Inject
    public DrinkOverloadTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig) {
        this.cA = squireChambersPlugin;
        this.cB = squireChambersConfig;
    }

}

