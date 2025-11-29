/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.vorkath.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import gg.squire.vorkath.tasks.VorkathManager;
import gg.squire.vorkath.tasks.VorkathManager;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Tick eat", priority=200)
public class TickEatTask
extends VorkathManager {

    private static final  String cn;

    @Inject
    protected TickEatTask(Client client, f f2, SquireVorkathConfig squireVorkathConfig) {
        super(client, f2, squireVorkathConfig);
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static String var9(String var10, String var11) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var13 = var11.toCharArray();
        int var14 = var2[1];
        char[] var15 = var10.toCharArray();
        int var16 = var15.length;
        int var17 = var2[1];
        while (I.var18(var17, var16)) {
            char var19 = var15[var17];
            var12.append((char)(var19 ^ var13[var14 % var13.length]));
            0;
            ++var14;
            ++var17;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var12);
    }

    private static boolean var20(Object object) {
        return object == null;
    }

    private static boolean var21(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean var22(Object object) {
        return object != null;
    }

    private static void var23() {
        var1 = new String[var2[4]];
        I.var1[I.var2[1]] = "Zombified Spawn";
        I.var1[I.var2[0]] = "Eat";
        I.var1[I.var2[2]] = "Eat";
        I.var1[I.var2[3]] = "Zombified Spawn";
    }

    private static boolean var24(int n2) {
        return n2 == 0;
    }

    private static void var25() {
        var2 = new int[6];
        I.var2[0] = 1;
        I.var2[1] = (0x84 ^ 0xBC ^ (0xA3 ^ 0xBB)) & (3 ^ 0x3E ^ (0xB3 ^ 0xAE) ^ -1);
        I.var2[2] = 2;
        I.var2[3] = 3;
        I.var2[4] = 2 ^ (0x93 ^ 0x95);
        I.var2[5] = 0x64 ^ 0x6C;
    }

    static {
        I.var25();
        I.var23();
        cn = var1[var2[3]];
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean Q() {
        String[] stringArray = new String[var2[0]];
        stringArray[I.var2[1]] = var1[var2[1]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (I.var22(nPC) && I.var24(nPC.isDead() ? 1 : 0) && I.var21(nPC.distanceTo((Locatable)this.cf.getLocalPlayer()), var2[0])) {
            I var26;
            void var27;
            Item item2 = Inventory.getFirst(item -> item.hasAction(var1[var2[2]]::equals));
            if (I.var20(item2)) {
                return var2[1];
            }
            var27.interact(var1[var2[0]]);
            var26.cg.a(var26.cf.getTickCount());
            return var2[1];
        }
        return var2[1];
    }

        catch (Exception var33) {
            var33.printStackTrace();
            return null;
        }
    }

    private static boolean var18(int n2, int n3) {
        return n2 < n3;
    }
}

