/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.events.MenuEntryAdded
 *  net.runelite.client.eventbus.Subscribe
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import i.i.b.s.c.q.r.s.s.-.u.a.e.bz;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.concurrent.ExecutorService;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.events.MenuEntryAdded;
import net.runelite.client.eventbus.Subscribe;

@TaskDesc(name="Bulk search", register=true)
public class bC
extends bz {
    private static /* synthetic */ String[] lIlllIIII;
    private static /* synthetic */ int[] lIlllIllI;

    private static void lIlIIIlIlll() {
        lIlllIIII = new String[lIlllIllI[3]];
        bC.lIlllIIII[bC.lIlllIllI[0]] = bC."Search-All";
        bC.lIlllIIII[bC.lIlllIllI[1]] = bC."Search";
        bC.lIlllIIII[bC.lIlllIllI[2]] = bC."Bird";
    }

    @Subscribe
    public void c(MenuEntryAdded menuEntryAdded) {
        super.a(menuEntryAdded);
    }

    private static String lIlIIIlIllI(String lIlllIlIIlllIIl, String lIlllIlIIllIIll) {
        lIlllIlIIlllIIl = new String(Base64.getDecoder().decode(lIlllIlIIlllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIlllIlIIllIlll = new StringBuilder();
        char[] lIlllIlIIllIllI = lIlllIlIIllIIll.toCharArray();
        int lIlllIlIIllIlIl = lIlllIllI[0];
        char[] lIlllIlIIlIllll = lIlllIlIIlllIIl.toCharArray();
        int lIlllIlIIlIlllI = lIlllIlIIlIllll.length;
        int lIlllIlIIlIllIl = lIlllIllI[0];
        while (bC.lIlIIIllIlI(lIlllIlIIlIllIl, lIlllIlIIlIlllI)) {
            char lIlllIlIIlllIlI = lIlllIlIIlIllll[lIlllIlIIlIllIl];
            lIlllIlIIllIlll.append((char)(lIlllIlIIlllIlI ^ lIlllIlIIllIllI[lIlllIlIIllIlIl % lIlllIlIIllIllI.length]));
            0;
            ++lIlllIlIIllIlIl;
            ++lIlllIlIIlIllIl;
            0;
            if (3 > 0) continue;
            return null;
        }
        return String.valueOf(lIlllIlIIllIlll);
    }

    @Override
    public boolean c(String string, String string2) {
        int n2;
        if (bC.lIlIIIllIIl(string.equals(lIlllIIII[lIlllIllI[1]]) ? 1 : 0) && bC.lIlIIIllIIl(string2.contains(lIlllIIII[lIlllIllI[2]]) ? 1 : 0)) {
            n2 = lIlllIllI[1];
            0;
            if (null != null) {
                return ((0x40 ^ 6 ^ (0x5D ^ 0x49)) & (99 + 3 - -30 + 83 ^ 8 + 92 - -20 + 13 ^ -1)) != 0;
            }
        } else {
            n2 = lIlllIllI[0];
        }
        return n2 != 0;
    }

    static {
        bC.lIlIIIllIII();
        bC.lIlIIIlIlll();
    }

    private static boolean lIlIIIllIIl(int n2) {
        return n2 != 0;
    }

    private static void lIlIIIllIII() {
        lIlllIllI = new int[4];
        bC.lIlllIllI[0] = (0x47 ^ 0x51) & ~(0x9C ^ 0x8A);
        bC.lIlllIllI[1] = 1;
        bC.lIlllIllI[2] = 2;
        bC.lIlllIllI[3] = 3;
    }

    private static String lIIllllllIl(String lIlllIlIlIIlIIl, String lIlllIlIlIIlIII) {
        try {
            SecretKeySpec lIlllIlIlIIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlllIlIlIIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlllIlIlIIlIll = Cipher.getInstance("Blowfish");
            lIlllIlIlIIlIll.init(lIlllIllI[2], lIlllIlIlIIllII);
            return new String(lIlllIlIlIIlIll.doFinal(Base64.getDecoder().decode(lIlllIlIlIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlllIlIlIIlIlI) {
            lIlllIlIlIIlIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIIllIlI(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public bC(Client client, ExecutorService executorService) {
        super(client, executorService, lIlllIIII[lIlllIllI[0]]);
    }

    public boolean run() {
        return lIlllIllI[0];
    }
}

