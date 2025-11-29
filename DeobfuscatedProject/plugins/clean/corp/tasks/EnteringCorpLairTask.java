/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.movement.pathfinder.TeleportLoader
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.corp.tasks;

import gg.squire.corp.tasks.CorpTaskBase;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.corp.SquireCorp;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.TeleportLoader;
import net.unethicalite.api.widgets.Dialog;

@TaskDesc(name="Entering corp lair")
public class EnteringCorpLairTask
extends CorpTaskBase {

    @Inject
    private  SquireCorp p;
    private static final  int w;
    private static final  int v;

    private static boolean lllIIIlIIllllI(int n2) {
        return n2 <= 0;
    }

    private static boolean lllIIIlIIlllll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllIIIlIIlllIl(Object object) {
        return object == null;
    }

    private static void lllIIIlIIllIII() {
        lIlIllllIlIl = new String[lIlIllllIllI[2]];
        q.lIlIllllIlIl[q.lIlIllllIllI[0]] = "Go-through";
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        q var1;
        if (q.lllIIIlIIllIlI(this.g() ? 1 : 0)) {
            return lIlIllllIllI[0];
        }
        NPC var2 = var1.f();
        if (q.lllIIIlIIllIll(var2) && q.lllIIIlIIlllII(Reachable.isInteractable((Locatable)var2) ? 1 : 0)) {
            if (q.lllIIIlIIlllII(var2.isDead() ? 1 : 0)) {
                var1.p.b(lIlIllllIllI[0]);
                var1.sleep(lIlIllllIllI[1]);
            }
            return lIlIllllIllI[0];
        }
        if (q.lllIIIlIIlllII(Dialog.isViewingOptions() ? 1 : 0)) {
            Dialog.chooseOption((int)lIlIllllIllI[2]);

            var1.sleep(lIlIllllIllI[3]);
            return lIlIllllIllI[2];
        }
        int[] nArray = new int[lIlIllllIllI[2]];
        nArray[q.lIlIllllIllI[0]] = lIlIllllIllI[4];
        TileObject var3 = TileObjects.getNearest((int[])nArray);
        if (q.lllIIIlIIllIll(var3) && q.lllIIIlIIllIlI(Reachable.isInteractable((Locatable)var3) ? 1 : 0)) {
            int[] nArray2 = new int[lIlIllllIllI[2]];
            nArray2[q.lIlIllllIllI[0]] = lIlIllllIllI[5];
            TileObject var4 = TileObjects.getNearest((int[])nArray2);
            if (q.lllIIIlIIlllIl(var4)) {
                return lIlIllllIllI[0];
            }
            var4.interact(lIlIllllIlIl[lIlIllllIllI[0]]);
            return lIlIllllIllI[2];
        }
        if (q.lllIIIlIIlllIl(var3)) {
            return lIlIllllIllI[0];
        }
        if (q.lllIIIlIIlllII(Players.getLocal().getWorldLocation().equals((Object)var3.getWorldLocation()) ? 1 : 0)) {
            if (!q.lllIIIlIIllllI(Combat.getMissingHealth()) || q.lllIIIlIIlllll(Combat.getSpecEnergy(), lIlIllllIllI[6])) {
                TeleportLoader.enterHouse();

            }
            return lIlIllllIllI[0];
        }
        Movement.setDestination((WorldPoint)var2_2.getWorldLocation());
        return lIlIllllIllI[2];
    }

    private static boolean lllIIIlIIllIlI(int n2) {
        return n2 == 0;
    }

    static {
        q.lllIIIlIIllIIl();
        q.lllIIIlIIllIII();
        w = lIlIllllIllI[5];
        v = lIlIllllIllI[4];
    }

    private static boolean lllIIIlIIllIll(Object object) {
        return object != null;
    }

    private static boolean lllIIIlIIlllII(int n2) {
        return n2 != 0;
    }
}

