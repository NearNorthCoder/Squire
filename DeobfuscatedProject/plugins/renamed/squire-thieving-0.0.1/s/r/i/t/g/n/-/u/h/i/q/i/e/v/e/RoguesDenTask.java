/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Actor
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.InventoryID
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.TileItem
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.ProjectileSpawned
 *  net.runelite.api.widgets.Widget
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.commons.Predicates
 *  net.unethicalite.api.coords.Area
 *  net.unethicalite.api.coords.RectangularArea
 *  net.unethicalite.api.coords.ScenePoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 *  net.unethicalite.client.Static
 */
package s.r.i.t.g.n.-.u.h.i.q.i.e.v.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.thieving.SquireThievingConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Actor;
import net.runelite.api.ChatMessageType;
import net.runelite.api.InventoryID;
import net.runelite.api.Item;
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
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.BEnum;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.g_Unknown;

/* TASK: Rogues Den -> RoguesdenTask */
@TaskDesc(name="Rogues Den", register=true)
public class RoguesDenTask
extends Task {
    public static final /* synthetic */ WorldPoint aB;
    private final /* synthetic */ SquireThievingConfig aF;
    private /* synthetic */ boolean aH;
    private static /* synthetic */ boolean aD;
    private /* synthetic */ boolean aG;
    public static final /* synthetic */ WorldPoint aA;
    private /* synthetic */ boolean aI;
    public static final /* synthetic */ WorldPoint az;
    private static /* synthetic */ String[] lIIllIllIllll;
    public static final /* synthetic */ Area aC;
    private static /* synthetic */ int[] lIIllIlllIlIl;
    public static final /* synthetic */ List<g> aE;

    private static void O() {
        String[] stringArray = new String[lIIllIlllIlIl[0]];
        stringArray[H.lIIllIlllIlIl[1]] = lIIllIllIllll[lIIllIlllIlIl[7]];
        TileItems.getFirstAt((WorldPoint)aB, (Predicate)Predicates.names((String[])stringArray)).interact(lIIllIllIllll[lIIllIlllIlIl[5]]);
    }

    private static boolean lIllIIIlllIlIII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIllIIIlllIlIlI(Object object, Object object2) {
        return object != object2;
    }

    private static void L() {
        int[] nArray = new int[lIIllIlllIlIl[0]];
        nArray[H.lIIllIlllIlIl[1]] = lIIllIlllIlIl[2];
        TileItem tileItem = TileItems.getFirstAt((WorldPoint)az, (Predicate)Predicates.ids((int[])nArray));
        if (H.lIllIIIlllIIlIl(tileItem)) {
            return;
        }
        tileItem.interact(lIIllIllIllll[lIIllIlllIlIl[1]]);
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var11;
        if (H.lIllIIIlllIlIlI(chatMessage.getType(), ChatMessageType.GAMEMESSAGE) && H.lIllIIIlllIlIlI(chatMessage.getType(), ChatMessageType.SPAM)) {
            return;
        }
        String var29 = var11.getMessage();
        if (H.lIllIIIlllIIlll(var29.contains(lIIllIllIllll[lIIllIlllIlIl[30]]) ? 1 : 0)) {
            llllllllllllllIlllIlllIIIIlIIIII.aI = lIIllIlllIlIl[0];
            aD = lIIllIlllIlIl[1];
        }
    }

    /*
     * WARNING - void declaration
     */
    private static void N() {
        Widget widget = Widgets.get((int)lIIllIlllIlIl[4], (int)lIIllIlllIlIl[5]);
        if (!H.lIllIIIlllIIllI(widget) || H.lIllIIIlllIIlll(widget.isHidden() ? 1 : 0)) {
            H.M();
            0;
            if ((0x75 ^ 0x11 ^ (0xC6 ^ 0xA6)) < 0) {
                return;
            }
        } else {
            void var16;
            var16.interact(lIIllIllIllll[lIIllIlllIlIl[6]]);
        }
    }

    private static boolean lIllIIIlllIllII(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIllIIIlllIlllI(int n2, int n3) {
        return n2 < n3;
    }

    static {
        H.lIllIIIlllIIlII();
        H.lIllIIIlllIIIll();
        az = new WorldPoint(lIIllIlllIlIl[37], lIIllIlllIlIl[38], lIIllIlllIlIl[0]);
        aA = new WorldPoint(lIIllIlllIlIl[39], lIIllIlllIlIl[40], lIIllIlllIlIl[0]);
        aB = new WorldPoint(lIIllIlllIlIl[13], lIIllIlllIlIl[41], lIIllIlllIlIl[0]);
        aC = new RectangularArea(lIIllIlllIlIl[42], lIIllIlllIlIl[43], lIIllIlllIlIl[44], lIIllIlllIlIl[16], lIIllIlllIlIl[0]);
        g[] gArray = new g[lIIllIlllIlIl[45]];
        gArray[H.lIIllIlllIlIl[1]] = g.a(lIIllIlllIlIl[46], lIIllIlllIlIl[47]).b(lIIllIlllIlIl[48], lIIllIlllIlIl[49]);
        gArray[H.lIIllIlllIlIl[0]] = g.a(lIIllIlllIlIl[50], lIIllIlllIlIl[51]).b(lIIllIlllIlIl[52], lIIllIlllIlIl[47]);
        gArray[H.lIIllIlllIlIl[3]] = g.a(lIIllIlllIlIl[53], lIIllIlllIlIl[51]).b(lIIllIlllIlIl[50], lIIllIlllIlIl[51]);
        gArray[H.lIIllIlllIlIl[6]] = g.a(lIIllIlllIlIl[54], lIIllIlllIlIl[55]).b(lIIllIlllIlIl[53], lIIllIlllIlIl[51]);
        gArray[H.lIIllIlllIlIl[7]] = g.a(lIIllIlllIlIl[42], lIIllIlllIlIl[55]).b(lIIllIlllIlIl[39], lIIllIlllIlIl[55]);
        gArray[H.lIIllIlllIlIl[5]] = g.a(lIIllIlllIlIl[56], lIIllIlllIlIl[57]).b(lIIllIlllIlIl[42], lIIllIlllIlIl[55]);
        gArray[H.lIIllIlllIlIl[8]] = g.a(lIIllIlllIlIl[58], lIIllIlllIlIl[59], lIIllIlllIlIl[0]).b(lIIllIlllIlIl[60], lIIllIlllIlIl[57]);
        gArray[H.lIIllIlllIlIl[17]] = g.a(lIIllIlllIlIl[61], lIIllIlllIlIl[62], lIIllIlllIlIl[0]).b(lIIllIlllIlIl[63], lIIllIlllIlIl[59]);
        gArray[H.lIIllIlllIlIl[20]] = g.a(lIIllIlllIlIl[64], lIIllIlllIlIl[65], lIIllIllIllll[lIIllIlllIlIl[66]], lIIllIlllIlIl[0]).b(lIIllIlllIlIl[61], lIIllIlllIlIl[62]);
        gArray[H.lIIllIlllIlIl[21]] = g.a(lIIllIlllIlIl[67], lIIllIlllIlIl[68], lIIllIllIllll[lIIllIlllIlIl[69]], lIIllIlllIlIl[0]).b(lIIllIlllIlIl[64], lIIllIlllIlIl[70]);
        gArray[H.lIIllIlllIlIl[22]] = g.a(lIIllIlllIlIl[71], lIIllIlllIlIl[72]).b(lIIllIlllIlIl[67], lIIllIlllIlIl[68]);
        gArray[H.lIIllIlllIlIl[24]] = g.a(lIIllIlllIlIl[71], lIIllIlllIlIl[73]).b(lIIllIlllIlIl[71], lIIllIlllIlIl[74]).b(lIIllIlllIlIl[71], lIIllIlllIlIl[75]);
        gArray[H.lIIllIlllIlIl[25]] = g.a(lIIllIlllIlIl[76], lIIllIlllIlIl[77], lIIllIlllIlIl[0]).b(lIIllIlllIlIl[71], lIIllIlllIlIl[78]);
        gArray[H.lIIllIlllIlIl[26]] = g.a(lIIllIlllIlIl[79], lIIllIlllIlIl[80]).b(lIIllIlllIlIl[76], lIIllIlllIlIl[77]);
        gArray[H.lIIllIlllIlIl[28]] = g.a(lIIllIlllIlIl[67], lIIllIlllIlIl[81]).b(lIIllIlllIlIl[79], lIIllIlllIlIl[82]);
        gArray[H.lIIllIlllIlIl[29]] = g.a(lIIllIlllIlIl[83], lIIllIlllIlIl[84]).b(lIIllIlllIlIl[67], lIIllIlllIlIl[81]);
        gArray[H.lIIllIlllIlIl[30]] = g.a(lIIllIlllIlIl[83], lIIllIlllIlIl[85]).b(lIIllIlllIlIl[83], lIIllIlllIlIl[85]);
        gArray[H.lIIllIlllIlIl[31]] = g.a(lIIllIlllIlIl[86], lIIllIlllIlIl[87]).b(lIIllIlllIlIl[83], lIIllIlllIlIl[88]);
        gArray[H.lIIllIlllIlIl[32]] = g.a(lIIllIlllIlIl[56], lIIllIlllIlIl[87], lIIllIllIllll[lIIllIlllIlIl[89]]).b(lIIllIlllIlIl[90], lIIllIlllIlIl[87]);
        gArray[H.lIIllIlllIlIl[33]] = g.a(lIIllIlllIlIl[91], lIIllIlllIlIl[92]).b(lIIllIlllIlIl[56], lIIllIlllIlIl[93]);
        gArray[H.lIIllIlllIlIl[34]] = g.a(H::L).d(lIIllIlllIlIl[0]).b(lIIllIlllIlIl[91], lIIllIlllIlIl[92]).a((WorldPoint worldPoint) -> {
            int n2;
            String[] stringArray = new String[lIIllIlllIlIl[0]];
            stringArray[H.lIIllIlllIlIl[1]] = lIIllIllIllll[lIIllIlllIlIl[36]];
            if (H.lIllIIIlllIIlIl(Inventory.getFirst((String[])stringArray)) && H.lIllIIIlllIlIII(worldPoint.getX(), az.getX()) && H.lIllIIIlllIlIII(worldPoint.getY(), az.getY())) {
                n2 = lIIllIlllIlIl[0];
                0;
                
                }
            } else {
                n2 = lIIllIlllIlIl[1];
            }
            return n2 != 0;
        });
        gArray[H.lIIllIlllIlIl[35]] = g.a(H::M).d(lIIllIlllIlIl[0]).d(az);
        gArray[H.lIIllIlllIlIl[36]] = g.a(H::N).d(lIIllIlllIlIl[0]).d(aA);
        gArray[H.lIIllIlllIlIl[66]] = g.a(lIIllIlllIlIl[9], lIIllIlllIlIl[94], lIIllIlllIlIl[0]).b(lIIllIlllIlIl[54], lIIllIlllIlIl[40]);
        gArray[H.lIIllIlllIlIl[69]] = g.a(lIIllIlllIlIl[53], lIIllIlllIlIl[95], lIIllIlllIlIl[0]).a(lIIllIlllIlIl[96], lIIllIlllIlIl[95], lIIllIlllIlIl[97], lIIllIlllIlIl[94]);
        gArray[H.lIIllIlllIlIl[89]] = g.a(lIIllIlllIlIl[97], lIIllIlllIlIl[78], lIIllIlllIlIl[0]).a(lIIllIlllIlIl[53], lIIllIlllIlIl[78], lIIllIlllIlIl[97], lIIllIlllIlIl[98]);
        gArray[H.lIIllIlllIlIl[99]] = g.a(lIIllIlllIlIl[50], lIIllIlllIlIl[94], lIIllIlllIlIl[0]).a(lIIllIlllIlIl[100], lIIllIlllIlIl[101], lIIllIlllIlIl[50], lIIllIlllIlIl[94]);
        gArray[H.lIIllIlllIlIl[102]] = g.a(lIIllIlllIlIl[103], lIIllIlllIlIl[78], lIIllIlllIlIl[0]).a(lIIllIlllIlIl[104], lIIllIlllIlIl[101], lIIllIlllIlIl[103], lIIllIlllIlIl[94]);
        gArray[H.lIIllIlllIlIl[105]] = g.a(lIIllIlllIlIl[106], lIIllIlllIlIl[72], lIIllIlllIlIl[0]).a(lIIllIlllIlIl[107], lIIllIlllIlIl[72], lIIllIlllIlIl[106], lIIllIlllIlIl[98]);
        gArray[H.lIIllIlllIlIl[108]] = g.a(lIIllIlllIlIl[109], lIIllIlllIlIl[110], lIIllIlllIlIl[0]).a(lIIllIlllIlIl[104], lIIllIlllIlIl[111], lIIllIlllIlIl[106], lIIllIlllIlIl[110]);
        gArray[H.lIIllIlllIlIl[112]] = g.a(lIIllIlllIlIl[104], lIIllIlllIlIl[113], lIIllIlllIlIl[0]).a(lIIllIlllIlIl[104], lIIllIlllIlIl[72], lIIllIlllIlIl[103], lIIllIlllIlIl[114]);
        gArray[H.lIIllIlllIlIl[115]] = g.a(lIIllIlllIlIl[116], lIIllIlllIlIl[72], lIIllIlllIlIl[0]).a(lIIllIlllIlIl[100], lIIllIlllIlIl[72], lIIllIlllIlIl[50], lIIllIlllIlIl[114]);
        gArray[H.lIIllIlllIlIl[117]] = g.a(lIIllIlllIlIl[44], lIIllIlllIlIl[118], lIIllIlllIlIl[0]).b(lIIllIlllIlIl[116], lIIllIlllIlIl[110]);
        gArray[H.lIIllIlllIlIl[119]] = g.a(lIIllIlllIlIl[54], lIIllIlllIlIl[118]).b(lIIllIlllIlIl[44], lIIllIlllIlIl[118]);
        gArray[H.lIIllIlllIlIl[120]] = g.a(lIIllIlllIlIl[121], lIIllIlllIlIl[118]).b(lIIllIlllIlIl[54], lIIllIlllIlIl[118]);
        gArray[H.lIIllIlllIlIl[122]] = g.a(lIIllIlllIlIl[123], lIIllIlllIlIl[118]).b(lIIllIlllIlIl[124], lIIllIlllIlIl[118]);
        gArray[H.lIIllIlllIlIl[125]] = g.a(lIIllIlllIlIl[126], lIIllIlllIlIl[127]).b(lIIllIlllIlIl[13], lIIllIlllIlIl[118]);
        gArray[H.lIIllIlllIlIl[128]] = g.a(lIIllIlllIlIl[129], lIIllIlllIlIl[130], lIIllIlllIlIl[0]).a(lIIllIlllIlIl[90], lIIllIlllIlIl[131], lIIllIlllIlIl[132], lIIllIlllIlIl[133]);
        gArray[H.lIIllIlllIlIl[134]] = g.a(lIIllIlllIlIl[129], lIIllIlllIlIl[135]).b(lIIllIlllIlIl[129], lIIllIlllIlIl[130]);
        gArray[H.lIIllIlllIlIl[136]] = g.a(lIIllIlllIlIl[129], lIIllIlllIlIl[111], lIIllIlllIlIl[0]).b(lIIllIlllIlIl[129], lIIllIlllIlIl[135]);
        gArray[H.lIIllIlllIlIl[137]] = g.a(lIIllIlllIlIl[129], lIIllIlllIlIl[101]).b(lIIllIlllIlIl[129], lIIllIlllIlIl[111]);
        gArray[H.lIIllIlllIlIl[138]] = g.a(H::O).d(lIIllIlllIlIl[0]).b(lIIllIlllIlIl[129], lIIllIlllIlIl[101]);
        gArray[H.lIIllIlllIlIl[139]] = g.a(H::P).a(lIIllIlllIlIl[13], lIIllIlllIlIl[14], lIIllIlllIlIl[15], lIIllIlllIlIl[16], lIIllIlllIlIl[0]);
        gArray[H.lIIllIlllIlIl[140]] = g.a(lIIllIlllIlIl[37], lIIllIlllIlIl[141], lIIllIllIllll[lIIllIlllIlIl[99]], lIIllIlllIlIl[0]).b(lIIllIlllIlIl[44], lIIllIlllIlIl[68]).b(lIIllIlllIlIl[44], lIIllIlllIlIl[141]).b(lIIllIlllIlIl[37], lIIllIlllIlIl[141]).b(lIIllIlllIlIl[9], lIIllIlllIlIl[10]).b(lIIllIlllIlIl[44], lIIllIlllIlIl[14]);
        aE = Arrays.asList(gArray);
    }

    private static void M() {
        String[] stringArray = new String[lIIllIlllIlIl[0]];
        stringArray[H.lIIllIlllIlIl[1]] = lIIllIllIllll[lIIllIlllIlIl[0]];
        TileObjects.getFirstAt((WorldPoint)aA, (Predicate)Predicates.names((String[])stringArray)).interact(lIIllIllIllll[lIIllIlllIlIl[3]]);
    }

    private static boolean lIllIIIlllIIllI(Object object) {
        return object != null;
    }

    private static void lIllIIIlllIIlII() {
        lIIllIlllIlIl = new int[142];
        H.lIIllIlllIlIl[0] = 1;
        H.lIIllIlllIlIl[1] = (0x36 ^ 0x1D ^ (0x65 ^ 0x68)) & (0x2C ^ 0x27 ^ (0xBE ^ 0x93) ^ -1);
        H.lIIllIlllIlIl[2] = -(0xFFFFD877 & 0x67BB) & (0xFFFFF5FF & 0x5FF2);
        H.lIIllIlllIlIl[3] = 2;
        H.lIIllIlllIlIl[4] = 0xFFFF8AFF & 0x77B0;
        H.lIIllIlllIlIl[5] = 0x11 ^ 0x14;
        H.lIIllIlllIlIl[6] = 3;
        H.lIIllIlllIlIl[7] = 0x52 ^ 0x6D ^ (0xBC ^ 0x87);
        H.lIIllIlllIlIl[8] = 0x4A ^ 0x4C;
        H.lIIllIlllIlIl[9] = -(0xFFFFA7B2 & 0x7C4F) & (0xFFFFAFD7 & Short.MAX_VALUE);
        H.lIIllIlllIlIl[10] = 0xFFFFD3D7 & 0x3FEB;
        H.lIIllIlllIlIl[11] = -1;
        H.lIIllIlllIlIl[12] = -(0xFFFF8F95 & 0x7C6B) & (0xFFFFBF7F & 0x5FFF);
        H.lIIllIlllIlIl[13] = -(0xFFFF8EA7 & 0x7579) & (0xFFFFEFE9 & 0x1FF7);
        H.lIIllIlllIlIl[14] = -(0x7D ^ 0x77) & (0xFFFFFFCD & 0x13FB);
        H.lIIllIlllIlIl[15] = -(0xFFFFDB4F & 0x64BD) & (0xFFFFDBDF & 0x6FFE);
        H.lIIllIlllIlIl[16] = -(0xFFFFFBA1 & 0x6C7F) & (0xFFFFFFEB & 0x7BFE);
        H.lIIllIlllIlIl[17] = 0xF8 ^ 0xBF ^ (0x32 ^ 0x72);
        H.lIIllIlllIlIl[18] = -(0xFFFFF226 & 0x2DDB) & (0xFFFFFBFF & 0x2FED);
        H.lIIllIlllIlIl[19] = -(0xFFFFEDEB & 0x3A1D) & (0xFFFFFFFF & 0x3B7B);
        H.lIIllIlllIlIl[20] = 0x3A ^ 0x68 ^ (0x15 ^ 0x4F);
        H.lIIllIlllIlIl[21] = 0x41 ^ 0x48;
        H.lIIllIlllIlIl[22] = 0x1D ^ 0x17;
        H.lIIllIlllIlIl[23] = 0xFFFFCE7A & 0x3DFF;
        H.lIIllIlllIlIl[24] = 34 + 70 - 39 + 137 ^ 32 + 186 - 211 + 186;
        H.lIIllIlllIlIl[25] = 0x22 ^ 0x2E;
        H.lIIllIlllIlIl[26] = 0x14 ^ 0x2F ^ (0xBD ^ 0x8B);
        H.lIIllIlllIlIl[27] = 0xFFFFD77B & 0x7BBF;
        H.lIIllIlllIlIl[28] = 7 ^ 9;
        H.lIIllIlllIlIl[29] = 3 ^ 0xC;
        H.lIIllIlllIlIl[30] = 0x26 ^ 0x36;
        H.lIIllIlllIlIl[31] = 0x84 ^ 0x95;
        H.lIIllIlllIlIl[32] = 7 ^ 0x15;
        H.lIIllIlllIlIl[33] = 0x33 ^ 0x3F ^ (0x66 ^ 0x79);
        H.lIIllIlllIlIl[34] = 0x2F ^ 0x3B;
        H.lIIllIlllIlIl[35] = 2 ^ (0xAB ^ 0xBC);
        H.lIIllIlllIlIl[36] = 59 + 133 - 108 + 57 ^ 144 + 31 - 68 + 48;
        H.lIIllIlllIlIl[37] = -(0xFFFFDCB5 & 0x334F) & (0xFFFFDBFF & 0x3FCE);
        H.lIIllIlllIlIl[38] = -(0x12 ^ 0x35) & (0xFFFFBBFF & 0x57FE);
        H.lIIllIlllIlIl[39] = 0xFFFF9BFF & 0x6FCF;
        H.lIIllIlllIlIl[40] = -(0xFFFFFC3F & 0x6FE5) & (0xFFFFFFFE & Short.MAX_VALUE);
        H.lIIllIlllIlIl[41] = -(0xFFFFFDBF & 0x6E71) & (0xFFFFFFFF & 0x7FF7);
        H.lIIllIlllIlIl[42] = -(0xFFFFFD6F & 0x3693) & (0xFFFFBFDE & 0x7FE7);
        H.lIIllIlllIlIl[43] = -3 & (0xFFFF9FC7 & 0x73FB);
        H.lIIllIlllIlIl[44] = -(0xFFFFDE7F & 0x35AB) & (0xFFFFFFFE & 0x1FFF);
        H.lIIllIlllIlIl[45] = 0x30 ^ 0x1C;
        H.lIIllIlllIlIl[46] = 0xFFFFDBFD & 0x2FEB;
        H.lIIllIlllIlIl[47] = -(0xFFFFFEEB & 0x6D37) & (0xFFFFFFBF & 0x7FE7);
        H.lIIllIlllIlIl[48] = 0xFFFFDBF5 & 0x2FFA;
        H.lIIllIlllIlIl[49] = 0xFFFFBBE1 & 0x579E;
        H.lIIllIlllIlIl[50] = 0xFFFFBFDF & 0x4BFF;
        H.lIIllIlllIlIl[51] = 0xFFFFF3C7 & 0x1FBF;
        H.lIIllIlllIlIl[52] = 0xFFFFEFED & 0x1BFA;
        H.lIIllIlllIlIl[53] = 0xFFFFFFFE & 0xBD9;
        H.lIIllIlllIlIl[54] = -(0x74 ^ 0x72) & (0xFFFFEBDD & 0x1FF7);
        H.lIIllIlllIlIl[55] = -(0xAA ^ 0xBF) & (0xFFFF93BF & 0x7FDD);
        H.lIIllIlllIlIl[56] = -(0xFFFFD5CD & 0x6E7F) & (0xFFFFDFFF & 0x6FFD);
        H.lIIllIlllIlIl[57] = 0xFFFF979D & 0x7BEE;
        H.lIIllIlllIlIl[58] = -(0xFFFFF4FF & 0xF47) & (0xFFFFDFFF & 0x2FDF);
        H.lIIllIlllIlIl[59] = -(0xFFFFA984 & 0x7E7F) & (0xFFFFBBDB & 0x7FBF);
        H.lIIllIlllIlIl[60] = -(0xFFFFB837 & 0x67DA) & (0xFFFFFFFD & 0x2BBF);
        H.lIIllIlllIlIl[61] = -(0xFFFFBD0D & 0x76FB) & (0xFFFFFFBD & 0x3FDE);
        H.lIIllIlllIlIl[62] = 0xFFFFD7ED & 0x3BB6;
        H.lIIllIlllIlIl[63] = -(0xFFFFFE59 & 0x35EF) & (0xFFFFFFFF & 0x3FDF);
        H.lIIllIlllIlIl[64] = -(0xFFFFFF66 & 0x54FB) & (0xFFFFFFEF & 0x5FFF);
        H.lIIllIlllIlIl[65] = -(0xFFFFBB7D & 0x4C93) & (0xFFFFDFBF & 0x3BF7);
        H.lIIllIlllIlIl[66] = 0x6A ^ 0x7D;
        H.lIIllIlllIlIl[67] = -(0xFFFFE27D & 0x5DEF) & (0xFFFFCBFF & Short.MAX_VALUE);
        H.lIIllIlllIlIl[68] = 0xFFFFBBFF & 0x57BB;
        H.lIIllIlllIlIl[69] = 0x6C ^ 0x74;
        H.lIIllIlllIlIl[70] = -(0xFFFFF8F5 & 0x6F5F) & (0xFFFFFBFF & Short.MAX_VALUE);
        H.lIIllIlllIlIl[71] = -(0xFFFFE37D & 0x7CB3) & (0xFFFFFFFF & 0x6BBD);
        H.lIIllIlllIlIl[72] = -(0xFFFFE7BF & 0x5861) & (0xFFFFFFEF & 0x53FD);
        H.lIIllIlllIlIl[73] = 0xFFFFD3F7 & 0x3FDA;
        H.lIIllIlllIlIl[74] = 0xFFFFFFF4 & 0x13DB;
        H.lIIllIlllIlIl[75] = 0xFFFFFBDD & 0x17F3;
        H.lIIllIlllIlIl[76] = 0xFFFFDFCA & 0x2BBF;
        H.lIIllIlllIlIl[77] = 0xFFFF9BFF & 0x77E2;
        H.lIIllIlllIlIl[78] = -(0xFFFFCA0D & 0x7DF6) & (0xFFFFFBFF & 0x5FD7);
        H.lIIllIlllIlIl[79] = 0xFFFF9FAF & 0x6BDB;
        H.lIIllIlllIlIl[80] = 0xFFFF9FEF & 0x73F7;
        H.lIIllIlllIlIl[81] = 0xFFFFF7FF & 0x1BEF;
        H.lIIllIlllIlIl[82] = 0xFFFF97EA & 0x7BFF;
        H.lIIllIlllIlIl[83] = -(0xFFFFE963 & 0x36FE) & (0xFFFFFBFF & 0x2FFD);
        H.lIIllIlllIlIl[84] = -(0xFFFFFF97 & 0x4C7F) & (0xFFFFFFFF & 0x5FFF);
        H.lIIllIlllIlIl[85] = 0xFFFFB3FE & 0x5FE7;
        H.lIIllIlllIlIl[86] = 0xFFFF8FE7 & 0x7BBF;
        H.lIIllIlllIlIl[87] = 0xFFFF9FDF & 0x73FF;
        H.lIIllIlllIlIl[88] = -(0xFFFFE8B7 & 0x3F49) & (0xFFFFBFF7 & 0x7BED);
        H.lIIllIlllIlIl[89] = 0x2A ^ 0 ^ (1 ^ 0x32);
        H.lIIllIlllIlIl[90] = -(0xFFFFFC13 & 0x63ED) & (0xFFFFEBAF & Short.MAX_VALUE);
        H.lIIllIlllIlIl[91] = 0xFFFFBFFF & 0x4BBB;
        H.lIIllIlllIlIl[92] = -(0xFFFFC59D & 0x7E6B) & (0xFFFFDFFB & 0x77ED);
        H.lIIllIlllIlIl[93] = -(0xFFFFF453 & 0x6FBF) & (0xFFFFFFF7 & 0x77FA);
        H.lIIllIlllIlIl[94] = 0xFFFFFBFF & 0x17D7;
        H.lIIllIlllIlIl[95] = -(0xFFFFEFF9 & 0x740F) & (0xFFFFF7FE & 0x7FDF);
        H.lIIllIlllIlIl[96] = 0xFFFFDBF7 & 0x2FDF;
        H.lIIllIlllIlIl[97] = -(0xFFFFF5B6 & 0x3E6B) & (0xFFFFBFFF & 0x7FFD);
        H.lIIllIlllIlIl[98] = -(0xFFFFBD67 & 0x469B) & (0xFFFFD7FF & 0x3FD7);
        H.lIIllIlllIlIl[99] = 0xDE ^ 0xC4;
        H.lIIllIlllIlIl[100] = -(0xFFFFFDF3 & 0x560F) & (0xFFFFDFFF & 0x7FDF);
        H.lIIllIlllIlIl[101] = -(0xFFFFEDFD & 0x5E03) & (0xFFFFFFF3 & 0x5FDF);
        H.lIIllIlllIlIl[102] = 0x3E ^ 0x71 ^ (0xCB ^ 0x9F);
        H.lIIllIlllIlIl[103] = -(0xFFFFF4FD & 0x6B17) & (0xFFFFFFFF & 0x6BF6);
        H.lIIllIlllIlIl[104] = -(0xFFFFF81D & 0x37EF) & (0xFFFFBBEF & 0x7FFC);
        H.lIIllIlllIlIl[105] = 0x87 ^ 0x9B;
        H.lIIllIlllIlIl[106] = -(0xFFFFB747 & 0x7CBB) & (0xFFFFFFEE & 0x3FF7);
        H.lIIllIlllIlIl[107] = -(0xFFFFF6A5 & 0x7D5F) & (0xFFFFFFE7 & Short.MAX_VALUE);
        H.lIIllIlllIlIl[108] = 0x7E ^ 0x63;
        H.lIIllIlllIlIl[109] = 0xFFFF8BF7 & 0x7FE9;
        H.lIIllIlllIlIl[110] = 0xFFFFDFDF & 0x33EC;
        H.lIIllIlllIlIl[111] = -(0xFFFFEBA3 & 0x7C7D) & (0xFFFFFBFF & 0x7FEB);
        H.lIIllIlllIlIl[112] = 0x93 ^ 0xAF ^ (0x7F ^ 0x5D);
        H.lIIllIlllIlIl[113] = -(0xFFFFCE2B & 0x79F6) & (0xFFFFFFEF & 0x5BFF);
        H.lIIllIlllIlIl[114] = 0xFFFFD7EF & 0x3BDF;
        H.lIIllIlllIlIl[115] = 1 ^ (0x16 ^ 8);
        H.lIIllIlllIlIl[116] = -(0xFFFFF9FF & 0x7602) & (0xFFFFFBDF & Short.MAX_VALUE);
        H.lIIllIlllIlIl[117] = 0x6E ^ 0x4E;
        H.lIIllIlllIlIl[118] = -(0xFFFFEDFF & 0x3E47) & (0xFFFFFFFF & 0x3FEF);
        H.lIIllIlllIlIl[119] = 0x10 ^ 0x31;
        H.lIIllIlllIlIl[120] = 0x74 ^ 0x56;
        H.lIIllIlllIlIl[121] = 0xFFFF8BDF & 0x7FE7;
        H.lIIllIlllIlIl[122] = 0x60 ^ 0x43;
        H.lIIllIlllIlIl[123] = -(0xFFFFBEF5 & 0x451F) & (0xFFFF8FDF & 0x7FF6);
        H.lIIllIlllIlIl[124] = 0xFFFFABEE & 0x5FD7;
        H.lIIllIlllIlIl[125] = 0x76 ^ 0x52;
        H.lIIllIlllIlIl[126] = -(0xFFFFB2EB & 0x7D5C) & (0xFFFFFFFF & 0x3BFF);
        H.lIIllIlllIlIl[127] = -(0xFFFFEF27 & 0x7CDE) & (0xFFFFFFEF & 0x7FBF);
        H.lIIllIlllIlIl[128] = 0x30 ^ 0x15;
        H.lIIllIlllIlIl[129] = 0xFFFFAFB3 & 0x5BFC;
        H.lIIllIlllIlIl[130] = -(0xFFFFEFEF & 0x305B) & (0xFFFFF3FF & 0x3FFF);
        H.lIIllIlllIlIl[131] = -(0xFFFF8EB6 & 0x754F) & (0xFFFFD7BD & 0x3FEF);
        H.lIIllIlllIlIl[132] = 0xFFFFAFFD & 0x5BBB;
        H.lIIllIlllIlIl[133] = 0xFFFFFFF7 & 0x13BC;
        H.lIIllIlllIlIl[134] = 0x40 ^ 0x66;
        H.lIIllIlllIlIl[135] = 0xFFFFBBBD & 0x57FF;
        H.lIIllIlllIlIl[136] = 123 + 2 - 105 + 122 ^ 98 + 77 - 129 + 123;
        H.lIIllIlllIlIl[137] = 0xAC ^ 0x84;
        H.lIIllIlllIlIl[138] = 0x47 ^ 0x65 ^ (0x21 ^ 0x2A);
        H.lIIllIlllIlIl[139] = 5 + 78 - 41 + 96 ^ 33 + 125 - 132 + 134;
        H.lIIllIlllIlIl[140] = 0x80 ^ 0xAB;
        H.lIIllIlllIlIl[141] = -(0xFFFFCBCB & 0x747D) & (0xFFFFF3FF & 0x5FFF);
    }

    public boolean run() {
        H var20;
        if (!H.lIllIIIlllIlIIl(this.aH ? 1 : 0) || H.lIllIIIlllIlIlI((Object)this.aF.method(), (Object)b.ROGUES_DEN)) {
            return lIIllIlllIlIl[1];
        }
        Player var34 = Players.getLocal();
        WorldPoint var2 = var34.getWorldLocation();
        if (H.lIllIIIlllIlIll(var2.getY(), lIIllIlllIlIl[12])) {
            aD = lIIllIlllIlIl[1];
            var20.aI = lIIllIlllIlIl[1];
            return var20.Q();
        }
        RectangularArea var19 = new RectangularArea(lIIllIlllIlIl[13], lIIllIlllIlIl[14], lIIllIlllIlIl[15], lIIllIlllIlIl[16], lIIllIlllIlIl[0]);
        if (H.lIllIIIlllIllII(var34.getAnimation(), lIIllIlllIlIl[11]) && H.lIllIIIlllIlIIl(var19.contains(var2) ? 1 : 0)) {
            return lIIllIlllIlIl[0];
        }
        if (H.lIllIIIlllIIlll(var20.aI ? 1 : 0)) {
            return lIIllIlllIlIl[0];
        }
        Iterator<g> var3 = aE.iterator();
        while (H.lIllIIIlllIIlll(var3.hasNext() ? 1 : 0)) {
            g var15 = var3.next();
            if (H.lIllIIIlllIIlll(var15.c(var2) ? 1 : 0)) {
                var15.y();
                return lIIllIlllIlIl[0];
            }
            0;
            if ((0x8B ^ 0xA8 ^ (0x9E ^ 0xB9)) > 0) continue;
            return ((35 + 22 - -16 + 62 ^ 95 + 90 - 151 + 106) & (0x1C ^ 0x20 ^ (0x28 ^ 0x1F) ^ -1)) != 0;
        }
        return lIIllIlllIlIl[1];
    }

    private static boolean lIllIIIlllIllIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static String lIllIIIllIIlIIl(String var7, String var9) {
        try {
            SecretKeySpec var13 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var9.getBytes(StandardCharsets.UTF_8)), lIIllIlllIlIl[20]), "DES");
            Cipher var28 = Cipher.getInstance("DES");
            var28.init(lIIllIlllIlIl[3], var13);
            return new String(var28.doFinal(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIIlllIlIll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIllIIIlllIIlIl(Object object) {
        return object == null;
    }

    private static String lIllIIIllIIlIII(String var30, String var1) {
        var30 = new String(Base64.getDecoder().decode(var30.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var35 = new StringBuilder();
        char[] var33 = var1.toCharArray();
        int var23 = lIIllIlllIlIl[1];
        char[] var4 = var30.toCharArray();
        int var26 = var4.length;
        int var22 = lIIllIlllIlIl[1];
        while (H.lIllIIIlllIlllI(var22, var26)) {
            char var24 = var4[var22];
            var35.append((char)(var24 ^ var33[var23 % var33.length]));
            0;
            ++var23;
            ++var22;
            0;
            if (1 <= 2) continue;
            return null;
        }
        return String.valueOf(var35);
    }

    private static boolean lIllIIIlllIlIIl(int n2) {
        return n2 == 0;
    }

    @Subscribe
    public void a(ProjectileSpawned projectileSpawned) {
        aD = lIIllIlllIlIl[0];
    }

    private boolean Q() {
        NPC var6;
        Item var17;
        H var21;
        if (H.lIllIIIlllIIlll(this.aG ? 1 : 0)) {
            if (H.lIllIIIlllIlIIl(Dialog.isOpen() ? 1 : 0)) {
                NPC nPC2 = NPCs.getNearest(nPC -> nPC.getName().toLowerCase().contains(lIIllIllIllll[lIIllIlllIlIl[34]]));
                if (H.lIllIIIlllIIllI(nPC2)) {
                    nPC2.interact(lIIllIllIllll[lIIllIlllIlIl[17]]);
                    return lIIllIlllIlIl[0];
                }
                Movement.walkTo((int)lIIllIlllIlIl[18], (int)lIIllIlllIlIl[19]);
                0;
                return lIIllIlllIlIl[0];
            }
            if (H.lIllIIIlllIIlll(Dialog.canContinue() ? 1 : 0)) {
                Dialog.continueSpace();
                return lIIllIlllIlIl[0];
            }
            if (H.lIllIIIlllIIlll(Dialog.isViewingOptions() ? 1 : 0)) {
                if (H.lIllIIIlllIIlll(Dialog.getOptions().stream().anyMatch(widget -> widget.getText().contains(lIIllIllIllll[lIIllIlllIlIl[33]])) ? 1 : 0)) {
                    var21.aG = lIIllIlllIlIl[1];
                    return lIIllIlllIlIl[0];
                }
                String[] stringArray = new String[lIIllIlllIlIl[3]];
                stringArray[H.lIIllIlllIlIl[1]] = lIIllIllIllll[lIIllIlllIlIl[20]];
                stringArray[H.lIIllIlllIlIl[0]] = lIIllIllIllll[lIIllIlllIlIl[21]];
                Dialog.chooseOption((String[])stringArray);
                0;
            }
            return lIIllIlllIlIl[0];
        }
        if (H.lIllIIIlllIlIIl(Movement.isStaminaBoosted() ? 1 : 0) && H.lIllIIIlllIIlll(var21.aF.useStaminaPotion() ? 1 : 0)) {
            var17 = Inventory.getFirst(item -> item.getName().startsWith(lIIllIllIllll[lIIllIlllIlIl[32]]));
            if (H.lIllIIIlllIIllI(var17)) {
                var17.interact(lIIllIllIllll[lIIllIlllIlIl[22]]);
                return lIIllIlllIlIl[0];
            }
            if (H.lIllIIIlllIIlll(Bank.isOpen() ? 1 : 0)) {
                Bank.withdraw(item -> item.getName().startsWith(lIIllIllIllll[lIIllIlllIlIl[31]]), (int)lIIllIlllIlIl[0], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                return lIIllIlllIlIl[0];
            }
            int[] nArray = new int[lIIllIlllIlIl[0]];
            nArray[H.lIIllIlllIlIl[1]] = lIIllIlllIlIl[23];
            var6 = NPCs.getNearest((int[])nArray);
            if (H.lIllIIIlllIIllI(var6)) {
                var6.interact(lIIllIllIllll[lIIllIlllIlIl[24]]);
                return lIIllIlllIlIl[0];
            }
        }
        if (H.lIllIIIlllIlIII(Players.getLocal().getWorldLocation().getY(), lIIllIlllIlIl[12]) && H.lIllIIIlllIIlll(Dialog.canContinue() ? 1 : 0)) {
            var21.aG = lIIllIlllIlIl[0];
            return lIIllIlllIlIl[0];
        }
        var17 = Static.getClient().getItemContainer(InventoryID.EQUIPMENT);
        if (H.lIllIIIlllIIllI(var17) && H.lIllIIIlllIIlll(Stream.of(var17.getItems()).anyMatch(item -> {
            int n2;
            if (H.lIllIIIlllIIllI(item) && H.lIllIIIlllIllII(item.getId(), lIIllIlllIlIl[11])) {
                n2 = lIIllIlllIlIl[0];
                0;
                if (-1 == 2) {
                    return ((0x39 ^ 0x70 ^ (0x6A ^ 0x37)) & (84 + 37 - 23 + 43 ^ 138 + 83 - 216 + 148 ^ -1)) != 0;
                }
            } else {
                n2 = lIIllIlllIlIl[1];
            }
            return n2 != 0;
        }) ? 1 : 0)) {
            if (H.lIllIIIlllIIlll(Bank.isOpen() ? 1 : 0)) {
                Bank.depositEquipment();
                return lIIllIlllIlIl[0];
            }
            int[] nArray = new int[lIIllIlllIlIl[0]];
            nArray[H.lIIllIlllIlIl[1]] = lIIllIlllIlIl[23];
            var6 = NPCs.getNearest((int[])nArray);
            if (H.lIllIIIlllIIllI(var6)) {
                var6.interact(lIIllIllIllll[lIIllIlllIlIl[25]]);
                return lIIllIlllIlIl[0];
            }
            return lIIllIlllIlIl[1];
        }
        if (H.lIllIIIlllIlIIl(Inventory.isEmpty() ? 1 : 0)) {
            if (H.lIllIIIlllIIlll(Bank.isOpen() ? 1 : 0)) {
                Bank.depositInventory();
                return lIIllIlllIlIl[0];
            }
            int[] nArray = new int[lIIllIlllIlIl[0]];
            nArray[H.lIIllIlllIlIl[1]] = lIIllIlllIlIl[23];
            var6 = NPCs.getNearest((int[])nArray);
            if (H.lIllIIIlllIIllI(var6)) {
                var6.interact(lIIllIllIllll[lIIllIlllIlIl[26]]);
                return lIIllIlllIlIl[0];
            }
        }
        if (H.lIllIIIlllIIlll(Bank.isOpen() ? 1 : 0)) {
            int[] nArray = new int[lIIllIlllIlIl[0]];
            nArray[H.lIIllIlllIlIl[1]] = lIIllIlllIlIl[27];
            if (H.lIllIIIlllIllIl(Bank.getCount((boolean)lIIllIlllIlIl[0], (int[])nArray), lIIllIlllIlIl[5])) {
                var21.aH = lIIllIlllIlIl[0];
                return lIIllIlllIlIl[0];
            }
        }
        String[] stringArray = new String[lIIllIlllIlIl[0]];
        stringArray[H.lIIllIlllIlIl[1]] = lIIllIllIllll[lIIllIlllIlIl[28]];
        TileObjects.getNearest((String[])stringArray).interact(lIIllIllIllll[lIIllIlllIlIl[29]]);
        return lIIllIlllIlIl[0];
    }

    @Inject
    public H(SquireThievingConfig squireThievingConfig) {
        this.aG = lIIllIlllIlIl[0];
        this.aH = lIIllIlllIlIl[1];
        this.aF = squireThievingConfig;
    }

    private static void lIllIIIlllIIIll() {
        lIIllIllIllll = new String[lIIllIlllIlIl[102]];
        H.lIIllIllIllll[H.lIIllIlllIlIl[1]] = H."Take";
        H.lIIllIllIllll[H.lIIllIlllIlIl[0]] = H."Door";
        H.lIIllIllIllll[H.lIIllIlllIlIl[3]] = H."Open";
        H.lIIllIllIllll[H.lIIllIlllIlIl[6]] = H."Select";
        H.lIIllIllIllll[H.lIIllIlllIlIl[7]] = H."Flash powder";
        H.lIIllIllIllll[H.lIIllIlllIlIl[5]] = H."Take";
        H.lIIllIllIllll[H.lIIllIlllIlIl[8]] = H."Flash powder";
        H.lIIllIllIllll[H.lIIllIlllIlIl[17]] = H."Talk-to";
        H.lIIllIllIllll[H.lIIllIlllIlIl[20]] = H."Yes actually, ";
        H.lIIllIllIllll[H.lIIllIlllIlIl[21]] = H."Ok";
        H.lIIllIllIllll[H.lIIllIlllIlIl[22]] = H."Drink";
        H.lIIllIllIllll[H.lIIllIlllIlIl[24]] = H."Bank";
        H.lIIllIllIllll[H.lIIllIlllIlIl[25]] = H."Bank";
        H.lIIllIllIllll[H.lIIllIlllIlIl[26]] = H."Bank";
        H.lIIllIllIllll[H.lIIllIlllIlIl[28]] = H."Doorway";
        H.lIIllIllIllll[H.lIIllIlllIlIl[29]] = H."Open";
        H.lIIllIllIllll[H.lIIllIlllIlIl[30]] = H."You start cracking";
        H.lIIllIllIllll[H.lIIllIlllIlIl[31]] = H."Stamina";
        H.lIIllIllIllll[H.lIIllIlllIlIl[32]] = H."Stamina";
        H.lIIllIllIllll[H.lIIllIlllIlIl[33]] = H."maze again";
        H.lIIllIllIllll[H.lIIllIlllIlIl[34]] = H."brian";
        H.lIIllIllIllll[H.lIIllIlllIlIl[35]] = H."Rogue Guard";
        H.lIIllIllIllll[H.lIIllIlllIlIl[36]] = H."Tile";
        H.lIIllIllIllll[H.lIIllIlllIlIl[66]] = H."Climb";
        H.lIIllIllIllll[H.lIIllIlllIlIl[69]] = H."Search";
        H.lIIllIllIllll[H.lIIllIlllIlIl[89]] = H."Search";
        H.lIIllIllIllll[H.lIIllIlllIlIl[99]] = H."Crack";
    }

    /*
     * WARNING - void declaration
     */
    private static void P() {
        String[] stringArray = new String[lIIllIlllIlIl[0]];
        stringArray[H.lIIllIlllIlIl[1]] = lIIllIllIllll[lIIllIlllIlIl[8]];
        Item item = Inventory.getFirst((String[])stringArray);
        if (H.lIllIIIlllIIlIl(item)) {
            H.O();
            return;
        }
        Player var12 = Players.getLocal();
        if (H.lIllIIIlllIIlll(aD ? 1 : 0)) {
            WorldPoint var31 = new WorldPoint(lIIllIlllIlIl[9], lIIllIlllIlIl[10], lIIllIlllIlIl[0]);
            ScenePoint var25 = ScenePoint.fromWorld((WorldPoint)var31);
            Movement.setDestination((int)var25.getX(), (int)var25.getY());
            return;
        }
        NPC var31 = NPCs.getNearest(nPC -> {
            int n2;
            String[] stringArray = new String[lIIllIlllIlIl[0]];
            stringArray[H.lIIllIlllIlIl[1]] = lIIllIllIllll[lIIllIlllIlIl[35]];
            if (H.lIllIIIlllIIlll(Predicates.names((String[])stringArray).test(nPC) ? 1 : 0) && H.lIllIIIlllIIlll(aC.contains(nPC.getWorldLocation()) ? 1 : 0)) {
                n2 = lIIllIlllIlIl[0];
                0;
                if (((0x54 ^ 0x5A) & ~(0x2F ^ 0x21)) != 0) {
                    return false;
                }
            } else {
                n2 = lIIllIlllIlIl[1];
            }
            return n2 != 0;
        });
        if (H.lIllIIIlllIlIII(Players.getLocal().getAnimation(), lIIllIlllIlIl[11]) && H.lIllIIIlllIlIIl(var12.isMoving() ? 1 : 0) && H.lIllIIIlllIlIII(var31.getGraphic(), lIIllIlllIlIl[11])) {
            void var27;
            var27.useOn((Actor)var31);
        }
    }

    private static String lIllIIIllIIlIlI(String var8, String var5) {
        try {
            SecretKeySpec var10 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var32 = Cipher.getInstance("Blowfish");
            var32.init(lIIllIlllIlIl[3], var10);
            return new String(var32.doFinal(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIIlllIIlll(int n2) {
        return n2 != 0;
    }
}

