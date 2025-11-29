/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.GameState
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.ClientTick
 *  net.runelite.api.events.GraphicChanged
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.game.WorldService
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.events.LoginStateChanged
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.plugins.LoopedPlugin
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.client.Static
 *  org.pf4j.Extension
 */
package net.unethicalite.plugins.logout;

import c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.b_Unknown;
import c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.c_Unknown;
import c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.k_Unknown;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ThreadLocalRandom;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.ClientTick;
import net.runelite.api.events.GraphicChanged;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.game.WorldService;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.events.LoginStateChanged;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.plugins.LoopedPlugin;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.client.Static;
import net.unethicalite.plugins.logout.ClueConfig;
import org.pf4j.Extension;

@Extension
@PluginDescriptor(name="Squire Easy Clues", description="Completes easy clue scrolls", enabledByDefault=false)
@SquireUtil
public class Clues
extends LoopedPlugin {
    public static /* synthetic */ boolean d;
    static /* synthetic */ String p;
    public static /* synthetic */ boolean f;
    public static /* synthetic */ int k;
    public static /* synthetic */ boolean h;
    /* synthetic */ boolean s;
    public static /* synthetic */ int j;
    public static /* synthetic */ String c;
    /* synthetic */ int v;
    public static final /* synthetic */ ThreadLocalRandom b;
    public static /* synthetic */ String l;
    @Inject
    private /* synthetic */ ConfigManager y;
    /* synthetic */ boolean u;
    public static /* synthetic */ boolean e;
    @Inject
    private /* synthetic */ OverlayManager A;
    public static /* synthetic */ int i;
    @Inject
    private /* synthetic */ b x;
    @Inject
    private static /* synthetic */ WorldService r;
    public static /* synthetic */ int n;
    @Inject
    private /* synthetic */ ClueConfig z;
    @Inject
    private /* synthetic */ Client w;
    public static /* synthetic */ long m;
    static /* synthetic */ String o;
    private static /* synthetic */ String[] lll;
    static /* synthetic */ String q;
    /* synthetic */ boolean t;
    public static /* synthetic */ boolean g;
    private static /* synthetic */ int[] lIII;

    public void shutDown() {
        Prayers.disableAll();
        d = lIII[2];
        System.out.print(lll[lIII[4]]);
        this.A.remove((Overlay)this.x);
        0;
        super.stop();
    }

    private static String lIIIlI(String llllllIIllIlIll, String llllllIIllIlIII) {
        try {
            SecretKeySpec llllllIIllIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllIIllIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllIIllIllIl = Cipher.getInstance("Blowfish");
            llllllIIllIllIl.init(lIII[3], llllllIIllIlllI);
            return new String(llllllIIllIllIl.doFinal(Base64.getDecoder().decode(llllllIIllIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllIIllIllII) {
            llllllIIllIllII.printStackTrace();
            return null;
        }
    }

    private static void lIIlII() {
        lll = new String[lIII[12]];
        Clues.lll[Clues.lIII[0]] = Clues."We're opening caskets!";
        Clues.lll[Clues.lIII[2]] = Clues."We're stacking caskets!!";
        Clues.lll[Clues.lIII[3]] = Clues."Ironman mode enabled";
        Clues.lll[Clues.lIII[4]] = Clues."\n[Plugin] Plugin shut down\n";
        Clues.lll[Clues.lIII[5]] = Clues."worth around";
        Clues.lll[Clues.lIII[7]] = Clues."[^0-9]";
        Clues.lll[Clues.lIII[8]] = Clues."";
        Clues.lll[Clues.lIII[11]] = Clues."https://discord.com/api/webhooks/1210042190848598140/9FqG04iZHgo1ibUKfqxXpsKamb-oVD1MsQRr5i1wtZlDYzdQwqfIlQP94lscKlbINngT";
    }

    public Clues() {
        this.v = lIII[0];
    }

    static {
        Clues.lIIlIl();
        Clues.lIIlII();
        b = ThreadLocalRandom.current();
        d = lIII[0];
        j = lIII[0];
        k = lIII[10];
        l = Static.getClient().getDiscordId();
        m = System.currentTimeMillis();
        o = lll[lIII[11]];
    }

    @Subscribe
    public void a(GraphicChanged graphicChanged) {
    }

    private static String lIIIll(String llllllIIlIlIllI, String llllllIIlIllIlI) {
        llllllIIlIlIllI = new String(Base64.getDecoder().decode(llllllIIlIlIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllIIlIllIIl = new StringBuilder();
        char[] llllllIIlIllIII = llllllIIlIllIlI.toCharArray();
        int llllllIIlIlIlll = lIII[0];
        char[] llllllIIlIlIIIl = llllllIIlIlIllI.toCharArray();
        int llllllIIlIlIIII = llllllIIlIlIIIl.length;
        int llllllIIlIIllll = lIII[0];
        while (Clues.lIlIll(llllllIIlIIllll, llllllIIlIlIIII)) {
            char llllllIIlIlllII = llllllIIlIlIIIl[llllllIIlIIllll];
            llllllIIlIllIIl.append((char)(llllllIIlIlllII ^ llllllIIlIllIII[llllllIIlIlIlll % llllllIIlIllIII.length]));
            0;
            ++llllllIIlIlIlll;
            ++llllllIIlIIllll;
            0;
            if (1 >= 0) continue;
            return null;
        }
        return String.valueOf(llllllIIlIllIIl);
    }

    protected int loop() {
        if (Clues.lIIllI(d ? 1 : 0) && Clues.lIIlll(Game.getState(), GameState.LOGGED_IN)) {
            try {
                if (Clues.lIlIII(q)) {
                    q = Players.getLocal().getName();
                }
                c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.c_Unknown.p();
                0;
            }
            catch (Exception llllllIlIIIlIlI) {
                llllllIlIIIlIlI.printStackTrace();
            }
            if ((0x89 ^ 0x8D) == -1) {
                return (3 ^ 9) & ~(0xAB ^ 0xA1);
            }
        }
        return lIII[1];
    }

    public void startUp() {
        SquirePlugin.setGlobalMouseRecordings();
        0;
        i = lIII[0];
        n = lIII[0];
        m = System.currentTimeMillis();
        super.startUp();
        d = lIII[0];
        this.A.add((Overlay)this.x);
        0;
        f = this.z.openCaskets();
        e = this.z.isIronman();
        k = this.z.foodID();
        h = this.z.useStamina();
        if (Clues.lIlIIl(f ? 1 : 0)) {
            System.out.println(lll[lIII[0]]);
        }
        if (Clues.lIIllI(f ? 1 : 0)) {
            System.out.println(lll[lIII[2]]);
        }
        if (Clues.lIlIIl(e ? 1 : 0)) {
            System.out.println(lll[lIII[3]]);
        }
        System.out.println("We're using food ID: " + k);
    }

    private static void lIIlIl() {
        lIII = new int[13];
        Clues.lIII[0] = (117 + 99 - 88 + 20 ^ 19 + 59 - -27 + 24) & (0x13 ^ 0x4B ^ (0xC4 ^ 0x89) ^ -1);
        Clues.lIII[1] = 49 + 169 - 38 + 48 ^ 40 + 41 - 66 + 113;
        Clues.lIII[2] = 1;
        Clues.lIII[3] = 2;
        Clues.lIII[4] = 3;
        Clues.lIII[5] = 0xBC ^ 0xB8;
        Clues.lIII[6] = 0x63 ^ 0x43;
        Clues.lIII[7] = 0x74 ^ 0x38 ^ (0x6F ^ 0x26);
        Clues.lIII[8] = 0x4B ^ 0x4D;
        Clues.lIII[9] = 0xF6 ^ 0x8B ^ (0xFA ^ 0x89);
        Clues.lIII[10] = -(0xFFFFDBA5 & 0x7CDF) & (0xFFFFFDFF & 0x5BFF);
        Clues.lIII[11] = 0xA8 ^ 0xAF;
        Clues.lIII[12] = 0xBB ^ 0xB3;
    }

    private static boolean lIIlll(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIlIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIIllI(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIII(Object object) {
        return object == null;
    }

    private static boolean lIlIlI(int n2, int n3) {
        return n2 != n3;
    }

    @Subscribe
    private void a(ClientTick clientTick) {
        if (Clues.lIlIIl(Dialog.isEnterInputOpen() ? 1 : 0)) {
            Dialog.close();
        }
    }

    private static boolean lIlIll(int n2, int n3) {
        return n2 < n3;
    }

    @Provides
    public ClueConfig a(ConfigManager configManager) {
        return (ClueConfig)configManager.getConfig(ClueConfig.class);
    }

    private static String lIIIIl(String llllllIIlllIllI, String llllllIIlllIlIl) {
        try {
            SecretKeySpec llllllIIllllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllIIlllIlIl.getBytes(StandardCharsets.UTF_8)), lIII[12]), "DES");
            Cipher llllllIIllllIlI = Cipher.getInstance("DES");
            llllllIIllllIlI.init(lIII[3], llllllIIllllIll);
            return new String(llllllIIllllIlI.doFinal(Base64.getDecoder().decode(llllllIIlllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllIIllllIIl) {
            llllllIIllllIIl.printStackTrace();
            return null;
        }
    }

    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (Clues.lIlIIl(chatMessage.getMessage().contains(lll[lIII[5]]) ? 1 : 0)) {
            String string = chatMessage.getMessage().substring(lIII[6]);
            string = string.replaceAll(lll[lIII[7]], lll[lIII[8]]);
            System.out.println("Clue value " + string);
            n += Integer.parseInt(string);
        }
    }

    @Subscribe
    private void a(LoginStateChanged loginStateChanged) {
        int n2 = loginStateChanged.getIndex();
        if (Clues.lIlIlI(n2, lIII[9])) {
            return;
        }
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.k_Unknown.a(o, p + " rsn: " + q + " account has been banned? closing client - clues");
    }
}

