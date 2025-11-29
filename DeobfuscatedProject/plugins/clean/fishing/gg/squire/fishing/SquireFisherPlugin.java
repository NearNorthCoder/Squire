/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Provides
 *  gg.squire.api.InventorySetup
 *  gg.squire.client.plugins.SquirePlugin
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.events.ConfigChanged
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  org.pf4j.Extension
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.fishing;

import com.google.inject.Provides;
import gg.squire.api.InventorySetup;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.fishing.SquireFisherConfig;
import gg.squire.fishing.overlay.FishingInfoBox;
import gg.squire.fishing.ChoppingTentacleTask;
import gg.squire.fishing.ClimbingUpLadderTask;
import gg.squire.fishing.LootingTask;
import gg.squire.fishing.DepositingLootTask;
import gg.squire.fishing.EnteringFishingTrawlerTask;
import gg.squire.fishing.BankingTask;
import gg.squire.fishing.DroppingFishTask;
import gg.squire.fishing.OpeningTheBarrelTask;
import gg.squire.fishing.FishingTask;
import gg.squire.fishing.BankingThroughButlerTask;
import gg.squire.fishing.UsingSpecialAttackTask;
import gg.squire.fishing.TickManipulatingTask;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Instant;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import org.pf4j.Extension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Extension
@PluginDescriptor(name="Squire Fishing")
public class SquireFisherPlugin
extends SquirePlugin {
    @Inject
    private  OverlayManager i;
    private  InventorySetup n;
    public static  int c;
    public static  int d;
    private  Instant k;
    private static  int e;
    
    private static  long f;
    public static  int b;
    
    @Inject
    private  FishingInfoBox j;
    private static final  Logger a;
    private  WorldArea m;
    @Inject
    private  SquireFisherConfig h;
    private  boolean l;
    private final  List<Integer> g;

    @Provides
    SquireFisherConfig a(ConfigManager configManager) {
        return (SquireFisherConfig)configManager.getConfig(SquireFisherConfig.class);
    }

    public boolean e() {
        return this.l;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var1;
        String string = chatMessage.getMessage();
        if (SquireFisherPlugin.lllIlIlllIllIl(string.contains(lIlllIllIIlI[lIlllIllIIll[5]]) ? 1 : 0)) {
            c += lIlllIllIIll[6];
            this.l = lIlllIllIIll[6];
        }
        if (SquireFisherPlugin.lllIlIlllIllIl(var1.contains(lIlllIllIIlI[lIlllIllIIll[6]]) ? 1 : 0)) {
            b += lIlllIllIIll[6];
        }
        if (SquireFisherPlugin.lllIlIlllIllIl(var1.contains(lIlllIllIIlI[lIlllIllIIll[7]]) ? 1 : 0)) {
            SquireFisherPlugin var2;
            if (SquireFisherPlugin.lllIlIlllIllIl(var2.h.fish().h().equals(lIlllIllIIlI[lIlllIllIIll[8]]) ? 1 : 0) && SquireFisherPlugin.lllIlIlllIllIl(var1.contains(lIlllIllIIlI[lIlllIllIIll[9]]) ? 1 : 0)) {
                int[] nArray = new int[lIlllIllIIll[10]];
                nArray[SquireFisherPlugin.lIlllIllIIll[5]] = lIlllIllIIll[21];
                nArray[SquireFisherPlugin.lIlllIllIIll[6]] = lIlllIllIIll[22];
                nArray[SquireFisherPlugin.lIlllIllIIll[7]] = lIlllIllIIll[23];
                nArray[SquireFisherPlugin.lIlllIllIIll[8]] = lIlllIllIIll[24];
                nArray[SquireFisherPlugin.lIlllIllIIll[9]] = lIlllIllIIll[25];
                if (SquireFisherPlugin.lllIlIlllIllIl(Equipment.contains((int[])nArray) ? 1 : 0)) {
                    d += lIlllIllIIll[26];

                    if (-1 != -1) {
                        return;
                    }
                }
            } else if (SquireFisherPlugin.lllIlIlllIllIl(var1.contains(lIlllIllIIlI[lIlllIllIIll[10]]) ? 1 : 0)) {
                d += lIlllIllIIll[6];
            }
        }
    }

    public static long c() {
        return f;
    }

    private static boolean lllIlIlllIlllI(int n) {
        return n == 0;
    }

    public void a(WorldArea worldArea) {
        this.m = worldArea;
    }

    public void a(InventorySetup inventorySetup) {
        this.n = inventorySetup;
    }

    private static void lllIlIlllIlIlI() {
        lIlllIllIIlI = new String[lIlllIllIIll[13]];
        SquireFisherPlugin.lIlllIllIIlI[SquireFisherPlugin.lIlllIllIIll[5]] = "have contributed enough";
        SquireFisherPlugin.lIlllIllIIlI[SquireFisherPlugin.lIlllIllIIll[6]] = "luck of the sea";
        SquireFisherPlugin.lIlllIllIIlI[SquireFisherPlugin.lIlllIllIIll[7]] = "catch";
        SquireFisherPlugin.lIlllIllIIlI[SquireFisherPlugin.lIlllIllIIll[8]] = "Karambwanji";
        SquireFisherPlugin.lIlllIllIIlI[SquireFisherPlugin.lIlllIllIIll[9]] = "Karambwanji";
        SquireFisherPlugin.lIlllIllIIlI[SquireFisherPlugin.lIlllIllIIll[10]] = "You catch a";
        SquireFisherPlugin.lIlllIllIIlI[SquireFisherPlugin.lIlllIllIIll[11]] = "ish barrel";
        SquireFisherPlugin.lIlllIllIIlI[SquireFisherPlugin.lIlllIllIIll[12]] = "Knife";
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lIlllIllIIll[4]];
        classArray[SquireFisherPlugin.lIlllIllIIll[5]] = TickManipulatingTask.class;
        classArray[SquireFisherPlugin.lIlllIllIIll[6]] = FishingTask.class;
        classArray[SquireFisherPlugin.lIlllIllIIll[7]] = BankingTask.class;
        classArray[SquireFisherPlugin.lIlllIllIIll[8]] = OpeningTheBarrelTask.class;
        classArray[SquireFisherPlugin.lIlllIllIIll[9]] = DroppingFishTask.class;
        classArray[SquireFisherPlugin.lIlllIllIIll[10]] = UsingSpecialAttackTask.class;
        classArray[SquireFisherPlugin.lIlllIllIIll[11]] = EnteringFishingTrawlerTask.class;
        classArray[SquireFisherPlugin.lIlllIllIIll[12]] = ChoppingTentacleTask.class;
        classArray[SquireFisherPlugin.lIlllIllIIll[13]] = ClimbingUpLadderTask.class;
        classArray[SquireFisherPlugin.lIlllIllIIll[14]] = LootingTask.class;
        classArray[SquireFisherPlugin.lIlllIllIIll[15]] = DepositingLootTask.class;
        classArray[SquireFisherPlugin.lIlllIllIIll[16]] = BankingThroughButlerTask.class;
        return classArray;
    }

    public Instant getStarted() {
        return this.k;
    }

    public static void a(int n) {
        e = n;
    }

    private void a() {
        SquireFisherPlugin var3;
        if (SquireFisherPlugin.lllIlIlllIllIl(this.g().matchesInventory() ? 1 : 0)) {
            return;
        }
        Item var4 = Inventory.getFirst(item -> item.getName().contains(lIlllIllIIlI[lIlllIllIIll[12]]));
        Item var5 = Inventory.getFirst(item -> this.g.contains(item.getId()));
        int[] nArray = new int[lIlllIllIIll[6]];
        nArray[SquireFisherPlugin.lIlllIllIIll[5]] = lIlllIllIIll[17];
        Item var6 = Inventory.getFirst((int[])nArray);
        if (SquireFisherPlugin.lllIlIlllIlllI(Equipment.contains(var3.h.fish().k()) ? 1 : 0)) {
            var3.g().add(var3.h.fish().k(), lIlllIllIIll[6]);

        }
        if (SquireFisherPlugin.lllIlIlllIllII(var3.h.fish().l())) {
            var3.g().add(var3.h.fish().l());

        }
        if (SquireFisherPlugin.lllIlIlllIllII(var6)) {
            var3.g().add(lIlllIllIIll[17]);

        }
        if (SquireFisherPlugin.lllIlIlllIllII(var4)) {
            var3.g().add(var4.getId(), lIlllIllIIll[6]);

            var3.g().add(lIlllIllIIll[18], lIlllIllIIll[6]);

        }
        if (SquireFisherPlugin.lllIlIlllIllII(var5)) {
            var3.g().add(var5.getId(), lIlllIllIIll[6]);

            var3.g().add(lIlllIllIIll[19], lIlllIllIIll[6]);

            var3.g().add(lIlllIllIIll[20]);

        }
        if (SquireFisherPlugin.lllIlIlllIllIl(var3.h.fishBarrel() ? 1 : 0)) {
            var3.g().add(item -> item.getName().contains(lIlllIllIIlI[lIlllIllIIll[11]]), lIlllIllIIll[6]);

        }
    }

    private static boolean lllIlIlllIllIl(int n) {
        return n != 0;
    }

    private static boolean lllIlIlllIllll(int n, int n2) {
        return n < n2;
    }

    protected void onStop() {
        this.i.remove((Overlay)this.j);

        e = lIlllIllIIll[5];
        d = lIlllIllIIll[5];
        this.a((WorldArea)null);
        this.a((InventorySetup)null);
    }

    public static int b() {
        return e;
    }

        return String.valueOf(var7);
    }

    public SquireFisherConfig d() {
        return this.h;
    }

    public void a(boolean bl) {
        this.l = bl;
    }

    public InventorySetup g() {
        return this.n;
    }

    protected void onStart() {
        this.l = lIlllIllIIll[5];
        this.i.add((Overlay)this.j);

        this.k = Instant.now();
        e = lIlllIllIIll[5];
        this.a(new InventorySetup());
        if (SquireFisherPlugin.lllIlIlllIllII(Players.getLocal())) {
            this.a(Players.getLocal().getWorldArea());
            this.a();
        }
    }

    public WorldArea f() {
        return this.m;
    }

    @Subscribe
    public void a(ConfigChanged configChanged) {
        this.a(new InventorySetup());
        this.a();
    }

    private static boolean lllIlIlllIllII(Object object) {
        return object != null;
    }

    static {
        SquireFisherPlugin.lllIlIlllIlIll();
        SquireFisherPlugin.lllIlIlllIlIlI();
        a = LoggerFactory.getLogger(SquireFisherPlugin.class);
    }

    public SquireFisherPlugin() {
        this.g = List.of(Integer.valueOf(lIlllIllIIll[0]), Integer.valueOf(lIlllIllIIll[1]), Integer.valueOf(lIlllIllIIll[2]), Integer.valueOf(lIlllIllIIll[3]));
    }
}

