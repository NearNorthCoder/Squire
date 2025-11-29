/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.ConfigButtonClicked
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.EventBus
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 *  net.unethicalite.api.events.MenuActionProcessed
 *  net.unethicalite.api.items.Equipment
 */
package gg.squire.quest;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.quest.SquireQuesterConfig;
import gg.squire.quest.overlay.QuesterInfoBox;
import java.util.stream.Collectors;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.ConfigButtonClicked;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.events.MenuActionProcessed;
import net.unethicalite.api.items.Equipment;
import gg.squire.quest.CompletingSheepShearerTask;
import gg.squire.quest.CompletingTutorialIslandTask;
import gg.squire.quest.CompletingWitchsPotionTask;
import gg.squire.quest.CompletingXMarksTheSpotTask;
import gg.squire.quest.UpgradingToMembersTask;
import gg.squire.quest.CompletingClientOfKourendTask;
import gg.squire.quest.CompletingCooksAssistantTask;
import gg.squire.quest.CompletingDwarfCannonTask;
import gg.squire.quest.CompletingImpCatcherTask;
import gg.squire.quest.CompletingMisthalinMysteryTask;
import gg.squire.quest.CompletingNaturalHistoryQuizTask;
import gg.squire.quest.CompletingPiratesTreasureTask;
import gg.squire.quest.CompletingPrinceAliRescueTask;
import gg.squire.quest.CompletingRestlessGhostTask;
import gg.squire.quest.CompletingRomeoAndJulietTask;
import gg.squire.quest.CompletingRestlessGhostTask;

