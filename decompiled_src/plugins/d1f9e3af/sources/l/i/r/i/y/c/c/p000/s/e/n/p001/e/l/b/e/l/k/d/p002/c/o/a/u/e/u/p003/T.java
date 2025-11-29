package l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003;

import gg.squire.account.AccBuilderEasyClues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;
import net.unethicalite.api.widgets.Dialog;
/* renamed from: l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.T  reason: invalid package */
/* loaded from: d1f9e3af-c0a5-49dd-86b2-8e857984fef3.jar:l/i/r/i/y/c/c/-/s/e/n/-/e/l/b/e/l/k/d/-/c/o/a/u/e/u/-/T.class */
public class T implements W {
    static /* synthetic */ boolean kg;
    static /* synthetic */ boolean kh;
    static /* synthetic */ boolean ke;
    static /* synthetic */ boolean jZ;
    private static /* synthetic */ int[] lIIIllllI;
    static /* synthetic */ boolean kb;
    static /* synthetic */ boolean kd;
    static /* synthetic */ WorldPoint jT;
    static /* synthetic */ boolean ka;
    static /* synthetic */ String[] bR;
    static /* synthetic */ boolean kj;
    static /* synthetic */ WorldPoint jR;
    static /* synthetic */ boolean ki;
    public static /* synthetic */ boolean bt;
    static /* synthetic */ int cl;
    static /* synthetic */ boolean kf;
    static /* synthetic */ WorldArea jV;
    static /* synthetic */ boolean cm;
    static /* synthetic */ WorldPoint jU;
    static /* synthetic */ WorldPoint bX;
    static /* synthetic */ boolean kc;
    static /* synthetic */ WorldPoint cj;
    static /* synthetic */ int kk;
    public static /* synthetic */ List<C0003d> bv;
    static /* synthetic */ WorldArea jX;
    private static /* synthetic */ String[] lIIIlllII;
    static /* synthetic */ WorldArea jW;
    static /* synthetic */ WorldPoint jS;
    static /* synthetic */ boolean jY;
    static /* synthetic */ WorldPoint jQ;

