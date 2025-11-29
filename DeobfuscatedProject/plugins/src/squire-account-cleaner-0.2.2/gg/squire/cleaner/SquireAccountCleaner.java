/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  net.runelite.api.Item
 *  net.runelite.api.events.ConfigButtonClicked
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.EventBus
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.OverlayManager
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.client.Static
 */
package gg.squire.cleaner;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.cleaner.SquireAccountCleanerConfig;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.events.ConfigButtonClicked;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;
import u.r.i.l.a.e.c.t.-.q.s.c.n.a.c.u.o.e.-.e.r.n.a;
import u.r.i.l.a.e.c.t.-.q.s.c.n.a.c.u.o.e.-.e.r.n.b;

@SquireUtil
@PluginDescriptor(name="Squire Account Cleaner", enabledByDefault=false)
public class SquireAccountCleaner
extends SquirePlugin {
    @Inject
    private /* synthetic */ SquireAccountCleanerConfig c;
    @Inject
    private /* synthetic */ OverlayManager a;
    @Inject
    private /* synthetic */ EventBus b;
    private static /* synthetic */ int[] lIlIlIIIIll;
    private static /* synthetic */ String[] lIlIlIIIIlI;

    private static String lIIlIIIIlllIlI(String llllllllllllllllIlIlllIlIlllIlIl, String llllllllllllllllIlIlllIlIllllIIl) {
        llllllllllllllllIlIlllIlIlllIlIl = new String(Base64.getDecoder().decode(llllllllllllllllIlIlllIlIlllIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIlIlllIlIllllIII = new StringBuilder();
        char[] llllllllllllllllIlIlllIlIlllIlll = llllllllllllllllIlIlllIlIllllIIl.toCharArray();
        int llllllllllllllllIlIlllIlIlllIllI = lIlIlIIIIll[1];
        char[] llllllllllllllllIlIlllIlIlllIIII = llllllllllllllllIlIlllIlIlllIlIl.toCharArray();
        int llllllllllllllllIlIlllIlIllIllll = llllllllllllllllIlIlllIlIlllIIII.length;
        int llllllllllllllllIlIlllIlIllIlllI = lIlIlIIIIll[1];
        while (SquireAccountCleaner.lIIlIIIlIIIIII(llllllllllllllllIlIlllIlIllIlllI, llllllllllllllllIlIlllIlIllIllll)) {
            char llllllllllllllllIlIlllIlIllllIll = llllllllllllllllIlIlllIlIlllIIII[llllllllllllllllIlIlllIlIllIlllI];
            llllllllllllllllIlIlllIlIllllIII.append((char)(llllllllllllllllIlIlllIlIllllIll ^ llllllllllllllllIlIlllIlIlllIlll[llllllllllllllllIlIlllIlIlllIllI % llllllllllllllllIlIlllIlIlllIlll.length]));
            "".length();
            ++llllllllllllllllIlIlllIlIlllIllI;
            ++llllllllllllllllIlIlllIlIllIlllI;
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIlIlllIlIllllIII);
    }

    private static boolean lIIlIIIIllllll(int n) {
        return n != 0;
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lIlIlIIIIll[0]];
        classArray[SquireAccountCleaner.lIlIlIIIIll[1]] = a.class;
        classArray[SquireAccountCleaner.lIlIlIIIIll[2]] = b.class;
        return classArray;
    }

    private static boolean lIIlIIIIlllllI(int n) {
        return n == 0;
    }

    @Provides
    SquireAccountCleanerConfig a(ConfigManager configManager) {
        return (SquireAccountCleanerConfig)configManager.getConfig(SquireAccountCleanerConfig.class);
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ConfigButtonClicked configButtonClicked) {
        SquireAccountCleaner llllllllllllllllIlIlllIllIlIlIII;
        void llllllllllllllllIlIlllIllIlIIlll;
        if (SquireAccountCleaner.lIIlIIIIlllllI(configButtonClicked.getGroup().equals(lIlIlIIIIlI[lIlIlIIIIll[1]]) ? 1 : 0)) {
            return;
        }
        if (SquireAccountCleaner.lIIlIIIIllllll(llllllllllllllllIlIlllIllIlIIlll.getKey().equals(lIlIlIIIIlI[lIlIlIIIIll[2]]) ? 1 : 0)) {
            boolean bl;
            if (SquireAccountCleaner.lIIlIIIIlllllI(llllllllllllllllIlIlllIllIlIlIII.isPaused() ? 1 : 0)) {
                bl = lIlIlIIIIll[2];
                "".length();
                if (" ".length() != " ".length()) {
                    return;
                }
            } else {
                bl = lIlIlIIIIll[1];
            }
            llllllllllllllllIlIlllIllIlIlIII.setPaused(bl);
        }
        if (SquireAccountCleaner.lIIlIIIIllllll(llllllllllllllllIlIlllIllIlIIlll.getKey().equals(lIlIlIIIIlI[lIlIlIIIIll[0]]) ? 1 : 0)) {
            int llllllllllllllllIlIlllIllIlIIIlI;
            Object llllllllllllllllIlIlllIllIlIIIll;
            Object llllllllllllllllIlIlllIllIlIIlII;
            String llllllllllllllllIlIlllIllIlIIllI = llllllllllllllllIlIlllIllIlIlIII.c.ignoreList();
            ArrayList<Integer> llllllllllllllllIlIlllIllIlIIlIl = new ArrayList<Integer>();
            if (SquireAccountCleaner.lIIlIIIIlllllI(llllllllllllllllIlIlllIllIlIIllI.isEmpty() ? 1 : 0)) {
                llllllllllllllllIlIlllIllIlIIIll = llllllllllllllllIlIlllIllIlIIlII = llllllllllllllllIlIlllIllIlIIllI.split(lIlIlIIIIlI[lIlIlIIIIll[3]]);
                llllllllllllllllIlIlllIllIlIIIlI = ((Item)llllllllllllllllIlIlllIllIlIIIll).length;
                int llllllllllllllllIlIlllIllIlIIIIl = lIlIlIIIIll[1];
                while (SquireAccountCleaner.lIIlIIIlIIIIII(llllllllllllllllIlIlllIllIlIIIIl, llllllllllllllllIlIlllIllIlIIIlI)) {
                    Object llllllllllllllllIlIlllIllIlIIIII = llllllllllllllllIlIlllIllIlIIIll[llllllllllllllllIlIlllIllIlIIIIl];
                    Integer llllllllllllllllIlIlllIllIIlllll = Integer.parseInt((String)llllllllllllllllIlIlllIllIlIIIII);
                    llllllllllllllllIlIlllIllIlIIlIl.add(llllllllllllllllIlIlllIllIIlllll);
                    "".length();
                    ++llllllllllllllllIlIlllIllIlIIIIl;
                    "".length();
                    if (-" ".length() <= (54 + 158 - 210 + 197 ^ 179 + 120 - 132 + 28)) continue;
                    return;
                }
            }
            llllllllllllllllIlIlllIllIlIIlII = Inventory.getAll().iterator();
            while (SquireAccountCleaner.lIIlIIIIllllll(llllllllllllllllIlIlllIllIlIIlII.hasNext() ? 1 : 0)) {
                llllllllllllllllIlIlllIllIlIIIll = (Item)llllllllllllllllIlIlllIllIlIIlII.next();
                if (SquireAccountCleaner.lIIlIIIIlllllI(llllllllllllllllIlIlllIllIlIIlIl.contains(llllllllllllllllIlIlllIllIlIIIll.getId()) ? 1 : 0)) {
                    llllllllllllllllIlIlllIllIlIIlIl.add(llllllllllllllllIlIlllIllIlIIIll.getId());
                    "".length();
                }
                "".length();
                if ("   ".length() >= 0) continue;
                return;
            }
            llllllllllllllllIlIlllIllIlIIlII = new StringBuilder();
            llllllllllllllllIlIlllIllIlIIIll = llllllllllllllllIlIlllIllIlIIlIl.iterator();
            while (SquireAccountCleaner.lIIlIIIIllllll(llllllllllllllllIlIlllIllIlIIIll.hasNext() ? 1 : 0)) {
                llllllllllllllllIlIlllIllIlIIIlI = (Integer)llllllllllllllllIlIlllIllIlIIIll.next();
                ((StringBuilder)llllllllllllllllIlIlllIllIlIIlII).append(llllllllllllllllIlIlllIllIlIIIlI).append(lIlIlIIIIlI[lIlIlIIIIll[4]]);
                "".length();
                "".length();
                if (null == null) continue;
                return;
            }
            Static.getConfigManager().setConfiguration(lIlIlIIIIlI[lIlIlIIIIll[5]], lIlIlIIIIlI[lIlIlIIIIll[6]], String.valueOf(llllllllllllllllIlIlllIllIlIIlII));
        }
    }

    private static boolean lIIlIIIlIIIIII(int n, int n2) {
        return n < n2;
    }

    private static String lIIlIIIIlllIIl(String llllllllllllllllIlIlllIllIIlIlll, String llllllllllllllllIlIlllIllIIlIllI) {
        try {
            SecretKeySpec llllllllllllllllIlIlllIllIIllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIlllIllIIlIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIlIlllIllIIllIIl = Cipher.getInstance("Blowfish");
            llllllllllllllllIlIlllIllIIllIIl.init(lIlIlIIIIll[0], llllllllllllllllIlIlllIllIIllIlI);
            return new String(llllllllllllllllIlIlllIllIIllIIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIlllIllIIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIlllIllIIllIII) {
            llllllllllllllllIlIlllIllIIllIII.printStackTrace();
            return null;
        }
    }

    private static void lIIlIIIIllllII() {
        lIlIlIIIIlI = new String[lIlIlIIIIll[7]];
        SquireAccountCleaner.lIlIlIIIIlI[SquireAccountCleaner.lIlIlIIIIll[1]] = SquireAccountCleaner.lIIlIIIIlllIIl("KJBcsX7wSc6jjqPqZi7uFQ==", "truak");
        SquireAccountCleaner.lIlIlIIIIlI[SquireAccountCleaner.lIlIlIIIIll[2]] = SquireAccountCleaner.lIIlIIIIlllIIl("zZ4ZB0xwPLU=", "CPjxx");
        SquireAccountCleaner.lIlIlIIIIlI[SquireAccountCleaner.lIlIlIIIIll[0]] = SquireAccountCleaner.lIIlIIIIlllIlI("BhwpEiAuHyMpPQI=", "gxMFO");
        SquireAccountCleaner.lIlIlIIIIlI[SquireAccountCleaner.lIlIlIIIIll[3]] = SquireAccountCleaner.lIIlIIIIlllIll("7M+ZyTDyNXw=", "vQwQk");
        SquireAccountCleaner.lIlIlIIIIlI[SquireAccountCleaner.lIlIlIIIIll[4]] = SquireAccountCleaner.lIIlIIIIlllIlI("Vg==", "zHVpk");
        SquireAccountCleaner.lIlIlIIIIlI[SquireAccountCleaner.lIlIlIIIIll[5]] = SquireAccountCleaner.lIIlIIIIlllIIl("gZcUZoRiGj4h0bKCpWmH2Q==", "RtNfX");
        SquireAccountCleaner.lIlIlIIIIlI[SquireAccountCleaner.lIlIlIIIIll[6]] = SquireAccountCleaner.lIIlIIIIlllIll("f8M65SOSbF1kNKF/EhZ1nw==", "WYOsQ");
    }

    static {
        SquireAccountCleaner.lIIlIIIIllllIl();
        SquireAccountCleaner.lIIlIIIIllllII();
    }

    protected void onStart() {
    }

    private static void lIIlIIIIllllIl() {
        lIlIlIIIIll = new int[9];
        SquireAccountCleaner.lIlIlIIIIll[0] = "  ".length();
        SquireAccountCleaner.lIlIlIIIIll[1] = (0xED ^ 0xB7) & ~(0x1B ^ 0x41);
        SquireAccountCleaner.lIlIlIIIIll[2] = " ".length();
        SquireAccountCleaner.lIlIlIIIIll[3] = "   ".length();
        SquireAccountCleaner.lIlIlIIIIll[4] = 0xD0 ^ 0x87 ^ (0x12 ^ 0x41);
        SquireAccountCleaner.lIlIlIIIIll[5] = 0xBB ^ 0xBE;
        SquireAccountCleaner.lIlIlIIIIll[6] = 0x14 ^ 0x28 ^ (0x1F ^ 0x25);
        SquireAccountCleaner.lIlIlIIIIll[7] = 0x8B ^ 0x8C;
        SquireAccountCleaner.lIlIlIIIIll[8] = 122 + 130 - 219 + 122 ^ 5 + 99 - 99 + 142;
    }

    private static String lIIlIIIIlllIll(String llllllllllllllllIlIlllIllIIIlIII, String llllllllllllllllIlIlllIllIIIIlll) {
        try {
            SecretKeySpec llllllllllllllllIlIlllIllIIIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIlllIllIIIIlll.getBytes(StandardCharsets.UTF_8)), lIlIlIIIIll[8]), "DES");
            Cipher llllllllllllllllIlIlllIllIIIllII = Cipher.getInstance("DES");
            llllllllllllllllIlIlllIllIIIllII.init(lIlIlIIIIll[0], llllllllllllllllIlIlllIllIIIllIl);
            return new String(llllllllllllllllIlIlllIllIIIllII.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIlllIllIIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIlllIllIIIlIll) {
            llllllllllllllllIlIlllIllIIIlIll.printStackTrace();
            return null;
        }
    }

    protected void onStop() {
    }
}

