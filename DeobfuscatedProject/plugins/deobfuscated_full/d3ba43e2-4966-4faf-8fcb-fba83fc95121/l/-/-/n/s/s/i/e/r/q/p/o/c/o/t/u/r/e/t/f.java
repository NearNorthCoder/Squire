/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.coords.RegionPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.movement.pathfinder.CollisionMap
 *  net.unethicalite.api.movement.pathfinder.GlobalCollisionMap
 *  net.unethicalite.api.movement.pathfinder.LocalCollisionMap
 *  net.unethicalite.api.movement.pathfinder.Pathfinder
 *  net.unethicalite.api.movement.pathfinder.Walker
 *  net.unethicalite.client.Static
 *  net.unethicalite.client.managers.RegionManager
 */
package l.-.-.n.s.s.i.e.r.q.p.o.c.o.t.u.r.e.t;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import l.-.-.n.s.s.i.e.r.q.p.o.c.o.t.u.r.e.t.a;
import l.-.-.n.s.s.i.e.r.q.p.o.c.o.t.u.r.e.t.e;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.CollisionMap;
import net.unethicalite.api.movement.pathfinder.GlobalCollisionMap;
import net.unethicalite.api.movement.pathfinder.LocalCollisionMap;
import net.unethicalite.api.movement.pathfinder.Pathfinder;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.client.Static;
import net.unethicalite.client.managers.RegionManager;

