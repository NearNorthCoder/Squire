/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package w.r.e.i.d.r.q.u.e.-.c.u.o.s.o.t.t;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.woodcutting.SquireWoodcutterConfig;
import gg.squire.woodcutting.SquireWoodcutterPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import w.r.e.i.d.r.q.u.e.-.c.u.o.s.o.t.t.IEnum;
import w.r.e.i.d.r.q.u.e.-.c.u.o.s.o.t.t.TrackingTheTreeTask;

/* TASK: Moving to next tree -> MovingtonexttreeTask */
@TaskDesc(name="Moving to next tree", priority=100)
public class MovingToNextTreeTask
extends Task {
    private static /* synthetic */ String[] lIllIIIIlIIIl;
    private final /* synthetic */ SquireWoodcutterConfig J;
    private static /* synthetic */ int[] lIllIIIIlIIlI;
    private final /* synthetic */ SquireWoodcutterPlugin I;

    private static void llIIIlIIIIlllII() {
        lIllIIIIlIIIl = new String[lIllIIIIlIIlI[4]];
        j.lIllIIIIlIIIl[j.lIllIIIIlIIlI[0]] = j."Chop down";
        j.lIllIIIIlIIIl[j.lIllIIIIlIIlI[2]] = j."Chop down";
    }

    private static boolean llIIIlIIIlIIIlI(Object object) {
        return object != null;
    }

    private static String llIIIlIIIIllIll(String var1, String var7) {
        try {
            SecretKeySpec var11 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), lIllIIIIlIIlI[5]), "DES");
            Cipher var13 = Cipher.getInstance("DES");
            var13.init(lIllIIIIlIIlI[4], var11);
            return new String(var13.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIlIIIIlllll(int n) {
        return n != 0;
    }

    private static boolean llIIIlIIIlIIIIl(int n, int n2) {
        return n >= n2;
    }

    private static void llIIIlIIIIlllIl() {
        lIllIIIIlIIlI = new int[6];
        j.lIllIIIIlIIlI[0] = (0x6A ^ 0x3E) & ~(0x39 ^ 0x6D);
        j.lIllIIIIlIIlI[1] = 0x3E ^ 4 ^ (0x20 ^ 0x1F);
        j.lIllIIIIlIIlI[2] = 1;
        j.lIllIIIIlIIlI[3] = -(0xFFFFAE6F & 0x7393) & (0xFFFFBABF & Short.MAX_VALUE);
        j.lIllIIIIlIIlI[4] = 2;
        j.lIllIIIIlIIlI[5] = 0x15 ^ 0x1D;
    }

    @Inject
    public j(SquireWoodcutterPlugin squireWoodcutterPlugin, SquireWoodcutterConfig squireWoodcutterConfig) {
        this.I = squireWoodcutterPlugin;
        this.J = squireWoodcutterConfig;
    }

    public boolean run() {
        j var2;
        if (j.llIIIlIIIIllllI(this.J.fastTickChop() ? 1 : 0)) {
            return lIllIIIIlIIlI[0];
        }
        if (j.llIIIlIIIIlllll(var2.I.p() ? 1 : 0)) {
            return lIllIIIIlIIlI[0];
        }
        Player var3 = Players.getLocal();
        if (j.llIIIlIIIlIIIII(var3)) {
            return lIllIIIIlIIlI[0];
        }
        if (j.llIIIlIIIIllllI(Movement.shouldWalk() ? 1 : 0)) {
            return lIllIIIIlIIlI[0];
        }
        if (j.llIIIlIIIlIIIIl(Movement.getRunEnergy(), lIllIIIIlIIlI[1]) && j.llIIIlIIIIllllI(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
            return lIllIIIIlIIlI[2];
        }
        if (j.llIIIlIIIIllllI(var2.I.j().contains((Locatable)var3) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)var2.I.j().getCenter(), (boolean)lIllIIIIlIIlI[0]);
            0;
            return lIllIIIIlIIlI[2];
        }
        TileObject var5 = TileObjects.getNearest(tileObject -> {
            int n;
            if (j.llIIIlIIIIlllll(tileObject.getName().equals(this.J.tree().r() + " tree") ? 1 : 0)) {
                String[] stringArray = new String[lIllIIIIlIIlI[2]];
                stringArray[j.lIllIIIIlIIlI[0]] = lIllIIIIlIIIl[lIllIIIIlIIlI[2]];
                if (j.llIIIlIIIIlllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n = lIllIIIIlIIlI[2];
                    0;
                    if (-2 < 0) return n != 0;
                    return ((0xDC ^ 0x8B ^ (0x18 ^ 0x6C)) & (2 ^ (0x39 ^ 0x18) ^ -1)) != 0;
                }
            }
            n = lIllIIIIlIIlI[0];
            return n != 0;
        });
        if (j.llIIIlIIIlIIIII(var5)) {
            i var8 = l.x();
            if (j.llIIIlIIIlIIIlI((Object)var8)) {
                Movement.setDestination((WorldPoint)var8.w().getNearest());
                return lIllIIIIlIIlI[2];
            }
            return lIllIIIIlIIlI[0];
        }
        if (j.llIIIlIIIIllllI(var2.J.bank() ? 1 : 0)) {
            int[] nArray = new int[lIllIIIIlIIlI[2]];
            nArray[j.lIllIIIIlIIlI[0]] = lIllIIIIlIIlI[3];
            if (j.llIIIlIIIIlllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lIllIIIIlIIlI[2]];
                nArray2[j.lIllIIIIlIIlI[0]] = lIllIIIIlIIlI[3];
                Inventory.dropAll((int[])nArray2);
                0;
            }
        }
        if (j.llIIIlIIIlIIIIl(var5.distanceTo((Locatable)var3), var2.I.m())) {
            var5.interact(lIllIIIIlIIIl[lIllIIIIlIIlI[0]]);
            return lIllIIIIlIIlI[2];
        }
        return lIllIIIIlIIlI[0];
    }

    private static boolean llIIIlIIIlIIIII(Object object) {
        return object == null;
    }

    static {
        j.llIIIlIIIIlllIl();
        j.llIIIlIIIIlllII();
    }

    private static String llIIIlIIIIllIlI(String var4, String var12) {
        try {
            SecretKeySpec var9 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var12.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var10 = Cipher.getInstance("Blowfish");
            var10.init(lIllIIIIlIIlI[4], var9);
            return new String(var10.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIlIIIIllllI(int n) {
        return n == 0;
    }
}

