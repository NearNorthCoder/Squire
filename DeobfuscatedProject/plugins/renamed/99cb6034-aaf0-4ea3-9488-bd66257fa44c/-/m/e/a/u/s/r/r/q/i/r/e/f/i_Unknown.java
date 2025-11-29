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

import -.m.e.a.u.s.r.r.q.i.r.e.f.N_Unknown;
import -.m.e.a.u.s.r.r.q.i.r.e.f.q_Unknown;
import -.m.e.a.u.s.r.r.q.i.r.e.f.r_Unknown;
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
public class i_Unknown {
    private static final /* synthetic */ String aq;
    private static final /* synthetic */ String ar;
    private final /* synthetic */ Client as;
    private final /* synthetic */ r au;
    private final /* synthetic */ ConfigManager at;
    private static final /* synthetic */ Logger ap;
    private static /* synthetic */ String[] lIlllllIlIII;
    private static /* synthetic */ int[] lIlllllIlIlI;

    private static String lllIlllllIIIIl(String var20, String var30) {
        var20 = new String(Base64.getDecoder().decode(var20.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var18 = new StringBuilder();
        char[] var7 = var30.toCharArray();
        int var9 = lIlllllIlIlI[0];
        char[] var23 = var20.toCharArray();
        int var29 = var23.length;
        int var1 = lIlllllIlIlI[0];
        while (i.lllIlllllIllII(var1, var29)) {
            char var24 = var23[var1];
            var18.append((char)(var24 ^ var7[var9 % var7.length]));
            0;
            ++var9;
            ++var1;
            0;
            if (3 >= 0) continue;
            return null;
        }
        return String.valueOf(var18);
    }

    private static String lllIlllllIIIlI(String var32, String var5) {
        try {
            SecretKeySpec var31 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var26 = Cipher.getInstance("Blowfish");
            var26.init(lIlllllIlIlI[2], var31);
            return new String(var26.doFinal(Base64.getDecoder().decode(var32.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
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
        Iterator<q> var19 = this.au.d(this.as.getLocalPlayer().getWorldLocation()).iterator();
        while (i.lllIlllllIlIll(var19.hasNext() ? 1 : 0)) {
            q var10 = var19.next();
            N[] var13 = var10.ae();
            int var35 = var13.length;
            int var14 = lIlllllIlIlI[0];
            while (i.lllIlllllIllII(var14, var35)) {
                void var21;
                N var15 = var13[var14];
                if (i.lllIlllllIllIl(var15.aN(), (int)var21)) {
                    N var11;
                    if (i.lllIlllllIIlll(var11)) {
                        Object[] objectArray = new Object[lIlllllIlIlI[3]];
                        objectArray[i.lIlllllIlIlI[0]] = (int)var21;
                        objectArray[i.lIlllllIlIlI[1]] = var11;
                        objectArray[i.lIlllllIlIlI[2]] = var15;
                        ap.debug(lIlllllIlIII[lIlllllIlIlI[6]], objectArray);
                        return null;
                    }
                    var11 = var15;
                }
                ++var14;
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

    private static String lllIlllllIIIII(String var6, String var22) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var22.getBytes(StandardCharsets.UTF_8)), lIlllllIlIlI[8]), "DES");
            Cipher var8 = Cipher.getInstance("DES");
            var8.init(lIlllllIlIlI[2], var2);
            return new String(var8.doFinal(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var17) {
            var17.printStackTrace();
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
        i var28;
        Widget widget = this.as.getWidget(WidgetInfo.DIALOG_NPC_TEXT);
        if (!i.lllIlllllIIlll(widget) || i.lllIlllllIlIII(lIlllllIlIII[lIlllllIlIlI[0]].equals(widget.getText()) ? 1 : 0) && i.lllIlllllIlIII(lIlllllIlIII[lIlllllIlIlI[1]].equals(widget.getText()) ? 1 : 0)) {
            return;
        }
        Widget var12 = var28.as.getWidget(WidgetInfo.DIALOG_NPC_NAME);
        Widget var16 = var28.as.getWidget(WidgetInfo.DIALOG_NPC_HEAD_MODEL);
        if (!i.lllIlllllIIlll(var12) || !i.lllIlllllIIlll(var16) || i.lllIlllllIlIIl(var16.getModelType(), lIlllllIlIlI[2])) {
            return;
        }
        int var25 = var16.getModelId();
        N var27 = var28.a(var25);
        if (i.lllIlllllIlIlI(var27)) {
            return;
        }
        if (i.lllIlllllIlIll(var28.y(var27) ? 1 : 0)) {
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
            void var4;
            void var33;
            i var34;
            var34.at.setRSProfileConfiguration(lIlllllIlIII[lIlllllIlIlI[4]], i.a((N)var33), (Object)((boolean)var4));
        }
    }

    private static boolean lllIlllllIllII(int n2, int n3) {
        return n2 < n3;
    }
}

