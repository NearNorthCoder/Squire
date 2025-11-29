/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package -.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e;

import -.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e.b;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.wintertodt.SquireWintertodtConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Eating", priority=0x7FFFFFFF, blocking=true)
public class l
extends Task {
    private final /* synthetic */ b Q;
    private final /* synthetic */ SquireWintertodtConfig R;
    private static /* synthetic */ String[] lIlIllllllIlI;
    private static /* synthetic */ int[] lIlIlllllllII;

    private static boolean llIIIIlllIIIllI(int n2) {
        return n2 == 0;
    }

    private static String llIIIIlllIIIIII(String llllllllllllllIllIIlllIIIIIllIIl, String llllllllllllllIllIIlllIIIIIllIII) {
        llllllllllllllIllIIlllIIIIIllIIl = new String(Base64.getDecoder().decode(llllllllllllllIllIIlllIIIIIllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIIlllIIIIIlIlll = new StringBuilder();
        char[] llllllllllllllIllIIlllIIIIIlIllI = llllllllllllllIllIIlllIIIIIllIII.toCharArray();
        int llllllllllllllIllIIlllIIIIIlIlIl = lIlIlllllllII[0];
        char[] llllllllllllllIllIIlllIIIIIIllll = llllllllllllllIllIIlllIIIIIllIIl.toCharArray();
        int llllllllllllllIllIIlllIIIIIIlllI = llllllllllllllIllIIlllIIIIIIllll.length;
        int llllllllllllllIllIIlllIIIIIIllIl = lIlIlllllllII[0];
        while (l.llIIIIlllIIlIlI(llllllllllllllIllIIlllIIIIIIllIl, llllllllllllllIllIIlllIIIIIIlllI)) {
            char llllllllllllllIllIIlllIIIIIllIlI = llllllllllllllIllIIlllIIIIIIllll[llllllllllllllIllIIlllIIIIIIllIl];
            llllllllllllllIllIIlllIIIIIlIlll.append((char)(llllllllllllllIllIIlllIIIIIllIlI ^ llllllllllllllIllIIlllIIIIIlIllI[llllllllllllllIllIIlllIIIIIlIlIl % llllllllllllllIllIIlllIIIIIlIllI.length]));
            "".length();
            ++llllllllllllllIllIIlllIIIIIlIlIl;
            ++llllllllllllllIllIIlllIIIIIIllIl;
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIIlllIIIIIlIlll);
    }

    private static boolean llIIIIlllIIlIII(int n2) {
        return n2 != 0;
    }

    @Inject
    public l(b b2, SquireWintertodtConfig squireWintertodtConfig) {
        this.Q = b2;
        this.R = squireWintertodtConfig;
    }

    private static boolean llIIIIlllIIIlll(Object object) {
        return object == null;
    }

    static {
        l.llIIIIlllIIIlIl();
        l.llIIIIlllIIIIlI();
    }

    private static String llIIIIlllIIIIIl(String llllllllllllllIllIIlllIIIIlIIlll, String llllllllllllllIllIIlllIIIIlIIllI) {
        try {
            SecretKeySpec llllllllllllllIllIIlllIIIIlIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIlllIIIIlIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIIlllIIIIlIlIll = Cipher.getInstance("Blowfish");
            llllllllllllllIllIIlllIIIIlIlIll.init(lIlIlllllllII[3], llllllllllllllIllIIlllIIIIlIllII);
            return new String(llllllllllllllIllIIlllIIIIlIlIll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIlllIIIIlIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIlllIIIIlIlIlI) {
            llllllllllllllIllIIlllIIIIlIlIlI.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIIlllIIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIIIlllIIlIIl(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        l llllllllllllllIllIIlllIIIIllIllI;
        if (!l.llIIIIlllIIIllI(this.Q.j() ? 1 : 0) || l.llIIIIlllIIIllI(this.Q.i() ? 1 : 0)) {
            return lIlIlllllllII[0];
        }
        Item llllllllllllllIllIIlllIIIIllIlIl = Inventory.getFirst(item -> {
            int n2;
            block3: {
                block2: {
                    String[] stringArray = new String[lIlIlllllllII[2]];
                    stringArray[l.lIlIlllllllII[0]] = lIlIllllllIlI[lIlIlllllllII[3]];
                    if (!l.llIIIIlllIIIllI(item.hasAction(stringArray) ? 1 : 0)) break block2;
                    String[] stringArray2 = new String[lIlIlllllllII[2]];
                    stringArray2[l.lIlIlllllllII[0]] = lIlIllllllIlI[lIlIlllllllII[4]];
                    if (!l.llIIIIlllIIlIII(item.hasAction(stringArray2) ? 1 : 0)) break block3;
                }
                n2 = lIlIlllllllII[2];
                "".length();
                if (-"   ".length() < 0) return n2 != 0;
                return ("   ".length() & ("   ".length() ^ -" ".length())) != 0;
            }
            n2 = lIlIlllllllII[0];
            return n2 != 0;
        });
        if (l.llIIIIlllIIIlll(llllllllllllllIllIIlllIIIIllIlIl) && l.llIIIIlllIIlIII(llllllllllllllIllIIlllIIIIllIllI.Q.d() ? 1 : 0)) {
            return lIlIlllllllII[0];
        }
        if (l.llIIIIlllIIlIIl(llllllllllllllIllIIlllIIIIllIllI.Q.h(), lIlIlllllllII[1])) {
            return lIlIlllllllII[0];
        }
        if (l.llIIIIlllIIIlll(llllllllllllllIllIIlllIIIIllIlIl)) {
            Movement.walk((WorldPoint)llllllllllllllIllIIlllIIIIllIllI.Q.e());
            return lIlIlllllllII[2];
        }
        var1_1.interact(string -> {
            boolean bl;
            if (!l.llIIIIlllIIIllI(lIlIllllllIlI[lIlIlllllllII[0]].equalsIgnoreCase((String)string) ? 1 : 0) || l.llIIIIlllIIlIII(lIlIllllllIlI[lIlIlllllllII[2]].equalsIgnoreCase((String)string) ? 1 : 0)) {
                bl = lIlIlllllllII[2];
                "".length();
                if (((0xC ^ 0x70 ^ (0x70 ^ 3)) & (30 + 58 - 53 + 171 ^ 103 + 72 - 173 + 191 ^ -" ".length())) != 0) {
                    return ((50 + 107 - 153 + 174 ^ 7 + 68 - 10 + 63) & (0xFC ^ 0xA2 ^ (0xB ^ 0x67) ^ -" ".length())) != 0;
                }
            } else {
                bl = lIlIlllllllII[0];
            }
            return bl;
        });
        this.sleep(lIlIlllllllII[2]);
        return lIlIlllllllII[2];
    }

    private static void llIIIIlllIIIIlI() {
        lIlIllllllIlI = new String[lIlIlllllllII[5]];
        l.lIlIllllllIlI[l.lIlIlllllllII[0]] = l.llIIIIlllIIIIII("JBgM", "ayxgt");
        l.lIlIllllllIlI[l.lIlIlllllllII[2]] = l.llIIIIlllIIIIIl("wNeR8+A+dCg=", "WNsea");
        l.lIlIllllllIlI[l.lIlIlllllllII[3]] = l.llIIIIlllIIIIIl("xXmLs/zZRXE=", "RxGqT");
        l.lIlIllllllIlI[l.lIlIlllllllII[4]] = l.llIIIIlllIIIIII("LT8hNDM=", "iMHZX");
    }

    private static void llIIIIlllIIIlIl() {
        lIlIlllllllII = new int[6];
        l.lIlIlllllllII[0] = (0xAA ^ 0x85) & ~(0x72 ^ 0x5D);
        l.lIlIlllllllII[1] = 133 + 182 - 252 + 189 ^ 60 + 29 - -32 + 68;
        l.lIlIlllllllII[2] = " ".length();
        l.lIlIlllllllII[3] = "  ".length();
        l.lIlIlllllllII[4] = "   ".length();
        l.lIlIlllllllII[5] = 0x6B ^ 0x55 ^ (0x4D ^ 0x77);
    }
}

