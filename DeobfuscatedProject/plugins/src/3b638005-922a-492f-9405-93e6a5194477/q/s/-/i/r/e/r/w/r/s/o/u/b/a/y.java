/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Reachable
 */
package q.s.-.i.r.e.r.w.r.s.o.u.b.a;

import gg.squire.barrows.SquireBarrows;
import gg.squire.barrows.SquireBarrowsConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Reachable;

@TaskDesc(name="Opening chest", priority=220, blocking=true)
public class y
extends Task {
    private final /* synthetic */ SquireBarrows an;
    private final /* synthetic */ SquireBarrowsConfig ao;
    private static /* synthetic */ int[] llllIIIIlII;
    private static /* synthetic */ String[] llllIIIIIll;

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (y.lIllIIllIIIlII(this.an.h() ? 1 : 0)) {
            return llllIIIIlII[0];
        }
        String[] stringArray = new String[llllIIIIlII[1]];
        stringArray[y.llllIIIIlII[0]] = llllIIIIIll[llllIIIIlII[0]];
        TileObject llllllllllllllllIIIllllIIlllllII = TileObjects.getNearest((String[])stringArray);
        if (y.lIllIIllIIIlIl(llllllllllllllllIIIllllIIlllllII)) {
            return llllIIIIlII[0];
        }
        String[] stringArray2 = new String[llllIIIIlII[1]];
        stringArray2[y.llllIIIIlII[0]] = llllIIIIIll[llllIIIIlII[1]];
        if (!y.lIllIIllIIIllI(llllllllllllllllIIIllllIIlllllII.hasAction(stringArray2) ? 1 : 0) || !y.lIllIIllIIIllI(Reachable.isInteractable((Locatable)llllllllllllllllIIIllllIIlllllII) ? 1 : 0) || y.lIllIIllIIIlll(llllllllllllllllIIIllllIIlllllII.distanceTo(Players.getLocal().getWorldLocation()), llllIIIIlII[2])) {
            return llllIIIIlII[0];
        }
        var1_1.interact(llllIIIIIll[llllIIIIlII[3]]);
        return llllIIIIlII[1];
    }

    private static boolean lIllIIllIIIlIl(Object object) {
        return object == null;
    }

    private static boolean lIllIIllIIlIII(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIllIIllIIIIIl(String llllllllllllllllIIIllllIIllIllII, String llllllllllllllllIIIllllIIlllIIII) {
        llllllllllllllllIIIllllIIllIllII = new String(Base64.getDecoder().decode(llllllllllllllllIIIllllIIllIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIIllllIIllIllll = new StringBuilder();
        char[] llllllllllllllllIIIllllIIllIlllI = llllllllllllllllIIIllllIIlllIIII.toCharArray();
        int llllllllllllllllIIIllllIIllIllIl = llllIIIIlII[0];
        char[] llllllllllllllllIIIllllIIllIIlll = llllllllllllllllIIIllllIIllIllII.toCharArray();
        int llllllllllllllllIIIllllIIllIIllI = llllllllllllllllIIIllllIIllIIlll.length;
        int llllllllllllllllIIIllllIIllIIlIl = llllIIIIlII[0];
        while (y.lIllIIllIIlIII(llllllllllllllllIIIllllIIllIIlIl, llllllllllllllllIIIllllIIllIIllI)) {
            char llllllllllllllllIIIllllIIlllIIlI = llllllllllllllllIIIllllIIllIIlll[llllllllllllllllIIIllllIIllIIlIl];
            llllllllllllllllIIIllllIIllIllll.append((char)(llllllllllllllllIIIllllIIlllIIlI ^ llllllllllllllllIIIllllIIllIlllI[llllllllllllllllIIIllllIIllIllIl % llllllllllllllllIIIllllIIllIlllI.length]));
            "".length();
            ++llllllllllllllllIIIllllIIllIllIl;
            ++llllllllllllllllIIIllllIIllIIlIl;
            "".length();
            if ((0x96 ^ 0x92) != 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIIllllIIllIllll);
    }

    static {
        y.lIllIIllIIIIll();
        y.lIllIIllIIIIlI();
    }

    private static void lIllIIllIIIIll() {
        llllIIIIlII = new int[5];
        y.llllIIIIlII[0] = (0x55 ^ 9) & ~(0x2C ^ 0x70);
        y.llllIIIIlII[1] = " ".length();
        y.llllIIIIlII[2] = 0x28 ^ 0x2E;
        y.llllIIIIlII[3] = "  ".length();
        y.llllIIIIlII[4] = "   ".length();
    }

    private static void lIllIIllIIIIlI() {
        llllIIIIIll = new String[llllIIIIlII[4]];
        y.llllIIIIIll[y.llllIIIIlII[0]] = y.lIllIIllIIIIII("83PnX4IKnqc=", "FBHBM");
        y.llllIIIIIll[y.llllIIIIlII[1]] = y.lIllIIllIIIIIl("ATYVHg==", "NFppm");
        y.llllIIIIIll[y.llllIIIIlII[3]] = y.lIllIIllIIIIII("EiGP0rtjUEg=", "klSVR");
    }

    private static String lIllIIllIIIIII(String llllllllllllllllIIIllllIIlIlllII, String llllllllllllllllIIIllllIIlIllIll) {
        try {
            SecretKeySpec llllllllllllllllIIIllllIIlIlllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIIllllIIlIllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIIllllIIlIllllI = Cipher.getInstance("Blowfish");
            llllllllllllllllIIIllllIIlIllllI.init(llllIIIIlII[3], llllllllllllllllIIIllllIIlIlllll);
            return new String(llllllllllllllllIIIllllIIlIllllI.doFinal(Base64.getDecoder().decode(llllllllllllllllIIIllllIIlIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIIllllIIlIlllIl) {
            llllllllllllllllIIIllllIIlIlllIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIllIIIllI(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIIllIIIlII(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIIllIIIlll(int n2, int n3) {
        return n2 > n3;
    }

    @Inject
    public y(SquireBarrows squireBarrows, SquireBarrowsConfig squireBarrowsConfig) {
        this.an = squireBarrows;
        this.ao = squireBarrowsConfig;
    }
}