    private static String lllIlIlllII(String lIIIlIlllIIlIlI, String lIIIlIlllIIlIIl) {
        try {
            SecretKeySpec lIIIlIlllIIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIIlIlllIIlIIl.getBytes(StandardCharsets.UTF_8)), lIIIllllI[24]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIIllllI[5], lIIIlIlllIIllIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIIIlIlllIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIIlIlllIIlIll) {
            lIIIlIlllIIlIll.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private static boolean ab() {
        int[] iArr = new int[lIIIllllI[11]];
        iArr[lIIIllllI[9]] = lIIIllllI[12];
        iArr[lIIIllllI[4]] = lIIIllllI[13];
        iArr[lIIIllllI[5]] = lIIIllllI[14];
        iArr[lIIIllllI[6]] = lIIIllllI[15];
        iArr[lIIIllllI[7]] = lIIIllllI[16];
        int i = lIIIllllI[9];
        while (lllIlllIllI(i, iArr.length)) {
            int[] iArr2 = new int[lIIIllllI[4]];
            iArr2[lIIIllllI[9]] = iArr[i];
            if (lllIlllIlll(Inventory.contains(iArr2) ? 1 : 0)) {
                return lIIIllllI[9];
            }
            i++;
            "".length();
            if (" ".length() >= (162 ^ 166)) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return lIIIllllI[4];
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x01b7, code lost:
        if (lllIlllIllI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.T.lIIIllllI[7]) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0060, code lost:
        if (lllIlllIllI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.T.lIIIllllI[26]) != false) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void af() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5 = new int[lIIIllllI[4]];
        iArr5[lIIIllllI[9]] = lIIIllllI[18];
        if (lllIlllIlIl(Bank.contains(iArr5) ? 1 : 0)) {
            int[] iArr6 = new int[lIIIllllI[4]];
            iArr6[lIIIllllI[9]] = lIIIllllI[18];
            if (lllIlllIlIl(Bank.contains(iArr6) ? 1 : 0)) {
                int[] iArr7 = new int[lIIIllllI[4]];
                iArr7[lIIIllllI[9]] = lIIIllllI[18];
            }
            iArr = new int[lIIIllllI[4]];
            iArr[lIIIllllI[9]] = lIIIllllI[21];
            if (lllIlllIlll(Bank.contains(iArr) ? 1 : 0)) {
                bv.add(new C0003d(lIIIllllI[21], lIIIllllI[4], lIIIllllI[250]));
                "".length();
            }
            iArr2 = new int[lIIIllllI[4]];
            iArr2[lIIIllllI[9]] = lIIIllllI[13];
            if (lllIlllIlll(Bank.contains(iArr2) ? 1 : 0)) {
                bv.add(new C0003d(lIIIllllI[13], lIIIllllI[54], lIIIllllI[251]));
                "".length();
            }
            if (lllIlllIlll(Bank.contains(item -> {
                return item.getName().toLowerCase().contains(lIIIlllII[lIIIllllI[256]]);
            }) ? 1 : 0)) {
                bv.add(new C0003d(lIIIllllI[252], lIIIllllI[11], lIIIllllI[253]));
                "".length();
            }
            iArr3 = new int[lIIIllllI[4]];
            iArr3[lIIIllllI[9]] = lIIIllllI[15];
            if (lllIlllIlIl(Bank.contains(iArr3) ? 1 : 0)) {
                int[] iArr8 = new int[lIIIllllI[4]];
                iArr8[lIIIllllI[9]] = lIIIllllI[15];
                if (lllIlllIlIl(Bank.contains(iArr8) ? 1 : 0)) {
                    int[] iArr9 = new int[lIIIllllI[4]];
                    iArr9[lIIIllllI[9]] = lIIIllllI[15];
                }
                iArr4 = new int[lIIIllllI[4]];
                iArr4[lIIIllllI[9]] = lIIIllllI[12];
                if (lllIlllIlll(Bank.contains(iArr4) ? 1 : 0)) {
                    bv.add(new C0003d(lIIIllllI[12], lIIIllllI[19], lIIIllllI[254]));
                    "".length();
                    return;
                }
                return;
            }
            bv.add(new C0003d(lIIIllllI[15], lIIIllllI[7], C0008i.bq));
            "".length();
            iArr4 = new int[lIIIllllI[4]];
            iArr4[lIIIllllI[9]] = lIIIllllI[12];
            if (lllIlllIlll(Bank.contains(iArr4) ? 1 : 0)) {
            }
        }
        bv.add(new C0003d(lIIIllllI[18], lIIIllllI[54], lIIIllllI[249]));
        "".length();
        iArr = new int[lIIIllllI[4]];
        iArr[lIIIllllI[9]] = lIIIllllI[21];
        if (lllIlllIlll(Bank.contains(iArr) ? 1 : 0)) {
        }
        iArr2 = new int[lIIIllllI[4]];
        iArr2[lIIIllllI[9]] = lIIIllllI[13];
        if (lllIlllIlll(Bank.contains(iArr2) ? 1 : 0)) {
        }
        if (lllIlllIlll(Bank.contains(item2 -> {
            return item2.getName().toLowerCase().contains(lIIIlllII[lIIIllllI[256]]);
        }) ? 1 : 0)) {
        }
        iArr3 = new int[lIIIllllI[4]];
        iArr3[lIIIllllI[9]] = lIIIllllI[15];
        if (lllIlllIlIl(Bank.contains(iArr3) ? 1 : 0)) {
        }
        bv.add(new C0003d(lIIIllllI[15], lIIIllllI[7], C0008i.bq));
        "".length();
        iArr4 = new int[lIIIllllI[4]];
        iArr4[lIIIllllI[9]] = lIIIllllI[12];
        if (lllIlllIlll(Bank.contains(iArr4) ? 1 : 0)) {
        }
    }

    private static int lllIlllIIll(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:395:0x17e3, code lost:
        if (lllIllllIII(net.unethicalite.api.entities.TileObjects.getNearest(r0)) != false) goto L416;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1018, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1099, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1179, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1244, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1274, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1356, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1518, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1540, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1542, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1544, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1546, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1548, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1550, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1552, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1554, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1556, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1558, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v156, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1560, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1562, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1564, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1566, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1568, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1570, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1572, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1574, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1576, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1578, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1580, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1582, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1584, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1586, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v671, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v715, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v798, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v949, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void cZ() {
        System.out.println("6073: " + Vars.getBit(lIIIllllI[0]));
        System.out.println("6072: " + Vars.getBit(lIIIllllI[1]));
        System.out.println("6074: " + Vars.getBit(lIIIllllI[2]));
        System.out.println("6075: " + Vars.getBit(lIIIllllI[3]));
        if (lllIlllIlII(Vars.getBit(lIIIllllI[3]), lIIIllllI[4])) {
            jY = lIIIllllI[4];
        }
        if (lllIlllIlII(Vars.getBit(lIIIllllI[1]), lIIIllllI[4])) {
            ka = lIIIllllI[4];
        }
        if (lllIlllIlII(Vars.getBit(lIIIllllI[1]), lIIIllllI[5])) {
            ka = lIIIllllI[4];
            kf = lIIIllllI[4];
        }
        if (lllIlllIlII(Vars.getBit(lIIIllllI[1]), lIIIllllI[6])) {
            ka = lIIIllllI[4];
            ki = lIIIllllI[4];
            kf = lIIIllllI[4];
        }
        if (lllIlllIlII(Vars.getBit(lIIIllllI[0]), lIIIllllI[4])) {
            kb = lIIIllllI[4];
        }
        if (lllIlllIlII(Vars.getBit(lIIIllllI[0]), lIIIllllI[5])) {
            ke = lIIIllllI[4];
            kb = lIIIllllI[4];
        }
        if (lllIlllIlII(Vars.getBit(lIIIllllI[0]), lIIIllllI[6])) {
            ke = lIIIllllI[4];
            kg = lIIIllllI[4];
            kb = lIIIllllI[4];
        }
        if (lllIlllIlII(Vars.getBit(lIIIllllI[2]), lIIIllllI[5])) {
            jZ = lIIIllllI[4];
        }
        if (lllIlllIlII(Vars.getBit(lIIIllllI[2]), lIIIllllI[6])) {
            kc = lIIIllllI[4];
            jZ = lIIIllllI[4];
        }
        if (lllIlllIlII(Vars.getBit(lIIIllllI[2]), lIIIllllI[7])) {
            kd = lIIIllllI[4];
            jZ = lIIIllllI[4];
            kc = lIIIllllI[4];
        }
        if (lllIlllIlII(Vars.getBit(lIIIllllI[2]), lIIIllllI[8])) {
            kd = lIIIllllI[4];
            jZ = lIIIllllI[4];
            kh = lIIIllllI[4];
            kc = lIIIllllI[4];
        }
        if (lllIlllIlIl(bt ? 1 : 0)) {
            C0001b.a(bv);
            if (lllIlllIllI(bv.size(), lIIIllllI[4])) {
                System.out.println(lIIIlllII[lIIIllllI[9]]);
                bt = lIIIllllI[9];
            }
        }
        if (lllIlllIlll(bt ? 1 : 0)) {
            if (lllIlllIlll(ab() ? 1 : 0) && lllIlllIlll(Vars.getBit(QuestVarbits.QUEST_THE_CORSAIR_CURSE.getId()))) {
                BankLocation nearest = BankLocation.getNearest();
                if (lllIllllIII(nearest) && lllIlllIlll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[4]];
                    C0000a.a(nearest);
                }
                if (lllIllllIII(nearest) && lllIlllIlIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lllIlllIlll(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIIIllllI[10]);
                        "".length();
                    }
                    if (lllIlllIlIl(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[5]];
                        if (lllIllllIIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIIIllllI[7]);
                            "".length();
                        }
                        if (lllIllllIIl(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIIIllllI[5]);
                            "".length();
                        }
                        int[] iArr = new int[lIIIllllI[11]];
                        iArr[lIIIllllI[9]] = lIIIllllI[12];
                        iArr[lIIIllllI[4]] = lIIIllllI[13];
                        iArr[lIIIllllI[5]] = lIIIllllI[14];
                        iArr[lIIIllllI[6]] = lIIIllllI[15];
                        iArr[lIIIllllI[7]] = lIIIllllI[16];
                        if (lllIlllIlll(C0004e.b(iArr) ? 1 : 0)) {
                            af();
                            System.out.println(lIIIlllII[lIIIllllI[6]]);
                            bt = lIIIllllI[4];
                            return;
                        }
                        int[] iArr2 = new int[lIIIllllI[11]];
                        iArr2[lIIIllllI[9]] = lIIIllllI[12];
                        iArr2[lIIIllllI[4]] = lIIIllllI[13];
                        iArr2[lIIIllllI[5]] = lIIIllllI[14];
                        iArr2[lIIIllllI[6]] = lIIIllllI[15];
                        iArr2[lIIIllllI[7]] = lIIIllllI[16];
                        if (lllIlllIlIl(C0004e.b(iArr2) ? 1 : 0)) {
                            C0000a.a(lIIIllllI[12], lIIIllllI[17]);
                            C0000a.a(lIIIllllI[13], lIIIllllI[17]);
                            C0000a.a(lIIIllllI[14], lIIIllllI[4]);
                            C0000a.a(lIIIllllI[16], lIIIllllI[4]);
                            C0000a.a(lIIIllllI[15], lIIIllllI[5]);
                            C0000a.a(lIIIllllI[18], lIIIllllI[17]);
                            if (lllIlllIllI(Skills.getLevel(Skill.ATTACK), lIIIllllI[19])) {
                                C0000a.a(lIIIllllI[20], lIIIllllI[4]);
                                "".length();
                                if ("  ".length() <= 0) {
                                    return;
                                }
                            } else {
                                C0000a.a(lIIIllllI[21], lIIIllllI[4]);
                            }
                        }
                    }
                }
            }
            if (lllIlllIlIl(Inventory.contains(C0005f.aV) ? 1 : 0) && lllIlllIllI(Movement.getRunEnergy(), lIIIllllI[22])) {
                Inventory.getFirst(C0005f.aV).interact(lIIIlllII[lIIIllllI[7]]);
                Time.sleepTicks(lIIIllllI[4]);
                "".length();
            }
            if (lllIlllIlIl(ab() ? 1 : 0) && lllIlllIlll(Vars.getBit(QuestVarbits.QUEST_THE_CORSAIR_CURSE.getId()))) {
                if (lllIllllIlI(Players.getLocal().getWorldLocation().distanceTo(bX), lIIIllllI[17])) {
                    AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[11]];
                    if (lllIlllIlIl(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    Movement.walkTo(bX);
                    "".length();
                    Time.sleepTicks(lIIIllllI[4]);
                    "".length();
                }
                if (lllIllllIll(Players.getLocal().getWorldLocation().distanceTo(bX), lIIIllllI[17])) {
                    AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[8]];
                    C0006g.a(lIIIlllII[lIIIllllI[23]], bR);
                }
            }
            if (lllIlllIlII(Vars.getBit(QuestVarbits.QUEST_THE_CORSAIR_CURSE.getId()), lIIIllllI[11])) {
                C0006g.a(bR);
            }
            if (lllIlllIlII(Vars.getBit(QuestVarbits.QUEST_THE_CORSAIR_CURSE.getId()), lIIIllllI[17])) {
                if (lllIllllIlI(Players.getLocal().getWorldLocation().distanceTo(jQ), lIIIllllI[11])) {
                    AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[24]];
                    Movement.walkTo(jQ);
                    "".length();
                    Time.sleepTicks(lIIIllllI[4]);
                    "".length();
                }
                if (lllIllllIll(Players.getLocal().getWorldLocation().distanceTo(jQ), lIIIllllI[11])) {
                    AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[25]];
                    C0006g.a(lIIIlllII[lIIIllllI[17]], bR);
                }
            }
            if (lllIlllIlII(Vars.getBit(QuestVarbits.QUEST_THE_CORSAIR_CURSE.getId()), lIIIllllI[26])) {
                cl = lIIIllllI[9];
                if (lllIlllIlIl(Players.getLocal().getWorldLocation().equals(new WorldPoint(lIIIllllI[27], lIIIllllI[28], lIIIllllI[4])) ? 1 : 0)) {
                    String[] strArr = new String[lIIIllllI[4]];
                    strArr[lIIIllllI[9]] = lIIIlllII[lIIIllllI[29]];
                    TileObjects.getNearest(strArr).interact(lIIIlllII[lIIIllllI[30]]);
                    Time.sleepTicks(lIIIllllI[5]);
                    "".length();
                }
                if (lllIlllIlll(jY ? 1 : 0)) {
                    if (lllIlllIlIl(jX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        String[] strArr2 = new String[lIIIllllI[4]];
                        strArr2[lIIIllllI[9]] = lIIIlllII[lIIIllllI[31]];
                        TileObjects.getNearest(strArr2).interact(lIIIlllII[lIIIllllI[32]]);
                        Time.sleepTicks(lIIIllllI[6]);
                        "".length();
                    }
                    if (lllIllllIlI(Players.getLocal().getWorldLocation().distanceTo(jR), lIIIllllI[11])) {
                        String[] strArr3 = new String[lIIIllllI[4]];
                        strArr3[lIIIllllI[9]] = lIIIlllII[lIIIllllI[26]];
                        if (lllIlllllII(NPCs.getNearest(strArr3)) && lllIlllIlll(jX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            WorldPoint[] worldPointArr = new WorldPoint[lIIIllllI[17]];
                            worldPointArr[lIIIllllI[9]] = new WorldPoint(lIIIllllI[27], lIIIllllI[33], lIIIllllI[9]);
                            worldPointArr[lIIIllllI[4]] = new WorldPoint(lIIIllllI[27], lIIIllllI[34], lIIIllllI[9]);
                            worldPointArr[lIIIllllI[5]] = new WorldPoint(lIIIllllI[35], lIIIllllI[36], lIIIllllI[9]);
                            worldPointArr[lIIIllllI[6]] = new WorldPoint(lIIIllllI[37], lIIIllllI[36], lIIIllllI[9]);
                            worldPointArr[lIIIllllI[7]] = new WorldPoint(lIIIllllI[38], lIIIllllI[39], lIIIllllI[9]);
                            worldPointArr[lIIIllllI[11]] = new WorldPoint(lIIIllllI[40], lIIIllllI[41], lIIIllllI[9]);
                            worldPointArr[lIIIllllI[8]] = new WorldPoint(lIIIllllI[42], lIIIllllI[43], lIIIllllI[9]);
                            worldPointArr[lIIIllllI[23]] = new WorldPoint(lIIIllllI[44], lIIIllllI[45], lIIIllllI[9]);
                            worldPointArr[lIIIllllI[24]] = new WorldPoint(lIIIllllI[46], lIIIllllI[47], lIIIllllI[9]);
                            worldPointArr[lIIIllllI[25]] = new WorldPoint(lIIIllllI[48], lIIIllllI[49], lIIIllllI[9]);
                            AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[50]];
                            Walker.walkAlong(Arrays.asList(worldPointArr), new HashMap());
                            "".length();
                            Time.sleepTicks(lIIIllllI[4]);
                            "".length();
                        }
                    }
                    if (lllIllllIll(Players.getLocal().getWorldLocation().distanceTo(jR), lIIIllllI[11])) {
                        AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[51]];
                        String[] strArr4 = new String[lIIIllllI[4]];
                        strArr4[lIIIllllI[9]] = lIIIlllII[lIIIllllI[52]];
                        if (lllIlllllII(NPCs.getNearest(strArr4))) {
                            String[] strArr5 = new String[lIIIllllI[4]];
                            strArr5[lIIIllllI[9]] = lIIIlllII[lIIIllllI[53]];
                            TileObjects.getNearest(strArr5).interact(lIIIlllII[lIIIllllI[54]]);
                            Time.sleepTicks(lIIIllllI[6]);
                            "".length();
                        }
                        C0006g.a(lIIIlllII[lIIIllllI[55]], bR);
                    }
                    String[] strArr6 = new String[lIIIllllI[4]];
                    strArr6[lIIIllllI[9]] = lIIIlllII[lIIIllllI[56]];
                    if (lllIllllIII(NPCs.getNearest(strArr6))) {
                        String text = Dialog.getText();
                        if (lllIllllIII(text) && lllIlllIlIl(text.contains(lIIIlllII[lIIIllllI[57]]) ? 1 : 0)) {
                            jY = lIIIllllI[4];
                        }
                        C0006g.a(lIIIlllII[lIIIllllI[58]], bR);
                    }
                }
                if (lllIlllIlll(jZ ? 1 : 0) && lllIlllIlIl(jY ? 1 : 0)) {
                    String[] strArr7 = new String[lIIIllllI[4]];
                    strArr7[lIIIllllI[9]] = lIIIlllII[lIIIllllI[59]];
                    if (lllIllllIII(NPCs.getNearest(strArr7))) {
                        String[] strArr8 = new String[lIIIllllI[4]];
                        strArr8[lIIIllllI[9]] = lIIIlllII[lIIIllllI[60]];
                        TileObjects.getNearest(strArr8).interact(lIIIlllII[lIIIllllI[61]]);
                        Time.sleepTicks(lIIIllllI[6]);
                        "".length();
                    }
                    if (lllIlllIlll(jV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (lllIlllIlIl(jW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[62]];
                            String[] strArr9 = new String[lIIIllllI[4]];
                            strArr9[lIIIllllI[9]] = lIIIlllII[lIIIllllI[63]];
                            TileObjects.getNearest(strArr9).interact(lIIIlllII[lIIIllllI[64]]);
                            Time.sleepTicks(lIIIllllI[6]);
                            "".length();
                        }
                        String[] strArr10 = new String[lIIIllllI[4]];
                        strArr10[lIIIllllI[9]] = lIIIlllII[lIIIllllI[65]];
                        if (lllIlllllII(NPCs.getNearest(strArr10)) && lllIllllIlI(Players.getLocal().getWorldLocation().distanceTo(jS), lIIIllllI[6])) {
                            String[] strArr11 = new String[lIIIllllI[4]];
                            strArr11[lIIIllllI[9]] = lIIIlllII[lIIIllllI[66]];
                            if (lllIlllllII(NPCs.getNearest(strArr11))) {
                                AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[67]];
                                Movement.walkTo(jS);
                                "".length();
                                Time.sleepTicks(lIIIllllI[4]);
                                "".length();
                            }
                        }
                        if (lllIllllIll(Players.getLocal().getWorldLocation().distanceTo(jS), lIIIllllI[6])) {
                            String[] strArr12 = new String[lIIIllllI[4]];
                            strArr12[lIIIllllI[9]] = lIIIlllII[lIIIllllI[68]];
                            if (lllIlllllII(NPCs.getNearest(strArr12)) && lllIlllIlll(Players.getLocal().isMoving() ? 1 : 0)) {
                                String[] strArr13 = new String[lIIIllllI[4]];
                                strArr13[lIIIllllI[9]] = lIIIlllII[lIIIllllI[69]];
                                TileObjects.getNearest(strArr13).interact(lIIIlllII[lIIIllllI[70]]);
                            }
                        }
                    }
                    if (lllIlllIlIl(jV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        String[] strArr14 = new String[lIIIllllI[4]];
                        strArr14[lIIIllllI[9]] = lIIIlllII[lIIIllllI[71]];
                        if (lllIllllIII(NPCs.getNearest(strArr14))) {
                            String text2 = Dialog.getText();
                            if (lllIllllIII(text2) && lllIlllIlIl(text2.contains(lIIIlllII[lIIIllllI[72]]) ? 1 : 0)) {
                                jZ = lIIIllllI[4];
                            }
                            AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[73]];
                            C0006g.a(lIIIlllII[lIIIllllI[19]], bR);
                        }
                    }
                }
                if (lllIlllIlll(ka ? 1 : 0) && lllIlllIlIl(jZ ? 1 : 0) && lllIlllIlIl(jY ? 1 : 0) && lllIlllIlIl(jV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] strArr15 = new String[lIIIllllI[4]];
                    strArr15[lIIIllllI[9]] = lIIIlllII[lIIIllllI[74]];
                    if (lllIllllIII(NPCs.getNearest(strArr15))) {
                        List options = Dialog.getOptions();
                        if (lllIlllIlll(options.isEmpty() ? 1 : 0) && lllIlllIlIl(options.contains(lIIIlllII[lIIIllllI[75]]) ? 1 : 0)) {
                            ka = lIIIllllI[4];
                        }
                        AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[76]];
                        C0006g.a(lIIIlllII[lIIIllllI[77]], bR);
                    }
                }
                if (lllIlllIlll(kb ? 1 : 0) && lllIlllIlIl(ka ? 1 : 0) && lllIlllIlIl(jZ ? 1 : 0) && lllIlllIlIl(jY ? 1 : 0)) {
                    if (lllIlllIlll(jW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (lllIlllIlIl(jV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] strArr16 = new String[lIIIllllI[4]];
                            strArr16[lIIIllllI[9]] = lIIIlllII[lIIIllllI[78]];
                            TileObjects.getNearest(strArr16).interact(lIIIlllII[lIIIllllI[79]]);
                            Time.sleepTicks(lIIIllllI[6]);
                            "".length();
                        }
                        if (lllIllllIlI(Players.getLocal().getWorldLocation().distanceTo(jT), lIIIllllI[6]) && lllIlllIlll(jV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[80]];
                            Movement.walkTo(jT);
                            "".length();
                            Time.sleepTicks(lIIIllllI[4]);
                            "".length();
                        }
                        if (lllIllllIll(Players.getLocal().getWorldLocation().distanceTo(jT), lIIIllllI[6])) {
                            String[] strArr17 = new String[lIIIllllI[4]];
                            strArr17[lIIIllllI[9]] = lIIIlllII[lIIIllllI[81]];
                            if (lllIlllllII(NPCs.getNearest(strArr17)) && lllIlllIlll(Players.getLocal().isMoving() ? 1 : 0)) {
                                String[] strArr18 = new String[lIIIllllI[4]];
                                strArr18[lIIIllllI[9]] = lIIIlllII[lIIIllllI[82]];
                                TileObjects.getNearest(strArr18).interact(lIIIlllII[lIIIllllI[22]]);
                            }
                        }
                    }
                    if (lllIlllIlIl(jW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        String[] strArr19 = new String[lIIIllllI[4]];
                        strArr19[lIIIllllI[9]] = lIIIlllII[lIIIllllI[83]];
                        if (lllIllllIII(NPCs.getNearest(strArr19))) {
                            List options2 = Dialog.getOptions();
                            if (lllIlllIlll(options2.isEmpty() ? 1 : 0)) {
                                int i = lIIIllllI[9];
                                while (lllIlllIllI(i, options2.size())) {
                                    if (lllIlllIlIl(((Widget) options2.get(i)).getText().contains(lIIIlllII[lIIIllllI[84]]) ? 1 : 0)) {
                                        System.out.println(lIIIlllII[lIIIllllI[85]]);
                                        kb = lIIIllllI[4];
                                    }
                                    i++;
                                    "".length();
                                    if (0 != 0) {
                                        return;
                                    }
                                }
                            }
                            AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[86]];
                            C0006g.a(lIIIlllII[lIIIllllI[87]], bR);
                        }
                    }
                }
                if (lllIlllIlll(kc ? 1 : 0) && lllIlllIlIl(kb ? 1 : 0) && lllIlllIlIl(ka ? 1 : 0) && lllIlllIlIl(jZ ? 1 : 0) && lllIlllIlIl(jY ? 1 : 0)) {
                    if (lllIlllIlIl(jW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[88]];
                        String[] strArr20 = new String[lIIIllllI[4]];
                        strArr20[lIIIllllI[9]] = lIIIlllII[lIIIllllI[89]];
                        TileObjects.getNearest(strArr20).interact(lIIIlllII[lIIIllllI[90]]);
                        Time.sleepTicks(lIIIllllI[6]);
                        "".length();
                    }
                    if (lllIlllIlll(jW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllIlllIlll(jX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (lllIllllIlI(Players.getLocal().distanceTo(jU), lIIIllllI[6])) {
                            AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[91]];
                            Movement.walkTo(jU);
                            "".length();
                            Time.sleepTicks(lIIIllllI[4]);
                            "".length();
                        }
                        if (lllIllllIll(Players.getLocal().distanceTo(jU), lIIIllllI[6]) && lllIlllIlll(Players.getLocal().getWorldLocation().getPlane()) && lllIlllIlll(jX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] strArr21 = new String[lIIIllllI[4]];
                            strArr21[lIIIllllI[9]] = lIIIlllII[lIIIllllI[92]];
                            TileObjects.getNearest(strArr21).interact(lIIIlllII[lIIIllllI[93]]);
                            Time.sleepTicks(lIIIllllI[8]);
                            "".length();
                        }
                    }
                    if (lllIlllIlIl(jX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[94]];
                        C0006g.a(lIIIlllII[lIIIllllI[95]], bR);
                        List options3 = Dialog.getOptions();
                        if (lllIlllIlll(options3.isEmpty() ? 1 : 0)) {
                            int i2 = lIIIllllI[9];
                            while (lllIlllIllI(i2, options3.size())) {
                                if (lllIlllIlIl(((Widget) options3.get(i2)).getText().contains(lIIIlllII[lIIIllllI[96]]) ? 1 : 0)) {
                                    System.out.println(lIIIlllII[lIIIllllI[97]]);
                                    kc = lIIIllllI[4];
                                }
                                i2++;
                                "".length();
                                if ((-" ".length()) > "  ".length()) {
                                    return;
                                }
                            }
                        }
                    }
                }
                if (lllIlllIlll(kd ? 1 : 0) && lllIlllIlIl(kc ? 1 : 0) && lllIlllIlIl(kb ? 1 : 0) && lllIlllIlIl(ka ? 1 : 0) && lllIlllIlIl(jZ ? 1 : 0) && lllIlllIlIl(jY ? 1 : 0)) {
                    if (lllIlllIlIl(jX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        String[] strArr22 = new String[lIIIllllI[4]];
                        strArr22[lIIIllllI[9]] = lIIIlllII[lIIIllllI[98]];
                        TileObjects.getNearest(strArr22).interact(lIIIlllII[lIIIllllI[99]]);
                        Time.sleepTicks(lIIIllllI[11]);
                        "".length();
                    }
                    if (lllIlllIlll(jX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        String[] strArr23 = new String[lIIIllllI[4]];
                        strArr23[lIIIllllI[9]] = lIIIlllII[lIIIllllI[100]];
                        if (lllIlllllII(NPCs.getNearest(strArr23))) {
                            if (lllIllllIlI(Players.getLocal().getWorldLocation().distanceTo(cj), lIIIllllI[7])) {
                                AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[101]];
                                WorldPoint[] worldPointArr2 = new WorldPoint[lIIIllllI[17]];
                                worldPointArr2[lIIIllllI[9]] = new WorldPoint(lIIIllllI[27], lIIIllllI[102], lIIIllllI[9]);
                                worldPointArr2[lIIIllllI[4]] = new WorldPoint(lIIIllllI[27], lIIIllllI[34], lIIIllllI[9]);
                                worldPointArr2[lIIIllllI[5]] = new WorldPoint(lIIIllllI[103], lIIIllllI[36], lIIIllllI[9]);
                                worldPointArr2[lIIIllllI[6]] = new WorldPoint(lIIIllllI[104], lIIIllllI[36], lIIIllllI[9]);
                                worldPointArr2[lIIIllllI[7]] = new WorldPoint(lIIIllllI[38], lIIIllllI[36], lIIIllllI[9]);
                                worldPointArr2[lIIIllllI[11]] = new WorldPoint(lIIIllllI[105], lIIIllllI[106], lIIIllllI[9]);
                                worldPointArr2[lIIIllllI[8]] = new WorldPoint(lIIIllllI[107], lIIIllllI[108], lIIIllllI[9]);
                                worldPointArr2[lIIIllllI[23]] = new WorldPoint(lIIIllllI[44], lIIIllllI[109], lIIIllllI[9]);
                                worldPointArr2[lIIIllllI[24]] = new WorldPoint(lIIIllllI[110], lIIIllllI[111], lIIIllllI[9]);
                                worldPointArr2[lIIIllllI[25]] = new WorldPoint(lIIIllllI[112], lIIIllllI[113], lIIIllllI[9]);
                                Walker.walkAlong(Arrays.asList(worldPointArr2), new HashMap());
                                "".length();
                                Time.sleepTicks(lIIIllllI[4]);
                                "".length();
                            }
                            if (lllIllllIll(Players.getLocal().getWorldLocation().distanceTo(cj), lIIIllllI[7])) {
                                String[] strArr24 = new String[lIIIllllI[4]];
                                strArr24[lIIIllllI[9]] = lIIIlllII[lIIIllllI[114]];
                                TileObjects.getNearest(strArr24).interact(lIIIlllII[lIIIllllI[115]]);
                                Time.sleepTicks(lIIIllllI[6]);
                                "".length();
                            }
                        }
                    }
                    String[] strArr25 = new String[lIIIllllI[4]];
                    strArr25[lIIIllllI[9]] = lIIIlllII[lIIIllllI[116]];
                    if (lllIllllIII(NPCs.getNearest(strArr25))) {
                        AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[117]];
                        C0006g.a(lIIIlllII[lIIIllllI[118]], bR);
                        List options4 = Dialog.getOptions();
                        if (lllIlllIlll(options4.isEmpty() ? 1 : 0)) {
                            int i3 = lIIIllllI[9];
                            while (lllIlllIllI(i3, options4.size())) {
                                if (lllIlllIlIl(((Widget) options4.get(i3)).getText().contains(lIIIlllII[lIIIllllI[119]]) ? 1 : 0)) {
                                    System.out.println(lIIIlllII[lIIIllllI[120]]);
                                    kd = lIIIllllI[4];
                                }
                                i3++;
                                "".length();
                                if (" ".length() <= (((118 ^ 87) ^ (244 ^ 149)) & (((((165 + 95) - 209) + 148) ^ (((128 + 110) - 141) + 38)) ^ (-" ".length())))) {
                                    return;
                                }
                            }
                        }
                    }
                }
                if (lllIlllIlll(ke ? 1 : 0) && lllIlllIlIl(kd ? 1 : 0) && lllIlllIlIl(kc ? 1 : 0) && lllIlllIlIl(kb ? 1 : 0) && lllIlllIlIl(ka ? 1 : 0) && lllIlllIlIl(jZ ? 1 : 0) && lllIlllIlIl(jY ? 1 : 0)) {
                    String[] strArr26 = new String[lIIIllllI[4]];
                    strArr26[lIIIllllI[9]] = lIIIlllII[lIIIllllI[121]];
                    if (lllIllllIII(NPCs.getNearest(strArr26))) {
                        String[] strArr27 = new String[lIIIllllI[4]];
                        strArr27[lIIIllllI[9]] = lIIIlllII[lIIIllllI[122]];
                        TileObjects.getNearest(strArr27).interact(lIIIlllII[lIIIllllI[123]]);
                        Time.sleepTicks(lIIIllllI[6]);
                        "".length();
                    }
                    WorldPoint worldPoint = new WorldPoint(lIIIllllI[124], lIIIllllI[125], lIIIllllI[9]);
                    String[] strArr28 = new String[lIIIllllI[4]];
                    strArr28[lIIIllllI[9]] = lIIIlllII[lIIIllllI[126]];
                    if (lllIlllllII(NPCs.getNearest(strArr28))) {
                        if (lllIlllIlll(Players.getLocal().getWorldLocation().equals(worldPoint) ? 1 : 0)) {
                            AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[127]];
                            Movement.walkTo(worldPoint);
                            "".length();
                            Time.sleepTicks(lIIIllllI[4]);
                            "".length();
                        }
                        if (lllIlllIlIl(Players.getLocal().getWorldLocation().equals(worldPoint) ? 1 : 0) && lllIlllIlll(Dialog.isOpen() ? 1 : 0)) {
                            if (lllIlllIllI(kk, lIIIllllI[5])) {
                                String[] strArr29 = new String[lIIIllllI[4]];
                                strArr29[lIIIllllI[9]] = lIIIlllII[lIIIllllI[128]];
                                Inventory.getFirst(strArr29).interact(lIIIlllII[lIIIllllI[129]]);
                                Time.sleepTicks(lIIIllllI[7]);
                                "".length();
                                kk += lIIIllllI[4];
                            }
                            if (lllIlllIlII(kk, lIIIllllI[5])) {
                                ke = lIIIllllI[4];
                            }
                        }
                    }
                }
                if (lllIlllIlll(kf ? 1 : 0) && lllIlllIlIl(ke ? 1 : 0) && lllIlllIlIl(kd ? 1 : 0) && lllIlllIlIl(kc ? 1 : 0) && lllIlllIlIl(kb ? 1 : 0) && lllIlllIlIl(ka ? 1 : 0) && lllIlllIlIl(jZ ? 1 : 0) && lllIlllIlIl(jY ? 1 : 0)) {
                    if (lllIllllIlI(Players.getLocal().getWorldLocation().distanceTo(jR), lIIIllllI[11])) {
                        String[] strArr30 = new String[lIIIllllI[4]];
                        strArr30[lIIIllllI[9]] = lIIIlllII[lIIIllllI[130]];
                        if (lllIlllllII(NPCs.getNearest(strArr30))) {
                            AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[131]];
                            Movement.walkTo(jR);
                            "".length();
                            Time.sleepTicks(lIIIllllI[4]);
                            "".length();
                        }
                    }
                    if (lllIllllIll(Players.getLocal().getWorldLocation().distanceTo(jR), lIIIllllI[11])) {
                        String[] strArr31 = new String[lIIIllllI[4]];
                        strArr31[lIIIllllI[9]] = lIIIlllII[lIIIllllI[132]];
                        if (lllIlllllII(TileObjects.getNearest(strArr31))) {
                            String[] strArr32 = new String[lIIIllllI[4]];
                            strArr32[lIIIllllI[9]] = lIIIlllII[lIIIllllI[133]];
                            TileObjects.getNearest(strArr32).interact(lIIIlllII[lIIIllllI[134]]);
                            Time.sleepTicks(lIIIllllI[7]);
                            "".length();
                        }
                    }
                    if (lllIlllIlll(Dialog.isOpen() ? 1 : 0)) {
                        String[] strArr33 = new String[lIIIllllI[4]];
                        strArr33[lIIIllllI[9]] = lIIIlllII[lIIIllllI[135]];
                        if (lllIllllIII(TileObjects.getNearest(strArr33))) {
                            AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[136]];
                            String[] strArr34 = new String[lIIIllllI[4]];
                            strArr34[lIIIllllI[9]] = lIIIlllII[lIIIllllI[137]];
                            TileObjects.getNearest(strArr34).interact(lIIIlllII[lIIIllllI[138]]);
                            Time.sleepTicks(lIIIllllI[6]);
                            "".length();
                        }
                    }
                }
                if (lllIlllIlll(kg ? 1 : 0) && lllIlllIlIl(kf ? 1 : 0) && lllIlllIlIl(ke ? 1 : 0) && lllIlllIlIl(kd ? 1 : 0) && lllIlllIlIl(kc ? 1 : 0) && lllIlllIlIl(kb ? 1 : 0) && lllIlllIlIl(ka ? 1 : 0) && lllIlllIlIl(jZ ? 1 : 0) && lllIlllIlIl(jY ? 1 : 0)) {
                    if (lllIlllIlll(jW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (lllIlllIlll(jV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] strArr35 = new String[lIIIllllI[4]];
                            strArr35[lIIIllllI[9]] = lIIIlllII[lIIIllllI[139]];
                        }
                        String[] strArr36 = new String[lIIIllllI[4]];
                        strArr36[lIIIllllI[9]] = lIIIlllII[lIIIllllI[140]];
                        TileObjects.getNearest(strArr36).interact(lIIIlllII[lIIIllllI[141]]);
                        Time.sleepTicks(lIIIllllI[6]);
                        "".length();
                        if (lllIllllIlI(Players.getLocal().getWorldLocation().distanceTo(jT), lIIIllllI[6]) && lllIlllIlll(jV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] strArr37 = new String[lIIIllllI[4]];
                            strArr37[lIIIllllI[9]] = lIIIlllII[lIIIllllI[142]];
                            if (lllIlllllII(TileObjects.getNearest(strArr37))) {
                                AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[143]];
                                Movement.walkTo(jT);
                                "".length();
                                Time.sleepTicks(lIIIllllI[4]);
                                "".length();
                            }
                        }
                        if (lllIllllIll(Players.getLocal().getWorldLocation().distanceTo(jT), lIIIllllI[6])) {
                            String[] strArr38 = new String[lIIIllllI[4]];
                            strArr38[lIIIllllI[9]] = lIIIlllII[lIIIllllI[144]];
                            if (lllIlllllII(NPCs.getNearest(strArr38)) && lllIlllIlll(Players.getLocal().isMoving() ? 1 : 0)) {
                                String[] strArr39 = new String[lIIIllllI[4]];
                                strArr39[lIIIllllI[9]] = lIIIlllII[lIIIllllI[145]];
                                TileObjects.getNearest(strArr39).interact(lIIIlllII[lIIIllllI[146]]);
                            }
                        }
                    }
                    if (lllIlllIlIl(jW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        String[] strArr40 = new String[lIIIllllI[4]];
                        strArr40[lIIIllllI[9]] = lIIIlllII[lIIIllllI[147]];
                        if (lllIllllIII(NPCs.getNearest(strArr40))) {
                            AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[148]];
                            C0006g.a(lIIIlllII[lIIIllllI[149]], bR);
                            String text3 = Dialog.getText();
                            if (lllIllllIII(text3) && lllIlllIlIl(text3.contains(lIIIlllII[lIIIllllI[150]]) ? 1 : 0)) {
                                kg = lIIIllllI[4];
                            }
                        }
                    }
                }
                if (lllIlllIlll(kh ? 1 : 0) && lllIlllIlIl(kg ? 1 : 0) && lllIlllIlIl(kf ? 1 : 0) && lllIlllIlIl(ke ? 1 : 0) && lllIlllIlIl(kd ? 1 : 0) && lllIlllIlIl(kc ? 1 : 0) && lllIlllIlIl(kb ? 1 : 0) && lllIlllIlIl(ka ? 1 : 0) && lllIlllIlIl(jZ ? 1 : 0) && lllIlllIlIl(jY ? 1 : 0)) {
                    if (lllIlllIlIl(jW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[151]];
                        String[] strArr41 = new String[lIIIllllI[4]];
                        strArr41[lIIIllllI[9]] = lIIIlllII[lIIIllllI[152]];
                        TileObjects.getNearest(strArr41).interact(lIIIlllII[lIIIllllI[153]]);
                        Time.sleepTicks(lIIIllllI[6]);
                        "".length();
                    }
                    if (lllIlllIlll(jV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllIlllIlll(jW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        String[] strArr42 = new String[lIIIllllI[4]];
                        strArr42[lIIIllllI[9]] = lIIIlllII[lIIIllllI[154]];
                        if (lllIlllllII(NPCs.getNearest(strArr42)) && lllIllllIlI(Players.getLocal().getWorldLocation().distanceTo(jS), lIIIllllI[6])) {
                            AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[155]];
                            Walker.step(jS);
                            "".length();
                            Time.sleepTicks(lIIIllllI[4]);
                            "".length();
                        }
                        if (lllIllllIll(Players.getLocal().getWorldLocation().distanceTo(jS), lIIIllllI[6])) {
                            String[] strArr43 = new String[lIIIllllI[4]];
                            strArr43[lIIIllllI[9]] = lIIIlllII[lIIIllllI[156]];
                            if (lllIlllllII(NPCs.getNearest(strArr43)) && lllIlllIlll(Players.getLocal().isMoving() ? 1 : 0)) {
                                String[] strArr44 = new String[lIIIllllI[4]];
                                strArr44[lIIIllllI[9]] = lIIIlllII[lIIIllllI[157]];
                                TileObjects.getNearest(strArr44).interact(lIIIlllII[lIIIllllI[158]]);
                            }
                        }
                    }
                    if (lllIlllIlIl(jV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        String[] strArr45 = new String[lIIIllllI[4]];
                        strArr45[lIIIllllI[9]] = lIIIlllII[lIIIllllI[159]];
                        if (lllIllllIII(NPCs.getNearest(strArr45))) {
                            String text4 = Dialog.getText();
                            if (lllIllllIII(text4) && lllIlllIlIl(text4.contains(lIIIlllII[lIIIllllI[160]]) ? 1 : 0)) {
                                kh = lIIIllllI[4];
                            }
                            AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[161]];
                            C0006g.a(lIIIlllII[lIIIllllI[162]], bR);
                        }
                    }
                }
                if (lllIlllIlll(ki ? 1 : 0) && lllIlllIlIl(kh ? 1 : 0) && lllIlllIlIl(kg ? 1 : 0) && lllIlllIlIl(kf ? 1 : 0) && lllIlllIlIl(ke ? 1 : 0) && lllIlllIlIl(kd ? 1 : 0) && lllIlllIlIl(kc ? 1 : 0) && lllIlllIlIl(kb ? 1 : 0) && lllIlllIlIl(ka ? 1 : 0) && lllIlllIlIl(jZ ? 1 : 0) && lllIlllIlIl(jY ? 1 : 0) && lllIlllIlIl(jV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] strArr46 = new String[lIIIllllI[4]];
                    strArr46[lIIIllllI[9]] = lIIIlllII[lIIIllllI[163]];
                    if (lllIllllIII(NPCs.getNearest(strArr46))) {
                        String text5 = Dialog.getText();
                        if (lllIllllIII(text5) && lllIlllIlIl(text5.contains(lIIIlllII[lIIIllllI[164]]) ? 1 : 0)) {
                            ki = lIIIllllI[4];
                        }
                        AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[165]];
                        C0006g.a(lIIIlllII[lIIIllllI[166]], bR);
                    }
                }
                C0006g.a(bR);
            }
            if (lllIlllIlII(Vars.getBit(QuestVarbits.QUEST_THE_CORSAIR_CURSE.getId()), lIIIllllI[54])) {
                if (lllIlllIlIl(jV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[167]];
                    String[] strArr47 = new String[lIIIllllI[4]];
                    strArr47[lIIIllllI[9]] = lIIIlllII[lIIIllllI[168]];
                    TileObjects.getNearest(strArr47).interact(lIIIlllII[lIIIllllI[169]]);
                    Time.sleepTicks(lIIIllllI[6]);
                    "".length();
                }
                if (lllIlllIlll(jW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllIlllIlll(jX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lllIllllIlI(Players.getLocal().distanceTo(jU), lIIIllllI[6])) {
                        AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[170]];
                        WorldPoint[] worldPointArr3 = new WorldPoint[lIIIllllI[8]];
                        worldPointArr3[lIIIllllI[9]] = new WorldPoint(lIIIllllI[38], lIIIllllI[108], lIIIllllI[9]);
                        worldPointArr3[lIIIllllI[4]] = new WorldPoint(lIIIllllI[171], lIIIllllI[172], lIIIllllI[9]);
                        worldPointArr3[lIIIllllI[5]] = new WorldPoint(lIIIllllI[173], lIIIllllI[36], lIIIllllI[9]);
                        worldPointArr3[lIIIllllI[6]] = new WorldPoint(lIIIllllI[174], lIIIllllI[34], lIIIllllI[9]);
                        worldPointArr3[lIIIllllI[7]] = new WorldPoint(lIIIllllI[27], lIIIllllI[102], lIIIllllI[9]);
                        worldPointArr3[lIIIllllI[11]] = new WorldPoint(lIIIllllI[27], lIIIllllI[125], lIIIllllI[9]);
                        Walker.walkAlong(Arrays.asList(worldPointArr3), new HashMap());
                        "".length();
                        Time.sleepTicks(lIIIllllI[4]);
                        "".length();
                    }
                    if (lllIllllIll(Players.getLocal().distanceTo(jU), lIIIllllI[6]) && lllIlllIlll(Players.getLocal().getWorldLocation().getPlane()) && lllIlllIlll(jX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        String[] strArr48 = new String[lIIIllllI[4]];
                        strArr48[lIIIllllI[9]] = lIIIlllII[lIIIllllI[175]];
                        TileObjects.getNearest(strArr48).interact(lIIIlllII[lIIIllllI[176]]);
                        Time.sleepTicks(lIIIllllI[11]);
                        "".length();
                    }
                }
                if (lllIlllIlIl(jX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[177]];
                    C0006g.a(lIIIlllII[lIIIllllI[178]], bR);
                }
            }
            if (lllIlllIlII(Vars.getBit(QuestVarbits.QUEST_THE_CORSAIR_CURSE.getId()), lIIIllllI[59])) {
                if (lllIlllIlll(jW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lllIlllIlIl(jX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        String[] strArr49 = new String[lIIIllllI[4]];
                        strArr49[lIIIllllI[9]] = lIIIlllII[lIIIllllI[179]];
                        TileObjects.getNearest(strArr49).interact(lIIIlllII[lIIIllllI[180]]);
                        Time.sleepTicks(lIIIllllI[11]);
                        "".length();
                    }
                    if (lllIllllIlI(Players.getLocal().getWorldLocation().distanceTo(jT), lIIIllllI[6]) && lllIlllIlll(jX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[181]];
                        WorldPoint[] worldPointArr4 = new WorldPoint[lIIIllllI[24]];
                        worldPointArr4[lIIIllllI[9]] = new WorldPoint(lIIIllllI[27], lIIIllllI[33], lIIIllllI[9]);
                        worldPointArr4[lIIIllllI[4]] = new WorldPoint(lIIIllllI[27], lIIIllllI[43], lIIIllllI[9]);
                        worldPointArr4[lIIIllllI[5]] = new WorldPoint(lIIIllllI[103], lIIIllllI[36], lIIIllllI[9]);
                        worldPointArr4[lIIIllllI[6]] = new WorldPoint(lIIIllllI[182], lIIIllllI[36], lIIIllllI[9]);
                        worldPointArr4[lIIIllllI[7]] = new WorldPoint(lIIIllllI[183], lIIIllllI[184], lIIIllllI[9]);
                        worldPointArr4[lIIIllllI[11]] = new WorldPoint(lIIIllllI[185], lIIIllllI[109], lIIIllllI[9]);
                        worldPointArr4[lIIIllllI[8]] = new WorldPoint(lIIIllllI[186], lIIIllllI[113], lIIIllllI[9]);
                        worldPointArr4[lIIIllllI[23]] = new WorldPoint(lIIIllllI[105], lIIIllllI[187], lIIIllllI[9]);
                        Walker.walkAlong(Arrays.asList(worldPointArr4), new HashMap());
                        "".length();
                        Time.sleepTicks(lIIIllllI[4]);
                        "".length();
                    }
                    if (lllIllllIll(Players.getLocal().getWorldLocation().distanceTo(jT), lIIIllllI[6])) {
                        String[] strArr50 = new String[lIIIllllI[4]];
                        strArr50[lIIIllllI[9]] = lIIIlllII[lIIIllllI[188]];
                        if (lllIlllllII(NPCs.getNearest(strArr50)) && lllIlllIlll(Players.getLocal().isMoving() ? 1 : 0)) {
                            String[] strArr51 = new String[lIIIllllI[4]];
                            strArr51[lIIIllllI[9]] = lIIIlllII[lIIIllllI[189]];
                            TileObjects.getNearest(strArr51).interact(lIIIlllII[lIIIllllI[190]]);
                        }
                    }
                }
                if (lllIlllIlIl(jW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] strArr52 = new String[lIIIllllI[4]];
                    strArr52[lIIIllllI[9]] = lIIIlllII[lIIIllllI[191]];
                    if (lllIllllIII(NPCs.getNearest(strArr52))) {
                        AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[192]];
                        C0006g.a(lIIIlllII[lIIIllllI[193]], bR);
                    }
                }
            }
            if (lllIlllIlII(Vars.getBit(QuestVarbits.QUEST_THE_CORSAIR_CURSE.getId()), lIIIllllI[64])) {
                if (lllIlllIlIl(jW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[194]];
                    String[] strArr53 = new String[lIIIllllI[4]];
                    strArr53[lIIIllllI[9]] = lIIIlllII[lIIIllllI[195]];
                    TileObjects.getNearest(strArr53).interact(lIIIlllII[lIIIllllI[196]]);
                    Time.sleepTicks(lIIIllllI[6]);
                    "".length();
                }
                if (lllIlllIlll(jV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllIlllIlll(jW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] strArr54 = new String[lIIIllllI[4]];
                    strArr54[lIIIllllI[9]] = lIIIlllII[lIIIllllI[197]];
                    if (lllIlllllII(NPCs.getNearest(strArr54)) && lllIllllIlI(Players.getLocal().getWorldLocation().distanceTo(jS), lIIIllllI[5])) {
                        AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[198]];
                        Walker.step(jS);
                        "".length();
                        Time.sleepTicks(lIIIllllI[4]);
                        "".length();
                    }
                    if (lllIllllIll(Players.getLocal().getWorldLocation().distanceTo(jS), lIIIllllI[5])) {
                        String[] strArr55 = new String[lIIIllllI[4]];
                        strArr55[lIIIllllI[9]] = lIIIlllII[lIIIllllI[199]];
                        if (lllIlllllII(NPCs.getNearest(strArr55)) && lllIlllIlll(Players.getLocal().isMoving() ? 1 : 0)) {
                            String[] strArr56 = new String[lIIIllllI[4]];
                            strArr56[lIIIllllI[9]] = lIIIlllII[lIIIllllI[200]];
                            TileObjects.getNearest(strArr56).interact(lIIIlllII[lIIIllllI[201]]);
                        }
                    }
                }
                if (lllIlllIlIl(jV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] strArr57 = new String[lIIIllllI[4]];
                    strArr57[lIIIllllI[9]] = lIIIlllII[lIIIllllI[202]];
                    if (lllIllllIII(NPCs.getNearest(strArr57))) {
                        AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[203]];
                        C0006g.a(lIIIlllII[lIIIllllI[204]], bR);
                    }
                }
            }
            if (lllIlllIlII(Vars.getBit(QuestVarbits.QUEST_THE_CORSAIR_CURSE.getId()), lIIIllllI[69])) {
                if (lllIlllIlIl(jV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] strArr58 = new String[lIIIllllI[4]];
                    strArr58[lIIIllllI[9]] = lIIIlllII[lIIIllllI[205]];
                    TileObjects.getNearest(strArr58).interact(lIIIlllII[lIIIllllI[206]]);
                    Time.sleepTicks(lIIIllllI[6]);
                    "".length();
                }
                if (lllIllllIlI(Players.getLocal().getWorldLocation().distanceTo(jR), lIIIllllI[11])) {
                    String[] strArr59 = new String[lIIIllllI[4]];
                    strArr59[lIIIllllI[9]] = lIIIlllII[lIIIllllI[207]];
                    if (lllIlllllII(NPCs.getNearest(strArr59)) && lllIlllIlll(jV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        WorldPoint[] worldPointArr5 = new WorldPoint[lIIIllllI[17]];
                        worldPointArr5[lIIIllllI[9]] = new WorldPoint(lIIIllllI[27], lIIIllllI[33], lIIIllllI[9]);
                        worldPointArr5[lIIIllllI[4]] = new WorldPoint(lIIIllllI[27], lIIIllllI[34], lIIIllllI[9]);
                        worldPointArr5[lIIIllllI[5]] = new WorldPoint(lIIIllllI[35], lIIIllllI[36], lIIIllllI[9]);
                        worldPointArr5[lIIIllllI[6]] = new WorldPoint(lIIIllllI[37], lIIIllllI[36], lIIIllllI[9]);
                        worldPointArr5[lIIIllllI[7]] = new WorldPoint(lIIIllllI[38], lIIIllllI[39], lIIIllllI[9]);
                        worldPointArr5[lIIIllllI[11]] = new WorldPoint(lIIIllllI[40], lIIIllllI[41], lIIIllllI[9]);
                        worldPointArr5[lIIIllllI[8]] = new WorldPoint(lIIIllllI[42], lIIIllllI[43], lIIIllllI[9]);
                        worldPointArr5[lIIIllllI[23]] = new WorldPoint(lIIIllllI[44], lIIIllllI[45], lIIIllllI[9]);
                        worldPointArr5[lIIIllllI[24]] = new WorldPoint(lIIIllllI[46], lIIIllllI[47], lIIIllllI[9]);
                        worldPointArr5[lIIIllllI[25]] = new WorldPoint(lIIIllllI[48], lIIIllllI[49], lIIIllllI[9]);
                        AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[208]];
                        Walker.walkAlong(Arrays.asList(worldPointArr5), new HashMap());
                        "".length();
                        Time.sleepTicks(lIIIllllI[4]);
                        "".length();
                    }
                }
                if (lllIllllIll(Players.getLocal().getWorldLocation().distanceTo(jR), lIIIllllI[11])) {
                    AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[209]];
                    String[] strArr60 = new String[lIIIllllI[4]];
                    strArr60[lIIIllllI[9]] = lIIIlllII[lIIIllllI[210]];
                    if (lllIlllllII(NPCs.getNearest(strArr60))) {
                        String[] strArr61 = new String[lIIIllllI[4]];
                        strArr61[lIIIllllI[9]] = lIIIlllII[lIIIllllI[211]];
                        TileObjects.getNearest(strArr61).interact(lIIIlllII[lIIIllllI[212]]);
                        Time.sleepTicks(lIIIllllI[6]);
                        "".length();
                    }
                }
                String[] strArr62 = new String[lIIIllllI[4]];
                strArr62[lIIIllllI[9]] = lIIIlllII[lIIIllllI[213]];
                if (lllIllllIII(NPCs.getNearest(strArr62))) {
                    C0006g.a(lIIIlllII[lIIIllllI[214]], bR);
                }
            }
            if (lllIlllIlII(Vars.getBit(QuestVarbits.QUEST_THE_CORSAIR_CURSE.getId()), lIIIllllI[19])) {
                C0006g.a(lIIIlllII[lIIIllllI[215]], bR);
            }
            if (lllIlllIlII(Vars.getBit(QuestVarbits.QUEST_THE_CORSAIR_CURSE.getId()), lIIIllllI[78])) {
                String[] strArr63 = new String[lIIIllllI[4]];
                strArr63[lIIIllllI[9]] = lIIIlllII[lIIIllllI[216]];
                if (lllIllllIII(NPCs.getNearest(strArr63))) {
                    String[] strArr64 = new String[lIIIllllI[4]];
                    strArr64[lIIIllllI[9]] = lIIIlllII[lIIIllllI[217]];
                    TileObjects.getNearest(strArr64).interact(lIIIlllII[lIIIllllI[218]]);
                }
                String[] strArr65 = new String[lIIIllllI[4]];
                strArr65[lIIIllllI[9]] = lIIIlllII[lIIIllllI[219]];
                if (lllIlllllII(NPCs.getNearest(strArr65)) && lllIllllIll(Players.getLocal().getWorldLocation().distanceTo(jR), lIIIllllI[24])) {
                    AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[220]];
                    int[] iArr3 = new int[lIIIllllI[4]];
                    iArr3[lIIIllllI[9]] = lIIIllllI[16];
                    Item first = Inventory.getFirst(iArr3);
                    String[] strArr66 = new String[lIIIllllI[4]];
                    strArr66[lIIIllllI[9]] = lIIIlllII[lIIIllllI[221]];
                    first.useOn(TileObjects.getNearest(strArr66));
                    Time.sleepTicks(lIIIllllI[7]);
                    "".length();
                }
            }
            if (lllIlllIlII(Vars.getBit(QuestVarbits.QUEST_THE_CORSAIR_CURSE.getId()), lIIIllllI[82])) {
                C0006g.a(bR);
            }
            if (lllIlllIlII(Vars.getBit(QuestVarbits.QUEST_THE_CORSAIR_CURSE.getId()), lIIIllllI[22])) {
                if (lllIlllIlll(jW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllIlllIlll(jX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lllIllllIlI(Players.getLocal().distanceTo(jU), lIIIllllI[6])) {
                        AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[222]];
                        Movement.walkTo(jU);
                        "".length();
                        Time.sleepTicks(lIIIllllI[4]);
                        "".length();
                    }
                    if (lllIllllIll(Players.getLocal().distanceTo(jU), lIIIllllI[6]) && lllIlllIlll(Players.getLocal().getWorldLocation().getPlane()) && lllIlllIlll(jX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        String[] strArr67 = new String[lIIIllllI[4]];
                        strArr67[lIIIllllI[9]] = lIIIlllII[lIIIllllI[223]];
                        TileObjects.getNearest(strArr67).interact(lIIIlllII[lIIIllllI[224]]);
                        Time.sleepTicks(lIIIllllI[11]);
                        "".length();
                    }
                }
                if (lllIlllIlIl(jX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[225]];
                    C0006g.a(lIIIlllII[lIIIllllI[226]], bR);
                }
            }
            if (lllIlllIlII(Vars.getBit(QuestVarbits.QUEST_THE_CORSAIR_CURSE.getId()), lIIIllllI[84])) {
                if (lllIlllIlIl(jX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] strArr68 = new String[lIIIllllI[4]];
                    strArr68[lIIIllllI[9]] = lIIIlllII[lIIIllllI[227]];
                    TileObjects.getNearest(strArr68).interact(lIIIlllII[lIIIllllI[228]]);
                    Time.sleepTicks(lIIIllllI[6]);
                    "".length();
                }
                if (lllIllllIlI(Players.getLocal().getWorldLocation().distanceTo(jR), lIIIllllI[11])) {
                    String[] strArr69 = new String[lIIIllllI[4]];
                    strArr69[lIIIllllI[9]] = lIIIlllII[lIIIllllI[229]];
                    if (lllIlllllII(NPCs.getNearest(strArr69)) && lllIlllIlll(jX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        WorldPoint[] worldPointArr6 = new WorldPoint[lIIIllllI[17]];
                        worldPointArr6[lIIIllllI[9]] = new WorldPoint(lIIIllllI[27], lIIIllllI[33], lIIIllllI[9]);
                        worldPointArr6[lIIIllllI[4]] = new WorldPoint(lIIIllllI[27], lIIIllllI[34], lIIIllllI[9]);
                        worldPointArr6[lIIIllllI[5]] = new WorldPoint(lIIIllllI[35], lIIIllllI[36], lIIIllllI[9]);
                        worldPointArr6[lIIIllllI[6]] = new WorldPoint(lIIIllllI[37], lIIIllllI[36], lIIIllllI[9]);
                        worldPointArr6[lIIIllllI[7]] = new WorldPoint(lIIIllllI[38], lIIIllllI[39], lIIIllllI[9]);
                        worldPointArr6[lIIIllllI[11]] = new WorldPoint(lIIIllllI[40], lIIIllllI[41], lIIIllllI[9]);
                        worldPointArr6[lIIIllllI[8]] = new WorldPoint(lIIIllllI[42], lIIIllllI[43], lIIIllllI[9]);
                        worldPointArr6[lIIIllllI[23]] = new WorldPoint(lIIIllllI[44], lIIIllllI[45], lIIIllllI[9]);
                        worldPointArr6[lIIIllllI[24]] = new WorldPoint(lIIIllllI[46], lIIIllllI[47], lIIIllllI[9]);
                        worldPointArr6[lIIIllllI[25]] = new WorldPoint(lIIIllllI[48], lIIIllllI[49], lIIIllllI[9]);
                        AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[230]];
                        Walker.walkAlong(Arrays.asList(worldPointArr6), new HashMap());
                        "".length();
                        Time.sleepTicks(lIIIllllI[4]);
                        "".length();
                    }
                }
                if (lllIllllIll(Players.getLocal().getWorldLocation().distanceTo(jR), lIIIllllI[11])) {
                    AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[231]];
                    String[] strArr70 = new String[lIIIllllI[4]];
                    strArr70[lIIIllllI[9]] = lIIIlllII[lIIIllllI[232]];
                    if (lllIlllllII(NPCs.getNearest(strArr70))) {
                        String[] strArr71 = new String[lIIIllllI[4]];
                        strArr71[lIIIllllI[9]] = lIIIlllII[lIIIllllI[233]];
                        TileObjects.getNearest(strArr71).interact(lIIIlllII[lIIIllllI[234]]);
                        Time.sleepTicks(lIIIllllI[6]);
                        "".length();
                    }
                }
                String[] strArr72 = new String[lIIIllllI[4]];
                strArr72[lIIIllllI[9]] = lIIIlllII[lIIIllllI[235]];
                if (lllIllllIII(NPCs.getNearest(strArr72))) {
                    int[] iArr4 = new int[lIIIllllI[4]];
                    iArr4[lIIIllllI[9]] = lIIIllllI[21];
                    if (lllIlllIlIl(Inventory.contains(iArr4) ? 1 : 0)) {
                        int[] iArr5 = new int[lIIIllllI[4]];
                        iArr5[lIIIllllI[9]] = lIIIllllI[21];
                        if (lllIlllIlll(Equipment.contains(iArr5) ? 1 : 0)) {
                            int[] iArr6 = new int[lIIIllllI[4]];
                            iArr6[lIIIllllI[9]] = lIIIllllI[21];
                            Inventory.getFirst(iArr6).interact(lIIIlllII[lIIIllllI[236]]);
                        }
                    }
                    int[] iArr7 = new int[lIIIllllI[4]];
                    iArr7[lIIIllllI[9]] = lIIIllllI[21];
                    if (lllIlllIlll(Equipment.contains(iArr7) ? 1 : 0)) {
                        C0004e.l(lIIIllllI[20]);
                    }
                    if (lllIlllllIl(lllIlllIIll(C0004e.u(), 55.0d))) {
                        int[] iArr8 = new int[lIIIllllI[4]];
                        iArr8[lIIIllllI[9]] = lIIIllllI[18];
                        if (lllIlllIlIl(Inventory.contains(iArr8) ? 1 : 0)) {
                            int[] iArr9 = new int[lIIIllllI[4]];
                            iArr9[lIIIllllI[9]] = lIIIllllI[18];
                            Inventory.getFirst(iArr9).interact(lIIIlllII[lIIIllllI[237]]);
                            Time.sleepTicks(lIIIllllI[4]);
                            "".length();
                        }
                    }
                    if (lllIlllllII(Players.getLocal().getInteracting())) {
                        String[] strArr73 = new String[lIIIllllI[4]];
                        strArr73[lIIIllllI[9]] = lIIIlllII[lIIIllllI[238]];
                        NPCs.getNearest(strArr73).interact(lIIIlllII[lIIIllllI[239]]);
                        Time.sleepTicks(lIIIllllI[5]);
                        "".length();
                    }
                }
            }
            if (lllIlllIlII(Vars.getBit(QuestVarbits.QUEST_THE_CORSAIR_CURSE.getId()), lIIIllllI[87])) {
                String[] strArr74 = new String[lIIIllllI[4]];
                strArr74[lIIIllllI[9]] = lIIIlllII[lIIIllllI[240]];
                if (lllIllllIII(TileObjects.getNearest(strArr74)) && lllIlllIlII(Players.getLocal().getWorldLocation().getPlane(), lIIIllllI[4])) {
                    String[] strArr75 = new String[lIIIllllI[4]];
                    strArr75[lIIIllllI[9]] = lIIIlllII[lIIIllllI[241]];
                    TileObjects.getNearest(strArr75).interact(lIIIlllII[lIIIllllI[242]]);
                    Time.sleepTicks(lIIIllllI[6]);
                    "".length();
                }
                if (lllIlllIlll(jW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllIlllIlll(jX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lllIllllIlI(Players.getLocal().distanceTo(jU), lIIIllllI[6])) {
                        AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[243]];
                        Movement.walkTo(jU);
                        "".length();
                        Time.sleepTicks(lIIIllllI[4]);
                        "".length();
                    }
                    if (lllIllllIll(Players.getLocal().distanceTo(jU), lIIIllllI[6]) && lllIlllIlll(Players.getLocal().getWorldLocation().getPlane())) {
                        String[] strArr76 = new String[lIIIllllI[4]];
                        strArr76[lIIIllllI[9]] = lIIIlllII[lIIIllllI[244]];
                        TileObjects.getNearest(strArr76).interact(lIIIlllII[lIIIllllI[245]]);
                        Time.sleepTicks(lIIIllllI[6]);
                        "".length();
                    }
                }
                if (lllIlllIlIl(jX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[246]];
                    if (lllIlllIllI(cl, lIIIllllI[4])) {
                        an.pQ += lIIIllllI[4];
                        an.o(AccBuilderEasyClues.m);
                        cl += lIIIllllI[4];
                        an.pQ = lIIIllllI[9];
                        cm = lIIIllllI[9];
                    }
                    C0006g.a(lIIIlllII[lIIIllllI[247]], bR);
                }
            }
            if (lllIlllIlII(Vars.getBit(QuestVarbits.QUEST_THE_CORSAIR_CURSE.getId()), lIIIllllI[92])) {
                int[] iArr10 = new int[lIIIllllI[4]];
                iArr10[lIIIllllI[9]] = lIIIllllI[12];
                if (lllIlllIlIl(Inventory.contains(iArr10) ? 1 : 0) && lllIlllIlIl(jX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    int[] iArr11 = new int[lIIIllllI[4]];
                    iArr11[lIIIllllI[9]] = lIIIllllI[12];
                    Inventory.getFirst(iArr11).interact(lIIIlllII[lIIIllllI[248]]);
                    Time.sleepTicks(lIIIllllI[11]);
                    "".length();
                }
            }
            C0006g.a(bR);
        }
    }

    private static boolean lllIlllllII(Object obj) {
        return obj == null;
    }

    private static boolean lllIlllIlll(int i) {
        return i == 0;
    }

    private static String lllIlIllIll(String lIIIlIllIlllIlI, String lIIIlIllIlllIIl) {
        String str = new String(Base64.getDecoder().decode(lIIIlIllIlllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIIlIllIlllIII = new StringBuilder();
        char[] lIIIlIllIllIlll = lIIIlIllIlllIIl.toCharArray();
        int lIIIlIllIllIllI = lIIIllllI[9];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIIIllllI[9];
        while (lllIlllIllI(i, length)) {
            lIIIlIllIlllIII.append((char) (charArray[i] ^ lIIIlIllIllIlll[lIIIlIllIllIllI % lIIIlIllIllIlll.length]));
            "".length();
            lIIIlIllIllIllI++;
            i++;
            "".length();
            if (((38 ^ 29) & ((118 ^ 77) ^ (-1))) > ((94 ^ 123) & ((41 ^ 12) ^ (-1)))) {
                return null;
            }
        }
        return String.valueOf(lIIIlIllIlllIII);
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public int T() {
        try {
            cZ();
            "".length();
            if (0 != 0) {
                return ((((162 + 79) - 184) + 131) ^ (((144 + 149) - 149) + 41)) & (((((20 + 92) - 98) + 136) ^ (((60 + 46) - 4) + 45)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return lIIIllllI[146];
    }

    private static boolean lllIlllIlIl(int i) {
        return i != 0;
    }

    private static boolean lllIllllIlI(int i, int i2) {
        return i > i2;
    }

    private static void lllIllIlllI() {
        lIIIlllII = new String[lIIIllllI[285]];
        lIIIlllII[lIIIllllI[9]] = lllIlIllIll("NwYsAysZCiZKOgQWKwQ/UQY2DzUCQ2IZLxgbIQIxHwhiCDkSBGIeN1EeNw8rBQ==", "qoBjX");
        lIIIlllII[lIIIllllI[4]] = lllIlIlllII("ffWsmQKOBklUQSv9sJEKDg==", "fbgJR");
        lIIIlllII[lIIIllllI[5]] = lllIlIllIll("JAMeFBoFDBdQFA0MGxkYCw==", "lbppv");
        lIIIlllII[lIIIllllI[6]] = lllIlIllIll("OylQKToJbB0hOx8lHi9oHTkVOzxMPwU4OAAlFTtkTD8HITwPJBkmL0w4H2gKORU5Bg8=", "lLpHH");
        lIIIlllII[lIIIllllI[7]] = lllIlIlllIl("H/aLmgjmnGg=", "rFxDf");
        lIIIlllII[lIIIllllI[11]] = lllIlIlllII("AtO39B/suGQk1tq2BbZNXQ==", "IDBzc");
        lIIIlllII[lIIIllllI[8]] = lllIlIllIll("EBoYIARjHww3Azc=", "CnyRp");
        lIIIlllII[lIIIllllI[23]] = lllIlIllIll("ESoWJSs7JUYFJTEg", "RKfQJ");
        lIIIlllII[lIIIllllI[24]] = lllIlIlllII("rGs2xe9bKjJ9ZDsr2TG7Yg==", "FdjvH");
        lIIIlllII[lIIIllllI[25]] = lllIlIllIll("EjY7IGgIJzQ=", "fWWKH");
        lIIIlllII[lIIIllllI[17]] = lllIlIlllII("NTgB2BD7c26h9J4dhCUl/A==", "YofZw");
        lIIIlllII[lIIIllllI[29]] = lllIlIlllIl("kbZFMf2Mlb58d4rn/R+CtA==", "CHKAJ");
        lIIIlllII[lIIIllllI[30]] = lllIlIlllIl("+qdfZzVLOwo=", "hEQGI");
        lIIIlllII[lIIIllllI[31]] = lllIlIllIll("FxkrAD08GSsM", "PxEgM");
        lIIIlllII[lIIIllllI[32]] = lllIlIlllII("UT4wRg3AQOk=", "fjvDk");
        lIIIlllII[lIIIllllI[26]] = lllIlIllIll("LRUDCBFEFQMCWCoAHQ4fBRUEFQ==", "dakgx");
        lIIIlllII[lIIIllllI[50]] = lllIlIlllII("P4oNUw0AAvZ0wscNpyZIFNhATC0tBifQ", "uezOx");
        lIIIlllII[lIIIllllI[51]] = lllIlIlllIl("7Xe2atCYTY7s41qxlknUkw==", "XRFmB");
        lIIIlllII[lIIIllllI[52]] = lllIlIlllII("g3TYPMv11M4F3X9a2GDfK3ds+0/2OnSb", "eHyzx");
        lIIIlllII[lIIIllllI[53]] = lllIlIllIll("NhswCygW", "eoQbZ");
        lIIIlllII[lIIIllllI[54]] = lllIlIllIll("Bj0HDhQ=", "EQncv");
        lIIIlllII[lIIIllllI[55]] = lllIlIlllII("nn7syVJOW6RCEHmD4apfn8J0Kh1IJkjs", "sArLN");
        lIIIlllII[lIIIllllI[56]] = lllIlIlllII("ja31l+jYAKukPcW1HBX2wDmR+bHfHd9t", "rcjix");
        lIIIlllII[lIIIllllI[57]] = lllIlIlllIl("us37zfiOPBrOiOcIfmiZrg==", "DLDtl");
        lIIIlllII[lIIIllllI[58]] = lllIlIlllIl("tzbHvJwlFqJ8iwjcrdDP074djXmKiR+p", "aulZD");
        lIIIlllII[lIIIllllI[59]] = lllIlIllIll("Kg4bKAFDDhsiSC0bBS4PAg4cNQ==", "czsGh");
        lIIIlllII[lIIIllllI[60]] = lllIlIllIll("OAAKEREY", "ktkxc");
        lIIIlllII[lIIIllllI[61]] = lllIlIlllII("94RX9hqBpVc=", "FLaff");
        lIIIlllII[lIIIllllI[62]] = lllIlIllIll("ACgwJgljIDY8BWMjNyQIIC15OB8iLSs4", "CDYKk");
        lIIIlllII[lIIIllllI[63]] = lllIlIlllII("zvnbXxJIvvU=", "cpmbl");
        lIIIlllII[lIIIllllI[64]] = lllIlIllIll("LAELJxpCCQ09Fg==", "ombJx");
        lIIIlllII[lIIIllllI[65]] = lllIlIlllIl("8oASYgz82UpN9gTZfxva+4K4I4rVbqVn", "tgfVE");
        lIIIlllII[lIIIllllI[66]] = lllIlIllIll("FjM3Dx53NSwPUAMpLQ8W", "WADjp");
        lIIIlllII[lIIIllllI[67]] = lllIlIllIll("AwkUVTUiSCMHMigG", "MhbuA");
        lIIIlllII[lIIIllllI[68]] = lllIlIlllIl("i/l9Ow8XJUIAXhh3Yw9J9A==", "WfOdv");
        lIIIlllII[lIIIllllI[69]] = lllIlIllIll("ETYUOwUx", "BBuRw");
        lIIIlllII[lIIIllllI[70]] = lllIlIlllIl("EiBa90KBmBkzs2I9soUwZw==", "xgaod");
        lIIIlllII[lIIIllllI[71]] = lllIlIlllIl("hbhRujUwkV2r5m8uY/YD+A==", "ufSRt");
        lIIIlllII[lIIIllllI[72]] = lllIlIllIll("ByM0Mmk2LTd3LiA2YiMhLjZiJSwjKyF3Ky4hKXcvPS0v", "OBBWI");
        lIIIlllII[lIIIllllI[73]] = lllIlIllIll("JiYlDHYcNyo=", "rGIgV");
        lIIIlllII[lIIIllllI[19]] = lllIlIlllIl("kJ4sN94stQLZjR+6XAz7QA==", "pikfv");
        lIIIlllII[lIIIllllI[74]] = lllIlIlllIl("51mCaPzxEIR2jffKkImiBQ==", "kUHKS");
        lIIIlllII[lIIIllllI[75]] = lllIlIlllII("oi8Up6H/WKFFpLOj8j5c4yaQe51KgCfo", "NbTxT");
        lIIIlllII[lIIIllllI[76]] = lllIlIllIll("DDQjI3I2JSw=", "XUOHR");
        lIIIlllII[lIIIllllI[77]] = lllIlIllIll("JzYrKz1EFSY7cyc4JSs9", "dWIBS");
        lIIIlllII[lIIIllllI[78]] = lllIlIllIll("NAMVMBgU", "gwtYj");
        lIIIlllII[lIIIllllI[79]] = lllIlIlllII("uYFWYN+VS2GvDQA3/U6rQw==", "EqGzi");
        lIIIlllII[lIIIllllI[80]] = lllIlIlllIl("KC72QO8Kxp2Ct8vXwWJixg==", "ZXznc");
        lIIIlllII[lIIIllllI[81]] = lllIlIlllII("XYUUHsyspdR5c2BI87Rxfg==", "Dmpir");
        lIIIlllII[lIIIllllI[82]] = lllIlIlllII("oB6+lWl+YkY=", "rmaZP");
        lIIIlllII[lIIIllllI[22]] = lllIlIlllIl("EVYOEcOEzTEH7LpXZo9fAw==", "cFwJd");
        lIIIlllII[lIIIllllI[83]] = lllIlIllIll("MicIMyAcaRM4JlUKCD8o", "uIgPC");
        lIIIlllII[lIIIllllI[84]] = lllIlIlllII("I5YU9e25W/KHwWaJqEGzowQKWDkdccra", "zNoZS");
        lIIIlllII[lIIIllllI[85]] = lllIlIlllII("eRIb5na26LPeSvr2RpzX8Q==", "ZzXwX");
        lIIIlllII[lIIIllllI[86]] = lllIlIllIll("MxQpJ0UJBSY=", "guELe");
        lIIIlllII[lIIIllllI[87]] = lllIlIlllII("cq48GVl062qTswdCNBIGjw==", "lNKJu");
        lIIIlllII[lIIIllllI[88]] = lllIlIllIll("MjsYKjcYORZnJgU2GDUm", "qWqGU");
        lIIIlllII[lIIIllllI[89]] = lllIlIllIll("IQYjBScB", "rrBlU");
        lIIIlllII[lIIIllllI[90]] = lllIlIlllII("SOWu8m7kMiClrLuUAJ1deQ==", "rlnLy");
        lIIIlllII[lIIIllllI[91]] = lllIlIlllII("TGV5ti2PtpJrdwII+3qfgw==", "Dqbjc");
        lIIIlllII[lIIIllllI[92]] = lllIlIlllIl("j5iJdNNQYxBPEWK12sDUtg==", "bIXry");
        lIIIlllII[lIIIllllI[93]] = lllIlIlllIl("B3OoK1UtjPU=", "OoBmz");
        lIIIlllII[lIIIllllI[94]] = lllIlIlllIl("FlMRjB5f/h+qWzjUd3jOkA==", "CrRMd");
        lIIIlllII[lIIIllllI[95]] = lllIlIlllII("DmVeMulaTDkOTfqydj9dPQ==", "sXXwO");
        lIIIlllII[lIIIllllI[96]] = lllIlIllIll("BwM4MhJmFT8mEmYSNiQUIwV3KAE0BA==", "FaWGf");
        lIIIlllII[lIIIllllI[97]] = lllIlIllIll("AygpISsTCiQ6OhYgKw==", "wIEJN");
        lIIIlllII[lIIIllllI[98]] = lllIlIllIll("JSM+HwMOIz4T", "bBPxs");
        lIIIlllII[lIIIllllI[99]] = lllIlIlllII("Nnj6xefqJPI=", "sAGKJ");
        lIIIlllII[lIIIllllI[100]] = lllIlIlllIl("Lm4e8PP2gsa0Vpi6gyfqKg==", "OSyxZ");
        lIIIlllII[lIIIllllI[101]] = lllIlIllIll("Bgw6VQ0nTSQaFS0=", "HmLuy");
        lIIIlllII[lIIIllllI[114]] = lllIlIlllIl("86Uu/F++S1k=", "pgycw");
        lIIIlllII[lIIIllllI[115]] = lllIlIlllII("v+Go2+8iXPo=", "RolLv");
        lIIIlllII[lIIIllllI[116]] = lllIlIlllII("vnB65iG//EOqmJoxSdK7ww==", "LrygR");
        lIIIlllII[lIIIllllI[117]] = lllIlIlllII("+MTKv7CCFWzqUkyFZfqyDg==", "GiFeS");
        lIIIlllII[lIIIllllI[118]] = lllIlIllIll("MCIrJixTHicwOQ==", "sJBCJ");
        lIIIlllII[lIIIllllI[119]] = lllIlIlllII("oMhORjtMIXldb4YnmKDDGNLh5oYZHml6", "DiVFI");
        lIIIlllII[lIIIllllI[120]] = lllIlIlllII("+w38zMareEQCv8QUvcAXjw==", "AnGMB");
        lIIIlllII[lIIIllllI[121]] = lllIlIllIll("GQ8hMw96My0lGg==", "ZgHVi");
        lIIIlllII[lIIIllllI[122]] = lllIlIlllIl("6ueROuCyf2ZU2zLlDxFjMw==", "TiQhR");
        lIIIlllII[lIIIllllI[123]] = lllIlIlllII("J3/zkp+uJww=", "LpcLG");
        lIIIlllII[lIIIllllI[126]] = lllIlIlllII("SKQVPV4q+/S9SiyCUuLmSQ==", "owCVO");
        lIIIlllII[lIIIllllI[127]] = lllIlIlllII("qq2kBnIajf+p5KgBwaIUJg==", "QHbgo");
        lIIIlllII[lIIIllllI[128]] = lllIlIllIll("KyMuLDU=", "xSOHP");
        lIIIlllII[lIIIllllI[129]] = lllIlIlllII("L6iYh/Wd9BY=", "GjECb");
        lIIIlllII[lIIIllllI[130]] = lllIlIlllII("fQ65nh9VfAtcGcM6mUFkjmEBs4BM2qNC", "zyQjo");
        lIIIlllII[lIIIllllI[131]] = lllIlIlllIl("RZH89eDuWlOhW2fPtmtIAw==", "vLeCr");
        lIIIlllII[lIIIllllI[132]] = lllIlIllIll("JBQVLj0THgku", "pqyKN");
        lIIIlllII[lIIIllllI[133]] = lllIlIllIll("KiMHOCYK", "yWfQT");
        lIIIlllII[lIIIllllI[134]] = lllIlIllIll("CzsmHDs=", "HWOqY");
        lIIIlllII[lIIIllllI[135]] = lllIlIlllIl("p8ZGCJS8wRhgRRkbH5KcnQ==", "BsGTr");
        lIIIlllII[lIIIllllI[136]] = lllIlIlllII("nLjhcPT7lP97adC1H9yYEQ==", "XWahC");
        lIIIlllII[lIIIllllI[137]] = lllIlIlllIl("ziSnkfSTzuDC5y93ZLmwGQ==", "jodIH");
        lIIIlllII[lIIIllllI[138]] = lllIlIllIll("Ny0XAxkOKg==", "xOdfk");
        lIIIlllII[lIIIllllI[139]] = lllIlIllIll("LSM4NyIaKSQ3", "yFTRQ");
        lIIIlllII[lIIIllllI[140]] = lllIlIlllIl("NYAaHldu/BQ=", "AXUtp");
        lIIIlllII[lIIIllllI[141]] = lllIlIlllII("xYti3KKAI0Q=", "TlKwA");
        lIIIlllII[lIIIllllI[142]] = lllIlIllIll("HiwnBCkpJjsE", "JIKaZ");
        lIIIlllII[lIIIllllI[143]] = lllIlIllIll("IisCbywDajMhNw8pHQ==", "lJtOX");
        lIIIlllII[lIIIllllI[144]] = lllIlIllIll("HSMCBxEzbRkMF3oOAgsZ", "ZMmdr");
        lIIIlllII[lIIIllllI[145]] = lllIlIlllII("WBz+i8JGp9k=", "LbLxM");
        lIIIlllII[lIIIllllI[146]] = lllIlIlllIl("JbgpTtJwu1Sze1+53fG8uQ==", "GzTJu");
        lIIIlllII[lIIIllllI[147]] = lllIlIlllII("fKWBiD60/qgxH09O8StJ0A==", "zhsCd");
        lIIIlllII[lIIIllllI[148]] = lllIlIlllII("F98XAXRIKL7+vn/X8BP9bw==", "dLtFf");
        lIIIlllII[lIIIllllI[149]] = lllIlIlllII("mFz8bEeyrA79RH0RUr5JtA==", "pBztv");
        lIIIlllII[lIIIllllI[150]] = lllIlIlllII("PC7cc6e/0jpIdQirZC9DYLPfTe161/Er", "URhMQ");
        lIIIlllII[lIIIllllI[151]] = lllIlIlllII("EvP5bhovWcGp6sv8WQZCc0LAZy83YLmEsY85krOs08U=", "xECGI");
        lIIIlllII[lIIIllllI[152]] = lllIlIllIll("KycqMTgL", "xSKXJ");
        lIIIlllII[lIIIllllI[153]] = lllIlIlllII("SVul/dPly+sqlS7t8mOmpA==", "nJGaE");
        lIIIlllII[lIIIllllI[154]] = lllIlIlllII("FD09jxALyX+wnyAtw9Bsp9aH8UDO7SKL", "TfKcr");
        lIIIlllII[lIIIllllI[155]] = lllIlIllIll("CDExWTopcAYLPSM+", "FPGyN");
        lIIIlllII[lIIIllllI[156]] = lllIlIllIll("FzoHAwJ2PBwDTAIgHQMK", "VHtfl");
        lIIIlllII[lIIIllllI[157]] = lllIlIlllII("Qt+3WuAgM1A=", "kUuiW");
        lIIIlllII[lIIIllllI[158]] = lllIlIlllIl("BELCzMwu72aboreb+We/rw==", "MndAM");
        lIIIlllII[lIIIllllI[159]] = lllIlIlllII("6de3qIb7jAQaSvCI6YBR/A==", "URylg");
        lIIIlllII[lIIIllllI[160]] = lllIlIlllII("Q7ZMu2Q8JzI1ft3tYeofJPeGAJQk9tu5", "JcXfC");
        lIIIlllII[lIIIllllI[161]] = lllIlIlllII("O1XqAot+KXjr3GRdOko7fg==", "nYUCq");
        lIIIlllII[lIIIllllI[162]] = lllIlIllIll("BRgjKjxkHjgqchACOSo0", "DjPOR");
        lIIIlllII[lIIIllllI[163]] = lllIlIllIll("CQ4HPhRqLQouWgkACT4U", "JoeWz");
        lIIIlllII[lIIIllllI[164]] = lllIlIllIll("FRsbaDIDAQAsdAMBGmg8AwNOPzE=", "ltnHT");
        lIIIlllII[lIIIllllI[165]] = lllIlIlllII("nuavREyhBheUv2o8b16UOw==", "aRbhK");
        lIIIlllII[lIIIllllI[166]] = lllIlIlllII("SrtfvJ8F1GDSjg8oMjOzRA==", "uURqj");
        lIIIlllII[lIIIllllI[167]] = lllIlIlllIl("b/Y+sZoo3xutoceaSz4uqw==", "aSYma");
        lIIIlllII[lIIIllllI[168]] = lllIlIllIll("EDUZBjQw", "CAxoF");
        lIIIlllII[lIIIllllI[169]] = lllIlIlllIl("en9R3IYSOPGjh5FIKfCf4Q==", "oowzA");
        lIIIlllII[lIIIllllI[170]] = lllIlIllIll("Pic6VB4fZi4bCwQ=", "pFLtj");
        lIIIlllII[lIIIllllI[175]] = lllIlIlllIl("awGK3sAydvMMXdMQEt9V+A==", "wQQZf");
        lIIIlllII[lIIIllllI[176]] = lllIlIlllII("YP/bvPKzBaw=", "ffMeD");
        lIIIlllII[lIIIllllI[177]] = lllIlIlllII("Thp8Bo4JKhb0mVdOjz3vGA==", "xjYHT");
        lIIIlllII[lIIIllllI[178]] = lllIlIllIll("JSo/MTgPJW8RNgUg", "fKOEY");
        lIIIlllII[lIIIllllI[179]] = lllIlIllIll("PwUeBTsUBR4J", "xdpbK");
        lIIIlllII[lIIIllllI[180]] = lllIlIllIll("IDgCPwk=", "cJmLz");
        lIIIlllII[lIIIllllI[181]] = lllIlIlllIl("M6VnVHG9lhLyzObiZQMI3A==", "fOeKL");
        lIIIlllII[lIIIllllI[188]] = lllIlIllIll("AigDNTIsZhg+NGUFAzk6", "EFlVQ");
        lIIIlllII[lIIIllllI[189]] = lllIlIllIll("ARUmJjMh", "RaGOA");
        lIIIlllII[lIIIllllI[190]] = lllIlIllIll("NQo+DAxbEyc=", "vfWan");
        lIIIlllII[lIIIllllI[191]] = lllIlIllIll("BD4XDxAqcAwEFmMTFwMY", "CPxls");
        lIIIlllII[lIIIllllI[192]] = lllIlIlllII("qhZW6EPMcbH2vuG7wBJeCg==", "sQqSR");
        lIIIlllII[lIIIllllI[193]] = lllIlIlllII("JQvRuCtSRN5FLnokJIk9yA==", "WhOJx");
        lIIIlllII[lIIIllllI[194]] = lllIlIlllII("C4y8hfudGepDSpdAoa/lParpAvlC/6S9", "MuRhp");
        lIIIlllII[lIIIllllI[195]] = lllIlIllIll("NT0LCCYV", "fIjaT");
        lIIIlllII[lIIIllllI[196]] = lllIlIlllIl("Lss+K7Pn5Ur5zogAvYPSEg==", "BevFT");
        lIIIlllII[lIIIllllI[197]] = lllIlIllIll("CzwGKx1iPAYhVAwpGC0TIzwBNg==", "BHnDt");
        lIIIlllII[lIIIllllI[198]] = lllIlIlllIl("bHI29ah8GzXZN28B7SVxMA==", "qeRWy");
        lIIIlllII[lIIIllllI[199]] = lllIlIllIll("BjQDBhpnMhgGVBMuGQYS", "GFpct");
        lIIIlllII[lIIIllllI[200]] = lllIlIlllII("D4tHo8Fa3VE=", "FQnll");
        lIIIlllII[lIIIllllI[201]] = lllIlIllIll("Oik+BAxUMCc=", "yEWin");
        lIIIlllII[lIIIllllI[202]] = lllIlIlllII("AdrsHOhu7MibXmH4tRjqNQ==", "wWLgv");
        lIIIlllII[lIIIllllI[203]] = lllIlIlllIl("6h8RBrWmR0gyn+GKB5vVEg==", "dqDqF");
        lIIIlllII[lIIIllllI[204]] = lllIlIllIll("Ljs2IRpPPS0hVDshLCES", "oIEDt");
        lIIIlllII[lIIIllllI[205]] = lllIlIlllII("6Pc55JyQMmE=", "FnFXV");
        lIIIlllII[lIIIllllI[206]] = lllIlIlllIl("VZmOmG2y3NVizryhY+wH/g==", "eLxJm");
        lIIIlllII[lIIIllllI[207]] = lllIlIlllIl("hUZb6fy/Bv1m9r0yp4hNWiwiaabO7nRL", "Ybdam");
        lIIIlllII[lIIIllllI[208]] = lllIlIlllII("GLZ7Ub0EAuTP2VyoxDJV30l6MWMz9/k6", "pdYKS");
        lIIIlllII[lIIIllllI[209]] = lllIlIllIll("PC0eJ2UmPBE=", "HLrLE");
        lIIIlllII[lIIIllllI[210]] = lllIlIlllIl("P3shgwa39g2JWA6DGl9gR6lqbia3kdSJ", "GPlzH");
        lIIIlllII[lIIIllllI[211]] = lllIlIllIll("OTUpEBwZ", "jAHyn");
        lIIIlllII[lIIIllllI[212]] = lllIlIlllIl("F0tr/eU/b5s=", "OehZx");
        lIIIlllII[lIIIllllI[213]] = lllIlIlllIl("N+OLfBSBFvGUXWUL2CqXkrC4KmEryqMM", "nxIAN");
        lIIIlllII[lIIIllllI[214]] = lllIlIlllII("aRUrB+kiyz8FKmZZdPFbHnZ25EBRpTka", "rStdc");
        lIIIlllII[lIIIllllI[215]] = lllIlIllIll("PgYiAQRXBiILTTkTPAcKFgYlHA==", "wrJnm");
        lIIIlllII[lIIIllllI[216]] = lllIlIllIll("Mx8MFhNaHwwcWjQKEhAdGx8LCw==", "zkdyz");
        lIIIlllII[lIIIllllI[217]] = lllIlIlllII("yfADvHbcsqg=", "ajpmt");
        lIIIlllII[lIIIllllI[218]] = lllIlIllIll("FSIeAwM=", "VNwna");
        lIIIlllII[lIIIllllI[219]] = lllIlIllIll("GQw7Gx5wDDsRVx4ZJR0QMQw8Bg==", "PxStw");
        lIIIlllII[lIIIllllI[220]] = lllIlIllIll("ISUiAQANN3AHHBc=", "cPPoi");
        lIIIlllII[lIIIllllI[221]] = lllIlIlllIl("Y1sfkVaUTWdRk/O6naDDFQ==", "SWvZC");
        lIIIlllII[lIIIllllI[222]] = lllIlIlllII("yZ6FvRo60FoDsZgeFQ1r3w==", "Kzxff");
        lIIIlllII[lIIIllllI[223]] = lllIlIlllII("g/s8Qlo6PC6CWBza9+PpSQ==", "Yiwwj");
        lIIIlllII[lIIIllllI[224]] = lllIlIlllII("1q+AvCJYUnI=", "YwnmC");
        lIIIlllII[lIIIllllI[225]] = lllIlIlllII("OPi1fKFPCL5GCnPrgPR3Iw==", "wFspK");
        lIIIlllII[lIIIllllI[226]] = lllIlIlllIl("iYAKWoJnw0t7anOmQkrhTw==", "WdKal");
        lIIIlllII[lIIIllllI[227]] = lllIlIlllIl("ja8u4WmXbIXuZHSlHEQvUA==", "CNKuP");
        lIIIlllII[lIIIllllI[228]] = lllIlIlllII("C4GuJibl1Ms=", "OlWqY");
        lIIIlllII[lIIIllllI[229]] = lllIlIllIll("OTADFz9QMAMddj4lHRExETAECg==", "pDkxV");
        lIIIlllII[lIIIllllI[230]] = lllIlIlllIl("Iq8aO6Pum3jxTn/ZVRVRFq8rbzs0gZNw", "KrMSJ");
        lIIIlllII[lIIIllllI[231]] = lllIlIlllIl("wLwUhpA0IugZ03wmth+TmQ==", "eXyCW");
        lIIIlllII[lIIIllllI[232]] = lllIlIlllII("5E+CMRxAB6O66Y4MKHrEv0vObK+vBKr0", "tkKtn");
        lIIIlllII[lIIIllllI[233]] = lllIlIllIll("Ph4JPBEe", "mjhUc");
        lIIIlllII[lIIIllllI[234]] = lllIlIlllII("kh+fVO8nCc8=", "HozLp");
        lIIIlllII[lIIIllllI[235]] = lllIlIllIll("BRUZLTpsFRkncwIABys0LRUeMA==", "LaqBS");
        lIIIlllII[lIIIllllI[236]] = lllIlIlllII("grs0KcKVg/o=", "NqUts");
        lIIIlllII[lIIIllllI[237]] = lllIlIllIll("FzI6", "RSNNh");
        lIIIlllII[lIIIllllI[238]] = lllIlIllIll("HwYvAj12Bi8IdBgTMQQzNwYoHw==", "VrGmT");
        lIIIlllII[lIIIllllI[239]] = lllIlIlllIl("8ztOhEGM1pM=", "eXRoV");
        lIIIlllII[lIIIllllI[240]] = lllIlIlllIl("E8co71Py6+rfL3k6uhwQnw==", "VUtbA");
        lIIIlllII[lIIIllllI[241]] = lllIlIlllII("6YVeb/RvA9o=", "XRmTe");
        lIIIlllII[lIIIllllI[242]] = lllIlIlllIl("FfmRUYDcF70=", "mPpnM");
        lIIIlllII[lIIIllllI[243]] = lllIlIllIll("GhA+Rh87USoJCiA=", "TqHfk");
        lIIIlllII[lIIIllllI[244]] = lllIlIllIll("ARI9LiAqEj0i", "FsSIP");
        lIIIlllII[lIIIllllI[245]] = lllIlIlllIl("HVNtRkEotfM=", "ZJkKh");
        lIIIlllII[lIIIllllI[246]] = lllIlIlllII("xDb4+sQ0gftmrMfaq+xOIQ==", "XZXud");
        lIIIlllII[lIIIllllI[247]] = lllIlIllIll("DxIBGxAlHVE7Hi8Y", "Lsqoq");
        lIIIlllII[lIIIllllI[248]] = lllIlIlllIl("m7E/oSmGQoY=", "ROCVz");
        lIIIlllII[lIIIllllI[255]] = lllIlIlllII("t/+iMdqv2U6TEbMdD8H0o7c0jFiW7Gch", "zcoUW");
        lIIIlllII[lIIIllllI[256]] = lllIlIlllIl("ad1Md2Cs1IeSM6jqLyorOMd51f2O6OIc", "vWXTx");
        lIIIlllII[lIIIllllI[267]] = lllIlIllIll("MQoLeg==", "hoxTV");
        lIIIlllII[lIIIllllI[268]] = lllIlIlllII("PDTRQFBsfatJ6tjoK4PHjSA1mgZ6Zymd18VtsQWiiVQ=", "nOSbW");
        lIIIlllII[lIIIllllI[269]] = lllIlIlllIl("inl0xSR3xApHWVFcd7wlXgEV+IN1bH/ZSXnxarJTIfIspezvFi7Psg==", "WqAcT");
        lIIIlllII[lIIIllllI[270]] = lllIlIllIll("FwwrLFp4Lm04VioCKzEPeAAldQI3Rwk6BCsGIydWGwg8MFg=", "XgJUv");
        lIIIlllII[lIIIllllI[271]] = lllIlIlllII("4NZydF7T5De/MfbHkORYFMqdVPMic/W8snbeLf1CeB8=", "XoeGL");
        lIIIlllII[lIIIllllI[272]] = lllIlIlllIl("r1Ln5apPtKgKLxR/FLaftYR6gW/SCMwCfS3KNcnyzaJDFpXp5aODz8S6a5KanXVD", "mMuES");
        lIIIlllII[lIIIllllI[273]] = lllIlIlllIl("4RhX6Ip1Cp9Vym2u5IC7ONhxHvB1hemm5vIuQ2OHB1WCfVbIyZX0pw==", "DehFy");
        lIIIlllII[lIIIllllI[274]] = lllIlIlllIl("Q5H0wzi6B+5WlP4qXurGYQnAaHaWCzQ3t+HuKGGOFGNfmQUaHdpa0bI5LLTdjNnngVZlgOH/FbU7Q7Xk3imY5w==", "FrqxP");
        lIIIlllII[lIIIllllI[275]] = lllIlIlllII("98o2JXkOeMveIqQ4+8KDNvshWYDzhXVT+rS0mPB6L+L7XLQMBroocV7ZfZaveLsX", "FSMFW");
        lIIIlllII[lIIIllllI[276]] = lllIlIllIll("PRlBNjEPAkElNk4/QSU2ThgONmY=", "nvaAY");
        lIIIlllII[lIIIllllI[277]] = lllIlIlllIl("Uv/qCadD3ve2Zq8R61t9vwA12LS0uHGhq8xjEaxRxWzTwbOKbJSR/DdQCfcfuZ2D", "VHaDN");
        lIIIlllII[lIIIllllI[278]] = lllIlIlllIl("gpIlu52HcWnvHRddenMzHkDIdCE01lpXujv6KHRycNLqRHbe6L7eDv6J02E/VCqby112wNByaHs=", "khyfJ");
        lIIIlllII[lIIIllllI[279]] = lllIlIllIll("IkoDFicZShIcM0sJBBwtDg5LBy4OSgYWJwdKHxsjEkoKByNLCA4VKRkPSxQjHx4CHSFLGQIQLUU=", "kjksF");
        lIIIlllII[lIIIllllI[280]] = lllIlIlllIl("DHAtCZu66ofrR84QfvsGjbWjeQmI55G7rJAUvO1OItGoVwKHOsMqa6SutqCZWwsT+FmOpcOPEoNDw4N7hNF3PA==", "SwIxt");
        lIIIlllII[lIIIllllI[281]] = lllIlIlllII("zFhLCG6iFS4GrywiGMe64QQK2Rr1RCl3I3BVoNDkzEwS8Wr/Mm8tudagqoUuLOP6r8T4S7c59mI=", "FjcrJ");
        lIIIlllII[lIIIllllI[282]] = lllIlIlllII("mmOqHyR80GjnlWU6IvR6cpvtmDUHhWu8v7eRx7k/NBY=", "FeOip");
        lIIIlllII[lIIIllllI[283]] = lllIlIllIll("OGUGBE8CJxUPTzg2GA4GUTAFDwEYLBdBDgMtBQ8LX2I4BEgCYh4OG1ExGQIEUSMEQQ4dLl4=", "qBpao");
        lIIIlllII[lIIIllllI[284]] = lllIlIlllII("mfMn2zuLdltNaGhxx4oktewStSHNVhem6kfUTwP183NZTXDmqIJZYRoEotuNiUuo", "CQfdB");
    }

    private static boolean lllIlllllIl(int i) {
        return i < 0;
    }

    private static String lllIlIlllIl(String lIIIlIllIlIIlIl, String lIIIlIllIlIIlII) {
        try {
            SecretKeySpec lIIIlIllIlIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIIlIllIlIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIIllllI[5], lIIIlIllIlIlIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIIIlIllIlIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIIlIllIlIIllI) {
            lIIIlIllIlIIllI.printStackTrace();
            return null;
        }
    }

    private static void lllIlllIIlI() {
        lIIIllllI = new int[286];
        lIIIllllI[0] = (-((-6313) & 30893)) & (-2115) & 32767;
        lIIIllllI[1] = (-((-4909) & 31599)) & (-2) & 32763;
        lIIIllllI[2] = (-10241) & 16314;
        lIIIllllI[3] = (-10309) & 16383;
        lIIIllllI[4] = " ".length();
        lIIIllllI[5] = "  ".length();
        lIIIllllI[6] = "   ".length();
        lIIIllllI[7] = (167 ^ 138) ^ (1 ^ 40);
        lIIIllllI[8] = 41 ^ 47;
        lIIIllllI[9] = (41 ^ 107) & ((42 ^ 104) ^ (-1));
        lIIIllllI[10] = (-16482) & 21481;
        lIIIllllI[11] = 74 ^ 79;
        lIIIllllI[12] = (-((-19713) & 27961)) & (-16513) & 32767;
        lIIIllllI[13] = (-8323) & 16331;
        lIIIllllI[14] = (-(3 ^ 66)) & (-29698) & 30713;
        lIIIllllI[15] = (-17031) & 29655;
        lIIIllllI[16] = (-16514) & 17103;
        lIIIllllI[17] = 97 ^ 107;
        lIIIllllI[18] = (-((-16393) & 32269)) & (-1) & 16255;
        lIIIllllI[19] = 159 ^ 183;
        lIIIllllI[20] = (-((-12047) & 16335)) & (-24585) & 30203;
        lIIIllllI[21] = (-27139) & 28471;
        lIIIllllI[22] = 12 ^ 62;
        lIIIllllI[23] = 2 ^ 5;
        lIIIllllI[24] = (197 ^ 144) ^ (91 ^ 6);
        lIIIllllI[25] = 152 ^ 145;
        lIIIllllI[26] = (147 ^ 140) ^ (90 ^ 74);
        lIIIllllI[27] = (-((-150) & 16887)) & (-1153) & 20467;
        lIIIllllI[28] = (-((-257) & 25065)) & (-4097) & 31741;
        lIIIllllI[29] = (71 ^ 94) ^ (144 ^ 130);
        lIIIllllI[30] = (((134 + 71) - 161) + 133) ^ (((55 + 119) - 50) + 65);
        lIIIllllI[31] = (94 ^ 38) ^ (182 ^ 195);
        lIIIllllI[32] = (71 ^ 108) ^ (29 ^ 56);
        lIIIllllI[33] = (-((-8665) & 30207)) & (-129) & 24511;
        lIIIllllI[34] = (-16411) & 19258;
        lIIIllllI[35] = (-5201) & 7771;
        lIIIllllI[36] = (-((-995) & 22518)) & (-137) & 24511;
        lIIIllllI[37] = (-((-18753) & 32243)) & (-322) & 16375;
        lIIIllllI[38] = (-((-6169) & 31259)) & (-1025) & 28671;
        lIIIllllI[39] = (-138) & 2987;
        lIIIllllI[40] = (-17417) & 19965;
        lIIIllllI[41] = (-((-2327) & 15767)) & (-33) & 16319;
        lIIIllllI[42] = (-((-10051) & 14163)) & (-1025) & 7678;
        lIIIllllI[43] = (-4193) & 7038;
        lIIIllllI[44] = (-((-4033) & 28616)) & (-5137) & 32255;
        lIIIllllI[45] = (-((-23185) & 32497)) & (-4101) & 16255;
        lIIIllllI[46] = (-12291) & 14823;
        lIIIllllI[47] = (-1193) & 4030;
        lIIIllllI[48] = (-16388) & 18919;
        lIIIllllI[49] = (-((-2955) & 28655)) & (-4097) & 32630;
        lIIIllllI[50] = 94 ^ 78;
        lIIIllllI[51] = 151 ^ 134;
        lIIIllllI[52] = 150 ^ 132;
        lIIIllllI[53] = 7 ^ 20;
        lIIIllllI[54] = (207 ^ 183) ^ (197 ^ 169);
        lIIIllllI[55] = (((104 + 102) - 171) + 92) ^ (32 ^ 74);
        lIIIllllI[56] = 93 ^ 75;
        lIIIllllI[57] = 152 ^ 143;
        lIIIllllI[58] = (56 ^ 63) ^ (137 ^ 150);
        lIIIllllI[59] = 188 ^ 165;
        lIIIllllI[60] = 16 ^ 10;
        lIIIllllI[61] = (50 ^ 23) ^ (175 ^ 145);
        lIIIllllI[62] = (178 ^ 151) ^ (109 ^ 84);
        lIIIllllI[63] = (1 ^ 43) ^ (244 ^ 195);
        lIIIllllI[64] = 108 ^ 114;
        lIIIllllI[65] = (40 ^ 32) ^ (57 ^ 46);
        lIIIllllI[66] = (54 ^ 31) ^ (137 ^ 128);
        lIIIllllI[67] = 86 ^ 119;
        lIIIllllI[68] = (57 ^ 80) ^ (60 ^ 119);
        lIIIllllI[69] = (((89 + 8) - (-17)) + 16) ^ (((154 + 62) - 85) + 30);
        lIIIllllI[70] = (106 ^ 119) ^ (127 ^ 70);
        lIIIllllI[71] = (186 ^ 179) ^ (234 ^ 198);
        lIIIllllI[72] = 4 ^ 34;
        lIIIllllI[73] = (((119 + 40) - 111) + 128) ^ (((102 + 51) - 20) + 18);
        lIIIllllI[74] = 149 ^ 188;
        lIIIllllI[75] = (69 ^ 53) ^ (247 ^ 173);
        lIIIllllI[76] = 237 ^ 198;
        lIIIllllI[77] = (39 ^ 23) ^ (15 ^ 19);
        lIIIllllI[78] = (75 ^ 95) ^ (147 ^ 170);
        lIIIllllI[79] = 32 ^ 14;
        lIIIllllI[80] = 169 ^ 134;
        lIIIllllI[81] = 104 ^ 88;
        lIIIllllI[82] = (158 ^ 147) ^ (115 ^ 79);
        lIIIllllI[83] = 42 ^ 25;
        lIIIllllI[84] = 76 ^ 120;
        lIIIllllI[85] = 142 ^ 187;
        lIIIllllI[86] = 135 ^ 177;
        lIIIllllI[87] = 142 ^ 185;
        lIIIllllI[88] = 180 ^ 140;
        lIIIllllI[89] = (((62 + 111) - 69) + 79) ^ (((25 + 23) - (-42)) + 52);
        lIIIllllI[90] = 130 ^ 184;
        lIIIllllI[91] = (((231 + 74) - 170) + 114) ^ (((133 + 129) - 253) + 185);
        lIIIllllI[92] = 118 ^ 74;
        lIIIllllI[93] = (102 ^ 15) ^ (35 ^ 119);
        lIIIllllI[94] = (((80 + 91) - (-7)) + 2) ^ (((86 + 87) - 145) + 110);
        lIIIllllI[95] = 24 ^ 39;
        lIIIllllI[96] = (109 ^ 62) ^ (16 ^ 3);
        lIIIllllI[97] = 56 ^ 121;
        lIIIllllI[98] = 74 ^ 8;
        lIIIllllI[99] = 88 ^ 27;
        lIIIllllI[100] = 65 ^ 5;
        lIIIllllI[101] = 20 ^ 81;
        lIIIllllI[102] = (-8230) & 11071;
        lIIIllllI[103] = (-4369) & 6943;
        lIIIllllI[104] = (-9514) & 12079;
        lIIIllllI[105] = (-((-20415) & 28607)) & (-1537) & 12278;
        lIIIllllI[106] = (-((-3117) & 23805)) & (-9) & 23551;
        lIIIllllI[107] = (-1041) & 3583;
        lIIIllllI[108] = (-((-2947) & 12247)) & (-20483) & 32638;
        lIIIllllI[109] = (-199) & 3055;
        lIIIllllI[110] = (-30215) & 32743;
        lIIIllllI[111] = (-((-16417) & 29941)) & (-1) & 16383;
        lIIIllllI[112] = (-((-6801) & 31411)) & (-1) & 27135;
        lIIIllllI[113] = (-1217) & 4077;
        lIIIllllI[114] = (((108 + 89) - 162) + 215) ^ (((146 + 98) - 57) + 1);
        lIIIllllI[115] = (214 ^ 164) ^ (120 ^ 77);
        lIIIllllI[116] = (((49 + 25) - 64) + 197) ^ (((93 + 18) - 11) + 35);
        lIIIllllI[117] = (((23 + 184) - 63) + 65) ^ (((50 + 102) - 75) + 75);
        lIIIllllI[118] = 245 ^ 191;
        lIIIllllI[119] = 55 ^ 124;
        lIIIllllI[120] = 86 ^ 26;
        lIIIllllI[121] = "  ".length() ^ (96 ^ 47);
        lIIIllllI[122] = (((177 + 62) - 39) + 30) ^ (((84 + 99) - 30) + 15);
        lIIIllllI[123] = (138 ^ 156) ^ (253 ^ 164);
        lIIIllllI[124] = (-549) & 3052;
        lIIIllllI[125] = (-((-142) & 5263)) & (-8385) & 16345;
        lIIIllllI[126] = (((180 + 154) - 319) + 238) ^ (((15 + 138) - 9) + 29);
        lIIIllllI[127] = (130 ^ 187) ^ (12 ^ 100);
        lIIIllllI[128] = 17 ^ 67;
        lIIIllllI[129] = (148 ^ 157) ^ (107 ^ 49);
        lIIIllllI[130] = (((63 + 73) - (-27)) + 75) ^ (((169 + 97) - 91) + 11);
        lIIIllllI[131] = 243 ^ 166;
        lIIIllllI[132] = 80 ^ 6;
        lIIIllllI[133] = 248 ^ 175;
        lIIIllllI[134] = 195 ^ 155;
        lIIIllllI[135] = (103 ^ 104) ^ (79 ^ 25);
        lIIIllllI[136] = (((137 + 107) - 112) + 64) ^ (((40 + 51) - (-9)) + 58);
        lIIIllllI[137] = 76 ^ 23;
        lIIIllllI[138] = 100 ^ 56;
        lIIIllllI[139] = 39 ^ 122;
        lIIIllllI[140] = 156 ^ 194;
        lIIIllllI[141] = 73 ^ 22;
        lIIIllllI[142] = 165 ^ 197;
        lIIIllllI[143] = (64 ^ 75) ^ (204 ^ 166);
        lIIIllllI[144] = 103 ^ 5;
        lIIIllllI[145] = (38 ^ 50) ^ (0 ^ 119);
        lIIIllllI[146] = (((78 + 64) - 107) + 92) ^ (170 ^ 177);
        lIIIllllI[147] = (((56 + 92) - 10) + 67) ^ (((75 + 58) - 69) + 104);
        lIIIllllI[148] = (((11 + 193) - 156) + 161) ^ (((136 + 91) - 60) + 16);
        lIIIllllI[149] = 47 ^ 72;
        lIIIllllI[150] = (94 ^ 57) ^ (91 ^ 84);
        lIIIllllI[151] = 81 ^ 56;
        lIIIllllI[152] = (41 ^ 76) ^ (45 ^ 34);
        lIIIllllI[153] = (57 ^ 16) ^ (15 ^ 77);
        lIIIllllI[154] = (117 ^ 26) ^ "   ".length();
        lIIIllllI[155] = (((131 + 70) - (-19)) + 21) ^ (((36 + 151) - 145) + 114);
        lIIIllllI[156] = (154 ^ 133) ^ (254 ^ 143);
        lIIIllllI[157] = (((205 + 56) - 219) + 168) ^ (((136 + 141) - 163) + 75);
        lIIIllllI[158] = 54 ^ 70;
        lIIIllllI[159] = (171 ^ 188) ^ (220 ^ 186);
        lIIIllllI[160] = (((173 + 117) - 145) + 63) ^ (((30 + 104) - 45) + 73);
        lIIIllllI[161] = (19 ^ 37) ^ (203 ^ 142);
        lIIIllllI[162] = 223 ^ 171;
        lIIIllllI[163] = 64 ^ 53;
        lIIIllllI[164] = 212 ^ 162;
        lIIIllllI[165] = (((138 + 49) - 128) + 148) ^ (((41 + 128) - 13) + 28);
        lIIIllllI[166] = (((143 + 179) - 170) + 36) ^ (((35 + 131) - 105) + 135);
        lIIIllllI[167] = 53 ^ 76;
        lIIIllllI[168] = 127 ^ 5;
        lIIIllllI[169] = (117 ^ 101) ^ (58 ^ 81);
        lIIIllllI[170] = (12 ^ 124) ^ (55 ^ 59);
        lIIIllllI[171] = (-((-26645) & 28085)) & (-27) & 4031;
        lIIIllllI[172] = (-(((0 + 124) - 34) + 48)) & (-9233) & 12223;
        lIIIllllI[173] = (-((-1421) & 26047)) & (-5185) & 32383;
        lIIIllllI[174] = (-4103) & 6679;
        lIIIllllI[175] = 99 ^ 30;
        lIIIllllI[176] = 213 ^ 171;
        lIIIllllI[177] = (((187 ^ 160) + (250 ^ 191)) - (137 ^ 135)) + (40 ^ 5);
        lIIIllllI[178] = (((35 ^ 74) + (33 ^ 37)) - (124 ^ 23)) + (116 ^ 10);
        lIIIllllI[179] = (((19 ^ 120) + (((36 + 71) - 23) + 43)) - (((2 + 27) - (-17)) + 152)) + (204 ^ 145);
        lIIIllllI[180] = (((92 ^ 74) + (((117 + 57) - 97) + 51)) - (118 ^ 38)) + (94 ^ 98);
        lIIIllllI[181] = ((112 + 55) - 66) + 30;
        lIIIllllI[182] = (-((-13455) & 13727)) & (-39) & 2879;
        lIIIllllI[183] = (-((-8723) & 13055)) & (-25857) & 32751;
        lIIIllllI[184] = (-9411) & 12263;
        lIIIllllI[185] = (-((-3555) & 32739)) & (-1025) & 32767;
        lIIIllllI[186] = (-5637) & 8191;
        lIIIllllI[187] = (-((-3239) & 31991)) & (-1153) & 32766;
        lIIIllllI[188] = (((1 ^ 121) + (131 ^ 167)) - (((133 + 72) - 159) + 101)) + (250 ^ 129);
        lIIIllllI[189] = ((120 + 115) - 169) + 67;
        lIIIllllI[190] = (((221 ^ 178) + (81 ^ 27)) - (60 ^ 3)) + (81 ^ 93);
        lIIIllllI[191] = ((30 + 36) - (-40)) + 29;
        lIIIllllI[192] = ((69 + 86) - 117) + 98;
        lIIIllllI[193] = (((111 ^ 0) + (56 ^ 44)) - (28 ^ 46)) + (43 ^ 19);
        lIIIllllI[194] = (((33 ^ 95) + (106 ^ 101)) - (243 ^ 197)) + (102 ^ 85);
        lIIIllllI[195] = ((49 + 41) - (-46)) + 3;
        lIIIllllI[196] = ((38 + 109) - 64) + 57;
        lIIIllllI[197] = (((30 ^ 82) + (242 ^ 175)) - (229 ^ 197)) + (0 ^ 4);
        lIIIllllI[198] = ((50 + 15) - (-1)) + 76;
        lIIIllllI[199] = (((0 ^ 123) + (6 ^ 38)) - (173 ^ 161)) + ((114 ^ 85) & ((157 ^ 186) ^ (-1)));
        lIIIllllI[200] = ((88 + 94) - 47) + 9;
        lIIIllllI[201] = (((109 ^ 59) + (193 ^ 171)) - (82 ^ 2)) + (67 ^ 98);
        lIIIllllI[202] = (((77 ^ 108) + (74 ^ 123)) - (132 ^ 149)) + (117 ^ 36);
        lIIIllllI[203] = ((101 + 58) - 74) + 62;
        lIIIllllI[204] = ((50 + 105) - 9) + 2;
        lIIIllllI[205] = (((108 ^ 104) + (128 ^ 180)) - "   ".length()) + (126 ^ 30);
        lIIIllllI[206] = ((100 + 134) - 120) + 36;
        lIIIllllI[207] = (((187 ^ 136) + (166 ^ 188)) - (-(189 ^ 166))) + (106 ^ 69);
        lIIIllllI[208] = ((104 + 44) - 52) + 56;
        lIIIllllI[209] = ((6 + 57) - 54) + 144;
        lIIIllllI[210] = (((((60 + 46) - (-14)) + 29) + (((37 + 116) - 26) + 23)) - (((191 + 145) - 233) + 133)) + (122 ^ 33);
        lIIIllllI[211] = ((151 + 3) - 52) + 53;
        lIIIllllI[212] = ((123 + 71) - 151) + 113;
        lIIIllllI[213] = ((96 + 73) - 51) + 39;
        lIIIllllI[214] = (((58 ^ 81) + (188 ^ 196)) - (((198 + 70) - 251) + 209)) + ((151 + 134) - 227) + 99;
        lIIIllllI[215] = (((40 ^ 82) + (30 ^ 85)) - (132 ^ 194)) + (113 ^ 81);
        lIIIllllI[216] = (((142 ^ 171) + (46 ^ 73)) - (80 ^ 41)) + ((103 + 4) - 60) + 94;
        lIIIllllI[217] = ((24 + 53) - (-76)) + 8;
        lIIIllllI[218] = (((5 ^ 35) + (30 ^ 59)) - (-(73 ^ 87))) + (17 ^ 40);
        lIIIllllI[219] = ((25 + 98) - 104) + 144;
        lIIIllllI[220] = (((141 ^ 149) + (48 ^ 69)) - "  ".length()) + (122 ^ 99);
        lIIIllllI[221] = ((((172 ^ 156) & ((101 ^ 85) ^ (-1))) + (18 ^ 55)) - (-(173 ^ 163))) + (92 ^ 46);
        lIIIllllI[222] = ((151 + 106) - 159) + 68;
        lIIIllllI[223] = (((143 ^ 169) + (67 ^ 103)) - (115 ^ 71)) + ((15 + 107) - 40) + 63;
        lIIIllllI[224] = (((48 ^ 29) + (((131 + 15) - 24) + 21)) - (85 ^ 121)) + (61 ^ 37);
        lIIIllllI[225] = ((147 + 24) - 95) + 93;
        lIIIllllI[226] = (((211 ^ 140) + (111 ^ 2)) - (((7 + 98) - 55) + 124)) + ((137 + 75) - 88) + 16;
        lIIIllllI[227] = (((((124 + 4) - (-18)) + 20) + (127 ^ 73)) - (78 ^ 123)) + (11 ^ 15);
        lIIIllllI[228] = (((122 ^ 119) + (181 ^ 170)) - (-(73 ^ 105))) + (103 ^ 7);
        lIIIllllI[229] = (((47 ^ 87) + (((135 + 49) - 116) + 71)) - (((99 + 151) - 139) + 113)) + ((45 + 99) - 15) + 9;
        lIIIllllI[230] = (((191 ^ 197) + " ".length()) - (-(5 ^ 43))) + (148 ^ 145);
        lIIIllllI[231] = (((((53 + 142) - 123) + 73) + (((27 + 1) - (-101)) + 17)) - (((41 + 117) - 116) + 93)) + (77 ^ 94);
        lIIIllllI[232] = ((134 + 151) - 267) + 158;
        lIIIllllI[233] = (((245 ^ 196) + (((41 + 171) - 181) + 145)) - (20 ^ 89)) + (170 ^ 183);
        lIIIllllI[234] = ((56 + 148) - 118) + 92;
        lIIIllllI[235] = ((111 + 119) - 128) + 77;
        lIIIllllI[236] = ((118 + 19) - 107) + 150;
        lIIIllllI[237] = (((69 ^ 110) + (94 ^ 85)) - (-(133 ^ 151))) + (116 ^ 25);
        lIIIllllI[238] = (((59 ^ 21) + (((114 + 77) - 190) + 175)) - (50 ^ 127)) + (159 ^ 186);
        lIIIllllI[239] = ((5 + 33) - (-85)) + 60;
        lIIIllllI[240] = ((92 + 90) - 10) + 12;
        lIIIllllI[241] = ((30 + 122) - (-23)) + 10;
        lIIIllllI[242] = (((94 ^ 114) + (((106 + 116) - 168) + 84)) - (((103 + 0) - (-24)) + 0)) + ((63 + 7) - 64) + 125;
        lIIIllllI[243] = ((29 + 29) - 13) + 142;
        lIIIllllI[244] = ((97 + 155) - 246) + 182;
        lIIIllllI[245] = (((146 ^ 137) + (((16 + 10) - (-46)) + 76)) - (120 ^ 54)) + (239 ^ 179);
        lIIIllllI[246] = (((((22 + 5) - 11) + 159) + (26 ^ 85)) - (5 ^ 91)) + (92 ^ 66);
        lIIIllllI[247] = ((139 + 145) - 150) + 57;
        lIIIllllI[248] = (((107 ^ 87) + (120 ^ 53)) - (46 ^ 72)) + ((156 + 31) - 134) + 104;
        lIIIllllI[249] = (-7572) & 8091;
        lIIIllllI[250] = (-((-19715) & 24383)) & (-2) & 30589;
        lIIIllllI[251] = (-((-10373) & 30949)) & (-23) & 22518;
        lIIIllllI[252] = (-((-13073) & 29490)) & (-4099) & 32495;
        lIIIllllI[253] = (-6230) & 31229;
        lIIIllllI[254] = (-10243) & 12142;
        lIIIllllI[255] = (((87 ^ 23) + (126 ^ 123)) - (70 ^ 93)) + ((104 + 22) - 5) + 30;
        lIIIllllI[256] = (((((40 + 68) - 16) + 75) + (183 ^ 129)) - (38 ^ 77)) + (50 ^ 98);
        lIIIllllI[257] = (-17441) & 20471;
        lIIIllllI[258] = (-((-26709) & 31607)) & (-21) & 8190;
        lIIIllllI[259] = (-33) & 2943;
        lIIIllllI[260] = (-4451) & 7675;
        lIIIllllI[261] = (-25812) & 28671;
        lIIIllllI[262] = (-((-17695) & 26399)) & (-1025) & 12279;
        lIIIllllI[263] = (-((-2733) & 19117)) & (-8195) & 27118;
        lIIIllllI[264] = (-16405) & 19262;
        lIIIllllI[265] = (-21858) & 24427;
        lIIIllllI[266] = (-((-23381) & 31743)) & (-16390) & 27583;
        lIIIllllI[267] = ((192 + 174) - 217) + 46;
        lIIIllllI[268] = ((" ".length() + (17 ^ 90)) - (97 ^ 103)) + (221 ^ 163);
        lIIIllllI[269] = (((((133 + 85) - 188) + 152) + (((4 + 36) - 34) + 188)) - ((-3751) & 4095)) + ((99 + 61) - 17) + 23;
        lIIIllllI[270] = (((7 ^ 117) + (37 ^ 0)) - (-(58 ^ 55))) + (83 ^ 113);
        lIIIllllI[271] = (((34 ^ 122) + (((83 + 55) - 72) + 95)) - (((58 + 76) - 78) + 81)) + (229 ^ 178);
        lIIIllllI[272] = (((((88 + 112) - 149) + 95) + (137 ^ 145)) - (166 ^ 182)) + (52 ^ 26);
        lIIIllllI[273] = (((((113 + 150) - 153) + 55) + (((18 + 5) - (-77)) + 65)) - (((116 + 113) - 192) + 110)) + (31 ^ 13);
        lIIIllllI[274] = (((140 ^ 179) + (196 ^ 165)) - (249 ^ 170)) + (109 ^ 16);
        lIIIllllI[275] = (((28 ^ 88) + (52 ^ 124)) - (14 ^ 68)) + ((115 + 24) - 95) + 93;
        lIIIllllI[276] = ((166 + 72) - 89) + 55;
        lIIIllllI[277] = ((32 + 178) - 172) + 167;
        lIIIllllI[278] = (((100 ^ 24) + (((60 + 95) - 6) + 27)) - (((198 + 53) - 243) + 197)) + (53 ^ 90);
        lIIIllllI[279] = (((84 ^ 45) + (49 ^ 43)) - (75 ^ 14)) + ((17 + 5) - (-13)) + 94;
        lIIIllllI[280] = ((54 + 71) - 8) + 91;
        lIIIllllI[281] = (((192 ^ 163) + (((11 + 44) - (-61)) + 30)) - (118 ^ 1)) + (196 ^ 151);
        lIIIllllI[282] = ((28 + 83) - (-68)) + 31;
        lIIIllllI[283] = (((169 ^ 177) + (((105 + 154) - 89) + 31)) - (((79 + 41) - (-14)) + 8)) + ((44 + 71) - 46) + 59;
        lIIIllllI[284] = (((136 ^ 187) + (206 ^ 137)) - (125 ^ 71)) + ((92 + 28) - 59) + 87;
        lIIIllllI[285] = ((115 + 209) - 268) + 157;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean V() {
        if (lllIllllllI(Vars.getBit(QuestVarbits.QUEST_THE_CORSAIR_CURSE.getId()), lIIIllllI[92]) && lllIlllIlll(jX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            ?? r0 = lIIIllllI[4];
            "".length();
            return " ".length() < " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIIIllllI[9];
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public String U() {
        return lIIIlllII[lIIIllllI[255]];
    }

    static {
        lllIlllIIlI();
        lllIllIlllI();
        bv = new ArrayList();
        bX = new WorldPoint(lIIIllllI[257], lIIIllllI[258], lIIIllllI[9]);
        jQ = new WorldPoint(lIIIllllI[259], lIIIllllI[260], lIIIllllI[9]);
        jR = new WorldPoint(lIIIllllI[48], lIIIllllI[49], lIIIllllI[9]);
        jS = new WorldPoint(lIIIllllI[186], lIIIllllI[109], lIIIllllI[9]);
        jT = new WorldPoint(lIIIllllI[105], lIIIllllI[187], lIIIllllI[9]);
        jU = new WorldPoint(lIIIllllI[27], lIIIllllI[125], lIIIllllI[9]);
        cj = new WorldPoint(lIIIllllI[112], lIIIllllI[261], lIIIllllI[9]);
        jV = new WorldArea(lIIIllllI[262], lIIIllllI[36], lIIIllllI[17], lIIIllllI[25], lIIIllllI[4]);
        jW = new WorldArea(lIIIllllI[263], lIIIllllI[264], lIIIllllI[25], lIIIllllI[25], lIIIllllI[4]);
        jX = new WorldArea(lIIIllllI[265], lIIIllllI[266], lIIIllllI[26], lIIIllllI[25], lIIIllllI[4]);
        String[] strArr = new String[lIIIllllI[52]];
        strArr[lIIIllllI[9]] = lIIIlllII[lIIIllllI[267]];
        strArr[lIIIllllI[4]] = lIIIlllII[lIIIllllI[268]];
        strArr[lIIIllllI[5]] = lIIIlllII[lIIIllllI[269]];
        strArr[lIIIllllI[6]] = lIIIlllII[lIIIllllI[270]];
        strArr[lIIIllllI[7]] = lIIIlllII[lIIIllllI[271]];
        strArr[lIIIllllI[11]] = lIIIlllII[lIIIllllI[272]];
        strArr[lIIIllllI[8]] = lIIIlllII[lIIIllllI[273]];
        strArr[lIIIllllI[23]] = lIIIlllII[lIIIllllI[274]];
        strArr[lIIIllllI[24]] = lIIIlllII[lIIIllllI[275]];
        strArr[lIIIllllI[25]] = lIIIlllII[lIIIllllI[276]];
        strArr[lIIIllllI[17]] = lIIIlllII[lIIIllllI[277]];
        strArr[lIIIllllI[29]] = lIIIlllII[lIIIllllI[278]];
        strArr[lIIIllllI[30]] = lIIIlllII[lIIIllllI[279]];
        strArr[lIIIllllI[31]] = lIIIlllII[lIIIllllI[280]];
        strArr[lIIIllllI[32]] = lIIIlllII[lIIIllllI[281]];
        strArr[lIIIllllI[26]] = lIIIlllII[lIIIllllI[282]];
        strArr[lIIIllllI[50]] = lIIIlllII[lIIIllllI[283]];
        strArr[lIIIllllI[51]] = lIIIlllII[lIIIllllI[284]];
        bR = strArr;
        kk = lIIIllllI[9];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean S() {
        return lIIIllllI[9];
    }

    private static boolean lllIlllIllI(int i, int i2) {
        return i < i2;
    }

    private static boolean lllIlllIlII(int i, int i2) {
        return i == i2;
    }

    private static boolean lllIllllIIl(int i) {
        return i > 0;
    }

    private static boolean lllIllllIll(int i, int i2) {
        return i <= i2;
    }

    private static boolean lllIllllIII(Object obj) {
        return obj != null;
    }

    private static boolean lllIllllllI(int i, int i2) {
        return i >= i2;
    }
}
