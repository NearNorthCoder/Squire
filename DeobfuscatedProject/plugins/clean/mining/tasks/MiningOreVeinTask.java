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
package gg.squire.mining.tasks;

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
import gg.squire.mining.tasks.MiningTaskBase;
import gg.squire.mining.tasks.MiningManager;
import gg.squire.mining.tasks.UHelper;
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

@TaskDesc(name="Mining Ore Vein", priority=5, blocking=true, register=true)
public class MiningOreVeinTask
extends MiningTaskBase {
    public static final  int S;
    private  boolean W;
    
    private final  U T;
    private  int V;
    
    private final  Client U;

    private static boolean lIIlIlIIIllIlIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIlIlIIIllIIll(Object object) {
        return object == null;
    }

    @Override
    public boolean t() {
        TileObject var1;
        B var2;
        Player player = Players.getLocal();
        if (!B.lIIlIlIIIlIllll(player) || B.lIIlIlIIIllIIII(this.Z.I() ? 1 : 0)) {
            return llllllIIlIll[0];
        }
        if (B.lIIlIlIIIllIIII(Inventory.isFull() ? 1 : 0)) {
            return llllllIIlIll[0];
        }
        if (!B.lIIlIlIIIllIIIl(var2.Z.G() ? 1 : 0) || B.lIIlIlIIIllIIII(var2.Z.F() ? 1 : 0)) {
            return llllllIIlIll[0];
        }
        if (B.lIIlIlIIIllIIII(var2.W ? 1 : 0) && B.lIIlIlIIIllIIlI(var2.U.getTickCount() - var2.V, llllllIIlIll[1])) {
            var2.T.e(null);
        }
        if (B.lIIlIlIIIllIIll(var1 = var2.T.P())) {
            TileObject var3 = var2.u();
            if (!B.lIIlIlIIIlIllll(var3) || B.lIIlIlIIIllIIIl(Reachable.isInteractable((Locatable)var3) ? 1 : 0)) {
                return llllllIIlIll[0];
            }
            var2.T.e(var3);
            var3.interact(llllllIIlIlI[llllllIIlIll[0]]);
            var2.sleep(llllllIIlIll[2]);
            return llllllIIlIll[3];
        }
        if (B.lIIlIlIIIllIIIl(Reachable.isInteractable((Locatable)var1) ? 1 : 0)) {
            var2.T.e(null);
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

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(AnimationChanged animationChanged) {
        void var4;
        Actor actor = animationChanged.getActor();
        if (!B.lIIlIlIIIlIllll(actor) || B.lIIlIlIIIllIlII(actor, Players.getLocal())) {
            return;
        }
        if (B.lIIlIlIIIllIlIl(var4.getAnimation(), llllllIIlIll[4])) {
            B var5;
            var5.V = var5.U.getTickCount();
            var5.W = llllllIIlIll[3];

        } else {
            var5.W = llllllIIlIll[0];
        }
    }

    private static boolean lIIlIlIIIllIlII(Object object, Object object2) {
        return object != object2;
    }

    private static void lIIlIlIIIlIllIl() {
        llllllIIlIlI = new String[llllllIIlIll[3]];
        B.llllllIIlIlI[B.llllllIIlIll[0]] = "Mine";
    }

    private static boolean lIIlIlIIIllIIIl(int n2) {
        return n2 == 0;
    }

    @Inject
    public MiningOreVeinTask(SquireMinerConfig squireMinerConfig, SquireMiner squireMiner, T t2, U u2, Client client) {
        super(squireMinerConfig, squireMiner, t2);
        this.T = u2;
        this.U = client;
    }
}

