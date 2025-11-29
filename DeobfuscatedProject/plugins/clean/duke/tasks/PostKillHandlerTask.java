/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.client.Static
 */
package gg.squire.duke.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.duke.SquireDukeSucellus;
import gg.squire.duke.SquireDukeSucellusConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.duke.tasks.DukeManager;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.h;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.client.Static;

@TaskDesc(name="Post Kill Handler", blocking=true, priority=4999)
public class PostKillHandlerTask
extends Task {
    private final  SquireDukeSucellusConfig aY;
    
    private  a u;
    private final  SquireDukeSucellus aX;

    @Inject
    public PostKillHandlerTask(SquireDukeSucellus squireDukeSucellus, SquireDukeSucellusConfig squireDukeSucellusConfig) {
        this.aY = squireDukeSucellusConfig;
        this.aX = squireDukeSucellus;
        this.u = squireDukeSucellus.s();
    }

    static {
        z.lllIlIIllllIIl();
        z.lllIlIIllllIII();
    }

    private static boolean lllIlIIllllIlI(int n2) {
        return n2 == 0;
    }

        return String.valueOf(var1);
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        z var2;
        if (z.lllIlIIllllIlI(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            return lIllIlllIlll[0];
        }
        if (z.lllIlIIllllIlI(var2.aX.l() ? 1 : 0)) {
            return lIllIlllIlll[0];
        }
        TileObject var3 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (z.lllIlIIlllllIl(tileObject.getName().equals(lIllIlllIllI[lIllIlllIlll[6]]) ? 1 : 0)) {
                String[] stringArray = new String[lIllIlllIlll[1]];
                stringArray[z.lIllIlllIlll[0]] = lIllIlllIllI[lIllIlllIlll[7]];
                if (z.lllIlIIlllllIl(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIllIlllIlll[1];

                    if (2 > ((69 + 25 - 79 + 134 ^ 58 + 78 - 66 + 61) & (131 + 102 - 145 + 100 ^ 3 + 42 - -5 + 120 ^ -1))) return n2 != 0;
                    return ((0xCF ^ 0xAB ^ (0x64 ^ 0x15)) & (0x21 ^ 0x6A ^ (0x9B ^ 0xC5) ^ -1)) != 0;
                }
            }
            n2 = lIllIlllIlll[0];
            return n2 != 0;
        });
        if (z.lllIlIIllllIll(var3)) {
            var2.aX.d(lIllIlllIlll[0]);
            return lIllIlllIlll[0];
        }
        int var4 = Inventory.getAll(item -> {
            int n2;
            if (!z.lllIlIIllllIlI(item.getName().contains(lIllIlllIllI[lIllIlllIlll[4]]) ? 1 : 0) || z.lllIlIIlllllIl(item.getName().contains(lIllIlllIllI[lIllIlllIlll[5]]) ? 1 : 0)) {
                n2 = lIllIlllIlll[1];

                }
            } else {
                n2 = lIllIlllIlll[0];
            }
            return n2 != 0;
        }).stream().mapToInt(item -> Integer.parseInt(item.getName().split(lIllIlllIllI[lIllIlllIlll[1]])[lIllIlllIlll[1]].replace(lIllIlllIllI[lIllIlllIlll[2]], lIllIlllIllI[lIllIlllIlll[3]]))).sum();
        if (z.lllIlIIlllllII(var4, var2.aY.prayDoses())) {
            var2.aX.f(lIllIlllIlll[1]);
            var2.aX.g(lIllIlllIlll[1]);
            var2.aX.d(lIllIlllIlll[0]);
            return lIllIlllIlll[0];
        }
        int var5 = Inventory.getCount(item -> {
            String[] stringArray = new String[lIllIlllIlll[1]];
            stringArray[z.lIllIlllIlll[0]] = lIllIlllIllI[lIllIlllIlll[0]];
            return item.hasAction(stringArray);
        });
        if (z.lllIlIIlllllII(var5, var2.aY.food())) {
            var2.aX.f(lIllIlllIlll[1]);
            var2.aX.g(lIllIlllIlll[1]);
            var2.aX.d(lIllIlllIlll[0]);
            return lIllIlllIlll[0];
        }
        if (z.lllIlIIlllllIl(Players.getLocal().getWorldLocation().equals((Object)h.e(var3)) ? 1 : 0)) {
            var2.aX.d(lIllIlllIlll[0]);
            return lIllIlllIlll[0];
        }
        Movement.setDestination((WorldPoint)h.e((TileObject)var1_1));
        return lIllIlllIlll[1];
    }

    private static boolean lllIlIIllllIll(Object object) {
        return object == null;
    }

    private static void lllIlIIllllIII() {
        lIllIlllIllI = new String[lIllIlllIlll[8]];
        z.lIllIlllIllI[z.lIllIlllIlll[0]] = "Eat";
        z.lIllIlllIllI[z.lIllIlllIlll[1]] = "\\(";
        z.lIllIlllIllI[z.lIllIlllIlll[2]] = ")";
        z.lIllIlllIllI[z.lIllIlllIlll[3]] = z.lllIlIIlllIllI("", "IWpyI");
        z.lIllIlllIllI[z.lIllIlllIlll[4]] = "Prayer";
        z.lIllIlllIllI[z.lIllIlllIlll[5]] = "restore";
        z.lIllIlllIllI[z.lIllIlllIlll[6]] = "Gate";
        z.lIllIlllIllI[z.lIllIlllIlll[7]] = "Leave";
    }

    private static boolean lllIlIIlllllIl(int n2) {
        return n2 != 0;
    }

    private static boolean lllIlIIlllllII(int n2, int n3) {
        return n2 < n3;
    }
}

