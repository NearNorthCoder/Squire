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
import gg.squire.cleaner.BankingTask;
import gg.squire.cleaner.SellingTask;

@SquireUtil
@PluginDescriptor(name="Squire Account Cleaner", enabledByDefault=false)
public class SquireAccountCleaner
extends SquirePlugin {
    @Inject
    private  SquireAccountCleanerConfig c;
    @Inject
    private  OverlayManager a;
    @Inject
    private  EventBus b;

        return String.valueOf(var1);
    }

    private static boolean lIIlIIIIllllll(int n) {
        return n != 0;
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lIlIlIIIIll[0]];
        classArray[SquireAccountCleaner.lIlIlIIIIll[1]] = BankingTask.class;
        classArray[SquireAccountCleaner.lIlIlIIIIll[2]] = SellingTask.class;
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
        SquireAccountCleaner var2;
        void var3;
        if (SquireAccountCleaner.lIIlIIIIlllllI(configButtonClicked.getGroup().equals(lIlIlIIIIlI[lIlIlIIIIll[1]]) ? 1 : 0)) {
            return;
        }
        if (SquireAccountCleaner.lIIlIIIIllllll(var3.getKey().equals(lIlIlIIIIlI[lIlIlIIIIll[2]]) ? 1 : 0)) {
            boolean bl;
            if (SquireAccountCleaner.lIIlIIIIlllllI(var2.isPaused() ? 1 : 0)) {
                bl = lIlIlIIIIll[2];

                if (1 != 1) {
                    return;
                }
            } else {
                bl = lIlIlIIIIll[1];
            }
            var2.setPaused(bl);
        }
        if (SquireAccountCleaner.lIIlIIIIllllll(var3.getKey().equals(lIlIlIIIIlI[lIlIlIIIIll[0]]) ? 1 : 0)) {
            int var4;
            Object var5;
            Object var6;
            String var7 = var2.c.ignoreList();
            ArrayList<Integer> var8 = new ArrayList<Integer>();
            if (SquireAccountCleaner.lIIlIIIIlllllI(var7.isEmpty() ? 1 : 0)) {
                var5 = var6 = var7.split(lIlIlIIIIlI[lIlIlIIIIll[3]]);
                var4 = ((Item)var5).length;
                int var9 = lIlIlIIIIll[1];
                while (SquireAccountCleaner.lIIlIIIlIIIIII(var9, var4)) {
                    Object var10 = var5[var9];
                    Integer var11 = Integer.parseInt((String)var10);
                    var8.add(var11);

                    ++var9;

                    if (-1 <= (54 + 158 - 210 + 197 ^ 179 + 120 - 132 + 28)) continue;
                    return;
                }
            }
            var6 = Inventory.getAll().iterator();
            while (SquireAccountCleaner.lIIlIIIIllllll(var6.hasNext() ? 1 : 0)) {
                var5 = (Item)var6.next();
                if (SquireAccountCleaner.lIIlIIIIlllllI(var8.contains(var5.getId()) ? 1 : 0)) {
                    var8.add(var5.getId());

                }

                if (3 >= 0) continue;
                return;
            }
            var6 = new StringBuilder();
            var5 = var8.iterator();
            while (SquireAccountCleaner.lIIlIIIIllllll(var5.hasNext() ? 1 : 0)) {
                var4 = (Integer)var5.next();
                ((StringBuilder)var6).append(var4).append(lIlIlIIIIlI[lIlIlIIIIll[4]]);

                return;
            }
            Static.getConfigManager().setConfiguration(lIlIlIIIIlI[lIlIlIIIIll[5]], lIlIlIIIIlI[lIlIlIIIIll[6]], String.valueOf(var6));
        }
    }

    private static boolean lIIlIIIlIIIIII(int n, int n2) {
        return n < n2;
    }

    private static void lIIlIIIIllllII() {
        lIlIlIIIIlI = new String[lIlIlIIIIll[7]];
        SquireAccountCleaner.lIlIlIIIIlI[SquireAccountCleaner.lIlIlIIIIll[1]] = "squirecleaner";
        SquireAccountCleaner.lIlIlIIIIlI[SquireAccountCleaner.lIlIlIIIIll[2]] = "pause";
        SquireAccountCleaner.lIlIlIIIIlI[SquireAccountCleaner.lIlIlIIIIll[0]] = "addToIgnore";
        SquireAccountCleaner.lIlIlIIIIlI[SquireAccountCleaner.lIlIlIIIIll[3]] = ",";
        SquireAccountCleaner.lIlIlIIIIlI[SquireAccountCleaner.lIlIlIIIIll[4]] = ",";
        SquireAccountCleaner.lIlIlIIIIlI[SquireAccountCleaner.lIlIlIIIIll[5]] = "squirecleaner";
        SquireAccountCleaner.lIlIlIIIIlI[SquireAccountCleaner.lIlIlIIIIll[6]] = "ignoreList";
    }

    static {
        SquireAccountCleaner.lIIlIIIIllllIl();
        SquireAccountCleaner.lIIlIIIIllllII();
    }

    protected void onStart() {
    }

    protected void onStop() {
    }
}

