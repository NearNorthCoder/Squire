/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.duke.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.duke.SquireDukeSucellus;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.duke.tasks.DukeManager;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.h;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Collect Musca Mushroom", priority=98, blocking=true)
public class CollectMuscaMushroomTask
extends Task {
    
    private final  a by;
    
    private final  SquireDukeSucellus bx;

    private static boolean lllIlIIlIlIIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lllIlIIlIlIIll(Object object) {
        return object == null;
    }

    private static boolean lllIlIIlIlIlll(int n2, int n3) {
        return n2 < n3;
    }

    static {
        M.lllIlIIlIlIIII();
        M.lllIlIIlIIllIl();
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var4_4;
        if (M.lllIlIIlIlIIIl(this.by.w())) {
            return lIllIllIlIIl[0];
        }
        TileObject var1 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (M.lllIlIIlIlIIIl(tileObject.getName().equals(lIllIllIIllI[lIllIllIlIIl[4]]) ? 1 : 0)) {
                String[] stringArray = new String[lIllIllIlIIl[1]];
                stringArray[M.lIllIllIlIIl[0]] = lIllIllIIllI[lIllIllIlIIl[5]];
                if (M.lllIlIIlIlIIIl(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIllIllIlIIl[1];

                    if (((0x44 ^ 0x1D) & ~(0xE3 ^ 0xBA)) >= -1) return n2 != 0;
                    return false;
                }
            }
            n2 = lIllIllIlIIl[0];
            return n2 != 0;
        });
        if (M.lllIlIIlIlIIll(var1)) {
            return lIllIllIlIIl[0];
        }
        Player var2 = Players.getLocal();
        if (M.lllIlIIlIlIIll(var2)) {
            return lIllIllIlIIl[0];
        }
        if (M.lllIlIIlIlIlII(h.t(var1).contains((Locatable)var2) ? 1 : 0)) {
            return lIllIllIlIIl[0];
        }
        String[] stringArray = new String[lIllIllIlIIl[1]];
        stringArray[M.lIllIllIlIIl[0]] = lIllIllIIllI[lIllIllIlIIl[0]];
        Item var3 = Inventory.getFirst((String[])stringArray);
        if (M.lllIlIIlIlIlIl(var3) && M.lllIlIIlIlIllI(var3.getQuantity(), lIllIllIlIIl[2])) {
            return lIllIllIlIIl[0];
        }
        String[] stringArray2 = new String[lIllIllIlIIl[1]];
        stringArray2[M.lIllIllIlIIl[0]] = lIllIllIIllI[lIllIllIlIIl[1]];
        TileObject var4 = TileObjects.getNearest((String[])stringArray2);
        if (M.lllIlIIlIlIIll(var4)) {
            return lIllIllIlIIl[0];
        }
        var4_4.interact(lIllIllIIllI[lIllIllIlIIl[3]]);
        return lIllIllIlIIl[1];
    }

    private static boolean lllIlIIlIlIlIl(Object object) {
        return object != null;
    }

    private static boolean lllIlIIlIlIllI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lllIlIIlIlIlII(int n2) {
        return n2 == 0;
    }

        return String.valueOf(var5);
    }

    private static void lllIlIIlIIllIl() {
        lIllIllIIllI = new String[lIllIllIlIIl[6]];
        M.lIllIllIIllI[M.lIllIllIlIIl[0]] = "Musca powder";
        M.lIllIllIIllI[M.lIllIllIlIIl[1]] = "Musca mushrooms";
        M.lIllIllIIllI[M.lIllIllIlIIl[3]] = "Pick";
        M.lIllIllIIllI[M.lIllIllIlIIl[4]] = "Gate";
        M.lIllIllIIllI[M.lIllIllIlIIl[5]] = "Quick-escape";
    }

    @Inject
    public CollectMuscaMushroomTask(SquireDukeSucellus squireDukeSucellus) {
        this.bx = squireDukeSucellus;
        this.by = squireDukeSucellus.s();
    }
}

