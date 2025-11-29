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
import java.util.ArrayList;
import java.util.List;
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

    private static boolean var3(int n2, int n3) {
        return n2 < n3;
    }

    private static void var4() {
        var1 = new int[21];
        SquireMixology.var1[0] = 0x60 ^ 0x6A;
        SquireMixology.var1[1] = (0x6D ^ 0x2D) & ~(0xF2 ^ 0xB2);
        SquireMixology.var1[2] = 1;
        SquireMixology.var1[3] = 2;
        SquireMixology.var1[4] = 3;
        SquireMixology.var1[5] = 0x9F ^ 0x9B;
        SquireMixology.var1[6] = 0x2B ^ 0x2E;
        SquireMixology.var1[7] = 0xA1 ^ 0x8F ^ (0x70 ^ 0x58);
        SquireMixology.var1[8] = 0x2A ^ 0x2D;
        SquireMixology.var1[9] = 0x75 ^ 0x3F ^ (0x7D ^ 0x3F);
        SquireMixology.var1[10] = 0x3D ^ 0x5D ^ (0xF7 ^ 0x9E);
        SquireMixology.var1[11] = -1;
        SquireMixology.var1[12] = 15 + 18 - 30 + 188 ^ 97 + 143 - 179 + 119;
        SquireMixology.var1[13] = 94 + 86 - 147 + 156 ^ 175 + 87 - 128 + 43;
        SquireMixology.var1[14] = 36 + 34 - -43 + 87 ^ 133 + 26 - 120 + 158;
        SquireMixology.var1[15] = 0x3D ^ 0x33;
        SquireMixology.var1[16] = 0xC0 ^ 0xC4 ^ (0x8D ^ 0x86);
        SquireMixology.var1[17] = 0x4D ^ 0x45 ^ (0x5F ^ 0x47);
        SquireMixology.var1[18] = 0x6A ^ 0x7B;
        SquireMixology.var1[19] = 0x50 ^ 0x42;
        SquireMixology.var1[20] = 0x62 ^ 0x6C ^ (0xD ^ 0x10);
    }

    private static String var5(String var6, String var7) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var9 = var7.toCharArray();
        int var10 = var1[1];
        char[] var11 = var6.toCharArray();
        int var12 = var11.length;
        int var13 = var1[1];
        while (SquireMixology.var3(var13, var12)) {
            char var14 = var11[var13];
            var8.append((char)(var14 ^ var9[var10 % var9.length]));
            0;
            ++var10;
            ++var13;
            0;
            if (-1 == -1) continue;
            return null;
        }
        return String.valueOf(var8);
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ConfigButtonClicked configButtonClicked) {
        void var15;
        if (SquireMixology.var16(configButtonClicked.getGroup().equals(var2[var1[6]]) ? 1 : 0)) {
            return;
        }
        if (SquireMixology.var17(var15.getKey().equals(var2[var1[7]]) ? 1 : 0)) {
            boolean bl;
            SquireMixology var18;
            if (SquireMixology.var16(var18.isPaused() ? 1 : 0)) {
                bl = var1[2];
                0;
                if (-1 > 3) {
                    return;
                }
            } else {
                bl = var1[1];
            }
            var18.setPaused(bl);
        }
    }

    private static boolean var17(int n2) {
        return n2 != 0;
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[var1[0]];
        classArray[SquireMixology.var1[1]] = DepositHopperTask.class;
        classArray[SquireMixology.var1[2]] = MakePasteTask.class;
        classArray[SquireMixology.var1[3]] = TalkToSupervisorTask.class;
        classArray[SquireMixology.var1[4]] = OperateLeversTask.class;
        classArray[SquireMixology.var1[5]] = MixingVesselTask.class;
        classArray[SquireMixology.var1[6]] = HandleAlembicTask.class;
        classArray[SquireMixology.var1[7]] = RetortTask.class;
        classArray[SquireMixology.var1[8]] = AgitatorTask.class;
        classArray[SquireMixology.var1[9]] = TurningInPotionTask.class;
        classArray[SquireMixology.var1[10]] = BankForStaminasTask.class;
        return classArray;
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
    }

    private static boolean var16(int n2) {
        return n2 == 0;
    }

    private static void var19() {
        var2 = new String[var1[20]];
        SquireMixology.var2[SquireMixology.var1[1]] = "Plugin started";
        SquireMixology.var2[SquireMixology.var1[2]] = "Empty";
        SquireMixology.var2[SquireMixology.var1[3]] = "Empty";
        SquireMixology.var2[SquireMixology.var1[4]] = "Empty";
        SquireMixology.var2[SquireMixology.var1[5]] = "Empty";
        SquireMixology.var2[SquireMixology.var1[6]] = "squiremixology";
        SquireMixology.var2[SquireMixology.var1[7]] = "pause";
        SquireMixology.var2[SquireMixology.var1[8]] = "You are rewarded";
        SquireMixology.var2[SquireMixology.var1[9]] = "Reset potion orders";
        SquireMixology.var2[SquireMixology.var1[10]] = "Empty";
        SquireMixology.var2[SquireMixology.var1[0]] = "Empty";
        SquireMixology.var2[SquireMixology.var1[12]] = "Empty";
        SquireMixology.var2[SquireMixology.var1[13]] = "Empty";
        SquireMixology.var2[SquireMixology.var1[14]] = "1.00";
        SquireMixology.var2[SquireMixology.var1[15]] = "Empty";
        SquireMixology.var2[SquireMixology.var1[16]] = "Empty";
        SquireMixology.var2[SquireMixology.var1[17]] = "Empty";
        SquireMixology.var2[SquireMixology.var1[18]] = "Empty";
        SquireMixology.var2[SquireMixology.var1[19]] = "Aga";
    }

    protected void onStop() {
        this.a.remove((Overlay)this.e);
        0;
        this.a.remove((Overlay)this.d);
        0;
    }

    @Subscribe
    public void a(ChatMessage chatMessage) {
        String string = chatMessage.getMessage();
        if (SquireMixology.var17(string.contains(var2[var1[8]]) ? 1 : 0)) {
            System.out.println(var2[var1[9]]);
            m = var2[var1[10]];
            o = var2[var1[0]];
            n = var2[var1[12]];
            p = var2[var1[13]];
            r = var1[11];
            A = var1[1];
            k = var1[1];
            u = var1[2];
            v = var1[2];
            w = var1[2];
            s = var1[11];
            t = var1[11];
            x = var1[11];
            Integer[] integerArray = new Integer[var1[4]];
            integerArray[SquireMixology.var1[1]] = var1[11];
            integerArray[SquireMixology.var1[2]] = var1[11];
            integerArray[SquireMixology.var1[3]] = var1[11];
            z = new ArrayList<Integer>(Arrays.asList(integerArray));
            String[] stringArray = new String[var1[4]];
            stringArray[SquireMixology.var1[1]] = null;
            stringArray[SquireMixology.var1[2]] = null;
            stringArray[SquireMixology.var1[3]] = null;
            y = new ArrayList<String>(Arrays.asList(stringArray));
        }
    }

    static {
        SquireMixology.var4();
        SquireMixology.var19();
        f = var2[var1[14]];
        l = System.currentTimeMillis();
        m = var2[var1[15]];
        n = var2[var1[16]];
        o = var2[var1[17]];
        p = var2[var1[18]];
        q = var2[var1[19]];
        r = var1[11];
        s = var1[11];
        t = var1[11];
        u = var1[2];
        v = var1[2];
        w = var1[2];
        x = var1[11];
        String[] stringArray = new String[var1[4]];
        stringArray[SquireMixology.var1[1]] = null;
        stringArray[SquireMixology.var1[2]] = null;
        stringArray[SquireMixology.var1[3]] = null;
        y = new ArrayList<String>(Arrays.asList(stringArray));
        Integer[] integerArray = new Integer[var1[4]];
        integerArray[SquireMixology.var1[1]] = var1[11];
        integerArray[SquireMixology.var1[2]] = var1[11];
        integerArray[SquireMixology.var1[3]] = var1[11];
        z = new ArrayList<Integer>(Arrays.asList(integerArray));
    }

    protected void onStart() {
        this.a.add((Overlay)this.e);
        0;
        this.a.add((Overlay)this.d);
        0;
        System.out.println(var2[var1[1]]);
        m = var2[var1[2]];
        r = var1[11];
        A = var1[1];
        k = var1[1];
        u = var1[2];
        v = var1[2];
        w = var1[2];
        o = var2[var1[3]];
        n = var2[var1[4]];
        p = var2[var1[5]];
        s = var1[11];
        t = var1[11];
        x = var1[11];
        Integer[] integerArray = new Integer[var1[4]];
        integerArray[SquireMixology.var1[1]] = var1[11];
        integerArray[SquireMixology.var1[2]] = var1[11];
        integerArray[SquireMixology.var1[3]] = var1[11];
        z = new ArrayList<Integer>(Arrays.asList(integerArray));
        String[] stringArray = new String[var1[4]];
        stringArray[SquireMixology.var1[1]] = null;
        stringArray[SquireMixology.var1[2]] = null;
        stringArray[SquireMixology.var1[3]] = null;
        y = new ArrayList<String>(Arrays.asList(stringArray));
        j = var1[1];
        r = var1[11];
        l = System.currentTimeMillis();
        h = var1[1];
        MixologyInfoBox.D = var1[1];
        MixologyInfoBox.F = var1[1];
        MixologyInfoBox.E = var1[1];
    }

        catch (Exception var25) {
            var25.printStackTrace();
            return null;
        }
    }

        catch (Exception var31) {
            var31.printStackTrace();
            return null;
        }
    }
}

