/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.TileObject
 *  net.runelite.api.World
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Worlds
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.client.Static
 */
package a.u.i.-.l.r.h.z.s.r.u.q.e;

import a.u.i.-.l.r.h.z.s.r.u.q.e.am;
import a.u.i.-.l.r.h.z.s.r.u.q.e.c;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrah;
import gg.squire.zulrah.SquireZulrahConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.runelite.api.World;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.client.Static;

/* TASK: Boarding boat -> BoardBoatTask */
@TaskDesc(name="Boarding boat", priority=10)
public class aj
extends am {
    private static final /* synthetic */ int aF;
    private static /* synthetic */ String[] lIllIllllIIlI;
    private static final /* synthetic */ int aE;
    private final /* synthetic */ SquireZulrah aG;
    private static /* synthetic */ int[] lIllIllllIIll;

    private static boolean llIIlIIlllIIIII(Object object) {
        return object != null;
    }

    private static void llIIlIIllIllllI() {
        lIllIllllIIll = new int[5];
        aj.lIllIllllIIll[0] = (6 ^ 2) & ~(0x13 ^ 0x17);
        aj.lIllIllllIIll[1] = 1;
        aj.lIllIllllIIll[2] = 0xFFFFE7F7 & 0x3F5C;
        aj.lIllIllllIIll[3] = -(0xFFFFFDB7 & 0x6258) & (0xFFFFF77F & Short.MAX_VALUE);
        aj.lIllIllllIIll[4] = 2;
    }

    private static String llIIlIIllIllIll(String var7, String var4) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var6 = Cipher.getInstance("Blowfish");
            var6.init(lIllIllllIIll[4], var1);
            return new String(var6.doFinal(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    @Inject
    protected aj(Client client, SquireZulrahConfig squireZulrahConfig, SquireZulrah squireZulrah) {
        super(client, squireZulrahConfig);
        this.aG = squireZulrah;
    }

    private static boolean llIIlIIlllIIIlI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llIIlIIlllIIIll(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean ac() {
        void var1_1;
        aj var8;
        if (aj.llIIlIIllIlllll((Object)this.aG.a(), (Object)c.DONE)) {
            return lIllIllllIIll[0];
        }
        int[] nArray = new int[lIllIllllIIll[1]];
        nArray[aj.lIllIllllIIll[0]] = lIllIllllIIll[2];
        TileObject var2 = TileObjects.getNearest((int[])nArray);
        if (!aj.llIIlIIlllIIIII(var2) || aj.llIIlIIlllIIIIl(Movement.shouldWalk() ? 1 : 0)) {
            return lIllIllllIIll[0];
        }
        int var9 = Static.getClient().getTickCount();
        if (aj.llIIlIIlllIIIlI(var9 - var8.aG.c(), lIllIllllIIll[3]) && aj.llIIlIIlllIIIll(var8.aJ.hop() ? 1 : 0)) {
            if (aj.llIIlIIlllIIIll(Worlds.isHopperOpen() ? 1 : 0)) {
                var8.aG.a(var9);
            }
            World var5 = Worlds.getCurrentWorld();
            Worlds.hopTo((World)Worlds.getRandom(world2 -> {
                int n2;
                if (aj.llIIlIIllIlllll(world2, var5) && aj.llIIlIIlllIIIll(world2.isNormal() ? 1 : 0) && aj.llIIlIIlllIIIll(world2.isMembers() ? 1 : 0) && aj.llIIlIIlllIIlII(world2.getLocation(), var5.getLocation())) {
                    n2 = lIllIllllIIll[1];
                    0;
                    if ((125 + 136 - 222 + 120 ^ 76 + 30 - -14 + 35) <= 0) {
                        return false;
                    }
                } else {
                    n2 = lIllIllllIIll[0];
                }
                return n2 != 0;
            }));
            return lIllIllllIIll[1];
        }
        var1_1.interact(lIllIllllIIlI[lIllIllllIIll[0]]);
        return lIllIllllIIll[1];
    }

    private static boolean llIIlIIllIlllll(Object object, Object object2) {
        return object != object2;
    }

    static {
        aj.llIIlIIllIllllI();
        aj.llIIlIIllIlllII();
        aE = lIllIllllIIll[2];
        aF = lIllIllllIIll[3];
    }

    private static boolean llIIlIIlllIIlII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llIIlIIlllIIIIl(int n2) {
        return n2 == 0;
    }

    private static void llIIlIIllIlllII() {
        lIllIllllIIlI = new String[lIllIllllIIll[1]];
        aj.lIllIllllIIlI[aj.lIllIllllIIll[0]] = aj."Quick-Board";
    }
}

