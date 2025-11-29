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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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

    private static boolean lIlIIIIllIIlIII(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIIIIllIIlIlI(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var1);
    }

    protected void onStop() {
        this.a.remove((Overlay)this.b);

    }

    protected void onStart() {
        this.a.add((Overlay)this.b);

        this.a((String)null);
    }

    @Subscribe
    public void a(ConfigButtonClicked configButtonClicked) {
        if (SquireQuester.lIlIIIIllIIlIII(configButtonClicked.getGroup().equals(lIIIllIIIIlIl[lIIIllIIIIllI[1]]) ? 1 : 0)) {
            return;
        }
        String string = configButtonClicked.getKey();
        String string2 = string.replace(lIIIllIIIIlIl[lIIIllIIIIllI[2]], lIIIllIIIIlIl[lIIIllIIIIllI[3]]);
        String string3 = Equipment.getAll().stream().map(item -> item.getId() + ",").collect(Collectors.joining());
        this.d.setConfiguration(configButtonClicked.getGroup(), string2, string3);
    }

    private static void lIlIIIIllIIIllI() {
        lIIIllIIIIlIl = new String[lIIIllIIIIllI[5]];
        SquireQuester.lIIIllIIIIlIl[SquireQuester.lIIIllIIIIllI[1]] = "squirequester";
        SquireQuester.lIIIllIIIIlIl[SquireQuester.lIIIllIIIIllI[2]] = ".copy";
        SquireQuester.lIIIllIIIIlIl[SquireQuester.lIIIllIIIIllI[3]] = SquireQuester.lIlIIIIllIIIlIl("jsjexspTX4w=", "oZKkW");
        SquireQuester.lIIIllIIIIlIl[SquireQuester.lIIIllIIIIllI[4]] = "grain slides down the chute.";
    }

    private static boolean lIlIIIIllIIlIIl(int n2) {
        return n2 != 0;
    }

    public void a(boolean bl) {
        this.e = bl;
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

    @Subscribe
    public void a(ChatMessage chatMessage) {
        String string = chatMessage.getMessage();
        if (SquireQuester.lIlIIIIllIIlIIl(string.contains(lIIIllIIIIlIl[lIIIllIIIIllI[4]]) ? 1 : 0)) {
            this.e = lIIIllIIIIllI[2];
        }
    }

    static {
        SquireQuester.lIlIIIIllIIIlll();
        SquireQuester.lIlIIIIllIIIllI();
    }

    public void a(String string) {
        this.f = string;
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lIIIllIIIIllI[0]];
        classArray[SquireQuester.lIIIllIIIIllI[1]] = CompletingTutorialIslandTask.class;
        classArray[SquireQuester.lIIIllIIIIllI[2]] = CompletingCooksAssistantTask.class;
        classArray[SquireQuester.lIIIllIIIIllI[3]] = CompletingRestlessGhostTask.class;
        classArray[SquireQuester.lIIIllIIIIllI[4]] = CompletingRestlessGhostTask.class;
        classArray[SquireQuester.lIIIllIIIIllI[5]] = UpgradingToMembersTask.class;
        classArray[SquireQuester.lIIIllIIIIllI[6]] = CompletingSheepShearerTask.class;
        classArray[SquireQuester.lIIIllIIIIllI[7]] = CompletingMisthalinMysteryTask.class;
        classArray[SquireQuester.lIIIllIIIIllI[8]] = CompletingPrinceAliRescueTask.class;
        classArray[SquireQuester.lIIIllIIIIllI[9]] = CompletingXMarksTheSpotTask.class;
        classArray[SquireQuester.lIIIllIIIIllI[10]] = CompletingPiratesTreasureTask.class;
        classArray[SquireQuester.lIIIllIIIIllI[11]] = CompletingRomeoAndJulietTask.class;
        classArray[SquireQuester.lIIIllIIIIllI[12]] = CompletingImpCatcherTask.class;
        classArray[SquireQuester.lIIIllIIIIllI[13]] = CompletingWitchsPotionTask.class;
        classArray[SquireQuester.lIIIllIIIIllI[14]] = CompletingClientOfKourendTask.class;
        classArray[SquireQuester.lIIIllIIIIllI[15]] = CompletingDwarfCannonTask.class;
        classArray[SquireQuester.lIIIllIIIIllI[16]] = CompletingNaturalHistoryQuizTask.class;
        return classArray;
    }

    public String b() {
        return this.f;
    }
}

