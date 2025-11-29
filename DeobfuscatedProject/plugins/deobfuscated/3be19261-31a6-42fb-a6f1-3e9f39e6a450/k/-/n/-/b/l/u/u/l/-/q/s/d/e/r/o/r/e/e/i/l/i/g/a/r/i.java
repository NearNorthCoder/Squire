/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Actor
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.widgets.Prayers
 */
package k.-.n.-.b.l.u.u.l.-.q.s.d.e.r.o.r.e.e.i.l.i.g.a.r;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.combat.SquireBlueDragonKiller;
import gg.squire.combat.SquireBlueDragonKillerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import k.-.n.-.b.l.u.u.l.-.q.s.d.e.r.o.r.e.e.i.l.i.g.a.r.c;
import net.runelite.api.Actor;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.widgets.Prayers;

@TaskDesc(name="Flicking Prayer", priority=15)
public class i
extends Task {
    private static /* synthetic */ String[] lIIlllIlIlIl;
    private static /* synthetic */ int[] lIIlllIlIllI;
    private final /* synthetic */ SquireBlueDragonKiller D;
    private final /* synthetic */ SquireBlueDragonKillerConfig E;

    private static void llIlIIIIlllIII() {
        lIIlllIlIllI = new int[3];
        i.lIIlllIlIllI[0] = (0x65 ^ 0x4A) & ~(0xBD ^ 0x92);
        i.lIIlllIlIllI[1] = 1;
        i.lIIlllIlIllI[2] = 2;
    }

    private static boolean llIlIIIIllllII(Object object, Object object2) {
        return object == object2;
    }

    private static String llIlIIIIllIllI(String lllllllllllllllIlllIlIlIlllIlllI, String lllllllllllllllIlllIlIlIlllIllIl) {
        try {
            SecretKeySpec lllllllllllllllIlllIlIlIllllIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlIlIlllIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlllIlIlIllllIIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlllIlIlIllllIIII.init(lIIlllIlIllI[2], lllllllllllllllIlllIlIlIllllIIIl);
            return new String(lllllllllllllllIlllIlIlIllllIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlIlIlllIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIlIlIlllIllll) {
            lllllllllllllllIlllIlIlIlllIllll.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIIIIlllIll(int n) {
        return n != 0;
    }

    private static boolean llIlIIIIlllIIl(int n) {
        return n == 0;
    }

    private static boolean llIlIIIIlllIlI(Object object) {
        return object != null;
    }

    public boolean run() {
        List list;
        List lllllllllllllllIlllIlIlIllllIllI;
        i lllllllllllllllIlllIlIlIlllllIII;
        block14: {
            block13: {
                if (i.llIlIIIIlllIIl(this.E.flickPrayer() ? 1 : 0)) {
                    return lIIlllIlIllI[0];
                }
                if (i.llIlIIIIlllIIl(Prayers.getPoints())) {
                    return lIIlllIlIllI[0];
                }
                Actor lllllllllllllllIlllIlIlIllllIlll = Players.getLocal().getInteracting();
                if (!i.llIlIIIIlllIlI(lllllllllllllllIlllIlIlIllllIlll)) break block13;
                String[] stringArray = new String[lIIlllIlIllI[1]];
                stringArray[i.lIIlllIlIllI[0]] = lIIlllIlIlIl[lIIlllIlIllI[0]];
                if (!i.llIlIIIIlllIIl(lllllllllllllllIlllIlIlIllllIlll.hasAction(stringArray) ? 1 : 0)) break block14;
            }
            if (i.llIlIIIIlllIll(Prayers.anyActive() ? 1 : 0)) {
                Prayers.disableAll();
                return lIIlllIlIllI[1];
            }
            return lIIlllIlIllI[0];
        }
        if (i.llIlIIIIllllII((Object)lllllllllllllllIlllIlIlIlllllIII.E.attackStyle(), (Object)c.MELEE)) {
            lllllllllllllllIlllIlIlIllllIllI = Prayers.getMeleePrayer();
            0;
            if (1 < 0) {
                return ((0xE8 ^ 0xC5) & ~(0x8B ^ 0xA6)) != 0;
            }
        } else if (i.llIlIIIIllllII((Object)lllllllllllllllIlllIlIlIlllllIII.E.attackStyle(), (Object)c.RANGE)) {
            lllllllllllllllIlllIlIlIllllIllI = Prayers.getRangePrayers();
            0;
            if (3 == 0) {
                return ((0x8D ^ 0xBD ^ (0x19 ^ 0x71)) & (211 + 157 - 292 + 161 ^ 86 + 157 - 66 + 4 ^ -1)) != 0;
            }
        } else {
            list = Prayers.getMagePrayers();
        }
        return Prayers.flick((List)list);
    }

    static {
        i.llIlIIIIlllIII();
        i.llIlIIIIllIlll();
    }

    @Inject
    public i(SquireBlueDragonKiller squireBlueDragonKiller, SquireBlueDragonKillerConfig squireBlueDragonKillerConfig) {
        this.D = squireBlueDragonKiller;
        this.E = squireBlueDragonKillerConfig;
    }

    private static void llIlIIIIllIlll() {
        lIIlllIlIlIl = new String[lIIlllIlIllI[1]];
        i.lIIlllIlIlIl[i.lIIlllIlIllI[0]] = i."Attack";
    }
}

