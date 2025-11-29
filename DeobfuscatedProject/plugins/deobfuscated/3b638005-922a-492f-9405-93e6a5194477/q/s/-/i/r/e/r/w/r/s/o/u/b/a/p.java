/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 */
package q.s.-.i.r.e.r.w.r.s.o.u.b.a;

import gg.squire.barrows.SquireBarrows;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import q.s.-.i.r.e.r.w.r.s.o.u.b.a.d;

@TaskDesc(name="Exiting crypt", priority=150, blocking=true)
public class p
extends Task {
    private static /* synthetic */ String[] llllIlIlIll;
    private static /* synthetic */ int[] llllIlIllII;
    private final /* synthetic */ SquireBarrows W;

    private static void lIllIlIlllIIII() {
        llllIlIllII = new int[4];
        p.llllIlIllII[0] = (0x2E ^ 0x72) & ~(0x45 ^ 0x19);
        p.llllIlIllII[1] = 0xCA ^ 0x97 ^ (0x54 ^ 0xC);
        p.llllIlIllII[2] = 1;
        p.llllIlIllII[3] = 2;
    }

    private static String lIllIlIllIllIl(String llllllllllllllllIIIllIIlIlllIlIl, String llllllllllllllllIIIllIIlIlllIIlI) {
        try {
            SecretKeySpec llllllllllllllllIIIllIIlIllllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIIllIIlIlllIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIIllIIlIlllIlll = Cipher.getInstance("Blowfish");
            llllllllllllllllIIIllIIlIlllIlll.init(llllIlIllII[3], llllllllllllllllIIIllIIlIllllIII);
            return new String(llllllllllllllllIIIllIIlIlllIlll.doFinal(Base64.getDecoder().decode(llllllllllllllllIIIllIIlIlllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIIllIIlIlllIllI) {
            llllllllllllllllIIIllIIlIlllIllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIlIlllIlll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIllIlIlllIllI(int n2) {
        return n2 != 0;
    }

    static {
        p.lIllIlIlllIIII();
        p.lIllIlIllIllll();
    }

    private static boolean lIllIlIlllIIll(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIllIlIlllIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIllIlIllIllll() {
        llllIlIlIll = new String[llllIlIllII[3]];
        p.llllIlIlIll[p.llllIlIllII[0]] = p."Staircase";
        p.llllIlIlIll[p.llllIlIllII[2]] = p."Climb-up";
    }

    @Inject
    public p(SquireBarrows squireBarrows) {
        this.W = squireBarrows;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_2;
        p llllllllllllllllIIIllIIllIIIIIlI;
        if (p.lIllIlIlllIIIl(this.W.h() ? 1 : 0)) {
            return llllIlIllII[0];
        }
        if (p.lIllIlIlllIIIl(llllllllllllllllIIIllIIllIIIIIlI.W.a(llllllllllllllllIIIllIIllIIIIIlI.W.s()) ? 1 : 0) && p.lIllIlIlllIIlI((Object)llllllllllllllllIIIllIIllIIIIIlI.W.r())) {
            return llllIlIllII[0];
        }
        if (p.lIllIlIlllIIIl(llllllllllllllllIIIllIIllIIIIIlI.W.a(llllllllllllllllIIIllIIllIIIIIlI.W.s()) ? 1 : 0) && p.lIllIlIlllIIll((Object)llllllllllllllllIIIllIIllIIIIIlI.W.r(), (Object)llllllllllllllllIIIllIIllIIIIIlI.W.s())) {
            return llllIlIllII[0];
        }
        if (p.lIllIlIlllIlII((Object)llllllllllllllllIIIllIIllIIIIIlI.W.r(), (Object)llllllllllllllllIIIllIIllIIIIIlI.W.s())) {
            int llllllllllllllllIIIllIIllIIIIIIl = llllIlIllII[0];
            d[] llllllllllllllllIIIllIIllIIIIIII = d.values();
            int llllllllllllllllIIIllIIlIlllllll = llllllllllllllllIIIllIIllIIIIIII.length;
            int llllllllllllllllIIIllIIlIllllllI = llllIlIllII[0];
            while (p.lIllIlIlllIlIl(llllllllllllllllIIIllIIlIllllllI, llllllllllllllllIIIllIIlIlllllll)) {
                d llllllllllllllllIIIllIIlIlllllIl = llllllllllllllllIIIllIIllIIIIIII[llllllllllllllllIIIllIIlIllllllI];
                if (p.lIllIlIlllIllI(llllllllllllllllIIIllIIllIIIIIlI.W.a(llllllllllllllllIIIllIIlIlllllIl) ? 1 : 0)) {
                    ++llllllllllllllllIIIllIIllIIIIIIl;
                }
                ++llllllllllllllllIIIllIIlIllllllI;
                0;
                if (null == null) continue;
                return ((0x2B ^ 0x32) & ~(0x94 ^ 0x8D)) != 0;
            }
            if (p.lIllIlIlllIlll(llllllllllllllllIIIllIIllIIIIIIl, llllIlIllII[1])) {
                return llllIlIllII[0];
            }
        }
        String[] stringArray = new String[llllIlIllII[2]];
        stringArray[p.llllIlIllII[0]] = llllIlIlIll[llllIlIllII[0]];
        TileObject llllllllllllllllIIIllIIllIIIIIIl = TileObjects.getNearest((String[])stringArray);
        if (p.lIllIlIlllIIlI(llllllllllllllllIIIllIIllIIIIIIl)) {
            return llllIlIllII[0];
        }
        var1_2.interact(llllIlIlIll[llllIlIllII[2]]);
        return llllIlIllII[2];
    }

    private static boolean lIllIlIlllIIIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIlIlllIlII(Object object, Object object2) {
        return object == object2;
    }

    private static String lIllIlIllIlllI(String llllllllllllllllIIIllIIlIllIIIII, String llllllllllllllllIIIllIIlIllIIlII) {
        llllllllllllllllIIIllIIlIllIIIII = new String(Base64.getDecoder().decode(llllllllllllllllIIIllIIlIllIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIIllIIlIllIIIll = new StringBuilder();
        char[] llllllllllllllllIIIllIIlIllIIIlI = llllllllllllllllIIIllIIlIllIIlII.toCharArray();
        int llllllllllllllllIIIllIIlIllIIIIl = llllIlIllII[0];
        char[] llllllllllllllllIIIllIIlIlIllIll = llllllllllllllllIIIllIIlIllIIIII.toCharArray();
        int llllllllllllllllIIIllIIlIlIllIlI = llllllllllllllllIIIllIIlIlIllIll.length;
        int llllllllllllllllIIIllIIlIlIllIIl = llllIlIllII[0];
        while (p.lIllIlIlllIlIl(llllllllllllllllIIIllIIlIlIllIIl, llllllllllllllllIIIllIIlIlIllIlI)) {
            char llllllllllllllllIIIllIIlIllIIllI = llllllllllllllllIIIllIIlIlIllIll[llllllllllllllllIIIllIIlIlIllIIl];
            llllllllllllllllIIIllIIlIllIIIll.append((char)(llllllllllllllllIIIllIIlIllIIllI ^ llllllllllllllllIIIllIIlIllIIIlI[llllllllllllllllIIIllIIlIllIIIIl % llllllllllllllllIIIllIIlIllIIIlI.length]));
            0;
            ++llllllllllllllllIIIllIIlIllIIIIl;
            ++llllllllllllllllIIIllIIlIlIllIIl;
            0;
            if (-1 < 3) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIIllIIlIllIIIll);
    }

    private static boolean lIllIlIlllIIlI(Object object) {
        return object == null;
    }
}

