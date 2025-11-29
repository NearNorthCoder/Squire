/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.Set;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bX;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z;

@TaskDesc(name="Moving off poison", priority=30)
public class bU
extends bX {
    private static /* synthetic */ String[] lIlllllIIII;
    private static /* synthetic */ int[] lIlllllIIIl;

    private static /* synthetic */ boolean c(Player player, WorldPoint worldPoint) {
        return worldPoint.equals((Object)player.getWorldLocation());
    }

    private static void lIIllIlIlllllI() {
        lIlllllIIIl = new int[4];
        bU.lIlllllIIIl[0] = (0x88 ^ 0xB8) & ~(0x3B ^ 0xB);
        bU.lIlllllIIIl[1] = 2;
        bU.lIlllllIIIl[2] = 1;
        bU.lIlllllIIIl[3] = 162 + 167 - 169 + 21 ^ 168 + 132 - 112 + 1;
    }

    private static /* synthetic */ boolean j(Set set, WorldPoint worldPoint) {
        return set.stream().noneMatch(worldPoint2 -> worldPoint2.equals((Object)worldPoint));
    }

    static {
        bU.lIIllIlIlllllI();
        bU.lIIllIlIllllII();
    }

    private static String lIIllIlIlllIll(String llllllllllllllllIlIIlIlIlIIllIII, String llllllllllllllllIlIIlIlIlIIlIlIl) {
        try {
            SecretKeySpec llllllllllllllllIlIIlIlIlIIllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIlIlIlIIlIlIl.getBytes(StandardCharsets.UTF_8)), lIlllllIIIl[3]), "DES");
            Cipher llllllllllllllllIlIIlIlIlIIllIlI = Cipher.getInstance("DES");
            llllllllllllllllIlIIlIlIlIIllIlI.init(lIlllllIIIl[1], llllllllllllllllIlIIlIlIlIIllIll);
            return new String(llllllllllllllllIlIIlIlIlIIllIlI.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIlIlIlIIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIIlIlIlIIllIIl) {
            llllllllllllllllIlIIlIlIlIIllIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIllIllIIIIII(Object object) {
        return object == null;
    }

    private static boolean lIIllIllIIIIIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIIllIlIllllll(int n2) {
        return n2 != 0;
    }

    private static void lIIllIlIllllII() {
        lIlllllIIII = new String[lIlllllIIIl[2]];
        bU.lIlllllIIII[bU.lIlllllIIIl[0]] = bU."Trying to dodge poison splats";
    }

    @Inject
    protected bU(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bL() {
        WorldPoint worldPoint2;
        void llllllllllllllllIlIIlIlIlIlIIlll;
        void llllllllllllllllIlIIlIlIlIlIIllI;
        Player player = Players.getLocal();
        Set set = this.cC().stream().map(Locatable::getWorldLocation).collect(Collectors.toSet());
        if (bU.lIIllIlIllllll(set.isEmpty() ? 1 : 0)) {
            return lIlllllIIIl[0];
        }
        if (bU.lIIllIlIllllll(llllllllllllllllIlIIlIlIlIlIIllI.stream().noneMatch(arg_0 -> bU.c((Player)llllllllllllllllIlIIlIlIlIlIIlll, arg_0)) ? 1 : 0)) {
            return lIlllllIIIl[0];
        }
        Log.info((String)lIlllllIIII[lIlllllIIIl[0]]);
        WorldArea llllllllllllllllIlIIlIlIlIlIIlIl = llllllllllllllllIlIIlIlIlIlIIlll.getWorldArea().offset(lIlllllIIIl[1]);
        WorldPoint llllllllllllllllIlIIlIlIlIlIIlII = llllllllllllllllIlIIlIlIlIlIIlIl.toWorldPointList().stream().filter(arg_0 -> bU.j((Set)llllllllllllllllIlIIlIlIlIlIIllI, arg_0)).min(Comparator.comparingInt(arg_0 -> bU.f((Player)llllllllllllllllIlIIlIlIlIlIIlll, arg_0))).orElse(null);
        if (bU.lIIllIllIIIIII(llllllllllllllllIlIIlIlIlIlIIlII)) {
            return lIlllllIIIl[0];
        }
        worldPoint2 = this.b(player.getWorldLocation(), worldPoint2, worldPoint -> {
            boolean bl2;
            if (bU.lIIllIllIIIIIl(set.contains(worldPoint) ? 1 : 0)) {
                bl2 = lIlllllIIIl[2];
                0;
                if ((7 ^ 3) > (0x53 ^ 0x57)) {
                    return ((0x3F ^ 0x2A) & ~(0x72 ^ 0x67)) != 0;
                }
            } else {
                bl2 = lIlllllIIIl[0];
            }
            return bl2;
        });
        Movement.setDestination((WorldPoint)worldPoint2);
        return lIlllllIIIl[2];
    }

    private static /* synthetic */ int f(Player player, WorldPoint worldPoint) {
        return worldPoint.distanceTo2D(player.getWorldLocation());
    }
}

