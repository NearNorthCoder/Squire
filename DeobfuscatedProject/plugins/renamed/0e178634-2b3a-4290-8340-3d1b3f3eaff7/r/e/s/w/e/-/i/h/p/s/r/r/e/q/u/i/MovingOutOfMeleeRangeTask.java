/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i;

import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.u_Unknown;

/* TASK: Moving out of melee range -> MovingoutofmeleerangeTask */
@TaskDesc(name="Moving out of melee range", priority=50, blocking=true, register=true)
public class MovingOutOfMeleeRangeTask
extends u_Unknown {
    private static /* synthetic */ String[] lIlIlllIlIlIl;
    private static /* synthetic */ int[] lIlIlllIlIllI;
    private static final /* synthetic */ int Y;
    private /* synthetic */ int Z;

    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (r.llIIIIlIIllIlIl(chatMessage.getMessage().contains(lIlIlllIlIlIl[lIlIlllIlIllI[0]]) ? 1 : 0)) {
            this.Z = lIlIlllIlIllI[5];
        }
    }

    private static void llIIIIlIIllIIll() {
        lIlIlllIlIlIl = new String[lIlIlllIlIllI[1]];
        r.lIlIlllIlIlIl[r.lIlIlllIlIllI[0]] = r."The Whisperer binds you in place";
    }

    private static boolean llIIIIlIIllIllI(int n2) {
        return n2 > 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean p() {
        void var4_4;
        int var4;
        int n2;
        WorldArea var10;
        int n3;
        r var3;
        if (r.llIIIIlIIllIlIl(this.W.f() ? 1 : 0)) {
            return lIlIlllIlIllI[0];
        }
        if (r.llIIIIlIIllIllI(var3.Z)) {
            var3.Z -= lIlIlllIlIllI[1];
            return lIlIlllIlIllI[0];
        }
        NPC var6 = var3.W.j();
        WorldArea worldArea = var6.getWorldArea();
        if (r.llIIIIlIIllIlll(var6.getId(), lIlIlllIlIllI[2])) {
            n3 = lIlIlllIlIllI[3];
            0;
            if (-3 > 0) {
                return false;
            }
        } else {
            n3 = lIlIlllIlIllI[4];
        }
        if (!r.llIIIIlIIlllIII((var10 = worldArea.offset(n3)).isInMeleeDistance(Players.getLocal().getWorldArea()) ? 1 : 0) || r.llIIIIlIIllIlIl(var10.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            n2 = lIlIlllIlIllI[1];
            0;
            if (2 <= 1) {
                return ((0x80 ^ 0xBD ^ (0xE3 ^ 0x80)) & (225 + 242 - 325 + 102 ^ 33 + 61 - 53 + 129 ^ -1)) != 0;
            }
        } else {
            n2 = lIlIlllIlIllI[0];
        }
        if (r.llIIIIlIIlllIII(var4 = n2)) {
            return lIlIlllIlIllI[0];
        }
        WorldPoint var1 = Players.getLocal().getWorldLocation().createWorldArea(lIlIlllIlIllI[4]).toWorldPointList().stream().filter(worldPoint -> {
            boolean bl;
            if (r.llIIIIlIIlllIII(var10.isInMeleeDistance(worldPoint) ? 1 : 0)) {
                bl = lIlIlllIlIllI[1];
                0;
                if ((0x48 ^ 0x2B ^ (0xF4 ^ 0x93)) != (0x2A ^ 0x44 ^ (6 ^ 0x6C))) {
                    return ((7 ^ 0xF ^ (0x42 ^ 0x66)) & (0x4E ^ 0xD ^ (0x50 ^ 0x3F) ^ -1)) != 0;
                }
            } else {
                bl = lIlIlllIlIllI[0];
            }
            return bl;
        }).filter(Reachable::isWalkable).max(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo2D(var10.getCenter()))).orElse(null);
        if (r.llIIIIlIIlllIIl(var1)) {
            return lIlIlllIlIllI[0];
        }
        Movement.setDestination((WorldPoint)var4_4);
        return lIlIlllIlIllI[1];
    }

    static {
        r.llIIIIlIIllIlII();
        r.llIIIIlIIllIIll();
        Y = lIlIlllIlIllI[4];
    }

    private static void llIIIIlIIllIlII() {
        lIlIlllIlIllI = new int[7];
        r.lIlIlllIlIllI[0] = (0x94 ^ 0xA1) & ~(0xB8 ^ 0x8D);
        r.lIlIlllIlIllI[1] = 1;
        r.lIlIlllIlIllI[2] = 0xFFFFAFBD & 0x7FEF;
        r.lIlIlllIlIllI[3] = 0x35 ^ 0x33;
        r.lIlIlllIlIllI[4] = 2;
        r.lIlIlllIlIllI[5] = 45 + 131 - 73 + 34 ^ 101 + 32 - 46 + 53;
        r.lIlIlllIlIllI[6] = 0xBB ^ 0x84 ^ (1 ^ 0x36);
    }

    private static boolean llIIIIlIIlllIII(int n2) {
        return n2 == 0;
    }

    private static boolean llIIIIlIIlllIIl(Object object) {
        return object == null;
    }

    private static boolean llIIIIlIIllIlIl(int n2) {
        return n2 != 0;
    }

    private static String llIIIIlIIllIIlI(String var9, String var8) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var8.getBytes(StandardCharsets.UTF_8)), lIlIlllIlIllI[6]), "DES");
            Cipher var2 = Cipher.getInstance("DES");
            var2.init(lIlIlllIlIllI[4], var5);
            return new String(var2.doFinal(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var7) {
            var7.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIIlIIllIlll(int n2, int n3) {
        return n2 == n3;
    }
}

