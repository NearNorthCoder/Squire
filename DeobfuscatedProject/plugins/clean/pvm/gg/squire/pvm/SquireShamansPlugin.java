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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Instant;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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
import s.h.-.m.a.n.u.r.i.s.q.a.s.e.i;
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

    public int d() {
        return this.i;
    }

    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (SquireShamansPlugin.lIlIllllIIIIlll(chatMessage.getMessage().contains(lIIllIIIlIIlI[lIIllIIIlIlIl[2]]) ? 1 : 0)) {
            this.p = lIIllIIIlIlIl[2];
            Log.info((String)lIIllIIIlIIlI[lIIllIIIlIlIl[3]]);
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
        Class[] classArray = new Class[lIIllIIIlIlIl[0]];
        classArray[SquireShamansPlugin.lIIllIIIlIlIl[1]] = FightingTask.class;
        classArray[SquireShamansPlugin.lIIllIIIlIlIl[2]] = PrayFlickingTask.class;
        classArray[SquireShamansPlugin.lIIllIIIlIlIl[3]] = AvoidingSpawnsTask.class;
        classArray[SquireShamansPlugin.lIIllIIIlIlIl[4]] = EatingTask.class;
        classArray[SquireShamansPlugin.lIIllIIIlIlIl[5]] = CuringPoisonTask.class;
        classArray[SquireShamansPlugin.lIIllIIIlIlIl[6]] = LootingTask.class;
        classArray[SquireShamansPlugin.lIIllIIIlIlIl[7]] = MovingToSafespotTask.class;
        classArray[SquireShamansPlugin.lIIllIIIlIlIl[8]] = TeleportingOutTask.class;
        classArray[SquireShamansPlugin.lIIllIIIlIlIl[9]] = WalkingToBankTask.class;
        classArray[SquireShamansPlugin.lIIllIIIlIlIl[10]] = WalkingToShamansTask.class;
        classArray[SquireShamansPlugin.lIIllIIIlIlIl[11]] = BankingTask.class;
        classArray[SquireShamansPlugin.lIIllIIIlIlIl[12]] = RestoringPrayerTask.class;
        classArray[SquireShamansPlugin.lIIllIIIlIlIl[13]] = DrinkingPrayerPotionTask.class;
        classArray[SquireShamansPlugin.lIIllIIIlIlIl[14]] = DrinkingRangePotionTask.class;
        classArray[SquireShamansPlugin.lIIllIIIlIlIl[15]] = MovingAwayFromShamanTask.class;
        classArray[SquireShamansPlugin.lIIllIIIlIlIl[16]] = HighAlchingTask.class;
        classArray[SquireShamansPlugin.lIIllIIIlIlIl[17]] = GrabbingDwhTask.class;
        classArray[SquireShamansPlugin.lIIllIIIlIlIl[18]] = EnablingSpecialAttackTask.class;
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

    private static void lIlIllllIIIIlII() {
        lIIllIIIlIIlI = new String[lIIllIIIlIlIl[4]];
        SquireShamansPlugin.lIIllIIIlIIlI[SquireShamansPlugin.lIIllIIIlIlIl[1]] = "Lizardman shaman";
        SquireShamansPlugin.lIIllIIIlIIlI[SquireShamansPlugin.lIIllIIIlIlIl[2]] = "Oh dear, you are dead";
        SquireShamansPlugin.lIIllIIIlIIlI[SquireShamansPlugin.lIIllIIIlIlIl[3]] = "Died and no death handler just yet, so just stopping for now";
    }

        return String.valueOf(var1);
    }

    public SquireShamanConfig b() {
        return this.c;
    }

    protected void onStop() {
        this.d.remove((Overlay)this.e);

        this.d.remove((Overlay)this.f);

        this.b = lIIllIIIlIlIl[1];
        this.i = lIIllIIIlIlIl[19];
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

    public boolean f() {
        return this.k;
    }

    public void e(boolean bl) {
        this.n = bl;
    }

    static {
        SquireShamansPlugin.lIlIllllIIIIllI();
        SquireShamansPlugin.lIlIllllIIIIlII();
        a = LoggerFactory.getLogger(SquireShamansPlugin.class);
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(NpcDespawned npcDespawned) {
        SquireShamansPlugin var2;
        void var3;
        NPC var4;
        if (SquireShamansPlugin.lIlIllllIIIIlll(this.p ? 1 : 0)) {
            this.forceStop();
        }
        if (SquireShamansPlugin.lIlIllllIIIIlll(lIIllIIIlIIlI[lIIllIIIlIlIl[1]].equals((var4 = var3.getNpc()).getName()) ? 1 : 0) && SquireShamansPlugin.lIlIllllIIIIlll(var2.c.room().x().contains(var3.getNpc().getWorldLocation()) ? 1 : 0) && SquireShamansPlugin.lIlIllllIIIIlll(var2.c.room().x().contains((Locatable)Players.getLocal()) ? 1 : 0)) {
            var2.b += lIIllIIIlIlIl[2];
        }
    }

    private static boolean lIlIllllIIIlIII(int n2, int n3) {
        return n2 < n3;
    }

    protected void onStart() {
        this.a(lIIllIIIlIlIl[19]);
        this.d.add((Overlay)this.e);

        this.d.add((Overlay)this.f);

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

    private static boolean lIlIllllIIIIlll(int n2) {
        return n2 != 0;
    }

    public boolean e() {
        return this.j;
    }
}

