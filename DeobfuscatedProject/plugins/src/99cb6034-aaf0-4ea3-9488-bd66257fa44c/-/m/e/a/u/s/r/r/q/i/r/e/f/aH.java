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

@TaskDesc(name="Emptying birdhouse", priority=5)
public class aH
extends aG {
    private static /* synthetic */ String[] llIIIlIIllll;
    private static /* synthetic */ int[] llIIIlIlIIII;

    private static String llllIlIIIlllIl(String lllllllllllllllIlIlIlIIIIlIIIIlI, String lllllllllllllllIlIlIlIIIIlIIIIIl) {
        try {
            SecretKeySpec lllllllllllllllIlIlIlIIIIlIIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIlIIIIlIIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIlIlIIIIlIIIlII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIlIlIIIIlIIIlII.init(llIIIlIlIIII[3], lllllllllllllllIlIlIlIIIIlIIIlIl);
            return new String(lllllllllllllllIlIlIlIIIIlIIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIlIIIIlIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIlIlIIIIlIIIIll) {
            lllllllllllllllIlIlIlIIIIlIIIIll.printStackTrace();
            return null;
        }
    }

    private static void llllIlIIIlllll() {
        llIIIlIlIIII = new int[5];
        aH.llIIIlIlIIII[0] = " ".length();
        aH.llIIIlIlIIII[1] = (0xB1 ^ 0xA3) & ~(0x8E ^ 0x9C);
        aH.llIIIlIlIIII[2] = 0x59 ^ 0x49;
        aH.llIIIlIlIIII[3] = "  ".length();
        aH.llIIIlIlIIII[4] = 0xA3 ^ 0xA7 ^ (0x2B ^ 0x27);
    }

    private static boolean llllIlIIlIIIIl(Object object) {
        return object != null;
    }

    private static void llllIlIIIllllI() {
        llIIIlIIllll = new String[llIIIlIlIIII[3]];
        aH.llIIIlIIllll[aH.llIIIlIlIIII[1]] = aH.llllIlIIIlllII("WZO7QMtn9mk=", "DHslU");
        aH.llIIIlIIllll[aH.llIIIlIlIIII[0]] = aH.llllIlIIIlllIl("/LA2cxnKS/jlECIq5yFRg68fvlbQGyoBpsSZjSGd2tBDCsVzSp6TDA==", "ONdmC");
    }

    @Inject
    protected aH(SquireFarmer squireFarmer, SquireFarmerConfig squireFarmerConfig, j j2) {
        F[] fArray = new F[llIIIlIlIIII[0]];
        fArray[aH.llIIIlIlIIII[1]] = F.SEEDED;
        super(squireFarmer, squireFarmerConfig, j2, fArray);
    }

    private static String llllIlIIIlllII(String lllllllllllllllIlIlIlIIIIlIIllIl, String lllllllllllllllIlIlIlIIIIlIIllII) {
        try {
            SecretKeySpec lllllllllllllllIlIlIlIIIIlIlIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIlIIIIlIIllII.getBytes(StandardCharsets.UTF_8)), llIIIlIlIIII[4]), "DES");
            Cipher lllllllllllllllIlIlIlIIIIlIlIIIl = Cipher.getInstance("DES");
            lllllllllllllllIlIlIlIIIIlIlIIIl.init(llIIIlIlIIII[3], lllllllllllllllIlIlIlIIIIlIlIIlI);
            return new String(lllllllllllllllIlIlIlIIIIlIlIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIlIIIIlIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIlIlIIIIlIlIIII) {
            lllllllllllllllIlIlIlIIIIlIlIIII.printStackTrace();
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
        void lllllllllllllllIlIlIlIIIIlIllIIl;
        aH lllllllllllllllIlIlIlIIIIlIllIlI;
        if (aH.llllIlIIlIIIII(this.cu.c(e2) ? 1 : 0)) {
            return llIIIlIlIIII[1];
        }
        TileObject lllllllllllllllIlIlIlIIIIlIllIII = lllllllllllllllIlIlIlIIIIlIllIlI.cu.a((E)lllllllllllllllIlIlIlIIIIlIllIIl);
        if (!aH.llllIlIIlIIIIl(lllllllllllllllIlIlIlIIIIlIllIII) || aH.llllIlIIlIIIlI(lllllllllllllllIlIlIlIIIIlIllIII.distanceTo((Locatable)Players.getLocal()), llIIIlIlIIII[2])) {
            return llIIIlIlIIII[1];
        }
        if (aH.llllIlIIlIIIll(Dialog.isViewingOptions() ? 1 : 0) && aH.llllIlIIlIIIll(Dialog.hasOption(string -> string.contains(llIIIlIIllll[llIIIlIlIIII[0]])) ? 1 : 0)) {
            lllllllllllllllIlIlIlIIIIlIllIlI.cu.Q().add((E)lllllllllllllllIlIlIlIIIIlIllIIl);
            "".length();
            D lllllllllllllllIlIlIlIIIIlIlIlll = (D)lllllllllllllllIlIlIlIIIIlIllIlI.cu.R().get(lllllllllllllllIlIlIlIIIIlIllIIl);
            lllllllllllllllIlIlIlIIIIlIllIlI.cu.R().replace((E)lllllllllllllllIlIlIlIIIIlIllIIl, new D((E)lllllllllllllllIlIlIlIIIIlIllIIl, lllllllllllllllIlIlIlIIIIlIlIlll.ax(), lllllllllllllllIlIlIlIIIIlIlIlll.ay() + Duration.ofMinutes(5L).toSeconds()));
            "".length();
            return llIIIlIlIIII[0];
        }
        var2_2.interact(llIIIlIIllll[llIIIlIlIIII[1]]);
        return llIIIlIlIIII[0];
    }
}

