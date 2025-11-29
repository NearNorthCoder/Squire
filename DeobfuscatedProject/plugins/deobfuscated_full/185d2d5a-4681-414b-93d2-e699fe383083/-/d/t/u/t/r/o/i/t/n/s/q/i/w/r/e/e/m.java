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

/* TASK: Fixing brazier -> FixingbrazierTask */
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
            m var7;
            var7.sleep(lIllIIIIIIIIl[0]);
        }
    }

    private static String llIIIIlllIIllll(String var5, String var14) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var14.getBytes(StandardCharsets.UTF_8)), lIllIIIIIIIIl[6]), "DES");
            Cipher var9 = Cipher.getInstance("DES");
            var9.init(lIllIIIIIIIIl[2], var4);
            return new String(var9.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIIlllIllIII(Object object) {
        return object != null;
    }

    private static void llIIIIlllIlIIll() {
        lIllIIIIIIIIl = new int[7];
        m.lIllIIIIIIIIl[0] = (0x86 ^ 0xA6 ^ (0xDA ^ 0xB6)) & (0x98 ^ 0xA2 ^ (4 ^ 0x72) ^ -1);
        m.lIllIIIIIIIIl[1] = 3;
        m.lIllIIIIIIIIl[2] = 2;
        m.lIllIIIIIIIIl[3] = 1;
        m.lIllIIIIIIIIl[4] = 0xA8 ^ 0xAD ^ 1;
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

    private static String llIIIIlllIIlllI(String var2, String var10) {
        var2 = new String(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var22 = new StringBuilder();
        char[] var8 = var10.toCharArray();
        int var1 = lIllIIIIIIIIl[0];
        char[] var6 = var2.toCharArray();
        int var15 = var6.length;
        int var24 = lIllIIIIIIIIl[0];
        while (m.llIIIIlllIllIll(var24, var15)) {
            char var19 = var6[var24];
            var22.append((char)(var19 ^ var8[var1 % var8.length]));
            0;
            ++var1;
            ++var24;
            0;
            if ((0xA1 ^ 0xAF ^ (0x4E ^ 0x44)) >= 2) continue;
            return null;
        }
        return String.valueOf(var22);
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
        m var11;
        if (!m.llIIIIlllIlIlII(this.S.i() ? 1 : 0) || !m.llIIIIlllIlIlIl(this.S.u() ? 1 : 0) || m.llIIIIlllIlIlII(this.S.j() ? 1 : 0)) {
            return lIllIIIIIIIIl[0];
        }
        a var13 = var11.S.q();
        Player var16 = Players.getLocal();
        if (m.llIIIIlllIlIllI(var13.b().distanceTo((Locatable)var16), lIllIIIIIIIIl[1])) {
            return lIllIIIIIIIIl[0];
        }
        TileObject var23 = TileObjects.getNearest((WorldPoint)var13.b(), tileObject -> {
            int n2;
            if (m.llIIIIlllIllIII(tileObject.getName()) && m.llIIIIlllIlIlII(tileObject.getName().toLowerCase(Locale.ROOT).contains(lIllIIIIIIIII[lIllIIIIIIIIl[1]]) ? 1 : 0) && m.llIIIIlllIllIlI(var13.b().distanceTo((Locatable)tileObject), lIllIIIIIIIIl[1])) {
                String[] stringArray = new String[lIllIIIIIIIIl[3]];
                stringArray[m.lIllIIIIIIIIl[0]] = lIllIIIIIIIII[lIllIIIIIIIIl[4]];
                if (m.llIIIIlllIlIlII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIllIIIIIIIIl[3];
                    0;
                    if (2 != 3) return n2 != 0;
                    return ((0xF5 ^ 0xB2 ^ (0xC7 ^ 0x9E)) & (2 ^ 0x27 ^ (0x3B ^ 0) ^ -1)) != 0;
                }
            }
            n2 = lIllIIIIIIIIl[0];
            return n2 != 0;
        });
        if (m.llIIIIlllIlIlll(var23)) {
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
        m.lIllIIIIIIIII[m.lIllIIIIIIIIl[0]] = m."Fix";
        m.lIllIIIIIIIII[m.lIllIIIIIIIIl[3]] = m."seeps into your bones";
        m.lIllIIIIIIIII[m.lIllIIIIIIIIl[2]] = m."Congratulations";
        m.lIllIIIIIIIII[m.lIllIIIIIIIIl[1]] = m."brazier";
        m.lIllIIIIIIIII[m.lIllIIIIIIIIl[4]] = m."Fix";
    }

    private static String llIIIIlllIlIIII(String var12, String var17) {
        try {
            SecretKeySpec var21 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var17.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var3 = Cipher.getInstance("Blowfish");
            var3.init(lIllIIIIIIIIl[2], var21);
            return new String(var3.doFinal(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }
}

