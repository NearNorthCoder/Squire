package s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.thieving.SquireThievingConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.ChatMessageType;
import net.runelite.api.InventoryID;
import net.runelite.api.Item;
import net.runelite.api.ItemContainer;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileItem;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.ProjectileSpawned;
import net.runelite.api.widgets.Widget;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.commons.Predicates;
import net.unethicalite.api.coords.Area;
import net.unethicalite.api.coords.RectangularArea;
import net.unethicalite.api.coords.ScenePoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;
@TaskDesc(name = "Rogues Den", register = true)
/* renamed from: s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.H  reason: invalid package */
/* loaded from: squire-thieving-0.0.1.jar:s/r/i/t/g/n/-/u/h/i/q/i/e/v/e/H.class */
public class H extends Task {
    public static final /* synthetic */ WorldPoint aB;
    private final /* synthetic */ SquireThievingConfig aF;
    private static /* synthetic */ boolean aD;
    public static final /* synthetic */ WorldPoint aA;
    private /* synthetic */ boolean aI;
    public static final /* synthetic */ WorldPoint az;
    private static /* synthetic */ String[] lIIllIllIllll;
    public static final /* synthetic */ Area aC;
    private static /* synthetic */ int[] lIIllIlllIlIl;
    public static final /* synthetic */ List<C0006g> aE;
    private /* synthetic */ boolean aG = lIIllIlllIlIl[0];
    private /* synthetic */ boolean aH = lIIllIlllIlIl[1];

    private static void O() {
        WorldPoint worldPoint = aB;
        String[] strArr = new String[lIIllIlllIlIl[0]];
        strArr[lIIllIlllIlIl[1]] = lIIllIllIllll[lIIllIlllIlIl[7]];
        TileItems.getFirstAt(worldPoint, Predicates.names(strArr)).interact(lIIllIllIllll[lIIllIlllIlIl[5]]);
    }

    private static boolean lIllIIIlllIlIII(int i, int i2) {
        return i == i2;
    }

