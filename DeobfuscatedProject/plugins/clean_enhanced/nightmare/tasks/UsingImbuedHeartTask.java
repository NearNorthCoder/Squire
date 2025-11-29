/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Necromancy
 */
package gg.squire.nightmare.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import gg.squire.nightmare.tasks.NightmareManager;
import gg.squire.nightmare.tasks.NightmareManager;

@TaskDesc(name="Using imbued heart", priority=6)
public class UsingImbuedHeartTask
extends NightmareManager {

    private static boolean var3(int n2) {
        return n2 != 0;
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    static {
        as.var10();
        as.var11();
    }

    private static void var11() {
        var2 = new String[var1[3]];
        as.var2[as.var1[0]] = "Invigorate";
    }

    @Inject
    protected UsingImbuedHeartTask(j j2, Client client, SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin) {
        super(j2, client, squireNightmareConfig, squireNightmarePlugin);
    }

    private static void var10() {
        var1 = new int[7];
        as.var1[0] = (1 + 82 - 49 + 144 ^ 102 + 6 - -18 + 24) & (60 + 97 - 79 + 69 ^ 102 + 86 - 82 + 77 ^ -1);
        as.var1[1] = 2;
        as.var1[2] = 0xFFFFF9F4 & 0x56FF;
        as.var1[3] = 1;
        as.var1[4] = -1 & (0xFFFFEFFB & 0x7BFD);
        as.var1[5] = -(0xFFFFEAAF & 0x175F) & (0xFFFF9FFF & 0x76FF);
        as.var1[6] = 0xAC ^ 0xA4;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bY() {
        void var2_2;
        SpellBook.Necromancy necromancy = SpellBook.Necromancy.RESURRECT_GREATER_GHOST;
        if (as.var3(this.bZ() ? 1 : 0) && as.var12(Magic.canCast((Spenecromancy) ? 1 : 0)) {
            return var1[0];
        }
        int[] nArray = new int[var1[1]];
        nArray[as.var1[0]] = var1[2];
        nArray[as.var1[3]] = var1[4];
        Item var13 = Inventory.getFirst((int[])nArray);
        if (as.var14(var13)) {
            return var1[0];
        }
        int var15 = Vars.getBit((int)var1[5]);
        if (as.var16(var15)) {
            return var1[0];
        }
        var2_2.interact(var2[var1[0]]);
        return var1[3];
    }

    private static boolean var12(int n2) {
        return n2 == 0;
    }

    private static boolean var16(int n2) {
        return n2 > 0;
    }

    private static boolean var14(Object object) {
        return object == null;
    }
}

