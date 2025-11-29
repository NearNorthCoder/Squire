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
import gg.squire.basics.gearloadouts.ConstructionManager;
import java.awt.image.BufferedImage;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
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
    private final  KeyListener dF;
    @Inject
    private  KeyManager bY;
    private  NavigationButton dH;
    @Inject
    public  ExecutorService dE;
    private static  int[] lIlIllIlI;
    public final  Set<EquipmentSetup> dC;
    @Inject
    private  ClientToolbar dD;
    private static  String[] lIlIllIIl;
    private  av dG;

    private static boolean var1(int n2) {
        return n2 != 0;
    }

    public void c(List<EquipmentSetup> list) {
        this.dC.clear();
        list.removeIf(Objects::isNull);
        0;
        this.dC.addAll(list);
        0;
    }

        catch (Exception var7) {
            var7.printStackTrace();
            return null;
        }
    }

    private static void var8() {
        lIlIllIIl = new String[lIlIllIlI[4]];
        GearLoadoutPlugin.lIlIllIIl[GearLoadoutPlugin.lIlIllIlI[2]] = "gear_loadouts.png";
        GearLoadoutPlugin.lIlIllIIl[GearLoadoutPlugin.lIlIllIlI[3]] = "Gear Loadouts";
    }

    static {
        GearLoadoutPlugin.var9();
        GearLoadoutPlugin.var8();
    }

    private static void var9() {
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
        if (GearLoadoutPlugin.var1(((RSClient)Static.getClient()).isTesting() ? 1 : 0)) {
            int n2 = Rand.nextInt((int)lIlIllIlI[0], (int)lIlIllIlI[1]);
            Executors.newSingleThreadScheduledExecutor().schedule(() -> System.exit(lIlIllIlI[2]), (long)n2, TimeUnit.MINUTES);
            0;
        }
    }

    protected void startUp() {
        this.dG = (av)((Object)this.injector.getInstance(ConstructionManager.class));
        BufferedImage bufferedImage = ImageUtil.loadImageResource(((Object)((Object)this)).getClass(), (String)lIlIllIIl[lIlIllIlI[2]]);
        this.dH = NavigationButton.builder().tooltip(lIlIllIIl[lIlIllIlI[3]]).icon(bufferedImage).priority(lIlIllIlI[0]).panel((PluginPanethis.dG).build();
        this.dD.addNavigation(this.dH);
        this.bY.registerKeyListener(this.dF);
        this.dE.submit(GearLoadoutPlugin::bM);
        0;
    }

        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }
}

