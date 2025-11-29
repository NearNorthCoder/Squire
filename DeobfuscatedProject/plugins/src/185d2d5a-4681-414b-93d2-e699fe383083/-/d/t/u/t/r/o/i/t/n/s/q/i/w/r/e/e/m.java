/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 */
package -.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e;

import -.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e.a;
import -.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e.b;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.wintertodt.SquireWintertodtConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;

@TaskDesc(name="Fixing brazier", priority=2, blocking=true)
public class m
extends Task {
    private final /* synthetic */ SquireWintertodtConfig T;
    private static /* synthetic */ String[] lIllIIIIIIIII;
    private final /* synthetic */ b S;
    private static /* synthetic */ int[] lIllIIIIIIIIl;

    private static boolean llIIIIlllIllIll(int n2, int n3) {
        return n2 < n3;
    }

    @Subscribe
    public void b(ChatMessage chatMessage) {
        String string = chatMessage.getMessage();
        if (!m.llIIIIlllIlIlIl(string.contains(lIllIIIIIIIII[lIllIIIIIIIIl[3]]) ? 1 : 0) || m.llIIIIlllIlIlII(string.contains(lIllIIIIIIIII[lIllIIIIIIIIl[2]]) ? 1 : 0)) {
            m llllllllllllllIllIIllIllllllIIlI;
            llllllllllllllIllIIllIllllllIIlI.sleep(lIllIIIIIIIIl[0]);
        }
    }

    private static String llIIIIlllIIllll(String llllllllllllllIllIIllIllllIIlIlI, String llllllllllllllIllIIllIllllIIlIIl) {
        try {
            SecretKeySpec llllllllllllllIllIIllIllllIIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIllIllllIIlIIl.getBytes(StandardCharsets.UTF_8)), lIllIIIIIIIIl[6]), "DES");
            Cipher llllllllllllllIllIIllIllllIIlllI = Cipher.getInstance("DES");
            llllllllllllllIllIIllIllllIIlllI.init(lIllIIIIIIIIl[2], llllllllllllllIllIIllIllllIIllll);
            return new String(llllllllllllllIllIIllIllllIIlllI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIllIllllIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIllIllllIIllIl) {
            llllllllllllllIllIIllIllllIIllIl.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIIlllIllIII(Object object) {
        return object != null;
    }

    private static void llIIIIlllIlIIll() {
        lIllIIIIIIIIl = new int[7];
        m.lIllIIIIIIIIl[0] = (0x86 ^ 0xA6 ^ (0xDA ^ 0xB6)) & (0x98 ^ 0xA2 ^ (4 ^ 0x72) ^ -" ".length());
        m.lIllIIIIIIIIl[1] = "   ".length();
        m.lIllIIIIIIIIl[2] = "  ".length();
        m.lIllIIIIIIIIl[3] = " ".length();
        m.lIllIIIIIIIIl[4] = 0xA8 ^ 0xAD ^ " ".length();
        m.lIllIIIIIIIIl[5] = 0xB ^ 0xE;
        m.lIllIIIIIIIIl[6] = 0x42 ^ 0x11 ^ (5 ^ 0x5E);
    }

    private static boolean llIIIIlllIllIlI(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llIIIIlllIlIlll(Object object) {
        return object == null;
    }

    static {
        m.llIIIIlllIlIIll();
        m.llIIIIlllIlIIlI();
    }

    private static String llIIIIlllIIlllI(String llllllllllllllIllIIllIlllllIIIIl, String llllllllllllllIllIIllIllllIllIll) {
        llllllllllllllIllIIllIlllllIIIIl = new String(Base64.getDecoder().decode(llllllllllllllIllIIllIlllllIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIIllIllllIlllll = new StringBuilder();
        char[] llllllllllllllIllIIllIllllIllllI = llllllllllllllIllIIllIllllIllIll.toCharArray();
        int llllllllllllllIllIIllIllllIlllIl = lIllIIIIIIIIl[0];
        char[] llllllllllllllIllIIllIllllIlIlll = llllllllllllllIllIIllIlllllIIIIl.toCharArray();
        int llllllllllllllIllIIllIllllIlIllI = llllllllllllllIllIIllIllllIlIlll.length;
        int llllllllllllllIllIIllIllllIlIlIl = lIllIIIIIIIIl[0];
        while (m.llIIIIlllIllIll(llllllllllllllIllIIllIllllIlIlIl, llllllllllllllIllIIllIllllIlIllI)) {
            char llllllllllllllIllIIllIlllllIIIlI = llllllllllllllIllIIllIllllIlIlll[llllllllllllllIllIIllIllllIlIlIl];
            llllllllllllllIllIIllIllllIlllll.append((char)(llllllllllllllIllIIllIlllllIIIlI ^ llllllllllllllIllIIllIllllIllllI[llllllllllllllIllIIllIllllIlllIl % llllllllllllllIllIIllIllllIllllI.length]));
            "".length();
            ++llllllllllllllIllIIllIllllIlllIl;
            ++llllllllllllllIllIIllIllllIlIlIl;
            "".length();
            if ((0xA1 ^ 0xAF ^ (0x4E ^ 0x44)) >= "  ".length()) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIIllIllllIlllll);
    }

    private static boolean llIIIIlllIlIlII(int n2) {
        return n2 != 0;
    }

    private static boolean llIIIIlllIlIlIl(int n2) {
        return n2 == 0;
    }

    @Inject
    public m(b b2, SquireWintertodtConfig squireWintertodtConfig) {
        this.S = b2;
        this.T = squireWintertodtConfig;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_3;
        m llllllllllllllIllIIllIlllllllIIl;
        if (!m.llIIIIlllIlIlII(this.S.i() ? 1 : 0) || !m.llIIIIlllIlIlIl(this.S.u() ? 1 : 0) || m.llIIIIlllIlIlII(this.S.j() ? 1 : 0)) {
            return lIllIIIIIIIIl[0];
        }
        a llllllllllllllIllIIllIlllllllIII = llllllllllllllIllIIllIlllllllIIl.S.q();
        Player llllllllllllllIllIIllIllllllIlll = Players.getLocal();
        if (m.llIIIIlllIlIllI(llllllllllllllIllIIllIlllllllIII.b().distanceTo((Locatable)llllllllllllllIllIIllIllllllIlll), lIllIIIIIIIIl[1])) {
            return lIllIIIIIIIIl[0];
        }
        TileObject llllllllllllllIllIIllIllllllIllI = TileObjects.getNearest((WorldPoint)llllllllllllllIllIIllIlllllllIII.b(), tileObject -> {
            int n2;
            if (m.llIIIIlllIllIII(tileObject.getName()) && m.llIIIIlllIlIlII(tileObject.getName().toLowerCase(Locale.ROOT).contains(lIllIIIIIIIII[lIllIIIIIIIIl[1]]) ? 1 : 0) && m.llIIIIlllIllIlI(llllllllllllllIllIIllIlllllllIII.b().distanceTo((Locatable)tileObject), lIllIIIIIIIIl[1])) {
                String[] stringArray = new String[lIllIIIIIIIIl[3]];
                stringArray[m.lIllIIIIIIIIl[0]] = lIllIIIIIIIII[lIllIIIIIIIIl[4]];
                if (m.llIIIIlllIlIlII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIllIIIIIIIIl[3];
                    "".length();
                    if ("  ".length() != "   ".length()) return n2 != 0;
                    return ((0xF5 ^ 0xB2 ^ (0xC7 ^ 0x9E)) & (2 ^ 0x27 ^ (0x3B ^ 0) ^ -" ".length())) != 0;
                }
            }
            n2 = lIllIIIIIIIIl[0];
            return n2 != 0;
        });
        if (m.llIIIIlllIlIlll(llllllllllllllIllIIllIllllllIllI)) {
            return lIllIIIIIIIIl[0];
        }
        var3_3.interact(lIllIIIIIIIII[lIllIIIIIIIIl[0]]);
        this.sleep(lIllIIIIIIIIl[2]);
        return lIllIIIIIIIIl[3];
    }

    private static boolean llIIIIlllIlIllI(int n2, int n3) {
        return n2 > n3;
    }

    private static void llIIIIlllIlIIlI() {
        lIllIIIIIIIII = new String[lIllIIIIIIIIl[5]];
        m.lIllIIIIIIIII[m.lIllIIIIIIIIl[0]] = m.llIIIIlllIIlllI("Mg8x", "tfIXu");
        m.lIllIIIIIIIII[m.lIllIIIIIIIIl[3]] = m.llIIIIlllIIllll("1mdoKzIQe/kFAvxO0tvUVOfwE9uLZCbP", "CDNef");
        m.lIllIIIIIIIII[m.lIllIIIIIIIIl[2]] = m.llIIIIlllIlIIII("kaGDldusI5BNfR95rOdEbg==", "pZzrZ");
        m.lIllIIIIIIIII[m.lIllIIIIIIIIl[1]] = m.llIIIIlllIlIIII("W/ct45zD08g=", "vOkkU");
        m.lIllIIIIIIIII[m.lIllIIIIIIIIl[4]] = m.llIIIIlllIlIIII("lTUAfBjC7M0=", "wqiwZ");
    }

    private static String llIIIIlllIlIIII(String llllllllllllllIllIIllIlllIllllIl, String llllllllllllllIllIIllIlllIllllII) {
        try {
            SecretKeySpec llllllllllllllIllIIllIllllIIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIllIlllIllllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIIllIllllIIIIIl = Cipher.getInstance("Blowfish");
            llllllllllllllIllIIllIllllIIIIIl.init(lIllIIIIIIIIl[2], llllllllllllllIllIIllIllllIIIIlI);
            return new String(llllllllllllllIllIIllIllllIIIIIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIllIlllIllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIllIllllIIIIII) {
            llllllllllllllIllIIllIllllIIIIII.printStackTrace();
            return null;
        }
    }
}

