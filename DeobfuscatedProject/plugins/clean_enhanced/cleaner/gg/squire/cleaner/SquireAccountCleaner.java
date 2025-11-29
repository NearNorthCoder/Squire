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
import java.util.ArrayList;
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

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = var1[1];
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = var1[1];
        while (SquireAccountCleaner.var12(var11, var10)) {
            char var13 = var9[var11];
            var6.append((char)(var13 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var6);
    }

    private static boolean var14(int n) {
        return n != 0;
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[var1[0]];
        classArray[SquireAccountCleaner.var1[1]] = BankingTask.class;
        classArray[SquireAccountCleaner.var1[2]] = SellingTask.class;
        return classArray;
    }

    private static boolean var15(int n) {
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
        SquireAccountCleaner var16;
        void var17;
        if (SquireAccountCleaner.var15(configButtonClicked.getGroup().equals(var2[var1[1]]) ? 1 : 0)) {
            return;
        }
        if (SquireAccountCleaner.var14(var17.getKey().equals(var2[var1[2]]) ? 1 : 0)) {
            boolean bl;
            if (SquireAccountCleaner.var15(var16.isPaused() ? 1 : 0)) {
                bl = var1[2];
                0;
                if (1 != 1) {
                    return;
                }
            } else {
                bl = var1[1];
            }
            var16.setPaused(bl);
        }
        if (SquireAccountCleaner.var14(var17.getKey().equals(var2[var1[0]]) ? 1 : 0)) {
            int var18;
            Object var19;
            Object var20;
            String var21 = var16.c.ignoreList();
            ArrayList<Integer> var22 = new ArrayList<Integer>();
            if (SquireAccountCleaner.var15(var21.isEmpty() ? 1 : 0)) {
                var19 = var20 = var21.split(var2[var1[3]]);
                var18 = ((Item)var19).length;
                int var23 = var1[1];
                while (SquireAccountCleaner.var12(var23, var18)) {
                    Object var24 = var19[var23];
                    Integer var25 = Integer.parseInt((String)var24);
                    var22.add(var25);
                    0;
                    ++var23;
                    0;
                    if (-1 <= (54 + 158 - 210 + 197 ^ 179 + 120 - 132 + 28)) continue;
                    return;
                }
            }
            var20 = Inventory.getAll().iterator();
            while (SquireAccountCleaner.var14(var20.hasNext() ? 1 : 0)) {
                var19 = (Item)var20.next();
                if (SquireAccountCleaner.var15(var22.contains(var19.getId()) ? 1 : 0)) {
                    var22.add(var19.getId());
                    0;
                }
                0;
                
                return;
            }
            var20 = new StringBuilder();
            var19 = var22.iterator();
            while (SquireAccountCleaner.var14(var19.hasNext() ? 1 : 0)) {
                var18 = (Integer)var19.next();
                ((StringBuilder)var20).append(var18).append(var2[var1[4]]);
                0;
                0;
                if null == null continue;
                return;
            }
            Static.getConfigManager().setConfiguration(var2[var1[5]], var2[var1[6]], String.valueOf(var20));
        }
    }

    private static boolean var12(int n, int n2) {
        return n < n2;
    }

        catch (Exception var31) {
            var31.printStackTrace();
            return null;
        }
    }

    private static void var32() {
        var2 = new String[var1[7]];
        SquireAccountCleaner.var2[SquireAccountCleaner.var1[1]] = "squirecleaner";
        SquireAccountCleaner.var2[SquireAccountCleaner.var1[2]] = "pause";
        SquireAccountCleaner.var2[SquireAccountCleaner.var1[0]] = "addToIgnore";
        SquireAccountCleaner.var2[SquireAccountCleaner.var1[3]] = ",";
        SquireAccountCleaner.var2[SquireAccountCleaner.var1[4]] = ",";
        SquireAccountCleaner.var2[SquireAccountCleaner.var1[5]] = "squirecleaner";
        SquireAccountCleaner.var2[SquireAccountCleaner.var1[6]] = "ignoreList";
    }

    static {
        SquireAccountCleaner.var33();
        SquireAccountCleaner.var32();
    }

    protected void onStart() {
    }

    private static void var33() {
        var1 = new int[9];
        SquireAccountCleaner.var1[0] = 2;
        SquireAccountCleaner.var1[1] = (0xED ^ 0xB7) & ~(0x1B ^ 0x41);
        SquireAccountCleaner.var1[2] = 1;
        SquireAccountCleaner.var1[3] = 3;
        SquireAccountCleaner.var1[4] = 0xD0 ^ 0x87 ^ (0x12 ^ 0x41);
        SquireAccountCleaner.var1[5] = 0xBB ^ 0xBE;
        SquireAccountCleaner.var1[6] = 0x14 ^ 0x28 ^ (0x1F ^ 0x25);
        SquireAccountCleaner.var1[7] = 0x8B ^ 0x8C;
        SquireAccountCleaner.var1[8] = 122 + 130 - 219 + 122 ^ 5 + 99 - 99 + 142;
    }

        catch (Exception var39) {
            var39.printStackTrace();
            return null;
        }
    }

    protected void onStop() {
    }
}

