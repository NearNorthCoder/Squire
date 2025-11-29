/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Provides
 *  gg.squire.api.InventorySetup
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.runelite.api.Player
 *  net.runelite.api.Skill
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.events.ConfigChanged
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.thieving;

import com.google.inject.Provides;
import gg.squire.api.InventorySetup;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.util.Log;
import gg.squire.thieving.SquireThievingConfig;
import gg.squire.thieving.ThievingOverlayPanel;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import gg.squire.thieving.DoingVyreStuffTask;
import gg.squire.thieving.UpdatingStateTask;
import gg.squire.thieving.BankingLootFromPickpocketingTask;
import gg.squire.thieving.HealingUpTask;
import gg.squire.thieving.WalkingToBankTask;
import gg.squire.thieving.PickpocketingTheTargetTask;
import gg.squire.thieving.ReturningToStartTask;
import gg.squire.thieving.RoguesDenTask;
import gg.squire.thieving.BankingStallsTask;
import gg.squire.thieving.StealingFromStallTask;
import gg.squire.thieving.WalkingToStallTask;
import gg.squire.thieving.GameEnum19;
import gg.squire.thieving.GameEnum31;
import gg.squire.thieving.GameEnum22;
import gg.squire.thieving.GameEnum32;
import gg.squire.thieving.DroppingUselessItemsTask;
import gg.squire.thieving.OpeningCoinPouchesTask;
import gg.squire.thieving.BlackjackingTask;
import gg.squire.thieving.BuyingWinesTask;
import gg.squire.thieving.CancellingAttackingBanditthugTask;
import gg.squire.thieving.HoppingForAnEmptyWorldTask;
import gg.squire.thieving.LuringNewTargetTask;
import gg.squire.thieving.ReturningToTheBlackjackHouseTask;
import gg.squire.thieving.UnnotingForExtraFoodTask;
import gg.squire.thieving.DrinkingAntipoisonTask;
import gg.squire.thieving.CleaningInventoryTask;
import gg.squire.thieving.GoingBackInsideTask;
import gg.squire.thieving.PickingTheLockTask;
import gg.squire.thieving.DepositingSeedsTask;
import gg.squire.thieving.HandlingDodgyNecklacesTask;
import gg.squire.thieving.UsingShadowVeilTask;

