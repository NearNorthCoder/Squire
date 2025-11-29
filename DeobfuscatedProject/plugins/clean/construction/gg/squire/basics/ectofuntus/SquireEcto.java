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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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
    
    private  boolean M;
    
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

    public int bm() {
        return this.cU;
    }

        return String.valueOf(lllIIlllIllIlll);
    }

    private static boolean lllIlIIll(Object object) {
        return object == null;
    }

    private static void lllIlIIIl() {
        llllIII = new String[llllIIl[5]];
        SquireEcto.llllIII[SquireEcto.llllIIl[0]] = "starte ";
        SquireEcto.llllIII[SquireEcto.llllIIl[2]] = "We need an ectophial to run the plugin.";
        SquireEcto.llllIII[SquireEcto.llllIIl[3]] = "Empty";
        SquireEcto.llllIII[SquireEcto.llllIIl[4]] = "Empty";
    }

    @Provides
    SquireEctoConfig j(ConfigManager configManager) {
        return (SquireEctoConfig)configManager.getConfig(SquireEctoConfig.class);
    }

    protected void onStop() {
        this.bq.remove((Overlay)this.cS);

    }

    public int bn() {
        return this.cV;
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[llllIIl[1]];
        classArray[SquireEcto.llllIIl[0]] = TraverseToBankTask.class;
        classArray[SquireEcto.llllIIl[2]] = BankingForItemsTask.class;
        classArray[SquireEcto.llllIIl[3]] = GrindingBonesTask.class;
        classArray[SquireEcto.llllIIl[4]] = PrayingWithBonemealTask.class;
        classArray[SquireEcto.llllIIl[5]] = CollectingSlimeTask.class;
        return classArray;
    }

    protected void onStart() {
        Log.info((String)llllIII[llllIIl[0]]);
        this.bq.add((Overlay)this.cS);

    }

    public SquireEcto() {
        this.M = llllIIl[0];
        this.cT = llllIIl[0];
        this.cU = llllIIl[0];
        this.cV = llllIIl[0];
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
        void lllIIllllIIIlII;
        int[] nArray = new int[llllIIl[3]];
        nArray[SquireEcto.llllIIl[0]] = llllIIl[6];
        nArray[SquireEcto.llllIIl[2]] = llllIIl[7];
        Item item = Inventory.getFirst((int[])nArray);
        if (SquireEcto.lllIlIIll(item)) {
            Log.info((String)llllIII[llllIIl[2]]);
            return llllIIl[0];
        }
        String[] stringArray = new String[llllIIl[2]];
        stringArray[SquireEcto.llllIIl[0]] = llllIII[llllIIl[3]];
        if (SquireEcto.lllIlIlII(lllIIllllIIIlII.hasAction(stringArray) ? 1 : 0)) {
            lllIIllllIIIlII.interact(llllIII[llllIIl[4]]);
            return llllIIl[2];
        }
        return llllIIl[0];
    }

    private static boolean lllIlIlII(int n2) {
        return n2 != 0;
    }

    private static boolean lllIlIlIl(int n2, int n3) {
        return n2 < n3;
    }

    public int bl() {
        return this.cT;
    }

    static {
        SquireEcto.lllIlIIlI();
        SquireEcto.lllIlIIIl();
    }
}

