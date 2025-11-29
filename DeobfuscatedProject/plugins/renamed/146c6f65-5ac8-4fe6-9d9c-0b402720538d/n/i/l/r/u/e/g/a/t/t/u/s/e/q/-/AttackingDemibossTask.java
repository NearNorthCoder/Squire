/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Actor
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Rand
 *  net.unethicalite.api.coords.ScenePoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.client.Static
 */
package n.i.l.r.u.e.g.a.t.t.u.s.e.q.-;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.b_Unknown;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.c_Unknown;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.DEnum;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.GEnum;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.h_Unknown;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.l_Unknown;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.n_Unknown;
import net.runelite.api.Actor;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.coords.ScenePoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.client.Static;

/* TASK: Attacking Demiboss -> AttackingdemibossTask */
@TaskDesc(name="Attacking Demiboss", priority=3, blocking=true)
public class AttackingDemibossTask
extends n_Unknown {
    private static /* synthetic */ int[] llIIlIllllII;
    private static /* synthetic */ String[] llIIlIlllIll;
    private final /* synthetic */ b bT;

    private static boolean llllllIIIIllll(int n2) {
        return n2 != 0;
    }

    private static boolean llllllIIIlIIlI(Object object, Object object2) {
        return object == object2;
    }

    private static /* synthetic */ int a(Player player, l l2) {
        return l2.aW().distanceTo((Locatable)player);
    }

    private static boolean llllllIIIIllIl(Object object) {
        return object == null;
    }

    private static boolean llllllIIIlIIll(Object object) {
        return object != null;
    }

    @Inject
    public G(b b2, c c2) {
        d[] dArray = new d[llIIlIllllII[0]];
        dArray[G.llIIlIllllII[1]] = d.DEMI_BOSS_EXPLORE;
        super(c2, dArray);
        this.bT = b2;
    }

    private static String llllllIIIIlIlI(String var25, String var7) {
        try {
            SecretKeySpec var17 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var1 = Cipher.getInstance("Blowfish");
            var1.init(llIIlIllllII[3], var17);
            return new String(var1.doFinal(Base64.getDecoder().decode(var25.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static boolean llllllIIIlIIIl(int n2) {
        return n2 == 0;
    }

    private static void llllllIIIIllII() {
        llIIlIllllII = new int[8];
        G.llIIlIllllII[0] = 1;
        G.llIIlIllllII[1] = (0x38 ^ 7) & ~(2 ^ 0x3D);
        G.llIIlIllllII[2] = 0xDE ^ 0xA2 ^ (0xEB ^ 0x9B);
        G.llIIlIllllII[3] = 2;
        G.llIIlIllllII[4] = 3;
        G.llIIlIllllII[5] = 0x95 ^ 0x87 ^ (0x7D ^ 0x6B);
        G.llIIlIllllII[6] = 9 + 29 - 12 + 110 ^ 98 + 126 - 193 + 110;
        G.llIIlIllllII[7] = 0x75 ^ 0x7D;
    }

    private static boolean llllllIIIlIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static /* synthetic */ boolean a(NPC nPC, Player player, l l2) {
        int n2;
        if (G.llllllIIIIllll(l2.aY() ? 1 : 0) && G.llllllIIIlIlII(l2.aW().distanceTo(nPC.getWorldLocation()), nPC.getWorldLocation().distanceTo((Locatable)player))) {
            n2 = llIIlIllllII[0];
            0;
            if (3 == 0) {
                return false;
            }
        } else {
            n2 = llIIlIllllII[1];
        }
        return n2 != 0;
    }

    private static void llllllIIIIlIll() {
        llIIlIlllIll = new String[llIIlIllllII[6]];
        G.llIIlIlllIll[G.llIIlIllllII[1]] = G."Pathing to target npc, target room is null - {}";
        G.llIIlIlllIll[G.llIIlIllllII[0]] = G."Pathing to target npc, target room is found - {}";
        G.llIIlIlllIll[G.llIIlIllllII[3]] = G."We're not interacting with anything, attacking npc.";
        G.llIIlIlllIll[G.llIIlIllllII[4]] = G."Attack";
        G.llIIlIlllIll[G.llIIlIllllII[5]] = G."Pathing to best tile to attack npc.";
    }

    private static boolean llllllIIIlIIII(int n2, int n3) {
        return n2 > n3;
    }

    static {
        G.llllllIIIIllII();
        G.llllllIIIIlIll();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean be() {
        void var6;
        G var2;
        Player player = Players.getLocal();
        if (G.llllllIIIIllIl(player)) {
            return llIIlIllllII[1];
        }
        g var11 = var2.ba.J();
        if (G.llllllIIIIllIl((Object)var11)) {
            return llIIlIllllII[1];
        }
        if (G.llllllIIIIlllI(Inventory.getCount((boolean)llIIlIllllII[0], (int[])var11.an().aB()))) {
            return llIIlIllllII[1];
        }
        NPC var12 = NPCs.getNearest((int[])var11.ah());
        if (G.llllllIIIIllIl(var12) && G.llllllIIIIllIl(var12 = NPCs.getNearest(nPC -> {
            boolean bl;
            if (!G.llllllIIIlIIIl(g.DRAGON.f((NPC)nPC) ? 1 : 0) || G.llllllIIIIllll(g.DARK_BEAST.f((NPC)nPC) ? 1 : 0)) {
                bl = llIIlIllllII[0];
                0;
                if (2 == 0) {
                    return false;
                }
            } else {
                bl = llIIlIllllII[1];
            }
            return bl;
        }))) {
            return llIIlIllllII[1];
        }
        if (G.llllllIIIIllll(var12.isDead() ? 1 : 0)) {
            return llIIlIllllII[0];
        }
        if (G.llllllIIIlIIII(var12.distanceTo((Locatable)var6), llIIlIllllII[2])) {
            h var30 = var2.ba.V();
            l var3 = var30.d(var12.getWorldLocation());
            if (G.llllllIIIIllIl(var3)) {
                NPC var14 = var12;
                l var20 = var30.b(arg_0 -> G.a(var14, (Player)var6, arg_0)).stream().min(Comparator.comparingInt(arg_0 -> G.a((Player)var6, arg_0))).orElse(null);
                if (G.llllllIIIIllIl(var20)) {
                    return llIIlIllllII[1];
                }
                Object[] objectArray = new Object[llIIlIllllII[0]];
                objectArray[G.llIIlIllllII[1]] = var12.distanceTo((Locatable)var6);
                Log.info((String)llIIlIlllIll[llIIlIllllII[1]], (Object[])objectArray);
                var2.ba.a(var20, Players.getLocal().getWorldLocation());
                0;
                0;
                if (-(121 + 73 - 134 + 98 ^ 133 + 135 - 127 + 14) >= 0) {
                    return ((0x38 ^ 5 ^ (0x4E ^ 0x76)) & (84 + 123 - 76 + 18 ^ 3 + 49 - 3 + 95 ^ -1)) != 0;
                }
            } else {
                Object[] objectArray = new Object[llIIlIllllII[0]];
                objectArray[G.llIIlIllllII[1]] = var12.distanceTo((Locatable)var6);
                Log.info((String)llIIlIlllIll[llIIlIllllII[0]], (Object[])objectArray);
                var2.ba.a(var30.d(var12.getWorldLocation()), Players.getLocal().getWorldLocation());
                0;
            }
            return llIIlIllllII[0];
        }
        Actor var30 = var6.getInteracting();
        if (G.llllllIIIIllIl(var30) && G.llllllIIIlIIIl(var2.bT.p() ? 1 : 0)) {
            Log.info((String)llIIlIlllIll[llIIlIllllII[3]]);
            var12.interact(llIIlIlllIll[llIIlIllllII[4]]);
            var2.bT.c(llIIlIllllII[5]);
            return llIIlIllllII[0];
        }
        if (G.llllllIIIlIIlI(var30, var12)) {
            l var3 = var2.ba.V().d(var30.getWorldLocation());
            WorldPoint var14 = null;
            int var20 = Integer.MIN_VALUE;
            ScenePoint var23 = var3.aR().toWorldPointList().iterator();
            while (G.llllllIIIIllll(var23.hasNext() ? 1 : 0)) {
                WorldPoint var9 = (WorldPoint)var23.next();
                int var22 = var9.distanceTo(var2.ba.V().aq().aQ());
                if (G.llllllIIIlIIII(var22, var20) && G.llllllIIIlIIIl(Reachable.isObstacle((WorldPoint)var9) ? 1 : 0) && G.llllllIIIIllll(var9.toWorldArea().hasLineOfSightTo(Static.getClient().getTopLevelWorldView(), var30.getWorldArea()) ? 1 : 0)) {
                    var20 = var22;
                    var14 = var9;
                }
                0;
                if (3 < (75 + 139 - 195 + 157 ^ 44 + 144 - 103 + 95)) continue;
                return ((0x31 ^ 0x2C ^ (0x13 ^ 0x44)) & (105 + 87 - 49 + 0 ^ 81 + 181 - 140 + 75 ^ -1)) != 0;
            }
            if (G.llllllIIIlIIll(var14) && G.llllllIIIlIIII(var6.getWorldLocation().distanceTo(var14), llIIlIllllII[4])) {
                Log.info((String)llIIlIlllIll[llIIlIllllII[5]]);
                var23 = ScenePoint.fromWorld(var14);
                Movement.setDestination((int)var23.getX(), (int)var23.getY());
                var2.bT.e(Rand.nextInt((int)llIIlIllllII[3], (int)llIIlIllllII[5]));
            }
        }
        return llIIlIllllII[0];
    }

    private static String llllllIIIIlIII(String var29, String var13) {
        try {
            SecretKeySpec var16 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var13.getBytes(StandardCharsets.UTF_8)), llIIlIllllII[7]), "DES");
            Cipher var5 = Cipher.getInstance("DES");
            var5.init(llIIlIllllII[3], var16);
            return new String(var5.doFinal(Base64.getDecoder().decode(var29.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }

    private static boolean llllllIIIIlllI(int n2) {
        return n2 > 0;
    }

    private static String llllllIIIIlIIl(String var18, String var4) {
        var18 = new String(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var21 = new StringBuilder();
        char[] var19 = var4.toCharArray();
        int var10 = llIIlIllllII[1];
        char[] var24 = var18.toCharArray();
        int var28 = var24.length;
        int var27 = llIIlIllllII[1];
        while (G.llllllIIIlIlII(var27, var28)) {
            char var15 = var24[var27];
            var21.append((char)(var15 ^ var19[var10 % var19.length]));
            0;
            ++var10;
            ++var27;
            0;
            
            return null;
        }
        return String.valueOf(var21);
    }
}

