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
import java.time.Instant;
import java.util.List;
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

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var9;
        String string = chatMessage.getMessage();
        if ((string.contains(var2[5] != 0) ? 1 : 0)) {
            c += 6;
            this.l = 6;
        }
        if ((var9.contains(var2[6] != 0) ? 1 : 0)) {
            b += 6;
        }
        if ((var9.contains(var2[7] != 0) ? 1 : 0)) {
            SquireFisherPlugin var10;
            if ((var10.h.fish( != 0).h().equals(var2[8]) ? 1 : 0) && (var9.contains(var2[9] != 0) ? 1 : 0)) {
                int[] nArray = new int[var1[10]];
                nArray[5] = var1[21];
                nArray[6] = var1[22];
                nArray[7] = var1[23];
                nArray[8] = var1[24];
                nArray[9] = var1[25];
                if ((Equipment.contains((int[] != 0)nArray) ? 1 : 0)) {
                    d += var1[26];
                    0;
                    if (-1 != -1) {
                        return;
                    }
                }
            } else if ((var9.contains(var2[var1[10]] != 0) ? 1 : 0)) {
                d += 6;
            }
        }
    }

    public static long c() {
        return f;
    }

    public void a(WorldArea worldArea) {
        this.m = worldArea;
    }

    public void a(InventorySetup inventorySetup) {
        this.n = inventorySetup;
    }

        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[4];
        classArray[5] = TickManipulatingTask.class;
        classArray[6] = FishingTask.class;
        classArray[7] = BankingTask.class;
        classArray[8] = OpeningTheBarrelTask.class;
        classArray[9] = DroppingFishTask.class;
        classArray[SquireFisherPlugin.var1[10]] = UsingSpecialAttackTask.class;
        classArray[SquireFisherPlugin.var1[11]] = EnteringFishingTrawlerTask.class;
        classArray[SquireFisherPlugin.var1[12]] = ChoppingTentacleTask.class;
        classArray[SquireFisherPlugin.var1[13]] = ClimbingUpLadderTask.class;
        classArray[SquireFisherPlugin.var1[14]] = LootingTask.class;
        classArray[SquireFisherPlugin.var1[15]] = DepositingLootTask.class;
        classArray[SquireFisherPlugin.var1[16]] = BankingThroughButlerTask.class;
        return classArray;
    }

    public Instant getStarted() {
        return this.k;
    }

    public static void a(int n) {
        e = n;
    }

    private void a() {
        SquireFisherPlugin var17;
        if ((this.g( != 0).matchesInventory() ? 1 : 0)) {
            return;
        }
        Item var18 = Inventory.getFirst(item -> item.getName().contains(var2[var1[12]]));
        Item var19 = Inventory.getFirst(item -> this.g.contains(item.getId()));
        int[] nArray = new int[6];
        nArray[5] = var1[17];
        Item var20 = Inventory.getFirst((int[])nArray);
        if ((Equipment.contains(var17.h.fish( == 0).k()) ? 1 : 0)) {
            var17.g().add(var17.h.fish().k(), 6);
            0;
        }
        if ((var17.h.fish( != null).l())) {
            var17.g().add(var17.h.fish().l());
            0;
        }
        if var20 != null {
            var17.g().add(var1[17]);
            0;
        }
        if var18 != null {
            var17.g().add(var18.getId(), 6);
            0;
            var17.g().add(var1[18], 6);
            0;
        }
        if var19 != null {
            var17.g().add(var19.getId(), 6);
            0;
            var17.g().add(var1[19], 6);
            0;
            var17.g().add(var1[20]);
            0;
        }
        if ((var17.h.fishBarrel( != 0) ? 1 : 0)) {
            var17.g().add(item -> item.getName().contains(var2[var1[11]]), 6);
            0;
        }
    }

    protected void onStop() {
        this.i.remove((Overlay)this.j);
        0;
        e = 5;
        d = 5;
        this.a((WorldArea)null);
        this.a((InventorySetup)null);
    }

    public static int b() {
        return e;
    }

    private static String var21(String var22, String var23) {
        var22 = new String(Base64.getDecoder().decode(var22.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var24 = new StringBuilder();
        char[] var25 = var23.toCharArray();
        int var26 = 5;
        char[] var27 = var22.toCharArray();
        int var28 = var27.length;
        int var29 = 5;
        while (var29 < lllllllllllllllIlIlllIlIlIIlIIlI2) {
            char var30 = var27[var29];
            var24.append((char)(var30 ^ var25[var26 % var25.length]));
            0;
            ++var26;
            ++var29;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var24);
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
        this.l = 5;
        this.i.add((Overlay)this.j);
        0;
        this.k = Instant.now();
        e = 5;
        this.a(new InventorySetup());
        if ((Players.getLocal( != null))) {
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

    static {
        SquireFisherPlugin.var31();
        SquireFisherPlugin.var32();
        a = LoggerFactory.getLogger(SquireFisherPlugin.class);
    }

    public SquireFisherPlugin() {
        this.g = List.of(Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3));
    }
}

