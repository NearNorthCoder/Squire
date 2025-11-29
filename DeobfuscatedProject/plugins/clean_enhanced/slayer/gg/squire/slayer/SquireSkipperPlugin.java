/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  javax.inject.Inject
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.util.Text
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 *  net.unethicalite.api.items.Equipment
 *  org.pf4j.Extension
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.slayer;

import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import gg.squire.slayer.SquireSkipperConfig;
import gg.squire.slayer.overlay.SkipperOverlay;
import java.time.Instant;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.inject.Inject;
import net.runelite.api.ChatMessageType;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.util.Text;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.items.Equipment;
import org.pf4j.Extension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import gg.squire.slayer.GameEnum;
import gg.squire.slayer.AttackingTask;
import gg.squire.slayer.BankingTask;
import gg.squire.slayer.CheckingForTask;
import gg.squire.slayer.DrinkingAntiPoisonTask;
import gg.squire.slayer.DrinkingStaminaTask;
import gg.squire.slayer.EatingTask;
import gg.squire.slayer.FixBossTaskThingTask;
import gg.squire.slayer.GettingHuntingTask;
import gg.squire.slayer.GettingNewTask;
import gg.squire.slayer.KillingBlowTask;
import gg.squire.slayer.RestoringFromPoolTask;
import gg.squire.slayer.TraversingToTuraelTask;

