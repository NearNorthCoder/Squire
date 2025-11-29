/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.client.Static
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package s.s.e.u.p.i.r.r.-.q.a.e.k.r.l.u.i.p.e.t.-;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.slayer.SquireSkipperPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import s.s.e.u.p.i.r.r.-.q.a.e.k.r.l.u.i.p.e.t.-.b;

@TaskDesc(name="Checking for Task", priority=0x7FFFFFFF, blocking=true)
public class e
extends Task {
    private static /* synthetic */ String[] lIlIIlIlIIllI;
    private static /* synthetic */ int[] lIlIIlIlIlIIl;
    private static final /* synthetic */ Logger z;
    private final /* synthetic */ SquireSkipperPlugin A;

    private static String lIlllIllIIIIIII(String llllllllllllllIllIlllIIIlIlllIlI, String llllllllllllllIllIlllIIIlIlllIll) {
        try {
            SecretKeySpec llllllllllllllIllIlllIIIlIllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlllIIIlIlllIll.getBytes(StandardCharsets.UTF_8)), lIlIIlIlIlIIl[6]), "DES");
            Cipher llllllllllllllIllIlllIIIlIlllllI = Cipher.getInstance("DES");
            llllllllllllllIllIlllIIIlIlllllI.init(lIlIIlIlIlIIl[4], llllllllllllllIllIlllIIIlIllllll);
            return new String(llllllllllllllIllIlllIIIlIlllllI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlllIIIlIlllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIlllIIIlIllllIl) {
            llllllllllllllIllIlllIIIlIllllIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlllIllIIlIIlI(int n2, int n3) {
        return n2 < n3;
    }

    static {
        e.lIlllIllIIIlllI();
        e.lIlllIllIIIIIIl();
        z = LoggerFactory.getLogger(e.class);
    }

    @Inject
    public e(SquireSkipperPlugin squireSkipperPlugin) {
        this.A = squireSkipperPlugin;
    }

    private static void lIlllIllIIIIIIl() {
        lIlIIlIlIIllI = new String[lIlIIlIlIlIIl[5]];
        e.lIlIIlIlIIllI[e.lIlIIlIlIlIIl[1]] = e.lIlllIlIllllllI("BBkCJzo=", "GqgDQ");
        e.lIlIIlIlIIllI[e.lIlIIlIlIlIIl[2]] = e.lIlllIlIlllllll("Xuki3ejpGHk=", "YnjqK");
        e.lIlIIlIlIIllI[e.lIlIIlIlIlIIl[4]] = e.lIlllIllIIIIIII("vUPLQZeNxESdFSbOBQE3GA==", "HIdiX");
    }

    private static void lIlllIllIIIlllI() {
        lIlIIlIlIlIIl = new int[7];
        e.lIlIIlIlIlIIl[0] = 0xFFFF9FF7 & 0x6FED;
        e.lIlIIlIlIlIIl[1] = (0xD6 ^ 0x98 ^ (0xBA ^ 0xA0)) & (0xDF ^ 0xA3 ^ (0x57 ^ 0x7F) ^ -" ".length());
        e.lIlIIlIlIlIIl[2] = " ".length();
        e.lIlIIlIlIlIIl[3] = -(0xFFFFFB5B & 0x6CE5) & (0xFFFFFBFF & 0x7C7B);
        e.lIlIIlIlIlIIl[4] = "  ".length();
        e.lIlIIlIlIlIIl[5] = "   ".length();
        e.lIlIIlIlIlIIl[6] = 177 + 96 - 270 + 188 ^ 13 + 122 - 26 + 74;
    }

    private static String lIlllIlIllllllI(String llllllllllllllIllIlllIIIlIlIIlll, String llllllllllllllIllIlllIIIlIlIlIll) {
        llllllllllllllIllIlllIIIlIlIIlll = new String(Base64.getDecoder().decode(llllllllllllllIllIlllIIIlIlIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIlllIIIlIlIlIlI = new StringBuilder();
        char[] llllllllllllllIllIlllIIIlIlIlIIl = llllllllllllllIllIlllIIIlIlIlIll.toCharArray();
        int llllllllllllllIllIlllIIIlIlIlIII = lIlIIlIlIlIIl[1];
        char[] llllllllllllllIllIlllIIIlIlIIIlI = llllllllllllllIllIlllIIIlIlIIlll.toCharArray();
        int llllllllllllllIllIlllIIIlIlIIIIl = llllllllllllllIllIlllIIIlIlIIIlI.length;
        int llllllllllllllIllIlllIIIlIlIIIII = lIlIIlIlIlIIl[1];
        while (e.lIlllIllIIlIIlI(llllllllllllllIllIlllIIIlIlIIIII, llllllllllllllIllIlllIIIlIlIIIIl)) {
            char llllllllllllllIllIlllIIIlIlIllIl = llllllllllllllIllIlllIIIlIlIIIlI[llllllllllllllIllIlllIIIlIlIIIII];
            llllllllllllllIllIlllIIIlIlIlIlI.append((char)(llllllllllllllIllIlllIIIlIlIllIl ^ llllllllllllllIllIlllIIIlIlIlIIl[llllllllllllllIllIlllIIIlIlIlIII % llllllllllllllIllIlllIIIlIlIlIIl.length]));
            "".length();
            ++llllllllllllllIllIlllIIIlIlIlIII;
            ++llllllllllllllIllIlllIIIlIlIIIII;
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIlllIIIlIlIlIlI);
    }

    private static String lIlllIlIlllllll(String llllllllllllllIllIlllIIIllIIlIIl, String llllllllllllllIllIlllIIIllIIIllI) {
        try {
            SecretKeySpec llllllllllllllIllIlllIIIllIIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlllIIIllIIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIlllIIIllIIlIll = Cipher.getInstance("Blowfish");
            llllllllllllllIllIlllIIIllIIlIll.init(lIlIIlIlIlIIl[4], llllllllllllllIllIlllIIIllIIllII);
            return new String(llllllllllllllIllIlllIIIllIIlIll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlllIIIllIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIlllIIIllIIlIlI) {
            llllllllllllllIllIlllIIIllIIlIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlllIllIIlIIII(int n2) {
        return n2 != 0;
    }

    public boolean run() {
        b b2 = this.A.b();
        this.A.d(Static.getClient().getVarbitValue(lIlIIlIlIlIIl[0]));
        if (!e.lIlllIllIIIllll((Object)b2) || e.lIlllIllIIlIIII(this.A.c() ? 1 : 0)) {
            return lIlIIlIlIlIIl[1];
        }
        Item llllllllllllllIllIlllIIIllIlIIlI = Equipment.getFirst(item -> item.getName().toLowerCase().contains(lIlIIlIlIIllI[lIlIIlIlIlIIl[4]]));
        if (e.lIlllIllIIlIIIl(llllllllllllllIllIlllIIIllIlIIlI)) {
            llllllllllllllIllIlllIIIllIlIIlI.interact(lIlIIlIlIIllI[lIlIIlIlIlIIl[1]]);
            return lIlIIlIlIlIIl[2];
        }
        int[] nArray = new int[lIlIIlIlIlIIl[2]];
        nArray[e.lIlIIlIlIlIIl[1]] = lIlIIlIlIlIIl[3];
        Item llllllllllllllIllIlllIIIllIlIIIl = Inventory.getFirst((int[])nArray);
        if (e.lIlllIllIIlIIIl(llllllllllllllIllIlllIIIllIlIIIl)) {
            llllllllllllllIllIlllIIIllIlIIIl.interact(lIlIIlIlIIllI[lIlIIlIlIlIIl[2]]);
            return lIlIIlIlIlIIl[2];
        }
        return lIlIIlIlIlIIl[1];
    }

    private static boolean lIlllIllIIIllll(Object object) {
        return object == null;
    }

    private static boolean lIlllIllIIlIIIl(Object object) {
        return object != null;
    }
}

