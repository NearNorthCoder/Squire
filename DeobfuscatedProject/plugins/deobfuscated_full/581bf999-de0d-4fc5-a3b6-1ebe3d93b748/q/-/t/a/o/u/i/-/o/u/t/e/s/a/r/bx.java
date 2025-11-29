/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Point
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ActorDeath
 *  net.runelite.api.events.GameObjectSpawned
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Point;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ActorDeath;
import net.runelite.api.events.GameObjectSpawned;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.by;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z;

/* TASK: Moving to right spot with charging -> MovingtorightspotwithchargingTask */
@TaskDesc(name="Moving to right spot with charging", priority=100, register=true)
public class bx
extends by {
    private static /* synthetic */ String[] lIllllllIIl;
    private static final /* synthetic */ Point fE;
    private static /* synthetic */ int[] lIllllllIlI;
    private static final /* synthetic */ Point fD;
    private /* synthetic */ boolean fG;
    private static final /* synthetic */ int fF;

    @Subscribe
    public void a(ActorDeath actorDeath) {
        if (bx.lIIllIlllIllIl(actorDeath.getActor().equals(Players.getLocal()) ? 1 : 0)) {
            this.fG = lIllllllIlI[0];
        }
    }

    private static boolean lIIllIlllIllll(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public boolean bn() {
        return lIllllllIlI[0];
    }

    private static String lIIllIlllIlIIl(String var2, String var3) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), lIllllllIlI[6]), "DES");
            Cipher var7 = Cipher.getInstance("DES");
            var7.init(lIllllllIlI[5], var5);
            return new String(var7.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bl() {
        void var4;
        bx var8;
        WorldPoint worldPoint = this.a(fD);
        if (bx.lIIllIlllIllIl(this.fG ? 1 : 0) && bx.lIIllIlllIlllI(Players.getLocal().getWorldLocation().equals((Object)worldPoint) ? 1 : 0)) {
            return lIllllllIlI[0];
        }
        if (bx.lIIllIlllIllIl(var8.fG ? 1 : 0)) {
            WorldPoint var6 = var8.a(fE);
            if (bx.lIIllIlllIllIl(Players.getLocal().getWorldLocation().equals((Object)var6) ? 1 : 0)) {
                return lIllllllIlI[0];
            }
            Movement.setDestination((WorldPoint)var6);
            return lIllllllIlI[1];
        }
        if (bx.lIIllIlllIllIl(Players.getLocal().getWorldLocation().equals((Object)var4) ? 1 : 0)) {
            return lIllllllIlI[0];
        }
        Movement.setDestination((WorldPoint)worldPoint);
        return lIllllllIlI[1];
    }

    private static boolean lIIllIlllIllII(Object object) {
        return object == null;
    }

    @Override
    public boolean bj() {
        boolean bl2;
        if (bx.lIIllIlllIllII(NPCs.getNearest(nPC -> {
            int n2;
            if (bx.lIIllIlllIllIl(nPC.getName().contains(lIllllllIIl[lIllllllIlI[0]]) ? 1 : 0)) {
                String[] stringArray = new String[lIllllllIlI[1]];
                stringArray[bx.lIllllllIlI[0]] = lIllllllIIl[lIllllllIlI[1]];
                if (bx.lIIllIlllIllIl(nPC.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIllllllIlI[1];
                    0;
                    if ((0x4E ^ 0x4A) >= 2) return n2 != 0;
                    return false;
                }
            }
            n2 = lIllllllIlI[0];
            return n2 != 0;
        }))) {
            bl2 = lIllllllIlI[1];
            0;
            
            }
        } else {
            bl2 = lIllllllIlI[0];
        }
        return bl2;
    }

    private static boolean lIIllIlllIllIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIIllIlllIlllI(int n2) {
        return n2 == 0;
    }

    private static void lIIllIlllIlIlI() {
        lIllllllIIl = new String[lIllllllIlI[5]];
        bx.lIllllllIIl[bx.lIllllllIlI[0]] = bx."Obelisk";
        bx.lIllllllIIl[bx.lIllllllIlI[1]] = bx."Attack";
    }

    @Override
    public void r() {
        this.fG = lIllllllIlI[0];
    }

    private static void lIIllIlllIlIll() {
        lIllllllIlI = new int[7];
        bx.lIllllllIlI[0] = (0x8F ^ 0xB4 ^ (0x6A ^ 5)) & (0x33 ^ 0x1C ^ (0x7D ^ 6) ^ -1);
        bx.lIllllllIlI[1] = 1;
        bx.lIllllllIlI[2] = -(0xFFFFBC2E & 0x4FDB) & (0xFFFFBEBF & 0xFFFF);
        bx.lIllllllIlI[3] = 0x6E ^ 0x3F ^ (0x46 ^ 0x35);
        bx.lIllllllIlI[4] = 0x25 ^ 6;
        bx.lIllllllIlI[5] = 2;
        bx.lIllllllIlI[6] = 0x3C ^ 0x34;
    }

    @Inject
    protected bx(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
        this.fG = lIllllllIlI[0];
    }

    @Override
    protected boolean aS() {
        return lIllllllIlI[1];
    }

    static {
        bx.lIIllIlllIlIll();
        bx.lIIllIlllIlIlI();
        fF = lIllllllIlI[2];
        fD = new Point(lIllllllIlI[3], lIllllllIlI[3]);
        fE = new Point(lIllllllIlI[3], lIllllllIlI[4]);
    }

    @Subscribe
    public void a(GameObjectSpawned gameObjectSpawned) {
        if (bx.lIIllIlllIllll(gameObjectSpawned.getGameObject().getId(), lIllllllIlI[2])) {
            this.fG = lIllllllIlI[1];
        }
    }
}

