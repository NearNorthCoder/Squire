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
package gg.squire.zulrah.tasks;

import gg.squire.zulrah.tasks.ZulrahTaskBase;
import gg.squire.zulrah.tasks.GameEnum40;
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

@TaskDesc(name="Boarding boat", priority=10)
public class BoardingBoatTask
extends ZulrahTaskBase {
    private static final  int aF;
    
    private static final  int aE;
    private final  SquireZulrah aG;

    private static boolean llIIlIIlllIIIII(Object object) {
        return object != null;
    }

    @Inject
    protected BoardingBoatTask(Client client, SquireZulrahConfig squireZulrahConfig, SquireZulrah squireZulrah) {
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
        aj var1;
        if (aj.llIIlIIllIlllll((Object)this.aG.a(), (Object)c.DONE)) {
            return lIllIllllIIll[0];
        }
        int[] nArray = new int[lIllIllllIIll[1]];
        nArray[aj.lIllIllllIIll[0]] = lIllIllllIIll[2];
        TileObject var2 = TileObjects.getNearest((int[])nArray);
        if (!aj.llIIlIIlllIIIII(var2) || aj.llIIlIIlllIIIIl(Movement.shouldWalk() ? 1 : 0)) {
            return lIllIllllIIll[0];
        }
        int var3 = Static.getClient().getTickCount();
        if (aj.llIIlIIlllIIIlI(var3 - var1.aG.c(), lIllIllllIIll[3]) && aj.llIIlIIlllIIIll(var1.aJ.hop() ? 1 : 0)) {
            if (aj.llIIlIIlllIIIll(Worlds.isHopperOpen() ? 1 : 0)) {
                var1.aG.a(var3);
            }
            World var4 = Worlds.getCurrentWorld();
            Worlds.hopTo((World)Worlds.getRandom(world2 -> {
                int n2;
                if (aj.llIIlIIllIlllll(world2, var4) && aj.llIIlIIlllIIIll(world2.isNormal() ? 1 : 0) && aj.llIIlIIlllIIIll(world2.isMembers() ? 1 : 0) && aj.llIIlIIlllIIlII(world2.getLocation(), var4.getLocation())) {
                    n2 = lIllIllllIIll[1];

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
        aj.lIllIllllIIlI[aj.lIllIllllIIll[0]] = "Quick-Board";
    }
}

