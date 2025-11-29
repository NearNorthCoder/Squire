/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.MenuAction
 *  net.runelite.api.NPC
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Combat$AttackStyle
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.client.Static
 */
package gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks;

import gg.squire.account.AccBuilderEasyClues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.W;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.AHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.BHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.DHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.EHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.FHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.JHelper;
import net.runelite.api.MenuAction;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.client.Static;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class AAHelper
implements W {
    public static  int[] kE;
    public static  WorldArea kG;
    public static  WorldArea kH;
    public static  List<d> bv;
    public static  WorldPoint kI;
    public static  WorldPoint bx;
    public static  boolean bt;

    public static  WorldArea kF;
    public static  WorldPoint kJ;

    private static boolean lIlIIlIllIlI(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public String U() {
        return llIIIlIII[llIIIlIIl[57]];
    }

    public static void AAHelper() {
        if (aa.lIlIIlIllIll(kG.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderEasyClues.c = llIIIlIII[llIIIlIIl[20]];
            Movement.walkTo((WorldPoint)bx);

            Time.sleepTicks((int)llIIIlIIl[1]);

        }
        if (aa.lIlIIlIllIIl(kG.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderEasyClues.c = llIIIlIII[llIIIlIIl[21]];
            if (aa.lIlIIllIIIII(Players.getLocal().getInteracting())) {
                NPC lIlllIIIllIIll = NPCs.getNearest(nPC -> {
                    int n2;
                    if (aa.lIlIIlIllIIl(nPC.getName().contains(llIIIlIII[llIIIlIIl[58]]) ? 1 : 0) && aa.lIlIIllIIIII(nPC.getInteracting()) && aa.lIlIIlIllIll(nPC.isDead() ? 1 : 0)) {
                        n2 = llIIIlIIl[1];

                        if (-(0x10 ^ 0x14) >= 0) {
                            return false;
                        }
                    } else {
                        n2 = llIIIlIIl[0];
                    }
                    return n2 != 0;
                });
                String[] stringArray = new String[llIIIlIIl[3]];
                stringArray[aa.llIIIlIIl[0]] = llIIIlIII[llIIIlIIl[22]];
                stringArray[aa.llIIIlIIl[1]] = llIIIlIII[llIIIlIIl[23]];
                List lIlllIIIllIIlI = NPCs.getAll((String[])stringArray).stream().filter(nPC -> {
                    boolean bl;
                    if (aa.lIlIIllIIIlI(nPC.getInteracting(), Players.getLocal())) {
                        bl = llIIIlIIl[1];

                        if ((0x39 ^ 0x3D) <= 2) {
                            return false;
                        }
                    } else {
                        bl = llIIIlIIl[0];
                    }
                    return bl;
                }).collect(Collectors.toList());
                if (aa.lIlIIlIllIll(lIlllIIIllIIlI.isEmpty() ? 1 : 0)) {
                    ((NPC)lIlllIIIllIIlI.get(llIIIlIIl[0])).interact(llIIIlIII[llIIIlIIl[24]]);
                    Time.sleepTicks((int)llIIIlIIl[3]);

                }
                if (aa.lIlIIlIlllII(lIlllIIIllIIll) && aa.lIlIIlIllIll(Players.getLocal().isMoving() ? 1 : 0) && aa.lIlIIlIllIIl(lIlllIIIllIIlI.isEmpty() ? 1 : 0)) {
                    lIlllIIIllIIll.interact(llIIIlIII[llIIIlIIl[25]]);
                    Time.sleepTicks((int)llIIIlIIl[3]);

                }
            }
            if (aa.lIlIIlIlllII(Players.getLocal().getInteracting())) {
                Time.sleepTicks((int)llIIIlIIl[6]);

            }
        }
    }

    @Override
    public boolean S() {
        return llIIIlIIl[0];
    }

    public static void dn() {
        block17: {
            block19: {
                block18: {
                    if (aa.lIlIIlIllIIl(bt ? 1 : 0)) {
                        AccBuilderEasyClues.c = llIIIlIII[llIIIlIIl[0]];
                        b.a(bv);
                        if (aa.lIlIIlIllIlI(bv.size(), llIIIlIIl[1])) {
                            System.out.println(llIIIlIII[llIIIlIIl[1]]);
                            bt = llIIIlIIl[0];
                        }
                    }
                    if (!aa.lIlIIlIllIll(bt ? 1 : 0)) break block17;
                    if (aa.lIlIIlIllIll(aa.bH() ? 1 : 0) && aa.lIlIIlIllIlI(Skills.getLevel((Skill)Skill.DEFENCE), llIIIlIIl[2])) {
                        BankLocation lIlllIIIllIllI = BankLocation.getNearest();
                        if (aa.lIlIIlIlllII(lIlllIIIllIllI) && aa.lIlIIlIllIll(lIlllIIIllIllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderEasyClues.c = llIIIlIII[llIIIlIIl[3]];
                            a.a(lIlllIIIllIllI);
                        }
                        if (aa.lIlIIlIlllII(lIlllIIIllIllI) && aa.lIlIIlIllIIl(lIlllIIIllIllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderEasyClues.c = llIIIlIII[llIIIlIIl[4]];
                            if (aa.lIlIIlIllIll(Bank.isOpen() ? 1 : 0)) {
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)llIIIlIIl[5]);

                            }
                            if (aa.lIlIIlIllIIl(Bank.isOpen() ? 1 : 0)) {
                                if (aa.lIlIIlIlllIl(Inventory.getAll().size())) {
                                    Bank.depositInventory();
                                    Time.sleepTicks((int)llIIIlIIl[1]);

                                }
                                if (aa.lIlIIlIlllIl(Equipment.getAll().size())) {
                                    Bank.depositEquipment();
                                    Time.sleepTicks((int)llIIIlIIl[3]);

                                }
                                if (aa.lIlIIlIllIll(aa.dp() ? 1 : 0)) {
                                    aa.af();
                                    System.out.println(llIIIlIII[llIIIlIIl[6]]);
                                    bt = llIIIlIIl[1];
                                    return;
                                }
                                a.a(kE, llIIIlIIl[1]);
                                a.a(llIIIlIIl[7], llIIIlIIl[8]);
                                a.b(f.aV, llIIIlIIl[1]);
                                a.a(llIIIlIIl[9], llIIIlIIl[10]);
                                a.a(llIIIlIIl[11], llIIIlIIl[12]);
                            }
                        }
                    }
                    if (!aa.lIlIIlIllIIl(aa.bH() ? 1 : 0)) break block17;
                    aa.do();
                    if (aa.lIlIIlIllllI(Movement.getRunEnergy(), llIIIlIIl[13]) && aa.lIlIIlIllIll(Movement.isRunEnabled() ? 1 : 0)) {
                        Movement.toggleRun();
                    }
                    String[] stringArray = new String[llIIIlIIl[1]];
                    stringArray[aa.llIIIlIIl[0]] = llIIIlIII[llIIIlIIl[10]];
                    if (!aa.lIlIIlIllIll(Equipment.contains((String[])stringArray) ? 1 : 0)) break block18;
                    String[] stringArray2 = new String[llIIIlIIl[1]];
                    stringArray2[aa.llIIIlIIl[0]] = llIIIlIII[llIIIlIIl[14]];
                    if (!aa.lIlIIlIllIll(Equipment.contains((String[])stringArray2) ? 1 : 0)) break block18;
                    String[] stringArray3 = new String[llIIIlIIl[1]];
                    stringArray3[aa.llIIIlIIl[0]] = llIIIlIII[llIIIlIIl[15]];
                    if (!aa.lIlIIlIllIll(Equipment.contains((String[])stringArray3) ? 1 : 0)) break block18;
                    int[] nArray = new int[llIIIlIIl[1]];
                    nArray[aa.llIIIlIIl[0]] = llIIIlIIl[16];
                    if (!aa.lIlIIlIllIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block18;
                    int[] nArray2 = new int[llIIIlIIl[1]];
                    nArray2[aa.llIIIlIIl[0]] = llIIIlIIl[17];
                    if (!aa.lIlIIlIllIIl(Equipment.contains((int[])nArray2) ? 1 : 0)) break block19;
                }
                aa.dq();
            }
            if (aa.lIlIIlIlllll(aa.lIlIIlIllIII(e.u(), 45.0))) {
                int[] nArray = new int[llIIIlIIl[1]];
                nArray[aa.llIIIlIIl[0]] = llIIIlIIl[11];
                if (aa.lIlIIlIllIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray3 = new int[llIIIlIIl[1]];
                    nArray3[aa.llIIIlIIl[0]] = llIIIlIIl[11];
                    Inventory.getFirst((int[])nArray3).interact(llIIIlIII[llIIIlIIl[18]]);
                    Time.sleepTicks((int)llIIIlIIl[1]);

                }
            }
            if (aa.lIlIIlIllllI(Skills.getLevel((Skill)Skill.ATTACK), llIIIlIIl[19]) && aa.lIlIIlIllllI(Skills.getLevel((Skill)Skill.STRENGTH), llIIIlIIl[19])) {
                j.Q();
            }
        }
    }

    @Override
    public boolean V() {
        boolean bl;
        if (aa.lIlIIlIllllI(Skills.getLevel((Skill)Skill.DEFENCE), llIIIlIIl[2])) {
            bl = llIIIlIIl[1];

            if (2 < 2) {
                return ((0x38 ^ 0x68 ^ (0xD2 ^ 0x8D)) & (95 + 83 - 55 + 35 ^ 41 + 11 - -45 + 48 ^ -1)) != 0;
            }
        } else {
            bl = llIIIlIIl[0];
        }
        return bl;
    }

    private static boolean lIlIIllIIIII(Object object) {
        return object == null;
    }

    private static boolean lIlIIlIllIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIIlIlllll(int n2) {
        return n2 < 0;
    }

    @Override
    public int T() {
        try {
            aa.dn();

        }
        catch (Exception lIlllIIIlIlllI) {
            lIlllIIIlIlllI.printStackTrace();
        }
        if (-(0xB4 ^ 0xB1) >= 0) {
            return (0x92 ^ 0xC6) & ~(0xFF ^ 0xAB);
        }
        return llIIIlIIl[0];
    }

    static {
        aa.lIlIIlIlIlll();
        aa.lIlIIlIlIllI();
        bv = new ArrayList<d>();
        int[] nArray = new int[llIIIlIIl[18]];
        nArray[aa.llIIIlIIl[0]] = llIIIlIIl[16];
        nArray[aa.llIIIlIIl[1]] = llIIIlIIl[17];
        nArray[aa.llIIIlIIl[3]] = llIIIlIIl[42];
        nArray[aa.llIIIlIIl[4]] = llIIIlIIl[44];
        nArray[aa.llIIIlIIl[6]] = llIIIlIIl[40];
        nArray[aa.llIIIlIIl[10]] = llIIIlIIl[45];
        nArray[aa.llIIIlIIl[14]] = llIIIlIIl[47];
        nArray[aa.llIIIlIIl[15]] = llIIIlIIl[49];
        kE = nArray;
        kF = new WorldArea(llIIIlIIl[59], llIIIlIIl[60], llIIIlIIl[22], llIIIlIIl[22], llIIIlIIl[0]);
        kG = new WorldArea(llIIIlIIl[61], llIIIlIIl[62], llIIIlIIl[32], llIIIlIIl[26], llIIIlIIl[0]);
        kH = new WorldArea(llIIIlIIl[63], llIIIlIIl[64], llIIIlIIl[65], llIIIlIIl[34], llIIIlIIl[0]);
        kI = new WorldPoint(llIIIlIIl[66], llIIIlIIl[67], llIIIlIIl[0]);
        bx = new WorldPoint(llIIIlIIl[68], llIIIlIIl[60], llIIIlIIl[0]);
        kJ = new WorldPoint(llIIIlIIl[69], llIIIlIIl[70], llIIIlIIl[0]);
    }

        return String.valueOf(lIlllIIIIIIIll);
    }

    private static boolean lIlIIlIllIll(int n2) {
        return n2 == 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean dp() {
        int n2;
        block15: {
            block22: {
                block21: {
                    block20: {
                        block19: {
                            block18: {
                                block17: {
                                    block16: {
                                        block14: {
                                            block4: {
                                                int n3;
                                                block6: {
                                                    block13: {
                                                        block12: {
                                                            block11: {
                                                                block10: {
                                                                    block9: {
                                                                        block8: {
                                                                            block7: {
                                                                                block5: {
                                                                                    if (!aa.lIlIIlIllllI(Skills.getLevel((Skill)Skill.ATTACK), llIIIlIIl[2])) break block4;
                                                                                    int[] nArray = new int[llIIIlIIl[1]];
                                                                                    nArray[aa.llIIIlIIl[0]] = llIIIlIIl[17];
                                                                                    if (!aa.lIlIIlIllIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block5;
                                                                                    int[] nArray2 = new int[llIIIlIIl[1]];
                                                                                    nArray2[aa.llIIIlIIl[0]] = llIIIlIIl[17];
                                                                                    if (!aa.lIlIIlIllIll(Inventory.contains((int[])nArray2) ? 1 : 0)) break block5;
                                                                                    int[] nArray3 = new int[llIIIlIIl[1]];
                                                                                    nArray3[aa.llIIIlIIl[0]] = llIIIlIIl[17];
                                                                                    if (!aa.lIlIIlIllIIl(Bank.contains((int[])nArray3) ? 1 : 0)) break block6;
                                                                                }
                                                                                int[] nArray = new int[llIIIlIIl[1]];
                                                                                nArray[aa.llIIIlIIl[0]] = llIIIlIIl[42];
                                                                                if (!aa.lIlIIlIllIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block7;
                                                                                int[] nArray4 = new int[llIIIlIIl[1]];
                                                                                nArray4[aa.llIIIlIIl[0]] = llIIIlIIl[42];
                                                                                if (!aa.lIlIIlIllIll(Inventory.contains((int[])nArray4) ? 1 : 0)) break block7;
                                                                                int[] nArray5 = new int[llIIIlIIl[1]];
                                                                                nArray5[aa.llIIIlIIl[0]] = llIIIlIIl[42];
                                                                                if (!aa.lIlIIlIllIIl(Bank.contains((int[])nArray5) ? 1 : 0)) break block6;
                                                                            }
                                                                            int[] nArray = new int[llIIIlIIl[1]];
                                                                            nArray[aa.llIIIlIIl[0]] = llIIIlIIl[44];
                                                                            if (!aa.lIlIIlIllIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block8;
                                                                            int[] nArray6 = new int[llIIIlIIl[1]];
                                                                            nArray6[aa.llIIIlIIl[0]] = llIIIlIIl[44];
                                                                            if (!aa.lIlIIlIllIll(Inventory.contains((int[])nArray6) ? 1 : 0)) break block8;
                                                                            int[] nArray7 = new int[llIIIlIIl[1]];
                                                                            nArray7[aa.llIIIlIIl[0]] = llIIIlIIl[44];
                                                                            if (!aa.lIlIIlIllIIl(Bank.contains((int[])nArray7) ? 1 : 0)) break block6;
                                                                        }
                                                                        int[] nArray = new int[llIIIlIIl[1]];
                                                                        nArray[aa.llIIIlIIl[0]] = llIIIlIIl[40];
                                                                        if (!aa.lIlIIlIllIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block9;
                                                                        int[] nArray8 = new int[llIIIlIIl[1]];
                                                                        nArray8[aa.llIIIlIIl[0]] = llIIIlIIl[40];
                                                                        if (!aa.lIlIIlIllIll(Inventory.contains((int[])nArray8) ? 1 : 0)) break block9;
                                                                        int[] nArray9 = new int[llIIIlIIl[1]];
                                                                        nArray9[aa.llIIIlIIl[0]] = llIIIlIIl[40];
                                                                        if (!aa.lIlIIlIllIIl(Bank.contains((int[])nArray9) ? 1 : 0)) break block6;
                                                                    }
                                                                    int[] nArray = new int[llIIIlIIl[1]];
                                                                    nArray[aa.llIIIlIIl[0]] = llIIIlIIl[45];
                                                                    if (!aa.lIlIIlIllIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block10;
                                                                    int[] nArray10 = new int[llIIIlIIl[1]];
                                                                    nArray10[aa.llIIIlIIl[0]] = llIIIlIIl[45];
                                                                    if (!aa.lIlIIlIllIll(Inventory.contains((int[])nArray10) ? 1 : 0)) break block10;
                                                                    int[] nArray11 = new int[llIIIlIIl[1]];
                                                                    nArray11[aa.llIIIlIIl[0]] = llIIIlIIl[45];
                                                                    if (!aa.lIlIIlIllIIl(Bank.contains((int[])nArray11) ? 1 : 0)) break block6;
                                                                }
                                                                int[] nArray = new int[llIIIlIIl[1]];
                                                                nArray[aa.llIIIlIIl[0]] = llIIIlIIl[47];
                                                                if (!aa.lIlIIlIllIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block11;
                                                                int[] nArray12 = new int[llIIIlIIl[1]];
                                                                nArray12[aa.llIIIlIIl[0]] = llIIIlIIl[47];
                                                                if (!aa.lIlIIlIllIll(Equipment.contains((int[])nArray12) ? 1 : 0)) break block11;
                                                                int[] nArray13 = new int[llIIIlIIl[1]];
                                                                nArray13[aa.llIIIlIIl[0]] = llIIIlIIl[47];
                                                                if (!aa.lIlIIlIllIIl(Bank.contains((int[])nArray13) ? 1 : 0)) break block6;
                                                            }
                                                            int[] nArray = new int[llIIIlIIl[1]];
                                                            nArray[aa.llIIIlIIl[0]] = llIIIlIIl[49];
                                                            if (!aa.lIlIIlIllIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block12;
                                                            int[] nArray14 = new int[llIIIlIIl[1]];
                                                            nArray14[aa.llIIIlIIl[0]] = llIIIlIIl[49];
                                                            if (!aa.lIlIIlIllIll(Equipment.contains((int[])nArray14) ? 1 : 0)) break block12;
                                                            int[] nArray15 = new int[llIIIlIIl[1]];
                                                            nArray15[aa.llIIIlIIl[0]] = llIIIlIIl[49];
                                                            if (!aa.lIlIIlIllIIl(Bank.contains((int[])nArray15) ? 1 : 0)) break block6;
                                                        }
                                                        int[] nArray = new int[llIIIlIIl[1]];
                                                        nArray[aa.llIIIlIIl[0]] = llIIIlIIl[11];
                                                        if (!aa.lIlIIlIllIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block13;
                                                        int[] nArray16 = new int[llIIIlIIl[1]];
                                                        nArray16[aa.llIIIlIIl[0]] = llIIIlIIl[11];
                                                        if (!aa.lIlIIlIllIIl(Bank.contains((int[])nArray16) ? 1 : 0)) break block6;
                                                    }
                                                    n3 = llIIIlIIl[1];

                                                    if ((0x9D ^ 0x99) > ((0x87 ^ 0xA1) & ~(4 ^ 0x22))) return n3 != 0;
                                                    return false;
                                                }
                                                n3 = llIIIlIIl[0];
                                                return n3 != 0;
                                            }
                                            int[] nArray = new int[llIIIlIIl[1]];
                                            nArray[aa.llIIIlIIl[0]] = llIIIlIIl[16];
                                            if (!aa.lIlIIlIllIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block14;
                                            int[] nArray17 = new int[llIIIlIIl[1]];
                                            nArray17[aa.llIIIlIIl[0]] = llIIIlIIl[16];
                                            if (!aa.lIlIIlIllIll(Inventory.contains((int[])nArray17) ? 1 : 0)) break block14;
                                            int[] nArray18 = new int[llIIIlIIl[1]];
                                            nArray18[aa.llIIIlIIl[0]] = llIIIlIIl[16];
                                            if (!aa.lIlIIlIllIIl(Bank.contains((int[])nArray18) ? 1 : 0)) break block15;
                                        }
                                        int[] nArray = new int[llIIIlIIl[1]];
                                        nArray[aa.llIIIlIIl[0]] = llIIIlIIl[42];
                                        if (!aa.lIlIIlIllIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block16;
                                        int[] nArray19 = new int[llIIIlIIl[1]];
                                        nArray19[aa.llIIIlIIl[0]] = llIIIlIIl[42];
                                        if (!aa.lIlIIlIllIll(Inventory.contains((int[])nArray19) ? 1 : 0)) break block16;
                                        int[] nArray20 = new int[llIIIlIIl[1]];
                                        nArray20[aa.llIIIlIIl[0]] = llIIIlIIl[42];
                                        if (!aa.lIlIIlIllIIl(Bank.contains((int[])nArray20) ? 1 : 0)) break block15;
                                    }
                                    int[] nArray = new int[llIIIlIIl[1]];
                                    nArray[aa.llIIIlIIl[0]] = llIIIlIIl[44];
                                    if (!aa.lIlIIlIllIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block17;
                                    int[] nArray21 = new int[llIIIlIIl[1]];
                                    nArray21[aa.llIIIlIIl[0]] = llIIIlIIl[44];
                                    if (!aa.lIlIIlIllIll(Inventory.contains((int[])nArray21) ? 1 : 0)) break block17;
                                    int[] nArray22 = new int[llIIIlIIl[1]];
                                    nArray22[aa.llIIIlIIl[0]] = llIIIlIIl[44];
                                    if (!aa.lIlIIlIllIIl(Bank.contains((int[])nArray22) ? 1 : 0)) break block15;
                                }
                                int[] nArray = new int[llIIIlIIl[1]];
                                nArray[aa.llIIIlIIl[0]] = llIIIlIIl[40];
                                if (!aa.lIlIIlIllIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block18;
                                int[] nArray23 = new int[llIIIlIIl[1]];
                                nArray23[aa.llIIIlIIl[0]] = llIIIlIIl[40];
                                if (!aa.lIlIIlIllIll(Inventory.contains((int[])nArray23) ? 1 : 0)) break block18;
                                int[] nArray24 = new int[llIIIlIIl[1]];
                                nArray24[aa.llIIIlIIl[0]] = llIIIlIIl[40];
                                if (!aa.lIlIIlIllIIl(Bank.contains((int[])nArray24) ? 1 : 0)) break block15;
                            }
                            int[] nArray = new int[llIIIlIIl[1]];
                            nArray[aa.llIIIlIIl[0]] = llIIIlIIl[45];
                            if (!aa.lIlIIlIllIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block19;
                            int[] nArray25 = new int[llIIIlIIl[1]];
                            nArray25[aa.llIIIlIIl[0]] = llIIIlIIl[45];
                            if (!aa.lIlIIlIllIll(Inventory.contains((int[])nArray25) ? 1 : 0)) break block19;
                            int[] nArray26 = new int[llIIIlIIl[1]];
                            nArray26[aa.llIIIlIIl[0]] = llIIIlIIl[45];
                            if (!aa.lIlIIlIllIIl(Bank.contains((int[])nArray26) ? 1 : 0)) break block15;
                        }
                        int[] nArray = new int[llIIIlIIl[1]];
                        nArray[aa.llIIIlIIl[0]] = llIIIlIIl[47];
                        if (!aa.lIlIIlIllIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block20;
                        int[] nArray27 = new int[llIIIlIIl[1]];
                        nArray27[aa.llIIIlIIl[0]] = llIIIlIIl[47];
                        if (!aa.lIlIIlIllIll(Equipment.contains((int[])nArray27) ? 1 : 0)) break block20;
                        int[] nArray28 = new int[llIIIlIIl[1]];
                        nArray28[aa.llIIIlIIl[0]] = llIIIlIIl[47];
                        if (!aa.lIlIIlIllIIl(Bank.contains((int[])nArray28) ? 1 : 0)) break block15;
                    }
                    int[] nArray = new int[llIIIlIIl[1]];
                    nArray[aa.llIIIlIIl[0]] = llIIIlIIl[49];
                    if (!aa.lIlIIlIllIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block21;
                    int[] nArray29 = new int[llIIIlIIl[1]];
                    nArray29[aa.llIIIlIIl[0]] = llIIIlIIl[49];
                    if (!aa.lIlIIlIllIll(Equipment.contains((int[])nArray29) ? 1 : 0)) break block21;
                    int[] nArray30 = new int[llIIIlIIl[1]];
                    nArray30[aa.llIIIlIIl[0]] = llIIIlIIl[49];
                    if (!aa.lIlIIlIllIIl(Bank.contains((int[])nArray30) ? 1 : 0)) break block15;
                }
                int[] nArray = new int[llIIIlIIl[1]];
                nArray[aa.llIIIlIIl[0]] = llIIIlIIl[11];
                if (!aa.lIlIIlIllIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block22;
                int[] nArray31 = new int[llIIIlIIl[1]];
                nArray31[aa.llIIIlIIl[0]] = llIIIlIIl[11];
                if (!aa.lIlIIlIllIIl(Bank.contains((int[])nArray31) ? 1 : 0)) break block15;
            }
            n2 = llIIIlIIl[1];

            if (null == null) return n2 != 0;
            return ((0x91 ^ 0xB9) & ~(0x60 ^ 0x48) & ~((0xC5 ^ 0x99) & ~(0x4C ^ 0x10))) != 0;
        }
        n2 = llIIIlIIl[0];
        return n2 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean bH() {
        int n2;
        block18: {
            block24: {
                block23: {
                    block22: {
                        block21: {
                            block20: {
                                block19: {
                                    block17: {
                                        block8: {
                                            int n3;
                                            block10: {
                                                block16: {
                                                    block15: {
                                                        block14: {
                                                            block13: {
                                                                block12: {
                                                                    block11: {
                                                                        block9: {
                                                                            if (!aa.lIlIIlIllllI(Skills.getLevel((Skill)Skill.ATTACK), llIIIlIIl[2])) break block8;
                                                                            int[] nArray = new int[llIIIlIIl[1]];
                                                                            nArray[aa.llIIIlIIl[0]] = llIIIlIIl[17];
                                                                            if (!aa.lIlIIlIllIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block9;
                                                                            int[] nArray2 = new int[llIIIlIIl[1]];
                                                                            nArray2[aa.llIIIlIIl[0]] = llIIIlIIl[17];
                                                                            if (!aa.lIlIIlIllIIl(Inventory.contains((int[])nArray2) ? 1 : 0)) break block10;
                                                                        }
                                                                        int[] nArray = new int[llIIIlIIl[1]];
                                                                        nArray[aa.llIIIlIIl[0]] = llIIIlIIl[42];
                                                                        if (!aa.lIlIIlIllIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block11;
                                                                        int[] nArray3 = new int[llIIIlIIl[1]];
                                                                        nArray3[aa.llIIIlIIl[0]] = llIIIlIIl[42];
                                                                        if (!aa.lIlIIlIllIIl(Inventory.contains((int[])nArray3) ? 1 : 0)) break block10;
                                                                    }
                                                                    int[] nArray = new int[llIIIlIIl[1]];
                                                                    nArray[aa.llIIIlIIl[0]] = llIIIlIIl[44];
                                                                    if (!aa.lIlIIlIllIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block12;
                                                                    int[] nArray4 = new int[llIIIlIIl[1]];
                                                                    nArray4[aa.llIIIlIIl[0]] = llIIIlIIl[44];
                                                                    if (!aa.lIlIIlIllIIl(Inventory.contains((int[])nArray4) ? 1 : 0)) break block10;
                                                                }
                                                                int[] nArray = new int[llIIIlIIl[1]];
                                                                nArray[aa.llIIIlIIl[0]] = llIIIlIIl[40];
                                                                if (!aa.lIlIIlIllIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block13;
                                                                int[] nArray5 = new int[llIIIlIIl[1]];
                                                                nArray5[aa.llIIIlIIl[0]] = llIIIlIIl[40];
                                                                if (!aa.lIlIIlIllIIl(Inventory.contains((int[])nArray5) ? 1 : 0)) break block10;
                                                            }
                                                            int[] nArray = new int[llIIIlIIl[1]];
                                                            nArray[aa.llIIIlIIl[0]] = llIIIlIIl[45];
                                                            if (!aa.lIlIIlIllIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block14;
                                                            int[] nArray6 = new int[llIIIlIIl[1]];
                                                            nArray6[aa.llIIIlIIl[0]] = llIIIlIIl[45];
                                                            if (!aa.lIlIIlIllIIl(Inventory.contains((int[])nArray6) ? 1 : 0)) break block10;
                                                        }
                                                        int[] nArray = new int[llIIIlIIl[1]];
                                                        nArray[aa.llIIIlIIl[0]] = llIIIlIIl[47];
                                                        if (!aa.lIlIIlIllIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block15;
                                                        int[] nArray7 = new int[llIIIlIIl[1]];
                                                        nArray7[aa.llIIIlIIl[0]] = llIIIlIIl[47];
                                                        if (!aa.lIlIIlIllIIl(Inventory.contains((int[])nArray7) ? 1 : 0)) break block10;
                                                    }
                                                    int[] nArray = new int[llIIIlIIl[1]];
                                                    nArray[aa.llIIIlIIl[0]] = llIIIlIIl[49];
                                                    if (!aa.lIlIIlIllIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block16;
                                                    int[] nArray8 = new int[llIIIlIIl[1]];
                                                    nArray8[aa.llIIIlIIl[0]] = llIIIlIIl[49];
                                                    if (!aa.lIlIIlIllIIl(Inventory.contains((int[])nArray8) ? 1 : 0)) break block10;
                                                }
                                                int[] nArray = new int[llIIIlIIl[1]];
                                                nArray[aa.llIIIlIIl[0]] = llIIIlIIl[11];
                                                if (aa.lIlIIlIllIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                    n3 = llIIIlIIl[1];

                                                    if (1 == 1) return n3 != 0;
                                                    return false;
                                                }
                                            }
                                            n3 = llIIIlIIl[0];
                                            return n3 != 0;
                                        }
                                        int[] nArray = new int[llIIIlIIl[1]];
                                        nArray[aa.llIIIlIIl[0]] = llIIIlIIl[16];
                                        if (!aa.lIlIIlIllIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block17;
                                        int[] nArray9 = new int[llIIIlIIl[1]];
                                        nArray9[aa.llIIIlIIl[0]] = llIIIlIIl[16];
                                        if (!aa.lIlIIlIllIIl(Inventory.contains((int[])nArray9) ? 1 : 0)) break block18;
                                    }
                                    int[] nArray = new int[llIIIlIIl[1]];
                                    nArray[aa.llIIIlIIl[0]] = llIIIlIIl[42];
                                    if (!aa.lIlIIlIllIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block19;
                                    int[] nArray10 = new int[llIIIlIIl[1]];
                                    nArray10[aa.llIIIlIIl[0]] = llIIIlIIl[42];
                                    if (!aa.lIlIIlIllIIl(Inventory.contains((int[])nArray10) ? 1 : 0)) break block18;
                                }
                                int[] nArray = new int[llIIIlIIl[1]];
                                nArray[aa.llIIIlIIl[0]] = llIIIlIIl[44];
                                if (!aa.lIlIIlIllIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block20;
                                int[] nArray11 = new int[llIIIlIIl[1]];
                                nArray11[aa.llIIIlIIl[0]] = llIIIlIIl[44];
                                if (!aa.lIlIIlIllIIl(Inventory.contains((int[])nArray11) ? 1 : 0)) break block18;
                            }
                            int[] nArray = new int[llIIIlIIl[1]];
                            nArray[aa.llIIIlIIl[0]] = llIIIlIIl[40];
                            if (!aa.lIlIIlIllIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block21;
                            int[] nArray12 = new int[llIIIlIIl[1]];
                            nArray12[aa.llIIIlIIl[0]] = llIIIlIIl[40];
                            if (!aa.lIlIIlIllIIl(Inventory.contains((int[])nArray12) ? 1 : 0)) break block18;
                        }
                        int[] nArray = new int[llIIIlIIl[1]];
                        nArray[aa.llIIIlIIl[0]] = llIIIlIIl[45];
                        if (!aa.lIlIIlIllIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block22;
                        int[] nArray13 = new int[llIIIlIIl[1]];
                        nArray13[aa.llIIIlIIl[0]] = llIIIlIIl[45];
                        if (!aa.lIlIIlIllIIl(Inventory.contains((int[])nArray13) ? 1 : 0)) break block18;
                    }
                    int[] nArray = new int[llIIIlIIl[1]];
                    nArray[aa.llIIIlIIl[0]] = llIIIlIIl[47];
                    if (!aa.lIlIIlIllIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block23;
                    int[] nArray14 = new int[llIIIlIIl[1]];
                    nArray14[aa.llIIIlIIl[0]] = llIIIlIIl[47];
                    if (!aa.lIlIIlIllIIl(Inventory.contains((int[])nArray14) ? 1 : 0)) break block18;
                }
                int[] nArray = new int[llIIIlIIl[1]];
                nArray[aa.llIIIlIIl[0]] = llIIIlIIl[49];
                if (!aa.lIlIIlIllIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block24;
                int[] nArray15 = new int[llIIIlIIl[1]];
                nArray15[aa.llIIIlIIl[0]] = llIIIlIIl[49];
                if (!aa.lIlIIlIllIIl(Inventory.contains((int[])nArray15) ? 1 : 0)) break block18;
            }
            int[] nArray = new int[llIIIlIIl[1]];
            nArray[aa.llIIIlIIl[0]] = llIIIlIIl[11];
            if (aa.lIlIIlIllIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                n2 = llIIIlIIl[1];

                if (null == null) return n2 != 0;
                return false;
            }
        }
        n2 = llIIIlIIl[0];
        return n2 != 0;
    }

    private static void lIlIIlIlIllI() {
        llIIIlIII = new String[llIIIlIIl[71]];
        aa.llIIIlIII[aa.llIIIlIIl[0]] = "Buying items";
        aa.llIIIlIII[aa.llIIIlIIl[1]] = "Finished buying items, switching back to melee training";
        aa.llIIIlIII[aa.llIIIlIIl[3]] = "Navigating to bank";
        aa.llIIIlIII[aa.llIIIlIIl[4]] = "Handling banking";
        aa.llIIIlIII[aa.llIIIlIIl[6]] = "We are missing supplies, switching to BUYING";
        aa.llIIIlIII[aa.llIIIlIIl[10]] = "Iron scimitar";
        aa.llIIIlIII[aa.llIIIlIIl[14]] = "Steel scimitar";
        aa.llIIIlIII[aa.llIIIlIIl[15]] = "Mithril scimitar";
        aa.llIIIlIII[aa.llIIIlIIl[18]] = "Eat";
        aa.llIIIlIII[aa.llIIIlIIl[20]] = "Walking to cow area";
        aa.llIIIlIII[aa.llIIIlIIl[21]] = "Killing cows";
        aa.llIIIlIII[aa.llIIIlIIl[22]] = "Cow";
        aa.llIIIlIII[aa.llIIIlIIl[23]] = "cow";
        aa.llIIIlIII[aa.llIIIlIIl[24]] = "Attack";
        aa.llIIIlIII[aa.llIIIlIIl[25]] = "Attack";
        aa.llIIIlIII[aa.llIIIlIIl[13]] = "Auto retaliate";
        aa.llIIIlIII[aa.llIIIlIIl[26]] = aa.lIlIIlIlIIll("", "AqpAP");
        aa.llIIIlIII[aa.llIIIlIIl[29]] = "Iron scimitar";
        aa.llIIIlIII[aa.llIIIlIIl[30]] = "Iron scimitar";
        aa.llIIIlIII[aa.llIIIlIIl[31]] = "Wield";
        aa.llIIIlIII[aa.llIIIlIIl[19]] = "Steel scimitar";
        aa.llIIIlIII[aa.llIIIlIIl[32]] = "Steel scimitar";
        aa.llIIIlIII[aa.llIIIlIIl[33]] = "Wield";
        aa.llIIIlIII[aa.llIIIlIIl[35]] = "Mithril scimitar";
        aa.llIIIlIII[aa.llIIIlIIl[36]] = "Mithril scimitar";
        aa.llIIIlIII[aa.llIIIlIIl[37]] = "Wield";
        aa.llIIIlIII[aa.llIIIlIIl[38]] = "Wield";
        aa.llIIIlIII[aa.llIIIlIIl[39]] = "Wield";
        aa.llIIIlIII[aa.llIIIlIIl[41]] = "Wear";
        aa.llIIIlIII[aa.llIIIlIIl[43]] = "Wear";
        aa.llIIIlIII[aa.llIIIlIIl[34]] = "Wear";
        aa.llIIIlIII[aa.llIIIlIIl[46]] = "Wear";
        aa.llIIIlIII[aa.llIIIlIIl[48]] = "Wear";
        aa.llIIIlIII[aa.llIIIlIIl[50]] = "Wear";
        aa.llIIIlIII[aa.llIIIlIIl[57]] = "40 Def";
        aa.llIIIlIII[aa.llIIIlIIl[58]] = "Cow";
    }

    public static void af() {
        d lIlllIIIllIIII;
        int[] nArray = new int[llIIIlIIl[1]];
        nArray[aa.llIIIlIIl[0]] = llIIIlIIl[9];
        if (aa.lIlIIlIllIll(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new DHelper(llIIIlIIl[9], llIIIlIIl[2], llIIIlIIl[51]);
            bv.add(d2);

        }
        int[] nArray2 = new int[llIIIlIIl[1]];
        nArray2[aa.llIIIlIIl[0]] = llIIIlIIl[52];
        if (aa.lIlIIlIllIll(Bank.contains((int[])nArray2) ? 1 : 0)) {
            lIlllIIIllIIII = new DHelper(llIIIlIIl[52], llIIIlIIl[10], llIIIlIIl[51]);
            bv.add(lIlllIIIllIIII);

        }
        int[] nArray3 = new int[llIIIlIIl[1]];
        nArray3[aa.llIIIlIIl[0]] = llIIIlIIl[49];
        if (aa.lIlIIlIllIll(Bank.contains((int[])nArray3) ? 1 : 0)) {
            lIlllIIIllIIII = new DHelper(llIIIlIIl[49], llIIIlIIl[1], llIIIlIIl[53]);
            bv.add(lIlllIIIllIIII);

        }
        int[] nArray4 = new int[llIIIlIIl[1]];
        nArray4[aa.llIIIlIIl[0]] = llIIIlIIl[47];
        if (aa.lIlIIlIllIll(Bank.contains((int[])nArray4) ? 1 : 0)) {
            lIlllIIIllIIII = new DHelper(llIIIlIIl[47], llIIIlIIl[1], llIIIlIIl[54]);
            bv.add(lIlllIIIllIIII);

        }
        int[] nArray5 = new int[llIIIlIIl[1]];
        nArray5[aa.llIIIlIIl[0]] = llIIIlIIl[11];
        if (aa.lIlIIlIllIll(Bank.contains((int[])nArray5) ? 1 : 0)) {
            lIlllIIIllIIII = new DHelper(llIIIlIIl[11], llIIIlIIl[12], llIIIlIIl[55]);
            bv.add(lIlllIIIllIIII);

        }
        int[] nArray6 = new int[llIIIlIIl[1]];
        nArray6[aa.llIIIlIIl[0]] = llIIIlIIl[40];
        if (aa.lIlIIlIllIll(Bank.contains((int[])nArray6) ? 1 : 0)) {
            lIlllIIIllIIII = new DHelper(llIIIlIIl[40], llIIIlIIl[1], llIIIlIIl[56]);
            bv.add(lIlllIIIllIIII);

        }
        int[] nArray7 = new int[llIIIlIIl[1]];
        nArray7[aa.llIIIlIIl[0]] = llIIIlIIl[44];
        if (aa.lIlIIlIllIll(Bank.contains((int[])nArray7) ? 1 : 0)) {
            lIlllIIIllIIII = new DHelper(llIIIlIIl[44], llIIIlIIl[1], llIIIlIIl[56]);
            bv.add(lIlllIIIllIIII);

        }
        int[] nArray8 = new int[llIIIlIIl[1]];
        nArray8[aa.llIIIlIIl[0]] = llIIIlIIl[45];
        if (aa.lIlIIlIllIll(Bank.contains((int[])nArray8) ? 1 : 0)) {
            lIlllIIIllIIII = new DHelper(llIIIlIIl[45], llIIIlIIl[1], llIIIlIIl[56]);
            bv.add(lIlllIIIllIIII);

        }
        int[] nArray9 = new int[llIIIlIIl[1]];
        nArray9[aa.llIIIlIIl[0]] = llIIIlIIl[42];
        if (aa.lIlIIlIllIll(Bank.contains((int[])nArray9) ? 1 : 0)) {
            lIlllIIIllIIII = new DHelper(llIIIlIIl[42], llIIIlIIl[1], llIIIlIIl[56]);
            bv.add(lIlllIIIllIIII);

        }
        if (aa.lIlIIlIllllI(Skills.getLevel((Skill)Skill.ATTACK), llIIIlIIl[2])) {
            int[] nArray10 = new int[llIIIlIIl[1]];
            nArray10[aa.llIIIlIIl[0]] = llIIIlIIl[17];
            if (aa.lIlIIlIllIll(Bank.contains((int[])nArray10) ? 1 : 0)) {
                lIlllIIIllIIII = new DHelper(llIIIlIIl[17], llIIIlIIl[1], llIIIlIIl[54]);
                bv.add(lIlllIIIllIIII);

            }
        }
        int[] nArray11 = new int[llIIIlIIl[1]];
        nArray11[aa.llIIIlIIl[0]] = llIIIlIIl[16];
        if (aa.lIlIIlIllIll(Bank.contains((int[])nArray11) ? 1 : 0)) {
            lIlllIIIllIIII = new DHelper(llIIIlIIl[16], llIIIlIIl[1], llIIIlIIl[56]);
            bv.add(lIlllIIIllIIII);

        }
    }

    private static boolean lIlIIlIllllI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIIllIIIlI(Object object, Object object2) {
        return object == object2;
    }

    public static void do() {
        if (aa.lIlIIllIIIIl(Static.getClient().getVar(llIIIlIIl[22]), llIIIlIIl[1])) {
            Static.getClient().invokeMenuAction(llIIIlIII[llIIIlIIl[13]], llIIIlIII[llIIIlIIl[26]], llIIIlIIl[1], MenuAction.CC_OP.getId(), llIIIlIIl[27], llIIIlIIl[28]);
        }
        if (aa.lIlIIlIllIlI(Skills.getLevel((Skill)Skill.ATTACK), llIIIlIIl[10])) {
            String[] stringArray = new String[llIIIlIIl[1]];
            stringArray[aa.llIIIlIIl[0]] = llIIIlIII[llIIIlIIl[29]];
            if (aa.lIlIIlIllIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray2 = new String[llIIIlIIl[1]];
                stringArray2[aa.llIIIlIIl[0]] = llIIIlIII[llIIIlIIl[30]];
                Inventory.getFirst((String[])stringArray2).interact(llIIIlIII[llIIIlIIl[31]]);
            }
        }
        if (aa.lIlIIlIllllI(Skills.getLevel((Skill)Skill.ATTACK), llIIIlIIl[10]) && aa.lIlIIlIllIlI(Skills.getLevel((Skill)Skill.ATTACK), llIIIlIIl[19])) {
            String[] stringArray = new String[llIIIlIIl[1]];
            stringArray[aa.llIIIlIIl[0]] = llIIIlIII[llIIIlIIl[19]];
            if (aa.lIlIIlIllIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray3 = new String[llIIIlIIl[1]];
                stringArray3[aa.llIIIlIIl[0]] = llIIIlIII[llIIIlIIl[32]];
                Inventory.getFirst((String[])stringArray3).interact(llIIIlIII[llIIIlIIl[33]]);
            }
        }
        if (aa.lIlIIlIllllI(Skills.getLevel((Skill)Skill.ATTACK), llIIIlIIl[19]) && aa.lIlIIlIllIlI(Skills.getLevel((Skill)Skill.ATTACK), llIIIlIIl[34])) {
            String[] stringArray = new String[llIIIlIIl[1]];
            stringArray[aa.llIIIlIIl[0]] = llIIIlIII[llIIIlIIl[35]];
            if (aa.lIlIIlIllIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray4 = new String[llIIIlIIl[1]];
                stringArray4[aa.llIIIlIIl[0]] = llIIIlIII[llIIIlIIl[36]];
                Inventory.getFirst((String[])stringArray4).interact(llIIIlIII[llIIIlIIl[37]]);
            }
        }
        if (aa.lIlIIlIllllI(Skills.getLevel((Skill)Skill.ATTACK), llIIIlIIl[34]) && aa.lIlIIlIllIlI(Skills.getLevel((Skill)Skill.ATTACK), llIIIlIIl[2])) {
            int[] nArray = new int[llIIIlIIl[1]];
            nArray[aa.llIIIlIIl[0]] = llIIIlIIl[16];
            if (aa.lIlIIlIllIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[llIIIlIIl[1]];
                nArray2[aa.llIIIlIIl[0]] = llIIIlIIl[16];
                Inventory.getFirst((int[])nArray2).interact(llIIIlIII[llIIIlIIl[38]]);
            }
        }
        if (aa.lIlIIlIllllI(Skills.getLevel((Skill)Skill.ATTACK), llIIIlIIl[2])) {
            int[] nArray = new int[llIIIlIIl[1]];
            nArray[aa.llIIIlIIl[0]] = llIIIlIIl[17];
            if (aa.lIlIIlIllIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray3 = new int[llIIIlIIl[1]];
                nArray3[aa.llIIIlIIl[0]] = llIIIlIIl[17];
                Inventory.getFirst((int[])nArray3).interact(llIIIlIII[llIIIlIIl[39]]);
            }
        }
        if (aa.lIlIIlIllllI(Skills.getLevel((Skill)Skill.DEFENCE), llIIIlIIl[34])) {
            int[] nArray = new int[llIIIlIIl[1]];
            nArray[aa.llIIIlIIl[0]] = llIIIlIIl[40];
            if (aa.lIlIIlIllIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray4 = new int[llIIIlIIl[1]];
                nArray4[aa.llIIIlIIl[0]] = llIIIlIIl[40];
                Inventory.getFirst((int[])nArray4).interact(llIIIlIII[llIIIlIIl[41]]);
            }
            int[] nArray5 = new int[llIIIlIIl[1]];
            nArray5[aa.llIIIlIIl[0]] = llIIIlIIl[42];
            if (aa.lIlIIlIllIIl(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                int[] nArray6 = new int[llIIIlIIl[1]];
                nArray6[aa.llIIIlIIl[0]] = llIIIlIIl[42];
                Inventory.getFirst((int[])nArray6).interact(llIIIlIII[llIIIlIIl[43]]);
            }
            int[] nArray7 = new int[llIIIlIIl[1]];
            nArray7[aa.llIIIlIIl[0]] = llIIIlIIl[44];
            if (aa.lIlIIlIllIIl(Inventory.contains((int[])nArray7) ? 1 : 0)) {
                int[] nArray8 = new int[llIIIlIIl[1]];
                nArray8[aa.llIIIlIIl[0]] = llIIIlIIl[44];
                Inventory.getFirst((int[])nArray8).interact(llIIIlIII[llIIIlIIl[34]]);
            }
            int[] nArray9 = new int[llIIIlIIl[1]];
            nArray9[aa.llIIIlIIl[0]] = llIIIlIIl[45];
            if (aa.lIlIIlIllIIl(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                int[] nArray10 = new int[llIIIlIIl[1]];
                nArray10[aa.llIIIlIIl[0]] = llIIIlIIl[45];
                Inventory.getFirst((int[])nArray10).interact(llIIIlIII[llIIIlIIl[46]]);
            }
        }
        int[] nArray = new int[llIIIlIIl[1]];
        nArray[aa.llIIIlIIl[0]] = llIIIlIIl[47];
        if (aa.lIlIIlIllIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray11 = new int[llIIIlIIl[1]];
            nArray11[aa.llIIIlIIl[0]] = llIIIlIIl[47];
            Inventory.getFirst((int[])nArray11).interact(llIIIlIII[llIIIlIIl[48]]);
        }
        int[] nArray12 = new int[llIIIlIIl[1]];
        nArray12[aa.llIIIlIIl[0]] = llIIIlIIl[49];
        if (aa.lIlIIlIllIIl(Inventory.contains((int[])nArray12) ? 1 : 0)) {
            int[] nArray13 = new int[llIIIlIIl[1]];
            nArray13[aa.llIIIlIIl[0]] = llIIIlIIl[49];
            Inventory.getFirst((int[])nArray13).interact(llIIIlIII[llIIIlIIl[50]]);
        }
    }

    private static boolean lIlIIlIlllII(Object object) {
        return object != null;
    }

    private static boolean lIlIIlIlllIl(int n2) {
        return n2 > 0;
    }

    public static void dq() {
        if (aa.lIlIIlIllIlI(Skills.getLevel((Skill)Skill.DEFENCE), llIIIlIIl[2])) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FOURTH);
        }
    }

    private static int lIlIIlIllIII(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean lIlIIllIIIIl(int n2, int n3) {
        return n2 == n3;
    }
}

