/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.hunter.tasks;

import gg.squire.hunter.tasks.HunterManager;
import gg.squire.hunter.tasks.GameEnum16;
import gg.squire.hunter.tasks.HunterTaskBase;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.hunter.SquireHunterConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.inject.Inject;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Setting Pitfall Trap")
public class SettingPitfallTrapTask
extends HunterTaskBase {

    private static boolean lIIIllIllllIIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIllIlllIllIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIllIlllIlllI(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected boolean x() {
        void var1_1;
        int[] nArray = new int[lllIlllIllIl[0]];
        nArray[y.lllIlllIllIl[1]] = lllIlllIllIl[2];
        if (y.lIIIllIlllIllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return lllIlllIllIl[1];
        }
        TileObject var1 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (y.lIIIllIlllIllll(lllIlllIlIll[lllIlllIllIl[0]].equalsIgnoreCase(tileObject.getName()) ? 1 : 0)) {
                String[] stringArray = new String[lllIlllIllIl[0]];
                stringArray[y.lllIlllIllIl[1]] = lllIlllIlIll[lllIlllIllIl[3]];
                if (y.lIIIllIlllIllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lllIlllIllIl[0];

                    if (null == null) return n2 != 0;
                    return ((0x3C ^ 5 ^ (0x5C ^ 0x2E)) & (0x9B ^ 0xB8 ^ (0xC0 ^ 0xA8) ^ -1)) != 0;
                }
            }
            n2 = lllIlllIllIl[1];
            return n2 != 0;
        });
        if (y.lIIIllIlllIlllI(var1)) {
            return lllIlllIllIl[1];
        }
        var1_1.interact(lllIlllIlIll[lllIlllIllIl[1]]);
        return lllIlllIllIl[0];
    }

    @Inject
    public SettingPitfallTrapTask(a a2, SquireHunterConfig squireHunterConfig) {
        super(a2, squireHunterConfig, e.PITFALL);
    }

    private static void lIIIllIlllIlIII() {
        lllIlllIlIll = new String[lllIlllIllIl[4]];
        y.lllIlllIlIll[y.lllIlllIllIl[1]] = "Trap";
        y.lllIlllIlIll[y.lllIlllIllIl[0]] = "Pit";
        y.lllIlllIlIll[y.lllIlllIllIl[3]] = "Trap";
    }

        return String.valueOf(var2);
    }

    static {
        y.lIIIllIlllIllII();
        y.lIIIllIlllIlIII();
    }

    private static boolean lIIIllIlllIllll(int n2) {
        return n2 != 0;
    }

}

