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
package gg.squire.7bb63fa7-229b-499f-b77f-e1768cbbcc1e.tasks;

import gg.squire.7bb63fa7-229b-499f-b77f-e1768cbbcc1e.tasks.7bb63fa7-229b-499f-b77f-e1768cbbcc1eManager;
import gg.squire.7bb63fa7-229b-499f-b77f-e1768cbbcc1e.tasks.CHelper;
import gg.squire.7bb63fa7-229b-499f-b77f-e1768cbbcc1e.tasks.KHelper;
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
    public static  boolean d;
    static  String p;
    public static  boolean f;
    public static  int k;
    public static  boolean h;
     boolean s;
    public static  int j;
    public static  String c;
     int v;
    public static final  ThreadLocalRandom b;
    public static  String l;
    @Inject
    private  ConfigManager y;
     boolean u;
    public static  boolean e;
    @Inject
    private  OverlayManager A;
    public static  int i;
    @Inject
    private  b x;
    @Inject
    private static  WorldService r;
    public static  int n;
    @Inject
    private  ClueConfig z;
    @Inject
    private  Client w;
    public static  long m;
    static  String o;
    
    static  String q;
     boolean t;
    public static  boolean g;

    public void shutDown() {
        Prayers.disableAll();
        d = lIII[2];
        System.out.print(lll[lIII[4]]);
        this.A.remove((Overlay)this.x);

        super.stop();
    }

    private static void lIIlII() {
        lll = new String[lIII[12]];
        Clues.lll[Clues.lIII[0]] = "We're opening caskets!";
        Clues.lll[Clues.lIII[2]] = "We're stacking caskets!!";
        Clues.lll[Clues.lIII[3]] = "Ironman mode enabled";
        Clues.lll[Clues.lIII[4]] = "\n[Plugin] Plugin shut down\n";
        Clues.lll[Clues.lIII[5]] = "worth around";
        Clues.lll[Clues.lIII[7]] = "[^0-9]";
        Clues.lll[Clues.lIII[8]] = Clues.lIIIll("", "XzJgL");
        Clues.lll[Clues.lIII[11]] = "https://discord.com/api/webhooks/1210042190848598140/9FqG04iZHgo1ibUKfqxXpsKamb-oVD1MsQRr5i1wtZlDYzdQwqfIlQP94lscKlbINngT";
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

        return String.valueOf(llllllIIlIllIIl);
    }

    protected int loop() {
        if (Clues.lIIllI(d ? 1 : 0) && Clues.lIIlll(Game.getState(), GameState.LOGGED_IN)) {
            try {
                if (Clues.lIlIII(q)) {
                    q = Players.getLocal().getName();
                }
                c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.c.p();

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

        i = lIII[0];
        n = lIII[0];
        m = System.currentTimeMillis();
        super.startUp();
        d = lIII[0];
        this.A.add((Overlay)this.x);

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
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.k.a(o, p + " rsn: " + q + " account has been banned? closing client - clues");
    }
}

