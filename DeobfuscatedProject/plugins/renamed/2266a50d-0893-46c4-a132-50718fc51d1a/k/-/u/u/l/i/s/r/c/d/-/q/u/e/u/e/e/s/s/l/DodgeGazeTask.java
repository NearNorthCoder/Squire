/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.client.Static
 */
package k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.duke.SquireDukeSucellus;
import gg.squire.duke.SquireDukeSucellusConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.a_Unknown;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.e_Unknown;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.client.Static;

/* TASK: Dodge Gaze -> DodgegazeTask */
@TaskDesc(name="Dodge Gaze", priority=500, blocking=true)
public class DodgeGazeTask
extends Task {
    final /* synthetic */ SquireDukeSucellus aG;
    private static /* synthetic */ String[] lIllIlllIIlI;
    final /* synthetic */ a aH;
    private static /* synthetic */ int[] lIllIlllIIll;
    final /* synthetic */ SquireDukeSucellusConfig aI;

    private static boolean lllIlIIllIllll(Object object) {
        return object == null;
    }

    private static boolean lllIlIIlllIIIl(int n2, int n3) {
        return n2 <= n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        t var9;
        NPC nPC2 = NPCs.getNearest(nPC -> nPC.getName().equals(lIllIlllIIlI[lIllIlllIIll[1]]));
        if (t.lllIlIIllIllll(nPC2)) {
            return lIllIlllIIll[0];
        }
        TileObject var10 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (t.lllIlIIlllIIII(tileObject.getName().equals(lIllIlllIIlI[lIllIlllIIll[0]]) ? 1 : 0)) {
                String[] stringArray = new String[lIllIlllIIll[2]];
                stringArray[t.lIllIlllIIll[0]] = lIllIlllIIlI[lIllIlllIIll[2]];
                if (t.lllIlIIlllIIII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIllIlllIIll[2];
                    0;
                    if (1 < 3) return n2 != 0;
                    return false;
                }
            }
            n2 = lIllIlllIIll[0];
            return n2 != 0;
        });
        if (t.lllIlIIllIllll(var10)) {
            return lIllIlllIIll[0];
        }
        Player var7 = Players.getLocal();
        if (t.lllIlIIllIllll(var7)) {
            return lIllIlllIIll[0];
        }
        int var6 = Static.getClient().getTickCount();
        int var5 = var6 - var9.aH.C();
        if (t.lllIlIIlllIIII(var9.aI.safeDodge() ? 1 : 0) && !t.lllIlIIlllIIIl(var5, lIllIlllIIll[1]) || t.lllIlIIlllIIlI(var9.aI.safeDodge() ? 1 : 0) && t.lllIlIIlllIIll(var5, lIllIlllIIll[1])) {
            return lIllIlllIIll[0];
        }
        if (t.lllIlIIlllIIII(e.r(var10) ? 1 : 0)) {
            Movement.setDestination((WorldPoint)e.o(var10));
            return lIllIlllIIll[2];
        }
        Movement.setDestination((WorldPoint)e.m((TileObject)var2_2));
        return lIllIlllIIll[2];
    }

    private static void lllIlIIllIllIl() {
        lIllIlllIIlI = new String[lIllIlllIIll[3]];
        t.lIllIlllIIlI[t.lIllIlllIIll[0]] = t."Gate";
        t.lIllIlllIIlI[t.lIllIlllIIll[2]] = t."Quick-escape";
        t.lIllIlllIIlI[t.lIllIlllIIll[1]] = t."Duke Sucellus";
    }

    @Inject
    public t(SquireDukeSucellus squireDukeSucellus, SquireDukeSucellusConfig squireDukeSucellusConfig) {
        this.aG = squireDukeSucellus;
        this.aH = squireDukeSucellus.s();
        this.aI = squireDukeSucellusConfig;
    }

    private static boolean lllIlIIlllIIlI(int n2) {
        return n2 == 0;
    }

    private static void lllIlIIllIlllI() {
        lIllIlllIIll = new int[4];
        t.lIllIlllIIll[0] = (0x39 ^ 0x6B) & ~(0x13 ^ 0x41);
        t.lIllIlllIIll[1] = 2;
        t.lIllIlllIIll[2] = 1;
        t.lIllIlllIIll[3] = 3;
    }

    private static boolean lllIlIIlllIIII(int n2) {
        return n2 != 0;
    }

    private static boolean lllIlIIlllIIll(int n2, int n3) {
        return n2 != n3;
    }

    private static String lllIlIIllIllII(String var4, String var1) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var3 = Cipher.getInstance("Blowfish");
            var3.init(lIllIlllIIll[1], var2);
            return new String(var3.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    static {
        t.lllIlIIllIlllI();
        t.lllIlIIllIllIl();
    }
}

