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
import s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.I;
import s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.J;

@PluginDescriptor(name="Squire Tutorial Island", enabledByDefault=false)
public class SquireTutorialIsland
extends SquirePlugin {
    private static /* synthetic */ int[] lIlIIIlIlIlll;
    private /* synthetic */ boolean e;
    @Inject
    private /* synthetic */ ConfigManager d;
    private /* synthetic */ String f;
    @Inject
    private /* synthetic */ OverlayManager a;
    @Inject
    private /* synthetic */ EventBus c;
    private /* synthetic */ String g;
    private static /* synthetic */ String[] lIlIIIlIlIllI;
    @Inject
    private /* synthetic */ QuesterInfoBox b;

    public String c() {
        return this.g;
    }

    private static boolean lIlllIIIIIIlIlI(int n2) {
        return n2 != 0;
    }

    public void b(String string) {
        this.g = string;
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lIlIIIlIlIlll[0]];
        classArray[SquireTutorialIsland.lIlIIIlIlIlll[1]] = J.class;
        classArray[SquireTutorialIsland.lIlIIIlIlIlll[2]] = I.class;
        return classArray;
    }

    @Provides
    SquireQuesterConfig a(ConfigManager configManager) {
        return (SquireQuesterConfig)configManager.getConfig(SquireQuesterConfig.class);
    }

    @Subscribe
    public void a(ConfigButtonClicked configButtonClicked) {
        if (SquireTutorialIsland.lIlllIIIIIIlIIl(configButtonClicked.getGroup().equals(lIlIIIlIlIllI[lIlIIIlIlIlll[1]]) ? 1 : 0)) {
            return;
        }
        String string = configButtonClicked.getKey();
        String string2 = string.replace(lIlIIIlIlIllI[lIlIIIlIlIlll[2]], lIlIIIlIlIllI[lIlIIIlIlIlll[0]]);
        String string3 = Equipment.getAll().stream().map(item -> item.getId() + ",").collect(Collectors.joining());
        this.d.setConfiguration(configButtonClicked.getGroup(), string2, string3);
    }

    protected void onStop() {
        this.a.remove((Overlay)this.b);
        0;
    }

    private static void lIlllIIIIIIlIII() {
        lIlIIIlIlIlll = new int[6];
        SquireTutorialIsland.lIlIIIlIlIlll[0] = 2;
        SquireTutorialIsland.lIlIIIlIlIlll[1] = (93 + 85 - 58 + 131 ^ 39 + 125 - 27 + 55) & (54 + 126 - 82 + 37 ^ 8 + 78 - -60 + 42 ^ -1);
        SquireTutorialIsland.lIlIIIlIlIlll[2] = 1;
        SquireTutorialIsland.lIlIIIlIlIlll[3] = 3;
        SquireTutorialIsland.lIlIIIlIlIlll[4] = 0x86 ^ 0x82;
        SquireTutorialIsland.lIlIIIlIlIlll[5] = 0x2D ^ 0x25;
    }

    protected void onStart() {
        this.g = null;
        this.a.add((Overlay)this.b);
        0;
        this.a((String)null);
    }

    public boolean a() {
        return this.e;
    }

    private static String lIlllIIIIIIIlIl(String llllllllllllllIlllIIIlIlIIlllIIl, String llllllllllllllIlllIIIlIlIIlllIII) {
        try {
            SecretKeySpec llllllllllllllIlllIIIlIlIIllllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIIlIlIIlllIII.getBytes(StandardCharsets.UTF_8)), lIlIIIlIlIlll[5]), "DES");
            Cipher llllllllllllllIlllIIIlIlIIlllIll = Cipher.getInstance("DES");
            llllllllllllllIlllIIIlIlIIlllIll.init(lIlIIIlIlIlll[0], llllllllllllllIlllIIIlIlIIllllII);
            return new String(llllllllllllllIlllIIIlIlIIlllIll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIIlIlIIlllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIIIlIlIIlllIlI) {
            llllllllllllllIlllIIIlIlIIlllIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlllIIIIIIlIIl(int n2) {
        return n2 == 0;
    }

    @Subscribe
    public void a(ChatMessage chatMessage) {
        String string = chatMessage.getMessage();
        if (SquireTutorialIsland.lIlllIIIIIIlIlI(string.contains(lIlIIIlIlIllI[lIlIIIlIlIlll[3]]) ? 1 : 0)) {
            this.e = lIlIIIlIlIlll[2];
        }
    }

    @Subscribe
    public void a(MenuActionProcessed menuActionProcessed) {
        System.out.println(menuActionProcessed);
    }

    private static String lIlllIIIIIIIllI(String llllllllllllllIlllIIIlIlIlIIIllI, String llllllllllllllIlllIIIlIlIlIIIlIl) {
        try {
            SecretKeySpec llllllllllllllIlllIIIlIlIlIIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIIlIlIlIIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIIIlIlIlIIlIII = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIIIlIlIlIIlIII.init(lIlIIIlIlIlll[0], llllllllllllllIlllIIIlIlIlIIlIIl);
            return new String(llllllllllllllIlllIIIlIlIlIIlIII.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIIlIlIlIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIIIlIlIlIIIlll) {
            llllllllllllllIlllIIIlIlIlIIIlll.printStackTrace();
            return null;
        }
    }

    static {
        SquireTutorialIsland.lIlllIIIIIIlIII();
        SquireTutorialIsland.lIlllIIIIIIIlll();
    }

    public void a(boolean bl) {
        this.e = bl;
    }

    public String b() {
        return this.f;
    }

    private static void lIlllIIIIIIIlll() {
        lIlIIIlIlIllI = new String[lIlIIIlIlIlll[4]];
        SquireTutorialIsland.lIlIIIlIlIllI[SquireTutorialIsland.lIlIIIlIlIlll[1]] = SquireTutorialIsland."squirequester";
        SquireTutorialIsland.lIlIIIlIlIllI[SquireTutorialIsland.lIlIIIlIlIlll[2]] = SquireTutorialIsland.".copy";
        SquireTutorialIsland.lIlIIIlIlIllI[SquireTutorialIsland.lIlIIIlIlIlll[0]] = SquireTutorialIsland."";
        SquireTutorialIsland.lIlIIIlIlIllI[SquireTutorialIsland.lIlIIIlIlIlll[3]] = SquireTutorialIsland."grain slides down the chute.";
    }

    public void a(String string) {
        this.f = string;
    }
}

