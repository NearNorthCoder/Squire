/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.GameState
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Skill
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.account.LocalPlayer
 *  net.unethicalite.api.commons.Rand
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.input.Mouse
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.GrandExchange
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 *  net.unethicalite.client.Static
 */
package gg.squire.sotf.steps;

import gg.squire.account.AccBuilderSotf;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.GameState;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.account.LocalPlayer;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.input.Mouse;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.GrandExchange;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;

/**
 * Temple Trekking Quest Step Handler
 *
 * Manages the Temple Trekking minigame automation:
 * - Detects and resolves random events (bridge repairs, bog navigation, combat)
 * - Escorts companions through Mort Myre Swamp
 * - Claims rewards (XP or resources)
 * - Handles banking and equipment
 * - Uses A* pathfinding for bog navigation
 *
 * Temple Trekking involves escorting NPCs from Burgh de Rott to Paterdomus.
 */
public class TempleTrekkingQuestStep
implements QuestStep {
    public static /* synthetic */ String currentStatus;
    static /* synthetic */ WorldPoint burghBankLoc;
    public static /* synthetic */ WorldPoint ghastEvadeLoc;
    static /* synthetic */ WorldPoint bogAnchor;
    
    public static /* synthetic */ List<CompanionData> companions;
    public static /* synthetic */ WorldArea canifisArea;
    public static /* synthetic */ int equipment;
    public static /* synthetic */ WorldArea ghastArea;
    public static /* synthetic */ int trekAttempts;
    public static /* synthetic */ boolean completed;
    public static /* synthetic */ int minHealth;
    public static /* synthetic */ int foodId;
    static /* synthetic */ WorldArea swampArea;
    public static /* synthetic */ WorldArea morttonArea;
    static /* synthetic */ int runCounter;
    public static /* synthetic */ int currentFood;
    static /* synthetic */ WorldPoint eventLoc;
    

    

    

    private static String decryptStr(String llllllllllllllllllIIIIIIIIIlIIII, String llllllllllllllllllIIIIIIIIIlIlII) {
        llllllllllllllllllIIIIIIIIIlIIII = new String(Base64.getDecoder().decode(llllllllllllllllllIIIIIIIIIlIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllIIIIIIIIIlIIll = new StringBuilder();
        char[] llllllllllllllllllIIIIIIIIIlIIlI = llllllllllllllllllIIIIIIIIIlIlII.toCharArray();
        int llllllllllllllllllIIIIIIIIIlIIIl = 0;
        char[] llllllllllllllllllIIIIIIIIIIlIll = llllllllllllllllllIIIIIIIIIlIIII.toCharArray();
        int llllllllllllllllllIIIIIIIIIIlIlI = llllllllllllllllllIIIIIIIIIIlIll.length;
        int llllllllllllllllllIIIIIIIIIIlIIl = 0;
        while (TempleTrekkingQuestStep.lessThan(llllllllllllllllllIIIIIIIIIIlIIl, llllllllllllllllllIIIIIIIIIIlIlI)) {
            char llllllllllllllllllIIIIIIIIIlIllI = llllllllllllllllllIIIIIIIIIIlIll[llllllllllllllllllIIIIIIIIIIlIIl];
            llllllllllllllllllIIIIIIIIIlIIll.append((char)(llllllllllllllllllIIIIIIIIIlIllI ^ llllllllllllllllllIIIIIIIIIlIIlI[llllllllllllllllllIIIIIIIIIlIIIl % llllllllllllllllllIIIIIIIIIlIIlI.length]));
            ++llllllllllllllllllIIIIIIIIIlIIIl;
            ++llllllllllllllllllIIIIIIIIIIlIIl;
            if (2 >= 2) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllllIIIIIIIIIlIIll);
    }

    

    public static void handleEvents() {
        Object llllllllllllllllllIIIIIIIllllIll;
        block116: {
            Object llllllllllllllllllIIIIIIIllllIlI;
            block117: {
                Object llllllllllllllllllIIIIIIIllllIII;
                Object llllllllllllllllllIIIIIIIllllIIl;
                block119: {
                    block118: {
                        block113: {
                            block115: {
                                block114: {
                                    block110: {
                                        block112: {
                                            block111: {
                                                block105: {
                                                    block109: {
                                                        block108: {
                                                            block107: {
                                                                block106: {
                                                                    Object llllllllllllllllllIIIIIIIlllllII;
                                                                    block104: {
                                                                        block103: {
                                                                            String[] stringArray = new String[1];
                                                                            stringArray[0] = "Yes.";
                                                                            DialogHelper.handleDialog(stringArray);
                                                                            TileObject tileObject2 = TileObjects.getNearest(tileObject -> {
                                                                                String[] stringArray = new String[1];
                                                                                stringArray[0] = "Read";
                                                                                return tileObject.hasAction(stringArray);
                                                                            });
                                                                            TileObject tileObject3 = TileObjects.getNearest(tileObject -> {
                                                                                String[] stringArray = new String[1];
                                                                                stringArray[0] = "Continue-trek";
                                                                                return tileObject.hasAction(stringArray);
                                                                            });
                                                                            if ((Widgets.get(0, (int)188)) && (tileObject2) != null && (tileObject3) != null && TempleTrekkingQuestStep.lessThan(tileObject2.distanceTo((Locatable)tileObject3), 8) && TempleTrekkingQuestStep.lessThan(trekAttempts, 5)) {
                                                                                bogAnchor = null;
                                                                                runCounter = 0;
                                                                                AccBuilderSotf.c = "Starting trek";
                                                                                Widget widget = Widgets.get((int)31149, (int)188);
                                                                                if ((widget != null) {
                                                                                    Mouse.click((int)widget.getClickPoint().getX(), (int)widget.getClickPoint().getY(), true);
                                                                                    Time.sleepUntil(() -> {
                                                                                        boolean bl;
                                                                                        if ((Widgets.fromId(0) == null))) {
                                                                                            bl = 1;
                                                                                            if (null != null) {
                                                                                                return ((0xC9 ^ 0x8C) & ~(0x87 ^ 0xC2)) !=
                                                                                            }
                                                                                        } else {
                                                                                            bl = 0;
                                                                                        }
                                                                                        return bl;
                                                                                    }, (int)0, (int)0);
                                                                                    trekAttempts += 1;
                                                                                }
                                                                            }
                                                                            String[] stringArray2 = new String[1];
                                                                            stringArray2[0] = "";
                                                                            if (!(NPCs.getNearest((String[]) == nullstringArray2))) break block103;
                                                                            String[] stringArray3 = new String[1];
                                                                            stringArray3[0] = "";
                                                                            if (!(NPCs.getNearest((String[]) == nullstringArray3))) break block103;
                                                                            String[] stringArray4 = new String[1];
                                                                            stringArray4[0] = "";
                                                                            if (!(NPCs.getNearest((String[]) == nullstringArray4))) break block103;
                                                                            String[] stringArray5 = new String[1];
                                                                            stringArray5[0] = "";
                                                                            if (!(NPCs.getNearest((String[]) == nullstringArray5))) break block103;
                                                                            String[] stringArray6 = new String[1];
                                                                            stringArray6[0] = "";
                                                                            if (!(NPCs.getNearest((String[]) == nullstringArray6))) break block103;
                                                                            String[] stringArray7 = new String[1];
                                                                            stringArray7[0] = "";
                                                                            if ((NPCs.getNearest((String[]) == nullstringArray7)) && (!(TileObjects.getNearest(tileObject -> tileObject.getName() == null.contains(""))) || !(TileObjects.getNearest(tileObject -> tileObject.getName() == null.contains(""))))) break block104;
                                                                        }
                                                                        if (TempleTrekkingQuestStep.greaterThan(Players.getLocal().getWorldLocation().distanceTo(RouteHelper.BURGH_LOCATION), 22)) {
                                                                            String[] stringArray = new String[1];
                                                                            stringArray[0] = "Bog";
                                                                            if ((TileObjects.getNearest((String[]) == nullstringArray))) {
                                                                                bogAnchor = null;
                                                                                AccBuilderSotf.c = "";
                                                                                llllllllllllllllllIIIIIIIlllllII = tileObject -> {
                                                                                    String[] stringArray = new String[1];
                                                                                    stringArray[0] = "Evade-event";
                                                                                    return tileObject.hasAction(stringArray);
                                                                                };
                                                                                llllllllllllllllllIIIIIIIllllIll = TileObjects.getNearest((Predicate)llllllllllllllllllIIIIIIIlllllII);
                                                                                if ((llllllllllllllllllIIIIIIIllllIll != null) {
                                                                                    llllllllllllllllllIIIIIIIllllIll.interact("");
                                                                                    Time.sleepUntil(() -> {
                                                                                        boolean bl;
                                                                                        if (TempleTrekkingQuestStep.isFalse(LocalPlayer.get().isMoving() ? 1 : 0)) {
                                                                                            bl = 1;
                                                                                        } else {
                                                                                            bl = 0;
                                                                                        }
                                                                                        return bl;
                                                                                    }, (int)Rand.nextInt((int)0, (int)0));
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    String[] stringArray = new String[1];
                                                                    stringArray[0] = "";
                                                                    if ((NPCs.getNearest((String[]) != nullstringArray)) && TempleTrekkingQuestStep.isFalse(ghastArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && TempleTrekkingQuestStep.greaterThan(Players.getLocal().getWorldLocation().distanceTo(ghastEvadeLoc), 0)) {
                                                                        AccBuilderSotf.c = "";
                                                                        llllllllllllllllllIIIIIIIlllllII = tileObject -> {
                                                                            String[] stringArray = new String[1];
                                                                            stringArray[0] = "Evade-event";
                                                                            return tileObject.hasAction(stringArray);
                                                                        };
                                                                        llllllllllllllllllIIIIIIIllllIll = TileObjects.getNearest((Predicate)llllllllllllllllllIIIIIIIlllllII);
                                                                        if ((llllllllllllllllllIIIIIIIllllIll != null) {
                                                                            llllllllllllllllllIIIIIIIllllIll.interact("");
                                                                            Time.sleepUntil(() -> {
                                                                                boolean bl;
                                                                                if (TempleTrekkingQuestStep.isFalse(LocalPlayer.get().isMoving() ? 1 : 0)) {
                                                                                    bl = 1;
                                                                                } else {
                                                                                    bl = 0;
                                                                                }
                                                                                return bl;
                                                                            }, (int)Rand.nextInt((int)0, (int)0));
                                                                        }
                                                                    }
                                                                    llllllllllllllllllIIIIIIIlllllII = TileObjects.getNearest(tileObject -> tileObject.getName().contains("bridge"));
                                                                    String[] stringArray8 = new String[1];
                                                                    stringArray8[0] = "Broken bridge";
                                                                    if (!(TileObjects.getNearest((String[]) != nullstringArray8))) break block105;
                                                                    bogAnchor = null;
                                                                    AccBuilderSotf.c = "";
                                                                    String[] stringArray9 = new String[1];
                                                                    stringArray9[0] = "Dead tree";
                                                                    if ((TileObjects.getNearest((String[]) == nullstringArray9))) {
                                                                        String[] stringArray10 = new String[1];
                                                                        stringArray10[0] = "Plank";
                                                                        llllllllllllllllllIIIIIIIllllIll = TileItems.getNearest((String[])stringArray10);
                                                                        if ((llllllllllllllllllIIIIIIIllllIll != null) {
                                                                            llllllllllllllllllIIIIIIIllllIll.interact("Take");
                                                                            Time.sleepTicks((int)1);
                                                                        }
                                                                        if ((llllllllllllllllllIIIIIIIllllIlI = TileItems.getNearest(tileItem -> tileItem.getName() != null.contains("")))) {
                                                                            // empty if block
                                                                        }
                                                                        String[] stringArray11 = new String[1];
                                                                        stringArray11[0] = "Undead Lumberjack";
                                                                        llllllllllllllllllIIIIIIIllllIIl = NPCs.getNearest((String[])stringArray11);
                                                                        if ((llllllllllllllllllIIIIIIIllllIIl) != null && TempleTrekkingQuestStep.notEquals(LocalPlayer.get().getInteracting(), llllllllllllllllllIIIIIIIllllIIl) && (llllllllllllllllllIIIIIIIllllIll) == null && TempleTrekkingQuestStep.isFalse(llllllllllllllllllIIIIIIIllllIIl.isDead() ? 1 : 0) && TempleTrekkingQuestStep.isTrue(Reachable.isInteractable((Locatable)llllllllllllllllllIIIIIIIllllIIl) ? 1 : 0)) {
                                                                            llllllllllllllllllIIIIIIIllllIIl.interact("Attack");
                                                                            Time.sleepTicks((int)1);
                                                                        }
                                                                    }
                                                                    String[] stringArray12 = new String[1];
                                                                    stringArray12[0] = "Logs";
                                                                    if (!TempleTrekkingQuestStep.isTrue(Inventory.contains((String[])stringArray12) ? 1 : 0)) break block106;
                                                                    String[] stringArray13 = new String[1];
                                                                    stringArray13[0] = "";
                                                                    if (!TempleTrekkingQuestStep.lessThan(Inventory.getAll((String[])stringArray13).size(), 3)) break block107;
                                                                }
                                                                String[] stringArray = new String[1];
                                                                stringArray[0] = "";
                                                                if ((TileObjects.getNearest((String[]) != nullstringArray)) && TempleTrekkingQuestStep.equals(Players.getLocal().getAnimation(), -1)) {
                                                                    String[] stringArray14 = new String[1];
                                                                    stringArray14[0] = "";
                                                                    TileObjects.getNearest((String[])stringArray14).interact("Chop down");
                                                                    Time.sleepTicks((int)2);
                                                                }
                                                            }
                                                            String[] stringArray = new String[1];
                                                            stringArray[0] = "";
                                                            if (!TempleTrekkingQuestStep.lessThan(Inventory.getAll((String[])stringArray).size(), 3)) break block108;
                                                            String[] stringArray15 = new String[1];
                                                            stringArray15[0] = "";
                                                            if (!TempleTrekkingQuestStep.greaterEq(Inventory.getAll((String[])stringArray15).size(), 3)) break block109;
                                                        }
                                                        String[] stringArray = new String[1];
                                                        stringArray[0] = "";
                                                        if (TempleTrekkingQuestStep.isTrue(Inventory.contains((String[])stringArray) ? 1 : 0) && TempleTrekkingQuestStep.equals(Players.getLocal().getAnimation(), -1)) {
                                                            String[] stringArray16 = new String[1];
                                                            stringArray16[0] = "";
                                                            String[] stringArray17 = new String[1];
                                                            stringArray17[0] = "";
                                                            Inventory.getFirst((String[])stringArray16).useOn(TileObjects.getNearest((String[])stringArray17));
                                                            Time.sleepTicks((int)2);
                                                        }
                                                        String[] stringArray18 = new String[1];
                                                        stringArray18[0] = "";
                                                        if (TempleTrekkingQuestStep.isTrue(Inventory.contains((String[])stringArray18) ? 1 : 0) && TempleTrekkingQuestStep.equals(Players.getLocal().getAnimation(), -1)) {
                                                            String[] stringArray19 = new String[1];
                                                            stringArray19[0] = "";
                                                            String[] stringArray20 = new String[1];
                                                            stringArray20[0] = "";
                                                            Inventory.getFirst((String[])stringArray19).useOn(TileObjects.getNearest((String[])stringArray20));
                                                            Time.sleepTicks((int)2);
                                                        }
                                                    }
                                                    String[] stringArray = new String[1];
                                                    stringArray[0] = "Yes.";
                                                    DialogHelper.handleDialog(stringArray);
                                                }
                                                String[] stringArray = new String[1];
                                                stringArray[0] = "";
                                                if (!(TileObjects.getNearest((String[]) != nullstringArray))) break block110;
                                                AccBuilderSotf.c = "";
                                                String[] stringArray21 = new String[1];
                                                stringArray21[0] = "";
                                                if (TempleTrekkingQuestStep.isFalse(Inventory.contains((String[])stringArray21) ? 1 : 0) && TempleTrekkingQuestStep.equals(Players.getLocal().getAnimation(), -1)) {
                                                    String[] stringArray22 = new String[1];
                                                    stringArray22[0] = "";
                                                    if ((TileObjects.getNearest((String[]) != nullstringArray22))) {
                                                        String[] stringArray23 = new String[1];
                                                        stringArray23[0] = "";
                                                        TileObjects.getNearest((String[])stringArray23).interact("Chop down");
                                                        Time.sleepTicks((int)2);
                                                    }
                                                }
                                                String[] stringArray24 = new String[1];
                                                stringArray24[0] = "";
                                                if (!TempleTrekkingQuestStep.isFalse(Inventory.contains((String[])stringArray24) ? 1 : 0)) break block111;
                                                String[] stringArray25 = new String[1];
                                                stringArray25[0] = "";
                                                if (!TempleTrekkingQuestStep.isTrue(Inventory.contains((String[])stringArray25) ? 1 : 0)) break block112;
                                            }
                                            String[] stringArray = new String[1];
                                            stringArray[0] = "";
                                            if (TempleTrekkingQuestStep.isTrue(Inventory.contains((String[])stringArray) ? 1 : 0) && TempleTrekkingQuestStep.equals(Players.getLocal().getAnimation(), -1)) {
                                                String[] stringArray26 = new String[1];
                                                stringArray26[0] = "";
                                                String[] stringArray27 = new String[1];
                                                stringArray27[0] = "";
                                                Inventory.getFirst((String[])stringArray26).useOn(TileObjects.getNearest((String[])stringArray27));
                                                Time.sleepTicks((int)2);
                                            }
                                            String[] stringArray28 = new String[1];
                                            stringArray28[0] = "";
                                            if (TempleTrekkingQuestStep.isTrue(Inventory.contains((String[])stringArray28) ? 1 : 0) && TempleTrekkingQuestStep.equals(Players.getLocal().getAnimation(), -1)) {
                                                String[] stringArray29 = new String[1];
                                                stringArray29[0] = "";
                                                String[] stringArray30 = new String[1];
                                                stringArray30[0] = "";
                                                Inventory.getFirst((String[])stringArray29).useOn(TileObjects.getNearest((String[])stringArray30));
                                                Time.sleepTicks((int)2);
                                            }
                                            String[] stringArray31 = new String[1];
                                            stringArray31[0] = "";
                                            TileObjects.getNearest((String[])stringArray31).interact("Inspect");
                                            Time.sleepTicks((int)2);
                                        }
                                        String[] stringArray = new String[1];
                                        stringArray[0] = "Yes.";
                                        DialogHelper.handleDialog(stringArray);
                                    }
                                    String[] stringArray = new String[1];
                                    stringArray[0] = "";
                                    if (!(TileObjects.getNearest((String[]) != nullstringArray))) break block113;
                                    AccBuilderSotf.c = "";
                                    String[] stringArray32 = new String[1];
                                    stringArray32[0] = "";
                                    if (TempleTrekkingQuestStep.isFalse(Inventory.contains((String[])stringArray32) ? 1 : 0) && TempleTrekkingQuestStep.equals(Players.getLocal().getAnimation(), -1)) {
                                        String[] stringArray33 = new String[1];
                                        stringArray33[0] = "";
                                        if ((TileObjects.getNearest((String[]) != nullstringArray33))) {
                                            String[] stringArray34 = new String[1];
                                            stringArray34[0] = "";
                                            TileObjects.getNearest((String[])stringArray34).interact("Chop down");
                                            Time.sleepTicks((int)2);
                                        }
                                    }
                                    String[] stringArray35 = new String[1];
                                    stringArray35[0] = "";
                                    if (!TempleTrekkingQuestStep.isFalse(Inventory.contains((String[])stringArray35) ? 1 : 0)) break block114;
                                    String[] stringArray36 = new String[1];
                                    stringArray36[0] = "";
                                    if (!TempleTrekkingQuestStep.isTrue(Inventory.contains((String[])stringArray36) ? 1 : 0)) break block115;
                                }
                                String[] stringArray = new String[1];
                                stringArray[0] = "";
                                if (TempleTrekkingQuestStep.isTrue(Inventory.contains((String[])stringArray) ? 1 : 0) && TempleTrekkingQuestStep.equals(Players.getLocal().getAnimation(), -1)) {
                                    String[] stringArray37 = new String[1];
                                    stringArray37[0] = "";
                                    String[] stringArray38 = new String[1];
                                    stringArray38[0] = "";
                                    Inventory.getFirst((String[])stringArray37).useOn(TileObjects.getNearest((String[])stringArray38));
                                    Time.sleepTicks((int)2);
                                }
                                String[] stringArray39 = new String[1];
                                stringArray39[0] = "";
                                if (TempleTrekkingQuestStep.isTrue(Inventory.contains((String[])stringArray39) ? 1 : 0) && TempleTrekkingQuestStep.equals(Players.getLocal().getAnimation(), -1)) {
                                    String[] stringArray40 = new String[1];
                                    stringArray40[0] = "";
                                    String[] stringArray41 = new String[1];
                                    stringArray41[0] = "";
                                    Inventory.getFirst((String[])stringArray40).useOn(TileObjects.getNearest((String[])stringArray41));
                                    Time.sleepTicks((int)2);
                                }
                                String[] stringArray42 = new String[1];
                                stringArray42[0] = "";
                                TileObjects.getNearest((String[])stringArray42).interact("Inspect");
                                Time.sleepTicks((int)2);
                            }
                            String[] stringArray = new String[1];
                            stringArray[0] = "Yes.";
                            DialogHelper.handleDialog(stringArray);
                        }
                        String[] stringArray = new String[1];
                        stringArray[0] = "";
                        if ((TileObjects.getNearest((String[]) != nullstringArray))) {
                            String[] stringArray43 = new String[1];
                            stringArray43[0] = "Path";
                            llllllllllllllllllIIIIIIIllllIll = TileObjects.getAll((String[])stringArray43);
                            llllllllllllllllllIIIIIIIllllIlI = llllllllllllllllllIIIIIIIllllIll.stream().filter(tileObject -> {
                                String[] stringArray = new String[1];
                                stringArray[0] = "Continue-trek";
                                return tileObject.hasAction(stringArray);
                            }).collect(Collectors.toList());
                            llllllllllllllllllIIIIIIIllllIIl = null;
                            llllllllllllllllllIIIIIIIllllIII = TileObjects.getNearest(tileObject -> {
                                int n2;
                                String[] stringArray = new String[1];
                                stringArray[0] = "Cross";
                                if (TempleTrekkingQuestStep.isTrue(tileObject.hasAction(stringArray) ? 1 : 0) && TempleTrekkingQuestStep.isTrue(tileObject.getName().equals("Fixed bridge") ? 1 : 0)) {
                                    n2 = 1;
                                    if (-1 > (0x6D ^ 0x69)) {
                                        return ((0x52 ^ 0xC) & ~(0x4A ^ 0x14)) !=
                                    }
                                } else {
                                    n2 = 0;
                                }
                                return n2 !=
                            });
                            if ((llllllllllllllllllIIIIIIIllllIII != null) {
                                if (TempleTrekkingQuestStep.greaterEq(Players.getLocal().getWorldX(), llllllllllllllllllIIIIIIIllllIII.getWorldX())) {
                                    llllllllllllllllllIIIIIIIllllIIl = TileObjects.getNearest(tileObject -> {
                                        String[] stringArray = new String[1];
                                        stringArray[0] = "";
                                        return tileObject.hasAction(stringArray);
                                    });
                                    if ((llllllllllllllllllIIIIIIIllllIIl != null) {
                                        AccBuilderSotf.c = "";
                                        llllllllllllllllllIIIIIIIllllIIl.interact("Continue-trek");
                                        Time.sleepTicks((int)UtilHelper.randomInt(3, 5));
                                    }
                                } else {
                                    AccBuilderSotf.c = "";
                                    llllllllllllllllllIIIIIIIllllIII.interact("Cross");
                                    Time.sleepTicks((int)4);
                                }
                            }
                        }
                        String[] stringArray44 = new String[1];
                        stringArray44[0] = "";
                        if (!(TileObjects.getNearest((String[]) != nullstringArray44))) break block116;
                        bogAnchor = null;
                        String[] stringArray45 = new String[1];
                        stringArray45[0] = "Path";
                        llllllllllllllllllIIIIIIIllllIll = TileObjects.getAll((String[])stringArray45);
                        llllllllllllllllllIIIIIIIllllIlI = llllllllllllllllllIIIIIIIllllIll.stream().filter(tileObject -> {
                            String[] stringArray = new String[1];
                            stringArray[0] = "";
                            return tileObject.hasAction(stringArray);
                        }).collect(Collectors.toList());
                        if (!TempleTrekkingQuestStep.isFalse(llllllllllllllllllIIIIIIIllllIlI.isEmpty() ? 1 : 0)) break block116;
                        if (!TempleTrekkingQuestStep.isFalse(Reachable.isInteractable((Locatable)((Locatable)llllllllllllllllllIIIIIIIllllIlI.get(0))) ? 1 : 0)) break block117;
                        String[] stringArray46 = new String[1];
                        stringArray46[0] = "";
                        if (!TempleTrekkingQuestStep.isTrue(Inventory.contains((String[])stringArray46) ? 1 : 0)) break block118;
                        String[] stringArray47 = new String[1];
                        stringArray47[0] = "";
                        if (!TempleTrekkingQuestStep.lessThan(Inventory.getAll((String[])stringArray47).size(), 3)) break block119;
                    }
                    AccBuilderSotf.c = "";
                    String[] stringArray = new String[1];
                    stringArray[0] = "";
                    llllllllllllllllllIIIIIIIllllIIl = TileObjects.getAll((String[])stringArray);
                    llllllllllllllllllIIIIIIIllllIII = llllllllllllllllllIIIIIIIllllIIl.stream().filter(tileObject -> {
                        String[] stringArray = new String[1];
                        stringArray[0] = "";
                        return tileObject.hasAction(stringArray);
                    }).collect(Collectors.toList());
                    if (TempleTrekkingQuestStep.isFalse(llllllllllllllllllIIIIIIIllllIII.isEmpty() ? 1 : 0)) {
                        ((TileObject)llllllllllllllllllIIIIIIIllllIII.get(0)).interact("Cut-vine");
                        Time.sleepTicks((int)2);
                    }
                }
                String[] stringArray = new String[1];
                stringArray[0] = "";
                if (TempleTrekkingQuestStep.isTrue(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray48 = new String[1];
                    stringArray48[0] = "";
                    if (TempleTrekkingQuestStep.greaterEq(Inventory.getAll((String[])stringArray48).size(), 3)) {
                        String[] stringArray49 = new String[1];
                        stringArray49[0] = "";
                        String[] stringArray50 = new String[1];
                        stringArray50[0] = "";
                        Inventory.getFirst((String[])stringArray49).useOn((Item)Inventory.getAll((String[])stringArray50).get(1));
                    }
                }
                String[] stringArray51 = new String[1];
                stringArray51[0] = "";
                if (TempleTrekkingQuestStep.isTrue(Inventory.contains((String[])stringArray51) ? 1 : 0)) {
                    String[] stringArray52 = new String[1];
                    stringArray52[0] = "";
                    int[] nArray = new int[1];
                    nArray[0] = 0;
                    Inventory.getFirst((String[])stringArray52).useOn(TileObjects.getNearest((int[])nArray));
                    Time.sleepTicks((int)6);
                }
                String[] stringArray53 = new String[1];
                stringArray53[0] = "";
                llllllllllllllllllIIIIIIIllllIIl = TileObjects.getAll((String[])stringArray53);
                llllllllllllllllllIIIIIIIllllIII = llllllllllllllllllIIIIIIIllllIIl.stream().filter(tileObject -> {
                    String[] stringArray = new String[1];
                    stringArray[0] = "";
                    return tileObject.hasAction(stringArray);
                }).collect(Collectors.toList());
                if (TempleTrekkingQuestStep.isFalse(llllllllllllllllllIIIIIIIllllIII.isEmpty() ? 1 : 0)) {
                    ((TileObject)llllllllllllllllllIIIIIIIllllIII.get(0)).interact("Swing-from");
                    Time.sleepTicks((int)6);
                }
            }
            if (TempleTrekkingQuestStep.isTrue(Reachable.isInteractable((Locatable)((Locatable)llllllllllllllllllIIIIIIIllllIlI.get(0))) ? 1 : 0)) {
                AccBuilderSotf.c = "";
                ((TileObject)llllllllllllllllllIIIIIIIllllIlI.get(0)).interact("Continue-trek");
                Time.sleepTicks((int)UtilHelper.randomInt(3, 5));
            }
        }
        String[] stringArray = new String[1];
        stringArray[0] = "Bog";
        if ((TileObjects.getNearest((String[]) != nullstringArray))) {
            block102: {
                AccBuilderSotf.c = "";
                System.out.println("");
                llllllllllllllllllIIIIIIIllllIll = new ArrayList();
                long llllllllllllllllllIIIIIIIllllIlI = System.currentTimeMillis();
                do {
                    WorldPoint llllllllllllllllllIIIIIIIlllIIIl;
                    Object llllllllllllllllllIIIIIIIlllIIlI;
                    List<WorldPoint> llllllllllllllllllIIIIIIIlllIIll;
                    int llllllllllllllllllIIIIIIIlllIlII;
                    int llllllllllllllllllIIIIIIIlllIlIl;
                    List<WorldPoint> llllllllllllllllllIIIIIIIlllIllI;
                    TileObject llllllllllllllllllIIIIIIIlllIlll;
                    String[] stringArray54 = new String[1];
                    stringArray54[0] = "";
                    if (!TempleTrekkingQuestStep.isFalse(TileObjects.getAll((String[])stringArray54).isEmpty() ? 1 : 0) || !TempleTrekkingQuestStep.same(Game.getState(), GameState.LOGGED_IN) || !!AccBuilderSotf.CompanionData ) break block102;
                    int llllllllllllllllllIIIIIIIllllIII = 0;
                    if (TempleTrekkingQuestStep.isTrue(llllllllllllllllllIIIIIIIllllIll.isEmpty() ? 1 : 0)) {
                        Time.sleepTicks((int)6);
                        System.out.println("");
                        llllllllllllllllllIIIIIIIllllIll = TileObjects.getAll(tileObject -> {
                            boolean bl;
                            if (TempleTrekkingQuestStep.equals(tileObject.getId(), 0)) {
                                bl = 1;
                                if (((0x5A ^ 0x5F ^ (0xE8 ^ 0xC5) & ~(0xF ^ 0x22)) & (0x67 ^ 0x4E ^ (0xEC ^ 0xC0) ^ -1)) != 0) {
                                    return ((0x46 ^ 0x7D ^ (0xBA ^ 0x91)) & (164 + 38 - 195 + 183 ^ 104 + 128 - 220 + 162 ^ -1)) !=
                                }
                            } else {
                                bl = 0;
                            }
                            return bl;
                        });
                        System.out.println("");
                        String[] stringArray55 = new String[1];
                        stringArray55[0] = "Path";
                        bogAnchor = TileObjects.getNearest((String[])stringArray55).getWorldLocation();
                        llllllllllllllllllIIIIIIIlllIlll = TileObjects.getNearest(tileObject -> {
                            int n2;
                            if (TempleTrekkingQuestStep.isTrue(tileObject.getName().contains("Path") ? 1 : 0)) {
                                String[] stringArray = new String[1];
                                stringArray[0] = "Continue-trek";
                                if (TempleTrekkingQuestStep.isTrue(tileObject.hasAction(stringArray) ? 1 : 0)) {
                                    n2 = 1;
                                    if (((0xF1 ^ 0xC6) & ~(0x1E ^ 0x29)) == 0) return n2 !=
                                    return ((0x86 ^ 0xC3) & ~(0x2C ^ 0x69)) !=
                                }
                            }
                            n2 = 0;
                            return n2 !=
                        });
                        if ((llllllllllllllllllIIIIIIIlllIlll) != null && TempleTrekkingQuestStep.greaterThan(llllllllllllllllllIIIIIIIlllIlll.getWorldLocation().getY(), bogAnchor.getY() + 9)) {
                            llllllllllllllllllIIIIIIIllllIII = 1;
                        }
                    }
                    System.out.println("Version: " + (llllllllllllllllllIIIIIIIllllIII != 0));
                    if (TempleTrekkingQuestStep.isFalse(llllllllllllllllllIIIIIIIllllIII)) {
                        if ((bogAnchor) != null && TempleTrekkingQuestStep.greaterThan(Players.getLocal().getWorldLocation().getY(), bogAnchor.getY() - 9)) {
                            llllllllllllllllllIIIIIIIlllIlll = llllllllllllllllllIIIIIIIllllIll.stream().map(tileObject -> tileObject.getWorldLocation()).collect(Collectors.toList());
                            WorldPoint[] worldPointArray = new WorldPoint[10];
                            worldPointArray[0] = new WorldPoint(bogAnchor.getX() - 5, bogAnchor.getY() - 4, bogAnchor.getPlane());
                            worldPointArray[1] = new WorldPoint(bogAnchor.getX() - 4, bogAnchor.getY() - 4, bogAnchor.getPlane());
                            worldPointArray[2] = new WorldPoint(bogAnchor.getX() - 3, bogAnchor.getY() - 4, bogAnchor.getPlane());
                            worldPointArray[3] = new WorldPoint(bogAnchor.getX() - 2, bogAnchor.getY() - 4, bogAnchor.getPlane());
                            worldPointArray[4] = new WorldPoint(bogAnchor.getX() - 1, bogAnchor.getY() - 4, bogAnchor.getPlane());
                            worldPointArray[5] = new WorldPoint(bogAnchor.getX(), bogAnchor.getY() - 4, bogAnchor.getPlane());
                            worldPointArray[6] = new WorldPoint(bogAnchor.getX() + 1, bogAnchor.getY() - 4, bogAnchor.getPlane());
                            worldPointArray[7] = new WorldPoint(bogAnchor.getX() + 2, bogAnchor.getY() - 4, bogAnchor.getPlane());
                            worldPointArray[8] = new WorldPoint(bogAnchor.getX() + 3, bogAnchor.getY() - 4, bogAnchor.getPlane());
                            worldPointArray[9] = new WorldPoint(bogAnchor.getX() + 4, bogAnchor.getY() - 4, bogAnchor.getPlane());
                            llllllllllllllllllIIIIIIIlllIllI = Arrays.asList(worldPointArray);
                            System.out.println("Start tiles: " + llllllllllllllllllIIIIIIIlllIllI.size());
                            llllllllllllllllllIIIIIIIlllIlIl = 0;
                            llllllllllllllllllIIIIIIIlllIlII = 0;
                            while (TempleTrekkingQuestStep.lessThan(llllllllllllllllllIIIIIIIlllIlII, llllllllllllllllllIIIIIIIlllIllI.size())) {
                                AccBuilderSotf.c = "";
                                llllllllllllllllllIIIIIIIlllIIll = TempleTrekkingQuestStep.a(llllllllllllllllllIIIIIIIlllIllI.get(llllllllllllllllllIIIIIIIlllIlII), bogAnchor.getY() - 9, (List<WorldPoint>)llllllllllllllllllIIIIIIIlllIlll);
                                if (TempleTrekkingQuestStep.isFalse(llllllllllllllllllIIIIIIIlllIIll.isEmpty() ? 1 : 0)) {
                                    System.out.println("");
                                    llllllllllllllllllIIIIIIIlllIIlI = llllllllllllllllllIIIIIIIlllIIll.iterator();
                                    while (TempleTrekkingQuestStep.isTrue(llllllllllllllllllIIIIIIIlllIIlI.hasNext() ? 1 : 0)) {
                                        llllllllllllllllllIIIIIIIlllIIIl = llllllllllllllllllIIIIIIIlllIIlI.next();
                                        System.out.println("(" + llllllllllllllllllIIIIIIIlllIIIl.getX() + ", " + llllllllllllllllllIIIIIIIlllIIIl.getY() + ", " + llllllllllllllllllIIIIIIIlllIIIl.getPlane() + ")");
                                        if ((0x97 ^ 0xB6 ^ (0x7A ^ 0x5F)) != 3) continue;
                                        return;
                                    }
                                    llllllllllllllllllIIIIIIIlllIlIl = 1;
                                    while (TempleTrekkingQuestStep.isTrue(llllllllllllllllllIIIIIIIlllIlIl) && TempleTrekkingQuestStep.isFalse(llllllllllllllllllIIIIIIIlllIIll.isEmpty() ? 1 : 0)) {
                                        if (TempleTrekkingQuestStep.isFalse(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllllllIIIIIIIlllIIll.get(0)) ? 1 : 0)) {
                                            if (TempleTrekkingQuestStep.greaterThan(Players.getLocal().getWorldLocation().getY(), bogAnchor.getY() - 4)) {
                                                AccBuilderSotf.c = "";
                                                e.c(llllllllllllllllllIIIIIIIlllIIll.get(0));
                                                Time.sleepUntil(() -> {
                                                    boolean bl;
                                                    if (TempleTrekkingQuestStep.greaterThan(Players.getLocal().getWorldLocation().getY(), bogAnchor.getY() - 4)) {
                                                        bl = 1;
                                                    } else {
                                                        bl = 0;
                                                    }
                                                    return bl;
                                                }, (int)UtilHelper.randomInt(0, 0));
                                                Time.sleepTicks((int)2);
                                            } else {
                                                AccBuilderSotf.c = "";
                                                String[] stringArray56 = new String[1];
                                                stringArray56[0] = "";
                                                llllllllllllllllllIIIIIIIlllIIlI = TileObjects.getAt((WorldPoint)llllllllllllllllllIIIIIIIlllIIll.get(0), (String[])stringArray56);
                                                if (TempleTrekkingQuestStep.isFalse(llllllllllllllllllIIIIIIIlllIIlI.isEmpty() ? 1 : 0)) {
                                                    System.out.println("Bog size: " + llllllllllllllllllIIIIIIIlllIIlI.size());
                                                    ((TileObject)llllllllllllllllllIIIIIIIlllIIlI.get(0)).interact("Stand-on");
                                                    Time.sleepTicks((int)2);
                                                }
                                                if (TempleTrekkingQuestStep.isTrue(llllllllllllllllllIIIIIIIlllIIlI.isEmpty() ? 1 : 0)) {
                                                    System.out.println("Bog is null at: " + String.valueOf(llllllllllllllllllIIIIIIIlllIIll.get(0)));
                                                    Game.logout();
                                                    Time.sleepTicks((int)2);
                                                    if (-(0x78 ^ 0x60 ^ (7 ^ 0x1A)) < 0) break;
                                                    return;
                                                }
                                            }
                                        }
                                        if (TempleTrekkingQuestStep.isTrue(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllllllIIIIIIIlllIIll.get(0)) ? 1 : 0)) {
                                            System.out.println("");
                                            llllllllllllllllllIIIIIIIlllIIll.remove(0);
                                            Time.sleepTicks((int)2);
                                        }
                                        Time.sleepTicks((int)1);
                                        
                                    }
                                    if (!TempleTrekkingQuestStep.notEquals(Game.getState(), GameState.LOGGED_IN)) break;
                                    System.out.println("");
                                    if (2 == 2) break;
                                    return;
                                }
                                ++llllllllllllllllllIIIIIIIlllIlII;
                                if (((6 ^ 0x38) & ~(0x88 ^ 0xB6)) == 0) continue;
                                return;
                            }
                            if (TempleTrekkingQuestStep.isFalse(llllllllllllllllllIIIIIIIlllIlIl)) {
                                System.out.println("");
                            }
                            System.out.println(llllllllllllllllllIIIIIIIllllIll.size());
                        }
                        if ((bogAnchor) != null && TempleTrekkingQuestStep.lessEq(Players.getLocal().getWorldLocation().getY(), bogAnchor.getY() - 9)) {
                            AccBuilderSotf.c = "";
                            String[] stringArray57 = new String[1];
                            stringArray57[0] = "";
                            TileObjects.getNearest((String[])stringArray57).interact("");
                            Time.sleepTicks((int)4);
                        }
                    }
                    if (TempleTrekkingQuestStep.isTrue(llllllllllllllllllIIIIIIIllllIII)) {
                        if ((bogAnchor) != null && TempleTrekkingQuestStep.lessThan(Players.getLocal().getWorldLocation().getY(), bogAnchor.getY() + 9)) {
                            llllllllllllllllllIIIIIIIlllIlll = llllllllllllllllllIIIIIIIllllIll.stream().map(tileObject -> tileObject.getWorldLocation()).collect(Collectors.toList());
                            WorldPoint[] worldPointArray = new WorldPoint[10];
                            worldPointArray[0] = new WorldPoint(bogAnchor.getX() - 5, bogAnchor.getY() + 4, bogAnchor.getPlane());
                            worldPointArray[1] = new WorldPoint(bogAnchor.getX() - 4, bogAnchor.getY() + 4, bogAnchor.getPlane());
                            worldPointArray[2] = new WorldPoint(bogAnchor.getX() - 3, bogAnchor.getY() + 4, bogAnchor.getPlane());
                            worldPointArray[3] = new WorldPoint(bogAnchor.getX() - 2, bogAnchor.getY() + 4, bogAnchor.getPlane());
                            worldPointArray[4] = new WorldPoint(bogAnchor.getX() - 1, bogAnchor.getY() + 4, bogAnchor.getPlane());
                            worldPointArray[5] = new WorldPoint(bogAnchor.getX(), bogAnchor.getY() + 4, bogAnchor.getPlane());
                            worldPointArray[6] = new WorldPoint(bogAnchor.getX() + 1, bogAnchor.getY() + 4, bogAnchor.getPlane());
                            worldPointArray[7] = new WorldPoint(bogAnchor.getX() + 2, bogAnchor.getY() + 4, bogAnchor.getPlane());
                            worldPointArray[8] = new WorldPoint(bogAnchor.getX() + 3, bogAnchor.getY() + 4, bogAnchor.getPlane());
                            worldPointArray[9] = new WorldPoint(bogAnchor.getX() + 4, bogAnchor.getY() + 4, bogAnchor.getPlane());
                            llllllllllllllllllIIIIIIIlllIllI = Arrays.asList(worldPointArray);
                            System.out.println("Start tiles: " + llllllllllllllllllIIIIIIIlllIllI.size());
                            llllllllllllllllllIIIIIIIlllIlIl = 0;
                            llllllllllllllllllIIIIIIIlllIlII = 0;
                            while (TempleTrekkingQuestStep.lessThan(llllllllllllllllllIIIIIIIlllIlII, llllllllllllllllllIIIIIIIlllIllI.size())) {
                                AccBuilderSotf.c = "";
                                llllllllllllllllllIIIIIIIlllIIll = TempleTrekkingQuestStep.a(llllllllllllllllllIIIIIIIlllIllI.get(llllllllllllllllllIIIIIIIlllIlII), bogAnchor.getY() + 9, (List<WorldPoint>)llllllllllllllllllIIIIIIIlllIlll);
                                if (TempleTrekkingQuestStep.isFalse(llllllllllllllllllIIIIIIIlllIIll.isEmpty() ? 1 : 0)) {
                                    System.out.println("");
                                    llllllllllllllllllIIIIIIIlllIIlI = llllllllllllllllllIIIIIIIlllIIll.iterator();
                                    while (TempleTrekkingQuestStep.isTrue(llllllllllllllllllIIIIIIIlllIIlI.hasNext() ? 1 : 0)) {
                                        llllllllllllllllllIIIIIIIlllIIIl = llllllllllllllllllIIIIIIIlllIIlI.next();
                                        System.out.println("(" + llllllllllllllllllIIIIIIIlllIIIl.getX() + ", " + llllllllllllllllllIIIIIIIlllIIIl.getY() + ", " + llllllllllllllllllIIIIIIIlllIIIl.getPlane() + ")");
                                        
                                    }
                                    llllllllllllllllllIIIIIIIlllIlIl = 1;
                                    while (TempleTrekkingQuestStep.isTrue(llllllllllllllllllIIIIIIIlllIlIl) && TempleTrekkingQuestStep.isFalse(llllllllllllllllllIIIIIIIlllIIll.isEmpty() ? 1 : 0)) {
                                        if (TempleTrekkingQuestStep.isFalse(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllllllIIIIIIIlllIIll.get(0)) ? 1 : 0)) {
                                            if (TempleTrekkingQuestStep.lessThan(Players.getLocal().getWorldLocation().getY(), bogAnchor.getY() + 4)) {
                                                AccBuilderSotf.c = "";
                                                e.c(llllllllllllllllllIIIIIIIlllIIll.get(0));
                                                Time.sleepUntil(() -> {
                                                    boolean bl;
                                                    if (TempleTrekkingQuestStep.lessThan(Players.getLocal().getWorldLocation().getY(), bogAnchor.getY() + 4)) {
                                                        bl = 1;
                                                    } else {
                                                        bl = 0;
                                                    }
                                                    return bl;
                                                }, (int)UtilHelper.randomInt(0, 0));
                                                Time.sleepTicks((int)2);
                                            } else {
                                                AccBuilderSotf.c = "";
                                                String[] stringArray58 = new String[1];
                                                stringArray58[0] = "";
                                                llllllllllllllllllIIIIIIIlllIIlI = TileObjects.getAt((WorldPoint)llllllllllllllllllIIIIIIIlllIIll.get(0), (String[])stringArray58);
                                                if (TempleTrekkingQuestStep.isFalse(llllllllllllllllllIIIIIIIlllIIlI.isEmpty() ? 1 : 0)) {
                                                    System.out.println("Bog size: " + llllllllllllllllllIIIIIIIlllIIlI.size());
                                                    ((TileObject)llllllllllllllllllIIIIIIIlllIIlI.get(0)).interact("");
                                                    Time.sleepTicks((int)2);
                                                }
                                                if (TempleTrekkingQuestStep.isTrue(llllllllllllllllllIIIIIIIlllIIlI.isEmpty() ? 1 : 0)) {
                                                    System.out.println("Bog is null at: " + String.valueOf(llllllllllllllllllIIIIIIIlllIIll.get(0)));
                                                    Game.logout();
                                                    Time.sleepTicks((int)2);
                                                    if ((143 + 13 - 42 + 84 ^ 24 + 166 - 111 + 115) >= 0) break;
                                                    return;
                                                }
                                                Time.sleepTicks((int)2);
                                            }
                                        }
                                        if (TempleTrekkingQuestStep.isTrue(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllllllIIIIIIIlllIIll.get(0)) ? 1 : 0)) {
                                            System.out.println("");
                                            llllllllllllllllllIIIIIIIlllIIll.remove(0);
                                            Time.sleepTicks((int)2);
                                        }
                                        System.out.println("Path size lefT: " + llllllllllllllllllIIIIIIIlllIIll.size());
                                        Time.sleepTicks((int)1);
                                        if (-(0x79 ^ 0x5D ^ (0x9B ^ 0xBB)) < 0) continue;
                                        return;
                                    }
                                    if (!TempleTrekkingQuestStep.notEquals(Game.getState(), GameState.LOGGED_IN)) break;
                                    System.out.println("");
                                    if (((0x5D ^ 1) & ~(0xCD ^ 0x91)) < 1) break;
                                    return;
                                }
                                ++llllllllllllllllllIIIIIIIlllIlII;
                                if ((0xAB ^ 0xB8 ^ (0x52 ^ 0x45)) >= 0) continue;
                                return;
                            }
                            if (TempleTrekkingQuestStep.isFalse(llllllllllllllllllIIIIIIIlllIlIl)) {
                                System.out.println("");
                            }
                            System.out.println(llllllllllllllllllIIIIIIIllllIll.size());
                        }
                        if ((bogAnchor) != null && TempleTrekkingQuestStep.greaterEq(Players.getLocal().getWorldLocation().getY(), bogAnchor.getY() + 9)) {
                            AccBuilderSotf.c = "";
                            String[] stringArray59 = new String[1];
                            stringArray59[0] = "";
                            TileObjects.getNearest((String[])stringArray59).interact("");
                            Time.sleepTicks((int)4);
                        }
                    }
                    if (TempleTrekkingQuestStep.lIlllIllIIIll(TempleTrekkingQuestStep.lIlllIllIIlIl(System.currentTimeMillis(), llllllllllllllllllIIIIIIIllllIlI + 45000L))) {
                        AccBuilderSotf.c = "";
                        Game.logout();
                        llllllllllllllllllIIIIIIIllllIlI = System.currentTimeMillis();
                    }
                } while (-3 < 0);
                return;
            }
            int[] nArray = new int[1];
            nArray[0] = 0;
            if (TempleTrekkingQuestStep.isTrue(Inventory.contains((int[])nArray) ? 1 : 0)) {
                Time.sleepTicks((int)UtilHelper.randomInt(3, 4));
                trekAttempts = 0;
            }
        }
        if (TempleTrekkingQuestStep.isFalse(swampArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && TempleTrekkingQuestStep.isFalse(morttonArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && TempleTrekkingQuestStep.lIlllIllIlIlI(TempleTrekkingQuestStep.compareDbl(UtilHelper.w(), 25.0))) {
            int[] nArray = new int[1];
            nArray[0] = 0;
            if (TempleTrekkingQuestStep.isTrue(Inventory.contains((int[])nArray) ? 1 : 0)) {
                Time.sleepTicks((int)UtilHelper.randomInt(3, 4));
                trekAttempts = 0;
            }
        }
    }

    private static int CompanionData(int n2, int n3) {
        return Math.abs(n2 - n3);
    }

    public static void Q() {
        d llllllllllllllllllIIIIIIIIllIlll;
        block19: {
            block18: {
                block17: {
                    block16: {
                        int[] nArray = new int[1];
                        nArray[0] = 0;
                        if (TempleTrekkingQuestStep.isFalse(Bank.contains((int[])nArray) ? 1 : 0)) {
                            d d2 = new CompanionData(0, 1, e.c(0, 0));
                            companions.add(d2);
                        }
                        int[] nArray2 = new int[1];
                        nArray2[0] = 0;
                        if (TempleTrekkingQuestStep.isFalse(Bank.contains((int[])nArray2) ? 1 : 0)) {
                            llllllllllllllllllIIIIIIIIllIlll = new CompanionData(0, 2, 0);
                            companions.add(llllllllllllllllllIIIIIIIIllIlll);
                        }
                        int[] nArray3 = new int[1];
                        nArray3[0] = 0;
                        if (TempleTrekkingQuestStep.isFalse(Bank.contains((int[])nArray3) ? 1 : 0)) {
                            llllllllllllllllllIIIIIIIIllIlll = new CompanionData(0, 10, 0);
                            companions.add(llllllllllllllllllIIIIIIIIllIlll);
                        }
                        int[] nArray4 = new int[1];
                        nArray4[0] = 0;
                        if (TempleTrekkingQuestStep.isFalse(Bank.contains((int[])nArray4) ? 1 : 0)) {
                            llllllllllllllllllIIIIIIIIllIlll = new CompanionData(0, 1, e.c(0, 0));
                            companions.add(llllllllllllllllllIIIIIIIIllIlll);
                        }
                        int[] nArray5 = new int[1];
                        nArray5[0] = 0;
                        if (TempleTrekkingQuestStep.isFalse(Bank.contains((int[])nArray5) ? 1 : 0)) {
                            llllllllllllllllllIIIIIIIIllIlll = new CompanionData(0, 1, e.c(0, 0));
                            companions.add(llllllllllllllllllIIIIIIIIllIlll);
                        }
                        int[] nArray6 = new int[1];
                        nArray6[0] = 0;
                        if (!TempleTrekkingQuestStep.isTrue(Bank.contains((int[])nArray6) ? 1 : 0)) break block16;
                        int[] nArray7 = new int[1];
                        nArray7[0] = 0;
                        if (!TempleTrekkingQuestStep.isTrue(Bank.contains((int[])nArray7) ? 1 : 0)) break block17;
                        int[] nArray8 = new int[1];
                        nArray8[0] = 0;
                        if (!TempleTrekkingQuestStep.lessThan(Bank.getFirst((int[])nArray8).getQuantity(), 0)) break block17;
                    }
                    llllllllllllllllllIIIIIIIIllIlll = new CompanionData(0, 0, e.c(0, 0));
                    companions.add(llllllllllllllllllIIIIIIIIllIlll);
                }
                int[] nArray = new int[1];
                nArray[0] = 0;
                if (!TempleTrekkingQuestStep.isTrue(Bank.contains((int[])nArray) ? 1 : 0)) break block18;
                int[] nArray9 = new int[1];
                nArray9[0] = 0;
                if (!TempleTrekkingQuestStep.isTrue(Bank.contains((int[])nArray9) ? 1 : 0)) break block19;
                int[] nArray10 = new int[1];
                nArray10[0] = 0;
                if (!TempleTrekkingQuestStep.lessThan(Bank.getFirst((int[])nArray10).getQuantity(), 30)) break block19;
            }
            llllllllllllllllllIIIIIIIIllIlll = new CompanionData(0, 30, e.c(0, 0));
            companions.add(llllllllllllllllllIIIIIIIIllIlll);
        }
        int[] nArray = new int[1];
        nArray[0] = 0;
        if (TempleTrekkingQuestStep.isFalse(Bank.contains((int[])nArray) ? 1 : 0)) {
            llllllllllllllllllIIIIIIIIllIlll = new CompanionData(0, 10, 0);
            companions.add(llllllllllllllllllIIIIIIIIllIlll);
        }
        int[] nArray11 = new int[1];
        nArray11[0] = 0;
        if (TempleTrekkingQuestStep.isFalse(Bank.contains((int[])nArray11) ? 1 : 0)) {
            llllllllllllllllllIIIIIIIIllIlll = new CompanionData(foodId, 0, 0);
            companions.add(llllllllllllllllllIIIIIIIIllIlll);
        }
        int[] nArray12 = new int[1];
        nArray12[0] = 0;
        if (TempleTrekkingQuestStep.isFalse(Bank.contains((int[])nArray12) ? 1 : 0)) {
            llllllllllllllllllIIIIIIIIllIlll = new CompanionData(0, 1, 0);
            companions.add(llllllllllllllllllIIIIIIIIllIlll);
        }
        int[] nArray13 = new int[1];
        nArray13[0] = 0;
        if (TempleTrekkingQuestStep.isFalse(Bank.contains((int[])nArray13) ? 1 : 0)) {
            llllllllllllllllllIIIIIIIIllIlll = new CompanionData(0, 1, e.c(0, 0));
            companions.add(llllllllllllllllllIIIIIIIIllIlll);
        }
        int[] nArray14 = new int[1];
        nArray14[0] = 0;
        if (TempleTrekkingQuestStep.isFalse(Bank.contains((int[])nArray14) ? 1 : 0)) {
            llllllllllllllllllIIIIIIIIllIlll = new CompanionData(0, 0, j.cf);
            companions.add(llllllllllllllllllIIIIIIIIllIlll);
        }
    }

    private static String lIlllIIllllll(String llllllllllllllllllIIIIIIIIIIIIII, String lllllllllllllllllIllllllllllllll) {
        try {
            SecretKeySpec llllllllllllllllllIIIIIIIIIIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIllllllllllllll.getBytes(StandardCharsets.UTF_8)), 8), "DES");
            Cipher llllllllllllllllllIIIIIIIIIIIIlI = Cipher.getInstance("DES");
            llllllllllllllllllIIIIIIIIIIIIlI.init(2, llllllllllllllllllIIIIIIIIIIIIll);
            return new String(llllllllllllllllllIIIIIIIIIIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIIIIIIIIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllllIIIIIIIIIIIIIl) {
            llllllllllllllllllIIIIIIIIIIIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean a(BogPathNode aM2, PriorityQueue<BogPathNode> priorityQueue) {
        return priorityQueue.stream().anyMatch(aM3 -> aM3.nT.equals((Object)aM2.nT));
    }

    private static boolean lIlllIllIIIll(int n2) {
        return n2 >
    }

    /*
     * WARNING - void declaration
     */
    private static List<WorldPoint> a(BogPathNode aM2) {
        void var1_1;
        BogPathNode llllllllllllllllllIIIIIIIlIIIlII;
        ArrayList<WorldPoint> llllllllllllllllllIIIIIIIlIIIIll = new ArrayList<WorldPoint>();
        while ((llllllllllllllllllIIIIIIIlIIIlII != null) {
            llllllllllllllllllIIIIIIIlIIIIll.add(llllllllllllllllllIIIIIIIlIIIlII.nT);
            llllllllllllllllllIIIIIIIlIIIlII = llllllllllllllllllIIIIIIIlIIIlII.pV;
            if (-1 < ((0x7A ^ 0x3A) & ~(0x65 ^ 0x25))) continue;
            return null;
        }
        Collections.reverse(var1_1);
        return var1_1;
    }

    private static int lIlllIllIIlIl(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    @Override
    public String ag() {
        return "";
    }

    static {
        
        
        companions = new ArrayList<CompanionData>();
        ghastArea = new WorldArea(0, 0, 0, 0, 0);
        ghastEvadeLoc = new WorldPoint(0, 0, 0);
        equipment = 0;
        foodId = 0;
        currentFood = 0;
        minHealth = 0;
        morttonArea = new WorldArea(0, 0, 0, 0, 0);
        canifisArea = new WorldArea(0, 0, 0, 0, 0);
        currentStatus = "";
        swampArea = new WorldArea(0, 0, 0, 0, 0);
        eventLoc = new WorldPoint(0, 0, 0);
        burghBankLoc = new WorldPoint(0, 0, 0);
        runCounter = 0;
        bogAnchor = null;
    }

    private static boolean lIlllIllIlIlI(int n2) {
        return n2 <=
    }

    private static void handleBank() {
        block25: {
            block31: {
                block27: {
                    block30: {
                        block29: {
                            block28: {
                                block26: {
                                    AccBuilderSotf.c = "";
                                    if (TempleTrekkingQuestStep.isFalse(Bank.isOpen() ? 1 : 0)) {
                                        TileObject llllllllllllllllllIIIIIIIlIIIIIl;
                                        if (TempleTrekkingQuestStep.lessEq(Players.getLocal().getWorldLocation().distanceTo(RouteHelper.BURGH_LOCATION), 7)) {
                                            a.a();
                                            Time.sleepTicks((int)3);
                                        }
                                        if (TempleTrekkingQuestStep.lessEq(Players.getLocal().getWorldLocation().distanceTo(burghBankLoc), 15) && (llllllllllllllllllIIIIIIIlIIIIIl = TileObjects.getNearest(tileObject -> {
                                            int n2;
                                            if (TempleTrekkingQuestStep.isTrue(tileObject.getName() != null.equalsIgnoreCase("") ? 1 : 0)) {
                                                String[] stringArray = new String[1];
                                                stringArray[0] = "Bank";
                                                if (TempleTrekkingQuestStep.isTrue(tileObject.hasAction(stringArray) ? 1 : 0)) {
                                                    n2 = 1;
                                                    if (null == null) return n2 !=
                                                    return ((0x3B ^ 0x14) & ~(0x2D ^ 2)) !=
                                                }
                                            }
                                            n2 = 0;
                                            return n2 !=
                                        }))) {
                                            llllllllllllllllllIIIIIIIlIIIIIl.interact("");
                                            Time.sleepUntil(() -> Bank.isOpen(), (int)0);
                                        }
                                        if (TempleTrekkingQuestStep.lessEq(Players.getLocal().getWorldLocation().distanceTo(GameData.fa), 188)) {
                                            int[] nArray = new int[1];
                                            nArray[0] = 0;
                                            TileObjects.getNearest((int[])nArray).interact("");
                                            Time.sleepTicks((int)2);
                                        }
                                    }
                                    if (!TempleTrekkingQuestStep.isTrue(Bank.isOpen() ? 1 : 0)) break block25;
                                    if (TempleTrekkingQuestStep.lIlllIllIIIll(Inventory.getAll().size())) {
                                        Bank.depositInventory();
                                        Time.sleepTicks((int)4);
                                    }
                                    if (TempleTrekkingQuestStep.lessEq(Players.getLocal().getWorldLocation().distanceTo(RouteHelper.BURGH_LOCATION), 7) && TempleTrekkingQuestStep.lIlllIllIIIll(Equipment.getAll().size())) {
                                        Bank.depositEquipment();
                                        Time.sleepTicks((int)2);
                                    }
                                    int[] nArray = new int[1];
                                    nArray[0] = 0;
                                    if (!TempleTrekkingQuestStep.isFalse(Bank.contains((int[])nArray) ? 1 : 0)) break block26;
                                    int[] nArray2 = new int[1];
                                    nArray2[0] = 0;
                                    if (!TempleTrekkingQuestStep.isFalse(Equipment.contains((int[])nArray2) ? 1 : 0)) break block26;
                                    int[] nArray3 = new int[1];
                                    nArray3[0] = 0;
                                    if (!TempleTrekkingQuestStep.isTrue(Inventory.contains((int[])nArray3) ? 1 : 0)) break block27;
                                }
                                int[] nArray = new int[1];
                                nArray[0] = 0;
                                if (!TempleTrekkingQuestStep.isFalse(Bank.contains((int[])nArray) ? 1 : 0)) break block28;
                                int[] nArray4 = new int[1];
                                nArray4[0] = 0;
                                if (!TempleTrekkingQuestStep.isFalse(Inventory.contains((int[])nArray4) ? 1 : 0)) break block28;
                                int[] nArray5 = new int[1];
                                nArray5[0] = 0;
                                if (!TempleTrekkingQuestStep.isTrue(Equipment.contains((int[])nArray5) ? 1 : 0)) break block27;
                            }
                            int[] nArray = new int[1];
                            nArray[0] = 0;
                            if (!TempleTrekkingQuestStep.isFalse(Bank.contains((int[])nArray) ? 1 : 0)) break block29;
                            int[] nArray6 = new int[1];
                            nArray6[0] = 0;
                            if (!TempleTrekkingQuestStep.isTrue(Inventory.contains((int[])nArray6) ? 1 : 0)) break block27;
                        }
                        int[] nArray = new int[1];
                        nArray[0] = 0;
                        if (!TempleTrekkingQuestStep.isFalse(Bank.contains((int[])nArray) ? 1 : 0)) break block30;
                        int[] nArray7 = new int[1];
                        nArray7[0] = 0;
                        if (!TempleTrekkingQuestStep.isTrue(Inventory.contains((int[])nArray7) ? 1 : 0)) break block27;
                    }
                    int[] nArray = new int[1];
                    nArray[0] = 0;
                    if (!TempleTrekkingQuestStep.isFalse(Bank.contains((int[])nArray) ? 1 : 0)) break block31;
                }
                System.out.println("");
                TempleTrekkingQuestStep.Q();
                completed = 1;
                return;
            }
            int[] nArray = new int[1];
            nArray[0] = 0;
            if (TempleTrekkingQuestStep.isFalse(Equipment.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray8 = new int[1];
                nArray8[0] = 0;
                if (TempleTrekkingQuestStep.isFalse(Inventory.contains((int[])nArray8) ? 1 : 0)) {
                    a.a(0, 1);
                    Time.sleepTicks((int)1);
                }
            }
            int[] nArray9 = new int[1];
            nArray9[0] = 0;
            if (TempleTrekkingQuestStep.isFalse(Equipment.contains((int[])nArray9) ? 1 : 0)) {
                int[] nArray10 = new int[1];
                nArray10[0] = 0;
                if (TempleTrekkingQuestStep.isFalse(Inventory.contains((int[])nArray10) ? 1 : 0)) {
                    a.a(0, 1);
                    Time.sleepTicks((int)1);
                }
            }
            if (TempleTrekkingQuestStep.isFalse(Equipment.contains((int[])f.bk) ? 1 : 0) && TempleTrekkingQuestStep.isFalse(Inventory.contains((int[])f.bk) ? 1 : 0)) {
                a.RouteHelper(f.bk, 1);
                Time.sleepTicks((int)1);
            }
            if (TempleTrekkingQuestStep.isFalse(Equipment.contains((int[])f.aW) ? 1 : 0) && TempleTrekkingQuestStep.isFalse(Inventory.contains((int[])f.aW) ? 1 : 0)) {
                a.RouteHelper(f.aW, 1);
                Time.sleepTicks((int)1);
            }
            int[] nArray11 = new int[1];
            nArray11[0] = 0;
            if (TempleTrekkingQuestStep.isFalse(Equipment.contains((int[])nArray11) ? 1 : 0)) {
                int[] nArray12 = new int[1];
                nArray12[0] = 0;
                if (TempleTrekkingQuestStep.isFalse(Inventory.contains((int[])nArray12) ? 1 : 0)) {
                    a.a(0, 1);
                    Time.sleepTicks((int)1);
                }
            }
            int[] nArray13 = new int[1];
            nArray13[0] = 0;
            if (TempleTrekkingQuestStep.isFalse(Equipment.contains((int[])nArray13) ? 1 : 0)) {
                int[] nArray14 = new int[1];
                nArray14[0] = 0;
                if (TempleTrekkingQuestStep.isFalse(Inventory.contains((int[])nArray14) ? 1 : 0)) {
                    a.a(0, 1);
                    Time.sleepTicks((int)1);
                }
            }
            int[] nArray15 = new int[1];
            nArray15[0] = 0;
            if (TempleTrekkingQuestStep.isFalse(Inventory.contains((int[])nArray15) ? 1 : 0)) {
                a.a(0, 1);
                Time.sleepTicks((int)1);
            }
            int[] nArray16 = new int[1];
            nArray16[0] = 0;
            if (TempleTrekkingQuestStep.isFalse(Inventory.contains((int[])nArray16) ? 1 : 0)) {
                a.a(0, 1);
                Time.sleepTicks((int)1);
            }
            int[] nArray17 = new int[1];
            nArray17[0] = 0;
            if (TempleTrekkingQuestStep.isFalse(Inventory.contains((int[])nArray17) ? 1 : 0)) {
                a.a(0, 1);
                Time.sleepTicks((int)1);
            }
            if (TempleTrekkingQuestStep.lessThan(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), minHealth)) {
                int[] nArray18 = new int[1];
                nArray18[0] = currentFood;
                if (TempleTrekkingQuestStep.isFalse(Inventory.contains((int[])nArray18) ? 1 : 0)) {
                    a.a(currentFood, 3);
                    Time.sleepTicks((int)1);
                }
            }
            int[] nArray19 = new int[1];
            nArray19[0] = 0;
            if (TempleTrekkingQuestStep.isFalse(Inventory.contains((int[])nArray19) ? 1 : 0)) {
                Bank.withdrawAll((int)0, (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                Time.sleepTicks((int)1);
            }
        }
    }

    

    

    @Override
    public boolean ae() {
        return 0;
    }

    

    

    private static String lIlllIlIIIIII(String llllllllllllllllllIIIIIIIIlIIlIl, String llllllllllllllllllIIIIIIIIlIIIlI) {
        try {
            SecretKeySpec llllllllllllllllllIIIIIIIIlIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIIIIIIIlIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllIIIIIIIIlIIlll = Cipher.getInstance("Blowfish");
            llllllllllllllllllIIIIIIIIlIIlll.init(2, llllllllllllllllllIIIIIIIIlIlIII);
            return new String(llllllllllllllllllIIIIIIIIlIIlll.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIIIIIIIlIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllllIIIIIIIIlIIllI) {
            llllllllllllllllllIIIIIIIIlIIllI.printStackTrace();
            return null;
        }
    }

    public static void run() {
        block65: {
            block66: {
                block67: {
                    if (completed ) {
                        AccBuilderSotf.c = "";
                        b.a(companions);
                        if (TempleTrekkingQuestStep.lessThan(companions.size(), 1)) {
                            System.out.println("");
                            completed = 0;
                        }
                    }
                    if (!!completed ) break block65;
                    if (TempleTrekkingQuestStep.isTrue(GrandExchange.isOpen() ? 1 : 0)) {
                        b.DialogHelper();
                    }
                    TempleTrekkingQuestStep.t(currentStatus);
                    Predicate<Item> llllllllllllllllllIIIIIIlIIIllll = item -> item.getName().toLowerCase().contains("");
                    if (TempleTrekkingQuestStep.isTrue(Inventory.contains(llllllllllllllllllIIIIIIlIIIllll) ? 1 : 0)) {
                        Inventory.getFirst(llllllllllllllllllIIIIIIlIIIllll).interact("Read");
                        Time.sleepTicks((int)1);
                    }
                    if (TempleTrekkingQuestStep.isFalse(swampArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && TempleTrekkingQuestStep.isFalse(morttonArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && TempleTrekkingQuestStep.isFalse(TempleTrekkingQuestStep.needsItems() ? 1 : 0) && TempleTrekkingQuestStep.greaterThan(Players.getLocal().getWorldLocation().distanceTo(RouteHelper.BURGH_LOCATION), 7)) {
                        Movement.walkTo((WorldPoint)RouteHelper.BURGH_LOCATION);
                        Time.sleepTicks((int)1);
                    }
                    if (TempleTrekkingQuestStep.isFalse(TempleTrekkingQuestStep.needsItems() ? 1 : 0) && TempleTrekkingQuestStep.lessEq(Players.getLocal().getWorldLocation().distanceTo(RouteHelper.BURGH_LOCATION), 7)) {
                        TempleTrekkingQuestStep.handleBank();
                    }
                    if (TempleTrekkingQuestStep.isTrue(TempleTrekkingQuestStep.needsItems() ? 1 : 0) && TempleTrekkingQuestStep.lessEq(Players.getLocal().getWorldLocation().distanceTo(RouteHelper.BURGH_LOCATION), 30)) {
                        TempleTrekkingQuestStep.l(0);
                        TempleTrekkingQuestStep.l(0);
                        TempleTrekkingQuestStep.l(0);
                        TempleTrekkingQuestStep.l(0);
                        TempleTrekkingQuestStep.RouteHelper(f.bk);
                        TempleTrekkingQuestStep.RouteHelper(f.aW);
                        int[] nArray = new int[1];
                        nArray[0] = 0;
                        if (TempleTrekkingQuestStep.isTrue(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            Time.sleepTicks((int)UtilHelper.randomInt(3, 4));
                            int[] nArray2 = new int[1];
                            nArray2[0] = 0;
                            Inventory.getFirst((int[])nArray2).interact("Climb-up");
                            Time.sleepUntil(() -> morttonArea.contains(Players.getLocal().getWorldLocation()), (int)0);
                            trekAttempts = 0;
                        }
                    }
                    if (TempleTrekkingQuestStep.isFalse(TempleTrekkingQuestStep.needsItems() ? 1 : 0) && (!TempleTrekkingQuestStep.isFalse(swampArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || TempleTrekkingQuestStep.lessEq(Players.getLocal().getWorldLocation().distanceTo(burghBankLoc), 100))) {
                        if (TempleTrekkingQuestStep.greaterThan(Players.getLocal().getWorldLocation().distanceTo(GameData.fa), 5)) {
                            AccBuilderSotf.c = "";
                            String[] stringArray = new String[1];
                            stringArray[0] = "";
                            if ((NPCs.getNearest((String[]) != nullstringArray))) {
                                String[] stringArray2 = new String[1];
                                stringArray2[0] = "";
                                TileObjects.getNearest((String[])stringArray2).interact("");
                                Time.sleepTicks((int)4);
                            }
                            String[] stringArray3 = new String[1];
                            stringArray3[0] = "";
                            if ((NPCs.getNearest((String[]) == nullstringArray3)) && TempleTrekkingQuestStep.greaterThan(Players.getLocal().getWorldLocation().distanceTo(GameData.fa), 5)) {
                                AccBuilderSotf.c = "";
                                Movement.walkTo((WorldPoint)GameData.fa);
                                Time.sleepTicks((int)1);
                            }
                        }
                        if (TempleTrekkingQuestStep.lessEq(Players.getLocal().getWorldLocation().distanceTo(GameData.fa), 5)) {
                            AccBuilderSotf.c = "Break";
                            if (TempleTrekkingQuestStep.isFalse(Bank.isOpen() ? 1 : 0)) {
                                int[] nArray = new int[1];
                                nArray[0] = 0;
                                TileObjects.getNearest((int[])nArray).interact("");
                                Time.sleepTicks((int)2);
                            }
                            if (TempleTrekkingQuestStep.isTrue(Bank.isOpen() ? 1 : 0) && TempleTrekkingQuestStep.lIlllIllIIIll(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)1);
                            }
                            int[] nArray = new int[1];
                            nArray[0] = 0;
                            if (TempleTrekkingQuestStep.isFalse(Equipment.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray3 = new int[1];
                                nArray3[0] = 0;
                                if (TempleTrekkingQuestStep.isFalse(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                                    a.a(0, 1);
                                }
                            }
                            int[] nArray4 = new int[1];
                            nArray4[0] = 0;
                            if (TempleTrekkingQuestStep.isFalse(Equipment.contains((int[])nArray4) ? 1 : 0)) {
                                int[] nArray5 = new int[1];
                                nArray5[0] = 0;
                                if (TempleTrekkingQuestStep.isFalse(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                                    a.a(0, 1);
                                }
                            }
                            int[] nArray6 = new int[1];
                            nArray6[0] = 0;
                            if (TempleTrekkingQuestStep.isFalse(Inventory.contains((int[])nArray6) ? 1 : 0)) {
                                a.a(0, 1);
                            }
                            int[] nArray7 = new int[1];
                            nArray7[0] = 0;
                            if (TempleTrekkingQuestStep.isFalse(Inventory.contains((int[])nArray7) ? 1 : 0)) {
                                a.a(0, 1);
                            }
                            int[] nArray8 = new int[1];
                            nArray8[0] = 0;
                            if (TempleTrekkingQuestStep.isFalse(Inventory.contains((int[])nArray8) ? 1 : 0)) {
                                a.a(0, 1);
                            }
                            if (TempleTrekkingQuestStep.lessThan(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), minHealth)) {
                                int[] nArray9 = new int[1];
                                nArray9[0] = currentFood;
                                if (TempleTrekkingQuestStep.isFalse(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                                    a.a(currentFood, 4);
                                }
                            }
                            int[] nArray10 = new int[1];
                            nArray10[0] = 0;
                            if (TempleTrekkingQuestStep.isFalse(Inventory.contains((int[])nArray10) ? 1 : 0)) {
                                Bank.withdrawAll((int)0, (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                            }
                        }
                    }
                    if (TempleTrekkingQuestStep.isTrue(TempleTrekkingQuestStep.needsItems() ? 1 : 0)) {
                        NPC llllllllllllllllllIIIIIIlIIIllIl2;
                        TempleTrekkingQuestStep.l(0);
                        TempleTrekkingQuestStep.l(0);
                        TempleTrekkingQuestStep.l(0);
                        TempleTrekkingQuestStep.l(0);
                        TempleTrekkingQuestStep.RouteHelper(f.bk);
                        TempleTrekkingQuestStep.RouteHelper(f.aW);
                        String[] stringArray = new String[1];
                        stringArray[0] = "";
                        if (TempleTrekkingQuestStep.isTrue(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                            String[] stringArray4 = new String[1];
                            stringArray4[0] = "";
                            Inventory.getFirst((String[])stringArray4).interact("Veliaf Hurtz");
                        }
                        if (TempleTrekkingQuestStep.isTrue(Inventory.contains((int[])f.ba) ? 1 : 0) && TempleTrekkingQuestStep.lessThan(Movement.getRunEnergy(), 22)) {
                            Inventory.getFirst((int[])f.ba).interact("Ladder");
                            Time.sleepTicks((int)1);
                        }
                        if (TempleTrekkingQuestStep.greaterThan(Movement.getRunEnergy(), 172) && TempleTrekkingQuestStep.isFalse(Movement.isRunEnabled() ? 1 : 0)) {
                            Movement.toggleRun();
                        }
                        TempleTrekkingQuestStep.t(currentStatus);
                        Predicate<Item> llllllllllllllllllIIIIIIlIIIlllI = item -> item.getName().toLowerCase().contains("");
                        if (TempleTrekkingQuestStep.isTrue(Inventory.contains(llllllllllllllllllIIIIIIlIIIlllI) ? 1 : 0)) {
                            Inventory.getFirst(llllllllllllllllllIIIIIIlIIIlllI).interact("Read");
                            Time.sleepTicks((int)1);
                        }
                        if (TempleTrekkingQuestStep.isTrue(swampArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] stringArray5 = new String[1];
                            stringArray5[0] = "";
                            if (TempleTrekkingQuestStep.isFalse(Inventory.contains((String[])stringArray5) ? 1 : 0) && TempleTrekkingQuestStep.isFalse(Inventory.contains(llllllllllllllllllIIIIIIlIIIlllI) ? 1 : 0)) {
                                if (TempleTrekkingQuestStep.lessThan(runCounter, 1) && TempleTrekkingQuestStep.greaterEq(Movement.getRunEnergy(), 172)) {
                                    Movement.toggleRun();
                                    runCounter += 1;
                                }
                                if (TempleTrekkingQuestStep.greaterEq(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), minHealth)) {
                                    if (TempleTrekkingQuestStep.greaterThan(Players.getLocal().getWorldLocation().distanceTo(eventLoc), 8)) {
                                        AccBuilderSotf.c = "";
                                        if (TempleTrekkingQuestStep.isTrue(Dialog.isOpen() ? 1 : 0)) {
                                            Dialog.close();
                                        }
                                        Movement.walkTo((WorldPoint)eventLoc);
                                        Time.sleepTicks((int)1);
                                    }
                                    if (TempleTrekkingQuestStep.lessEq(Players.getLocal().getWorldLocation().distanceTo(eventLoc), 8)) {
                                        Time.sleepTicks((int)2);
                                        if (TempleTrekkingQuestStep.isFalse(Dialog.isOpen() ? 1 : 0) && TempleTrekkingQuestStep.isFalse(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
                                            String[] stringArray6 = new String[1];
                                            stringArray6[0] = "";
                                            if (TempleTrekkingQuestStep.isFalse(Inventory.contains((String[])stringArray6) ? 1 : 0) && TempleTrekkingQuestStep.isFalse(Inventory.contains(llllllllllllllllllIIIIIIlIIIlllI) ? 1 : 0) && TempleTrekkingQuestStep.isTrue(Widgets.get((int)31149).isEmpty() ? 1 : 0) && TempleTrekkingQuestStep.isFalse(Vars.getBit((int)0))) {
                                                AccBuilderSotf.c = "";
                                                int[] nArray = new int[1];
                                                nArray[0] = 0;
                                                llllllllllllllllllIIIIIIlIIIllIl2 = NPCs.getNearest((int[])nArray);
                                                if ((llllllllllllllllllIIIIIIlIIIllIl2) != null && TempleTrekkingQuestStep.isFalse(Dialog.isOpen() ? 1 : 0)) {
                                                    llllllllllllllllllIIIIIIlIIIllIl2.interact("Escort");
                                                    Time.sleepTicks((int)3);
                                                }
                                                DialogHelper.handleDialog(new String[0]);
                                            }
                                        }
                                    }
                                }
                                String[] stringArray7 = new String[1];
                                stringArray7[0] = "Yes.";
                                DialogHelper.handleDialog(stringArray7);
                            }
                        }
                        if (TempleTrekkingQuestStep.isTrue(morttonArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] stringArray8 = new String[1];
                            stringArray8[0] = "";
                            if (TempleTrekkingQuestStep.isFalse(Inventory.contains((String[])stringArray8) ? 1 : 0) && TempleTrekkingQuestStep.isFalse(Inventory.contains(llllllllllllllllllIIIIIIlIIIlllI) ? 1 : 0)) {
                                if (TempleTrekkingQuestStep.greaterEq(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), minHealth)) {
                                    if (TempleTrekkingQuestStep.greaterThan(Players.getLocal().getWorldLocation().distanceTo(ghastEvadeLoc), 8)) {
                                        AccBuilderSotf.c = "";
                                        if (TempleTrekkingQuestStep.isTrue(Dialog.isOpen() ? 1 : 0)) {
                                            Dialog.close();
                                        }
                                        Movement.walkTo((WorldPoint)ghastEvadeLoc);
                                        Time.sleepTicks((int)1);
                                    }
                                    Time.sleepTicks((int)2);
                                    if (TempleTrekkingQuestStep.isFalse(Dialog.isOpen() ? 1 : 0) && TempleTrekkingQuestStep.isFalse(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
                                        String[] stringArray9 = new String[1];
                                        stringArray9[0] = "";
                                        if (TempleTrekkingQuestStep.isFalse(Inventory.contains((String[])stringArray9) ? 1 : 0) && TempleTrekkingQuestStep.isFalse(Inventory.contains(llllllllllllllllllIIIIIIlIIIlllI) ? 1 : 0)) {
                                            if (TempleTrekkingQuestStep.lessThan(runCounter, 1) && TempleTrekkingQuestStep.greaterEq(Movement.getRunEnergy(), 172)) {
                                                Movement.toggleRun();
                                                runCounter += 1;
                                            }
                                            if ((Widgets.get((int) == null0, (int)188))) {
                                                AccBuilderSotf.c = "";
                                                int[] nArray = new int[1];
                                                nArray[0] = 0;
                                                llllllllllllllllllIIIIIIlIIIllIl2 = NPCs.getNearest((int[])nArray);
                                                if ((llllllllllllllllllIIIIIIlIIIllIl2) != null && TempleTrekkingQuestStep.isFalse(Dialog.isOpen() ? 1 : 0) && TempleTrekkingQuestStep.isFalse(Vars.getBit((int)0))) {
                                                    llllllllllllllllllIIIIIIlIIIllIl2.interact("");
                                                    Time.sleepTicks((int)3);
                                                }
                                                DialogHelper.handleDialog(new String[0]);
                                                Time.sleepTicks((int)2);
                                            }
                                        }
                                    }
                                }
                                DialogHelper.handleDialog(new String[0]);
                            }
                        }
                        try {
                            TempleTrekkingQuestStep.handleEvents();
                        }
                        catch (Exception llllllllllllllllllIIIIIIlIIIllIl2) {
                            System.out.println(llllllllllllllllllIIIIIIlIIIllIl2.getStackTrace());
                            System.out.println(llllllllllllllllllIIIIIIlIIIllIl2.getCause());
                            llllllllllllllllllIIIIIIlIIIllIl2.printStackTrace();
                        }
                        if (((0x10 ^ 0x1A ^ (0xE3 ^ 0xAD)) & (43 + 20 - -87 + 100 ^ 35 + 58 - -57 + 40 ^ -1)) != 0) {
                            return;
                        }
                    }
                    if (!TempleTrekkingQuestStep.lessThan(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), minHealth)) break block66;
                    int[] nArray = new int[1];
                    nArray[0] = currentFood;
                    if (!TempleTrekkingQuestStep.isTrue(Inventory.contains((int[])nArray) ? 1 : 0)) break block67;
                    String[] stringArray = new String[1];
                    stringArray[0] = "Knife";
                    if (!TempleTrekkingQuestStep.isTrue(Inventory.contains((String[])stringArray) ? 1 : 0)) break block67;
                    int[] nArray11 = new int[1];
                    nArray11[0] = 0;
                    if (!TempleTrekkingQuestStep.isTrue(Inventory.contains((int[])nArray11) ? 1 : 0)) break block67;
                    String[] stringArray10 = new String[1];
                    stringArray10[0] = "Hammer";
                    if (!TempleTrekkingQuestStep.isFalse(Inventory.contains((String[])stringArray10) ? 1 : 0)) break block66;
                }
                if (TempleTrekkingQuestStep.isTrue(morttonArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && TempleTrekkingQuestStep.greaterThan(Players.getLocal().getWorldLocation().distanceTo(burghBankLoc), 15)) {
                    AccBuilderSotf.c = "Read";
                    Movement.walkTo((WorldPoint)burghBankLoc);
                }
                if (TempleTrekkingQuestStep.isTrue(canifisArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = "";
                    Movement.walkTo((BankLocation)BankLocation.BURGH_DE_ROTT_BANK);
                }
                if (TempleTrekkingQuestStep.lessEq(Players.getLocal().getWorldLocation().distanceTo(GameData.fa), 10)) {
                    AccBuilderSotf.c = "";
                    TempleTrekkingQuestStep.handleBank();
                }
                if (TempleTrekkingQuestStep.lessEq(Players.getLocal().getWorldLocation().distanceTo(burghBankLoc), 15)) {
                    AccBuilderSotf.c = "";
                    TempleTrekkingQuestStep.handleBank();
                }
            }
            if (TempleTrekkingQuestStep.lessThan(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), minHealth)) {
                int[] nArray = new int[1];
                nArray[0] = currentFood;
                if (TempleTrekkingQuestStep.isTrue(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray12 = new int[1];
                    nArray12[0] = currentFood;
                    Inventory.getFirst((int[])nArray12).interact("Eat");
                    Time.sleepTicks((int)1);
                }
            }
            int[] nArray = new int[1];
            nArray[0] = 0;
            if (TempleTrekkingQuestStep.isTrue(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray13 = new int[1];
                nArray13[0] = 0;
                Inventory.getAll((int[])nArray13).stream().forEach(item -> item.interact("Drop"));
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean needsItems() {
        int n2;
        block6: {
            block8: {
                block7: {
                    block5: {
                        String[] stringArray = new String[1];
                        stringArray[0] = "";
                        if (!TempleTrekkingQuestStep.isFalse(Inventory.contains((String[])stringArray) ? 1 : 0)) break block5;
                        String[] stringArray2 = new String[1];
                        stringArray2[0] = "";
                        if (!TempleTrekkingQuestStep.isTrue(Equipment.contains((String[])stringArray2) ? 1 : 0)) break block6;
                    }
                    int[] nArray = new int[1];
                    nArray[0] = 0;
                    if (!TempleTrekkingQuestStep.isFalse(Inventory.contains((int[])nArray) ? 1 : 0)) break block7;
                    int[] nArray2 = new int[1];
                    nArray2[0] = 0;
                    if (!TempleTrekkingQuestStep.isFalse(Equipment.contains((int[])nArray2) ? 1 : 0)) break block7;
                    int[] nArray3 = new int[1];
                    nArray3[0] = 0;
                    if (!TempleTrekkingQuestStep.isFalse(Inventory.contains((int[])nArray3) ? 1 : 0)) break block7;
                    int[] nArray4 = new int[1];
                    nArray4[0] = 0;
                    if (!TempleTrekkingQuestStep.isFalse(Equipment.contains((int[])nArray4) ? 1 : 0)) break block7;
                    int[] nArray5 = new int[1];
                    nArray5[0] = 0;
                    if (!TempleTrekkingQuestStep.isFalse(Inventory.contains((int[])nArray5) ? 1 : 0)) break block7;
                    int[] nArray6 = new int[1];
                    nArray6[0] = 0;
                    if (!TempleTrekkingQuestStep.isTrue(Equipment.contains((int[])nArray6) ? 1 : 0)) break block6;
                }
                int[] nArray = new int[1];
                nArray[0] = 0;
                if (!TempleTrekkingQuestStep.isFalse(Inventory.contains((int[])nArray) ? 1 : 0)) break block8;
                String[] stringArray = new String[1];
                stringArray[0] = "";
                if (!TempleTrekkingQuestStep.isTrue(Equipment.contains((String[])stringArray) ? 1 : 0)) break block6;
            }
            int[] nArray = new int[1];
            nArray[0] = 0;
            if (TempleTrekkingQuestStep.isTrue(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray7 = new int[1];
                nArray7[0] = 0;
                if (TempleTrekkingQuestStep.isTrue(Inventory.contains((int[])nArray7) ? 1 : 0)) {
                    n2 = 1;
                    if ((0x2F ^ 0x40 ^ (0x17 ^ 0x7C)) >= 0) return n2 !=
                    return ((135 + 222 - 200 + 74 ^ 41 + 139 - 160 + 176) & (0x5A ^ 0x56 ^ (0x59 ^ 0x76) ^ -1)) !=
                }
            }
        }
        n2 = 0;
        return n2 !=
    }

    public static void t(String string) {
        Widget llllllllllllllllllIIIIIIIIlllIIl;
        String[] stringArray = new String[1];
        stringArray[0] = "";
        if (TempleTrekkingQuestStep.isTrue(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            trekAttempts = 0;
            AccBuilderSotf.c = "";
            String[] stringArray2 = new String[1];
            stringArray2[0] = "";
            Inventory.getFirst((String[])stringArray2).interact("Look-at");
            Time.sleepTicks((int)3);
            if (!(Widgets.get((int) == null0, (int)6)) || TempleTrekkingQuestStep.isFalse(Widgets.get((int)0).isEmpty() ? 1 : 0)) {
                String llllllllllllllllllIIIIIIIIlllIlI;
                AccBuilderSotf.c = "";
                if (TempleTrekkingQuestStep.isTrue(llllllllllllllllllIIIIIIIIlllIlI.contains("") ? 1 : 0) && (llllllllllllllllllIIIIIIIIlllIIl = Widgets.get((int) != null0, (int)6))) {
                    Time.sleepTicks((int)2);
                    llllllllllllllllllIIIIIIIIlllIIl.getChild(7).interact("Details");
                    Time.sleepTicks((int)1);
                }
                if (TempleTrekkingQuestStep.isTrue(llllllllllllllllllIIIIIIIIlllIlI.contains("") ? 1 : 0) && (llllllllllllllllllIIIIIIIIlllIIl = Widgets.get((int) != null0, (int)6))) {
                    Time.sleepTicks((int)2);
                    llllllllllllllllllIIIIIIIIlllIIl.getChild(1).interact("");
                    Time.sleepTicks((int)UtilHelper.randomInt(3, 4));
                }
                if (TempleTrekkingQuestStep.isTrue(llllllllllllllllllIIIIIIIIlllIlI.contains("") ? 1 : 0) && (llllllllllllllllllIIIIIIIIlllIIl = Widgets.get((int) != null0, (int)6))) {
                    Time.sleepTicks((int)2);
                    llllllllllllllllllIIIIIIIIlllIIl.getChild(0).interact("");
                    Time.sleepTicks((int)UtilHelper.randomInt(3, 4));
                }
                if (TempleTrekkingQuestStep.isTrue(llllllllllllllllllIIIIIIIIlllIlI.contains("") ? 1 : 0) && (llllllllllllllllllIIIIIIIIlllIIl = Widgets.get((int) != null0, (int)6))) {
                    Time.sleepTicks((int)2);
                    llllllllllllllllllIIIIIIIIlllIIl.getChild(2).interact("");
                    Time.sleepTicks((int)UtilHelper.randomInt(3, 4));
                }
                if (TempleTrekkingQuestStep.isTrue(llllllllllllllllllIIIIIIIIlllIlI.contains("") ? 1 : 0) && (llllllllllllllllllIIIIIIIIlllIIl = Widgets.get((int) != null0, (int)6))) {
                    Time.sleepTicks((int)2);
                    llllllllllllllllllIIIIIIIIlllIIl.getChild(3).interact("");
                    Time.sleepTicks((int)UtilHelper.randomInt(3, 4));
                }
                if (TempleTrekkingQuestStep.isTrue(llllllllllllllllllIIIIIIIIlllIlI.contains("") ? 1 : 0) && (llllllllllllllllllIIIIIIIIlllIIl = Widgets.get((int) != null0, (int)6))) {
                    Time.sleepTicks((int)2);
                    llllllllllllllllllIIIIIIIIlllIIl.getChild(4).interact("");
                    Time.sleepTicks((int)UtilHelper.randomInt(3, 4));
                }
                AccBuilderSotf.c = "";
                llllllllllllllllllIIIIIIIIlllIIl = Widgets.fromId((int)0);
                if ((llllllllllllllllllIIIIIIIIlllIIl) != null && TempleTrekkingQuestStep.isTrue(llllllllllllllllllIIIIIIIIlllIIl.isVisible() ? 1 : 0)) {
                    Time.sleepTick();
                    llllllllllllllllllIIIIIIIIlllIIl.interact("Claim");
                    Time.sleepTicks((int)2);
                }
            }
        }
        if (TempleTrekkingQuestStep.isTrue(Inventory.contains(llllllllllllllllllIIIIIIIIlllIIl = item -> item.getName().toLowerCase().contains("")) ? 1 : 0)) {
            Inventory.getFirst(llllllllllllllllllIIIIIIIIlllIIl).interact("Read");
            Time.sleepTicks((int)1);
        }
    }

    /*
     * WARNING - void declaration
     */
    public static List<WorldPoint> a(WorldPoint worldPoint, int n2, List<WorldPoint> list) {
        void llllllllllllllllllIIIIIIIllIIlII;
        PriorityQueue<BogPathNode> priorityQueue = new PriorityQueue<BogPathNode>();
        ArrayList arrayList = new ArrayList();
        priorityQueue.add(new BogPathNode(worldPoint, null, 0, TempleTrekkingQuestStep.CompanionData(worldPoint.getY(), n2)));
        while (TempleTrekkingQuestStep.isFalse(llllllllllllllllllIIIIIIIllIIlII.isEmpty() ? 1 : 0)) {
            void llllllllllllllllllIIIIIIIllIIlIl;
            void llllllllllllllllllIIIIIIIllIIIll;
            void llllllllllllllllllIIIIIIIllIIllI;
            BogPathNode llllllllllllllllllIIIIIIIllIIIlI = (BogPathNode)llllllllllllllllllIIIIIIIllIIlII.poll();
            if (TempleTrekkingQuestStep.equals(llllllllllllllllllIIIIIIIllIIIlI.nT.getY(), (int)llllllllllllllllllIIIIIIIllIIllI)) {
                return TempleTrekkingQuestStep.a(llllllllllllllllllIIIIIIIllIIIlI);
            }
            llllllllllllllllllIIIIIIIllIIIll.add(llllllllllllllllllIIIIIIIllIIIlI);
            Iterator<BogPathNode> llllllllllllllllllIIIIIIIllIIIIl = TempleTrekkingQuestStep.a(llllllllllllllllllIIIIIIIllIIIlI, (List<WorldPoint>)llllllllllllllllllIIIIIIIllIIlIl).iterator();
            while (TempleTrekkingQuestStep.isTrue(llllllllllllllllllIIIIIIIllIIIIl.hasNext() ? 1 : 0)) {
                BogPathNode llllllllllllllllllIIIIIIIllIIIII = llllllllllllllllllIIIIIIIllIIIIl.next();
                int llllllllllllllllllIIIIIIIlIlllll = llllllllllllllllllIIIIIIIllIIIlI.nV + 1;
                if (TempleTrekkingQuestStep.isTrue(TempleTrekkingQuestStep.RouteHelper(llllllllllllllllllIIIIIIIllIIIII, (List<BogPathNode>)llllllllllllllllllIIIIIIIllIIIll) ? 1 : 0)) {
                    if (((142 + 2 - 26 + 28 ^ 107 + 179 - 277 + 184) & (42 + 202 - 28 + 25 ^ 106 + 27 - 113 + 142 ^ -1)) <= 2) continue;
                    return null;
                }
                if (!TempleTrekkingQuestStep.isTrue(TempleTrekkingQuestStep.a(llllllllllllllllllIIIIIIIllIIIII, (PriorityQueue<BogPathNode>)llllllllllllllllllIIIIIIIllIIlII) ? 1 : 0) || TempleTrekkingQuestStep.lessThan(llllllllllllllllllIIIIIIIlIlllll, llllllllllllllllllIIIIIIIllIIIII.nV)) {
                    llllllllllllllllllIIIIIIIllIIlII.add(llllllllllllllllllIIIIIIIllIIIII);
                }
                if ((0xD0 ^ 0x82 ^ (0x55 ^ 2)) != 0) continue;
                return null;
            }
            if (1 < (0x6F ^ 0xC ^ (0x33 ^ 0x54))) continue;
            return null;
        }
        return Collections.emptyList();
    }

    

    

    public static void l(int n2) {
        int[] nArray = new int[1];
        nArray[0] = n2;
        if (TempleTrekkingQuestStep.isTrue(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[1];
            nArray2[0] = n2;
            if (TempleTrekkingQuestStep.isFalse(Equipment.contains((int[])nArray2) ? 1 : 0)) {
                int llllllllllllllllllIIIIIIIIllllll;
                int[] nArray3 = new int[1];
                nArray3[0] = n2;
                String[] stringArray = new String[1];
                stringArray[0] = "Wear";
                if (TempleTrekkingQuestStep.isTrue(Inventory.getFirst((int[])nArray3).hasAction(stringArray) ? 1 : 0)) {
                    int[] nArray4 = new int[1];
                    nArray4[0] = n2;
                    Inventory.getFirst((int[])nArray4).interact("Wear");
                }
                int[] nArray5 = new int[1];
                nArray5[0] = llllllllllllllllllIIIIIIIIllllll;
                String[] stringArray2 = new String[1];
                stringArray2[0] = "Wield";
                if (TempleTrekkingQuestStep.isTrue(Inventory.getFirst((int[])nArray5).hasAction(stringArray2) ? 1 : 0)) {
                    int[] nArray6 = new int[1];
                    nArray6[0] = llllllllllllllllllIIIIIIIIllllll;
                    Inventory.getFirst((int[])nArray6).interact("Wield");
                }
                int[] nArray7 = new int[1];
                nArray7[0] = llllllllllllllllllIIIIIIIIllllll;
                String[] stringArray3 = new String[1];
                stringArray3[0] = "Equip";
                if (TempleTrekkingQuestStep.isTrue(Inventory.getFirst((int[])nArray7).hasAction(stringArray3) ? 1 : 0)) {
                    int[] nArray8 = new int[1];
                    nArray8[0] = llllllllllllllllllIIIIIIIIllllll;
                    Inventory.getFirst((int[])nArray8).interact("Equip");
                }
                if (TempleTrekkingQuestStep.equals(llllllllllllllllllIIIIIIIIllllll, 0)) {
                    Time.sleepTicks((int)3);
                    String[] stringArray4 = new String[1];
                    stringArray4[0] = "";
                    DialogHelper.handleDialog(stringArray4);
                    Time.sleepTicks((int)1);
                }
            }
        }
    }

    

    public static void RouteHelper(int[] nArray) {
        if (TempleTrekkingQuestStep.isTrue(Inventory.contains((int[])nArray) ? 1 : 0) && TempleTrekkingQuestStep.isFalse(Equipment.contains((int[])nArray) ? 1 : 0)) {
            int[] llllllllllllllllllIIIIIIIIllllIl;
            String[] stringArray = new String[1];
            stringArray[0] = "";
            if (TempleTrekkingQuestStep.isTrue(Inventory.getFirst((int[])nArray).hasAction(stringArray) ? 1 : 0)) {
                Inventory.getFirst((int[])nArray).interact("");
            }
            String[] stringArray2 = new String[1];
            stringArray2[0] = "";
            if (TempleTrekkingQuestStep.isTrue(Inventory.getFirst((int[])llllllllllllllllllIIIIIIIIllllIl).hasAction(stringArray2) ? 1 : 0)) {
                Inventory.getFirst((int[])llllllllllllllllllIIIIIIIIllllIl).interact("");
            }
            String[] stringArray3 = new String[1];
            stringArray3[0] = "";
            if (TempleTrekkingQuestStep.isTrue(Inventory.getFirst((int[])llllllllllllllllllIIIIIIIIllllIl).hasAction(stringArray3) ? 1 : 0)) {
                Inventory.getFirst((int[])llllllllllllllllllIIIIIIIIllllIl).interact("");
            }
        }
    }

    @Override
    public int execute() {
        try {
            TempleTrekkingQuestStep.run();
        }
        catch (Exception exception) {
            // empty catch block
        }
        if ((0x67 ^ 0x63) != (0x38 ^ 0x3C)) {
            return (0x76 ^ 0x23) & ~(0xF2 ^ 0xA7);
        }
        return 100;
    }

    

    

    /*
     * WARNING - void declaration
     */
    private static List<BogPathNode> a(BogPathNode aM2, List<WorldPoint> list) {
        void llllllllllllllllllIIIIIIIlIIllIl;
        int[][] nArrayArray;
        ArrayList<BogPathNode> arrayList = new ArrayList<BogPathNode>();
        int[][] nArrayArray2 = new int[4][];
        int[] nArray = new int[2];
        nArray[0] = 1;
        nArray[1] = 0;
        nArrayArray2[0] = nArray;
        int[] nArray2 = new int[2];
        nArray2[0] = -1;
        nArray2[1] = 0;
        nArrayArray2[1] = nArray2;
        int[] nArray3 = new int[2];
        nArray3[0] = 0;
        nArray3[1] = 1;
        nArrayArray2[2] = nArray3;
        int[] nArray4 = new int[2];
        nArray4[0] = 0;
        nArray4[1] = -1;
        nArrayArray2[3] = nArray4;
        int[][] nArrayArray3 = nArrayArray = nArrayArray2;
        int n2 = nArrayArray3.length;
        int llllllllllllllllllIIIIIIIlIIllII = 0;
        while (TempleTrekkingQuestStep.lessThan(llllllllllllllllllIIIIIIIlIIllII, (int)llllllllllllllllllIIIIIIIlIIllIl)) {
            void llllllllllllllllllIIIIIIIlIlIIIl;
            int llllllllllllllllllIIIIIIIlIIlIII;
            int llllllllllllllllllIIIIIIIlIIlIIl;
            BogPathNode llllllllllllllllllIIIIIIIlIlIIlI;
            void llllllllllllllllllIIIIIIIlIIlllI;
            void llllllllllllllllllIIIIIIIlIIlIll = llllllllllllllllllIIIIIIIlIIlllI[llllllllllllllllllIIIIIIIlIIllII];
            int llllllllllllllllllIIIIIIIlIIlIlI = llllllllllllllllllIIIIIIIlIlIIlI.nT.getX() + llllllllllllllllllIIIIIIIlIIlIll[0];
            WorldPoint llllllllllllllllllIIIIIIIlIIIlll = new WorldPoint(llllllllllllllllllIIIIIIIlIIlIlI, llllllllllllllllllIIIIIIIlIIlIIl = llllllllllllllllllIIIIIIIlIlIIlI.nT.getY() + llllllllllllllllllIIIIIIIlIIlIll[1], llllllllllllllllllIIIIIIIlIIlIII = llllllllllllllllllIIIIIIIlIlIIlI.nT.getPlane());
            if (TempleTrekkingQuestStep.isTrue(llllllllllllllllllIIIIIIIlIlIIIl.contains(llllllllllllllllllIIIIIIIlIIIlll) ? 1 : 0)) {
                void llllllllllllllllllIIIIIIIlIlIIII;
                llllllllllllllllllIIIIIIIlIlIIII.add(new BogPathNode(llllllllllllllllllIIIIIIIlIIIlll, llllllllllllllllllIIIIIIIlIlIIlI, 0, TempleTrekkingQuestStep.CompanionData(llllllllllllllllllIIIIIIIlIIlIIl, bogAnchor.getY() + 9)));
            }
            ++llllllllllllllllllIIIIIIIlIIllII;
            if (-1 >= -1) continue;
            return null;
        }
        return arrayList;
    }

    @Override
    public boolean canExecute() {
        boolean bl;
        if (TempleTrekkingQuestStep.greaterEq(Skills.getLevel((Skill)Skill.SLAYER), 0)) {
            bl = 1;
        } else {
            bl = 0;
        }
        return bl;
    }

    

    

    private static boolean RouteHelper(BogPathNode aM2, List<BogPathNode> list) {
        return list.stream().anyMatch(aM3 -> aM3.nT.equals((Object)aM2.nT));
    }
}

