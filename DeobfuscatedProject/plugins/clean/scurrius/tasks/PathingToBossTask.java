/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.scurrius.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.scurrius.SquireScurrius;
import gg.squire.scurrius.SquireScurriusConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
import gg.squire.scurrius.tasks.BHelper;
import gg.squire.scurrius.tasks.ScurriusTaskBase;

@TaskDesc(name="Pathing to Boss", priority=0x7FFFFF37, blocking=true)
public class PathingToBossTask
extends ScurriusTaskBase {
    
    private final  SquireScurrius R;
    
    private final  b S;
    private  WorldArea V;
    private static  WorldPoint Q;
    private final  SquireScurriusConfig T;
    private final  int U = 4661;

    static {
        k.lIlIllIlIIIIIII();
        k.lIlIllIIlllllII();
        Q = new WorldPoint(lIIlIllIIlllI[9], lIIlIllIIlllI[10], lIIlIllIIlllI[3]);
    }

    private static boolean lIlIllIlIIIIIll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIllIlIIIIlII(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public boolean a() {
        k var1;
        if (k.lIlIllIlIIIIIIl(this.c() ? 1 : 0)) {
            return lIIlIllIIlllI[3];
        }
        if (k.lIlIllIlIIIIIIl(var1.R.PathingToBossTask() ? 1 : 0)) {
            var1.R.forceStop();
            return lIIlIllIIlllI[6];
        }
        Player var2 = Players.getLocal();
        if (k.lIlIllIlIIIIIlI(var2)) {
            return lIIlIllIIlllI[3];
        }
        if (k.lIlIllIlIIIIIIl(var1.V.contains((Locatable)var2) ? 1 : 0)) {
            if (k.lIlIllIlIIIIIIl(Dialog.isViewingOptions() ? 1 : 0)) {
                String[] stringArray = new String[lIIlIllIIlllI[6]];
                stringArray[k.lIIlIllIIlllI[3]] = lIIlIllIIllII[lIIlIllIIlllI[3]];
                Dialog.chooseOption((String[])stringArray);

                return lIIlIllIIlllI[6];
            }
            var1.a(lIIlIllIIllII[lIIlIllIIlllI[6]], lIIlIllIIllII[lIIlIllIIlllI[7]], lIIlIllIIlllI[8], var2);
            return lIIlIllIIlllI[6];
        }
        Movement.walkTo((WorldPoint)Q);

        return lIIlIllIIlllI[6];
    }

        return String.valueOf(var3);
    }

    @Override
    public boolean run() {
        if (k.lIlIllIlIIIIIIl(this.R.m() ? 1 : 0)) {
            return lIIlIllIIlllI[3];
        }
        return this.a();
    }

    @Inject
    public PathingToBossTask(SquireScurrius squireScurrius, SquireScurriusConfig squireScurriusConfig) {
        this.U = lIIlIllIIlllI[0];
        this.V = new WorldArea(new WorldPoint(lIIlIllIIlllI[1], lIIlIllIIlllI[2], lIIlIllIIlllI[3]), new WorldPoint(lIIlIllIIlllI[4], lIIlIllIIlllI[5], lIIlIllIIlllI[3]));
        this.R = squireScurrius;
        this.S = squireScurrius.n();
        this.T = squireScurriusConfig;
    }

    private static boolean lIlIllIlIIIIIIl(int n2) {
        return n2 != 0;
    }

    private static void lIlIllIIlllllII() {
        lIIlIllIIllII = new String[lIIlIllIIlllI[11]];
        k.lIIlIllIIllII[k.lIIlIllIIlllI[3]] = "Private";
        k.lIIlIllIIllII[k.lIIlIllIIlllI[6]] = "Broken bars";
        k.lIIlIllIIllII[k.lIIlIllIIlllI[7]] = "Climb-through (private)";
    }

    /*
     * WARNING - void declaration
     */
    private void a(String string, String string2, int n2, Player player) {
        void var4;
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> {
            int n3;
            if (k.lIlIllIlIIIIIll(tileObject.getId(), n2) && k.lIlIllIlIIIIIIl(tileObject.getName().equals(string) ? 1 : 0)) {
                String[] stringArray = new String[lIIlIllIIlllI[6]];
                stringArray[k.lIIlIllIIlllI[3]] = string2;
                if (k.lIlIllIlIIIIIIl(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n3 = lIIlIllIIlllI[6];

                    if (-3 <= 0) return n3 != 0;
                    return ((0x60 ^ 0x24 ^ (0xC3 ^ 0x80)) & (0x59 ^ 0x60 ^ (0x4A ^ 0x74) ^ -1)) != 0;
                }
            }
            n3 = lIIlIllIIlllI[3];
            return n3 != 0;
        });
        if (k.lIlIllIlIIIIIlI(tileObject2)) {
            return;
        }
        if (k.lIlIllIlIIIIIIl(var4.isMoving() ? 1 : 0)) {
            return;
        }
        tileObject2.interact(string2);
    }

    private static boolean lIlIllIlIIIIIlI(Object object) {
        return object == null;
    }
}

