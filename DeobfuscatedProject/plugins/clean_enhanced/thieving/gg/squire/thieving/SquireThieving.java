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
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
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
import gg.squire.thieving.GameEnum2;
import gg.squire.thieving.GameEnum4;
import gg.squire.thieving.GameEnum3;
import gg.squire.thieving.GameEnum5;
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
        this.a(var1[38]);
        Player player = Players.getLocal();
        if (SquireThieving.var3(player)) {
            this.a(player.getWorldLocation());
        }
        this.c.add((Overlay)this.d);
        0;
        this.a(new InventorySetup());
        this.a();
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(Player player, boolean bl) {
        TileObject var4;
        void var5;
        SquireThieving var6;
        c var7;
        c c2;
        if (SquireThieving.var3((Object)s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.c.b(player.getWorldLocation()))) {
            c2 = s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.c.b(player.getWorldLocation());
            0;
            if (((93 + 60 - 83 + 65 ^ 13 + 14 - 25 + 143) & (0x52 ^ 0x25 ^ (0x42 ^ 0x23) ^ -1)) == 3) {
                return ((102 + 119 - 126 + 35 ^ 57 + 41 - -35 + 13) & (0xC7 ^ 0x93 ^ (0x2F ^ 0x6B) ^ -1)) != 0;
            }
        } else {
            c2 = var7 = var6.b().t();
        }
        if (SquireThieving.var8((int)var5) && SquireThieving.var8(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        if (SquireThieving.var3(var4 = var6.a(var7))) {
            String string;
            String[] stringArray = new String[var1[3]];
            if (SquireThieving.var9((int)var5)) {
                string = var2[var1[1]];
                0;
                if (1 <= -1) {
                    return ((0xBE ^ 0x81 ^ (0x4F ^ 0x37)) & (0xE1 ^ 0xA7 ^ 1 ^ -1)) != 0;
                }
            } else {
                string = stringArray[SquireThieving.var1[1]] = var2[var1[3]];
            }
            if (SquireThieving.var9(var4.hasAction(stringArray) ? 1 : 0)) {
                String string2;
                String string3;
                String string4;
                String[] stringArray2 = new String[var1[3]];
                if (SquireThieving.var9((int)var5)) {
                    string4 = var2[var1[5]];
                    0;
                    if (1 > (0x3A ^ 0x56 ^ (0xF8 ^ 0x90))) {
                        return ((0x3E ^ 0xD ^ (0xA6 ^ 0xB9)) & (0x47 ^ 0x1B ^ (2 ^ 0x72) ^ -1)) != 0;
                    }
                } else {
                    string4 = stringArray2[SquireThieving.var1[1]] = var2[var1[7]];
                }
                if (SquireThieving.var8(var4.hasAction(stringArray2) ? 1 : 0)) {
                    Object[] objectArray = new Object[var1[3]];
                    objectArray[SquireThieving.var1[1]] = (boolean)var5;
                    Log.info((String)var2[var1[9]], (Object[])objectArray);
                    return var1[1];
                }
                String string5 = var2[var1[11]];
                Object[] objectArray = new Object[var1[5]];
                int n2 = var1[1];
                if (SquireThieving.var9((int)var5)) {
                    string3 = var2[var1[13]];
                    0;
                    if ((83 + 35 - 26 + 47 ^ 86 + 39 - 104 + 122) <= -1) {
                        return ((0xC3 ^ 0xA6 ^ (0xC2 ^ 0xAC)) & (0x72 ^ 0x3B ^ (0x18 ^ 0x5A) ^ -1)) != 0;
                    }
                } else {
                    string3 = var2[var1[15]];
                }
                objectArray[n2] = string3;
                objectArray[SquireThieving.var1[3]] = var4.getId();
                Log.info((String)string5, (Object[])objectArray);
                if (SquireThieving.var9((int)var5)) {
                    string2 = var2[var1[17]];
                    0;
                    if (-2 > 0) {
                        return (2 & ~2) != 0;
                    }
                } else {
                    string2 = var2[var1[19]];
                }
                var4.interact(string2);
                return var1[3];
            }
        }
        return var1[1];
    }

    public boolean j() {
        return this.k;
    }

    private static boolean var9(int n2) {
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

    private static boolean var10(Object object) {
        return object == null;
    }

    static {
        SquireThieving.var11();
        SquireThieving.var12();
        a = LoggerFactory.getLogger(SquireThieving.class);
    }

    public boolean k() {
        return this.l;
    }

    public TileObject a(c c2) {
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> tileObject.getWorldLocation().equals((Object)c2.s()));
        if (SquireThieving.var10(tileObject2)) {
            Log.info((String)var2[var1[0]]);
            return null;
        }
        return tileObject2;
    }

    /*
     * WARNING - void declaration
     */
    public d c() {
        void var13;
        int n2 = Skills.getLevel((SkiSkill.THIEVING);
        if (SquireThieving.var14(n2, s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.d.MENAPHITE.u())) {
            return s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.d.MENAPHITE;
        }
        if (SquireThieving.var14((int)var13, s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.d.BANDIT_56.u())) {
            return s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.d.BANDIT_56;
        }
        return s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.d.BANDIT_41;
    }

    private static void var11() {
        var1 = new int[43];
        SquireThieving.var1[0] = 0x64 ^ 0x70 ^ (0xA8 ^ 0xB6);
        SquireThieving.var1[1] = (0x6A ^ 0x38) & ~(0x5E ^ 0xC);
        SquireThieving.var1[2] = -(0xFFFFCB8F & 0x3C79) & (0xFFFFBBFF & 0x7DFF);
        SquireThieving.var1[3] = 1;
        SquireThieving.var1[4] = 0xFFFFEA97 & 0x7FF9;
        SquireThieving.var1[5] = 2;
        SquireThieving.var1[6] = 0xFFFFFEAD & 0x37F;
        SquireThieving.var1[7] = 3;
        SquireThieving.var1[8] = 0xFFFFE2AA & 0x1F7F;
        SquireThieving.var1[9] = 6 + 93 - 81 + 153 ^ 109 + 135 - 148 + 79;
        SquireThieving.var1[10] = 0xFFFFD77D & 0x2AB6;
        SquireThieving.var1[11] = 0x63 ^ 0x34 ^ (0x47 ^ 0x15);
        SquireThieving.var1[12] = -(0xFFFFC691 & 0x7DEF) & (0xFFFFDFFA & 0x76DF);
        SquireThieving.var1[13] = 3 ^ 0x43 ^ (0x2E ^ 0x68);
        SquireThieving.var1[14] = 0xFFFF97DB & 0x7A7F;
        SquireThieving.var1[15] = 0x27 ^ 0x20;
        SquireThieving.var1[16] = 0xFFFF93DE & 0x7E79;
        SquireThieving.var1[17] = 0x3D ^ 0x56 ^ (0xA0 ^ 0xC3);
        SquireThieving.var1[18] = 0xFFFF9ED7 & 0x737E;
        SquireThieving.var1[19] = 0x7F ^ 0x42 ^ (0x18 ^ 0x2C);
        SquireThieving.var1[20] = -(0xFFFFECF7 & 0x17AD) & (0xFFFFFEFD & 0x17FF);
        SquireThieving.var1[21] = 0x7B ^ 0x31 ^ (0xC1 ^ 0x90);
        SquireThieving.var1[22] = 0x18 ^ 0x37 ^ (0x9D ^ 0xB9);
        SquireThieving.var1[23] = 0xF3 ^ 0xBF ^ (0xC9 ^ 0x89);
        SquireThieving.var1[24] = 0x77 ^ 0x7A;
        SquireThieving.var1[25] = 0x1F ^ 0x11;
        SquireThieving.var1[26] = 163 + 45 - 135 + 93 ^ 151 + 117 - 165 + 66;
        SquireThieving.var1[27] = 49 + 58 - -43 + 4 ^ 45 + 14 - 34 + 113;
        SquireThieving.var1[28] = 0xB ^ 0x63 ^ (0x27 ^ 0x5E);
        SquireThieving.var1[29] = 0x40 ^ 0x52;
        SquireThieving.var1[30] = 0x8D ^ 0x9E;
        SquireThieving.var1[31] = 104 + 5 - 45 + 147 ^ 133 + 17 - 27 + 76;
        SquireThieving.var1[32] = 0x38 ^ 0x2D;
        SquireThieving.var1[33] = 0x9A ^ 0xB0 ^ (0x68 ^ 0x54);
        SquireThieving.var1[34] = 0x9D ^ 0x8A;
        SquireThieving.var1[35] = 7 ^ 0x1F;
        SquireThieving.var1[36] = 21 + 85 - 46 + 79 ^ 49 + 60 - 92 + 129;
        SquireThieving.var1[37] = 0xA0 ^ 0xBA;
        SquireThieving.var1[38] = -1;
        SquireThieving.var1[39] = -(0xFFFFF05F & 0x6FAB) & (0xFFFFF7BF & 0x7DFF);
        SquireThieving.var1[40] = 0xFFFFFDBB & 0x17F5;
        SquireThieving.var1[41] = 0xFFFFDFBF & 0x35F3;
        SquireThieving.var1[42] = 0xFFFFDAB7 & 0x77DF;
    }

    protected void onStop() {
        this.c.remove((Overlay)this.d);
        0;
        this.a((InventorySetup)null);
        this.a((List<Item>)null);
    }

    private static boolean var14(int n2, int n3) {
        return n2 >= n3;
    }

    public SquireThieving() {
        Integer[] integerArray = new Integer[var1[0]];
        integerArray[SquireThieving.var1[1]] = var1[2];
        integerArray[SquireThieving.var1[3]] = var1[4];
        integerArray[SquireThieving.var1[5]] = var1[6];
        integerArray[SquireThieving.var1[7]] = var1[8];
        integerArray[SquireThieving.var1[9]] = var1[10];
        integerArray[SquireThieving.var1[11]] = var1[12];
        integerArray[SquireThieving.var1[13]] = var1[14];
        integerArray[SquireThieving.var1[15]] = var1[16];
        integerArray[SquireThieving.var1[17]] = var1[18];
        integerArray[SquireThieving.var1[19]] = var1[20];
        this.b = Stream.of(integerArray).collect(Collectors.toList());
        this.f = var1[1];
        this.l = var1[1];
    }

        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
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

    private static boolean var21(int n2, int n3) {
        return n2 < n3;
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[var1[21]];
        classArray[SquireThieving.var1[1]] = PickpocketingTheTargetTask.class;
        classArray[SquireThieving.var1[3]] = BankingLootFromPickpocketingTask.class;
        classArray[SquireThieving.var1[5]] = HealingUpTask.class;
        classArray[SquireThieving.var1[7]] = RoguesDenTask.class;
        classArray[SquireThieving.var1[9]] = ReturningToStartTask.class;
        classArray[SquireThieving.var1[11]] = DepositingSeedsTask.class;
        classArray[SquireThieving.var1[13]] = HandlingDodgyNecklacesTask.class;
        classArray[SquireThieving.var1[15]] = UsingShadowVeilTask.class;
        classArray[SquireThieving.var1[17]] = UpdatingStateTask.class;
        classArray[SquireThieving.var1[19]] = WalkingToBankTask.class;
        classArray[SquireThieving.var1[0]] = DoingVyreStuffTask.class;
        classArray[SquireThieving.var1[22]] = BlackjackingTask.class;
        classArray[SquireThieving.var1[23]] = LuringNewTargetTask.class;
        classArray[SquireThieving.var1[24]] = UnnotingForExtraFoodTask.class;
        classArray[SquireThieving.var1[25]] = BuyingWinesTask.class;
        classArray[SquireThieving.var1[26]] = HoppingForAnEmptyWorldTask.class;
        classArray[SquireThieving.var1[27]] = CancellingAttackingBanditthugTask.class;
        classArray[SquireThieving.var1[28]] = ReturningToTheBlackjackHouseTask.class;
        classArray[SquireThieving.var1[29]] = DrinkingAntipoisonTask.class;
        classArray[SquireThieving.var1[30]] = GoingBackInsideTask.class;
        classArray[SquireThieving.var1[31]] = PickingTheLockTask.class;
        classArray[SquireThieving.var1[32]] = CleaningInventoryTask.class;
        classArray[SquireThieving.var1[33]] = DroppingUselessItemsTask.class;
        classArray[SquireThieving.var1[34]] = OpeningCoinPouchesTask.class;
        classArray[SquireThieving.var1[35]] = WalkingToStallTask.class;
        classArray[SquireThieving.var1[36]] = StealingFromStallTask.class;
        classArray[SquireThieving.var1[37]] = BankingStallsTask.class;
        return classArray;
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

    public List<Integer> d() {
        return this.b;
    }

    private static boolean var3(Object object) {
        return object != null;
    }

    private static void var12() {
        var2 = new String[var1[28]];
        SquireThieving.var2[SquireThieving.var1[1]] = "Open";
        SquireThieving.var2[SquireThieving.var1[3]] = "Close";
        SquireThieving.var2[SquireThieving.var1[5]] = "Open";
        SquireThieving.var2[SquireThieving.var1[7]] = "Close";
        SquireThieving.var2[SquireThieving.var1[9]] = "Curtain didn't have the right action. open: {}";
        SquireThieving.var2[SquireThieving.var1[11]] = "{} the curtain! Curtain: {}";
        SquireThieving.var2[SquireThieving.var1[13]] = "Opening";
        SquireThieving.var2[SquireThieving.var1[15]] = "Closing";
        SquireThieving.var2[SquireThieving.var1[17]] = "Open";
        SquireThieving.var2[SquireThieving.var1[19]] = "Close";
        SquireThieving.var2[SquireThieving.var1[0]] = "Couldn't find our curtains [default]";
        SquireThieving.var2[SquireThieving.var1[22]] = "Getting correct curtain for house: {}, openable: {}";
        SquireThieving.var2[SquireThieving.var1[23]] = "Couldn't find our curtains [overloaded]";
        SquireThieving.var2[SquireThieving.var1[24]] = "Open";
        SquireThieving.var2[SquireThieving.var1[25]] = "Close";
        SquireThieving.var2[SquireThieving.var1[26]] = "seed box";
        SquireThieving.var2[SquireThieving.var1[27]] = "gem bag";
    }

    public void a(InventorySetup inventorySetup) {
        this.h = inventorySetup;
    }

    public void c(boolean bl) {
        this.l = bl;
    }

    private static boolean var28(Object object, Object object2) {
        return object != object2;
    }

    private static String var29(String var30, String var31) {
        var30 = new String(Base64.getDecoder().decode(var30.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var32 = new StringBuilder();
        char[] var33 = var31.toCharArray();
        int var34 = var1[1];
        char[] var35 = var30.toCharArray();
        int var36 = var35.length;
        int var37 = var1[1];
        while (SquireThieving.var21(var37, var36)) {
            char var38 = var35[var37];
            var32.append((char)(var38 ^ var33[var34 % var33.length]));
            0;
            ++var34;
            ++var37;
            0;
            if ((0x38 ^ 0x4D ^ (0xE2 ^ 0x92)) > 0) continue;
            return null;
        }
        return String.valueOf(var32);
    }

    private static boolean var8(int n2) {
        return n2 == 0;
    }

    @Provides
    SquireThievingConfig a(ConfigManager configManager) {
        return (SquireThievingConfig)configManager.getConfig(SquireThievingConfig.class);
    }

    private static boolean var39(Object object, Object object2) {
        return object == object2;
    }

    public int e() {
        return this.f;
    }

    public boolean i() {
        return this.j;
    }

    private void a() {
        SquireThieving var40;
        if (SquireThieving.var39((Object)this.e.pickpocketTarget(), (Object)s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.f.VYRE)) {
            this.h.add(var1[39]);
            0;
            this.h.add(var1[40]);
            0;
            this.h.add(var1[41]);
            0;
        }
        if (SquireThieving.var9(var40.e.gemBag() ? 1 : 0)) {
            var40.h.add(item -> item.getName().toLowerCase().contains(var2[var1[27]]));
            0;
        }
        if (SquireThieving.var9(var40.e.shadowVeil() ? 1 : 0)) {
            Iterator<Integer> var41 = var40.b.iterator();
            while (SquireThieving.var9(var41.hasNext() ? 1 : 0)) {
                int var42 = var41.next();
                int[] nArray = new int[var1[3]];
                nArray[SquireThieving.var1[1]] = var42;
                if (SquireThieving.var9(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    var40.h.add(var42);
                    0;
                }
                0;
                if (((0x55 ^ 0x2F ^ (0x16 ^ 0x56)) & (0x7E ^ 0x2A ^ (0xF0 ^ 0x9E) ^ -1)) != (20 + 80 - -14 + 31 ^ 13 + 10 - -14 + 112)) continue;
                return;
            }
        }
        if (SquireThieving.var28((Object)var40.e.pickpocketFood(), (Object)s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.e.NONE) && SquireThieving.var43(var40.e.pickpocketFoodAmount())) {
            var40.h.add(var40.e.pickpocketFood().x(), var40.e.pickpocketFoodAmount());
            0;
        }
        if (SquireThieving.var9(var40.e.dodgyNecklace() ? 1 : 0) && SquireThieving.var43(var40.e.dodgyNecklaceAmount())) {
            var40.h.add(var1[42], var40.e.dodgyNecklaceAmount());
            0;
        }
        if (SquireThieving.var9(var40.e.useSeedBox() ? 1 : 0)) {
            var40.h.add(item -> item.getName().toLowerCase().contains(var2[var1[26]]));
            0;
        }
    }

    public TileObject a(c c2, boolean bl) {
        Object[] objectArray = new Object[var1[5]];
        objectArray[SquireThieving.var1[1]] = c2;
        objectArray[SquireThieving.var1[3]] = bl;
        Log.info((String)var2[var1[22]], (Object[])objectArray);
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (SquireThieving.var9(tileObject.getWorldLocation().equals((Object)c2.s()) ? 1 : 0)) {
                String string;
                String[] stringArray = new String[var1[3]];
                if (SquireThieving.var9(bl)) {
                    string = var2[var1[24]];
                    0;
                    if (-1 >= (0x7C ^ 0x7B ^ 3)) {
                        return ((0x46 ^ 0x78 ^ 2) & (72 + 12 - -83 + 2 ^ 136 + 134 - 234 + 113 ^ -1)) != 0;
                    }
                } else {
                    string = stringArray[SquireThieving.var1[1]] = var2[var1[25]];
                }
                if (SquireThieving.var9(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = var1[3];
                    0;
                    if (2 > 0) return n2 != 0;
                    return ((0x46 ^ 5 ^ (0xD4 ^ 0x9D)) & (0xD0 ^ 0x88 ^ (0x68 ^ 0x3A) ^ -1)) != 0;
                }
            }
            n2 = var1[1];
            return n2 != 0;
        });
        if (SquireThieving.var10(tileObject2)) {
            Log.info((String)var2[var1[23]]);
            return null;
        }
        return tileObject2;
    }

    private static boolean var43(int n2) {
        return n2 > 0;
    }

    public d b() {
        if (SquireThieving.var39((Object)this.e.blackJackTarget(), (Object)s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.d.HIGHEST_LEVEL)) {
            return this.c();
        }
        return this.e.blackJackTarget();
    }
}

