/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.ConfigButtonClicked
 *  net.runelite.api.events.GameTick
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.EventBus
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 */
package gg.squire.mixology;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.mixology.SquireMixologyConfig;
import gg.squire.mixology.overlay.MixologyInfoBox;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.ConfigButtonClicked;
import net.runelite.api.events.GameTick;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import gg.squire.mixology.MixologyManager;
import gg.squire.mixology.BankForStaminasTask;
import gg.squire.mixology.DepositHopperTask;
import gg.squire.mixology.AgitatorTask;
import gg.squire.mixology.HandleAlembicTask;
import gg.squire.mixology.RetortTask;
import gg.squire.mixology.MakePasteTask;
import gg.squire.mixology.MixingVesselTask;
import gg.squire.mixology.OperateLeversTask;
import gg.squire.mixology.TalkToSupervisorTask;
import gg.squire.mixology.TurningInPotionTask;

@PluginDescriptor(name="Squire Mixology", enabledByDefault=false)
public class SquireMixology
extends SquirePlugin {
    public static  int w;
    @Inject
    private  g e;
    public static  int r;
    public static  String n;
    public static  String m;
    public static  String g;
    public static  int i;
    public static  long l;
    
    public static  int h;
    @Inject
    private  SquireMixologyConfig c;
    public static  int x;
    public static  List<String> y;
    public static  int t;
    @Inject
    private  OverlayManager a;
    @Inject
    private  MixologyInfoBox d;
    public static  List<Integer> z;
    public static  int u;
    public static  int s;
    
    public static  int v;
    public static  String f;
    public static  String o;
    public static  boolean A;
    public static  String q;
    public static  boolean j;
    @Inject
    private  EventBus b;
    public static  String p;
    public static  boolean k;

    @Provides
    SquireMixologyConfig a(ConfigManager configManager) {
        return (SquireMixologyConfig)configManager.getConfig(SquireMixologyConfig.class);
    }

    private static boolean lIIlIllIIlIllll(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var1);
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ConfigButtonClicked configButtonClicked) {
        void var2;
        if (SquireMixology.lIIlIllIIlIllIl(configButtonClicked.getGroup().equals(lIIIIIIIIlIIl[lIIIIIIIIlIlI[6]]) ? 1 : 0)) {
            return;
        }
        if (SquireMixology.lIIlIllIIlIlllI(var2.getKey().equals(lIIIIIIIIlIIl[lIIIIIIIIlIlI[7]]) ? 1 : 0)) {
            boolean bl;
            SquireMixology var3;
            if (SquireMixology.lIIlIllIIlIllIl(var3.isPaused() ? 1 : 0)) {
                bl = lIIIIIIIIlIlI[2];

                if (-1 > 3) {
                    return;
                }
            } else {
                bl = lIIIIIIIIlIlI[1];
            }
            var3.setPaused(bl);
        }
    }

    private static boolean lIIlIllIIlIlllI(int n2) {
        return n2 != 0;
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lIIIIIIIIlIlI[0]];
        classArray[SquireMixology.lIIIIIIIIlIlI[1]] = DepositHopperTask.class;
        classArray[SquireMixology.lIIIIIIIIlIlI[2]] = MakePasteTask.class;
        classArray[SquireMixology.lIIIIIIIIlIlI[3]] = TalkToSupervisorTask.class;
        classArray[SquireMixology.lIIIIIIIIlIlI[4]] = OperateLeversTask.class;
        classArray[SquireMixology.lIIIIIIIIlIlI[5]] = MixingVesselTask.class;
        classArray[SquireMixology.lIIIIIIIIlIlI[6]] = HandleAlembicTask.class;
        classArray[SquireMixology.lIIIIIIIIlIlI[7]] = RetortTask.class;
        classArray[SquireMixology.lIIIIIIIIlIlI[8]] = AgitatorTask.class;
        classArray[SquireMixology.lIIIIIIIIlIlI[9]] = TurningInPotionTask.class;
        classArray[SquireMixology.lIIIIIIIIlIlI[10]] = BankForStaminasTask.class;
        return classArray;
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
    }

    private static boolean lIIlIllIIlIllIl(int n2) {
        return n2 == 0;
    }

    private static void lIIlIllIIlIlIll() {
        lIIIIIIIIlIIl = new String[lIIIIIIIIlIlI[20]];
        SquireMixology.lIIIIIIIIlIIl[SquireMixology.lIIIIIIIIlIlI[1]] = "Plugin started";
        SquireMixology.lIIIIIIIIlIIl[SquireMixology.lIIIIIIIIlIlI[2]] = "Empty";
        SquireMixology.lIIIIIIIIlIIl[SquireMixology.lIIIIIIIIlIlI[3]] = "Empty";
        SquireMixology.lIIIIIIIIlIIl[SquireMixology.lIIIIIIIIlIlI[4]] = "Empty";
        SquireMixology.lIIIIIIIIlIIl[SquireMixology.lIIIIIIIIlIlI[5]] = "Empty";
        SquireMixology.lIIIIIIIIlIIl[SquireMixology.lIIIIIIIIlIlI[6]] = "squiremixology";
        SquireMixology.lIIIIIIIIlIIl[SquireMixology.lIIIIIIIIlIlI[7]] = "pause";
        SquireMixology.lIIIIIIIIlIIl[SquireMixology.lIIIIIIIIlIlI[8]] = "You are rewarded";
        SquireMixology.lIIIIIIIIlIIl[SquireMixology.lIIIIIIIIlIlI[9]] = "Reset potion orders";
        SquireMixology.lIIIIIIIIlIIl[SquireMixology.lIIIIIIIIlIlI[10]] = "Empty";
        SquireMixology.lIIIIIIIIlIIl[SquireMixology.lIIIIIIIIlIlI[0]] = "Empty";
        SquireMixology.lIIIIIIIIlIIl[SquireMixology.lIIIIIIIIlIlI[12]] = "Empty";
        SquireMixology.lIIIIIIIIlIIl[SquireMixology.lIIIIIIIIlIlI[13]] = "Empty";
        SquireMixology.lIIIIIIIIlIIl[SquireMixology.lIIIIIIIIlIlI[14]] = "1.00";
        SquireMixology.lIIIIIIIIlIIl[SquireMixology.lIIIIIIIIlIlI[15]] = "Empty";
        SquireMixology.lIIIIIIIIlIIl[SquireMixology.lIIIIIIIIlIlI[16]] = "Empty";
        SquireMixology.lIIIIIIIIlIIl[SquireMixology.lIIIIIIIIlIlI[17]] = "Empty";
        SquireMixology.lIIIIIIIIlIIl[SquireMixology.lIIIIIIIIlIlI[18]] = "Empty";
        SquireMixology.lIIIIIIIIlIIl[SquireMixology.lIIIIIIIIlIlI[19]] = "Aga";
    }

    protected void onStop() {
        this.a.remove((Overlay)this.e);

        this.a.remove((Overlay)this.d);

    }

    @Subscribe
    public void a(ChatMessage chatMessage) {
        String string = chatMessage.getMessage();
        if (SquireMixology.lIIlIllIIlIlllI(string.contains(lIIIIIIIIlIIl[lIIIIIIIIlIlI[8]]) ? 1 : 0)) {
            System.out.println(lIIIIIIIIlIIl[lIIIIIIIIlIlI[9]]);
            m = lIIIIIIIIlIIl[lIIIIIIIIlIlI[10]];
            o = lIIIIIIIIlIIl[lIIIIIIIIlIlI[0]];
            n = lIIIIIIIIlIIl[lIIIIIIIIlIlI[12]];
            p = lIIIIIIIIlIIl[lIIIIIIIIlIlI[13]];
            r = lIIIIIIIIlIlI[11];
            A = lIIIIIIIIlIlI[1];
            k = lIIIIIIIIlIlI[1];
            u = lIIIIIIIIlIlI[2];
            v = lIIIIIIIIlIlI[2];
            w = lIIIIIIIIlIlI[2];
            s = lIIIIIIIIlIlI[11];
            t = lIIIIIIIIlIlI[11];
            x = lIIIIIIIIlIlI[11];
            Integer[] integerArray = new Integer[lIIIIIIIIlIlI[4]];
            integerArray[SquireMixology.lIIIIIIIIlIlI[1]] = lIIIIIIIIlIlI[11];
            integerArray[SquireMixology.lIIIIIIIIlIlI[2]] = lIIIIIIIIlIlI[11];
            integerArray[SquireMixology.lIIIIIIIIlIlI[3]] = lIIIIIIIIlIlI[11];
            z = new ArrayList<Integer>(Arrays.asList(integerArray));
            String[] stringArray = new String[lIIIIIIIIlIlI[4]];
            stringArray[SquireMixology.lIIIIIIIIlIlI[1]] = null;
            stringArray[SquireMixology.lIIIIIIIIlIlI[2]] = null;
            stringArray[SquireMixology.lIIIIIIIIlIlI[3]] = null;
            y = new ArrayList<String>(Arrays.asList(stringArray));
        }
    }

    static {
        SquireMixology.lIIlIllIIlIllII();
        SquireMixology.lIIlIllIIlIlIll();
        f = lIIIIIIIIlIIl[lIIIIIIIIlIlI[14]];
        l = System.currentTimeMillis();
        m = lIIIIIIIIlIIl[lIIIIIIIIlIlI[15]];
        n = lIIIIIIIIlIIl[lIIIIIIIIlIlI[16]];
        o = lIIIIIIIIlIIl[lIIIIIIIIlIlI[17]];
        p = lIIIIIIIIlIIl[lIIIIIIIIlIlI[18]];
        q = lIIIIIIIIlIIl[lIIIIIIIIlIlI[19]];
        r = lIIIIIIIIlIlI[11];
        s = lIIIIIIIIlIlI[11];
        t = lIIIIIIIIlIlI[11];
        u = lIIIIIIIIlIlI[2];
        v = lIIIIIIIIlIlI[2];
        w = lIIIIIIIIlIlI[2];
        x = lIIIIIIIIlIlI[11];
        String[] stringArray = new String[lIIIIIIIIlIlI[4]];
        stringArray[SquireMixology.lIIIIIIIIlIlI[1]] = null;
        stringArray[SquireMixology.lIIIIIIIIlIlI[2]] = null;
        stringArray[SquireMixology.lIIIIIIIIlIlI[3]] = null;
        y = new ArrayList<String>(Arrays.asList(stringArray));
        Integer[] integerArray = new Integer[lIIIIIIIIlIlI[4]];
        integerArray[SquireMixology.lIIIIIIIIlIlI[1]] = lIIIIIIIIlIlI[11];
        integerArray[SquireMixology.lIIIIIIIIlIlI[2]] = lIIIIIIIIlIlI[11];
        integerArray[SquireMixology.lIIIIIIIIlIlI[3]] = lIIIIIIIIlIlI[11];
        z = new ArrayList<Integer>(Arrays.asList(integerArray));
    }

    protected void onStart() {
        this.a.add((Overlay)this.e);

        this.a.add((Overlay)this.d);

        System.out.println(lIIIIIIIIlIIl[lIIIIIIIIlIlI[1]]);
        m = lIIIIIIIIlIIl[lIIIIIIIIlIlI[2]];
        r = lIIIIIIIIlIlI[11];
        A = lIIIIIIIIlIlI[1];
        k = lIIIIIIIIlIlI[1];
        u = lIIIIIIIIlIlI[2];
        v = lIIIIIIIIlIlI[2];
        w = lIIIIIIIIlIlI[2];
        o = lIIIIIIIIlIIl[lIIIIIIIIlIlI[3]];
        n = lIIIIIIIIlIIl[lIIIIIIIIlIlI[4]];
        p = lIIIIIIIIlIIl[lIIIIIIIIlIlI[5]];
        s = lIIIIIIIIlIlI[11];
        t = lIIIIIIIIlIlI[11];
        x = lIIIIIIIIlIlI[11];
        Integer[] integerArray = new Integer[lIIIIIIIIlIlI[4]];
        integerArray[SquireMixology.lIIIIIIIIlIlI[1]] = lIIIIIIIIlIlI[11];
        integerArray[SquireMixology.lIIIIIIIIlIlI[2]] = lIIIIIIIIlIlI[11];
        integerArray[SquireMixology.lIIIIIIIIlIlI[3]] = lIIIIIIIIlIlI[11];
        z = new ArrayList<Integer>(Arrays.asList(integerArray));
        String[] stringArray = new String[lIIIIIIIIlIlI[4]];
        stringArray[SquireMixology.lIIIIIIIIlIlI[1]] = null;
        stringArray[SquireMixology.lIIIIIIIIlIlI[2]] = null;
        stringArray[SquireMixology.lIIIIIIIIlIlI[3]] = null;
        y = new ArrayList<String>(Arrays.asList(stringArray));
        j = lIIIIIIIIlIlI[1];
        r = lIIIIIIIIlIlI[11];
        l = System.currentTimeMillis();
        h = lIIIIIIIIlIlI[1];
        MixologyInfoBox.D = lIIIIIIIIlIlI[1];
        MixologyInfoBox.F = lIIIIIIIIlIlI[1];
        MixologyInfoBox.E = lIIIIIIIIlIlI[1];
    }

}

