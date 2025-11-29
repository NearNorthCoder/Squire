/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Actor
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.events.AnimationChanged
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Reachable
 */
package m.e.i.q.u.r.-.n.s.e.r.i;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMiner;
import gg.squire.mining.SquireMinerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import m.e.i.q.u.r.-.n.s.e.r.i.C_Unknown;
import m.e.i.q.u.r.-.n.s.e.r.i.T_Unknown;
import m.e.i.q.u.r.-.n.s.e.r.i.U_Unknown;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.events.AnimationChanged;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;

/* TASK: Mining Ore Vein -> MiningoreveinTask */
@TaskDesc(name="Mining Ore Vein", priority=5, blocking=true, register=true)
public class MiningOreVeinTask
extends C_Unknown {
    public static final /* synthetic */ int S;
    private /* synthetic */ boolean W;
    private static /* synthetic */ String[] llllllIIlIlI;
    private final /* synthetic */ U T;
    private /* synthetic */ int V;
    private static /* synthetic */ int[] llllllIIlIll;
    private final /* synthetic */ Client U;

    private static boolean lIIlIlIIIllIlIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIlIlIIIllIIll(Object object) {
        return object == null;
    }

    private static String lIIlIlIIIlIllII(String var1, String var10) {
        try {
            SecretKeySpec var7 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var10.getBytes(StandardCharsets.UTF_8)), llllllIIlIll[6]), "DES");
            Cipher var8 = Cipher.getInstance("DES");
            var8.init(llllllIIlIll[2], var7);
            return new String(var8.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean t() {
        TileObject var2;
        B var9;
        Player player = Players.getLocal();
        if (!B.lIIlIlIIIlIllll(player) || B.lIIlIlIIIllIIII(this.Z.I() ? 1 : 0)) {
            return llllllIIlIll[0];
        }
        if (B.lIIlIlIIIllIIII(Inventory.isFull() ? 1 : 0)) {
            return llllllIIlIll[0];
        }
        if (!B.lIIlIlIIIllIIIl(var9.Z.G() ? 1 : 0) || B.lIIlIlIIIllIIII(var9.Z.F() ? 1 : 0)) {
            return llllllIIlIll[0];
        }
        if (B.lIIlIlIIIllIIII(var9.W ? 1 : 0) && B.lIIlIlIIIllIIlI(var9.U.getTickCount() - var9.V, llllllIIlIll[1])) {
            var9.T.e(null);
        }
        if (B.lIIlIlIIIllIIll(var2 = var9.T.P())) {
            TileObject var4 = var9.u();
            if (!B.lIIlIlIIIlIllll(var4) || B.lIIlIlIIIllIIIl(Reachable.isInteractable((Locatable)var4) ? 1 : 0)) {
                return llllllIIlIll[0];
            }
            var9.T.e(var4);
            var4.interact(llllllIIlIlI[llllllIIlIll[0]]);
            var9.sleep(llllllIIlIll[2]);
            return llllllIIlIll[3];
        }
        if (B.lIIlIlIIIllIIIl(Reachable.isInteractable((Locatable)var2) ? 1 : 0)) {
            var9.T.e(null);
            return llllllIIlIll[0];
        }
        return llllllIIlIll[3];
    }

    private static boolean lIIlIlIIIllIIlI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIlIlIIIllIIII(int n2) {
        return n2 != 0;
    }

    static {
        B.lIIlIlIIIlIlllI();
        B.lIIlIlIIIlIllIl();
        S = llllllIIlIll[5];
    }

    private static boolean lIIlIlIIIlIllll(Object object) {
        return object != null;
    }

    private static void lIIlIlIIIlIlllI() {
        llllllIIlIll = new int[7];
        B.llllllIIlIll[0] = (0xC8 ^ 0xA8) & ~(0xDD ^ 0xBD);
        B.llllllIIlIll[1] = 7 ^ 1;
        B.llllllIIlIll[2] = 2;
        B.llllllIIlIll[3] = 1;
        B.llllllIIlIll[4] = -1;
        B.llllllIIlIll[5] = 0xFFFFAFE1 & 0x535E;
        B.llllllIIlIll[6] = 2 ^ (0x45 ^ 0x4F);
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(AnimationChanged animationChanged) {
        void var5;
        Actor actor = animationChanged.getActor();
        if (!B.lIIlIlIIIlIllll(actor) || B.lIIlIlIIIllIlII(actor, Players.getLocal())) {
            return;
        }
        if (B.lIIlIlIIIllIlIl(var5.getAnimation(), llllllIIlIll[4])) {
            B var6;
            var6.V = var6.U.getTickCount();
            var6.W = llllllIIlIll[3];
            0;
            if (-2 >= 0) {
                return;
            }
        } else {
            var6.W = llllllIIlIll[0];
        }
    }

    private static boolean lIIlIlIIIllIlII(Object object, Object object2) {
        return object != object2;
    }

    private static void lIIlIlIIIlIllIl() {
        llllllIIlIlI = new String[llllllIIlIll[3]];
        B.llllllIIlIlI[B.llllllIIlIll[0]] = B."Mine";
    }

    private static boolean lIIlIlIIIllIIIl(int n2) {
        return n2 == 0;
    }

    @Inject
    public B(SquireMinerConfig squireMinerConfig, SquireMiner squireMiner, T t2, U u2, Client client) {
        super(squireMinerConfig, squireMiner, t2);
        this.T = u2;
        this.U = client;
    }
}

