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
package l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-;

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
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.a;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.b;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.d;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.e;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.f;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.j;
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
public class aa
implements W {
    public static /* synthetic */ int[] kE;
    public static /* synthetic */ WorldArea kG;
    public static /* synthetic */ WorldArea kH;
    public static /* synthetic */ List<d> bv;
    public static /* synthetic */ WorldPoint kI;
    public static /* synthetic */ WorldPoint bx;
    public static /* synthetic */ boolean bt;
    private static /* synthetic */ String[] llIIIlIII;
    private static /* synthetic */ int[] llIIIlIIl;
    public static /* synthetic */ WorldArea kF;
    public static /* synthetic */ WorldPoint kJ;

    private static boolean lIlIIlIllIlI(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public String U() {
        return llIIIlIII[llIIIlIIl[57]];
    }

    public static void aa() {
        if (aa.lIlIIlIllIll(kG.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderEasyClues.c = llIIIlIII[llIIIlIIl[20]];
            Movement.walkTo((WorldPoint)bx);
            0;
            Time.sleepTicks((int)llIIIlIIl[1]);
            0;
        }
        if (aa.lIlIIlIllIIl(kG.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderEasyClues.c = llIIIlIII[llIIIlIIl[21]];
            if (aa.lIlIIllIIIII(Players.getLocal().getInteracting())) {
                NPC lIlllIIIllIIll = NPCs.getNearest(nPC -> {
                    int n2;
                    if (aa.lIlIIlIllIIl(nPC.getName().contains(llIIIlIII[llIIIlIIl[58]]) ? 1 : 0) && aa.lIlIIllIIIII(nPC.getInteracting()) && aa.lIlIIlIllIll(nPC.isDead() ? 1 : 0)) {
                        n2 = llIIIlIIl[1];
                        0;
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
                        0;
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
                    0;
                }
                if (aa.lIlIIlIlllII(lIlllIIIllIIll) && aa.lIlIIlIllIll(Players.getLocal().isMoving() ? 1 : 0) && aa.lIlIIlIllIIl(lIlllIIIllIIlI.isEmpty() ? 1 : 0)) {
                    lIlllIIIllIIll.interact(llIIIlIII[llIIIlIIl[25]]);
                    Time.sleepTicks((int)llIIIlIIl[3]);
                    0;
                }
            }
            if (aa.lIlIIlIlllII(Players.getLocal().getInteracting())) {
                Time.sleepTicks((int)llIIIlIIl[6]);
                0;
            }
        }
    }

    private static void lIlIIlIlIlll() {
        llIIIlIIl = new int[72];
        aa.llIIIlIIl[0] = (50 + 106 - 89 + 159 ^ 171 + 93 - 208 + 128) & (142 + 90 - 75 + 40 ^ 37 + 152 - 179 + 149 ^ -1) & ((0x1F ^ 7 ^ (0x51 ^ 0x70)) & (0xCE ^ 0x9B ^ (0xF8 ^ 0x94) ^ -1) ^ -1);
        aa.llIIIlIIl[1] = 1;
        aa.llIIIlIIl[2] = 0x5A ^ 0x44 ^ (0x55 ^ 0x63);
        aa.llIIIlIIl[3] = 2;
        aa.llIIIlIIl[4] = 3;
        aa.llIIIlIIl[5] = 0xFFFFF79C & 0x1BEB;
        aa.llIIIlIIl[6] = 0x5F ^ 0x5B;
        aa.llIIIlIIl[7] = 0xFFFFB7F7 & 0x4BEB;
        aa.llIIIlIIl[8] = -(0xFFFFE6D1 & 0x7D3F) & (0xFFFFE7F8 & Short.MAX_VALUE);
        aa.llIIIlIIl[9] = -(0xFFFFF179 & 0x6E97) & (0xFFFFFFDF & 0x7F77);
        aa.llIIIlIIl[10] = 0xBA ^ 0xBF;
        aa.llIIIlIIl[11] = -(0xFFFFFEA7 & 0xDDD) & (0xFFFFDFFF & 0x2DFF);
        aa.llIIIlIIl[12] = 0xF6 ^ 0x92;
        aa.llIIIlIIl[13] = 11 + 96 - 11 + 58 ^ 68 + 2 - 51 + 130;
        aa.llIIIlIIl[14] = 0x20 ^ 0x26;
        aa.llIIIlIIl[15] = 3 ^ 4;
        aa.llIIIlIIl[16] = -(0xFFFFFF5D & 0x7AEF) & (0xFFFFFF7F & Short.MAX_VALUE);
        aa.llIIIlIIl[17] = 0xFFFF97B7 & 0x6D7D;
        aa.llIIIlIIl[18] = 0x23 ^ 0x2B;
        aa.llIIIlIIl[19] = 172 + 40 - 191 + 189 ^ 18 + 144 - -16 + 20;
        aa.llIIIlIIl[20] = 0xB5 ^ 0xBC;
        aa.llIIIlIIl[21] = 0x99 ^ 0x93;
        aa.llIIIlIIl[22] = 0xAB ^ 0xA0;
        aa.llIIIlIIl[23] = 93 + 122 - 67 + 53 ^ 11 + 16 - 14 + 184;
        aa.llIIIlIIl[24] = 0x53 ^ 0x3A ^ (0x39 ^ 0x5D);
        aa.llIIIlIIl[25] = 0xDB ^ 0xA7 ^ (0x3F ^ 0x4D);
        aa.llIIIlIIl[26] = 0x4A ^ 0x5A;
        aa.llIIIlIIl[27] = -1;
        aa.llIIIlIIl[28] = -(0xFFFF86C2 & Short.MAX_VALUE) & (0xFFFF9EFF & 0x25167DF);
        aa.llIIIlIIl[29] = 0xB ^ 0x1A;
        aa.llIIIlIIl[30] = 4 ^ 0x42 ^ (0xD5 ^ 0x81);
        aa.llIIIlIIl[31] = 0x27 ^ 0x34;
        aa.llIIIlIIl[32] = 0xAA ^ 0xBF;
        aa.llIIIlIIl[33] = 26 + 115 - 90 + 107 ^ 8 + 55 - -35 + 38;
        aa.llIIIlIIl[34] = 0xAF ^ 0xB1;
        aa.llIIIlIIl[35] = 142 + 50 - 47 + 20 ^ 50 + 160 - 89 + 57;
        aa.llIIIlIIl[36] = 0x3B ^ 0x23;
        aa.llIIIlIIl[37] = 0xAD ^ 0xB4;
        aa.llIIIlIIl[38] = 0x82 ^ 0x98;
        aa.llIIIlIIl[39] = 0x7F ^ 0x64;
        aa.llIIIlIIl[40] = -(0xFFFFEFB3 & 0x7B7F) & (0xFFFFEFFF & 0x7FBB);
        aa.llIIIlIIl[41] = 9 ^ 0x52 ^ (0x18 ^ 0x5F);
        aa.llIIIlIIl[42] = -(0xFFFFFB97 & 0x7F69) & (0xFFFFFF63 & Short.MAX_VALUE);
        aa.llIIIlIIl[43] = 1 ^ 0x25 ^ (0x2B ^ 0x12);
        aa.llIIIlIIl[44] = -(0xFFFFFFAF & 0x5BD7) & (0xFFFFFFBF & 0x5FF7);
        aa.llIIIlIIl[45] = -(0xFFFFFAD5 & 0x7F6B) & (0xFFFFFFEF & 0x7EFF);
        aa.llIIIlIIl[46] = 0x5C ^ 0x58 ^ (0x25 ^ 0x3E);
        aa.llIIIlIIl[47] = -(0xFFFFD97D & 0x6797) & (0xFFFFDFFD & 0x67BE);
        aa.llIIIlIIl[48] = 149 + 116 - 197 + 97 ^ 60 + 99 - 59 + 33;
        aa.llIIIlIIl[49] = 0xFFFFEF7E & 0x3BF7;
        aa.llIIIlIIl[50] = 128 + 34 - 74 + 77 ^ 70 + 113 - 90 + 39;
        aa.llIIIlIIl[51] = 0xFFFFABC4 & 0x57BF;
        aa.llIIIlIIl[52] = 0xFFFFFF4D & 0x1FFA;
        aa.llIIIlIIl[53] = 0xFFFFCDB8 & 0xBAFF;
        aa.llIIIlIIl[54] = -(0xFFFFDC57 & 0x37BF) & (0xFFFFF5BF & 0x7FFE);
        aa.llIIIlIIl[55] = 0xFFFFF3F5 & 0xDFE;
        aa.llIIIlIIl[56] = 0xFFFFFAD8 & 0x3FBF;
        aa.llIIIlIIl[57] = 0x81 ^ 0xA3;
        aa.llIIIlIIl[58] = 0xA6 ^ 0x85;
        aa.llIIIlIIl[59] = -(0xFFFFDF6F & 0x63F3) & (0xFFFFDFFF & 0x6FFB);
        aa.llIIIlIIl[60] = 0xFFFFACDF & 0x5FFA;
        aa.llIIIlIIl[61] = 0xFFFFAFFF & 0x5CAC;
        aa.llIIIlIIl[62] = -(0xFFFFB2BA & 0x7D6D) & (0xFFFFBDFF & 0x7EF7);
        aa.llIIIlIIl[63] = 0xFFFF9F7F & 0x6CF1;
        aa.llIIIlIIl[64] = -(0xFFFFBF13 & 0x73ED) & (0xFFFFFFDF & 0x3F7F);
        aa.llIIIlIIl[65] = 0x88 ^ 0xB3 ^ (0xD ^ 6);
        aa.llIIIlIIl[66] = 0xFFFFFF8F & 0xCFD;
        aa.llIIIlIIl[67] = 0xFFFFBE7D & 0x4DEF;
        aa.llIIIlIIl[68] = -(0xFFFFFFE2 & 0x521F) & (0xFFFFDFF7 & 0x7EBF);
        aa.llIIIlIIl[69] = 0xFFFFDDFF & 0x2E9F;
        aa.llIIIlIIl[70] = 0xFFFFFEF5 & 0xDEA;
        aa.llIIIlIIl[71] = 0x10 ^ 0x34;
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
                                0;
                            }
                            if (aa.lIlIIlIllIIl(Bank.isOpen() ? 1 : 0)) {
                                if (aa.lIlIIlIlllIl(Inventory.getAll().size())) {
                                    Bank.depositInventory();
                                    Time.sleepTicks((int)llIIIlIIl[1]);
                                    0;
                                }
                                if (aa.lIlIIlIlllIl(Equipment.getAll().size())) {
                                    Bank.depositEquipment();
                                    Time.sleepTicks((int)llIIIlIIl[3]);
                                    0;
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
                    0;
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
            0;
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
            0;
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

    private static String lIlIIlIlIIlI(String lIlllIIIIlIIll, String lIlllIIIIlIlII) {
        try {
            SecretKeySpec lIlllIIIIllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlllIIIIlIlII.getBytes(StandardCharsets.UTF_8)), llIIIlIIl[18]), "DES");
            Cipher lIlllIIIIlIlll = Cipher.getInstance("DES");
            lIlllIIIIlIlll.init(llIIIlIIl[3], lIlllIIIIllIII);
            return new String(lIlllIIIIlIlll.doFinal(Base64.getDecoder().decode(lIlllIIIIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlllIIIIlIllI) {
            lIlllIIIIlIllI.printStackTrace();
            return null;
        }
    }

    private static String lIlIIlIlIIll(String lIlllIIIIIIIII, String lIlllIIIIIIlII) {
        lIlllIIIIIIIII = new String(Base64.getDecoder().decode(lIlllIIIIIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIlllIIIIIIIll = new StringBuilder();
        char[] lIlllIIIIIIIlI = lIlllIIIIIIlII.toCharArray();
        int lIlllIIIIIIIIl = llIIIlIIl[0];
        char[] lIllIllllllIll = lIlllIIIIIIIII.toCharArray();
        int lIllIllllllIlI = lIllIllllllIll.length;
        int lIllIllllllIIl = llIIIlIIl[0];
        while (aa.lIlIIlIllIlI(lIllIllllllIIl, lIllIllllllIlI)) {
            char lIlllIIIIIIllI = lIllIllllllIll[lIllIllllllIIl];
            lIlllIIIIIIIll.append((char)(lIlllIIIIIIllI ^ lIlllIIIIIIIlI[lIlllIIIIIIIIl % lIlllIIIIIIIlI.length]));
            0;
            ++lIlllIIIIIIIIl;
            ++lIllIllllllIIl;
            0;
            
            return null;
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
                                                    0;
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
            0;
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
                                                    0;
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
                0;
                if (null == null) return n2 != 0;
                return false;
            }
        }
        n2 = llIIIlIIl[0];
        return n2 != 0;
    }

    private static void lIlIIlIlIllI() {
        llIIIlIII = new String[llIIIlIIl[71]];
        aa.llIIIlIII[aa.llIIIlIIl[0]] = aa."Buying items";
        aa.llIIIlIII[aa.llIIIlIIl[1]] = aa."Finished buying items, switching back to melee training";
        aa.llIIIlIII[aa.llIIIlIIl[3]] = aa."Navigating to bank";
        aa.llIIIlIII[aa.llIIIlIIl[4]] = aa."Handling banking";
        aa.llIIIlIII[aa.llIIIlIIl[6]] = aa."We are missing supplies, switching to BUYING";
        aa.llIIIlIII[aa.llIIIlIIl[10]] = aa."Iron scimitar";
        aa.llIIIlIII[aa.llIIIlIIl[14]] = aa."Steel scimitar";
        aa.llIIIlIII[aa.llIIIlIIl[15]] = aa."Mithril scimitar";
        aa.llIIIlIII[aa.llIIIlIIl[18]] = aa."Eat";
        aa.llIIIlIII[aa.llIIIlIIl[20]] = aa."Walking to cow area";
        aa.llIIIlIII[aa.llIIIlIIl[21]] = aa."Killing cows";
        aa.llIIIlIII[aa.llIIIlIIl[22]] = aa."Cow";
        aa.llIIIlIII[aa.llIIIlIIl[23]] = aa."cow";
        aa.llIIIlIII[aa.llIIIlIIl[24]] = aa."Attack";
        aa.llIIIlIII[aa.llIIIlIIl[25]] = aa."Attack";
        aa.llIIIlIII[aa.llIIIlIIl[13]] = aa."Auto retaliate";
        aa.llIIIlIII[aa.llIIIlIIl[26]] = aa."";
        aa.llIIIlIII[aa.llIIIlIIl[29]] = aa."Iron scimitar";
        aa.llIIIlIII[aa.llIIIlIIl[30]] = aa."Iron scimitar";
        aa.llIIIlIII[aa.llIIIlIIl[31]] = aa."Wield";
        aa.llIIIlIII[aa.llIIIlIIl[19]] = aa."Steel scimitar";
        aa.llIIIlIII[aa.llIIIlIIl[32]] = aa."Steel scimitar";
        aa.llIIIlIII[aa.llIIIlIIl[33]] = aa."Wield";
        aa.llIIIlIII[aa.llIIIlIIl[35]] = aa."Mithril scimitar";
        aa.llIIIlIII[aa.llIIIlIIl[36]] = aa."Mithril scimitar";
        aa.llIIIlIII[aa.llIIIlIIl[37]] = aa."Wield";
        aa.llIIIlIII[aa.llIIIlIIl[38]] = aa."Wield";
        aa.llIIIlIII[aa.llIIIlIIl[39]] = aa."Wield";
        aa.llIIIlIII[aa.llIIIlIIl[41]] = aa."Wear";
        aa.llIIIlIII[aa.llIIIlIIl[43]] = aa."Wear";
        aa.llIIIlIII[aa.llIIIlIIl[34]] = aa."Wear";
        aa.llIIIlIII[aa.llIIIlIIl[46]] = aa."Wear";
        aa.llIIIlIII[aa.llIIIlIIl[48]] = aa."Wear";
        aa.llIIIlIII[aa.llIIIlIIl[50]] = aa."Wear";
        aa.llIIIlIII[aa.llIIIlIIl[57]] = aa."40 Def";
        aa.llIIIlIII[aa.llIIIlIIl[58]] = aa."Cow";
    }

    public static void af() {
        d lIlllIIIllIIII;
        int[] nArray = new int[llIIIlIIl[1]];
        nArray[aa.llIIIlIIl[0]] = llIIIlIIl[9];
        if (aa.lIlIIlIllIll(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(llIIIlIIl[9], llIIIlIIl[2], llIIIlIIl[51]);
            bv.add(d2);
            0;
        }
        int[] nArray2 = new int[llIIIlIIl[1]];
        nArray2[aa.llIIIlIIl[0]] = llIIIlIIl[52];
        if (aa.lIlIIlIllIll(Bank.contains((int[])nArray2) ? 1 : 0)) {
            lIlllIIIllIIII = new d(llIIIlIIl[52], llIIIlIIl[10], llIIIlIIl[51]);
            bv.add(lIlllIIIllIIII);
            0;
        }
        int[] nArray3 = new int[llIIIlIIl[1]];
        nArray3[aa.llIIIlIIl[0]] = llIIIlIIl[49];
        if (aa.lIlIIlIllIll(Bank.contains((int[])nArray3) ? 1 : 0)) {
            lIlllIIIllIIII = new d(llIIIlIIl[49], llIIIlIIl[1], llIIIlIIl[53]);
            bv.add(lIlllIIIllIIII);
            0;
        }
        int[] nArray4 = new int[llIIIlIIl[1]];
        nArray4[aa.llIIIlIIl[0]] = llIIIlIIl[47];
        if (aa.lIlIIlIllIll(Bank.contains((int[])nArray4) ? 1 : 0)) {
            lIlllIIIllIIII = new d(llIIIlIIl[47], llIIIlIIl[1], llIIIlIIl[54]);
            bv.add(lIlllIIIllIIII);
            0;
        }
        int[] nArray5 = new int[llIIIlIIl[1]];
        nArray5[aa.llIIIlIIl[0]] = llIIIlIIl[11];
        if (aa.lIlIIlIllIll(Bank.contains((int[])nArray5) ? 1 : 0)) {
            lIlllIIIllIIII = new d(llIIIlIIl[11], llIIIlIIl[12], llIIIlIIl[55]);
            bv.add(lIlllIIIllIIII);
            0;
        }
        int[] nArray6 = new int[llIIIlIIl[1]];
        nArray6[aa.llIIIlIIl[0]] = llIIIlIIl[40];
        if (aa.lIlIIlIllIll(Bank.contains((int[])nArray6) ? 1 : 0)) {
            lIlllIIIllIIII = new d(llIIIlIIl[40], llIIIlIIl[1], llIIIlIIl[56]);
            bv.add(lIlllIIIllIIII);
            0;
        }
        int[] nArray7 = new int[llIIIlIIl[1]];
        nArray7[aa.llIIIlIIl[0]] = llIIIlIIl[44];
        if (aa.lIlIIlIllIll(Bank.contains((int[])nArray7) ? 1 : 0)) {
            lIlllIIIllIIII = new d(llIIIlIIl[44], llIIIlIIl[1], llIIIlIIl[56]);
            bv.add(lIlllIIIllIIII);
            0;
        }
        int[] nArray8 = new int[llIIIlIIl[1]];
        nArray8[aa.llIIIlIIl[0]] = llIIIlIIl[45];
        if (aa.lIlIIlIllIll(Bank.contains((int[])nArray8) ? 1 : 0)) {
            lIlllIIIllIIII = new d(llIIIlIIl[45], llIIIlIIl[1], llIIIlIIl[56]);
            bv.add(lIlllIIIllIIII);
            0;
        }
        int[] nArray9 = new int[llIIIlIIl[1]];
        nArray9[aa.llIIIlIIl[0]] = llIIIlIIl[42];
        if (aa.lIlIIlIllIll(Bank.contains((int[])nArray9) ? 1 : 0)) {
            lIlllIIIllIIII = new d(llIIIlIIl[42], llIIIlIIl[1], llIIIlIIl[56]);
            bv.add(lIlllIIIllIIII);
            0;
        }
        if (aa.lIlIIlIllllI(Skills.getLevel((Skill)Skill.ATTACK), llIIIlIIl[2])) {
            int[] nArray10 = new int[llIIIlIIl[1]];
            nArray10[aa.llIIIlIIl[0]] = llIIIlIIl[17];
            if (aa.lIlIIlIllIll(Bank.contains((int[])nArray10) ? 1 : 0)) {
                lIlllIIIllIIII = new d(llIIIlIIl[17], llIIIlIIl[1], llIIIlIIl[54]);
                bv.add(lIlllIIIllIIII);
                0;
            }
        }
        int[] nArray11 = new int[llIIIlIIl[1]];
        nArray11[aa.llIIIlIIl[0]] = llIIIlIIl[16];
        if (aa.lIlIIlIllIll(Bank.contains((int[])nArray11) ? 1 : 0)) {
            lIlllIIIllIIII = new d(llIIIlIIl[16], llIIIlIIl[1], llIIIlIIl[56]);
            bv.add(lIlllIIIllIIII);
            0;
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

    private static String lIlIIlIlIlII(String lIlllIIIlIIIlI, String lIlllIIIIlllll) {
        try {
            SecretKeySpec lIlllIIIlIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlllIIIIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlllIIIlIIlII = Cipher.getInstance("Blowfish");
            lIlllIIIlIIlII.init(llIIIlIIl[3], lIlllIIIlIIlIl);
            return new String(lIlllIIIlIIlII.doFinal(Base64.getDecoder().decode(lIlllIIIlIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlllIIIlIIIll) {
            lIlllIIIlIIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIllIIIIl(int n2, int n3) {
        return n2 == n3;
    }
}