@Extension
@SquireUtil
@PluginDescriptor(name="Squire Turael Skipper", tags={"slayer", "task", "hunting"}, enabledByDefault=false)
public class SquireSkipperPlugin
extends SquirePlugin {
    private  boolean h;
    private  Instant f;
    private static final  Pattern b;
    private static final  Logger a;
    private  int j;
    private  boolean o;
    @Inject
    private  SkipperOverlay c;
    private  boolean m;
    @Inject
    private  SquireSkipperConfig d;
    
    private  int n;
    private  int k;
    @Inject
    private  OverlayManager e;
    private  boolean i;
    
    private  int l;
    private  b g;

    public void d(boolean bl) {
        this.o = bl;
    }

    public boolean c() {
        return this.h;
    }

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = var1[1];
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = var1[1];
        while (SquireSkipperPlugin.var12(var11, var10)) {
            char var13 = var9[var11];
            var6.append((char)(var13 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if ((0x15 ^ 0x11) > 1) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    public static String a(String string, int n2) {
        return string.substring(var1[1], string.length() - n2);
    }

    @Provides
    SquireSkipperConfig a(ConfigManager configManager) {
        return (SquireSkipperConfig)configManager.getConfig(SquireSkipperConfig.class);
    }

    public void e(int n2) {
        this.n = n2;
    }

    public void b(int n2) {
        this.j = n2;
    }

    public static String a(String string) {
        return SquireSkipperPlugin.a(string, var1[0]);
    }

    private static boolean var14(Object object, Object object2) {
        return object != object2;
    }

    private static boolean var15(Object object) {
        return object == null;
    }

    public void d(int n2) {
        this.l = n2;
    }

    public int i() {
        return this.n;
    }

    public void a(boolean bl) {
        this.h = bl;
    }

    public boolean d() {
        return this.i;
    }

    public void a(b b2) {
        this.g = b2;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        Matcher var16;
        SquireSkipperPlugin var17;
        void var18;
        if (SquireSkipperPlugin.var14(chatMessage.getType(), ChatMessageType.SPAM) && SquireSkipperPlugin.var14(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        String var19 = Text.removeTags((String)var18.getMessage());
        if (SquireSkipperPlugin.var20(var19.contains(var2[var1[1]]) ? 1 : 0)) {
            var17.a((b)null);
            var17.a(var1[0]);
            var17.b(var1[1]);
        }
        if (SquireSkipperPlugin.var20(var19.contains(var2[var1[0]]) ? 1 : 0)) {
            var17.a(var1[0]);
            var17.a((b)null);
            var17.b(var1[1]);
            var17.k += var1[0];
        }
        if (SquireSkipperPlugin.var20((var16 = b.matcher(var19)).find() ? 1 : 0)) {
            String var21 = var16.group(var2[var1[2]]);
            b var22 = s.s.e.u.p.i.r.r.-.q.a.e.k.r.l.u.i.p.e.t.-.b.b(var21);
            if (SquireSkipperPlugin.var15((Object)var22)) {
                var17.b(var1[0]);
                var17.a(var1[0]);
                var17.a((b)null);
                var17.b(var1[1]);
                return;
            }
            var17.b(var1[1]);
            int var23 = Integer.parseInt(var16.group(var2[var1[3]]));
            var17.b(var23);
            var17.a(var22);
        }
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[var1[6]];
        classArray[SquireSkipperPlugin.var1[1]] = EatingTask.class;
        classArray[SquireSkipperPlugin.var1[0]] = CheckingForTask.class;
        classArray[SquireSkipperPlugin.var1[2]] = GettingNewTask.class;
        classArray[SquireSkipperPlugin.var1[3]] = BankingTask.class;
        classArray[SquireSkipperPlugin.var1[7]] = AttackingTask.class;
        classArray[SquireSkipperPlugin.var1[8]] = KillingBlowTask.class;
        classArray[SquireSkipperPlugin.var1[9]] = DrinkingAntiPoisonTask.class;
        classArray[SquireSkipperPlugin.var1[10]] = DrinkingStaminaTask.class;
        classArray[SquireSkipperPlugin.var1[11]] = TraversingToTuraelTask.class;
        classArray[SquireSkipperPlugin.var1[5]] = GettingHuntingTask.class;
        classArray[SquireSkipperPlugin.var1[4]] = RestoringFromPoolTask.class;
        classArray[SquireSkipperPlugin.var1[12]] = FixBossTaskThingTask.class;
        return classArray;
    }

    public boolean h() {
        return this.m;
    }

    private static boolean var24(int n2, int n3) {
        return n2 == n3;
    }

        catch (Exception var30) {
            var30.printStackTrace();
            return null;
        }
    }

        catch (Exception var36) {
            var36.printStackTrace();
            return null;
        }
    }

    private static boolean var20(int n2) {
        return n2 != 0;
    }

    public int g() {
        return this.l;
    }

    protected void onStop() {
        this.c(var1[1]);
        this.c(var1[1]);
        this.e.remove((Overlay)this.c);
        0;
    }

    public void c(boolean bl) {
        this.m = bl;
    }

    public void b(boolean bl) {
        this.i = bl;
    }

    private static void var37() {
        var1 = new int[14];
        SquireSkipperPlugin.var1[0] = 1;
        SquireSkipperPlugin.var1[1] = (95 + 125 - 47 + 10 ^ 60 + 47 - -8 + 76) & (0xA8 ^ 0x9D ^ (0xA3 ^ 0x9E) ^ -1);
        SquireSkipperPlugin.var1[2] = 2;
        SquireSkipperPlugin.var1[3] = 3;
        SquireSkipperPlugin.var1[4] = 102 + 34 - 66 + 63 ^ 74 + 66 - 139 + 142;
        SquireSkipperPlugin.var1[5] = 1 ^ 0x59 ^ (0x5F ^ 0xE);
        SquireSkipperPlugin.var1[6] = 0x2C ^ 0x20;
        SquireSkipperPlugin.var1[7] = 0x20 ^ 0x24;
        SquireSkipperPlugin.var1[8] = 3 + 109 - 17 + 84 ^ 128 + 105 - 76 + 25;
        SquireSkipperPlugin.var1[9] = 53 + 50 - 93 + 119 ^ 105 + 68 - 136 + 98;
        SquireSkipperPlugin.var1[10] = 89 + 10 - 79 + 175 ^ 161 + 172 - 319 + 182;
        SquireSkipperPlugin.var1[11] = 76 + 7 - 46 + 104 ^ 4 + 73 - -15 + 41;
        SquireSkipperPlugin.var1[12] = 0x31 ^ 0x3A;
        SquireSkipperPlugin.var1[13] = 0xFFFFF98F & 0x7F9;
    }

    private static boolean var12(int n2, int n3) {
        return n2 < n3;
    }

    public Instant getStarted() {
        return this.f;
    }

    public int e() {
        return this.j;
    }

    protected void onStart() {
        System.out.println(var2[var1[7]]);
        this.g = null;
        this.f = Instant.now();
        this.i = var1[1];
        this.e.add((Overlay)this.c);
        0;
        this.c(var1[1]);
        this.c(var1[1]);
        this.d(var1[1]);
        this.e(Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON).getId());
        System.out.println("Current Streak: " + this.a(var1[13]));
    }

    public b b() {
        return this.g;
    }

    public int f() {
        return this.k;
    }

    private static void var38() {
        var2 = new String[var1[9]];
        SquireSkipperPlugin.var2[SquireSkipperPlugin.var1[1]] = "something new to hunt";
        SquireSkipperPlugin.var2[SquireSkipperPlugin.var1[0]] = "completed your task";
        SquireSkipperPlugin.var2[SquireSkipperPlugin.var1[2]] = "name";
        SquireSkipperPlugin.var2[SquireSkipperPlugin.var1[3]] = "amount";
        SquireSkipperPlugin.var2[SquireSkipperPlugin.var1[7]] = "Skipper has been started";
        SquireSkipperPlugin.var2[SquireSkipperPlugin.var1[8]] = "^(?:You're assigned to kill|You have received a new Slayer assignment from .*:) (?:[Tt]he )?(?<name>.+?)(?: (?:in|on|south of) (?:the )?(?<location>[^;]+))?(?:; only | \\()(?<amount>\\d+)(?: more to go\\.|\\))$";
    }

    public boolean a(int n2) {
        boolean bl;
        if (SquireSkipperPlugin.var24(n2 % var1[4], var1[5])) {
            bl = var1[0];
            0;
            if (2 <= 1) {
                return ((0x80 ^ 0x85 ^ (0x2C ^ 0x1D)) & (0x29 ^ 0x78 ^ (0x72 ^ 0x17) ^ -1)) != 0;
            }
        } else {
            bl = var1[1];
        }
        return bl;
    }

    public SquireSkipperConfig a() {
        return this.d;
    }

    public boolean j() {
        return this.o;
    }

    public void c(int n2) {
        this.k = n2;
    }

    static {
        SquireSkipperPlugin.var37();
        SquireSkipperPlugin.var38();
        a = LoggerFactory.getLogger(SquireSkipperPlugin.class);
        b = Pattern.compile(var2[var1[8]]);
    }
}

