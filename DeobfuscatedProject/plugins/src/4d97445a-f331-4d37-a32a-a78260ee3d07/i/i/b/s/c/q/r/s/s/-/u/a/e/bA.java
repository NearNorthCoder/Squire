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
import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ExecutorService;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.events.MenuEntryAdded;
import net.runelite.client.eventbus.Subscribe;

@TaskDesc(name="Bulk Cleaning Herbs", register=true)
public class bA
extends bz {
    private static /* synthetic */ String[] llIlllIIl;
    private static /* synthetic */ int[] llIlllIlI;

    public boolean run() {
        return llIlllIlI[0];
    }

    @Inject
    public bA(Client client, ExecutorService executorService) {
        super(client, executorService, llIlllIIl[llIlllIlI[0]]);
    }

    private static void lIlllllIlII() {
        llIlllIIl = new String[llIlllIlI[2]];
        bA.llIlllIIl[bA.llIlllIlI[0]] = bA.lIlllllIIlI("JyeC2DMXWsyT6UI1HegtXQ==", "RHIJb");
        bA.llIlllIIl[bA.llIlllIlI[1]] = bA.lIlllllIIll("EjNJg7qYVpY=", "ggEuh");
    }

    private static void lIlllllIlIl() {
        llIlllIlI = new int[4];
        bA.llIlllIlI[0] = (0x12 ^ 0x46) & ~(2 ^ 0x56);
        bA.llIlllIlI[1] = " ".length();
        bA.llIlllIlI[2] = "  ".length();
        bA.llIlllIlI[3] = 0x14 ^ 0x18 ^ (0x8F ^ 0x8B);
    }

    @Override
    public boolean c(String string, String string2) {
        return string.contains(llIlllIIl[llIlllIlI[1]]);
    }

    @Subscribe
    public void c(MenuEntryAdded menuEntryAdded) {
        super.a(menuEntryAdded);
    }

    private static String lIlllllIIll(String lIlIlllIIllIlIl, String lIlIlllIIllIlII) {
        try {
            SecretKeySpec lIlIlllIIlllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIlllIIllIlII.getBytes(StandardCharsets.UTF_8)), llIlllIlI[3]), "DES");
            Cipher lIlIlllIIlllIIl = Cipher.getInstance("DES");
            lIlIlllIIlllIIl.init(llIlllIlI[2], lIlIlllIIlllIlI);
            return new String(lIlIlllIIlllIIl.doFinal(Base64.getDecoder().decode(lIlIlllIIllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIlllIIlllIII) {
            lIlIlllIIlllIII.printStackTrace();
            return null;
        }
    }

    private static String lIlllllIIlI(String lIlIlllIIlIlIlI, String lIlIlllIIlIIlll) {
        try {
            SecretKeySpec lIlIlllIIlIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIlllIIlIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlIlllIIlIllII = Cipher.getInstance("Blowfish");
            lIlIlllIIlIllII.init(llIlllIlI[2], lIlIlllIIlIllIl);
            return new String(lIlIlllIIlIllII.doFinal(Base64.getDecoder().decode(lIlIlllIIlIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIlllIIlIlIll) {
            lIlIlllIIlIlIll.printStackTrace();
            return null;
        }
    }

    static {
        bA.lIlllllIlIl();
        bA.lIlllllIlII();
    }
}