/* TASK: Attacking -> AttackTask */
@TaskDesc(name="Attacking")
public class f
extends Task {
    private static /* synthetic */ int[] lIIIlIlIIllII;
    private final /* synthetic */ a p;
    private static /* synthetic */ String[] lIIIlIlIIlIll;

    private Optional<NPC> r() {
        return NPCs.getAll().stream().filter(this::a).min(this::a);
    }

    @Inject
    public f(a a2) {
        this.p = a2;
    }

    private static void lIIllllllllIIII() {
        lIIIlIlIIlIll = new String[lIIIlIlIIllII[5]];
        f.lIIIlIlIIlIll[f.lIIIlIlIIllII[2]] = f."Attack";
        f.lIIIlIlIIlIll[f.lIIIlIlIIllII[1]] = f."Attack";
    }

    private static boolean lIIllllllllIlIl(Object object) {
        return object == null;
    }

    private static boolean lIIllllllllIIlI(int n) {
        return n != 0;
    }

    private static String lIIlllllllIllll(String var15, String var21) {
        try {
            SecretKeySpec var16 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var21.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var13 = Cipher.getInstance("Blowfish");
            var13.init(lIIIlIlIIllII[5], var16);
            return new String(var13.doFinal(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    private int a(NPC nPC, NPC nPC2) {
        e e2 = e.valueOf(nPC.getName().toUpperCase());
        e e3 = e.valueOf(nPC2.getName().toUpperCase());
        return Integer.compare(e2.q(), e3.q());
    }

    private static boolean lIIllllllllIllI(int n) {
        return n == 0;
    }

    public boolean run() {
        f var5;
        if (f.lIIllllllllIIlI(this.s() ? 1 : 0)) {
            return lIIIlIlIIllII[2];
        }
        Optional<NPC> var19 = var5.r();
        if (f.lIIllllllllIIlI(var19.isPresent() ? 1 : 0)) {
            var5.b(var19.get());
            0;
            if (1 >= 2) {
                return ((0x48 ^ 0x31 ^ (0x59 ^ 0x34)) & (4 ^ 0x35 ^ (0x9C ^ 0xB9) ^ -1)) != 0;
            }
        } else {
            var5.p.i();
        }
        return lIIIlIlIIllII[1];
    }

    private static boolean lIIllllllllIlll(int n, int n2) {
        return n < n2;
    }

    private static String lIIlllllllIlllI(String var10, String var14) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var22 = new StringBuilder();
        char[] var17 = var14.toCharArray();
        int var18 = lIIIlIlIIllII[2];
        char[] var8 = var10.toCharArray();
        int var11 = var8.length;
        int var3 = lIIIlIlIIllII[2];
        while (f.lIIllllllllIlll(var3, var11)) {
            char var20 = var8[var3];
            var22.append((char)(var20 ^ var17[var18 % var17.length]));
            0;
            ++var18;
            ++var3;
            0;
            if ((0x6F ^ 0x6B) != 3) continue;
            return null;
        }
        return String.valueOf(var22);
    }

    static {
        f.lIIllllllllIIIl();
        f.lIIllllllllIIII();
    }

    private boolean s() {
        boolean bl;
        if (!f.lIIllllllllIIlI(this.p.e() ? 1 : 0) || !f.lIIllllllllIlIl(Players.getLocal().getInteracting()) || f.lIIllllllllIllI(Movement.shouldWalk() ? 1 : 0)) {
            bl = lIIIlIlIIllII[1];
            0;
            if (-1 > 0) {
                return ((0x56 ^ 0x37 ^ (0xD ^ 0x56)) & (222 + 144 - 268 + 153 ^ 146 + 172 - 313 + 188 ^ -1)) != 0;
            }
        } else {
            bl = lIIIlIlIIllII[2];
        }
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    private void b(NPC nPC) {
        void var2;
        if (f.lIIllllllllIllI(Reachable.isInteractable((Locatable)nPC) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)nPC.getWorldLocation());
            0;
            0;
            if (-1 == 1) {
                return;
            }
        } else if (f.lIIllllllllIllI(var2.isDead() ? 1 : 0)) {
            var2.interact(lIIIlIlIIlIll[lIIIlIlIIllII[1]]);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean a(NPC nPC) {
        int n;
        if (f.lIIllllllllIIlI(Arrays.stream(e.values()).anyMatch(e2 -> e2.p().equals(nPC.getName())) ? 1 : 0) && f.lIIllllllllIIll(nPC.getWorldLocation().distanceTo((Locatable)Players.getLocal()), lIIIlIlIIllII[0])) {
            String[] stringArray = new String[lIIIlIlIIllII[1]];
            stringArray[f.lIIIlIlIIllII[2]] = lIIIlIlIIlIll[lIIIlIlIIllII[2]];
            if (f.lIIllllllllIIlI(nPC.hasAction(stringArray) ? 1 : 0)) {
                n = lIIIlIlIIllII[1];
                0;
                if ((0x39 ^ 0x6F ^ (0xDC ^ 0x8E)) != 0) return n != 0;
                return ((0x66 ^ 0x22 ^ (0x5E ^ 0xD)) & (104 + 110 - 120 + 37 ^ 48 + 6 - -2 + 92 ^ -1)) != 0;
            }
        }
        n = lIIIlIlIIllII[2];
        return n != 0;
    }

    private static boolean lIIllllllllIlII(Object object) {
        return object != null;
    }

    private static void lIIllllllllIIIl() {
        lIIIlIlIIllII = new int[6];
        f.lIIIlIlIIllII[0] = 84 + 149 - 126 + 81 ^ 27 + 145 - 95 + 102;
        f.lIIIlIlIIllII[1] = 1;
        f.lIIIlIlIIllII[2] = (0 + 131 - 61 + 89 ^ 97 + 147 - 55 + 5) & (0x76 ^ 0x12 ^ (0xB9 ^ 0x80) ^ -1);
        f.lIIIlIlIIllII[3] = -(0xE1 ^ 0xA0) & (0xFFFFED79 & 0x3BEE);
        f.lIIIlIlIIllII[4] = -1;
        f.lIIIlIlIIllII[5] = 2;
    }

    private static boolean lIIllllllllIIll(int n, int n2) {
        return n <= n2;
    }

    private int b(int var9, int var7, int var1) {
        int n;
        LocalCollisionMap var12;
        List var4;
        CollisionMap collisionMap;
        if (f.lIIllllllllIIlI(Static.getGlobalCollisionMap() instanceof GlobalCollisionMap)) {
            collisionMap = Static.getGlobalCollisionMap();
            0;
            if ((150 + 11 - 56 + 59 ^ 77 + 2 - -40 + 41) < -1) {
                return (0xED ^ 0x80 ^ (0x87 ^ 0xA1)) & (169 + 16 - 120 + 178 ^ 176 + 136 - 164 + 36 ^ -1);
            }
        } else {
            collisionMap = null;
        }
        if (f.lIIllllllllIlII(var4 = new Pathfinder((CollisionMap)(var12 = new LocalCollisionMap((GlobalCollisionMap)collisionMap, lIIIlIlIIllII[2])), Walker.buildTransportLinks(), List.of(Players.getLocal().getWorldLocation()), a.a(new RegionPoint(var9, var7, var1, lIIIlIlIIllII[3])), RegionManager.avoidWilderness()).find())) {
            n = var4.size();
            0;
            if (1 >= (0x96 ^ 0x92)) {
                return (0xA ^ 0x3E) & ~(0x40 ^ 0x74);
            }
        } else {
            n = lIIIlIlIIllII[4];
        }
        return n;
    }
}

