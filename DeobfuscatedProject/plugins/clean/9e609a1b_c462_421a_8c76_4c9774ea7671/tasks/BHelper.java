/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.GraphicsObjectCreated
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.input.Mouse
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.quests.QuestVarbits
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 *  net.unethicalite.client.Static
 */
package gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks;

import gg.squire.account.AccBuilderRat;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.M;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.PHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.AHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.BHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.DHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.EHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.GHelper;
import java.awt.Point;
import java.lang.invoke.LambdaMetafactory;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GraphicsObjectCreated;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.input.Mouse;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;

public class BHelper
implements M {
    public static  boolean by;
    private static final  WorldPoint gA;
    private static final  WorldPoint gz;

    private static final  WorldPoint gD;
    static  int bY;
    static  WorldArea gI;
    static  int co;
    private static final  WorldPoint gB;
    static  WorldPoint gK;
    static  WorldArea gH;
    private static final  WorldPoint gF;
    private static final  WorldPoint gE;
    static  boolean cp;
    private static final  WorldPoint gy;
    private static final  WorldPoint gG;
    private static final  WorldPoint gC;
    public static  List<d> bA;
    private static final  String[] gx;
    static  WorldArea gJ;

    private static void W() {
        d var1;
        Object var2;
        int[] nArray = new int[lIIlIIIIIIlIl[1]];
        nArray[B.lIIlIIIIIIlIl[0]] = lIIlIIIIIIlIl[7];
        if (B.lIlIIlllIIIlIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new DHelper(lIIlIIIIIIlIl[7], lIIlIIIIIIlIl[1], lIIlIIIIIIlIl[190]);
            bA.add(d2);

        }
        int[] nArray2 = new int[lIIlIIIIIIlIl[1]];
        nArray2[B.lIIlIIIIIIlIl[0]] = lIIlIIIIIIlIl[8];
        if (B.lIlIIlllIIIlIlI(Bank.contains((int[])nArray2) ? 1 : 0)) {
            var2 = new DHelper(lIIlIIIIIIlIl[8], lIIlIIIIIIlIl[1], lIIlIIIIIIlIl[191]);
            bA.add((DHelper) ar2);

        }
        int[] nArray3 = new int[lIIlIIIIIIlIl[1]];
        nArray3[B.lIIlIIIIIIlIl[0]] = lIIlIIIIIIlIl[9];
        if (B.lIlIIlllIIIlIlI(Bank.contains((int[])nArray3) ? 1 : 0)) {
            var2 = new DHelper(lIIlIIIIIIlIl[9], lIIlIIIIIIlIl[1], lIIlIIIIIIlIl[190]);
            bA.add((DHelper) ar2);

        }
        int[] nArray4 = new int[lIIlIIIIIIlIl[1]];
        nArray4[B.lIIlIIIIIIlIl[0]] = lIIlIIIIIIlIl[12];
        if (B.lIlIIlllIIIlIlI(Bank.contains((int[])nArray4) ? 1 : 0)) {
            var2 = new DHelper(lIIlIIIIIIlIl[12], lIIlIIIIIIlIl[1], lIIlIIIIIIlIl[192]);
            bA.add((DHelper) ar2);

        }
        int[] nArray5 = new int[lIIlIIIIIIlIl[1]];
        nArray5[B.lIIlIIIIIIlIl[0]] = lIIlIIIIIIlIl[10];
        if (B.lIlIIlllIIIlIlI(Bank.contains((int[])nArray5) ? 1 : 0)) {
            var2 = new DHelper(lIIlIIIIIIlIl[10], lIIlIIIIIIlIl[2], lIIlIIIIIIlIl[193]);
            bA.add((DHelper) ar2);

        }
        if (B.lIlIIlllIIIlIlI(Bank.contains((Predicate)(var2 = item -> item.getName().toLowerCase().contains(lIIIllllllIII[lIIlIIIIIIlIl[199]]))) ? 1 : 0)) {
            var1 = new DHelper(lIIlIIIIIIlIl[194], lIIlIIIIIIlIl[11], lIIlIIIIIIlIl[195]);
            bA.add(var1);

        }
        int[] nArray6 = new int[lIIlIIIIIIlIl[1]];
        nArray6[B.lIIlIIIIIIlIl[0]] = lIIlIIIIIIlIl[196];
        if (B.lIlIIlllIIIlIlI(Bank.contains((int[])nArray6) ? 1 : 0)) {
            var1 = new DHelper(lIIlIIIIIIlIl[196], lIIlIIIIIIlIl[49], lIIlIIIIIIlIl[193]);
            bA.add(var1);

        }
    }

    private static boolean lIlIIlllIIIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIIlllIIIllII(int n2) {
        return n2 > 0;
    }

    @Override
    public boolean X() {
        return lIIlIIIIIIlIl[0];
    }

    private static void lIlIIlllIIIIllI() {
        lIIIllllllIII = new String[lIIlIIIIIIlIl[218]];
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[0]] = "Buying items";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[1]] = "Finished buying items, switching back to quest";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[3]] = "Nav to bank";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[4]] = "Handling banking";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[6]] = "We are missing quest supplies, switching to BUYING";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[11]] = "Nav to start";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[13]] = "Chatting";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[14]] = "Abigale";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[18]] = "Nav to boat";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[21]] = "Boarding boat";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[2]] = "Board";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[22]] = "Nav to bucket";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[23]] = "Handle chat";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[27]] = "Nav to next spot";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[29]] = "Handling bucket";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[24]] = "A barrel of rainwater";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[31]] = "A barrel of rainwater";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[32]] = "Search";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[35]] = "Barrel";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[36]] = "Search";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[28]] = "Nav to door";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[37]] = "Large door";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[38]] = "Entering manor";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[39]] = "Open";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[40]] = "Nav to door";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[33]] = "Open";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[43]] = "Nav to note";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[45]] = "Taking note";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[47]] = "Take";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[48]] = "Reading note";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[19]] = "Read";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[55]] = "Door";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[56]] = "Nav to painting";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[57]] = "Open";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[58]] = "Open";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[42]] = "Search";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[59]] = "Searching painting";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[60]] = "Search";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[61]] = "Search";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[62]] = "Knife";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[49]] = "Search";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[64]] = "Searching painting";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[65]] = "Search";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[66]] = "Search";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[67]] = "Knife";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[63]] = "Opening door";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[70]] = "Open";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[72]] = "Unlit candle";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[73]] = "Lighting candle";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[75]] = "Barrel";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[71]] = "Lighting barrel";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[77]] = "Opening door";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[78]] = "Open";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[81]] = "Opening door";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[82]] = "Open";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[74]] = "Damaged wall";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[84]] = "Climbing wall";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[85]] = "Climb";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[87]] = "Observing";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[88]] = "Observe";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[76]] = "Taking n reading note";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[90]] = "Read";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[92]] = "Take";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[96]] = "Piano";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[97]] = "Piano";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[79]] = "Play";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[99]] = "Take key";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[101]] = "Search";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[102]] = "Search";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[104]] = "Take key";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[17]] = "Search";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[105]] = "Search";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[107]] = "Damaged wall";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[108]] = "Climbing wall";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[109]] = "Climb";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[93]] = "Opening door";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[110]] = "Open";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[112]] = "Opening door";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[113]] = "Open";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[115]] = "Nav to door";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[103]] = "Opening door";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[117]] = "Open";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[119]] = "Take n Read note";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[121]] = "Read";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[123]] = "Take";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[114]] = "Opening door";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[125]] = "Open";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[126]] = "Opening door";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[127]] = "Open";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[132]] = "Door";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[118]] = "Open";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[133]] = "Open";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[134]] = "Door";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[135]] = "Open";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[136]] = "Open";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[124]] = "Fireplace";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[137]] = "Search";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[138]] = "Knife fireplace";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[139]] = "Fireplace";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[142]] = "Handle jewel menu";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[140]] = "Fireplace";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[144]] = "Search";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[145]] = "Searching";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[146]] = "Search";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[147]] = "Search";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[148]] = "Fireplace";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[150]] = "Fireplace";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[151]] = "Search";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[152]] = "Searching";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[153]] = "Search";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[156]] = "Nav to spot";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[157]] = "Door";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[158]] = "Open";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[159]] = "Mirror";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[160]] = "Set tile";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[161]] = "Mirror";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[162]] = "Push";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[163]] = "Push";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[164]] = "Push";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[165]] = "Push";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[166]] = "Push";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[167]] = "Push";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[168]] = "Push";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[169]] = "Push";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[170]] = "Push";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[171]] = "Push";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[172]] = "Handle chat";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[173]] = "Killing abigale";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[174]] = "Killer's knife";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[175]] = "Killer's knife";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[176]] = "Take";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[177]] = "Killer's knife";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[178]] = "Killer's knife";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[179]] = "Wield";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[180]] = "Killer's knife";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[181]] = "Abigale";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[182]] = "Fight";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[183]] = "Exiting room";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[184]] = "Door";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[185]] = "Open";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[186]] = "Exiting to person";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[189]] = "Mandy";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[197]] = "Misthalin Mystery quest";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[199]] = "ring of wealth (";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[200]] = "I wanted to use your anvils.";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[201]] = "Yes, I will get you the materials.";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[202]] = "Certainly, I'll be right back!";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[203]] = "Yes.";
        B.lIIIllllllIII[B.lIIlIIIIIIlIl[204]] = "Count Draynor";
    }

    @Subscribe
    public void a(GraphicsObjectCreated graphicsObjectCreated) {
        if (B.lIlIIlllIIIllll(graphicsObjectCreated.getGraphicsObject().getId(), lIIlIIIIIIlIl[198])) {
            System.out.println("Found one " + String.valueOf(graphicsObjectCreated.getGraphicsObject().getLocation()));
        }
    }

    @Override
    public int Y() {
        try {
            B.ce();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if (3 < ((0x2F ^ 0x6D ^ (0x4C ^ 0x30)) & ((0xD ^ 0x21) & ~(0x94 ^ 0xB8) ^ (0x65 ^ 0x5B) ^ -1))) {
            return (0x2B ^ 0x79 ^ (0xBB ^ 0xB2)) & (0x23 ^ 0x19 ^ (0x19 ^ 0x78) ^ -1);
        }
        return lIIlIIIIIIlIl[140];
    }

    private static boolean lIlIIlllIIIllll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIIlllIIlIIlI(int n2, int n3) {
        return n2 != n3;
    }

    @Override
    public boolean aa() {
        boolean bl;
        if (B.lIlIIlllIIlIIIl(Vars.getBit((int)QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), lIIlIIIIIIlIl[181])) {
            bl = lIIlIIIIIIlIl[1];

            if (-1 == 1) {
                return ((2 ^ (0xD9 ^ 0x91)) & (81 + 217 - 189 + 142 ^ 150 + 137 - 256 + 146 ^ -1)) != 0;
            }
        } else {
            bl = lIIlIIIIIIlIl[0];
        }
        return bl;
    }

    private static boolean lIlIIlllIIlIIIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIIlllIIIlIll(Object object) {
        return object != null;
    }

    private static boolean lIlIIlllIIlIIII(Object object) {
        return object == null;
    }

    static {
        B.lIlIIlllIIIIlll();
        B.lIlIIlllIIIIllI();
        String[] stringArray = new String[lIIlIIIIIIlIl[11]];
        stringArray[B.lIIlIIIIIIlIl[0]] = lIIIllllllIII[lIIlIIIIIIlIl[200]];
        stringArray[B.lIIlIIIIIIlIl[1]] = lIIIllllllIII[lIIlIIIIIIlIl[201]];
        stringArray[B.lIIlIIIIIIlIl[3]] = lIIIllllllIII[lIIlIIIIIIlIl[202]];
        stringArray[B.lIIlIIIIIIlIl[4]] = lIIIllllllIII[lIIlIIIIIIlIl[203]];
        stringArray[B.lIIlIIIIIIlIl[6]] = lIIIllllllIII[lIIlIIIIIIlIl[204]];
        gx = stringArray;
        gy = new WorldPoint(lIIlIIIIIIlIl[205], lIIlIIIIIIlIl[206], lIIlIIIIIIlIl[0]);
        gz = new WorldPoint(lIIlIIIIIIlIl[205], lIIlIIIIIIlIl[206], lIIlIIIIIIlIl[0]);
        gA = new WorldPoint(lIIlIIIIIIlIl[207], lIIlIIIIIIlIl[208], lIIlIIIIIIlIl[0]);
        gB = new WorldPoint(lIIlIIIIIIlIl[187], lIIlIIIIIIlIl[209], lIIlIIIIIIlIl[0]);
        gC = new WorldPoint(lIIlIIIIIIlIl[210], lIIlIIIIIIlIl[211], lIIlIIIIIIlIl[0]);
        gD = new WorldPoint(lIIlIIIIIIlIl[210], lIIlIIIIIIlIl[211], lIIlIIIIIIlIl[0]);
        gE = new WorldPoint(lIIlIIIIIIlIl[51], lIIlIIIIIIlIl[52], lIIlIIIIIIlIl[0]);
        gF = new WorldPoint(lIIlIIIIIIlIl[130], lIIlIIIIIIlIl[212], lIIlIIIIIIlIl[0]);
        gG = new WorldPoint(lIIlIIIIIIlIl[213], lIIlIIIIIIlIl[214], lIIlIIIIIIlIl[0]);
        bA = new ArrayList<d>();
        gH = new WorldArea(lIIlIIIIIIlIl[51], lIIlIIIIIIlIl[215], lIIlIIIIIIlIl[31], lIIlIIIIIIlIl[37], lIIlIIIIIIlIl[0]);
        gI = new WorldArea(lIIlIIIIIIlIl[80], lIIlIIIIIIlIl[216], lIIlIIIIIIlIl[18], lIIlIIIIIIlIl[18], lIIlIIIIIIlIl[0]);
        gJ = new WorldArea(lIIlIIIIIIlIl[217], lIIlIIIIIIlIl[216], lIIlIIIIIIlIl[33], lIIlIIIIIIlIl[28], lIIlIIIIIIlIl[0]);
        gK = null;
    }

    private static boolean lIlIIlllIIIlIlI(int n2) {
        return n2 == 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean S() {
        int n2;
        int[] nArray = new int[lIIlIIIIIIlIl[1]];
        nArray[B.lIIlIIIIIIlIl[0]] = lIIlIIIIIIlIl[7];
        if (B.lIlIIlllIIIlIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[lIIlIIIIIIlIl[1]];
            nArray2[B.lIIlIIIIIIlIl[0]] = lIIlIIIIIIlIl[8];
            if (B.lIlIIlllIIIlIII(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                int[] nArray3 = new int[lIIlIIIIIIlIl[1]];
                nArray3[B.lIIlIIIIIIlIl[0]] = lIIlIIIIIIlIl[9];
                if (B.lIlIIlllIIIlIII(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                    n2 = lIIlIIIIIIlIl[1];

                    if (-1 < 1) return n2 != 0;
                    return false;
                }
            }
        }
        n2 = lIIlIIIIIIlIl[0];
        return n2 != 0;
    }

        return String.valueOf(var3);
    }

    private static boolean lIlIIlllIIIllIl(int n2, int n3) {
        return n2 > n3;
    }

    private static  boolean cf() {
        return Bank.isOpen();
    }

    @Override
    public String Z() {
        return lIIIllllllIII[lIIlIIIIIIlIl[197]];
    }

    private static boolean lIlIIlllIIIlllI(int n2, int n3) {
        return n2 <= n3;
    }

    /*
     * Unable to fully structure code
     */
    public static void ce() {
        block180: {
            block181: {
                if (B.lIlIIlllIIIlIII((int)B.by)) {
                    AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[0]];
                    b.a(B.bA);
                    if (B.lIlIIlllIIIlIIl(B.bA.size(), B.lIIlIIIIIIlIl[1])) {
                        System.out.println(B.lIIIllllllIII[B.lIIlIIIIIIlIl[1]]);
                        B.by = B.lIIlIIIIIIlIl[0];
                    }
                }
                if (!B.lIlIIlllIIIlIlI((int)B.by)) break block180;
                if (B.lIlIIlllIIIlIlI((int)B.S()) && B.lIlIIlllIIIlIIl(Vars.getBit((int)QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), B.lIIlIIIIIIlIl[2])) {
                    var4 = BankLocation.getNearest();
                    if (B.lIlIIlllIIIlIll(var4) && B.lIlIIlllIIIlIlI((int)var4.getArea().contains(Players.getLocal().getWorldLocation()))) {
                        AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[3]];
                        Movement.walkTo((BankLocation)var4);

                        Time.sleepTicks((int)B.lIIlIIIIIIlIl[3]);

                    }
                    if (B.lIlIIlllIIIlIll(var4) && B.lIlIIlllIIIlIII((int)var4.getArea().contains(Players.getLocal().getWorldLocation()))) {
                        AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[4]];
                        if (B.lIlIIlllIIIlIlI((int)Bank.isOpen())) {
                            a.a();
                            Time.sleepUntil((BooleanSupplier)(BooleanSupplier)LambdaMetafactory.metafactory(null, null, null, ()Z, cf(), ()Z)(), (int)B.lIIlIIIIIIlIl[5]);

                        }
                        if (B.lIlIIlllIIIlIII((int)Bank.isOpen())) {
                            if (B.lIlIIlllIIIllII(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)B.lIIlIIIIIIlIl[6]);

                            }
                            if (B.lIlIIlllIIIllII(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)B.lIIlIIIIIIlIl[3]);

                            }
                            v0 = new int[B.lIIlIIIIIIlIl[6]];
                            v0[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[7];
                            v0[B.lIIlIIIIIIlIl[1]] = B.lIIlIIIIIIlIl[8];
                            v0[B.lIIlIIIIIIlIl[3]] = B.lIIlIIIIIIlIl[9];
                            v0[B.lIIlIIIIIIlIl[4]] = B.lIIlIIIIIIlIl[10];
                            if (B.lIlIIlllIIIlIlI((int)e.b(v0))) {
                                B.W();
                                System.out.println(B.lIIIllllllIII[B.lIIlIIIIIIlIl[6]]);
                                B.by = B.lIIlIIIIIIlIl[1];
                                return;
                            }
                            v1 = new int[B.lIIlIIIIIIlIl[11]];
                            v1[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[7];
                            v1[B.lIIlIIIIIIlIl[1]] = B.lIIlIIIIIIlIl[8];
                            v1[B.lIIlIIIIIIlIl[3]] = B.lIIlIIIIIIlIl[9];
                            v1[B.lIIlIIIIIIlIl[4]] = B.lIIlIIIIIIlIl[10];
                            v1[B.lIIlIIIIIIlIl[6]] = B.lIIlIIIIIIlIl[12];
                            a.a(v1, B.lIIlIIIIIIlIl[1]);
                        }
                    }
                }
                if (B.lIlIIlllIIIlIII((int)B.S()) && B.lIlIIlllIIIlIIl(Vars.getBit((int)QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), B.lIIlIIIIIIlIl[2])) {
                    if (B.lIlIIlllIIIllIl(Players.getLocal().getWorldLocation().distanceTo(B.gy), B.lIIlIIIIIIlIl[11])) {
                        if (B.lIlIIlllIIIlIIl(B.bY, B.lIIlIIIIIIlIl[1])) {
                            e.w();
                            B.bY += B.lIIlIIIIIIlIl[1];
                        }
                        AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[11]];
                        Movement.walkTo((WorldPoint)B.gy);

                        Time.sleepTicks((int)B.lIIlIIIIIIlIl[1]);

                    }
                    if (B.lIlIIlllIIIlllI(Players.getLocal().getWorldLocation().distanceTo(B.gy), B.lIIlIIIIIIlIl[11])) {
                        AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[13]];
                        g.a(B.lIIIllllllIII[B.lIIlIIIIIIlIl[14]], B.gx);
                    }
                }
                if (B.lIlIIlllIIIllll(Vars.getBit((int)QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), B.lIIlIIIIIIlIl[2])) {
                    if (B.lIlIIlllIIIllIl(Players.getLocal().getWorldLocation().distanceTo(B.gz), B.lIIlIIIIIIlIl[11]) && B.lIlIIlllIIIllIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(B.lIIlIIIIIIlIl[15], B.lIIlIIIIIIlIl[16], B.lIIlIIIIIIlIl[0])), B.lIIlIIIIIIlIl[17])) {
                        AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[18]];
                        Movement.walkTo((WorldPoint)B.gz);

                        Time.sleepTicks((int)B.lIIlIIIIIIlIl[1]);

                    }
                    if (B.lIlIIlllIIIlllI(Players.getLocal().getWorldLocation().distanceTo(B.gz), B.lIIlIIIIIIlIl[11]) && B.lIlIIlllIIIlllI(Players.getLocal().getWorldLocation().distanceTo(B.gy), B.lIIlIIIIIIlIl[19])) {
                        v2 = new int[B.lIIlIIIIIIlIl[1]];
                        v2[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[20];
                        var4 = TileObjects.getNearest((int[])v2);
                        if (B.lIlIIlllIIIlIll(var4)) {
                            AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[21]];
                            var4.interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[2]]);
                            Time.sleepTicks((int)B.lIIlIIIIIIlIl[4]);

                        }
                    }
                    if (B.lIlIIlllIIIlllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(B.lIIlIIIIIIlIl[15], B.lIIlIIIIIIlIl[16], B.lIIlIIIIIIlIl[0])), B.lIIlIIIIIIlIl[17])) {
                        if (B.lIlIIlllIIIllIl(Players.getLocal().getWorldLocation().distanceTo(B.gA), B.lIIlIIIIIIlIl[11])) {
                            AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[22]];
                            Movement.walkTo((WorldPoint)B.gA);

                            Time.sleepTicks((int)B.lIIlIIIIIIlIl[1]);

                        }
                        if (B.lIlIIlllIIIlllI(Players.getLocal().getWorldLocation().distanceTo(B.gA), B.lIIlIIIIIIlIl[11])) {
                            AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[23]];
                            g.a(B.gx);
                        }
                    }
                }
                if (B.lIlIIlllIIIllll(Vars.getBit((int)QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), B.lIIlIIIIIIlIl[24]) && B.lIlIIlllIIIlIlI((int)Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(B.lIIlIIIIIIlIl[25], B.lIIlIIIIIIlIl[26], B.lIIlIIIIIIlIl[0])))) {
                    g.a(B.gx);
                    AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[27]];
                    Movement.walkTo((WorldPoint)new WorldPoint(B.lIIlIIIIIIlIl[25], B.lIIlIIIIIIlIl[26], B.lIIlIIIIIIlIl[0]));

                    Time.sleepTicks((int)B.lIIlIIIIIIlIl[1]);

                }
                if (B.lIlIIlllIIIllll(Vars.getBit((int)QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), B.lIIlIIIIIIlIl[28])) {
                    AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[29]];
                    v3 = new int[B.lIIlIIIIIIlIl[1]];
                    v3[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[7];
                    if (B.lIlIIlllIIIlIII((int)Inventory.contains((int[])v3))) {
                        v4 = new int[B.lIIlIIIIIIlIl[1]];
                        v4[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[7];
                        v5 = new String[B.lIIlIIIIIIlIl[1]];
                        v5[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[24]];
                        Inventory.getFirst((int[])v4).useOn(TileObjects.getNearest((String[])v5));

                        if (-1 >= 2) {
                            return;
                        }
                    } else {
                        v6 = new int[B.lIIlIIIIIIlIl[1]];
                        v6[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[30];
                        if (B.lIlIIlllIIIlIII((int)Inventory.contains((int[])v6))) {
                            v7 = new String[B.lIIlIIIIIIlIl[1]];
                            v7[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[31]];
                            TileObjects.getNearest((String[])v7).interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[32]]);
                        }
                    }
                }
                if (!B.lIlIIlllIIIllll(Vars.getBit((int)QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), B.lIIlIIIIIIlIl[33])) break block181;
                v8 = new int[B.lIIlIIIIIIlIl[1]];
                v8[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[30];
                if (!B.lIlIIlllIIIlIII((int)Inventory.contains((int[])v8))) ** GOTO lbl-1000
                v9 = new int[B.lIIlIIIIIIlIl[1]];
                v9[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[34];
                if (B.lIlIIlllIIIlIlI((int)Inventory.contains((int[])v9))) {
                    v10 = new String[B.lIIlIIIIIIlIl[1]];
                    v10[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[35]];
                    TileObjects.getNearest((String[])v10).interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[36]]);

                    if (((136 ^ 134) & ~(58 ^ 52)) != 0) {
                        return;
                    }
                } else lbl-1000:
                // 2 sources

                {
                    v11 = new int[B.lIIlIIIIIIlIl[1]];
                    v11[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[34];
                    if (B.lIlIIlllIIIlIII((int)Inventory.contains((int[])v11))) {
                        if (B.lIlIIlllIIIllIl(Players.getLocal().getWorldLocation().distanceTo(B.gB), B.lIIlIIIIIIlIl[6])) {
                            AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[28]];
                            Movement.walkTo((WorldPoint)B.gB);

                            Time.sleepTicks((int)B.lIIlIIIIIIlIl[1]);

                        }
                        if (B.lIlIIlllIIIlllI(Players.getLocal().getWorldLocation().distanceTo(B.gB), B.lIIlIIIIIIlIl[6])) {
                            v12 = new String[B.lIIlIIIIIIlIl[1]];
                            v12[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[37]];
                            var4 = TileObjects.getNearest((String[])v12);
                            if (B.lIlIIlllIIIlIll(var4)) {
                                AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[38]];
                                var4.interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[39]]);
                                Time.sleepTicks((int)B.lIIlIIIIIIlIl[3]);

                            }
                        }
                    }
                }
            }
            if (B.lIlIIlllIIIllll(Vars.getBit((int)QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), B.lIIlIIIIIIlIl[19])) {
                g.a(B.gx);
                if (B.lIlIIlllIIIllIl(Players.getLocal().getWorldLocation().distanceTo(B.gC), B.lIIlIIIIIIlIl[4])) {
                    AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[40]];
                    Movement.walkTo((WorldPoint)B.gC);

                    Time.sleepTicks((int)B.lIIlIIIIIIlIl[1]);

                }
                if (B.lIlIIlllIIIlllI(Players.getLocal().getWorldLocation().distanceTo(B.gC), B.lIIlIIIIIIlIl[4])) {
                    v13 = new int[B.lIIlIIIIIIlIl[1]];
                    v13[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[41];
                    var4 = TileObjects.getNearest((int[])v13);
                    if (B.lIlIIlllIIIlIll(var4)) {
                        var4.interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[33]]);
                        Time.sleepTicks((int)B.lIIlIIIIIIlIl[3]);

                    }
                }
            }
            if (B.lIlIIlllIIIllll(Vars.getBit((int)QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), B.lIIlIIIIIIlIl[42])) {
                B.co = B.lIIlIIIIIIlIl[0];
                g.a(B.gx);
                if (B.lIlIIlllIIIllIl(Players.getLocal().getWorldLocation().distanceTo(B.gD), B.lIIlIIIIIIlIl[4])) {
                    AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[43]];
                    Movement.walkTo((WorldPoint)B.gD);

                    Time.sleepTicks((int)B.lIIlIIIIIIlIl[3]);

                }
                if (B.lIlIIlllIIIlllI(Players.getLocal().getWorldLocation().distanceTo(B.gD), B.lIIlIIIIIIlIl[4])) {
                    v14 = new int[B.lIIlIIIIIIlIl[1]];
                    v14[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[44];
                    if (B.lIlIIlllIIIlIlI((int)Inventory.contains((int[])v14))) {
                        AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[45]];
                        v15 = new int[B.lIIlIIIIIIlIl[1]];
                        v15[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[46];
                        var4 = TileObjects.getNearest((int[])v15);
                        if (B.lIlIIlllIIIlIll(var4)) {
                            var4.interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[47]]);
                            Time.sleepTicks((int)B.lIIlIIIIIIlIl[1]);

                        }
                    }
                    v16 = new int[B.lIIlIIIIIIlIl[1]];
                    v16[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[44];
                    if (B.lIlIIlllIIIlIII((int)Inventory.contains((int[])v16))) {
                        AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[48]];
                        v17 = new int[B.lIIlIIIIIIlIl[1]];
                        v17[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[44];
                        Inventory.getFirst((int[])v17).interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[19]]);
                    }
                }
            }
            if (B.lIlIIlllIIIllll(Vars.getBit((int)QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), B.lIIlIIIIIIlIl[49])) {
                v18 = new int[B.lIIlIIIIIIlIl[1]];
                v18[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[50];
                var4 = TileObjects.getNearest((int[])v18);
                var5 = new WorldPoint(B.lIIlIIIIIIlIl[51], B.lIIlIIIIIIlIl[52], B.lIIlIIIIIIlIl[0]);
                if (B.lIlIIlllIIIlIlI((int)Players.getLocal().getWorldLocation().equals((Object)var5))) {
                    v19 = new String[B.lIIlIIIIIIlIl[1]];
                    v19[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[55]];
                    var6 = TileObjects.getAt((WorldPoint)new WorldPoint(B.lIIlIIIIIIlIl[53], B.lIIlIIIIIIlIl[54], B.lIIlIIIIIIlIl[0]), (String[])v19);
                    AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[56]];
                    if (B.lIlIIlllIIIlIlI((int)var6.isEmpty())) {
                        v20 = new String[B.lIIlIIIIIIlIl[1]];
                        v20[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[57]];
                        if (B.lIlIIlllIIIlIII((int)((TileObject)var6.get(B.lIIlIIIIIIlIl[0])).hasAction(v20))) {
                            ((TileObject)var6.get(B.lIIlIIIIIIlIl[0])).interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[58]]);
                            Time.sleepTicks((int)B.lIIlIIIIIIlIl[14]);

                        }
                    }
                    v21 = new String[B.lIIlIIIIIIlIl[1]];
                    v21[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[42]];
                    if (B.lIlIIlllIIIlIII((int)var4.hasAction(v21))) {
                        AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[59]];
                        var4.interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[60]]);
                    }
                    v22 = new String[B.lIIlIIIIIIlIl[1]];
                    v22[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[61]];
                    if (B.lIlIIlllIIIlIlI((int)var4.hasAction(v22))) {
                        v23 = new String[B.lIIlIIIIIIlIl[1]];
                        v23[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[62]];
                        v24 = new int[B.lIIlIIIIIIlIl[1]];
                        v24[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[50];
                        Inventory.getFirst((String[])v23).useOn(TileObjects.getNearest((int[])v24));
                    }
                    Time.sleepTicks((int)B.lIIlIIIIIIlIl[1]);

                }
            }
            if (B.lIlIIlllIIIllll(Vars.getBit((int)QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), B.lIIlIIIIIIlIl[63])) {
                v25 = new int[B.lIIlIIIIIIlIl[1]];
                v25[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[50];
                var4 = TileObjects.getNearest((int[])v25);
                v26 = new String[B.lIIlIIIIIIlIl[1]];
                v26[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[49]];
                if (B.lIlIIlllIIIlIII((int)var4.hasAction(v26))) {
                    AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[64]];
                    var4.interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[65]]);
                }
                v27 = new String[B.lIIlIIIIIIlIl[1]];
                v27[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[66]];
                if (B.lIlIIlllIIIlIlI((int)var4.hasAction(v27))) {
                    v28 = new String[B.lIIlIIIIIIlIl[1]];
                    v28[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[67]];
                    v29 = new int[B.lIIlIIIIIIlIl[1]];
                    v29[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[50];
                    Inventory.getFirst((String[])v28).useOn(TileObjects.getNearest((int[])v29));
                }
                v30 = new int[B.lIIlIIIIIIlIl[1]];
                v30[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[68];
                if (B.lIlIIlllIIIlIII((int)Inventory.contains((int[])v30))) {
                    v31 = new int[B.lIIlIIIIIIlIl[1]];
                    v31[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[69];
                    var5 = TileObjects.getNearest((int[])v31);
                    if (B.lIlIIlllIIIlIll(var5)) {
                        AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[63]];
                        var5.interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[70]]);
                        Time.sleepTicks((int)B.lIIlIIIIIIlIl[3]);

                    }
                }
            }
            if (B.lIlIIlllIIIllll(Vars.getBit((int)QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), B.lIIlIIIIIIlIl[71])) {
                v32 = new String[B.lIIlIIIIIIlIl[1]];
                v32[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[72]];
                var4 = TileObjects.getNearest((String[])v32);
                if (B.lIlIIlllIIIlIll(var4)) {
                    AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[73]];
                    v33 = new int[B.lIIlIIIIIIlIl[1]];
                    v33[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[9];
                    Inventory.getFirst((int[])v33).useOn((TileObject)var4);
                }
            }
            if (B.lIlIIlllIIIllll(Vars.getBit((int)QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), B.lIIlIIIIIIlIl[74])) {
                v34 = new String[B.lIIlIIIIIIlIl[1]];
                v34[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[75]];
                var4 = TileObjects.getNearest((String[])v34);
                if (B.lIlIIlllIIIlIll(var4)) {
                    AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[71]];
                    v35 = new int[B.lIIlIIIIIIlIl[1]];
                    v35[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[9];
                    Inventory.getFirst((int[])v35).useOn((TileObject)var4);
                }
            }
            if (B.lIlIIlllIIIllll(Vars.getBit((int)QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), B.lIIlIIIIIIlIl[76])) {
                v36 = new int[B.lIIlIIIIIIlIl[1]];
                v36[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[69];
                var4 = TileObjects.getNearest((int[])v36);
                if (B.lIlIIlllIIIlIll(var4)) {
                    AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[77]];
                    var4.interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[78]]);
                    Time.sleepTicks((int)B.lIIlIIIIIIlIl[3]);

                }
            }
            if (B.lIlIIlllIIIllll(Vars.getBit((int)QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), B.lIIlIIIIIIlIl[79])) {
                v37 = new int[B.lIIlIIIIIIlIl[1]];
                v37[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[69];
                var4 = TileObjects.getNearest((int[])v37);
                if (B.lIlIIlllIIIlIll(var4) && B.lIlIIlllIIIlIII((int)Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(B.lIIlIIIIIIlIl[80], B.lIIlIIIIIIlIl[26], B.lIIlIIIIIIlIl[0])))) {
                    AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[81]];
                    var4.interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[82]]);
                    Time.sleepTicks((int)B.lIIlIIIIIIlIl[14]);

                }
                v38 = new String[B.lIIlIIIIIIlIl[1]];
                v38[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[74]];
                var5 = TileObjects.getNearest((String[])v38);
                if (B.lIlIIlllIIIlIll(var5) && B.lIlIIlllIIIlllI(Players.getLocal().getWorldLocation().getX(), B.lIIlIIIIIIlIl[83])) {
                    if (B.lIlIIlllIIIlIlI((int)Reachable.isInteractable((Locatable)var5))) {
                        Movement.walkTo((Locatable)var5);

                        Time.sleepTicks((int)B.lIIlIIIIIIlIl[1]);

                    }
                    AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[84]];
                    var5.interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[85]]);
                    Time.sleepTicks((int)B.lIIlIIIIIIlIl[14]);

                }
                v39 = new int[B.lIIlIIIIIIlIl[1]];
                v39[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[86];
                var6 = TileObjects.getNearest((int[])v39);
                if (B.lIlIIlllIIIlIll(var6) && B.lIlIIlllIIIlIlI((int)B.gH.contains(Players.getLocal().getWorldLocation())) && B.lIlIIlllIIIlIlI((int)Dialog.isOpen())) {
                    AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[87]];
                    var6.interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[88]]);
                    Time.sleepTicks((int)B.lIIlIIIIIIlIl[13]);

                }
                g.a(B.gx);
            }
            if (B.lIlIIlllIIIllll(Vars.getBit((int)QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), B.lIIlIIIIIIlIl[17])) {
                g.a(B.gx);
                AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[76]];
                v40 = new int[B.lIIlIIIIIIlIl[1]];
                v40[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[89];
                if (B.lIlIIlllIIIlIII((int)Inventory.contains((int[])v40))) {
                    v41 = new int[B.lIIlIIIIIIlIl[1]];
                    v41[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[89];
                    Inventory.getFirst((int[])v41).interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[90]]);
                }
                v42 = new int[B.lIIlIIIIIIlIl[1]];
                v42[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[89];
                if (B.lIlIIlllIIIlIlI((int)Inventory.contains((int[])v42))) {
                    v43 = new int[B.lIIlIIIIIIlIl[1]];
                    v43[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[91];
                    TileObjects.getNearest((int[])v43).interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[92]]);
                    Time.sleepTicks((int)B.lIIlIIIIIIlIl[3]);

                }
            }
            if (B.lIlIIlllIIIllll(Vars.getBit((int)QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), B.lIIlIIIIIIlIl[93])) {
                var4 = Vars.getBit((int)B.lIIlIIIIIIlIl[94]);
                var5 = Widgets.get((int)B.lIIlIIIIIIlIl[95], (int)B.lIIlIIIIIIlIl[11]);
                if (B.lIlIIlllIIIlIll(var5)) {
                    AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[96]];
                    if (B.lIlIIlllIIIlIlI(var4)) {
                        Mouse.click((Point)Widgets.get((int)B.lIIlIIIIIIlIl[95], (int)B.lIIlIIIIIIlIl[37]).getClickPoint().getAwtPoint(), (boolean)B.lIIlIIIIIIlIl[1]);
                        Time.sleepTicks((int)B.lIIlIIIIIIlIl[1]);

                        if (-(176 ^ 136 ^ (162 ^ 159)) >= 0) {
                            return;
                        }
                    } else if (B.lIlIIlllIIIllll(var4, B.lIIlIIIIIIlIl[1])) {
                        Mouse.click((Point)Widgets.get((int)B.lIIlIIIIIIlIl[95], (int)B.lIIlIIIIIIlIl[38]).getClickPoint().getAwtPoint(), (boolean)B.lIIlIIIIIIlIl[1]);
                    }
                    if (B.lIlIIlllIIIllll(var4, B.lIIlIIIIIIlIl[3])) {
                        Mouse.click((Point)Widgets.get((int)B.lIIlIIIIIIlIl[95], (int)B.lIIlIIIIIIlIl[33]).getClickPoint().getAwtPoint(), (boolean)B.lIIlIIIIIIlIl[1]);
                    }
                    if (B.lIlIIlllIIIllll(var4, B.lIIlIIIIIIlIl[4])) {
                        Mouse.click((Point)Widgets.get((int)B.lIIlIIIIIIlIl[95], (int)B.lIIlIIIIIIlIl[37]).getClickPoint().getAwtPoint(), (boolean)B.lIIlIIIIIIlIl[1]);
                    }
                }
                if (B.lIlIIlllIIlIIII(var5)) {
                    v44 = new String[B.lIIlIIIIIIlIl[1]];
                    v44[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[97]];
                    TileObjects.getNearest((String[])v44).interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[79]]);
                    Time.sleepTicks((int)B.lIIlIIIIIIlIl[4]);

                }
                v45 = new int[B.lIIlIIIIIIlIl[1]];
                v45[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[98];
                if (B.lIlIIlllIIIlIlI((int)Inventory.contains((int[])v45))) {
                    AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[99]];
                    v46 = new int[B.lIIlIIIIIIlIl[1]];
                    v46[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[100];
                    var6 = TileObjects.getNearest((int[])v46);
                    v47 = new String[B.lIIlIIIIIIlIl[1]];
                    v47[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[101]];
                    if (B.lIlIIlllIIIlIII((int)var6.hasAction(v47))) {
                        var6.interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[102]]);
                        Time.sleepTicks((int)B.lIIlIIIIIIlIl[3]);

                    }
                }
            }
            if (B.lIlIIlllIIIllll(Vars.getBit((int)QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), B.lIIlIIIIIIlIl[103])) {
                v48 = new int[B.lIIlIIIIIIlIl[1]];
                v48[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[98];
                if (B.lIlIIlllIIIlIlI((int)Inventory.contains((int[])v48))) {
                    AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[104]];
                    v49 = new int[B.lIIlIIIIIIlIl[1]];
                    v49[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[100];
                    var4 = TileObjects.getNearest((int[])v49);
                    v50 = new String[B.lIIlIIIIIIlIl[1]];
                    v50[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[17]];
                    if (B.lIlIIlllIIIlIII((int)var4.hasAction(v50))) {
                        var4.interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[105]]);
                        Time.sleepTicks((int)B.lIIlIIIIIIlIl[3]);

                    }
                }
                if (!B.lIlIIlllIIIlIII((int)B.gI.contains(Players.getLocal().getWorldLocation())) || B.lIlIIlllIIlIIIl(Players.getLocal().getWorldLocation().getX(), B.lIIlIIIIIIlIl[106])) {
                    v51 = new String[B.lIIlIIIIIIlIl[1]];
                    v51[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[107]];
                    var4 = TileObjects.getNearest((String[])v51);
                    AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[108]];
                    var4.interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[109]]);
                    Time.sleepTicks((int)B.lIIlIIIIIIlIl[14]);

                }
                if (B.lIlIIlllIIIlllI(Players.getLocal().getWorldLocation().getX(), B.lIIlIIIIIIlIl[83])) {
                    v52 = new int[B.lIIlIIIIIIlIl[1]];
                    v52[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[69];
                    var4 = TileObjects.getNearest((int[])v52);
                    if (B.lIlIIlllIIIlIll(var4)) {
                        AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[93]];
                        var4.interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[110]]);
                        Time.sleepTicks((int)B.lIIlIIIIIIlIl[14]);

                    }
                }
                if (B.lIlIIlllIIIlIII((int)B.gJ.contains(Players.getLocal().getWorldLocation()))) {
                    v53 = new int[B.lIIlIIIIIIlIl[1]];
                    v53[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[111];
                    var4 = TileObjects.getNearest((int[])v53);
                    if (B.lIlIIlllIIIlIll(var4)) {
                        AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[112]];
                        var4.interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[113]]);
                        Time.sleepTicks((int)B.lIIlIIIIIIlIl[18]);

                    }
                }
            }
            if (B.lIlIIlllIIIllll(Vars.getBit((int)QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), B.lIIlIIIIIIlIl[114])) {
                if (B.lIlIIlllIIIllIl(Players.getLocal().getWorldLocation().distanceTo(B.gG), B.lIIlIIIIIIlIl[4])) {
                    AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[115]];
                    Movement.walkTo((WorldPoint)B.gG);

                    Time.sleepTicks((int)B.lIIlIIIIIIlIl[1]);

                }
                if (B.lIlIIlllIIIlllI(Players.getLocal().getWorldLocation().distanceTo(B.gG), B.lIIlIIIIIIlIl[4])) {
                    v54 = new int[B.lIIlIIIIIIlIl[1]];
                    v54[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[116];
                    var4 = TileObjects.getNearest((int[])v54);
                    g.a(B.gx);
                    if (B.lIlIIlllIIIlIll(var4)) {
                        AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[103]];
                        var4.interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[117]]);
                        Time.sleepTicks((int)B.lIIlIIIIIIlIl[18]);

                    }
                }
            }
            if (B.lIlIIlllIIIllll(Vars.getBit((int)QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), B.lIIlIIIIIIlIl[118])) {
                AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[119]];
                g.a(B.gx);
                v55 = new int[B.lIIlIIIIIIlIl[1]];
                v55[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[120];
                if (B.lIlIIlllIIIlIII((int)Inventory.contains((int[])v55))) {
                    v56 = new int[B.lIIlIIIIIIlIl[1]];
                    v56[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[120];
                    Inventory.getFirst((int[])v56).interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[121]]);
                    Time.sleepTicks((int)B.lIIlIIIIIIlIl[1]);

                }
                v57 = new int[B.lIIlIIIIIIlIl[1]];
                v57[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[120];
                if (B.lIlIIlllIIIlIlI((int)Inventory.contains((int[])v57))) {
                    v58 = new int[B.lIIlIIIIIIlIl[1]];
                    v58[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[122];
                    TileObjects.getNearest((int[])v58).interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[123]]);
                    Time.sleepTicks((int)B.lIIlIIIIIIlIl[3]);

                }
            }
            if (B.lIlIIlllIIIllll(Vars.getBit((int)QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), B.lIIlIIIIIIlIl[124])) {
                if (B.lIlIIlllIIIlllI(Players.getLocal().getWorldLocation().getX(), B.lIIlIIIIIIlIl[51])) {
                    v59 = new int[B.lIIlIIIIIIlIl[1]];
                    v59[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[111];
                    var4 = TileObjects.getNearest((int[])v59);
                    if (B.lIlIIlllIIIlIll(var4)) {
                        AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[114]];
                        var4.interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[125]]);
                        Time.sleepTicks((int)B.lIIlIIIIIIlIl[18]);

                    }
                }
                if (B.lIlIIlllIIIllIl(Players.getLocal().getWorldLocation().getX(), B.lIIlIIIIIIlIl[51]) && B.lIlIIlllIIIlllI(Players.getLocal().getWorldLocation().getX(), B.lIIlIIIIIIlIl[80])) {
                    v60 = new int[B.lIIlIIIIIIlIl[1]];
                    v60[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[69];
                    var4 = TileObjects.getNearest((int[])v60);
                    if (B.lIlIIlllIIIlIll(var4)) {
                        AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[126]];
                        var4.interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[127]]);
                        Time.sleepTicks((int)B.lIIlIIIIIIlIl[14]);

                    }
                }
                if (B.lIlIIlllIIIllIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(B.lIIlIIIIIIlIl[128], B.lIIlIIIIIIlIl[129], B.lIIlIIIIIIlIl[0])), B.lIIlIIIIIIlIl[1]) && B.lIlIIlllIIIllIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(B.lIIlIIIIIIlIl[130], B.lIIlIIIIIIlIl[131], B.lIIlIIIIIIlIl[0])), B.lIIlIIIIIIlIl[4])) {
                    Movement.walkTo((WorldPoint)new WorldPoint(B.lIIlIIIIIIlIl[128], B.lIIlIIIIIIlIl[129], B.lIIlIIIIIIlIl[0]));

                    v61 = new String[B.lIIlIIIIIIlIl[1]];
                    v61[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[132]];
                    var4 = TileObjects.getNearest((String[])v61);
                    v62 = new String[B.lIIlIIIIIIlIl[1]];
                    v62[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[118]];
                    if (B.lIlIIlllIIIlIII((int)var4.hasAction(v62))) {
                        var4.interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[133]]);
                        Time.sleepTicks((int)B.lIIlIIIIIIlIl[14]);

                    }
                }
                if (B.lIlIIlllIIIlllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(B.lIIlIIIIIIlIl[130], B.lIIlIIIIIIlIl[131], B.lIIlIIIIIIlIl[0])), B.lIIlIIIIIIlIl[6])) {
                    g.a(B.gx);
                    if (B.lIlIIlllIIIlllI(Players.getLocal().getWorldLocation().getY(), B.lIIlIIIIIIlIl[129])) {
                        v63 = new String[B.lIIlIIIIIIlIl[1]];
                        v63[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[134]];
                        var4 = TileObjects.getNearest((String[])v63);
                        v64 = new String[B.lIIlIIIIIIlIl[1]];
                        v64[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[135]];
                        if (B.lIlIIlllIIIlIII((int)var4.hasAction(v64))) {
                            var4.interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[136]]);
                            Time.sleepTicks((int)B.lIIlIIIIIIlIl[1]);

                        }
                    }
                    v65 = new String[B.lIIlIIIIIIlIl[1]];
                    v65[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[124]];
                    var4 = TileObjects.getNearest((String[])v65);
                    v66 = new String[B.lIIlIIIIIIlIl[1]];
                    v66[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[137]];
                    if (B.lIlIIlllIIIlIlI((int)var4.hasAction(v66))) {
                        AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[138]];
                        v67 = new int[B.lIIlIIIIIIlIl[1]];
                        v67[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[8];
                        v68 = new String[B.lIIlIIIIIIlIl[1]];
                        v68[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[139]];
                        Inventory.getFirst((int[])v67).useOn(TileObjects.getNearest((String[])v68));
                        Time.sleepTicks((int)B.lIIlIIIIIIlIl[4]);

                    }
                }
            }
            if (B.lIlIIlllIIIllll(Vars.getBit((int)QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), B.lIIlIIIIIIlIl[140])) {
                g.a(B.gx);
                var4 = Widgets.get((int)B.lIIlIIIIIIlIl[141], (int)B.lIIlIIIIIIlIl[3]);
                if (B.lIlIIlllIIIlIll(var4)) {
                    AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[142]];
                    var5 = Vars.getBit((int)B.lIIlIIIIIIlIl[143]);
                    if (B.lIlIIlllIIIlIlI(var5)) {
                        Mouse.click((Point)Widgets.get((int)B.lIIlIIIIIIlIl[141], (int)B.lIIlIIIIIIlIl[36]).getClickPoint().getAwtPoint(), (boolean)B.lIIlIIIIIIlIl[1]);

                        if (-1 >= (151 ^ 147)) {
                            return;
                        }
                    } else if (B.lIlIIlllIIIllll(var5, B.lIIlIIIIIIlIl[1])) {
                        Mouse.click((Point)Widgets.get((int)B.lIIlIIIIIIlIl[141], (int)B.lIIlIIIIIIlIl[4]).getClickPoint().getAwtPoint(), (boolean)B.lIIlIIIIIIlIl[1]);

                        if (2 <= 1) {
                            return;
                        }
                    } else if (B.lIlIIlllIIIllll(var5, B.lIIlIIIIIIlIl[3])) {
                        Mouse.click((Point)Widgets.get((int)B.lIIlIIIIIIlIl[141], (int)B.lIIlIIIIIIlIl[22]).getClickPoint().getAwtPoint(), (boolean)B.lIIlIIIIIIlIl[1]);

                        }
                    } else if (B.lIlIIlllIIIllll(var5, B.lIIlIIIIIIlIl[4])) {
                        Mouse.click((Point)Widgets.get((int)B.lIIlIIIIIIlIl[141], (int)B.lIIlIIIIIIlIl[39]).getClickPoint().getAwtPoint(), (boolean)B.lIIlIIIIIIlIl[1]);

                        if (((56 + 49 - -56 + 82 ^ 106 + 27 - 96 + 123) & (16 + 48 - -44 + 140 ^ 115 + 110 - 114 + 60 ^ -1)) != 0) {
                            return;
                        }
                    } else if (B.lIlIIlllIIIllll(var5, B.lIIlIIIIIIlIl[6])) {
                        Mouse.click((Point)Widgets.get((int)B.lIIlIIIIIIlIl[141], (int)B.lIIlIIIIIIlIl[14]).getClickPoint().getAwtPoint(), (boolean)B.lIIlIIIIIIlIl[1]);

                        if (-1 >= 1) {
                            return;
                        }
                    } else if (B.lIlIIlllIIIllll(var5, B.lIIlIIIIIIlIl[11])) {
                        Mouse.click((Point)Widgets.get((int)B.lIIlIIIIIIlIl[141], (int)B.lIIlIIIIIIlIl[24]).getClickPoint().getAwtPoint(), (boolean)B.lIIlIIIIIIlIl[1]);
                    }
                }
                if (B.lIlIIlllIIlIIII(var4) && B.lIlIIlllIIIlIlI((int)Dialog.isOpen())) {
                    v69 = new String[B.lIIlIIIIIIlIl[1]];
                    v69[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[140]];
                    var5 = TileObjects.getNearest((String[])v69);
                    v70 = new String[B.lIIlIIIIIIlIl[1]];
                    v70[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[144]];
                    if (B.lIlIIlllIIIlIII((int)var5.hasAction(v70))) {
                        AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[145]];
                        var5.interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[146]]);
                        Time.sleepTicks((int)B.lIIlIIIIIIlIl[4]);

                    }
                    v71 = new String[B.lIIlIIIIIIlIl[1]];
                    v71[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[147]];
                    if (B.lIlIIlllIIIlIlI((int)var5.hasAction(v71))) {
                        v72 = new int[B.lIIlIIIIIIlIl[1]];
                        v72[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[8];
                        v73 = new String[B.lIIlIIIIIIlIl[1]];
                        v73[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[148]];
                        Inventory.getFirst((int[])v72).useOn(TileObjects.getNearest((String[])v73));
                        Time.sleepTicks((int)B.lIIlIIIIIIlIl[4]);

                    }
                }
            }
            if (B.lIlIIlllIIIllll(Vars.getBit((int)QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), B.lIIlIIIIIIlIl[148])) {
                v74 = new int[B.lIIlIIIIIIlIl[1]];
                v74[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[149];
                if (B.lIlIIlllIIIlIlI((int)Inventory.contains((int[])v74))) {
                    v75 = new String[B.lIIlIIIIIIlIl[1]];
                    v75[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[150]];
                    var4 = TileObjects.getNearest((String[])v75);
                    v76 = new String[B.lIIlIIIIIIlIl[1]];
                    v76[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[151]];
                    if (B.lIlIIlllIIIlIII((int)var4.hasAction(v76))) {
                        AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[152]];
                        var4.interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[153]]);
                        Time.sleepTicks((int)B.lIIlIIIIIIlIl[4]);

                    }
                }
                v77 = new int[B.lIIlIIIIIIlIl[1]];
                v77[B.lIIlIIIIIIlIl[0]] = B.lIIlIIIIIIlIl[149];
                if (B.lIlIIlllIIIlIII((int)Inventory.contains((int[])v77)) && B.lIlIIlllIIIllIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(B.lIIlIIIIIIlIl[154], B.lIIlIIIIIIlIl[155], B.lIIlIIIIIIlIl[0])), B.lIIlIIIIIIlIl[6])) {
                    AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[156]];
                    Movement.walkTo((WorldPoint)new WorldPoint(B.lIIlIIIIIIlIl[154], B.lIIlIIIIIIlIl[155], B.lIIlIIIIIIlIl[0]));

                    Time.sleepTicks((int)B.lIIlIIIIIIlIl[1]);

                }
            }
            if (!B.lIlIIlllIIlIIlI(Vars.getBit((int)QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), B.lIIlIIIIIIlIl[157]) || B.lIlIIlllIIIllll(Vars.getBit((int)QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), B.lIIlIIIIIIlIl[156])) {
                g.a(B.gx);
                if (B.lIlIIlllIIIlIlI((int)Static.getClient().isInInstancedRegion())) {
                    v78 = new String[B.lIIlIIIIIIlIl[1]];
                    v78[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[157]];
                    TileObjects.getNearest((String[])v78).interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[158]]);
                    Time.sleepTicks((int)B.lIIlIIIIIIlIl[13]);

                }
                if (B.lIlIIlllIIIlIII((int)Static.getClient().isInInstancedRegion()) && B.lIlIIlllIIlIIII(B.gK)) {
                    v79 = new String[B.lIIlIIIIIIlIl[1]];
                    v79[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[159]];
                    if (B.lIlIIlllIIIlIll(NPCs.getNearest((String[])v79)) && B.lIlIIlllIIIlIlI((int)Dialog.isOpen()) && B.lIlIIlllIIIllll(Vars.getBit((int)QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), B.lIIlIIIIIIlIl[157])) {
                        Time.sleepTicks((int)B.lIIlIIIIIIlIl[14]);

                        System.out.println(B.lIIIllllllIII[B.lIIlIIIIIIlIl[160]]);
                        B.gK = Players.getLocal().getWorldLocation();
                    }
                }
                if (B.lIlIIlllIIIlIll(B.gK)) {
                    var4 = new WorldPoint(B.gK.getX() - B.lIIlIIIIIIlIl[1], B.gK.getY() - B.lIIlIIIIIIlIl[3], B.lIIlIIIIIIlIl[0]);
                    v80 = new String[B.lIIlIIIIIIlIl[1]];
                    v80[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[161]];
                    var5 = NPCs.getNearest((String[])v80);
                    if (B.lIlIIlllIIIlIll(var5)) {
                        if (B.lIlIIlllIIIlIII((int)var5.getWorldLocation().equals((Object)var4))) {
                            var6 = new WorldPoint(B.gK.getX() - B.lIIlIIIIIIlIl[1], B.gK.getY() - B.lIIlIIIIIIlIl[4], B.lIIlIIIIIIlIl[0]);
                            if (B.lIlIIlllIIIlIlI((int)Players.getLocal().getWorldLocation().equals((Object)var6))) {
                                e.b((WorldPoint)var6);
                                Time.sleepTicks((int)B.lIIlIIIIIIlIl[3]);

                            }
                            if (B.lIlIIlllIIIlIII((int)Players.getLocal().getWorldLocation().equals((Object)var6))) {
                                var5.interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[162]]);
                                Time.sleepTicks((int)B.lIIlIIIIIIlIl[4]);

                            }
                        }
                        var6 = new WorldPoint(B.gK.getX() - B.lIIlIIIIIIlIl[1], B.gK.getY() - B.lIIlIIIIIIlIl[1], B.lIIlIIIIIIlIl[0]);
                        var7 = new WorldPoint(B.gK.getX() - B.lIIlIIIIIIlIl[1], B.gK.getY(), B.lIIlIIIIIIlIl[0]);
                        var8 = new WorldPoint(B.gK.getX() - B.lIIlIIIIIIlIl[1], B.gK.getY() + B.lIIlIIIIIIlIl[1], B.lIIlIIIIIIlIl[0]);
                        var9 = new WorldPoint(B.gK.getX(), B.gK.getY() + B.lIIlIIIIIIlIl[1], B.lIIlIIIIIIlIl[0]);
                        var10 = new WorldPoint(B.gK.getX() + B.lIIlIIIIIIlIl[1], B.gK.getY() + B.lIIlIIIIIIlIl[1], B.lIIlIIIIIIlIl[0]);
                        var11 = new WorldPoint(B.gK.getX() + B.lIIlIIIIIIlIl[1], B.gK.getY(), B.lIIlIIIIIIlIl[0]);
                        var12 = new WorldPoint(B.gK.getX() + B.lIIlIIIIIIlIl[1], B.gK.getY() - B.lIIlIIIIIIlIl[1], B.lIIlIIIIIIlIl[0]);
                        var13 = new WorldPoint(B.gK.getX() + B.lIIlIIIIIIlIl[1], B.gK.getY() - B.lIIlIIIIIIlIl[3], B.lIIlIIIIIIlIl[0]);
                        var14 = new WorldPoint(B.gK.getX(), B.gK.getY() - B.lIIlIIIIIIlIl[3], B.lIIlIIIIIIlIl[0]);
                        if (B.lIlIIlllIIIlIII((int)var5.getWorldLocation().equals((Object)var6))) {
                            var15 = new WorldPoint(B.gK.getX() - B.lIIlIIIIIIlIl[1], B.gK.getY() - B.lIIlIIIIIIlIl[4], B.lIIlIIIIIIlIl[0]);
                            if (B.lIlIIlllIIIlIlI((int)Players.getLocal().getWorldLocation().equals((Object)var4))) {
                                e.b(var15);
                                Time.sleepTicks((int)B.lIIlIIIIIIlIl[3]);

                            }
                            if (B.lIlIIlllIIIlIII((int)Players.getLocal().getWorldLocation().equals((Object)var4))) {
                                var5.interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[163]]);
                                Time.sleepTicks((int)B.lIIlIIIIIIlIl[4]);

                            }
                        }
                        if (B.lIlIIlllIIIlIII((int)var5.getWorldLocation().equals((Object)var7))) {
                            var15 = new WorldPoint(B.gK.getX() - B.lIIlIIIIIIlIl[1], B.gK.getY() - B.lIIlIIIIIIlIl[1], B.lIIlIIIIIIlIl[0]);
                            if (B.lIlIIlllIIIlIlI((int)Players.getLocal().getWorldLocation().equals((Object)var15))) {
                                e.b(var15);
                                Time.sleepTicks((int)B.lIIlIIIIIIlIl[3]);

                            }
                            if (B.lIlIIlllIIIlIII((int)Players.getLocal().getWorldLocation().equals((Object)var15))) {
                                var5.interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[164]]);
                                Time.sleepTicks((int)B.lIIlIIIIIIlIl[4]);

                            }
                        }
                        if (B.lIlIIlllIIIlIII((int)var5.getWorldLocation().equals((Object)var8))) {
                            var15 = new WorldPoint(B.gK.getX() - B.lIIlIIIIIIlIl[3], B.gK.getY() + B.lIIlIIIIIIlIl[1], B.lIIlIIIIIIlIl[0]);
                            if (B.lIlIIlllIIIlIlI((int)Players.getLocal().getWorldLocation().equals((Object)var15))) {
                                e.b(var15);
                                Time.sleepTicks((int)B.lIIlIIIIIIlIl[3]);

                            }
                            if (B.lIlIIlllIIIlIII((int)Players.getLocal().getWorldLocation().equals((Object)var15))) {
                                var5.interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[165]]);
                                Time.sleepTicks((int)B.lIIlIIIIIIlIl[4]);

                            }
                        }
                        if (B.lIlIIlllIIIlIII((int)var5.getWorldLocation().equals((Object)var9))) {
                            Time.sleepTicks((int)B.lIIlIIIIIIlIl[24]);

                            var15 = new WorldPoint(B.gK.getX() - B.lIIlIIIIIIlIl[1], B.gK.getY() + B.lIIlIIIIIIlIl[1], B.lIIlIIIIIIlIl[0]);
                            if (B.lIlIIlllIIIlIlI((int)Players.getLocal().getWorldLocation().equals((Object)var15))) {
                                e.b(var15);
                                Time.sleepTicks((int)B.lIIlIIIIIIlIl[3]);

                            }
                            if (B.lIlIIlllIIIlIII((int)Players.getLocal().getWorldLocation().equals((Object)var15))) {
                                var5.interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[166]]);
                                Time.sleepTicks((int)B.lIIlIIIIIIlIl[4]);

                            }
                        }
                        if (B.lIlIIlllIIIlIII((int)var5.getWorldLocation().equals((Object)var10))) {
                            var15 = new WorldPoint(B.gK.getX() + B.lIIlIIIIIIlIl[1], B.gK.getY() + B.lIIlIIIIIIlIl[3], B.lIIlIIIIIIlIl[0]);
                            if (B.lIlIIlllIIIlIlI((int)Players.getLocal().getWorldLocation().equals((Object)var15))) {
                                e.b(var15);
                                Time.sleepTicks((int)B.lIIlIIIIIIlIl[3]);

                            }
                            if (B.lIlIIlllIIIlIII((int)Players.getLocal().getWorldLocation().equals((Object)var15))) {
                                var5.interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[167]]);
                                Time.sleepTicks((int)B.lIIlIIIIIIlIl[4]);

                            }
                        }
                        if (B.lIlIIlllIIIlIII((int)var5.getWorldLocation().equals((Object)var11))) {
                            Time.sleepTicks((int)B.lIIlIIIIIIlIl[24]);

                            var15 = new WorldPoint(B.gK.getX() + B.lIIlIIIIIIlIl[1], B.gK.getY() + B.lIIlIIIIIIlIl[1], B.lIIlIIIIIIlIl[0]);
                            if (B.lIlIIlllIIIlIlI((int)Players.getLocal().getWorldLocation().equals((Object)var15))) {
                                e.b(var15);
                                Time.sleepTicks((int)B.lIIlIIIIIIlIl[3]);

                            }
                            if (B.lIlIIlllIIIlIII((int)Players.getLocal().getWorldLocation().equals((Object)var15))) {
                                var5.interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[168]]);
                                Time.sleepTicks((int)B.lIIlIIIIIIlIl[4]);

                            }
                        }
                        if (B.lIlIIlllIIIlIII((int)var5.getWorldLocation().equals((Object)var12))) {
                            var15 = new WorldPoint(B.gK.getX() + B.lIIlIIIIIIlIl[1], B.gK.getY() + B.lIIlIIIIIIlIl[1], B.lIIlIIIIIIlIl[0]);
                            if (B.lIlIIlllIIIlIlI((int)Players.getLocal().getWorldLocation().equals((Object)var11))) {
                                e.b(var15);
                                Time.sleepTicks((int)B.lIIlIIIIIIlIl[3]);

                            }
                            if (B.lIlIIlllIIIlIII((int)Players.getLocal().getWorldLocation().equals((Object)var11))) {
                                var5.interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[169]]);
                                Time.sleepTicks((int)B.lIIlIIIIIIlIl[4]);

                            }
                        }
                        if (B.lIlIIlllIIIlIII((int)var5.getWorldLocation().equals((Object)var13))) {
                            var15 = new WorldPoint(B.gK.getX() + B.lIIlIIIIIIlIl[3], B.gK.getY() - B.lIIlIIIIIIlIl[3], B.lIIlIIIIIIlIl[0]);
                            if (B.lIlIIlllIIIlIlI((int)Players.getLocal().getWorldLocation().equals((Object)var15))) {
                                e.b(var15);
                                Time.sleepTicks((int)B.lIIlIIIIIIlIl[3]);

                            }
                            if (B.lIlIIlllIIIlIII((int)Players.getLocal().getWorldLocation().equals((Object)var15))) {
                                var5.interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[170]]);
                                Time.sleepTicks((int)B.lIIlIIIIIIlIl[4]);

                            }
                        }
                        if (B.lIlIIlllIIIlIII((int)var5.getWorldLocation().equals((Object)var14))) {
                            Time.sleepTicks((int)B.lIIlIIIIIIlIl[24]);

                            var15 = new WorldPoint(B.gK.getX() + B.lIIlIIIIIIlIl[1], B.gK.getY() - B.lIIlIIIIIIlIl[3], B.lIIlIIIIIIlIl[0]);
                            if (B.lIlIIlllIIIlIlI((int)Players.getLocal().getWorldLocation().equals((Object)var15))) {
                                e.b(var15);
                                Time.sleepTicks((int)B.lIIlIIIIIIlIl[3]);

                            }
                            if (B.lIlIIlllIIIlIII((int)Players.getLocal().getWorldLocation().equals((Object)var15))) {
                                var5.interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[171]]);
                                Time.sleepTicks((int)B.lIIlIIIIIIlIl[4]);

                            }
                        }
                    }
                }
            }
            if (B.lIlIIlllIIIllll(Vars.getBit((int)QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), B.lIIlIIIIIIlIl[161])) {
                AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[172]];
                g.a(B.gx);
            }
            if (B.lIlIIlllIIIllll(Vars.getBit((int)QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), B.lIIlIIIIIIlIl[166])) {
                AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[173]];
                v81 = new String[B.lIIlIIIIIIlIl[1]];
                v81[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[174]];
                if (B.lIlIIlllIIIlIll(TileItems.getNearest((String[])v81))) {
                    v82 = new String[B.lIIlIIIIIIlIl[1]];
                    v82[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[175]];
                    TileItems.getNearest((String[])v82).interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[176]]);
                    Time.sleepTicks((int)B.lIIlIIIIIIlIl[3]);

                }
                v83 = new String[B.lIIlIIIIIIlIl[1]];
                v83[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[177]];
                if (B.lIlIIlllIIIlIII((int)Inventory.contains((String[])v83))) {
                    v84 = new String[B.lIIlIIIIIIlIl[1]];
                    v84[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[178]];
                    Inventory.getFirst((String[])v84).interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[179]]);
                }
                v85 = new String[B.lIIlIIIIIIlIl[1]];
                v85[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[180]];
                if (B.lIlIIlllIIIlIII((int)Equipment.contains((String[])v85))) {
                    v86 = new String[B.lIIlIIIIIIlIl[1]];
                    v86[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[181]];
                    NPCs.getNearest((String[])v86).interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[182]]);
                    Time.sleepTicks((int)B.lIIlIIIIIIlIl[3]);

                }
                if (B.lIlIIlllIIIlIII((int)Dialog.isOpen())) {
                    Dialog.chooseOption((String[])B.gx);

                    Time.sleepTicks((int)B.lIIlIIIIIIlIl[4]);

                }
            }
            if (B.lIlIIlllIIIllll(Vars.getBit((int)QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), B.lIIlIIIIIIlIl[171])) {
                if (B.lIlIIlllIIIlIlI((int)Dialog.isOpen())) {
                    AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[183]];
                    v87 = new String[B.lIIlIIIIIIlIl[1]];
                    v87[B.lIIlIIIIIIlIl[0]] = B.lIIIllllllIII[B.lIIlIIIIIIlIl[184]];
                    TileObjects.getNearest((String[])v87).interact(B.lIIIllllllIII[B.lIIlIIIIIIlIl[185]]);
                    Time.sleepTicks((int)B.lIIlIIIIIIlIl[24]);

                }
                g.a(B.gx);
            }
            if (B.lIlIIlllIIIllll(Vars.getBit((int)QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), B.lIIlIIIIIIlIl[176])) {
                AccBuilderRat.c = B.lIIIllllllIII[B.lIIlIIIIIIlIl[186]];
                if (B.lIlIIlllIIIllIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(B.lIIlIIIIIIlIl[187], B.lIIlIIIIIIlIl[188], B.lIIlIIIIIIlIl[0])), B.lIIlIIIIIIlIl[6])) {
                    Movement.walkTo((WorldPoint)new WorldPoint(B.lIIlIIIIIIlIl[187], B.lIIlIIIIIIlIl[188], B.lIIlIIIIIIlIl[0]));

                    Time.sleepTicks((int)B.lIIlIIIIIIlIl[1]);

                }
                if (B.lIlIIlllIIIlllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(B.lIIlIIIIIIlIl[187], B.lIIlIIIIIIlIl[188], B.lIIlIIIIIIlIl[0])), B.lIIlIIIIIIlIl[6])) {
                    if (B.lIlIIlllIIIlIIl(B.co, B.lIIlIIIIIIlIl[1])) {
                        P.lu += B.lIIlIIIIIIlIl[1];
                        P.d(AccBuilderRat.m);
                        B.co += B.lIIlIIIIIIlIl[1];
                        P.lu = B.lIIlIIIIIIlIl[0];
                        B.cp = B.lIIlIIIIIIlIl[0];
                    }
                    g.a(B.lIIIllllllIII[B.lIIlIIIIIIlIl[189]], B.gx, B.lIIlIIIIIIlIl[1]);
                }
            }
            if (B.lIlIIlllIIIllll(Vars.getBit((int)QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()), B.lIIlIIIIIIlIl[181])) {
                // empty if block
            }
            g.a(new String[B.lIIlIIIIIIlIl[0]]);
        }
        System.out.println("Setting: " + Vars.getBit((int)QuestVarbits.QUEST_MISTHALIN_MYSTERY.getId()));
    }

    private static boolean lIlIIlllIIIlIII(int n2) {
        return n2 != 0;
    }
}

