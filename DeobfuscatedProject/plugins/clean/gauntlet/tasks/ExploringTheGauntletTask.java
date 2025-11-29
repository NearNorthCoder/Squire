/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 */
package gg.squire.gauntlet.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Comparator;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.GameEnum38;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.e;
import gg.squire.gauntlet.tasks.GameEnum18;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.h;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.l;
import gg.squire.gauntlet.tasks.GauntletTaskBase;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;

@TaskDesc(name="Exploring the gauntlet", priority=1)
public class ExploringTheGauntletTask
extends GauntletTaskBase {

    private static  int a(Player player, TileObject tileObject) {
        return (int)tileObject.getWorldLocation().distanceToHypotenuse(player.getWorldLocation());
    }

    @Inject
    public ExploringTheGauntletTask(c c2) {
        d[] dArray = new d[llIIllIlllIl[0]];
        dArray[Q.llIIllIlllIl[1]] = d.FIRST_ROTATION_EXPLORE;
        super(c2, dArray);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean be() {
        void var1;
        Player player = Players.getLocal();
        h h2 = this.ba.V();
        if (!Q.lllllllIlIIIII(player) || !Q.lllllllIlIIIII(h2) || !Q.lllllllIlIIIIl(player.isMoving() ? 1 : 0) || Q.lllllllIlIIIII(player.getInteracting())) {
            return llIIllIlllIl[1];
        }
        Optional<l> var2 = var1.ar();
        if (Q.lllllllIlIIIlI(var2.isEmpty() ? 1 : 0)) {
            Log.info((String)llIIllIlllII[llIIllIlllIl[1]]);
            return llIIllIlllIl[1];
        }
        l var3 = var1.as();
        if (Q.lllllllIlIIIII(var3)) {
            void var4;
            Q var5;
            Optional<l> var6 = var1.c(var3).stream().filter(l2 -> {
                int n2;
                if (Q.lllllllIlIIIIl(l2.aY() ? 1 : 0) && Q.lllllllIlIIIlI(l2.aS() ? 1 : 0)) {
                    n2 = llIIllIlllIl[0];

                    if (((0xF0 ^ 0x93) & ~(0xFF ^ 0x9C)) < 0) {
                        return false;
                    }
                } else {
                    n2 = llIIllIlllIl[1];
                }
                return n2 != 0;
            }).findFirst();
            g var7 = var5.ba.J();
            l var8 = var2.get();
            if (Q.lllllllIlIIIlI(var1.b(l2 -> {
                int n2;
                if (Q.lllllllIlIIIlI(l2.aY() ? 1 : 0) && Q.lllllllIlIIIll((Object)l2.aZ(), (Object)var7)) {
                    n2 = llIIllIlllIl[0];

                    if ((0x73 ^ 0x77) < 0) {
                        return false;
                    }
                } else {
                    n2 = llIIllIlllIl[1];
                }
                return n2 != 0;
            }).isEmpty() ? 1 : 0) && Q.lllllllIlIIIlI(var6.isPresent() ? 1 : 0)) {
                var8 = var6.get();
            }
            WorldArea var9 = var8.aR();
            Comparator<TileObject> var10 = Comparator.comparingInt(arg_0 -> Q.a((Player)var4, arg_0));
            Comparator<TileObject> var11 = Comparator.comparingInt(tileObject -> (int)var9.getCenter().distanceToHypotenuse(tileObject.getWorldLocation()));
            Optional<TileObject> var12 = TileObjects.getAll((int[])e.U).stream().filter(tileObject -> var3.e(tileObject.getWorldLocation())).min(var11.thenComparing(var10));
            var12.ifPresent(tileObject -> tileObject.interact(llIIllIlllII[llIIllIlllIl[0]]));
            return llIIllIlllIl[0];
        }
        return llIIllIlllIl[1];
    }

    private static boolean lllllllIlIIIIl(int n2) {
        return n2 == 0;
    }

    private static void lllllllIIllllI() {
        llIIllIlllII = new String[llIIllIlllIl[2]];
        Q.llIIllIlllII[Q.llIIllIlllIl[1]] = "Next unexplored room is empty.";
        Q.llIIllIlllII[Q.llIIllIlllIl[0]] = "Light";
    }

    static {
        Q.lllllllIIlllll();
        Q.lllllllIIllllI();
    }

    private static boolean lllllllIlIIIlI(int n2) {
        return n2 != 0;
    }

    private static boolean lllllllIlIIIll(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lllllllIlIIIII(Object object) {
        return object != null;
    }
}

