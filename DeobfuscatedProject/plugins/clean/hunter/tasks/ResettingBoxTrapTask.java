/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 */
package gg.squire.hunter.tasks;

import gg.squire.hunter.tasks.HunterManager;
import gg.squire.hunter.tasks.GameEnum16;
import e.t.r.i.s.h.q.n.r.u.-.u.e.f;
import gg.squire.hunter.tasks.GameEnum9;
import gg.squire.hunter.tasks.HunterTaskBase;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.hunter.SquireHunterConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;

@TaskDesc(name="Resetting box trap", priority=15)
public class ResettingBoxTrapTask
extends HunterTaskBase {

    private static boolean lIIIllIllllIlIl(Object object, Object object2) {
        return object != object2;
    }

    @Override
    public boolean x() {
        String string;
        l var1;
        Player player = Players.getLocal();
        if (l.lIIIllIllllIIlI(player.getAnimation(), lllIlllIlllI[0])) {
            return lllIlllIlllI[1];
        }
        f var2 = var1.y().h().values().stream().filter(f2 -> {
            boolean bl;
            if (!l.lIIIllIllllIlIl((Object)f2.q(), (Object)g.FULL) || l.lIIIllIllllIlII((Object)f2.q(), (Object)g.EMPTY)) {
                bl = lllIlllIlllI[2];

                if (((0xF9 ^ 0xB3) & ~(0x4C ^ 6)) != ((0x19 ^ 0x35) & ~(0x6E ^ 0x42))) {
                    return false;
                }
            } else {
                bl = lllIlllIlllI[1];
            }
            return bl;
        }).min(Comparator.comparing(f2 -> -f2.m())).orElse(null);
        if (l.lIIIllIllllIIll(var2)) {
            return lllIlllIlllI[1];
        }
        TileObject var3 = TileObjects.getFirstAt((WorldPoint)var2.o(), tileObject -> {
            String[] stringArray = new String[lllIlllIlllI[2]];
            stringArray[l.lllIlllIlllI[1]] = lllIlllIllII[lllIlllIlllI[3]];
            return tileObject.hasAction(stringArray);
        });
        if (l.lIIIllIllllIIll(var3)) {
            return lllIlllIlllI[1];
        }
        if (l.lIIIllIllllIlII((Object)var2.q(), (Object)g.FULL)) {
            string = lllIlllIllII[lllIlllIlllI[1]];

            }
        } else {
            string = lllIlllIllII[lllIlllIlllI[2]];
        }
        var3.interact(string);
        return lllIlllIlllI[2];
    }

    static {
        l.lIIIllIllllIIIl();
        l.lIIIllIlllIlIll();
    }

    private static void lIIIllIlllIlIll() {
        lllIlllIllII = new String[lllIlllIlllI[4]];
        l.lllIlllIllII[l.lllIlllIlllI[1]] = "Check";
        l.lllIlllIllII[l.lllIlllIlllI[2]] = "Dismantle";
        l.lllIlllIllII[l.lllIlllIlllI[3]] = "Reset";
    }

    private static boolean lIIIllIllllIlII(Object object, Object object2) {
        return object == object2;
    }

    @Inject
    public ResettingBoxTrapTask(a a2, SquireHunterConfig squireHunterConfig) {
        super(a2, squireHunterConfig, e.CHINS);
    }

    private static boolean lIIIllIllllIIlI(int n2, int n3) {
        return n2 == n3;
    }

        return String.valueOf(var4);
    }

    private static boolean lIIIllIllllIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIllIllllIIll(Object object) {
        return object == null;
    }
}

