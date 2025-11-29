/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Reachable
 */
package -.r.u.q.e.s.o.t.a.i;

import -.r.u.q.e.s.o.t.a.i.n;
import -.r.u.q.e.s.o.t.a.i.z;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.toa.SquireTOA;
import gg.squire.toa.TOAConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Reachable;

@TaskDesc(name="Handling Kephri Prayers")
public class P
extends z {
    private static /* synthetic */ String[] lIlIIIIIlllIl;
    private static /* synthetic */ int[] lIlIIIIIllllI;

    @Override
    public n J() {
        return this.aT.prayerModeKephri();
    }

    private static String lIllIllIlIIIIlI(String llllllllllllllIlllIIlIlIllIlIIII, String llllllllllllllIlllIIlIlIllIlIIIl) {
        try {
            SecretKeySpec llllllllllllllIlllIIlIlIllIlIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIlIlIllIlIIIl.getBytes(StandardCharsets.UTF_8)), lIlIIIIIllllI[8]), "DES");
            Cipher llllllllllllllIlllIIlIlIllIlIlII = Cipher.getInstance("DES");
            llllllllllllllIlllIIlIlIllIlIlII.init(lIlIIIIIllllI[3], llllllllllllllIlllIIlIlIllIlIlIl);
            return new String(llllllllllllllIlllIIlIlIllIlIlII.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIlIlIllIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIIlIlIllIlIIll) {
            llllllllllllllIlllIIlIlIllIlIIll.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean I() {
        return lIlIIIIIllllI[0];
    }

    private static boolean lIllIllIlIIIllI(Object object) {
        return object != null;
    }

    @Override
    public int F() {
        return lIlIIIIIllllI[4];
    }

    private static boolean lIllIllIlIIlIII(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean C() {
        int[] nArray = new int[lIlIIIIIllllI[2]];
        nArray[P.lIlIIIIIllllI[1]] = lIlIIIIIllllI[5];
        nArray[P.lIlIIIIIllllI[0]] = lIlIIIIIllllI[6];
        nArray[P.lIlIIIIIllllI[3]] = lIlIIIIIllllI[7];
        return this.aS.a(nArray);
    }

    @Override
    public List<Prayer> E() {
        String[] stringArray = new String[lIlIIIIIllllI[0]];
        stringArray[P.lIlIIIIIllllI[1]] = lIlIIIIIlllIl[lIlIIIIIllllI[1]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (P.lIllIllIlIIIllI(nPC) && P.lIllIllIlIIIlll(nPC.distanceTo((Locatable)Players.getLocal()), lIlIIIIIllllI[2]) && P.lIllIllIlIIlIII(Reachable.isInteractable((Locatable)nPC) ? 1 : 0)) {
            return List.of(this.H(), Prayer.PROTECT_FROM_MELEE);
        }
        String[] stringArray2 = new String[lIlIIIIIllllI[3]];
        stringArray2[P.lIlIIIIIllllI[1]] = lIlIIIIIlllIl[lIlIIIIIllllI[0]];
        stringArray2[P.lIlIIIIIllllI[0]] = lIlIIIIIlllIl[lIlIIIIIllllI[3]];
        NPC llllllllllllllIlllIIlIlIllllllll = NPCs.getNearest((String[])stringArray2);
        if (P.lIllIllIlIIIllI(llllllllllllllIlllIIlIlIllllllll)) {
            P llllllllllllllIlllIIlIllIIIIIIIl;
            return List.of(llllllllllllllIlllIIlIllIIIIIIIl.H(), Prayer.PROTECT_FROM_MISSILES);
        }
        return List.of(this.H());
    }

    private static String lIllIllIlIIIIll(String llllllllllllllIlllIIlIlIllllIlll, String llllllllllllllIlllIIlIlIllllIllI) {
        try {
            SecretKeySpec llllllllllllllIlllIIlIlIlllllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIlIlIllllIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIIlIlIlllllIIl = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIIlIlIlllllIIl.init(lIlIIIIIllllI[3], llllllllllllllIlllIIlIlIlllllIlI);
            return new String(llllllllllllllIlllIIlIlIlllllIIl.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIlIlIllllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIIlIlIlllllIII) {
            llllllllllllllIlllIIlIlIlllllIII.printStackTrace();
            return null;
        }
    }

    private static String lIllIllIlIIIIIl(String llllllllllllllIlllIIlIlIlllIIlll, String llllllllllllllIlllIIlIlIlllIIIIl) {
        llllllllllllllIlllIIlIlIlllIIlll = new String(Base64.getDecoder().decode(llllllllllllllIlllIIlIlIlllIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIIlIlIlllIIlIl = new StringBuilder();
        char[] llllllllllllllIlllIIlIlIlllIIlII = llllllllllllllIlllIIlIlIlllIIIIl.toCharArray();
        int llllllllllllllIlllIIlIlIlllIIIll = lIlIIIIIllllI[1];
        char[] llllllllllllllIlllIIlIlIllIlllIl = llllllllllllllIlllIIlIlIlllIIlll.toCharArray();
        int llllllllllllllIlllIIlIlIllIlllII = llllllllllllllIlllIIlIlIllIlllIl.length;
        int llllllllllllllIlllIIlIlIllIllIll = lIlIIIIIllllI[1];
        while (P.lIllIllIlIIlIIl(llllllllllllllIlllIIlIlIllIllIll, llllllllllllllIlllIIlIlIllIlllII)) {
            char llllllllllllllIlllIIlIlIlllIlIII = llllllllllllllIlllIIlIlIllIlllIl[llllllllllllllIlllIIlIlIllIllIll];
            llllllllllllllIlllIIlIlIlllIIlIl.append((char)(llllllllllllllIlllIIlIlIlllIlIII ^ llllllllllllllIlllIIlIlIlllIIlII[llllllllllllllIlllIIlIlIlllIIIll % llllllllllllllIlllIIlIlIlllIIlII.length]));
            "".length();
            ++llllllllllllllIlllIIlIlIlllIIIll;
            ++llllllllllllllIlllIIlIlIllIllIll;
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIlllIIlIlIlllIIlIl);
    }

    private static boolean lIllIllIlIIIlll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIllIllIlIIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIllIllIlIIIlIl() {
        lIlIIIIIllllI = new int[9];
        P.lIlIIIIIllllI[0] = " ".length();
        P.lIlIIIIIllllI[1] = (0xD9 ^ 0x85) & ~(0x53 ^ 0xF);
        P.lIlIIIIIllllI[2] = "   ".length();
        P.lIlIIIIIllllI[3] = "  ".length();
        P.lIlIIIIIllllI[4] = -(0xFFFFDBEB & 0x64B7) & (0xFFFFFFF7 & 0x77FE);
        P.lIlIIIIIllllI[5] = -(0x35 ^ 4) & (0xFFFFBDF7 & 0x6FFF);
        P.lIlIIIIIllllI[6] = 0xFFFFAFDB & 0x7DEC;
        P.lIlIIIIIllllI[7] = -(0xFFFFD63F & 0x69F7) & (0xFFFFFFFF & 0x6DFF);
        P.lIlIIIIIllllI[8] = 0x18 ^ 0x10;
    }

    @Inject
    public P(SquireTOA squireTOA, TOAConfig tOAConfig) {
        super(squireTOA, tOAConfig);
    }

    private static void lIllIllIlIIIlII() {
        lIlIIIIIlllIl = new String[lIlIIIIIllllI[2]];
        P.lIlIIIIIlllIl[P.lIlIIIIIllllI[1]] = P.lIllIllIlIIIIIl("JzgvBw8RJWMwBRUlIgE=", "tWCcf");
        P.lIlIIIIIlllIl[P.lIlIIIIIllllI[0]] = P.lIllIllIlIIIIlI("IJMQV5/CGIt8BcdtjWadAQ==", "MNfcV");
        P.lIlIIIIIlllIl[P.lIlIIIIIllllI[3]] = P.lIllIllIlIIIIll("cGVLMX54xbs46wYwQ/9QOQ==", "MLhmZ");
    }

    static {
        P.lIllIllIlIIIlIl();
        P.lIllIllIlIIIlII();
    }
}

