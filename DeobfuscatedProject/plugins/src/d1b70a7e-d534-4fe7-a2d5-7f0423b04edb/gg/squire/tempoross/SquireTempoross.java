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
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.a;
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.d;
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.e;
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.f;
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.g;
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.h;
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.i;
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.j;
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.k;
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.m;
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.n;
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.p;
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.q;
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.r;
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.s;
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.t;
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.u;
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.v;
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.w;

@PluginDescriptor(name="Squire Tempoross", enabledByDefault=false)
public class SquireTempoross
extends SquirePlugin {
    private static /* synthetic */ int[] lIIllIllllIll;
    @Inject
    private /* synthetic */ a d;
    private static /* synthetic */ String[] lIIllIllllIlI;
    @Inject
    private /* synthetic */ OverlayManager a;
    @Inject
    private /* synthetic */ EventBus b;
    @Inject
    private /* synthetic */ TemporossInfoBox c;

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
        SquireTempoross.lIIllIllllIlI[SquireTempoross.lIIllIllllIll[1]] = SquireTempoross.lIllIIIlllIlIll("NggWJx0=", "rgcTx");
        SquireTempoross.lIIllIllllIlI[SquireTempoross.lIIllIllllIll[2]] = SquireTempoross.lIllIIIlllIllII("asqE0fvbaTM=", "sxPtH");
    }

    public NPC d(WorldPoint worldPoint) {
        Player player = Players.getLocal();
        TilePath tilePath = Movement.getPath((WorldPoint)worldPoint);
        player.getInteracting();
        "".length();
        List<WorldPoint> list = this.h();
        List list2 = list.stream().filter(arg_0 -> SquireTempoross.a((List)tilePath, arg_0)).collect(Collectors.toList());
        return NPCs.getNearest(nPC -> {
            int n2;
            if (SquireTempoross.lIllIIIllllIlII(nPC.getId(), lIIllIllllIll[32])) {
                String[] stringArray = new String[lIIllIllllIll[2]];
                stringArray[SquireTempoross.lIIllIllllIll[1]] = lIIllIllllIlI[lIIllIllllIll[2]];
                if (SquireTempoross.lIllIIIllllIIlI(nPC.hasAction(stringArray) ? 1 : 0) && SquireTempoross.lIllIIIllllIIlI(list2.stream().anyMatch(worldPoint -> nPC.getWorldArea().contains(worldPoint)) ? 1 : 0)) {
                    n2 = lIIllIllllIll[2];
                    "".length();
                    if (null == null) return n2 != 0;
                    return ((0xFB ^ 0xAF) & ~(0x71 ^ 0x25)) != 0;
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
            void llllllllllllllIlllIllIlIlIlllllI;
            if (SquireTempoross.lIllIIIllllIIII(Movement.shouldWalk() ? 1 : 0)) {
                return lIIllIllllIll[1];
            }
            Movement.walk((WorldPoint)llllllllllllllIlllIllIlIlIlllllI);
            return lIIllIllllIll[2];
        }
        return lIIllIllllIll[1];
    }

    private static /* synthetic */ boolean a(List list, WorldPoint worldPoint) {
        return list.stream().anyMatch(worldPoint2 -> {
            boolean bl;
            if (SquireTempoross.lIllIIIllllIllI(SquireTempoross.lIllIIIllllIlIl(worldPoint2.distanceTo2D(worldPoint), 1.5))) {
                bl = lIIllIllllIll[2];
                "".length();
                if (((0x55 ^ 0x4A) & ~(0xBC ^ 0xA3)) != 0) {
                    return ((0xE0 ^ 0xC3) & ~(0x9F ^ 0xBC)) != 0;
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

    private static String lIllIIIlllIlIll(String llllllllllllllIlllIllIlIlIIIIIll, String llllllllllllllIlllIllIlIlIIIIIlI) {
        llllllllllllllIlllIllIlIlIIIIIll = new String(Base64.getDecoder().decode(llllllllllllllIlllIllIlIlIIIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIllIlIlIIIIllI = new StringBuilder();
        char[] llllllllllllllIlllIllIlIlIIIIlIl = llllllllllllllIlllIllIlIlIIIIIlI.toCharArray();
        int llllllllllllllIlllIllIlIlIIIIlII = lIIllIllllIll[1];
        char[] llllllllllllllIlllIllIlIIllllllI = llllllllllllllIlllIllIlIlIIIIIll.toCharArray();
        int llllllllllllllIlllIllIlIIlllllIl = llllllllllllllIlllIllIlIIllllllI.length;
        int llllllllllllllIlllIllIlIIlllllII = lIIllIllllIll[1];
        while (SquireTempoross.lIllIIIllllIlll(llllllllllllllIlllIllIlIIlllllII, llllllllllllllIlllIllIlIIlllllIl)) {
            char llllllllllllllIlllIllIlIlIIIlIIl = llllllllllllllIlllIllIlIIllllllI[llllllllllllllIlllIllIlIIlllllII];
            llllllllllllllIlllIllIlIlIIIIllI.append((char)(llllllllllllllIlllIllIlIlIIIlIIl ^ llllllllllllllIlllIllIlIlIIIIlIl[llllllllllllllIlllIllIlIlIIIIlII % llllllllllllllIlllIllIlIlIIIIlIl.length]));
            "".length();
            ++llllllllllllllIlllIllIlIlIIIIlII;
            ++llllllllllllllIlllIllIlIIlllllII;
            "".length();
            if ("  ".length() > 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIlllIllIlIlIIIIllI);
    }

    public boolean a(Actor actor) {
        if (SquireTempoross.lIllIIIlllIllll(actor)) {
            return this.c(actor.getWorldLocation());
        }
        return lIIllIllllIll[2];
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lIIllIllllIll[0]];
        classArray[SquireTempoross.lIIllIllllIll[1]] = v.class;
        classArray[SquireTempoross.lIIllIllllIll[2]] = w.class;
        classArray[SquireTempoross.lIIllIllllIll[3]] = d.class;
        classArray[SquireTempoross.lIIllIllllIll[4]] = t.class;
        classArray[SquireTempoross.lIIllIllllIll[5]] = r.class;
        classArray[SquireTempoross.lIIllIllllIll[6]] = q.class;
        classArray[SquireTempoross.lIIllIllllIll[7]] = h.class;
        classArray[SquireTempoross.lIIllIllllIll[8]] = r.class;
        classArray[SquireTempoross.lIIllIllllIll[9]] = s.class;
        classArray[SquireTempoross.lIIllIllllIll[10]] = u.class;
        classArray[SquireTempoross.lIIllIllllIll[11]] = g.class;
        classArray[SquireTempoross.lIIllIllllIll[12]] = n.class;
        classArray[SquireTempoross.lIIllIllllIll[13]] = m.class;
        classArray[SquireTempoross.lIIllIllllIll[14]] = j.class;
        classArray[SquireTempoross.lIIllIllllIll[15]] = e.class;
        classArray[SquireTempoross.lIIllIllllIll[16]] = i.class;
        classArray[SquireTempoross.lIIllIllllIll[17]] = p.class;
        classArray[SquireTempoross.lIIllIllllIll[18]] = f.class;
        classArray[SquireTempoross.lIIllIllllIll[19]] = k.class;
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
        "".length();
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
        "".length();
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
        "".length();
        return stream.noneMatch(arg_0 -> ((WorldPoint)worldPoint2).equals(arg_0));
    }

    private static String lIllIIIlllIllII(String llllllllllllllIlllIllIlIlIIlIllI, String llllllllllllllIlllIllIlIlIIlIlIl) {
        try {
            SecretKeySpec llllllllllllllIlllIllIlIlIIllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllIlIlIIlIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIllIlIlIIllIlI = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIllIlIlIIllIlI.init(lIIllIllllIll[3], llllllllllllllIlllIllIlIlIIllIll);
            return new String(llllllllllllllIlllIllIlIlIIllIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllIlIlIIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIllIlIlIIllIIl) {
            llllllllllllllIlllIllIlIlIIllIIl.printStackTrace();
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
        void llllllllllllllIlllIllIlIlIllIlII;
        if (SquireTempoross.lIllIIIllllIIIl(nPC)) {
            return null;
        }
        WorldPoint llllllllllllllIlllIllIlIlIllIIll = llllllllllllllIlllIllIlIlIllIlII.getWorldLocation().dy(lIIllIllllIll[21]);
        if (SquireTempoross.lIllIIIllllIIlI(Reachable.isWalkable((WorldPoint)llllllllllllllIlllIllIlIlIllIIll) ? 1 : 0)) {
            return llllllllllllllIlllIllIlIlIllIIll;
        }
        WorldPoint llllllllllllllIlllIllIlIlIllIIlI = llllllllllllllIlllIllIlIlIllIlII.getWorldLocation().dx(lIIllIllllIll[2]);
        if (SquireTempoross.lIllIIIllllIIlI(Reachable.isWalkable((WorldPoint)llllllllllllllIlllIllIlIlIllIIlI) ? 1 : 0)) {
            return llllllllllllllIlllIllIlIlIllIIlI;
        }
        WorldPoint llllllllllllllIlllIllIlIlIllIIIl = llllllllllllllIlllIllIlIlIllIlII.getWorldLocation().dy(lIIllIllllIll[2]);
        if (SquireTempoross.lIllIIIllllIIlI(Reachable.isWalkable((WorldPoint)llllllllllllllIlllIllIlIlIllIIIl) ? 1 : 0)) {
            return llllllllllllllIlllIllIlIlIllIIIl;
        }
        WorldPoint llllllllllllllIlllIllIlIlIllIIII = llllllllllllllIlllIllIlIlIllIlII.getWorldLocation().dx(lIIllIllllIll[21]);
        if (SquireTempoross.lIllIIIllllIIlI(Reachable.isWalkable((WorldPoint)llllllllllllllIlllIllIlIlIllIIII) ? 1 : 0)) {
            return llllllllllllllIlllIllIlIlIllIIII;
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

    private static void lIllIIIlllIlllI() {
        lIIllIllllIll = new int[33];
        SquireTempoross.lIIllIllllIll[0] = 114 + 35 - -7 + 34 ^ 56 + 108 - 62 + 71;
        SquireTempoross.lIIllIllllIll[1] = (0x72 ^ 0x48) & ~(0xB9 ^ 0x83);
        SquireTempoross.lIIllIllllIll[2] = " ".length();
        SquireTempoross.lIIllIllllIll[3] = "  ".length();
        SquireTempoross.lIIllIllllIll[4] = "   ".length();
        SquireTempoross.lIIllIllllIll[5] = 0x8B ^ 0x8F;
        SquireTempoross.lIIllIllllIll[6] = 0x84 ^ 0x81;
        SquireTempoross.lIIllIllllIll[7] = 0x62 ^ 0x64;
        SquireTempoross.lIIllIllllIll[8] = 0x23 ^ 0x24;
        SquireTempoross.lIIllIllllIll[9] = 0x49 ^ 0x30 ^ (0xC2 ^ 0xB3);
        SquireTempoross.lIIllIllllIll[10] = 0xBC ^ 0xB5;
        SquireTempoross.lIIllIllllIll[11] = 0x79 ^ 0x73;
        SquireTempoross.lIIllIllllIll[12] = 0xB5 ^ 0xBE;
        SquireTempoross.lIIllIllllIll[13] = 0x61 ^ 0x6D;
        SquireTempoross.lIIllIllllIll[14] = 27 + 35 - 42 + 144 ^ 85 + 25 - 10 + 69;
        SquireTempoross.lIIllIllllIll[15] = 0x56 ^ 0x58;
        SquireTempoross.lIIllIllllIll[16] = 0xD2 ^ 0xB0 ^ (0xE3 ^ 0x8E);
        SquireTempoross.lIIllIllllIll[17] = 0x2B ^ 0x3B;
        SquireTempoross.lIIllIllllIll[18] = 83 + 53 - 47 + 54 ^ 44 + 94 - -10 + 10;
        SquireTempoross.lIIllIllllIll[19] = 0xD5 ^ 0xC7;
        SquireTempoross.lIIllIllllIll[20] = 0x26 ^ 5;
        SquireTempoross.lIIllIllllIll[21] = -" ".length();
        SquireTempoross.lIIllIllllIll[22] = 0xF ^ 0x38;
        SquireTempoross.lIIllIllllIll[23] = 0xC ^ 0x21;
        SquireTempoross.lIIllIllllIll[24] = -(0xFFFFCF37 & 0x3CEC) & (0xFFFFFFFF & 0x6FFF);
        SquireTempoross.lIIllIllllIll[25] = 0xFFFFFBDF & 0x67FD;
        SquireTempoross.lIIllIllllIll[26] = -(0x9B ^ 0xB9) & (0xFFFFE3FF & Short.MAX_VALUE);
        SquireTempoross.lIIllIllllIll[27] = 0xA8 ^ 0x9A;
        SquireTempoross.lIIllIllllIll[28] = 0xFFFFB57E & 0xEAAF;
        SquireTempoross.lIIllIllllIll[29] = -(0xFFFFE833 & 0x7FDD) & (0xFFFFFEDF & 0xFBFE);
        SquireTempoross.lIIllIllllIll[30] = 0xFFFFA7ED & 0x5F9B;
        SquireTempoross.lIIllIllllIll[31] = 0xFFFF9EF3 & 0x6BDF;
        SquireTempoross.lIIllIllllIll[32] = -(0xFFFFDD9B & 0x3A7D) & (0xFFFFBFDB & 0x79FF);
    }
}

