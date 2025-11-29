/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.GameObject
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.hunter.tasks;

import gg.squire.hunter.tasks.HunterManager;
import gg.squire.hunter.tasks.HunterTaskBase;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.hunter.SquireHunterConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.inject.Inject;
import net.runelite.api.GameObject;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Getting a log")
public class GettingALogTask
extends HunterTaskBase {

        return String.valueOf(var1);
    }

    private static boolean lIIIllIlIllIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIllIlIllIIlI(int n2) {
        return n2 != 0;
    }

    @Inject
    public GettingALogTask(a a2, SquireHunterConfig squireHunterConfig) {
        super(a2, squireHunterConfig);
    }

    static {
        v.lIIIllIlIlIlllI();
        v.lIIIllIlIlIllIl();
    }

    private static boolean lIIIllIlIlIllll(Object object) {
        return object != null;
    }

    private static boolean lIIIllIlIllIIII(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected boolean x() {
        TileObject var2;
        NPC nPC;
        TileObject tileObject2 = this.G();
        if (v.lIIIllIlIlIllll(tileObject2)) {
            void var3;
            nPC = this.E();
            if (v.lIIIllIlIllIIII(nPC) && v.lIIIllIlIllIIII(nPC = this.D())) {
                return lllIllIlIlIl[0];
            }
            if (v.lIIIllIlIllIIIl(((GameObject)var3).getWorldArea().contains(var2.getWorldLocation()) ? 1 : 0)) {
                return lllIllIlIlIl[0];
            }
        }
        int[] nArray = new int[lllIllIlIlIl[1]];
        nArray[v.lllIllIlIlIl[0]] = lllIllIlIlIl[2];
        if (v.lIIIllIlIllIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return lllIllIlIlIl[0];
        }
        var2 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (v.lIIIllIlIllIIlI(lllIllIlIlII[lllIllIlIlIl[1]].equalsIgnoreCase(tileObject.getName()) ? 1 : 0)) {
                String[] stringArray = new String[lllIllIlIlIl[1]];
                stringArray[v.lllIllIlIlIl[0]] = lllIllIlIlII[lllIllIlIlIl[3]];
                if (v.lIIIllIlIllIIlI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lllIllIlIlIl[1];

                    if (null == null) return n2 != 0;
                    return false;
                }
            }
            n2 = lllIllIlIlIl[0];
            return n2 != 0;
        });
        if (v.lIIIllIlIllIIII(var2)) {
            return lllIllIlIlIl[0];
        }
        nPC.interact(lllIllIlIlII[lllIllIlIlIl[0]]);
        return lllIllIlIlIl[1];
    }

    private static void lIIIllIlIlIllIl() {
        lllIllIlIlII = new String[lllIllIlIlIl[4]];
        v.lllIllIlIlII[v.lllIllIlIlIl[0]] = "Chop down";
        v.lllIllIlIlII[v.lllIllIlIlIl[1]] = "Tree";
        v.lllIllIlIlII[v.lllIllIlIlIl[3]] = "Chop down";
    }

    private static boolean lIIIllIlIllIIIl(int n2) {
        return n2 == 0;
    }

}

