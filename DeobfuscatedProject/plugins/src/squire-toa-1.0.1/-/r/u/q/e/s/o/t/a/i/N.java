/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 */
package -.r.u.q.e.s.o.t.a.i;

import -.r.u.q.e.s.o.t.a.i.n;
import -.r.u.q.e.s.o.t.a.i.z;
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
import javax.inject.Inject;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;

@TaskDesc(name="Handling babboon prayers")
public class N
extends z {
    private static /* synthetic */ String[] lIlIIIIIIllll;
    private static /* synthetic */ int[] lIlIIIIIlIIII;

    private static String lIllIlIllllllll(String llllllllllllllIlllIIllIIlllIllIl, String llllllllllllllIlllIIllIIlllIllII) {
        try {
            SecretKeySpec llllllllllllllIlllIIllIIllllIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIllIIlllIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIIllIIllllIIIl = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIIllIIllllIIIl.init(lIlIIIIIlIIII[2], llllllllllllllIlllIIllIIllllIIlI);
            return new String(llllllllllllllIlllIIllIIllllIIIl.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIllIIlllIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIIllIIllllIIII) {
            llllllllllllllIlllIIllIIllllIIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIllIIIIIllI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIllIllIIIIlIIl(Object object, Object object2) {
        return object != object2;
    }

    @Override
    public boolean I() {
        boolean bl;
        if (N.lIllIllIIIIlIIl((Object)this.aT.prayModeBaboons(), (Object)n.NONE)) {
            bl = lIlIIIIIlIIII[0];
            "".length();
            if (-(0xAD ^ 0xA8) >= 0) {
                return ((0x70 ^ 0x3B) & ~(0x3F ^ 0x74)) != 0;
            }
        } else {
            bl = lIlIIIIIlIIII[1];
        }
        return bl;
    }

    private static void lIllIllIIIIIIlI() {
        lIlIIIIIIllll = new String[lIlIIIIIlIIII[6]];
        N.lIlIIIIIIllll[N.lIlIIIIIlIIII[1]] = N.lIllIlIllllllll("zA8x+tL3F8P8r9X+6pxh+w==", "gZdUs");
        N.lIlIIIIIIllll[N.lIlIIIIIlIIII[0]] = N.lIllIllIIIIIIII("ACABCB4sYS4GFic=", "BAcgq");
        N.lIlIIIIIIllll[N.lIlIIIIIlIIII[2]] = N.lIllIllIIIIIIIl("cBf4JMRhwjz4OVhM01IsNg==", "VmXqp");
        N.lIlIIIIIIllll[N.lIlIIIIIlIIII[3]] = N.lIllIllIIIIIIII("OwIzHj8XQwUZIhgPPQ==", "ycQqP");
        N.lIlIIIIIIllll[N.lIlIIIIIlIIII[5]] = N.lIllIllIIIIIIIl("GwOkLe9OVuA=", "DsElw");
    }

    @Override
    public boolean C() {
        boolean bl;
        if (N.lIllIllIIIIlIII((Object)this.aT.prayModeBaboons(), (Object)n.NONE)) {
            return lIlIIIIIlIIII[1];
        }
        if (N.lIllIllIIIIIlIl(NPCs.getNearest(nPC -> nPC.getName().contains(lIlIIIIIIllll[lIlIIIIIlIIII[5]])))) {
            bl = lIlIIIIIlIIII[0];
            "".length();
            if ("   ".length() != "   ".length()) {
                return ((0x66 ^ 0x7D) & ~(0x6C ^ 0x77)) != 0;
            }
        } else {
            bl = lIlIIIIIlIIII[1];
        }
        return bl;
    }

    @Override
    public int F() {
        return lIlIIIIIlIIII[4];
    }

    private static boolean lIllIllIIIIIlII(int n2, int n3) {
        return n2 > n3;
    }

    static {
        N.lIllIllIIIIIIll();
        N.lIllIllIIIIIIlI();
    }

    private static void lIllIllIIIIIIll() {
        lIlIIIIIlIIII = new int[8];
        N.lIlIIIIIlIIII[0] = " ".length();
        N.lIlIIIIIlIIII[1] = (36 + 27 - -67 + 22 ^ 97 + 42 - 16 + 6) & (136 + 76 - 69 + 4 ^ 136 + 100 - 233 + 135 ^ -" ".length());
        N.lIlIIIIIlIIII[2] = "  ".length();
        N.lIlIIIIIlIIII[3] = "   ".length();
        N.lIlIIIIIlIIII[4] = 0xFFFFBB57 & 0x7FFA;
        N.lIlIIIIIlIIII[5] = 0x88 ^ 0x8C;
        N.lIlIIIIIlIIII[6] = 0x2F ^ 0x2A;
        N.lIlIIIIIlIIII[7] = 0x7C ^ 0x74;
    }

    private static String lIllIllIIIIIIII(String llllllllllllllIlllIIllIIllIllIlI, String llllllllllllllIlllIIllIIllIllllI) {
        llllllllllllllIlllIIllIIllIllIlI = new String(Base64.getDecoder().decode(llllllllllllllIlllIIllIIllIllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIIllIIllIlllIl = new StringBuilder();
        char[] llllllllllllllIlllIIllIIllIlllII = llllllllllllllIlllIIllIIllIllllI.toCharArray();
        int llllllllllllllIlllIIllIIllIllIll = lIlIIIIIlIIII[1];
        char[] llllllllllllllIlllIIllIIllIlIlIl = llllllllllllllIlllIIllIIllIllIlI.toCharArray();
        int llllllllllllllIlllIIllIIllIlIlII = llllllllllllllIlllIIllIIllIlIlIl.length;
        int llllllllllllllIlllIIllIIllIlIIll = lIlIIIIIlIIII[1];
        while (N.lIllIllIIIIlIlI(llllllllllllllIlllIIllIIllIlIIll, llllllllllllllIlllIIllIIllIlIlII)) {
            char llllllllllllllIlllIIllIIlllIIIII = llllllllllllllIlllIIllIIllIlIlIl[llllllllllllllIlllIIllIIllIlIIll];
            llllllllllllllIlllIIllIIllIlllIl.append((char)(llllllllllllllIlllIIllIIlllIIIII ^ llllllllllllllIlllIIllIIllIlllII[llllllllllllllIlllIIllIIllIllIll % llllllllllllllIlllIIllIIllIlllII.length]));
            "".length();
            ++llllllllllllllIlllIIllIIllIllIll;
            ++llllllllllllllIlllIIllIIllIlIIll;
            "".length();
            if (-" ".length() <= (0xAD ^ 0xA9)) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIlllIIllIIllIlllIl);
    }

    @Override
    public n J() {
        return this.aT.prayModeBaboons();
    }

    @Inject
    public N(SquireTOA squireTOA, TOAConfig tOAConfig) {
        super(squireTOA, tOAConfig);
    }

    private static boolean lIllIllIIIIIlIl(Object object) {
        return object != null;
    }

    private static String lIllIllIIIIIIIl(String llllllllllllllIlllIIllIIllIIlIlI, String llllllllllllllIlllIIllIIllIIlIIl) {
        try {
            SecretKeySpec llllllllllllllIlllIIllIIllIIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIllIIllIIlIIl.getBytes(StandardCharsets.UTF_8)), lIlIIIIIlIIII[7]), "DES");
            Cipher llllllllllllllIlllIIllIIllIIllII = Cipher.getInstance("DES");
            llllllllllllllIlllIIllIIllIIllII.init(lIlIIIIIlIIII[2], llllllllllllllIlllIIllIIllIIllIl);
            return new String(llllllllllllllIlllIIllIIllIIllII.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIllIIllIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIIllIIllIIlIll) {
            llllllllllllllIlllIIllIIllIIlIll.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public List<Prayer> E() {
        Prayer llllllllllllllIlllIIllIIllllllII;
        void llllllllllllllIlllIIllIIllllllIl;
        void llllllllllllllIlllIIllIIlllllllI;
        String[] stringArray = new String[lIlIIIIIlIIII[0]];
        stringArray[N.lIlIIIIIlIIII[1]] = lIlIIIIIIllll[lIlIIIIIlIIII[1]];
        int n2 = NPCs.getAll((String[])stringArray).size();
        String[] stringArray2 = new String[lIlIIIIIlIIII[0]];
        stringArray2[N.lIlIIIIIlIIII[1]] = lIlIIIIIIllll[lIlIIIIIlIIII[0]];
        int n3 = NPCs.getAll((String[])stringArray2).size();
        Prayer prayer = null;
        if (N.lIllIllIIIIIlII(n3, n2)) {
            prayer = Prayer.PROTECT_FROM_MAGIC;
            "".length();
            if (" ".length() == 0) {
                return null;
            }
        } else if (N.lIllIllIIIIIlII((int)llllllllllllllIlllIIllIIlllllllI, (int)llllllllllllllIlllIIllIIllllllIl)) {
            llllllllllllllIlllIIllIIllllllII = Prayer.PROTECT_FROM_MISSILES;
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        } else {
            String[] stringArray3 = new String[lIlIIIIIlIIII[2]];
            stringArray3[N.lIlIIIIIlIIII[1]] = lIlIIIIIIllll[lIlIIIIIlIIII[2]];
            stringArray3[N.lIlIIIIIlIIII[0]] = lIlIIIIIIllll[lIlIIIIIlIIII[3]];
            NPC llllllllllllllIlllIIllIIlllllIll = NPCs.getNearest((String[])stringArray3);
            if (!N.lIllIllIIIIIlIl(llllllllllllllIlllIIllIIlllllIll) || N.lIllIllIIIIIllI(llllllllllllllIlllIIllIIlllllIll.distanceTo((Locatable)Players.getLocal()), lIlIIIIIlIIII[2])) {
                if (N.lIllIllIIIIIlll((int)llllllllllllllIlllIIllIIllllllIl)) {
                    llllllllllllllIlllIIllIIllllllII = Prayer.PROTECT_FROM_MAGIC;
                    "".length();
                    if (-"  ".length() > 0) {
                        return null;
                    }
                }
            } else {
                llllllllllllllIlllIIllIIllllllII = Prayer.PROTECT_FROM_MELEE;
            }
        }
        if (N.lIllIllIIIIIlIl(llllllllllllllIlllIIllIIllllllII)) {
            N llllllllllllllIlllIIllIIllllllll;
            return List.of(llllllllllllllIlllIIllIIllllllll.H(), llllllllllllllIlllIIllIIllllllII);
        }
        return List.of(this.H());
    }

    private static boolean lIllIllIIIIlIII(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIllIllIIIIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIllIIIIIlll(int n2) {
        return n2 > 0;
    }
}

