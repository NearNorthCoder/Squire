/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.ConfigButtonClicked
 *  net.runelite.api.events.NpcSpawned
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.EventBus
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 *  net.unethicalite.api.entities.Players
 */
package gg.squire.moons;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.moons.SquireMoonsOfPerilConfig;
import gg.squire.moons.overlay.MoonsInfoBox;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.ConfigButtonClicked;
import net.runelite.api.events.NpcSpawned;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.entities.Players;
import gg.squire.moons.MoonsManager;
import gg.squire.moons.BloodMoonTask;
import gg.squire.moons.BlueMoonTask;
import gg.squire.moons.ClaimChestTask;
import gg.squire.moons.DepositAndExitTask;
import gg.squire.moons.PrayflickTask;
import gg.squire.moons.EclipseMoonTask;
import gg.squire.moons.CaveNavTask;
import gg.squire.moons.WaitingRoomsTask;
import gg.squire.moons.PrayflickTask;
import gg.squire.moons.PrepSuppliesTask;

@PluginDescriptor(name="Squire Moons of Peril", enabledByDefault=false)
public class SquireMoonsOfPeril
extends SquirePlugin {
    @Inject
    private  EventBus b;
    @Inject
    private  SquireMoonsOfPerilConfig c;
    public static  long i;
    @Inject
    private  a e;
    public static  Set<WorldPoint> j;
    @Inject
    private  OverlayManager a;
    
    public static  String g;
    public static  int h;
    public static  String f;
    @Inject
    private  MoonsInfoBox d;

    private static void lIIlIllIllllIlI() {
        lIIIIIIIllIll = new String[lIIIIIIIlllII[5]];
        SquireMoonsOfPeril.lIIIIIIIllIll[SquireMoonsOfPeril.lIIIIIIIlllII[1]] = "squiremoonsofperil";
        SquireMoonsOfPeril.lIIIIIIIllIll[SquireMoonsOfPeril.lIIIIIIIlllII[2]] = "pause";
        SquireMoonsOfPeril.lIIIIIIIllIll[SquireMoonsOfPeril.lIIIIIIIlllII[3]] = "Lunar Chest count";
        SquireMoonsOfPeril.lIIIIIIIllIll[SquireMoonsOfPeril.lIIIIIIIlllII[4]] = "1.11";
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        NPC var1;
        void var2;
        if (SquireMoonsOfPeril.lIIlIllIlllllII(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIIIIIIIlllII[11], lIIIIIIIlllII[12], lIIIIIIIlllII[1])) ? 1 : 0)) {
            return;
        }
        if (SquireMoonsOfPeril.lIIlIllIllllllI(var2.getNpc())) {
            System.out.println("name: " + var2.getNpc().getName());
            System.out.println("ID: " + var2.getNpc().getId());
            System.out.println("NPC: " + String.valueOf(var2.getNpc()));
        }
        if (SquireMoonsOfPeril.lIIlIllIllllllI(var1 = var2.getNpc())) {
            j.add(var1.getWorldLocation());

        }
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ConfigButtonClicked configButtonClicked) {
        void var3;
        if (SquireMoonsOfPeril.lIIlIllIlllllII(configButtonClicked.getGroup().equals(lIIIIIIIllIll[lIIIIIIIlllII[1]]) ? 1 : 0)) {
            return;
        }
        if (SquireMoonsOfPeril.lIIlIllIlllllIl(var3.getKey().equals(lIIIIIIIllIll[lIIIIIIIlllII[2]]) ? 1 : 0)) {
            boolean bl;
            SquireMoonsOfPeril var4;
            if (SquireMoonsOfPeril.lIIlIllIlllllII(var4.isPaused() ? 1 : 0)) {
                bl = lIIIIIIIlllII[2];

                if (1 == 0) {
                    return;
                }
            } else {
                bl = lIIIIIIIlllII[1];
            }
            var4.setPaused(bl);
        }
    }

    protected void onStop() {
        this.a.remove((Overlay)this.e);

        this.a.remove((Overlay)this.d);

    }

    private static boolean lIIlIllIlllllll(int n, int n2) {
        return n < n2;
    }

    protected void onStart() {
        this.a.add((Overlay)this.e);

        this.a.add((Overlay)this.d);

        i = System.currentTimeMillis();
        h = lIIIIIIIlllII[1];
    }

        return String.valueOf(var5);
    }

    static {
        SquireMoonsOfPeril.lIIlIllIllllIll();
        SquireMoonsOfPeril.lIIlIllIllllIlI();
        f = lIIIIIIIllIll[lIIIIIIIlllII[4]];
        i = System.currentTimeMillis();
        j = new LinkedHashSet<WorldPoint>();
    }

    @Provides
    SquireMoonsOfPerilConfig a(ConfigManager configManager) {
        return (SquireMoonsOfPerilConfig)configManager.getConfig(SquireMoonsOfPerilConfig.class);
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lIIIIIIIlllII[0]];
        classArray[SquireMoonsOfPeril.lIIIIIIIlllII[1]] = EclipseMoonTask.class;
        classArray[SquireMoonsOfPeril.lIIIIIIIlllII[2]] = BlueMoonTask.class;
        classArray[SquireMoonsOfPeril.lIIIIIIIlllII[3]] = BloodMoonTask.class;
        classArray[SquireMoonsOfPeril.lIIIIIIIlllII[4]] = ClaimChestTask.class;
        classArray[SquireMoonsOfPeril.lIIIIIIIlllII[5]] = DepositAndExitTask.class;
        classArray[SquireMoonsOfPeril.lIIIIIIIlllII[6]] = WaitingRoomsTask.class;
        classArray[SquireMoonsOfPeril.lIIIIIIIlllII[7]] = CaveNavTask.class;
        classArray[SquireMoonsOfPeril.lIIIIIIIlllII[8]] = PrepSuppliesTask.class;
        classArray[SquireMoonsOfPeril.lIIIIIIIlllII[9]] = PrayflickTask.class;
        classArray[SquireMoonsOfPeril.lIIIIIIIlllII[10]] = PrayflickTask.class;
        return classArray;
    }

    private static boolean lIIlIllIlllllII(int n) {
        return n == 0;
    }

    private static boolean lIIlIllIlllllIl(int n) {
        return n != 0;
    }

    private static boolean lIIlIllIllllllI(Object object) {
        return object != null;
    }

    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (SquireMoonsOfPeril.lIIlIllIlllllIl(chatMessage.getMessage().contains(lIIIIIIIllIll[lIIIIIIIlllII[3]]) ? 1 : 0)) {
            h += lIIIIIIIlllII[2];
        }
    }
}