    private static boolean lIllIIIlllIlIlI(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static void L() {
        WorldPoint worldPoint = az;
        int[] iArr = new int[lIIllIlllIlIl[0]];
        iArr[lIIllIlllIlIl[1]] = lIIllIlllIlIl[2];
        TileItem firstAt = TileItems.getFirstAt(worldPoint, Predicates.ids(iArr));
        if (lIllIIIlllIIlIl(firstAt)) {
            return;
        }
        firstAt.interact(lIIllIllIllll[lIIllIlllIlIl[1]]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (!(lIllIIIlllIlIlI(chatMessage.getType(), ChatMessageType.GAMEMESSAGE) && lIllIIIlllIlIlI(chatMessage.getType(), ChatMessageType.SPAM)) && lIllIIIlllIIlll(chatMessage.getMessage().contains(lIIllIllIllll[lIIllIlllIlIl[30]]) ? 1 : 0)) {
            this.aI = lIIllIlllIlIl[0];
            aD = lIIllIlllIlIl[1];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void N() {
        Widget widget = Widgets.get(lIIllIlllIlIl[4], lIIllIlllIlIl[5]);
        if (lIllIIIlllIIllI(widget) && !lIllIIIlllIIlll(widget.isHidden() ? 1 : 0)) {
            widget.interact(lIIllIllIllll[lIIllIlllIlIl[6]]);
            return;
        }
        M();
        "".length();
        if (((117 ^ 17) ^ (198 ^ 166)) < 0) {
        }
    }

    private static boolean lIllIIIlllIllII(int i, int i2) {
        return i != i2;
    }

    private static boolean lIllIIIlllIlllI(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v115, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v120, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v123, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v216, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v109, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v115, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v121, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v127, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v133, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v139, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v145, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v151, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v157, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v163, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v185, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v195, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v67, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v93, types: [boolean] */
    static {
        lIllIIIlllIIlII();
        lIllIIIlllIIIll();
        az = new WorldPoint(lIIllIlllIlIl[37], lIIllIlllIlIl[38], lIIllIlllIlIl[0]);
        aA = new WorldPoint(lIIllIlllIlIl[39], lIIllIlllIlIl[40], lIIllIlllIlIl[0]);
        aB = new WorldPoint(lIIllIlllIlIl[13], lIIllIlllIlIl[41], lIIllIlllIlIl[0]);
        aC = new RectangularArea(lIIllIlllIlIl[42], lIIllIlllIlIl[43], lIIllIlllIlIl[44], lIIllIlllIlIl[16], lIIllIlllIlIl[0]);
        C0006g[] c0006gArr = new C0006g[lIIllIlllIlIl[45]];
        c0006gArr[lIIllIlllIlIl[1]] = C0006g.a(lIIllIlllIlIl[46], lIIllIlllIlIl[47]).b(lIIllIlllIlIl[48], lIIllIlllIlIl[49]);
        c0006gArr[lIIllIlllIlIl[0]] = C0006g.a(lIIllIlllIlIl[50], lIIllIlllIlIl[51]).b(lIIllIlllIlIl[52], lIIllIlllIlIl[47]);
        c0006gArr[lIIllIlllIlIl[3]] = C0006g.a(lIIllIlllIlIl[53], lIIllIlllIlIl[51]).b(lIIllIlllIlIl[50], lIIllIlllIlIl[51]);
        c0006gArr[lIIllIlllIlIl[6]] = C0006g.a(lIIllIlllIlIl[54], lIIllIlllIlIl[55]).b(lIIllIlllIlIl[53], lIIllIlllIlIl[51]);
        c0006gArr[lIIllIlllIlIl[7]] = C0006g.a(lIIllIlllIlIl[42], lIIllIlllIlIl[55]).b(lIIllIlllIlIl[39], lIIllIlllIlIl[55]);
        c0006gArr[lIIllIlllIlIl[5]] = C0006g.a(lIIllIlllIlIl[56], lIIllIlllIlIl[57]).b(lIIllIlllIlIl[42], lIIllIlllIlIl[55]);
        c0006gArr[lIIllIlllIlIl[8]] = C0006g.a(lIIllIlllIlIl[58], lIIllIlllIlIl[59], (boolean) lIIllIlllIlIl[0]).b(lIIllIlllIlIl[60], lIIllIlllIlIl[57]);
        c0006gArr[lIIllIlllIlIl[17]] = C0006g.a(lIIllIlllIlIl[61], lIIllIlllIlIl[62], (boolean) lIIllIlllIlIl[0]).b(lIIllIlllIlIl[63], lIIllIlllIlIl[59]);
        c0006gArr[lIIllIlllIlIl[20]] = C0006g.a(lIIllIlllIlIl[64], lIIllIlllIlIl[65], lIIllIllIllll[lIIllIlllIlIl[66]], (boolean) lIIllIlllIlIl[0]).b(lIIllIlllIlIl[61], lIIllIlllIlIl[62]);
        c0006gArr[lIIllIlllIlIl[21]] = C0006g.a(lIIllIlllIlIl[67], lIIllIlllIlIl[68], lIIllIllIllll[lIIllIlllIlIl[69]], (boolean) lIIllIlllIlIl[0]).b(lIIllIlllIlIl[64], lIIllIlllIlIl[70]);
        c0006gArr[lIIllIlllIlIl[22]] = C0006g.a(lIIllIlllIlIl[71], lIIllIlllIlIl[72]).b(lIIllIlllIlIl[67], lIIllIlllIlIl[68]);
        c0006gArr[lIIllIlllIlIl[24]] = C0006g.a(lIIllIlllIlIl[71], lIIllIlllIlIl[73]).b(lIIllIlllIlIl[71], lIIllIlllIlIl[74]).b(lIIllIlllIlIl[71], lIIllIlllIlIl[75]);
        c0006gArr[lIIllIlllIlIl[25]] = C0006g.a(lIIllIlllIlIl[76], lIIllIlllIlIl[77], (boolean) lIIllIlllIlIl[0]).b(lIIllIlllIlIl[71], lIIllIlllIlIl[78]);
        c0006gArr[lIIllIlllIlIl[26]] = C0006g.a(lIIllIlllIlIl[79], lIIllIlllIlIl[80]).b(lIIllIlllIlIl[76], lIIllIlllIlIl[77]);
        c0006gArr[lIIllIlllIlIl[28]] = C0006g.a(lIIllIlllIlIl[67], lIIllIlllIlIl[81]).b(lIIllIlllIlIl[79], lIIllIlllIlIl[82]);
        c0006gArr[lIIllIlllIlIl[29]] = C0006g.a(lIIllIlllIlIl[83], lIIllIlllIlIl[84]).b(lIIllIlllIlIl[67], lIIllIlllIlIl[81]);
        c0006gArr[lIIllIlllIlIl[30]] = C0006g.a(lIIllIlllIlIl[83], lIIllIlllIlIl[85]).b(lIIllIlllIlIl[83], lIIllIlllIlIl[85]);
        c0006gArr[lIIllIlllIlIl[31]] = C0006g.a(lIIllIlllIlIl[86], lIIllIlllIlIl[87]).b(lIIllIlllIlIl[83], lIIllIlllIlIl[88]);
        c0006gArr[lIIllIlllIlIl[32]] = C0006g.a(lIIllIlllIlIl[56], lIIllIlllIlIl[87], lIIllIllIllll[lIIllIlllIlIl[89]]).b(lIIllIlllIlIl[90], lIIllIlllIlIl[87]);
        c0006gArr[lIIllIlllIlIl[33]] = C0006g.a(lIIllIlllIlIl[91], lIIllIlllIlIl[92]).b(lIIllIlllIlIl[56], lIIllIlllIlIl[93]);
        c0006gArr[lIIllIlllIlIl[34]] = C0006g.a(H::L).d((boolean) lIIllIlllIlIl[0]).b(lIIllIlllIlIl[91], lIIllIlllIlIl[92]).a(worldPoint -> {
            boolean z;
            String[] strArr = new String[lIIllIlllIlIl[0]];
            strArr[lIIllIlllIlIl[1]] = lIIllIllIllll[lIIllIlllIlIl[36]];
            if (lIllIIIlllIIlIl(Inventory.getFirst(strArr)) && lIllIIIlllIlIII(worldPoint.getX(), az.getX()) && lIllIIIlllIlIII(worldPoint.getY(), az.getY())) {
                int i = lIIllIlllIlIl[0];
                "".length();
                z = i;
                if (0 != 0) {
                    return null;
                }
            } else {
                z = lIIllIlllIlIl[1];
            }
            return Boolean.valueOf(z);
        });
        c0006gArr[lIIllIlllIlIl[35]] = C0006g.a(H::M).d((boolean) lIIllIlllIlIl[0]).d(az);
        c0006gArr[lIIllIlllIlIl[36]] = C0006g.a(H::N).d((boolean) lIIllIlllIlIl[0]).d(aA);
        c0006gArr[lIIllIlllIlIl[66]] = C0006g.a(lIIllIlllIlIl[9], lIIllIlllIlIl[94], (boolean) lIIllIlllIlIl[0]).b(lIIllIlllIlIl[54], lIIllIlllIlIl[40]);
        c0006gArr[lIIllIlllIlIl[69]] = C0006g.a(lIIllIlllIlIl[53], lIIllIlllIlIl[95], (boolean) lIIllIlllIlIl[0]).a(lIIllIlllIlIl[96], lIIllIlllIlIl[95], lIIllIlllIlIl[97], lIIllIlllIlIl[94]);
        c0006gArr[lIIllIlllIlIl[89]] = C0006g.a(lIIllIlllIlIl[97], lIIllIlllIlIl[78], (boolean) lIIllIlllIlIl[0]).a(lIIllIlllIlIl[53], lIIllIlllIlIl[78], lIIllIlllIlIl[97], lIIllIlllIlIl[98]);
        c0006gArr[lIIllIlllIlIl[99]] = C0006g.a(lIIllIlllIlIl[50], lIIllIlllIlIl[94], (boolean) lIIllIlllIlIl[0]).a(lIIllIlllIlIl[100], lIIllIlllIlIl[101], lIIllIlllIlIl[50], lIIllIlllIlIl[94]);
        c0006gArr[lIIllIlllIlIl[102]] = C0006g.a(lIIllIlllIlIl[103], lIIllIlllIlIl[78], (boolean) lIIllIlllIlIl[0]).a(lIIllIlllIlIl[104], lIIllIlllIlIl[101], lIIllIlllIlIl[103], lIIllIlllIlIl[94]);
        c0006gArr[lIIllIlllIlIl[105]] = C0006g.a(lIIllIlllIlIl[106], lIIllIlllIlIl[72], (boolean) lIIllIlllIlIl[0]).a(lIIllIlllIlIl[107], lIIllIlllIlIl[72], lIIllIlllIlIl[106], lIIllIlllIlIl[98]);
        c0006gArr[lIIllIlllIlIl[108]] = C0006g.a(lIIllIlllIlIl[109], lIIllIlllIlIl[110], (boolean) lIIllIlllIlIl[0]).a(lIIllIlllIlIl[104], lIIllIlllIlIl[111], lIIllIlllIlIl[106], lIIllIlllIlIl[110]);
        c0006gArr[lIIllIlllIlIl[112]] = C0006g.a(lIIllIlllIlIl[104], lIIllIlllIlIl[113], (boolean) lIIllIlllIlIl[0]).a(lIIllIlllIlIl[104], lIIllIlllIlIl[72], lIIllIlllIlIl[103], lIIllIlllIlIl[114]);
        c0006gArr[lIIllIlllIlIl[115]] = C0006g.a(lIIllIlllIlIl[116], lIIllIlllIlIl[72], (boolean) lIIllIlllIlIl[0]).a(lIIllIlllIlIl[100], lIIllIlllIlIl[72], lIIllIlllIlIl[50], lIIllIlllIlIl[114]);
        c0006gArr[lIIllIlllIlIl[117]] = C0006g.a(lIIllIlllIlIl[44], lIIllIlllIlIl[118], (boolean) lIIllIlllIlIl[0]).b(lIIllIlllIlIl[116], lIIllIlllIlIl[110]);
        c0006gArr[lIIllIlllIlIl[119]] = C0006g.a(lIIllIlllIlIl[54], lIIllIlllIlIl[118]).b(lIIllIlllIlIl[44], lIIllIlllIlIl[118]);
        c0006gArr[lIIllIlllIlIl[120]] = C0006g.a(lIIllIlllIlIl[121], lIIllIlllIlIl[118]).b(lIIllIlllIlIl[54], lIIllIlllIlIl[118]);
        c0006gArr[lIIllIlllIlIl[122]] = C0006g.a(lIIllIlllIlIl[123], lIIllIlllIlIl[118]).b(lIIllIlllIlIl[124], lIIllIlllIlIl[118]);
        c0006gArr[lIIllIlllIlIl[125]] = C0006g.a(lIIllIlllIlIl[126], lIIllIlllIlIl[127]).b(lIIllIlllIlIl[13], lIIllIlllIlIl[118]);
        c0006gArr[lIIllIlllIlIl[128]] = C0006g.a(lIIllIlllIlIl[129], lIIllIlllIlIl[130], (boolean) lIIllIlllIlIl[0]).a(lIIllIlllIlIl[90], lIIllIlllIlIl[131], lIIllIlllIlIl[132], lIIllIlllIlIl[133]);
        c0006gArr[lIIllIlllIlIl[134]] = C0006g.a(lIIllIlllIlIl[129], lIIllIlllIlIl[135]).b(lIIllIlllIlIl[129], lIIllIlllIlIl[130]);
        c0006gArr[lIIllIlllIlIl[136]] = C0006g.a(lIIllIlllIlIl[129], lIIllIlllIlIl[111], (boolean) lIIllIlllIlIl[0]).b(lIIllIlllIlIl[129], lIIllIlllIlIl[135]);
        c0006gArr[lIIllIlllIlIl[137]] = C0006g.a(lIIllIlllIlIl[129], lIIllIlllIlIl[101]).b(lIIllIlllIlIl[129], lIIllIlllIlIl[111]);
        c0006gArr[lIIllIlllIlIl[138]] = C0006g.a(H::O).d((boolean) lIIllIlllIlIl[0]).b(lIIllIlllIlIl[129], lIIllIlllIlIl[101]);
        c0006gArr[lIIllIlllIlIl[139]] = C0006g.a(H::P).a(lIIllIlllIlIl[13], lIIllIlllIlIl[14], lIIllIlllIlIl[15], lIIllIlllIlIl[16], Integer.valueOf(lIIllIlllIlIl[0]));
        c0006gArr[lIIllIlllIlIl[140]] = C0006g.a(lIIllIlllIlIl[37], lIIllIlllIlIl[141], lIIllIllIllll[lIIllIlllIlIl[99]], (boolean) lIIllIlllIlIl[0]).b(lIIllIlllIlIl[44], lIIllIlllIlIl[68]).b(lIIllIlllIlIl[44], lIIllIlllIlIl[141]).b(lIIllIlllIlIl[37], lIIllIlllIlIl[141]).b(lIIllIlllIlIl[9], lIIllIlllIlIl[10]).b(lIIllIlllIlIl[44], lIIllIlllIlIl[14]);
        aE = Arrays.asList(c0006gArr);
    }

    private static void M() {
        WorldPoint worldPoint = aA;
        String[] strArr = new String[lIIllIlllIlIl[0]];
        strArr[lIIllIlllIlIl[1]] = lIIllIllIllll[lIIllIlllIlIl[0]];
        TileObjects.getFirstAt(worldPoint, Predicates.names(strArr)).interact(lIIllIllIllll[lIIllIlllIlIl[3]]);
    }

    private static boolean lIllIIIlllIIllI(Object obj) {
        return obj != null;
    }

    private static void lIllIIIlllIIlII() {
        lIIllIlllIlIl = new int[142];
        lIIllIlllIlIl[0] = " ".length();
        lIIllIlllIlIl[1] = ((54 ^ 29) ^ (101 ^ 104)) & (((44 ^ 39) ^ (190 ^ 147)) ^ (-" ".length()));
        lIIllIlllIlIl[2] = (-((-10121) & 26555)) & (-2561) & 24562;
        lIIllIlllIlIl[3] = "  ".length();
        lIIllIlllIlIl[4] = (-29953) & 30640;
        lIIllIlllIlIl[5] = 17 ^ 20;
        lIIllIlllIlIl[6] = "   ".length();
        lIIllIlllIlIl[7] = (82 ^ 109) ^ (188 ^ 135);
        lIIllIlllIlIl[8] = 74 ^ 76;
        lIIllIlllIlIl[9] = (-((-22606) & 31823)) & (-20521) & 32767;
        lIIllIlllIlIl[10] = (-11305) & 16363;
        lIIllIlllIlIl[11] = -" ".length();
        lIIllIlllIlIl[12] = (-((-28779) & 31851)) & (-16513) & 24575;
        lIIllIlllIlIl[13] = (-((-29017) & 30073)) & (-4119) & 8183;
        lIIllIlllIlIl[14] = (-(125 ^ 119)) & (-51) & 5115;
        lIIllIlllIlIl[15] = (-((-9393) & 25789)) & (-9249) & 28670;
        lIIllIlllIlIl[16] = (-((-1119) & 27775)) & (-21) & 31742;
        lIIllIlllIlIl[17] = (248 ^ 191) ^ (50 ^ 114);
        lIIllIlllIlIl[18] = (-((-3546) & 11739)) & (-1025) & 12269;
        lIIllIlllIlIl[19] = (-((-4629) & 14877)) & (-1) & 15227;
        lIIllIlllIlIl[20] = (58 ^ 104) ^ (21 ^ 79);
        lIIllIlllIlIl[21] = 65 ^ 72;
        lIIllIlllIlIl[22] = 29 ^ 23;
        lIIllIlllIlIl[23] = (-12678) & 15871;
        lIIllIlllIlIl[24] = (((34 + 70) - 39) + 137) ^ (((32 + 186) - 211) + 186);
        lIIllIlllIlIl[25] = 34 ^ 46;
        lIIllIlllIlIl[26] = (20 ^ 47) ^ (189 ^ 139);
        lIIllIlllIlIl[27] = (-10373) & 31679;
        lIIllIlllIlIl[28] = 7 ^ 9;
        lIIllIlllIlIl[29] = 3 ^ 12;
        lIIllIlllIlIl[30] = 38 ^ 54;
        lIIllIlllIlIl[31] = 132 ^ 149;
        lIIllIlllIlIl[32] = 7 ^ 21;
        lIIllIlllIlIl[33] = (51 ^ 63) ^ (102 ^ 121);
        lIIllIlllIlIl[34] = 47 ^ 59;
        lIIllIlllIlIl[35] = "  ".length() ^ (171 ^ 188);
        lIIllIlllIlIl[36] = (((59 + 133) - 108) + 57) ^ (((144 + 31) - 68) + 48);
        lIIllIlllIlIl[37] = (-((-9035) & 13135)) & (-9217) & 16334;
        lIIllIlllIlIl[38] = (-(18 ^ 53)) & (-17409) & 22526;
        lIIllIlllIlIl[39] = (-25601) & 28623;
        lIIllIlllIlIl[40] = (-((-961) & 28645)) & (-2) & 32767;
        lIIllIlllIlIl[41] = (-((-577) & 28273)) & (-1) & 32759;
        lIIllIlllIlIl[42] = (-((-657) & 13971)) & (-16418) & 32743;
        lIIllIlllIlIl[43] = (-"   ".length()) & (-24633) & 29691;
        lIIllIlllIlIl[44] = (-((-8577) & 13739)) & (-2) & 8191;
        lIIllIlllIlIl[45] = 48 ^ 28;
        lIIllIlllIlIl[46] = (-9219) & 12267;
        lIIllIlllIlIl[47] = (-((-277) & 27959)) & (-65) & 32743;
        lIIllIlllIlIl[48] = (-9227) & 12282;
        lIIllIlllIlIl[49] = (-17439) & 22430;
        lIIllIlllIlIl[50] = (-16417) & 19455;
        lIIllIlllIlIl[51] = (-3129) & 8127;
        lIIllIlllIlIl[52] = (-4115) & 7162;
        lIIllIlllIlIl[53] = (-2) & 3033;
        lIIllIlllIlIl[54] = (-(116 ^ 114)) & (-5155) & 8183;
        lIIllIlllIlIl[55] = (-(170 ^ 191)) & (-27713) & 32733;
        lIIllIlllIlIl[56] = (-((-10803) & 28287)) & (-8193) & 28669;
        lIIllIlllIlIl[57] = (-26723) & 31726;
        lIIllIlllIlIl[58] = (-((-2817) & 3911)) & (-8193) & 12255;
        lIIllIlllIlIl[59] = (-((-22140) & 32383)) & (-17445) & 32703;
        lIIllIlllIlIl[60] = (-((-18377) & 26586)) & (-3) & 11199;
        lIIllIlllIlIl[61] = (-((-17139) & 30459)) & (-67) & 16350;
        lIIllIlllIlIl[62] = (-10259) & 15286;
        lIIllIlllIlIl[63] = (-((-423) & 13807)) & (-1) & 16351;
        lIIllIlllIlIl[64] = (-((-154) & 21755)) & (-17) & 24575;
        lIIllIlllIlIl[65] = (-((-17539) & 19603)) & (-8257) & 15351;
        lIIllIlllIlIl[66] = 106 ^ 125;
        lIIllIlllIlIl[67] = (-((-7555) & 24047)) & (-13313) & 32767;
        lIIllIlllIlIl[68] = (-17409) & 22459;
        lIIllIlllIlIl[69] = 108 ^ 116;
        lIIllIlllIlIl[70] = (-((-1803) & 28511)) & (-1025) & 32767;
        lIIllIlllIlIl[71] = (-((-7299) & 31923)) & (-1) & 27581;
        lIIllIlllIlIl[72] = (-((-6209) & 22625)) & (-17) & 21501;
        lIIllIlllIlIl[73] = (-11273) & 16346;
        lIIllIlllIlIl[74] = (-12) & 5083;
        lIIllIlllIlIl[75] = (-1059) & 6131;
        lIIllIlllIlIl[76] = (-8246) & 11199;
        lIIllIlllIlIl[77] = (-25601) & 30690;
        lIIllIlllIlIl[78] = (-((-13811) & 32246)) & (-1025) & 24535;
        lIIllIlllIlIl[79] = (-24657) & 27611;
        lIIllIlllIlIl[80] = (-24593) & 29687;
        lIIllIlllIlIl[81] = (-2049) & 7151;
        lIIllIlllIlIl[82] = (-26646) & 31743;
        lIIllIlllIlIl[83] = (-((-5789) & 14078)) & (-1025) & 12285;
        lIIllIlllIlIl[84] = (-((-105) & 19583)) & (-1) & 24575;
        lIIllIlllIlIl[85] = (-19458) & 24551;
        lIIllIlllIlIl[86] = (-28697) & 31679;
        lIIllIlllIlIl[87] = (-24609) & 29695;
        lIIllIlllIlIl[88] = (-((-5961) & 16201)) & (-16393) & 31725;
        lIIllIlllIlIl[89] = (42 ^ 0) ^ (1 ^ 50);
        lIIllIlllIlIl[90] = (-((-1005) & 25581)) & (-5201) & 32767;
        lIIllIlllIlIl[91] = (-16385) & 19387;
        lIIllIlllIlIl[92] = (-((-14947) & 32363)) & (-8197) & 30701;
        lIIllIlllIlIl[93] = (-((-2989) & 28607)) & (-9) & 30714;
        lIIllIlllIlIl[94] = (-1025) & 6103;
        lIIllIlllIlIl[95] = (-((-4103) & 29711)) & (-2050) & 32735;
        lIIllIlllIlIl[96] = (-9225) & 12255;
        lIIllIlllIlIl[97] = (-((-2634) & 15979)) & (-16385) & 32765;
        lIIllIlllIlIl[98] = (-((-17049) & 18075)) & (-10241) & 16343;
        lIIllIlllIlIl[99] = 222 ^ 196;
        lIIllIlllIlIl[100] = (-((-525) & 22031)) & (-8193) & 32735;
        lIIllIlllIlIl[101] = (-((-4611) & 24067)) & (-13) & 24543;
        lIIllIlllIlIl[102] = (62 ^ 113) ^ (203 ^ 159);
        lIIllIlllIlIl[103] = (-((-2819) & 27415)) & (-1) & 27638;
        lIIllIlllIlIl[104] = (-((-2019) & 14319)) & (-17425) & 32764;
        lIIllIlllIlIl[105] = 135 ^ 155;
        lIIllIlllIlIl[106] = (-((-18617) & 31931)) & (-18) & 16375;
        lIIllIlllIlIl[107] = (-((-2395) & 32095)) & (-25) & 32767;
        lIIllIlllIlIl[108] = 126 ^ 99;
        lIIllIlllIlIl[109] = (-29705) & 32745;
        lIIllIlllIlIl[110] = (-8225) & 13292;
        lIIllIlllIlIl[111] = (-((-5213) & 31869)) & (-1025) & 32747;
        lIIllIlllIlIl[112] = (147 ^ 175) ^ (127 ^ 93);
        lIIllIlllIlIl[113] = (-((-12757) & 31222)) & (-17) & 23551;
        lIIllIlllIlIl[114] = (-10257) & 15327;
        lIIllIlllIlIl[115] = " ".length() ^ (22 ^ 8);
        lIIllIlllIlIl[116] = (-((-1537) & 30210)) & (-1057) & 32767;
        lIIllIlllIlIl[117] = 110 ^ 78;
        lIIllIlllIlIl[118] = (-((-4609) & 15943)) & (-1) & 16367;
        lIIllIlllIlIl[119] = 16 ^ 49;
        lIIllIlllIlIl[120] = 116 ^ 86;
        lIIllIlllIlIl[121] = (-29729) & 32743;
        lIIllIlllIlIl[122] = 96 ^ 67;
        lIIllIlllIlIl[123] = (-((-16651) & 17695)) & (-28705) & 32758;
        lIIllIlllIlIl[124] = (-21522) & 24535;
        lIIllIlllIlIl[125] = 118 ^ 82;
        lIIllIlllIlIl[126] = (-((-19733) & 32092)) & (-1) & 15359;
        lIIllIlllIlIl[127] = (-((-4313) & 31966)) & (-17) & 32703;
        lIIllIlllIlIl[128] = 48 ^ 21;
        lIIllIlllIlIl[129] = (-20557) & 23548;
        lIIllIlllIlIl[130] = (-((-4113) & 12379)) & (-3073) & 16383;
        lIIllIlllIlIl[131] = (-((-29002) & 30031)) & (-10307) & 16367;
        lIIllIlllIlIl[132] = (-20483) & 23483;
        lIIllIlllIlIl[133] = (-9) & 5052;
        lIIllIlllIlIl[134] = 64 ^ 102;
        lIIllIlllIlIl[135] = (-17475) & 22527;
        lIIllIlllIlIl[136] = (((123 + 2) - 105) + 122) ^ (((98 + 77) - 129) + 123);
        lIIllIlllIlIl[137] = 172 ^ 132;
        lIIllIlllIlIl[138] = (71 ^ 101) ^ (33 ^ 42);
        lIIllIlllIlIl[139] = (((5 + 78) - 41) + 96) ^ (((33 + 125) - 132) + 134);
        lIIllIlllIlIl[140] = 128 ^ 171;
        lIIllIlllIlIl[141] = (-((-13365) & 29821)) & (-3073) & 24575;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v55, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v57, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v29, types: [boolean] */
    public boolean run() {
        if (!lIllIIIlllIlIIl(this.aH ? 1 : 0) || lIllIIIlllIlIlI(this.aF.method(), EnumC0001b.ROGUES_DEN)) {
            return lIIllIlllIlIl[1];
        }
        Player local = Players.getLocal();
        WorldPoint worldLocation = local.getWorldLocation();
        if (lIllIIIlllIlIll(worldLocation.getY(), lIIllIlllIlIl[12])) {
            aD = lIIllIlllIlIl[1];
            this.aI = lIIllIlllIlIl[1];
            return Q();
        }
        RectangularArea rectangularArea = new RectangularArea(lIIllIlllIlIl[13], lIIllIlllIlIl[14], lIIllIlllIlIl[15], lIIllIlllIlIl[16], lIIllIlllIlIl[0]);
        if ((!lIllIIIlllIllII(local.getAnimation(), lIIllIlllIlIl[11]) || !lIllIIIlllIlIIl(rectangularArea.contains(worldLocation) ? 1 : 0)) && !lIllIIIlllIIlll(this.aI ? 1 : 0)) {
            for (C0006g c0006g : aE) {
                if (lIllIIIlllIIlll(c0006g.c(worldLocation) ? 1 : 0)) {
                    c0006g.y();
                    return lIIllIlllIlIl[0];
                }
                "".length();
                if (((139 ^ 168) ^ (158 ^ 185)) <= 0) {
                    return ((((35 + 22) - (-16)) + 62) ^ (((95 + 90) - 151) + 106)) & (((28 ^ 32) ^ (40 ^ 31)) ^ (-" ".length()));
                }
            }
            return lIIllIlllIlIl[1];
        }
        return lIIllIlllIlIl[0];
    }

    private static boolean lIllIIIlllIllIl(int i, int i2) {
        return i >= i2;
    }

    private static String lIllIIIllIIlIIl(String llllllllllllllIlllIllIlllllIlIll, String llllllllllllllIlllIllIlllllIlIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllIlllllIlIlI.getBytes(StandardCharsets.UTF_8)), lIIllIlllIlIl[20]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIllIlllIlIl[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllIlllllIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIllIlllllIllII) {
            llllllllllllllIlllIllIlllllIllII.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIIlllIlIll(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIllIIIlllIIlIl(Object obj) {
        return obj == null;
    }

    private static String lIllIIIllIIlIII(String llllllllllllllIlllIlllIIIIIIllIl, String llllllllllllllIlllIlllIIIIIIllII) {
        String llllllllllllllIlllIlllIIIIIIllIl2 = new String(Base64.getDecoder().decode(llllllllllllllIlllIlllIIIIIIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllIlllIlllIIIIIIlIlI = llllllllllllllIlllIlllIIIIIIllII.toCharArray();
        int llllllllllllllIlllIlllIIIIIIlIIl = lIIllIlllIlIl[1];
        char[] charArray = llllllllllllllIlllIlllIIIIIIllIl2.toCharArray();
        int length = charArray.length;
        int i = lIIllIlllIlIl[1];
        while (lIllIIIlllIlllI(i, length)) {
            char llllllllllllllIlllIlllIIIIIIlllI = charArray[i];
            sb.append((char) (llllllllllllllIlllIlllIIIIIIlllI ^ llllllllllllllIlllIlllIIIIIIlIlI[llllllllllllllIlllIlllIIIIIIlIIl % llllllllllllllIlllIlllIIIIIIlIlI.length]));
            "".length();
            llllllllllllllIlllIlllIIIIIIlIIl++;
            i++;
            "".length();
            if (" ".length() > "  ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIllIIIlllIlIIl(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Subscribe
    public void a(ProjectileSpawned projectileSpawned) {
        aD = lIIllIlllIlIl[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v100, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v111, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v113, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v122, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v125, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v57, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v60, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v62, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v67, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v86, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v89, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v92, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v53, types: [boolean] */
    private boolean Q() {
        if (lIllIIIlllIIlll(this.aG ? 1 : 0)) {
            if (lIllIIIlllIlIIl(Dialog.isOpen() ? 1 : 0)) {
                NPC nearest = NPCs.getNearest(npc -> {
                    return npc.getName().toLowerCase().contains(lIIllIllIllll[lIIllIlllIlIl[34]]);
                });
                if (lIllIIIlllIIllI(nearest)) {
                    nearest.interact(lIIllIllIllll[lIIllIlllIlIl[17]]);
                    return lIIllIlllIlIl[0];
                }
                Movement.walkTo(lIIllIlllIlIl[18], lIIllIlllIlIl[19]);
                "".length();
                return lIIllIlllIlIl[0];
            } else if (lIllIIIlllIIlll(Dialog.canContinue() ? 1 : 0)) {
                Dialog.continueSpace();
                return lIIllIlllIlIl[0];
            } else {
                if (lIllIIIlllIIlll(Dialog.isViewingOptions() ? 1 : 0)) {
                    if (lIllIIIlllIIlll(Dialog.getOptions().stream().anyMatch(widget -> {
                        return widget.getText().contains(lIIllIllIllll[lIIllIlllIlIl[33]]);
                    }) ? 1 : 0)) {
                        this.aG = lIIllIlllIlIl[1];
                        return lIIllIlllIlIl[0];
                    }
                    String[] strArr = new String[lIIllIlllIlIl[3]];
                    strArr[lIIllIlllIlIl[1]] = lIIllIllIllll[lIIllIlllIlIl[20]];
                    strArr[lIIllIlllIlIl[0]] = lIIllIllIllll[lIIllIlllIlIl[21]];
                    Dialog.chooseOption(strArr);
                    "".length();
                }
                return lIIllIlllIlIl[0];
            }
        }
        if (lIllIIIlllIlIIl(Movement.isStaminaBoosted() ? 1 : 0) && lIllIIIlllIIlll(this.aF.useStaminaPotion() ? 1 : 0)) {
            Item first = Inventory.getFirst(item -> {
                return item.getName().startsWith(lIIllIllIllll[lIIllIlllIlIl[32]]);
            });
            if (lIllIIIlllIIllI(first)) {
                first.interact(lIIllIllIllll[lIIllIlllIlIl[22]]);
                return lIIllIlllIlIl[0];
            } else if (lIllIIIlllIIlll(Bank.isOpen() ? 1 : 0)) {
                Bank.withdraw(item2 -> {
                    return item2.getName().startsWith(lIIllIllIllll[lIIllIlllIlIl[31]]);
                }, lIIllIlllIlIl[0], Bank.WithdrawMode.ITEM);
                return lIIllIlllIlIl[0];
            } else {
                int[] iArr = new int[lIIllIlllIlIl[0]];
                iArr[lIIllIlllIlIl[1]] = lIIllIlllIlIl[23];
                NPC nearest2 = NPCs.getNearest(iArr);
                if (lIllIIIlllIIllI(nearest2)) {
                    nearest2.interact(lIIllIllIllll[lIIllIlllIlIl[24]]);
                    return lIIllIlllIlIl[0];
                }
            }
        }
        if (lIllIIIlllIlIII(Players.getLocal().getWorldLocation().getY(), lIIllIlllIlIl[12]) && lIllIIIlllIIlll(Dialog.canContinue() ? 1 : 0)) {
            this.aG = lIIllIlllIlIl[0];
            return lIIllIlllIlIl[0];
        }
        ItemContainer itemContainer = Static.getClient().getItemContainer(InventoryID.EQUIPMENT);
        if (lIllIIIlllIIllI(itemContainer) && lIllIIIlllIIlll(Stream.of((Object[]) itemContainer.getItems()).anyMatch(item3 -> {
            if (lIllIIIlllIIllI(item3) && lIllIIIlllIllII(item3.getId(), lIIllIlllIlIl[11])) {
                ?? r0 = lIIllIlllIlIl[0];
                "".length();
                return (-" ".length()) == "  ".length() ? ((57 ^ 112) ^ (106 ^ 55)) & (((((84 + 37) - 23) + 43) ^ (((138 + 83) - 216) + 148)) ^ (-" ".length())) : r0;
            }
            return lIIllIlllIlIl[1];
        }) ? 1 : 0)) {
            if (lIllIIIlllIIlll(Bank.isOpen() ? 1 : 0)) {
                Bank.depositEquipment();
                return lIIllIlllIlIl[0];
            }
            int[] iArr2 = new int[lIIllIlllIlIl[0]];
            iArr2[lIIllIlllIlIl[1]] = lIIllIlllIlIl[23];
            NPC nearest3 = NPCs.getNearest(iArr2);
            if (lIllIIIlllIIllI(nearest3)) {
                nearest3.interact(lIIllIllIllll[lIIllIlllIlIl[25]]);
                return lIIllIlllIlIl[0];
            }
            return lIIllIlllIlIl[1];
        }
        if (lIllIIIlllIlIIl(Inventory.isEmpty() ? 1 : 0)) {
            if (lIllIIIlllIIlll(Bank.isOpen() ? 1 : 0)) {
                Bank.depositInventory();
                return lIIllIlllIlIl[0];
            }
            int[] iArr3 = new int[lIIllIlllIlIl[0]];
            iArr3[lIIllIlllIlIl[1]] = lIIllIlllIlIl[23];
            NPC nearest4 = NPCs.getNearest(iArr3);
            if (lIllIIIlllIIllI(nearest4)) {
                nearest4.interact(lIIllIllIllll[lIIllIlllIlIl[26]]);
                return lIIllIlllIlIl[0];
            }
        }
        if (lIllIIIlllIIlll(Bank.isOpen() ? 1 : 0)) {
            ?? r0 = lIIllIlllIlIl[0];
            int[] iArr4 = new int[lIIllIlllIlIl[0]];
            iArr4[lIIllIlllIlIl[1]] = lIIllIlllIlIl[27];
            if (lIllIIIlllIllIl(Bank.getCount((boolean) r0, iArr4), lIIllIlllIlIl[5])) {
                this.aH = lIIllIlllIlIl[0];
                return lIIllIlllIlIl[0];
            }
        }
        String[] strArr2 = new String[lIIllIlllIlIl[0]];
        strArr2[lIIllIlllIlIl[1]] = lIIllIllIllll[lIIllIlllIlIl[28]];
        TileObjects.getNearest(strArr2).interact(lIIllIllIllll[lIIllIlllIlIl[29]]);
        return lIIllIlllIlIl[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    @Inject
    public H(SquireThievingConfig squireThievingConfig) {
        this.aF = squireThievingConfig;
    }

    private static void lIllIIIlllIIIll() {
        lIIllIllIllll = new String[lIIllIlllIlIl[102]];
        lIIllIllIllll[lIIllIlllIlIl[1]] = lIllIIIllIIlIII("GDs+PQ==", "LZUXd");
        lIIllIllIllll[lIIllIlllIlIl[0]] = lIllIIIllIIlIIl("bO84ZvU/pSs=", "wqCnT");
        lIIllIllIllll[lIIllIlllIlIl[3]] = lIllIIIllIIlIIl("hJ4ilzaJsH4=", "bPiSz");
        lIIllIllIllll[lIIllIlllIlIl[6]] = lIllIIIllIIlIII("FSQGDgUy", "FAjkf");
        lIIllIllIllll[lIIllIlllIlIl[7]] = lIllIIIllIIlIII("AQMDNylnHw0zJSId", "GobDA");
        lIIllIllIllll[lIIllIlllIlIl[5]] = lIllIIIllIIlIlI("KH0REQWdSFY=", "ccwRL");
        lIIllIllIllll[lIIllIlllIlIl[8]] = lIllIIIllIIlIII("MQEvIy5XHSEnIhIf", "wmNPF");
        lIIllIllIllll[lIIllIlllIlIl[17]] = lIllIIIllIIlIII("EjcDImQyOQ==", "FVoII");
        lIIllIllIllll[lIIllIlllIlIl[20]] = lIllIIIllIIlIlI("YT6munip+GU9d3rn+MmOOw==", "SNqra");
        lIIllIllIllll[lIIllIlllIlIl[21]] = lIllIIIllIIlIIl("8VWlC9XCSoQ=", "dcKgv");
        lIIllIllIllll[lIIllIlllIlIl[22]] = lIllIIIllIIlIIl("ab6x4ULuK6I=", "iAPle");
        lIIllIllIllll[lIIllIlllIlIl[24]] = lIllIIIllIIlIlI("3bTNHFddpkc=", "dqhvH");
        lIIllIllIllll[lIIllIlllIlIl[25]] = lIllIIIllIIlIlI("gYBuScBDeZs=", "TDVbz");
        lIIllIllIllll[lIIllIlllIlIl[26]] = lIllIIIllIIlIIl("1yXLsg86iRU=", "zUSTn");
        lIIllIllIllll[lIIllIlllIlIl[28]] = lIllIIIllIIlIlI("wjAYtT2zxaM=", "OuVtV");
        lIIllIllIllll[lIIllIlllIlIl[29]] = lIllIIIllIIlIlI("yEXw4yc01s8=", "nHUbd");
        lIIllIllIllll[lIIllIlllIlIl[30]] = lIllIIIllIIlIII("MQUNeDscCwosaAsYGTsjAQQf", "hjxXH");
        lIIllIllIllll[lIIllIlllIlIl[31]] = lIllIIIllIIlIIl("48NQ1CqTazA=", "Lttry");
        lIIllIllIllll[lIIllIlllIlIl[32]] = lIllIIIllIIlIlI("TJim6L1abg4=", "veCUH");
        lIIllIllIllll[lIIllIlllIlIl[33]] = lIllIIIllIIlIlI("uWyoGkeODsn9Cd01x/WW/A==", "wEeCl");
        lIIllIllIllll[lIIllIlllIlIl[34]] = lIllIIIllIIlIII("MRoKMSU=", "ShcPK");
        lIIllIllIllll[lIIllIlllIlIl[35]] = lIllIIIllIIlIII("IRU1Gw5TPScPGRc=", "szRnk");
        lIIllIllIllll[lIIllIlllIlIl[36]] = lIllIIIllIIlIII("HgAHHA==", "JikyL");
        lIIllIllIllll[lIIllIlllIlIl[66]] = lIllIIIllIIlIII("BycMPAY=", "DKeQd");
        lIIllIllIllll[lIIllIlllIlIl[69]] = lIllIIIllIIlIII("Ogs7CiwB", "inZxO");
        lIIllIllIllll[lIIllIlllIlIl[89]] = lIllIIIllIIlIII("Pi4qES0F", "mKKcN");
        lIIllIllIllll[lIIllIlllIlIl[99]] = lIllIIIllIIlIlI("68fykqcU4OE=", "qxtRF");
    }

    private static void P() {
        String[] strArr = new String[lIIllIlllIlIl[0]];
        strArr[lIIllIlllIlIl[1]] = lIIllIllIllll[lIIllIlllIlIl[8]];
        Item first = Inventory.getFirst(strArr);
        if (lIllIIIlllIIlIl(first)) {
            O();
            return;
        }
        Player local = Players.getLocal();
        if (lIllIIIlllIIlll(aD ? 1 : 0)) {
            ScenePoint fromWorld = ScenePoint.fromWorld(new WorldPoint(lIIllIlllIlIl[9], lIIllIlllIlIl[10], lIIllIlllIlIl[0]));
            Movement.setDestination(fromWorld.getX(), fromWorld.getY());
            return;
        }
        NPC nearest = NPCs.getNearest(npc -> {
            String[] strArr2 = new String[lIIllIlllIlIl[0]];
            strArr2[lIIllIlllIlIl[1]] = lIIllIllIllll[lIIllIlllIlIl[35]];
            if (lIllIIIlllIIlll(Predicates.names(strArr2).test(npc) ? 1 : 0) && lIllIIIlllIIlll(aC.contains(npc.getWorldLocation()) ? 1 : 0)) {
                ?? r0 = lIIllIlllIlIl[0];
                "".length();
                return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIIllIlllIlIl[1];
        });
        if (lIllIIIlllIlIII(Players.getLocal().getAnimation(), lIIllIlllIlIl[11]) && lIllIIIlllIlIIl(local.isMoving() ? 1 : 0) && lIllIIIlllIlIII(nearest.getGraphic(), lIIllIlllIlIl[11])) {
            first.useOn(nearest);
        }
    }

    private static String lIllIIIllIIlIlI(String llllllllllllllIlllIllIlllllllIII, String llllllllllllllIlllIllIllllllIlll) {
        try {
            SecretKeySpec llllllllllllllIlllIllIlllllllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllIllllllIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIllIlllllllIlI = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIllIlllllllIlI.init(lIIllIlllIlIl[3], llllllllllllllIlllIllIlllllllIll);
            return new String(llllllllllllllIlllIllIlllllllIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllIlllllllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIllIlllllllIIl) {
            llllllllllllllIlllIllIlllllllIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIIlllIIlll(int i) {
        return i != 0;
    }
}
