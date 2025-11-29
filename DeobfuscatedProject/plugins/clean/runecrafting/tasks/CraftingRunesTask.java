/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.GameObject
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.client.Static
 */
package gg.squire.runecrafting.tasks;

import gg.squire.runecrafting.tasks.GameEnum14;
import gg.squire.runecrafting.tasks.RunecraftingTaskBase;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.runecrafting.SquireGOTRPlugin;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.inject.Inject;
import net.runelite.api.GameObject;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;

@TaskDesc(name="Crafting runes", priority=5, blocking=true)
public class CraftingRunesTask
extends RunecraftingTaskBase {

    private static boolean llllllllllIlIl(int n2) {
        return n2 <= 0;
    }

    static {
        p.llllllllllIlII();
        p.llllllllllIIIl();
    }

    private static boolean llllllllllIlll(int n2) {
        return n2 != 0;
    }

    private static boolean lllllllllllIIl(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected boolean ak() {
        void var2_2;
        p var1;
        int var2;
        int n2;
        int[] nArray = new int[llIIlllllllI[2]];
        nArray[p.llIIlllllllI[1]] = llIIlllllllI[3];
        if (!p.llllllllllIlIl(Inventory.getCount((int[])nArray)) || p.llllllllllIllI(this.aV.S(), Static.getClient().getTickCount())) {
            n2 = llIIlllllllI[2];

            if (1 < 0) {
                return ((187 + 68 - 215 + 171 ^ 9 + 69 - 77 + 138) & (0xD0 ^ 0xA9 ^ (0x14 ^ 0x35) ^ -1)) != 0;
            }
        } else {
            n2 = llIIlllllllI[1];
        }
        if (!p.llllllllllIlll(var2 = n2) || p.llllllllllIlll(var1.aV.g() ? 1 : 0)) {
            return llIIlllllllI[1];
        }
        String[] stringArray = new String[llIIlllllllI[2]];
        stringArray[p.llIIlllllllI[1]] = llIIllllllIl[llIIlllllllI[1]];
        TileObject var3 = TileObjects.getNearest((String[])stringArray);
        if (p.lllllllllllIII(var3)) {
            return llIIlllllllI[1];
        }
        if (p.llllllllllIlll(var1.b((GameObject)var3) ? 1 : 0)) {
            return llIIlllllllI[2];
        }
        var2_2.interact(llIIllllllIl[llIIlllllllI[2]]);
        return llIIlllllllI[2];
    }

    private static void llllllllllIIIl() {
        llIIllllllIl = new String[llIIlllllllI[0]];
        p.llIIllllllIl[p.llIIlllllllI[1]] = "Altar";
        p.llIIllllllIl[p.llIIlllllllI[2]] = "Craft-rune";
    }

    private static boolean llllllllllIllI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lllllllllllIII(Object object) {
        return object == null;
    }

        return String.valueOf(var4);
    }

    @Inject
    public CraftingRunesTask(SquireGOTRPlugin squireGOTRPlugin) {
        c[] cArray = new c[llIIlllllllI[0]];
        cArray[p.llIIlllllllI[1]] = c.ACTIVE;
        cArray[p.llIIlllllllI[2]] = c.FINISHING;
        super(squireGOTRPlugin, cArray);
    }

}

