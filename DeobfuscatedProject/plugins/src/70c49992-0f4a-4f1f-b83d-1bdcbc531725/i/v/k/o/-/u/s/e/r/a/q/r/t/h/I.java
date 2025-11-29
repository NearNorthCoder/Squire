/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.items.Inventory
 */
package i.v.k.o.-.u.s.e.r.a.q.r.t.h;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.f;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.w;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Tick eat", priority=200)
public class I
extends w {
    private static /* synthetic */ String[] lIlIlIlIllIll;
    private static /* synthetic */ int[] lIlIlIlIlllII;
    private static final /* synthetic */ String cn;

    @Inject
    protected I(Client client, f f2, SquireVorkathConfig squireVorkathConfig) {
        super(client, f2, squireVorkathConfig);
    }

    private static String lIllllllIlIlIlI(String llllllllllllllIllIlIlIIllIlllIlI, String llllllllllllllIllIlIlIIllIlllIll) {
        try {
            SecretKeySpec llllllllllllllIllIlIlIIllIllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIlIIllIlllIll.getBytes(StandardCharsets.UTF_8)), lIlIlIlIlllII[5]), "DES");
            Cipher llllllllllllllIllIlIlIIllIlllllI = Cipher.getInstance("DES");
            llllllllllllllIllIlIlIIllIlllllI.init(lIlIlIlIlllII[2], llllllllllllllIllIlIlIIllIllllll);
            return new String(llllllllllllllIllIlIlIIllIlllllI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIlIIllIlllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIlIlIIllIllllIl) {
            llllllllllllllIllIlIlIIllIllllIl.printStackTrace();
            return null;
        }
    }

    private static String lIllllllIlIlIII(String llllllllllllllIllIlIlIIlllIlIIIl, String llllllllllllllIllIlIlIIlllIlIIII) {
        llllllllllllllIllIlIlIIlllIlIIIl = new String(Base64.getDecoder().decode(llllllllllllllIllIlIlIIlllIlIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIlIlIIlllIIllll = new StringBuilder();
        char[] llllllllllllllIllIlIlIIlllIIlllI = llllllllllllllIllIlIlIIlllIlIIII.toCharArray();
        int llllllllllllllIllIlIlIIlllIIllIl = lIlIlIlIlllII[1];
        char[] llllllllllllllIllIlIlIIlllIIIlll = llllllllllllllIllIlIlIIlllIlIIIl.toCharArray();
        int llllllllllllllIllIlIlIIlllIIIllI = llllllllllllllIllIlIlIIlllIIIlll.length;
        int llllllllllllllIllIlIlIIlllIIIlIl = lIlIlIlIlllII[1];
        while (I.lIllllllIllIIIl(llllllllllllllIllIlIlIIlllIIIlIl, llllllllllllllIllIlIlIIlllIIIllI)) {
            char llllllllllllllIllIlIlIIlllIlIIlI = llllllllllllllIllIlIlIIlllIIIlll[llllllllllllllIllIlIlIIlllIIIlIl];
            llllllllllllllIllIlIlIIlllIIllll.append((char)(llllllllllllllIllIlIlIIlllIlIIlI ^ llllllllllllllIllIlIlIIlllIIlllI[llllllllllllllIllIlIlIIlllIIllIl % llllllllllllllIllIlIlIIlllIIlllI.length]));
            "".length();
            ++llllllllllllllIllIlIlIIlllIIllIl;
            ++llllllllllllllIllIlIlIIlllIIIlIl;
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIlIlIIlllIIllll);
    }

    private static boolean lIllllllIllIIII(Object object) {
        return object == null;
    }

    private static boolean lIllllllIlIllll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIllllllIlIllIl(Object object) {
        return object != null;
    }

    private static void lIllllllIlIlIll() {
        lIlIlIlIllIll = new String[lIlIlIlIlllII[4]];
        I.lIlIlIlIllIll[I.lIlIlIlIlllII[1]] = I.lIllllllIlIlIII("OCIACCMEJAgOajE9DB0k", "bMmjJ");
        I.lIlIlIlIllIll[I.lIlIlIlIlllII[0]] = I.lIllllllIlIlIIl("mwzemAu3TDw=", "FSiOR");
        I.lIlIlIlIllIll[I.lIlIlIlIlllII[2]] = I.lIllllllIlIlIIl("cC9TRyCkcHw=", "ygjMJ");
        I.lIlIlIlIllIll[I.lIlIlIlIlllII[3]] = I.lIllllllIlIlIlI("m8XUVF6ezN5wzT2ySY6L4A==", "ZtPJX");
    }

    private static boolean lIllllllIlIlllI(int n2) {
        return n2 == 0;
    }

    private static void lIllllllIlIllII() {
        lIlIlIlIlllII = new int[6];
        I.lIlIlIlIlllII[0] = " ".length();
        I.lIlIlIlIlllII[1] = (0x84 ^ 0xBC ^ (0xA3 ^ 0xBB)) & (3 ^ 0x3E ^ (0xB3 ^ 0xAE) ^ -" ".length());
        I.lIlIlIlIlllII[2] = "  ".length();
        I.lIlIlIlIlllII[3] = "   ".length();
        I.lIlIlIlIlllII[4] = "  ".length() ^ (0x93 ^ 0x95);
        I.lIlIlIlIlllII[5] = 0x64 ^ 0x6C;
    }

    static {
        I.lIllllllIlIllII();
        I.lIllllllIlIlIll();
        cn = lIlIlIlIllIll[lIlIlIlIlllII[3]];
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean Q() {
        String[] stringArray = new String[lIlIlIlIlllII[0]];
        stringArray[I.lIlIlIlIlllII[1]] = lIlIlIlIllIll[lIlIlIlIlllII[1]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (I.lIllllllIlIllIl(nPC) && I.lIllllllIlIlllI(nPC.isDead() ? 1 : 0) && I.lIllllllIlIllll(nPC.distanceTo((Locatable)this.cf.getLocalPlayer()), lIlIlIlIlllII[0])) {
            I llllllllllllllIllIlIlIIllllIlIll;
            void llllllllllllllIllIlIlIIllllIlIIl;
            Item item2 = Inventory.getFirst(item -> item.hasAction(lIlIlIlIllIll[lIlIlIlIlllII[2]]::equals));
            if (I.lIllllllIllIIII(item2)) {
                return lIlIlIlIlllII[1];
            }
            llllllllllllllIllIlIlIIllllIlIIl.interact(lIlIlIlIllIll[lIlIlIlIlllII[0]]);
            llllllllllllllIllIlIlIIllllIlIll.cg.a(llllllllllllllIllIlIlIIllllIlIll.cf.getTickCount());
            return lIlIlIlIlllII[1];
        }
        return lIlIlIlIlllII[1];
    }

    private static String lIllllllIlIlIIl(String llllllllllllllIllIlIlIIllllIIIIl, String llllllllllllllIllIlIlIIlllIllllI) {
        try {
            SecretKeySpec llllllllllllllIllIlIlIIllllIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIlIIlllIllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIlIlIIllllIIIll = Cipher.getInstance("Blowfish");
            llllllllllllllIllIlIlIIllllIIIll.init(lIlIlIlIlllII[2], llllllllllllllIllIlIlIIllllIIlII);
            return new String(llllllllllllllIllIlIlIIllllIIIll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIlIIllllIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIlIlIIllllIIIlI) {
            llllllllllllllIllIlIlIIllllIIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIllllllIllIIIl(int n2, int n3) {
        return n2 < n3;
    }
}