@PluginDescriptor(name="Squire Quester", enabledByDefault=false)
public class SquireQuester
extends SquirePlugin {
    @Inject
    private  ConfigManager d;
    @Inject
    private  OverlayManager a;
    private  String f;

    @Inject
    private  QuesterInfoBox b;
    @Inject
    private  EventBus c;
    private  boolean e;

    private static void var3() {
        var2 = new int[17];
        SquireQuester.var2[0] = 0x5C ^ 0x4C;
        SquireQuester.var2[1] = (0x5D ^ 0xB) & ~(0xD0 ^ 0x86);
        SquireQuester.var2[2] = 1;
        SquireQuester.var2[3] = 2;
        SquireQuester.var2[4] = 3;
        SquireQuester.var2[5] = 0x63 ^ 0x67;
        SquireQuester.var2[6] = 0x4E ^ 0x4B;
        SquireQuester.var2[7] = 128 + 104 - 64 + 9 ^ 22 + 182 - 159 + 138;
        SquireQuester.var2[8] = 0xCA ^ 0xAB ^ (0xA5 ^ 0xC3);
        SquireQuester.var2[9] = 75 + 3 - 4 + 61 ^ 136 + 61 - 106 + 52;
        SquireQuester.var2[10] = 0x29 ^ 0x6D ^ (0x8D ^ 0xC0);
        SquireQuester.var2[11] = 6 ^ 0xC;
        SquireQuester.var2[12] = 0xA3 ^ 0xA8;
        SquireQuester.var2[13] = 0xA0 ^ 0xAC;
        SquireQuester.var2[14] = 0x3D ^ 0x30;
        SquireQuester.var2[15] = 0x5D ^ 0x53;
        SquireQuester.var2[16] = 0x89 ^ 0x86;
    }

    private static boolean var4(int n2) {
        return n2 == 0;
    }

    private static boolean var5(int n2, int n3) {
        return n2 < n3;
    }

    private static String var6(String var7, String var8) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var10 = var8.toCharArray();
        int var11 = var2[1];
        char[] var12 = var7.toCharArray();
        int var13 = var12.length;
        int var14 = var2[1];
        while (SquireQuester.var5(var14, var13)) {
            char var15 = var12[var14];
            var9.append((char)(var15 ^ var10[var11 % var10.length]));
            0;
            ++var11;
            ++var14;
            0;
            if (-2 < 0) continue;
            return null;
        }
        return String.valueOf(var9);
    }

    protected void onStop() {
        this.a.remove((Overlay)this.b);
        0;
    }

    protected void onStart() {
        this.a.add((Overlay)this.b);
        0;
        this.a((String)null);
    }

    @Subscribe
    public void a(ConfigButtonClicked configButtonClicked) {
        if (SquireQuester.var4(configButtonClicked.getGroup().equals(var1[var2[1]]) ? 1 : 0)) {
            return;
        }
        String string = configButtonClicked.getKey();
        String string2 = string.replace(var1[var2[2]], var1[var2[3]]);
        String string3 = Equipment.getAll().stream().map(item -> item.getId() + ",").collect(Collectors.joining());
        this.d.setConfiguration(configButtonClicked.getGroup(), string2, string3);
    }

    private static void var16() {
        var1 = new String[var2[5]];
        SquireQuester.var1[SquireQuester.var2[1]] = "squirequester";
        SquireQuester.var1[SquireQuester.var2[2]] = ".copy";
        SquireQuester.var1[SquireQuester.var2[3]] = SquireQuester.var17("jsjexspTX4w=", "oZKkW");
        SquireQuester.var1[SquireQuester.var2[4]] = "grain slides down the chute.";
    }

    private static boolean var18(int n2) {
        return n2 != 0;
    }

    public void a(boolean bl) {
        this.e = bl;
    }

        catch (Exception var24) {
            var24.printStackTrace();
            return null;
        }
    }

    public boolean a() {
        return this.e;
    }

    @Subscribe
    public void a(MenuActionProcessed menuActionProcessed) {
        System.out.println(menuActionProcessed);
    }

    @Provides
    SquireQuesterConfig a(ConfigManager configManager) {
        return (SquireQuesterConfig)configManager.getConfig(SquireQuesterConfig.class);
    }

        catch (Exception var29) {
            var29.printStackTrace();
            return null;
        }
    }

    @Subscribe
    public void a(ChatMessage chatMessage) {
        String string = chatMessage.getMessage();
        if (SquireQuester.var18(string.contains(var1[var2[4]]) ? 1 : 0)) {
            this.e = var2[2];
        }
    }

    static {
        SquireQuester.var3();
        SquireQuester.var16();
    }

    public void a(String string) {
        this.f = string;
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[var2[0]];
        classArray[SquireQuester.var2[1]] = CompletingTutorialIslandTask.class;
        classArray[SquireQuester.var2[2]] = CompletingCooksAssistantTask.class;
        classArray[SquireQuester.var2[3]] = CompletingRestlessGhostTask.class;
        classArray[SquireQuester.var2[4]] = CompletingRestlessGhostTask.class;
        classArray[SquireQuester.var2[5]] = UpgradingToMembersTask.class;
        classArray[SquireQuester.var2[6]] = CompletingSheepShearerTask.class;
        classArray[SquireQuester.var2[7]] = CompletingMisthalinMysteryTask.class;
        classArray[SquireQuester.var2[8]] = CompletingPrinceAliRescueTask.class;
        classArray[SquireQuester.var2[9]] = CompletingXMarksTheSpotTask.class;
        classArray[SquireQuester.var2[10]] = CompletingPiratesTreasureTask.class;
        classArray[SquireQuester.var2[11]] = CompletingRomeoAndJulietTask.class;
        classArray[SquireQuester.var2[12]] = CompletingImpCatcherTask.class;
        classArray[SquireQuester.var2[13]] = CompletingWitchsPotionTask.class;
        classArray[SquireQuester.var2[14]] = CompletingClientOfKourendTask.class;
        classArray[SquireQuester.var2[15]] = CompletingDwarfCannonTask.class;
        classArray[SquireQuester.var2[16]] = CompletingNaturalHistoryQuizTask.class;
        return classArray;
    }

    public String b() {
        return this.f;
    }
}

