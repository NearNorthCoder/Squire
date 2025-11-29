/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  net.runelite.api.Actor
 *  net.runelite.api.GameObject
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.EventBus
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 *  net.unethicalite.api.SceneEntity
 *  net.unethicalite.api.commons.StopWatch
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.movement.pathfinder.model.TilePath
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.tempoross;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.tempoross.SquireTemporossConfig;
import gg.squire.tempoross.overlay.TemporossInfoBox;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import net.runelite.api.Actor;
import net.runelite.api.GameObject;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.SceneEntity;
import net.unethicalite.api.commons.StopWatch;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.model.TilePath;
import net.unethicalite.api.widgets.Widgets;
import gg.squire.tempoross.TemporossManager;
import gg.squire.tempoross.BuildingWorkAreaTask;
import gg.squire.tempoross.CookingFishTask;
import gg.squire.tempoross.UsingSpecialAttackTask;
import gg.squire.tempoross.FishingTask;
import gg.squire.tempoross.FillingEmptyBucketsTask;
import gg.squire.tempoross.HandlingFiresTask;
import gg.squire.tempoross.FishingTask;
import gg.squire.tempoross.HarpooningPoolsTask;
import gg.squire.tempoross.RepairingMastTask;
import gg.squire.tempoross.TetheringToMastTask;
import gg.squire.tempoross.DepositingFishIntoCannonTask;
import gg.squire.tempoross.GatheringBucketsTask;
import gg.squire.tempoross.GatheringHammerTask;
import gg.squire.tempoross.GatheringHarpoonTask;
import gg.squire.tempoross.GatheringRopeTask;
import gg.squire.tempoross.RidExtrasTask;
import gg.squire.tempoross.BoardingShipTask;
import gg.squire.tempoross.BoardingShipTask;

