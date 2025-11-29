/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.GameObject
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 */
package r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.GameObject;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-.i_Unknown;
import r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-.r;

/* TASK: Harvesting Plant -> HarvestingplantTask */
@TaskDesc(name="Harvesting Plant")
public class HarvestingPlantTask
extends r {
    private static /* synthetic */ String[] lIlIIIIIlIIll;
    private static /* synthetic */ int[] lIlIIIIIlIlIl;

    @Inject
    protected p(i i2) {
        super(i2);
    }

    private static boolean lIllIlllIIIIIIl(int n2) {
        return n2 != 0;
    }

    static {
        p.lIllIllIllllllI();
        p.lIllIllIlllllIl();
    }

    private static boolean lIllIllIlllllll(Object object) {
        return object != null;
    }

    private static String lIllIllIlllllII(String var3, String var5) {
        try {
            SecretKeySpec var6 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), lIlIIIIIlIlIl[4]), "DES");
            Cipher var12 = Cipher.getInstance("DES");
            var12.init(lIlIIIIIlIlIl[2], var6);
            return new String(var12.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    public boolean run() {
        p var14;
        TileObject tileObject = this.Z.a(lIlIIIIIlIIll[lIlIIIIIlIlIl[0]]);
        if (p.lIllIllIlllllll(tileObject)) {
            return lIlIIIIIlIlIl[0];
        }
        TileObject var1 = var14.Z.a(lIlIIIIIlIIll[lIlIIIIIlIlIl[1]]);
        if (p.lIllIlllIIIIIII(var1)) {
            return lIlIIIIIlIlIl[0];
        }
        var1.interact(lIlIIIIIlIIll[lIlIIIIIlIlIl[2]]);
        GameObject var7 = (GameObject)var1;
        Player var8 = Players.getLocal();
        if (p.lIllIlllIIIIIIl(var7.getWorldArea().isInMeleeDistance(var8.getWorldArea()) ? 1 : 0)) {
            var14.sleep(lIlIIIIIlIlIl[2]);
        }
        return lIlIIIIIlIlIl[1];
    }

    private static boolean lIllIlllIIIIIII(Object object) {
        return object == null;
    }

    private static String lIllIllIlllIlII(String var10, String var2) {
        try {
            SecretKeySpec var11 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var4 = Cipher.getInstance("Blowfish");
            var4.init(lIlIIIIIlIlIl[2], var11);
            return new String(var4.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    private static void lIllIllIlllllIl() {
        lIlIIIIIlIIll = new String[lIlIIIIIlIlIl[3]];
        p.lIlIIIIIlIIll[p.lIlIIIIIlIlIl[0]] = p."Water";
        p.lIlIIIIIlIIll[p.lIlIIIIIlIlIl[1]] = p."Harvest";
        p.lIlIIIIIlIIll[p.lIlIIIIIlIlIl[2]] = p."Harvest";
    }

    private static void lIllIllIllllllI() {
        lIlIIIIIlIlIl = new int[5];
        p.lIlIIIIIlIlIl[0] = (0x66 ^ 0x5A) & ~(0xC ^ 0x30);
        p.lIlIIIIIlIlIl[1] = 1;
        p.lIlIIIIIlIlIl[2] = 2;
        p.lIlIIIIIlIlIl[3] = 3;
        p.lIlIIIIIlIlIl[4] = 0x28 ^ 0x20;
    }
}

