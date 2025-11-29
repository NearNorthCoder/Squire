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
import i.i.b.s.c.q.r.s.s.-.u.a.e.BankingForItemsTask;
import i.i.b.s.c.q.r.s.s.-.u.a.e.TraverseToBankTask;
import i.i.b.s.c.q.r.s.s.-.u.a.e.CollectingSlimeTask;
import i.i.b.s.c.q.r.s.s.-.u.a.e.GrindingBonesTask;
import i.i.b.s.c.q.r.s.s.-.u.a.e.PrayingWithBonemealTask;
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
    private /* synthetic */ OverlayManager bq;
    private static /* synthetic */ String[] llllIII;
    private /* synthetic */ boolean M;
    private static /* synthetic */ int[] llllIIl;
    private /* synthetic */ int cU;
    @Inject
    private /* synthetic */ EctoOverlay cS;
    private /* synthetic */ int cT;
    private /* synthetic */ int cV;

    public void s(int n2) {
        this.cV = n2;
    }

    public void q(int n2) {
        this.cT = n2;
    }

    public void r(int n2) {
        this.cU = n2;
    }

    private static String lllIlIIII(String lllIIlllIlIIlII, String lllIIlllIlIIIll) {
        try {
            SecretKeySpec lllIIlllIlIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIIlllIlIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllIIlllIlIIllI = Cipher.getInstance("Blowfish");
            lllIIlllIlIIllI.init(llllIIl[3], lllIIlllIlIIlll);
            return new String(lllIIlllIlIIllI.doFinal(Base64.getDecoder().decode(lllIIlllIlIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIIlllIlIIlIl) {
            lllIIlllIlIIlIl.printStackTrace();
            return null;
        }
    }

    public int bm() {
        return this.cU;
    }

    private static String lllIIllll(String lllIIlllIllIlII, String lllIIlllIlllIII) {
        lllIIlllIllIlII = new String(Base64.getDecoder().decode(lllIIlllIllIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllIIlllIllIlll = new StringBuilder();
        char[] lllIIlllIllIllI = lllIIlllIlllIII.toCharArray();
        int lllIIlllIllIlIl = llllIIl[0];
        char[] lllIIlllIlIllll = lllIIlllIllIlII.toCharArray();
        int lllIIlllIlIlllI = lllIIlllIlIllll.length;
        int lllIIlllIlIllIl = llllIIl[0];
        while (SquireEcto.lllIlIlIl(lllIIlllIlIllIl, lllIIlllIlIlllI)) {
            char lllIIlllIlllIlI = lllIIlllIlIllll[lllIIlllIlIllIl];
            lllIIlllIllIlll.append((char)(lllIIlllIlllIlI ^ lllIIlllIllIllI[lllIIlllIllIlIl % lllIIlllIllIllI.length]));
            0;
            ++lllIIlllIllIlIl;
            ++lllIIlllIlIllIl;
            0;
            if (2 < (0x58 ^ 0x69 ^ (0xF4 ^ 0xC1))) continue;
            return null;
        }
        return String.valueOf(lllIIlllIllIlll);
    }

    private static boolean lllIlIIll(Object object) {
        return object == null;
    }

    private static void lllIlIIIl() {
        llllIII = new String[llllIIl[5]];
        SquireEcto.llllIII[SquireEcto.llllIIl[0]] = SquireEcto."starte ";
        SquireEcto.llllIII[SquireEcto.llllIIl[2]] = SquireEcto."We need an ectophial to run the plugin.";
        SquireEcto.llllIII[SquireEcto.llllIIl[3]] = SquireEcto."Empty";
        SquireEcto.llllIII[SquireEcto.llllIIl[4]] = SquireEcto."Empty";
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

    private static void lllIlIIlI() {
        llllIIl = new int[8];
        SquireEcto.llllIIl[0] = (0xA7 ^ 0xAB) & ~(0x85 ^ 0x89);
        SquireEcto.llllIIl[1] = 0xB ^ 0x53 ^ (0x74 ^ 0x29);
        SquireEcto.llllIIl[2] = 1;
        SquireEcto.llllIIl[3] = 2;
        SquireEcto.llllIIl[4] = 3;
        SquireEcto.llllIIl[5] = 0x88 ^ 0xA6 ^ (9 ^ 0x23);
        SquireEcto.llllIIl[6] = -(0xFFFFCDED & 0x7377) & (0xFFFFD7FF & 0x79FF);
        SquireEcto.llllIIl[7] = -(0xFFFFAFF5 & 0x7D6B) & (0xFFFFBDFE & 0x7FFD);
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
        0;
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

