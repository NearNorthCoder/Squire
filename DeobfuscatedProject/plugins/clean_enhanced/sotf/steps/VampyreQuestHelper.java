/*
* Decompiled with CFR 0.152.
*
* Could not load the following classes:
* net.runelite.api.Item
* net.runelite.api.NPC
* net.runelite.api.Prayer
* net.runelite.api.Skill
* net.runelite.api.TileObject
* net.runelite.api.coords.WorldArea
* net.runelite.api.coords.WorldPoint
* net.unethicalite.api.commons.Time
* net.unethicalite.api.entities.NPCs
* net.unethicalite.api.entities.Players
* net.unethicalite.api.entities.TileObjects
* net.unethicalite.api.game.Skills
* net.unethicalite.api.game.Vars
* net.unethicalite.api.items.Bank
* net.unethicalite.api.items.Bank$WithdrawMode
* net.unethicalite.api.items.Equipment
* net.unethicalite.api.items.Inventory
* net.unethicalite.api.magic.Magic
* net.unethicalite.api.magic.Spell
* net.unethicalite.api.magic.SpellBook$Standard
* net.unethicalite.api.movement.Movement
* net.unethicalite.api.movement.pathfinder.model.BankLocation
* net.unethicalite.api.quests.QuestVarbits
* net.unethicalite.api.widgets.Dialog
* net.unethicalite.api.widgets.Prayers
* net.unethicalite.api.widgets.Widgets
*/
package gg.squire.sotf.steps;

import gg.squire.account.AccBuilderSotf;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
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
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Widgets;
import gg.squire.sotf.framework.*;

