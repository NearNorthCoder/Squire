/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  javax.inject.Singleton
 *  net.runelite.api.Client
 *  net.runelite.api.events.GameTick
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.Subscribe
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import -.m.e.a.u.s.r.r.q.i.r.e.f.N;
import -.m.e.a.u.s.r.r.q.i.r.e.f.q;
import -.m.e.a.u.s.r.r.q.i.r.e.f.r;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.Client;
import net.runelite.api.events.GameTick;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Singleton
public class i {
    private static final /* synthetic */ String aq;
    private static final /* synthetic */ String ar;
    private final /* synthetic */ Client as;
    private final /* synthetic */ r au;
    private final /* synthetic */ ConfigManager at;
    private static final /* synthetic */ Logger ap;
    private static /* synthetic */ String[] lIlllllIlIII;
    private static /* synthetic */ int[] lIlllllIlIlI;

    private static String lllIlllllIIIIl(String lllllllllllllllIlIllIIIIIlIlllIl, String lllllllllllllllIlIllIIIIIlIlllII) {
        lllllllllllllllIlIllIIIIIlIlllIl = new String(Base64.getDecoder().decode(lllllllllllllllIlIllIIIIIlIlllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIllIIIIIllIIIII = new StringBuilder();
        char[] lllllllllllllllIlIllIIIIIlIlllll = lllllllllllllllIlIllIIIIIlIlllII.toCharArray();
        int lllllllllllllllIlIllIIIIIlIllllI = lIlllllIlIlI[0];
        char[] lllllllllllllllIlIllIIIIIlIllIII = lllllllllllllllIlIllIIIIIlIlllIl.toCharArray();
        int lllllllllllllllIlIllIIIIIlIlIlll = lllllllllllllllIlIllIIIIIlIllIII.length;
        int lllllllllllllllIlIllIIIIIlIlIllI = lIlllllIlIlI[0];
        while (i.lllIlllllIllII(lllllllllllllllIlIllIIIIIlIlIllI, lllllllllllllllIlIllIIIIIlIlIlll)) {
            char lllllllllllllllIlIllIIIIIllIIIll = lllllllllllllllIlIllIIIIIlIllIII[lllllllllllllllIlIllIIIIIlIlIllI];
            lllllllllllllllIlIllIIIIIllIIIII.append((char)(lllllllllllllllIlIllIIIIIllIIIll ^ lllllllllllllllIlIllIIIIIlIlllll[lllllllllllllllIlIllIIIIIlIllllI % lllllllllllllllIlIllIIIIIlIlllll.length]));
            0;
            ++lllllllllllllllIlIllIIIIIlIllllI;
            ++lllllllllllllllIlIllIIIIIlIlIllI;
            0;
            if (3 >= 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIllIIIIIllIIIII);
    }

    private static String lllIlllllIIIlI(String lllllllllllllllIlIllIIIIIlIIllIl, String lllllllllllllllIlIllIIIIIlIIllII) {
        try {
            SecretKeySpec lllllllllllllllIlIllIIIIIlIlIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllIIIIIlIIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIllIIIIIlIIllll = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIllIIIIIlIIllll.init(lIlllllIlIlI[2], lllllllllllllllIlIllIIIIIlIlIIII);
            return new String(lllllllllllllllIlIllIIIIIlIIllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllIIIIIlIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIllIIIIIlIIlllI) {
            lllllllllllllllIlIllIIIIIlIIlllI.printStackTrace();
            return null;
        }
    }

    private static boolean lllIlllllIllIl(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    private N a(int n2) {
        N n3 = null;
        Iterator<q> lllllllllllllllIlIllIIIIIlllllll = this.au.d(this.as.getLocalPlayer().getWorldLocation()).iterator();
        while (i.lllIlllllIlIll(lllllllllllllllIlIllIIIIIlllllll.hasNext() ? 1 : 0)) {
            q lllllllllllllllIlIllIIIIIllllllI = lllllllllllllllIlIllIIIIIlllllll.next();
            N[] lllllllllllllllIlIllIIIIIlllllIl = lllllllllllllllIlIllIIIIIllllllI.ae();
            int lllllllllllllllIlIllIIIIIlllllII = lllllllllllllllIlIllIIIIIlllllIl.length;
            int lllllllllllllllIlIllIIIIIllllIll = lIlllllIlIlI[0];
            while (i.lllIlllllIllII(lllllllllllllllIlIllIIIIIllllIll, lllllllllllllllIlIllIIIIIlllllII)) {
                void lllllllllllllllIlIllIIIIlIIIIIIl;
                N lllllllllllllllIlIllIIIIIllllIlI = lllllllllllllllIlIllIIIIIlllllIl[lllllllllllllllIlIllIIIIIllllIll];
                if (i.lllIlllllIllIl(lllllllllllllllIlIllIIIIIllllIlI.aN(), (int)lllllllllllllllIlIllIIIIlIIIIIIl)) {
                    N lllllllllllllllIlIllIIIIlIIIIIII;
                    if (i.lllIlllllIIlll(lllllllllllllllIlIllIIIIlIIIIIII)) {
                        Object[] objectArray = new Object[lIlllllIlIlI[3]];
                        objectArray[i.lIlllllIlIlI[0]] = (int)lllllllllllllllIlIllIIIIlIIIIIIl;
                        objectArray[i.lIlllllIlIlI[1]] = lllllllllllllllIlIllIIIIlIIIIIII;
                        objectArray[i.lIlllllIlIlI[2]] = lllllllllllllllIlIllIIIIIllllIlI;
                        ap.debug(lIlllllIlIII[lIlllllIlIlI[6]], objectArray);
                        return null;
                    }
                    lllllllllllllllIlIllIIIIlIIIIIII = lllllllllllllllIlIllIIIIIllllIlI;
                }
                ++lllllllllllllllIlIllIIIIIllllIll;
                0;
                if (1 > ((3 ^ (0x3B ^ 0x20)) & (0x63 ^ 1 ^ (0x52 ^ 0x28) ^ -1))) continue;
                return null;
            }
            0;
            if (1 <= 2) continue;
            return null;
        }
        return n3;
    }

    private static void lllIlllllIIIll() {
        lIlllllIlIII = new String[lIlllllIlIlI[9]];
        i.lIlllllIlIII[i.lIlllllIlIlI[0]] = i."That'll do nicely, sir. Leave it with me - I'll make sure<br>that patch grows for you.";
        i.lIlllllIlIII[i.lIlllllIlIlI[1]] = i."That'll do nicely, madam. Leave it with me - I'll make<br>sure that patch grows for you.";
        i.lIlllllIlIII[i.lIlllllIlIlI[2]] = i."Detected patch payment for {} ({})";
        i.lIlllllIlIII[i.lIlllllIlIlI[3]] = i."squirefarmer";
        i.lIlllllIlIII[i.lIlllllIlIlI[4]] = i."squirefarmer";
        i.lIlllllIlIII[i.lIlllllIlIlI[5]] = i."squirefarmer";
        i.lIlllllIlIII[i.lIlllllIlIlI[6]] = i."Ambiguous payment to {} between {} and {}";
        i.lIlllllIlIII[i.lIlllllIlIlI[7]] = i."That'll do nicely, madam. Leave it with me - I'll make<br>sure that patch grows for you.";
        i.lIlllllIlIII[i.lIlllllIlIlI[8]] = i."That'll do nicely, sir. Leave it with me - I'll make sure<br>that patch grows for you.";
    }

    private static void lllIlllllIIllI() {
        lIlllllIlIlI = new int[10];
        i.lIlllllIlIlI[0] = (8 ^ 0x49) & ~(0x71 ^ 0x30);
        i.lIlllllIlIlI[1] = 1;
        i.lIlllllIlIlI[2] = 2;
        i.lIlllllIlIlI[3] = 3;
        i.lIlllllIlIlI[4] = 3 ^ (0x27 ^ 0x20);
        i.lIlllllIlIlI[5] = 0x1B ^ 0x1E;
        i.lIlllllIlIlI[6] = 0x87 ^ 0x81;
        i.lIlllllIlIlI[7] = 0x7F ^ 0x78;
        i.lIlllllIlIlI[8] = 155 + 121 - 214 + 143 ^ 16 + 113 - 13 + 81;
        i.lIlllllIlIlI[9] = 0x4D ^ 0x44;
    }

    private static String a(N n2) {
        return n2.aJ() + ".protected";
    }

    private static boolean lllIlllllIlIlI(Object object) {
        return object == null;
    }

    private static boolean lllIlllllIlIll(int n2) {
        return n2 != 0;
    }

    private static boolean lllIlllllIlIII(int n2) {
        return n2 == 0;
    }

    private static String lllIlllllIIIII(String lllllllllllllllIlIllIIIIIlllIIlI, String lllllllllllllllIlIllIIIIIlllIIIl) {
        try {
            SecretKeySpec lllllllllllllllIlIllIIIIIlllIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllIIIIIlllIIIl.getBytes(StandardCharsets.UTF_8)), lIlllllIlIlI[8]), "DES");
            Cipher lllllllllllllllIlIllIIIIIlllIlII = Cipher.getInstance("DES");
            lllllllllllllllIlIllIIIIIlllIlII.init(lIlllllIlIlI[2], lllllllllllllllIlIllIIIIIlllIlIl);
            return new String(lllllllllllllllIlIllIIIIIlllIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllIIIIIlllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIllIIIIIlllIIll) {
            lllllllllllllllIlIllIIIIIlllIIll.printStackTrace();
            return null;
        }
    }

    static {
        i.lllIlllllIIllI();
        i.lllIlllllIIIll();
        ar = lIlllllIlIII[lIlllllIlIlI[7]];
        aq = lIlllllIlIII[lIlllllIlIlI[8]];
        ap = LoggerFactory.getLogger(i.class);
    }

    public boolean y(N n2) {
        return Boolean.TRUE.equals(this.at.getRSProfileConfiguration(lIlllllIlIII[lIlllllIlIlI[5]], i.a(n2), Boolean.class));
    }

    private static boolean lllIlllllIlIIl(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lllIlllllIIlll(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void onGameTick(GameTick gameTick) {
        void var6_6;
        void var5_5;
        void var3_3;
        i lllllllllllllllIlIllIIIIlIIlIlll;
        Widget widget = this.as.getWidget(WidgetInfo.DIALOG_NPC_TEXT);
        if (!i.lllIlllllIIlll(widget) || i.lllIlllllIlIII(lIlllllIlIII[lIlllllIlIlI[0]].equals(widget.getText()) ? 1 : 0) && i.lllIlllllIlIII(lIlllllIlIII[lIlllllIlIlI[1]].equals(widget.getText()) ? 1 : 0)) {
            return;
        }
        Widget lllllllllllllllIlIllIIIIlIIlIlIl = lllllllllllllllIlIllIIIIlIIlIlll.as.getWidget(WidgetInfo.DIALOG_NPC_NAME);
        Widget lllllllllllllllIlIllIIIIlIIlIlII = lllllllllllllllIlIllIIIIlIIlIlll.as.getWidget(WidgetInfo.DIALOG_NPC_HEAD_MODEL);
        if (!i.lllIlllllIIlll(lllllllllllllllIlIllIIIIlIIlIlIl) || !i.lllIlllllIIlll(lllllllllllllllIlIllIIIIlIIlIlII) || i.lllIlllllIlIIl(lllllllllllllllIlIllIIIIlIIlIlII.getModelType(), lIlllllIlIlI[2])) {
            return;
        }
        int lllllllllllllllIlIllIIIIlIIlIIll = lllllllllllllllIlIllIIIIlIIlIlII.getModelId();
        N lllllllllllllllIlIllIIIIlIIlIIlI = lllllllllllllllIlIllIIIIlIIlIlll.a(lllllllllllllllIlIllIIIIlIIlIIll);
        if (i.lllIlllllIlIlI(lllllllllllllllIlIllIIIIlIIlIIlI)) {
            return;
        }
        if (i.lllIlllllIlIll(lllllllllllllllIlIllIIIIlIIlIlll.y(lllllllllllllllIlIllIIIIlIIlIIlI) ? 1 : 0)) {
            return;
        }
        ap.debug(lIlllllIlIII[lIlllllIlIlI[2]], (Object)var3_3.getText(), (Object)((int)var5_5));
        this.a((N)var6_6, lIlllllIlIlI[1]);
    }

    @Inject
    private i(Client client, ConfigManager configManager, r r2) {
        this.as = client;
        this.at = configManager;
        this.au = r2;
    }

    /*
     * WARNING - void declaration
     */
    public void a(N n2, boolean bl) {
        if (i.lllIlllllIlIII(bl ? 1 : 0)) {
            this.at.unsetRSProfileConfiguration(lIlllllIlIII[lIlllllIlIlI[3]], i.a(n2));
            0;
            if ((0x5E ^ 0x68 ^ (0xAE ^ 0x9C)) != (86 + 32 - 62 + 72 ^ 127 + 64 - 156 + 97)) {
                return;
            }
        } else {
            void lllllllllllllllIlIllIIIIlIIIllII;
            void lllllllllllllllIlIllIIIIlIIIllIl;
            i lllllllllllllllIlIllIIIIlIIIlllI;
            lllllllllllllllIlIllIIIIlIIIlllI.at.setRSProfileConfiguration(lIlllllIlIII[lIlllllIlIlI[4]], i.a((N)lllllllllllllllIlIllIIIIlIIIllIl), (Object)((boolean)lllllllllllllllIlIllIIIIlIIIllII));
        }
    }

    private static boolean lllIlllllIllII(int n2, int n3) {
        return n2 < n3;
    }
}

