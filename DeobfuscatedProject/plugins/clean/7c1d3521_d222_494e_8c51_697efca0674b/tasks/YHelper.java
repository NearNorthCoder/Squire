/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Locatable
 *  net.runelite.api.Prayer
 *  net.runelite.api.Skill
 *  net.runelite.api.TileItem
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.movement.pathfinder.Walker
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.quests.QuestVarbits
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks;

import gg.squire.account.AccBuilderSotf;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Locatable;
import net.runelite.api.Prayer;
import net.runelite.api.Skill;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Widgets;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.DHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.HHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.AHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.ACHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.AEHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.ANHelper;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.AMHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.AVHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.AWHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.AYHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.BHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.DHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.EHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.FHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.GHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.JHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.MHelper;

public class YHelper
implements ac {
    public static  String da;
    public static  String h;
    public static  List<d> bv;
    public static  WorldPoint dO;
    public static  WorldPoint dS;
    public static  int dN;
    static  String[] cE;
    static  WorldArea dX;
    public static  WorldPoint dR;
    static  boolean dj;
    public static  WorldPoint dU;
    public static  boolean bt;
    static  WorldArea dZ;
    
    static  int di;
    public static  WorldPoint dQ;
    static  WorldArea dY;
    static  WorldArea dW;
    public static  WorldPoint dP;
    public static  WorldPoint dT;
    
    static  WorldPoint dV;

    private static boolean lIllllIIllIlI(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIllllIIlIllI(int n2) {
        return n2 > 0;
    }

    private static boolean lIllllIIlIIll(int n2) {
        return n2 == 0;
    }

    private static boolean lIllllIIlIIIl(int n2) {
        return n2 != 0;
    }

    public static void bo() {
        WorldArea var1;
        WorldArea var2;
        WorldArea worldArea = new WorldArea(llIllllllI[275], llIllllllI[276], llIllllllI[11], llIllllllI[8], llIllllllI[0]);
        if (y.lIllllIIlIIIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[277]];
            String[] stringArray = new String[llIllllllI[0]];
            stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[278]];
            TileObjects.getNearest((String[])stringArray).interact(llIllllIlI[llIllllllI[279]]);
            Time.sleepTicks((int)llIllllllI[8]);

        }
        WorldArea var3 = new WorldArea(llIllllllI[280], llIllllllI[281], llIllllllI[44], llIllllllI[56], llIllllllI[1]);
        WorldPoint var4 = new WorldPoint(llIllllllI[282], llIllllllI[283], llIllllllI[1]);
        if (y.lIllllIIlIIIl(var3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (y.lIllllIIllIIl(Players.getLocal().getWorldLocation().distanceTo(var4), llIllllllI[8])) {
                AccBuilderSotf.c = llIllllIlI[llIllllllI[284]];
                Movement.walkTo((WorldPoint)var4);

                Time.sleepTicks((int)llIllllllI[0]);

            }
            if (y.lIllllIIllIlI(Players.getLocal().getWorldLocation().distanceTo(var4), llIllllllI[8]) && y.lIllllIIlIIll(Players.getLocal().getWorldLocation().getPlane())) {
                AccBuilderSotf.c = llIllllIlI[llIllllllI[285]];
                if (y.lIllllIIllIII(Players.getLocal().getAnimation(), llIllllllI[54])) {
                    String[] stringArray = new String[llIllllllI[0]];
                    stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[147]];
                    TileObjects.getNearest((String[])stringArray).interact(llIllllIlI[llIllllllI[286]]);
                    Time.sleepTicks((int)llIllllllI[6]);

                }
            }
        }
        if (y.lIllllIIlIIIl((var2 = new WorldArea(llIllllllI[132], llIllllllI[133], llIllllllI[13], llIllllllI[21], llIllllllI[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && y.lIllllIIllIII(Players.getLocal().getAnimation(), llIllllllI[54])) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[287]];
            String[] stringArray = new String[llIllllllI[0]];
            stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[288]];
            TileObjects.getNearest((String[])stringArray).interact(llIllllIlI[llIllllllI[289]]);
            Time.sleepTicks((int)llIllllllI[8]);

        }
        WorldArea var5 = new WorldArea(llIllllllI[290], llIllllllI[291], llIllllllI[15], llIllllllI[64], llIllllllI[0]);
        WorldPoint var6 = new WorldPoint(llIllllllI[292], llIllllllI[293], llIllllllI[0]);
        WorldPoint[] worldPointArray = new WorldPoint[llIllllllI[17]];
        worldPointArray[y.llIllllllI[1]] = new WorldPoint(llIllllllI[280], llIllllllI[133], llIllllllI[0]);
        worldPointArray[y.llIllllllI[0]] = new WorldPoint(llIllllllI[292], llIllllllI[294], llIllllllI[0]);
        worldPointArray[y.llIllllllI[4]] = new WorldPoint(llIllllllI[295], llIllllllI[296], llIllllllI[0]);
        worldPointArray[y.llIllllllI[6]] = new WorldPoint(llIllllllI[295], llIllllllI[297], llIllllllI[0]);
        worldPointArray[y.llIllllllI[8]] = new WorldPoint(llIllllllI[298], llIllllllI[299], llIllllllI[0]);
        worldPointArray[y.llIllllllI[2]] = new WorldPoint(llIllllllI[298], llIllllllI[300], llIllllllI[0]);
        worldPointArray[y.llIllllllI[11]] = new WorldPoint(llIllllllI[295], llIllllllI[301], llIllllllI[0]);
        worldPointArray[y.llIllllllI[13]] = new WorldPoint(llIllllllI[292], llIllllllI[302], llIllllllI[0]);
        worldPointArray[y.llIllllllI[15]] = new WorldPoint(llIllllllI[292], llIllllllI[303], llIllllllI[0]);
        worldPointArray[y.llIllllllI[16]] = new WorldPoint(llIllllllI[292], llIllllllI[304], llIllllllI[0]);
        WorldPoint[] var7 = worldPointArray;
        if (y.lIllllIIlIIIl(var5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (y.lIllllIIllIIl(Players.getLocal().getWorldLocation().distanceTo(var6), llIllllllI[8])) {
                AccBuilderSotf.c = llIllllIlI[llIllllllI[305]];
                Walker.walkAlong(Arrays.asList(var7), new HashMap());

                Time.sleepTicks((int)llIllllllI[0]);

            }
            if (y.lIllllIIllIlI(Players.getLocal().getWorldLocation().distanceTo(var6), llIllllllI[8])) {
                AccBuilderSotf.c = llIllllIlI[llIllllllI[306]];
                String[] stringArray = new String[llIllllllI[0]];
                stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[307]];
                TileObjects.getNearest((String[])stringArray).interact(llIllllIlI[llIllllllI[308]]);
                Time.sleepTicks((int)llIllllllI[8]);

            }
        }
        if (y.lIllllIIlIIIl((var1 = new WorldArea(llIllllllI[295], llIllllllI[304], llIllllllI[2], llIllllllI[11], llIllllllI[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[309]];
            String[] stringArray = new String[llIllllllI[0]];
            stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[151]];
            TileObjects.getNearest((String[])stringArray).interact(llIllllIlI[llIllllllI[310]]);
            Time.sleepTicks((int)llIllllllI[2]);

            String[] stringArray2 = new String[llIllllllI[0]];
            stringArray2[y.llIllllllI[1]] = llIllllIlI[llIllllllI[311]];
            TileObjects.getNearest((String[])stringArray2).interact(llIllllIlI[llIllllllI[312]]);
            Time.sleepTicks((int)llIllllllI[2]);

        }
        WorldArea var8 = new WorldArea(llIllllllI[313], llIllllllI[314], llIllllllI[16], llIllllllI[3], llIllllllI[1]);
        WorldPoint var9 = new WorldPoint(llIllllllI[282], llIllllllI[315], llIllllllI[1]);
        if (y.lIllllIIlIIIl(var8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (y.lIllllIIllIIl(Players.getLocal().getWorldLocation().distanceTo(var9), llIllllllI[8])) {
                AccBuilderSotf.c = llIllllIlI[llIllllllI[316]];
                Movement.walkTo((WorldPoint)var9);

                Time.sleepTicks((int)llIllllllI[0]);

            }
            if (y.lIllllIIllIlI(Players.getLocal().getWorldLocation().distanceTo(var9), llIllllllI[8])) {
                AccBuilderSotf.c = llIllllIlI[llIllllllI[317]];
                String[] stringArray = new String[llIllllllI[0]];
                stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[318]];
                TileObjects.getNearest((String[])stringArray).interact(llIllllIlI[llIllllllI[319]]);
                Time.sleepTicks((int)llIllllllI[8]);

            }
        }
        WorldArea var10 = new WorldArea(llIllllllI[290], llIllllllI[320], llIllllllI[19], llIllllllI[52], llIllllllI[0]);
        WorldPoint var11 = new WorldPoint(llIllllllI[292], llIllllllI[239], llIllllllI[0]);
        if (y.lIllllIIlIIIl(var10.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (y.lIllllIIllIIl(Players.getLocal().getWorldLocation().distanceTo(var11), llIllllllI[8])) {
                AccBuilderSotf.c = llIllllIlI[llIllllllI[321]];
                Movement.walkTo((WorldPoint)var11);

                Time.sleepTicks((int)llIllllllI[0]);

            }
            if (y.lIllllIIllIlI(Players.getLocal().getWorldLocation().distanceTo(var11), llIllllllI[8])) {
                AccBuilderSotf.c = llIllllIlI[llIllllllI[322]];
                String[] stringArray = new String[llIllllllI[0]];
                stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[152]];
                TileObjects.getNearest((String[])stringArray).interact(llIllllIlI[llIllllllI[323]]);
                Time.sleepTicks((int)llIllllllI[8]);

            }
        }
        WorldArea var12 = new WorldArea(llIllllllI[290], llIllllllI[324], llIllllllI[11], llIllllllI[21], llIllllllI[4]);
        WorldPoint var13 = new WorldPoint(llIllllllI[295], llIllllllI[222], llIllllllI[4]);
        if (y.lIllllIIlIIIl(var12.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (y.lIllllIIllIIl(Players.getLocal().getWorldLocation().distanceTo(var13), llIllllllI[4])) {
                AccBuilderSotf.c = llIllllIlI[llIllllllI[325]];
                Movement.walkTo((WorldPoint)var13);

                Time.sleepTicks((int)llIllllllI[0]);

            }
            if (y.lIllllIIllIlI(Players.getLocal().getWorldLocation().distanceTo(var13), llIllllllI[4])) {
                AccBuilderSotf.c = llIllllIlI[llIllllllI[326]];
                String[] stringArray = new String[llIllllllI[0]];
                stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[327]];
                TileObjects.getNearest((String[])stringArray).interact(llIllllIlI[llIllllllI[328]]);
                Time.sleepTicks((int)llIllllllI[8]);

            }
        }
        WorldArea var14 = new WorldArea(llIllllllI[132], llIllllllI[329], llIllllllI[41], llIllllllI[82], llIllllllI[0]);
        WorldPoint var15 = new WorldPoint(llIllllllI[330], llIllllllI[331], llIllllllI[0]);
        if (y.lIllllIIlIIIl(var14.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (y.lIllllIIllIIl(Players.getLocal().getWorldLocation().distanceTo(var15), llIllllllI[8])) {
                AccBuilderSotf.c = llIllllIlI[llIllllllI[332]];
                Movement.walkTo((WorldPoint)var15);

                Time.sleepTicks((int)llIllllllI[0]);

            }
            if (y.lIllllIIllIlI(Players.getLocal().getWorldLocation().distanceTo(var15), llIllllllI[8])) {
                AccBuilderSotf.c = llIllllIlI[llIllllllI[333]];
                String[] stringArray = new String[llIllllllI[0]];
                stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[334]];
                TileObjects.getNearest((String[])stringArray).interact(llIllllIlI[llIllllllI[335]]);
                Time.sleepTicks((int)llIllllllI[8]);

            }
        }
        WorldArea var16 = new WorldArea(llIllllllI[336], llIllllllI[331], llIllllllI[115], llIllllllI[104], llIllllllI[1]);
        WorldPoint var17 = new WorldPoint(llIllllllI[337], llIllllllI[338], llIllllllI[1]);
        if (y.lIllllIIlIIIl(var16.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (y.lIllllIIllIIl(Players.getLocal().getWorldLocation().distanceTo(var17), llIllllllI[8])) {
                AccBuilderSotf.c = llIllllIlI[llIllllllI[153]];
                Movement.walkTo((WorldPoint)var17);

                Time.sleepTicks((int)llIllllllI[0]);

            }
            if (y.lIllllIIllIlI(Players.getLocal().getWorldLocation().distanceTo(var17), llIllllllI[8])) {
                AccBuilderSotf.c = llIllllIlI[llIllllllI[339]];
                g.a(llIllllIlI[llIllllllI[340]], cE);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void br() {
        void var18;
        void var19;
        void var20;
        WorldPoint worldPoint = new WorldPoint(llIllllllI[556], llIllllllI[557], llIllllllI[0]);
        WorldPoint worldPoint2 = new WorldPoint(llIllllllI[556], llIllllllI[558], llIllllllI[0]);
        WorldPoint worldPoint3 = new WorldPoint(llIllllllI[351], llIllllllI[558], llIllllllI[0]);
        WorldArea worldArea = new WorldArea(llIllllllI[290], llIllllllI[559], llIllllllI[45], llIllllllI[52], llIllllllI[0]);
        WorldArea worldArea2 = new WorldArea(llIllllllI[132], llIllllllI[133], llIllllllI[13], llIllllllI[21], llIllllllI[1]);
        if (y.lIllllIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)worldPoint) ? 1 : 0)) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[560]];
            int[] nArray = new int[llIllllllI[0]];
            nArray[y.llIllllllI[1]] = llIllllllI[561];
            TileObjects.getNearest((int[])nArray).interact(llIllllIlI[llIllllllI[562]]);
            Time.sleepTicks((int)llIllllllI[4]);

        }
        if (y.lIllllIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)var20) ? 1 : 0)) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[563]];
            int[] nArray = new int[llIllllllI[0]];
            nArray[y.llIllllllI[1]] = llIllllllI[564];
            TileObjects.getNearest((int[])nArray).interact(llIllllIlI[llIllllllI[565]]);
            Time.sleepTicks((int)llIllllllI[4]);

        }
        if (y.lIllllIIlIIIl(var19.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[566]];
            String[] stringArray = new String[llIllllllI[0]];
            stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[567]];
            if (y.lIllllIIlIlIl(TileObjects.getNearest((String[])stringArray))) {
                String[] stringArray2 = new String[llIllllllI[0]];
                stringArray2[y.llIllllllI[1]] = llIllllIlI[llIllllllI[568]];
                String[] stringArray3 = new String[llIllllllI[0]];
                stringArray3[y.llIllllllI[1]] = llIllllIlI[llIllllllI[569]];
                if (y.lIllllIIlIIIl(TileObjects.getNearest((String[])stringArray2).hasAction(stringArray3) ? 1 : 0) && y.lIllllIIlIIll(Dialog.isOpen() ? 1 : 0)) {
                    String[] stringArray4 = new String[llIllllllI[0]];
                    stringArray4[y.llIllllllI[1]] = llIllllIlI[llIllllllI[570]];
                    TileObjects.getNearest((String[])stringArray4).interact(llIllllIlI[llIllllllI[571]]);
                    Time.sleepTicks((int)llIllllllI[6]);

                }
            }
            String[] stringArray5 = new String[llIllllllI[0]];
            stringArray5[y.llIllllllI[1]] = llIllllIlI[llIllllllI[572]];
            if (y.lIllllIIlIlIl(TileObjects.getNearest((String[])stringArray5))) {
                String[] stringArray6 = new String[llIllllllI[0]];
                stringArray6[y.llIllllllI[1]] = llIllllIlI[llIllllllI[14]];
                String[] stringArray7 = new String[llIllllllI[0]];
                stringArray7[y.llIllllllI[1]] = llIllllIlI[llIllllllI[573]];
                if (y.lIllllIIlIIIl(TileObjects.getNearest((String[])stringArray6).hasAction(stringArray7) ? 1 : 0) && y.lIllllIIlIIll(Dialog.isOpen() ? 1 : 0)) {
                    String[] stringArray8 = new String[llIllllllI[0]];
                    stringArray8[y.llIllllllI[1]] = llIllllIlI[llIllllllI[574]];
                    TileObjects.getNearest((String[])stringArray8).interact(llIllllIlI[llIllllllI[575]]);
                    Time.sleepTicks((int)llIllllllI[6]);

                }
            }
            g.a(cE);
        }
        if (y.lIllllIIlIIIl(var18.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && y.lIllllIIlIIll(Players.getLocal().isMoving() ? 1 : 0)) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[576]];
            String[] stringArray = new String[llIllllllI[0]];
            stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[577]];
            TileObjects.getNearest((String[])stringArray).interact(llIllllIlI[llIllllllI[578]]);
            Time.sleepTicks((int)llIllllllI[6]);

        }
    }

    private static boolean lIllllIIllIII(int n2, int n3) {
        return n2 == n3;
    }

    public static void bm() {
        WorldArea var21 = new WorldArea(llIllllllI[216], llIllllllI[217], llIllllllI[51], llIllllllI[68], llIllllllI[1]);
        WorldArea var22 = new WorldArea(llIllllllI[218], llIllllllI[219], llIllllllI[11], llIllllllI[8], llIllllllI[1]);
        WorldPoint var23 = new WorldPoint(llIllllllI[220], llIllllllI[172], llIllllllI[1]);
        WorldPoint var24 = new WorldPoint(llIllllllI[221], llIllllllI[222], llIllllllI[1]);
        WorldArea var25 = new WorldArea(llIllllllI[223], llIllllllI[224], llIllllllI[13], llIllllllI[11], llIllllllI[1]);
        WorldArea var26 = new WorldArea(llIllllllI[225], llIllllllI[172], llIllllllI[6], llIllllllI[8], llIllllllI[1]);
        WorldArea var27 = new WorldArea(llIllllllI[171], llIllllllI[172], llIllllllI[4], llIllllllI[13], llIllllllI[1]);
        WorldArea var28 = new WorldArea(llIllllllI[226], llIllllllI[227], llIllllllI[11], llIllllllI[11], llIllllllI[1]);
        String[] stringArray = new String[llIllllllI[0]];
        stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[228]];
        if (y.lIllllIIlIlIl(TileObjects.getNearest((String[])stringArray)) && y.lIllllIIlIIll(Players.getLocal().isMoving() ? 1 : 0)) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[229]];
            String[] stringArray2 = new String[llIllllllI[0]];
            stringArray2[y.llIllllllI[1]] = llIllllIlI[llIllllllI[230]];
            TileObjects.getNearest((String[])stringArray2).interact(llIllllIlI[llIllllllI[231]]);
            Time.sleepTicks((int)llIllllllI[8]);

        }
        if (y.lIllllIIlIIIl(var27.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[232]];
            String[] stringArray3 = new String[llIllllllI[0]];
            stringArray3[y.llIllllllI[1]] = llIllllIlI[llIllllllI[233]];
            TileObjects.getNearest((String[])stringArray3).interact(llIllllIlI[llIllllllI[234]]);
            Time.sleepTicks((int)llIllllllI[8]);

        }
        if (!y.lIllllIIlIIll(var25.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || y.lIllllIIlIIIl(var26.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[235]];
            String[] stringArray4 = new String[llIllllllI[0]];
            stringArray4[y.llIllllllI[1]] = llIllllIlI[llIllllllI[125]];
            if (y.lIllllIIlIlIl(TileObjects.getNearest((String[])stringArray4))) {
                String[] stringArray5 = new String[llIllllllI[0]];
                stringArray5[y.llIllllllI[1]] = llIllllIlI[llIllllllI[236]];
                TileObjects.getNearest((String[])stringArray5).interact(llIllllIlI[llIllllllI[237]]);
                Time.sleepTicks((int)llIllllllI[6]);

            }
        }
        if ((!y.lIllllIIlIIll(var22.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || y.lIllllIIlIIIl(var21.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && y.lIllllIIlIIll(var28.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && y.lIllllIIlIIll(var25.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && y.lIllllIIlIIll(var26.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && y.lIllllIIlIIll(var27.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[238]];
            Movement.walkTo((WorldPoint)var24);

            Time.sleepTicks((int)llIllllllI[0]);

        }
        y.bq();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean ah() {
        int n2;
        if (y.lIllllIIlIlII(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[194])) {
            String[] stringArray = new String[llIllllllI[0]];
            stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[591]];
            if (y.lIllllIIlIIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray2 = new String[llIllllllI[0]];
                stringArray2[y.llIllllllI[1]] = llIllllIlI[llIllllllI[592]];
                if (y.lIllllIIlIIll(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                    String[] stringArray3 = new String[llIllllllI[0]];
                    stringArray3[y.llIllllllI[1]] = llIllllIlI[llIllllllI[593]];
                    if (y.lIllllIIlIIll(Inventory.contains((String[])stringArray3) ? 1 : 0) && y.lIllllIIlIIll(Dialog.isOpen() ? 1 : 0)) {
                        n2 = llIllllllI[0];

                        if (1 < 2) return n2 != 0;
                        return false;
                    }
                }
            }
        }
        n2 = llIllllllI[1];
        return n2 != 0;
    }

    @Override
    public int af() {
        try {
            y.bl();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if (3 <= -1) {
            return (2 ^ 0x5D) & ~(0x6B ^ 0x34);
        }
        return llIllllllI[80];
    }

    public static void bl() {
        block170: {
            block181: {
                WorldPoint var29;
                BankLocation var30;
                block182: {
                    block171: {
                        block180: {
                            block173: {
                                block179: {
                                    block178: {
                                        block177: {
                                            block176: {
                                                block175: {
                                                    block174: {
                                                        block172: {
                                                            if (y.lIllllIIlIIIl(bt ? 1 : 0)) {
                                                                b.a(bv);
                                                                if (y.lIllllIIlIIlI(bv.size(), llIllllllI[0])) {
                                                                    System.out.println(llIllllIlI[llIllllllI[1]]);
                                                                    bt = llIllllllI[1];
                                                                }
                                                            }
                                                            if (!y.lIllllIIlIIll(bt ? 1 : 0)) break block170;
                                                            if (y.lIllllIIlIIlI(Skills.getLevel((Skill)Skill.CONSTRUCTION), llIllllllI[2])) {
                                                                da = llIllllIlI[llIllllllI[0]];
                                                                aw.eH();
                                                            }
                                                            if (y.lIllllIIlIlII(Skills.getLevel((Skill)Skill.CONSTRUCTION), llIllllllI[2]) && y.lIllllIIlIIlI(Skills.getLevel((Skill)Skill.MINING), llIllllllI[3])) {
                                                                da = llIllllIlI[llIllllllI[4]];
                                                                aC.fQ();
                                                            }
                                                            if (y.lIllllIIlIlII(Skills.getLevel((Skill)Skill.CONSTRUCTION), llIllllllI[2]) && y.lIllllIIlIlII(Skills.getLevel((Skill)Skill.MINING), llIllllllI[3]) && y.lIllllIIlIIlI(Skills.getLevel((Skill)Skill.THIEVING), llIllllllI[5])) {
                                                                da = llIllllIlI[llIllllllI[6]];
                                                                aE.gm();
                                                            }
                                                            if (y.lIllllIIlIlII(Skills.getLevel((Skill)Skill.CONSTRUCTION), llIllllllI[2]) && y.lIllllIIlIlII(Skills.getLevel((Skill)Skill.MINING), llIllllllI[3]) && y.lIllllIIlIlII(Skills.getLevel((Skill)Skill.THIEVING), llIllllllI[5]) && y.lIllllIIlIIlI(Skills.getLevel((Skill)Skill.AGILITY), llIllllllI[7])) {
                                                                da = llIllllIlI[llIllllllI[8]];
                                                                av.eA();
                                                            }
                                                            if (y.lIllllIIlIlII(Skills.getLevel((Skill)Skill.CONSTRUCTION), llIllllllI[2]) && y.lIllllIIlIlII(Skills.getLevel((Skill)Skill.MINING), llIllllllI[3]) && y.lIllllIIlIlII(Skills.getLevel((Skill)Skill.THIEVING), llIllllllI[5]) && y.lIllllIIlIlII(Skills.getLevel((Skill)Skill.AGILITY), llIllllllI[7]) && y.lIllllIIlIIlI(Skills.getLevel((Skill)Skill.CRAFTING), llIllllllI[9])) {
                                                                da = llIllllIlI[llIllllllI[2]];
                                                                ay.fi();
                                                            }
                                                            if (y.lIllllIIlIlII(Skills.getLevel((Skill)Skill.CONSTRUCTION), llIllllllI[2]) && y.lIllllIIlIlII(Skills.getLevel((Skill)Skill.MINING), llIllllllI[3]) && y.lIllllIIlIlII(Skills.getLevel((Skill)Skill.THIEVING), llIllllllI[5]) && y.lIllllIIlIlII(Skills.getLevel((Skill)Skill.AGILITY), llIllllllI[7]) && y.lIllllIIlIlII(Skills.getLevel((Skill)Skill.CRAFTING), llIllllllI[9]) && y.lIllllIIlIIlI(Skills.getLevel((Skill)Skill.MAGIC), llIllllllI[10])) {
                                                                da = llIllllIlI[llIllllllI[11]];
                                                                m.ak();
                                                            }
                                                            if (y.lIllllIIlIlII(Skills.getLevel((Skill)Skill.CONSTRUCTION), llIllllllI[2]) && y.lIllllIIlIlII(Skills.getLevel((Skill)Skill.MINING), llIllllllI[3]) && y.lIllllIIlIlII(Skills.getLevel((Skill)Skill.THIEVING), llIllllllI[5]) && y.lIllllIIlIlII(Skills.getLevel((Skill)Skill.AGILITY), llIllllllI[7]) && y.lIllllIIlIlII(Skills.getLevel((Skill)Skill.CRAFTING), llIllllllI[9]) && y.lIllllIIlIlII(Skills.getLevel((Skill)Skill.MAGIC), llIllllllI[10]) && y.lIllllIIlIIlI(Skills.getLevel((Skill)Skill.STRENGTH), llIllllllI[12])) {
                                                                da = llIllllIlI[llIllllllI[13]];
                                                                am.aJ();
                                                            }
                                                            if (y.lIllllIIlIlII(Skills.getLevel((Skill)Skill.CONSTRUCTION), llIllllllI[2]) && y.lIllllIIlIlII(Skills.getLevel((Skill)Skill.MINING), llIllllllI[3]) && y.lIllllIIlIlII(Skills.getLevel((Skill)Skill.THIEVING), llIllllllI[5]) && y.lIllllIIlIlII(Skills.getLevel((Skill)Skill.AGILITY), llIllllllI[7]) && y.lIllllIIlIlII(Skills.getLevel((Skill)Skill.CRAFTING), llIllllllI[9]) && y.lIllllIIlIlII(Skills.getLevel((Skill)Skill.MAGIC), llIllllllI[10]) && y.lIllllIIlIlII(Skills.getLevel((Skill)Skill.STRENGTH), llIllllllI[12]) && y.lIllllIIlIIlI(Vars.getBit((int)QuestVarbits.QUEST_IN_AID_OF_THE_MYREQUE.getId()), llIllllllI[14])) {
                                                                da = llIllllIlI[llIllllllI[15]];
                                                                D.bF();
                                                            }
                                                            if (!y.lIllllIIlIIll(y.an() ? 1 : 0) || !y.lIllllIIlIIll(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId())) || !y.lIllllIIlIlII(Skills.getLevel((Skill)Skill.CONSTRUCTION), llIllllllI[2]) || !y.lIllllIIlIlII(Skills.getLevel((Skill)Skill.MINING), llIllllllI[3]) || !y.lIllllIIlIlII(Skills.getLevel((Skill)Skill.THIEVING), llIllllllI[5]) || !y.lIllllIIlIlII(Skills.getLevel((Skill)Skill.AGILITY), llIllllllI[7]) || !y.lIllllIIlIlII(Skills.getLevel((Skill)Skill.CRAFTING), llIllllllI[9]) || !y.lIllllIIlIlII(Skills.getLevel((Skill)Skill.MAGIC), llIllllllI[10]) || !y.lIllllIIlIlII(Skills.getLevel((Skill)Skill.STRENGTH), llIllllllI[12]) || !y.lIllllIIlIlII(Vars.getBit((int)QuestVarbits.QUEST_IN_AID_OF_THE_MYREQUE.getId()), llIllllllI[14])) break block171;
                                                            da = llIllllIlI[llIllllllI[16]];
                                                            var30 = BankLocation.getNearest();
                                                            if (y.lIllllIIlIlIl(var30) && y.lIllllIIlIIll(var30.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                                AccBuilderSotf.c = llIllllIlI[llIllllllI[17]];
                                                                a.a(var30);
                                                            }
                                                            if (!y.lIllllIIlIlIl(var30) || !y.lIllllIIlIIIl(var30.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block171;
                                                            if (y.lIllllIIlIIll(Bank.isOpen() ? 1 : 0)) {
                                                                a.a();
                                                                Time.sleepUntil(() -> Bank.isOpen(), (int)llIllllllI[18]);

                                                            }
                                                            if (!y.lIllllIIlIIIl(Bank.isOpen() ? 1 : 0)) break block171;
                                                            AccBuilderSotf.c = llIllllIlI[llIllllllI[19]];
                                                            if (y.lIllllIIlIllI(Inventory.getAll().size())) {
                                                                Bank.depositInventory();
                                                                Time.sleepTicks((int)llIllllllI[8]);

                                                            }
                                                            if (y.lIllllIIlIllI(Equipment.getAll().size())) {
                                                                Bank.depositEquipment();
                                                                Time.sleepTicks((int)llIllllllI[4]);

                                                            }
                                                            int[] nArray = new int[llIllllllI[0]];
                                                            nArray[y.llIllllllI[1]] = llIllllllI[20];
                                                            if (!y.lIllllIIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block172;
                                                            int[] nArray2 = new int[llIllllllI[0]];
                                                            nArray2[y.llIllllllI[1]] = llIllllllI[20];
                                                            if (!y.lIllllIIlIlII(Bank.getFirst((int[])nArray2).getQuantity(), llIllllllI[21])) break block173;
                                                        }
                                                        int[] nArray = new int[llIllllllI[0]];
                                                        nArray[y.llIllllllI[1]] = llIllllllI[22];
                                                        if (!y.lIllllIIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block174;
                                                        int[] nArray3 = new int[llIllllllI[0]];
                                                        nArray3[y.llIllllllI[1]] = llIllllllI[22];
                                                        if (!y.lIllllIIlIlII(Bank.getFirst((int[])nArray3).getQuantity(), llIllllllI[17])) break block173;
                                                    }
                                                    int[] nArray = new int[llIllllllI[0]];
                                                    nArray[y.llIllllllI[1]] = llIllllllI[23];
                                                    if (!y.lIllllIIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block175;
                                                    int[] nArray4 = new int[llIllllllI[0]];
                                                    nArray4[y.llIllllllI[1]] = llIllllllI[23];
                                                    if (!y.lIllllIIlIlII(Bank.getFirst((int[])nArray4).getQuantity(), llIllllllI[17])) break block173;
                                                }
                                                int[] nArray = new int[llIllllllI[0]];
                                                nArray[y.llIllllllI[1]] = llIllllllI[24];
                                                if (!y.lIllllIIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block176;
                                                int[] nArray5 = new int[llIllllllI[0]];
                                                nArray5[y.llIllllllI[1]] = llIllllllI[24];
                                                if (!y.lIllllIIlIlII(Bank.getFirst((int[])nArray5).getQuantity(), llIllllllI[6])) break block173;
                                            }
                                            int[] nArray = new int[llIllllllI[0]];
                                            nArray[y.llIllllllI[1]] = llIllllllI[25];
                                            if (!y.lIllllIIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block177;
                                            int[] nArray6 = new int[llIllllllI[0]];
                                            nArray6[y.llIllllllI[1]] = llIllllllI[25];
                                            if (!y.lIllllIIlIlII(Bank.getFirst((int[])nArray6).getQuantity(), llIllllllI[26])) break block173;
                                        }
                                        int[] nArray = new int[llIllllllI[0]];
                                        nArray[y.llIllllllI[1]] = llIllllllI[27];
                                        if (!y.lIllllIIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block178;
                                        int[] nArray7 = new int[llIllllllI[0]];
                                        nArray7[y.llIllllllI[1]] = llIllllllI[27];
                                        if (!y.lIllllIIlIlII(Bank.getFirst((int[])nArray7).getQuantity(), llIllllllI[28])) break block173;
                                    }
                                    int[] nArray = new int[llIllllllI[0]];
                                    nArray[y.llIllllllI[1]] = llIllllllI[29];
                                    if (!y.lIllllIIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block179;
                                    int[] nArray8 = new int[llIllllllI[0]];
                                    nArray8[y.llIllllllI[1]] = llIllllllI[29];
                                    if (!y.lIllllIIlIlII(Bank.getFirst((int[])nArray8).getQuantity(), llIllllllI[30])) break block173;
                                }
                                int[] nArray = new int[llIllllllI[0]];
                                nArray[y.llIllllllI[1]] = llIllllllI[31];
                                if (!y.lIllllIIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block180;
                                int[] nArray9 = new int[llIllllllI[0]];
                                nArray9[y.llIllllllI[1]] = llIllllllI[31];
                                if (!y.lIllllIIlIIlI(Bank.getFirst((int[])nArray9).getQuantity(), llIllllllI[32])) break block180;
                            }
                            y.Q();
                            System.out.println(llIllllIlI[llIllllllI[21]]);
                            bt = llIllllllI[0];
                            return;
                        }
                        int[] nArray = new int[llIllllllI[21]];
                        nArray[y.llIllllllI[1]] = llIllllllI[33];
                        nArray[y.llIllllllI[0]] = llIllllllI[29];
                        nArray[y.llIllllllI[4]] = llIllllllI[27];
                        nArray[y.llIllllllI[6]] = llIllllllI[31];
                        nArray[y.llIllllllI[8]] = llIllllllI[20];
                        nArray[y.llIllllllI[2]] = llIllllllI[34];
                        nArray[y.llIllllllI[11]] = llIllllllI[35];
                        nArray[y.llIllllllI[13]] = llIllllllI[22];
                        nArray[y.llIllllllI[15]] = llIllllllI[23];
                        nArray[y.llIllllllI[16]] = llIllllllI[36];
                        nArray[y.llIllllllI[17]] = llIllllllI[24];
                        nArray[y.llIllllllI[19]] = llIllllllI[37];
                        if (y.lIllllIIlIIll(e.c(nArray) ? 1 : 0)) {
                            y.Q();
                            System.out.println(llIllllIlI[llIllllllI[38]]);
                            bt = llIllllllI[0];
                            return;
                        }
                        int[] nArray10 = new int[llIllllllI[0]];
                        nArray10[y.llIllllllI[1]] = llIllllllI[27];
                        if (y.lIllllIIlIIIl(Bank.contains((int[])nArray10) ? 1 : 0)) {
                            int[] nArray11 = new int[llIllllllI[0]];
                            nArray11[y.llIllllllI[1]] = llIllllllI[27];
                            if (y.lIllllIIlIIlI(Bank.getFirst((int[])nArray11).getQuantity(), llIllllllI[28])) {
                                y.Q();
                                System.out.println(llIllllIlI[llIllllllI[39]]);
                                bt = llIllllllI[0];
                                return;
                            }
                        }
                        int[] nArray12 = new int[llIllllllI[21]];
                        nArray12[y.llIllllllI[1]] = llIllllllI[33];
                        nArray12[y.llIllllllI[0]] = llIllllllI[29];
                        nArray12[y.llIllllllI[4]] = llIllllllI[27];
                        nArray12[y.llIllllllI[6]] = llIllllllI[31];
                        nArray12[y.llIllllllI[8]] = llIllllllI[20];
                        nArray12[y.llIllllllI[2]] = llIllllllI[34];
                        nArray12[y.llIllllllI[11]] = llIllllllI[35];
                        nArray12[y.llIllllllI[13]] = llIllllllI[22];
                        nArray12[y.llIllllllI[15]] = llIllllllI[23];
                        nArray12[y.llIllllllI[16]] = llIllllllI[36];
                        nArray12[y.llIllllllI[17]] = llIllllllI[24];
                        nArray12[y.llIllllllI[19]] = llIllllllI[37];
                        if (y.lIllllIIlIIIl(e.c(nArray12) ? 1 : 0)) {
                            a.a(llIllllllI[33], llIllllllI[17]);
                            a.a(llIllllllI[29], llIllllllI[30]);
                            a.a(llIllllllI[27], llIllllllI[17]);
                            a.a(llIllllllI[31], llIllllllI[17]);
                            a.a(llIllllllI[20], llIllllllI[4]);
                            a.a(llIllllllI[34], llIllllllI[0]);
                            a.a(llIllllllI[35], llIllllllI[0]);
                            a.a(llIllllllI[22], llIllllllI[0]);
                            a.a(llIllllllI[23], llIllllllI[0]);
                            a.a(llIllllllI[36], llIllllllI[8]);
                            a.a(llIllllllI[24], llIllllllI[0]);
                            a.a(llIllllllI[37], llIllllllI[0]);
                        }
                    }
                    if (y.lIllllIIlIIIl(Inventory.contains((int[])f.ba) ? 1 : 0) && y.lIllllIIlIIlI(Movement.getRunEnergy(), llIllllllI[32])) {
                        Inventory.getFirst((int[])f.ba).interact(llIllllIlI[llIllllllI[30]]);
                        Time.sleepTicks((int)llIllllllI[0]);

                    }
                    if (y.lIllllIIlIIIl(y.an() ? 1 : 0) && y.lIllllIIlIIll(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId())) && y.lIllllIIlIlII(Skills.getLevel((Skill)Skill.CONSTRUCTION), llIllllllI[2]) && y.lIllllIIlIlII(Skills.getLevel((Skill)Skill.MINING), llIllllllI[3]) && y.lIllllIIlIlII(Skills.getLevel((Skill)Skill.THIEVING), llIllllllI[5]) && y.lIllllIIlIlII(Skills.getLevel((Skill)Skill.AGILITY), llIllllllI[7]) && y.lIllllIIlIlII(Skills.getLevel((Skill)Skill.CRAFTING), llIllllllI[9]) && y.lIllllIIlIlII(Skills.getLevel((Skill)Skill.MAGIC), llIllllllI[10]) && y.lIllllIIlIlII(Vars.getBit((int)QuestVarbits.QUEST_IN_AID_OF_THE_MYREQUE.getId()), llIllllllI[14])) {
                        String[] stringArray = new String[llIllllllI[0]];
                        stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[40]];
                        if (y.lIllllIIlIlll(NPCs.getNearest((String[])stringArray))) {
                            AccBuilderSotf.c = llIllllIlI[llIllllllI[41]];
                            if (y.lIllllIIlIIll(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llIllllllI[42], llIllllllI[43], llIllllllI[1])) ? 1 : 0)) {
                                if (y.lIllllIIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                                    Dialog.close();
                                }
                                Movement.walkTo((WorldPoint)new WorldPoint(llIllllllI[42], llIllllllI[43], llIllllllI[1]));

                                Time.sleepTicks((int)llIllllllI[0]);

                            }
                            if (y.lIllllIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llIllllllI[42], llIllllllI[43], llIllllllI[1])) ? 1 : 0)) {
                                String[] stringArray2 = new String[llIllllllI[0]];
                                stringArray2[y.llIllllllI[1]] = llIllllIlI[llIllllllI[44]];
                                TileObjects.getNearest((String[])stringArray2).interact(llIllllIlI[llIllllllI[45]]);
                                Time.sleepTicks((int)llIllllllI[4]);

                                String[] stringArray3 = new String[llIllllllI[0]];
                                stringArray3[y.llIllllllI[1]] = llIllllIlI[llIllllllI[3]];
                                TileObjects.getNearest((String[])stringArray3).interact(llIllllIlI[llIllllllI[46]]);
                                Time.sleepTicks((int)llIllllllI[4]);

                            }
                        }
                        String[] stringArray4 = new String[llIllllllI[0]];
                        stringArray4[y.llIllllllI[1]] = llIllllIlI[llIllllllI[5]];
                        if (y.lIllllIIlIlIl(NPCs.getNearest((String[])stringArray4))) {
                            AccBuilderSotf.c = llIllllIlI[llIllllllI[47]];
                            g.a(llIllllIlI[llIllllllI[48]], cE);
                        }
                    }
                    if (y.lIllllIIllIII(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[17])) {
                        AccBuilderSotf.c = llIllllIlI[llIllllllI[49]];
                        if (y.lIllllIIllIIl(Players.getLocal().getWorldLocation().distanceTo(dO), llIllllllI[30])) {
                            di = llIllllllI[1];
                            String[] stringArray = new String[llIllllllI[0]];
                            stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[7]];
                            if (y.lIllllIIlIlIl(NPCs.getNearest((String[])stringArray))) {
                                String[] stringArray5 = new String[llIllllllI[0]];
                                stringArray5[y.llIllllllI[1]] = llIllllIlI[llIllllllI[50]];
                                TileObjects.getNearest((String[])stringArray5).interact(llIllllIlI[llIllllllI[51]]);
                                Time.sleepTicks((int)llIllllllI[8]);

                            }
                            String[] stringArray6 = new String[llIllllllI[0]];
                            stringArray6[y.llIllllllI[1]] = llIllllIlI[llIllllllI[52]];
                            if (y.lIllllIIlIlll(NPCs.getNearest((String[])stringArray6))) {
                                AccBuilderSotf.c = llIllllIlI[llIllllllI[28]];
                                Movement.walkTo((WorldPoint)dO);

                                Time.sleepTicks((int)llIllllllI[0]);

                            }
                        }
                        if (y.lIllllIIllIlI(Players.getLocal().getWorldLocation().distanceTo(dO), llIllllllI[30])) {
                            AccBuilderSotf.c = llIllllIlI[llIllllllI[53]];
                            if (y.lIllllIIlIIll(Dialog.isOpen() ? 1 : 0) && y.lIllllIIlIIll(Players.getLocal().isMoving() ? 1 : 0) && y.lIllllIIllIII(Players.getLocal().getAnimation(), llIllllllI[54])) {
                                String[] stringArray = new String[llIllllllI[0]];
                                stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[9]];
                                TileObjects.getNearest((String[])stringArray).interact(llIllllIlI[llIllllllI[10]]);
                                Time.sleepTicks((int)llIllllllI[4]);

                            }
                            g.a(cE);
                        }
                    }
                    if (y.lIllllIIllIII(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[3])) {
                        AccBuilderSotf.c = llIllllIlI[llIllllllI[55]];
                        if (y.lIllllIIlIIll(Dialog.isOpen() ? 1 : 0) && y.lIllllIIlIIll(Players.getLocal().isMoving() ? 1 : 0) && y.lIllllIIllIII(Players.getLocal().getAnimation(), llIllllllI[54])) {
                            String[] stringArray = new String[llIllllllI[0]];
                            stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[56]];
                            TileObjects.getNearest((String[])stringArray).interact(llIllllIlI[llIllllllI[57]]);
                            Time.sleepTicks((int)llIllllllI[4]);

                        }
                        g.a(cE);
                    }
                    if (y.lIllllIIllIII(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[28])) {
                        String[] stringArray = new String[llIllllllI[0]];
                        stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[58]];
                        if (y.lIllllIIlIlIl(TileObjects.getNearest((String[])stringArray))) {
                            String[] stringArray7 = new String[llIllllllI[0]];
                            stringArray7[y.llIllllllI[1]] = llIllllIlI[llIllllllI[59]];
                            String[] stringArray8 = new String[llIllllllI[0]];
                            stringArray8[y.llIllllllI[1]] = llIllllIlI[llIllllllI[60]];
                            if (y.lIllllIIlIIll(TileObjects.getNearest((String[])stringArray7).hasAction(stringArray8) ? 1 : 0)) {
                                AccBuilderSotf.c = llIllllIlI[llIllllllI[12]];
                                if (y.lIllllIIlIIll(Dialog.isOpen() ? 1 : 0) && y.lIllllIIlIIll(Players.getLocal().isMoving() ? 1 : 0) && y.lIllllIIllIII(Players.getLocal().getAnimation(), llIllllllI[54])) {
                                    String[] stringArray9 = new String[llIllllllI[0]];
                                    stringArray9[y.llIllllllI[1]] = llIllllIlI[llIllllllI[61]];
                                    TileObjects.getNearest((String[])stringArray9).interact(llIllllIlI[llIllllllI[62]]);
                                    Time.sleepTicks((int)llIllllllI[4]);

                                }
                            }
                        }
                        String[] stringArray10 = new String[llIllllllI[0]];
                        stringArray10[y.llIllllllI[1]] = llIllllIlI[llIllllllI[63]];
                        if (y.lIllllIIlIlIl(TileObjects.getNearest((String[])stringArray10))) {
                            String[] stringArray11 = new String[llIllllllI[0]];
                            stringArray11[y.llIllllllI[1]] = llIllllIlI[llIllllllI[64]];
                            String[] stringArray12 = new String[llIllllllI[0]];
                            stringArray12[y.llIllllllI[1]] = llIllllIlI[llIllllllI[65]];
                            if (y.lIllllIIlIIIl(TileObjects.getNearest((String[])stringArray11).hasAction(stringArray12) ? 1 : 0)) {
                                String[] stringArray13 = new String[llIllllllI[0]];
                                stringArray13[y.llIllllllI[1]] = llIllllIlI[llIllllllI[66]];
                                TileObjects.getNearest((String[])stringArray13).interact(llIllllIlI[llIllllllI[67]]);
                                Time.sleepTicks((int)llIllllllI[8]);

                            }
                        }
                        g.a(cE);
                    }
                    if (y.lIllllIIlIlII(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[12]) && y.lIllllIIlIIlI(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[68])) {
                        y.br();
                        if (y.lIllllIIlIIIl(dW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            if (y.lIllllIIlIIll(Dialog.isOpen() ? 1 : 0)) {
                                String[] stringArray = new String[llIllllllI[0]];
                                stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[69]];
                                var30 = NPCs.getNearest((String[])stringArray);
                                if (y.lIllllIIlIlIl(var30)) {
                                    if (y.lIllllIIlIIIl(Reachable.isInteractable((Locatable)var30) ? 1 : 0)) {
                                        g.a(llIllllIlI[llIllllllI[70]], cE);
                                    }
                                    if (y.lIllllIIlIIll(Reachable.isInteractable((Locatable)var30) ? 1 : 0)) {
                                        Movement.walkTo((WorldPoint)var30.getWorldLocation());

                                        Time.sleepTicks((int)llIllllllI[0]);

                                    }
                                }
                            }
                            g.a(cE);
                        }
                    }
                    if (y.lIllllIIllIII(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[68])) {
                        if (y.lIllllIIllIIl(Players.getLocal().getWorldLocation().distanceTo(dP), llIllllllI[4])) {
                            AccBuilderSotf.c = llIllllIlI[llIllllllI[32]];
                            Movement.walkTo((WorldPoint)dP);

                            Time.sleepTicks((int)llIllllllI[0]);

                            g.a(cE);
                        }
                        if (y.lIllllIIllIlI(Players.getLocal().getWorldLocation().distanceTo(dP), llIllllllI[4])) {
                            AccBuilderSotf.c = llIllllIlI[llIllllllI[71]];
                            g.a(llIllllIlI[llIllllllI[72]], cE);
                        }
                    }
                    if (!y.lIllllIIllIll(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[73]) || y.lIllllIIllIII(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[74])) {
                        y.bq();
                    }
                    if (y.lIllllIIllIII(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[75]) && y.lIllllIIllIlI(Players.getLocal().getWorldLocation().distanceTo(dQ), llIllllllI[12])) {
                        if (y.lIllllIIllIIl(Players.getLocal().getWorldLocation().distanceTo(dQ), llIllllllI[17])) {
                            AccBuilderSotf.c = llIllllIlI[llIllllllI[76]];
                            Movement.walkTo((WorldPoint)dQ);

                            Time.sleepTicks((int)llIllllllI[0]);

                        }
                        if (y.lIllllIIllIlI(Players.getLocal().getWorldLocation().distanceTo(dQ), llIllllllI[17])) {
                            AccBuilderSotf.c = llIllllIlI[llIllllllI[77]];
                            g.a(llIllllIlI[llIllllllI[78]], cE);
                        }
                    }
                    if (!y.lIllllIIllIll(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[79]) || y.lIllllIIllIII(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[80])) {
                        if (y.lIllllIIllIlI(Players.getLocal().getWorldLocation().distanceTo(dQ), llIllllllI[12])) {
                            AccBuilderSotf.c = llIllllIlI[llIllllllI[81]];
                            int[] nArray = new int[llIllllllI[0]];
                            nArray[y.llIllllllI[1]] = llIllllllI[29];
                            if (y.lIllllIIlIIIl(Inventory.contains((int[])nArray) ? 1 : 0) && y.lIllllIIllIII(Players.getLocal().getAnimation(), llIllllllI[54])) {
                                int[] nArray13 = new int[llIllllllI[0]];
                                nArray13[y.llIllllllI[1]] = llIllllllI[29];
                                Inventory.getFirst((int[])nArray13).interact(llIllllIlI[llIllllllI[82]]);
                                Time.sleepTicks((int)llIllllllI[4]);

                            }
                        }
                        if (y.lIllllIIllIIl(Players.getLocal().getWorldLocation().distanceTo(dQ), llIllllllI[12])) {
                            String[] stringArray = new String[llIllllllI[0]];
                            stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[83]];
                            if (y.lIllllIIlIlll(NPCs.getNearest((String[])stringArray))) {
                                String[] stringArray14 = new String[llIllllllI[0]];
                                stringArray14[y.llIllllllI[1]] = llIllllIlI[llIllllllI[84]];
                                if (y.lIllllIIlIlll(NPCs.getNearest((String[])stringArray14))) {
                                    AccBuilderSotf.c = llIllllIlI[llIllllllI[68]];
                                    if (y.lIllllIIlIIll(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llIllllllI[42], llIllllllI[43], llIllllllI[1])) ? 1 : 0)) {
                                        if (y.lIllllIIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                                            Dialog.close();
                                        }
                                        Movement.walkTo((WorldPoint)new WorldPoint(llIllllllI[42], llIllllllI[43], llIllllllI[1]));

                                        Time.sleepTicks((int)llIllllllI[0]);

                                    }
                                    if (y.lIllllIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llIllllllI[42], llIllllllI[43], llIllllllI[1])) ? 1 : 0)) {
                                        String[] stringArray15 = new String[llIllllllI[0]];
                                        stringArray15[y.llIllllllI[1]] = llIllllIlI[llIllllllI[85]];
                                        TileObjects.getNearest((String[])stringArray15).interact(llIllllIlI[llIllllllI[86]]);
                                        Time.sleepTicks((int)llIllllllI[4]);

                                        String[] stringArray16 = new String[llIllllllI[0]];
                                        stringArray16[y.llIllllllI[1]] = llIllllIlI[llIllllllI[87]];
                                        TileObjects.getNearest((String[])stringArray16).interact(llIllllIlI[llIllllllI[88]]);
                                        Time.sleepTicks((int)llIllllllI[4]);

                                    }
                                }
                            }
                        }
                        String[] stringArray = new String[llIllllllI[0]];
                        stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[73]];
                        if (y.lIllllIIlIlIl(NPCs.getNearest((String[])stringArray))) {
                            AccBuilderSotf.c = llIllllIlI[llIllllllI[89]];
                            g.a(llIllllIlI[llIllllllI[90]], cE);
                        }
                    }
                    if (y.lIllllIIllIII(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[91])) {
                        if (y.lIllllIIllIIl(Players.getLocal().getWorldLocation().distanceTo(H.fZ), llIllllllI[8]) && y.lIllllIIlIIll(Dialog.isOpen() ? 1 : 0)) {
                            AccBuilderSotf.c = llIllllIlI[llIllllllI[92]];
                            String[] stringArray = new String[llIllllllI[0]];
                            stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[93]];
                            if (y.lIllllIIlIlIl(NPCs.getNearest((String[])stringArray))) {
                                int[] nArray = new int[llIllllllI[0]];
                                nArray[y.llIllllllI[1]] = llIllllllI[27];
                                Inventory.getFirst((int[])nArray).interact(llIllllIlI[llIllllllI[74]]);
                                Time.sleepTicks((int)llIllllllI[2]);

                            }
                            String[] stringArray17 = new String[llIllllllI[0]];
                            stringArray17[y.llIllllllI[1]] = llIllllIlI[llIllllllI[94]];
                            if (y.lIllllIIlIlll(NPCs.getNearest((String[])stringArray17))) {
                                String[] stringArray18 = new String[llIllllllI[0]];
                                stringArray18[y.llIllllllI[1]] = llIllllIlI[llIllllllI[95]];
                                if (y.lIllllIIlIlIl(TileObjects.getNearest((String[])stringArray18))) {
                                    String[] stringArray19 = new String[llIllllllI[0]];
                                    stringArray19[y.llIllllllI[1]] = llIllllIlI[llIllllllI[96]];
                                    TileObjects.getNearest((String[])stringArray19).interact(llIllllIlI[llIllllllI[97]]);
                                    Time.sleepTicks((int)llIllllllI[6]);

                                }
                                Movement.walkTo((WorldPoint)H.fZ);

                                Time.sleepTicks((int)llIllllllI[0]);

                            }
                        }
                        if (y.lIllllIIllIlI(Players.getLocal().getWorldLocation().distanceTo(H.fZ), llIllllllI[17])) {
                            AccBuilderSotf.c = llIllllIlI[llIllllllI[98]];
                            g.a(llIllllIlI[llIllllllI[99]], cE);
                        }
                        g.a(cE);
                    }
                    if (y.lIllllIIllIII(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[100])) {
                        if (y.lIllllIIllIIl(Players.getLocal().getWorldLocation().distanceTo(dR), llIllllllI[6])) {
                            AccBuilderSotf.c = llIllllIlI[llIllllllI[101]];
                            Movement.walkTo((WorldPoint)dR);

                            Time.sleepTicks((int)llIllllllI[0]);

                        }
                        if (y.lIllllIIllIlI(Players.getLocal().getWorldLocation().distanceTo(dR), llIllllllI[6]) && y.lIllllIIlIIll(Dialog.isOpen() ? 1 : 0)) {
                            AccBuilderSotf.c = llIllllIlI[llIllllllI[102]];
                            int[] nArray = new int[llIllllllI[0]];
                            nArray[y.llIllllllI[1]] = llIllllllI[103];
                            TileObjects.getNearest((int[])nArray).interact(llIllllIlI[llIllllllI[104]]);
                            Time.sleepTicks((int)llIllllllI[4]);

                        }
                        g.a(cE);
                    }
                    if (y.lIllllIIllIII(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[105])) {
                        if (y.lIllllIIllIIl(Players.getLocal().getWorldLocation().distanceTo(H.fZ), llIllllllI[8]) && y.lIllllIIlIIll(Dialog.isOpen() ? 1 : 0)) {
                            AccBuilderSotf.c = llIllllIlI[llIllllllI[75]];
                            if (y.lIllllIIllIlI(Players.getLocal().getWorldLocation().distanceTo(dR), llIllllllI[17])) {
                                int[] nArray = new int[llIllllllI[0]];
                                nArray[y.llIllllllI[1]] = llIllllllI[27];
                                Inventory.getFirst((int[])nArray).interact(llIllllIlI[llIllllllI[106]]);
                                Time.sleepTicks((int)llIllllllI[2]);

                            }
                            if (y.lIllllIIllIIl(Players.getLocal().getWorldLocation().distanceTo(dR), llIllllllI[17])) {
                                String[] stringArray = new String[llIllllllI[0]];
                                stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[107]];
                                if (y.lIllllIIlIlIl(TileObjects.getNearest((String[])stringArray))) {
                                    String[] stringArray20 = new String[llIllllllI[0]];
                                    stringArray20[y.llIllllllI[1]] = llIllllIlI[llIllllllI[108]];
                                    TileObjects.getNearest((String[])stringArray20).interact(llIllllIlI[llIllllllI[109]]);
                                    Time.sleepTicks((int)llIllllllI[6]);

                                }
                                Movement.walkTo((WorldPoint)H.fZ);

                                Time.sleepTicks((int)llIllllllI[0]);

                            }
                        }
                        if (y.lIllllIIllIlI(Players.getLocal().getWorldLocation().distanceTo(H.fZ), llIllllllI[17])) {
                            AccBuilderSotf.c = llIllllIlI[llIllllllI[110]];
                            g.a(llIllllIlI[llIllllllI[111]], cE);
                        }
                    }
                    if (y.lIllllIIlIlII(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[112]) && y.lIllllIIlIIlI(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[113])) {
                        if (y.lIllllIIllIIl(Players.getLocal().getWorldLocation().distanceTo(H.fS), llIllllllI[6])) {
                            AccBuilderSotf.c = llIllllIlI[llIllllllI[114]];
                            Movement.walkTo((WorldPoint)H.fS);

                            Time.sleepTicks((int)llIllllllI[0]);

                        }
                        if (y.lIllllIIllIlI(Players.getLocal().getWorldLocation().distanceTo(H.fS), llIllllllI[6])) {
                            AccBuilderSotf.c = llIllllIlI[llIllllllI[115]];
                            g.a(llIllllIlI[llIllllllI[116]], cE);
                        }
                    }
                    if (y.lIllllIIllIII(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[113])) {
                        String[] stringArray = new String[llIllllllI[0]];
                        stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[79]];
                        if (y.lIllllIIlIlll(NPCs.getNearest((String[])stringArray))) {
                            AccBuilderSotf.c = llIllllIlI[llIllllllI[117]];
                            if (y.lIllllIIlIIll(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llIllllllI[42], llIllllllI[43], llIllllllI[1])) ? 1 : 0)) {
                                if (y.lIllllIIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                                    Dialog.close();
                                }
                                Movement.walkTo((WorldPoint)new WorldPoint(llIllllllI[42], llIllllllI[43], llIllllllI[1]));

                                Time.sleepTicks((int)llIllllllI[0]);

                            }
                            if (y.lIllllIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llIllllllI[42], llIllllllI[43], llIllllllI[1])) ? 1 : 0)) {
                                String[] stringArray21 = new String[llIllllllI[0]];
                                stringArray21[y.llIllllllI[1]] = llIllllIlI[llIllllllI[118]];
                                TileObjects.getNearest((String[])stringArray21).interact(llIllllIlI[llIllllllI[119]]);
                                Time.sleepTicks((int)llIllllllI[4]);

                                String[] stringArray22 = new String[llIllllllI[0]];
                                stringArray22[y.llIllllllI[1]] = llIllllIlI[llIllllllI[120]];
                                TileObjects.getNearest((String[])stringArray22).interact(llIllllIlI[llIllllllI[121]]);
                                Time.sleepTicks((int)llIllllllI[4]);

                            }
                        }
                        String[] stringArray23 = new String[llIllllllI[0]];
                        stringArray23[y.llIllllllI[1]] = llIllllIlI[llIllllllI[122]];
                        if (y.lIllllIIlIlIl(NPCs.getNearest((String[])stringArray23))) {
                            AccBuilderSotf.c = llIllllIlI[llIllllllI[123]];
                            g.a(llIllllIlI[llIllllllI[124]], cE);
                        }
                    }
                    if (y.lIllllIIllIII(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[125])) {
                        if (y.lIllllIIllIIl(Players.getLocal().getWorldLocation().distanceTo(dO), llIllllllI[30])) {
                            String[] stringArray = new String[llIllllllI[0]];
                            stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[126]];
                            if (y.lIllllIIlIlIl(NPCs.getNearest((String[])stringArray))) {
                                String[] stringArray24 = new String[llIllllllI[0]];
                                stringArray24[y.llIllllllI[1]] = llIllllIlI[llIllllllI[80]];
                                TileObjects.getNearest((String[])stringArray24).interact(llIllllIlI[llIllllllI[127]]);
                                Time.sleepTicks((int)llIllllllI[8]);

                            }
                            String[] stringArray25 = new String[llIllllllI[0]];
                            stringArray25[y.llIllllllI[1]] = llIllllIlI[llIllllllI[128]];
                            if (y.lIllllIIlIlll(NPCs.getNearest((String[])stringArray25)) && y.lIllllIIlIIIl(dX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && y.lIllllIIlIIll(Dialog.isOpen() ? 1 : 0)) {
                                AccBuilderSotf.c = llIllllIlI[llIllllllI[129]];
                                Movement.walkTo((WorldPoint)dO);

                                Time.sleepTicks((int)llIllllllI[0]);

                            }
                        }
                        if (y.lIllllIIllIlI(Players.getLocal().getWorldLocation().distanceTo(dO), llIllllllI[30])) {
                            if (y.lIllllIIlIIll(Dialog.isOpen() ? 1 : 0) && y.lIllllIIlIIll(Players.getLocal().isMoving() ? 1 : 0) && y.lIllllIIllIII(Players.getLocal().getAnimation(), llIllllllI[54])) {
                                String[] stringArray = new String[llIllllllI[0]];
                                stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[130]];
                                TileObjects.getNearest((String[])stringArray).interact(llIllllIlI[llIllllllI[131]]);
                                Time.sleepTicks((int)llIllllllI[4]);

                            }
                            g.a(cE);
                        }
                        if (!y.lIllllIIllIIl(Players.getLocal().getWorldLocation().distanceTo(dV), llIllllllI[28]) || y.lIllllIIlIIIl(new WorldArea(llIllllllI[132], llIllllllI[133], llIllllllI[13], llIllllllI[21], llIllllllI[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderSotf.c = llIllllIlI[llIllllllI[134]];
                            if (y.lIllllIIlIIll(dW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                y.br();
                            }
                        }
                        if (y.lIllllIIllIlI(Players.getLocal().getWorldLocation().distanceTo(dQ), llIllllllI[12])) {
                            if (y.lIllllIIllIIl(Players.getLocal().getWorldLocation().distanceTo(dQ), llIllllllI[17])) {
                                AccBuilderSotf.c = llIllllIlI[llIllllllI[135]];
                                Movement.walkTo((WorldPoint)dQ);

                                Time.sleepTicks((int)llIllllllI[0]);

                            }
                            if (y.lIllllIIllIlI(Players.getLocal().getWorldLocation().distanceTo(dQ), llIllllllI[17])) {
                                AccBuilderSotf.c = llIllllIlI[llIllllllI[136]];
                                g.a(llIllllIlI[llIllllllI[137]], cE);
                            }
                        }
                        y.bq();
                    }
                    if (y.lIllllIIllIII(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[138])) {
                        g.a(cE);
                        if (y.lIllllIIlIIll(Dialog.isOpen() ? 1 : 0)) {
                            y.bo();
                        }
                    }
                    if (y.lIllllIIllIII(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[139])) {
                        g.a(cE);
                    }
                    if (y.lIllllIIllIII(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[140])) {
                        if (y.lIllllIIllIIl(Players.getLocal().getWorldLocation().distanceTo(dS), llIllllllI[6])) {
                            AccBuilderSotf.c = llIllllIlI[llIllllllI[91]];
                            Movement.walkTo((WorldPoint)dS);

                            Time.sleepTicks((int)llIllllllI[0]);

                        }
                        if (y.lIllllIIllIlI(Players.getLocal().getWorldLocation().distanceTo(dS), llIllllllI[6])) {
                            AccBuilderSotf.c = llIllllIlI[llIllllllI[141]];
                            int[] nArray = new int[llIllllllI[0]];
                            nArray[y.llIllllllI[1]] = llIllllllI[142];
                            int[] nArray14 = new int[llIllllllI[0]];
                            nArray14[y.llIllllllI[1]] = llIllllllI[143];
                            Inventory.getFirst((int[])nArray).useOn(Inventory.getFirst((int[])nArray14));
                            Time.sleepTicks((int)llIllllllI[2]);

                        }
                    }
                    if (y.lIllllIIllIII(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[144])) {
                        if (y.lIllllIIllIIl(Players.getLocal().getWorldLocation().distanceTo(dT), llIllllllI[6])) {
                            AccBuilderSotf.c = llIllllIlI[llIllllllI[145]];
                            Movement.walkTo((WorldPoint)dT);

                            Time.sleepTicks((int)llIllllllI[0]);

                        }
                        if (y.lIllllIIllIlI(Players.getLocal().getWorldLocation().distanceTo(dT), llIllllllI[6]) && y.lIllllIIlIIll(Dialog.isOpen() ? 1 : 0)) {
                            AccBuilderSotf.c = llIllllIlI[llIllllllI[146]];
                            int[] nArray = new int[llIllllllI[0]];
                            nArray[y.llIllllllI[1]] = llIllllllI[142];
                            int[] nArray15 = new int[llIllllllI[0]];
                            nArray15[y.llIllllllI[1]] = llIllllllI[143];
                            Inventory.getFirst((int[])nArray).useOn(Inventory.getFirst((int[])nArray15));
                            Time.sleepTicks((int)llIllllllI[2]);

                        }
                        g.a(cE);
                    }
                    if (y.lIllllIIllIII(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[147])) {
                        if (y.lIllllIIllIIl(Players.getLocal().getWorldLocation().distanceTo(dU), llIllllllI[6]) && y.lIllllIIlIIll(Dialog.isOpen() ? 1 : 0)) {
                            AccBuilderSotf.c = llIllllIlI[llIllllllI[148]];
                            Movement.walkTo((WorldPoint)dU);

                            Time.sleepTicks((int)llIllllllI[0]);

                        }
                        if (y.lIllllIIllIlI(Players.getLocal().getWorldLocation().distanceTo(dU), llIllllllI[6]) && y.lIllllIIlIIll(Dialog.isOpen() ? 1 : 0)) {
                            if (y.lIllllIIlIIlI(Prayers.getPoints(), llIllllllI[49]) && y.lIllllIIlIIIl(Inventory.contains((int[])f.aX) ? 1 : 0)) {
                                Inventory.getFirst((int[])f.aX).interact(llIllllIlI[llIllllllI[149]]);
                                Time.sleepTicks((int)llIllllllI[0]);

                            }
                            if (y.lIllllIIlIIll(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                            }
                            if (y.lIllllIIlIIIl(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                AccBuilderSotf.c = llIllllIlI[llIllllllI[150]];
                                int[] nArray = new int[llIllllllI[0]];
                                nArray[y.llIllllllI[1]] = llIllllllI[142];
                                int[] nArray16 = new int[llIllllllI[0]];
                                nArray16[y.llIllllllI[1]] = llIllllllI[143];
                                Inventory.getFirst((int[])nArray).useOn(Inventory.getFirst((int[])nArray16));
                                Time.sleepTicks((int)llIllllllI[2]);

                            }
                        }
                        g.a(cE);
                    }
                    if (y.lIllllIIllIII(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[151]) && y.lIllllIIlIIll(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                        Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                    }
                    if (y.lIllllIIllIII(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[152])) {
                        // empty if block
                    }
                    if (!y.lIllllIIllIll(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[153]) || y.lIllllIIllIII(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[154])) {
                        String[] stringArray = new String[llIllllllI[0]];
                        stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[155]];
                        if (y.lIllllIIlIIll(Inventory.contains((String[])stringArray) ? 1 : 0) && y.lIllllIIllIIl(Players.getLocal().getWorldLocation().distanceTo(dQ), llIllllllI[28])) {
                            if (y.lIllllIIllIIl(Players.getLocal().getWorldLocation().distanceTo(dU), llIllllllI[6]) && y.lIllllIIlIIll(Dialog.isOpen() ? 1 : 0)) {
                                AccBuilderSotf.c = llIllllIlI[llIllllllI[156]];
                                Movement.walkTo((WorldPoint)dU);

                                Time.sleepTicks((int)llIllllllI[0]);

                            }
                            if (y.lIllllIIllIlI(Players.getLocal().getWorldLocation().distanceTo(dU), llIllllllI[6]) && y.lIllllIIlIIll(Dialog.isOpen() ? 1 : 0)) {
                                if (y.lIllllIIlIIll(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                    Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                                }
                                if (y.lIllllIIlIIIl(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                    AccBuilderSotf.c = llIllllIlI[llIllllllI[157]];
                                    int[] nArray = new int[llIllllllI[0]];
                                    nArray[y.llIllllllI[1]] = llIllllllI[142];
                                    int[] nArray17 = new int[llIllllllI[0]];
                                    nArray17[y.llIllllllI[1]] = llIllllllI[143];
                                    Inventory.getFirst((int[])nArray).useOn(Inventory.getFirst((int[])nArray17));
                                    Time.sleepTicks((int)llIllllllI[2]);

                                }
                            }
                        }
                        String[] stringArray26 = new String[llIllllllI[0]];
                        stringArray26[y.llIllllllI[1]] = llIllllIlI[llIllllllI[100]];
                        if (y.lIllllIIlIIIl(Inventory.contains((String[])stringArray26) ? 1 : 0)) {
                            if (y.lIllllIIllIlI(Players.getLocal().getWorldLocation().distanceTo(dU), llIllllllI[30])) {
                                int[] nArray = new int[llIllllllI[0]];
                                nArray[y.llIllllllI[1]] = llIllllllI[29];
                                Inventory.getFirst((int[])nArray).interact(llIllllIlI[llIllllllI[158]]);
                                Time.sleepTicks((int)llIllllllI[2]);

                            }
                            if (y.lIllllIIlIIIl(dZ.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && y.lIllllIIllIIl(Players.getLocal().getWorldLocation().distanceTo(dO), llIllllllI[30])) {
                                if (y.lIllllIIlIIIl(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                    Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                                }
                                AccBuilderSotf.c = llIllllIlI[llIllllllI[159]];
                                Movement.walkTo((WorldPoint)dO);

                                Time.sleepTicks((int)llIllllllI[0]);

                            }
                            String[] stringArray27 = new String[llIllllllI[0]];
                            stringArray27[y.llIllllllI[1]] = llIllllIlI[llIllllllI[160]];
                            if (y.lIllllIIlIlll(NPCs.getNearest((String[])stringArray27)) && y.lIllllIIlIIIl(dX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && y.lIllllIIlIIll(Dialog.isOpen() ? 1 : 0) && y.lIllllIIllIIl(Players.getLocal().getWorldLocation().distanceTo(dO), llIllllllI[30])) {
                                AccBuilderSotf.c = llIllllIlI[llIllllllI[161]];
                                Movement.walkTo((WorldPoint)dO);

                                Time.sleepTicks((int)llIllllllI[0]);

                            }
                            if (y.lIllllIIllIlI(Players.getLocal().getWorldLocation().distanceTo(dO), llIllllllI[30])) {
                                if (y.lIllllIIlIIll(Dialog.isOpen() ? 1 : 0) && y.lIllllIIlIIll(Players.getLocal().isMoving() ? 1 : 0) && y.lIllllIIllIII(Players.getLocal().getAnimation(), llIllllllI[54])) {
                                    String[] stringArray28 = new String[llIllllllI[0]];
                                    stringArray28[y.llIllllllI[1]] = llIllllIlI[llIllllllI[162]];
                                    TileObjects.getNearest((String[])stringArray28).interact(llIllllIlI[llIllllllI[163]]);
                                    Time.sleepTicks((int)llIllllllI[4]);

                                }
                                g.a(cE);
                            }
                            if (!y.lIllllIIllIIl(Players.getLocal().getWorldLocation().distanceTo(dV), llIllllllI[28]) || y.lIllllIIlIIIl(new WorldArea(llIllllllI[132], llIllllllI[133], llIllllllI[13], llIllllllI[21], llIllllllI[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderSotf.c = llIllllIlI[llIllllllI[164]];
                                if (y.lIllllIIlIIll(dW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    y.br();
                                }
                            }
                            if (y.lIllllIIllIlI(Players.getLocal().getWorldLocation().distanceTo(dQ), llIllllllI[12])) {
                                if (y.lIllllIIllIIl(Players.getLocal().getWorldLocation().distanceTo(dQ), llIllllllI[17])) {
                                    AccBuilderSotf.c = llIllllIlI[llIllllllI[165]];
                                    Movement.walkTo((WorldPoint)dQ);

                                    Time.sleepTicks((int)llIllllllI[0]);

                                }
                                if (y.lIllllIIllIlI(Players.getLocal().getWorldLocation().distanceTo(dQ), llIllllllI[17])) {
                                    AccBuilderSotf.c = llIllllIlI[llIllllllI[166]];
                                    g.a(llIllllIlI[llIllllllI[105]], cE);
                                }
                            }
                            y.bq();
                        }
                    }
                    if (!y.lIllllIIllIll(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[167]) || !y.lIllllIIllIll(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[168]) || y.lIllllIIllIII(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[169])) {
                        y.bn();
                    }
                    if (y.lIllllIIllIII(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[26])) {
                        int[] nArray = new int[llIllllllI[0]];
                        nArray[y.llIllllllI[1]] = llIllllllI[170];
                        if (y.lIllllIIlIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            var30 = new WorldArea(llIllllllI[171], llIllllllI[172], llIllllllI[4], llIllllllI[13], llIllllllI[1]);
                            if (y.lIllllIIlIIIl(var30.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderSotf.c = llIllllIlI[llIllllllI[173]];
                                String[] stringArray = new String[llIllllllI[0]];
                                stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[174]];
                                TileObjects.getNearest((String[])stringArray).interact(llIllllIlI[llIllllllI[175]]);
                                Time.sleepTicks((int)llIllllllI[8]);

                            }
                            String[] stringArray = new String[llIllllllI[0]];
                            stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[176]];
                            if (y.lIllllIIlIlIl(TileObjects.getNearest((String[])stringArray))) {
                                var29 = new WorldPoint(llIllllllI[177], llIllllllI[178], llIllllllI[1]);
                                if (y.lIllllIIllIIl(Players.getLocal().getWorldLocation().distanceTo(var29), llIllllllI[4])) {
                                    AccBuilderSotf.c = llIllllIlI[llIllllllI[179]];
                                    Movement.walkTo((WorldPoint)var29);

                                    Time.sleepTicks((int)llIllllllI[0]);

                                }
                                if (y.lIllllIIllIlI(Players.getLocal().getWorldLocation().distanceTo(var29), llIllllllI[4])) {
                                    AccBuilderSotf.c = llIllllIlI[llIllllllI[180]];
                                    int[] nArray18 = new int[llIllllllI[0]];
                                    nArray18[y.llIllllllI[1]] = llIllllllI[170];
                                    Magic.cast((Spell)SpellBook.Standard.TELEKINETIC_GRAB, (TileItem)TileItems.getNearest((int[])nArray18));
                                    Time.sleepTicks((int)llIllllllI[11]);

                                }
                            }
                        }
                        int[] nArray19 = new int[llIllllllI[0]];
                        nArray19[y.llIllllllI[1]] = llIllllllI[170];
                        if (y.lIllllIIlIIIl(Inventory.contains((int[])nArray19) ? 1 : 0)) {
                            y.bm();
                            if (y.lIllllIIllIIl(Players.getLocal().getWorldLocation().distanceTo(dQ), llIllllllI[13]) && y.lIllllIIllIlI(Players.getLocal().getWorldLocation().distanceTo(dQ), llIllllllI[12])) {
                                AccBuilderSotf.c = llIllllIlI[llIllllllI[181]];
                                Movement.walkTo((WorldPoint)dQ);

                                Time.sleepTicks((int)llIllllllI[0]);

                            }
                            if (y.lIllllIIllIlI(Players.getLocal().getWorldLocation().distanceTo(dQ), llIllllllI[17])) {
                                AccBuilderSotf.c = llIllllIlI[llIllllllI[182]];
                                g.a(llIllllIlI[llIllllllI[183]], cE);
                            }
                        }
                    }
                    if (y.lIllllIIllIII(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[184])) {
                        if (y.lIllllIIllIlI(Players.getLocal().getWorldLocation().distanceTo(dQ), llIllllllI[30])) {
                            int[] nArray = new int[llIllllllI[0]];
                            nArray[y.llIllllllI[1]] = llIllllllI[29];
                            Inventory.getFirst((int[])nArray).interact(llIllllIlI[llIllllllI[112]]);
                            Time.sleepTicks((int)llIllllllI[2]);

                        }
                        String[] stringArray = new String[llIllllllI[0]];
                        stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[185]];
                        if (y.lIllllIIlIlll(NPCs.getNearest((String[])stringArray)) && y.lIllllIIllIIl(Players.getLocal().getWorldLocation().distanceTo(dQ), llIllllllI[28])) {
                            AccBuilderSotf.c = llIllllIlI[llIllllllI[186]];
                            if (y.lIllllIIlIIll(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llIllllllI[42], llIllllllI[43], llIllllllI[1])) ? 1 : 0)) {
                                if (y.lIllllIIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                                    Dialog.close();
                                }
                                Movement.walkTo((WorldPoint)new WorldPoint(llIllllllI[42], llIllllllI[43], llIllllllI[1]));

                                Time.sleepTicks((int)llIllllllI[0]);

                            }
                            if (y.lIllllIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llIllllllI[42], llIllllllI[43], llIllllllI[1])) ? 1 : 0)) {
                                String[] stringArray29 = new String[llIllllllI[0]];
                                stringArray29[y.llIllllllI[1]] = llIllllIlI[llIllllllI[187]];
                                TileObjects.getNearest((String[])stringArray29).interact(llIllllIlI[llIllllllI[188]]);
                                Time.sleepTicks((int)llIllllllI[4]);

                                String[] stringArray30 = new String[llIllllllI[0]];
                                stringArray30[y.llIllllllI[1]] = llIllllIlI[llIllllllI[189]];
                                TileObjects.getNearest((String[])stringArray30).interact(llIllllIlI[llIllllllI[190]]);
                                Time.sleepTicks((int)llIllllllI[4]);

                            }
                        }
                        String[] stringArray31 = new String[llIllllllI[0]];
                        stringArray31[y.llIllllllI[1]] = llIllllIlI[llIllllllI[191]];
                        if (y.lIllllIIlIlIl(NPCs.getNearest((String[])stringArray31))) {
                            AccBuilderSotf.c = llIllllIlI[llIllllllI[192]];
                            g.a(llIllllIlI[llIllllllI[193]], cE);
                        }
                    }
                    if (!y.lIllllIIllIII(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[194])) break block181;
                    String[] stringArray = new String[llIllllllI[0]];
                    stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[195]];
                    if (!y.lIllllIIlIIll(Inventory.contains((String[])stringArray) ? 1 : 0)) break block182;
                    String[] stringArray32 = new String[llIllllllI[0]];
                    stringArray32[y.llIllllllI[1]] = llIllllIlI[llIllllllI[196]];
                    if (!y.lIllllIIlIIll(Inventory.contains((String[])stringArray32) ? 1 : 0)) break block182;
                    String[] stringArray33 = new String[llIllllllI[0]];
                    stringArray33[y.llIllllllI[1]] = llIllllIlI[llIllllllI[197]];
                    if (!y.lIllllIIlIIIl(Inventory.contains((String[])stringArray33) ? 1 : 0)) break block181;
                }
                if (y.lIllllIIlIIlI(di, llIllllllI[0])) {
                    aN.rU += llIllllllI[0];
                    aN.u(AccBuilderSotf.m);
                    di += llIllllllI[0];
                    aN.rU = llIllllllI[1];
                    dj = llIllllllI[1];
                }
                if (y.lIllllIIlIlIl(Widgets.get((int)llIllllllI[152]))) {
                    AccBuilderSotf.c = llIllllIlI[llIllllllI[198]];
                    String[] stringArray = new String[llIllllllI[0]];
                    stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[199]];
                    if (y.lIllllIIlIIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        String[] stringArray34 = new String[llIllllllI[0]];
                        stringArray34[y.llIllllllI[1]] = llIllllIlI[llIllllllI[200]];
                        Inventory.getFirst((String[])stringArray34).interact(llIllllIlI[llIllllllI[201]]);
                        Time.sleepTicks((int)llIllllllI[8]);

                    }
                    String[] stringArray35 = new String[llIllllllI[0]];
                    stringArray35[y.llIllllllI[1]] = llIllllIlI[llIllllllI[202]];
                    if (y.lIllllIIlIIIl(Inventory.contains((String[])stringArray35) ? 1 : 0)) {
                        String[] stringArray36 = new String[llIllllllI[0]];
                        stringArray36[y.llIllllllI[1]] = llIllllIlI[llIllllllI[203]];
                        Inventory.getFirst((String[])stringArray36).interact(llIllllIlI[llIllllllI[204]]);
                        Time.sleepTicks((int)llIllllllI[8]);

                    }
                    String[] stringArray37 = new String[llIllllllI[0]];
                    stringArray37[y.llIllllllI[1]] = llIllllIlI[llIllllllI[205]];
                    if (y.lIllllIIlIIIl(Inventory.contains((String[])stringArray37) ? 1 : 0)) {
                        String[] stringArray38 = new String[llIllllllI[0]];
                        stringArray38[y.llIllllllI[1]] = llIllllIlI[llIllllllI[206]];
                        Inventory.getFirst((String[])stringArray38).interact(llIllllIlI[llIllllllI[207]]);
                        Time.sleepTicks((int)llIllllllI[8]);

                    }
                    AccBuilderSotf.c = llIllllIlI[llIllllllI[208]];
                    var30 = Widgets.get((int)llIllllllI[152], (int)llIllllllI[16]);
                    if (y.lIllllIIlIlIl(var30)) {
                        var30.interact(llIllllIlI[llIllllllI[209]]);
                        Time.sleepTicks((int)llIllllllI[0]);

                    }
                    if (y.lIllllIIlIlIl(var29 = Widgets.get((int)llIllllllI[152], (int)llIllllllI[7]))) {
                        var29.interact(llIllllIlI[llIllllllI[210]]);
                        Time.sleepTicks((int)llIllllllI[4]);

                    }
                }
                Time.sleepTicks((int)llIllllllI[4]);

            }
            if (y.lIllllIIllIII(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[194])) {
                String[] stringArray = new String[llIllllllI[0]];
                stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[211]];
                if (y.lIllllIIlIIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray39 = new String[llIllllllI[0]];
                    stringArray39[y.llIllllllI[1]] = llIllllIlI[llIllllllI[212]];
                    if (y.lIllllIIlIIll(Inventory.contains((String[])stringArray39) ? 1 : 0)) {
                        String[] stringArray40 = new String[llIllllllI[0]];
                        stringArray40[y.llIllllllI[1]] = llIllllIlI[llIllllllI[213]];
                        if (y.lIllllIIlIIll(Inventory.contains((String[])stringArray40) ? 1 : 0)) {
                            String[] stringArray41 = new String[llIllllllI[0]];
                            stringArray41[y.llIllllllI[1]] = llIllllIlI[llIllllllI[214]];
                            if (!y.lIllllIIlIlll(NPCs.getNearest((String[])stringArray41)) || y.lIllllIIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                                if (y.lIllllIIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                                    Dialog.close();
                                }
                                int[] nArray = new int[llIllllllI[0]];
                                nArray[y.llIllllllI[1]] = llIllllllI[33];
                                if (y.lIllllIIlIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                    String[] stringArray42 = new String[llIllllllI[0]];
                                    stringArray42[y.llIllllllI[1]] = llIllllIlI[llIllllllI[113]];
                                    if (y.lIllllIIlIlIl(NPCs.getNearest((String[])stringArray42))) {
                                        int[] nArray20 = new int[llIllllllI[0]];
                                        nArray20[y.llIllllllI[1]] = llIllllllI[33];
                                        Inventory.getFirst((int[])nArray20).interact(llIllllIlI[llIllllllI[215]]);
                                        Time.sleepTicks((int)llIllllllI[11]);

                                    }
                                }
                            }
                        }
                    }
                }
            }
            g.a(cE);
        }
    }

    private static boolean lIllllIIlIlll(Object object) {
        return object == null;
    }

    private static boolean lIllllIIlIlII(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * WARNING - void declaration
     */
    public static void bn() {
        TileObject var31;
        WorldArea var32;
        void var33;
        WorldArea worldArea = new WorldArea(llIllllllI[226], llIllllllI[239], llIllllllI[2], llIllllllI[2], llIllllllI[1]);
        WorldPoint worldPoint = new WorldPoint(llIllllllI[240], llIllllllI[241], llIllllllI[1]);
        if (y.lIllllIIllIlI(Players.getLocal().getWorldLocation().distanceTo(dQ), llIllllllI[12])) {
            void var34;
            if (y.lIllllIIllIIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint), llIllllllI[2])) {
                AccBuilderSotf.c = llIllllIlI[llIllllllI[242]];
                Movement.walkTo((WorldPoint)worldPoint);

                Time.sleepTicks((int)llIllllllI[0]);

            }
            if (y.lIllllIIllIlI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var34), llIllllllI[2])) {
                AccBuilderSotf.c = llIllllIlI[llIllllllI[243]];
                String[] stringArray = new String[llIllllllI[0]];
                stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[244]];
                TileObjects.getNearest((String[])stringArray).interact(llIllllIlI[llIllllllI[245]]);
                Time.sleepTicks((int)llIllllllI[8]);

            }
        }
        if (y.lIllllIIlIIIl(var33.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[246]];
            String[] stringArray = new String[llIllllllI[0]];
            stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[247]];
            TileObjects.getNearest((String[])stringArray).interact(llIllllIlI[llIllllllI[138]]);
            Time.sleepTicks((int)llIllllllI[6]);

        }
        if (y.lIllllIIlIIIl((var32 = new WorldArea(llIllllllI[226], llIllllllI[227], llIllllllI[11], llIllllllI[11], llIllllllI[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[248]];
            String[] stringArray = new String[llIllllllI[0]];
            stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[249]];
            TileObjects.getNearest((String[])stringArray).interact(llIllllIlI[llIllllllI[250]]);
            Time.sleepTicks((int)llIllllllI[6]);

        }
        WorldArea var35 = new WorldArea(llIllllllI[177], llIllllllI[251], llIllllllI[11], llIllllllI[2], llIllllllI[0]);
        WorldArea var36 = new WorldArea(llIllllllI[223], llIllllllI[252], llIllllllI[2], llIllllllI[13], llIllllllI[0]);
        WorldPoint var37 = new WorldPoint(llIllllllI[226], llIllllllI[253], llIllllllI[0]);
        if (y.lIllllIIlIIIl(var36.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (y.lIllllIIlIIll(Players.getLocal().getWorldLocation().equals((Object)var37) ? 1 : 0)) {
                AccBuilderSotf.c = llIllllIlI[llIllllllI[254]];
                Movement.walkTo((WorldPoint)var37);

            }
            if (y.lIllllIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)var37) ? 1 : 0)) {
                int[] nArray = new int[llIllllllI[0]];
                nArray[y.llIllllllI[1]] = llIllllllI[255];
                TileObjects.getNearest((int[])nArray).interact(llIllllIlI[llIllllllI[139]]);
                Time.sleepTicks((int)llIllllllI[6]);

            }
        }
        if (y.lIllllIIlIIIl(var35.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[256]];
            String[] stringArray = new String[llIllllllI[0]];
            stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[257]];
            TileObjects.getNearest((String[])stringArray).interact(llIllllIlI[llIllllllI[258]]);
            Time.sleepTicks((int)llIllllllI[6]);

        }
        WorldArea var38 = new WorldArea(llIllllllI[216], llIllllllI[217], llIllllllI[51], llIllllllI[68], llIllllllI[1]);
        WorldArea var39 = new WorldArea(llIllllllI[218], llIllllllI[219], llIllllllI[11], llIllllllI[8], llIllllllI[1]);
        WorldPoint var40 = new WorldPoint(llIllllllI[220], llIllllllI[172], llIllllllI[1]);
        WorldArea var41 = new WorldArea(llIllllllI[223], llIllllllI[224], llIllllllI[13], llIllllllI[11], llIllllllI[1]);
        WorldArea var42 = new WorldArea(llIllllllI[225], llIllllllI[172], llIllllllI[6], llIllllllI[8], llIllllllI[1]);
        WorldArea var43 = new WorldArea(llIllllllI[171], llIllllllI[172], llIllllllI[4], llIllllllI[13], llIllllllI[1]);
        if (y.lIllllIIlIIll(var39.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && y.lIllllIIlIIIl(var38.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && y.lIllllIIlIIll(var32.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && y.lIllllIIlIIll(var41.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && y.lIllllIIlIIll(var42.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && y.lIllllIIlIIll(var43.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[259]];
            Movement.walkTo((WorldPoint)var40);

            Time.sleepTicks((int)llIllllllI[0]);

        }
        if (y.lIllllIIlIIIl(var39.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[140]];
            String[] stringArray = new String[llIllllllI[0]];
            stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[260]];
            var31 = TileObjects.getNearest((String[])stringArray);
            if (y.lIllllIIllIII(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[167]) && y.lIllllIIlIlIl(var31)) {
                int[] nArray = new int[llIllllllI[0]];
                nArray[y.llIllllllI[1]] = llIllllllI[35];
                Inventory.getFirst((int[])nArray).useOn(var31);
                Time.sleepTicks((int)llIllllllI[6]);

            }
            if (y.lIllllIIllIII(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[168])) {
                String[] stringArray2 = new String[llIllllllI[0]];
                stringArray2[y.llIllllllI[1]] = llIllllIlI[llIllllllI[261]];
                if (y.lIllllIIlIlIl(TileObjects.getNearest((String[])stringArray2))) {
                    String[] stringArray3 = new String[llIllllllI[0]];
                    stringArray3[y.llIllllllI[1]] = llIllllIlI[llIllllllI[262]];
                    TileObjects.getNearest((String[])stringArray3).interact(llIllllIlI[llIllllllI[263]]);
                    Time.sleepTicks((int)llIllllllI[6]);

                }
            }
        }
        if (y.lIllllIIllIII(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[168]) && (!y.lIllllIIlIIll(var41.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || y.lIllllIIlIIIl(var42.contains(Players.getLocal().getWorldLocation()) ? 1 : 0))) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[264]];
            String[] stringArray = new String[llIllllllI[0]];
            stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[265]];
            String[] stringArray4 = new String[llIllllllI[0]];
            stringArray4[y.llIllllllI[1]] = llIllllIlI[llIllllllI[266]];
            Inventory.getFirst((String[])stringArray).useOn(TileObjects.getNearest((String[])stringArray4));
            Time.sleepTicks((int)llIllllllI[6]);

        }
        if (y.lIllllIIllIII(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[169])) {
            var31 = new WorldPoint(llIllllllI[267], llIllllllI[268], llIllllllI[1]);
            if (y.lIllllIIlIIll(var43.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderSotf.c = llIllllIlI[llIllllllI[269]];
                Movement.walkTo((WorldPoint)var31);

                Time.sleepTicks((int)llIllllllI[0]);

            }
            if (y.lIllllIIlIIIl(var43.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderSotf.c = llIllllIlI[llIllllllI[270]];
                String[] stringArray = new String[llIllllllI[0]];
                stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[144]];
                TileObjects.getNearest((String[])stringArray).interact(llIllllIlI[llIllllllI[271]]);
                Time.sleepTicks((int)llIllllllI[8]);

            }
        }
        if (y.lIllllIIllIII(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[26]) && y.lIllllIIlIIIl(var43.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[272]];
            String[] stringArray = new String[llIllllllI[0]];
            stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[273]];
            TileObjects.getNearest((String[])stringArray).interact(llIllllIlI[llIllllllI[274]]);
            Time.sleepTicks((int)llIllllllI[8]);

        }
    }

    @Override
    public boolean ae() {
        return llIllllllI[1];
    }

    public static void bp() {
        String[] stringArray = new String[llIllllllI[0]];
        stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[341]];
        if (y.lIllllIIlIlll(NPCs.getNearest((String[])stringArray)) && y.lIllllIIlIIll(Dialog.isOpen() ? 1 : 0) && y.lIllllIIllIIl(Players.getLocal().getWorldLocation().distanceTo(dO), llIllllllI[30]) && y.lIllllIIllIIl(Players.getLocal().getWorldLocation().distanceTo(dV), llIllllllI[65])) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[342]];
            Movement.walkTo((WorldPoint)dO);

            Time.sleepTicks((int)llIllllllI[0]);

        }
        if (y.lIllllIIllIlI(Players.getLocal().getWorldLocation().distanceTo(dO), llIllllllI[30])) {
            if (y.lIllllIIlIIll(Dialog.isOpen() ? 1 : 0) && y.lIllllIIlIIll(Players.getLocal().isMoving() ? 1 : 0) && y.lIllllIIllIII(Players.getLocal().getAnimation(), llIllllllI[54])) {
                String[] stringArray2 = new String[llIllllllI[0]];
                stringArray2[y.llIllllllI[1]] = llIllllIlI[llIllllllI[343]];
                TileObjects.getNearest((String[])stringArray2).interact(llIllllIlI[llIllllllI[344]]);
                Time.sleepTicks((int)llIllllllI[4]);

            }
            g.a(cE);
        }
        if (!y.lIllllIIllIIl(Players.getLocal().getWorldLocation().distanceTo(dV), llIllllllI[28]) || y.lIllllIIlIIIl(new WorldArea(llIllllllI[132], llIllllllI[133], llIllllllI[13], llIllllllI[21], llIllllllI[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[345]];
            if (y.lIllllIIlIIll(dW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                y.br();
            }
        }
    }

    private static void Q() {
        block53: {
            d var44;
            block52: {
                block51: {
                    block50: {
                        Object var45;
                        block49: {
                            block48: {
                                block47: {
                                    block46: {
                                        block45: {
                                            block44: {
                                                block43: {
                                                    block42: {
                                                        block41: {
                                                            block40: {
                                                                block39: {
                                                                    block38: {
                                                                        block37: {
                                                                            block36: {
                                                                                block35: {
                                                                                    block34: {
                                                                                        int[] nArray = new int[llIllllllI[0]];
                                                                                        nArray[y.llIllllllI[1]] = llIllllllI[37];
                                                                                        if (y.lIllllIIlIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                                                                                            d d2 = new DHelper(llIllllllI[37], llIllllllI[0], llIllllllI[579]);
                                                                                            bv.add(d2);

                                                                                        }
                                                                                        int[] nArray2 = new int[llIllllllI[0]];
                                                                                        nArray2[y.llIllllllI[1]] = llIllllllI[34];
                                                                                        if (y.lIllllIIlIIll(Bank.contains((int[])nArray2) ? 1 : 0)) {
                                                                                            var45 = new DHelper(llIllllllI[34], llIllllllI[0], llIllllllI[580]);
                                                                                            bv.add((DHelper) ar45);

                                                                                        }
                                                                                        int[] nArray3 = new int[llIllllllI[0]];
                                                                                        nArray3[y.llIllllllI[1]] = llIllllllI[35];
                                                                                        if (y.lIllllIIlIIll(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                                                                            var45 = new DHelper(llIllllllI[35], llIllllllI[0], llIllllllI[580]);
                                                                                            bv.add((DHelper) ar45);

                                                                                        }
                                                                                        int[] nArray4 = new int[llIllllllI[0]];
                                                                                        nArray4[y.llIllllllI[1]] = llIllllllI[22];
                                                                                        if (!y.lIllllIIlIIIl(Bank.contains((int[])nArray4) ? 1 : 0)) break block34;
                                                                                        int[] nArray5 = new int[llIllllllI[0]];
                                                                                        nArray5[y.llIllllllI[1]] = llIllllllI[22];
                                                                                        if (!y.lIllllIIlIIIl(Bank.contains((int[])nArray5) ? 1 : 0)) break block35;
                                                                                        int[] nArray6 = new int[llIllllllI[0]];
                                                                                        nArray6[y.llIllllllI[1]] = llIllllllI[22];
                                                                                        if (!y.lIllllIIlIIlI(Bank.getFirst((int[])nArray6).getQuantity(), llIllllllI[17])) break block35;
                                                                                    }
                                                                                    var45 = new DHelper(llIllllllI[22], llIllllllI[17], llIllllllI[581]);
                                                                                    bv.add((DHelper) ar45);

                                                                                }
                                                                                int[] nArray = new int[llIllllllI[0]];
                                                                                nArray[y.llIllllllI[1]] = llIllllllI[23];
                                                                                if (!y.lIllllIIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block36;
                                                                                int[] nArray7 = new int[llIllllllI[0]];
                                                                                nArray7[y.llIllllllI[1]] = llIllllllI[23];
                                                                                if (!y.lIllllIIlIIIl(Bank.contains((int[])nArray7) ? 1 : 0)) break block37;
                                                                                int[] nArray8 = new int[llIllllllI[0]];
                                                                                nArray8[y.llIllllllI[1]] = llIllllllI[23];
                                                                                if (!y.lIllllIIlIIlI(Bank.getFirst((int[])nArray8).getQuantity(), llIllllllI[17])) break block37;
                                                                            }
                                                                            var45 = new DHelper(llIllllllI[23], llIllllllI[17], llIllllllI[581]);
                                                                            bv.add((DHelper) ar45);

                                                                        }
                                                                        int[] nArray = new int[llIllllllI[0]];
                                                                        nArray[y.llIllllllI[1]] = llIllllllI[24];
                                                                        if (!y.lIllllIIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block38;
                                                                        int[] nArray9 = new int[llIllllllI[0]];
                                                                        nArray9[y.llIllllllI[1]] = llIllllllI[24];
                                                                        if (!y.lIllllIIlIIIl(Bank.contains((int[])nArray9) ? 1 : 0)) break block39;
                                                                        int[] nArray10 = new int[llIllllllI[0]];
                                                                        nArray10[y.llIllllllI[1]] = llIllllllI[24];
                                                                        if (!y.lIllllIIlIIlI(Bank.getFirst((int[])nArray10).getQuantity(), llIllllllI[6])) break block39;
                                                                    }
                                                                    var45 = new DHelper(llIllllllI[24], llIllllllI[6], llIllllllI[582]);
                                                                    bv.add((DHelper) ar45);

                                                                }
                                                                int[] nArray = new int[llIllllllI[0]];
                                                                nArray[y.llIllllllI[1]] = llIllllllI[25];
                                                                if (!y.lIllllIIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block40;
                                                                int[] nArray11 = new int[llIllllllI[0]];
                                                                nArray11[y.llIllllllI[1]] = llIllllllI[25];
                                                                if (!y.lIllllIIlIIIl(Bank.contains((int[])nArray11) ? 1 : 0)) break block41;
                                                                int[] nArray12 = new int[llIllllllI[0]];
                                                                nArray12[y.llIllllllI[1]] = llIllllllI[25];
                                                                if (!y.lIllllIIlIIlI(Bank.getFirst((int[])nArray12).getQuantity(), llIllllllI[26])) break block41;
                                                            }
                                                            var45 = new DHelper(llIllllllI[25], llIllllllI[26], llIllllllI[583]);
                                                            bv.add((DHelper) ar45);

                                                        }
                                                        int[] nArray = new int[llIllllllI[0]];
                                                        nArray[y.llIllllllI[1]] = llIllllllI[20];
                                                        if (!y.lIllllIIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block42;
                                                        int[] nArray13 = new int[llIllllllI[0]];
                                                        nArray13[y.llIllllllI[1]] = llIllllllI[20];
                                                        if (!y.lIllllIIlIIIl(Bank.contains((int[])nArray13) ? 1 : 0)) break block43;
                                                        int[] nArray14 = new int[llIllllllI[0]];
                                                        nArray14[y.llIllllllI[1]] = llIllllllI[20];
                                                        if (!y.lIllllIIlIIlI(Bank.getFirst((int[])nArray14).getQuantity(), llIllllllI[21])) break block43;
                                                    }
                                                    var45 = new DHelper(llIllllllI[20], llIllllllI[21], llIllllllI[18]);
                                                    bv.add((DHelper) ar45);

                                                }
                                                int[] nArray = new int[llIllllllI[0]];
                                                nArray[y.llIllllllI[1]] = llIllllllI[27];
                                                if (!y.lIllllIIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block44;
                                                int[] nArray15 = new int[llIllllllI[0]];
                                                nArray15[y.llIllllllI[1]] = llIllllllI[27];
                                                if (!y.lIllllIIlIIIl(Bank.contains((int[])nArray15) ? 1 : 0)) break block45;
                                                int[] nArray16 = new int[llIllllllI[0]];
                                                nArray16[y.llIllllllI[1]] = llIllllllI[27];
                                                if (!y.lIllllIIlIIlI(Bank.getFirst((int[])nArray16).getQuantity(), llIllllllI[28])) break block45;
                                            }
                                            var45 = new DHelper(llIllllllI[27], llIllllllI[28], e.c(llIllllllI[584], llIllllllI[585]));
                                            bv.add((DHelper) ar45);

                                        }
                                        int[] nArray = new int[llIllllllI[0]];
                                        nArray[y.llIllllllI[1]] = llIllllllI[29];
                                        if (!y.lIllllIIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block46;
                                        int[] nArray17 = new int[llIllllllI[0]];
                                        nArray17[y.llIllllllI[1]] = llIllllllI[29];
                                        if (!y.lIllllIIlIIIl(Bank.contains((int[])nArray17) ? 1 : 0)) break block47;
                                        int[] nArray18 = new int[llIllllllI[0]];
                                        nArray18[y.llIllllllI[1]] = llIllllllI[29];
                                        if (!y.lIllllIIlIIlI(Bank.getFirst((int[])nArray18).getQuantity(), llIllllllI[30])) break block47;
                                    }
                                    var45 = new DHelper(llIllllllI[29], llIllllllI[30], e.c(llIllllllI[586], llIllllllI[587]));
                                    bv.add((DHelper) ar45);

                                }
                                int[] nArray = new int[llIllllllI[0]];
                                nArray[y.llIllllllI[1]] = llIllllllI[31];
                                if (!y.lIllllIIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block48;
                                int[] nArray19 = new int[llIllllllI[0]];
                                nArray19[y.llIllllllI[1]] = llIllllllI[31];
                                if (!y.lIllllIIlIIIl(Bank.contains((int[])nArray19) ? 1 : 0)) break block49;
                                int[] nArray20 = new int[llIllllllI[0]];
                                nArray20[y.llIllllllI[1]] = llIllllllI[31];
                                if (!y.lIllllIIlIIlI(Bank.getFirst((int[])nArray20).getQuantity(), llIllllllI[32])) break block49;
                            }
                            var45 = new DHelper(llIllllllI[31], llIllllllI[32], llIllllllI[140]);
                            bv.add((DHelper) ar45);

                        }
                        if (y.lIllllIIlIIll(Bank.contains((Predicate)(var45 = item -> item.getName().toLowerCase().contains(llIllllIlI[llIllllllI[581]]))) ? 1 : 0)) {
                            var44 = new DHelper(llIllllllI[588], llIllllllI[2], llIllllllI[589]);
                            bv.add(var44);

                        }
                        int[] nArray = new int[llIllllllI[0]];
                        nArray[y.llIllllllI[1]] = llIllllllI[36];
                        if (!y.lIllllIIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block50;
                        int[] nArray21 = new int[llIllllllI[0]];
                        nArray21[y.llIllllllI[1]] = llIllllllI[36];
                        if (!y.lIllllIIlIIIl(Bank.contains((int[])nArray21) ? 1 : 0)) break block51;
                        int[] nArray22 = new int[llIllllllI[0]];
                        nArray22[y.llIllllllI[1]] = llIllllllI[36];
                        if (!y.lIllllIIlIIlI(Bank.getFirst((int[])nArray22).getQuantity(), llIllllllI[11])) break block51;
                    }
                    var44 = new DHelper(llIllllllI[36], llIllllllI[11], j.cf);
                    bv.add(var44);

                }
                int[] nArray = new int[llIllllllI[0]];
                nArray[y.llIllllllI[1]] = llIllllllI[33];
                if (!y.lIllllIIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block52;
                int[] nArray23 = new int[llIllllllI[0]];
                nArray23[y.llIllllllI[1]] = llIllllllI[33];
                if (!y.lIllllIIlIIIl(Bank.contains((int[])nArray23) ? 1 : 0)) break block53;
                int[] nArray24 = new int[llIllllllI[0]];
                nArray24[y.llIllllllI[1]] = llIllllllI[33];
                if (!y.lIllllIIlIIlI(Bank.getFirst((int[])nArray24).getQuantity(), llIllllllI[12])) break block53;
            }
            var44 = new DHelper(llIllllllI[33], llIllllllI[12], llIllllllI[590]);
            bv.add(var44);

        }
    }

    private static boolean lIllllIIllIll(int n2, int n3) {
        return n2 != n3;
    }

    static {
        y.lIllllIIlIIII();
        y.lIlllIlllllll();
        bv = new ArrayList<d>();
        dN = llIllllllI[594];
        dO = new WorldPoint(llIllllllI[595], llIllllllI[596], llIllllllI[1]);
        dP = new WorldPoint(llIllllllI[363], llIllllllI[375], llIllllllI[1]);
        dQ = new WorldPoint(llIllllllI[522], llIllllllI[597], llIllllllI[1]);
        dR = new WorldPoint(llIllllllI[598], llIllllllI[599], llIllllllI[1]);
        dS = new WorldPoint(llIllllllI[600], llIllllllI[601], llIllllllI[1]);
        dT = new WorldPoint(llIllllllI[602], llIllllllI[603], llIllllllI[1]);
        dU = new WorldPoint(llIllllllI[604], llIllllllI[605], llIllllllI[1]);
        dV = new WorldPoint(llIllllllI[556], llIllllllI[557], llIllllllI[0]);
        dW = new WorldArea(llIllllllI[282], llIllllllI[606], llIllllllI[59], llIllllllI[58], llIllllllI[1]);
        dX = new WorldArea(llIllllllI[607], llIllllllI[608], llIllllllI[93], llIllllllI[111], llIllllllI[1]);
        dY = new WorldArea(llIllllllI[336], llIllllllI[331], llIllllllI[115], llIllllllI[104], llIllllllI[1]);
        dZ = new WorldArea(llIllllllI[599], llIllllllI[609], llIllllllI[135], llIllllllI[114], llIllllllI[1]);
        String[] stringArray = new String[llIllllllI[21]];
        stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[610]];
        stringArray[y.llIllllllI[0]] = llIllllIlI[llIllllllI[611]];
        stringArray[y.llIllllllI[4]] = llIllllIlI[llIllllllI[612]];
        stringArray[y.llIllllllI[6]] = llIllllIlI[llIllllllI[613]];
        stringArray[y.llIllllllI[8]] = llIllllIlI[llIllllllI[614]];
        stringArray[y.llIllllllI[2]] = llIllllIlI[llIllllllI[615]];
        stringArray[y.llIllllllI[11]] = llIllllIlI[llIllllllI[616]];
        stringArray[y.llIllllllI[13]] = llIllllIlI[llIllllllI[617]];
        stringArray[y.llIllllllI[15]] = llIllllIlI[llIllllllI[618]];
        stringArray[y.llIllllllI[16]] = llIllllIlI[llIllllllI[619]];
        stringArray[y.llIllllllI[17]] = llIllllIlI[llIllllllI[620]];
        stringArray[y.llIllllllI[19]] = llIllllIlI[llIllllllI[621]];
        cE = stringArray;
        da = llIllllIlI[llIllllllI[622]];
        h = "Darkness of Hallowvale " + da;
    }

    private static boolean lIllllIIlIlIl(Object object) {
        return object != null;
    }

    private static boolean lIllllIIlIIlI(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var46);
    }

    private static boolean lIllllIIllIIl(int n2, int n3) {
        return n2 > n3;
    }

    @Override
    public String ag() {
        return h;
    }

    private static void lIlllIlllllll() {
        llIllllIlI = new String[llIllllllI[623]];
        y.llIllllIlI[y.llIllllllI[1]] = "Finished buying items, switching back to quest";
        y.llIllllIlI[y.llIllllllI[0]] = "- Con";
        y.llIllllIlI[y.llIllllllI[4]] = "- Mining";
        y.llIllllIlI[y.llIllllllI[6]] = "- Thieving";
        y.llIllllIlI[y.llIllllllI[8]] = "- Agility";
        y.llIllllIlI[y.llIllllllI[2]] = "- Crafting";
        y.llIllllIlI[y.llIllllllI[11]] = "- Magic";
        y.llIllllIlI[y.llIllllllI[13]] = "- Str";
        y.llIllllIlI[y.llIllllllI[15]] = "- In Aid";
        y.llIllllIlI[y.llIllllllI[16]] = y.lIlllIlIllIIl("", "PQRhs");
        y.llIllllIlI[y.llIllllllI[17]] = "Nav to bank";
        y.llIllllIlI[y.llIllllllI[19]] = "Handling banking";
        y.llIllllIlI[y.llIllllllI[21]] = "We are missing quest supplies, switching to BUYING";
        y.llIllllIlI[y.llIllllllI[38]] = "We are missing quest supplies, switching to BUYING";
        y.llIllllIlI[y.llIllllllI[39]] = "We are missing quest supplies, switching to BUYING";
        y.llIllllIlI[y.llIllllllI[30]] = "Drink";
        y.llIllllIlI[y.llIllllllI[40]] = "Veliaf Hurtz";
        y.llIllllIlI[y.llIllllllI[41]] = "Nav to pub";
        y.llIllllIlI[y.llIllllllI[44]] = "Trapdoor";
        y.llIllllIlI[y.llIllllllI[45]] = "Open";
        y.llIllllIlI[y.llIllllllI[3]] = "Trapdoor";
        y.llIllllIlI[y.llIllllllI[46]] = "Climb-down";
        y.llIllllIlI[y.llIllllllI[5]] = "Veliaf Hurtz";
        y.llIllllIlI[y.llIllllllI[47]] = "Talking to veliaf";
        y.llIllllIlI[y.llIllllllI[48]] = "Veliaf Hurtz";
        y.llIllllIlI[y.llIllllllI[49]] = "Leaving base";
        y.llIllllIlI[y.llIllllllI[7]] = "Veliaf Hurtz";
        y.llIllllIlI[y.llIllllllI[50]] = "Ladder";
        y.llIllllIlI[y.llIllllllI[51]] = "Climb-up";
        y.llIllllIlI[y.llIllllllI[52]] = "Veliaf Hurtz";
        y.llIllllIlI[y.llIllllllI[28]] = "Nav to boat";
        y.llIllllIlI[y.llIllllllI[53]] = "Fixing boat";
        y.llIllllIlI[y.llIllllllI[9]] = "Boat";
        y.llIllllIlI[y.llIllllllI[10]] = "Inspect";
        y.llIllllIlI[y.llIllllllI[55]] = "Fixing chute";
        y.llIllllIlI[y.llIllllllI[56]] = "Boat Chute";
        y.llIllllIlI[y.llIllllllI[57]] = "Inspect";
        y.llIllllIlI[y.llIllllllI[58]] = "Boat";
        y.llIllllIlI[y.llIllllllI[59]] = "Boat";
        y.llIllllIlI[y.llIllllllI[60]] = "Board";
        y.llIllllIlI[y.llIllllllI[12]] = "Handling boat";
        y.llIllllIlI[y.llIllllllI[61]] = "Boat";
        y.llIllllIlI[y.llIllllllI[62]] = "Push";
        y.llIllllIlI[y.llIllllllI[63]] = "Boat";
        y.llIllllIlI[y.llIllllllI[64]] = "Boat";
        y.llIllllIlI[y.llIllllllI[65]] = "Board";
        y.llIllllIlI[y.llIllllllI[66]] = "Boat";
        y.llIllllIlI[y.llIllllllI[67]] = "Board";
        y.llIllllIlI[y.llIllllllI[69]] = "Meiyerditch citizen";
        y.llIllllIlI[y.llIllllllI[70]] = "Meiyerditch citizen";
        y.llIllllIlI[y.llIllllllI[32]] = "Nav to old man ral";
        y.llIllllIlI[y.llIllllllI[71]] = "talk npc";
        y.llIllllIlI[y.llIllllllI[72]] = "Old Man Ral";
        y.llIllllIlI[y.llIllllllI[76]] = "Run to base tile";
        y.llIllllIlI[y.llIllllllI[77]] = "Talk";
        y.llIllllIlI[y.llIllllllI[78]] = "Vertida Sefalatis";
        y.llIllllIlI[y.llIllllllI[81]] = "Tele to barrows";
        y.llIllllIlI[y.llIllllllI[82]] = "Break";
        y.llIllllIlI[y.llIllllllI[83]] = "Veliaf Hurtz";
        y.llIllllIlI[y.llIllllllI[84]] = "Veliaf Hurtz";
        y.llIllllIlI[y.llIllllllI[68]] = "Nav to pub";
        y.llIllllIlI[y.llIllllllI[85]] = "Trapdoor";
        y.llIllllIlI[y.llIllllllI[86]] = "Open";
        y.llIllllIlI[y.llIllllllI[87]] = "Trapdoor";
        y.llIllllIlI[y.llIllllllI[88]] = "Climb-down";
        y.llIllllIlI[y.llIllllllI[73]] = "Veliaf Hurtz";
        y.llIllllIlI[y.llIllllllI[89]] = "Talking to veliaf";
        y.llIllllIlI[y.llIllllllI[90]] = "Veliaf Hurtz";
        y.llIllllIlI[y.llIllllllI[92]] = "Nav to Drezel";
        y.llIllllIlI[y.llIllllllI[93]] = "Veliaf Hurtz";
        y.llIllllIlI[y.llIllllllI[74]] = "Break";
        y.llIllllIlI[y.llIllllllI[94]] = "Veliaf Hurtz";
        y.llIllllIlI[y.llIllllllI[95]] = "Trapdoor";
        y.llIllllIlI[y.llIllllllI[96]] = "Trapdoor";
        y.llIllllIlI[y.llIllllllI[97]] = "Open";
        y.llIllllIlI[y.llIllllllI[98]] = "Talk to drezel";
        y.llIllllIlI[y.llIllllllI[99]] = "Drezel";
        y.llIllllIlI[y.llIllllllI[101]] = "Nav to bush";
        y.llIllllIlI[y.llIllllllI[102]] = "Hiding";
        y.llIllllIlI[y.llIllllllI[104]] = "Search";
        y.llIllllIlI[y.llIllllllI[75]] = "Nav to Drezel";
        y.llIllllIlI[y.llIllllllI[106]] = "Break";
        y.llIllllIlI[y.llIllllllI[107]] = "Trapdoor";
        y.llIllllIlI[y.llIllllllI[108]] = "Trapdoor";
        y.llIllllIlI[y.llIllllllI[109]] = "Open";
        y.llIllllIlI[y.llIllllllI[110]] = "Talk to drezel";
        y.llIllllIlI[y.llIllllllI[111]] = "Drezel";
        y.llIllllIlI[y.llIllllllI[114]] = "Nav to king";
        y.llIllllIlI[y.llIllllllI[115]] = "talk king";
        y.llIllllIlI[y.llIllllllI[116]] = "King Roald";
        y.llIllllIlI[y.llIllllllI[79]] = "Veliaf Hurtz";
        y.llIllllIlI[y.llIllllllI[117]] = "Nav to pub";
        y.llIllllIlI[y.llIllllllI[118]] = "Trapdoor";
        y.llIllllIlI[y.llIllllllI[119]] = "Open";
        y.llIllllIlI[y.llIllllllI[120]] = "Trapdoor";
        y.llIllllIlI[y.llIllllllI[121]] = "Climb-down";
        y.llIllllIlI[y.llIllllllI[122]] = "Veliaf Hurtz";
        y.llIllllIlI[y.llIllllllI[123]] = "Talking to veliaf";
        y.llIllllIlI[y.llIllllllI[124]] = "Veliaf Hurtz";
        y.llIllllIlI[y.llIllllllI[126]] = "Veliaf Hurtz";
        y.llIllllIlI[y.llIllllllI[80]] = "Ladder";
        y.llIllllIlI[y.llIllllllI[127]] = "Climb-up";
        y.llIllllIlI[y.llIllllllI[128]] = "Veliaf Hurtz";
        y.llIllllIlI[y.llIllllllI[129]] = "Nav to boat";
        y.llIllllIlI[y.llIllllllI[130]] = "Boat";
        y.llIllllIlI[y.llIllllllI[131]] = "Board";
        y.llIllllIlI[y.llIllllllI[134]] = "Nav back into city";
        y.llIllllIlI[y.llIllllllI[135]] = "Run to base tile";
        y.llIllllIlI[y.llIllllllI[136]] = "Talk";
        y.llIllllIlI[y.llIllllllI[137]] = "Vertida Sefalatis";
        y.llIllllIlI[y.llIllllllI[91]] = "Run to north side";
        y.llIllllIlI[y.llIllllllI[141]] = "Sketching";
        y.llIllllIlI[y.llIllllllI[145]] = "Run to west side";
        y.llIllllIlI[y.llIllllllI[146]] = "Sketching";
        y.llIllllIlI[y.llIllllllI[148]] = "Run to south side";
        y.llIllllIlI[y.llIllllllI[149]] = "Drink";
        y.llIllllIlI[y.llIllllllI[150]] = "Sketching";
        y.llIllllIlI[y.llIllllllI[155]] = "Castle sketch 3";
        y.llIllllIlI[y.llIllllllI[156]] = "Run to south side";
        y.llIllllIlI[y.llIllllllI[157]] = "Sketching";
        y.llIllllIlI[y.llIllllllI[100]] = "Castle sketch 3";
        y.llIllllIlI[y.llIllllllI[158]] = "Break";
        y.llIllllIlI[y.llIllllllI[159]] = "Nav to boat";
        y.llIllllIlI[y.llIllllllI[160]] = "Veliaf Hurtz";
        y.llIllllIlI[y.llIllllllI[161]] = "Nav to boat";
        y.llIllllIlI[y.llIllllllI[162]] = "Boat";
        y.llIllllIlI[y.llIllllllI[163]] = "Board";
        y.llIllllIlI[y.llIllllllI[164]] = "Nav back into city";
        y.llIllllIlI[y.llIllllllI[165]] = "Run to base tile";
        y.llIllllIlI[y.llIllllllI[166]] = "Talk";
        y.llIllllIlI[y.llIllllllI[105]] = "Safalaan Hallow";
        y.llIllllIlI[y.llIllllllI[173]] = "Go down";
        y.llIllllIlI[y.llIllllllI[174]] = "Staircase";
        y.llIllllIlI[y.llIllllllI[175]] = "Climb-down";
        y.llIllllIlI[y.llIllllllI[176]] = "Lab table";
        y.llIllllIlI[y.llIllllllI[179]] = "Nav to grab tile";
        y.llIllllIlI[y.llIllllllI[180]] = "Telegrabbing";
        y.llIllllIlI[y.llIllllllI[181]] = "Run to base tile";
        y.llIllllIlI[y.llIllllllI[182]] = "Talk";
        y.llIllllIlI[y.llIllllllI[183]] = "Safalaan Hallow";
        y.llIllllIlI[y.llIllllllI[112]] = "Break";
        y.llIllllIlI[y.llIllllllI[185]] = "Veliaf Hurtz";
        y.llIllllIlI[y.llIllllllI[186]] = "Nav to pub";
        y.llIllllIlI[y.llIllllllI[187]] = "Trapdoor";
        y.llIllllIlI[y.llIllllllI[188]] = "Open";
        y.llIllllIlI[y.llIllllllI[189]] = "Trapdoor";
        y.llIllllIlI[y.llIllllllI[190]] = "Climb-down";
        y.llIllllIlI[y.llIllllllI[191]] = "Veliaf Hurtz";
        y.llIllllIlI[y.llIllllllI[192]] = "Talking to veliaf";
        y.llIllllIlI[y.llIllllllI[193]] = "Veliaf Hurtz";
        y.llIllllIlI[y.llIllllllI[195]] = "Tome of experience (3)";
        y.llIllllIlI[y.llIllllllI[196]] = "Tome of experience (2)";
        y.llIllllIlI[y.llIllllllI[197]] = "Tome of experience (1)";
        y.llIllllIlI[y.llIllllllI[198]] = "Rubbing book";
        y.llIllllIlI[y.llIllllllI[199]] = "Tome of experience (3)";
        y.llIllllIlI[y.llIllllllI[200]] = "Tome of experience (3)";
        y.llIllllIlI[y.llIllllllI[201]] = "Read";
        y.llIllllIlI[y.llIllllllI[202]] = "Tome of experience (2)";
        y.llIllllIlI[y.llIllllllI[203]] = "Tome of experience (2)";
        y.llIllllIlI[y.llIllllllI[204]] = "Read";
        y.llIllllIlI[y.llIllllllI[205]] = "Tome of experience (1)";
        y.llIllllIlI[y.llIllllllI[206]] = "Tome of experience (1)";
        y.llIllllIlI[y.llIllllllI[207]] = "Read";
        y.llIllllIlI[y.llIllllllI[208]] = "Selecting agility";
        y.llIllllIlI[y.llIllllllI[209]] = "Agility";
        y.llIllllIlI[y.llIllllllI[210]] = "Confirm";
        y.llIllllIlI[y.llIllllllI[211]] = "Tome of experience (3)";
        y.llIllllIlI[y.llIllllllI[212]] = "Tome of experience (2)";
        y.llIllllIlI[y.llIllllllI[213]] = "Tome of experience (1)";
        y.llIllllIlI[y.llIllllllI[214]] = "Veliaf Hurtz";
        y.llIllllIlI[y.llIllllllI[113]] = "Veliaf Hurtz";
        y.llIllllIlI[y.llIllllllI[215]] = "Break";
        y.llIllllIlI[y.llIllllllI[228]] = "Lab table";
        y.llIllllIlI[y.llIllllllI[229]] = "Go up";
        y.llIllllIlI[y.llIllllllI[230]] = "Staircase";
        y.llIllllIlI[y.llIllllllI[231]] = "Climb-up";
        y.llIllllIlI[y.llIllllllI[232]] = "Leave ladder area";
        y.llIllllIlI[y.llIllllllI[233]] = "Door";
        y.llIllllIlI[y.llIllllllI[234]] = "Open";
        y.llIllllIlI[y.llIllllllI[235]] = "Exiting tape";
        y.llIllllIlI[y.llIllllllI[125]] = "Slashed tapestry";
        y.llIllllIlI[y.llIllllllI[236]] = "Slashed tapestry";
        y.llIllllIlI[y.llIllllllI[237]] = "Walk-through";
        y.llIllllIlI[y.llIllllllI[238]] = "Nav to ladder";
        y.llIllllIlI[y.llIllllllI[242]] = "Nav to ladder";
        y.llIllllIlI[y.llIllllllI[243]] = "Go up";
        y.llIllllIlI[y.llIllllllI[244]] = "Ladder";
        y.llIllllIlI[y.llIllllllI[245]] = "Climb-up";
        y.llIllllIlI[y.llIllllllI[246]] = "Pushing wall";
        y.llIllllIlI[y.llIllllllI[247]] = "Wall";
        y.llIllllIlI[y.llIllllllI[138]] = "Push";
        y.llIllllIlI[y.llIllllllI[248]] = "Go up";
        y.llIllllIlI[y.llIllllllI[249]] = "Stairs up";
        y.llIllllIlI[y.llIllllllI[250]] = "Climb-up";
        y.llIllllIlI[y.llIllllllI[254]] = "Walk to tile";
        y.llIllllIlI[y.llIllllllI[139]] = "Jump-to";
        y.llIllllIlI[y.llIllllllI[256]] = "Go down";
        y.llIllllIlI[y.llIllllllI[257]] = "Ladder";
        y.llIllllIlI[y.llIllllllI[258]] = "Climb-down";
        y.llIllllIlI[y.llIllllllI[259]] = "Nav to tapestry";
        y.llIllllIlI[y.llIllllllI[140]] = "Use knife";
        y.llIllllIlI[y.llIllllllI[260]] = "Tapestry";
        y.llIllllIlI[y.llIllllllI[261]] = "Slashed tapestry";
        y.llIllllIlI[y.llIllllllI[262]] = "Slashed tapestry";
        y.llIllllIlI[y.llIllllllI[263]] = "Walk-through";
        y.llIllllIlI[y.llIllllllI[264]] = "Unlocking";
        y.llIllllIlI[y.llIllllllI[265]] = "Large ornate key";
        y.llIllllIlI[y.llIllllllI[266]] = "Vampyre statue";
        y.llIllllIlI[y.llIllllllI[269]] = "Nav to ladder";
        y.llIllllIlI[y.llIllllllI[270]] = "Go down";
        y.llIllllIlI[y.llIllllllI[144]] = "Staircase";
        y.llIllllIlI[y.llIllllllI[271]] = "Climb-down";
        y.llIllllIlI[y.llIllllllI[272]] = "Go down";
        y.llIllllIlI[y.llIllllllI[273]] = "Staircase";
        y.llIllllIlI[y.llIllllllI[274]] = "Climb-down";
        y.llIllllIlI[y.llIllllllI[277]] = "Go down";
        y.llIllllIlI[y.llIllllllI[278]] = "Ladder";
        y.llIllllIlI[y.llIllllllI[279]] = "Climb-down";
        y.llIllllIlI[y.llIllllllI[284]] = "Nav to rubble";
        y.llIllllIlI[y.llIllllllI[285]] = "Climb rubble";
        y.llIllllIlI[y.llIllllllI[147]] = "Wall rubble";
        y.llIllllIlI[y.llIllllllI[286]] = "Climb-over";
        y.llIllllIlI[y.llIllllllI[287]] = "Climb up floor";
        y.llIllllIlI[y.llIllllllI[288]] = "Floor";
        y.llIllllIlI[y.llIllllllI[289]] = "Climb-up";
        y.llIllllIlI[y.llIllllllI[305]] = "Nav to ladder 1";
        y.llIllllIlI[y.llIllllllI[306]] = "Go down ";
        y.llIllllIlI[y.llIllllllI[307]] = "Ladder";
        y.llIllllIlI[y.llIllllllI[308]] = "Climb-down";
        y.llIllllIlI[y.llIllllllI[309]] = "Wall";
        y.llIllllIlI[y.llIllllllI[151]] = "Rocky surface";
        y.llIllllIlI[y.llIllllllI[310]] = "Search";
        y.llIllllIlI[y.llIllllllI[311]] = "Barricade";
        y.llIllllIlI[y.llIllllllI[312]] = "Open";
        y.llIllllIlI[y.llIllllllI[316]] = "Nav to ladder";
        y.llIllllIlI[y.llIllllllI[317]] = "Go up ";
        y.llIllllIlI[y.llIllllllI[318]] = "Ladder";
        y.llIllllIlI[y.llIllllllI[319]] = "Climb-up";
        y.llIllllIlI[y.llIllllllI[321]] = "Nav to ladder";
        y.llIllllIlI[y.llIllllllI[322]] = "Go up ";
        y.llIllllIlI[y.llIllllllI[152]] = "Ladder";
        y.llIllllIlI[y.llIllllllI[323]] = "Climb-up";
        y.llIllllIlI[y.llIllllllI[325]] = "Nav to ladder";
        y.llIllllIlI[y.llIllllllI[326]] = "Go down ";
        y.llIllllIlI[y.llIllllllI[327]] = "Ladder";
        y.llIllllIlI[y.llIllllllI[328]] = "Climb-down";
        y.llIllllIlI[y.llIllllllI[332]] = "Nav to wall";
        y.llIllllIlI[y.llIllllllI[333]] = "Go up ";
        y.llIllllIlI[y.llIllllllI[334]] = "Wall";
        y.llIllllIlI[y.llIllllllI[335]] = "Climb-up";
        y.llIllllIlI[y.llIllllllI[153]] = "Nav to npc";
        y.llIllllIlI[y.llIllllllI[339]] = "Talk";
        y.llIllllIlI[y.llIllllllI[340]] = "Safalaan Hallow";
        y.llIllllIlI[y.llIllllllI[341]] = "Veliaf Hurtz";
        y.llIllllIlI[y.llIllllllI[342]] = "Nav to boat";
        y.llIllllIlI[y.llIllllllI[343]] = "Boat";
        y.llIllllIlI[y.llIllllllI[344]] = "Board";
        y.llIllllIlI[y.llIllllllI[345]] = "Nav back into city";
        y.llIllllIlI[y.llIllllllI[378]] = "nav to ladder 1";
        y.llIllllIlI[y.llIllllllI[379]] = "Climb";
        y.llIllllIlI[y.llIllllllI[154]] = "Ladder";
        y.llIllllIlI[y.llIllllllI[380]] = "Climb-up";
        y.llIllllIlI[y.llIllllllI[381]] = "Handling first floor board";
        y.llIllllIlI[y.llIllllllI[383]] = "Jump-to";
        y.llIllllIlI[y.llIllllllI[384]] = "Handling second floor board";
        y.llIllllIlI[y.llIllllllI[386]] = "Jump-to";
        y.llIllllIlI[y.llIllllllI[387]] = "Wall";
        y.llIllllIlI[y.llIllllllI[388]] = "Wall";
        y.llIllllIlI[y.llIllllllI[389]] = "Push";
        y.llIllllIlI[y.llIllllllI[390]] = "Pushing wall";
        y.llIllllIlI[y.llIllllllI[167]] = "Wall";
        y.llIllllIlI[y.llIllllllI[391]] = "Push";
        y.llIllllIlI[y.llIllllllI[393]] = "Walking across;";
        y.llIllllIlI[y.llIllllllI[394]] = "Walk-across";
        y.llIllllIlI[y.llIllllllI[396]] = "Walking across;";
        y.llIllllIlI[y.llIllllllI[397]] = "Walk-across";
        y.llIllllIlI[y.llIllllllI[398]] = "crawling under";
        y.llIllllIlI[y.llIllllllI[399]] = "Wall";
        y.llIllllIlI[y.llIllllllI[400]] = "Crawl-under";
        y.llIllllIlI[y.llIllllllI[401]] = "Push wall 2";
        y.llIllllIlI[y.llIllllllI[168]] = "Wall";
        y.llIllllIlI[y.llIllllllI[402]] = "Wall";
        y.llIllllIlI[y.llIllllllI[403]] = "Push";
        y.llIllllIlI[y.llIllllllI[404]] = "Wall";
        y.llIllllIlI[y.llIllllllI[405]] = "Push";
        y.llIllllIlI[y.llIllllllI[406]] = "Floor";
        y.llIllllIlI[y.llIllllllI[407]] = "Floor";
        y.llIllllIlI[y.llIllllllI[408]] = "Walk-across";
        y.llIllllIlI[y.llIllllllI[409]] = "Climbing down ladder";
        y.llIllllIlI[y.llIllllllI[410]] = "Ladder";
        y.llIllllIlI[y.llIllllllI[169]] = "Climb-down";
        y.llIllllIlI[y.llIllllllI[411]] = "Handling trapdoor table";
        y.llIllllIlI[y.llIllllllI[413]] = "Search";
        y.llIllllIlI[y.llIllllllI[414]] = "Trapdoor table";
        y.llIllllIlI[y.llIllllllI[415]] = "Table";
        y.llIllllIlI[y.llIllllllI[416]] = "Search";
        y.llIllllIlI[y.llIllllllI[417]] = "Trapdoor table";
        y.llIllllIlI[y.llIllllllI[418]] = "Trapdoor table";
        y.llIllllIlI[y.llIllllllI[419]] = "Open";
        y.llIllllIlI[y.llIllllllI[420]] = "Trapdoor table";
        y.llIllllIlI[y.llIllllllI[26]] = "֎ܲU-O\\";
        y.llIllllIlI[y.llIllllllI[421]] = "Trapdoor tunnel";
        y.llIllllIlI[y.llIllllllI[422]] = "Trapdoor tunnel";
        y.llIllllIlI[y.llIllllllI[423]] = "Climb-into";
        y.llIllllIlI[y.llIllllllI[424]] = "Trapdoor tunnel";
        y.llIllllIlI[y.llIllllllI[425]] = "Climb-into";
        y.llIllllIlI[y.llIllllllI[426]] = "Climbing shelves";
        y.llIllllIlI[y.llIllllllI[427]] = "Shelf";
        y.llIllllIlI[y.llIllllllI[428]] = "Climb-up";
        y.llIllllIlI[y.llIllllllI[429]] = "Crawling under 2";
        y.llIllllIlI[y.llIllllllI[184]] = "Wall";
        y.llIllllIlI[y.llIllllllI[430]] = "Crawl-under";
        y.llIllllIlI[y.llIllllllI[431]] = "Cross floorbaord 3";
        y.llIllllIlI[y.llIllllllI[433]] = "Jump-to";
        y.llIllllIlI[y.llIllllllI[434]] = "Ladder 3";
        y.llIllllIlI[y.llIllllllI[435]] = "Ladder";
        y.llIllllIlI[y.llIllllllI[436]] = "Climb-down";
        y.llIllllIlI[y.llIllllllI[437]] = "Getting key";
        y.llIllllIlI[y.llIllllllI[438]] = "Pots";
        y.llIllllIlI[y.llIllllllI[439]] = "Search";
        y.llIllllIlI[y.llIllllllI[194]] = "Entering door";
        y.llIllllIlI[y.llIllllllI[440]] = "Door";
        y.llIllllIlI[y.llIllllllI[441]] = "Open";
        y.llIllllIlI[y.llIllllllI[442]] = "Handling ladder";
        y.llIllllIlI[y.llIllllllI[443]] = "Ladder";
        y.llIllllIlI[y.llIllllllI[444]] = "Climb-up";
        y.llIllllIlI[y.llIllllllI[445]] = "Cross floorbaord 4";
        y.llIllllIlI[y.llIllllllI[447]] = "Jump-to";
        y.llIllllIlI[y.llIllllllI[448]] = "Shelf 2";
        y.llIllllIlI[y.llIllllllI[449]] = "Shelf";
        y.llIllllIlI[y.llIllllllI[450]] = "Climb-up";
        y.llIllllIlI[y.llIllllllI[451]] = "ladder 5";
        y.llIllllIlI[y.llIllllllI[452]] = "Ladder 5";
        y.llIllllIlI[y.llIllllllI[453]] = "Ladder";
        y.llIllllIlI[y.llIllllllI[454]] = "Climb-up";
        y.llIllllIlI[y.llIllllllI[455]] = "Cross floorbaord 5";
        y.llIllllIlI[y.llIllllllI[457]] = "Jump-to";
        y.llIllllIlI[y.llIllllllI[458]] = "ladder 6";
        y.llIllllIlI[y.llIllllllI[459]] = "Ladder 6";
        y.llIllllIlI[y.llIllllllI[460]] = "Ladder";
        y.llIllllIlI[y.llIllllllI[461]] = "Climb-down";
        y.llIllllIlI[y.llIllllllI[462]] = "Washing line";
        y.llIllllIlI[y.llIllllllI[463]] = "Washing line";
        y.llIllllIlI[y.llIllllllI[464]] = "Walk-across";
        y.llIllllIlI[y.llIllllllI[465]] = "ladder 7";
        y.llIllllIlI[y.llIllllllI[466]] = "Ladder 7";
        y.llIllllIlI[y.llIllllllI[467]] = "Ladder";
        y.llIllllIlI[y.llIllllllI[468]] = "Climb-down";
        y.llIllllIlI[y.llIllllllI[469]] = "Handling wall/floor";
        y.llIllllIlI[y.llIllllllI[470]] = "Wall";
        y.llIllllIlI[y.llIllllllI[471]] = "Wall";
        y.llIllllIlI[y.llIllllllI[472]] = "Push";
        y.llIllllIlI[y.llIllllllI[473]] = "Floor";
        y.llIllllIlI[y.llIllllllI[474]] = "Floor";
        y.llIllllIlI[y.llIllllllI[475]] = "Walk-across";
        y.llIllllIlI[y.llIllllllI[476]] = "Shelf 3";
        y.llIllllIlI[y.llIllllllI[477]] = "Shelf";
        y.llIllllIlI[y.llIllllllI[478]] = "Climb-up";
        y.llIllllIlI[y.llIllllllI[479]] = "shelf 4";
        y.llIllllIlI[y.llIllllllI[480]] = "Shelf";
        y.llIllllIlI[y.llIllllllI[481]] = "Climb-down";
        y.llIllllIlI[y.llIllllllI[484]] = "floorboard 6";
        y.llIllllIlI[y.llIllllllI[486]] = "Jump-to";
        y.llIllllIlI[y.llIllllllI[488]] = "floorboard 7";
        y.llIllllIlI[y.llIllllllI[490]] = "Jump-to";
        y.llIllllIlI[y.llIllllllI[493]] = "floorboard 8";
        y.llIllllIlI[y.llIllllllI[495]] = "Jump-to";
        y.llIllllIlI[y.llIllllllI[498]] = "Broken ladder";
        y.llIllllIlI[y.llIllllllI[499]] = "Ladder top";
        y.llIllllIlI[y.llIllllllI[500]] = "Going up";
        y.llIllllIlI[y.llIllllllI[501]] = "Ladder";
        y.llIllllIlI[y.llIllllllI[502]] = "Climb-up";
        y.llIllllIlI[y.llIllllllI[503]] = "Broken ladder";
        y.llIllllIlI[y.llIllllllI[504]] = "Ladder top";
        y.llIllllIlI[y.llIllllllI[505]] = "Fixing ladder";
        y.llIllllIlI[y.llIllllllI[506]] = "Broken ladder";
        y.llIllllIlI[y.llIllllllI[507]] = "Search";
        y.llIllllIlI[y.llIllllllI[509]] = "Climbing down";
        y.llIllllIlI[y.llIllllllI[510]] = "Climb-down";
        y.llIllllIlI[y.llIllllllI[511]] = "Getting ladder piece";
        y.llIllllIlI[y.llIllllllI[512]] = "Ladder top";
        y.llIllllIlI[y.llIllllllI[513]] = "Wall";
        y.llIllllIlI[y.llIllllllI[514]] = "Search";
        y.llIllllIlI[y.llIllllllI[515]] = "Ladder top";
        y.llIllllIlI[y.llIllllllI[516]] = "Ladder";
        y.llIllllIlI[y.llIllllllI[517]] = "Climb-down";
        y.llIllllIlI[y.llIllllllI[520]] = "Large ornate key";
        y.llIllllIlI[y.llIllllllI[521]] = "Message";
        y.llIllllIlI[y.llIllllllI[523]] = "Nav to fireplace";
        y.llIllllIlI[y.llIllllllI[524]] = "Get key";
        y.llIllllIlI[y.llIllllllI[525]] = "Message";
        y.llIllllIlI[y.llIllllllI[526]] = "Fireplace";
        y.llIllllIlI[y.llIllllllI[527]] = "Fireplace";
        y.llIllllIlI[y.llIllllllI[528]] = "Large ornate key";
        y.llIllllIlI[y.llIllllllI[529]] = "Message";
        y.llIllllIlI[y.llIllllllI[530]] = "Portrait";
        y.llIllllIlI[y.llIllllllI[531]] = "Nav to ladder";
        y.llIllllIlI[y.llIllllllI[532]] = "Climbing up";
        y.llIllllIlI[y.llIllllllI[533]] = "Ladder";
        y.llIllllIlI[y.llIllllllI[534]] = "Climb-up";
        y.llIllllIlI[y.llIllllllI[536]] = "floorboard 9";
        y.llIllllIlI[y.llIllllllI[538]] = "Jump-to";
        y.llIllllIlI[y.llIllllllI[539]] = "Go down";
        y.llIllllIlI[y.llIllllllI[540]] = "Stairs down";
        y.llIllllIlI[y.llIllllllI[541]] = "Climb-down";
        y.llIllllIlI[y.llIllllllI[542]] = "Pushing wall";
        y.llIllllIlI[y.llIllllllI[543]] = "Wall";
        y.llIllllIlI[y.llIllllllI[544]] = "Wall";
        y.llIllllIlI[y.llIllllllI[545]] = "Push";
        y.llIllllIlI[y.llIllllllI[546]] = "Entering base";
        y.llIllllIlI[y.llIllllllI[547]] = "Lumpy rug";
        y.llIllllIlI[y.llIllllllI[548]] = "Decorated wall";
        y.llIllllIlI[y.llIllllllI[549]] = "Press";
        y.llIllllIlI[y.llIllllllI[550]] = "Lumpy rug";
        y.llIllllIlI[y.llIllllllI[551]] = "Lumpy rug";
        y.llIllllIlI[y.llIllllllI[552]] = "Open";
        y.llIllllIlI[y.llIllllllI[553]] = "Trapdoor";
        y.llIllllIlI[y.llIllllllI[554]] = "Trapdoor";
        y.llIllllIlI[y.llIllllllI[555]] = "Climb-down";
        y.llIllllIlI[y.llIllllllI[560]] = "Jumping off boat";
        y.llIllllIlI[y.llIllllllI[562]] = "Jump-onto";
        y.llIllllIlI[y.llIllllllI[563]] = "Climbing up wall";
        y.llIllllIlI[y.llIllllllI[565]] = "Climb-up";
        y.llIllllIlI[y.llIllllllI[566]] = "Climbing down floor";
        y.llIllllIlI[y.llIllllllI[567]] = "Floor";
        y.llIllllIlI[y.llIllllllI[568]] = "Floor";
        y.llIllllIlI[y.llIllllllI[569]] = "Search";
        y.llIllllIlI[y.llIllllllI[570]] = "Floor";
        y.llIllllIlI[y.llIllllllI[571]] = "Search";
        y.llIllllIlI[y.llIllllllI[572]] = "Floor";
        y.llIllllIlI[y.llIllllllI[14]] = "Floor";
        y.llIllllIlI[y.llIllllllI[573]] = "Climb-down";
        y.llIllllIlI[y.llIllllllI[574]] = "Floor";
        y.llIllllIlI[y.llIllllllI[575]] = "Climb-down";
        y.llIllllIlI[y.llIllllllI[576]] = "Climbing over wall";
        y.llIllllIlI[y.llIllllllI[577]] = "Wall rubble";
        y.llIllllIlI[y.llIllllllI[578]] = "Climb-over";
        y.llIllllIlI[y.llIllllllI[591]] = "Tome of experience (3)";
        y.llIllllIlI[y.llIllllllI[592]] = "Tome of experience (2)";
        y.llIllllIlI[y.llIllllllI[593]] = "Tome of experience (1)";
        y.llIllllIlI[y.llIllllllI[581]] = "ring of wealth (";
        y.llIllllIlI[y.llIllllllI[610]] = "Yes.";
        y.llIllllIlI[y.llIllllllI[611]] = "Is there something I can do to help out?";
        y.llIllllIlI[y.llIllllllI[612]] = "Hey, look over there! (Distract and sneak away).";
        y.llIllllIlI[y.llIllllllI[613]] = "(whisper) Do you know about the Myreque?";
        y.llIllllIlI[y.llIllllllI[614]] = "(whisper) I really need to meet the Myreque.";
        y.llIllllIlI[y.llIllllllI[615]] = "How can Old Man Ral help me?";
        y.llIllllIlI[y.llIllllllI[616]] = "Someone said you could help me.";
        y.llIllllIlI[y.llIllllllI[617]] = "Old Man Ral, the sage of Sanguinesti.";
        y.llIllllIlI[y.llIllllllI[618]] = "Talk to the king about Morytania.";
        y.llIllllIlI[y.llIllllllI[619]] = "What should I do now?";
        y.llIllllIlI[y.llIllllllI[620]] = "Yes thanks. I'll accept the free teleport.";
        y.llIllllIlI[y.llIllllllI[621]] = "Okay, lead the way.";
        y.llIllllIlI[y.llIllllllI[622]] = y.lIlllIlIllIII("bBuGGfFJYWk=", "pNlLv");
    }

    /*
     * WARNING - void declaration
     */
    private static boolean an() {
        void var47;
        int[] nArray = new int[llIllllllI[21]];
        nArray[y.llIllllllI[1]] = llIllllllI[33];
        nArray[y.llIllllllI[0]] = llIllllllI[29];
        nArray[y.llIllllllI[4]] = llIllllllI[27];
        nArray[y.llIllllllI[6]] = llIllllllI[31];
        nArray[y.llIllllllI[8]] = llIllllllI[20];
        nArray[y.llIllllllI[2]] = llIllllllI[34];
        nArray[y.llIllllllI[11]] = llIllllllI[35];
        nArray[y.llIllllllI[13]] = llIllllllI[22];
        nArray[y.llIllllllI[15]] = llIllllllI[23];
        nArray[y.llIllllllI[16]] = llIllllllI[36];
        nArray[y.llIllllllI[17]] = llIllllllI[24];
        nArray[y.llIllllllI[19]] = llIllllllI[37];
        int[] nArray2 = nArray;
        int var48 = llIllllllI[1];
        while (y.lIllllIIlIIlI(var48, ((void)var47).length)) {
            int[] nArray3 = new int[llIllllllI[0]];
            nArray3[y.llIllllllI[1]] = var47[var48];
            if (y.lIllllIIlIIll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return llIllllllI[1];
            }
            ++var48;

            if (1 < 2) continue;
            return ((0xE4 ^ 0x97 ^ (0x6B ^ 0x11)) & (0x16 ^ 0x64 ^ (0xD4 ^ 0xAF) ^ -1)) != 0;
        }
        return llIllllllI[0];
    }

    /*
     * WARNING - void declaration
     */
    public static void bq() {
        WorldArea var49;
        WorldPoint var50;
        WorldArea var51;
        void var52;
        void var53;
        void var54;
        void var55;
        void var56;
        void var57;
        void var58;
        void var59;
        void var60;
        void var61;
        void var62;
        void var63;
        void var64;
        void var65;
        void var66;
        void var67;
        void var68;
        void var69;
        void var70;
        void var71;
        void var72;
        void var73;
        void var74;
        void var75;
        WorldPoint worldPoint = new WorldPoint(llIllllllI[346], llIllllllI[347], llIllllllI[1]);
        WorldPoint worldPoint2 = new WorldPoint(llIllllllI[348], llIllllllI[276], llIllllllI[0]);
        WorldPoint worldPoint3 = new WorldPoint(llIllllllI[349], llIllllllI[350], llIllllllI[0]);
        WorldPoint worldPoint4 = new WorldPoint(llIllllllI[351], llIllllllI[352], llIllllllI[0]);
        WorldPoint worldPoint5 = new WorldPoint(llIllllllI[348], llIllllllI[353], llIllllllI[0]);
        WorldPoint worldPoint6 = new WorldPoint(llIllllllI[216], llIllllllI[354], llIllllllI[1]);
        WorldPoint worldPoint7 = new WorldPoint(llIllllllI[355], llIllllllI[356], llIllllllI[0]);
        WorldPoint worldPoint8 = new WorldPoint(llIllllllI[357], llIllllllI[293], llIllllllI[6]);
        WorldPoint worldPoint9 = new WorldPoint(llIllllllI[358], llIllllllI[359], llIllllllI[4]);
        WorldArea worldArea = new WorldArea(llIllllllI[280], llIllllllI[360], llIllllllI[3], llIllllllI[55], llIllllllI[1]);
        WorldArea worldArea2 = new WorldArea(llIllllllI[275], llIllllllI[276], llIllllllI[11], llIllllllI[6], llIllllllI[1]);
        WorldArea worldArea3 = new WorldArea(llIllllllI[275], llIllllllI[276], llIllllllI[11], llIllllllI[8], llIllllllI[0]);
        WorldArea worldArea4 = new WorldArea(llIllllllI[346], llIllllllI[361], llIllllllI[8], llIllllllI[8], llIllllllI[0]);
        WorldArea worldArea5 = new WorldArea(llIllllllI[362], llIllllllI[361], llIllllllI[11], llIllllllI[11], llIllllllI[0]);
        WorldArea worldArea6 = new WorldArea(llIllllllI[351], llIllllllI[303], llIllllllI[8], llIllllllI[6], llIllllllI[0]);
        WorldArea worldArea7 = new WorldArea(llIllllllI[363], llIllllllI[293], llIllllllI[11], llIllllllI[16], llIllllllI[0]);
        WorldArea worldArea8 = new WorldArea(llIllllllI[348], llIllllllI[352], llIllllllI[2], llIllllllI[6], llIllllllI[0]);
        WorldArea worldArea9 = new WorldArea(llIllllllI[364], llIllllllI[365], llIllllllI[11], llIllllllI[2], llIllllllI[1]);
        WorldArea worldArea10 = new WorldArea(llIllllllI[366], llIllllllI[354], llIllllllI[11], llIllllllI[2], llIllllllI[1]);
        WorldArea worldArea11 = new WorldArea(llIllllllI[367], llIllllllI[354], llIllllllI[2], llIllllllI[2], llIllllllI[0]);
        WorldArea worldArea12 = new WorldArea(llIllllllI[364], llIllllllI[354], llIllllllI[4], llIllllllI[2], llIllllllI[0]);
        WorldArea worldArea13 = new WorldArea(llIllllllI[362], llIllllllI[356], llIllllllI[8], llIllllllI[11], llIllllllI[0]);
        WorldArea worldArea14 = new WorldArea(llIllllllI[368], llIllllllI[356], llIllllllI[15], llIllllllI[11], llIllllllI[1]);
        WorldArea worldArea15 = new WorldArea(llIllllllI[369], llIllllllI[356], llIllllllI[19], llIllllllI[11], llIllllllI[1]);
        WorldArea worldArea16 = new WorldArea(llIllllllI[370], llIllllllI[356], llIllllllI[16], llIllllllI[13], llIllllllI[0]);
        WorldArea worldArea17 = new WorldArea(llIllllllI[357], llIllllllI[293], llIllllllI[13], llIllllllI[16], llIllllllI[0]);
        WorldArea worldArea18 = new WorldArea(llIllllllI[369], llIllllllI[293], llIllllllI[16], llIllllllI[16], llIllllllI[4]);
        WorldArea worldArea19 = new WorldArea(llIllllllI[371], llIllllllI[293], llIllllllI[15], llIllllllI[8], llIllllllI[6]);
        WorldArea worldArea20 = new WorldArea(llIllllllI[369], llIllllllI[302], llIllllllI[13], llIllllllI[2], llIllllllI[6]);
        WorldArea worldArea21 = new WorldArea(llIllllllI[371], llIllllllI[372], llIllllllI[17], llIllllllI[11], llIllllllI[4]);
        WorldArea worldArea22 = new WorldArea(llIllllllI[373], llIllllllI[350], llIllllllI[11], llIllllllI[15], llIllllllI[4]);
        WorldArea worldArea23 = new WorldArea(llIllllllI[373], llIllllllI[302], llIllllllI[2], llIllllllI[13], llIllllllI[0]);
        WorldArea worldArea24 = new WorldArea(llIllllllI[374], llIllllllI[375], llIllllllI[8], llIllllllI[15], llIllllllI[0]);
        WorldArea worldArea25 = new WorldArea(llIllllllI[376], llIllllllI[377], llIllllllI[11], llIllllllI[2], llIllllllI[4]);
        WorldArea worldArea26 = new WorldArea(llIllllllI[226], llIllllllI[239], llIllllllI[2], llIllllllI[2], llIllllllI[1]);
        if (y.lIllllIIlIIIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && y.lIllllIIlIIll(Players.getLocal().getWorldLocation().getPlane())) {
            void var76;
            if (y.lIllllIIlIIll(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderSotf.c = llIllllIlI[llIllllllI[378]];
                Movement.walkTo((WorldPoint)worldPoint);

                Time.sleepTicks((int)llIllllllI[0]);

            }
            if (y.lIllllIIlIIIl(var76.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderSotf.c = llIllllIlI[llIllllllI[379]];
                String[] stringArray = new String[llIllllllI[0]];
                stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[154]];
                TileObjects.getNearest((String[])stringArray).interact(llIllllIlI[llIllllllI[380]]);
                Time.sleepTicks((int)llIllllllI[6]);

            }
        }
        if (y.lIllllIIlIIIl(var75.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            void var77;
            AccBuilderSotf.c = llIllllIlI[llIllllllI[381]];
            if (y.lIllllIIlIIll(Players.getLocal().getWorldLocation().equals((Object)var77) ? 1 : 0)) {
                Movement.walkTo((WorldPoint)var77);

                Time.sleepTicks((int)llIllllllI[0]);

            }
            if (y.lIllllIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)var77) ? 1 : 0)) {
                int[] nArray = new int[llIllllllI[0]];
                nArray[y.llIllllllI[1]] = llIllllllI[382];
                TileObjects.getNearest((int[])nArray).interact(llIllllIlI[llIllllllI[383]]);
                Time.sleepTicks((int)llIllllllI[6]);

            }
        }
        if (y.lIllllIIlIIIl(var74.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            void var78;
            AccBuilderSotf.c = llIllllIlI[llIllllllI[384]];
            if (y.lIllllIIlIIll(Players.getLocal().getWorldLocation().equals((Object)var78) ? 1 : 0)) {
                Movement.walkTo((WorldPoint)var78);

                Time.sleepTicks((int)llIllllllI[0]);

            }
            if (y.lIllllIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)var78) ? 1 : 0)) {
                int[] nArray = new int[llIllllllI[0]];
                nArray[y.llIllllllI[1]] = llIllllllI[385];
                TileObjects.getNearest((int[])nArray).interact(llIllllIlI[llIllllllI[386]]);
                Time.sleepTicks((int)llIllllllI[6]);

            }
        }
        if (y.lIllllIIlIIIl(var73.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            String[] stringArray = new String[llIllllllI[0]];
            stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[387]];
            if (y.lIllllIIlIlIl(TileObjects.getNearest((String[])stringArray))) {
                String[] stringArray2 = new String[llIllllllI[0]];
                stringArray2[y.llIllllllI[1]] = llIllllIlI[llIllllllI[388]];
                String[] stringArray3 = new String[llIllllllI[0]];
                stringArray3[y.llIllllllI[1]] = llIllllIlI[llIllllllI[389]];
                if (y.lIllllIIlIIIl(TileObjects.getNearest((String[])stringArray2).hasAction(stringArray3) ? 1 : 0)) {
                    AccBuilderSotf.c = llIllllIlI[llIllllllI[390]];
                    String[] stringArray4 = new String[llIllllllI[0]];
                    stringArray4[y.llIllllllI[1]] = llIllllIlI[llIllllllI[167]];
                    TileObjects.getNearest((String[])stringArray4).interact(llIllllIlI[llIllllllI[391]]);
                    Time.sleepTicks((int)llIllllllI[6]);

                }
            }
            int[] nArray = new int[llIllllllI[0]];
            nArray[y.llIllllllI[1]] = llIllllllI[392];
            if (y.lIllllIIlIlIl(TileObjects.getNearest((int[])nArray))) {
                AccBuilderSotf.c = llIllllIlI[llIllllllI[393]];
                int[] nArray2 = new int[llIllllllI[0]];
                nArray2[y.llIllllllI[1]] = llIllllllI[392];
                TileObjects.getNearest((int[])nArray2).interact(llIllllIlI[llIllllllI[394]]);
                Time.sleepTicks((int)llIllllllI[6]);

            }
            int[] nArray3 = new int[llIllllllI[0]];
            nArray3[y.llIllllllI[1]] = llIllllllI[395];
            if (y.lIllllIIlIlIl(TileObjects.getNearest((int[])nArray3))) {
                AccBuilderSotf.c = llIllllIlI[llIllllllI[396]];
                int[] nArray4 = new int[llIllllllI[0]];
                nArray4[y.llIllllllI[1]] = llIllllllI[395];
                TileObjects.getNearest((int[])nArray4).interact(llIllllIlI[llIllllllI[397]]);
                Time.sleepTicks((int)llIllllllI[6]);

            }
        }
        if (y.lIllllIIlIIIl(var72.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[398]];
            String[] stringArray = new String[llIllllllI[0]];
            stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[399]];
            TileObjects.getNearest((String[])stringArray).interact(llIllllIlI[llIllllllI[400]]);
            Time.sleepTicks((int)llIllllllI[8]);

        }
        if (y.lIllllIIlIIIl(var71.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            void var79;
            AccBuilderSotf.c = llIllllIlI[llIllllllI[401]];
            if (y.lIllllIIlIIll(Players.getLocal().getWorldLocation().equals((Object)var79) ? 1 : 0)) {
                Movement.walkTo((WorldPoint)var79);

                Time.sleepTicks((int)llIllllllI[0]);

            }
            if (y.lIllllIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)var79) ? 1 : 0)) {
                String[] stringArray = new String[llIllllllI[0]];
                stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[168]];
                if (y.lIllllIIlIlIl(TileObjects.getNearest((String[])stringArray))) {
                    String[] stringArray5 = new String[llIllllllI[0]];
                    stringArray5[y.llIllllllI[1]] = llIllllIlI[llIllllllI[402]];
                    String[] stringArray6 = new String[llIllllllI[0]];
                    stringArray6[y.llIllllllI[1]] = llIllllIlI[llIllllllI[403]];
                    if (y.lIllllIIlIIIl(TileObjects.getNearest((String[])stringArray5).hasAction(stringArray6) ? 1 : 0)) {
                        String[] stringArray7 = new String[llIllllllI[0]];
                        stringArray7[y.llIllllllI[1]] = llIllllIlI[llIllllllI[404]];
                        TileObjects.getNearest((String[])stringArray7).interact(llIllllIlI[llIllllllI[405]]);
                        Time.sleepTicks((int)llIllllllI[4]);

                    }
                }
                String[] stringArray8 = new String[llIllllllI[0]];
                stringArray8[y.llIllllllI[1]] = llIllllIlI[llIllllllI[406]];
                if (y.lIllllIIlIlIl(TileObjects.getNearest((String[])stringArray8))) {
                    String[] stringArray9 = new String[llIllllllI[0]];
                    stringArray9[y.llIllllllI[1]] = llIllllIlI[llIllllllI[407]];
                    TileObjects.getNearest((String[])stringArray9).interact(llIllllIlI[llIllllllI[408]]);
                    Time.sleepTicks((int)llIllllllI[6]);

                }
            }
        }
        if (y.lIllllIIlIIIl(var70.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && y.lIllllIIlIIll(Players.getLocal().isMoving() ? 1 : 0)) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[409]];
            Time.sleepTicks((int)llIllllllI[4]);

            String[] stringArray = new String[llIllllllI[0]];
            stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[410]];
            TileObjects.getNearest((String[])stringArray).interact(llIllllIlI[llIllllllI[169]]);
            Time.sleepTicks((int)llIllllllI[2]);

        }
        if (y.lIllllIIlIIIl(var69.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[411]];
            int[] nArray = new int[llIllllllI[0]];
            nArray[y.llIllllllI[1]] = llIllllllI[412];
            if (y.lIllllIIlIlIl(TileObjects.getNearest((int[])nArray))) {
                int[] nArray5 = new int[llIllllllI[0]];
                nArray5[y.llIllllllI[1]] = llIllllllI[412];
                TileObjects.getNearest((int[])nArray5).interact(llIllllIlI[llIllllllI[413]]);
                Time.sleepTicks((int)llIllllllI[8]);

            }
            String[] stringArray = new String[llIllllllI[0]];
            stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[414]];
            if (y.lIllllIIlIlll(TileObjects.getNearest((String[])stringArray))) {
                String[] stringArray10 = new String[llIllllllI[0]];
                stringArray10[y.llIllllllI[1]] = llIllllIlI[llIllllllI[415]];
                TileObjects.getNearest((String[])stringArray10).interact(llIllllIlI[llIllllllI[416]]);
                Time.sleepTicks((int)llIllllllI[8]);

            }
            String[] stringArray11 = new String[llIllllllI[0]];
            stringArray11[y.llIllllllI[1]] = llIllllIlI[llIllllllI[417]];
            if (y.lIllllIIlIlIl(TileObjects.getNearest((String[])stringArray11))) {
                String[] stringArray12 = new String[llIllllllI[0]];
                stringArray12[y.llIllllllI[1]] = llIllllIlI[llIllllllI[418]];
                String[] stringArray13 = new String[llIllllllI[0]];
                stringArray13[y.llIllllllI[1]] = llIllllIlI[llIllllllI[419]];
                if (y.lIllllIIlIIIl(TileObjects.getNearest((String[])stringArray12).hasAction(stringArray13) ? 1 : 0)) {
                    String[] stringArray14 = new String[llIllllllI[0]];
                    stringArray14[y.llIllllllI[1]] = llIllllIlI[llIllllllI[420]];
                    TileObjects.getNearest((String[])stringArray14).interact(llIllllIlI[llIllllllI[26]]);
                    Time.sleepTicks((int)llIllllllI[6]);

                }
            }
            String[] stringArray15 = new String[llIllllllI[0]];
            stringArray15[y.llIllllllI[1]] = llIllllIlI[llIllllllI[421]];
            if (y.lIllllIIlIlIl(TileObjects.getNearest((String[])stringArray15))) {
                String[] stringArray16 = new String[llIllllllI[0]];
                stringArray16[y.llIllllllI[1]] = llIllllIlI[llIllllllI[422]];
                String[] stringArray17 = new String[llIllllllI[0]];
                stringArray17[y.llIllllllI[1]] = llIllllIlI[llIllllllI[423]];
                if (y.lIllllIIlIIIl(TileObjects.getNearest((String[])stringArray16).hasAction(stringArray17) ? 1 : 0)) {
                    String[] stringArray18 = new String[llIllllllI[0]];
                    stringArray18[y.llIllllllI[1]] = llIllllIlI[llIllllllI[424]];
                    TileObjects.getNearest((String[])stringArray18).interact(llIllllIlI[llIllllllI[425]]);
                    Time.sleepTicks((int)llIllllllI[6]);

                }
            }
        }
        if (y.lIllllIIlIIIl(var68.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && y.lIllllIIlIIll(Players.getLocal().isMoving() ? 1 : 0) && y.lIllllIIllIII(Players.getLocal().getAnimation(), llIllllllI[54])) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[426]];
            String[] stringArray = new String[llIllllllI[0]];
            stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[427]];
            TileObjects.getNearest((String[])stringArray).interact(llIllllIlI[llIllllllI[428]]);
            Time.sleepTicks((int)llIllllllI[2]);

        }
        if (y.lIllllIIlIIIl(var67.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[429]];
            if (y.lIllllIIllIII(Players.getLocal().getAnimation(), llIllllllI[54])) {
                String[] stringArray = new String[llIllllllI[0]];
                stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[184]];
                TileObjects.getNearest((String[])stringArray).interact(llIllllIlI[llIllllllI[430]]);
                Time.sleepTicks((int)llIllllllI[6]);

            }
        }
        if (y.lIllllIIlIIIl(var66.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            void var80;
            AccBuilderSotf.c = llIllllIlI[llIllllllI[431]];
            if (y.lIllllIIlIIll(Players.getLocal().getWorldLocation().equals((Object)var80) ? 1 : 0)) {
                Movement.walkTo((WorldPoint)var80);

                Time.sleepTicks((int)llIllllllI[0]);

            }
            if (y.lIllllIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)var80) ? 1 : 0)) {
                int[] nArray = new int[llIllllllI[0]];
                nArray[y.llIllllllI[1]] = llIllllllI[432];
                TileObjects.getNearest((int[])nArray).interact(llIllllIlI[llIllllllI[433]]);
                Time.sleepTicks((int)llIllllllI[6]);

            }
        }
        if (y.lIllllIIlIIIl(var65.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && y.lIllllIIlIIll(Players.getLocal().isMoving() ? 1 : 0) && y.lIllllIIllIII(Players.getLocal().getAnimation(), llIllllllI[54])) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[434]];
            String[] stringArray = new String[llIllllllI[0]];
            stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[435]];
            TileObjects.getNearest((String[])stringArray).interact(llIllllIlI[llIllllllI[436]]);
            Time.sleepTicks((int)llIllllllI[6]);

        }
        if (y.lIllllIIlIIIl(var64.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && y.lIllllIIlIIll(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llIllllllI[369], llIllllllI[359], llIllllllI[1])) ? 1 : 0)) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[437]];
            if (y.lIllllIIlIIll(Dialog.isOpen() ? 1 : 0) && y.lIllllIIlIIll(Players.getLocal().isMoving() ? 1 : 0) && y.lIllllIIllIII(Players.getLocal().getAnimation(), llIllllllI[54])) {
                String[] stringArray = new String[llIllllllI[0]];
                stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[438]];
                TileObjects.getNearest((String[])stringArray).interact(llIllllIlI[llIllllllI[439]]);
                Time.sleepTicks((int)llIllllllI[13]);

                AccBuilderSotf.c = llIllllIlI[llIllllllI[194]];
                String[] stringArray19 = new String[llIllllllI[0]];
                stringArray19[y.llIllllllI[1]] = llIllllIlI[llIllllllI[440]];
                TileObjects.getNearest((String[])stringArray19).interact(llIllllIlI[llIllllllI[441]]);
                Time.sleepTicks((int)llIllllllI[4]);

            }
        }
        if (!y.lIllllIIlIIll(var63.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || y.lIllllIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llIllllllI[369], llIllllllI[359], llIllllllI[1])) ? 1 : 0)) {
            void var81;
            AccBuilderSotf.c = llIllllIlI[llIllllllI[442]];
            if (y.lIllllIIllIIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var81), llIllllllI[6])) {
                Movement.walkTo((WorldPoint)var81);

                Time.sleepTicks((int)llIllllllI[0]);

            }
            if (y.lIllllIIllIlI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var81), llIllllllI[6])) {
                String[] stringArray = new String[llIllllllI[0]];
                stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[443]];
                TileObjects.getNearest((String[])stringArray).interact(llIllllIlI[llIllllllI[444]]);
                Time.sleepTicks((int)llIllllllI[6]);

            }
        }
        if (y.lIllllIIlIIIl(var62.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            void var82;
            AccBuilderSotf.c = llIllllIlI[llIllllllI[445]];
            if (y.lIllllIIlIIll(Players.getLocal().getWorldLocation().equals((Object)var82) ? 1 : 0)) {
                Movement.walkTo((WorldPoint)var82);

                Time.sleepTicks((int)llIllllllI[0]);

            }
            if (y.lIllllIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)var82) ? 1 : 0)) {
                int[] nArray = new int[llIllllllI[0]];
                nArray[y.llIllllllI[1]] = llIllllllI[446];
                TileObjects.getNearest((int[])nArray).interact(llIllllIlI[llIllllllI[447]]);
                Time.sleepTicks((int)llIllllllI[6]);

            }
        }
        if (y.lIllllIIlIIIl(var61.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[448]];
            if (y.lIllllIIlIIll(Players.getLocal().isMoving() ? 1 : 0) && y.lIllllIIllIII(Players.getLocal().getAnimation(), llIllllllI[54])) {
                String[] stringArray = new String[llIllllllI[0]];
                stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[449]];
                TileObjects.getNearest((String[])stringArray).interact(llIllllIlI[llIllllllI[450]]);
                Time.sleepTicks((int)llIllllllI[6]);

            }
        }
        if (y.lIllllIIlIIIl(var60.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[451]];
            if (y.lIllllIIlIIll(Players.getLocal().isMoving() ? 1 : 0) && y.lIllllIIllIII(Players.getLocal().getAnimation(), llIllllllI[54])) {
                AccBuilderSotf.c = llIllllIlI[llIllllllI[452]];
                String[] stringArray = new String[llIllllllI[0]];
                stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[453]];
                TileObjects.getNearest((String[])stringArray).interact(llIllllIlI[llIllllllI[454]]);
                Time.sleepTicks((int)llIllllllI[6]);

            }
        }
        if (y.lIllllIIlIIIl(var59.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            void var83;
            AccBuilderSotf.c = llIllllIlI[llIllllllI[455]];
            if (y.lIllllIIlIIll(Players.getLocal().getWorldLocation().equals((Object)var83) ? 1 : 0)) {
                Movement.walkTo((WorldPoint)var83);

                Time.sleepTicks((int)llIllllllI[0]);

            }
            if (y.lIllllIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)var83) ? 1 : 0)) {
                int[] nArray = new int[llIllllllI[0]];
                nArray[y.llIllllllI[1]] = llIllllllI[456];
                TileObjects.getNearest((int[])nArray).interact(llIllllIlI[llIllllllI[457]]);
                Time.sleepTicks((int)llIllllllI[6]);

            }
        }
        if (y.lIllllIIlIIIl(var58.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[458]];
            if (y.lIllllIIlIIll(Players.getLocal().isMoving() ? 1 : 0) && y.lIllllIIllIII(Players.getLocal().getAnimation(), llIllllllI[54])) {
                AccBuilderSotf.c = llIllllIlI[llIllllllI[459]];
                String[] stringArray = new String[llIllllllI[0]];
                stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[460]];
                TileObjects.getNearest((String[])stringArray).interact(llIllllIlI[llIllllllI[461]]);
                Time.sleepTicks((int)llIllllllI[6]);

            }
        }
        if (y.lIllllIIlIIIl(var57.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[462]];
            if (y.lIllllIIlIIll(Players.getLocal().isMoving() ? 1 : 0) && y.lIllllIIllIII(Players.getLocal().getAnimation(), llIllllllI[54])) {
                String[] stringArray = new String[llIllllllI[0]];
                stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[463]];
                TileObjects.getNearest((String[])stringArray).interact(llIllllIlI[llIllllllI[464]]);
                Time.sleepTicks((int)llIllllllI[8]);

            }
        }
        if (y.lIllllIIlIIIl(var56.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[465]];
            if (y.lIllllIIlIIll(Players.getLocal().isMoving() ? 1 : 0) && y.lIllllIIllIII(Players.getLocal().getAnimation(), llIllllllI[54])) {
                AccBuilderSotf.c = llIllllIlI[llIllllllI[466]];
                String[] stringArray = new String[llIllllllI[0]];
                stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[467]];
                TileObjects.getNearest((String[])stringArray).interact(llIllllIlI[llIllllllI[468]]);
                Time.sleepTicks((int)llIllllllI[6]);

            }
        }
        if (y.lIllllIIlIIIl(var55.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[469]];
            String[] stringArray = new String[llIllllllI[0]];
            stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[470]];
            if (y.lIllllIIlIlIl(TileObjects.getNearest((String[])stringArray))) {
                String[] stringArray20 = new String[llIllllllI[0]];
                stringArray20[y.llIllllllI[1]] = llIllllIlI[llIllllllI[471]];
                TileObjects.getNearest((String[])stringArray20).interact(llIllllIlI[llIllllllI[472]]);
                Time.sleepTicks((int)llIllllllI[8]);

            }
            String[] stringArray21 = new String[llIllllllI[0]];
            stringArray21[y.llIllllllI[1]] = llIllllIlI[llIllllllI[473]];
            if (y.lIllllIIlIlIl(TileObjects.getNearest((String[])stringArray21))) {
                String[] stringArray22 = new String[llIllllllI[0]];
                stringArray22[y.llIllllllI[1]] = llIllllIlI[llIllllllI[474]];
                TileObjects.getNearest((String[])stringArray22).interact(llIllllIlI[llIllllllI[475]]);
                Time.sleepTicks((int)llIllllllI[6]);

            }
        }
        if (y.lIllllIIlIIIl(var54.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && y.lIllllIIlIIll(Players.getLocal().isMoving() ? 1 : 0) && y.lIllllIIllIII(Players.getLocal().getAnimation(), llIllllllI[54])) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[476]];
            String[] stringArray = new String[llIllllllI[0]];
            stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[477]];
            TileObjects.getNearest((String[])stringArray).interact(llIllllIlI[llIllllllI[478]]);
            Time.sleepTicks((int)llIllllllI[6]);

        }
        if (y.lIllllIIlIIIl(var53.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            void var84;
            AccBuilderSotf.c = llIllllIlI[llIllllllI[479]];
            if (y.lIllllIIlIIll(Players.getLocal().getWorldLocation().equals((Object)var84) ? 1 : 0)) {
                Movement.walkTo((WorldPoint)var84);

                Time.sleepTicks((int)llIllllllI[0]);

            }
            if (y.lIllllIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)var84) ? 1 : 0) && y.lIllllIIlIIll(Players.getLocal().isMoving() ? 1 : 0) && y.lIllllIIllIII(Players.getLocal().getAnimation(), llIllllllI[54])) {
                String[] stringArray = new String[llIllllllI[0]];
                stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[480]];
                TileObjects.getNearest((String[])stringArray).interact(llIllllIlI[llIllllllI[481]]);
                Time.sleepTicks((int)llIllllllI[4]);

            }
        }
        WorldArea var85 = new WorldArea(llIllllllI[373], llIllllllI[353], llIllllllI[15], llIllllllI[6], llIllllllI[0]);
        WorldArea var86 = new WorldArea(llIllllllI[358], llIllllllI[356], llIllllllI[8], llIllllllI[13], llIllllllI[0]);
        WorldPoint var87 = new WorldPoint(llIllllllI[482], llIllllllI[483], llIllllllI[0]);
        if (!y.lIllllIIlIIll(var85.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || y.lIllllIIlIIIl(var86.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[484]];
            if (y.lIllllIIlIIll(Players.getLocal().getWorldLocation().equals((Object)var87) ? 1 : 0)) {
                Movement.walkTo((WorldPoint)var87);

                Time.sleepTicks((int)llIllllllI[0]);

            }
            if (y.lIllllIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)var87) ? 1 : 0)) {
                int[] nArray = new int[llIllllllI[0]];
                nArray[y.llIllllllI[1]] = llIllllllI[485];
                TileObjects.getNearest((int[])nArray).interact(llIllllIlI[llIllllllI[486]]);
                Time.sleepTicks((int)llIllllllI[6]);

            }
        }
        WorldArea var88 = new WorldArea(llIllllllI[487], llIllllllI[320], llIllllllI[2], llIllllllI[2], llIllllllI[0]);
        WorldPoint var89 = new WorldPoint(llIllllllI[374], llIllllllI[315], llIllllllI[0]);
        if (y.lIllllIIlIIIl(var88.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[488]];
            if (y.lIllllIIlIIll(Players.getLocal().getWorldLocation().equals((Object)var89) ? 1 : 0)) {
                Movement.walkTo((WorldPoint)var89);

                Time.sleepTicks((int)llIllllllI[0]);

            }
            if (y.lIllllIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)var89) ? 1 : 0) && y.lIllllIIlIIll(Dialog.isOpen() ? 1 : 0)) {
                int[] nArray = new int[llIllllllI[0]];
                nArray[y.llIllllllI[1]] = llIllllllI[489];
                TileObjects.getNearest((int[])nArray).interact(llIllllIlI[llIllllllI[490]]);
                Time.sleepTicks((int)llIllllllI[6]);

            }
        }
        WorldArea var90 = new WorldArea(llIllllllI[487], llIllllllI[43], llIllllllI[11], llIllllllI[17], llIllllllI[0]);
        WorldPoint var91 = new WorldPoint(llIllllllI[491], llIllllllI[492], llIllllllI[0]);
        if (y.lIllllIIlIIIl(var90.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[493]];
            if (y.lIllllIIlIIll(Players.getLocal().getWorldLocation().equals((Object)var91) ? 1 : 0)) {
                Movement.walkTo((WorldPoint)var91);

                Time.sleepTicks((int)llIllllllI[0]);

            }
            if (y.lIllllIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)var91) ? 1 : 0)) {
                int[] nArray = new int[llIllllllI[0]];
                nArray[y.llIllllllI[1]] = llIllllllI[494];
                TileObjects.getNearest((int[])nArray).interact(llIllllIlI[llIllllllI[495]]);
                Time.sleepTicks((int)llIllllllI[6]);

            }
        }
        WorldArea var92 = new WorldArea(llIllllllI[358], llIllllllI[496], llIllllllI[15], llIllllllI[8], llIllllllI[0]);
        WorldArea var93 = new WorldArea(llIllllllI[491], llIllllllI[497], llIllllllI[16], llIllllllI[11], llIllllllI[4]);
        if (y.lIllllIIlIIIl(var92.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            String[] stringArray = new String[llIllllllI[0]];
            stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[498]];
            if (y.lIllllIIlIlIl(TileObjects.getNearest((String[])stringArray))) {
                String[] stringArray23 = new String[llIllllllI[0]];
                stringArray23[y.llIllllllI[1]] = llIllllIlI[llIllllllI[499]];
                if (y.lIllllIIlIIll(Inventory.contains((String[])stringArray23) ? 1 : 0)) {
                    AccBuilderSotf.c = llIllllIlI[llIllllllI[500]];
                    Time.sleepTicks((int)llIllllllI[4]);

                    String[] stringArray24 = new String[llIllllllI[0]];
                    stringArray24[y.llIllllllI[1]] = llIllllIlI[llIllllllI[501]];
                    TileObjects.getNearest((String[])stringArray24).interact(llIllllIlI[llIllllllI[502]]);
                    Time.sleepTicks((int)llIllllllI[6]);

                }
            }
            String[] stringArray25 = new String[llIllllllI[0]];
            stringArray25[y.llIllllllI[1]] = llIllllIlI[llIllllllI[503]];
            if (y.lIllllIIlIlIl(TileObjects.getNearest((String[])stringArray25))) {
                String[] stringArray26 = new String[llIllllllI[0]];
                stringArray26[y.llIllllllI[1]] = llIllllIlI[llIllllllI[504]];
                if (y.lIllllIIlIIIl(Inventory.contains((String[])stringArray26) ? 1 : 0)) {
                    AccBuilderSotf.c = llIllllIlI[llIllllllI[505]];
                    String[] stringArray27 = new String[llIllllllI[0]];
                    stringArray27[y.llIllllllI[1]] = llIllllIlI[llIllllllI[506]];
                    TileObjects.getNearest((String[])stringArray27).interact(llIllllIlI[llIllllllI[507]]);
                    Time.sleepTicks((int)llIllllllI[6]);

                }
            }
            int[] nArray = new int[llIllllllI[0]];
            nArray[y.llIllllllI[1]] = llIllllllI[508];
            if (y.lIllllIIlIlIl(TileObjects.getNearest((int[])nArray))) {
                AccBuilderSotf.c = llIllllIlI[llIllllllI[509]];
                int[] nArray6 = new int[llIllllllI[0]];
                nArray6[y.llIllllllI[1]] = llIllllllI[508];
                TileObjects.getNearest((int[])nArray6).interact(llIllllIlI[llIllllllI[510]]);
            }
        }
        if (y.lIllllIIlIIIl(var93.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[511]];
            String[] stringArray = new String[llIllllllI[0]];
            stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[512]];
            if (y.lIllllIIlIIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray28 = new String[llIllllllI[0]];
                stringArray28[y.llIllllllI[1]] = llIllllIlI[llIllllllI[513]];
                TileObjects.getNearest((String[])stringArray28).interact(llIllllIlI[llIllllllI[514]]);
                Time.sleepTicks((int)llIllllllI[2]);

            }
            String[] stringArray29 = new String[llIllllllI[0]];
            stringArray29[y.llIllllllI[1]] = llIllllIlI[llIllllllI[515]];
            if (y.lIllllIIlIIIl(Inventory.contains((String[])stringArray29) ? 1 : 0)) {
                String[] stringArray30 = new String[llIllllllI[0]];
                stringArray30[y.llIllllllI[1]] = llIllllIlI[llIllllllI[516]];
                TileObjects.getNearest((String[])stringArray30).interact(llIllllIlI[llIllllllI[517]]);
            }
        }
        WorldArea var94 = new WorldArea(llIllllllI[226], llIllllllI[227], llIllllllI[11], llIllllllI[11], llIllllllI[1]);
        WorldArea var95 = new WorldArea(llIllllllI[487], llIllllllI[518], llIllllllI[47], llIllllllI[28], llIllllllI[1]);
        WorldPoint var96 = new WorldPoint(llIllllllI[519], llIllllllI[217], llIllllllI[1]);
        WorldPoint var97 = new WorldPoint(llIllllllI[221], llIllllllI[222], llIllllllI[1]);
        if (y.lIllllIIlIIIl(var95.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && y.lIllllIIlIIll(var94.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && y.lIllllIIlIIll(var52.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            block106: {
                if (!y.lIllllIIllIll(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[153]) || y.lIllllIIllIII(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[154])) {
                    do {
                        String[] stringArray = new String[llIllllllI[0]];
                        stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[520]];
                        if (!y.lIllllIIlIIll(Inventory.contains((String[])stringArray) ? 1 : 0)) break block106;
                        String[] stringArray31 = new String[llIllllllI[0]];
                        stringArray31[y.llIllllllI[1]] = llIllllIlI[llIllllllI[521]];
                        if (!y.lIllllIIlIIll(Inventory.contains((String[])stringArray31) ? 1 : 0)) break block106;
                        var51 = new WorldPoint(llIllllllI[522], llIllllllI[252], llIllllllI[1]);
                        var50 = new WorldArea(llIllllllI[358], llIllllllI[239], llIllllllI[8], llIllllllI[11], llIllllllI[1]);
                        if (y.lIllllIIlIIll(var50.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderSotf.c = llIllllIlI[llIllllllI[523]];
                            Movement.walkTo((WorldPoint)var51);

                            Time.sleepTicks((int)llIllllllI[0]);

                        }
                        if (y.lIllllIIlIIIl(var50.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && y.lIllllIIlIIll(Dialog.isOpen() ? 1 : 0)) {
                            AccBuilderSotf.c = llIllllIlI[llIllllllI[524]];
                            String[] stringArray32 = new String[llIllllllI[0]];
                            stringArray32[y.llIllllllI[1]] = llIllllIlI[llIllllllI[525]];
                            if (y.lIllllIIlIIll(Inventory.contains((String[])stringArray32) ? 1 : 0) && y.lIllllIIlIIll(Dialog.isOpen() ? 1 : 0)) {
                                String[] stringArray33 = new String[llIllllllI[0]];
                                stringArray33[y.llIllllllI[1]] = llIllllIlI[llIllllllI[526]];
                                if (y.lIllllIIlIlIl(TileObjects.getNearest((String[])stringArray33))) {
                                    int[] nArray = new int[llIllllllI[0]];
                                    nArray[y.llIllllllI[1]] = llIllllllI[35];
                                    String[] stringArray34 = new String[llIllllllI[0]];
                                    stringArray34[y.llIllllllI[1]] = llIllllIlI[llIllllllI[527]];
                                    Inventory.getFirst((int[])nArray).useOn(TileObjects.getNearest((String[])stringArray34));
                                    Time.sleepTicks((int)llIllllllI[8]);

                                }
                            }
                            String[] stringArray35 = new String[llIllllllI[0]];
                            stringArray35[y.llIllllllI[1]] = llIllllIlI[llIllllllI[528]];
                            if (y.lIllllIIlIIll(Inventory.contains((String[])stringArray35) ? 1 : 0)) {
                                String[] stringArray36 = new String[llIllllllI[0]];
                                stringArray36[y.llIllllllI[1]] = llIllllIlI[llIllllllI[529]];
                                if (y.lIllllIIlIIIl(Inventory.contains((String[])stringArray36) ? 1 : 0)) {
                                    int[] nArray = new int[llIllllllI[0]];
                                    nArray[y.llIllllllI[1]] = llIllllllI[35];
                                    String[] stringArray37 = new String[llIllllllI[0]];
                                    stringArray37[y.llIllllllI[1]] = llIllllIlI[llIllllllI[530]];
                                    Inventory.getFirst((int[])nArray).useOn(TileObjects.getNearest((String[])stringArray37));
                                    Time.sleepTicks((int)llIllllllI[6]);

                                }
                            }
                        }
                        if (y.lIllllIIlIIIl(AccBuilderSotf.d ? 1 : 0)) {

                            if (((0x34 ^ 0x14) & ~(0x89 ^ 0xA9)) != 0) {
                                return;
                            }
                            break block106;
                        }
                        g.a(cE);
                        Time.sleepTicks((int)llIllllllI[0]);

                    } while (null == null);
                    return;
                }
            }
            if (y.lIllllIIlIIll(Players.getLocal().getWorldLocation().equals((Object)var97) ? 1 : 0)) {
                AccBuilderSotf.c = llIllllIlI[llIllllllI[531]];
                Movement.walkTo((WorldPoint)var97);

                Time.sleepTicks((int)llIllllllI[0]);

            }
            if (y.lIllllIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)var97) ? 1 : 0)) {
                AccBuilderSotf.c = llIllllIlI[llIllllllI[532]];
                String[] stringArray = new String[llIllllllI[0]];
                stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[533]];
                TileObjects.getNearest((String[])stringArray).interact(llIllllIlI[llIllllllI[534]]);
                Time.sleepTicks((int)llIllllllI[6]);

            }
        }
        var51 = new WorldArea(llIllllllI[177], llIllllllI[251], llIllllllI[11], llIllllllI[2], llIllllllI[0]);
        var50 = new WorldPoint(llIllllllI[535], llIllllllI[253], llIllllllI[0]);
        if (y.lIllllIIlIIIl(var51.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[536]];
            if (y.lIllllIIlIIll(Players.getLocal().getWorldLocation().equals((Object)var50) ? 1 : 0)) {
                Movement.walkTo((WorldPoint)var50);

                Time.sleepTicks((int)llIllllllI[0]);

            }
            if (y.lIllllIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)var50) ? 1 : 0)) {
                int[] nArray = new int[llIllllllI[0]];
                nArray[y.llIllllllI[1]] = llIllllllI[537];
                TileObjects.getNearest((int[])nArray).interact(llIllllIlI[llIllllllI[538]]);
                Time.sleepTicks((int)llIllllllI[6]);

            }
        }
        if (y.lIllllIIlIIIl((var49 = new WorldArea(llIllllllI[223], llIllllllI[252], llIllllllI[2], llIllllllI[13], llIllllllI[0])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[539]];
            if (y.lIllllIIlIIll(Players.getLocal().isMoving() ? 1 : 0) && y.lIllllIIllIII(Players.getLocal().getAnimation(), llIllllllI[54])) {
                String[] stringArray = new String[llIllllllI[0]];
                stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[540]];
                TileObjects.getNearest((String[])stringArray).interact(llIllllIlI[llIllllllI[541]]);
                Time.sleepTicks((int)llIllllllI[4]);

            }
        }
        if (y.lIllllIIllIII(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[73]) && y.lIllllIIlIIIl(var94.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && y.lIllllIIlIIll(var52.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[542]];
            int[] nArray = new int[llIllllllI[0]];
            nArray[y.llIllllllI[1]] = llIllllllI[35];
            String[] stringArray = new String[llIllllllI[0]];
            stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[543]];
            Inventory.getFirst((int[])nArray).useOn(TileObjects.getNearest((String[])stringArray));
            Time.sleepTicks((int)llIllllllI[8]);

        }
        if (y.lIllllIIlIlII(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), llIllllllI[74]) && y.lIllllIIlIIIl(var94.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            String[] stringArray = new String[llIllllllI[0]];
            stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[544]];
            TileObjects.getNearest((String[])stringArray).interact(llIllllIlI[llIllllllI[545]]);
            Time.sleepTicks((int)llIllllllI[6]);

        }
        if (y.lIllllIIlIIIl(var52.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && y.lIllllIIlIIll(Dialog.isOpen() ? 1 : 0)) {
            AccBuilderSotf.c = llIllllIlI[llIllllllI[546]];
            String[] stringArray = new String[llIllllllI[0]];
            stringArray[y.llIllllllI[1]] = llIllllIlI[llIllllllI[547]];
            if (y.lIllllIIlIlll(TileObjects.getNearest((String[])stringArray))) {
                String[] stringArray38 = new String[llIllllllI[0]];
                stringArray38[y.llIllllllI[1]] = llIllllIlI[llIllllllI[548]];
                TileObjects.getNearest((String[])stringArray38).interact(llIllllIlI[llIllllllI[549]]);
                Time.sleepTicks((int)llIllllllI[6]);

            }
            String[] stringArray39 = new String[llIllllllI[0]];
            stringArray39[y.llIllllllI[1]] = llIllllIlI[llIllllllI[550]];
            if (y.lIllllIIlIlIl(TileObjects.getNearest((String[])stringArray39))) {
                String[] stringArray40 = new String[llIllllllI[0]];
                stringArray40[y.llIllllllI[1]] = llIllllIlI[llIllllllI[551]];
                TileObjects.getNearest((String[])stringArray40).interact(llIllllIlI[llIllllllI[552]]);
                Time.sleepTicks((int)llIllllllI[6]);

            }
            String[] stringArray41 = new String[llIllllllI[0]];
            stringArray41[y.llIllllllI[1]] = llIllllIlI[llIllllllI[553]];
            if (y.lIllllIIlIlIl(TileObjects.getNearest((String[])stringArray41))) {
                String[] stringArray42 = new String[llIllllllI[0]];
                stringArray42[y.llIllllllI[1]] = llIllllIlI[llIllllllI[554]];
                TileObjects.getNearest((String[])stringArray42).interact(llIllllIlI[llIllllllI[555]]);
                Time.sleepTicks((int)llIllllllI[6]);

            }
            g.a(cE);
        }
        g.a(cE);
    }
}

