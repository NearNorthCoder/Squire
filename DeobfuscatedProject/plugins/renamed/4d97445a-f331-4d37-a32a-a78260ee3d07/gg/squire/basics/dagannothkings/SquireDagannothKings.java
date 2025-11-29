/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  net.runelite.api.TileItem
 *  net.runelite.api.events.ItemSpawned
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.EventBus
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.unethicalite.client.Static
 *  net.unethicalite.client.managers.interaction.InteractionManager
 */
package gg.squire.basics.dagannothkings;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.basics.dagannothkings.DagannothKingConfig;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import i.i.b.s.c.q.r.s.s.-.u.a.e.aH_Unknown;
import i.i.b.s.c.q.r.s.s.-.u.a.e.ad_Unknown;
import i.i.b.s.c.q.r.s.s.-.u.a.e.ae_Unknown;
import i.i.b.s.c.q.r.s.s.-.u.a.e.DrinkingPrayerPotionTask;
import i.i.b.s.c.q.r.s.s.-.u.a.e.EatingFoodTask;
import i.i.b.s.c.q.r.s.s.-.u.a.e.FlickingTask;
import i.i.b.s.c.q.r.s.s.-.u.a.e.TeleportingOutTask;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileItem;
import net.runelite.api.events.ItemSpawned;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.unethicalite.client.Static;
import net.unethicalite.client.managers.interaction.InteractionManager;

@PluginDescriptor(name="Squire Dagannoth Kings", description="DK Helper", enabledByDefault=false)
@SquireUtil
public class SquireDagannothKings
extends SquirePlugin {
    private static /* synthetic */ int[] lIlIllI;
    private static /* synthetic */ String[] lIlIlIl;
    @Inject
    private /* synthetic */ EventBus K;
    /* synthetic */ List<aH> F;
    @Inject
    private /* synthetic */ ae cv;
    @Inject
    private /* synthetic */ ad cu;
    @Inject
    /* synthetic */ DagannothKingConfig ct;

    @Provides
    DagannothKingConfig h(ConfigManager configManager) {
        return (DagannothKingConfig)configManager.getConfig(DagannothKingConfig.class);
    }

    protected void onStop() {
        InteractionManager.setHelper((boolean)lIlIllI[1]);
        this.F.clear();
        this.K.unregister((Object)this.cu);
        this.K.unregister((Object)this.cv);
    }

    public void a(List<aH> list) {
        this.F = list;
    }

    public List<aH> p() {
        return this.F;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ItemSpawned itemSpawned) {
        void var3_3;
        void lllIllIlllIIIlI;
        TileItem tileItem = itemSpawned.getItem();
        if (SquireDagannothKings.lIlIllIll(tileItem.canPickup() ? 1 : 0)) {
            return;
        }
        aH lllIllIlllIIIIl = new aH();
        String lllIllIlllIIIII = lllIllIlllIIIlI.getName();
        lllIllIlllIIIIl.f(lllIllIlllIIIlI.getId());
        lllIllIlllIIIIl.i(lllIllIlllIIIlI.getWorldLocation());
        if (SquireDagannothKings.lIlIlllII(lllIllIlllIIIII.contains(lIlIlIl[lIlIllI[1]]) ? 1 : 0)) {
            return;
        }
        this.F.add((aH)var3_3);
        0;
        System.out.println("Adding " + Static.getClient().getItemDefinition(var3_3.P()).getName() + " to items to loot");
    }

    private static boolean lIlIllIll(int n2) {
        return n2 == 0;
    }

    private static String lIlIllIII(String lllIllIllIllIII, String lllIllIllIlIlll) {
        try {
            SecretKeySpec lllIllIllIllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIllIllIlIlll.getBytes(StandardCharsets.UTF_8)), lIlIllI[5]), "DES");
            Cipher lllIllIllIllIlI = Cipher.getInstance("DES");
            lllIllIllIllIlI.init(lIlIllI[3], lllIllIllIllIll);
            return new String(lllIllIllIllIlI.doFinal(Base64.getDecoder().decode(lllIllIllIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIllIllIllIIl) {
            lllIllIllIllIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlllII(int n2) {
        return n2 != 0;
    }

    private static void lIlIllIlI() {
        lIlIllI = new int[6];
        SquireDagannothKings.lIlIllI[0] = 0x41 ^ 0x45;
        SquireDagannothKings.lIlIllI[1] = (0x35 ^ 0x20) & ~(0x88 ^ 0x9D);
        SquireDagannothKings.lIlIllI[2] = 1;
        SquireDagannothKings.lIlIllI[3] = 2;
        SquireDagannothKings.lIlIllI[4] = 3;
        SquireDagannothKings.lIlIllI[5] = 0xAC ^ 0xA4;
    }

    private static void lIlIllIIl() {
        lIlIlIl = new String[lIlIllI[2]];
        SquireDagannothKings.lIlIlIl[SquireDagannothKings.lIlIllI[1]] = SquireDagannothKings."page";
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lIlIllI[0]];
        classArray[SquireDagannothKings.lIlIllI[1]] = FlickingTask.class;
        classArray[SquireDagannothKings.lIlIllI[2]] = EatingFoodTask.class;
        classArray[SquireDagannothKings.lIlIllI[3]] = TeleportingOutTask.class;
        classArray[SquireDagannothKings.lIlIllI[4]] = DrinkingPrayerPotionTask.class;
        return classArray;
    }

    static {
        SquireDagannothKings.lIlIllIlI();
        SquireDagannothKings.lIlIllIIl();
    }

    public SquireDagannothKings() {
        this.F = new ArrayList<aH>();
    }

    protected void onStart() {
        InteractionManager.setHelper((boolean)lIlIllI[2]);
        this.K.register((Object)this.cu);
        this.K.register((Object)this.cv);
    }
}

