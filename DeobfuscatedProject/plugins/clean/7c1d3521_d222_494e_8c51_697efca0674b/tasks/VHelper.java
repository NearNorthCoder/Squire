/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.Skill
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 *  net.unethicalite.api.movement.Movement
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
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.DHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.AHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.ABHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.ALHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.ANHelper;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.AVHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.AYHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.BHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.DHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.EHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.FHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.GHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.JHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.YHelper;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class VHelper
implements ac {
    static  WorldArea dp;
    public static  boolean bt;
    static  WorldPoint dl;
    static  WorldPoint dr;
    public static  List<d> bv;
    static  WorldPoint dn;
    static  boolean dj;
    static  WorldPoint ds;
    static  String h;
    static  WorldPoint de;
    static  int di;
    static  String[] cE;
    static  WorldArea dq;
    
    static  WorldArea dm;
    static  int dt;
    
    static  WorldArea do;

    private static boolean llIIIIlIlIIIl(int n2) {
        return n2 != 0;
    }

    static {
        v.llIIIIlIIlllI();
        v.llIIIIlIIllIl();
        bv = new ArrayList<d>();
        de = new WorldPoint(lllIIlllII[443], lllIIlllII[444], lllIIlllII[1]);
        dl = new WorldPoint(lllIIlllII[445], lllIIlllII[446], lllIIlllII[1]);
        dm = new WorldArea(lllIIlllII[447], lllIIlllII[448], lllIIlllII[29], lllIIlllII[24], lllIIlllII[1]);
        dn = new WorldPoint(lllIIlllII[449], lllIIlllII[450], lllIIlllII[1]);
        do = new WorldArea(lllIIlllII[67], lllIIlllII[68], lllIIlllII[148], lllIIlllII[121], lllIIlllII[1]);
        dp = new WorldArea(lllIIlllII[451], lllIIlllII[452], lllIIlllII[126], lllIIlllII[101], lllIIlllII[0]);
        dq = new WorldArea(lllIIlllII[453], lllIIlllII[452], lllIIlllII[129], lllIIlllII[103], lllIIlllII[6]);
        dr = null;
        ds = null;
        String[] stringArray = new String[lllIIlllII[56]];
        stringArray[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[454]];
        stringArray[v.lllIIlllII[0]] = lllIIlIIlI[lllIIlllII[455]];
        stringArray[v.lllIIlllII[6]] = lllIIlIIlI[lllIIlllII[456]];
        stringArray[v.lllIIlllII[7]] = lllIIlIIlI[lllIIlllII[457]];
        stringArray[v.lllIIlllII[8]] = lllIIlIIlI[lllIIlllII[458]];
        stringArray[v.lllIIlllII[9]] = lllIIlIIlI[lllIIlllII[459]];
        stringArray[v.lllIIlllII[10]] = lllIIlIIlI[lllIIlllII[460]];
        stringArray[v.lllIIlllII[12]] = lllIIlIIlI[lllIIlllII[461]];
        stringArray[v.lllIIlllII[13]] = lllIIlIIlI[lllIIlllII[462]];
        stringArray[v.lllIIlllII[14]] = lllIIlIIlI[lllIIlllII[463]];
        stringArray[v.lllIIlllII[15]] = lllIIlIIlI[lllIIlllII[464]];
        stringArray[v.lllIIlllII[17]] = lllIIlIIlI[lllIIlllII[465]];
        stringArray[v.lllIIlllII[20]] = lllIIlIIlI[lllIIlllII[466]];
        stringArray[v.lllIIlllII[24]] = lllIIlIIlI[lllIIlllII[467]];
        stringArray[v.lllIIlllII[27]] = lllIIlIIlI[lllIIlllII[468]];
        stringArray[v.lllIIlllII[28]] = lllIIlIIlI[lllIIlllII[469]];
        stringArray[v.lllIIlllII[44]] = lllIIlIIlI[lllIIlllII[470]];
        stringArray[v.lllIIlllII[46]] = lllIIlIIlI[lllIIlllII[471]];
        stringArray[v.lllIIlllII[48]] = lllIIlIIlI[lllIIlllII[472]];
        stringArray[v.lllIIlllII[50]] = lllIIlIIlI[lllIIlllII[473]];
        stringArray[v.lllIIlllII[29]] = lllIIlIIlI[lllIIlllII[474]];
        cE = stringArray;
        h = lllIIlIIlI[lllIIlllII[475]];
    }

    private static boolean llIIIIlIllIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llIIIIlIlIlII(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public boolean ae() {
        return lllIIlllII[1];
    }

    private static boolean llIIIIlIlIIll(int n2) {
        return n2 == 0;
    }

    private static void bb() {
        if (v.llIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(dl), lllIIlllII[10])) {
            if (v.llIIIIlIlIIIl(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
            }
            if (v.llIIIIlIlIIIl(Prayers.isEnabled((Prayer)Prayer.INCREDIBLE_REFLEXES) ? 1 : 0)) {
                Prayers.toggle((Prayer)Prayer.INCREDIBLE_REFLEXES);
            }
            AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[357]];
            Movement.walkTo((WorldPoint)dl);

            Time.sleepTicks((int)lllIIlllII[0]);

        }
        if (v.llIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(dl), lllIIlllII[10])) {
            if (v.llIIIIlIlIIll(Bank.isOpen() ? 1 : 0)) {
                a.a();
            }
            if (v.llIIIIlIlIIIl(Bank.isOpen() ? 1 : 0)) {
                if (v.llIIIIlIlIllI(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks((int)lllIIlllII[8]);

                }
                if (v.llIIIIlIllIIl(Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[215])) {
                    a.a(lllIIlllII[30], lllIIlllII[15]);
                    a.b(f.ba, lllIIlllII[0]);
                }
                if (v.llIIIIlIlIIlI(Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[215])) {
                    int[] nArray = new int[lllIIlllII[0]];
                    nArray[v.lllIIlllII[1]] = lllIIlllII[42];
                    if (v.llIIIIlIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray2 = new int[lllIIlllII[0]];
                        nArray2[v.lllIIlllII[1]] = lllIIlllII[42];
                        if (v.llIIIIlIlIIll(Equipment.contains((int[])nArray2) ? 1 : 0)) {
                            a.a(lllIIlllII[42], lllIIlllII[0]);
                        }
                    }
                    int[] nArray3 = new int[lllIIlllII[0]];
                    nArray3[v.lllIIlllII[1]] = lllIIlllII[43];
                    if (v.llIIIIlIlIIIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
                        int[] nArray4 = new int[lllIIlllII[0]];
                        nArray4[v.lllIIlllII[1]] = lllIIlllII[43];
                        if (v.llIIIIlIlIIll(Equipment.contains((int[])nArray4) ? 1 : 0)) {
                            a.a(lllIIlllII[43], lllIIlllII[0]);
                        }
                    }
                    int[] nArray5 = new int[lllIIlllII[0]];
                    nArray5[v.lllIIlllII[1]] = lllIIlllII[45];
                    if (v.llIIIIlIlIIIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
                        int[] nArray6 = new int[lllIIlllII[0]];
                        nArray6[v.lllIIlllII[1]] = lllIIlllII[45];
                        if (v.llIIIIlIlIIll(Equipment.contains((int[])nArray6) ? 1 : 0)) {
                            a.a(lllIIlllII[45], lllIIlllII[0]);
                        }
                    }
                    int[] nArray7 = new int[lllIIlllII[0]];
                    nArray7[v.lllIIlllII[1]] = lllIIlllII[41];
                    if (v.llIIIIlIlIIIl(Bank.contains((int[])nArray7) ? 1 : 0)) {
                        int[] nArray8 = new int[lllIIlllII[0]];
                        nArray8[v.lllIIlllII[1]] = lllIIlllII[41];
                        if (v.llIIIIlIlIIll(Equipment.contains((int[])nArray8) ? 1 : 0)) {
                            a.a(lllIIlllII[41], lllIIlllII[0]);
                        }
                    }
                    int[] nArray9 = new int[lllIIlllII[0]];
                    nArray9[v.lllIIlllII[1]] = lllIIlllII[47];
                    if (v.llIIIIlIlIIIl(Bank.contains((int[])nArray9) ? 1 : 0)) {
                        int[] nArray10 = new int[lllIIlllII[0]];
                        nArray10[v.lllIIlllII[1]] = lllIIlllII[47];
                        if (v.llIIIIlIlIIll(Equipment.contains((int[])nArray10) ? 1 : 0)) {
                            a.a(lllIIlllII[47], lllIIlllII[0]);
                        }
                    }
                    int[] nArray11 = new int[lllIIlllII[0]];
                    nArray11[v.lllIIlllII[1]] = lllIIlllII[358];
                    if (v.llIIIIlIlIIIl(Bank.contains((int[])nArray11) ? 1 : 0)) {
                        int[] nArray12 = new int[lllIIlllII[0]];
                        nArray12[v.lllIIlllII[1]] = lllIIlllII[358];
                        if (v.llIIIIlIlIIll(Equipment.contains((int[])nArray12) ? 1 : 0)) {
                            a.a(lllIIlllII[358], lllIIlllII[0]);
                        }
                    }
                    int[] nArray13 = new int[lllIIlllII[0]];
                    nArray13[v.lllIIlllII[1]] = lllIIlllII[40];
                    if (v.llIIIIlIlIIIl(Bank.contains((int[])nArray13) ? 1 : 0)) {
                        int[] nArray14 = new int[lllIIlllII[0]];
                        nArray14[v.lllIIlllII[1]] = lllIIlllII[40];
                        if (v.llIIIIlIlIIll(Equipment.contains((int[])nArray14) ? 1 : 0)) {
                            a.a(lllIIlllII[40], lllIIlllII[0]);
                        }
                    }
                    int[] nArray15 = new int[lllIIlllII[0]];
                    nArray15[v.lllIIlllII[1]] = lllIIlllII[49];
                    if (v.llIIIIlIlIIIl(Bank.contains((int[])nArray15) ? 1 : 0)) {
                        int[] nArray16 = new int[lllIIlllII[0]];
                        nArray16[v.lllIIlllII[1]] = lllIIlllII[49];
                        if (v.llIIIIlIlIIll(Equipment.contains((int[])nArray16) ? 1 : 0)) {
                            a.a(lllIIlllII[49], lllIIlllII[0]);
                        }
                    }
                    int[] nArray17 = new int[lllIIlllII[0]];
                    nArray17[v.lllIIlllII[1]] = lllIIlllII[49];
                    if (v.llIIIIlIlIIIl(Inventory.contains((int[])nArray17) ? 1 : 0)) {
                        int[] nArray18 = new int[lllIIlllII[0]];
                        nArray18[v.lllIIlllII[1]] = lllIIlllII[49];
                        Inventory.getFirst((int[])nArray18).interact(lllIIlIIlI[lllIIlllII[359]]);
                    }
                    if (v.llIIIIlIlIIIl(Inventory.contains((int[])f.bk) ? 1 : 0)) {
                        Inventory.getFirst((int[])f.bk).interact(lllIIlIIlI[lllIIlllII[360]]);
                    }
                    int[] nArray19 = new int[lllIIlllII[0]];
                    nArray19[v.lllIIlllII[1]] = lllIIlllII[42];
                    if (v.llIIIIlIlIIIl(Inventory.contains((int[])nArray19) ? 1 : 0)) {
                        int[] nArray20 = new int[lllIIlllII[0]];
                        nArray20[v.lllIIlllII[1]] = lllIIlllII[42];
                        Inventory.getFirst((int[])nArray20).interact(lllIIlIIlI[lllIIlllII[361]]);
                    }
                    int[] nArray21 = new int[lllIIlllII[0]];
                    nArray21[v.lllIIlllII[1]] = lllIIlllII[43];
                    if (v.llIIIIlIlIIIl(Inventory.contains((int[])nArray21) ? 1 : 0)) {
                        int[] nArray22 = new int[lllIIlllII[0]];
                        nArray22[v.lllIIlllII[1]] = lllIIlllII[43];
                        Inventory.getFirst((int[])nArray22).interact(lllIIlIIlI[lllIIlllII[362]]);
                    }
                    int[] nArray23 = new int[lllIIlllII[0]];
                    nArray23[v.lllIIlllII[1]] = lllIIlllII[45];
                    if (v.llIIIIlIlIIIl(Inventory.contains((int[])nArray23) ? 1 : 0)) {
                        int[] nArray24 = new int[lllIIlllII[0]];
                        nArray24[v.lllIIlllII[1]] = lllIIlllII[45];
                        Inventory.getFirst((int[])nArray24).interact(lllIIlIIlI[lllIIlllII[363]]);
                    }
                    int[] nArray25 = new int[lllIIlllII[0]];
                    nArray25[v.lllIIlllII[1]] = lllIIlllII[41];
                    if (v.llIIIIlIlIIIl(Inventory.contains((int[])nArray25) ? 1 : 0)) {
                        int[] nArray26 = new int[lllIIlllII[0]];
                        nArray26[v.lllIIlllII[1]] = lllIIlllII[41];
                        Inventory.getFirst((int[])nArray26).interact(lllIIlIIlI[lllIIlllII[364]]);
                    }
                    int[] nArray27 = new int[lllIIlllII[0]];
                    nArray27[v.lllIIlllII[1]] = lllIIlllII[47];
                    if (v.llIIIIlIlIIIl(Inventory.contains((int[])nArray27) ? 1 : 0)) {
                        int[] nArray28 = new int[lllIIlllII[0]];
                        nArray28[v.lllIIlllII[1]] = lllIIlllII[47];
                        Inventory.getFirst((int[])nArray28).interact(lllIIlIIlI[lllIIlllII[365]]);
                    }
                    int[] nArray29 = new int[lllIIlllII[0]];
                    nArray29[v.lllIIlllII[1]] = lllIIlllII[358];
                    if (v.llIIIIlIlIIIl(Inventory.contains((int[])nArray29) ? 1 : 0)) {
                        int[] nArray30 = new int[lllIIlllII[0]];
                        nArray30[v.lllIIlllII[1]] = lllIIlllII[358];
                        Inventory.getFirst((int[])nArray30).interact(lllIIlIIlI[lllIIlllII[366]]);
                    }
                    int[] nArray31 = new int[lllIIlllII[0]];
                    nArray31[v.lllIIlllII[1]] = lllIIlllII[40];
                    if (v.llIIIIlIlIIIl(Inventory.contains((int[])nArray31) ? 1 : 0)) {
                        int[] nArray32 = new int[lllIIlllII[0]];
                        nArray32[v.lllIIlllII[1]] = lllIIlllII[40];
                        Inventory.getFirst((int[])nArray32).interact(lllIIlIIlI[lllIIlllII[367]]);
                    }
                    if (v.llIIIIlIlIIll(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepTicks((int)lllIIlllII[9]);

                    }
                    int[] nArray33 = new int[lllIIlllII[0]];
                    nArray33[v.lllIIlllII[1]] = lllIIlllII[19];
                    if (v.llIIIIlIlIIIl(Bank.contains((int[])nArray33) ? 1 : 0)) {
                        a.a(lllIIlllII[19], lllIIlllII[0]);
                    }
                    int[] nArray34 = new int[lllIIlllII[0]];
                    nArray34[v.lllIIlllII[1]] = lllIIlllII[19];
                    if (v.llIIIIlIlIIll(Inventory.contains((int[])nArray34) ? 1 : 0)) {
                        int[] nArray35 = new int[lllIIlllII[0]];
                        nArray35[v.lllIIlllII[1]] = lllIIlllII[368];
                        if (v.llIIIIlIlIIIl(Bank.contains((int[])nArray35) ? 1 : 0)) {
                            a.a(lllIIlllII[368], lllIIlllII[0]);
                        }
                    }
                    int[] nArray36 = new int[lllIIlllII[0]];
                    nArray36[v.lllIIlllII[1]] = lllIIlllII[19];
                    if (v.llIIIIlIlIIll(Inventory.contains((int[])nArray36) ? 1 : 0)) {
                        int[] nArray37 = new int[lllIIlllII[0]];
                        nArray37[v.lllIIlllII[1]] = lllIIlllII[368];
                        if (v.llIIIIlIlIIll(Inventory.contains((int[])nArray37) ? 1 : 0)) {
                            a.a(lllIIlllII[369], lllIIlllII[0]);
                        }
                    }
                    a.a(lllIIlllII[39], lllIIlllII[8]);
                    a.a(lllIIlllII[25], Inventory.getFreeSlots());
                    Time.sleepTicks((int)lllIIlllII[8]);

                    if (v.llIIIIlIlIIIl(Dialog.isOpen() ? 1 : 0)) {
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
    private static boolean ba() {
        int n2;
        int[] nArray = new int[lllIIlllII[0]];
        nArray[v.lllIIlllII[1]] = lllIIlllII[39];
        if (v.llIIIIlIlIlII(Inventory.getAll((int[])nArray).size(), lllIIlllII[7]) && v.llIIIIlIlIIIl(Inventory.contains(item -> item.getName().contains(lllIIlIIlI[lllIIlllII[5]])) ? 1 : 0)) {
            String[] stringArray = new String[lllIIlllII[0]];
            stringArray[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[356]];
            if (v.llIIIIlIlIlII(Inventory.getAll((String[])stringArray).size(), lllIIlllII[29])) {
                n2 = lllIIlllII[0];

                if (1 >= 0) return n2 != 0;
                return false;
            }
        }
        n2 = lllIIlllII[1];
        return n2 != 0;
    }

        return String.valueOf(var1);
    }

    private static boolean llIIIIlIlIllI(int n2) {
        return n2 > 0;
    }

    private static boolean llIIIIlIlllII(Object object) {
        return object == null;
    }

    private static boolean llIIIIlIllIlI(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean llIIIIlIlIlIl(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    public static void bc() {
        void var2;
        WorldArea var3;
        void var4;
        WorldArea worldArea = new WorldArea(lllIIlllII[81], lllIIlllII[370], lllIIlllII[9], lllIIlllII[9], lllIIlllII[1]);
        WorldArea worldArea2 = new WorldArea(lllIIlllII[198], lllIIlllII[199], lllIIlllII[24], lllIIlllII[48], lllIIlllII[1]);
        WorldPoint worldPoint = new WorldPoint(lllIIlllII[371], lllIIlllII[372], lllIIlllII[1]);
        if (v.llIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(y.dQ), lllIIlllII[4]) && v.llIIIIlIlIIll(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            void var5;
            if (v.llIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lllIIlllII[9])) {
                AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[373]];
                Movement.walkTo((WorldPoint)worldPoint);

                Time.sleepTicks((int)lllIIlllII[0]);

            }
            if (v.llIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var5), lllIIlllII[9])) {
                AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[374]];
                String[] stringArray = new String[lllIIlllII[0]];
                stringArray[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[375]];
                TileObjects.getNearest((String[])stringArray).interact(lllIIlIIlI[lllIIlllII[376]]);
                Time.sleepTicks((int)lllIIlllII[8]);

            }
        }
        if (v.llIIIIlIlIIIl(var4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[377]];
            String[] stringArray = new String[lllIIlllII[0]];
            stringArray[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[378]];
            TileObjects.getNearest((String[])stringArray).interact(lllIIlIIlI[lllIIlllII[379]]);
            Time.sleepTicks((int)lllIIlllII[7]);

        }
        if (v.llIIIIlIlIIIl((var3 = new WorldArea(lllIIlllII[81], lllIIlllII[380], lllIIlllII[10], lllIIlllII[10], lllIIlllII[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[381]];
            String[] stringArray = new String[lllIIlllII[0]];
            stringArray[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[382]];
            TileObjects.getNearest((String[])stringArray).interact(lllIIlIIlI[lllIIlllII[383]]);
            Time.sleepTicks((int)lllIIlllII[7]);

        }
        WorldArea var6 = new WorldArea(lllIIlllII[384], lllIIlllII[385], lllIIlllII[10], lllIIlllII[9], lllIIlllII[0]);
        WorldArea var7 = new WorldArea(lllIIlllII[386], lllIIlllII[387], lllIIlllII[9], lllIIlllII[12], lllIIlllII[0]);
        WorldPoint var8 = new WorldPoint(lllIIlllII[81], lllIIlllII[388], lllIIlllII[0]);
        if (v.llIIIIlIlIIIl(var7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (v.llIIIIlIlIIll(Players.getLocal().getWorldLocation().equals((Object)var8) ? 1 : 0)) {
                AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[389]];
                Movement.walkTo((WorldPoint)var8);

            }
            if (v.llIIIIlIlIIIl(Players.getLocal().getWorldLocation().equals((Object)var8) ? 1 : 0)) {
                int[] nArray = new int[lllIIlllII[0]];
                nArray[v.lllIIlllII[1]] = lllIIlllII[390];
                TileObjects.getNearest((int[])nArray).interact(lllIIlIIlI[lllIIlllII[391]]);
                Time.sleepTicks((int)lllIIlllII[7]);

            }
        }
        if (v.llIIIIlIlIIIl(var6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[392]];
            String[] stringArray = new String[lllIIlllII[0]];
            stringArray[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[393]];
            TileObjects.getNearest((String[])stringArray).interact(lllIIlIIlI[lllIIlllII[394]]);
            Time.sleepTicks((int)lllIIlllII[7]);

        }
        WorldArea var9 = new WorldArea(lllIIlllII[67], lllIIlllII[385], lllIIlllII[101], lllIIlllII[75], lllIIlllII[1]);
        WorldPoint var10 = new WorldPoint(lllIIlllII[395], lllIIlllII[396], lllIIlllII[1]);
        if (v.llIIIIlIlIIIl(var9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && v.llIIIIlIlIIll(var2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (v.llIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(var10), lllIIlllII[9])) {
                AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[397]];
                Movement.walkTo((WorldPoint)var10);

                Time.sleepTicks((int)lllIIlllII[0]);

            }
            if (v.llIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(var10), lllIIlllII[9])) {
                AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[398]];
                String[] stringArray = new String[lllIIlllII[0]];
                stringArray[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[399]];
                TileObjects.getNearest((String[])stringArray).interact(lllIIlIIlI[lllIIlllII[400]]);
                Time.sleepTicks((int)lllIIlllII[8]);

            }
        }
        if (v.llIIIIlIlIIIl(var2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            g.a(lllIIlIIlI[lllIIlllII[401]], cE);
        }
    }

    private static boolean llIIIIlIllIII(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llIIIIlIllIll(int n2) {
        return n2 < 0;
    }

    private static int llIIIIlIIllll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean llIIIIlIlIlll(int n2, int n3) {
        return n2 > n3;
    }

    private static void Q() {
        block55: {
            d var11;
            block54: {
                Object var12;
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
                                                                        int[] nArray = new int[lllIIlllII[0]];
                                                                        nArray[v.lllIIlllII[1]] = lllIIlllII[358];
                                                                        if (v.llIIIIlIlIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                                                                            d d2 = new DHelper(lllIIlllII[358], lllIIlllII[0], e.c(lllIIlllII[402], lllIIlllII[403]));
                                                                            bv.add(d2);

                                                                        }
                                                                        int[] nArray2 = new int[lllIIlllII[0]];
                                                                        nArray2[v.lllIIlllII[1]] = lllIIlllII[40];
                                                                        if (v.llIIIIlIlIIll(Bank.contains((int[])nArray2) ? 1 : 0)) {
                                                                            var12 = new DHelper(lllIIlllII[40], lllIIlllII[0], e.c(lllIIlllII[402], lllIIlllII[403]));
                                                                            bv.add((DHelper) ar12);

                                                                        }
                                                                        int[] nArray3 = new int[lllIIlllII[0]];
                                                                        nArray3[v.lllIIlllII[1]] = lllIIlllII[41];
                                                                        if (v.llIIIIlIlIIll(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                                                            var12 = new DHelper(lllIIlllII[41], lllIIlllII[0], e.c(lllIIlllII[404], lllIIlllII[405]));
                                                                            bv.add((DHelper) ar12);

                                                                        }
                                                                        int[] nArray4 = new int[lllIIlllII[0]];
                                                                        nArray4[v.lllIIlllII[1]] = lllIIlllII[42];
                                                                        if (v.llIIIIlIlIIll(Bank.contains((int[])nArray4) ? 1 : 0)) {
                                                                            var12 = new DHelper(lllIIlllII[42], lllIIlllII[0], e.c(lllIIlllII[406], lllIIlllII[407]));
                                                                            bv.add((DHelper) ar12);

                                                                        }
                                                                        int[] nArray5 = new int[lllIIlllII[0]];
                                                                        nArray5[v.lllIIlllII[1]] = lllIIlllII[43];
                                                                        if (v.llIIIIlIlIIll(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                                                            var12 = new DHelper(lllIIlllII[43], lllIIlllII[0], e.c(lllIIlllII[408], lllIIlllII[409]));
                                                                            bv.add((DHelper) ar12);

                                                                        }
                                                                        int[] nArray6 = new int[lllIIlllII[0]];
                                                                        nArray6[v.lllIIlllII[1]] = lllIIlllII[45];
                                                                        if (v.llIIIIlIlIIll(Bank.contains((int[])nArray6) ? 1 : 0)) {
                                                                            var12 = new DHelper(lllIIlllII[45], lllIIlllII[0], e.c(lllIIlllII[410], lllIIlllII[411]));
                                                                            bv.add((DHelper) ar12);

                                                                        }
                                                                        int[] nArray7 = new int[lllIIlllII[0]];
                                                                        nArray7[v.lllIIlllII[1]] = lllIIlllII[47];
                                                                        if (v.llIIIIlIlIIll(Bank.contains((int[])nArray7) ? 1 : 0)) {
                                                                            var12 = new DHelper(lllIIlllII[47], lllIIlllII[0], e.c(lllIIlllII[412], lllIIlllII[413]));
                                                                            bv.add((DHelper) ar12);

                                                                        }
                                                                        int[] nArray8 = new int[lllIIlllII[0]];
                                                                        nArray8[v.lllIIlllII[1]] = lllIIlllII[49];
                                                                        if (v.llIIIIlIlIIll(Bank.contains((int[])nArray8) ? 1 : 0)) {
                                                                            var12 = new DHelper(lllIIlllII[49], lllIIlllII[0], e.c(lllIIlllII[414], lllIIlllII[415]));
                                                                            bv.add((DHelper) ar12);

                                                                        }
                                                                        int[] nArray9 = new int[lllIIlllII[0]];
                                                                        nArray9[v.lllIIlllII[1]] = lllIIlllII[36];
                                                                        if (v.llIIIIlIlIIll(Bank.contains((int[])nArray9) ? 1 : 0)) {
                                                                            var12 = new DHelper(lllIIlllII[36], lllIIlllII[0], e.c(lllIIlllII[416], lllIIlllII[417]));
                                                                            bv.add((DHelper) ar12);

                                                                        }
                                                                        int[] nArray10 = new int[lllIIlllII[0]];
                                                                        nArray10[v.lllIIlllII[1]] = lllIIlllII[18];
                                                                        if (!v.llIIIIlIlIIIl(Bank.contains((int[])nArray10) ? 1 : 0)) break block40;
                                                                        int[] nArray11 = new int[lllIIlllII[0]];
                                                                        nArray11[v.lllIIlllII[1]] = lllIIlllII[18];
                                                                        if (!v.llIIIIlIlIIIl(Bank.contains((int[])nArray11) ? 1 : 0)) break block41;
                                                                        int[] nArray12 = new int[lllIIlllII[0]];
                                                                        nArray12[v.lllIIlllII[1]] = lllIIlllII[18];
                                                                        if (!v.llIIIIlIlIIlI(Bank.getFirst((int[])nArray12).getQuantity(), lllIIlllII[15])) break block41;
                                                                    }
                                                                    var12 = new DHelper(lllIIlllII[18], lllIIlllII[15], e.c(lllIIlllII[418], lllIIlllII[419]));
                                                                    bv.add((DHelper) ar12);

                                                                }
                                                                int[] nArray = new int[lllIIlllII[0]];
                                                                nArray[v.lllIIlllII[1]] = lllIIlllII[19];
                                                                if (!v.llIIIIlIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block42;
                                                                int[] nArray13 = new int[lllIIlllII[0]];
                                                                nArray13[v.lllIIlllII[1]] = lllIIlllII[19];
                                                                if (!v.llIIIIlIlIIIl(Bank.contains((int[])nArray13) ? 1 : 0)) break block43;
                                                                int[] nArray14 = new int[lllIIlllII[0]];
                                                                nArray14[v.lllIIlllII[1]] = lllIIlllII[19];
                                                                if (!v.llIIIIlIlIIlI(Bank.getFirst((int[])nArray14).getQuantity(), lllIIlllII[15])) break block43;
                                                            }
                                                            var12 = new DHelper(lllIIlllII[19], lllIIlllII[15], e.c(lllIIlllII[418], lllIIlllII[419]));
                                                            bv.add((DHelper) ar12);

                                                        }
                                                        int[] nArray = new int[lllIIlllII[0]];
                                                        nArray[v.lllIIlllII[1]] = lllIIlllII[38];
                                                        if (v.llIIIIlIlIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                                                            var12 = new DHelper(lllIIlllII[38], lllIIlllII[0], e.c(lllIIlllII[418], lllIIlllII[419]));
                                                            bv.add((DHelper) ar12);

                                                        }
                                                        int[] nArray15 = new int[lllIIlllII[0]];
                                                        nArray15[v.lllIIlllII[1]] = lllIIlllII[23];
                                                        if (!v.llIIIIlIlIIIl(Bank.contains((int[])nArray15) ? 1 : 0)) break block44;
                                                        int[] nArray16 = new int[lllIIlllII[0]];
                                                        nArray16[v.lllIIlllII[1]] = lllIIlllII[23];
                                                        if (!v.llIIIIlIlIIIl(Bank.contains((int[])nArray16) ? 1 : 0)) break block45;
                                                        int[] nArray17 = new int[lllIIlllII[0]];
                                                        nArray17[v.lllIIlllII[1]] = lllIIlllII[23];
                                                        if (!v.llIIIIlIlIIlI(Bank.getFirst((int[])nArray17).getQuantity(), lllIIlllII[160])) break block45;
                                                    }
                                                    var12 = new DHelper(lllIIlllII[23], lllIIlllII[160], e.c(lllIIlllII[29], lllIIlllII[58]));
                                                    bv.add((DHelper) ar12);

                                                }
                                                int[] nArray = new int[lllIIlllII[0]];
                                                nArray[v.lllIIlllII[1]] = lllIIlllII[21];
                                                if (!v.llIIIIlIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block46;
                                                int[] nArray18 = new int[lllIIlllII[0]];
                                                nArray18[v.lllIIlllII[1]] = lllIIlllII[21];
                                                if (!v.llIIIIlIlIIIl(Bank.contains((int[])nArray18) ? 1 : 0)) break block47;
                                                int[] nArray19 = new int[lllIIlllII[0]];
                                                nArray19[v.lllIIlllII[1]] = lllIIlllII[21];
                                                if (!v.llIIIIlIlIIlI(Bank.getFirst((int[])nArray19).getQuantity(), lllIIlllII[3])) break block47;
                                            }
                                            var12 = new DHelper(lllIIlllII[21], lllIIlllII[22], e.c(lllIIlllII[29], lllIIlllII[58]));
                                            bv.add((DHelper) ar12);

                                        }
                                        int[] nArray = new int[lllIIlllII[0]];
                                        nArray[v.lllIIlllII[1]] = lllIIlllII[34];
                                        if (v.llIIIIlIlIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                                            var12 = new DHelper(lllIIlllII[34], lllIIlllII[0], e.c(lllIIlllII[420], lllIIlllII[421]));
                                            bv.add((DHelper) ar12);

                                        }
                                        int[] nArray20 = new int[lllIIlllII[0]];
                                        nArray20[v.lllIIlllII[1]] = lllIIlllII[35];
                                        if (v.llIIIIlIlIIll(Bank.contains((int[])nArray20) ? 1 : 0)) {
                                            var12 = new DHelper(lllIIlllII[35], lllIIlllII[0], e.c(lllIIlllII[422], lllIIlllII[417]));
                                            bv.add((DHelper) ar12);

                                        }
                                        int[] nArray21 = new int[lllIIlllII[0]];
                                        nArray21[v.lllIIlllII[1]] = lllIIlllII[33];
                                        if (v.llIIIIlIlIIll(Bank.contains((int[])nArray21) ? 1 : 0)) {
                                            var12 = new DHelper(lllIIlllII[33], lllIIlllII[0], e.c(lllIIlllII[420], lllIIlllII[421]));
                                            bv.add((DHelper) ar12);

                                        }
                                        int[] nArray22 = new int[lllIIlllII[0]];
                                        nArray22[v.lllIIlllII[1]] = lllIIlllII[37];
                                        if (v.llIIIIlIlIIll(Bank.contains((int[])nArray22) ? 1 : 0)) {
                                            var12 = new DHelper(lllIIlllII[37], lllIIlllII[0], e.c(lllIIlllII[420], lllIIlllII[421]));
                                            bv.add((DHelper) ar12);

                                        }
                                        int[] nArray23 = new int[lllIIlllII[0]];
                                        nArray23[v.lllIIlllII[1]] = lllIIlllII[25];
                                        if (!v.llIIIIlIlIIIl(Bank.contains((int[])nArray23) ? 1 : 0)) break block48;
                                        int[] nArray24 = new int[lllIIlllII[0]];
                                        nArray24[v.lllIIlllII[1]] = lllIIlllII[25];
                                        if (!v.llIIIIlIlIIIl(Bank.contains((int[])nArray24) ? 1 : 0)) break block49;
                                        int[] nArray25 = new int[lllIIlllII[0]];
                                        nArray25[v.lllIIlllII[1]] = lllIIlllII[25];
                                        if (!v.llIIIIlIlIIlI(Bank.getFirst((int[])nArray25).getQuantity(), lllIIlllII[26])) break block49;
                                    }
                                    var12 = new DHelper(lllIIlllII[25], lllIIlllII[26], e.c(lllIIlllII[423], lllIIlllII[424]));
                                    bv.add((DHelper) ar12);

                                }
                                int[] nArray = new int[lllIIlllII[0]];
                                nArray[v.lllIIlllII[1]] = lllIIlllII[31];
                                if (!v.llIIIIlIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block50;
                                int[] nArray26 = new int[lllIIlllII[0]];
                                nArray26[v.lllIIlllII[1]] = lllIIlllII[31];
                                if (!v.llIIIIlIlIIIl(Bank.contains((int[])nArray26) ? 1 : 0)) break block51;
                                int[] nArray27 = new int[lllIIlllII[0]];
                                nArray27[v.lllIIlllII[1]] = lllIIlllII[31];
                                if (!v.llIIIIlIlIIlI(Bank.getFirst((int[])nArray27).getQuantity(), lllIIlllII[28])) break block51;
                            }
                            var12 = new DHelper(lllIIlllII[31], lllIIlllII[28], e.c(lllIIlllII[425], lllIIlllII[417]));
                            bv.add((DHelper) ar12);

                        }
                        int[] nArray = new int[lllIIlllII[0]];
                        nArray[v.lllIIlllII[1]] = lllIIlllII[39];
                        if (!v.llIIIIlIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block52;
                        int[] nArray28 = new int[lllIIlllII[0]];
                        nArray28[v.lllIIlllII[1]] = lllIIlllII[39];
                        if (!v.llIIIIlIlIIIl(Bank.contains((int[])nArray28) ? 1 : 0)) break block53;
                        int[] nArray29 = new int[lllIIlllII[0]];
                        nArray29[v.lllIIlllII[1]] = lllIIlllII[39];
                        if (!v.llIIIIlIlIIlI(Bank.getFirst((int[])nArray29).getQuantity(), lllIIlllII[58])) break block53;
                    }
                    var12 = new DHelper(lllIIlllII[39], lllIIlllII[58], e.c(lllIIlllII[426], lllIIlllII[427]));
                    bv.add((DHelper) ar12);

                }
                if (v.llIIIIlIlIIll(Bank.contains((Predicate)(var12 = item -> item.getName().toLowerCase().contains(lllIIlIIlI[lllIIlllII[434]]))) ? 1 : 0)) {
                    var11 = new DHelper(lllIIlllII[428], lllIIlllII[9], e.c(lllIIlllII[429], lllIIlllII[430]));
                    bv.add(var11);

                }
                int[] nArray = new int[lllIIlllII[0]];
                nArray[v.lllIIlllII[1]] = lllIIlllII[51];
                if (v.llIIIIlIlIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                    var11 = new DHelper(lllIIlllII[51], lllIIlllII[8], j.cf);
                    bv.add(var11);

                }
                int[] nArray30 = new int[lllIIlllII[0]];
                nArray30[v.lllIIlllII[1]] = lllIIlllII[30];
                if (!v.llIIIIlIlIIIl(Bank.contains((int[])nArray30) ? 1 : 0)) break block54;
                int[] nArray31 = new int[lllIIlllII[0]];
                nArray31[v.lllIIlllII[1]] = lllIIlllII[30];
                if (!v.llIIIIlIlIIIl(Bank.contains((int[])nArray31) ? 1 : 0)) break block55;
                int[] nArray32 = new int[lllIIlllII[0]];
                nArray32[v.lllIIlllII[1]] = lllIIlllII[30];
                if (!v.llIIIIlIlIIlI(Bank.getFirst((int[])nArray32).getQuantity(), lllIIlllII[28])) break block55;
            }
            var11 = new DHelper(lllIIlllII[30], lllIIlllII[4], e.c(lllIIlllII[431], lllIIlllII[432]));
            bv.add(var11);

        }
    }

    /*
     * WARNING - void declaration
     */
    private static boolean an() {
        void var13;
        int[] nArray = new int[lllIIlllII[17]];
        nArray[v.lllIIlllII[1]] = lllIIlllII[30];
        nArray[v.lllIIlllII[0]] = lllIIlllII[31];
        nArray[v.lllIIlllII[6]] = lllIIlllII[32];
        nArray[v.lllIIlllII[7]] = lllIIlllII[33];
        nArray[v.lllIIlllII[8]] = lllIIlllII[34];
        nArray[v.lllIIlllII[9]] = lllIIlllII[35];
        nArray[v.lllIIlllII[10]] = lllIIlllII[36];
        nArray[v.lllIIlllII[12]] = lllIIlllII[21];
        nArray[v.lllIIlllII[13]] = lllIIlllII[37];
        nArray[v.lllIIlllII[14]] = lllIIlllII[38];
        nArray[v.lllIIlllII[15]] = lllIIlllII[39];
        int[] nArray2 = nArray;
        int var14 = lllIIlllII[1];
        while (v.llIIIIlIlIIlI(var14, ((void)var13).length)) {
            int[] nArray3 = new int[lllIIlllII[0]];
            nArray3[v.lllIIlllII[1]] = var13[var14];
            if (v.llIIIIlIlIIll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return lllIIlllII[1];
            }
            ++var14;

            if ((0x32 ^ 0x36) > 0) continue;
            return false;
        }
        return lllIIlllII[0];
    }

    private static void llIIIIlIIllIl() {
        lllIIlIIlI = new String[lllIIlllII[476]];
        v.lllIIlIIlI[v.lllIIlllII[1]] = "Finished buying items, switching back to quest";
        v.lllIIlIIlI[v.lllIIlllII[0]] = "Tome of experience (3)";
        v.lllIIlIIlI[v.lllIIlllII[6]] = "Tome of experience (2)";
        v.lllIIlIIlI[v.lllIIlllII[7]] = "Tome of experience (1)";
        v.lllIIlIIlI[v.lllIIlllII[8]] = "Tome of experience (3)";
        v.lllIIlIIlI[v.lllIIlllII[9]] = "Tome of experience (2)";
        v.lllIIlIIlI[v.lllIIlllII[10]] = "Tome of experience (1)";
        v.lllIIlIIlI[v.lllIIlllII[12]] = "Tome of experience (3)";
        v.lllIIlIIlI[v.lllIIlllII[13]] = "Tome of experience (2)";
        v.lllIIlIIlI[v.lllIIlllII[14]] = "Tome of experience (1)";
        v.lllIIlIIlI[v.lllIIlllII[15]] = "Nav to bank";
        v.lllIIlIIlI[v.lllIIlllII[17]] = "Handling banking";
        v.lllIIlIIlI[v.lllIIlllII[20]] = "We are missing super combat or super restores, switching to BUYING";
        v.lllIIlIIlI[v.lllIIlllII[24]] = "We are missing air runes or fire runes, switching to BUYING";
        v.lllIIlIIlI[v.lllIIlllII[27]] = "We are missing shark, switching to BUYING";
        v.lllIIlIIlI[v.lllIIlllII[28]] = "We are missing quest supplies, switching to BUYING";
        v.lllIIlIIlI[v.lllIIlllII[44]] = "We are missing quest supplies, switching to BUYING";
        v.lllIIlIIlI[v.lllIIlllII[46]] = "Drink";
        v.lllIIlIIlI[v.lllIIlllII[48]] = "Vial";
        v.lllIIlIIlI[v.lllIIlllII[50]] = "Nav to ground city";
        v.lllIIlIIlI[v.lllIIlllII[29]] = "Wield";
        v.lllIIlIIlI[v.lllIIlllII[56]] = "Wear";
        v.lllIIlIIlI[v.lllIIlllII[57]] = "Wear";
        v.lllIIlIIlI[v.lllIIlllII[58]] = "Wear";
        v.lllIIlIIlI[v.lllIIlllII[59]] = "Nav to start";
        v.lllIIlIIlI[v.lllIIlllII[60]] = "Garth";
        v.lllIIlIIlI[v.lllIIlllII[70]] = "Nav to oldman area";
        v.lllIIlIIlI[v.lllIIlllII[71]] = "Run to base tile";
        v.lllIIlIIlI[v.lllIIlllII[72]] = "Talk";
        v.lllIIlIIlI[v.lllIIlllII[73]] = "Safalaan Hallow";
        v.lllIIlIIlI[v.lllIIlllII[64]] = "Nav to ground city";
        v.lllIIlIIlI[v.lllIIlllII[74]] = "Nav to tob wall";
        v.lllIIlIIlI[v.lllIIlllII[75]] = "Rubble";
        v.lllIIlIIlI[v.lllIIlllII[76]] = "Climb-up";
        v.lllIIlIIlI[v.lllIIlllII[69]] = "Shark";
        v.lllIIlIIlI[v.lllIIlllII[77]] = "Shark";
        v.lllIIlIIlI[v.lllIIlllII[78]] = "Harpert";
        v.lllIIlIIlI[v.lllIIlllII[79]] = "Go up rubble";
        v.lllIIlIIlI[v.lllIIlllII[11]] = "Rubble";
        v.lllIIlIIlI[v.lllIIlllII[80]] = "Climb-up";
        v.lllIIlIIlI[v.lllIIlllII[4]] = "Nav to tile";
        v.lllIIlIIlI[v.lllIIlllII[97]] = "NO anim going up";
        v.lllIIlIIlI[v.lllIIlllII[98]] = "Vent";
        v.lllIIlIIlI[v.lllIIlllII[99]] = "Climb-up";
        v.lllIIlIIlI[v.lllIIlllII[100]] = "Go to roof tile 1";
        v.lllIIlIIlI[v.lllIIlllII[3]] = "Roof";
        v.lllIIlIIlI[v.lllIIlllII[101]] = "Jump-off";
        v.lllIIlIIlI[v.lllIIlllII[103]] = "Nav to tile";
        v.lllIIlIIlI[v.lllIIlllII[2]] = "NO anim going up";
        v.lllIIlIIlI[v.lllIIlllII[105]] = "Vent";
        v.lllIIlIIlI[v.lllIIlllII[55]] = "Climb-up";
        v.lllIIlIIlI[v.lllIIlllII[22]] = "Climb-up";
        v.lllIIlIIlI[v.lllIIlllII[108]] = "Roof";
        v.lllIIlIIlI[v.lllIIlllII[109]] = "Climb-down";
        v.lllIIlIIlI[v.lllIIlllII[110]] = "Nav to window";
        v.lllIIlIIlI[v.lllIIlllII[111]] = "Window";
        v.lllIIlIIlI[v.lllIIlllII[112]] = "Look-through";
        v.lllIIlIIlI[v.lllIIlllII[113]] = "Shark";
        v.lllIIlIIlI[v.lllIIlllII[114]] = "Eat";
        v.lllIIlIIlI[v.lllIIlllII[115]] = "Break";
        v.lllIIlIIlI[v.lllIIlllII[116]] = "Nav to burgh bank";
        v.lllIIlIIlI[v.lllIIlllII[118]] = "Bank";
        v.lllIIlIIlI[v.lllIIlllII[121]] = "Nav to ground city";
        v.lllIIlIIlI[v.lllIIlllII[122]] = "Run to base tile";
        v.lllIIlIIlI[v.lllIIlllII[123]] = "Talk";
        v.lllIIlIIlI[v.lllIIlllII[124]] = "Safalaan Hallow";
        v.lllIIlIIlI[v.lllIIlllII[125]] = "Flaygian Screwte";
        v.lllIIlIIlI[v.lllIIlllII[127]] = "Safalaan Hallow";
        v.lllIIlIIlI[v.lllIIlllII[129]] = "Shark";
        v.lllIIlIIlI[v.lllIIlllII[130]] = "Eat";
        v.lllIIlIIlI[v.lllIIlllII[126]] = "Unfinished potion";
        v.lllIIlIIlI[v.lllIIlllII[131]] = "Mysterious crushed meat";
        v.lllIIlIIlI[v.lllIIlllII[132]] = "Mysterious herb";
        v.lllIIlIIlI[v.lllIIlllII[133]] = "Unfinished potion";
        v.lllIIlIIlI[v.lllIIlllII[134]] = "Getting herb";
        v.lllIIlIIlI[v.lllIIlllII[63]] = "Search";
        v.lllIIlIIlI[v.lllIIlllII[136]] = "Mysterious herb";
        v.lllIIlIIlI[v.lllIIlllII[137]] = "Mysterious meat";
        v.lllIIlIIlI[v.lllIIlllII[138]] = "Getting meat";
        v.lllIIlIIlI[v.lllIIlllII[140]] = "Search";
        v.lllIIlIIlI[v.lllIIlllII[128]] = "Mysterious herb";
        v.lllIIlIIlI[v.lllIIlllII[141]] = "Unfinished potion";
        v.lllIIlIIlI[v.lllIIlllII[142]] = "Mysterious meat";
        v.lllIIlIIlI[v.lllIIlllII[143]] = "Mixing herb with water";
        v.lllIIlIIlI[v.lllIIlllII[144]] = "Mysterious herb";
        v.lllIIlIIlI[v.lllIIlllII[145]] = "Vial of water";
        v.lllIIlIIlI[v.lllIIlllII[146]] = "Unfinished potion";
        v.lllIIlIIlI[v.lllIIlllII[147]] = "Mysterious meat";
        v.lllIIlIIlI[v.lllIIlllII[148]] = "Grinding meat";
        v.lllIIlIIlI[v.lllIIlllII[149]] = "Mysterious meat";
        v.lllIIlIIlI[v.lllIIlllII[150]] = "Unfinished potion";
        v.lllIIlIIlI[v.lllIIlllII[151]] = "Mysterious crushed meat";
        v.lllIIlIIlI[v.lllIIlllII[152]] = "Using crushed meat on unf pot";
        v.lllIIlIIlI[v.lllIIlllII[153]] = "Mysterious crushed meat";
        v.lllIIlIIlI[v.lllIIlllII[154]] = "Unfinished potion";
        v.lllIIlIIlI[v.lllIIlllII[155]] = "Potion";
        v.lllIIlIIlI[v.lllIIlllII[156]] = "Throwing potion on door";
        v.lllIIlIIlI[v.lllIIlllII[157]] = "Potion";
        v.lllIIlIIlI[v.lllIIlllII[158]] = "Door";
        v.lllIIlIIlI[v.lllIIlllII[159]] = "Safalaan Hallow";
        v.lllIIlIIlI[v.lllIIlllII[160]] = "Mysterious herb";
        v.lllIIlIIlI[v.lllIIlllII[161]] = "Unfinished blood potion";
        v.lllIIlIIlI[v.lllIIlllII[162]] = "Getting herb";
        v.lllIIlIIlI[v.lllIIlllII[163]] = "Search";
        v.lllIIlIIlI[v.lllIIlllII[164]] = "Mysterious herb";
        v.lllIIlIIlI[v.lllIIlllII[165]] = "Mysterious meat";
        v.lllIIlIIlI[v.lllIIlllII[166]] = "Getting meat";
        v.lllIIlIIlI[v.lllIIlllII[167]] = "Search";
        v.lllIIlIIlI[v.lllIIlllII[168]] = "Mysterious herb";
        v.lllIIlIIlI[v.lllIIlllII[169]] = "Unfinished potion";
        v.lllIIlIIlI[v.lllIIlllII[170]] = "Mysterious meat";
        v.lllIIlIIlI[v.lllIIlllII[171]] = "Mysterious herb";
        v.lllIIlIIlI[v.lllIIlllII[172]] = "Vial of blood";
        v.lllIIlIIlI[v.lllIIlllII[173]] = "Unfinished blood potion";
        v.lllIIlIIlI[v.lllIIlllII[174]] = "Mysterious meat";
        v.lllIIlIIlI[v.lllIIlllII[175]] = "Mysterious meat";
        v.lllIIlIIlI[v.lllIIlllII[176]] = "Unfinished blood potion";
        v.lllIIlIIlI[v.lllIIlllII[177]] = "Mysterious crushed meat";
        v.lllIIlIIlI[v.lllIIlllII[178]] = "Mysterious crushed meat";
        v.lllIIlIIlI[v.lllIIlllII[179]] = "Unfinished blood potion";
        v.lllIIlIIlI[v.lllIIlllII[180]] = "Blood potion";
        v.lllIIlIIlI[v.lllIIlllII[181]] = "Blood potion";
        v.lllIIlIIlI[v.lllIIlllII[182]] = "Door";
        v.lllIIlIIlI[v.lllIIlllII[185]] = "Door";
        v.lllIIlIIlI[v.lllIIlllII[186]] = "Open";
        v.lllIIlIIlI[v.lllIIlllII[187]] = "Chest";
        v.lllIIlIIlI[v.lllIIlllII[188]] = "Open";
        v.lllIIlIIlI[v.lllIIlllII[189]] = "Chest";
        v.lllIIlIIlI[v.lllIIlllII[190]] = "Open";
        v.lllIIlIIlI[v.lllIIlllII[191]] = "Chest";
        v.lllIIlIIlI[v.lllIIlllII[192]] = "Search";
        v.lllIIlIIlI[v.lllIIlllII[193]] = "Chest";
        v.lllIIlIIlI[v.lllIIlllII[194]] = "Search";
        v.lllIIlIIlI[v.lllIIlllII[195]] = "Door";
        v.lllIIlIIlI[v.lllIIlllII[196]] = "Open";
        v.lllIIlIIlI[v.lllIIlllII[197]] = "Safalaan Hallow";
        v.lllIIlIIlI[v.lllIIlllII[200]] = "Break";
        v.lllIIlIIlI[v.lllIIlllII[201]] = "Nav to ground city";
        v.lllIIlIIlI[v.lllIIlllII[202]] = "Run to base tile";
        v.lllIIlIIlI[v.lllIIlllII[203]] = "Talk";
        v.lllIIlIIlI[v.lllIIlllII[204]] = "Safalaan Hallow";
        v.lllIIlIIlI[v.lllIIlllII[205]] = "Abomination";
        v.lllIIlIIlI[v.lllIIlllII[206]] = "Handle fight";
        v.lllIIlIIlI[v.lllIIlllII[207]] = "Shark";
        v.lllIIlIIlI[v.lllIIlllII[208]] = "Shark";
        v.lllIIlIIlI[v.lllIIlllII[26]] = "Eat";
        v.lllIIlIIlI[v.lllIIlllII[209]] = "Drink";
        v.lllIIlIIlI[v.lllIIlllII[210]] = "Drink";
        v.lllIIlIIlI[v.lllIIlllII[212]] = "Drink";
        v.lllIIlIIlI[v.lllIIlllII[120]] = "Drink";
        v.lllIIlIIlI[v.lllIIlllII[215]] = "Drink";
        v.lllIIlIIlI[v.lllIIlllII[216]] = "Abomination";
        v.lllIIlIIlI[v.lllIIlllII[217]] = "Attack";
        v.lllIIlIIlI[v.lllIIlllII[218]] = "Drink";
        v.lllIIlIIlI[v.lllIIlllII[219]] = "Drink";
        v.lllIIlIIlI[v.lllIIlllII[220]] = "Drink";
        v.lllIIlIIlI[v.lllIIlllII[221]] = "Drink";
        v.lllIIlIIlI[v.lllIIlllII[222]] = "Drink";
        v.lllIIlIIlI[v.lllIIlllII[223]] = "Shark";
        v.lllIIlIIlI[v.lllIIlllII[224]] = "Shark";
        v.lllIIlIIlI[v.lllIIlllII[225]] = "Eat";
        v.lllIIlIIlI[v.lllIIlllII[226]] = "Nav to burgh bank";
        v.lllIIlIIlI[v.lllIIlllII[230]] = "Break";
        v.lllIIlIIlI[v.lllIIlllII[231]] = "Bank";
        v.lllIIlIIlI[v.lllIIlllII[232]] = "Shark";
        v.lllIIlIIlI[v.lllIIlllII[233]] = "Emerald";
        v.lllIIlIIlI[v.lllIIlllII[234]] = "nav to oldman";
        v.lllIIlIIlI[v.lllIIlllII[235]] = "Trapdoor";
        v.lllIIlIIlI[v.lllIIlllII[236]] = "Open";
        v.lllIIlIIlI[v.lllIIlllII[237]] = "Trapdoor";
        v.lllIIlIIlI[v.lllIIlllII[229]] = "Open";
        v.lllIIlIIlI[v.lllIIlllII[238]] = "Trapdoor";
        v.lllIIlIIlI[v.lllIIlllII[239]] = "Climb-down";
        v.lllIIlIIlI[v.lllIIlllII[240]] = "Trapdoor";
        v.lllIIlIIlI[v.lllIIlllII[241]] = "Climb-down";
        v.lllIIlIIlI[v.lllIIlllII[242]] = "Safalaan Hallow";
        v.lllIIlIIlI[v.lllIIlllII[243]] = "Flaygian's notes";
        v.lllIIlIIlI[v.lllIIlllII[244]] = "Vertida Sefalatis";
        v.lllIIlIIlI[v.lllIIlllII[245]] = "Flaygian's notes";
        v.lllIIlIIlI[v.lllIIlllII[246]] = "Flaygian's notes";
        v.lllIIlIIlI[v.lllIIlllII[247]] = "Read";
        v.lllIIlIIlI[v.lllIIlllII[248]] = "Ivandis flail";
        v.lllIIlIIlI[v.lllIIlllII[249]] = "Silver sickle (b)";
        v.lllIIlIIlI[v.lllIIlllII[251]] = "Vial";
        v.lllIIlIIlI[v.lllIIlllII[252]] = "Vial";
        v.lllIIlIIlI[v.lllIIlllII[253]] = "Drop";
        v.lllIIlIIlI[v.lllIIlllII[254]] = "Search";
        v.lllIIlIIlI[v.lllIIlllII[255]] = "Chain";
        v.lllIIlIIlI[v.lllIIlllII[256]] = "Silver sickle (b)";
        v.lllIIlIIlI[v.lllIIlllII[258]] = "Vial";
        v.lllIIlIIlI[v.lllIIlllII[259]] = "Vial";
        v.lllIIlIIlI[v.lllIIlllII[260]] = "Drop";
        v.lllIIlIIlI[v.lllIIlllII[261]] = "Search";
        v.lllIIlIIlI[v.lllIIlllII[262]] = "Chain";
        v.lllIIlIIlI[v.lllIIlllII[263]] = "Silver sickle (b)";
        v.lllIIlIIlI[v.lllIIlllII[264]] = "Rod of ivandis (10)";
        v.lllIIlIIlI[v.lllIIlllII[265]] = "Vertida Sefalatis";
        v.lllIIlIIlI[v.lllIIlllII[266]] = "Veliaf Hurtz";
        v.lllIIlIIlI[v.lllIIlllII[267]] = "Nav to pub";
        v.lllIIlIIlI[v.lllIIlllII[269]] = "Trapdoor";
        v.lllIIlIIlI[v.lllIIlllII[270]] = "Open";
        v.lllIIlIIlI[v.lllIIlllII[271]] = "Trapdoor";
        v.lllIIlIIlI[v.lllIIlllII[272]] = "Climb-down";
        v.lllIIlIIlI[v.lllIIlllII[273]] = "Veliaf Hurtz";
        v.lllIIlIIlI[v.lllIIlllII[274]] = "Talking to veliaf";
        v.lllIIlIIlI[v.lllIIlllII[275]] = "Veliaf Hurtz";
        v.lllIIlIIlI[v.lllIIlllII[276]] = "Chain";
        v.lllIIlIIlI[v.lllIIlllII[277]] = "Silver sickle (b)";
        v.lllIIlIIlI[v.lllIIlllII[278]] = "Rod of ivandis (10)";
        v.lllIIlIIlI[v.lllIIlllII[279]] = "Emerald";
        v.lllIIlIIlI[v.lllIIlllII[280]] = "Silver sickle (b)";
        v.lllIIlIIlI[v.lllIIlllII[281]] = "Emerald sickle (b)";
        v.lllIIlIIlI[v.lllIIlllII[282]] = "Emerald sickle (b)";
        v.lllIIlIIlI[v.lllIIlllII[283]] = "Enchanted emerald sickle (b)";
        v.lllIIlIIlI[v.lllIIlllII[284]] = "Enchanted emerald sickle (b)";
        v.lllIIlIIlI[v.lllIIlllII[285]] = "Rod of ivandis (10)";
        v.lllIIlIIlI[v.lllIIlllII[286]] = "Ivandis flail";
        v.lllIIlIIlI[v.lllIIlllII[287]] = "Veliaf Hurtz";
        v.lllIIlIIlI[v.lllIIlllII[288]] = "Ladder";
        v.lllIIlIIlI[v.lllIIlllII[289]] = "Climb-up";
        v.lllIIlIIlI[v.lllIIlllII[290]] = "Veliaf Hurtz";
        v.lllIIlIIlI[v.lllIIlllII[291]] = "nav to oldman";
        v.lllIIlIIlI[v.lllIIlllII[292]] = "Trapdoor";
        v.lllIIlIIlI[v.lllIIlllII[293]] = "Open";
        v.lllIIlIIlI[v.lllIIlllII[294]] = "Trapdoor";
        v.lllIIlIIlI[v.lllIIlllII[295]] = "Open";
        v.lllIIlIIlI[v.lllIIlllII[296]] = "Trapdoor";
        v.lllIIlIIlI[v.lllIIlllII[38]] = "Climb-down";
        v.lllIIlIIlI[v.lllIIlllII[297]] = "Trapdoor";
        v.lllIIlIIlI[v.lllIIlllII[298]] = "Climb-down";
        v.lllIIlIIlI[v.lllIIlllII[299]] = "Safalaan Hallow";
        v.lllIIlIIlI[v.lllIIlllII[300]] = "Ivandis flail";
        v.lllIIlIIlI[v.lllIIlllII[301]] = "Ivandis flail";
        v.lllIIlIIlI[v.lllIIlllII[36]] = "Wield";
        v.lllIIlIIlI[v.lllIIlllII[302]] = "Ladder";
        v.lllIIlIIlI[v.lllIIlllII[303]] = "Climb-up";
        v.lllIIlIIlI[v.lllIIlllII[304]] = "Kael Forshaw";
        v.lllIIlIIlI[v.lllIIlllII[305]] = "Ranis Drakan";
        v.lllIIlIIlI[v.lllIIlllII[306]] = "Shark";
        v.lllIIlIIlI[v.lllIIlllII[307]] = "Shark";
        v.lllIIlIIlI[v.lllIIlllII[308]] = "Eat";
        v.lllIIlIIlI[v.lllIIlllII[309]] = "Drink";
        v.lllIIlIIlI[v.lllIIlllII[310]] = "Kael Forshaw";
        v.lllIIlIIlI[v.lllIIlllII[311]] = "Drink";
        v.lllIIlIIlI[v.lllIIlllII[312]] = "Shark";
        v.lllIIlIIlI[v.lllIIlllII[313]] = "Shark";
        v.lllIIlIIlI[v.lllIIlllII[314]] = "Eat";
        v.lllIIlIIlI[v.lllIIlllII[315]] = "Drink";
        v.lllIIlIIlI[v.lllIIlllII[316]] = "Shark";
        v.lllIIlIIlI[v.lllIIlllII[317]] = "Escaping";
        v.lllIIlIIlI[v.lllIIlllII[318]] = "Quick-escape";
        v.lllIIlIIlI[v.lllIIlllII[319]] = "Dodging blood bomb";
        v.lllIIlIIlI[v.lllIIlllII[320]] = "Vyrewatch";
        v.lllIIlIIlI[v.lllIIlllII[321]] = "Vyrewatch";
        v.lllIIlIIlI[v.lllIIlllII[322]] = "Attack";
        v.lllIIlIIlI[v.lllIIlllII[323]] = "Attack";
        v.lllIIlIIlI[v.lllIIlllII[324]] = "Shark";
        v.lllIIlIIlI[v.lllIIlllII[325]] = "Attack";
        v.lllIIlIIlI[v.lllIIlllII[326]] = "Vyrewatch";
        v.lllIIlIIlI[v.lllIIlllII[327]] = "Vyrewatch";
        v.lllIIlIIlI[v.lllIIlllII[328]] = "Attack";
        v.lllIIlIIlI[v.lllIIlllII[329]] = "Attack";
        v.lllIIlIIlI[v.lllIIlllII[331]] = "Dodge charge attack";
        v.lllIIlIIlI[v.lllIIlllII[332]] = "Attack";
        v.lllIIlIIlI[v.lllIIlllII[333]] = "Vyrewatch";
        v.lllIIlIIlI[v.lllIIlllII[334]] = "Attack";
        v.lllIIlIIlI[v.lllIIlllII[335]] = "Attack";
        v.lllIIlIIlI[v.lllIIlllII[336]] = "Shark";
        v.lllIIlIIlI[v.lllIIlllII[337]] = "Shark";
        v.lllIIlIIlI[v.lllIIlllII[338]] = "Eat";
        v.lllIIlIIlI[v.lllIIlllII[339]] = "Drink";
        v.lllIIlIIlI[v.lllIIlllII[340]] = "nav to oldman";
        v.lllIIlIIlI[v.lllIIlllII[341]] = "Trapdoor";
        v.lllIIlIIlI[v.lllIIlllII[342]] = "Open";
        v.lllIIlIIlI[v.lllIIlllII[343]] = "Trapdoor";
        v.lllIIlIIlI[v.lllIIlllII[344]] = "Open";
        v.lllIIlIIlI[v.lllIIlllII[345]] = "Trapdoor";
        v.lllIIlIIlI[v.lllIIlllII[346]] = "Climb-down";
        v.lllIIlIIlI[v.lllIIlllII[347]] = "Trapdoor";
        v.lllIIlIIlI[v.lllIIlllII[348]] = "Climb-down";
        v.lllIIlIIlI[v.lllIIlllII[349]] = "Safalaan Hallow";
        v.lllIIlIIlI[v.lllIIlllII[350]] = "Tome of experience";
        v.lllIIlIIlI[v.lllIIlllII[351]] = "Selecting agility";
        v.lllIIlIIlI[v.lllIIlllII[352]] = "Tome of experience";
        v.lllIIlIIlI[v.lllIIlllII[353]] = "Read";
        v.lllIIlIIlI[v.lllIIlllII[354]] = "Agility";
        v.lllIIlIIlI[v.lllIIlllII[355]] = "Confirm";
        v.lllIIlIIlI[v.lllIIlllII[356]] = "Shark";
        v.lllIIlIIlI[v.lllIIlllII[357]] = "Nav to tob bank";
        v.lllIIlIIlI[v.lllIIlllII[359]] = "Wear";
        v.lllIIlIIlI[v.lllIIlllII[360]] = "Wear";
        v.lllIIlIIlI[v.lllIIlllII[361]] = "Wear";
        v.lllIIlIIlI[v.lllIIlllII[362]] = "Wear";
        v.lllIIlIIlI[v.lllIIlllII[363]] = "Wear";
        v.lllIIlIIlI[v.lllIIlllII[364]] = "Wear";
        v.lllIIlIIlI[v.lllIIlllII[365]] = "Wield";
        v.lllIIlIIlI[v.lllIIlllII[366]] = "Equip";
        v.lllIIlIIlI[v.lllIIlllII[367]] = "Wear";
        v.lllIIlIIlI[v.lllIIlllII[373]] = "Nav to baseladder";
        v.lllIIlIIlI[v.lllIIlllII[374]] = "Go up";
        v.lllIIlIIlI[v.lllIIlllII[375]] = "Ladder";
        v.lllIIlIIlI[v.lllIIlllII[376]] = "Climb-up";
        v.lllIIlIIlI[v.lllIIlllII[377]] = "Pushing wall";
        v.lllIIlIIlI[v.lllIIlllII[378]] = "Wall";
        v.lllIIlIIlI[v.lllIIlllII[379]] = "Push";
        v.lllIIlIIlI[v.lllIIlllII[381]] = "Go up";
        v.lllIIlIIlI[v.lllIIlllII[382]] = "Stairs up";
        v.lllIIlIIlI[v.lllIIlllII[383]] = "Climb-up";
        v.lllIIlIIlI[v.lllIIlllII[389]] = "Walk to tile";
        v.lllIIlIIlI[v.lllIIlllII[391]] = "Jump-to";
        v.lllIIlIIlI[v.lllIIlllII[392]] = "Go down";
        v.lllIIlIIlI[v.lllIIlllII[393]] = "Ladder";
        v.lllIIlIIlI[v.lllIIlllII[394]] = "Climb-down";
        v.lllIIlIIlI[v.lllIIlllII[397]] = "Nav to house ladder";
        v.lllIIlIIlI[v.lllIIlllII[398]] = "Go down";
        v.lllIIlIIlI[v.lllIIlllII[399]] = "Stairs";
        v.lllIIlIIlI[v.lllIIlllII[400]] = "Climb-down";
        v.lllIIlIIlI[v.lllIIlllII[401]] = "Safalaan Hallow";
        v.lllIIlIIlI[v.lllIIlllII[433]] = "Tome of experience";
        v.lllIIlIIlI[v.lllIIlllII[434]] = "ring of wealth (";
        v.lllIIlIIlI[v.lllIIlllII[5]] = "Super combat";
        v.lllIIlIIlI[v.lllIIlllII[437]] = "vyrewatch";
        v.lllIIlIIlI[v.lllIIlllII[438]] = "Attack";
        v.lllIIlIIlI[v.lllIIlllII[439]] = "Meiyerditch citizen";
        v.lllIIlIIlI[v.lllIIlllII[440]] = "Quick-escape";
        v.lllIIlIIlI[v.lllIIlllII[441]] = "roof";
        v.lllIIlIIlI[v.lllIIlllII[442]] = "Climb-up";
        v.lllIIlIIlI[v.lllIIlllII[454]] = "Yes.";
        v.lllIIlIIlI[v.lllIIlllII[455]] = "Is there something I can do to help out?";
        v.lllIIlIIlI[v.lllIIlllII[456]] = "Hey, look over there! (Distract and sneak away).";
        v.lllIIlIIlI[v.lllIIlllII[457]] = "(whisper) Do you know about the Myreque?";
        v.lllIIlIIlI[v.lllIIlllII[458]] = "(whisper) I really need to meet the Myreque.";
        v.lllIIlIIlI[v.lllIIlllII[459]] = "How can Old Man Ral help me?";
        v.lllIIlIIlI[v.lllIIlllII[460]] = "Someone said you could help me.";
        v.lllIIlIIlI[v.lllIIlllII[461]] = "Old Man Ral, the sage of Sanguinesti.";
        v.lllIIlIIlI[v.lllIIlllII[462]] = "Talk to the king about Morytania.";
        v.lllIIlIIlI[v.lllIIlllII[463]] = "What should I do now?";
        v.lllIIlIIlI[v.lllIIlllII[464]] = "Yes thanks. I'll accept the free teleport.";
        v.lllIIlIIlI[v.lllIIlllII[465]] = "Okay, lead the way.";
        v.lllIIlIIlI[v.lllIIlllII[466]] = "Fine, here's the money.";
        v.lllIIlIIlI[v.lllIIlllII[467]] = "Fine. Here's the money.";
        v.lllIIlIIlI[v.lllIIlllII[468]] = "I do.";
        v.lllIIlIIlI[v.lllIIlllII[469]] = "Anything to report?";
        v.lllIIlIIlI[v.lllIIlllII[470]] = "Why?";
        v.lllIIlIIlI[v.lllIIlllII[471]] = "Here you go.";
        v.lllIIlIIlI[v.lllIIlllII[472]] = "I need the Rod of Ivandis.";
        v.lllIIlIIlI[v.lllIIlllII[473]] = "No thank you.";
        v.lllIIlIIlI[v.lllIIlllII[474]] = "I'm ready.";
        v.lllIIlIIlI[v.lllIIlllII[475]] = "A Taste of Hope";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean ah() {
        int n2;
        if (v.llIIIIlIlIlII(Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[233])) {
            String[] stringArray = new String[lllIIlllII[0]];
            stringArray[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[433]];
            if (v.llIIIIlIlIIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                n2 = lllIIlllII[0];

                if ((0xC4 ^ 0x86 ^ (0x4D ^ 0xB)) != 0) return n2 != 0;
                return ((0x79 ^ 0x5F ^ (0x51 ^ 0x64)) & (0x3D ^ 0x57 ^ (0x57 ^ 0x2E) ^ -1)) != 0;
            }
        }
        n2 = lllIIlllII[1];
        return n2 != 0;
    }

    private static int llIIIIlIlIIII(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 > d3 ? 1 : -1);
    }

    private static boolean llIIIIlIlllIl(int n2) {
        return n2 >= 0;
    }

    @Override
    public int af() {
        try {
            v.aZ();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if (((133 + 141 - 124 + 16 ^ 34 + 81 - 24 + 82) & (0xD0 ^ 0x81 ^ (0x62 ^ 0x38) ^ -1)) > 0) {
            return (0x83 ^ 0xB8 ^ (0x51 ^ 0x74)) & (0xE3 ^ 0x8C ^ (0xDC ^ 0xAD) ^ -1);
        }
        return lllIIlllII[160];
    }

    @Override
    public String ag() {
        return h;
    }

    private static boolean llIIIIlIlIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static  boolean b(NPC nPC, TileObject tileObject) {
        int n2;
        if (v.llIIIIlIllIIl(tileObject.getId(), lllIIlllII[436]) && v.llIIIIlIlIlll(tileObject.getWorldLocation().distanceTo(nPC.getWorldLocation()), lllIIlllII[9])) {
            n2 = lllIIlllII[0];

            if (3 <= 1) {
                return false;
            }
        } else {
            n2 = lllIIlllII[1];
        }
        return n2 != 0;
    }

    public static void aZ() {
        block290: {
            WorldArea var15;
            WorldArea var16;
            Object var17;
            Object var18;
            WorldArea var19;
            block291: {
                block297: {
                    block296: {
                        block295: {
                            block294: {
                                block293: {
                                    block292: {
                                        if (v.llIIIIlIlIIIl(bt ? 1 : 0)) {
                                            b.a(bv);
                                            if (v.llIIIIlIlIIlI(bv.size(), lllIIlllII[0])) {
                                                System.out.println(lllIIlIIlI[lllIIlllII[1]]);
                                                bt = lllIIlllII[1];
                                            }
                                        }
                                        if (!v.llIIIIlIlIIll(bt ? 1 : 0)) break block290;
                                        if (v.llIIIIlIlIIlI(Skills.getLevel((Skill)Skill.CRAFTING), lllIIlllII[2])) {
                                            ay.fi();
                                        }
                                        if (v.llIIIIlIlIlII(Skills.getLevel((Skill)Skill.CRAFTING), lllIIlllII[2]) && v.llIIIIlIlIIlI(Skills.getLevel((Skill)Skill.AGILITY), lllIIlllII[3])) {
                                            av.eA();
                                        }
                                        if (v.llIIIIlIlIlII(Skills.getLevel((Skill)Skill.CRAFTING), lllIIlllII[2]) && v.llIIIIlIlIlII(Skills.getLevel((Skill)Skill.AGILITY), lllIIlllII[3]) && v.llIIIIlIlIIlI(Skills.getLevel((Skill)Skill.HERBLORE), lllIIlllII[4])) {
                                            aB.fL();
                                        }
                                        if (v.llIIIIlIlIlII(Skills.getLevel((Skill)Skill.CRAFTING), lllIIlllII[2]) && v.llIIIIlIlIlII(Skills.getLevel((Skill)Skill.AGILITY), lllIIlllII[3]) && v.llIIIIlIlIlII(Skills.getLevel((Skill)Skill.HERBLORE), lllIIlllII[4]) && v.llIIIIlIlIIlI(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), lllIIlllII[5])) {
                                            String[] stringArray = new String[lllIIlllII[0]];
                                            stringArray[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[0]];
                                            if (v.llIIIIlIlIIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                String[] stringArray2 = new String[lllIIlllII[0]];
                                                stringArray2[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[6]];
                                                if (v.llIIIIlIlIIll(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                                                    String[] stringArray3 = new String[lllIIlllII[0]];
                                                    stringArray3[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[7]];
                                                    if (v.llIIIIlIlIIll(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                                                        y.bl();
                                                    }
                                                }
                                            }
                                        }
                                        if (v.llIIIIlIlIlII(Skills.getLevel((Skill)Skill.CRAFTING), lllIIlllII[2]) && v.llIIIIlIlIlII(Skills.getLevel((Skill)Skill.AGILITY), lllIIlllII[3]) && v.llIIIIlIlIlII(Skills.getLevel((Skill)Skill.HERBLORE), lllIIlllII[4]) && v.llIIIIlIlIlII(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), lllIIlllII[5])) {
                                            String[] stringArray = new String[lllIIlllII[0]];
                                            stringArray[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[8]];
                                            if (v.llIIIIlIlIIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                String[] stringArray4 = new String[lllIIlllII[0]];
                                                stringArray4[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[9]];
                                                if (v.llIIIIlIlIIll(Inventory.contains((String[])stringArray4) ? 1 : 0)) {
                                                    String[] stringArray5 = new String[lllIIlllII[0]];
                                                    stringArray5[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[10]];
                                                    if (v.llIIIIlIlIIll(Inventory.contains((String[])stringArray5) ? 1 : 0) && v.llIIIIlIlIIlI(Skills.getLevel((Skill)Skill.SLAYER), lllIIlllII[11])) {
                                                        aL.gb();
                                                    }
                                                }
                                            }
                                        }
                                        if (!v.llIIIIlIlIIll(v.an() ? 1 : 0) || !v.llIIIIlIlIIll(Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId())) || !v.llIIIIlIlIlII(Skills.getLevel((Skill)Skill.SLAYER), lllIIlllII[11]) || !v.llIIIIlIlIlII(Skills.getLevel((Skill)Skill.CRAFTING), lllIIlllII[2]) || !v.llIIIIlIlIlII(Skills.getLevel((Skill)Skill.AGILITY), lllIIlllII[3]) || !v.llIIIIlIlIlII(Skills.getLevel((Skill)Skill.HERBLORE), lllIIlllII[4]) || !v.llIIIIlIlIlII(Vars.getBit((int)QuestVarbits.QUEST_DARKNESS_OF_HALLOWVALE.getId()), lllIIlllII[5])) break block291;
                                        String[] stringArray = new String[lllIIlllII[0]];
                                        stringArray[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[12]];
                                        if (!v.llIIIIlIlIIll(Inventory.contains((String[])stringArray) ? 1 : 0)) break block291;
                                        String[] stringArray6 = new String[lllIIlllII[0]];
                                        stringArray6[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[13]];
                                        if (!v.llIIIIlIlIIll(Inventory.contains((String[])stringArray6) ? 1 : 0)) break block291;
                                        String[] stringArray7 = new String[lllIIlllII[0]];
                                        stringArray7[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[14]];
                                        if (!v.llIIIIlIlIIll(Inventory.contains((String[])stringArray7) ? 1 : 0)) break block291;
                                        var19 = BankLocation.getNearest();
                                        if (v.llIIIIlIlIlIl(var19) && v.llIIIIlIlIIll(var19.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                            AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[15]];
                                            a.a((BankLocation)var19);
                                        }
                                        if (!v.llIIIIlIlIlIl(var19) || !v.llIIIIlIlIIIl(var19.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block291;
                                        if (v.llIIIIlIlIIll(Bank.isOpen() ? 1 : 0)) {
                                            a.a();
                                            Time.sleepUntil(() -> Bank.isOpen(), (int)lllIIlllII[16]);

                                        }
                                        if (!v.llIIIIlIlIIIl(Bank.isOpen() ? 1 : 0)) break block291;
                                        AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[17]];
                                        if (v.llIIIIlIlIllI(Inventory.getAll().size())) {
                                            Bank.depositInventory();
                                            Time.sleepTicks((int)lllIIlllII[8]);

                                        }
                                        if (v.llIIIIlIlIllI(Equipment.getAll().size())) {
                                            Bank.depositEquipment();
                                            Time.sleepTicks((int)lllIIlllII[6]);

                                        }
                                        int[] nArray = new int[lllIIlllII[0]];
                                        nArray[v.lllIIlllII[1]] = lllIIlllII[18];
                                        if (!v.llIIIIlIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block292;
                                        int[] nArray2 = new int[lllIIlllII[0]];
                                        nArray2[v.lllIIlllII[1]] = lllIIlllII[18];
                                        if (!v.llIIIIlIlIlII(Bank.getFirst((int[])nArray2).getQuantity(), lllIIlllII[15])) break block293;
                                    }
                                    int[] nArray = new int[lllIIlllII[0]];
                                    nArray[v.lllIIlllII[1]] = lllIIlllII[19];
                                    if (!v.llIIIIlIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block294;
                                    int[] nArray3 = new int[lllIIlllII[0]];
                                    nArray3[v.lllIIlllII[1]] = lllIIlllII[19];
                                    if (!v.llIIIIlIlIIlI(Bank.getFirst((int[])nArray3).getQuantity(), lllIIlllII[15])) break block294;
                                }
                                v.Q();
                                System.out.println(lllIIlIIlI[lllIIlllII[20]]);
                                bt = lllIIlllII[0];
                                return;
                            }
                            int[] nArray = new int[lllIIlllII[0]];
                            nArray[v.lllIIlllII[1]] = lllIIlllII[21];
                            if (!v.llIIIIlIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block295;
                            int[] nArray4 = new int[lllIIlllII[0]];
                            nArray4[v.lllIIlllII[1]] = lllIIlllII[21];
                            if (!v.llIIIIlIlIlII(Bank.getFirst((int[])nArray4).getQuantity(), lllIIlllII[22])) break block296;
                        }
                        int[] nArray = new int[lllIIlllII[0]];
                        nArray[v.lllIIlllII[1]] = lllIIlllII[23];
                        if (!v.llIIIIlIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block297;
                        int[] nArray5 = new int[lllIIlllII[0]];
                        nArray5[v.lllIIlllII[1]] = lllIIlllII[23];
                        if (!v.llIIIIlIlIIlI(Bank.getFirst((int[])nArray5).getQuantity(), lllIIlllII[22])) break block297;
                    }
                    v.Q();
                    System.out.println(lllIIlIIlI[lllIIlllII[24]]);
                    bt = lllIIlllII[0];
                    return;
                }
                int[] nArray = new int[lllIIlllII[0]];
                nArray[v.lllIIlllII[1]] = lllIIlllII[25];
                if (v.llIIIIlIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray6 = new int[lllIIlllII[0]];
                    nArray6[v.lllIIlllII[1]] = lllIIlllII[25];
                    if (v.llIIIIlIlIIlI(Bank.getFirst((int[])nArray6).getQuantity(), lllIIlllII[26])) {
                        v.Q();
                        System.out.println(lllIIlIIlI[lllIIlllII[27]]);
                        bt = lllIIlllII[0];
                        return;
                    }
                }
                int[] nArray7 = new int[lllIIlllII[0]];
                nArray7[v.lllIIlllII[1]] = lllIIlllII[19];
                if (v.llIIIIlIlIIIl(Bank.contains((int[])nArray7) ? 1 : 0)) {
                    int[] nArray8 = new int[lllIIlllII[0]];
                    nArray8[v.lllIIlllII[1]] = lllIIlllII[19];
                    if (v.llIIIIlIlIIlI(Bank.getFirst((int[])nArray8).getQuantity(), lllIIlllII[15])) {
                        v.Q();
                        System.out.println(lllIIlIIlI[lllIIlllII[28]]);
                        bt = lllIIlllII[0];
                        return;
                    }
                }
                int[] nArray9 = new int[lllIIlllII[29]];
                nArray9[v.lllIIlllII[1]] = lllIIlllII[30];
                nArray9[v.lllIIlllII[0]] = lllIIlllII[31];
                nArray9[v.lllIIlllII[6]] = lllIIlllII[32];
                nArray9[v.lllIIlllII[7]] = lllIIlllII[33];
                nArray9[v.lllIIlllII[8]] = lllIIlllII[34];
                nArray9[v.lllIIlllII[9]] = lllIIlllII[35];
                nArray9[v.lllIIlllII[10]] = lllIIlllII[36];
                nArray9[v.lllIIlllII[12]] = lllIIlllII[21];
                nArray9[v.lllIIlllII[13]] = lllIIlllII[37];
                nArray9[v.lllIIlllII[14]] = lllIIlllII[23];
                nArray9[v.lllIIlllII[15]] = lllIIlllII[38];
                nArray9[v.lllIIlllII[17]] = lllIIlllII[39];
                nArray9[v.lllIIlllII[20]] = lllIIlllII[40];
                nArray9[v.lllIIlllII[24]] = lllIIlllII[41];
                nArray9[v.lllIIlllII[27]] = lllIIlllII[42];
                nArray9[v.lllIIlllII[28]] = lllIIlllII[43];
                nArray9[v.lllIIlllII[44]] = lllIIlllII[45];
                nArray9[v.lllIIlllII[46]] = lllIIlllII[47];
                nArray9[v.lllIIlllII[48]] = lllIIlllII[49];
                nArray9[v.lllIIlllII[50]] = lllIIlllII[18];
                if (v.llIIIIlIlIIll(e.c(nArray9) ? 1 : 0)) {
                    v.Q();
                    System.out.println(lllIIlIIlI[lllIIlllII[44]]);
                    bt = lllIIlllII[0];
                    return;
                }
                int[] nArray10 = new int[lllIIlllII[20]];
                nArray10[v.lllIIlllII[1]] = lllIIlllII[30];
                nArray10[v.lllIIlllII[0]] = lllIIlllII[31];
                nArray10[v.lllIIlllII[6]] = lllIIlllII[32];
                nArray10[v.lllIIlllII[7]] = lllIIlllII[33];
                nArray10[v.lllIIlllII[8]] = lllIIlllII[34];
                nArray10[v.lllIIlllII[9]] = lllIIlllII[35];
                nArray10[v.lllIIlllII[10]] = lllIIlllII[36];
                nArray10[v.lllIIlllII[12]] = lllIIlllII[21];
                nArray10[v.lllIIlllII[13]] = lllIIlllII[37];
                nArray10[v.lllIIlllII[14]] = lllIIlllII[38];
                nArray10[v.lllIIlllII[15]] = lllIIlllII[39];
                nArray10[v.lllIIlllII[17]] = lllIIlllII[18];
                if (v.llIIIIlIlIIIl(e.c(nArray10) ? 1 : 0)) {
                    a.a(lllIIlllII[51], lllIIlllII[8]);
                    a.a(lllIIlllII[30], lllIIlllII[15]);
                    a.a(lllIIlllII[31], lllIIlllII[15]);
                    a.a(lllIIlllII[32], lllIIlllII[16]);
                    a.a(lllIIlllII[33], lllIIlllII[0]);
                    a.a(lllIIlllII[34], lllIIlllII[0]);
                    a.a(lllIIlllII[35], lllIIlllII[0]);
                    a.a(lllIIlllII[36], lllIIlllII[0]);
                    a.a(lllIIlllII[21], lllIIlllII[7]);
                    a.a(lllIIlllII[38], lllIIlllII[0]);
                    a.a(lllIIlllII[37], lllIIlllII[0]);
                    a.a(lllIIlllII[39], lllIIlllII[6]);
                    a.a(lllIIlllII[52], lllIIlllII[0]);
                    a.a(lllIIlllII[53], lllIIlllII[0]);
                    a.a(lllIIlllII[19], lllIIlllII[0]);
                    int[] nArray11 = new int[lllIIlllII[0]];
                    nArray11[v.lllIIlllII[1]] = lllIIlllII[49];
                    if (v.llIIIIlIlIIIl(Bank.contains((int[])nArray11) ? 1 : 0)) {
                        a.a(lllIIlllII[49], lllIIlllII[0]);
                    }
                    int[] nArray12 = new int[lllIIlllII[0]];
                    nArray12[v.lllIIlllII[1]] = lllIIlllII[54];
                    if (v.llIIIIlIlIIIl(Bank.contains((int[])nArray12) ? 1 : 0)) {
                        a.a(lllIIlllII[54], lllIIlllII[0]);
                    }
                }
            }
            if (v.llIIIIlIlIIIl(Inventory.contains((int[])f.ba) ? 1 : 0) && v.llIIIIlIlIIlI(Movement.getRunEnergy(), lllIIlllII[55])) {
                Inventory.getFirst((int[])f.ba).interact(lllIIlIIlI[lllIIlllII[46]]);
                Time.sleepTicks((int)lllIIlllII[0]);

            }
            String[] stringArray = new String[lllIIlllII[0]];
            stringArray[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[48]];
            if (!v.llIIIIlIlIIIl(Inventory.contains((String[])stringArray) ? 1 : 0) || v.llIIIIlIlIIll(Dialog.isOpen() ? 1 : 0)) {
                // empty if block
            }
            if (v.llIIIIlIlIIIl(v.an() ? 1 : 0) && v.llIIIIlIlIIlI(Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[15])) {
                if (v.llIIIIlIlIIll(do.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[50]];
                    if (v.llIIIIlIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    int[] nArray = new int[lllIIlllII[0]];
                    nArray[v.lllIIlllII[1]] = lllIIlllII[52];
                    if (v.llIIIIlIlIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray13 = new int[lllIIlllII[0]];
                        nArray13[v.lllIIlllII[1]] = lllIIlllII[52];
                        Inventory.getFirst((int[])nArray13).interact(lllIIlIIlI[lllIIlllII[29]]);
                    }
                    int[] nArray14 = new int[lllIIlllII[0]];
                    nArray14[v.lllIIlllII[1]] = lllIIlllII[53];
                    if (v.llIIIIlIlIIIl(Inventory.contains((int[])nArray14) ? 1 : 0)) {
                        int[] nArray15 = new int[lllIIlllII[0]];
                        nArray15[v.lllIIlllII[1]] = lllIIlllII[53];
                        Inventory.getFirst((int[])nArray15).interact(lllIIlIIlI[lllIIlllII[56]]);
                    }
                    int[] nArray16 = new int[lllIIlllII[0]];
                    nArray16[v.lllIIlllII[1]] = lllIIlllII[49];
                    if (v.llIIIIlIlIIIl(Inventory.contains((int[])nArray16) ? 1 : 0)) {
                        int[] nArray17 = new int[lllIIlllII[0]];
                        nArray17[v.lllIIlllII[1]] = lllIIlllII[49];
                        Inventory.getFirst((int[])nArray17).interact(lllIIlIIlI[lllIIlllII[57]]);
                    }
                    int[] nArray18 = new int[lllIIlllII[0]];
                    nArray18[v.lllIIlllII[1]] = lllIIlllII[54];
                    if (v.llIIIIlIlIIIl(Inventory.contains((int[])nArray18) ? 1 : 0)) {
                        int[] nArray19 = new int[lllIIlllII[0]];
                        nArray19[v.lllIIlllII[1]] = lllIIlllII[54];
                        Inventory.getFirst((int[])nArray19).interact(lllIIlIIlI[lllIIlllII[58]]);
                    }
                    y.bp();
                }
                if (v.llIIIIlIlIIIl(do.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (v.llIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(de), lllIIlllII[9])) {
                        AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[59]];
                        Movement.walkTo((WorldPoint)de);

                        Time.sleepTicks((int)lllIIlllII[0]);

                    }
                    if (v.llIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(de), lllIIlllII[9])) {
                        g.a(lllIIlIIlI[lllIIlllII[60]], cE);
                    }
                }
                g.a(y.cE);
            }
            if (v.llIIIIlIlIIIl(v.an() ? 1 : 0) && v.llIIIIlIllIIl(Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[28])) {
                var19 = new WorldArea(lllIIlllII[61], lllIIlllII[62], lllIIlllII[63], lllIIlllII[64], lllIIlllII[1]);
                var18 = new WorldArea(lllIIlllII[65], lllIIlllII[66], lllIIlllII[50], lllIIlllII[13], lllIIlllII[1]);
                var17 = new WorldArea(lllIIlllII[67], lllIIlllII[68], lllIIlllII[29], lllIIlllII[69], lllIIlllII[1]);
                if (v.llIIIIlIlIIll(var17.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && v.llIIIIlIlIIll(var18.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && v.llIIIIlIlIIIl(var19.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[70]];
                    Movement.walkTo((WorldPoint)y.dP);

                    Time.sleepTicks((int)lllIIlllII[0]);

                }
                y.bq();
                if (v.llIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(y.dQ), lllIIlllII[4])) {
                    if (v.llIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(y.dQ), lllIIlllII[12])) {
                        AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[71]];
                        Movement.walkTo((WorldPoint)y.dQ);

                        Time.sleepTicks((int)lllIIlllII[0]);

                    }
                    if (v.llIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(y.dQ), lllIIlllII[12])) {
                        AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[72]];
                        g.a(lllIIlIIlI[lllIIlllII[73]], cE);
                    }
                }
            }
            if (v.llIIIIlIllIIl(Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[29])) {
                if (v.llIIIIlIlIIll(do.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    di = lllIIlllII[1];
                    AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[64]];
                    if (v.llIIIIlIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    y.bp();
                }
                if (v.llIIIIlIlIIIl(do.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (v.llIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(dl), lllIIlllII[9]) && v.llIIIIlIlIIll(dp.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && v.llIIIIlIlIIll(dq.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && v.llIIIIlIlIIll(Dialog.isOpen() ? 1 : 0)) {
                        AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[74]];
                        Movement.walkTo((WorldPoint)dl);

                        Time.sleepTicks((int)lllIIlllII[0]);

                    }
                    if (v.llIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(dl), lllIIlllII[14])) {
                        String[] stringArray8 = new String[lllIIlllII[0]];
                        stringArray8[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[75]];
                        TileObjects.getNearest((String[])stringArray8).interact(lllIIlIIlI[lllIIlllII[76]]);
                        Time.sleepTicks((int)lllIIlllII[10]);

                    }
                }
                g.a(y.cE);
            }
            if (!v.llIIIIlIllIlI(Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[64]) || v.llIIIIlIllIIl(Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[77])) {
                String[] stringArray9 = new String[lllIIlllII[0]];
                stringArray9[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[69]];
                if (v.llIIIIlIlIIll(Inventory.contains((String[])stringArray9) ? 1 : 0)) {
                    if (v.llIIIIlIlIIll(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                    }
                    if (v.llIIIIlIlIIIl(Bank.isOpen() ? 1 : 0)) {
                        Bank.withdraw((int)lllIIlllII[25], (int)lllIIlllII[12], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                    }
                }
                String[] stringArray10 = new String[lllIIlllII[0]];
                stringArray10[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[77]];
                if (v.llIIIIlIlIIIl(Inventory.contains((String[])stringArray10) ? 1 : 0)) {
                    if (v.llIIIIlIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    g.a(lllIIlIIlI[lllIIlllII[78]], cE);
                }
                g.a(cE);
            }
            if (v.llIIIIlIllIIl(Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[4])) {
                TileObject var20;
                if (v.llIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(dl), lllIIlllII[14])) {
                    AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[79]];
                    String[] stringArray11 = new String[lllIIlllII[0]];
                    stringArray11[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[11]];
                    TileObjects.getNearest((String[])stringArray11).interact(lllIIlIIlI[lllIIlllII[80]]);
                    Time.sleepTicks((int)lllIIlllII[10]);

                }
                var19 = new WorldArea(lllIIlllII[81], lllIIlllII[82], lllIIlllII[24], lllIIlllII[28], lllIIlllII[0]);
                var18 = new WorldArea(lllIIlllII[83], lllIIlllII[84], lllIIlllII[20], lllIIlllII[46], lllIIlllII[6]);
                var17 = new WorldArea(lllIIlllII[81], lllIIlllII[85], lllIIlllII[20], lllIIlllII[24], lllIIlllII[0]);
                var16 = new WorldArea(lllIIlllII[86], lllIIlllII[87], lllIIlllII[59], lllIIlllII[15], lllIIlllII[6]);
                var15 = new WorldArea(lllIIlllII[88], lllIIlllII[89], lllIIlllII[73], lllIIlllII[57], lllIIlllII[6]);
                WorldPoint var21 = new WorldPoint(lllIIlllII[90], lllIIlllII[91], lllIIlllII[6]);
                WorldPoint var22 = new WorldPoint(lllIIlllII[92], lllIIlllII[93], lllIIlllII[0]);
                WorldPoint var23 = new WorldPoint(lllIIlllII[94], lllIIlllII[95], lllIIlllII[0]);
                WorldPoint var24 = new WorldPoint(lllIIlllII[96], lllIIlllII[85], lllIIlllII[6]);
                if (v.llIIIIlIlIIIl(var19.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (v.llIIIIlIlIIll(Players.getLocal().getWorldLocation().equals((Object)var22) ? 1 : 0)) {
                        AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[4]];
                        Movement.walkTo((WorldPoint)var22);

                        Time.sleepTicks((int)lllIIlllII[0]);

                    }
                    if (v.llIIIIlIlIIIl(Players.getLocal().getWorldLocation().equals((Object)var22) ? 1 : 0) && v.llIIIIlIlIIll(AccBuilderSotf.i.containsKey(var20 = new WorldPoint(lllIIlllII[96], lllIIlllII[93], lllIIlllII[0])) ? 1 : 0)) {
                        AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[97]];
                        String[] stringArray12 = new String[lllIIlllII[0]];
                        stringArray12[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[98]];
                        TileObjects.getNearest((String[])stringArray12).interact(lllIIlIIlI[lllIIlllII[99]]);
                        Time.sleepTicks((int)lllIIlllII[8]);

                    }
                }
                if (v.llIIIIlIlIIIl(var18.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (v.llIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(var24), lllIIlllII[6])) {
                        AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[100]];
                        Movement.walkTo((WorldPoint)var24);

                        Time.sleepTicks((int)lllIIlllII[0]);

                    }
                    if (v.llIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(var24), lllIIlllII[6])) {
                        String[] stringArray13 = new String[lllIIlllII[0]];
                        stringArray13[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[3]];
                        TileObjects.getNearest((String[])stringArray13).interact(lllIIlIIlI[lllIIlllII[101]]);
                        Time.sleepUntil(() -> {
                            boolean bl;
                            if (v.llIIIIlIllIlI(Players.getLocal().getWorldLocation().getPlane(), lllIIlllII[6])) {
                                bl = lllIIlllII[0];

                                if (3 < 2) {
                                    return false;
                                }
                            } else {
                                bl = lllIIlllII[1];
                            }
                            return bl;
                        }, (int)lllIIlllII[102]);

                    }
                }
                if (v.llIIIIlIlIIIl(var17.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (v.llIIIIlIlIIll(Players.getLocal().getWorldLocation().equals((Object)var23) ? 1 : 0)) {
                        AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[103]];
                        Movement.walkTo((WorldPoint)var23);

                        Time.sleepTicks((int)lllIIlllII[0]);

                    }
                    if (v.llIIIIlIlIIIl(Players.getLocal().getWorldLocation().equals((Object)var23) ? 1 : 0) && v.llIIIIlIlIIll(AccBuilderSotf.i.containsKey(var20 = new WorldPoint(lllIIlllII[94], lllIIlllII[104], lllIIlllII[0])) ? 1 : 0)) {
                        AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[2]];
                        String[] stringArray14 = new String[lllIIlllII[0]];
                        stringArray14[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[105]];
                        TileObjects.getNearest((String[])stringArray14).interact(lllIIlIIlI[lllIIlllII[55]]);
                        Time.sleepTicks((int)lllIIlllII[8]);

                    }
                }
                if (v.llIIIIlIlIIIl(var16.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && v.llIIIIlIlIlIl(var20 = TileObjects.getNearest(tileObject -> {
                    int n2;
                    if (v.llIIIIlIlIIIl(tileObject.getName().equalsIgnoreCase(lllIIlIIlI[lllIIlllII[441]]) ? 1 : 0)) {
                        String[] stringArray = new String[lllIIlllII[0]];
                        stringArray[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[442]];
                        if (v.llIIIIlIlIIIl(tileObject.hasAction(stringArray) ? 1 : 0)) {
                            n2 = lllIIlllII[0];

                            if (-1 < 3) return n2 != 0;
                            return false;
                        }
                    }
                    n2 = lllIIlllII[1];
                    return n2 != 0;
                })) && v.llIIIIlIlIIll(Players.getLocal().isAnimating() ? 1 : 0) && v.llIIIIlIlIIll(Players.getLocal().isMoving() ? 1 : 0)) {
                    var20.interact(lllIIlIIlI[lllIIlllII[22]]);
                    Time.sleepTicks((int)lllIIlllII[6]);

                }
                if (v.llIIIIlIlIIIl((var20 = new WorldArea(lllIIlllII[106], lllIIlllII[107], lllIIlllII[58], lllIIlllII[48], lllIIlllII[7])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] stringArray15 = new String[lllIIlllII[0]];
                    stringArray15[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[108]];
                    List var25 = TileObjects.getAll((String[])stringArray15).stream().filter(tileObject -> {
                        boolean bl;
                        if (v.llIIIIlIlIlll(tileObject.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lllIIlllII[6])) {
                            bl = lllIIlllII[0];

                            if ((0xE6 ^ 0x92 ^ (0x3F ^ 0x4F)) != (0x21 ^ 0x6C ^ (3 ^ 0x4A))) {
                                return ((81 + 123 - 134 + 92 ^ 72 + 81 - 38 + 66) & (0x37 ^ 0x59 ^ (0x41 ^ 0x38) ^ -1)) != 0;
                            }
                        } else {
                            bl = lllIIlllII[1];
                        }
                        return bl;
                    }).collect(Collectors.toList());
                    if (v.llIIIIlIlIIll(var25.isEmpty() ? 1 : 0)) {
                        ((TileObject)var25.get(lllIIlllII[1])).interact(lllIIlIIlI[lllIIlllII[109]]);
                        Time.sleepTicks((int)lllIIlllII[9]);

                    }
                }
                if (v.llIIIIlIlIIIl(var15.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (v.llIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(var21), lllIIlllII[8])) {
                        AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[110]];
                        Movement.walkTo((WorldPoint)var21);

                        Time.sleepTicks((int)lllIIlllII[0]);

                    }
                    if (v.llIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(var21), lllIIlllII[8]) && v.llIIIIlIlIIll(Dialog.isOpen() ? 1 : 0)) {
                        String[] stringArray16 = new String[lllIIlllII[0]];
                        stringArray16[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[111]];
                        TileObjects.getNearest((String[])stringArray16).interact(lllIIlIIlI[lllIIlllII[112]]);
                        Time.sleepTicks((int)lllIIlllII[7]);

                    }
                }
                if (v.llIIIIlIlIIlI(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), Skills.getLevel((Skill)Skill.HITPOINTS) - lllIIlllII[29])) {
                    String[] stringArray17 = new String[lllIIlllII[0]];
                    stringArray17[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[113]];
                    Inventory.getFirst((String[])stringArray17).interact(lllIIlIIlI[lllIIlllII[114]]);
                    Time.sleepTicks((int)lllIIlllII[0]);

                }
                g.a(cE);
            }
            if (v.llIIIIlIllIIl(Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[3])) {
                var19 = new WorldArea(lllIIlllII[88], lllIIlllII[89], lllIIlllII[73], lllIIlllII[57], lllIIlllII[6]);
                if (v.llIIIIlIlIIIl(var19.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && v.llIIIIlIlIIll(Dialog.isOpen() ? 1 : 0)) {
                    int[] nArray = new int[lllIIlllII[0]];
                    nArray[v.lllIIlllII[1]] = lllIIlllII[31];
                    Inventory.getFirst((int[])nArray).interact(lllIIlIIlI[lllIIlllII[115]]);
                    Time.sleepTicks((int)lllIIlllII[10]);

                }
                int[] nArray = new int[lllIIlllII[0]];
                nArray[v.lllIIlllII[1]] = lllIIlllII[18];
                if (v.llIIIIlIlIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    if (v.llIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(D.fa), lllIIlllII[13])) {
                        AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[116]];
                        Movement.walkTo((WorldPoint)D.fa);

                        Time.sleepTicks((int)lllIIlllII[0]);

                    }
                    if (v.llIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(D.fa), lllIIlllII[13])) {
                        if (v.llIIIIlIlIIll(Bank.isOpen() ? 1 : 0)) {
                            int[] nArray20 = new int[lllIIlllII[0]];
                            nArray20[v.lllIIlllII[1]] = lllIIlllII[117];
                            if (v.llIIIIlIlIlIl(TileObjects.getNearest((int[])nArray20)) && v.llIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(D.fa), lllIIlllII[15])) {
                                int[] nArray21 = new int[lllIIlllII[0]];
                                nArray21[v.lllIIlllII[1]] = lllIIlllII[117];
                                TileObjects.getNearest((int[])nArray21).interact(lllIIlIIlI[lllIIlllII[118]]);
                                Time.sleepTicks((int)lllIIlllII[6]);

                            }
                        }
                        if (v.llIIIIlIlIIIl(Bank.isOpen() ? 1 : 0)) {
                            int[] nArray22 = new int[lllIIlllII[0]];
                            nArray22[v.lllIIlllII[1]] = lllIIlllII[32];
                            Bank.depositAll((int[])nArray22);
                            int[] nArray23 = new int[lllIIlllII[0]];
                            nArray23[v.lllIIlllII[1]] = lllIIlllII[34];
                            Bank.depositAll((int[])nArray23);
                            int[] nArray24 = new int[lllIIlllII[0]];
                            nArray24[v.lllIIlllII[1]] = lllIIlllII[33];
                            Bank.depositAll((int[])nArray24);
                            int[] nArray25 = new int[lllIIlllII[0]];
                            nArray25[v.lllIIlllII[1]] = lllIIlllII[21];
                            Bank.depositAll((int[])nArray25);
                            int[] nArray26 = new int[lllIIlllII[0]];
                            nArray26[v.lllIIlllII[1]] = lllIIlllII[37];
                            Bank.depositAll((int[])nArray26);
                            int[] nArray27 = new int[lllIIlllII[0]];
                            nArray27[v.lllIIlllII[1]] = lllIIlllII[19];
                            if (v.llIIIIlIlIIll(Inventory.contains((int[])nArray27) ? 1 : 0)) {
                                a.a(lllIIlllII[19], lllIIlllII[0]);
                            }
                            int[] nArray28 = new int[lllIIlllII[0]];
                            nArray28[v.lllIIlllII[1]] = lllIIlllII[18];
                            if (v.llIIIIlIlIIll(Inventory.contains((int[])nArray28) ? 1 : 0)) {
                                a.a(lllIIlllII[18], lllIIlllII[6]);
                            }
                            a.a(lllIIlllII[25], Inventory.getFreeSlots() - lllIIlllII[8]);
                        }
                    }
                }
                int[] nArray29 = new int[lllIIlllII[0]];
                nArray29[v.lllIIlllII[1]] = lllIIlllII[18];
                if (v.llIIIIlIlIIIl(Inventory.contains((int[])nArray29) ? 1 : 0)) {
                    var18 = new WorldArea(lllIIlllII[67], lllIIlllII[119], lllIIlllII[111], lllIIlllII[120], lllIIlllII[1]);
                    var17 = new WorldArea(lllIIlllII[67], lllIIlllII[119], lllIIlllII[111], lllIIlllII[120], lllIIlllII[0]);
                    var16 = new WorldArea(lllIIlllII[67], lllIIlllII[119], lllIIlllII[111], lllIIlllII[120], lllIIlllII[6]);
                    var15 = new WorldArea(lllIIlllII[67], lllIIlllII[119], lllIIlllII[111], lllIIlllII[120], lllIIlllII[7]);
                    if (v.llIIIIlIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    if (v.llIIIIlIlIIll(do.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && v.llIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(y.dQ), lllIIlllII[4]) && v.llIIIIlIlIIll(var18.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && v.llIIIIlIlIIll(var17.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && v.llIIIIlIlIIll(var16.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && v.llIIIIlIlIIll(var15.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[121]];
                        if (v.llIIIIlIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        y.bp();
                    }
                    y.bq();
                    if (v.llIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(y.dQ), lllIIlllII[4])) {
                        if (v.llIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(y.dQ), lllIIlllII[12])) {
                            AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[122]];
                            Movement.walkTo((WorldPoint)y.dQ);

                            Time.sleepTicks((int)lllIIlllII[0]);

                        }
                        if (v.llIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(y.dQ), lllIIlllII[12])) {
                            AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[123]];
                            g.a(lllIIlIIlI[lllIIlllII[124]], cE);
                        }
                    }
                }
                g.a(cE);
            }
            if (!v.llIIIIlIllIlI(Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[55]) || !v.llIIIIlIllIlI(Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[111]) || v.llIIIIlIllIIl(Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[116])) {
                g.a(lllIIlIIlI[lllIIlllII[125]], cE);
            }
            if (!v.llIIIIlIllIlI(Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[124]) || v.llIIIIlIllIIl(Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[126])) {
                g.a(lllIIlIIlI[lllIIlllII[127]], cE);
            }
            if (v.llIIIIlIllIIl(Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[63])) {
                v.bc();
            }
            if (v.llIIIIlIllIIl(Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[128])) {
                if (v.llIIIIlIlIIIl(Inventory.isFull() ? 1 : 0)) {
                    String[] stringArray18 = new String[lllIIlllII[0]];
                    stringArray18[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[129]];
                    Inventory.getFirst((String[])stringArray18).interact(lllIIlIIlI[lllIIlllII[130]]);
                    Time.sleepTicks((int)lllIIlllII[6]);

                }
                String[] stringArray19 = new String[lllIIlllII[0]];
                stringArray19[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[126]];
                if (v.llIIIIlIlIIll(Inventory.contains((String[])stringArray19) ? 1 : 0)) {
                    String[] stringArray20 = new String[lllIIlllII[0]];
                    stringArray20[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[131]];
                    if (v.llIIIIlIlIIll(Inventory.contains((String[])stringArray20) ? 1 : 0)) {
                        String[] stringArray21 = new String[lllIIlllII[0]];
                        stringArray21[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[132]];
                        if (v.llIIIIlIlIIll(Inventory.contains((String[])stringArray21) ? 1 : 0)) {
                            String[] stringArray22 = new String[lllIIlllII[0]];
                            stringArray22[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[133]];
                            if (v.llIIIIlIlIIll(Inventory.contains((String[])stringArray22) ? 1 : 0)) {
                                AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[134]];
                                int[] nArray = new int[lllIIlllII[0]];
                                nArray[v.lllIIlllII[1]] = lllIIlllII[135];
                                TileObjects.getNearest((int[])nArray).interact(lllIIlIIlI[lllIIlllII[63]]);
                                Time.sleepTicks((int)lllIIlllII[7]);

                            }
                        }
                        String[] stringArray23 = new String[lllIIlllII[0]];
                        stringArray23[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[136]];
                        if (v.llIIIIlIlIIIl(Inventory.contains((String[])stringArray23) ? 1 : 0)) {
                            String[] stringArray24 = new String[lllIIlllII[0]];
                            stringArray24[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[137]];
                            if (v.llIIIIlIlIIll(Inventory.contains((String[])stringArray24) ? 1 : 0)) {
                                AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[138]];
                                int[] nArray = new int[lllIIlllII[0]];
                                nArray[v.lllIIlllII[1]] = lllIIlllII[139];
                                TileObjects.getNearest((int[])nArray).interact(lllIIlIIlI[lllIIlllII[140]]);
                                Time.sleepTicks((int)lllIIlllII[7]);

                            }
                        }
                        String[] stringArray25 = new String[lllIIlllII[0]];
                        stringArray25[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[128]];
                        if (v.llIIIIlIlIIIl(Inventory.contains((String[])stringArray25) ? 1 : 0)) {
                            String[] stringArray26 = new String[lllIIlllII[0]];
                            stringArray26[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[141]];
                            if (v.llIIIIlIlIIll(Inventory.contains((String[])stringArray26) ? 1 : 0)) {
                                String[] stringArray27 = new String[lllIIlllII[0]];
                                stringArray27[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[142]];
                                if (v.llIIIIlIlIIIl(Inventory.contains((String[])stringArray27) ? 1 : 0)) {
                                    AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[143]];
                                    String[] stringArray28 = new String[lllIIlllII[0]];
                                    stringArray28[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[144]];
                                    String[] stringArray29 = new String[lllIIlllII[0]];
                                    stringArray29[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[145]];
                                    Inventory.getFirst((String[])stringArray28).useOn(Inventory.getFirst((String[])stringArray29));
                                    Time.sleepTicks((int)lllIIlllII[6]);

                                }
                            }
                        }
                    }
                }
                String[] stringArray30 = new String[lllIIlllII[0]];
                stringArray30[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[146]];
                if (v.llIIIIlIlIIIl(Inventory.contains((String[])stringArray30) ? 1 : 0)) {
                    String[] stringArray31 = new String[lllIIlllII[0]];
                    stringArray31[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[147]];
                    if (v.llIIIIlIlIIIl(Inventory.contains((String[])stringArray31) ? 1 : 0)) {
                        AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[148]];
                        String[] stringArray32 = new String[lllIIlllII[0]];
                        stringArray32[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[149]];
                        int[] nArray = new int[lllIIlllII[0]];
                        nArray[v.lllIIlllII[1]] = lllIIlllII[36];
                        Inventory.getFirst((String[])stringArray32).useOn(Inventory.getFirst((int[])nArray));
                        Time.sleepTicks((int)lllIIlllII[6]);

                    }
                }
                String[] stringArray33 = new String[lllIIlllII[0]];
                stringArray33[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[150]];
                if (v.llIIIIlIlIIIl(Inventory.contains((String[])stringArray33) ? 1 : 0)) {
                    String[] stringArray34 = new String[lllIIlllII[0]];
                    stringArray34[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[151]];
                    if (v.llIIIIlIlIIIl(Inventory.contains((String[])stringArray34) ? 1 : 0)) {
                        AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[152]];
                        String[] stringArray35 = new String[lllIIlllII[0]];
                        stringArray35[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[153]];
                        String[] stringArray36 = new String[lllIIlllII[0]];
                        stringArray36[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[154]];
                        Inventory.getFirst((String[])stringArray35).useOn(Inventory.getFirst((String[])stringArray36));
                        Time.sleepTicks((int)lllIIlllII[6]);

                    }
                }
                String[] stringArray37 = new String[lllIIlllII[0]];
                stringArray37[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[155]];
                if (v.llIIIIlIlIIIl(Inventory.contains((String[])stringArray37) ? 1 : 0)) {
                    AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[156]];
                    String[] stringArray38 = new String[lllIIlllII[0]];
                    stringArray38[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[157]];
                    String[] stringArray39 = new String[lllIIlllII[0]];
                    stringArray39[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[158]];
                    Inventory.getFirst((String[])stringArray38).useOn(TileObjects.getNearest((String[])stringArray39));
                    Time.sleepTicks((int)lllIIlllII[8]);

                }
                g.a(cE);
            }
            if (v.llIIIIlIllIIl(Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[141])) {
                g.a(cE);
            }
            if (v.llIIIIlIllIIl(Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[142])) {
                g.a(lllIIlIIlI[lllIIlllII[159]], cE);
            }
            if (v.llIIIIlIllIIl(Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[143])) {
                g.a(cE);
            }
            if (v.llIIIIlIllIIl(Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[144])) {
                String[] stringArray40 = new String[lllIIlllII[0]];
                stringArray40[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[160]];
                if (v.llIIIIlIlIIll(Inventory.contains((String[])stringArray40) ? 1 : 0)) {
                    String[] stringArray41 = new String[lllIIlllII[0]];
                    stringArray41[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[161]];
                    if (v.llIIIIlIlIIll(Inventory.contains((String[])stringArray41) ? 1 : 0)) {
                        AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[162]];
                        int[] nArray = new int[lllIIlllII[0]];
                        nArray[v.lllIIlllII[1]] = lllIIlllII[135];
                        TileObjects.getNearest((int[])nArray).interact(lllIIlIIlI[lllIIlllII[163]]);
                        Time.sleepTicks((int)lllIIlllII[7]);

                    }
                }
                String[] stringArray42 = new String[lllIIlllII[0]];
                stringArray42[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[164]];
                if (v.llIIIIlIlIIIl(Inventory.contains((String[])stringArray42) ? 1 : 0)) {
                    String[] stringArray43 = new String[lllIIlllII[0]];
                    stringArray43[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[165]];
                    if (v.llIIIIlIlIIll(Inventory.contains((String[])stringArray43) ? 1 : 0)) {
                        AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[166]];
                        int[] nArray = new int[lllIIlllII[0]];
                        nArray[v.lllIIlllII[1]] = lllIIlllII[139];
                        TileObjects.getNearest((int[])nArray).interact(lllIIlIIlI[lllIIlllII[167]]);
                        Time.sleepTicks((int)lllIIlllII[7]);

                    }
                }
                String[] stringArray44 = new String[lllIIlllII[0]];
                stringArray44[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[168]];
                if (v.llIIIIlIlIIIl(Inventory.contains((String[])stringArray44) ? 1 : 0)) {
                    String[] stringArray45 = new String[lllIIlllII[0]];
                    stringArray45[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[169]];
                    if (v.llIIIIlIlIIll(Inventory.contains((String[])stringArray45) ? 1 : 0)) {
                        String[] stringArray46 = new String[lllIIlllII[0]];
                        stringArray46[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[170]];
                        if (v.llIIIIlIlIIIl(Inventory.contains((String[])stringArray46) ? 1 : 0)) {
                            String[] stringArray47 = new String[lllIIlllII[0]];
                            stringArray47[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[171]];
                            String[] stringArray48 = new String[lllIIlllII[0]];
                            stringArray48[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[172]];
                            Inventory.getFirst((String[])stringArray47).useOn(Inventory.getFirst((String[])stringArray48));
                            Time.sleepTicks((int)lllIIlllII[6]);

                        }
                    }
                }
                String[] stringArray49 = new String[lllIIlllII[0]];
                stringArray49[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[173]];
                if (v.llIIIIlIlIIIl(Inventory.contains((String[])stringArray49) ? 1 : 0)) {
                    String[] stringArray50 = new String[lllIIlllII[0]];
                    stringArray50[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[174]];
                    if (v.llIIIIlIlIIIl(Inventory.contains((String[])stringArray50) ? 1 : 0)) {
                        String[] stringArray51 = new String[lllIIlllII[0]];
                        stringArray51[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[175]];
                        int[] nArray = new int[lllIIlllII[0]];
                        nArray[v.lllIIlllII[1]] = lllIIlllII[36];
                        Inventory.getFirst((String[])stringArray51).useOn(Inventory.getFirst((int[])nArray));
                        Time.sleepTicks((int)lllIIlllII[6]);

                    }
                }
                String[] stringArray52 = new String[lllIIlllII[0]];
                stringArray52[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[176]];
                if (v.llIIIIlIlIIIl(Inventory.contains((String[])stringArray52) ? 1 : 0)) {
                    String[] stringArray53 = new String[lllIIlllII[0]];
                    stringArray53[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[177]];
                    if (v.llIIIIlIlIIIl(Inventory.contains((String[])stringArray53) ? 1 : 0)) {
                        String[] stringArray54 = new String[lllIIlllII[0]];
                        stringArray54[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[178]];
                        String[] stringArray55 = new String[lllIIlllII[0]];
                        stringArray55[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[179]];
                        Inventory.getFirst((String[])stringArray54).useOn(Inventory.getFirst((String[])stringArray55));
                        Time.sleepTicks((int)lllIIlllII[6]);

                    }
                }
                String[] stringArray56 = new String[lllIIlllII[0]];
                stringArray56[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[180]];
                if (v.llIIIIlIlIIIl(Inventory.contains((String[])stringArray56) ? 1 : 0)) {
                    String[] stringArray57 = new String[lllIIlllII[0]];
                    stringArray57[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[181]];
                    String[] stringArray58 = new String[lllIIlllII[0]];
                    stringArray58[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[182]];
                    Inventory.getFirst((String[])stringArray57).useOn(TileObjects.getNearest((String[])stringArray58));
                    Time.sleepTicks((int)lllIIlllII[8]);

                }
                g.a(cE);
                g.a(cE);
            }
            if (v.llIIIIlIllIIl(Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[145])) {
                var19 = new WorldArea(lllIIlllII[183], lllIIlllII[184], lllIIlllII[12], lllIIlllII[9], lllIIlllII[1]);
                if (v.llIIIIlIlIIll(var19.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] stringArray59 = new String[lllIIlllII[0]];
                    stringArray59[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[185]];
                    TileObjects.getNearest((String[])stringArray59).interact(lllIIlIIlI[lllIIlllII[186]]);
                    Time.sleepTicks((int)lllIIlllII[8]);

                }
                if (v.llIIIIlIlIIIl(var19.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] stringArray60 = new String[lllIIlllII[0]];
                    stringArray60[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[187]];
                    String[] stringArray61 = new String[lllIIlllII[0]];
                    stringArray61[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[188]];
                    if (v.llIIIIlIlIIIl(TileObjects.getNearest((String[])stringArray60).hasAction(stringArray61) ? 1 : 0)) {
                        String[] stringArray62 = new String[lllIIlllII[0]];
                        stringArray62[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[189]];
                        TileObjects.getNearest((String[])stringArray62).interact(lllIIlIIlI[lllIIlllII[190]]);
                        Time.sleepTicks((int)lllIIlllII[7]);

                    }
                    String[] stringArray63 = new String[lllIIlllII[0]];
                    stringArray63[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[191]];
                    String[] stringArray64 = new String[lllIIlllII[0]];
                    stringArray64[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[192]];
                    if (v.llIIIIlIlIIIl(TileObjects.getNearest((String[])stringArray63).hasAction(stringArray64) ? 1 : 0)) {
                        String[] stringArray65 = new String[lllIIlllII[0]];
                        stringArray65[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[193]];
                        TileObjects.getNearest((String[])stringArray65).interact(lllIIlIIlI[lllIIlllII[194]]);
                        Time.sleepTicks((int)lllIIlllII[7]);

                    }
                }
                g.a(cE);
            }
            if (v.llIIIIlIllIIl(Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[146])) {
                var19 = new WorldArea(lllIIlllII[183], lllIIlllII[184], lllIIlllII[12], lllIIlllII[9], lllIIlllII[1]);
                if (v.llIIIIlIlIIIl(var19.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] stringArray66 = new String[lllIIlllII[0]];
                    stringArray66[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[195]];
                    TileObjects.getNearest((String[])stringArray66).interact(lllIIlIIlI[lllIIlllII[196]]);
                    Time.sleepTicks((int)lllIIlllII[8]);

                }
                if (v.llIIIIlIlIIll(var19.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    g.a(lllIIlIIlI[lllIIlllII[197]], cE);
                }
            }
            if (v.llIIIIlIllIIl(Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[150])) {
                var19 = new WorldArea(lllIIlllII[198], lllIIlllII[199], lllIIlllII[24], lllIIlllII[48], lllIIlllII[1]);
                while (v.llIIIIlIlIIIl(var19.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    int[] nArray = new int[lllIIlllII[0]];
                    nArray[v.lllIIlllII[1]] = lllIIlllII[31];
                    Inventory.getFirst((int[])nArray).interact(lllIIlIIlI[lllIIlllII[200]]);
                    Time.sleepTicks((int)lllIIlllII[9]);

                    if (-(8 ^ 0x7B ^ (0xB3 ^ 0xC4)) < 0) continue;
                    return;
                }
                var18 = new WorldArea(lllIIlllII[67], lllIIlllII[119], lllIIlllII[111], lllIIlllII[120], lllIIlllII[1]);
                var17 = new WorldArea(lllIIlllII[67], lllIIlllII[119], lllIIlllII[111], lllIIlllII[120], lllIIlllII[0]);
                var16 = new WorldArea(lllIIlllII[67], lllIIlllII[119], lllIIlllII[111], lllIIlllII[120], lllIIlllII[6]);
                var15 = new WorldArea(lllIIlllII[67], lllIIlllII[119], lllIIlllII[111], lllIIlllII[120], lllIIlllII[7]);
                if (v.llIIIIlIlIIll(do.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && v.llIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(y.dQ), lllIIlllII[4]) && v.llIIIIlIlIIll(var18.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && v.llIIIIlIlIIll(var17.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && v.llIIIIlIlIIll(var16.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && v.llIIIIlIlIIll(var15.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[201]];
                    if (v.llIIIIlIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    y.bp();
                }
                y.bq();
                if (v.llIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(y.dQ), lllIIlllII[4])) {
                    if (v.llIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(y.dQ), lllIIlllII[12])) {
                        AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[202]];
                        Movement.walkTo((WorldPoint)y.dQ);

                        Time.sleepTicks((int)lllIIlllII[0]);

                    }
                    if (v.llIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(y.dQ), lllIIlllII[12])) {
                        AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[203]];
                        g.a(lllIIlIIlI[lllIIlllII[204]], cE);
                    }
                }
                g.a(cE);
            }
            if (!v.llIIIIlIllIlI(Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[155]) || v.llIIIIlIllIIl(Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[160])) {
                String[] stringArray67 = new String[lllIIlllII[0]];
                stringArray67[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[205]];
                if (v.llIIIIlIlIlIl(NPCs.getNearest((String[])stringArray67))) {
                    AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[206]];
                    if (v.llIIIIlIlIIll(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                        Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                    }
                    if (v.llIIIIlIlIIll(Prayers.isEnabled((Prayer)Prayer.ULTIMATE_STRENGTH) ? 1 : 0)) {
                        Prayers.toggle((Prayer)Prayer.ULTIMATE_STRENGTH);
                    }
                    if (v.llIIIIlIlIIll(Prayers.isEnabled((Prayer)Prayer.INCREDIBLE_REFLEXES) ? 1 : 0)) {
                        Prayers.toggle((Prayer)Prayer.INCREDIBLE_REFLEXES);
                    }
                    if (v.llIIIIlIllIll(v.llIIIIlIIllll(e.w(), 70.0))) {
                        String[] stringArray68 = new String[lllIIlllII[0]];
                        stringArray68[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[207]];
                        if (v.llIIIIlIlIIIl(Inventory.contains((String[])stringArray68) ? 1 : 0)) {
                            String[] stringArray69 = new String[lllIIlllII[0]];
                            stringArray69[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[208]];
                            Inventory.getFirst((String[])stringArray69).interact(lllIIlIIlI[lllIIlllII[26]]);
                        }
                    }
                    if (v.llIIIIlIllIIl(Skills.getLevel((Skill)Skill.STRENGTH), Skills.getBoostedLevel((Skill)Skill.STRENGTH)) && v.llIIIIlIlIIIl(Inventory.contains((int[])f.aY) ? 1 : 0)) {
                        Inventory.getFirst((int[])f.aY).interact(lllIIlIIlI[lllIIlllII[209]]);
                    }
                    if (v.llIIIIlIlIIlI(Prayers.getPoints(), lllIIlllII[64])) {
                        int[] nArray = new int[lllIIlllII[0]];
                        nArray[v.lllIIlllII[1]] = lllIIlllII[18];
                        if (v.llIIIIlIlIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray30 = new int[lllIIlllII[0]];
                            nArray30[v.lllIIlllII[1]] = lllIIlllII[18];
                            Inventory.getFirst((int[])nArray30).interact(lllIIlIIlI[lllIIlllII[210]]);
                        }
                        int[] nArray31 = new int[lllIIlllII[0]];
                        nArray31[v.lllIIlllII[1]] = lllIIlllII[211];
                        if (v.llIIIIlIlIIIl(Inventory.contains((int[])nArray31) ? 1 : 0)) {
                            int[] nArray32 = new int[lllIIlllII[0]];
                            nArray32[v.lllIIlllII[1]] = lllIIlllII[211];
                            Inventory.getFirst((int[])nArray32).interact(lllIIlIIlI[lllIIlllII[212]]);
                        }
                        int[] nArray33 = new int[lllIIlllII[0]];
                        nArray33[v.lllIIlllII[1]] = lllIIlllII[213];
                        if (v.llIIIIlIlIIIl(Inventory.contains((int[])nArray33) ? 1 : 0)) {
                            int[] nArray34 = new int[lllIIlllII[0]];
                            nArray34[v.lllIIlllII[1]] = lllIIlllII[213];
                            Inventory.getFirst((int[])nArray34).interact(lllIIlIIlI[lllIIlllII[120]]);
                        }
                        int[] nArray35 = new int[lllIIlllII[0]];
                        nArray35[v.lllIIlllII[1]] = lllIIlllII[214];
                        if (v.llIIIIlIlIIIl(Inventory.contains((int[])nArray35) ? 1 : 0)) {
                            int[] nArray36 = new int[lllIIlllII[0]];
                            nArray36[v.lllIIlllII[1]] = lllIIlllII[214];
                            Inventory.getFirst((int[])nArray36).interact(lllIIlIIlI[lllIIlllII[215]]);
                        }
                    }
                    if (v.llIIIIlIlllII(Players.getLocal().getInteracting())) {
                        String[] stringArray70 = new String[lllIIlllII[0]];
                        stringArray70[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[216]];
                        NPCs.getNearest((String[])stringArray70).interact(lllIIlIIlI[lllIIlllII[217]]);
                    }
                }
                g.a(cE);
            }
            if (v.llIIIIlIllIIl(Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[170])) {
                int[] nArray = new int[lllIIlllII[0]];
                nArray[v.lllIIlllII[1]] = lllIIlllII[34];
                if (v.llIIIIlIlIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    if (v.llIIIIlIlIIIl(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                        Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                    }
                    if (v.llIIIIlIlIIIl(Prayers.isEnabled((Prayer)Prayer.ULTIMATE_STRENGTH) ? 1 : 0)) {
                        Prayers.toggle((Prayer)Prayer.ULTIMATE_STRENGTH);
                    }
                    if (v.llIIIIlIlIIIl(Prayers.isEnabled((Prayer)Prayer.INCREDIBLE_REFLEXES) ? 1 : 0)) {
                        Prayers.toggle((Prayer)Prayer.INCREDIBLE_REFLEXES);
                    }
                    if (v.llIIIIlIlIIlI(Prayers.getPoints(), lllIIlllII[3])) {
                        int[] nArray37 = new int[lllIIlllII[0]];
                        nArray37[v.lllIIlllII[1]] = lllIIlllII[18];
                        if (v.llIIIIlIlIIIl(Inventory.contains((int[])nArray37) ? 1 : 0)) {
                            int[] nArray38 = new int[lllIIlllII[0]];
                            nArray38[v.lllIIlllII[1]] = lllIIlllII[18];
                            Inventory.getFirst((int[])nArray38).interact(lllIIlIIlI[lllIIlllII[218]]);
                        }
                        int[] nArray39 = new int[lllIIlllII[0]];
                        nArray39[v.lllIIlllII[1]] = lllIIlllII[18];
                        if (v.llIIIIlIlIIIl(Inventory.contains((int[])nArray39) ? 1 : 0)) {
                            int[] nArray40 = new int[lllIIlllII[0]];
                            nArray40[v.lllIIlllII[1]] = lllIIlllII[18];
                            Inventory.getFirst((int[])nArray40).interact(lllIIlIIlI[lllIIlllII[219]]);
                        }
                        int[] nArray41 = new int[lllIIlllII[0]];
                        nArray41[v.lllIIlllII[1]] = lllIIlllII[211];
                        if (v.llIIIIlIlIIIl(Inventory.contains((int[])nArray41) ? 1 : 0)) {
                            int[] nArray42 = new int[lllIIlllII[0]];
                            nArray42[v.lllIIlllII[1]] = lllIIlllII[211];
                            Inventory.getFirst((int[])nArray42).interact(lllIIlIIlI[lllIIlllII[220]]);
                        }
                        int[] nArray43 = new int[lllIIlllII[0]];
                        nArray43[v.lllIIlllII[1]] = lllIIlllII[213];
                        if (v.llIIIIlIlIIIl(Inventory.contains((int[])nArray43) ? 1 : 0)) {
                            int[] nArray44 = new int[lllIIlllII[0]];
                            nArray44[v.lllIIlllII[1]] = lllIIlllII[213];
                            Inventory.getFirst((int[])nArray44).interact(lllIIlIIlI[lllIIlllII[221]]);
                        }
                        int[] nArray45 = new int[lllIIlllII[0]];
                        nArray45[v.lllIIlllII[1]] = lllIIlllII[214];
                        if (v.llIIIIlIlIIIl(Inventory.contains((int[])nArray45) ? 1 : 0)) {
                            int[] nArray46 = new int[lllIIlllII[0]];
                            nArray46[v.lllIIlllII[1]] = lllIIlllII[214];
                            Inventory.getFirst((int[])nArray46).interact(lllIIlIIlI[lllIIlllII[222]]);
                        }
                    }
                    if (v.llIIIIlIllIll(v.llIIIIlIIllll(e.w(), 100.0))) {
                        String[] stringArray71 = new String[lllIIlllII[0]];
                        stringArray71[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[223]];
                        if (v.llIIIIlIlIIIl(Inventory.contains((String[])stringArray71) ? 1 : 0)) {
                            String[] stringArray72 = new String[lllIIlllII[0]];
                            stringArray72[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[224]];
                            Inventory.getFirst((String[])stringArray72).interact(lllIIlIIlI[lllIIlllII[225]]);
                        }
                    }
                    if (v.llIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(D.fa), lllIIlllII[13])) {
                        AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[226]];
                        var19 = new WorldArea(lllIIlllII[227], lllIIlllII[228], lllIIlllII[222], lllIIlllII[229], lllIIlllII[1]);
                        if (v.llIIIIlIlIIll(var19.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            int[] nArray47 = new int[lllIIlllII[0]];
                            nArray47[v.lllIIlllII[1]] = lllIIlllII[31];
                            Inventory.getFirst((int[])nArray47).interact(lllIIlIIlI[lllIIlllII[230]]);
                            Time.sleepTicks((int)lllIIlllII[12]);

                        }
                        if (v.llIIIIlIlIIIl(var19.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            Movement.walkTo((WorldPoint)D.fa);

                            Time.sleepTicks((int)lllIIlllII[0]);

                        }
                    }
                    if (v.llIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(D.fa), lllIIlllII[13])) {
                        if (v.llIIIIlIlIIll(Bank.isOpen() ? 1 : 0)) {
                            int[] nArray48 = new int[lllIIlllII[0]];
                            nArray48[v.lllIIlllII[1]] = lllIIlllII[117];
                            if (v.llIIIIlIlIlIl(TileObjects.getNearest((int[])nArray48)) && v.llIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(D.fa), lllIIlllII[15])) {
                                int[] nArray49 = new int[lllIIlllII[0]];
                                nArray49[v.lllIIlllII[1]] = lllIIlllII[117];
                                TileObjects.getNearest((int[])nArray49).interact(lllIIlIIlI[lllIIlllII[231]]);
                                Time.sleepTicks((int)lllIIlllII[6]);

                            }
                        }
                        if (v.llIIIIlIlIIIl(Bank.isOpen() ? 1 : 0)) {
                            String[] stringArray73 = new String[lllIIlllII[0]];
                            stringArray73[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[232]];
                            Bank.depositAll((String[])stringArray73);
                            int[] nArray50 = new int[lllIIlllII[0]];
                            nArray50[v.lllIIlllII[1]] = lllIIlllII[32];
                            Bank.depositAll((int[])nArray50);
                            Bank.withdraw((int)lllIIlllII[34], (int)lllIIlllII[0], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                            Bank.withdraw((int)lllIIlllII[33], (int)lllIIlllII[0], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                            Bank.withdraw((int)lllIIlllII[21], (int)lllIIlllII[7], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                            Bank.withdraw((int)lllIIlllII[37], (int)lllIIlllII[0], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                        }
                    }
                }
                String[] stringArray74 = new String[lllIIlllII[0]];
                stringArray74[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[233]];
                if (v.llIIIIlIlIIIl(Inventory.contains((String[])stringArray74) ? 1 : 0) && v.llIIIIlIlIIll(do.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && v.llIIIIlIlIIll(dm.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (v.llIIIIlIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    y.bp();
                }
                if (v.llIIIIlIlIIIl(do.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && v.llIIIIlIlIIll(dm.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (v.llIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(dn), lllIIlllII[9])) {
                        AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[234]];
                        Movement.walkTo((WorldPoint)dn);

                        Time.sleepTicks((int)lllIIlllII[0]);

                    }
                    if (v.llIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(dn), lllIIlllII[9])) {
                        String[] stringArray75 = new String[lllIIlllII[0]];
                        stringArray75[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[235]];
                        String[] stringArray76 = new String[lllIIlllII[0]];
                        stringArray76[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[236]];
                        if (v.llIIIIlIlIIIl(TileObjects.getNearest((String[])stringArray75).hasAction(stringArray76) ? 1 : 0)) {
                            String[] stringArray77 = new String[lllIIlllII[0]];
                            stringArray77[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[237]];
                            TileObjects.getNearest((String[])stringArray77).interact(lllIIlIIlI[lllIIlllII[229]]);
                            Time.sleepTicks((int)lllIIlllII[8]);

                        }
                        String[] stringArray78 = new String[lllIIlllII[0]];
                        stringArray78[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[238]];
                        String[] stringArray79 = new String[lllIIlllII[0]];
                        stringArray79[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[239]];
                        if (v.llIIIIlIlIIIl(TileObjects.getNearest((String[])stringArray78).hasAction(stringArray79) ? 1 : 0)) {
                            String[] stringArray80 = new String[lllIIlllII[0]];
                            stringArray80[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[240]];
                            TileObjects.getNearest((String[])stringArray80).interact(lllIIlIIlI[lllIIlllII[241]]);
                            Time.sleepTicks((int)lllIIlllII[8]);

                        }
                    }
                }
                if (v.llIIIIlIlIIIl(dm.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    g.a(lllIIlIIlI[lllIIlllII[242]], cE);
                }
                g.a(cE);
            }
            if (v.llIIIIlIllIIl(Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[175])) {
                g.a(cE);
            }
            if (v.llIIIIlIllIIl(Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[180])) {
                String[] stringArray81 = new String[lllIIlllII[0]];
                stringArray81[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[243]];
                if (v.llIIIIlIlIIll(Inventory.contains((String[])stringArray81) ? 1 : 0)) {
                    g.a(lllIIlIIlI[lllIIlllII[244]], cE);
                }
                String[] stringArray82 = new String[lllIIlllII[0]];
                stringArray82[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[245]];
                if (v.llIIIIlIlIIIl(Inventory.contains((String[])stringArray82) ? 1 : 0)) {
                    String[] stringArray83 = new String[lllIIlllII[0]];
                    stringArray83[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[246]];
                    Inventory.getFirst((String[])stringArray83).interact(lllIIlIIlI[lllIIlllII[247]]);
                    Time.sleepTicks((int)lllIIlllII[6]);

                }
                g.a(cE);
            }
            if (v.llIIIIlIllIIl(Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[187])) {
                String[] stringArray84 = new String[lllIIlllII[0]];
                stringArray84[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[248]];
                if (v.llIIIIlIlIIll(Inventory.contains((String[])stringArray84) ? 1 : 0)) {
                    String[] stringArray85 = new String[lllIIlllII[0]];
                    stringArray85[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[249]];
                    if (v.llIIIIlIlIIll(Inventory.contains((String[])stringArray85) ? 1 : 0)) {
                        int[] nArray = new int[lllIIlllII[0]];
                        nArray[v.lllIIlllII[1]] = lllIIlllII[250];
                        if (v.llIIIIlIlIlIl(TileObjects.getNearest((int[])nArray))) {
                            String[] stringArray86 = new String[lllIIlllII[0]];
                            stringArray86[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[251]];
                            if (v.llIIIIlIlIIIl(Inventory.contains((String[])stringArray86) ? 1 : 0)) {
                                String[] stringArray87 = new String[lllIIlllII[0]];
                                stringArray87[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[252]];
                                Inventory.getFirst((String[])stringArray87).interact(lllIIlIIlI[lllIIlllII[253]]);
                            }
                            int[] nArray51 = new int[lllIIlllII[0]];
                            nArray51[v.lllIIlllII[1]] = lllIIlllII[250];
                            TileObjects.getNearest((int[])nArray51).interact(lllIIlIIlI[lllIIlllII[254]]);
                            Time.sleepTicks((int)lllIIlllII[7]);

                        }
                    }
                    String[] stringArray88 = new String[lllIIlllII[0]];
                    stringArray88[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[255]];
                    if (v.llIIIIlIlIIll(Inventory.contains((String[])stringArray88) ? 1 : 0)) {
                        String[] stringArray89 = new String[lllIIlllII[0]];
                        stringArray89[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[256]];
                        if (v.llIIIIlIlIIIl(Inventory.contains((String[])stringArray89) ? 1 : 0)) {
                            int[] nArray = new int[lllIIlllII[0]];
                            nArray[v.lllIIlllII[1]] = lllIIlllII[257];
                            if (v.llIIIIlIlIlIl(TileObjects.getNearest((int[])nArray))) {
                                String[] stringArray90 = new String[lllIIlllII[0]];
                                stringArray90[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[258]];
                                if (v.llIIIIlIlIIIl(Inventory.contains((String[])stringArray90) ? 1 : 0)) {
                                    String[] stringArray91 = new String[lllIIlllII[0]];
                                    stringArray91[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[259]];
                                    Inventory.getFirst((String[])stringArray91).interact(lllIIlIIlI[lllIIlllII[260]]);
                                }
                                int[] nArray52 = new int[lllIIlllII[0]];
                                nArray52[v.lllIIlllII[1]] = lllIIlllII[257];
                                TileObjects.getNearest((int[])nArray52).interact(lllIIlIIlI[lllIIlllII[261]]);
                                Time.sleepTicks((int)lllIIlllII[7]);

                            }
                        }
                    }
                    String[] stringArray92 = new String[lllIIlllII[0]];
                    stringArray92[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[262]];
                    if (v.llIIIIlIlIIIl(Inventory.contains((String[])stringArray92) ? 1 : 0)) {
                        String[] stringArray93 = new String[lllIIlllII[0]];
                        stringArray93[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[263]];
                        if (v.llIIIIlIlIIIl(Inventory.contains((String[])stringArray93) ? 1 : 0)) {
                            String[] stringArray94 = new String[lllIIlllII[0]];
                            stringArray94[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[264]];
                            if (v.llIIIIlIlIIll(Inventory.contains((String[])stringArray94) ? 1 : 0)) {
                                if (v.llIIIIlIlIIlI(dt, lllIIlllII[6])) {
                                    g.a(lllIIlIIlI[lllIIlllII[265]], cE);
                                    Time.sleepTicks((int)lllIIlllII[8]);

                                    dt += lllIIlllII[0];
                                }
                                g.a(cE);
                                if (v.llIIIIlIlIIll(Dialog.isOpen() ? 1 : 0)) {
                                    String[] stringArray95 = new String[lllIIlllII[0]];
                                    stringArray95[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[266]];
                                    if (v.llIIIIlIlllII(NPCs.getNearest((String[])stringArray95))) {
                                        AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[267]];
                                        if (v.llIIIIlIlIIll(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lllIIlllII[268], lllIIlllII[87], lllIIlllII[1])) ? 1 : 0)) {
                                            if (v.llIIIIlIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                                                Dialog.close();
                                            }
                                            Movement.walkTo((WorldPoint)new WorldPoint(lllIIlllII[268], lllIIlllII[87], lllIIlllII[1]));

                                            Time.sleepTicks((int)lllIIlllII[0]);

                                        }
                                        if (v.llIIIIlIlIIIl(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lllIIlllII[268], lllIIlllII[87], lllIIlllII[1])) ? 1 : 0)) {
                                            String[] stringArray96 = new String[lllIIlllII[0]];
                                            stringArray96[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[269]];
                                            TileObjects.getNearest((String[])stringArray96).interact(lllIIlIIlI[lllIIlllII[270]]);
                                            Time.sleepTicks((int)lllIIlllII[6]);

                                            String[] stringArray97 = new String[lllIIlllII[0]];
                                            stringArray97[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[271]];
                                            TileObjects.getNearest((String[])stringArray97).interact(lllIIlIIlI[lllIIlllII[272]]);
                                            Time.sleepTicks((int)lllIIlllII[6]);

                                        }
                                    }
                                    String[] stringArray98 = new String[lllIIlllII[0]];
                                    stringArray98[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[273]];
                                    if (v.llIIIIlIlIlIl(NPCs.getNearest((String[])stringArray98))) {
                                        AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[274]];
                                        g.a(lllIIlIIlI[lllIIlllII[275]], cE);
                                    }
                                }
                            }
                        }
                    }
                    String[] stringArray99 = new String[lllIIlllII[0]];
                    stringArray99[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[276]];
                    if (v.llIIIIlIlIIIl(Inventory.contains((String[])stringArray99) ? 1 : 0)) {
                        String[] stringArray100 = new String[lllIIlllII[0]];
                        stringArray100[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[277]];
                        if (v.llIIIIlIlIIIl(Inventory.contains((String[])stringArray100) ? 1 : 0)) {
                            String[] stringArray101 = new String[lllIIlllII[0]];
                            stringArray101[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[278]];
                            if (v.llIIIIlIlIIIl(Inventory.contains((String[])stringArray101) ? 1 : 0)) {
                                String[] stringArray102 = new String[lllIIlllII[0]];
                                stringArray102[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[279]];
                                String[] stringArray103 = new String[lllIIlllII[0]];
                                stringArray103[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[280]];
                                Inventory.getFirst((String[])stringArray102).useOn(Inventory.getFirst((String[])stringArray103));
                            }
                        }
                    }
                    String[] stringArray104 = new String[lllIIlllII[0]];
                    stringArray104[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[281]];
                    if (v.llIIIIlIlIIIl(Inventory.contains((String[])stringArray104) ? 1 : 0)) {
                        String[] stringArray105 = new String[lllIIlllII[0]];
                        stringArray105[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[282]];
                        Magic.cast((Spell)SpellBook.Standard.LVL_2_ENCHANT, (Item)Inventory.getFirst((String[])stringArray105));
                    }
                    String[] stringArray106 = new String[lllIIlllII[0]];
                    stringArray106[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[283]];
                    if (v.llIIIIlIlIIIl(Inventory.contains((String[])stringArray106) ? 1 : 0)) {
                        String[] stringArray107 = new String[lllIIlllII[0]];
                        stringArray107[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[284]];
                        String[] stringArray108 = new String[lllIIlllII[0]];
                        stringArray108[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[285]];
                        Inventory.getFirst((String[])stringArray107).useOn(Inventory.getFirst((String[])stringArray108));
                    }
                }
                String[] stringArray109 = new String[lllIIlllII[0]];
                stringArray109[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[286]];
                if (v.llIIIIlIlIIIl(Inventory.contains((String[])stringArray109) ? 1 : 0)) {
                    String[] stringArray110 = new String[lllIIlllII[0]];
                    stringArray110[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[287]];
                    if (v.llIIIIlIlIlIl(NPCs.getNearest((String[])stringArray110))) {
                        String[] stringArray111 = new String[lllIIlllII[0]];
                        stringArray111[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[288]];
                        TileObjects.getNearest((String[])stringArray111).interact(lllIIlIIlI[lllIIlllII[289]]);
                        Time.sleepTicks((int)lllIIlllII[8]);

                    }
                    String[] stringArray112 = new String[lllIIlllII[0]];
                    stringArray112[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[290]];
                    if (v.llIIIIlIlllII(NPCs.getNearest((String[])stringArray112))) {
                        if (v.llIIIIlIlIIll(do.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && v.llIIIIlIlIIll(dm.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            if (v.llIIIIlIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                                Dialog.close();
                            }
                            y.bp();
                        }
                        if (v.llIIIIlIlIIIl(do.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && v.llIIIIlIlIIll(dm.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            if (v.llIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(dn), lllIIlllII[9])) {
                                AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[291]];
                                Movement.walkTo((WorldPoint)dn);

                                Time.sleepTicks((int)lllIIlllII[0]);

                            }
                            if (v.llIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(dn), lllIIlllII[9])) {
                                String[] stringArray113 = new String[lllIIlllII[0]];
                                stringArray113[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[292]];
                                String[] stringArray114 = new String[lllIIlllII[0]];
                                stringArray114[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[293]];
                                if (v.llIIIIlIlIIIl(TileObjects.getNearest((String[])stringArray113).hasAction(stringArray114) ? 1 : 0)) {
                                    String[] stringArray115 = new String[lllIIlllII[0]];
                                    stringArray115[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[294]];
                                    TileObjects.getNearest((String[])stringArray115).interact(lllIIlIIlI[lllIIlllII[295]]);
                                    Time.sleepTicks((int)lllIIlllII[8]);

                                }
                                String[] stringArray116 = new String[lllIIlllII[0]];
                                stringArray116[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[296]];
                                String[] stringArray117 = new String[lllIIlllII[0]];
                                stringArray117[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[38]];
                                if (v.llIIIIlIlIIIl(TileObjects.getNearest((String[])stringArray116).hasAction(stringArray117) ? 1 : 0)) {
                                    String[] stringArray118 = new String[lllIIlllII[0]];
                                    stringArray118[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[297]];
                                    TileObjects.getNearest((String[])stringArray118).interact(lllIIlIIlI[lllIIlllII[298]]);
                                    Time.sleepTicks((int)lllIIlllII[8]);

                                }
                            }
                        }
                        if (v.llIIIIlIlIIIl(dm.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            g.a(lllIIlIIlI[lllIIlllII[299]], cE);
                        }
                        g.a(cE);
                    }
                }
                g.a(cE);
            }
            if (v.llIIIIlIllIIl(Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[192])) {
                g.a(cE);
            }
            if (v.llIIIIlIllIIl(Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[197])) {
                g.a(cE);
                if (v.llIIIIlIlIIll(Dialog.isOpen() ? 1 : 0)) {
                    if (v.llIIIIlIlIIIl(dm.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        String[] stringArray119 = new String[lllIIlllII[0]];
                        stringArray119[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[300]];
                        if (v.llIIIIlIlIIll(Equipment.contains((String[])stringArray119) ? 1 : 0)) {
                            String[] stringArray120 = new String[lllIIlllII[0]];
                            stringArray120[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[301]];
                            Inventory.getFirst((String[])stringArray120).interact(lllIIlIIlI[lllIIlllII[36]]);
                        }
                        String[] stringArray121 = new String[lllIIlllII[0]];
                        stringArray121[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[302]];
                        TileObjects.getNearest((String[])stringArray121).interact(lllIIlIIlI[lllIIlllII[303]]);
                        Time.sleepTicks((int)lllIIlllII[8]);

                    }
                    if (v.llIIIIlIlIIll(dm.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (v.llIIIIlIlIIll(v.ba() ? 1 : 0)) {
                            v.bb();
                        }
                        if (v.llIIIIlIlIIIl(v.ba() ? 1 : 0)) {
                            g.a(lllIIlIIlI[lllIIlllII[304]], cE);
                        }
                    }
                }
            }
            if (v.llIIIIlIllIIl(Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[204])) {
                String[] stringArray122 = new String[lllIIlllII[0]];
                stringArray122[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[305]];
                var19 = NPCs.getNearest((String[])stringArray122);
                if (v.llIIIIlIlllII(var19)) {
                    if (v.llIIIIlIlIIIl(v.ba() ? 1 : 0)) {
                        if (v.llIIIIlIllIll(v.llIIIIlIIllll(e.w(), 100.0))) {
                            String[] stringArray123 = new String[lllIIlllII[0]];
                            stringArray123[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[306]];
                            if (v.llIIIIlIlIIIl(Inventory.contains((String[])stringArray123) ? 1 : 0)) {
                                String[] stringArray124 = new String[lllIIlllII[0]];
                                stringArray124[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[307]];
                                Inventory.getFirst((String[])stringArray124).interact(lllIIlIIlI[lllIIlllII[308]]);
                                Time.sleepTicks((int)lllIIlllII[6]);

                            }
                        }
                        if (v.llIIIIlIlIIlI(Prayers.getPoints(), lllIIlllII[3]) && v.llIIIIlIlIIIl(Inventory.contains((int[])f.aX) ? 1 : 0)) {
                            Inventory.getFirst((int[])f.aX).interact(lllIIlIIlI[lllIIlllII[309]]);
                            Time.sleepTicks((int)lllIIlllII[0]);

                        }
                        g.a(lllIIlIIlI[lllIIlllII[310]], cE);
                    }
                    if (v.llIIIIlIlIIll(v.ba() ? 1 : 0)) {
                        v.bb();
                    }
                }
                if (v.llIIIIlIlIlIl(var19)) {
                    if (v.llIIIIlIlllII(dr)) {
                        dr = var19.getWorldLocation();
                        ds = new WorldPoint(dr.getX() - lllIIlllII[12], dr.getY(), dr.getPlane());
                    }
                    if (v.llIIIIlIlIIlI(Prayers.getPoints(), lllIIlllII[60]) && v.llIIIIlIlllIl(v.llIIIIlIlIIII(e.w(), 65.0))) {
                        Inventory.getFirst((int[])f.aX).interact(lllIIlIIlI[lllIIlllII[311]]);
                    }
                    if (v.llIIIIlIllIll(v.llIIIIlIIllll(e.w(), 65.0))) {
                        String[] stringArray125 = new String[lllIIlllII[0]];
                        stringArray125[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[312]];
                        if (v.llIIIIlIlIIIl(Inventory.contains((String[])stringArray125) ? 1 : 0)) {
                            String[] stringArray126 = new String[lllIIlllII[0]];
                            stringArray126[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[313]];
                            Inventory.getFirst((String[])stringArray126).interact(lllIIlIIlI[lllIIlllII[314]]);
                        }
                    }
                    if (v.llIIIIlIlIlll(Skills.getLevel((Skill)Skill.STRENGTH) + lllIIlllII[20], Skills.getBoostedLevel((Skill)Skill.STRENGTH)) && v.llIIIIlIlIIIl(Inventory.contains((int[])f.aY) ? 1 : 0)) {
                        Inventory.getFirst((int[])f.aY).interact(lllIIlIIlI[lllIIlllII[315]]);
                    }
                    String[] stringArray127 = new String[lllIIlllII[0]];
                    stringArray127[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[316]];
                    if (v.llIIIIlIlIIll(Inventory.contains((String[])stringArray127) ? 1 : 0) && !v.llIIIIlIlllIl(v.llIIIIlIIllll(e.w(), 50.0)) || v.llIIIIlIlIIll(Inventory.contains((int[])f.aX) ? 1 : 0) && v.llIIIIlIllIII(Prayers.getPoints(), lllIIlllII[7])) {
                        AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[317]];
                        var18 = TileObjects.getNearest(tileObject -> {
                            int n2;
                            if (v.llIIIIlIlIIIl(tileObject.getName().equalsIgnoreCase(lllIIlIIlI[lllIIlllII[439]]) ? 1 : 0)) {
                                String[] stringArray = new String[lllIIlllII[0]];
                                stringArray[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[440]];
                                if (v.llIIIIlIlIIIl(tileObject.hasAction(stringArray) ? 1 : 0)) {
                                    n2 = lllIIlllII[0];

                                    if (-(0x35 ^ 0x62 ^ (0x6A ^ 0x38)) < 0) return n2 != 0;
                                    return ((0x2C ^ 0x5F ^ (0x3A ^ 0x40)) & (0x28 ^ 0x44 ^ (0x1A ^ 0x7F) ^ -1)) != 0;
                                }
                            }
                            n2 = lllIIlllII[1];
                            return n2 != 0;
                        });
                        if (v.llIIIIlIlIlIl(var18)) {
                            var18.interact(lllIIlIIlI[lllIIlllII[318]]);
                            Time.sleepTicks((int)lllIIlllII[8]);

                        }
                    }
                    if (v.llIIIIlIlIIIl(AccBuilderSotf.i.containsKey(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[319]];
                        var18 = TileObjects.getAll(tileObject -> {
                            int n2;
                            if (v.llIIIIlIllIIl(tileObject.getId(), lllIIlllII[436]) && v.llIIIIlIlIlll(tileObject.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lllIIlllII[8])) {
                                n2 = lllIIlllII[0];

                                if (-1 != -1) {
                                    return ((150 + 161 - 259 + 137 ^ 73 + 41 - 10 + 66) & (1 ^ (0xD3 ^ 0xC5) ^ -1)) != 0;
                                }
                            } else {
                                n2 = lllIIlllII[1];
                            }
                            return n2 != 0;
                        });
                        var17 = TileObjects.getAll(tileObject -> {
                            int n2;
                            if (v.llIIIIlIllIIl(tileObject.getId(), lllIIlllII[435]) && v.llIIIIlIlIlll(tileObject.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lllIIlllII[8])) {
                                n2 = lllIIlllII[0];

                                if (((0xA0 ^ 0x94) & ~(0xA4 ^ 0x90)) != 0) {
                                    return false;
                                }
                            } else {
                                n2 = lllIIlllII[1];
                            }
                            return n2 != 0;
                        });
                        var16 = Players.getLocal().getWorldLocation();
                        if (v.llIIIIlIlIlII(var16.distanceTo(ds), lllIIlllII[7])) {
                            Movement.walkTo((WorldPoint)ds);

                        }
                        if (v.llIIIIlIlIlII(var16.distanceTo(dr), lllIIlllII[7]) && v.llIIIIlIlIIll(Players.getLocal().isMoving() ? 1 : 0)) {
                            Movement.walkTo((WorldPoint)dr);

                        }
                    }
                    String[] stringArray128 = new String[lllIIlllII[0]];
                    stringArray128[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[320]];
                    if (v.llIIIIlIlIlIl(NPCs.getNearest((String[])stringArray128))) {
                        String[] stringArray129 = new String[lllIIlllII[0]];
                        stringArray129[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[321]];
                        String[] stringArray130 = new String[lllIIlllII[0]];
                        stringArray130[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[322]];
                        if (v.llIIIIlIlIIIl(NPCs.getNearest((String[])stringArray129).hasAction(stringArray130) ? 1 : 0)) {
                            String[] stringArray131 = new String[lllIIlllII[0]];
                            stringArray131[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[323]];
                            if (v.llIIIIlIlIIll(var19.hasAction(stringArray131) ? 1 : 0)) {
                                String[] stringArray132 = new String[lllIIlllII[0]];
                                stringArray132[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[324]];
                                if (v.llIIIIlIlIIIl(Inventory.contains((String[])stringArray132) ? 1 : 0)) {
                                    if (v.llIIIIlIlIIll(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                        Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                                    }
                                    if (v.llIIIIlIlIIIl(Prayers.isEnabled((Prayer)Prayer.INCREDIBLE_REFLEXES) ? 1 : 0)) {
                                        Prayers.toggle((Prayer)Prayer.INCREDIBLE_REFLEXES);
                                    }
                                    if (v.llIIIIlIlIIIl(AccBuilderSotf.i.isEmpty() ? 1 : 0) && v.llIIIIlIlllII(Players.getLocal().getInteracting())) {
                                        NPCs.getNearest(nPC -> {
                                            int n2;
                                            if (v.llIIIIlIlIIIl(nPC.getName().equalsIgnoreCase(lllIIlIIlI[lllIIlllII[437]]) ? 1 : 0)) {
                                                String[] stringArray = new String[lllIIlllII[0]];
                                                stringArray[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[438]];
                                                if (v.llIIIIlIlIIIl(nPC.hasAction(stringArray) ? 1 : 0)) {
                                                    n2 = lllIIlllII[0];

                                                    if (3 != ((0x66 ^ 0x3C) & ~(0xE3 ^ 0xB9))) return n2 != 0;
                                                    return false;
                                                }
                                            }
                                            n2 = lllIIlllII[1];
                                            return n2 != 0;
                                        }).interact(lllIIlIIlI[lllIIlllII[325]]);
                                    }
                                }
                            }
                        }
                    }
                    String[] stringArray133 = new String[lllIIlllII[0]];
                    stringArray133[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[326]];
                    if (v.llIIIIlIlIlIl(NPCs.getNearest((String[])stringArray133))) {
                        String[] stringArray134 = new String[lllIIlllII[0]];
                        stringArray134[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[327]];
                        String[] stringArray135 = new String[lllIIlllII[0]];
                        stringArray135[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[328]];
                        if (v.llIIIIlIlIIll(NPCs.getNearest((String[])stringArray134).hasAction(stringArray135) ? 1 : 0)) {
                            String[] stringArray136 = new String[lllIIlllII[0]];
                            stringArray136[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[329]];
                            if (v.llIIIIlIlIIIl(var19.hasAction(stringArray136) ? 1 : 0)) {
                                if (v.llIIIIlIlIlll(var19.getHealthRatio(), lllIIlllII[29])) {
                                    if (v.llIIIIlIlIIll(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MAGIC) ? 1 : 0)) {
                                        Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MAGIC);
                                    }
                                    if (v.llIIIIlIlIIll(Prayers.isEnabled((Prayer)Prayer.INCREDIBLE_REFLEXES) ? 1 : 0)) {
                                        Prayers.toggle((Prayer)Prayer.INCREDIBLE_REFLEXES);
                                    }
                                }
                                if (v.llIIIIlIllIII(var19.getHealthRatio(), lllIIlllII[29]) && v.llIIIIlIlIIll(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                    Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                                }
                                if (v.llIIIIlIllIIl(var19.getAnimation(), lllIIlllII[330])) {
                                    AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[331]];
                                    var18 = TileObjects.getAll(arg_0 -> v.b((NPC)var19, arg_0));
                                    var17 = TileObjects.getAll(arg_0 -> v.a((NPC)var19, arg_0));
                                    Movement.walkTo((WorldPoint)ds);

                                    Time.sleepTicks((int)lllIIlllII[0]);

                                }
                                if (v.llIIIIlIllIlI(var19.getAnimation(), lllIIlllII[330]) && v.llIIIIlIlllII(Players.getLocal().getInteracting())) {
                                    var19.interact(lllIIlIIlI[lllIIlllII[332]]);
                                    Time.sleepTicks((int)lllIIlllII[0]);

                                }
                            }
                        }
                    }
                    String[] stringArray137 = new String[lllIIlllII[0]];
                    stringArray137[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[333]];
                    if (v.llIIIIlIlllII(NPCs.getNearest((String[])stringArray137))) {
                        String[] stringArray138 = new String[lllIIlllII[0]];
                        stringArray138[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[334]];
                        if (v.llIIIIlIlIIIl(var19.hasAction(stringArray138) ? 1 : 0)) {
                            if (v.llIIIIlIlIIll(Prayers.isEnabled((Prayer)Prayer.INCREDIBLE_REFLEXES) ? 1 : 0)) {
                                Prayers.toggle((Prayer)Prayer.INCREDIBLE_REFLEXES);
                            }
                            if (v.llIIIIlIlIlll(var19.getHealthRatio(), lllIIlllII[29]) && v.llIIIIlIlIIll(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MAGIC) ? 1 : 0)) {
                                Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MAGIC);
                            }
                            if (v.llIIIIlIllIII(var19.getHealthRatio(), lllIIlllII[29]) && v.llIIIIlIlIIll(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                            }
                            if (v.llIIIIlIllIlI(var19.getAnimation(), lllIIlllII[330]) && v.llIIIIlIlllII(Players.getLocal().getInteracting())) {
                                var19.interact(lllIIlIIlI[lllIIlllII[335]]);
                                Time.sleepTicks((int)lllIIlllII[0]);

                            }
                        }
                    }
                }
                g.a(cE);
            }
            if (v.llIIIIlIllIIl(Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[26])) {
                g.a(cE);
            }
            if (v.llIIIIlIllIIl(Vars.getBit((int)QuestVarbits.QUEST_A_TASTE_OF_HOPE.getId()), lllIIlllII[215])) {
                if (v.llIIIIlIlIIIl(do.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && v.llIIIIlIlIIll(dm.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    int[] nArray = new int[lllIIlllII[0]];
                    nArray[v.lllIIlllII[1]] = lllIIlllII[30];
                    if (v.llIIIIlIlIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        if (v.llIIIIlIllIll(v.llIIIIlIIllll(e.w(), 100.0))) {
                            String[] stringArray139 = new String[lllIIlllII[0]];
                            stringArray139[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[336]];
                            if (v.llIIIIlIlIIIl(Inventory.contains((String[])stringArray139) ? 1 : 0)) {
                                String[] stringArray140 = new String[lllIIlllII[0]];
                                stringArray140[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[337]];
                                Inventory.getFirst((String[])stringArray140).interact(lllIIlIIlI[lllIIlllII[338]]);
                            }
                        }
                        if (v.llIIIIlIlIIlI(Prayers.getPoints(), lllIIlllII[3]) && v.llIIIIlIlIIIl(Inventory.contains((int[])f.aX) ? 1 : 0)) {
                            Inventory.getFirst((int[])f.aX).interact(lllIIlIIlI[lllIIlllII[339]]);
                        }
                        v.bb();
                    }
                    int[] nArray53 = new int[lllIIlllII[0]];
                    nArray53[v.lllIIlllII[1]] = lllIIlllII[30];
                    if (v.llIIIIlIlIIIl(Inventory.contains((int[])nArray53) ? 1 : 0) && v.llIIIIlIlIlll(Players.getLocal().getWorldLocation().distanceTo(dn), lllIIlllII[9])) {
                        AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[340]];
                        Movement.walkTo((WorldPoint)dn);

                        Time.sleepTicks((int)lllIIlllII[0]);

                    }
                    if (v.llIIIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(dn), lllIIlllII[9])) {
                        String[] stringArray141 = new String[lllIIlllII[0]];
                        stringArray141[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[341]];
                        String[] stringArray142 = new String[lllIIlllII[0]];
                        stringArray142[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[342]];
                        if (v.llIIIIlIlIIIl(TileObjects.getNearest((String[])stringArray141).hasAction(stringArray142) ? 1 : 0)) {
                            String[] stringArray143 = new String[lllIIlllII[0]];
                            stringArray143[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[343]];
                            TileObjects.getNearest((String[])stringArray143).interact(lllIIlIIlI[lllIIlllII[344]]);
                            Time.sleepTicks((int)lllIIlllII[8]);

                        }
                        String[] stringArray144 = new String[lllIIlllII[0]];
                        stringArray144[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[345]];
                        String[] stringArray145 = new String[lllIIlllII[0]];
                        stringArray145[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[346]];
                        if (v.llIIIIlIlIIIl(TileObjects.getNearest((String[])stringArray144).hasAction(stringArray145) ? 1 : 0)) {
                            String[] stringArray146 = new String[lllIIlllII[0]];
                            stringArray146[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[347]];
                            TileObjects.getNearest((String[])stringArray146).interact(lllIIlIIlI[lllIIlllII[348]]);
                            Time.sleepTicks((int)lllIIlllII[8]);

                        }
                    }
                }
                if (v.llIIIIlIlIIIl(dm.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (v.llIIIIlIlIIlI(di, lllIIlllII[0])) {
                        aN.su += lllIIlllII[0];
                        aN.u(AccBuilderSotf.m);
                        di += lllIIlllII[0];
                        aN.su = lllIIlllII[1];
                        dj = lllIIlllII[1];
                    }
                    g.a(lllIIlIIlI[lllIIlllII[349]], cE);
                }
                g.a(cE);
            }
            String[] stringArray147 = new String[lllIIlllII[0]];
            stringArray147[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[350]];
            if (v.llIIIIlIlIIIl(Inventory.contains((String[])stringArray147) ? 1 : 0)) {
                AccBuilderSotf.c = lllIIlIIlI[lllIIlllII[351]];
                String[] stringArray148 = new String[lllIIlllII[0]];
                stringArray148[v.lllIIlllII[1]] = lllIIlIIlI[lllIIlllII[352]];
                Inventory.getFirst((String[])stringArray148).interact(lllIIlIIlI[lllIIlllII[353]]);
                Time.sleepTicks((int)lllIIlllII[8]);

            }
            if (v.llIIIIlIlIlIl(var19 = Widgets.get((int)lllIIlllII[308], (int)lllIIlllII[14]))) {
                var19.interact(lllIIlIIlI[lllIIlllII[354]]);
                Time.sleepTicks((int)lllIIlllII[0]);

            }
            if (v.llIIIIlIlIlIl(var18 = Widgets.get((int)lllIIlllII[308], (int)lllIIlllII[70]))) {
                var18.interact(lllIIlIIlI[lllIIlllII[355]]);
                Time.sleepTicks((int)lllIIlllII[6]);

            }
            g.a(cE);
        }
    }

    private static  boolean a(NPC nPC, TileObject tileObject) {
        int n2;
        if (v.llIIIIlIllIIl(tileObject.getId(), lllIIlllII[435]) && v.llIIIIlIlIlll(tileObject.getWorldLocation().distanceTo(nPC.getWorldLocation()), lllIIlllII[9])) {
            n2 = lllIIlllII[0];

            if (-1 != -1) {
                return (((0x13 ^ 0x54) & ~(0x29 ^ 0x6E) ^ (0xD ^ 0x5B)) & (0x74 ^ 0x29 ^ (0xBA ^ 0xB1) ^ -1) & ((5 ^ 0x18 ^ (0x81 ^ 0xB6)) & (177 + 139 - 228 + 90 ^ 49 + 36 - -62 + 5 ^ -1) ^ -1)) != 0;
            }
        } else {
            n2 = lllIIlllII[1];
        }
        return n2 != 0;
    }
}

