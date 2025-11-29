/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.SquireUtil
 *  net.runelite.client.input.KeyListener
 *  net.runelite.client.input.KeyManager
 *  net.runelite.client.plugins.Plugin
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.runelite.client.ui.ClientToolbar
 *  net.runelite.client.ui.NavigationButton
 *  net.runelite.client.ui.PluginPanel
 *  net.runelite.client.util.ImageUtil
 *  net.runelite.rs.api.RSClient
 *  net.unethicalite.api.commons.Rand
 *  net.unethicalite.client.Static
 */
package gg.squire.basics.gearloadouts;

import com.google.inject.Inject;
import gg.squire.client.plugins.SquireUtil;
import i.i.b.s.c.q.r.s.s.-.u.a.e.av;
import i.i.b.s.c.q.r.s.s.-.u.a.e.ay;
import java.awt.image.BufferedImage;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.client.input.KeyListener;
import net.runelite.client.input.KeyManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.runelite.client.ui.ClientToolbar;
import net.runelite.client.ui.NavigationButton;
import net.runelite.client.ui.PluginPanel;
import net.runelite.client.util.ImageUtil;
import net.runelite.rs.api.RSClient;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.client.Static;

@SquireUtil
@PluginDescriptor(name="Squire Gear Loadouts", enabledByDefault=true)
public class GearLoadoutPlugin
extends Plugin {
    private final /* synthetic */ KeyListener dF;
    @Inject
    private /* synthetic */ KeyManager bY;
    private /* synthetic */ NavigationButton dH;
    @Inject
    public /* synthetic */ ExecutorService dE;
    private static /* synthetic */ int[] lIlIllIlI;
    public final /* synthetic */ Set<EquipmentSetup> dC;
    @Inject
    private /* synthetic */ ClientToolbar dD;
    private static /* synthetic */ String[] lIlIllIIl;
    private /* synthetic */ av dG;

    private static boolean lIIllIIlIlI(int n2) {
        return n2 != 0;
    }

    public void c(List<EquipmentSetup> list) {
        this.dC.clear();
        list.removeIf(Objects::isNull);
        0;
        this.dC.addAll(list);
        0;
    }

    private static String lIIllIIIlll(String lIlllllIIlllIIl, String lIlllllIIllIllI) {
        try {
            SecretKeySpec lIlllllIIllllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlllllIIllIllI.getBytes(StandardCharsets.UTF_8)), lIlIllIlI[5]), "DES");
            Cipher lIlllllIIlllIll = Cipher.getInstance("DES");
            lIlllllIIlllIll.init(lIlIllIlI[4], lIlllllIIllllII);
            return new String(lIlllllIIlllIll.doFinal(Base64.getDecoder().decode(lIlllllIIlllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlllllIIlllIlI) {
            lIlllllIIlllIlI.printStackTrace();
            return null;
        }
    }

    private static void lIIllIIlIII() {
        lIlIllIIl = new String[lIlIllIlI[4]];
        GearLoadoutPlugin.lIlIllIIl[GearLoadoutPlugin.lIlIllIlI[2]] = GearLoadoutPlugin."gear_loadouts.png";
        GearLoadoutPlugin.lIlIllIIl[GearLoadoutPlugin.lIlIllIlI[3]] = GearLoadoutPlugin."Gear Loadouts";
    }

    static {
        GearLoadoutPlugin.lIIllIIlIIl();
        GearLoadoutPlugin.lIIllIIlIII();
    }

    private static void lIIllIIlIIl() {
        lIlIllIlI = new int[6];
        GearLoadoutPlugin.lIlIllIlI[0] = 0x43 ^ 0x46;
        GearLoadoutPlugin.lIlIllIlI[1] = 0x12 ^ 0x31;
        GearLoadoutPlugin.lIlIllIlI[2] = (0xBD ^ 0x93) & ~(0x24 ^ 0xA);
        GearLoadoutPlugin.lIlIllIlI[3] = 1;
        GearLoadoutPlugin.lIlIllIlI[4] = 2;
        GearLoadoutPlugin.lIlIllIlI[5] = 0xB9 ^ 0xB1;
    }

    protected void shutDown() {
        this.dD.removeNavigation(this.dH);
        this.bY.unregisterKeyListener(this.dF);
    }

    public GearLoadoutPlugin() {
        this.dC = new HashSet<EquipmentSetup>();
        this.dF = new ay(this);
    }

    private static void bM() {
        if (GearLoadoutPlugin.lIIllIIlIlI(((RSClient)Static.getClient()).isTesting() ? 1 : 0)) {
            int n2 = Rand.nextInt((int)lIlIllIlI[0], (int)lIlIllIlI[1]);
            Executors.newSingleThreadScheduledExecutor().schedule(() -> System.exit(lIlIllIlI[2]), (long)n2, TimeUnit.MINUTES);
            0;
        }
    }

    protected void startUp() {
        this.dG = (av)((Object)this.injector.getInstance(av.class));
        BufferedImage bufferedImage = ImageUtil.loadImageResource(((Object)((Object)this)).getClass(), (String)lIlIllIIl[lIlIllIlI[2]]);
        this.dH = NavigationButton.builder().tooltip(lIlIllIIl[lIlIllIlI[3]]).icon(bufferedImage).priority(lIlIllIlI[0]).panel((PluginPanel)this.dG).build();
        this.dD.addNavigation(this.dH);
        this.bY.registerKeyListener(this.dF);
        this.dE.submit(GearLoadoutPlugin::bM);
        0;
    }

    private static String lIIllIIIllI(String lIlllllIlIIIlII, String lIlllllIlIIIlIl) {
        try {
            SecretKeySpec lIlllllIlIIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlllllIlIIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlllllIlIIlIII = Cipher.getInstance("Blowfish");
            lIlllllIlIIlIII.init(lIlIllIlI[4], lIlllllIlIIlIIl);
            return new String(lIlllllIlIIlIII.doFinal(Base64.getDecoder().decode(lIlllllIlIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlllllIlIIIlll) {
            lIlllllIlIIIlll.printStackTrace();
            return null;
        }
    }
}

