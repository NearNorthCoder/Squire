/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.NpcDespawned
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Equipment
 *  org.pf4j.Extension
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.pvm;

import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.util.Log;
import gg.squire.pvm.SquireShamanConfig;
import gg.squire.pvm.overlay.ShamanInfoBox;
import java.time.Instant;
import javax.inject.Inject;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.NpcDespawned;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Equipment;
import org.pf4j.Extension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import gg.squire.pvm.WalkingToBankTask;
import gg.squire.pvm.WalkingToShamansTask;
import gg.squire.pvm.IHelper;
import gg.squire.pvm.BankingTask;
import gg.squire.pvm.RestoringPrayerTask;
import gg.squire.pvm.CuringPoisonTask;
import gg.squire.pvm.DrinkingPrayerPotionTask;
import gg.squire.pvm.DrinkingRangePotionTask;
import gg.squire.pvm.EatingTask;
import gg.squire.pvm.MovingToSafespotTask;
import gg.squire.pvm.AvoidingSpawnsTask;
import gg.squire.pvm.EnablingSpecialAttackTask;
import gg.squire.pvm.FightingTask;
import gg.squire.pvm.MovingAwayFromShamanTask;
import gg.squire.pvm.PrayFlickingTask;
import gg.squire.pvm.HighAlchingTask;
import gg.squire.pvm.LootingTask;
import gg.squire.pvm.GrabbingDwhTask;
import gg.squire.pvm.TeleportingOutTask;