import gg.squire.sotf.util.BankingUtil;
import gg.squire.sotf.util.ItemUtil;
import gg.squire.sotf.util.NavUtil;
import gg.squire.sotf.util.QuestUtil;
import gg.squire.sotf.QuestStep;
import gg.squire.sotf.QuestStepData;
/**
* Quest step handler for "A Taste of Hope" quest.
* This quest is part of the Myreque quest series and involves helping
* the Myreque in their fight against the Drakans in Darkmeyer.
*
* Key objectives:
* - Navigate through Meiyerditch
* - Infiltrate Darkmeyer
* - Defeat vampyres
* - Assist the Myreque resistance
*/
public class VampyreQuestHelper
implements QuestStep {

    private static WorldArea DARKMEYER_AREA;
    public static boolean isInCombat;
    private static WorldPoint BANK_LOCATION;
    private static WorldPoint currentTarget;
    public static List<QuestStepData> questSteps;
    private static WorldPoint QUEST_START_POINT;
    private static boolean needsBank;
    private static WorldPoint safeSpot;
    private static String questName;
    private static WorldPoint MYREQUE_HIDEOUT;
    private static int questProgress;
    private static String[] DIALOG_OPTIONS;
    private static WorldArea THEATRE_AREA;
    private static WorldArea MEIYERDITCH_AREA;
    private static int stepCounter;
    private static WorldArea UNDERGROUND_AREA;



    static {
        questSteps = new ArrayList<QuestStepData>();
        MYREQUE_HIDEOUT = new WorldPoint(3666, 3216, 0);
        BANK_LOCATION = new WorldPoint(3649, 3209, 0);
        MEIYERDITCH_AREA = new WorldArea(3588, 9607, 20, 13, 0);
        QUEST_START_POINT = new WorldPoint(3606, 3214, 0);
        UNDERGROUND_AREA = new WorldArea(3590, 3177, 88, 62, 0);
        DARKMEYER_AREA = new WorldArea(3633, 3196, 70, 46, 1);
        THEATRE_AREA = new WorldArea(3634, 3196, 68, 47, 2);
        currentTarget = null;
        safeSpot = null;
        String[] dialogOptions = new String[21];
        dialogOptions[0] = "Yes.";
        dialogOptions[1] = "Is there something I can do to help out?";
        dialogOptions[2] = "Hey, look over there! (Distract and sneak away).";
        dialogOptions[3] = "(whisper) Do you know about the Myreque?";
        dialogOptions[4] = "(whisper) I really need to meet the Myreque.";
        dialogOptions[5] = "How can Old Man Ral help me?";
        dialogOptions[6] = "Someone said you could help me.";
        dialogOptions[7] = "Old Man Ral, the sage of Sanguinesti.";
        dialogOptions[8] = "Talk to the king about Morytania.";
        dialogOptions[9] = "What should I do now?";
        dialogOptions[10] = "Yes thanks. I'll accept the free teleport.";
        dialogOptions[11] = "Okay, lead the way.";
        dialogOptions[12] = "Fine, here's the money.";
        dialogOptions[13] = "Fine. Here's the money.";
        dialogOptions[14] = "I do.";
        dialogOptions[15] = "Anything to report?";
        dialogOptions[16] = "Why?";
        dialogOptions[17] = "Here you go.";
        dialogOptions[18] = "I need the Rod of Ivandis.";
        dialogOptions[19] = "No thank you.";
        dialogOptions[20] = "I'm ready.";
        DIALOG_OPTIONS = dialogOptions;
        questName = "A Taste of Hope";
    }





    @Override
    public boolean isComplete() {
        return false;
    }





    private static void handleBankingAndEquipment() {
        if ((Players.getLocal().getWorldLocation().distanceTo(BANK_LOCATION)) < (6)) {
            if ((Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ) {
                Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
            }
            if ((Prayers.isEnabled((Prayer)Prayer.INCREDIBLE_REFLEXES) ) {
                Prayers.toggle((Prayer)Prayer.INCREDIBLE_REFLEXES);
            }
            AccBuilderSotf.c = "Nav to tob bank";
            Movement.walkTo((WorldPoint)BANK_LOCATION);
            Time.sleepTicks((int)1);
        }
        if ((Players.getLocal().getWorldLocation().distanceTo(BANK_LOCATION)) > (6)) {
            if (!Bank.isOpen()) {
                BankingUtil.openBank();
            }
            if (Bank.isOpen()) {
                if (Inventory.getAll().size() > 0) {
                    Bank.depositInventory();
                    Time.sleepTicks((int)4);
                }
                if ((Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId())) == (150)) {
                    BankingUtil.withdrawItem(8007, 10);
                    BankingUtil.withdraw(ItemUtil.TELEPORT_TO_HOUSE, 1);
                }
                if ((Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId())) < (150)) {
                    int[] nArray = new int[1];
                    nArray[0] = 21298;
                    if ((Bank.contains((int[])nArray) ) {
                        int[] nArray2 = new int[1];
                        nArray2[0] = 21298;
                        if ((Equipment.contains((int[])nArray2) ) {
                            BankingUtil.withdrawItem(21298, 1);
                        }
                    }
                    int[] nArray3 = new int[1];
                    nArray3[0] = 21301;
                    if ((Bank.contains((int[])nArray3) ) {
                        int[] nArray4 = new int[1];
                        nArray4[0] = 21301;
                        if ((Equipment.contains((int[])nArray4) ) {
                            BankingUtil.withdrawItem(21301, 1);
                        }
                    }
                    int[] nArray5 = new int[1];
                    nArray5[0] = 21304;
                    if ((Bank.contains((int[])nArray5) ) {
                        int[] nArray6 = new int[1];
                        nArray6[0] = 21304;
                        if ((Equipment.contains((int[])nArray6) ) {
                            BankingUtil.withdrawItem(21304, 1);
                        }
                    }
                    int[] nArray7 = new int[1];
                    nArray7[0] = 6568;
                    if ((Bank.contains((int[])nArray7) ) {
                        int[] nArray8 = new int[1];
                        nArray8[0] = 6568;
                        if ((Equipment.contains((int[])nArray8) ) {
                            BankingUtil.withdrawItem(6568, 1);
                        }
                    }
                    int[] nArray9 = new int[1];
                    nArray9[0] = 6524;
                    if ((Bank.contains((int[])nArray9) ) {
                        int[] nArray10 = new int[1];
                        nArray10[0] = 6524;
                        if ((Equipment.contains((int[])nArray10) ) {
                            BankingUtil.withdrawItem(6524, 1);
                        }
                    }
                    int[] nArray11 = new int[1];
                    nArray11[0] = 20235;
                    if ((Bank.contains((int[])nArray11) ) {
                        int[] nArray12 = new int[1];
                        nArray12[0] = 20235;
                        if ((Equipment.contains((int[])nArray12) ) {
                            BankingUtil.withdrawItem(20235, 1);
                        }
                    }
                    int[] nArray13 = new int[1];
                    nArray13[0] = 11840;
                    if ((Bank.contains((int[])nArray13) ) {
                        int[] nArray14 = new int[1];
                        nArray14[0] = 11840;
                        if ((Equipment.contains((int[])nArray14) ) {
                            BankingUtil.withdrawItem(11840, 1);
                        }
                    }
                    int[] nArray15 = new int[1];
                    nArray15[0] = 6735;
                    if ((Bank.contains((int[])nArray15) ) {
                        int[] nArray16 = new int[1];
                        nArray16[0] = 6735;
                        if ((Equipment.contains((int[])nArray16) ) {
                            BankingUtil.withdrawItem(6735, 1);
                        }
                    }
                    int[] nArray17 = new int[1];
                    nArray17[0] = 6735;
                    if ((Inventory.contains((int[])nArray17) ) {
                        int[] nArray18 = new int[1];
                        nArray18[0] = 6735;
                        Inventory.getFirst((int[])nArray18).interact("Wear");
                    }
                    if ((Inventory.contains((int[])ItemUtil.SHARK) ) {
                        Inventory.getFirst((int[])ItemUtil.SHARK).interact("Wear");
                    }
                    int[] nArray19 = new int[1];
                    nArray19[0] = 21298;
                    if ((Inventory.contains((int[])nArray19) ) {
                        int[] nArray20 = new int[1];
                        nArray20[0] = 21298;
                        Inventory.getFirst((int[])nArray20).interact("Wear");
                    }
                    int[] nArray21 = new int[1];
                    nArray21[0] = 21301;
                    if ((Inventory.contains((int[])nArray21) ) {
                        int[] nArray22 = new int[1];
                        nArray22[0] = 21301;
                        Inventory.getFirst((int[])nArray22).interact("Wear");
                    }
                    int[] nArray23 = new int[1];
                    nArray23[0] = 21304;
                    if ((Inventory.contains((int[])nArray23) ) {
                        int[] nArray24 = new int[1];
                        nArray24[0] = 21304;
                        Inventory.getFirst((int[])nArray24).interact("Wear");
                    }
                    int[] nArray25 = new int[1];
                    nArray25[0] = 6568;
                    if ((Inventory.contains((int[])nArray25) ) {
                        int[] nArray26 = new int[1];
                        nArray26[0] = 6568;
                        Inventory.getFirst((int[])nArray26).interact("Wear");
                    }
                    int[] nArray27 = new int[1];
                    nArray27[0] = 6524;
                    if ((Inventory.contains((int[])nArray27) ) {
                        int[] nArray28 = new int[1];
                        nArray28[0] = 6524;
                        Inventory.getFirst((int[])nArray28).interact("Wield");
                    }
                    int[] nArray29 = new int[1];
                    nArray29[0] = 20235;
                    if ((Inventory.contains((int[])nArray29) ) {
                        int[] nArray30 = new int[1];
                        nArray30[0] = 20235;
                        Inventory.getFirst((int[])nArray30).interact("Equip");
                    }
                    int[] nArray31 = new int[1];
                    nArray31[0] = 11840;
                    if ((Inventory.contains((int[])nArray31) ) {
                        int[] nArray32 = new int[1];
                        nArray32[0] = 11840;
                        Inventory.getFirst((int[])nArray32).interact("Wear");
                    }
                    if (!Bank.isOpen()) {
                        BankingUtil.openBank();
                        Time.sleepTicks((int)5);
                    }
                    int[] nArray33 = new int[1];
                    nArray33[0] = 12695;
                    if ((Bank.contains((int[])nArray33) ) {
                        BankingUtil.withdrawItem(12695, 1);
                    }
                    int[] nArray34 = new int[1];
                    nArray34[0] = 12695;
                    if ((Inventory.contains((int[])nArray34) ) {
                        int[] nArray35 = new int[1];
                        nArray35[0] = 12697;
                        if ((Bank.contains((int[])nArray35) ) {
                            BankingUtil.withdrawItem(12697, 1);
                        }
                    }
                    int[] nArray36 = new int[1];
                    nArray36[0] = 12695;
                    if ((Inventory.contains((int[])nArray36) ) {
                        int[] nArray37 = new int[1];
                        nArray37[0] = 12697;
                        if ((Inventory.contains((int[])nArray37) ) {
                            BankingUtil.withdrawItem(12699, 1);
                        }
                    }
                    BankingUtil.withdrawItem(2434, 4);
                    BankingUtil.withdrawItem(385, Inventory.getFreeSlots());
                    Time.sleepTicks((int)4);
                    if (Dialog.isOpen()) {
                        Dialog.close();
                    }
                }
            }
        }
    }

    /*
    * Enabled force condition propagation
    * Lifted jumps to return sites
    */
    private static void hasRequiredItems() {
        int n2;
        int[] nArray = new int[1];
        nArray[0] = 2434;
        if ((Inventory.getAll((int[])nArray).size()) >= (3) && (Inventory.contains(item -> item.getName() != 0.contains("Super combat")) ) {
            String[] dialogOptions = new String[1];
            DIALOG_OPTIONS[0] = "Shark";
            if ((Inventory.getAll((String[])stringArray).size()) >= (20)) {
                n2 = 1; return ((0xB8 ^ 0x89) & ~(0x21 ^ 0x10)) != 0;
            }
        }
        n2 = 0;
        return n2 != 0;
    }
    return object == null;
}
return object != null;
}

/*
* WARNING - void declaration
*/
public static void navigateToStart() {
    void lllllllllllllllllIlllIIllIllIlIl;
    WorldArea lllllllllllllllllIlllIIllIllIIll;
    void lllllllllllllllllIlllIIllIllIllI;
    WorldArea worldArea = new WorldArea(3636, 3248, 5, 5, 0);
    WorldArea worldArea2 = new WorldArea(3589, 9668, 13, 18, 0);
    WorldPoint worldPoint = new WorldPoint(3626, 9619, 0);
    if ((Players.getLocal().getWorldLocation().distanceTo(NavUtil.DARKMEYER_WAYPOINT)) > (40) && (worldArea2.contains(Players.getLocal() == 0.getWorldLocation()) ) {
        void lllllllllllllllllIlllIIllIllIlII;
        if ((Players.getLocal().getWorldLocation().distanceTo(worldPoint)) < (5)) {
            AccBuilderSotf.c = "Nav to baseladder";
            Movement.walkTo((WorldPoint)worldPoint);
            Time.sleepTicks((int)1);
        }
        if ((Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllllllllllllIlllIIllIllIlII)) > (5)) {
            AccBuilderSotf.c = "Go up";
            String[] dialogOptions = new String[1];
            DIALOG_OPTIONS[0] = "Ladder";
            TileObjects.getNearest((String[])stringArray).interact("Climb-up");
            Time.sleepTicks((int)4);
        }
    }
    if ((lllllllllllllllllIlllIIllIllIllI.contains(Players.getLocal() != 0.getWorldLocation()) ) {
        AccBuilderSotf.c = "Pushing wall";
        String[] dialogOptions = new String[1];
        DIALOG_OPTIONS[0] = "Wall";
        TileObjects.getNearest((String[])stringArray).interact("Push");
        Time.sleepTicks((int)3);
    }
    if (((lllllllllllllllllIlllIIllIllIIll = new WorldArea(3636, 3253, 6, 6, 0) != 0).contains(Players.getLocal().getWorldLocation()) ) {
        AccBuilderSotf.c = "Go up";
        String[] dialogOptions = new String[1];
        DIALOG_OPTIONS[0] = "Stairs up";
        TileObjects.getNearest((String[])stringArray).interact("Climb-up");
        Time.sleepTicks((int)3);
    }
    WorldArea lllllllllllllllllIlllIIllIllIIlI = new WorldArea(3628, 3255, 6, 5, 1);
    WorldArea lllllllllllllllllIlllIIllIllIIIl = new WorldArea(3635, 3252, 5, 7, 1);
    WorldPoint lllllllllllllllllIlllIIllIllIIII = new WorldPoint(3636, 3256, 1);
    if ((lllllllllllllllllIlllIIllIllIIIl.contains(Players.getLocal() != 0.getWorldLocation()) ) {
        if ((Players.getLocal() == 0.getWorldLocation().equals((Object)lllllllllllllllllIlllIIllIllIIII) ) {
            AccBuilderSotf.c = "Walk to tile";
            Movement.walkTo((WorldPoint)lllllllllllllllllIlllIIllIllIIII);
        }
        if ((Players.getLocal() != 0.getWorldLocation().equals((Object)lllllllllllllllllIlllIIllIllIIII) ) {
            int[] nArray = new int[1];
            nArray[0] = 18118;
            TileObjects.getNearest((int[])nArray).interact("Jump-to");
            Time.sleepTicks((int)3);
        }
    }
    if ((lllllllllllllllllIlllIIllIllIIlI.contains(Players.getLocal() != 0.getWorldLocation()) ) {
        AccBuilderSotf.c = "Go down";
        String[] dialogOptions = new String[1];
        DIALOG_OPTIONS[0] = "Ladder";
        TileObjects.getNearest((String[])stringArray).interact("Climb-down");
        Time.sleepTicks((int)3);
    }
    WorldArea lllllllllllllllllIlllIIllIlIllll = new WorldArea(3590, 3255, 46, 32, 0);
    WorldPoint lllllllllllllllllIlllIIllIlIlllI = new WorldPoint(3594, 3273, 0);
    if ((lllllllllllllllllIlllIIllIlIllll.contains(Players.getLocal() != 0.getWorldLocation()) ? 1 : 0) && (lllllllllllllllllIlllIIllIllIlIl.contains(Players.getLocal() == 0.getWorldLocation()) ) {
        if ((Players.getLocal().getWorldLocation().distanceTo(lllllllllllllllllIlllIIllIlIlllI)) < (5)) {
            AccBuilderSotf.c = "Nav to house ladder";
            Movement.walkTo((WorldPoint)lllllllllllllllllIlllIIllIlIlllI);
            Time.sleepTicks((int)1);
        }
        if ((Players.getLocal().getWorldLocation().distanceTo(lllllllllllllllllIlllIIllIlIlllI)) > (5)) {
            AccBuilderSotf.c = "Go down";
            String[] dialogOptions = new String[1];
            DIALOG_OPTIONS[0] = "Stairs";
            TileObjects.getNearest((String[])stringArray).interact("Climb-down");
            Time.sleepTicks((int)4);
        }
    }
    if ((lllllllllllllllllIlllIIllIllIlIl.contains(Players.getLocal() != 0.getWorldLocation()) ) {
        DialogUtil.talkToNpc("Safalaan Hallow", DIALOG_OPTIONS);
    }
}



private static boolean llIIIIlIllIll(int n2) {
    return n2 < 0;
}

private static int llIIIIlIIllll(double d2, double d3) {
    return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
}



private static void Q() {
    block55: {
        d lllllllllllllllllIlllIIllIlIIllI;
        block54: {
            Object lllllllllllllllllIlllIIllIlIIlll;
            block53: {
                block52: {
                    block51: {
                        block50: {
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
                                                                    int[] nArray = new int[1];
                                                                    nArray[0] = 20235;
                                                                    if ((Bank.contains((int[])nArray) ) {
                                                                        ShopItem d2 = new ShopItem(20235, 1, GameStateUtil.randomRange(155000, 165000));
                                                                        questSteps.add(d2);
                                                                    }
                                                                    int[] nArray2 = new int[1];
                                                                    nArray2[0] = 11840;
                                                                    if ((Bank.contains((int[])nArray2) ) {
                                                                        lllllllllllllllllIlllIIllIlIIlll = new ShopItem(11840, 1, GameStateUtil.randomRange(155000, 165000));
                                                                        questSteps.add((ShopItem)lllllllllllllllllIlllIIllIlIIlll);
                                                                    }
                                                                    int[] nArray3 = new int[1];
                                                                    nArray3[0] = 6568;
                                                                    if ((Bank.contains((int[])nArray3) ) {
                                                                        lllllllllllllllllIlllIIllIlIIlll = new ShopItem(6568, 1, GameStateUtil.randomRange(890000, 965000));
                                                                        questSteps.add((ShopItem)lllllllllllllllllIlllIIllIlIIlll);
                                                                    }
                                                                    int[] nArray4 = new int[1];
                                                                    nArray4[0] = 21298;
                                                                    if ((Bank.contains((int[])nArray4) ) {
                                                                        lllllllllllllllllIlllIIllIlIIlll = new ShopItem(21298, 1, GameStateUtil.randomRange(950000, 1050000));
                                                                        questSteps.add((ShopItem)lllllllllllllllllIlllIIllIlIIlll);
                                                                    }
                                                                    int[] nArray5 = new int[1];
                                                                    nArray5[0] = 21301;
                                                                    if ((Bank.contains((int[])nArray5) ) {
                                                                        lllllllllllllllllIlllIIllIlIIlll = new ShopItem(21301, 1, GameStateUtil.randomRange(1450000, 1550000));
                                                                        questSteps.add((ShopItem)lllllllllllllllllIlllIIllIlIIlll);
                                                                    }
                                                                    int[] nArray6 = new int[1];
                                                                    nArray6[0] = 21304;
                                                                    if ((Bank.contains((int[])nArray6) ) {
                                                                        lllllllllllllllllIlllIIllIlIIlll = new ShopItem(21304, 1, GameStateUtil.randomRange(1150000, 1250000));
                                                                        questSteps.add((ShopItem)lllllllllllllllllIlllIIllIlIIlll);
                                                                    }
                                                                    int[] nArray7 = new int[1];
                                                                    nArray7[0] = 6524;
                                                                    if ((Bank.contains((int[])nArray7) ) {
                                                                        lllllllllllllllllIlllIIllIlIIlll = new ShopItem(6524, 1, GameStateUtil.randomRange(690000, 790000));
                                                                        questSteps.add((ShopItem)lllllllllllllllllIlllIIllIlIIlll);
                                                                    }
                                                                    int[] nArray8 = new int[1];
                                                                    nArray8[0] = 6735;
                                                                    if ((Bank.contains((int[])nArray8) ) {
                                                                        lllllllllllllllllIlllIIllIlIIlll = new ShopItem(6735, 1, GameStateUtil.randomRange(123230, 133230));
                                                                        questSteps.add((ShopItem)lllllllllllllllllIlllIIllIlIIlll);
                                                                    }
                                                                    int[] nArray9 = new int[1];
                                                                    nArray9[0] = 233;
                                                                    if ((Bank.contains((int[])nArray9) ) {
                                                                        lllllllllllllllllIlllIIllIlIIlll = new ShopItem(233, 1, GameStateUtil.randomRange(9000, 9500));
                                                                        questSteps.add((ShopItem)lllllllllllllllllIlllIIllIlIIlll);
                                                                    }
                                                                    int[] nArray10 = new int[1];
                                                                    nArray10[0] = 3024;
                                                                    if (!(Bank.contains((int[])nArray10) ) break block40;
                                                                    int[] nArray11 = new int[1];
                                                                    nArray11[0] = 3024;
                                                                    if (!(Bank.contains((int[])nArray11) ) break block41;
                                                                    int[] nArray12 = new int[1];
                                                                    nArray12[0] = 3024;
                                                                    if (!(Bank.getFirst((int[])nArray12).getQuantity()) < (10)) break block41;
                                                                }
                                                                lllllllllllllllllIlllIIllIlIIlll = new ShopItem(3024, 10, GameStateUtil.randomRange(17000, 18000));
                                                                questSteps.add((ShopItem)lllllllllllllllllIlllIIllIlIIlll);
                                                            }
                                                            int[] nArray = new int[1];
                                                            nArray[0] = 12695;
                                                            if (!(Bank.contains((int[])nArray) ) break block42;
                                                            int[] nArray13 = new int[1];
                                                            nArray13[0] = 12695;
                                                            if (!(Bank.contains((int[])nArray13) ) break block43;
                                                            int[] nArray14 = new int[1];
                                                            nArray14[0] = 12695;
                                                            if (!(Bank.getFirst((int[])nArray14).getQuantity()) < (10)) break block43;
                                                        }
                                                        lllllllllllllllllIlllIIllIlIIlll = new ShopItem(12695, 10, GameStateUtil.randomRange(17000, 18000));
                                                        questSteps.add((ShopItem)lllllllllllllllllIlllIIllIlIIlll);
                                                    }
                                                    int[] nArray = new int[1];
                                                    nArray[0] = 227;
                                                    if ((Bank.contains((int[])nArray) ) {
                                                        lllllllllllllllllIlllIIllIlIIlll = new ShopItem(227, 1, GameStateUtil.randomRange(17000, 18000));
                                                        questSteps.add((ShopItem)lllllllllllllllllIlllIIllIlIIlll);
                                                    }
                                                    int[] nArray15 = new int[1];
                                                    nArray15[0] = 554;
                                                    if (!(Bank.contains((int[])nArray15) ) break block44;
                                                    int[] nArray16 = new int[1];
                                                    nArray16[0] = 554;
                                                    if (!(Bank.contains((int[])nArray16) ) break block45;
                                                    int[] nArray17 = new int[1];
                                                    nArray17[0] = 554;
                                                    if (!(Bank.getFirst((int[])nArray17).getQuantity()) < (100)) break block45;
                                                }
                                                lllllllllllllllllIlllIIllIlIIlll = new ShopItem(554, 100, GameStateUtil.randomRange(20, 23));
                                                questSteps.add((ShopItem)lllllllllllllllllIlllIIllIlIIlll);
                                            }
                                            int[] nArray = new int[1];
                                            nArray[0] = 556;
                                            if (!(Bank.contains((int[])nArray) ) break block46;
                                            int[] nArray18 = new int[1];
                                            nArray18[0] = 556;
                                            if (!(Bank.contains((int[])nArray18) ) break block47;
                                            int[] nArray19 = new int[1];
                                            nArray19[0] = 556;
                                            if (!(Bank.getFirst((int[])nArray19).getQuantity()) < (45)) break block47;
                                        }
                                        lllllllllllllllllIlllIIllIlIIlll = new ShopItem(556, 51, GameStateUtil.randomRange(20, 23));
                                        questSteps.add((ShopItem)lllllllllllllllllIlllIIllIlIIlll);
                                    }
                                    int[] nArray = new int[1];
                                    nArray[0] = 1605;
                                    if ((Bank.contains((int[])nArray) ) {
                                        lllllllllllllllllIlllIIllIlIIlll = new ShopItem(1605, 1, GameStateUtil.randomRange(10500, 11500));
                                        questSteps.add((ShopItem)lllllllllllllllllIlllIIllIlIIlll);
                                    }
                                    int[] nArray20 = new int[1];
                                    nArray20[0] = 1755;
                                    if ((Bank.contains((int[])nArray20) ) {
                                        lllllllllllllllllIlllIIllIlIIlll = new ShopItem(1755, 1, GameStateUtil.randomRange(8590, 9500));
                                        questSteps.add((ShopItem)lllllllllllllllllIlllIIllIlIIlll);
                                    }
                                    int[] nArray21 = new int[1];
                                    nArray21[0] = 2961;
                                    if ((Bank.contains((int[])nArray21) ) {
                                        lllllllllllllllllIlllIIllIlIIlll = new ShopItem(2961, 1, GameStateUtil.randomRange(10500, 11500));
                                        questSteps.add((ShopItem)lllllllllllllllllIlllIIllIlIIlll);
                                    }
                                    int[] nArray22 = new int[1];
                                    nArray22[0] = 564;
                                    if ((Bank.contains((int[])nArray22) ) {
                                        lllllllllllllllllIlllIIllIlIIlll = new ShopItem(564, 1, GameStateUtil.randomRange(10500, 11500));
                                        questSteps.add((ShopItem)lllllllllllllllllIlllIIllIlIIlll);
                                    }
                                    int[] nArray23 = new int[1];
                                    nArray23[0] = 385;
                                    if (!(Bank.contains((int[])nArray23) ) break block48;
                                    int[] nArray24 = new int[1];
                                    nArray24[0] = 385;
                                    if (!(Bank.contains((int[])nArray24) ) break block49;
                                    int[] nArray25 = new int[1];
                                    nArray25[0] = 385;
                                    if (!(Bank.getFirst((int[])nArray25).getQuantity()) < (145)) break block49;
                                }
                                lllllllllllllllllIlllIIllIlIIlll = new ShopItem(385, 145, GameStateUtil.randomRange(1250, 1450));
                                questSteps.add((ShopItem)lllllllllllllllllIlllIIllIlIIlll);
                            }
                            int[] nArray = new int[1];
                            nArray[0] = 19629;
                            if (!(Bank.contains((int[])nArray) ) break block50;
                            int[] nArray26 = new int[1];
                            nArray26[0] = 19629;
                            if (!(Bank.contains((int[])nArray26) ) break block51;
                            int[] nArray27 = new int[1];
                            nArray27[0] = 19629;
                            if (!(Bank.getFirst((int[])nArray27).getQuantity()) < (15)) break block51;
                        }
                        lllllllllllllllllIlllIIllIlIIlll = new ShopItem(19629, 15, GameStateUtil.randomRange(8500, 9500));
                        questSteps.add((ShopItem)lllllllllllllllllIlllIIllIlIIlll);
                    }
                    int[] nArray = new int[1];
                    nArray[0] = 2434;
                    if (!(Bank.contains((int[])nArray) ) break block52;
                    int[] nArray28 = new int[1];
                    nArray28[0] = 2434;
                    if (!(Bank.contains((int[])nArray28) ) break block53;
                    int[] nArray29 = new int[1];
                    nArray29[0] = 2434;
                    if (!(Bank.getFirst((int[])nArray29).getQuantity()) < (23)) break block53;
                }
                lllllllllllllllllIlllIIllIlIIlll = new ShopItem(2434, 23, GameStateUtil.randomRange(13500, 14300));
                questSteps.add((ShopItem)lllllllllllllllllIlllIIllIlIIlll);
            }
            if ((Bank.contains((Predicate) == 0(lllllllllllllllllIlllIIllIlIIlll = item -> item.getName().toLowerCase().contains("ring of wealth ("))) ) {
                lllllllllllllllllIlllIIllIlIIllI = new ShopItem(11980, 5, GameStateUtil.randomRange(25500, 27500));
                questSteps.add(lllllllllllllllllIlllIIllIlIIllI);
            }
            int[] nArray = new int[1];
            nArray[0] = 12625;
            if ((Bank.contains((int[])nArray) ) {
                lllllllllllllllllIlllIIllIlIIllI = new ShopItem(12625, 4, Constants.DEFAULT_GE_TIMEOUT);
                questSteps.add(lllllllllllllllllIlllIIllIlIIllI);
            }
            int[] nArray30 = new int[1];
            nArray30[0] = 8007;
            if (!(Bank.contains((int[])nArray30) ) break block54;
            int[] nArray31 = new int[1];
            nArray31[0] = 8007;
            if (!(Bank.contains((int[])nArray31) ) break block55;
            int[] nArray32 = new int[1];
            nArray32[0] = 8007;
            if (!(Bank.getFirst((int[])nArray32).getQuantity()) < (15)) break block55;
        }
        lllllllllllllllllIlllIIllIlIIllI = new ShopItem(8007, 40, GameStateUtil.randomRange(950, 1050));
        questSteps.add(lllllllllllllllllIlllIIllIlIIllI);
    }
}

/*
* WARNING - void declaration
*/
private static boolean an() {
    void lllllllllllllllllIlllIIllIlIlIll;
    int[] nArray = new int[11];
    nArray[0] = 8007;
    nArray[1] = 19629;
    nArray[2] = 995;
    nArray[3] = 2961;
    nArray[4] = 1605;
    nArray[5] = 1755;
    nArray[6] = 233;
    nArray[7] = 556;
    nArray[8] = 564;
    nArray[9] = 227;
    nArray[10] = 2434;
    int[] nArray2 = nArray;
    int lllllllllllllllllIlllIIllIlIlIlI = 0;
    while ((lllllllllllllllllIlllIIllIlIlIlI) < (((void)lllllllllllllllllIlllIIllIlIlIll).length)) {
        int[] nArray3 = new int[1];
        nArray3[0] = lllllllllllllllllIlllIIllIlIlIll[lllllllllllllllllIlllIIllIlIlIlI];
        if ((Inventory.contains((int[])nArray3) ) {
            return 0;
        }
        ++lllllllllllllllllIlllIIllIlIlIlI;
        if ((0x32 ^ 0x36) > 0) continue;
        return ((0xAE ^ 0x87) & ~(0x29 ^ 0)) != 0;
    }
    return 1;
}



/*
* Enabled force condition propagation
* Lifted jumps to return sites
*/
@Override
public boolean getBankingItems() {
    int n2;
    if ((Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId())) >= (165)) {
        String[] dialogOptions = new String[1];
        DIALOG_OPTIONS[0] = "Tome of experience";
        if ((Inventory.contains((String[]) == 0stringArray) ) {
            n2 = 1;
            if ((0xC4 ^ 0x86 ^ (0x4D ^ 0xB)) != 0) return n2 != 0;
            return ((0x79 ^ 0x5F ^ (0x51 ^ 0x64)) & (0x3D ^ 0x57 ^ (0x57 ^ 0x2E) ^ -1)) != 0;
        }
    }
    n2 = 0;
    return n2 != 0;
}

private static int llIIIIlIlIIII(double d2, double d3) {
    return d2 == d3 ? 0 : (d2 > d3 ? 1 : -1);
}

private static boolean llIIIIlIlllIl(int n2) {
    return n2 >= 0;
}

@Override
public int shouldExecute() {
    try {
        prepareForQuest();
    }
    catch (Exception exception) {
        // empty catch block
    }
    if (((133 + 141 - 124 + 16 ^ 34 + 81 - 24 + 82) & (0xD0 ^ 0x81 ^ (0x62 ^ 0x38) ^ -1)) > 0) {
        return (0x83 ^ 0xB8 ^ (0x51 ^ 0x74)) & (0xE3 ^ 0x8C ^ (0xDC ^ 0xAD) ^ -1);
    }
    return 100;
}

@Override
public String execute() {
    return questName;
}



private private static boolean b(NPC nPC, TileObject tileObject) {
    int n2;
    if ((tileObject.getId()) == (32585) && (tileObject.getWorldLocation().distanceTo(nPC.getWorldLocation())) < (5)) {
        n2 = 1;
        if (3 <= 1) {
            return ((0x59 ^ 8) & ~(0x95 ^ 0xC4)) != 0;
        }
    } else {
    n2 = 0;
}
return n2 != 0;
}

public static void prepareForQuest() {
    block290: {
        WorldArea lllllllllllllllllIlllIIlllIIIllI;
        WorldArea lllllllllllllllllIlllIIlllIIIlll;
        Object lllllllllllllllllIlllIIlllIIlIII;
        Object lllllllllllllllllIlllIIlllIIlIIl;
        WorldArea lllllllllllllllllIlllIIlllIIlIlI;
        block291: {
            block297: {
                block296: {
                    block295: {
                        block294: {
                            block293: {
                                block292: {
                                    if ((isInCombat)) {
                                        b.a(questSteps);
                                        if (questSteps.size() < 1 {
                                            System.out.println("Finished buying items, switching back to quest");
                                            isInCombat = 0;
                                        }
                                    }
                                    if (!!(isInCombat)) break block290;
                                    if ((Skills.getLevel((Skill)Skill.CRAFTING)) < (48)) {
                                        ay.fi();
                                    }
                                    if ((Skills.getLevel((Skill)Skill.CRAFTING)) >= (48) && (Skills.getLevel((Skill)Skill.AGILITY)) < (45)) {
                                        av.eA();
                                    }
                                    if ((Skills.getLevel((Skill)Skill.CRAFTING)) >= (48) && (Skills.getLevel((Skill)Skill.AGILITY)) >= (45) && (Skills.getLevel((Skill)Skill.HERBLORE)) < (40)) {
                                        aB.fL();
                                    }
                                    if ((Skills.getLevel((Skill)Skill.CRAFTING)) >= (48) && (Skills.getLevel((Skill)Skill.AGILITY)) >= (45) && (Skills.getLevel((Skill)Skill.HERBLORE)) >= (40) && (Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId())) < (320)) {
                                        String[] dialogOptions = new String[1];
                                        DIALOG_OPTIONS[0] = "Tome of experience (3)";
                                        if ((Inventory.contains((String[]) == 0stringArray) ) {
                                            String[] DIALOG_OPTIONS2 = new String[1];
                                            stringArray2[0] = "Tome of experience (2)";
                                            if ((Inventory.contains((String[]) == 0stringArray2) ) {
                                                String[] DIALOG_OPTIONS3 = new String[1];
                                                stringArray3[0] = "Tome of experience (1)";
                                                if ((Inventory.contains((String[]) == 0stringArray3) ) {
                                                    y.bl();
                                                }
                                            }
                                        }
                                    }
                                    if ((Skills.getLevel((Skill)Skill.CRAFTING)) >= (48) && (Skills.getLevel((Skill)Skill.AGILITY)) >= (45) && (Skills.getLevel((Skill)Skill.HERBLORE)) >= (40) && (Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId())) >= (320)) {
                                        String[] dialogOptions = new String[1];
                                        DIALOG_OPTIONS[0] = "Tome of experience (3)";
                                        if ((Inventory.contains((String[]) == 0stringArray) ) {
                                            String[] DIALOG_OPTIONS4 = new String[1];
                                            stringArray4[0] = "Tome of experience (2)";
                                            if ((Inventory.contains((String[]) == 0stringArray4) ) {
                                                String[] DIALOG_OPTIONS5 = new String[1];
                                                stringArray5[0] = "Tome of experience (1)";
                                                if ((Inventory.contains((String[]) == 0stringArray5) ? 1 : 0) && (Skills.getLevel((Skill)Skill.SLAYER)) < (38)) {
                                                    aL.gb();
                                                }
                                            }
                                        }
                                    }
                                    if !!(an() || !(Vars.getBit((int) == 0QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId())) || !(Skills.getLevel((Skill)Skill.SLAYER)) >= (38) || !(Skills.getLevel((Skill)Skill.CRAFTING)) >= (48) || !(Skills.getLevel((Skill)Skill.AGILITY)) >= (45) || !(Skills.getLevel((Skill)Skill.HERBLORE)) >= (40) || !(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId())) >= (320)) break block291;
                                    String[] dialogOptions = new String[1];
                                    DIALOG_OPTIONS[0] = "Tome of experience (3)";
                                    if (!(Inventory.contains((String[]) == 0stringArray) ) break block291;
                                    String[] DIALOG_OPTIONS6 = new String[1];
                                    stringArray6[0] = "Tome of experience (2)";
                                    if (!(Inventory.contains((String[]) == 0stringArray6) ) break block291;
                                    String[] DIALOG_OPTIONS7 = new String[1];
                                    stringArray7[0] = "Tome of experience (1)";
                                    if (!(Inventory.contains((String[]) == 0stringArray7) ) break block291;
                                    lllllllllllllllllIlllIIlllIIlIlI = BankLocation.getNearest();
                                    if ((lllllllllllllllllIlllIIlllIIlIlI) != null && (lllllllllllllllllIlllIIlllIIlIlI.getArea() == 0.contains(Players.getLocal().getWorldLocation()) ) {
                                        AccBuilderSotf.c = "Nav to bank";
                                        BankingUtil.withdrawItem((BankLocation)lllllllllllllllllIlllIIlllIIlIlI);
                                    }
                                    if (!(lllllllllllllllllIlllIIlllIIlIlI) != null || !(lllllllllllllllllIlllIIlllIIlIlI.getArea() != 0.contains(Players.getLocal().getWorldLocation()) ) break block291;
                                    if (!Bank.isOpen()) {
                                        BankingUtil.openBank();
                                        Time.sleepUntil(() -> Bank.isOpen(), (int)5000);
                                    }
                                    if (!Bank.isOpen() break block291;
                                    AccBuilderSotf.c = "Handling banking";
                                    if (Inventory.getAll().size() > 0) {
                                        Bank.depositInventory();
                                        Time.sleepTicks((int)4);
                                    }
                                    if ((Equipment.getAll().size() > 0)) {
                                        Bank.depositEquipment();
                                        Time.sleepTicks((int)2);
                                    }
                                    int[] nArray = new int[1];
                                    nArray[0] = 3024;
                                    if (!(Bank.contains((int[])nArray) ) break block292;
                                    int[] nArray2 = new int[1];
                                    nArray2[0] = 3024;
                                    if (!(Bank.getFirst((int[])nArray2).getQuantity()) >= (10)) break block293;
                                }
                                int[] nArray = new int[1];
                                nArray[0] = 12695;
                                if (!(Bank.contains((int[])nArray) ) break block294;
                                int[] nArray3 = new int[1];
                                nArray3[0] = 12695;
                                if (!(Bank.getFirst((int[])nArray3).getQuantity()) < (10)) break block294;
                            }
                            Q();
                            System.out.println("We are missing super combat or super restores, switching to BUYING");
                            isInCombat = 1;
                            return;
                        }
                        int[] nArray = new int[1];
                        nArray[0] = 556;
                        if (!(Bank.contains((int[])nArray) ) break block295;
                        int[] nArray4 = new int[1];
                        nArray4[0] = 556;
                        if (!(Bank.getFirst((int[])nArray4).getQuantity()) >= (51)) break block296;
                    }
                    int[] nArray = new int[1];
                    nArray[0] = 554;
                    if (!(Bank.contains((int[])nArray) ) break block297;
                    int[] nArray5 = new int[1];
                    nArray5[0] = 554;
                    if (!(Bank.getFirst((int[])nArray5).getQuantity()) < (51)) break block297;
                }
                Q();
                System.out.println("We are missing air runes or fire runes, switching to BUYING");
                isInCombat = 1;
                return;
            }
            int[] nArray = new int[1];
            nArray[0] = 385;
            if ((Bank.contains((int[])nArray) ) {
                int[] nArray6 = new int[1];
                nArray6[0] = 385;
                if ((Bank.getFirst((int[])nArray6).getQuantity()) < (145)) {
                    Q();
                    System.out.println("We are missing shark, switching to BUYING");
                    isInCombat = 1;
                    return;
                }
            }
            int[] nArray7 = new int[1];
            nArray7[0] = 12695;
            if ((Bank.contains((int[])nArray7) ) {
                int[] nArray8 = new int[1];
                nArray8[0] = 12695;
                if ((Bank.getFirst((int[])nArray8).getQuantity()) < (10)) {
                    Q();
                    System.out.println("We are missing quest supplies, switching to BUYING");
                    isInCombat = 1;
                    return;
                }
            }
            int[] nArray9 = new int[20];
            nArray9[0] = 8007;
            nArray9[1] = 19629;
            nArray9[2] = 995;
            nArray9[3] = 2961;
            nArray9[4] = 1605;
            nArray9[5] = 1755;
            nArray9[6] = 233;
            nArray9[7] = 556;
            nArray9[8] = 564;
            nArray9[9] = 554;
            nArray9[10] = 227;
            nArray9[11] = 2434;
            nArray9[12] = 11840;
            nArray9[13] = 6568;
            nArray9[14] = 21298;
            nArray9[15] = 21301;
            nArray9[16] = 21304;
            nArray9[17] = 6524;
            nArray9[18] = 6735;
            nArray9[19] = 3024;
            if (!GameStateUtil.randomRange(nArray9) {
                Q();
                System.out.println("We are missing quest supplies, switching to BUYING");
                isInCombat = 1;
                return;
            }
            int[] nArray10 = new int[12];
            nArray10[0] = 8007;
            nArray10[1] = 19629;
            nArray10[2] = 995;
            nArray10[3] = 2961;
            nArray10[4] = 1605;
            nArray10[5] = 1755;
            nArray10[6] = 233;
            nArray10[7] = 556;
            nArray10[8] = 564;
            nArray10[9] = 227;
            nArray10[10] = 2434;
            nArray10[11] = 3024;
            if (GameStateUtil.randomRange(nArray10)) {
                BankingUtil.withdrawItem(12625, 4);
                BankingUtil.withdrawItem(8007, 10);
                BankingUtil.withdrawItem(19629, 10);
                BankingUtil.withdrawItem(995, 5000);
                BankingUtil.withdrawItem(2961, 1);
                BankingUtil.withdrawItem(1605, 1);
                BankingUtil.withdrawItem(1755, 1);
                BankingUtil.withdrawItem(233, 1);
                BankingUtil.withdrawItem(556, 3);
                BankingUtil.withdrawItem(227, 1);
                BankingUtil.withdrawItem(564, 1);
                BankingUtil.withdrawItem(2434, 2);
                BankingUtil.withdrawItem(21009, 1);
                BankingUtil.withdrawItem(1704, 1);
                BankingUtil.withdrawItem(12695, 1);
                int[] nArray11 = new int[1];
                nArray11[0] = 6735;
                if ((Bank.contains((int[])nArray11) ) {
                    BankingUtil.withdrawItem(6735, 1);
                }
                int[] nArray12 = new int[1];
                nArray12[0] = 11126;
                if ((Bank.contains((int[])nArray12) ) {
                    BankingUtil.withdrawItem(11126, 1);
                }
            }
        }
        if ((Inventory.contains((int[])ItemUtil.TELEPORT_TO_HOUSE) ? 1 : 0) && (Movement.getRunEnergy()) < (50)) {
            Inventory.getFirst((int[])ItemUtil.TELEPORT_TO_HOUSE).interact("Drink");
            Time.sleepTicks((int)1);
        }
        String[] dialogOptions = new String[1];
        DIALOG_OPTIONS[0] = "Vial";
        if (!(Inventory.contains((String[])stringArray) ? 1 : 0) || !Dialog.isOpen()) {
            // empty if block
        }
        if (an() && (Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId())) < (10)) {
            if ((UNDERGROUND_AREA.contains(Players.getLocal() == 0.getWorldLocation()) ) {
                AccBuilderSotf.c = "Nav to ground city";
                if (Dialog.isOpen()) {
                    Dialog.close();
                }
                int[] nArray = new int[1];
                nArray[0] = 21009;
                if ((Inventory.contains((int[])nArray) ) {
                    int[] nArray13 = new int[1];
                    nArray13[0] = 21009;
                    Inventory.getFirst((int[])nArray13).interact("Wield");
                }
                int[] nArray14 = new int[1];
                nArray14[0] = 1704;
                if ((Inventory.contains((int[])nArray14) ) {
                    int[] nArray15 = new int[1];
                    nArray15[0] = 1704;
                    Inventory.getFirst((int[])nArray15).interact("Wear");
                }
                int[] nArray16 = new int[1];
                nArray16[0] = 6735;
                if ((Inventory.contains((int[])nArray16) ) {
                    int[] nArray17 = new int[1];
                    nArray17[0] = 6735;
                    Inventory.getFirst((int[])nArray17).interact("Wear");
                }
                int[] nArray18 = new int[1];
                nArray18[0] = 11126;
                if ((Inventory.contains((int[])nArray18) ) {
                    int[] nArray19 = new int[1];
                    nArray19[0] = 11126;
                    Inventory.getFirst((int[])nArray19).interact("Wear");
                }
                y.bp();
            }
            if ((UNDERGROUND_AREA.contains(Players.getLocal() != 0.getWorldLocation()) ) {
                if ((Players.getLocal().getWorldLocation().distanceTo(MYREQUE_HIDEOUT)) < (5)) {
                    AccBuilderSotf.c = "Nav to start";
                    Movement.walkTo((WorldPoint)MYREQUE_HIDEOUT);
                    Time.sleepTicks((int)1);
                }
                if ((Players.getLocal().getWorldLocation().distanceTo(MYREQUE_HIDEOUT)) > (5)) {
                    DialogUtil.talkToNpc("Garth", DIALOG_OPTIONS);
                }
            }
            DialogUtil.chooseDialogOptions(y.DIALOG_OPTIONS);
        }
        if (an() && (Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId())) == (15)) {
            lllllllllllllllllIlllIIlllIIlIlI = new WorldArea(3607, 3198, 75, 30, 0);
            lllllllllllllllllIlllIIlllIIlIIl = new WorldArea(3601, 3218, 19, 8, 0);
            lllllllllllllllllIlllIIlllIIlIII = new WorldArea(3590, 3177, 20, 34, 0);
            if ((lllllllllllllllllIlllIIlllIIlIII.contains(Players.getLocal() == 0.getWorldLocation()) ? 1 : 0) && (lllllllllllllllllIlllIIlllIIlIIl.contains(Players.getLocal() == 0.getWorldLocation()) ? 1 : 0) && (lllllllllllllllllIlllIIlllIIlIlI.contains(Players.getLocal() != 0.getWorldLocation()) ) {
                AccBuilderSotf.c = "Nav to oldman area";
                Movement.walkTo((WorldPoint)y.dP);
                Time.sleepTicks((int)1);
            }
            y.bq();
            if ((Players.getLocal().getWorldLocation().distanceTo(NavUtil.DARKMEYER_WAYPOINT)) > (40)) {
                if ((Players.getLocal().getWorldLocation().distanceTo(NavUtil.DARKMEYER_WAYPOINT)) < (7)) {
                    AccBuilderSotf.c = "Run to base tile";
                    Movement.walkTo((WorldPoint)NavUtil.DARKMEYER_WAYPOINT);
                    Time.sleepTicks((int)1);
                }
                if ((Players.getLocal().getWorldLocation().distanceTo(NavUtil.DARKMEYER_WAYPOINT)) > (7)) {
                    AccBuilderSotf.c = "Talk";
                    DialogUtil.talkToNpc("Safalaan Hallow", DIALOG_OPTIONS);
                }
            }
        }
        if ((Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId())) == (20)) {
            if ((UNDERGROUND_AREA.contains(Players.getLocal() == 0.getWorldLocation()) ) {
                questProgress = 0;
                AccBuilderSotf.c = "Nav to ground city";
                if (Dialog.isOpen()) {
                    Dialog.close();
                }
                y.bp();
            }
            if ((UNDERGROUND_AREA.contains(Players.getLocal() != 0.getWorldLocation()) ) {
                if ((Players.getLocal().getWorldLocation().distanceTo(BANK_LOCATION)) < (5) && (DARKMEYER_AREA.contains(Players.getLocal() == 0.getWorldLocation()) ? 1 : 0) && (THEATRE_AREA.contains(Players.getLocal() == 0.getWorldLocation()) ? 1 : 0) && !Dialog.isOpen()) {
                    AccBuilderSotf.c = "Nav to tob wall";
                    Movement.walkTo((WorldPoint)BANK_LOCATION);
                    Time.sleepTicks((int)1);
                }
                if ((Players.getLocal().getWorldLocation().distanceTo(BANK_LOCATION)) > (9)) {
                    String[] DIALOG_OPTIONS8 = new String[1];
                    stringArray8[0] = "Rubble";
                    TileObjects.getNearest((String[])stringArray8).interact("Climb-up");
                    Time.sleepTicks((int)6);
                }
            }
            DialogUtil.chooseDialogOptions(y.DIALOG_OPTIONS);
        }
        if (!(Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId())) != (30) || (Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId())) == (35)) {
            String[] DIALOG_OPTIONS9 = new String[1];
            stringArray9[0] = "Shark";
            if ((Inventory.contains((String[]) == 0stringArray9) ) {
                if (!Bank.isOpen()) {
                    BankingUtil.openBank();
                }
                if (Bank.isOpen()) {
                    Bank.withdraw((int)385, (int)7, (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                }
            }
            String[] DIALOG_OPTIONS10 = new String[1];
            stringArray10[0] = "Shark";
            if ((Inventory.contains((String[])stringArray10) ) {
                if (Dialog.isOpen()) {
                    Dialog.close();
                }
                DialogUtil.talkToNpc("Harpert", DIALOG_OPTIONS);
            }
            DialogUtil.chooseDialogOptions(DIALOG_OPTIONS);
        }
        if ((Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId())) == (40)) {
            TileObject lllllllllllllllllIlllIIlllIIIIIl;
            if ((Players.getLocal().getWorldLocation().distanceTo(BANK_LOCATION)) > (9)) {
                AccBuilderSotf.c = "Go up rubble";
                String[] DIALOG_OPTIONS11 = new String[1];
                stringArray11[0] = "Rubble";
                TileObjects.getNearest((String[])stringArray11).interact("Climb-up");
                Time.sleepTicks((int)6);
            }
            lllllllllllllllllIlllIIlllIIlIlI = new WorldArea(3636, 3200, 13, 15, 1);
            lllllllllllllllllIlllIIlllIIlIIl = new WorldArea(3639, 3211, 12, 17, 2);
            lllllllllllllllllIlllIIlllIIlIII = new WorldArea(3636, 3224, 12, 13, 1);
            lllllllllllllllllIlllIIlllIIIlll = new WorldArea(3638, 3232, 24, 10, 2);
            lllllllllllllllllIlllIIlllIIIllI = new WorldArea(3663, 3221, 29, 22, 2);
            WorldPoint lllllllllllllllllIlllIIlllIIIlIl = new WorldPoint(3686, 3223, 2);
            WorldPoint lllllllllllllllllIlllIIlllIIIlII = new WorldPoint(3643, 3213, 1);
            WorldPoint lllllllllllllllllIlllIIlllIIIIll = new WorldPoint(3640, 3234, 1);
            WorldPoint lllllllllllllllllIlllIIlllIIIIlI = new WorldPoint(3644, 3224, 2);
            if ((lllllllllllllllllIlllIIlllIIlIlI.contains(Players.getLocal() != 0.getWorldLocation()) ) {
                if ((Players.getLocal() == 0.getWorldLocation().equals((Object)lllllllllllllllllIlllIIlllIIIlII) ) {
                    AccBuilderSotf.c = "Nav to tile";
                    Movement.walkTo((WorldPoint)lllllllllllllllllIlllIIlllIIIlII);
                    Time.sleepTicks((int)1);
                }
                if ((Players.getLocal() != 0.getWorldLocation().equals((Object)lllllllllllllllllIlllIIlllIIIlII) ? 1 : 0) && (AccBuilderSotf.i.containsKey(lllllllllllllllllIlllIIlllIIIIIl = new WorldPoint(3644, 3213, 1) == 0) ) {
                    AccBuilderSotf.c = "NO anim going up";
                    String[] DIALOG_OPTIONS12 = new String[1];
                    stringArray12[0] = "Vent";
                    TileObjects.getNearest((String[])stringArray12).interact("Climb-up");
                    Time.sleepTicks((int)4);
                }
            }
            if ((lllllllllllllllllIlllIIlllIIlIIl.contains(Players.getLocal() != 0.getWorldLocation()) ) {
                if ((Players.getLocal().getWorldLocation().distanceTo(lllllllllllllllllIlllIIlllIIIIlI)) < (2)) {
                    AccBuilderSotf.c = "Go to roof tile 1";
                    Movement.walkTo((WorldPoint)lllllllllllllllllIlllIIlllIIIIlI);
                    Time.sleepTicks((int)1);
                }
                if ((Players.getLocal().getWorldLocation().distanceTo(lllllllllllllllllIlllIIlllIIIIlI)) > (2)) {
                    String[] DIALOG_OPTIONS13 = new String[1];
                    stringArray13[0] = "Roof";
                    TileObjects.getNearest((String[])stringArray13).interact("Jump-off");
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if ((Players.getLocal().getWorldLocation().getPlane()) != (2)) {
                            bl = 1;
                            if (3 < 2) {
                                return ((0x51 ^ 0x1C) & ~(0xD1 ^ 0x9C)) != 0;
                            }
                        } else {
                        bl = 0;
                    }
                    return bl;
                }, (int)5600);
            }
        }
        if ((lllllllllllllllllIlllIIlllIIlIII.contains(Players.getLocal() != 0.getWorldLocation()) ) {
            if ((Players.getLocal() == 0.getWorldLocation().equals((Object)lllllllllllllllllIlllIIlllIIIIll) ) {
                AccBuilderSotf.c = "Nav to tile";
                Movement.walkTo((WorldPoint)lllllllllllllllllIlllIIlllIIIIll);
                Time.sleepTicks((int)1);
            }
            if ((Players.getLocal() != 0.getWorldLocation().equals((Object)lllllllllllllllllIlllIIlllIIIIll) ? 1 : 0) && (AccBuilderSotf.i.containsKey(lllllllllllllllllIlllIIlllIIIIIl = new WorldPoint(3640, 3235, 1) == 0) ) {
                AccBuilderSotf.c = "NO anim going up";
                String[] DIALOG_OPTIONS14 = new String[1];
                stringArray14[0] = "Vent";
                TileObjects.getNearest((String[])stringArray14).interact("Climb-up");
                Time.sleepTicks((int)4);
            }
        }
        if ((lllllllllllllllllIlllIIlllIIIlll.contains(Players.getLocal() != 0.getWorldLocation()) ? 1 : 0) && (lllllllllllllllllIlllIIlllIIIIIl = TileObjects.getNearest(tileObject -> {
            int n2;
            if ((tileObject.getName() != null != 0.equalsIgnoreCase("roof") ) {
                String[] dialogOptions = new String[1];
                DIALOG_OPTIONS[0] = "Climb-up";
                if (tileObject.hasAction(stringArray)) {
                    n2 = 1;
                    if (-1 < 3) return n2 != 0;
                    return ((0xDF ^ 0x81) & ~(0xF1 ^ 0xAF)) != 0;
                }
            }
            n2 = 0;
            return n2 != 0;
        })) && (Players.getLocal() == 0.isAnimating() ? 1 : 0) && (Players.getLocal() == 0.isMoving() ) {
        lllllllllllllllllIlllIIlllIIIIIl.interact("Climb-up");
        Time.sleepTicks((int)2);
    }
    if (((lllllllllllllllllIlllIIlllIIIIIl = new WorldArea(3650, 3229, 23, 18, 3) != 0).contains(Players.getLocal().getWorldLocation()) ) {
        String[] DIALOG_OPTIONS15 = new String[1];
        stringArray15[0] = "Roof";
        List lllllllllllllllllIlllIIlllIIIIII = TileObjects.getAll((String[])stringArray15).stream().filter(tileObject -> {
            boolean bl;
            if ((tileObject.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation())) < (2)) {
                bl = 1;
                if ((0xE6 ^ 0x92 ^ (0x3F ^ 0x4F)) != (0x21 ^ 0x6C ^ (3 ^ 0x4A))) {
                    return ((81 + 123 - 134 + 92 ^ 72 + 81 - 38 + 66) & (0x37 ^ 0x59 ^ (0x41 ^ 0x38) ^ -1)) != 0;
                }
            } else {
            bl = 0;
        }
        return bl;
    }).collect(Collectors.toList());
    if (!lllllllllllllllllIlllIIlllIIIIII.isEmpty() {
        ((TileObject)lllllllllllllllllIlllIIlllIIIIII.get(0)).interact("Climb-down");
        Time.sleepTicks((int)5);
    }
}
if ((lllllllllllllllllIlllIIlllIIIllI.contains(Players.getLocal() != 0.getWorldLocation()) ) {
    if ((Players.getLocal().getWorldLocation().distanceTo(lllllllllllllllllIlllIIlllIIIlIl)) < (4)) {
        AccBuilderSotf.c = "Nav to window";
        Movement.walkTo((WorldPoint)lllllllllllllllllIlllIIlllIIIlIl);
        Time.sleepTicks((int)1);
    }
    if ((Players.getLocal().getWorldLocation().distanceTo(lllllllllllllllllIlllIIlllIIIlIl)) > (4) && !Dialog.isOpen()) {
        String[] DIALOG_OPTIONS16 = new String[1];
        stringArray16[0] = "Window";
        TileObjects.getNearest((String[])stringArray16).interact("Look-through");
        Time.sleepTicks((int)3);
    }
}
if ((Skills.getBoostedLevel((Skill)Skill.HITPOINTS)) < (Skills.getLevel((Skill)Skill.HITPOINTS) - 20)) {
    String[] DIALOG_OPTIONS17 = new String[1];
    stringArray17[0] = "Shark";
    Inventory.getFirst((String[])stringArray17).interact("Eat");
    Time.sleepTicks((int)1);
}
DialogUtil.chooseDialogOptions(DIALOG_OPTIONS);
}
if ((Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId())) == (45)) {
    lllllllllllllllllIlllIIlllIIlIlI = new WorldArea(3663, 3221, 29, 22, 2);
    if ((lllllllllllllllllIlllIIlllIIlIlI.contains(Players.getLocal() != 0.getWorldLocation()) ? 1 : 0) && !Dialog.isOpen()) {
        int[] nArray = new int[1];
        nArray[0] = 19629;
        Inventory.getFirst((int[])nArray).interact("Break");
        Time.sleepTicks((int)6);
    }
    int[] nArray = new int[1];
    nArray[0] = 3024;
    if ((Inventory.contains((int[])nArray) ) {
        if ((Players.getLocal().getWorldLocation().distanceTo(D.fa)) < (8)) {
            AccBuilderSotf.c = "Nav to burgh bank";
            Movement.walkTo((WorldPoint)D.fa);
            Time.sleepTicks((int)1);
        }
        if ((Players.getLocal().getWorldLocation().distanceTo(D.fa)) > (8)) {
            if (!Bank.isOpen()) {
                int[] nArray20 = new int[1];
                nArray20[0] = 12759;
                if ((TileObjects.getNearest((int[]) != nullnArray20)) && (Players.getLocal().getWorldLocation().distanceTo(D.fa)) > (10)) {
                    int[] nArray21 = new int[1];
                    nArray21[0] = 12759;
                    TileObjects.getNearest((int[])nArray21).interact("Bank");
                    Time.sleepTicks((int)2);
                }
            }
            if (Bank.isOpen()) {
                int[] nArray22 = new int[1];
                nArray22[0] = 995;
                Bank.depositAll((int[])nArray22);
                int[] nArray23 = new int[1];
                nArray23[0] = 1605;
                Bank.depositAll((int[])nArray23);
                int[] nArray24 = new int[1];
                nArray24[0] = 2961;
                Bank.depositAll((int[])nArray24);
                int[] nArray25 = new int[1];
                nArray25[0] = 556;
                Bank.depositAll((int[])nArray25);
                int[] nArray26 = new int[1];
                nArray26[0] = 564;
                Bank.depositAll((int[])nArray26);
                int[] nArray27 = new int[1];
                nArray27[0] = 12695;
                if ((Inventory.contains((int[])nArray27) ) {
                    BankingUtil.withdrawItem(12695, 1);
                }
                int[] nArray28 = new int[1];
                nArray28[0] = 3024;
                if ((Inventory.contains((int[])nArray28) ) {
                    BankingUtil.withdrawItem(3024, 2);
                }
                BankingUtil.withdrawItem(385, Inventory.getFreeSlots() - 4);
            }
        }
    }
    int[] nArray29 = new int[1];
    nArray29[0] = 3024;
    if ((Inventory.contains((int[])nArray29) ) {
        lllllllllllllllllIlllIIlllIIlIIl = new WorldArea(3590, 3179, 55, 149, 0);
        lllllllllllllllllIlllIIlllIIlIII = new WorldArea(3590, 3179, 55, 149, 1);
        lllllllllllllllllIlllIIlllIIIlll = new WorldArea(3590, 3179, 55, 149, 2);
        lllllllllllllllllIlllIIlllIIIllI = new WorldArea(3590, 3179, 55, 149, 3);
        if (Dialog.isOpen()) {
            Dialog.close();
        }
        if ((UNDERGROUND_AREA.contains(Players.getLocal() == 0.getWorldLocation()) ? 1 : 0) && (Players.getLocal().getWorldLocation().distanceTo(NavUtil.DARKMEYER_WAYPOINT)) < (40) && (lllllllllllllllllIlllIIlllIIlIIl.contains(Players.getLocal() == 0.getWorldLocation()) ? 1 : 0) && (lllllllllllllllllIlllIIlllIIlIII.contains(Players.getLocal() == 0.getWorldLocation()) ? 1 : 0) && (lllllllllllllllllIlllIIlllIIIlll.contains(Players.getLocal() == 0.getWorldLocation()) ? 1 : 0) && (lllllllllllllllllIlllIIlllIIIllI.contains(Players.getLocal() == 0.getWorldLocation()) ) {
            AccBuilderSotf.c = "Nav to ground city";
            if (Dialog.isOpen()) {
                Dialog.close();
            }
            y.bp();
        }
        y.bq();
        if ((Players.getLocal().getWorldLocation().distanceTo(NavUtil.DARKMEYER_WAYPOINT)) > (40)) {
            if ((Players.getLocal().getWorldLocation().distanceTo(NavUtil.DARKMEYER_WAYPOINT)) < (7)) {
                AccBuilderSotf.c = "Run to base tile";
                Movement.walkTo((WorldPoint)NavUtil.DARKMEYER_WAYPOINT);
                Time.sleepTicks((int)1);
            }
            if ((Players.getLocal().getWorldLocation().distanceTo(NavUtil.DARKMEYER_WAYPOINT)) > (7)) {
                AccBuilderSotf.c = "Talk";
                DialogUtil.talkToNpc("Safalaan Hallow", DIALOG_OPTIONS);
            }
        }
    }
    DialogUtil.chooseDialogOptions(DIALOG_OPTIONS);
}
if (!(Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId())) != (50) || !(Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId())) != (55) || (Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId())) == (60)) {
    DialogUtil.talkToNpc("Flaygian Screwte", DIALOG_OPTIONS);
}
if (!(Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId())) != (65) || (Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId())) == (70)) {
    DialogUtil.talkToNpc("Safalaan Hallow", DIALOG_OPTIONS);
}
if ((Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId())) == (75)) {
    navigateToStart();
}
if ((Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId())) == (80)) {
    if (Inventory.isFull()) {
        String[] DIALOG_OPTIONS18 = new String[1];
        stringArray18[0] = "Shark";
        Inventory.getFirst((String[])stringArray18).interact("Eat");
        Time.sleepTicks((int)2);
    }
    String[] DIALOG_OPTIONS19 = new String[1];
    stringArray19[0] = "Unfinished potion";
    if ((Inventory.contains((String[]) == 0stringArray19) ) {
        String[] DIALOG_OPTIONS20 = new String[1];
        stringArray20[0] = "Mysterious crushed meat";
        if ((Inventory.contains((String[]) == 0stringArray20) ) {
            String[] DIALOG_OPTIONS21 = new String[1];
            stringArray21[0] = "Mysterious herb";
            if ((Inventory.contains((String[]) == 0stringArray21) ) {
                String[] DIALOG_OPTIONS22 = new String[1];
                stringArray22[0] = "Unfinished potion";
                if ((Inventory.contains((String[]) == 0stringArray22) ) {
                    AccBuilderSotf.c = "Getting herb";
                    int[] nArray = new int[1];
                    nArray[0] = 32564;
                    TileObjects.getNearest((int[])nArray).interact("Search");
                    Time.sleepTicks((int)3);
                }
            }
            String[] DIALOG_OPTIONS23 = new String[1];
            stringArray23[0] = "Mysterious herb";
            if ((Inventory.contains((String[])stringArray23) ) {
                String[] DIALOG_OPTIONS24 = new String[1];
                stringArray24[0] = "Mysterious meat";
                if ((Inventory.contains((String[]) == 0stringArray24) ) {
                    AccBuilderSotf.c = "Getting meat";
                    int[] nArray = new int[1];
                    nArray[0] = 32567;
                    TileObjects.getNearest((int[])nArray).interact("Search");
                    Time.sleepTicks((int)3);
                }
            }
            String[] DIALOG_OPTIONS25 = new String[1];
            stringArray25[0] = "Mysterious herb";
            if ((Inventory.contains((String[])stringArray25) ) {
                String[] DIALOG_OPTIONS26 = new String[1];
                stringArray26[0] = "Unfinished potion";
                if ((Inventory.contains((String[]) == 0stringArray26) ) {
                    String[] DIALOG_OPTIONS27 = new String[1];
                    stringArray27[0] = "Mysterious meat";
                    if ((Inventory.contains((String[])stringArray27) ) {
                        AccBuilderSotf.c = "Mixing herb with water";
                        String[] DIALOG_OPTIONS28 = new String[1];
                        stringArray28[0] = "Mysterious herb";
                        String[] DIALOG_OPTIONS29 = new String[1];
                        stringArray29[0] = "Vial of water";
                        Inventory.getFirst((String[])stringArray28).useOn(Inventory.getFirst((String[])stringArray29));
                        Time.sleepTicks((int)2);
                    }
                }
            }
        }
    }
    String[] DIALOG_OPTIONS30 = new String[1];
    stringArray30[0] = "Unfinished potion";
    if ((Inventory.contains((String[])stringArray30) ) {
        String[] DIALOG_OPTIONS31 = new String[1];
        stringArray31[0] = "Mysterious meat";
        if ((Inventory.contains((String[])stringArray31) ) {
            AccBuilderSotf.c = "Grinding meat";
            String[] DIALOG_OPTIONS32 = new String[1];
            stringArray32[0] = "Mysterious meat";
            int[] nArray = new int[1];
            nArray[0] = 233;
            Inventory.getFirst((String[])stringArray32).useOn(Inventory.getFirst((int[])nArray));
            Time.sleepTicks((int)2);
        }
    }
    String[] DIALOG_OPTIONS33 = new String[1];
    stringArray33[0] = "Unfinished potion";
    if ((Inventory.contains((String[])stringArray33) ) {
        String[] DIALOG_OPTIONS34 = new String[1];
        stringArray34[0] = "Mysterious crushed meat";
        if ((Inventory.contains((String[])stringArray34) ) {
            AccBuilderSotf.c = "Using crushed meat on unf pot";
            String[] DIALOG_OPTIONS35 = new String[1];
            stringArray35[0] = "Mysterious crushed meat";
            String[] DIALOG_OPTIONS36 = new String[1];
            stringArray36[0] = "Unfinished potion";
            Inventory.getFirst((String[])stringArray35).useOn(Inventory.getFirst((String[])stringArray36));
            Time.sleepTicks((int)2);
        }
    }
    String[] DIALOG_OPTIONS37 = new String[1];
    stringArray37[0] = "Potion";
    if ((Inventory.contains((String[])stringArray37) ) {
        AccBuilderSotf.c = "Throwing potion on door";
        String[] DIALOG_OPTIONS38 = new String[1];
        stringArray38[0] = "Potion";
        String[] DIALOG_OPTIONS39 = new String[1];
        stringArray39[0] = "Door";
        Inventory.getFirst((String[])stringArray38).useOn(TileObjects.getNearest((String[])stringArray39));
        Time.sleepTicks((int)4);
    }
    DialogUtil.chooseDialogOptions(DIALOG_OPTIONS);
}
if ((Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId())) == (81)) {
    DialogUtil.chooseDialogOptions(DIALOG_OPTIONS);
}
if ((Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId())) == (82)) {
    DialogUtil.talkToNpc("Safalaan Hallow", DIALOG_OPTIONS);
}
if ((Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId())) == (83)) {
    DialogUtil.chooseDialogOptions(DIALOG_OPTIONS);
}
if ((Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId())) == (84)) {
    String[] DIALOG_OPTIONS40 = new String[1];
    stringArray40[0] = "Mysterious herb";
    if ((Inventory.contains((String[]) == 0stringArray40) ) {
        String[] DIALOG_OPTIONS41 = new String[1];
        stringArray41[0] = "Unfinished blood potion";
        if ((Inventory.contains((String[]) == 0stringArray41) ) {
            AccBuilderSotf.c = "Getting herb";
            int[] nArray = new int[1];
            nArray[0] = 32564;
            TileObjects.getNearest((int[])nArray).interact("Search");
            Time.sleepTicks((int)3);
        }
    }
    String[] DIALOG_OPTIONS42 = new String[1];
    stringArray42[0] = "Mysterious herb";
    if ((Inventory.contains((String[])stringArray42) ) {
        String[] DIALOG_OPTIONS43 = new String[1];
        stringArray43[0] = "Mysterious meat";
        if ((Inventory.contains((String[]) == 0stringArray43) ) {
            AccBuilderSotf.c = "Getting meat";
            int[] nArray = new int[1];
            nArray[0] = 32567;
            TileObjects.getNearest((int[])nArray).interact("Search");
            Time.sleepTicks((int)3);
        }
    }
    String[] DIALOG_OPTIONS44 = new String[1];
    stringArray44[0] = "Mysterious herb";
    if ((Inventory.contains((String[])stringArray44) ) {
        String[] DIALOG_OPTIONS45 = new String[1];
        stringArray45[0] = "Unfinished potion";
        if ((Inventory.contains((String[]) == 0stringArray45) ) {
            String[] DIALOG_OPTIONS46 = new String[1];
            stringArray46[0] = "Mysterious meat";
            if ((Inventory.contains((String[])stringArray46) ) {
                String[] DIALOG_OPTIONS47 = new String[1];
                stringArray47[0] = "Mysterious herb";
                String[] DIALOG_OPTIONS48 = new String[1];
                stringArray48[0] = "Vial of blood";
                Inventory.getFirst((String[])stringArray47).useOn(Inventory.getFirst((String[])stringArray48));
                Time.sleepTicks((int)2);
            }
        }
    }
    String[] DIALOG_OPTIONS49 = new String[1];
    stringArray49[0] = "Unfinished blood potion";
    if ((Inventory.contains((String[])stringArray49) ) {
        String[] DIALOG_OPTIONS50 = new String[1];
        stringArray50[0] = "Mysterious meat";
        if ((Inventory.contains((String[])stringArray50) ) {
            String[] DIALOG_OPTIONS51 = new String[1];
            stringArray51[0] = "Mysterious meat";
            int[] nArray = new int[1];
            nArray[0] = 233;
            Inventory.getFirst((String[])stringArray51).useOn(Inventory.getFirst((int[])nArray));
            Time.sleepTicks((int)2);
        }
    }
    String[] DIALOG_OPTIONS52 = new String[1];
    stringArray52[0] = "Unfinished blood potion";
    if ((Inventory.contains((String[])stringArray52) ) {
        String[] DIALOG_OPTIONS53 = new String[1];
        stringArray53[0] = "Mysterious crushed meat";
        if ((Inventory.contains((String[])stringArray53) ) {
            String[] DIALOG_OPTIONS54 = new String[1];
            stringArray54[0] = "Mysterious crushed meat";
            String[] DIALOG_OPTIONS55 = new String[1];
            stringArray55[0] = "Unfinished blood potion";
            Inventory.getFirst((String[])stringArray54).useOn(Inventory.getFirst((String[])stringArray55));
            Time.sleepTicks((int)2);
        }
    }
    String[] DIALOG_OPTIONS56 = new String[1];
    stringArray56[0] = "Blood potion";
    if ((Inventory.contains((String[])stringArray56) ) {
        String[] DIALOG_OPTIONS57 = new String[1];
        stringArray57[0] = "Blood potion";
        String[] DIALOG_OPTIONS58 = new String[1];
        stringArray58[0] = "Door";
        Inventory.getFirst((String[])stringArray57).useOn(TileObjects.getNearest((String[])stringArray58));
        Time.sleepTicks((int)4);
    }
    DialogUtil.chooseDialogOptions(DIALOG_OPTIONS);
    DialogUtil.chooseDialogOptions(DIALOG_OPTIONS);
}
if ((Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId())) == (85)) {
    lllllllllllllllllIlllIIlllIIlIlI = new WorldArea(3593, 9680, 7, 5, 0);
    if ((lllllllllllllllllIlllIIlllIIlIlI.contains(Players.getLocal() == 0.getWorldLocation()) ) {
        String[] DIALOG_OPTIONS59 = new String[1];
        stringArray59[0] = "Door";
        TileObjects.getNearest((String[])stringArray59).interact("Open");
        Time.sleepTicks((int)4);
    }
    if ((lllllllllllllllllIlllIIlllIIlIlI.contains(Players.getLocal() != 0.getWorldLocation()) ) {
        String[] DIALOG_OPTIONS60 = new String[1];
        stringArray60[0] = "Chest";
        String[] DIALOG_OPTIONS61 = new String[1];
        stringArray61[0] = "Open";
        if ((TileObjects.getNearest((String[])stringArray60).hasAction(stringArray61) ) {
            String[] DIALOG_OPTIONS62 = new String[1];
            stringArray62[0] = "Chest";
            TileObjects.getNearest((String[])stringArray62).interact("Open");
            Time.sleepTicks((int)3);
        }
        String[] DIALOG_OPTIONS63 = new String[1];
        stringArray63[0] = "Chest";
        String[] DIALOG_OPTIONS64 = new String[1];
        stringArray64[0] = "Search";
        if ((TileObjects.getNearest((String[])stringArray63).hasAction(stringArray64) ) {
            String[] DIALOG_OPTIONS65 = new String[1];
            stringArray65[0] = "Chest";
            TileObjects.getNearest((String[])stringArray65).interact("Search");
            Time.sleepTicks((int)3);
        }
    }
    DialogUtil.chooseDialogOptions(DIALOG_OPTIONS);
}
if ((Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId())) == (86)) {
    lllllllllllllllllIlllIIlllIIlIlI = new WorldArea(3593, 9680, 7, 5, 0);
    if ((lllllllllllllllllIlllIIlllIIlIlI.contains(Players.getLocal() != 0.getWorldLocation()) ) {
        String[] DIALOG_OPTIONS66 = new String[1];
        stringArray66[0] = "Door";
        TileObjects.getNearest((String[])stringArray66).interact("Open");
        Time.sleepTicks((int)4);
    }
    if ((lllllllllllllllllIlllIIlllIIlIlI.contains(Players.getLocal() == 0.getWorldLocation()) ) {
        DialogUtil.talkToNpc("Safalaan Hallow", DIALOG_OPTIONS);
    }
}
if ((Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId())) == (90)) {
    lllllllllllllllllIlllIIlllIIlIlI = new WorldArea(3589, 9668, 13, 18, 0);
    while ((lllllllllllllllllIlllIIlllIIlIlI.contains(Players.getLocal() != 0.getWorldLocation()) ) {
        int[] nArray = new int[1];
        nArray[0] = 19629;
        Inventory.getFirst((int[])nArray).interact("Break");
        Time.sleepTicks((int)5);
        0;
        if (-(8 ^ 0x7B ^ (0xB3 ^ 0xC4)) < 0) continue;
        return;
    }
    lllllllllllllllllIlllIIlllIIlIIl = new WorldArea(3590, 3179, 55, 149, 0);
    lllllllllllllllllIlllIIlllIIlIII = new WorldArea(3590, 3179, 55, 149, 1);
    lllllllllllllllllIlllIIlllIIIlll = new WorldArea(3590, 3179, 55, 149, 2);
    lllllllllllllllllIlllIIlllIIIllI = new WorldArea(3590, 3179, 55, 149, 3);
    if ((UNDERGROUND_AREA.contains(Players.getLocal() == 0.getWorldLocation()) ? 1 : 0) && (Players.getLocal().getWorldLocation().distanceTo(NavUtil.DARKMEYER_WAYPOINT)) < (40) && (lllllllllllllllllIlllIIlllIIlIIl.contains(Players.getLocal() == 0.getWorldLocation()) ? 1 : 0) && (lllllllllllllllllIlllIIlllIIlIII.contains(Players.getLocal() == 0.getWorldLocation()) ? 1 : 0) && (lllllllllllllllllIlllIIlllIIIlll.contains(Players.getLocal() == 0.getWorldLocation()) ? 1 : 0) && (lllllllllllllllllIlllIIlllIIIllI.contains(Players.getLocal() == 0.getWorldLocation()) ) {
        AccBuilderSotf.c = "Nav to ground city";
        if (Dialog.isOpen()) {
            Dialog.close();
        }
        y.bp();
    }
    y.bq();
    if ((Players.getLocal().getWorldLocation().distanceTo(NavUtil.DARKMEYER_WAYPOINT)) > (40)) {
        if ((Players.getLocal().getWorldLocation().distanceTo(NavUtil.DARKMEYER_WAYPOINT)) < (7)) {
            AccBuilderSotf.c = "Run to base tile";
            Movement.walkTo((WorldPoint)NavUtil.DARKMEYER_WAYPOINT);
            Time.sleepTicks((int)1);
        }
        if ((Players.getLocal().getWorldLocation().distanceTo(NavUtil.DARKMEYER_WAYPOINT)) > (7)) {
            AccBuilderSotf.c = "Talk";
            DialogUtil.talkToNpc("Safalaan Hallow", DIALOG_OPTIONS);
        }
    }
    DialogUtil.chooseDialogOptions(DIALOG_OPTIONS);
}
if (!(Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId())) != (95) || (Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId())) == (100)) {
    String[] DIALOG_OPTIONS67 = new String[1];
    stringArray67[0] = "Abomination";
    if ((NPCs.getNearest((String[]) != nullstringArray67))) {
        AccBuilderSotf.c = "Handle fight";
        if ((Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ) {
            Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
        }
        if ((Prayers.isEnabled((Prayer)Prayer.ULTIMATE_STRENGTH) ) {
            Prayers.toggle((Prayer)Prayer.ULTIMATE_STRENGTH);
        }
        if ((Prayers.isEnabled((Prayer)Prayer.INCREDIBLE_REFLEXES) ) {
            Prayers.toggle((Prayer)Prayer.INCREDIBLE_REFLEXES);
        }
        if (llIIIIlIllIll(llIIIIlIIllll(GameStateUtil.getHealthPercentage(), 70.0))) {
            String[] DIALOG_OPTIONS68 = new String[1];
            stringArray68[0] = "Shark";
            if ((Inventory.contains((String[])stringArray68) ) {
                String[] DIALOG_OPTIONS69 = new String[1];
                stringArray69[0] = "Shark";
                Inventory.getFirst((String[])stringArray69).interact("Eat");
            }
        }
        if ((Skills.getLevel((Skill)Skill.STRENGTH)) == (Skills.getBoostedLevel((Skill)Skill.STRENGTH)) && (Inventory.contains((int[])ItemIdArrays.SUPER_RESTORE_POTIONS) ) {
            Inventory.getFirst((int[])ItemIdArrays.SUPER_RESTORE_POTIONS).interact("Drink");
        }
        if (Prayers.getPoints() < 30 {
            int[] nArray = new int[1];
            nArray[0] = 3024;
            if ((Inventory.contains((int[])nArray) ) {
                int[] nArray30 = new int[1];
                nArray30[0] = 3024;
                Inventory.getFirst((int[])nArray30).interact("Drink");
            }
            int[] nArray31 = new int[1];
            nArray31[0] = 3028;
            if ((Inventory.contains((int[])nArray31) ) {
                int[] nArray32 = new int[1];
                nArray32[0] = 3028;
                Inventory.getFirst((int[])nArray32).interact("Drink");
            }
            int[] nArray33 = new int[1];
            nArray33[0] = 3026;
            if ((Inventory.contains((int[])nArray33) ) {
                int[] nArray34 = new int[1];
                nArray34[0] = 3026;
                Inventory.getFirst((int[])nArray34).interact("Drink");
            }
            int[] nArray35 = new int[1];
            nArray35[0] = 3030;
            if ((Inventory.contains((int[])nArray35) ) {
                int[] nArray36 = new int[1];
                nArray36[0] = 3030;
                Inventory.getFirst((int[])nArray36).interact("Drink");
            }
        }
        if ((Players.getLocal() == null.getInteracting())) {
            String[] DIALOG_OPTIONS70 = new String[1];
            stringArray70[0] = "Abomination";
            NPCs.getNearest((String[])stringArray70).interact("Attack");
        }
    }
    DialogUtil.chooseDialogOptions(DIALOG_OPTIONS);
}
if ((Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId())) == (110)) {
    int[] nArray = new int[1];
    nArray[0] = 1605;
    if ((Inventory.contains((int[])nArray) ) {
        if ((Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ) {
            Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
        }
        if ((Prayers.isEnabled((Prayer)Prayer.ULTIMATE_STRENGTH) ) {
            Prayers.toggle((Prayer)Prayer.ULTIMATE_STRENGTH);
        }
        if ((Prayers.isEnabled((Prayer)Prayer.INCREDIBLE_REFLEXES) ) {
            Prayers.toggle((Prayer)Prayer.INCREDIBLE_REFLEXES);
        }
        if (Prayers.getPoints() < 45 {
            int[] nArray37 = new int[1];
            nArray37[0] = 3024;
            if ((Inventory.contains((int[])nArray37) ) {
                int[] nArray38 = new int[1];
                nArray38[0] = 3024;
                Inventory.getFirst((int[])nArray38).interact("Drink");
            }
            int[] nArray39 = new int[1];
            nArray39[0] = 3024;
            if ((Inventory.contains((int[])nArray39) ) {
                int[] nArray40 = new int[1];
                nArray40[0] = 3024;
                Inventory.getFirst((int[])nArray40).interact("Drink");
            }
            int[] nArray41 = new int[1];
            nArray41[0] = 3028;
            if ((Inventory.contains((int[])nArray41) ) {
                int[] nArray42 = new int[1];
                nArray42[0] = 3028;
                Inventory.getFirst((int[])nArray42).interact("Drink");
            }
            int[] nArray43 = new int[1];
            nArray43[0] = 3026;
            if ((Inventory.contains((int[])nArray43) ) {
                int[] nArray44 = new int[1];
                nArray44[0] = 3026;
                Inventory.getFirst((int[])nArray44).interact("Drink");
            }
            int[] nArray45 = new int[1];
            nArray45[0] = 3030;
            if ((Inventory.contains((int[])nArray45) ) {
                int[] nArray46 = new int[1];
                nArray46[0] = 3030;
                Inventory.getFirst((int[])nArray46).interact("Drink");
            }
        }
        if (llIIIIlIllIll(llIIIIlIIllll(GameStateUtil.getHealthPercentage(), 100.0))) {
            String[] DIALOG_OPTIONS71 = new String[1];
            stringArray71[0] = "Shark";
            if ((Inventory.contains((String[])stringArray71) ) {
                String[] DIALOG_OPTIONS72 = new String[1];
                stringArray72[0] = "Shark";
                Inventory.getFirst((String[])stringArray72).interact("Eat");
            }
        }
        if ((Players.getLocal().getWorldLocation().distanceTo(D.fa)) < (8)) {
            AccBuilderSotf.c = "Nav to burgh bank";
            lllllllllllllllllIlllIIlllIIlIlI = new WorldArea(3444, 3166, 157, 170, 0);
            if ((lllllllllllllllllIlllIIlllIIlIlI.contains(Players.getLocal() == 0.getWorldLocation()) ) {
                int[] nArray47 = new int[1];
                nArray47[0] = 19629;
                Inventory.getFirst((int[])nArray47).interact("Break");
                Time.sleepTicks((int)7);
            }
            if ((lllllllllllllllllIlllIIlllIIlIlI.contains(Players.getLocal() != 0.getWorldLocation()) ) {
                Movement.walkTo((WorldPoint)D.fa);
                Time.sleepTicks((int)1);
            }
        }
        if ((Players.getLocal().getWorldLocation().distanceTo(D.fa)) > (8)) {
            if (!Bank.isOpen()) {
                int[] nArray48 = new int[1];
                nArray48[0] = 12759;
                if ((TileObjects.getNearest((int[]) != nullnArray48)) && (Players.getLocal().getWorldLocation().distanceTo(D.fa)) > (10)) {
                    int[] nArray49 = new int[1];
                    nArray49[0] = 12759;
                    TileObjects.getNearest((int[])nArray49).interact("Bank");
                    Time.sleepTicks((int)2);
                }
            }
            if (Bank.isOpen()) {
                String[] DIALOG_OPTIONS73 = new String[1];
                stringArray73[0] = "Shark";
                Bank.depositAll((String[])stringArray73);
                int[] nArray50 = new int[1];
                nArray50[0] = 995;
                Bank.depositAll((int[])nArray50);
                Bank.withdraw((int)1605, (int)1, (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                Bank.withdraw((int)2961, (int)1, (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                Bank.withdraw((int)556, (int)3, (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                Bank.withdraw((int)564, (int)1, (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
            }
        }
    }
    String[] DIALOG_OPTIONS74 = new String[1];
    stringArray74[0] = "Emerald";
    if ((Inventory.contains((String[])stringArray74) ? 1 : 0) && (UNDERGROUND_AREA.contains(Players.getLocal() == 0.getWorldLocation()) ? 1 : 0) && (MEIYERDITCH_AREA.contains(Players.getLocal() == 0.getWorldLocation()) ) {
        if (Dialog.isOpen()) {
            Dialog.close();
        }
        y.bp();
    }
    if ((UNDERGROUND_AREA.contains(Players.getLocal() != 0.getWorldLocation()) ? 1 : 0) && (MEIYERDITCH_AREA.contains(Players.getLocal() == 0.getWorldLocation()) ) {
        if ((Players.getLocal().getWorldLocation().distanceTo(QUEST_START_POINT)) < (5)) {
            AccBuilderSotf.c = "nav to oldman";
            Movement.walkTo((WorldPoint)QUEST_START_POINT);
            Time.sleepTicks((int)1);
        }
        if ((Players.getLocal().getWorldLocation().distanceTo(QUEST_START_POINT)) > (5)) {
            String[] DIALOG_OPTIONS75 = new String[1];
            stringArray75[0] = "Trapdoor";
            String[] DIALOG_OPTIONS76 = new String[1];
            stringArray76[0] = "Open";
            if ((TileObjects.getNearest((String[])stringArray75).hasAction(stringArray76) ) {
                String[] DIALOG_OPTIONS77 = new String[1];
                stringArray77[0] = "Trapdoor";
                TileObjects.getNearest((String[])stringArray77).interact("Open");
                Time.sleepTicks((int)4);
            }
            String[] DIALOG_OPTIONS78 = new String[1];
            stringArray78[0] = "Trapdoor";
            String[] DIALOG_OPTIONS79 = new String[1];
            stringArray79[0] = "Climb-down";
            if ((TileObjects.getNearest((String[])stringArray78).hasAction(stringArray79) ) {
                String[] DIALOG_OPTIONS80 = new String[1];
                stringArray80[0] = "Trapdoor";
                TileObjects.getNearest((String[])stringArray80).interact("Climb-down");
                Time.sleepTicks((int)4);
            }
        }
    }
    if ((MEIYERDITCH_AREA.contains(Players.getLocal() != 0.getWorldLocation()) ) {
        DialogUtil.talkToNpc("Safalaan Hallow", DIALOG_OPTIONS);
    }
    DialogUtil.chooseDialogOptions(DIALOG_OPTIONS);
}
if ((Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId())) == (115)) {
    DialogUtil.chooseDialogOptions(DIALOG_OPTIONS);
}
if ((Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId())) == (120)) {
    String[] DIALOG_OPTIONS81 = new String[1];
    stringArray81[0] = "Flaygian's notes";
    if ((Inventory.contains((String[]) == 0stringArray81) ) {
        DialogUtil.talkToNpc("Vertida Sefalatis", DIALOG_OPTIONS);
    }
    String[] DIALOG_OPTIONS82 = new String[1];
    stringArray82[0] = "Flaygian's notes";
    if ((Inventory.contains((String[])stringArray82) ) {
        String[] DIALOG_OPTIONS83 = new String[1];
        stringArray83[0] = "Flaygian's notes";
        Inventory.getFirst((String[])stringArray83).interact("Read");
        Time.sleepTicks((int)2);
    }
    DialogUtil.chooseDialogOptions(DIALOG_OPTIONS);
}
if ((Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId())) == (125)) {
    String[] DIALOG_OPTIONS84 = new String[1];
    stringArray84[0] = "Ivandis flail";
    if ((Inventory.contains((String[]) == 0stringArray84) ) {
        String[] DIALOG_OPTIONS85 = new String[1];
        stringArray85[0] = "Silver sickle (b)";
        if ((Inventory.contains((String[]) == 0stringArray85) ) {
            int[] nArray = new int[1];
            nArray[0] = 32575;
            if ((TileObjects.getNearest((int[]) != nullnArray))) {
                String[] DIALOG_OPTIONS86 = new String[1];
                stringArray86[0] = "Vial";
                if ((Inventory.contains((String[])stringArray86) ) {
                    String[] DIALOG_OPTIONS87 = new String[1];
                    stringArray87[0] = "Vial";
                    Inventory.getFirst((String[])stringArray87).interact("Drop");
                }
                int[] nArray51 = new int[1];
                nArray51[0] = 32575;
                TileObjects.getNearest((int[])nArray51).interact("Search");
                Time.sleepTicks((int)3);
            }
        }
        String[] DIALOG_OPTIONS88 = new String[1];
        stringArray88[0] = "Chain";
        if ((Inventory.contains((String[]) == 0stringArray88) ) {
            String[] DIALOG_OPTIONS89 = new String[1];
            stringArray89[0] = "Silver sickle (b)";
            if ((Inventory.contains((String[])stringArray89) ) {
                int[] nArray = new int[1];
                nArray[0] = 32576;
                if ((TileObjects.getNearest((int[]) != nullnArray))) {
                    String[] DIALOG_OPTIONS90 = new String[1];
                    stringArray90[0] = "Vial";
                    if ((Inventory.contains((String[])stringArray90) ) {
                        String[] DIALOG_OPTIONS91 = new String[1];
                        stringArray91[0] = "Vial";
                        Inventory.getFirst((String[])stringArray91).interact("Drop");
                    }
                    int[] nArray52 = new int[1];
                    nArray52[0] = 32576;
                    TileObjects.getNearest((int[])nArray52).interact("Search");
                    Time.sleepTicks((int)3);
                }
            }
        }
        String[] DIALOG_OPTIONS92 = new String[1];
        stringArray92[0] = "Chain";
        if ((Inventory.contains((String[])stringArray92) ) {
            String[] DIALOG_OPTIONS93 = new String[1];
            stringArray93[0] = "Silver sickle (b)";
            if ((Inventory.contains((String[])stringArray93) ) {
                String[] DIALOG_OPTIONS94 = new String[1];
                stringArray94[0] = "Rod of ivandis (10)";
                if ((Inventory.contains((String[]) == 0stringArray94) ) {
                    if ((stepCounter) < (2)) {
                        DialogUtil.talkToNpc("Vertida Sefalatis", DIALOG_OPTIONS);
                        Time.sleepTicks((int)4);
                        stepCounter += 1;
                    }
                    DialogUtil.chooseDialogOptions(DIALOG_OPTIONS);
                    if (!Dialog.isOpen()) {
                        String[] DIALOG_OPTIONS95 = new String[1];
                        stringArray95[0] = "Veliaf Hurtz";
                        if ((NPCs.getNearest((String[]) == nullstringArray95))) {
                            AccBuilderSotf.c = "Nav to pub";
                            if ((Players.getLocal() == 0.getWorldLocation().equals((Object)new WorldPoint(3491, 3232, 0)) ) {
                                if (Dialog.isOpen()) {
                                    Dialog.close();
                                }
                                Movement.walkTo((WorldPoint)new WorldPoint(3491, 3232, 0));
                                Time.sleepTicks((int)1);
                            }
                            if ((Players.getLocal() != 0.getWorldLocation().equals((Object)new WorldPoint(3491, 3232, 0)) ) {
                                String[] DIALOG_OPTIONS96 = new String[1];
                                stringArray96[0] = "Trapdoor";
                                TileObjects.getNearest((String[])stringArray96).interact("Open");
                                Time.sleepTicks((int)2);
                                String[] DIALOG_OPTIONS97 = new String[1];
                                stringArray97[0] = "Trapdoor";
                                TileObjects.getNearest((String[])stringArray97).interact("Climb-down");
                                Time.sleepTicks((int)2);
                            }
                        }
                        String[] DIALOG_OPTIONS98 = new String[1];
                        stringArray98[0] = "Veliaf Hurtz";
                        if ((NPCs.getNearest((String[]) != nullstringArray98))) {
                            AccBuilderSotf.c = "Talking to veliaf";
                            DialogUtil.talkToNpc("Veliaf Hurtz", DIALOG_OPTIONS);
                        }
                    }
                }
            }
        }
        String[] DIALOG_OPTIONS99 = new String[1];
        stringArray99[0] = "Chain";
        if ((Inventory.contains((String[])stringArray99) ) {
            String[] DIALOG_OPTIONS100 = new String[1];
            stringArray100[0] = "Silver sickle (b)";
            if ((Inventory.contains((String[])stringArray100) ) {
                String[] DIALOG_OPTIONS101 = new String[1];
                stringArray101[0] = "Rod of ivandis (10)";
                if ((Inventory.contains((String[])stringArray101) ) {
                    String[] DIALOG_OPTIONS102 = new String[1];
                    stringArray102[0] = "Emerald";
                    String[] DIALOG_OPTIONS103 = new String[1];
                    stringArray103[0] = "Silver sickle (b)";
                    Inventory.getFirst((String[])stringArray102).useOn(Inventory.getFirst((String[])stringArray103));
                }
            }
        }
        String[] DIALOG_OPTIONS104 = new String[1];
        stringArray104[0] = "Emerald sickle (b)";
        if ((Inventory.contains((String[])stringArray104) ) {
            String[] DIALOG_OPTIONS105 = new String[1];
            stringArray105[0] = "Emerald sickle (b)";
            Magic.cast((Spell)SpellBook.Standard.LVL_2_ENCHANT, (Item)Inventory.getFirst((String[])stringArray105));
        }
        String[] DIALOG_OPTIONS106 = new String[1];
        stringArray106[0] = "Enchanted emerald sickle (b)";
        if ((Inventory.contains((String[])stringArray106) ) {
            String[] DIALOG_OPTIONS107 = new String[1];
            stringArray107[0] = "Enchanted emerald sickle (b)";
            String[] DIALOG_OPTIONS108 = new String[1];
            stringArray108[0] = "Rod of ivandis (10)";
            Inventory.getFirst((String[])stringArray107).useOn(Inventory.getFirst((String[])stringArray108));
        }
    }
    String[] DIALOG_OPTIONS109 = new String[1];
    stringArray109[0] = "Ivandis flail";
    if ((Inventory.contains((String[])stringArray109) ) {
        String[] DIALOG_OPTIONS110 = new String[1];
        stringArray110[0] = "Veliaf Hurtz";
        if ((NPCs.getNearest((String[]) != nullstringArray110))) {
            String[] DIALOG_OPTIONS111 = new String[1];
            stringArray111[0] = "Ladder";
            TileObjects.getNearest((String[])stringArray111).interact("Climb-up");
            Time.sleepTicks((int)4);
        }
        String[] DIALOG_OPTIONS112 = new String[1];
        stringArray112[0] = "Veliaf Hurtz";
        if ((NPCs.getNearest((String[]) == nullstringArray112))) {
            if ((UNDERGROUND_AREA.contains(Players.getLocal() == 0.getWorldLocation()) ? 1 : 0) && (MEIYERDITCH_AREA.contains(Players.getLocal() == 0.getWorldLocation()) ) {
                if (Dialog.isOpen()) {
                    Dialog.close();
                }
                y.bp();
            }
            if ((UNDERGROUND_AREA.contains(Players.getLocal() != 0.getWorldLocation()) ? 1 : 0) && (MEIYERDITCH_AREA.contains(Players.getLocal() == 0.getWorldLocation()) ) {
                if ((Players.getLocal().getWorldLocation().distanceTo(QUEST_START_POINT)) < (5)) {
                    AccBuilderSotf.c = "nav to oldman";
                    Movement.walkTo((WorldPoint)QUEST_START_POINT);
                    Time.sleepTicks((int)1);
                }
                if ((Players.getLocal().getWorldLocation().distanceTo(QUEST_START_POINT)) > (5)) {
                    String[] DIALOG_OPTIONS113 = new String[1];
                    stringArray113[0] = "Trapdoor";
                    String[] DIALOG_OPTIONS114 = new String[1];
                    stringArray114[0] = "Open";
                    if ((TileObjects.getNearest((String[])stringArray113).hasAction(stringArray114) ) {
                        String[] DIALOG_OPTIONS115 = new String[1];
                        stringArray115[0] = "Trapdoor";
                        TileObjects.getNearest((String[])stringArray115).interact("Open");
                        Time.sleepTicks((int)4);
                    }
                    String[] DIALOG_OPTIONS116 = new String[1];
                    stringArray116[0] = "Trapdoor";
                    String[] DIALOG_OPTIONS117 = new String[1];
                    stringArray117[0] = "Climb-down";
                    if ((TileObjects.getNearest((String[])stringArray116).hasAction(stringArray117) ) {
                        String[] DIALOG_OPTIONS118 = new String[1];
                        stringArray118[0] = "Trapdoor";
                        TileObjects.getNearest((String[])stringArray118).interact("Climb-down");
                        Time.sleepTicks((int)4);
                    }
                }
            }
            if ((MEIYERDITCH_AREA.contains(Players.getLocal() != 0.getWorldLocation()) ) {
                DialogUtil.talkToNpc("Safalaan Hallow", DIALOG_OPTIONS);
            }
            DialogUtil.chooseDialogOptions(DIALOG_OPTIONS);
        }
    }
    DialogUtil.chooseDialogOptions(DIALOG_OPTIONS);
}
if ((Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId())) == (130)) {
    DialogUtil.chooseDialogOptions(DIALOG_OPTIONS);
}
if ((Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId())) == (135)) {
    DialogUtil.chooseDialogOptions(DIALOG_OPTIONS);
    if (!Dialog.isOpen()) {
        if ((MEIYERDITCH_AREA.contains(Players.getLocal() != 0.getWorldLocation()) ) {
            String[] DIALOG_OPTIONS119 = new String[1];
            stringArray119[0] = "Ivandis flail";
            if ((Equipment.contains((String[]) == 0stringArray119) ) {
                String[] DIALOG_OPTIONS120 = new String[1];
                stringArray120[0] = "Ivandis flail";
                Inventory.getFirst((String[])stringArray120).interact("Wield");
            }
            String[] DIALOG_OPTIONS121 = new String[1];
            stringArray121[0] = "Ladder";
            TileObjects.getNearest((String[])stringArray121).interact("Climb-up");
            Time.sleepTicks((int)4);
        }
        if ((MEIYERDITCH_AREA.contains(Players.getLocal() == 0.getWorldLocation()) ) {
            if (!hasRequiredItems() {
                handleBankingAndEquipment();
            }
            if (hasRequiredItems()) {
                DialogUtil.talkToNpc("Kael Forshaw", DIALOG_OPTIONS);
            }
        }
    }
}
if ((Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId())) == (140)) {
    String[] DIALOG_OPTIONS122 = new String[1];
    stringArray122[0] = "Ranis Drakan";
    lllllllllllllllllIlllIIlllIIlIlI = NPCs.getNearest((String[])stringArray122);
    if ((lllllllllllllllllIlllIIlllIIlIlI) == null) {
        if (hasRequiredItems()) {
            if (llIIIIlIllIll(llIIIIlIIllll(GameStateUtil.getHealthPercentage(), 100.0))) {
                String[] DIALOG_OPTIONS123 = new String[1];
                stringArray123[0] = "Shark";
                if ((Inventory.contains((String[])stringArray123) ) {
                    String[] DIALOG_OPTIONS124 = new String[1];
                    stringArray124[0] = "Shark";
                    Inventory.getFirst((String[])stringArray124).interact("Eat");
                    Time.sleepTicks((int)2);
                }
            }
            if ((Prayers.getPoints()) < (45) && (Inventory.contains((int[])ItemIdArrays.PRAYER_POTIONS) ) {
                Inventory.getFirst((int[])ItemIdArrays.PRAYER_POTIONS).interact("Drink");
                Time.sleepTicks((int)1);
            }
            DialogUtil.talkToNpc("Kael Forshaw", DIALOG_OPTIONS);
        }
        if (!hasRequiredItems() {
            handleBankingAndEquipment();
        }
    }
    if ((lllllllllllllllllIlllIIlllIIlIlI) != null) {
        if ((currentTarget) == null) {
            currentTarget = lllllllllllllllllIlllIIlllIIlIlI.getWorldLocation();
            safeSpot = new WorldPoint(currentTarget.getX() - 7, currentTarget.getY(), currentTarget.getPlane());
        }
        if ((Prayers.getPoints()) < (25) && llIIIIlIlllIl(llIIIIlIlIIII(GameStateUtil.getHealthPercentage(), 65.0))) {
            Inventory.getFirst((int[])ItemIdArrays.PRAYER_POTIONS).interact("Drink");
        }
        if (llIIIIlIllIll(llIIIIlIIllll(GameStateUtil.getHealthPercentage(), 65.0))) {
            String[] DIALOG_OPTIONS125 = new String[1];
            stringArray125[0] = "Shark";
            if ((Inventory.contains((String[])stringArray125) ) {
                String[] DIALOG_OPTIONS126 = new String[1];
                stringArray126[0] = "Shark";
                Inventory.getFirst((String[])stringArray126).interact("Eat");
            }
        }
        if ((Skills.getLevel((Skill)Skill.STRENGTH) + 12) < (Skills.getBoostedLevel((Skill)Skill.STRENGTH)) && (Inventory.contains((int[])ItemIdArrays.SUPER_RESTORE_POTIONS) ) {
            Inventory.getFirst((int[])ItemIdArrays.SUPER_RESTORE_POTIONS).interact("Drink");
        }
        String[] DIALOG_OPTIONS127 = new String[1];
        stringArray127[0] = "Shark";
        if ((Inventory.contains((String[]) == 0stringArray127) ? 1 : 0) && !llIIIIlIlllIl(llIIIIlIIllll(GameStateUtil.getHealthPercentage(), 50.0)) || (Inventory.contains((int[])ItemIdArrays.PRAYER_POTIONS) ? 1 : 0) && (Prayers.getPoints()) > (3)) {
            AccBuilderSotf.c = "Escaping";
            lllllllllllllllllIlllIIlllIIlIIl = TileObjects.getNearest(tileObject -> {
                int n2;
                if ((tileObject.getName() != 0.equalsIgnoreCase("Meiyerditch citizen") ) {
                    String[] dialogOptions = new String[1];
                    DIALOG_OPTIONS[0] = "Quick-escape";
                    if (tileObject.hasAction(stringArray)) {
                        n2 = 1;
                        if (-(0x35 ^ 0x62 ^ (0x6A ^ 0x38)) < 0) return n2 != 0;
                        return ((0x2C ^ 0x5F ^ (0x3A ^ 0x40)) & (0x28 ^ 0x44 ^ (0x1A ^ 0x7F) ^ -1)) != 0;
                    }
                }
                n2 = 0;
                return n2 != 0;
            });
            if ((lllllllllllllllllIlllIIlllIIlIIl) != null) {
                lllllllllllllllllIlllIIlllIIlIIl.interact("Quick-escape");
                Time.sleepTicks((int)4);
            }
        }
        if ((AccBuilderSotf.i.containsKey(Players.getLocal() != 0.getWorldLocation()) ) {
            AccBuilderSotf.c = "Dodging blood bomb";
            lllllllllllllllllIlllIIlllIIlIIl = TileObjects.getAll(tileObject -> {
                int n2;
                if ((tileObject.getId()) == (32585) && (tileObject.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation())) < (4)) {
                    n2 = 1;
                    if (-1 != -1) {
                        return ((150 + 161 - 259 + 137 ^ 73 + 41 - 10 + 66) & (1 ^ (0xD3 ^ 0xC5) ^ -1)) != 0;
                    }
                } else {
                n2 = 0;
            }
            return n2 != 0;
        });
        lllllllllllllllllIlllIIlllIIlIII = TileObjects.getAll(tileObject -> {
            int n2;
            if ((tileObject.getId()) == (32580) && (tileObject.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation())) < (4)) {
                n2 = 1;
                if (((0xA0 ^ 0x94) & ~(0xA4 ^ 0x90)) != 0) {
                    return ((0xB4 ^ 0xBA) & ~(0x29 ^ 0x27)) != 0;
                }
            } else {
            n2 = 0;
        }
        return n2 != 0;
    });
    lllllllllllllllllIlllIIlllIIIlll = Players.getLocal().getWorldLocation();
    if (lllllllllllllllllIlllIIlllIIIlll.distanceTo(safeSpot) >= 3 {
        Movement.walkTo((WorldPoint)safeSpot);
    }
    if ((lllllllllllllllllIlllIIlllIIIlll.distanceTo(currentTarget)) >= (3) && (Players.getLocal() == 0.isMoving() ) {
        Movement.walkTo((WorldPoint)currentTarget);
    }
}
String[] DIALOG_OPTIONS128 = new String[1];
stringArray128[0] = "Vyrewatch";
if ((NPCs.getNearest((String[]) != nullstringArray128))) {
    String[] DIALOG_OPTIONS129 = new String[1];
    stringArray129[0] = "Vyrewatch";
    String[] DIALOG_OPTIONS130 = new String[1];
    stringArray130[0] = "Attack";
    if ((NPCs.getNearest((String[])stringArray129).hasAction(stringArray130) ) {
        String[] DIALOG_OPTIONS131 = new String[1];
        stringArray131[0] = "Attack";
        if (!lllllllllllllllllIlllIIlllIIlIlI.hasAction(stringArray131) {
            String[] DIALOG_OPTIONS132 = new String[1];
            stringArray132[0] = "Shark";
            if ((Inventory.contains((String[])stringArray132) ) {
                if ((Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ) {
                    Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                }
                if ((Prayers.isEnabled((Prayer)Prayer.INCREDIBLE_REFLEXES) ) {
                    Prayers.toggle((Prayer)Prayer.INCREDIBLE_REFLEXES);
                }
                if (AccBuilderSotf.i.isEmpty() && (Players.getLocal() == null.getInteracting())) {
                    NPCs.getNearest(nPC -> {
                        int n2;
                        if ((nPC.getName() != 0.equalsIgnoreCase("vyrewatch") ) {
                            String[] dialogOptions = new String[1];
                            DIALOG_OPTIONS[0] = "Attack";
                            if (nPC.hasAction(stringArray)) {
                                n2 = 1;
                                if (3 != ((0x66 ^ 0x3C) & ~(0xE3 ^ 0xB9))) return n2 != 0;
                                return ((0x63 ^ 0x67) & ~(0x36 ^ 0x32)) != 0;
                            }
                        }
                        n2 = 0;
                        return n2 != 0;
                    }).interact("Attack");
                }
            }
        }
    }
}
String[] DIALOG_OPTIONS133 = new String[1];
stringArray133[0] = "Vyrewatch";
if ((NPCs.getNearest((String[]) != nullstringArray133))) {
    String[] DIALOG_OPTIONS134 = new String[1];
    stringArray134[0] = "Vyrewatch";
    String[] DIALOG_OPTIONS135 = new String[1];
    stringArray135[0] = "Attack";
    if ((NPCs.getNearest((String[]) == 0stringArray134).hasAction(stringArray135) ) {
        String[] DIALOG_OPTIONS136 = new String[1];
        stringArray136[0] = "Attack";
        if (lllllllllllllllllIlllIIlllIIlIlI.hasAction(stringArray136)) {
            if (lllllllllllllllllIlllIIlllIIlIlI.getHealthRatio() < 20 {
                if ((Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MAGIC) ) {
                    Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MAGIC);
                }
                if ((Prayers.isEnabled((Prayer)Prayer.INCREDIBLE_REFLEXES) ) {
                    Prayers.toggle((Prayer)Prayer.INCREDIBLE_REFLEXES);
                }
            }
            if ((lllllllllllllllllIlllIIlllIIlIlI.getHealthRatio()) > (20) && (Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ) {
                Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
            }
            if (lllllllllllllllllIlllIIlllIIlIlI.getAnimation() == 8035 {
                AccBuilderSotf.c = "Dodge charge attack";
                lllllllllllllllllIlllIIlllIIlIIl = TileObjects.getAll(arg_0 -> b((NPC)lllllllllllllllllIlllIIlllIIlIlI, arg_0));
                lllllllllllllllllIlllIIlllIIlIII = TileObjects.getAll(arg_0 -> a((NPC)lllllllllllllllllIlllIIlllIIlIlI, arg_0));
                Movement.walkTo((WorldPoint)safeSpot);
                Time.sleepTicks((int)1);
            }
            if ((lllllllllllllllllIlllIIlllIIlIlI.getAnimation()) != (8035) && (Players.getLocal() == null.getInteracting())) {
                lllllllllllllllllIlllIIlllIIlIlI.interact("Attack");
                Time.sleepTicks((int)1);
            }
        }
    }
}
String[] DIALOG_OPTIONS137 = new String[1];
stringArray137[0] = "Vyrewatch";
if ((NPCs.getNearest((String[]) == nullstringArray137))) {
    String[] DIALOG_OPTIONS138 = new String[1];
    stringArray138[0] = "Attack";
    if (lllllllllllllllllIlllIIlllIIlIlI.hasAction(stringArray138)) {
        if ((Prayers.isEnabled((Prayer)Prayer.INCREDIBLE_REFLEXES) ) {
            Prayers.toggle((Prayer)Prayer.INCREDIBLE_REFLEXES);
        }
        if ((lllllllllllllllllIlllIIlllIIlIlI.getHealthRatio()) < (20) && (Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MAGIC) ) {
            Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MAGIC);
        }
        if ((lllllllllllllllllIlllIIlllIIlIlI.getHealthRatio()) > (20) && (Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ) {
            Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
        }
        if ((lllllllllllllllllIlllIIlllIIlIlI.getAnimation()) != (8035) && (Players.getLocal() == null.getInteracting())) {
            lllllllllllllllllIlllIIlllIIlIlI.interact("Attack");
            Time.sleepTicks((int)1);
        }
    }
}
}
DialogUtil.chooseDialogOptions(DIALOG_OPTIONS);
}
if ((Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId())) == (145)) {
    DialogUtil.chooseDialogOptions(DIALOG_OPTIONS);
}
if ((Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId())) == (150)) {
    if ((UNDERGROUND_AREA.contains(Players.getLocal() != 0.getWorldLocation()) ? 1 : 0) && (MEIYERDITCH_AREA.contains(Players.getLocal() == 0.getWorldLocation()) ) {
        int[] nArray = new int[1];
        nArray[0] = 8007;
        if ((Inventory.contains((int[])nArray) ) {
            if (llIIIIlIllIll(llIIIIlIIllll(GameStateUtil.getHealthPercentage(), 100.0))) {
                String[] DIALOG_OPTIONS139 = new String[1];
                stringArray139[0] = "Shark";
                if ((Inventory.contains((String[])stringArray139) ) {
                    String[] DIALOG_OPTIONS140 = new String[1];
                    stringArray140[0] = "Shark";
                    Inventory.getFirst((String[])stringArray140).interact("Eat");
                }
            }
            if ((Prayers.getPoints()) < (45) && (Inventory.contains((int[])ItemIdArrays.PRAYER_POTIONS) ) {
                Inventory.getFirst((int[])ItemIdArrays.PRAYER_POTIONS).interact("Drink");
            }
            handleBankingAndEquipment();
        }
        int[] nArray53 = new int[1];
        nArray53[0] = 8007;
        if ((Inventory.contains((int[])nArray53) ? 1 : 0) && (Players.getLocal().getWorldLocation().distanceTo(QUEST_START_POINT)) < (5)) {
            AccBuilderSotf.c = "nav to oldman";
            Movement.walkTo((WorldPoint)QUEST_START_POINT);
            Time.sleepTicks((int)1);
        }
        if ((Players.getLocal().getWorldLocation().distanceTo(QUEST_START_POINT)) > (5)) {
            String[] DIALOG_OPTIONS141 = new String[1];
            stringArray141[0] = "Trapdoor";
            String[] DIALOG_OPTIONS142 = new String[1];
            stringArray142[0] = "Open";
            if ((TileObjects.getNearest((String[])stringArray141).hasAction(stringArray142) ) {
                String[] DIALOG_OPTIONS143 = new String[1];
                stringArray143[0] = "Trapdoor";
                TileObjects.getNearest((String[])stringArray143).interact("Open");
                Time.sleepTicks((int)4);
            }
            String[] DIALOG_OPTIONS144 = new String[1];
            stringArray144[0] = "Trapdoor";
            String[] DIALOG_OPTIONS145 = new String[1];
            stringArray145[0] = "Climb-down";
            if ((TileObjects.getNearest((String[])stringArray144).hasAction(stringArray145) ) {
                String[] DIALOG_OPTIONS146 = new String[1];
                stringArray146[0] = "Trapdoor";
                TileObjects.getNearest((String[])stringArray146).interact("Climb-down");
                Time.sleepTicks((int)4);
            }
        }
    }
    if ((MEIYERDITCH_AREA.contains(Players.getLocal() != 0.getWorldLocation()) ) {
        if ((questProgress) < (1)) {
            aN.su += 1;
            aN.u(AccBuilderSotf.m);
            questProgress += 1;
            aN.su = 0;
            needsBank = 0;
        }
        DialogUtil.talkToNpc("Safalaan Hallow", DIALOG_OPTIONS);
    }
    DialogUtil.chooseDialogOptions(DIALOG_OPTIONS);
}
String[] DIALOG_OPTIONS147 = new String[1];
stringArray147[0] = "Tome of experience";
if ((Inventory.contains((String[])stringArray147) ) {
    AccBuilderSotf.c = "Selecting agility";
    String[] DIALOG_OPTIONS148 = new String[1];
    stringArray148[0] = "Tome of experience";
    Inventory.getFirst((String[])stringArray148).interact("Read");
    Time.sleepTicks((int)4);
}
if ((lllllllllllllllllIlllIIlllIIlIlI = Widgets.get((int) != null240, (int)9))) {
    lllllllllllllllllIlllIIlllIIlIlI.interact("Agility");
    Time.sleepTicks((int)1);
}
if ((lllllllllllllllllIlllIIlllIIlIIl = Widgets.get((int) != null240, (int)26))) {
    lllllllllllllllllIlllIIlllIIlIIl.interact("Confirm");
    Time.sleepTicks((int)2);
}
DialogUtil.chooseDialogOptions(DIALOG_OPTIONS);
}
}

private private static boolean a(NPC nPC, TileObject tileObject) {
    int n2;
    if ((tileObject.getId()) == (32580) && (tileObject.getWorldLocation().distanceTo(nPC.getWorldLocation())) < (5)) {
        n2 = 1;
        if (-1 != -1) {
            return (((0x13 ^ 0x54) & ~(0x29 ^ 0x6E) ^ (0xD ^ 0x5B)) & (0x74 ^ 0x29 ^ (0xBA ^ 0xB1) ^ -1) & ((5 ^ 0x18 ^ (0x81 ^ 0xB6)) & (177 + 139 - 228 + 90 ^ 49 + 36 - -62 + 5 ^ -1) ^ -1)) != 0;
        }
    } else {
    n2 = 0;
}
return n2 != 0;
}
}

