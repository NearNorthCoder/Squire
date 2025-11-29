/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 */
package s.r.i.t.g.n.-.u.h.i.q.i.e.v.e;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.thieving.SquireThieving;
import gg.squire.thieving.SquireThievingConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.s_Unknown;

/* TASK: Going back inside -> GoingbackinsideTask */
@TaskDesc(name="Going back inside", priority=0x7FFFFFFF, blocking=true)
public class GoingBackInsideTask
extends s_Unknown {
    private static /* synthetic */ String[] lIIlllIIIllII;
    private static /* synthetic */ int[] lIIlllIIIllIl;

    private static void lIllIIlIlIlIllI() {
        lIIlllIIIllIl = new int[5];
        v.lIIlllIIIllIl[0] = 93 + 58 - 35 + 75 ^ 65 + 25 - 67 + 163;
        v.lIIlllIIIllIl[1] = 1;
        v.lIIlllIIIllIl[2] = (0x91 ^ 0xAB) & ~(0x35 ^ 0xF);
        v.lIIlllIIIllIl[3] = 2;
        v.lIIlllIIIllIl[4] = 0xCC ^ 0xC4;
    }

    private static String lIllIIlIlIlIlII(String var15, String var8) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var8.getBytes(StandardCharsets.UTF_8)), lIIlllIIIllIl[4]), "DES");
            Cipher var7 = Cipher.getInstance("DES");
            var7.init(lIIlllIIIllIl[3], var1);
            return new String(var7.doFinal(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean l() {
        if (v.lIllIIlIlIlIlll(Movement.isRunEnabled() ? 1 : 0) && v.lIllIIlIlIllIII(Movement.getRunEnergy(), lIIlllIIIllIl[0])) {
            Movement.toggleRun();
            return lIIlllIIIllIl[1];
        }
        if (v.lIllIIlIlIlIlll(Movement.shouldWalk() ? 1 : 0)) {
            return lIIlllIIIllIl[2];
        }
        String[] stringArray = new String[lIIlllIIIllIl[1]];
        stringArray[v.lIIlllIIIllIl[2]] = lIIlllIIIllII[lIIlllIIIllIl[2]];
        TileObject var4 = TileObjects.getNearest((String[])stringArray);
        if (v.lIllIIlIlIllIIl(var4)) {
            var4.interact(lIIlllIIIllII[lIIlllIIIllIl[1]]);
            return lIIlllIIIllIl[1];
        }
        return lIIlllIIIllIl[2];
    }

    private static boolean lIllIIlIlIllIIl(Object object) {
        return object != null;
    }

    private static boolean lIllIIlIlIlIlll(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIIlIlIllIII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIllIIlIlIllIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIllIIlIlIlIlIl() {
        lIIlllIIIllII = new String[lIIlllIIIllIl[3]];
        v.lIIlllIIIllII[v.lIIlllIIIllIl[2]] = v."Lizard dwelling";
        v.lIIlllIIIllII[v.lIIlllIIIllIl[1]] = v."Enter";
    }

    @Inject
    public v(SquireThieving squireThieving, SquireThievingConfig squireThievingConfig) {
        super(squireThieving, squireThievingConfig);
    }

    private static String lIllIIlIlIlIIll(String var3, String var9) {
        var3 = new String(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var10 = var9.toCharArray();
        int var12 = lIIlllIIIllIl[2];
        char[] var5 = var3.toCharArray();
        int var2 = var5.length;
        int var11 = lIIlllIIIllIl[2];
        while (v.lIllIIlIlIllIlI(var11, var2)) {
            char var14 = var5[var11];
            var6.append((char)(var14 ^ var10[var12 % var10.length]));
            0;
            ++var12;
            ++var11;
            0;
            if ((0x83 ^ 0x98 ^ (0xD ^ 0x12)) > 2) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    static {
        v.lIllIIlIlIlIllI();
        v.lIllIIlIlIlIlIl();
    }
}

