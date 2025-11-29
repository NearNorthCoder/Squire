/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.D;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.h;

/* TASK: Walking to nightmare -> WalkingtonightmareTask */
@TaskDesc(name="Walking to nightmare", priority=10, blocking=true)
public class aD
extends D {
    private static /* synthetic */ String[] lllIllIlllll;
    private static final /* synthetic */ Logger eL;
    private static /* synthetic */ int[] lllIlllIIIII;

    @Inject
    protected aD(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, h h2) {
        super(squireNightmareConfig, squireNightmarePlugin, h2);
    }

    private static boolean lIIIllIllIIlIll(int n2) {
        return n2 == 0;
    }

    private static String lIIIllIllIIIlll(String var3, String var17) {
        var3 = new String(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var1 = new StringBuilder();
        char[] var16 = var17.toCharArray();
        int var15 = lllIlllIIIII[0];
        char[] var6 = var3.toCharArray();
        int var13 = var6.length;
        int var10 = lllIlllIIIII[0];
        while (aD.lIIIllIllIIllIl(var10, var13)) {
            char var2 = var6[var10];
            var1.append((char)(var2 ^ var16[var15 % var16.length]));
            0;
            ++var15;
            ++var10;
            0;
            if (((86 + 149 - 173 + 116 ^ 171 + 135 - 192 + 68) & (99 + 108 - 103 + 52 ^ 139 + 135 - 190 + 68 ^ -1)) == 0) continue;
            return null;
        }
        return String.valueOf(var1);
    }

    private static void lIIIllIllIIlIIl() {
        lllIlllIIIII = new int[4];
        aD.lllIlllIIIII[0] = (0x46 ^ 6) & ~(0x64 ^ 0x24);
        aD.lllIlllIIIII[1] = 0x5B ^ 0x71 ^ (0x89 ^ 0xAF);
        aD.lllIlllIIIII[2] = 1;
        aD.lllIlllIIIII[3] = 2;
    }

    private static void lIIIllIllIIlIII() {
        lllIllIlllll = new String[lllIlllIIIII[3]];
        aD.lllIllIlllll[aD.lllIlllIIIII[0]] = aD."[WalkToNightmare]: We're already at the well";
        aD.lllIllIlllll[aD.lllIlllIIIII[2]] = aD."Pool of Nightmares";
    }

    static {
        aD.lIIIllIllIIlIIl();
        aD.lIIIllIllIIlIII();
        eL = LoggerFactory.getLogger(aD.class);
    }

    private static String lIIIllIllIIIllI(String var7, String var11) {
        try {
            SecretKeySpec var12 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var11.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var8 = Cipher.getInstance("Blowfish");
            var8.init(lllIlllIIIII[3], var12);
            return new String(var8.doFinal(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var4) {
            var4.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIllIllIIllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIllIllIIllII(Object object) {
        return object != null;
    }

    private static boolean lIIIllIllIIlIlI(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean bY() {
        aD var5;
        if (aD.lIIIllIllIIlIlI(this.cW.ae() ? 1 : 0)) {
            return lllIlllIIIII[0];
        }
        if (aD.lIIIllIllIIlIlI(var5.cW.s() ? 1 : 0)) {
            return lllIlllIIIII[0];
        }
        if (aD.lIIIllIllIIlIlI(var5.cW.ad() ? 1 : 0)) {
            return lllIlllIIIII[0];
        }
        if (aD.lIIIllIllIIlIll(Movement.shouldWalk() ? 1 : 0)) {
            return lllIlllIIIII[0];
        }
        TileObject var9 = TileObjects.getNearest(tileObject -> tileObject.getName().contains(lllIllIlllll[lllIlllIIIII[2]]));
        Player var14 = Players.getLocal();
        if (aD.lIIIllIllIIllII(var9) && aD.lIIIllIllIIllIl(var14.distanceTo((Locatable)var9), lllIlllIIIII[1])) {
            Log.info((String)lllIllIlllll[lllIlllIIIII[0]]);
            return lllIlllIIIII[0];
        }
        Movement.walkTo((WorldPoint)cU);
        0;
        return lllIlllIIIII[2];
    }
}

