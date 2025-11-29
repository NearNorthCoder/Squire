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
import u.r.i.l.a.e.c.t.-.q.s.c.n.a.c.u.o.e.-.e.r.n.BankingTask;
import u.r.i.l.a.e.c.t.-.q.s.c.n.a.c.u.o.e.-.e.r.n.SellingTask;

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

    private static String lIIlIIIIlllIlI(String var14, String var15) {
        var14 = new String(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var22 = new StringBuilder();
        char[] var18 = var15.toCharArray();
        int var10 = lIlIlIIIIll[1];
        char[] var24 = var14.toCharArray();
        int var19 = var24.length;
        int var2 = lIlIlIIIIll[1];
        while (SquireAccountCleaner.lIIlIIIlIIIIII(var2, var19)) {
            char var11 = var24[var2];
            var22.append((char)(var11 ^ var18[var10 % var18.length]));
            0;
            ++var10;
            ++var2;
            0;
            
            return null;
        }
        return String.valueOf(var22);
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
        SquireAccountCleaner var5;
        void var6;
        if (SquireAccountCleaner.lIIlIIIIlllllI(configButtonClicked.getGroup().equals(lIlIlIIIIlI[lIlIlIIIIll[1]]) ? 1 : 0)) {
            return;
        }
        if (SquireAccountCleaner.lIIlIIIIllllll(var6.getKey().equals(lIlIlIIIIlI[lIlIlIIIIll[2]]) ? 1 : 0)) {
            boolean bl;
            if (SquireAccountCleaner.lIIlIIIIlllllI(var5.isPaused() ? 1 : 0)) {
                bl = lIlIlIIIIll[2];
                0;
                if (1 != 1) {
                    return;
                }
            } else {
                bl = lIlIlIIIIll[1];
            }
            var5.setPaused(bl);
        }
        if (SquireAccountCleaner.lIIlIIIIllllll(var6.getKey().equals(lIlIlIIIIlI[lIlIlIIIIll[0]]) ? 1 : 0)) {
            int var9;
            Object var16;
            Object var17;
            String var13 = var5.c.ignoreList();
            ArrayList<Integer> var26 = new ArrayList<Integer>();
            if (SquireAccountCleaner.lIIlIIIIlllllI(var13.isEmpty() ? 1 : 0)) {
                var16 = var17 = var13.split(lIlIlIIIIlI[lIlIlIIIIll[3]]);
                var9 = ((Item)var16).length;
                int var12 = lIlIlIIIIll[1];
                while (SquireAccountCleaner.lIIlIIIlIIIIII(var12, var9)) {
                    Object var23 = var16[var12];
                    Integer var29 = Integer.parseInt((String)var23);
                    var26.add(var29);
                    0;
                    ++var12;
                    0;
                    if (-1 <= (54 + 158 - 210 + 197 ^ 179 + 120 - 132 + 28)) continue;
                    return;
                }
            }
            var17 = Inventory.getAll().iterator();
            while (SquireAccountCleaner.lIIlIIIIllllll(var17.hasNext() ? 1 : 0)) {
                var16 = (Item)var17.next();
                if (SquireAccountCleaner.lIIlIIIIlllllI(var26.contains(var16.getId()) ? 1 : 0)) {
                    var26.add(var16.getId());
                    0;
                }
                0;
                if (3 >= 0) continue;
                return;
            }
            var17 = new StringBuilder();
            var16 = var26.iterator();
            while (SquireAccountCleaner.lIIlIIIIllllll(var16.hasNext() ? 1 : 0)) {
                var9 = (Integer)var16.next();
                ((StringBuilder)var17).append(var9).append(lIlIlIIIIlI[lIlIlIIIIll[4]]);
                0;
                0;
                
                return;
            }
            Static.getConfigManager().setConfiguration(lIlIlIIIIlI[lIlIlIIIIll[5]], lIlIlIIIIlI[lIlIlIIIIll[6]], String.valueOf(var17));
        }
    }

    private static boolean lIIlIIIlIIIIII(int n, int n2) {
        return n < n2;
    }

    private static String lIIlIIIIlllIIl(String var7, String var21) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var21.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var28 = Cipher.getInstance("Blowfish");
            var28.init(lIlIlIIIIll[0], var1);
            return new String(var28.doFinal(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var25) {
            var25.printStackTrace();
            return null;
        }
    }

    private static void lIIlIIIIllllII() {
        lIlIlIIIIlI = new String[lIlIlIIIIll[7]];
        SquireAccountCleaner.lIlIlIIIIlI[SquireAccountCleaner.lIlIlIIIIll[1]] = SquireAccountCleaner."squirecleaner";
        SquireAccountCleaner.lIlIlIIIIlI[SquireAccountCleaner.lIlIlIIIIll[2]] = SquireAccountCleaner."pause";
        SquireAccountCleaner.lIlIlIIIIlI[SquireAccountCleaner.lIlIlIIIIll[0]] = SquireAccountCleaner."addToIgnore";
        SquireAccountCleaner.lIlIlIIIIlI[SquireAccountCleaner.lIlIlIIIIll[3]] = SquireAccountCleaner.",";
        SquireAccountCleaner.lIlIlIIIIlI[SquireAccountCleaner.lIlIlIIIIll[4]] = SquireAccountCleaner.",";
        SquireAccountCleaner.lIlIlIIIIlI[SquireAccountCleaner.lIlIlIIIIll[5]] = SquireAccountCleaner."squirecleaner";
        SquireAccountCleaner.lIlIlIIIIlI[SquireAccountCleaner.lIlIlIIIIll[6]] = SquireAccountCleaner."ignoreList";
    }

    static {
        SquireAccountCleaner.lIIlIIIIllllIl();
        SquireAccountCleaner.lIIlIIIIllllII();
    }

    protected void onStart() {
    }

    private static void lIIlIIIIllllIl() {
        lIlIlIIIIll = new int[9];
        SquireAccountCleaner.lIlIlIIIIll[0] = 2;
        SquireAccountCleaner.lIlIlIIIIll[1] = (0xED ^ 0xB7) & ~(0x1B ^ 0x41);
        SquireAccountCleaner.lIlIlIIIIll[2] = 1;
        SquireAccountCleaner.lIlIlIIIIll[3] = 3;
        SquireAccountCleaner.lIlIlIIIIll[4] = 0xD0 ^ 0x87 ^ (0x12 ^ 0x41);
        SquireAccountCleaner.lIlIlIIIIll[5] = 0xBB ^ 0xBE;
        SquireAccountCleaner.lIlIlIIIIll[6] = 0x14 ^ 0x28 ^ (0x1F ^ 0x25);
        SquireAccountCleaner.lIlIlIIIIll[7] = 0x8B ^ 0x8C;
        SquireAccountCleaner.lIlIlIIIIll[8] = 122 + 130 - 219 + 122 ^ 5 + 99 - 99 + 142;
    }

    private static String lIIlIIIIlllIll(String var4, String var20) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var20.getBytes(StandardCharsets.UTF_8)), lIlIlIIIIll[8]), "DES");
            Cipher var8 = Cipher.getInstance("DES");
            var8.init(lIlIlIIIIll[0], var3);
            return new String(var8.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

    protected void onStop() {
    }
}