@PluginDescriptor(name="Squire Thiever", enabledByDefault=false)
public class SquireThieving
extends SquirePlugin {
    private  boolean j;
    private  List<Item> i;
    
    private  boolean l;
    @Inject
    private  ThievingOverlayPanel d;
    @Inject
    private  SquireThievingConfig e;
    
    @Inject
    private  OverlayManager c;
    private static final  Logger a;
    private  InventorySetup h;
    private  int f;
    private  WorldPoint g;
    private  boolean k;
    private final  List<Integer> b;

    protected void onStart() {
        this.a(lIIllIlllIIlI[38]);
        Player player = Players.getLocal();
        if (SquireThieving.lIllIIIllIlIlII(player)) {
            this.a(player.getWorldLocation());
        }
        this.c.add((Overlay)this.d);

        this.a(new InventorySetup());
        this.a();
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(Player player, boolean bl) {
        TileObject var1;
        void var2;
        SquireThieving var3;
        c var4;
        c c2;
        if (SquireThieving.lIllIIIllIlIlII((Object)s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.c.b(player.getWorldLocation()))) {
            c2 = s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.c.b(player.getWorldLocation());

            if (((93 + 60 - 83 + 65 ^ 13 + 14 - 25 + 143) & (0x52 ^ 0x25 ^ (0x42 ^ 0x23) ^ -1)) == 3) {
                return ((102 + 119 - 126 + 35 ^ 57 + 41 - -35 + 13) & (0xC7 ^ 0x93 ^ (0x2F ^ 0x6B) ^ -1)) != 0;
            }
        } else {
            c2 = var4 = var3.b().t();
        }
        if (SquireThieving.lIllIIIllIllIlI((int)var2) && SquireThieving.lIllIIIllIllIlI(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        if (SquireThieving.lIllIIIllIlIlII(var1 = var3.a(var4))) {
            String string;
            String[] stringArray = new String[lIIllIlllIIlI[3]];
            if (SquireThieving.lIllIIIllIlIllI((int)var2)) {
                string = lIIllIlllIIIl[lIIllIlllIIlI[1]];

                if (1 <= -1) {
                    return ((0xBE ^ 0x81 ^ (0x4F ^ 0x37)) & (0xE1 ^ 0xA7 ^ 1 ^ -1)) != 0;
                }
            } else {
                string = stringArray[SquireThieving.lIIllIlllIIlI[1]] = lIIllIlllIIIl[lIIllIlllIIlI[3]];
            }
            if (SquireThieving.lIllIIIllIlIllI(var1.hasAction(stringArray) ? 1 : 0)) {
                String string2;
                String string3;
                String string4;
                String[] stringArray2 = new String[lIIllIlllIIlI[3]];
                if (SquireThieving.lIllIIIllIlIllI((int)var2)) {
                    string4 = lIIllIlllIIIl[lIIllIlllIIlI[5]];

                    if (1 > (0x3A ^ 0x56 ^ (0xF8 ^ 0x90))) {
                        return ((0x3E ^ 0xD ^ (0xA6 ^ 0xB9)) & (0x47 ^ 0x1B ^ (2 ^ 0x72) ^ -1)) != 0;
                    }
                } else {
                    string4 = stringArray2[SquireThieving.lIIllIlllIIlI[1]] = lIIllIlllIIIl[lIIllIlllIIlI[7]];
                }
                if (SquireThieving.lIllIIIllIllIlI(var1.hasAction(stringArray2) ? 1 : 0)) {
                    Object[] objectArray = new Object[lIIllIlllIIlI[3]];
                    objectArray[SquireThieving.lIIllIlllIIlI[1]] = (boolean)var2;
                    Log.info((String)lIIllIlllIIIl[lIIllIlllIIlI[9]], (Object[])objectArray);
                    return lIIllIlllIIlI[1];
                }
                String string5 = lIIllIlllIIIl[lIIllIlllIIlI[11]];
                Object[] objectArray = new Object[lIIllIlllIIlI[5]];
                int n2 = lIIllIlllIIlI[1];
                if (SquireThieving.lIllIIIllIlIllI((int)var2)) {
                    string3 = lIIllIlllIIIl[lIIllIlllIIlI[13]];

                    if ((83 + 35 - 26 + 47 ^ 86 + 39 - 104 + 122) <= -1) {
                        return ((0xC3 ^ 0xA6 ^ (0xC2 ^ 0xAC)) & (0x72 ^ 0x3B ^ (0x18 ^ 0x5A) ^ -1)) != 0;
                    }
                } else {
                    string3 = lIIllIlllIIIl[lIIllIlllIIlI[15]];
                }
                objectArray[n2] = string3;
                objectArray[SquireThieving.lIIllIlllIIlI[3]] = var1.getId();
                Log.info((String)string5, (Object[])objectArray);
                if (SquireThieving.lIllIIIllIlIllI((int)var2)) {
                    string2 = lIIllIlllIIIl[lIIllIlllIIlI[17]];

                } else {
                    string2 = lIIllIlllIIIl[lIIllIlllIIlI[19]];
                }
                var1.interact(string2);
                return lIIllIlllIIlI[3];
            }
        }
        return lIIllIlllIIlI[1];
    }

    public boolean j() {
        return this.k;
    }

    private static boolean lIllIIIllIlIllI(int n2) {
        return n2 != 0;
    }

    @Subscribe
    public void a(ConfigChanged configChanged) {
        this.a(new InventorySetup());
        this.a();
    }

    public InventorySetup g() {
        return this.h;
    }

    private static boolean lIllIIIllIllIll(Object object) {
        return object == null;
    }

    static {
        SquireThieving.lIllIIIllIlIIll();
        SquireThieving.lIllIIIllIlIIlI();
        a = LoggerFactory.getLogger(SquireThieving.class);
    }

    public boolean k() {
        return this.l;
    }

    public TileObject a(c c2) {
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> tileObject.getWorldLocation().equals((Object)c2.s()));
        if (SquireThieving.lIllIIIllIllIll(tileObject2)) {
            Log.info((String)lIIllIlllIIIl[lIIllIlllIIlI[0]]);
            return null;
        }
        return tileObject2;
    }

    /*
     * WARNING - void declaration
     */
    public d c() {
        void var5;
        int n2 = Skills.getLevel((Skill)Skill.THIEVING);
        if (SquireThieving.lIllIIIllIllIIl(n2, s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.d.MENAPHITE.u())) {
            return s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.d.MENAPHITE;
        }
        if (SquireThieving.lIllIIIllIllIIl((int)var5, s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.d.BANDIT_56.u())) {
            return s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.d.BANDIT_56;
        }
        return s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.d.BANDIT_41;
    }

    protected void onStop() {
        this.c.remove((Overlay)this.d);

        this.a((InventorySetup)null);
        this.a((List<Item>)null);
    }

    private static boolean lIllIIIllIllIIl(int n2, int n3) {
        return n2 >= n3;
    }

    public SquireThieving() {
        Integer[] integerArray = new Integer[lIIllIlllIIlI[0]];
        integerArray[SquireThieving.lIIllIlllIIlI[1]] = lIIllIlllIIlI[2];
        integerArray[SquireThieving.lIIllIlllIIlI[3]] = lIIllIlllIIlI[4];
        integerArray[SquireThieving.lIIllIlllIIlI[5]] = lIIllIlllIIlI[6];
        integerArray[SquireThieving.lIIllIlllIIlI[7]] = lIIllIlllIIlI[8];
        integerArray[SquireThieving.lIIllIlllIIlI[9]] = lIIllIlllIIlI[10];
        integerArray[SquireThieving.lIIllIlllIIlI[11]] = lIIllIlllIIlI[12];
        integerArray[SquireThieving.lIIllIlllIIlI[13]] = lIIllIlllIIlI[14];
        integerArray[SquireThieving.lIIllIlllIIlI[15]] = lIIllIlllIIlI[16];
        integerArray[SquireThieving.lIIllIlllIIlI[17]] = lIIllIlllIIlI[18];
        integerArray[SquireThieving.lIIllIlllIIlI[19]] = lIIllIlllIIlI[20];
        this.b = Stream.of(integerArray).collect(Collectors.toList());
        this.f = lIIllIlllIIlI[1];
        this.l = lIIllIlllIIlI[1];
    }

    public void a(boolean bl) {
        this.j = bl;
    }

    public void b(boolean bl) {
        this.k = bl;
    }

    public void a(List<Item> list) {
        this.i = list;
    }

    public WorldPoint f() {
        return this.g;
    }

    public void a(int n2) {
        this.f = n2;
    }

    public List<Item> h() {
        return this.i;
    }

    public void a(WorldPoint worldPoint) {
        this.g = worldPoint;
    }

    private static boolean lIllIIIllIlllII(int n2, int n3) {
        return n2 < n3;
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lIIllIlllIIlI[21]];
        classArray[SquireThieving.lIIllIlllIIlI[1]] = PickpocketingTheTargetTask.class;
        classArray[SquireThieving.lIIllIlllIIlI[3]] = BankingLootFromPickpocketingTask.class;
        classArray[SquireThieving.lIIllIlllIIlI[5]] = HealingUpTask.class;
        classArray[SquireThieving.lIIllIlllIIlI[7]] = RoguesDenTask.class;
        classArray[SquireThieving.lIIllIlllIIlI[9]] = ReturningToStartTask.class;
        classArray[SquireThieving.lIIllIlllIIlI[11]] = DepositingSeedsTask.class;
        classArray[SquireThieving.lIIllIlllIIlI[13]] = HandlingDodgyNecklacesTask.class;
        classArray[SquireThieving.lIIllIlllIIlI[15]] = UsingShadowVeilTask.class;
        classArray[SquireThieving.lIIllIlllIIlI[17]] = UpdatingStateTask.class;
        classArray[SquireThieving.lIIllIlllIIlI[19]] = WalkingToBankTask.class;
        classArray[SquireThieving.lIIllIlllIIlI[0]] = DoingVyreStuffTask.class;
        classArray[SquireThieving.lIIllIlllIIlI[22]] = BlackjackingTask.class;
        classArray[SquireThieving.lIIllIlllIIlI[23]] = LuringNewTargetTask.class;
        classArray[SquireThieving.lIIllIlllIIlI[24]] = UnnotingForExtraFoodTask.class;
        classArray[SquireThieving.lIIllIlllIIlI[25]] = BuyingWinesTask.class;
        classArray[SquireThieving.lIIllIlllIIlI[26]] = HoppingForAnEmptyWorldTask.class;
        classArray[SquireThieving.lIIllIlllIIlI[27]] = CancellingAttackingBanditthugTask.class;
        classArray[SquireThieving.lIIllIlllIIlI[28]] = ReturningToTheBlackjackHouseTask.class;
        classArray[SquireThieving.lIIllIlllIIlI[29]] = DrinkingAntipoisonTask.class;
        classArray[SquireThieving.lIIllIlllIIlI[30]] = GoingBackInsideTask.class;
        classArray[SquireThieving.lIIllIlllIIlI[31]] = PickingTheLockTask.class;
        classArray[SquireThieving.lIIllIlllIIlI[32]] = CleaningInventoryTask.class;
        classArray[SquireThieving.lIIllIlllIIlI[33]] = DroppingUselessItemsTask.class;
        classArray[SquireThieving.lIIllIlllIIlI[34]] = OpeningCoinPouchesTask.class;
        classArray[SquireThieving.lIIllIlllIIlI[35]] = WalkingToStallTask.class;
        classArray[SquireThieving.lIIllIlllIIlI[36]] = StealingFromStallTask.class;
        classArray[SquireThieving.lIIllIlllIIlI[37]] = BankingStallsTask.class;
        return classArray;
    }

    public List<Integer> d() {
        return this.b;
    }

    private static boolean lIllIIIllIlIlII(Object object) {
        return object != null;
    }

    private static void lIllIIIllIlIIlI() {
        lIIllIlllIIIl = new String[lIIllIlllIIlI[28]];
        SquireThieving.lIIllIlllIIIl[SquireThieving.lIIllIlllIIlI[1]] = "Open";
        SquireThieving.lIIllIlllIIIl[SquireThieving.lIIllIlllIIlI[3]] = "Close";
        SquireThieving.lIIllIlllIIIl[SquireThieving.lIIllIlllIIlI[5]] = "Open";
        SquireThieving.lIIllIlllIIIl[SquireThieving.lIIllIlllIIlI[7]] = "Close";
        SquireThieving.lIIllIlllIIIl[SquireThieving.lIIllIlllIIlI[9]] = "Curtain didn't have the right action. open: {}";
        SquireThieving.lIIllIlllIIIl[SquireThieving.lIIllIlllIIlI[11]] = "{} the curtain! Curtain: {}";
        SquireThieving.lIIllIlllIIIl[SquireThieving.lIIllIlllIIlI[13]] = "Opening";
        SquireThieving.lIIllIlllIIIl[SquireThieving.lIIllIlllIIlI[15]] = "Closing";
        SquireThieving.lIIllIlllIIIl[SquireThieving.lIIllIlllIIlI[17]] = "Open";
        SquireThieving.lIIllIlllIIIl[SquireThieving.lIIllIlllIIlI[19]] = "Close";
        SquireThieving.lIIllIlllIIIl[SquireThieving.lIIllIlllIIlI[0]] = "Couldn't find our curtains [default]";
        SquireThieving.lIIllIlllIIIl[SquireThieving.lIIllIlllIIlI[22]] = "Getting correct curtain for house: {}, openable: {}";
        SquireThieving.lIIllIlllIIIl[SquireThieving.lIIllIlllIIlI[23]] = "Couldn't find our curtains [overloaded]";
        SquireThieving.lIIllIlllIIIl[SquireThieving.lIIllIlllIIlI[24]] = "Open";
        SquireThieving.lIIllIlllIIIl[SquireThieving.lIIllIlllIIlI[25]] = "Close";
        SquireThieving.lIIllIlllIIIl[SquireThieving.lIIllIlllIIlI[26]] = "seed box";
        SquireThieving.lIIllIlllIIIl[SquireThieving.lIIllIlllIIlI[27]] = "gem bag";
    }

    public void a(InventorySetup inventorySetup) {
        this.h = inventorySetup;
    }

    public void c(boolean bl) {
        this.l = bl;
    }

    private static boolean lIllIIIllIlIlll(Object object, Object object2) {
        return object != object2;
    }

        return String.valueOf(var6);
    }

    private static boolean lIllIIIllIllIlI(int n2) {
        return n2 == 0;
    }

    @Provides
    SquireThievingConfig a(ConfigManager configManager) {
        return (SquireThievingConfig)configManager.getConfig(SquireThievingConfig.class);
    }

    private static boolean lIllIIIllIlIlIl(Object object, Object object2) {
        return object == object2;
    }

    public int e() {
        return this.f;
    }

    public boolean i() {
        return this.j;
    }

    private void a() {
        SquireThieving var7;
        if (SquireThieving.lIllIIIllIlIlIl((Object)this.e.pickpocketTarget(), (Object)s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.f.VYRE)) {
            this.h.add(lIIllIlllIIlI[39]);

            this.h.add(lIIllIlllIIlI[40]);

            this.h.add(lIIllIlllIIlI[41]);

        }
        if (SquireThieving.lIllIIIllIlIllI(var7.e.gemBag() ? 1 : 0)) {
            var7.h.add(item -> item.getName().toLowerCase().contains(lIIllIlllIIIl[lIIllIlllIIlI[27]]));

        }
        if (SquireThieving.lIllIIIllIlIllI(var7.e.shadowVeil() ? 1 : 0)) {
            Iterator<Integer> var8 = var7.b.iterator();
            while (SquireThieving.lIllIIIllIlIllI(var8.hasNext() ? 1 : 0)) {
                int var9 = var8.next();
                int[] nArray = new int[lIIllIlllIIlI[3]];
                nArray[SquireThieving.lIIllIlllIIlI[1]] = var9;
                if (SquireThieving.lIllIIIllIlIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    var7.h.add(var9);

                }

                if (((0x55 ^ 0x2F ^ (0x16 ^ 0x56)) & (0x7E ^ 0x2A ^ (0xF0 ^ 0x9E) ^ -1)) != (20 + 80 - -14 + 31 ^ 13 + 10 - -14 + 112)) continue;
                return;
            }
        }
        if (SquireThieving.lIllIIIllIlIlll((Object)var7.e.pickpocketFood(), (Object)s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.e.NONE) && SquireThieving.lIllIIIllIllIII(var7.e.pickpocketFoodAmount())) {
            var7.h.add(var7.e.pickpocketFood().x(), var7.e.pickpocketFoodAmount());

        }
        if (SquireThieving.lIllIIIllIlIllI(var7.e.dodgyNecklace() ? 1 : 0) && SquireThieving.lIllIIIllIllIII(var7.e.dodgyNecklaceAmount())) {
            var7.h.add(lIIllIlllIIlI[42], var7.e.dodgyNecklaceAmount());

        }
        if (SquireThieving.lIllIIIllIlIllI(var7.e.useSeedBox() ? 1 : 0)) {
            var7.h.add(item -> item.getName().toLowerCase().contains(lIIllIlllIIIl[lIIllIlllIIlI[26]]));

        }
    }

    public TileObject a(c c2, boolean bl) {
        Object[] objectArray = new Object[lIIllIlllIIlI[5]];
        objectArray[SquireThieving.lIIllIlllIIlI[1]] = c2;
        objectArray[SquireThieving.lIIllIlllIIlI[3]] = bl;
        Log.info((String)lIIllIlllIIIl[lIIllIlllIIlI[22]], (Object[])objectArray);
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (SquireThieving.lIllIIIllIlIllI(tileObject.getWorldLocation().equals((Object)c2.s()) ? 1 : 0)) {
                String string;
                String[] stringArray = new String[lIIllIlllIIlI[3]];
                if (SquireThieving.lIllIIIllIlIllI(bl ? 1 : 0)) {
                    string = lIIllIlllIIIl[lIIllIlllIIlI[24]];

                    if (-1 >= (0x7C ^ 0x7B ^ 3)) {
                        return false;
                    }
                } else {
                    string = stringArray[SquireThieving.lIIllIlllIIlI[1]] = lIIllIlllIIIl[lIIllIlllIIlI[25]];
                }
                if (SquireThieving.lIllIIIllIlIllI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIIllIlllIIlI[3];

                    if (2 > 0) return n2 != 0;
                    return ((0x46 ^ 5 ^ (0xD4 ^ 0x9D)) & (0xD0 ^ 0x88 ^ (0x68 ^ 0x3A) ^ -1)) != 0;
                }
            }
            n2 = lIIllIlllIIlI[1];
            return n2 != 0;
        });
        if (SquireThieving.lIllIIIllIllIll(tileObject2)) {
            Log.info((String)lIIllIlllIIIl[lIIllIlllIIlI[23]]);
            return null;
        }
        return tileObject2;
    }

    private static boolean lIllIIIllIllIII(int n2) {
        return n2 > 0;
    }

    public d b() {
        if (SquireThieving.lIllIIIllIlIlIl((Object)this.e.blackJackTarget(), (Object)s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.d.HIGHEST_LEVEL)) {
            return this.c();
        }
        return this.e.blackJackTarget();
    }
}

