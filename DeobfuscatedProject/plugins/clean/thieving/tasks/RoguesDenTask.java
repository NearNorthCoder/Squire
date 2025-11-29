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
        void var1;
        if (H.lIllIIIlllIlIlI(chatMessage.getType(), ChatMessageType.GAMEMESSAGE) && H.lIllIIIlllIlIlI(chatMessage.getType(), ChatMessageType.SPAM)) {
            return;
        }
        String var2 = var1.getMessage();
        if (H.lIllIIIlllIIlll(var2.contains(lIIllIllIllll[lIIllIlllIlIl[30]]) ? 1 : 0)) {
            var3.aI = lIIllIlllIlIl[0];
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

            if ((0x75 ^ 0x11 ^ (0xC6 ^ 0xA6)) < 0) {
                return;
            }
        } else {
            void var4;
            var4.interact(lIIllIllIllll[lIIllIlllIlIl[6]]);
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

    public boolean run() {
        H var5;
        if (!H.lIllIIIlllIlIIl(this.aH ? 1 : 0) || H.lIllIIIlllIlIlI((Object)this.aF.method(), (Object)b.ROGUES_DEN)) {
            return lIIllIlllIlIl[1];
        }
        Player var6 = Players.getLocal();
        WorldPoint var7 = var6.getWorldLocation();
        if (H.lIllIIIlllIlIll(var7.getY(), lIIllIlllIlIl[12])) {
            aD = lIIllIlllIlIl[1];
            var5.aI = lIIllIlllIlIl[1];
            return var5.Q();
        }
        RectangularArea var8 = new RectangularArea(lIIllIlllIlIl[13], lIIllIlllIlIl[14], lIIllIlllIlIl[15], lIIllIlllIlIl[16], lIIllIlllIlIl[0]);
        if (H.lIllIIIlllIllII(var6.getAnimation(), lIIllIlllIlIl[11]) && H.lIllIIIlllIlIIl(var8.contains(var7) ? 1 : 0)) {
            return lIIllIlllIlIl[0];
        }
        if (H.lIllIIIlllIIlll(var5.aI ? 1 : 0)) {
            return lIIllIlllIlIl[0];
        }
        Iterator<g> var9 = aE.iterator();
        while (H.lIllIIIlllIIlll(var9.hasNext() ? 1 : 0)) {
            g var10 = var9.next();
            if (H.lIllIIIlllIIlll(var10.c(var7) ? 1 : 0)) {
                var10.y();
                return lIIllIlllIlIl[0];
            }

            if ((0x8B ^ 0xA8 ^ (0x9E ^ 0xB9)) > 0) continue;
            return ((35 + 22 - -16 + 62 ^ 95 + 90 - 151 + 106) & (0x1C ^ 0x20 ^ (0x28 ^ 0x1F) ^ -1)) != 0;
        }
        return lIIllIlllIlIl[1];
    }

    private static boolean lIllIIIlllIllIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIllIIIlllIlIll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIllIIIlllIIlIl(Object object) {
        return object == null;
    }

        return String.valueOf(var11);
    }

    private static boolean lIllIIIlllIlIIl(int n2) {
        return n2 == 0;
    }

    @Subscribe
    public void a(ProjectileSpawned projectileSpawned) {
        aD = lIIllIlllIlIl[0];
    }

    private boolean Q() {
        NPC var12;
        Item var13;
        H var14;
        if (H.lIllIIIlllIIlll(this.aG ? 1 : 0)) {
            if (H.lIllIIIlllIlIIl(Dialog.isOpen() ? 1 : 0)) {
                NPC nPC2 = NPCs.getNearest(nPC -> nPC.getName().toLowerCase().contains(lIIllIllIllll[lIIllIlllIlIl[34]]));
                if (H.lIllIIIlllIIllI(nPC2)) {
                    nPC2.interact(lIIllIllIllll[lIIllIlllIlIl[17]]);
                    return lIIllIlllIlIl[0];
                }
                Movement.walkTo((int)lIIllIlllIlIl[18], (int)lIIllIlllIlIl[19]);

                return lIIllIlllIlIl[0];
            }
            if (H.lIllIIIlllIIlll(Dialog.canContinue() ? 1 : 0)) {
                Dialog.continueSpace();
                return lIIllIlllIlIl[0];
            }
            if (H.lIllIIIlllIIlll(Dialog.isViewingOptions() ? 1 : 0)) {
                if (H.lIllIIIlllIIlll(Dialog.getOptions().stream().anyMatch(widget -> widget.getText().contains(lIIllIllIllll[lIIllIlllIlIl[33]])) ? 1 : 0)) {
                    var14.aG = lIIllIlllIlIl[1];
                    return lIIllIlllIlIl[0];
                }
                String[] stringArray = new String[lIIllIlllIlIl[3]];
                stringArray[H.lIIllIlllIlIl[1]] = lIIllIllIllll[lIIllIlllIlIl[20]];
                stringArray[H.lIIllIlllIlIl[0]] = lIIllIllIllll[lIIllIlllIlIl[21]];
                Dialog.chooseOption((String[])stringArray);

            }
            return lIIllIlllIlIl[0];
        }
        if (H.lIllIIIlllIlIIl(Movement.isStaminaBoosted() ? 1 : 0) && H.lIllIIIlllIIlll(var14.aF.useStaminaPotion() ? 1 : 0)) {
            var13 = Inventory.getFirst(item -> item.getName().startsWith(lIIllIllIllll[lIIllIlllIlIl[32]]));
            if (H.lIllIIIlllIIllI(var13)) {
                var13.interact(lIIllIllIllll[lIIllIlllIlIl[22]]);
                return lIIllIlllIlIl[0];
            }
            if (H.lIllIIIlllIIlll(Bank.isOpen() ? 1 : 0)) {
                Bank.withdraw(item -> item.getName().startsWith(lIIllIllIllll[lIIllIlllIlIl[31]]), (int)lIIllIlllIlIl[0], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                return lIIllIlllIlIl[0];
            }
            int[] nArray = new int[lIIllIlllIlIl[0]];
            nArray[H.lIIllIlllIlIl[1]] = lIIllIlllIlIl[23];
            var12 = NPCs.getNearest((int[])nArray);
            if (H.lIllIIIlllIIllI(var12)) {
                var12.interact(lIIllIllIllll[lIIllIlllIlIl[24]]);
                return lIIllIlllIlIl[0];
            }
        }
        if (H.lIllIIIlllIlIII(Players.getLocal().getWorldLocation().getY(), lIIllIlllIlIl[12]) && H.lIllIIIlllIIlll(Dialog.canContinue() ? 1 : 0)) {
            var14.aG = lIIllIlllIlIl[0];
            return lIIllIlllIlIl[0];
        }
        var13 = Static.getClient().getItemContainer(InventoryID.EQUIPMENT);
        if (H.lIllIIIlllIIllI(var13) && H.lIllIIIlllIIlll(Stream.of(var13.getItems()).anyMatch(item -> {
            int n2;
            if (H.lIllIIIlllIIllI(item) && H.lIllIIIlllIllII(item.getId(), lIIllIlllIlIl[11])) {
                n2 = lIIllIlllIlIl[0];

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
            var12 = NPCs.getNearest((int[])nArray);
            if (H.lIllIIIlllIIllI(var12)) {
                var12.interact(lIIllIllIllll[lIIllIlllIlIl[25]]);
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
            var12 = NPCs.getNearest((int[])nArray);
            if (H.lIllIIIlllIIllI(var12)) {
                var12.interact(lIIllIllIllll[lIIllIlllIlIl[26]]);
                return lIIllIlllIlIl[0];
            }
        }
        if (H.lIllIIIlllIIlll(Bank.isOpen() ? 1 : 0)) {
            int[] nArray = new int[lIIllIlllIlIl[0]];
            nArray[H.lIIllIlllIlIl[1]] = lIIllIlllIlIl[27];
            if (H.lIllIIIlllIllIl(Bank.getCount((boolean)lIIllIlllIlIl[0], (int[])nArray), lIIllIlllIlIl[5])) {
                var14.aH = lIIllIlllIlIl[0];
                return lIIllIlllIlIl[0];
            }
        }
        String[] stringArray = new String[lIIllIlllIlIl[0]];
        stringArray[H.lIIllIlllIlIl[1]] = lIIllIllIllll[lIIllIlllIlIl[28]];
        TileObjects.getNearest((String[])stringArray).interact(lIIllIllIllll[lIIllIlllIlIl[29]]);
        return lIIllIlllIlIl[0];
    }

    @Inject
    public RoguesDenTask(SquireThievingConfig squireThievingConfig) {
        this.aG = lIIllIlllIlIl[0];
        this.aH = lIIllIlllIlIl[1];
        this.aF = squireThievingConfig;
    }

    private static void lIllIIIlllIIIll() {
        lIIllIllIllll = new String[lIIllIlllIlIl[102]];
        H.lIIllIllIllll[H.lIIllIlllIlIl[1]] = "Take";
        H.lIIllIllIllll[H.lIIllIlllIlIl[0]] = "Door";
        H.lIIllIllIllll[H.lIIllIlllIlIl[3]] = "Open";
        H.lIIllIllIllll[H.lIIllIlllIlIl[6]] = "Select";
        H.lIIllIllIllll[H.lIIllIlllIlIl[7]] = "Flash powder";
        H.lIIllIllIllll[H.lIIllIlllIlIl[5]] = "Take";
        H.lIIllIllIllll[H.lIIllIlllIlIl[8]] = "Flash powder";
        H.lIIllIllIllll[H.lIIllIlllIlIl[17]] = "Talk-to";
        H.lIIllIllIllll[H.lIIllIlllIlIl[20]] = "Yes actually, ";
        H.lIIllIllIllll[H.lIIllIlllIlIl[21]] = "Ok";
        H.lIIllIllIllll[H.lIIllIlllIlIl[22]] = "Drink";
        H.lIIllIllIllll[H.lIIllIlllIlIl[24]] = "Bank";
        H.lIIllIllIllll[H.lIIllIlllIlIl[25]] = "Bank";
        H.lIIllIllIllll[H.lIIllIlllIlIl[26]] = "Bank";
        H.lIIllIllIllll[H.lIIllIlllIlIl[28]] = "Doorway";
        H.lIIllIllIllll[H.lIIllIlllIlIl[29]] = "Open";
        H.lIIllIllIllll[H.lIIllIlllIlIl[30]] = "You start cracking";
        H.lIIllIllIllll[H.lIIllIlllIlIl[31]] = "Stamina";
        H.lIIllIllIllll[H.lIIllIlllIlIl[32]] = "Stamina";
        H.lIIllIllIllll[H.lIIllIlllIlIl[33]] = "maze again";
        H.lIIllIllIllll[H.lIIllIlllIlIl[34]] = "brian";
        H.lIIllIllIllll[H.lIIllIlllIlIl[35]] = "Rogue Guard";
        H.lIIllIllIllll[H.lIIllIlllIlIl[36]] = "Tile";
        H.lIIllIllIllll[H.lIIllIlllIlIl[66]] = "Climb";
        H.lIIllIllIllll[H.lIIllIlllIlIl[69]] = "Search";
        H.lIIllIllIllll[H.lIIllIlllIlIl[89]] = "Search";
        H.lIIllIllIllll[H.lIIllIlllIlIl[99]] = "Crack";
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
        Player var15 = Players.getLocal();
        if (H.lIllIIIlllIIlll(aD ? 1 : 0)) {
            WorldPoint var16 = new WorldPoint(lIIllIlllIlIl[9], lIIllIlllIlIl[10], lIIllIlllIlIl[0]);
            ScenePoint var17 = ScenePoint.fromWorld((WorldPoint)var16);
            Movement.setDestination((int)var17.getX(), (int)var17.getY());
            return;
        }
        NPC var16 = NPCs.getNearest(nPC -> {
            int n2;
            String[] stringArray = new String[lIIllIlllIlIl[0]];
            stringArray[H.lIIllIlllIlIl[1]] = lIIllIllIllll[lIIllIlllIlIl[35]];
            if (H.lIllIIIlllIIlll(Predicates.names((String[])stringArray).test(nPC) ? 1 : 0) && H.lIllIIIlllIIlll(aC.contains(nPC.getWorldLocation()) ? 1 : 0)) {
                n2 = lIIllIlllIlIl[0];

                if (((0x54 ^ 0x5A) & ~(0x2F ^ 0x21)) != 0) {
                    return false;
                }
            } else {
                n2 = lIIllIlllIlIl[1];
            }
            return n2 != 0;
        });
        if (H.lIllIIIlllIlIII(Players.getLocal().getAnimation(), lIIllIlllIlIl[11]) && H.lIllIIIlllIlIIl(var15.isMoving() ? 1 : 0) && H.lIllIIIlllIlIII(var16.getGraphic(), lIIllIlllIlIl[11])) {
            void var18;
            var18.useOn((Actor)var16);
        }
    }

    private static boolean lIllIIIlllIIlll(int n2) {
        return n2 != 0;
    }
}

