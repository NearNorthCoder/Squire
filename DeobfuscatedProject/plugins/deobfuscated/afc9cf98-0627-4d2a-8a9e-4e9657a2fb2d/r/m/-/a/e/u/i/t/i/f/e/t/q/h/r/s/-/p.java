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
import r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-.i;
import r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-.r;

@TaskDesc(name="Harvesting Plant")
public class p
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

    private static String lIllIllIlllllII(String llllllllllllllIlllIIlIIIIIllIIIl, String llllllllllllllIlllIIlIIIIIllIIlI) {
        try {
            SecretKeySpec llllllllllllllIlllIIlIIIIIllIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIlIIIIIllIIlI.getBytes(StandardCharsets.UTF_8)), lIlIIIIIlIlIl[4]), "DES");
            Cipher llllllllllllllIlllIIlIIIIIllIlIl = Cipher.getInstance("DES");
            llllllllllllllIlllIIlIIIIIllIlIl.init(lIlIIIIIlIlIl[2], llllllllllllllIlllIIlIIIIIllIllI);
            return new String(llllllllllllllIlllIIlIIIIIllIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIlIIIIIllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIIlIIIIIllIlII) {
            llllllllllllllIlllIIlIIIIIllIlII.printStackTrace();
            return null;
        }
    }

    public boolean run() {
        p llllllllllllllIlllIIlIIIIlIIllII;
        TileObject tileObject = this.Z.a(lIlIIIIIlIIll[lIlIIIIIlIlIl[0]]);
        if (p.lIllIllIlllllll(tileObject)) {
            return lIlIIIIIlIlIl[0];
        }
        TileObject llllllllllllllIlllIIlIIIIlIIlIlI = llllllllllllllIlllIIlIIIIlIIllII.Z.a(lIlIIIIIlIIll[lIlIIIIIlIlIl[1]]);
        if (p.lIllIlllIIIIIII(llllllllllllllIlllIIlIIIIlIIlIlI)) {
            return lIlIIIIIlIlIl[0];
        }
        llllllllllllllIlllIIlIIIIlIIlIlI.interact(lIlIIIIIlIIll[lIlIIIIIlIlIl[2]]);
        GameObject llllllllllllllIlllIIlIIIIlIIlIIl = (GameObject)llllllllllllllIlllIIlIIIIlIIlIlI;
        Player llllllllllllllIlllIIlIIIIlIIlIII = Players.getLocal();
        if (p.lIllIlllIIIIIIl(llllllllllllllIlllIIlIIIIlIIlIIl.getWorldArea().isInMeleeDistance(llllllllllllllIlllIIlIIIIlIIlIII.getWorldArea()) ? 1 : 0)) {
            llllllllllllllIlllIIlIIIIlIIllII.sleep(lIlIIIIIlIlIl[2]);
        }
        return lIlIIIIIlIlIl[1];
    }

    private static boolean lIllIlllIIIIIII(Object object) {
        return object == null;
    }

    private static String lIllIllIlllIlII(String llllllllllllllIlllIIlIIIIIlllllI, String llllllllllllllIlllIIlIIIIIllllIl) {
        try {
            SecretKeySpec llllllllllllllIlllIIlIIIIlIIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIlIIIIIllllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIIlIIIIlIIIIlI = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIIlIIIIlIIIIlI.init(lIlIIIIIlIlIl[2], llllllllllllllIlllIIlIIIIlIIIIll);
            return new String(llllllllllllllIlllIIlIIIIlIIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIlIIIIIlllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIIlIIIIlIIIIIl) {
            llllllllllllllIlllIIlIIIIlIIIIIl.printStackTrace();
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

