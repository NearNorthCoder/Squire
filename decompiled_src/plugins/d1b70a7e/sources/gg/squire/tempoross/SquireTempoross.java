package gg.squire.tempoross;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
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
import p.s.o.t.u.m.r.s.i.e.s.p000.o.e.r.q.a;
import p.s.o.t.u.m.r.s.i.e.s.p000.o.e.r.q.d;
import p.s.o.t.u.m.r.s.i.e.s.p000.o.e.r.q.e;
import p.s.o.t.u.m.r.s.i.e.s.p000.o.e.r.q.f;
import p.s.o.t.u.m.r.s.i.e.s.p000.o.e.r.q.g;
import p.s.o.t.u.m.r.s.i.e.s.p000.o.e.r.q.h;
import p.s.o.t.u.m.r.s.i.e.s.p000.o.e.r.q.i;
import p.s.o.t.u.m.r.s.i.e.s.p000.o.e.r.q.j;
import p.s.o.t.u.m.r.s.i.e.s.p000.o.e.r.q.k;
import p.s.o.t.u.m.r.s.i.e.s.p000.o.e.r.q.m;
import p.s.o.t.u.m.r.s.i.e.s.p000.o.e.r.q.n;
import p.s.o.t.u.m.r.s.i.e.s.p000.o.e.r.q.p;
import p.s.o.t.u.m.r.s.i.e.s.p000.o.e.r.q.q;
import p.s.o.t.u.m.r.s.i.e.s.p000.o.e.r.q.r;
import p.s.o.t.u.m.r.s.i.e.s.p000.o.e.r.q.s;
import p.s.o.t.u.m.r.s.i.e.s.p000.o.e.r.q.t;
import p.s.o.t.u.m.r.s.i.e.s.p000.o.e.r.q.u;
import p.s.o.t.u.m.r.s.i.e.s.p000.o.e.r.q.v;
import p.s.o.t.u.m.r.s.i.e.s.p000.o.e.r.q.w;
@PluginDescriptor(name = "Squire Tempoross", enabledByDefault = false)
/* loaded from: d1b70a7e-d534-4fe7-a2d5-7f0423b04edb.jar:gg/squire/tempoross/SquireTempoross.class */
public class SquireTempoross extends SquirePlugin {
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
        if (lIllIIIlllIllll(sceneEntity)) {
            return d(sceneEntity.getWorldLocation());
        }
        return null;
    }

    private static boolean lIllIIIllllIIII(int i) {
        return i == 0;
    }

    public int a() {
        Widget widget = Widgets.get(WidgetInfo.TEMPOROSS_STATUS_INDICATOR.getGroupId(), lIIllIllllIll[20]);
        int i = lIIllIllllIll[21];
        if (lIllIIIlllIllll(widget) && lIllIIIlllIllll(widget.getText())) {
            String text = widget.getText();
            i = Integer.parseInt(text.substring(lIIllIllllIll[9], text.length() - lIIllIllllIll[2]));
        }
        return i;
    }

    private static boolean lIllIIIllllIIlI(int i) {
        return i != 0;
    }

    private static boolean lIllIIIllllIlll(int i, int i2) {
        return i < i2;
    }

    private static void lIllIIIlllIllIl() {
        lIIllIllllIlI = new String[lIIllIllllIll[3]];
        lIIllIllllIlI[lIIllIllllIll[1]] = lIllIIIlllIlIll("NggWJx0=", "rgcTx");
        lIIllIllllIlI[lIIllIllllIll[2]] = lIllIIIlllIllII("asqE0fvbaTM=", "sxPtH");
    }

    public NPC d(WorldPoint worldPoint) {
        Player local = Players.getLocal();
        TilePath path = Movement.getPath(worldPoint);
        local.getInteracting();
        "".length();
        List list = (List) h().stream().filter(worldPoint2 -> {
            return path.stream().anyMatch(worldPoint2 -> {
                if (lIllIIIllllIllI(lIllIIIllllIlIl(worldPoint2.distanceTo2D(worldPoint2), 1.5d))) {
                    ?? r0 = lIIllIllllIll[2];
                    "".length();
                    return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIIllIllllIll[1];
            });
        }).collect(Collectors.toList());
        return NPCs.getNearest(npc -> {
            if (lIllIIIllllIlII(npc.getId(), lIIllIllllIll[32])) {
                String[] strArr = new String[lIIllIllllIll[2]];
                strArr[lIIllIllllIll[1]] = lIIllIllllIlI[lIIllIllllIll[2]];
                if (lIllIIIllllIIlI(npc.hasAction(strArr) ? 1 : 0) && lIllIIIllllIIlI(list.stream().anyMatch(worldPoint3 -> {
                    return npc.getWorldArea().contains(worldPoint3);
                }) ? 1 : 0)) {
                    ?? r0 = lIIllIllllIll[2];
                    "".length();
                    return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
            return lIIllIllllIll[1];
        });
    }

    public boolean b(SceneEntity sceneEntity) {
        return b(a(sceneEntity));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean b(WorldPoint worldPoint) {
        if (lIllIIIllllIIII(a(worldPoint) ? 1 : 0) && !lIllIIIllllIIII(Movement.shouldWalk() ? 1 : 0)) {
            Movement.walk(worldPoint);
            return lIIllIllllIll[2];
        }
        return lIIllIllllIll[1];
    }

    public boolean a(Locatable locatable) {
        return a(locatable.getWorldLocation());
    }

    private static String lIllIIIlllIlIll(String llllllllllllllIlllIllIlIlIIIlIII, String llllllllllllllIlllIllIlIlIIIIlll) {
        String llllllllllllllIlllIllIlIlIIIlIII2 = new String(Base64.getDecoder().decode(llllllllllllllIlllIllIlIlIIIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIllIlIlIIIIllI = new StringBuilder();
        char[] llllllllllllllIlllIllIlIlIIIIlIl = llllllllllllllIlllIllIlIlIIIIlll.toCharArray();
        int llllllllllllllIlllIllIlIlIIIIlII = lIIllIllllIll[1];
        char[] charArray = llllllllllllllIlllIllIlIlIIIlIII2.toCharArray();
        int length = charArray.length;
        int i = lIIllIllllIll[1];
        while (lIllIIIllllIlll(i, length)) {
            llllllllllllllIlllIllIlIlIIIIllI.append((char) (charArray[i] ^ llllllllllllllIlllIllIlIlIIIIlIl[llllllllllllllIlllIllIlIlIIIIlII % llllllllllllllIlllIllIlIlIIIIlIl.length]));
            "".length();
            llllllllllllllIlllIllIlIlIIIIlII++;
            i++;
            "".length();
            if ("  ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIlllIllIlIlIIIIllI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    public boolean a(Actor actor) {
        return lIllIIIlllIllll(actor) ? c(actor.getWorldLocation()) : lIIllIllllIll[2];
    }

    protected Class<?>[] tasks() {
        Class<?>[] clsArr = new Class[lIIllIllllIll[0]];
        clsArr[lIIllIllllIll[1]] = v.class;
        clsArr[lIIllIllllIll[2]] = w.class;
        clsArr[lIIllIllllIll[3]] = d.class;
        clsArr[lIIllIllllIll[4]] = t.class;
        clsArr[lIIllIllllIll[5]] = r.class;
        clsArr[lIIllIllllIll[6]] = q.class;
        clsArr[lIIllIllllIll[7]] = h.class;
        clsArr[lIIllIllllIll[8]] = r.class;
        clsArr[lIIllIllllIll[9]] = s.class;
        clsArr[lIIllIllllIll[10]] = u.class;
        clsArr[lIIllIllllIll[11]] = g.class;
        clsArr[lIIllIllllIll[12]] = n.class;
        clsArr[lIIllIllllIll[13]] = m.class;
        clsArr[lIIllIllllIll[14]] = j.class;
        clsArr[lIIllIllllIll[15]] = e.class;
        clsArr[lIIllIllllIll[16]] = i.class;
        clsArr[lIIllIllllIll[17]] = p.class;
        clsArr[lIIllIllllIll[18]] = f.class;
        clsArr[lIIllIllllIll[19]] = k.class;
        return clsArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    public boolean b(NPC npc) {
        Player local = Players.getLocal();
        if (lIllIIIlllIllll(npc)) {
            int[] iArr = new int[lIIllIllllIll[2]];
            iArr[lIIllIllllIll[1]] = lIIllIllllIll[30];
            if (lIllIIIllllIIlI(Inventory.contains(iArr) ? 1 : 0) && lIllIIIllllIIII(npc.equals(local.getInteracting()) ? 1 : 0) && lIllIIIllllIIll(local.getAnimation(), lIIllIllllIll[31])) {
                npc.interact(lIIllIllllIlI[lIIllIllllIll[1]]);
                return lIIllIllllIll[2];
            }
        }
        return lIIllIllllIll[1];
    }

    protected void onStart() {
        this.d.y();
        this.d.a(StopWatch.start());
        this.b.register(this.d);
        this.a.add(this.c);
        "".length();
    }

    private List<WorldPoint> i() {
        WorldPoint worldLocation = Players.getLocal().getWorldLocation();
        int i = lIIllIllllIll[27];
        int[] iArr = new int[lIIllIllllIll[2]];
        iArr[lIIllIllllIll[1]] = lIIllIllllIll[28];
        return (List) TileObjects.getSurrounding(worldLocation, i, iArr).stream().filter(tileObject -> {
            return tileObject instanceof GameObject;
        }).flatMap(tileObject2 -> {
            return ((GameObject) tileObject2).getWorldArea().toWorldPointList().stream();
        }).collect(Collectors.toList());
    }

    private List<WorldPoint> h() {
        WorldPoint worldLocation = Players.getLocal().getWorldLocation();
        int i = lIIllIllllIll[27];
        int[] iArr = new int[lIIllIllllIll[2]];
        iArr[lIIllIllllIll[1]] = lIIllIllllIll[29];
        return (List) TileObjects.getSurrounding(worldLocation, i, iArr).stream().filter(tileObject -> {
            return tileObject instanceof GameObject;
        }).flatMap(tileObject2 -> {
            return ((GameObject) tileObject2).getWorldArea().toWorldPointList().stream();
        }).collect(Collectors.toList());
    }

    private static boolean lIllIIIlllIllll(Object obj) {
        return obj != null;
    }

    public int b() {
        Widget widget = Widgets.get(WidgetInfo.TEMPOROSS_STATUS_INDICATOR.getGroupId(), lIIllIllllIll[22]);
        int i = lIIllIllllIll[21];
        if (lIllIIIlllIllll(widget) && lIllIIIlllIllll(widget.getText())) {
            String text = widget.getText();
            i = Integer.parseInt(text.substring(lIIllIllllIll[18], text.length() - lIIllIllllIll[2]));
        }
        return i;
    }

    public int e() {
        int[] iArr = new int[lIIllIllllIll[2]];
        iArr[lIIllIllllIll[1]] = lIIllIllllIll[25];
        int count = Inventory.getCount(iArr);
        int[] iArr2 = new int[lIIllIllllIll[2]];
        iArr2[lIIllIllllIll[1]] = lIIllIllllIll[26];
        return count + Inventory.getCount(iArr2);
    }

    public boolean b(Locatable locatable) {
        return b(locatable.getWorldLocation());
    }

    static {
        lIllIIIlllIlllI();
        lIllIIIlllIllIl();
    }

    private List<WorldPoint> g() {
        WorldPoint worldLocation = Players.getLocal().getWorldLocation();
        int i = lIIllIllllIll[27];
        int[] iArr = new int[lIIllIllllIll[3]];
        iArr[lIIllIllllIll[1]] = lIIllIllllIll[28];
        iArr[lIIllIllllIll[2]] = lIIllIllllIll[29];
        return (List) TileObjects.getSurrounding(worldLocation, i, iArr).stream().filter(tileObject -> {
            return tileObject instanceof GameObject;
        }).flatMap(tileObject2 -> {
            return ((GameObject) tileObject2).getWorldArea().toWorldPointList().stream();
        }).collect(Collectors.toList());
    }

    private static int lIllIIIllllIlIl(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    protected void onStop() {
        this.b.unregister(this.d);
        this.a.remove(this.c);
        "".length();
    }

    private static boolean lIllIIIllllIlII(int i, int i2) {
        return i == i2;
    }

    public int d() {
        int[] iArr = new int[lIIllIllllIll[2]];
        iArr[lIIllIllllIll[1]] = lIIllIllllIll[24];
        return Inventory.getCount(iArr);
    }

    @Provides
    SquireTemporossConfig a(ConfigManager configManager) {
        return (SquireTemporossConfig) configManager.getConfig(SquireTemporossConfig.class);
    }

    public boolean c(WorldPoint worldPoint) {
        Stream<WorldPoint> stream = g().stream();
        Objects.requireNonNull(worldPoint);
        "".length();
        return stream.noneMatch((v1) -> {
            return r1.equals(v1);
        });
    }

    private static String lIllIIIlllIllII(String llllllllllllllIlllIllIlIlIIllIII, String llllllllllllllIlllIllIlIlIIlIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllIlIlIIlIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIllIlIlIIllIlI = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIllIlIlIIllIlI.init(lIIllIllllIll[3], secretKeySpec);
            return new String(llllllllllllllIlllIllIlIlIIllIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllIlIlIIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIllIlIlIIllIIl) {
            llllllllllllllIlllIllIlIlIIllIIl.printStackTrace();
            return null;
        }
    }

    public boolean e(WorldPoint worldPoint) {
        return b(d(worldPoint));
    }

    public WorldPoint a(NPC npc) {
        if (lIllIIIllllIIIl(npc)) {
            return null;
        }
        WorldPoint dy = npc.getWorldLocation().dy(lIIllIllllIll[21]);
        if (lIllIIIllllIIlI(Reachable.isWalkable(dy) ? 1 : 0)) {
            return dy;
        }
        WorldPoint dx = npc.getWorldLocation().dx(lIIllIllllIll[2]);
        if (lIllIIIllllIIlI(Reachable.isWalkable(dx) ? 1 : 0)) {
            return dx;
        }
        WorldPoint dy2 = npc.getWorldLocation().dy(lIIllIllllIll[2]);
        if (lIllIIIllllIIlI(Reachable.isWalkable(dy2) ? 1 : 0)) {
            return dy2;
        }
        WorldPoint dx2 = npc.getWorldLocation().dx(lIIllIllllIll[21]);
        if (lIllIIIllllIIlI(Reachable.isWalkable(dx2) ? 1 : 0)) {
            return dx2;
        }
        return null;
    }

    private static boolean lIllIIIllllIllI(int i) {
        return i < 0;
    }

    public boolean a(WorldPoint worldPoint) {
        TilePath path = Movement.getPath(worldPoint);
        List<WorldPoint> g = g();
        return path.stream().anyMatch(worldPoint2 -> {
            return g.stream().anyMatch(worldPoint2 -> {
                return worldPoint2.equals(worldPoint2);
            });
        });
    }

    public int c() {
        Widget widget = Widgets.get(WidgetInfo.TEMPOROSS_STATUS_INDICATOR.getGroupId(), lIIllIllllIll[23]);
        int i = lIIllIllllIll[21];
        if (lIllIIIlllIllll(widget.getText())) {
            String text = widget.getText();
            i = Integer.parseInt(text.substring(lIIllIllllIll[10], text.length() - lIIllIllllIll[2]));
        }
        return i;
    }

    private static boolean lIllIIIllllIIIl(Object obj) {
        return obj == null;
    }

    private static boolean lIllIIIllllIIll(int i, int i2) {
        return i != i2;
    }

    public int f() {
        return d() + e();
    }

    private static void lIllIIIlllIlllI() {
        lIIllIllllIll = new int[33];
        lIIllIllllIll[0] = (((114 + 35) - (-7)) + 34) ^ (((56 + 108) - 62) + 71);
        lIIllIllllIll[1] = (114 ^ 72) & ((185 ^ 131) ^ (-1));
        lIIllIllllIll[2] = " ".length();
        lIIllIllllIll[3] = "  ".length();
        lIIllIllllIll[4] = "   ".length();
        lIIllIllllIll[5] = 139 ^ 143;
        lIIllIllllIll[6] = 132 ^ 129;
        lIIllIllllIll[7] = 98 ^ 100;
        lIIllIllllIll[8] = 35 ^ 36;
        lIIllIllllIll[9] = (73 ^ 48) ^ (194 ^ 179);
        lIIllIllllIll[10] = 188 ^ 181;
        lIIllIllllIll[11] = 121 ^ 115;
        lIIllIllllIll[12] = 181 ^ 190;
        lIIllIllllIll[13] = 97 ^ 109;
        lIIllIllllIll[14] = (((27 + 35) - 42) + 144) ^ (((85 + 25) - 10) + 69);
        lIIllIllllIll[15] = 86 ^ 88;
        lIIllIllllIll[16] = (210 ^ 176) ^ (227 ^ 142);
        lIIllIllllIll[17] = 43 ^ 59;
        lIIllIllllIll[18] = (((83 + 53) - 47) + 54) ^ (((44 + 94) - (-10)) + 10);
        lIIllIllllIll[19] = 213 ^ 199;
        lIIllIllllIll[20] = 38 ^ 5;
        lIIllIllllIll[21] = -" ".length();
        lIIllIllllIll[22] = 15 ^ 56;
        lIIllIllllIll[23] = 12 ^ 33;
        lIIllIllllIll[24] = (-((-12489) & 15596)) & (-1) & 28671;
        lIIllIllllIll[25] = (-1057) & 26621;
        lIIllIllllIll[26] = (-(155 ^ 185)) & (-7169) & 32767;
        lIIllIllllIll[27] = 168 ^ 154;
        lIIllIllllIll[28] = (-19074) & 60079;
        lIIllIllllIll[29] = (-((-6093) & 32733)) & (-289) & 64510;
        lIIllIllllIll[30] = (-22547) & 24475;
        lIIllIllllIll[31] = (-24845) & 27615;
        lIIllIllllIll[32] = (-((-8805) & 14973)) & (-16421) & 31231;
    }
}
