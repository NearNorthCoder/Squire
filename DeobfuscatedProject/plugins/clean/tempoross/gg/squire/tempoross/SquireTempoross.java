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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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
        if (SquireTempoross.lIllIIIlllIllll(sceneEntity)) {
            return this.d(sceneEntity.getWorldLocation());
        }
        return null;
    }

    private static boolean lIllIIIllllIIII(int n2) {
        return n2 == 0;
    }

    public int a() {
        Widget widget = Widgets.get((int)WidgetInfo.TEMPOROSS_STATUS_INDICATOR.getGroupId(), (int)lIIllIllllIll[20]);
        int n2 = lIIllIllllIll[21];
        if (SquireTempoross.lIllIIIlllIllll(widget) && SquireTempoross.lIllIIIlllIllll(widget.getText())) {
            String string = widget.getText();
            n2 = Integer.parseInt(string.substring(lIIllIllllIll[9], string.length() - lIIllIllllIll[2]));
        }
        return n2;
    }

    private static boolean lIllIIIllllIIlI(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIIIllllIlll(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIllIIIlllIllIl() {
        lIIllIllllIlI = new String[lIIllIllllIll[3]];
        SquireTempoross.lIIllIllllIlI[SquireTempoross.lIIllIllllIll[1]] = "Douse";
        SquireTempoross.lIIllIllllIlI[SquireTempoross.lIIllIllllIll[2]] = "Douse";
    }

    public NPC d(WorldPoint worldPoint) {
        Player player = Players.getLocal();
        TilePath tilePath = Movement.getPath((WorldPoint)worldPoint);
        player.getInteracting();

        List<WorldPoint> list = this.h();
        List list2 = list.stream().filter(arg_0 -> SquireTempoross.a((List)tilePath, arg_0)).collect(Collectors.toList());
        return NPCs.getNearest(nPC -> {
            int n2;
            if (SquireTempoross.lIllIIIllllIlII(nPC.getId(), lIIllIllllIll[32])) {
                String[] stringArray = new String[lIIllIllllIll[2]];
                stringArray[SquireTempoross.lIIllIllllIll[1]] = lIIllIllllIlI[lIIllIllllIll[2]];
                if (SquireTempoross.lIllIIIllllIIlI(nPC.hasAction(stringArray) ? 1 : 0) && SquireTempoross.lIllIIIllllIIlI(list2.stream().anyMatch(worldPoint -> nPC.getWorldArea().contains(worldPoint)) ? 1 : 0)) {
                    n2 = lIIllIllllIll[2];

                    if (null == null) return n2 != 0;
                    return false;
                }
            }
            n2 = lIIllIllllIll[1];
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
        if (SquireTempoross.lIllIIIllllIIII(this.a(worldPoint) ? 1 : 0)) {
            void var1;
            if (SquireTempoross.lIllIIIllllIIII(Movement.shouldWalk() ? 1 : 0)) {
                return lIIllIllllIll[1];
            }
            Movement.walk((WorldPoint)var1);
            return lIIllIllllIll[2];
        }
        return lIIllIllllIll[1];
    }

    private static  boolean a(List list, WorldPoint worldPoint) {
        return list.stream().anyMatch(worldPoint2 -> {
            boolean bl;
            if (SquireTempoross.lIllIIIllllIllI(SquireTempoross.lIllIIIllllIlIl(worldPoint2.distanceTo2D(worldPoint), 1.5))) {
                bl = lIIllIllllIll[2];

                if (((0x55 ^ 0x4A) & ~(0xBC ^ 0xA3)) != 0) {
                    return false;
                }
            } else {
                bl = lIIllIllllIll[1];
            }
            return bl;
        });
    }

    public boolean a(Locatable locatable) {
        return this.a(locatable.getWorldLocation());
    }

        return String.valueOf(var2);
    }

    public boolean a(Actor actor) {
        if (SquireTempoross.lIllIIIlllIllll(actor)) {
            return this.c(actor.getWorldLocation());
        }
        return lIIllIllllIll[2];
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lIIllIllllIll[0]];
        classArray[SquireTempoross.lIIllIllllIll[1]] = BoardingShipTask.class;
        classArray[SquireTempoross.lIIllIllllIll[2]] = BoardingShipTask.class;
        classArray[SquireTempoross.lIIllIllllIll[3]] = BuildingWorkAreaTask.class;
        classArray[SquireTempoross.lIIllIllllIll[4]] = GatheringRopeTask.class;
        classArray[SquireTempoross.lIIllIllllIll[5]] = GatheringHammerTask.class;
        classArray[SquireTempoross.lIIllIllllIll[6]] = GatheringBucketsTask.class;
        classArray[SquireTempoross.lIIllIllllIll[7]] = FillingEmptyBucketsTask.class;
        classArray[SquireTempoross.lIIllIllllIll[8]] = GatheringHammerTask.class;
        classArray[SquireTempoross.lIIllIllllIll[9]] = GatheringHarpoonTask.class;
        classArray[SquireTempoross.lIIllIllllIll[10]] = RidExtrasTask.class;
        classArray[SquireTempoross.lIIllIllllIll[11]] = FishingTask.class;
        classArray[SquireTempoross.lIIllIllllIll[12]] = TetheringToMastTask.class;
        classArray[SquireTempoross.lIIllIllllIll[13]] = RepairingMastTask.class;
        classArray[SquireTempoross.lIIllIllllIll[14]] = FishingTask.class;
        classArray[SquireTempoross.lIIllIllllIll[15]] = CookingFishTask.class;
        classArray[SquireTempoross.lIIllIllllIll[16]] = HandlingFiresTask.class;
        classArray[SquireTempoross.lIIllIllllIll[17]] = DepositingFishIntoCannonTask.class;
        classArray[SquireTempoross.lIIllIllllIll[18]] = UsingSpecialAttackTask.class;
        classArray[SquireTempoross.lIIllIllllIll[19]] = HarpooningPoolsTask.class;
        return classArray;
    }

    public boolean b(NPC nPC) {
        Player player = Players.getLocal();
        if (SquireTempoross.lIllIIIlllIllll(nPC)) {
            int[] nArray = new int[lIIllIllllIll[2]];
            nArray[SquireTempoross.lIIllIllllIll[1]] = lIIllIllllIll[30];
            if (SquireTempoross.lIllIIIllllIIlI(Inventory.contains((int[])nArray) ? 1 : 0) && SquireTempoross.lIllIIIllllIIII(nPC.equals(player.getInteracting()) ? 1 : 0) && SquireTempoross.lIllIIIllllIIll(player.getAnimation(), lIIllIllllIll[31])) {
                nPC.interact(lIIllIllllIlI[lIIllIllllIll[1]]);
                return lIIllIllllIll[2];
            }
        }
        return lIIllIllllIll[1];
    }

    protected void onStart() {
        this.d.y();
        this.d.a(StopWatch.start());
        this.b.register((Object)this.d);
        this.a.add((Overlay)this.c);

    }

    private List<WorldPoint> i() {
        int[] nArray = new int[lIIllIllllIll[2]];
        nArray[SquireTempoross.lIIllIllllIll[1]] = lIIllIllllIll[28];
        return TileObjects.getSurrounding((WorldPoint)Players.getLocal().getWorldLocation(), (int)lIIllIllllIll[27], (int[])nArray).stream().filter(tileObject -> tileObject instanceof GameObject).flatMap(tileObject -> ((GameObject)tileObject).getWorldArea().toWorldPointList().stream()).collect(Collectors.toList());
    }

    private List<WorldPoint> h() {
        int[] nArray = new int[lIIllIllllIll[2]];
        nArray[SquireTempoross.lIIllIllllIll[1]] = lIIllIllllIll[29];
        return TileObjects.getSurrounding((WorldPoint)Players.getLocal().getWorldLocation(), (int)lIIllIllllIll[27], (int[])nArray).stream().filter(tileObject -> tileObject instanceof GameObject).flatMap(tileObject -> ((GameObject)tileObject).getWorldArea().toWorldPointList().stream()).collect(Collectors.toList());
    }

    private static boolean lIllIIIlllIllll(Object object) {
        return object != null;
    }

    public int b() {
        Widget widget = Widgets.get((int)WidgetInfo.TEMPOROSS_STATUS_INDICATOR.getGroupId(), (int)lIIllIllllIll[22]);
        int n2 = lIIllIllllIll[21];
        if (SquireTempoross.lIllIIIlllIllll(widget) && SquireTempoross.lIllIIIlllIllll(widget.getText())) {
            String string = widget.getText();
            n2 = Integer.parseInt(string.substring(lIIllIllllIll[18], string.length() - lIIllIllllIll[2]));
        }
        return n2;
    }

    public int e() {
        int[] nArray = new int[lIIllIllllIll[2]];
        nArray[SquireTempoross.lIIllIllllIll[1]] = lIIllIllllIll[25];
        int[] nArray2 = new int[lIIllIllllIll[2]];
        nArray2[SquireTempoross.lIIllIllllIll[1]] = lIIllIllllIll[26];
        return Inventory.getCount((int[])nArray) + Inventory.getCount((int[])nArray2);
    }

    public boolean b(Locatable locatable) {
        return this.b(locatable.getWorldLocation());
    }

    static {
        SquireTempoross.lIllIIIlllIlllI();
        SquireTempoross.lIllIIIlllIllIl();
    }

    private List<WorldPoint> g() {
        int[] nArray = new int[lIIllIllllIll[3]];
        nArray[SquireTempoross.lIIllIllllIll[1]] = lIIllIllllIll[28];
        nArray[SquireTempoross.lIIllIllllIll[2]] = lIIllIllllIll[29];
        return TileObjects.getSurrounding((WorldPoint)Players.getLocal().getWorldLocation(), (int)lIIllIllllIll[27], (int[])nArray).stream().filter(tileObject -> tileObject instanceof GameObject).flatMap(tileObject -> ((GameObject)tileObject).getWorldArea().toWorldPointList().stream()).collect(Collectors.toList());
    }

    private static int lIllIIIllllIlIl(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    protected void onStop() {
        this.b.unregister((Object)this.d);
        this.a.remove((Overlay)this.c);

    }

    private static boolean lIllIIIllllIlII(int n2, int n3) {
        return n2 == n3;
    }

    public int d() {
        int[] nArray = new int[lIIllIllllIll[2]];
        nArray[SquireTempoross.lIIllIllllIll[1]] = lIIllIllllIll[24];
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

        return stream.noneMatch(arg_0 -> ((WorldPoint)worldPoint2).equals(arg_0));
    }

    public boolean e(WorldPoint worldPoint) {
        NPC nPC = this.d(worldPoint);
        return this.b(nPC);
    }

    /*
     * WARNING - void declaration
     */
    public WorldPoint a(NPC nPC) {
        void var3;
        if (SquireTempoross.lIllIIIllllIIIl(nPC)) {
            return null;
        }
        WorldPoint var4 = var3.getWorldLocation().dy(lIIllIllllIll[21]);
        if (SquireTempoross.lIllIIIllllIIlI(Reachable.isWalkable((WorldPoint)var4) ? 1 : 0)) {
            return var4;
        }
        WorldPoint var5 = var3.getWorldLocation().dx(lIIllIllllIll[2]);
        if (SquireTempoross.lIllIIIllllIIlI(Reachable.isWalkable((WorldPoint)var5) ? 1 : 0)) {
            return var5;
        }
        WorldPoint var6 = var3.getWorldLocation().dy(lIIllIllllIll[2]);
        if (SquireTempoross.lIllIIIllllIIlI(Reachable.isWalkable((WorldPoint)var6) ? 1 : 0)) {
            return var6;
        }
        WorldPoint var7 = var3.getWorldLocation().dx(lIIllIllllIll[21]);
        if (SquireTempoross.lIllIIIllllIIlI(Reachable.isWalkable((WorldPoint)var7) ? 1 : 0)) {
            return var7;
        }
        return null;
    }

    private static boolean lIllIIIllllIllI(int n2) {
        return n2 < 0;
    }

    public boolean a(WorldPoint worldPoint2) {
        TilePath tilePath = Movement.getPath((WorldPoint)worldPoint2);
        List<WorldPoint> list = this.g();
        return tilePath.stream().anyMatch(worldPoint -> list.stream().anyMatch(worldPoint2 -> worldPoint2.equals(worldPoint)));
    }

    public int c() {
        Widget widget = Widgets.get((int)WidgetInfo.TEMPOROSS_STATUS_INDICATOR.getGroupId(), (int)lIIllIllllIll[23]);
        int n2 = lIIllIllllIll[21];
        if (SquireTempoross.lIllIIIlllIllll(widget.getText())) {
            String string = widget.getText();
            n2 = Integer.parseInt(string.substring(lIIllIllllIll[10], string.length() - lIIllIllllIll[2]));
        }
        return n2;
    }

    private static boolean lIllIIIllllIIIl(Object object) {
        return object == null;
    }

    private static boolean lIllIIIllllIIll(int n2, int n3) {
        return n2 != n3;
    }

    public int f() {
        return this.d() + this.e();
    }

}

