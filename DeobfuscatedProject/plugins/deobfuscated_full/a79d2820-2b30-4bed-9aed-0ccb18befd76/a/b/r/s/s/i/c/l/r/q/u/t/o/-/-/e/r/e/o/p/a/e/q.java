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
package a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e;

import a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e.a;
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

/* TASK: Entering corp lair -> EnteringcorplairTask */
@TaskDesc(name="Entering corp lair")
public class q
extends a {
    private static /* synthetic */ int[] lIlIllllIllI;
    private static /* synthetic */ String[] lIlIllllIlIl;
    @Inject
    private /* synthetic */ SquireCorp p;
    private static final /* synthetic */ int w;
    private static final /* synthetic */ int v;

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
        q.lIlIllllIlIl[q.lIlIllllIllI[0]] = q."Go-through";
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        q var6;
        if (q.lllIIIlIIllIlI(this.g() ? 1 : 0)) {
            return lIlIllllIllI[0];
        }
        NPC var1 = var6.f();
        if (q.lllIIIlIIllIll(var1) && q.lllIIIlIIlllII(Reachable.isInteractable((Locatable)var1) ? 1 : 0)) {
            if (q.lllIIIlIIlllII(var1.isDead() ? 1 : 0)) {
                var6.p.b(lIlIllllIllI[0]);
                var6.sleep(lIlIllllIllI[1]);
            }
            return lIlIllllIllI[0];
        }
        if (q.lllIIIlIIlllII(Dialog.isViewingOptions() ? 1 : 0)) {
            Dialog.chooseOption((int)lIlIllllIllI[2]);
            0;
            var6.sleep(lIlIllllIllI[3]);
            return lIlIllllIllI[2];
        }
        int[] nArray = new int[lIlIllllIllI[2]];
        nArray[q.lIlIllllIllI[0]] = lIlIllllIllI[4];
        TileObject var4 = TileObjects.getNearest((int[])nArray);
        if (q.lllIIIlIIllIll(var4) && q.lllIIIlIIllIlI(Reachable.isInteractable((Locatable)var4) ? 1 : 0)) {
            int[] nArray2 = new int[lIlIllllIllI[2]];
            nArray2[q.lIlIllllIllI[0]] = lIlIllllIllI[5];
            TileObject var5 = TileObjects.getNearest((int[])nArray2);
            if (q.lllIIIlIIlllIl(var5)) {
                return lIlIllllIllI[0];
            }
            var5.interact(lIlIllllIlIl[lIlIllllIllI[0]]);
            return lIlIllllIllI[2];
        }
        if (q.lllIIIlIIlllIl(var4)) {
            return lIlIllllIllI[0];
        }
        if (q.lllIIIlIIlllII(Players.getLocal().getWorldLocation().equals((Object)var4.getWorldLocation()) ? 1 : 0)) {
            if (!q.lllIIIlIIllllI(Combat.getMissingHealth()) || q.lllIIIlIIlllll(Combat.getSpecEnergy(), lIlIllllIllI[6])) {
                TeleportLoader.enterHouse();
                0;
            }
            return lIlIllllIllI[0];
        }
        Movement.setDestination((WorldPoint)var2_2.getWorldLocation());
        return lIlIllllIllI[2];
    }

    private static boolean lllIIIlIIllIlI(int n2) {
        return n2 == 0;
    }

    private static void lllIIIlIIllIIl() {
        lIlIllllIllI = new int[8];
        q.lIlIllllIllI[0] = (9 ^ 0) & ~(0x5B ^ 0x52);
        q.lIlIllllIllI[1] = 0xAB ^ 0xA1;
        q.lIlIllllIllI[2] = 1;
        q.lIlIllllIllI[3] = 2;
        q.lIlIllllIllI[4] = -(0xFFFFFFEB & 0x615E) & (0xFFFFF3EF & 0x6FFD);
        q.lIlIllllIllI[5] = -(0xFFFFDDCF & 0x3773) & (0xFFFFD7FF & 0x3FE7);
        q.lIlIllllIllI[6] = 0xD8 ^ 0x91 ^ (0x64 ^ 0x49);
        q.lIlIllllIllI[7] = 39 + 30 - 54 + 128 ^ 101 + 11 - 97 + 120;
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

    private static String lllIIIlIIlIlll(String var3, String var9) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var9.getBytes(StandardCharsets.UTF_8)), lIlIllllIllI[7]), "DES");
            Cipher var7 = Cipher.getInstance("DES");
            var7.init(lIlIllllIllI[3], var8);
            return new String(var7.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var2) {
            var2.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIIlIIlllII(int n2) {
        return n2 != 0;
    }
}

