/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.widgets.Dialog
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import -.m.e.a.u.s.r.r.q.i.r.e.f.D;
import -.m.e.a.u.s.r.r.q.i.r.e.f.E;
import -.m.e.a.u.s.r.r.q.i.r.e.f.F;
import -.m.e.a.u.s.r.r.q.i.r.e.f.aG;
import -.m.e.a.u.s.r.r.q.i.r.e.f.j;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmer;
import gg.squire.farmer.SquireFarmerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Duration;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.widgets.Dialog;

/* TASK: Emptying birdhouse -> EmptyingbirdhouseTask */
@TaskDesc(name="Emptying birdhouse", priority=5)
public class aH
extends aG {
    private static /* synthetic */ String[] llIIIlIIllll;
    private static /* synthetic */ int[] llIIIlIlIIII;

    private static String llllIlIIIlllIl(String var12, String var8) {
        try {
            SecretKeySpec var6 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var8.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var10 = Cipher.getInstance("Blowfish");
            var10.init(llIIIlIlIIII[3], var6);
            return new String(var10.doFinal(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    private static void llllIlIIIlllll() {
        llIIIlIlIIII = new int[5];
        aH.llIIIlIlIIII[0] = 1;
        aH.llIIIlIlIIII[1] = (0xB1 ^ 0xA3) & ~(0x8E ^ 0x9C);
        aH.llIIIlIlIIII[2] = 0x59 ^ 0x49;
        aH.llIIIlIlIIII[3] = 2;
        aH.llIIIlIlIIII[4] = 0xA3 ^ 0xA7 ^ (0x2B ^ 0x27);
    }

    private static boolean llllIlIIlIIIIl(Object object) {
        return object != null;
    }

    private static void llllIlIIIllllI() {
        llIIIlIIllll = new String[llIIIlIlIIII[3]];
        aH.llIIIlIIllll[aH.llIIIlIlIIII[1]] = aH."Empty";
        aH.llIIIlIIllll[aH.llIIIlIlIIII[0]] = aH."discard the birdhouse and contents";
    }

    @Inject
    protected aH(SquireFarmer squireFarmer, SquireFarmerConfig squireFarmerConfig, j j2) {
        F[] fArray = new F[llIIIlIlIIII[0]];
        fArray[aH.llIIIlIlIIII[1]] = F.SEEDED;
        super(squireFarmer, squireFarmerConfig, j2, fArray);
    }

    private static String llllIlIIIlllII(String var13, String var11) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var11.getBytes(StandardCharsets.UTF_8)), llIIIlIlIIII[4]), "DES");
            Cipher var14 = Cipher.getInstance("DES");
            var14.init(llIIIlIlIIII[3], var2);
            return new String(var14.doFinal(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    private static boolean llllIlIIlIIIll(int n2) {
        return n2 != 0;
    }

    private static boolean llllIlIIlIIIlI(int n2, int n3) {
        return n2 > n3;
    }

    static {
        aH.llllIlIIIlllll();
        aH.llllIlIIIllllI();
    }

    private static boolean llllIlIIlIIIII(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean f(E e2) {
        void var2_2;
        void var7;
        aH var5;
        if (aH.llllIlIIlIIIII(this.cu.c(e2) ? 1 : 0)) {
            return llIIIlIlIIII[1];
        }
        TileObject var1 = var5.cu.a((E)var7);
        if (!aH.llllIlIIlIIIIl(var1) || aH.llllIlIIlIIIlI(var1.distanceTo((Locatable)Players.getLocal()), llIIIlIlIIII[2])) {
            return llIIIlIlIIII[1];
        }
        if (aH.llllIlIIlIIIll(Dialog.isViewingOptions() ? 1 : 0) && aH.llllIlIIlIIIll(Dialog.hasOption(string -> string.contains(llIIIlIIllll[llIIIlIlIIII[0]])) ? 1 : 0)) {
            var5.cu.Q().add((E)var7);
            0;
            D var4 = (D)var5.cu.R().get(var7);
            var5.cu.R().replace((E)var7, new D((E)var7, var4.ax(), var4.ay() + Duration.ofMinutes(5L).toSeconds()));
            0;
            return llIIIlIlIIII[0];
        }
        var2_2.interact(llIIIlIIllll[llIIIlIlIIII[1]]);
        return llIIIlIlIIII[0];
    }
}

