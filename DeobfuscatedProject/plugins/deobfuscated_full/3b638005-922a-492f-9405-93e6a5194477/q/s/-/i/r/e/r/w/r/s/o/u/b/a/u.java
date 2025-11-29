/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.GameState
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.movement.Movement
 */
package q.s.-.i.r.e.r.w.r.s.o.u.b.a;

import gg.squire.barrows.SquireBarrows;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.GameState;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.movement.Movement;

/* TASK: Teleporting to barrows -> TeleportingtobarrowsTask */
@TaskDesc(name="Teleporting to barrows", priority=100)
public class u
extends Task {
    private static /* synthetic */ int[] llllIIlllll;
    private static /* synthetic */ String[] llllIIllllI;
    private final /* synthetic */ SquireBarrows ag;

    static {
        u.lIllIlIIllIlIl();
        u.lIllIlIIllIlII();
    }

    private static boolean lIllIlIIllIllI(Object object, Object object2) {
        return object != object2;
    }

    private static void lIllIlIIllIlII() {
        llllIIllllI = new String[llllIIlllll[6]];
        u.llllIIllllI[u.llllIIlllll[0]] = u."Portal Nexus";
        u.llllIIllllI[u.llllIIlllll[2]] = u."Barrows";
        u.llllIIllllI[u.llllIIlllll[3]] = u."Barrows";
    }

    private static void lIllIlIIllIlIl() {
        llllIIlllll = new int[8];
        u.llllIIlllll[0] = (0x21 ^ 0x5F ^ (0x12 ^ 0x2C)) & (0x6A ^ 0xF ^ (0x90 ^ 0xB5) ^ -1);
        u.llllIIlllll[1] = 0x10 ^ 0x4B ^ (0xC4 ^ 0x8B);
        u.llllIIlllll[2] = 1;
        u.llllIIlllll[3] = 2;
        u.llllIIlllll[4] = 0xFFFFAFEB & 0x5DFF;
        u.llllIIlllll[5] = 0xFFFF9EF3 & 0x6DFD;
        u.llllIIlllll[6] = 3;
        u.llllIIlllll[7] = 0xA1 ^ 0xA9;
    }

    private static boolean lIllIlIIlllIll(int n2, int n3) {
        return n2 < n3;
    }

    private boolean J() {
        WorldPoint worldPoint = new WorldPoint(llllIIlllll[4], llllIIlllll[5], llllIIlllll[0]);
        if (u.lIllIlIIlllIII(Movement.shouldWalk() ? 1 : 0)) {
            return llllIIlllll[2];
        }
        Movement.walkTo((WorldPoint)worldPoint);
        0;
        return llllIIlllll[2];
    }

    private static boolean lIllIlIIlllIII(int n2) {
        return n2 == 0;
    }

    private static String lIllIlIIllIIll(String var12, String var16) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var11 = new StringBuilder();
        char[] var10 = var16.toCharArray();
        int var2 = llllIIlllll[0];
        char[] var1 = var12.toCharArray();
        int var14 = var1.length;
        int var13 = llllIIlllll[0];
        while (u.lIllIlIIlllIll(var13, var14)) {
            char var15 = var1[var13];
            var11.append((char)(var15 ^ var10[var2 % var10.length]));
            0;
            ++var2;
            ++var13;
            0;
            if (-2 < 0) continue;
            return null;
        }
        return String.valueOf(var11);
    }

    private static String lIllIlIIllIIlI(String var4, String var7) {
        try {
            SecretKeySpec var9 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), llllIIlllll[7]), "DES");
            Cipher var3 = Cipher.getInstance("DES");
            var3.init(llllIIlllll[3], var9);
            return new String(var3.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIlIIlllIlI(Object object) {
        return object != null;
    }

    private static boolean lIllIlIIlllIIl(int n2, int n3) {
        return n2 > n3;
    }

    @Inject
    public u(SquireBarrows squireBarrows) {
        this.ag = squireBarrows;
    }

    private static boolean lIllIlIIllIlll(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        block9: {
            u var5;
            block8: {
                if (u.lIllIlIIllIllI(Game.getState(), GameState.LOGGED_IN)) {
                    return llllIIlllll[0];
                }
                if (u.lIllIlIIllIlll(var5.ag.u() ? 1 : 0)) {
                    return llllIIlllll[0];
                }
                if (u.lIllIlIIlllIII(Movement.isRunEnabled() ? 1 : 0) && u.lIllIlIIlllIIl(Movement.getRunEnergy(), llllIIlllll[1])) {
                    Movement.toggleRun();
                }
                if (!u.lIllIlIIlllIII(var5.ag.h() ? 1 : 0) || u.lIllIlIIllIlll(var5.ag.m() ? 1 : 0)) {
                    return llllIIlllll[0];
                }
                String[] stringArray = new String[llllIIlllll[2]];
                stringArray[u.llllIIlllll[0]] = llllIIllllI[llllIIlllll[0]];
                TileObject var8 = TileObjects.getNearest((String[])stringArray);
                if (!u.lIllIlIIlllIlI(var8)) break block8;
                String[] stringArray2 = new String[llllIIlllll[2]];
                stringArray2[u.llllIIlllll[0]] = llllIIllllI[llllIIlllll[2]];
                if (!u.lIllIlIIlllIII(var8.hasAction(stringArray2) ? 1 : 0)) break block9;
            }
            return var5.J();
        }
        if (u.lIllIlIIllIlll(Players.getLocal().isMoving() ? 1 : 0)) {
            return llllIIlllll[0];
        }
        var1_1.interact(llllIIllllI[llllIIlllll[3]]);
        return llllIIlllll[2];
    }
}

