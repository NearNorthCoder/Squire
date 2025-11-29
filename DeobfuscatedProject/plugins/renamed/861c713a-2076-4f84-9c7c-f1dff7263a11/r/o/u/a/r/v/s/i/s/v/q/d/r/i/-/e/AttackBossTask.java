/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Actor
 *  net.runelite.api.Client
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.entities.Players
 */
package r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vardorvis.SquireVardorvis;
import gg.squire.vardorvis.SquireVardorvisConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.Players;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.a_Unknown;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.b_Unknown;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.e_Unknown;

/* TASK: Attack Boss -> AttackbossTask */
@TaskDesc(name="Attack Boss", priority=4000, blocking=true)
public class AttackBossTask
extends a_Unknown {
    private /* synthetic */ List<Widget> ap;
    private static /* synthetic */ int[] lIlIlIlIIIIII;
    private static /* synthetic */ int ao;
    private static /* synthetic */ String[] lIlIlIIllllll;

    private static boolean lIlllllIIllIIIl(Object object) {
        return object != null;
    }

    private static String lIlllllIIlIllII(String var14, String var17) {
        try {
            SecretKeySpec var7 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var17.getBytes(StandardCharsets.UTF_8)), lIlIlIlIIIIII[4]), "DES");
            Cipher var10 = Cipher.getInstance("DES");
            var10.init(lIlIlIlIIIIII[3], var7);
            return new String(var10.doFinal(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean l() {
        int var4;
        int n2;
        u var12;
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.AttackBossTask.lIlllllIIllIIII(this.z ? 1 : 0)) {
            return lIlIlIlIIIIII[0];
        }
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.AttackBossTask.lIlllllIIllIIII(var12.x.getWorldLocation().equals((Object)p) ? 1 : 0) && r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.AttackBossTask.lIlllllIIllIIII(var12.x.getWorldLocation().equals((Object)q) ? 1 : 0) && r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.AttackBossTask.lIlllllIIllIIII(var12.x.getWorldLocation().equals((Object)r) ? 1 : 0)) {
            return lIlIlIlIIIIII[0];
        }
        Actor var16 = Players.getLocal().getInteracting();
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.AttackBossTask.lIlllllIIllIIIl(var16) && r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.AttackBossTask.lIlllllIIllIIlI(var16.hasAction(lIlIlIIllllll[lIlIlIlIIIIII[0]]::equals) ? 1 : 0)) {
            n2 = lIlIlIlIIIIII[1];
            0;
            if (1 <= ((0x82 ^ 0xB1) & ~(0x68 ^ 0x5B))) {
                return false;
            }
        } else {
            n2 = lIlIlIlIIIIII[0];
        }
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.AttackBossTask.lIlllllIIllIIlI(var4 = n2)) {
            return lIlIlIlIIIIII[0];
        }
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.AttackBossTask.lIlllllIIllIIlI(var12.y.getWorldArea().getMeleeTiles(var12.w).contains(var12.x.getWorldLocation()) ? 1 : 0)) {
            var12.y.interact(lIlIlIIllllll[lIlIlIlIIIIII[1]]);
            return lIlIlIlIIIIII[1];
        }
        return lIlIlIlIIIIII[0];
    }

    private static void lIlllllIIlIllll() {
        lIlIlIlIIIIII = new int[5];
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.AttackBossTask.lIlIlIlIIIIII[0] = (0xCB ^ 0x93) & ~(0x34 ^ 0x6C);
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.AttackBossTask.lIlIlIlIIIIII[1] = 1;
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.AttackBossTask.lIlIlIlIIIIII[2] = -(0xFFFFEF0D & 0x53F3) & (0xFFFFCFDB & 0x341732F);
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.AttackBossTask.lIlIlIlIIIIII[3] = 2;
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.AttackBossTask.lIlIlIlIIIIII[4] = 0xA5 ^ 0xAD;
    }

    private static String lIlllllIIlIllIl(String var3, String var5) {
        var3 = new String(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var6 = var5.toCharArray();
        int var8 = lIlIlIlIIIIII[0];
        char[] var11 = var3.toCharArray();
        int var13 = var11.length;
        int var15 = lIlIlIlIIIIII[0];
        while (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.AttackBossTask.lIlllllIIllIIll(var15, var13)) {
            char var2 = var11[var15];
            var9.append((char)(var2 ^ var6[var8 % var6.length]));
            0;
            ++var8;
            ++var15;
            0;
            
            return null;
        }
        return String.valueOf(var9);
    }

    private static boolean lIlllllIIllIIlI(int n2) {
        return n2 != 0;
    }

    @Inject
    protected u(SquireVardorvis squireVardorvis, SquireVardorvisConfig squireVardorvisConfig, e e2, b b2, Client client) {
        super(squireVardorvis, squireVardorvisConfig, e2, b2, client);
        this.ap = new ArrayList<Widget>();
    }

    private static void lIlllllIIlIlllI() {
        lIlIlIIllllll = new String[lIlIlIlIIIIII[3]];
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.AttackBossTask.lIlIlIIllllll[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.AttackBossTask.lIlIlIlIIIIII[0]] = r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.AttackBossTask."Attack";
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.AttackBossTask.lIlIlIIllllll[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.AttackBossTask.lIlIlIlIIIIII[1]] = r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.AttackBossTask."Attack";
    }

    private static boolean lIlllllIIllIIll(int n2, int n3) {
        return n2 < n3;
    }

    static {
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.AttackBossTask.lIlllllIIlIllll();
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.AttackBossTask.lIlllllIIlIlllI();
        ao = lIlIlIlIIIIII[2];
    }

    private static boolean lIlllllIIllIIII(int n2) {
        return n2 == 0;
    }
}

