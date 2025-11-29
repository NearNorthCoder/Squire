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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Instant;
import java.util.Arrays;
import java.util.Base64;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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

        return String.valueOf(var1);
    }

    public static String a(String string, int n2) {
        return string.substring(lIlIIlIIIllIl[1], string.length() - n2);
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
        return SquireSkipperPlugin.a(string, lIlIIlIIIllIl[0]);
    }

    private static boolean lIlllIlIIIllllI(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIlllIlIIlIIIII(Object object) {
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
        Matcher var2;
        SquireSkipperPlugin var3;
        void var4;
        if (SquireSkipperPlugin.lIlllIlIIIllllI(chatMessage.getType(), ChatMessageType.SPAM) && SquireSkipperPlugin.lIlllIlIIIllllI(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        String var5 = Text.removeTags((String)var4.getMessage());
        if (SquireSkipperPlugin.lIlllIlIIIlllll(var5.contains(lIlIIlIIIllII[lIlIIlIIIllIl[1]]) ? 1 : 0)) {
            var3.a((GameEnum) ull);
            var3.a(lIlIIlIIIllIl[0]);
            var3.b(lIlIIlIIIllIl[1]);
        }
        if (SquireSkipperPlugin.lIlllIlIIIlllll(var5.contains(lIlIIlIIIllII[lIlIIlIIIllIl[0]]) ? 1 : 0)) {
            var3.a(lIlIIlIIIllIl[0]);
            var3.a((GameEnum) ull);
            var3.b(lIlIIlIIIllIl[1]);
            var3.k += lIlIIlIIIllIl[0];
        }
        if (SquireSkipperPlugin.lIlllIlIIIlllll((var2 = b.matcher(var5)).find() ? 1 : 0)) {
            String var6 = var2.group(lIlIIlIIIllII[lIlIIlIIIllIl[2]]);
            b var7 = s.s.e.u.p.i.r.r.-.q.a.e.k.r.l.u.i.p.e.t.-.b.b(var6);
            if (SquireSkipperPlugin.lIlllIlIIlIIIII((Object)var7)) {
                var3.b(lIlIIlIIIllIl[0]);
                var3.a(lIlIIlIIIllIl[0]);
                var3.a((GameEnum) ull);
                var3.b(lIlIIlIIIllIl[1]);
                return;
            }
            var3.b(lIlIIlIIIllIl[1]);
            int var8 = Integer.parseInt(var2.group(lIlIIlIIIllII[lIlIIlIIIllIl[3]]));
            var3.b(var8);
            var3.a(var7);
        }
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lIlIIlIIIllIl[6]];
        classArray[SquireSkipperPlugin.lIlIIlIIIllIl[1]] = EatingTask.class;
        classArray[SquireSkipperPlugin.lIlIIlIIIllIl[0]] = CheckingForTask.class;
        classArray[SquireSkipperPlugin.lIlIIlIIIllIl[2]] = GettingNewTask.class;
        classArray[SquireSkipperPlugin.lIlIIlIIIllIl[3]] = BankingTask.class;
        classArray[SquireSkipperPlugin.lIlIIlIIIllIl[7]] = AttackingTask.class;
        classArray[SquireSkipperPlugin.lIlIIlIIIllIl[8]] = KillingBlowTask.class;
        classArray[SquireSkipperPlugin.lIlIIlIIIllIl[9]] = DrinkingAntiPoisonTask.class;
        classArray[SquireSkipperPlugin.lIlIIlIIIllIl[10]] = DrinkingStaminaTask.class;
        classArray[SquireSkipperPlugin.lIlIIlIIIllIl[11]] = TraversingToTuraelTask.class;
        classArray[SquireSkipperPlugin.lIlIIlIIIllIl[5]] = GettingHuntingTask.class;
        classArray[SquireSkipperPlugin.lIlIIlIIIllIl[4]] = RestoringFromPoolTask.class;
        classArray[SquireSkipperPlugin.lIlIIlIIIllIl[12]] = FixBossTaskThingTask.class;
        return classArray;
    }

    public boolean h() {
        return this.m;
    }

    private static boolean lIlllIlIIlIIIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlllIlIIIlllll(int n2) {
        return n2 != 0;
    }

    public int g() {
        return this.l;
    }

    protected void onStop() {
        this.c(lIlIIlIIIllIl[1]);
        this.c(lIlIIlIIIllIl[1]);
        this.e.remove((Overlay)this.c);

    }

    public void c(boolean bl) {
        this.m = bl;
    }

    public void b(boolean bl) {
        this.i = bl;
    }

    private static boolean lIlllIlIIlIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    public Instant getStarted() {
        return this.f;
    }

    public int e() {
        return this.j;
    }

    protected void onStart() {
        System.out.println(lIlIIlIIIllII[lIlIIlIIIllIl[7]]);
        this.g = null;
        this.f = Instant.now();
        this.i = lIlIIlIIIllIl[1];
        this.e.add((Overlay)this.c);

        this.c(lIlIIlIIIllIl[1]);
        this.c(lIlIIlIIIllIl[1]);
        this.d(lIlIIlIIIllIl[1]);
        this.e(Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON).getId());
        System.out.println("Current Streak: " + this.a(lIlIIlIIIllIl[13]));
    }

    public b b() {
        return this.g;
    }

    public int f() {
        return this.k;
    }

    private static void lIlllIlIIIlllII() {
        lIlIIlIIIllII = new String[lIlIIlIIIllIl[9]];
        SquireSkipperPlugin.lIlIIlIIIllII[SquireSkipperPlugin.lIlIIlIIIllIl[1]] = "something new to hunt";
        SquireSkipperPlugin.lIlIIlIIIllII[SquireSkipperPlugin.lIlIIlIIIllIl[0]] = "completed your task";
        SquireSkipperPlugin.lIlIIlIIIllII[SquireSkipperPlugin.lIlIIlIIIllIl[2]] = "name";
        SquireSkipperPlugin.lIlIIlIIIllII[SquireSkipperPlugin.lIlIIlIIIllIl[3]] = "amount";
        SquireSkipperPlugin.lIlIIlIIIllII[SquireSkipperPlugin.lIlIIlIIIllIl[7]] = "Skipper has been started";
        SquireSkipperPlugin.lIlIIlIIIllII[SquireSkipperPlugin.lIlIIlIIIllIl[8]] = "^(?:You're assigned to kill|You have received a new Slayer assignment from .*:) (?:[Tt]he )?(?<name>.+?)(?: (?:in|on|south of) (?:the )?(?<location>[^;]+))?(?:; only | \\()(?<amount>\\d+)(?: more to go\\.|\\))$";
    }

    public boolean a(int n2) {
        boolean bl;
        if (SquireSkipperPlugin.lIlllIlIIlIIIIl(n2 % lIlIIlIIIllIl[4], lIlIIlIIIllIl[5])) {
            bl = lIlIIlIIIllIl[0];

            if (2 <= 1) {
                return ((0x80 ^ 0x85 ^ (0x2C ^ 0x1D)) & (0x29 ^ 0x78 ^ (0x72 ^ 0x17) ^ -1)) != 0;
            }
        } else {
            bl = lIlIIlIIIllIl[1];
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
        SquireSkipperPlugin.lIlllIlIIIlllIl();
        SquireSkipperPlugin.lIlllIlIIIlllII();
        a = LoggerFactory.getLogger(SquireSkipperPlugin.class);
        b = Pattern.compile(lIlIIlIIIllII[lIlIIlIIIllIl[8]]);
    }
}