@PluginDescriptor(name="Squire Tempoross", enabledByDefault=false)
public class SquireTempoross
extends SquirePlugin {
    
    @Inject
    private  a d;
    
    @Inject
    private  OverlayManager a;
    @Inject
    private  EventBus b;
    @Inject
    private  TemporossInfoBox c;

    public NPC a(SceneEntity sceneEntity) {
        if (SquireTempoross.var3(sceneEntity)) {
            return this.d(sceneEntity.getWorldLocation());
        }
        return null;
    }

    private static boolean var4(int n2) {
        return n2 == 0;
    }

    public int a() {
        Widget widget = Widgets.get((int)WidgetInfo.TEMPOROSS_STATUS_INDICATOR.getGroupId(), (int)var1[20]);
        int n2 = var1[21];
        if (SquireTempoross.var3(widget) && SquireTempoross.var3(widget.getText())) {
            String string = widget.getText();
            n2 = Integer.parseInt(string.substring(var1[9], string.length() - var1[2]));
        }
        return n2;
    }

    private static boolean var5(int n2) {
        return n2 != 0;
    }

    private static boolean var6(int n2, int n3) {
        return n2 < n3;
    }

    private static void var7() {
        var2 = new String[var1[3]];
        SquireTempoross.var2[SquireTempoross.var1[1]] = "Douse";
        SquireTempoross.var2[SquireTempoross.var1[2]] = "Douse";
    }

    public NPC d(WorldPoint worldPoint) {
        Player player = Players.getLocal();
        TilePath tilePath = Movement.getPath((WorldPoint)worldPoint);
        player.getInteracting();
        0;
        List<WorldPoint> list = this.h();
        List list2 = list.stream().filter(arg_0 -> SquireTempoross.a((List)tilePath, arg_0)).collect(Collectors.toList());
        return NPCs.getNearest(nPC -> {
            int n2;
            if (SquireTempoross.var8(nPC.getId(), var1[32])) {
                String[] stringArray = new String[var1[2]];
                stringArray[SquireTempoross.var1[1]] = var2[var1[2]];
                if (SquireTempoross.var5(nPC.hasAction(stringArray) ? 1 : 0) && SquireTempoross.var5(list2.stream().anyMatch(worldPoint -> nPC.getWorldArea().contains(worldPoint)) ? 1 : 0)) {
                    n2 = var1[2];
                    0;
                    if null == null return n2 != 0;
                    return ((0xFB ^ 0xAF) & ~(0x71 ^ 0x25)) != 0;
                }
            }
            n2 = var1[1];
            return n2 != 0;
        });
    }

    public boolean b(SceneEntity sceneEntity) {
        NPC nPC = this.a(sceneEntity);
        return this.b(nPC);
    }

    /*
     * WARNING - void declaration
     */
    public boolean b(WorldPoint worldPoint) {
        if (SquireTempoross.var4(this.a(worldPoint) ? 1 : 0)) {
            void var9;
            if (SquireTempoross.var4(Movement.shouldWalk() ? 1 : 0)) {
                return var1[1];
            }
            Movement.walk((WorldPoint)var9);
            return var1[2];
        }
        return var1[1];
    }

    private static  boolean a(List list, WorldPoint worldPoint) {
        return list.stream().anyMatch(worldPoint2 -> {
            boolean bl;
            if (SquireTempoross.var10(SquireTempoross.var11(worldPoint2.distanceTo2D(worldPoint), 1.5))) {
                bl = var1[2];
                0;
                if (((0x55 ^ 0x4A) & ~(0xBC ^ 0xA3)) != 0) {
                    return ((0xE0 ^ 0xC3) & ~(0x9F ^ 0xBC)) != 0;
                }
            } else {
                bl = var1[1];
            }
            return bl;
        });
    }

    public boolean a(Locatable locatable) {
        return this.a(locatable.getWorldLocation());
    }

    private static String var12(String var13, String var14) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var15 = new StringBuilder();
        char[] var16 = var14.toCharArray();
        int var17 = var1[1];
        char[] var18 = var13.toCharArray();
        int var19 = var18.length;
        int var20 = var1[1];
        while (SquireTempoross.var6(var20, var19)) {
            char var21 = var18[var20];
            var15.append((char)(var21 ^ var16[var17 % var16.length]));
            0;
            ++var17;
            ++var20;
            0;
            if (2 > 0) continue;
            return null;
        }
        return String.valueOf(var15);
    }

    public boolean a(Actor actor) {
        if (SquireTempoross.var3(actor)) {
            return this.c(actor.getWorldLocation());
        }
        return var1[2];
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[var1[0]];
        classArray[SquireTempoross.var1[1]] = BoardingShipTask.class;
        classArray[SquireTempoross.var1[2]] = BoardingShipTask.class;
        classArray[SquireTempoross.var1[3]] = BuildingWorkAreaTask.class;
        classArray[SquireTempoross.var1[4]] = GatheringRopeTask.class;
        classArray[SquireTempoross.var1[5]] = GatheringHammerTask.class;
        classArray[SquireTempoross.var1[6]] = GatheringBucketsTask.class;
        classArray[SquireTempoross.var1[7]] = FillingEmptyBucketsTask.class;
        classArray[SquireTempoross.var1[8]] = GatheringHammerTask.class;
        classArray[SquireTempoross.var1[9]] = GatheringHarpoonTask.class;
        classArray[SquireTempoross.var1[10]] = RidExtrasTask.class;
        classArray[SquireTempoross.var1[11]] = FishingTask.class;
        classArray[SquireTempoross.var1[12]] = TetheringToMastTask.class;
        classArray[SquireTempoross.var1[13]] = RepairingMastTask.class;
        classArray[SquireTempoross.var1[14]] = FishingTask.class;
        classArray[SquireTempoross.var1[15]] = CookingFishTask.class;
        classArray[SquireTempoross.var1[16]] = HandlingFiresTask.class;
        classArray[SquireTempoross.var1[17]] = DepositingFishIntoCannonTask.class;
        classArray[SquireTempoross.var1[18]] = UsingSpecialAttackTask.class;
        classArray[SquireTempoross.var1[19]] = HarpooningPoolsTask.class;
        return classArray;
    }

    public boolean b(NPC nPC) {
        Player player = Players.getLocal();
        if (SquireTempoross.var3(nPC)) {
            int[] nArray = new int[var1[2]];
            nArray[SquireTempoross.var1[1]] = var1[30];
            if (SquireTempoross.var5(Inventory.contains((int[])nArray) ? 1 : 0) && SquireTempoross.var4(nPC.equals(player.getInteracting()) ? 1 : 0) && SquireTempoross.var22(player.getAnimation(), var1[31])) {
                nPC.interact(var2[var1[1]]);
                return var1[2];
            }
        }
        return var1[1];
    }

    protected void onStart() {
        this.d.y();
        this.d.a(StopWatch.start());
        this.b.register((Object)this.d);
        this.a.add((Overlay)this.c);
        0;
    }

    private List<WorldPoint> i() {
        int[] nArray = new int[var1[2]];
        nArray[SquireTempoross.var1[1]] = var1[28];
        return TileObjects.getSurrounding((WorldPoint)Players.getLocal().getWorldLocation(), (int)var1[27], (int[])nArray).stream().filter(tileObject -> tileObject instanceof GameObject).flatMap(tileObject -> ((GameObject)tileObject).getWorldArea().toWorldPointList().stream()).collect(Collectors.toList());
    }

    private List<WorldPoint> h() {
        int[] nArray = new int[var1[2]];
        nArray[SquireTempoross.var1[1]] = var1[29];
        return TileObjects.getSurrounding((WorldPoint)Players.getLocal().getWorldLocation(), (int)var1[27], (int[])nArray).stream().filter(tileObject -> tileObject instanceof GameObject).flatMap(tileObject -> ((GameObject)tileObject).getWorldArea().toWorldPointList().stream()).collect(Collectors.toList());
    }

    private static boolean var3(Object object) {
        return object != null;
    }

    public int b() {
        Widget widget = Widgets.get((int)WidgetInfo.TEMPOROSS_STATUS_INDICATOR.getGroupId(), (int)var1[22]);
        int n2 = var1[21];
        if (SquireTempoross.var3(widget) && SquireTempoross.var3(widget.getText())) {
            String string = widget.getText();
            n2 = Integer.parseInt(string.substring(var1[18], string.length() - var1[2]));
        }
        return n2;
    }

    public int e() {
        int[] nArray = new int[var1[2]];
        nArray[SquireTempoross.var1[1]] = var1[25];
        int[] nArray2 = new int[var1[2]];
        nArray2[SquireTempoross.var1[1]] = var1[26];
        return Inventory.getCount((int[])nArray) + Inventory.getCount((int[])nArray2);
    }

    public boolean b(Locatable locatable) {
        return this.b(locatable.getWorldLocation());
    }

    static {
        SquireTempoross.var23();
        SquireTempoross.var7();
    }

    private List<WorldPoint> g() {
        int[] nArray = new int[var1[3]];
        nArray[SquireTempoross.var1[1]] = var1[28];
        nArray[SquireTempoross.var1[2]] = var1[29];
        return TileObjects.getSurrounding((WorldPoint)Players.getLocal().getWorldLocation(), (int)var1[27], (int[])nArray).stream().filter(tileObject -> tileObject instanceof GameObject).flatMap(tileObject -> ((GameObject)tileObject).getWorldArea().toWorldPointList().stream()).collect(Collectors.toList());
    }

    private static int var11(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    protected void onStop() {
        this.b.unregister((Object)this.d);
        this.a.remove((Overlay)this.c);
        0;
    }

    private static boolean var8(int n2, int n3) {
        return n2 == n3;
    }

    public int d() {
        int[] nArray = new int[var1[2]];
        nArray[SquireTempoross.var1[1]] = var1[24];
        return Inventory.getCount((int[])nArray);
    }

    @Provides
    SquireTemporossConfig a(ConfigManager configManager) {
        return (SquireTemporossConfig)configManager.getConfig(SquireTemporossConfig.class);
    }

    public boolean c(WorldPoint worldPoint) {
        Stream stream = this.g().stream();
        WorldPoint worldPoint2 = worldPoint;
        Objects.requireNonNull(worldPoint2);
        0;
        return stream.noneMatch(arg_0 -> ((WorldPoint)worldPoint2).equals(arg_0));
    }

        catch (Exception var29) {
            var29.printStackTrace();
            return null;
        }
    }

    public boolean e(WorldPoint worldPoint) {
        NPC nPC = this.d(worldPoint);
        return this.b(nPC);
    }

    /*
     * WARNING - void declaration
     */
    public WorldPoint a(NPC nPC) {
        void var30;
        if (SquireTempoross.var31(nPC)) {
            return null;
        }
        WorldPoint var32 = var30.getWorldLocation().dy(var1[21]);
        if (SquireTempoross.var5(Reachable.isWalkable((WorldPoint)var32) ? 1 : 0)) {
            return var32;
        }
        WorldPoint var33 = var30.getWorldLocation().dx(var1[2]);
        if (SquireTempoross.var5(Reachable.isWalkable((WorldPoint)var33) ? 1 : 0)) {
            return var33;
        }
        WorldPoint var34 = var30.getWorldLocation().dy(var1[2]);
        if (SquireTempoross.var5(Reachable.isWalkable((WorldPoint)var34) ? 1 : 0)) {
            return var34;
        }
        WorldPoint var35 = var30.getWorldLocation().dx(var1[21]);
        if (SquireTempoross.var5(Reachable.isWalkable((WorldPoint)var35) ? 1 : 0)) {
            return var35;
        }
        return null;
    }

    private static boolean var10(int n2) {
        return n2 < 0;
    }

    public boolean a(WorldPoint worldPoint2) {
        TilePath tilePath = Movement.getPath((WorldPoint)worldPoint2);
        List<WorldPoint> list = this.g();
        return tilePath.stream().anyMatch(worldPoint -> list.stream().anyMatch(worldPoint2 -> worldPoint2.equals(worldPoint)));
    }

    public int c() {
        Widget widget = Widgets.get((int)WidgetInfo.TEMPOROSS_STATUS_INDICATOR.getGroupId(), (int)var1[23]);
        int n2 = var1[21];
        if (SquireTempoross.var3(widget.getText())) {
            String string = widget.getText();
            n2 = Integer.parseInt(string.substring(var1[10], string.length() - var1[2]));
        }
        return n2;
    }

    private static boolean var31(Object object) {
        return object == null;
    }

    private static boolean var22(int n2, int n3) {
        return n2 != n3;
    }

    public int f() {
        return this.d() + this.e();
    }

    private static void var23() {
        var1 = new int[33];
        SquireTempoross.var1[0] = 114 + 35 - -7 + 34 ^ 56 + 108 - 62 + 71;
        SquireTempoross.var1[1] = (0x72 ^ 0x48) & ~(0xB9 ^ 0x83);
        SquireTempoross.var1[2] = 1;
        SquireTempoross.var1[3] = 2;
        SquireTempoross.var1[4] = 3;
        SquireTempoross.var1[5] = 0x8B ^ 0x8F;
        SquireTempoross.var1[6] = 0x84 ^ 0x81;
        SquireTempoross.var1[7] = 0x62 ^ 0x64;
        SquireTempoross.var1[8] = 0x23 ^ 0x24;
        SquireTempoross.var1[9] = 0x49 ^ 0x30 ^ (0xC2 ^ 0xB3);
        SquireTempoross.var1[10] = 0xBC ^ 0xB5;
        SquireTempoross.var1[11] = 0x79 ^ 0x73;
        SquireTempoross.var1[12] = 0xB5 ^ 0xBE;
        SquireTempoross.var1[13] = 0x61 ^ 0x6D;
        SquireTempoross.var1[14] = 27 + 35 - 42 + 144 ^ 85 + 25 - 10 + 69;
        SquireTempoross.var1[15] = 0x56 ^ 0x58;
        SquireTempoross.var1[16] = 0xD2 ^ 0xB0 ^ (0xE3 ^ 0x8E);
        SquireTempoross.var1[17] = 0x2B ^ 0x3B;
        SquireTempoross.var1[18] = 83 + 53 - 47 + 54 ^ 44 + 94 - -10 + 10;
        SquireTempoross.var1[19] = 0xD5 ^ 0xC7;
        SquireTempoross.var1[20] = 0x26 ^ 5;
        SquireTempoross.var1[21] = -1;
        SquireTempoross.var1[22] = 0xF ^ 0x38;
        SquireTempoross.var1[23] = 0xC ^ 0x21;
        SquireTempoross.var1[24] = -(0xFFFFCF37 & 0x3CEC) & (0xFFFFFFFF & 0x6FFF);
        SquireTempoross.var1[25] = 0xFFFFFBDF & 0x67FD;
        SquireTempoross.var1[26] = -(0x9B ^ 0xB9) & (0xFFFFE3FF & Short.MAX_VALUE);
        SquireTempoross.var1[27] = 0xA8 ^ 0x9A;
        SquireTempoross.var1[28] = 0xFFFFB57E & 0xEAAF;
        SquireTempoross.var1[29] = -(0xFFFFE833 & 0x7FDD) & (0xFFFFFEDF & 0xFBFE);
        SquireTempoross.var1[30] = 0xFFFFA7ED & 0x5F9B;
        SquireTempoross.var1[31] = 0xFFFF9EF3 & 0x6BDF;
        SquireTempoross.var1[32] = -(0xFFFFDD9B & 0x3A7D) & (0xFFFFBFDB & 0x79FF);
    }
}

