/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.GameObject
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package -.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e;

import -.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e.AEnum;
import -.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e.b_Unknown;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.wintertodt.SquireWintertodtConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.GameObject;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

/* TASK: Burning at brazier -> BurningatbrazierTask */
@TaskDesc(name="Burning at brazier", register=true)
public class BurningAtBrazierTask
extends Task {
    private static final /* synthetic */ int H;
    private static /* synthetic */ int[] lIlIllllIIlIl;
    private static final /* synthetic */ int G;
    private final /* synthetic */ b I;
    private static /* synthetic */ String[] lIlIllllIIlII;
    private final /* synthetic */ SquireWintertodtConfig J;
    private /* synthetic */ int K;

    @Subscribe
    public void b(ChatMessage chatMessage) {
        String string = chatMessage.getMessage();
        if (!g.llIIIIlIllIIlIl(string.contains(lIlIllllIIlII[lIlIllllIIlIl[6]]) ? 1 : 0) || g.llIIIIlIllIIIll(string.contains(lIlIllllIIlII[lIlIllllIIlIl[5]]) ? 1 : 0)) {
            llllllllllllllIllIIllllIlIlllllI.K = lIlIllllIIlIl[0];
        }
    }

    private static String llIIIIlIlIllllI(String var14, String var9) {
        try {
            SecretKeySpec var11 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var9.getBytes(StandardCharsets.UTF_8)), lIlIllllIIlIl[10]), "DES");
            Cipher var6 = Cipher.getInstance("DES");
            var6.init(lIlIllllIIlIl[6], var11);
            return new String(var6.doFinal(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    @Inject
    public g(SquireWintertodtConfig squireWintertodtConfig, b b2) {
        this.K = lIlIllllIIlIl[0];
        this.J = squireWintertodtConfig;
        this.I = b2;
    }

    private static boolean llIIIIlIllIIlIl(int n2) {
        return n2 == 0;
    }

    private static void llIIIIlIllIIIlI() {
        lIlIllllIIlIl = new int[11];
        g.lIlIllllIIlIl[0] = (99 + 11 - -9 + 23 ^ 71 + 69 - 73 + 85) & ((0x69 ^ 0x32) & ~(0xC4 ^ 0x9F) ^ (0x14 ^ 2) ^ -1);
        g.lIlIllllIIlIl[1] = 1;
        g.lIlIllllIIlIl[2] = -(0xFFFF9FC5 & 0x793F) & (0xFFFFFDED & 0x1FF6);
        g.lIlIllllIIlIl[3] = 0xFFFFD7D7 & 0x78FF;
        g.lIlIllllIIlIl[4] = -(0xFFFFFDDF & 0x7EBB) & (0xFFFFFFDA & Short.MAX_VALUE);
        g.lIlIllllIIlIl[5] = 3;
        g.lIlIllllIIlIl[6] = 2;
        g.lIlIllllIIlIl[7] = 0xC2 ^ 0xC6;
        g.lIlIllllIIlIl[8] = 0x7C ^ 0x79;
        g.lIlIllllIIlIl[9] = 0x4D ^ 0x57 ^ (0x38 ^ 0x24);
        g.lIlIllllIIlIl[10] = 0xB ^ 2 ^ 1;
    }

    private static void llIIIIlIllIIIII() {
        lIlIllllIIlII = new String[lIlIllllIIlIl[9]];
        g.lIlIllllIIlII[g.lIlIllllIIlIl[0]] = g."Feed";
        g.lIlIllllIIlII[g.lIlIllllIIlIl[1]] = g."Feed";
        g.lIlIllllIIlII[g.lIlIllllIIlIl[6]] = g."seeps into your bones";
        g.lIlIllllIIlII[g.lIlIllllIIlIl[5]] = g."Congratulations";
        g.lIlIllllIIlII[g.lIlIllllIIlIl[7]] = g."brazier";
        g.lIlIllllIIlII[g.lIlIllllIIlIl[8]] = g."Feed";
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var4_4;
        g var1;
        if (!g.llIIIIlIllIIIll(this.I.i() ? 1 : 0) || !g.llIIIIlIllIIlIl(this.I.u() ? 1 : 0) || g.llIIIIlIllIIIll(this.I.j() ? 1 : 0)) {
            return lIlIllllIIlIl[0];
        }
        Player var12 = Players.getLocal();
        a var2 = var1.I.q();
        TileObject var5 = TileObjects.getNearest((WorldPoint)var2.b(), tileObject -> {
            int n2;
            if (g.llIIIIlIllIIllI(tileObject.getName()) && g.llIIIIlIllIIIll(tileObject.getName().toLowerCase(Locale.ROOT).contains(lIlIllllIIlII[lIlIllllIIlIl[7]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIllllIIlIl[1]];
                stringArray[g.lIlIllllIIlIl[0]] = lIlIllllIIlII[lIlIllllIIlIl[8]];
                if (g.llIIIIlIllIIIll(tileObject.hasAction(stringArray) ? 1 : 0) && g.llIIIIlIllIlIIl(var2.b().distanceTo((Locatable)tileObject), lIlIllllIIlIl[5])) {
                    n2 = lIlIllllIIlIl[1];
                    0;
                    if ((0x57 ^ 0x53) >= (0x51 ^ 0x55)) return n2 != 0;
                    return false;
                }
            }
            n2 = lIlIllllIIlIl[0];
            return n2 != 0;
        });
        if (!g.llIIIIlIllIIllI(var5) || g.llIIIIlIllIIIll(var12.isMoving() ? 1 : 0)) {
            return lIlIllllIIlIl[0];
        }
        GameObject var10 = (GameObject)var5;
        if (g.llIIIIlIllIIlIl(var10.getWorldArea().isInMeleeDistance(var12.getWorldLocation()) ? 1 : 0)) {
            Movement.walk((WorldPoint)var2.b());
            return lIlIllllIIlIl[1];
        }
        if (g.llIIIIlIllIIlll(Players.getLocal().getAnimation(), lIlIllllIIlIl[2])) {
            int[] nArray = new int[lIlIllllIIlIl[1]];
            nArray[g.lIlIllllIIlIl[0]] = lIlIllllIIlIl[3];
            if (g.llIIIIlIllIIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                return lIlIllllIIlIl[0];
            }
        }
        String[] stringArray = new String[lIlIllllIIlIl[1]];
        stringArray[g.lIlIllllIIlIl[0]] = lIlIllllIIlII[lIlIllllIIlIl[0]];
        if (!g.llIIIIlIllIIIll(var10.hasAction(stringArray) ? 1 : 0) || g.llIIIIlIllIIlll(Players.getLocal().getAnimation(), lIlIllllIIlIl[4])) {
            var1.K = lIlIllllIIlIl[5];
            return lIlIllllIIlIl[0];
        }
        if (g.llIIIIlIllIlIII(var1.K)) {
            var1.K -= lIlIllllIIlIl[1];
            return lIlIllllIIlIl[1];
        }
        var4_4.interact(lIlIllllIIlII[lIlIllllIIlIl[1]]);
        return lIlIllllIIlIl[1];
    }

    private static String llIIIIlIlIlllll(String var8, String var3) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var13 = Cipher.getInstance("Blowfish");
            var13.init(lIlIllllIIlIl[6], var4);
            return new String(var13.doFinal(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var7) {
            var7.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIIlIllIIllI(Object object) {
        return object != null;
    }

    private static boolean llIIIIlIllIlIII(int n2) {
        return n2 > 0;
    }

    static {
        g.llIIIIlIllIIIlI();
        g.llIIIIlIllIIIII();
        G = lIlIllllIIlIl[4];
        H = lIlIllllIIlIl[2];
    }

    private static boolean llIIIIlIllIIlll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llIIIIlIllIlIIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llIIIIlIllIIIll(int n2) {
        return n2 != 0;
    }
}