@PluginDescriptor(name="Squire Shamans")
@Extension
public class SquireShamansPlugin
extends SquirePlugin {
    private  boolean j;
    @Inject
    private  i f;
    
    private  boolean p;
    @Inject
    private  ShamanInfoBox e;
    private static final  Logger a;
    private  int h;
    private  boolean l;
    private  boolean m;
    private  boolean n;
    @Inject
    private  OverlayManager d;
    private  int i;
    private  Instant g;
    private  int b;
    private  boolean o;
    @Inject
    private  SquireShamanConfig c;
    private  boolean k;

    public void b(int n2) {
        this.i = n2;
    }

    private static void var3() {
        var1 = new int[20];
        SquireShamansPlugin.var1[0] = 0x20 ^ 0x19 ^ (0x66 ^ 0x4D);
        SquireShamansPlugin.var1[1] = 1 & (1 ^ -1);
        SquireShamansPlugin.var1[2] = 1;
        SquireShamansPlugin.var1[3] = 2;
        SquireShamansPlugin.var1[4] = 3;
        SquireShamansPlugin.var1[5] = 0xDF ^ 0xC4 ^ (0x30 ^ 0x2F);
        SquireShamansPlugin.var1[6] = 0x8C ^ 0x89;
        SquireShamansPlugin.var1[7] = 0x2D ^ 0x59 ^ (0xB1 ^ 0xC3);
        SquireShamansPlugin.var1[8] = 0x66 ^ 0x48 ^ (0xA7 ^ 0x8E);
        SquireShamansPlugin.var1[9] = 117 + 2 - 57 + 68 ^ 23 + 7 - -71 + 37;
        SquireShamansPlugin.var1[10] = 32 + 49 - -31 + 30 ^ 51 + 120 - 82 + 46;
        SquireShamansPlugin.var1[11] = 120 + 204 - 135 + 18 ^ 141 + 146 - 160 + 70;
        SquireShamansPlugin.var1[12] = 111 + 116 - 97 + 34 ^ 122 + 160 - 164 + 57;
        SquireShamansPlugin.var1[13] = 69 + 53 - -46 + 14 ^ 110 + 12 - 119 + 183;
        SquireShamansPlugin.var1[14] = 0x7A ^ 0x69 ^ (0x67 ^ 0x79);
        SquireShamansPlugin.var1[15] = 0x10 ^ 0x1E;
        SquireShamansPlugin.var1[16] = 69 + 122 - 28 + 41 ^ 39 + 108 - 137 + 185;
        SquireShamansPlugin.var1[17] = 0x77 ^ 0x38 ^ (0xF3 ^ 0xAC);
        SquireShamansPlugin.var1[18] = 65 + 147 - 62 + 40 ^ 94 + 135 - 111 + 57;
        SquireShamansPlugin.var1[19] = -1;
    }

    public int d() {
        return this.i;
    }

    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (SquireShamansPlugin.var4(chatMessage.getMessage().contains(var2[var1[2]]) ? 1 : 0)) {
            this.p = var1[2];
            Log.info((String)var2[var1[3]]);
            this.forceStop();
        }
    }

    public boolean i() {
        return this.n;
    }

    public boolean j() {
        return this.o;
    }

    public void f(boolean bl) {
        this.o = bl;
    }

    public Instant getStarted() {
        return this.g;
    }

    public void a(boolean bl) {
        this.j = bl;
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[var1[0]];
        classArray[SquireShamansPlugin.var1[1]] = FightingTask.class;
        classArray[SquireShamansPlugin.var1[2]] = PrayFlickingTask.class;
        classArray[SquireShamansPlugin.var1[3]] = AvoidingSpawnsTask.class;
        classArray[SquireShamansPlugin.var1[4]] = EatingTask.class;
        classArray[SquireShamansPlugin.var1[5]] = CuringPoisonTask.class;
        classArray[SquireShamansPlugin.var1[6]] = LootingTask.class;
        classArray[SquireShamansPlugin.var1[7]] = MovingToSafespotTask.class;
        classArray[SquireShamansPlugin.var1[8]] = TeleportingOutTask.class;
        classArray[SquireShamansPlugin.var1[9]] = WalkingToBankTask.class;
        classArray[SquireShamansPlugin.var1[10]] = WalkingToShamansTask.class;
        classArray[SquireShamansPlugin.var1[11]] = BankingTask.class;
        classArray[SquireShamansPlugin.var1[12]] = RestoringPrayerTask.class;
        classArray[SquireShamansPlugin.var1[13]] = DrinkingPrayerPotionTask.class;
        classArray[SquireShamansPlugin.var1[14]] = DrinkingRangePotionTask.class;
        classArray[SquireShamansPlugin.var1[15]] = MovingAwayFromShamanTask.class;
        classArray[SquireShamansPlugin.var1[16]] = HighAlchingTask.class;
        classArray[SquireShamansPlugin.var1[17]] = GrabbingDwhTask.class;
        classArray[SquireShamansPlugin.var1[18]] = EnablingSpecialAttackTask.class;
        return classArray;
    }

    public boolean h() {
        return this.m;
    }

    public int c() {
        return this.h;
    }

    public void c(boolean bl) {
        this.l = bl;
    }

    private static void var5() {
        var2 = new String[var1[4]];
        SquireShamansPlugin.var2[SquireShamansPlugin.var1[1]] = "Lizardman shaman";
        SquireShamansPlugin.var2[SquireShamansPlugin.var1[2]] = "Oh dear, you are dead";
        SquireShamansPlugin.var2[SquireShamansPlugin.var1[3]] = "Died and no death handler just yet, so just stopping for now";
    }

    private static String var6(String var7, String var8) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var10 = var8.toCharArray();
        int var11 = var1[1];
        char[] var12 = var7.toCharArray();
        int var13 = var12.length;
        int var14 = var1[1];
        while (SquireShamansPlugin.var15(var14, var13)) {
            char var16 = var12[var14];
            var9.append((char)(var16 ^ var10[var11 % var10.length]));
            0;
            ++var11;
            ++var14;
            0;
            if (2 == 2) continue;
            return null;
        }
        return String.valueOf(var9);
    }

    public SquireShamanConfig b() {
        return this.c;
    }

    protected void onStop() {
        this.d.remove((Overlay)this.e);
        0;
        this.d.remove((Overlay)this.f);
        0;
        this.b = var1[1];
        this.i = var1[19];
    }

    public boolean g() {
        return this.l;
    }

    @Provides
    SquireShamanConfig a(ConfigManager configManager) {
        return (SquireShamanConfig)configManager.getConfig(SquireShamanConfig.class);
    }

    public int a() {
        return this.b;
    }

        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }

        catch (Exception var28) {
            var28.printStackTrace();
            return null;
        }
    }

    public boolean f() {
        return this.k;
    }

    public void e(boolean bl) {
        this.n = bl;
    }

    static {
        SquireShamansPlugin.var3();
        SquireShamansPlugin.var5();
        a = LoggerFactory.getLogger(SquireShamansPlugin.class);
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(NpcDespawned npcDespawned) {
        SquireShamansPlugin var29;
        void var30;
        NPC var31;
        if (SquireShamansPlugin.var4(this.p)) {
            this.forceStop();
        }
        if (SquireShamansPlugin.var4(var2[var1[1]].equals((var31 = var30.getNpc()).getName()) ? 1 : 0) && SquireShamansPlugin.var4(var29.c.room().x().contains(var30.getNpc().getWorldLocation()) ? 1 : 0) && SquireShamansPlugin.var4(var29.c.room().x().contains((Locatable)Players.getLocal()) ? 1 : 0)) {
            var29.b += var1[2];
        }
    }

    private static boolean var15(int n2, int n3) {
        return n2 < n3;
    }

    protected void onStart() {
        this.a(var1[19]);
        this.d.add((Overlay)this.e);
        0;
        this.d.add((Overlay)this.f);
        0;
        this.g = Instant.now();
        this.i = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON).getId();
    }

    public void d(boolean bl) {
        this.m = bl;
    }

    public void b(boolean bl) {
        this.k = bl;
    }

    public void a(int n2) {
        this.h = n2;
    }

    private static boolean var4(int n2) {
        return n2 != 0;
    }

    public boolean e() {
        return this.j;
    }
}

