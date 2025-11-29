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
package gg.squire.thieving.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.thieving.SquireThievingConfig;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;
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
import gg.squire.thieving.tasks.GameEnum;
import gg.squire.thieving.tasks.GHelper;

@TaskDesc(name="Rogues Den", register=true)
public class RoguesDenTask
extends Task {
    public static final  WorldPoint aB;
    private final  SquireThievingConfig aF;
    private  boolean aH;
    private static  boolean aD;
    private  boolean aG;
    public static final  WorldPoint aA;
    private  boolean aI;
    public static final  WorldPoint az;
    
    public static final  Area aC;
    
    public static final  List<g> aE;

    private static void O() {
        String[] stringArray = new String[var2[0]];
        stringArray[H.var2[1]] = var1[var2[7]];
        TileItems.getFirstAt((WorldPoint)aB, (Predicate)Predicates.names((String[])stringArray)).interact(var1[var2[5]]);
    }

    private static boolean var3(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var4(Object object, Object object2) {
        return object != object2;
    }

    private static void L() {
        int[] nArray = new int[var2[0]];
        nArray[H.var2[1]] = var2[2];
        TileItem tileItem = TileItems.getFirstAt((WorldPoint)az, (Predicate)Predicates.ids((int[])nArray));
        if (H.var5(tileItem)) {
            return;
        }
        tileItem.interact(var1[var2[1]]);
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var6;
        if (H.var4(chatMessage.getType(), ChatMessageType.GAMEMESSAGE) && H.var4(chatMessage.getType(), ChatMessageType.SPAM)) {
            return;
        }
        String var7 = var6.getMessage();
        if (H.var8(var7.contains(var1[var2[30]]) ? 1 : 0)) {
            var9.aI = var2[0];
            aD = var2[1];
        }
    }

    /*
     * WARNING - void declaration
     */
    private static void N() {
        Widget widget = Widgets.get((int)var2[4], (int)var2[5]);
        if (!H.var10(widget) || H.var8(widget.isHidden() ? 1 : 0)) {
            H.M();
            0;
            if ((0x75 ^ 0x11 ^ (0xC6 ^ 0xA6)) < 0) {
                return;
            }
        } else {
            void var11;
            var11.interact(var1[var2[6]]);
        }
    }

    private static boolean var12(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean var13(int n2, int n3) {
        return n2 < n3;
    }

    static {
        H.var14();
        H.var15();
        az = new WorldPoint(var2[37], var2[38], var2[0]);
        aA = new WorldPoint(var2[39], var2[40], var2[0]);
        aB = new WorldPoint(var2[13], var2[41], var2[0]);
        aC = new RectangularArea(var2[42], var2[43], var2[44], var2[16], var2[0]);
        g[] gArray = new g[var2[45]];
        gArray[H.var2[1]] = g.a(var2[46], var2[47]).b(var2[48], var2[49]);
        gArray[H.var2[0]] = g.a(var2[50], var2[51]).b(var2[52], var2[47]);
        gArray[H.var2[3]] = g.a(var2[53], var2[51]).b(var2[50], var2[51]);
        gArray[H.var2[6]] = g.a(var2[54], var2[55]).b(var2[53], var2[51]);
        gArray[H.var2[7]] = g.a(var2[42], var2[55]).b(var2[39], var2[55]);
        gArray[H.var2[5]] = g.a(var2[56], var2[57]).b(var2[42], var2[55]);
        gArray[H.var2[8]] = g.a(var2[58], var2[59], var2[0]).b(var2[60], var2[57]);
        gArray[H.var2[17]] = g.a(var2[61], var2[62], var2[0]).b(var2[63], var2[59]);
        gArray[H.var2[20]] = g.a(var2[64], var2[65], var1[var2[66]], var2[0]).b(var2[61], var2[62]);
        gArray[H.var2[21]] = g.a(var2[67], var2[68], var1[var2[69]], var2[0]).b(var2[64], var2[70]);
        gArray[H.var2[22]] = g.a(var2[71], var2[72]).b(var2[67], var2[68]);
        gArray[H.var2[24]] = g.a(var2[71], var2[73]).b(var2[71], var2[74]).b(var2[71], var2[75]);
        gArray[H.var2[25]] = g.a(var2[76], var2[77], var2[0]).b(var2[71], var2[78]);
        gArray[H.var2[26]] = g.a(var2[79], var2[80]).b(var2[76], var2[77]);
        gArray[H.var2[28]] = g.a(var2[67], var2[81]).b(var2[79], var2[82]);
        gArray[H.var2[29]] = g.a(var2[83], var2[84]).b(var2[67], var2[81]);
        gArray[H.var2[30]] = g.a(var2[83], var2[85]).b(var2[83], var2[85]);
        gArray[H.var2[31]] = g.a(var2[86], var2[87]).b(var2[83], var2[88]);
        gArray[H.var2[32]] = g.a(var2[56], var2[87], var1[var2[89]]).b(var2[90], var2[87]);
        gArray[H.var2[33]] = g.a(var2[91], var2[92]).b(var2[56], var2[93]);
        gArray[H.var2[34]] = g.a(H::L).d(var2[0]).b(var2[91], var2[92]).a((WorldPoint worldPoint) -> {
            int n2;
            String[] stringArray = new String[var2[0]];
            stringArray[H.var2[1]] = var1[var2[36]];
            if (H.var5(Inventory.getFirst((String[])stringArray)) && H.var3(worldPoint.getX(), az.getX()) && H.var3(worldPoint.getY(), az.getY())) {
                n2 = var2[0];
                0;
                if null != null {
                    return null;
                }
            } else {
                n2 = var2[1];
            }
            return n2 != 0;
        });
        gArray[H.var2[35]] = g.a(H::M).d(var2[0]).d(az);
        gArray[H.var2[36]] = g.a(H::N).d(var2[0]).d(aA);
        gArray[H.var2[66]] = g.a(var2[9], var2[94], var2[0]).b(var2[54], var2[40]);
        gArray[H.var2[69]] = g.a(var2[53], var2[95], var2[0]).a(var2[96], var2[95], var2[97], var2[94]);
        gArray[H.var2[89]] = g.a(var2[97], var2[78], var2[0]).a(var2[53], var2[78], var2[97], var2[98]);
        gArray[H.var2[99]] = g.a(var2[50], var2[94], var2[0]).a(var2[100], var2[101], var2[50], var2[94]);
        gArray[H.var2[102]] = g.a(var2[103], var2[78], var2[0]).a(var2[104], var2[101], var2[103], var2[94]);
        gArray[H.var2[105]] = g.a(var2[106], var2[72], var2[0]).a(var2[107], var2[72], var2[106], var2[98]);
        gArray[H.var2[108]] = g.a(var2[109], var2[110], var2[0]).a(var2[104], var2[111], var2[106], var2[110]);
        gArray[H.var2[112]] = g.a(var2[104], var2[113], var2[0]).a(var2[104], var2[72], var2[103], var2[114]);
        gArray[H.var2[115]] = g.a(var2[116], var2[72], var2[0]).a(var2[100], var2[72], var2[50], var2[114]);
        gArray[H.var2[117]] = g.a(var2[44], var2[118], var2[0]).b(var2[116], var2[110]);
        gArray[H.var2[119]] = g.a(var2[54], var2[118]).b(var2[44], var2[118]);
        gArray[H.var2[120]] = g.a(var2[121], var2[118]).b(var2[54], var2[118]);
        gArray[H.var2[122]] = g.a(var2[123], var2[118]).b(var2[124], var2[118]);
        gArray[H.var2[125]] = g.a(var2[126], var2[127]).b(var2[13], var2[118]);
        gArray[H.var2[128]] = g.a(var2[129], var2[130], var2[0]).a(var2[90], var2[131], var2[132], var2[133]);
        gArray[H.var2[134]] = g.a(var2[129], var2[135]).b(var2[129], var2[130]);
        gArray[H.var2[136]] = g.a(var2[129], var2[111], var2[0]).b(var2[129], var2[135]);
        gArray[H.var2[137]] = g.a(var2[129], var2[101]).b(var2[129], var2[111]);
        gArray[H.var2[138]] = g.a(H::O).d(var2[0]).b(var2[129], var2[101]);
        gArray[H.var2[139]] = g.a(H::P).a(var2[13], var2[14], var2[15], var2[16], var2[0]);
        gArray[H.var2[140]] = g.a(var2[37], var2[141], var1[var2[99]], var2[0]).b(var2[44], var2[68]).b(var2[44], var2[141]).b(var2[37], var2[141]).b(var2[9], var2[10]).b(var2[44], var2[14]);
        aE = Arrays.asList(gArray);
    }

    private static void M() {
        String[] stringArray = new String[var2[0]];
        stringArray[H.var2[1]] = var1[var2[0]];
        TileObjects.getFirstAt((WorldPoint)aA, (Predicate)Predicates.names((String[])stringArray)).interact(var1[var2[3]]);
    }

    private static boolean var10(Object object) {
        return object != null;
    }

    private static void var14() {
        var2 = new int[142];
        H.var2[0] = 1;
        H.var2[1] = (0x36 ^ 0x1D ^ (0x65 ^ 0x68)) & (0x2C ^ 0x27 ^ (0xBE ^ 0x93) ^ -1);
        H.var2[2] = -(0xFFFFD877 & 0x67BB) & (0xFFFFF5FF & 0x5FF2);
        H.var2[3] = 2;
        H.var2[4] = 0xFFFF8AFF & 0x77B0;
        H.var2[5] = 0x11 ^ 0x14;
        H.var2[6] = 3;
        H.var2[7] = 0x52 ^ 0x6D ^ (0xBC ^ 0x87);
        H.var2[8] = 0x4A ^ 0x4C;
        H.var2[9] = -(0xFFFFA7B2 & 0x7C4F) & (0xFFFFAFD7 & Short.MAX_VALUE);
        H.var2[10] = 0xFFFFD3D7 & 0x3FEB;
        H.var2[11] = -1;
        H.var2[12] = -(0xFFFF8F95 & 0x7C6B) & (0xFFFFBF7F & 0x5FFF);
        H.var2[13] = -(0xFFFF8EA7 & 0x7579) & (0xFFFFEFE9 & 0x1FF7);
        H.var2[14] = -(0x7D ^ 0x77) & (0xFFFFFFCD & 0x13FB);
        H.var2[15] = -(0xFFFFDB4F & 0x64BD) & (0xFFFFDBDF & 0x6FFE);
        H.var2[16] = -(0xFFFFFBA1 & 0x6C7F) & (0xFFFFFFEB & 0x7BFE);
        H.var2[17] = 0xF8 ^ 0xBF ^ (0x32 ^ 0x72);
        H.var2[18] = -(0xFFFFF226 & 0x2DDB) & (0xFFFFFBFF & 0x2FED);
        H.var2[19] = -(0xFFFFEDEB & 0x3A1D) & (0xFFFFFFFF & 0x3B7B);
        H.var2[20] = 0x3A ^ 0x68 ^ (0x15 ^ 0x4F);
        H.var2[21] = 0x41 ^ 0x48;
        H.var2[22] = 0x1D ^ 0x17;
        H.var2[23] = 0xFFFFCE7A & 0x3DFF;
        H.var2[24] = 34 + 70 - 39 + 137 ^ 32 + 186 - 211 + 186;
        H.var2[25] = 0x22 ^ 0x2E;
        H.var2[26] = 0x14 ^ 0x2F ^ (0xBD ^ 0x8B);
        H.var2[27] = 0xFFFFD77B & 0x7BBF;
        H.var2[28] = 7 ^ 9;
        H.var2[29] = 3 ^ 0xC;
        H.var2[30] = 0x26 ^ 0x36;
        H.var2[31] = 0x84 ^ 0x95;
        H.var2[32] = 7 ^ 0x15;
        H.var2[33] = 0x33 ^ 0x3F ^ (0x66 ^ 0x79);
        H.var2[34] = 0x2F ^ 0x3B;
        H.var2[35] = 2 ^ (0xAB ^ 0xBC);
        H.var2[36] = 59 + 133 - 108 + 57 ^ 144 + 31 - 68 + 48;
        H.var2[37] = -(0xFFFFDCB5 & 0x334F) & (0xFFFFDBFF & 0x3FCE);
        H.var2[38] = -(0x12 ^ 0x35) & (0xFFFFBBFF & 0x57FE);
        H.var2[39] = 0xFFFF9BFF & 0x6FCF;
        H.var2[40] = -(0xFFFFFC3F & 0x6FE5) & (0xFFFFFFFE & Short.MAX_VALUE);
        H.var2[41] = -(0xFFFFFDBF & 0x6E71) & (0xFFFFFFFF & 0x7FF7);
        H.var2[42] = -(0xFFFFFD6F & 0x3693) & (0xFFFFBFDE & 0x7FE7);
        H.var2[43] = -3 & (0xFFFF9FC7 & 0x73FB);
        H.var2[44] = -(0xFFFFDE7F & 0x35AB) & (0xFFFFFFFE & 0x1FFF);
        H.var2[45] = 0x30 ^ 0x1C;
        H.var2[46] = 0xFFFFDBFD & 0x2FEB;
        H.var2[47] = -(0xFFFFFEEB & 0x6D37) & (0xFFFFFFBF & 0x7FE7);
        H.var2[48] = 0xFFFFDBF5 & 0x2FFA;
        H.var2[49] = 0xFFFFBBE1 & 0x579E;
        H.var2[50] = 0xFFFFBFDF & 0x4BFF;
        H.var2[51] = 0xFFFFF3C7 & 0x1FBF;
        H.var2[52] = 0xFFFFEFED & 0x1BFA;
        H.var2[53] = 0xFFFFFFFE & 0xBD9;
        H.var2[54] = -(0x74 ^ 0x72) & (0xFFFFEBDD & 0x1FF7);
        H.var2[55] = -(0xAA ^ 0xBF) & (0xFFFF93BF & 0x7FDD);
        H.var2[56] = -(0xFFFFD5CD & 0x6E7F) & (0xFFFFDFFF & 0x6FFD);
        H.var2[57] = 0xFFFF979D & 0x7BEE;
        H.var2[58] = -(0xFFFFF4FF & 0xF47) & (0xFFFFDFFF & 0x2FDF);
        H.var2[59] = -(0xFFFFA984 & 0x7E7F) & (0xFFFFBBDB & 0x7FBF);
        H.var2[60] = -(0xFFFFB837 & 0x67DA) & (0xFFFFFFFD & 0x2BBF);
        H.var2[61] = -(0xFFFFBD0D & 0x76FB) & (0xFFFFFFBD & 0x3FDE);
        H.var2[62] = 0xFFFFD7ED & 0x3BB6;
        H.var2[63] = -(0xFFFFFE59 & 0x35EF) & (0xFFFFFFFF & 0x3FDF);
        H.var2[64] = -(0xFFFFFF66 & 0x54FB) & (0xFFFFFFEF & 0x5FFF);
        H.var2[65] = -(0xFFFFBB7D & 0x4C93) & (0xFFFFDFBF & 0x3BF7);
        H.var2[66] = 0x6A ^ 0x7D;
        H.var2[67] = -(0xFFFFE27D & 0x5DEF) & (0xFFFFCBFF & Short.MAX_VALUE);
        H.var2[68] = 0xFFFFBBFF & 0x57BB;
        H.var2[69] = 0x6C ^ 0x74;
        H.var2[70] = -(0xFFFFF8F5 & 0x6F5F) & (0xFFFFFBFF & Short.MAX_VALUE);
        H.var2[71] = -(0xFFFFE37D & 0x7CB3) & (0xFFFFFFFF & 0x6BBD);
        H.var2[72] = -(0xFFFFE7BF & 0x5861) & (0xFFFFFFEF & 0x53FD);
        H.var2[73] = 0xFFFFD3F7 & 0x3FDA;
        H.var2[74] = 0xFFFFFFF4 & 0x13DB;
        H.var2[75] = 0xFFFFFBDD & 0x17F3;
        H.var2[76] = 0xFFFFDFCA & 0x2BBF;
        H.var2[77] = 0xFFFF9BFF & 0x77E2;
        H.var2[78] = -(0xFFFFCA0D & 0x7DF6) & (0xFFFFFBFF & 0x5FD7);
        H.var2[79] = 0xFFFF9FAF & 0x6BDB;
        H.var2[80] = 0xFFFF9FEF & 0x73F7;
        H.var2[81] = 0xFFFFF7FF & 0x1BEF;
        H.var2[82] = 0xFFFF97EA & 0x7BFF;
        H.var2[83] = -(0xFFFFE963 & 0x36FE) & (0xFFFFFBFF & 0x2FFD);
        H.var2[84] = -(0xFFFFFF97 & 0x4C7F) & (0xFFFFFFFF & 0x5FFF);
        H.var2[85] = 0xFFFFB3FE & 0x5FE7;
        H.var2[86] = 0xFFFF8FE7 & 0x7BBF;
        H.var2[87] = 0xFFFF9FDF & 0x73FF;
        H.var2[88] = -(0xFFFFE8B7 & 0x3F49) & (0xFFFFBFF7 & 0x7BED);
        H.var2[89] = 0x2A ^ 0 ^ (1 ^ 0x32);
        H.var2[90] = -(0xFFFFFC13 & 0x63ED) & (0xFFFFEBAF & Short.MAX_VALUE);
        H.var2[91] = 0xFFFFBFFF & 0x4BBB;
        H.var2[92] = -(0xFFFFC59D & 0x7E6B) & (0xFFFFDFFB & 0x77ED);
        H.var2[93] = -(0xFFFFF453 & 0x6FBF) & (0xFFFFFFF7 & 0x77FA);
        H.var2[94] = 0xFFFFFBFF & 0x17D7;
        H.var2[95] = -(0xFFFFEFF9 & 0x740F) & (0xFFFFF7FE & 0x7FDF);
        H.var2[96] = 0xFFFFDBF7 & 0x2FDF;
        H.var2[97] = -(0xFFFFF5B6 & 0x3E6B) & (0xFFFFBFFF & 0x7FFD);
        H.var2[98] = -(0xFFFFBD67 & 0x469B) & (0xFFFFD7FF & 0x3FD7);
        H.var2[99] = 0xDE ^ 0xC4;
        H.var2[100] = -(0xFFFFFDF3 & 0x560F) & (0xFFFFDFFF & 0x7FDF);
        H.var2[101] = -(0xFFFFEDFD & 0x5E03) & (0xFFFFFFF3 & 0x5FDF);
        H.var2[102] = 0x3E ^ 0x71 ^ (0xCB ^ 0x9F);
        H.var2[103] = -(0xFFFFF4FD & 0x6B17) & (0xFFFFFFFF & 0x6BF6);
        H.var2[104] = -(0xFFFFF81D & 0x37EF) & (0xFFFFBBEF & 0x7FFC);
        H.var2[105] = 0x87 ^ 0x9B;
        H.var2[106] = -(0xFFFFB747 & 0x7CBB) & (0xFFFFFFEE & 0x3FF7);
        H.var2[107] = -(0xFFFFF6A5 & 0x7D5F) & (0xFFFFFFE7 & Short.MAX_VALUE);
        H.var2[108] = 0x7E ^ 0x63;
        H.var2[109] = 0xFFFF8BF7 & 0x7FE9;
        H.var2[110] = 0xFFFFDFDF & 0x33EC;
        H.var2[111] = -(0xFFFFEBA3 & 0x7C7D) & (0xFFFFFBFF & 0x7FEB);
        H.var2[112] = 0x93 ^ 0xAF ^ (0x7F ^ 0x5D);
        H.var2[113] = -(0xFFFFCE2B & 0x79F6) & (0xFFFFFFEF & 0x5BFF);
        H.var2[114] = 0xFFFFD7EF & 0x3BDF;
        H.var2[115] = 1 ^ (0x16 ^ 8);
        H.var2[116] = -(0xFFFFF9FF & 0x7602) & (0xFFFFFBDF & Short.MAX_VALUE);
        H.var2[117] = 0x6E ^ 0x4E;
        H.var2[118] = -(0xFFFFEDFF & 0x3E47) & (0xFFFFFFFF & 0x3FEF);
        H.var2[119] = 0x10 ^ 0x31;
        H.var2[120] = 0x74 ^ 0x56;
        H.var2[121] = 0xFFFF8BDF & 0x7FE7;
        H.var2[122] = 0x60 ^ 0x43;
        H.var2[123] = -(0xFFFFBEF5 & 0x451F) & (0xFFFF8FDF & 0x7FF6);
        H.var2[124] = 0xFFFFABEE & 0x5FD7;
        H.var2[125] = 0x76 ^ 0x52;
        H.var2[126] = -(0xFFFFB2EB & 0x7D5C) & (0xFFFFFFFF & 0x3BFF);
        H.var2[127] = -(0xFFFFEF27 & 0x7CDE) & (0xFFFFFFEF & 0x7FBF);
        H.var2[128] = 0x30 ^ 0x15;
        H.var2[129] = 0xFFFFAFB3 & 0x5BFC;
        H.var2[130] = -(0xFFFFEFEF & 0x305B) & (0xFFFFF3FF & 0x3FFF);
        H.var2[131] = -(0xFFFF8EB6 & 0x754F) & (0xFFFFD7BD & 0x3FEF);
        H.var2[132] = 0xFFFFAFFD & 0x5BBB;
        H.var2[133] = 0xFFFFFFF7 & 0x13BC;
        H.var2[134] = 0x40 ^ 0x66;
        H.var2[135] = 0xFFFFBBBD & 0x57FF;
        H.var2[136] = 123 + 2 - 105 + 122 ^ 98 + 77 - 129 + 123;
        H.var2[137] = 0xAC ^ 0x84;
        H.var2[138] = 0x47 ^ 0x65 ^ (0x21 ^ 0x2A);
        H.var2[139] = 5 + 78 - 41 + 96 ^ 33 + 125 - 132 + 134;
        H.var2[140] = 0x80 ^ 0xAB;
        H.var2[141] = -(0xFFFFCBCB & 0x747D) & (0xFFFFF3FF & 0x5FFF);
    }

    public boolean run() {
        H var16;
        if (!H.var17(this.aH) || H.var4((Object)this.aF.method(), (Object)b.ROGUES_DEN)) {
            return var2[1];
        }
        Player var18 = Players.getLocal();
        WorldPoint var19 = var18.getWorldLocation();
        if (H.var20(var19.getY(), var2[12])) {
            aD = var2[1];
            var16.aI = var2[1];
            return var16.Q();
        }
        RectangularArea var21 = new RectangularArea(var2[13], var2[14], var2[15], var2[16], var2[0]);
        if (H.var12(var18.getAnimation(), var2[11]) && H.var17(var21.contains(var19) ? 1 : 0)) {
            return var2[0];
        }
        if (H.var8(var16.aI)) {
            return var2[0];
        }
        Iterator<g> var22 = aE.iterator();
        while (H.var8(var22.hasNext() ? 1 : 0)) {
            g var23 = var22.next();
            if (H.var8(var23.c(var19) ? 1 : 0)) {
                var23.y();
                return var2[0];
            }
            0;
            if ((0x8B ^ 0xA8 ^ (0x9E ^ 0xB9)) > 0) continue;
            return ((35 + 22 - -16 + 62 ^ 95 + 90 - 151 + 106) & (0x1C ^ 0x20 ^ (0x28 ^ 0x1F) ^ -1)) != 0;
        }
        return var2[1];
    }

    private static boolean var24(int n2, int n3) {
        return n2 >= n3;
    }

        catch (Exception var30) {
            var30.printStackTrace();
            return null;
        }
    }

    private static boolean var20(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean var5(Object object) {
        return object == null;
    }

    private static String var31(String var32, String var33) {
        var32 = new String(Base64.getDecoder().decode(var32.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var34 = new StringBuilder();
        char[] var35 = var33.toCharArray();
        int var36 = var2[1];
        char[] var37 = var32.toCharArray();
        int var38 = var37.length;
        int var39 = var2[1];
        while (H.var13(var39, var38)) {
            char var40 = var37[var39];
            var34.append((char)(var40 ^ var35[var36 % var35.length]));
            0;
            ++var36;
            ++var39;
            0;
            if (1 <= 2) continue;
            return null;
        }
        return String.valueOf(var34);
    }

    private static boolean var17(int n2) {
        return n2 == 0;
    }

    @Subscribe
    public void a(ProjectileSpawned projectileSpawned) {
        aD = var2[0];
    }

    private boolean Q() {
        NPC var41;
        Item var42;
        H var43;
        if (H.var8(this.aG)) {
            if (H.var17(Dialog.isOpen() ? 1 : 0)) {
                NPC nPC2 = NPCs.getNearest(nPC -> nPC.getName().toLowerCase().contains(var1[var2[34]]));
                if (H.var10(nPC2)) {
                    nPC2.interact(var1[var2[17]]);
                    return var2[0];
                }
                Movement.walkTo((int)var2[18], (int)var2[19]);
                0;
                return var2[0];
            }
            if (H.var8(Dialog.canContinue() ? 1 : 0)) {
                Dialog.continueSpace();
                return var2[0];
            }
            if (H.var8(Dialog.isViewingOptions() ? 1 : 0)) {
                if (H.var8(Dialog.getOptions().stream().anyMatch(widget -> widget.getText().contains(var1[var2[33]])) ? 1 : 0)) {
                    var43.aG = var2[1];
                    return var2[0];
                }
                String[] stringArray = new String[var2[3]];
                stringArray[H.var2[1]] = var1[var2[20]];
                stringArray[H.var2[0]] = var1[var2[21]];
                Dialog.chooseOption((String[])stringArray);
                0;
            }
            return var2[0];
        }
        if (H.var17(Movement.isStaminaBoosted() ? 1 : 0) && H.var8(var43.aF.useStaminaPotion() ? 1 : 0)) {
            var42 = Inventory.getFirst(item -> item.getName().startsWith(var1[var2[32]]));
            if (H.var10(var42)) {
                var42.interact(var1[var2[22]]);
                return var2[0];
            }
            if (H.var8(Bank.isOpen() ? 1 : 0)) {
                Bank.withdraw(item -> item.getName().startsWith(var1[var2[31]]), (int)var2[0], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                return var2[0];
            }
            int[] nArray = new int[var2[0]];
            nArray[H.var2[1]] = var2[23];
            var41 = NPCs.getNearest((int[])nArray);
            if (H.var10(var41)) {
                var41.interact(var1[var2[24]]);
                return var2[0];
            }
        }
        if (H.var3(Players.getLocal().getWorldLocation().getY(), var2[12]) && H.var8(Dialog.canContinue() ? 1 : 0)) {
            var43.aG = var2[0];
            return var2[0];
        }
        var42 = Static.getClient().getItemContainer(InventoryID.EQUIPMENT);
        if (H.var10(var42) && H.var8(Stream.of(var42.getItems()).anyMatch(item -> {
            int n2;
            if (H.var10(item) && H.var12(item.getId(), var2[11])) {
                n2 = var2[0];
                0;
                if (-1 == 2) {
                    return ((0x39 ^ 0x70 ^ (0x6A ^ 0x37)) & (84 + 37 - 23 + 43 ^ 138 + 83 - 216 + 148 ^ -1)) != 0;
                }
            } else {
                n2 = var2[1];
            }
            return n2 != 0;
        }) ? 1 : 0)) {
            if (H.var8(Bank.isOpen() ? 1 : 0)) {
                Bank.depositEquipment();
                return var2[0];
            }
            int[] nArray = new int[var2[0]];
            nArray[H.var2[1]] = var2[23];
            var41 = NPCs.getNearest((int[])nArray);
            if (H.var10(var41)) {
                var41.interact(var1[var2[25]]);
                return var2[0];
            }
            return var2[1];
        }
        if (H.var17(Inventory.isEmpty() ? 1 : 0)) {
            if (H.var8(Bank.isOpen() ? 1 : 0)) {
                Bank.depositInventory();
                return var2[0];
            }
            int[] nArray = new int[var2[0]];
            nArray[H.var2[1]] = var2[23];
            var41 = NPCs.getNearest((int[])nArray);
            if (H.var10(var41)) {
                var41.interact(var1[var2[26]]);
                return var2[0];
            }
        }
        if (H.var8(Bank.isOpen() ? 1 : 0)) {
            int[] nArray = new int[var2[0]];
            nArray[H.var2[1]] = var2[27];
            if (H.var24(Bank.getCount((boolean)var2[0], (int[])nArray), var2[5])) {
                var43.aH = var2[0];
                return var2[0];
            }
        }
        String[] stringArray = new String[var2[0]];
        stringArray[H.var2[1]] = var1[var2[28]];
        TileObjects.getNearest((String[])stringArray).interact(var1[var2[29]]);
        return var2[0];
    }

    @Inject
    public RoguesDenTask(SquireThievingConfig squireThievingConfig) {
        this.aG = var2[0];
        this.aH = var2[1];
        this.aF = squireThievingConfig;
    }

    private static void var15() {
        var1 = new String[var2[102]];
        H.var1[H.var2[1]] = "Take";
        H.var1[H.var2[0]] = "Door";
        H.var1[H.var2[3]] = "Open";
        H.var1[H.var2[6]] = "Select";
        H.var1[H.var2[7]] = "Flash powder";
        H.var1[H.var2[5]] = "Take";
        H.var1[H.var2[8]] = "Flash powder";
        H.var1[H.var2[17]] = "Talk-to";
        H.var1[H.var2[20]] = "Yes actually, ";
        H.var1[H.var2[21]] = "Ok";
        H.var1[H.var2[22]] = "Drink";
        H.var1[H.var2[24]] = "Bank";
        H.var1[H.var2[25]] = "Bank";
        H.var1[H.var2[26]] = "Bank";
        H.var1[H.var2[28]] = "Doorway";
        H.var1[H.var2[29]] = "Open";
        H.var1[H.var2[30]] = "You start cracking";
        H.var1[H.var2[31]] = "Stamina";
        H.var1[H.var2[32]] = "Stamina";
        H.var1[H.var2[33]] = "maze again";
        H.var1[H.var2[34]] = "brian";
        H.var1[H.var2[35]] = "Rogue Guard";
        H.var1[H.var2[36]] = "Tile";
        H.var1[H.var2[66]] = "Climb";
        H.var1[H.var2[69]] = "Search";
        H.var1[H.var2[89]] = "Search";
        H.var1[H.var2[99]] = "Crack";
    }

    /*
     * WARNING - void declaration
     */
    private static void P() {
        String[] stringArray = new String[var2[0]];
        stringArray[H.var2[1]] = var1[var2[8]];
        Item item = Inventory.getFirst((String[])stringArray);
        if (H.var5(item)) {
            H.O();
            return;
        }
        Player var44 = Players.getLocal();
        if (H.var8(aD)) {
            WorldPoint var45 = new WorldPoint(var2[9], var2[10], var2[0]);
            ScenePoint var46 = ScenePoint.fromWorld((WorldPoint)var45);
            Movement.setDestination((int)var46.getX(), (int)var46.getY());
            return;
        }
        NPC var45 = NPCs.getNearest(nPC -> {
            int n2;
            String[] stringArray = new String[var2[0]];
            stringArray[H.var2[1]] = var1[var2[35]];
            if (H.var8(Predicates.names((String[])stringArray).test(nPC) ? 1 : 0) && H.var8(aC.contains(nPC.getWorldLocation()) ? 1 : 0)) {
                n2 = var2[0];
                0;
                if (((0x54 ^ 0x5A) & ~(0x2F ^ 0x21)) != 0) {
                    return ((0x32 ^ 0x34) & ~(0x7A ^ 0x7C)) != 0;
                }
            } else {
                n2 = var2[1];
            }
            return n2 != 0;
        });
        if (H.var3(Players.getLocal().getAnimation(), var2[11]) && H.var17(var44.isMoving() ? 1 : 0) && H.var3(var45.getGraphic(), var2[11])) {
            void var47;
            var47.useOn((Actor)var45);
        }
    }

        catch (Exception var53) {
            var53.printStackTrace();
            return null;
        }
    }

    private static boolean var8(int n2) {
        return n2 != 0;
    }
}

