/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Provides
 *  gg.squire.api.InventorySetup
 *  gg.squire.client.plugins.SquirePlugin
 *  net.runelite.api.Item
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.EventBus
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.events.ConfigChanged
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.driftnet;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.api.InventorySetup;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.driftnet.SquireDriftNetConfig;
import gg.squire.driftnet.overlay.DriftNetInfoBox;
import net.runelite.api.Item;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import gg.squire.driftnet.DriftnetManager;
import gg.squire.driftnet.BankingTask;
import gg.squire.driftnet.ChasingFishTask;
import gg.squire.driftnet.EnterInstanceTask;
import gg.squire.driftnet.StartBankingTask;
import gg.squire.driftnet.FiguringOutWhatHarpoonWeAreUsingTask;
import gg.squire.driftnet.PlacingNetTask;
import gg.squire.driftnet.RemovingNetTask;
import gg.squire.driftnet.StopDivingTask;
import gg.squire.driftnet.RemovingNetTask;

@PluginDescriptor(name="Squire Drift Net Fisher", enabledByDefault=false)
public class SquireDriftNet
extends SquirePlugin {
    private  InventorySetup i;
    private  String b;
    @Inject
    private  a d;
    private  boolean c;
    
    @Inject
    private  EventBus f;
    private  boolean a;
    @Inject
    private  OverlayManager e;
    
    @Inject
    private  DriftNetInfoBox h;
    @Inject
    private  SquireDriftNetConfig g;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    @Subscribe
    public void a(ConfigChanged configChanged) {
        this.a(new InventorySetup());
        this.b();
    }

    public void a(String string) {
        this.b = string;
    }

    protected void onStop() {
        this.f.unregister((Object)this.d);
        this.e.remove((Overlay)this.h);
        0;
    }

    public void a(boolean bl) {
        this.a = bl;
    }

    protected void onStart() {
        this.a = 2;
        this.d.h();
        this.f.register((Object)this.d);
        this.e.add((Overlay)this.h);
        0;
        this.b = var2[2];
        this.a(new InventorySetup());
        if ((this.b.isEmpty( != 0) ? 1 : 0)) {
            this.b = this.a();
        }
        this.b();
    }

    public void a(InventorySetup inventorySetup) {
        this.i = inventorySetup;
    }

    public void b(boolean bl) {
        this.c = bl;
    }

    @Subscribe
    public void a(ChatMessage chatMessage) {
        String string = chatMessage.getMessage();
        if (!(string.contains(var2[3] == 0) ? 1 : 0) || (string.contains(var2[4] != 0) ? 1 : 0)) {
            var9.c = 2;
        }
    }

    public InventorySetup g() {
        return this.i;
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[1];
        classArray[0] = StartBankingTask.class;
        classArray[2] = FiguringOutWhatHarpoonWeAreUsingTask.class;
        classArray[3] = StopDivingTask.class;
        classArray[4] = BankingTask.class;
        classArray[5] = EnterInstanceTask.class;
        classArray[6] = RemovingNetTask.class;
        classArray[7] = PlacingNetTask.class;
        classArray[8] = RemovingNetTask.class;
        classArray[9] = ChasingFishTask.class;
        return classArray;
    }

    public SquireDriftNet() {
        this.b = var2[0];
    }

    public boolean c() {
        return this.a;
    }

    @Provides
    SquireDriftNetConfig a(ConfigManager configManager) {
        return (SquireDriftNetConfig)configManager.getConfig(SquireDriftNetConfig.class);
    }

    public void b() {
        if ((this.b.isEmpty( == 0) ? 1 : 0)) {
            SquireDriftNet var10;
            if ((this.g.stamina( != 0))) {
                this.g().add(item -> {
                    int n;
                    if ((item.getId() >= item.getId()2) && (item.getId() <= item.getId()2)) {
                        n = 2;
                        0;
                        if null != null {
                            return ((0x30 ^ 0xD) & ~(0x91 ^ 0xAC)) != 0;
                        }
                    } else {
                        n = 0;
                    }
                    return n != 0;
                }, this.g.stamina());
                0;
            }
            var10.g().add(var10.b, 2);
            0;
            var10.g().add(var1[10]);
            0;
        }
    }

    private static String var11(String var12, String var13) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var15 = var13.toCharArray();
        int var16 = 0;
        char[] var17 = var12.toCharArray();
        int var18 = var17.length;
        int var19 = 0;
        while (var19 < lllllllllllllllIlllIIllllIIIlllI2) {
            char var20 = var17[var19];
            var14.append((char)(var20 ^ var15[var16 % var15.length]));
            0;
            ++var16;
            ++var19;
            0;
            if (-3 <= 0) continue;
            return null;
        }
        return String.valueOf(var14);
    }

    public SquireDriftNetConfig f() {
        return this.g;
    }

    public String a() {
        Item item2 = Equipment.getFirst(item -> {
            boolean bl;
            if (!(item.getName( == 0).toLowerCase().contains(var2[8]) ? 1 : 0) || (item.getName( != 0).toLowerCase().contains(var2[9]) ? 1 : 0)) {
                bl = 2;
                0;
                if (((1 ^ 0x1C ^ (0x58 ^ 0x51)) & (103 + 28 - 25 + 75 ^ 86 + 115 - 184 + 144 ^ -1)) != 0) {
                    return ((9 ^ 3 ^ (0x11 ^ 2)) & (0x11 ^ 0x1B ^ (0x3D ^ 0x2E) ^ -1)) != 0;
                }
            } else {
                bl = 0;
            }
            return bl;
        });
        if item2 != null {
            return item2.getName();
        }
        Item var21 = Inventory.getFirst(item -> {
            int n;
            if (!(item.getName( == 0).toLowerCase().contains(var2[6]) ? 1 : 0) || (item.getName( != 0).toLowerCase().contains(var2[7]) ? 1 : 0)) {
                n = 2;
                0;
                if (3 <= 0) {
                    return ((0x5A ^ 0x78 ^ (0xE8 ^ 0x9F)) & (125 + 52 - 117 + 90 ^ 35 + 104 - 113 + 169 ^ -1)) != 0;
                }
            } else {
                n = 0;
            }
            return n != 0;
        });
        if var21 != null {
            return var21.getName();
        }
        return var2[5];
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

    public boolean e() {
        return this.c;
    }

    public String d() {
        return this.b;
    }
}

