/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import com.google.inject.Inject;
import gg.squire.basics.combat.Cannon.CannonReloader;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;

@TaskDesc(name="Repairing cannon", priority=5, blocking=true)
public class L
extends Task {
    private static /* synthetic */ String[] lIIIIllIl;
    private final /* synthetic */ CannonReloader bS;
    private static /* synthetic */ int[] lIIIIlllI;

    @Inject
    public L(CannonReloader cannonReloader) {
        this.bS = cannonReloader;
    }

    private static boolean lllIlIllIl(Object object) {
        return object == null;
    }

    private static boolean lllIllIIII(int n2, int n3) {
        return n2 < n3;
    }

    private static String lllIlIlIII(String llIIllIIlllIIIl, String llIIllIIllIlllI) {
        try {
            SecretKeySpec llIIllIIlllIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIllIIllIlllI.getBytes(StandardCharsets.UTF_8)), lIIIIlllI[4]), "DES");
            Cipher llIIllIIlllIIll = Cipher.getInstance("DES");
            llIIllIIlllIIll.init(lIIIIlllI[2], llIIllIIlllIlII);
            return new String(llIIllIIlllIIll.doFinal(Base64.getDecoder().decode(llIIllIIlllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIllIIlllIIlI) {
            llIIllIIlllIIlI.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void llIIllIlIIllllI;
        String[] stringArray = new String[lIIIIlllI[0]];
        stringArray[L.lIIIIlllI[1]] = lIIIIllIl[lIIIIlllI[1]];
        TileObject tileObject = TileObjects.getNearest((String[])stringArray);
        if (L.lllIlIllIl(tileObject)) {
            return lIIIIlllI[1];
        }
        String[] stringArray2 = new String[lIIIIlllI[0]];
        stringArray2[L.lIIIIlllI[1]] = lIIIIllIl[lIIIIlllI[0]];
        if (L.lllIlIlllI(llIIllIlIIllllI.hasAction(stringArray2) ? 1 : 0)) {
            return lIIIIlllI[1];
        }
        if (L.lllIlIllll(Players.getLocal().isAnimating() ? 1 : 0)) {
            return lIIIIlllI[0];
        }
        tileObject.interact(lIIIIllIl[lIIIIlllI[2]]);
        return lIIIIlllI[0];
    }

    private static boolean lllIlIllll(int n2) {
        return n2 != 0;
    }

    private static String lllIlIlIlI(String llIIllIlIIlIllI, String llIIllIlIIlIIll) {
        try {
            SecretKeySpec llIIllIlIIllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIllIlIIlIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIIllIlIIllIII = Cipher.getInstance("Blowfish");
            llIIllIlIIllIII.init(lIIIIlllI[2], llIIllIlIIllIIl);
            return new String(llIIllIlIIllIII.doFinal(Base64.getDecoder().decode(llIIllIlIIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIllIlIIlIlll) {
            llIIllIlIIlIlll.printStackTrace();
            return null;
        }
    }

    static {
        L.lllIlIllII();
        L.lllIlIlIll();
    }

    private static String lllIlIlIIl(String llIIllIlIIIIIIl, String llIIllIlIIIIIII) {
        llIIllIlIIIIIIl = new String(Base64.getDecoder().decode(llIIllIlIIIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIIllIlIIIIlII = new StringBuilder();
        char[] llIIllIlIIIIIll = llIIllIlIIIIIII.toCharArray();
        int llIIllIlIIIIIlI = lIIIIlllI[1];
        char[] llIIllIIlllllII = llIIllIlIIIIIIl.toCharArray();
        int llIIllIIllllIll = llIIllIIlllllII.length;
        int llIIllIIllllIlI = lIIIIlllI[1];
        while (L.lllIllIIII(llIIllIIllllIlI, llIIllIIllllIll)) {
            char llIIllIlIIIIlll = llIIllIIlllllII[llIIllIIllllIlI];
            llIIllIlIIIIlII.append((char)(llIIllIlIIIIlll ^ llIIllIlIIIIIll[llIIllIlIIIIIlI % llIIllIlIIIIIll.length]));
            "".length();
            ++llIIllIlIIIIIlI;
            ++llIIllIIllllIlI;
            "".length();
            if (-" ".length() <= "  ".length()) continue;
            return null;
        }
        return String.valueOf(llIIllIlIIIIlII);
    }

    private static boolean lllIlIlllI(int n2) {
        return n2 == 0;
    }

    private static void lllIlIllII() {
        lIIIIlllI = new int[5];
        L.lIIIIlllI[0] = " ".length();
        L.lIIIIlllI[1] = (42 + 24 - 57 + 158 ^ 139 + 58 - 172 + 172) & (0xE1 ^ 0x92 ^ (0xD0 ^ 0xC1) ^ -" ".length());
        L.lIIIIlllI[2] = "  ".length();
        L.lIIIIlllI[3] = "   ".length();
        L.lIIIIlllI[4] = 124 + 19 - 8 + 22 ^ 107 + 88 - 93 + 47;
    }

    private static void lllIlIlIll() {
        lIIIIllIl = new String[lIIIIlllI[3]];
        L.lIIIIllIl[L.lIIIIlllI[1]] = L.lllIlIlIII("sw2vpbz2s25E6mMsXzrtEAXt6bl+HY/W", "YmKnH");
        L.lIIIIllIl[L.lIIIIlllI[0]] = L.lllIlIlIIl("KhM8ABAK", "xvLay");
        L.lIIIIllIl[L.lIIIIlllI[2]] = L.lllIlIlIlI("NnxI6t0cmlo=", "LAIlg");
    }
}

