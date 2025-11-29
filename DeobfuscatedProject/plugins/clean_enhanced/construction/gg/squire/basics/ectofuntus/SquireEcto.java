/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  gg.squire.client.util.Log
 *  net.runelite.api.Item
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.basics.ectofuntus;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.basics.ectofuntus.SquireEctoConfig;
import gg.squire.basics.ectofuntus.overlay.EctoOverlay;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import gg.squire.client.util.Log;
import gg.squire.basics.ectofuntus.BankingForItemsTask;
import gg.squire.basics.ectofuntus.TraverseToBankTask;
import gg.squire.basics.ectofuntus.CollectingSlimeTask;
import gg.squire.basics.ectofuntus.GrindingBonesTask;
import gg.squire.basics.ectofuntus.PrayingWithBonemealTask;
import net.runelite.api.Item;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.items.Inventory;

@SquireUtil
@PluginDescriptor(name="Squire Ectofuntus", description="Gets you those HCIM prayer levels", enabledByDefault=false)
public class SquireEcto
extends SquirePlugin {
    @Inject
    private  OverlayManager bq;
    private static  String[] llllIII;
    private  boolean M;
    private static  int[] llllIIl;
    private  int cU;
    @Inject
    private  EctoOverlay cS;
    private  int cT;
    private  int cV;

    public void s(int n2) {
        this.cV = n2;
    }

    public void q(int n2) {
        this.cT = n2;
    }

    public void r(int n2) {
        this.cU = n2;
    }

        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    public int bm() {
        return this.cU;
    }

    private static String lllIIllll(String var6, String var7) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var9 = var7.toCharArray();
        int var10 = 0;
        char[] var11 = var6.toCharArray();
        int var12 = var11.length;
        int var13 = 0;
        while (var13 < var12) {
            char var14 = var11[var13];
            var8.append((char)(var14 ^ var9[var10 % var9.length]));
            0;
            ++var10;
            ++var13;
            0;
            if (2 < (0x58 ^ 0x69 ^ (0xF4 ^ 0xC1))) continue;
            return null;
        }
        return String.valueOf(var8);
    }

    @Provides
    SquireEctoConfig j(ConfigManager configManager) {
        return (SquireEctoConfig)configManager.getConfig(SquireEctoConfig.class);
    }

    protected void onStop() {
        this.bq.remove((Overlay)this.cS);
        0;
    }

    public int bn() {
        return this.cV;
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[1];
        classArray[0] = TraverseToBankTask.class;
        classArray[2] = BankingForItemsTask.class;
        classArray[3] = GrindingBonesTask.class;
        classArray[4] = PrayingWithBonemealTask.class;
        classArray[5] = CollectingSlimeTask.class;
        return classArray;
    }

    protected void onStart() {
        Log.info((String)llllIII[0]);
        this.bq.add((Overlay)this.cS);
        0;
    }

    public SquireEcto() {
        this.M = 0;
        this.cT = 0;
        this.cU = 0;
        this.cV = 0;
    }

    public boolean r() {
        return this.M;
    }

    public void b(boolean bl2) {
        this.M = bl2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean bk() {
        void var15;
        int[] nArray = new int[3];
        nArray[0] = 6;
        nArray[2] = 7;
        Item item = Inventory.getFirst((int[])nArray);
        if item == null {
            Log.info((String)llllIII[2]);
            return 0;
        }
        String[] stringArray = new String[2];
        stringArray[0] = llllIII[3];
        if ((var15.hasActionstringArray)) {
            var15.interact(llllIII[4]);
            return 2;
        }
        return 0;
    }

    public int bl() {
        return this.cT;
    }

}

