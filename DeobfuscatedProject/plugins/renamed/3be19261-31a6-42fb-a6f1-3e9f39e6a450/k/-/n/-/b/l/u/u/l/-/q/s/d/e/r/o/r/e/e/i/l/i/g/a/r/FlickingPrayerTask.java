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
import k.-.n.-.b.l.u.u.l.-.q.s.d.e.r.o.r.e.e.i.l.i.g.a.r.CEnum;
import net.runelite.api.Actor;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.widgets.Prayers;

/* TASK: Flicking Prayer -> FlickingprayerTask */
@TaskDesc(name="Flicking Prayer", priority=15)
public class FlickingPrayerTask
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

    private static String llIlIIIIllIllI(String var8, String var4) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var7 = Cipher.getInstance("Blowfish");
            var7.init(lIIlllIlIllI[2], var1);
            return new String(var7.doFinal(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
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
        List var5;
        i var3;
        block14: {
            block13: {
                if (i.llIlIIIIlllIIl(this.E.flickPrayer() ? 1 : 0)) {
                    return lIIlllIlIllI[0];
                }
                if (i.llIlIIIIlllIIl(Prayers.getPoints())) {
                    return lIIlllIlIllI[0];
                }
                Actor var2 = Players.getLocal().getInteracting();
                if (!i.llIlIIIIlllIlI(var2)) break block13;
                String[] stringArray = new String[lIIlllIlIllI[1]];
                stringArray[i.lIIlllIlIllI[0]] = lIIlllIlIlIl[lIIlllIlIllI[0]];
                if (!i.llIlIIIIlllIIl(var2.hasAction(stringArray) ? 1 : 0)) break block14;
            }
            if (i.llIlIIIIlllIll(Prayers.anyActive() ? 1 : 0)) {
                Prayers.disableAll();
                return lIIlllIlIllI[1];
            }
            return lIIlllIlIllI[0];
        }
        if (i.llIlIIIIllllII((Object)var3.E.attackStyle(), (Object)c.MELEE)) {
            var5 = Prayers.getMeleePrayer();
            0;
            if (1 < 0) {
                return false;
            }
        } else if (i.llIlIIIIllllII((Object)var3.E.attackStyle(), (Object)c.RANGE)) {
            var5 = Prayers.getRangePrayers();
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

