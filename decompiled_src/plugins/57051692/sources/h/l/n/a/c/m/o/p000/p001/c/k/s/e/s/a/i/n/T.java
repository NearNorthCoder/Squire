package h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n;

import gg.squire.account.AccBuilderShamans;
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
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.input.Mouse;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
/* renamed from: h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.T  reason: invalid package */
/* loaded from: 57051692-5fea-40a8-a012-903ac1ab23ac.jar:h/l/n/a/c/m/o/-/-/c/k/s/e/s/a/i/n/T.class */
public class T implements K {
    public static final /* synthetic */ WorldPoint kt;
    public static final /* synthetic */ WorldPoint ku;
    public static /* synthetic */ boolean bn;
    public static /* synthetic */ List<C0003d> bp;
    private static /* synthetic */ int[] lIlIIIllIl;
    static final /* synthetic */ WorldPoint kx;
    static final /* synthetic */ WorldPoint kw;
    static final /* synthetic */ WorldPoint ky;
    public static final /* synthetic */ WorldPoint ks;
    public static final /* synthetic */ WorldPoint kv;
    private static /* synthetic */ String[] lIlIIIllII;
    private final /* synthetic */ int kz = lIlIIIllIl[0];

    private static String lIIIlIlIIlIII(String llllllllllllllllllllIlIIIIIlllII, String llllllllllllllllllllIlIIIIIllIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllllIlIIIIIllIIl.getBytes(StandardCharsets.UTF_8)), lIlIIIllIl[19]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIIIllIl[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllllllIlIIIIIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllllIlIIIIIlllIl) {
            llllllllllllllllllllIlIIIIIlllIl.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0091, code lost:
        if (lIIIlIlIIllII(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean al() {
        int[] iArr = new int[lIlIIIllIl[2]];
        iArr[lIlIIIllIl[1]] = lIlIIIllIl[10];
        if (lIIIlIlIIllII(Inventory.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[lIlIIIllIl[2]];
            iArr2[lIlIIIllIl[1]] = lIlIIIllIl[10];
            if (lIIIlIlIlIlII(Inventory.getFirst(iArr2).getQuantity(), lIlIIIllIl[13])) {
                if (lIIIlIlIIlllI(Inventory.contains(C0005f.aZ) ? 1 : 0)) {
                    if (lIIIlIlIIllII(Equipment.contains(C0005f.aZ) ? 1 : 0)) {
                        int[] iArr3 = new int[lIlIIIllIl[2]];
                        iArr3[lIlIIIllIl[1]] = lIlIIIllIl[0];
                        if (lIIIlIlIIlllI(Inventory.contains(iArr3) ? 1 : 0)) {
                            int[] iArr4 = new int[lIlIIIllIl[2]];
                            iArr4[lIlIIIllIl[1]] = lIlIIIllIl[51];
                        }
                    }
                }
                ?? r0 = lIlIIIllIl[2];
                "".length();
                return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
        }
        return lIlIIIllIl[1];
    }

    private static boolean lIIIlIlIlIlII(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v309, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v333, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v54, types: [boolean] */
    public static void dg() {
        if (lIIIlIlIIllII(bn ? 1 : 0)) {
            AccBuilderShamans.c = lIlIIIllII[lIlIIIllIl[1]];
            C0001b.a(bp);
            if (lIIIlIlIIllIl(bp.size(), lIlIIIllIl[2])) {
                System.out.println(lIlIIIllII[lIlIIIllIl[2]]);
                bn = lIlIIIllIl[1];
            }
        }
        if (lIIIlIlIIlllI(bn ? 1 : 0) && lIIIlIlIIllIl(Skills.getLevel(Skill.PRAYER), lIlIIIllIl[3])) {
            if (lIIIlIlIIlllI(al() ? 1 : 0) && lIIIlIlIIllIl(Game.getWildyLevel(), lIlIIIllIl[2])) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIIIlIlIIllll(nearest) && lIIIlIlIIlllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIIIllII[lIlIIIllIl[4]];
                    C0000a.a(nearest);
                }
                if (lIIIlIlIIllll(nearest) && lIIIlIlIIllII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIIIllII[lIlIIIllIl[5]];
                    if (lIIIlIlIIlllI(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIlIIIllIl[6]);
                        "".length();
                    }
                    if (lIIIlIlIIllII(Bank.isOpen() ? 1 : 0)) {
                        if (lIIIlIlIlIIII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIlIIIllIl[7]);
                            "".length();
                        }
                        if (lIIIlIlIlIIII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIlIIIllIl[4]);
                            "".length();
                        }
                        int[] iArr = new int[lIlIIIllIl[5]];
                        iArr[lIlIIIllIl[1]] = lIlIIIllIl[8];
                        iArr[lIlIIIllIl[2]] = lIlIIIllIl[0];
                        iArr[lIlIIIllIl[4]] = lIlIIIllIl[9];
                        if (lIIIlIlIIlllI(C0004e.b(iArr) ? 1 : 0)) {
                            O();
                            System.out.println(lIlIIIllII[lIlIIIllIl[7]]);
                            bn = lIlIIIllIl[2];
                            return;
                        }
                        int[] iArr2 = new int[lIlIIIllIl[5]];
                        iArr2[lIlIIIllIl[1]] = lIlIIIllIl[8];
                        iArr2[lIlIIIllIl[2]] = lIlIIIllIl[0];
                        iArr2[lIlIIIllIl[4]] = lIlIIIllIl[9];
                        if (lIIIlIlIIllII(C0004e.b(iArr2) ? 1 : 0)) {
                            if (lIIIlIlIIlllI(Equipment.contains(C0005f.aZ) ? 1 : 0)) {
                                C0000a.b(C0005f.aZ, lIlIIIllIl[2]);
                            }
                            C0000a.b(C0005f.aU, lIlIIIllIl[2]);
                            C0000a.a(lIlIIIllIl[10], lIlIIIllIl[11]);
                            C0000a.b(lIlIIIllIl[0], lIlIIIllIl[12]);
                        }
                    }
                }
            }
            if (lIIIlIlIIllII(al() ? 1 : 0)) {
                if (lIIIlIlIIllII(Inventory.contains(C0005f.aU) ? 1 : 0) && lIIIlIlIIllIl(Movement.getRunEnergy(), lIlIIIllIl[13])) {
                    Inventory.getFirst(C0005f.aU).interact(lIlIIIllII[lIlIIIllIl[14]]);
                    Time.sleepTicks(lIlIIIllIl[2]);
                    "".length();
                }
                if (lIIIlIlIIlllI(Movement.isRunEnabled() ? 1 : 0) && lIIIlIlIlIIIl(Movement.getRunEnergy(), lIlIIIllIl[15])) {
                    Movement.toggleRun();
                    Time.sleepTicks(lIlIIIllIl[14]);
                    "".length();
                }
                if (lIIIlIlIIllIl(Game.getWildyLevel(), lIlIIIllIl[2])) {
                    AccBuilderShamans.c = lIlIIIllII[lIlIIIllIl[16]];
                    if (lIIIlIlIIllII(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    if (lIIIlIlIIlllI(Dialog.isOpen() ? 1 : 0) && lIIIlIlIIllII(Inventory.contains(C0005f.aZ) ? 1 : 0) && lIIIlIlIlIIlI(Players.getLocal().getAnimation(), lIlIIIllIl[17])) {
                        Inventory.getFirst(C0005f.aZ).interact(lIlIIIllII[lIlIIIllIl[18]]);
                        Time.sleepTicks(lIlIIIllIl[4]);
                        "".length();
                    }
                    String[] strArr = new String[lIlIIIllIl[4]];
                    strArr[lIlIIIllIl[1]] = lIlIIIllII[lIlIIIllIl[19]];
                    strArr[lIlIIIllIl[2]] = lIlIIIllII[lIlIIIllIl[20]];
                    C0006g.a(strArr);
                }
                if (lIIIlIlIlIIII(Game.getWildyLevel())) {
                    int[] iArr3 = new int[lIlIIIllIl[2]];
                    iArr3[lIlIIIllIl[1]] = lIlIIIllIl[0];
                    if (lIIIlIlIIllII(Inventory.contains(iArr3) ? 1 : 0)) {
                        if (lIIIlIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(ku), lIlIIIllIl[21])) {
                            AccBuilderShamans.c = lIlIIIllII[lIlIIIllIl[22]];
                            WorldPoint[] worldPointArr = new WorldPoint[lIlIIIllIl[21]];
                            worldPointArr[lIlIIIllIl[1]] = new WorldPoint(lIlIIIllIl[23], lIlIIIllIl[24], lIlIIIllIl[1]);
                            worldPointArr[lIlIIIllIl[2]] = new WorldPoint(lIlIIIllIl[25], lIlIIIllIl[26], lIlIIIllIl[1]);
                            worldPointArr[lIlIIIllIl[4]] = new WorldPoint(lIlIIIllIl[27], lIlIIIllIl[28], lIlIIIllIl[1]);
                            worldPointArr[lIlIIIllIl[5]] = new WorldPoint(lIlIIIllIl[29], lIlIIIllIl[30], lIlIIIllIl[1]);
                            worldPointArr[lIlIIIllIl[7]] = new WorldPoint(lIlIIIllIl[31], lIlIIIllIl[32], lIlIIIllIl[1]);
                            worldPointArr[lIlIIIllIl[14]] = new WorldPoint(lIlIIIllIl[33], lIlIIIllIl[34], lIlIIIllIl[1]);
                            worldPointArr[lIlIIIllIl[16]] = new WorldPoint(lIlIIIllIl[35], lIlIIIllIl[36], lIlIIIllIl[1]);
                            worldPointArr[lIlIIIllIl[18]] = new WorldPoint(lIlIIIllIl[37], lIlIIIllIl[38], lIlIIIllIl[1]);
                            worldPointArr[lIlIIIllIl[19]] = new WorldPoint(lIlIIIllIl[39], lIlIIIllIl[38], lIlIIIllIl[1]);
                            worldPointArr[lIlIIIllIl[20]] = new WorldPoint(lIlIIIllIl[40], lIlIIIllIl[38], lIlIIIllIl[1]);
                            worldPointArr[lIlIIIllIl[22]] = new WorldPoint(lIlIIIllIl[41], lIlIIIllIl[38], lIlIIIllIl[1]);
                            worldPointArr[lIlIIIllIl[42]] = new WorldPoint(lIlIIIllIl[43], lIlIIIllIl[44], lIlIIIllIl[1]);
                            worldPointArr[lIlIIIllIl[45]] = new WorldPoint(lIlIIIllIl[46], lIlIIIllIl[44], lIlIIIllIl[1]);
                            Walker.walkAlong(Arrays.asList(worldPointArr), new HashMap());
                            "".length();
                            Time.sleepTicks(lIlIIIllIl[2]);
                            "".length();
                        }
                        if (lIIIlIlIlIIll(Players.getLocal().getWorldLocation().distanceTo(ku), lIlIIIllIl[21])) {
                            AccBuilderShamans.c = lIlIIIllII[lIlIIIllIl[42]];
                            String[] strArr2 = new String[lIlIIIllIl[2]];
                            strArr2[lIlIIIllIl[1]] = lIlIIIllII[lIlIIIllIl[45]];
                            TileObject nearest2 = TileObjects.getNearest(strArr2);
                            String[] strArr3 = new String[lIlIIIllIl[2]];
                            strArr3[lIlIIIllIl[1]] = lIlIIIllII[lIlIIIllIl[21]];
                            TileObject nearest3 = TileObjects.getNearest(strArr3);
                            String[] strArr4 = new String[lIlIIIllIl[2]];
                            strArr4[lIlIIIllIl[1]] = lIlIIIllII[lIlIIIllIl[47]];
                            if (lIIIlIlIIllII(nearest3.hasAction(strArr4) ? 1 : 0)) {
                                nearest3.interact(lIlIIIllII[lIlIIIllIl[48]]);
                            }
                            if (lIIIlIlIIllll(nearest2)) {
                                String[] strArr5 = new String[lIlIIIllIl[2]];
                                strArr5[lIlIIIllIl[1]] = lIlIIIllII[lIlIIIllIl[49]];
                                if (lIIIlIlIIlllI(nearest3.hasAction(strArr5) ? 1 : 0)) {
                                    Skills.getExperience(Skill.PRAYER);
                                    int[] iArr4 = new int[lIlIIIllIl[2]];
                                    iArr4[lIlIIIllIl[1]] = lIlIIIllIl[0];
                                    Item first = Inventory.getFirst(iArr4);
                                    String[] strArr6 = new String[lIlIIIllIl[2]];
                                    strArr6[lIlIIIllIl[1]] = lIlIIIllII[lIlIIIllIl[50]];
                                    first.useOn(TileObjects.getNearest(strArr6));
                                    Time.sleepTicks(lIlIIIllIl[2]);
                                    "".length();
                                }
                            }
                        }
                    }
                    int[] iArr5 = new int[lIlIIIllIl[2]];
                    iArr5[lIlIIIllIl[1]] = lIlIIIllIl[0];
                    if (lIIIlIlIIlllI(Inventory.contains(iArr5) ? 1 : 0)) {
                        int[] iArr6 = new int[lIlIIIllIl[2]];
                        iArr6[lIlIIIllIl[1]] = lIlIIIllIl[51];
                        if (lIIIlIlIIllII(Inventory.contains(iArr6) ? 1 : 0)) {
                            if (lIIIlIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(ku), lIlIIIllIl[21])) {
                                AccBuilderShamans.c = lIlIIIllII[lIlIIIllIl[52]];
                                WorldPoint[] worldPointArr2 = new WorldPoint[lIlIIIllIl[21]];
                                worldPointArr2[lIlIIIllIl[1]] = new WorldPoint(lIlIIIllIl[23], lIlIIIllIl[24], lIlIIIllIl[1]);
                                worldPointArr2[lIlIIIllIl[2]] = new WorldPoint(lIlIIIllIl[25], lIlIIIllIl[26], lIlIIIllIl[1]);
                                worldPointArr2[lIlIIIllIl[4]] = new WorldPoint(lIlIIIllIl[27], lIlIIIllIl[28], lIlIIIllIl[1]);
                                worldPointArr2[lIlIIIllIl[5]] = new WorldPoint(lIlIIIllIl[29], lIlIIIllIl[30], lIlIIIllIl[1]);
                                worldPointArr2[lIlIIIllIl[7]] = new WorldPoint(lIlIIIllIl[31], lIlIIIllIl[32], lIlIIIllIl[1]);
                                worldPointArr2[lIlIIIllIl[14]] = new WorldPoint(lIlIIIllIl[33], lIlIIIllIl[34], lIlIIIllIl[1]);
                                worldPointArr2[lIlIIIllIl[16]] = new WorldPoint(lIlIIIllIl[35], lIlIIIllIl[36], lIlIIIllIl[1]);
                                worldPointArr2[lIlIIIllIl[18]] = new WorldPoint(lIlIIIllIl[37], lIlIIIllIl[38], lIlIIIllIl[1]);
                                worldPointArr2[lIlIIIllIl[19]] = new WorldPoint(lIlIIIllIl[39], lIlIIIllIl[38], lIlIIIllIl[1]);
                                worldPointArr2[lIlIIIllIl[20]] = new WorldPoint(lIlIIIllIl[40], lIlIIIllIl[38], lIlIIIllIl[1]);
                                worldPointArr2[lIlIIIllIl[22]] = new WorldPoint(lIlIIIllIl[41], lIlIIIllIl[38], lIlIIIllIl[1]);
                                worldPointArr2[lIlIIIllIl[42]] = new WorldPoint(lIlIIIllIl[43], lIlIIIllIl[44], lIlIIIllIl[1]);
                                worldPointArr2[lIlIIIllIl[45]] = new WorldPoint(lIlIIIllIl[46], lIlIIIllIl[44], lIlIIIllIl[1]);
                                Walker.walkAlong(Arrays.asList(worldPointArr2), new HashMap());
                                "".length();
                                Time.sleepTicks(lIlIIIllIl[2]);
                                "".length();
                            }
                            if (lIIIlIlIlIIll(Players.getLocal().getWorldLocation().distanceTo(ku), lIlIIIllIl[21])) {
                                AccBuilderShamans.c = lIlIIIllII[lIlIIIllIl[53]];
                                if (!lIIIlIlIIlllI(Dialog.canLevelUpContinue() ? 1 : 0) || lIIIlIlIIllII(Dialog.isOpen() ? 1 : 0)) {
                                    Dialog.close();
                                }
                                String[] strArr7 = new String[lIlIIIllIl[2]];
                                strArr7[lIlIIIllIl[1]] = lIlIIIllII[lIlIIIllIl[15]];
                                NPC nearest4 = NPCs.getNearest(strArr7);
                                String[] strArr8 = new String[lIlIIIllIl[2]];
                                strArr8[lIlIIIllIl[1]] = lIlIIIllII[lIlIIIllIl[54]];
                                TileObject nearest5 = TileObjects.getNearest(strArr8);
                                String[] strArr9 = new String[lIlIIIllIl[2]];
                                strArr9[lIlIIIllIl[1]] = lIlIIIllII[lIlIIIllIl[55]];
                                if (lIIIlIlIIllII(nearest5.hasAction(strArr9) ? 1 : 0)) {
                                    nearest5.interact(lIlIIIllII[lIlIIIllIl[56]]);
                                }
                                if (lIIIlIlIIllll(nearest4)) {
                                    String[] strArr10 = new String[lIlIIIllIl[2]];
                                    strArr10[lIlIIIllIl[1]] = lIlIIIllII[lIlIIIllIl[57]];
                                    if (lIIIlIlIIlllI(nearest5.hasAction(strArr10) ? 1 : 0)) {
                                        if (lIIIlIlIIlllI(Dialog.isOpen() ? 1 : 0)) {
                                            int[] iArr7 = new int[lIlIIIllIl[2]];
                                            iArr7[lIlIIIllIl[1]] = lIlIIIllIl[51];
                                            Inventory.getFirst(iArr7).useOn(nearest4);
                                            Time.sleepTicks(lIlIIIllIl[4]);
                                            "".length();
                                        }
                                        if (lIIIlIlIIllII(Dialog.isOpen() ? 1 : 0)) {
                                            List options = Dialog.getOptions();
                                            if (lIIIlIlIIlllI(options.isEmpty() ? 1 : 0)) {
                                                int i = lIlIIIllIl[1];
                                                while (lIIIlIlIIllIl(i, options.size())) {
                                                    int[] iArr8 = new int[lIlIIIllIl[2]];
                                                    iArr8[lIlIIIllIl[1]] = lIlIIIllIl[51];
                                                    if (lIIIlIlIlIIlI(((Item) Inventory.getAll(iArr8).get(lIlIIIllIl[1])).getQuantity(), lIlIIIllIl[2]) && lIIIlIlIIllII(((Widget) options.get(i)).getText().contains(lIlIIIllII[lIlIIIllIl[58]]) ? 1 : 0)) {
                                                        Mouse.click(((Widget) options.get(i)).getClickPoint().getX(), ((Widget) options.get(i)).getClickPoint().getY(), (boolean) lIlIIIllIl[2]);
                                                        Time.sleepTicks(lIlIIIllIl[4]);
                                                        "".length();
                                                    }
                                                    int[] iArr9 = new int[lIlIIIllIl[2]];
                                                    iArr9[lIlIIIllIl[1]] = lIlIIIllIl[51];
                                                    if (lIIIlIlIlIIlI(((Item) Inventory.getAll(iArr9).get(lIlIIIllIl[1])).getQuantity(), lIlIIIllIl[14]) && lIIIlIlIIllII(((Widget) options.get(i)).getText().contains(lIlIIIllII[lIlIIIllIl[59]]) ? 1 : 0)) {
                                                        Mouse.click(((Widget) options.get(i)).getClickPoint().getX(), ((Widget) options.get(i)).getClickPoint().getY(), (boolean) lIlIIIllIl[2]);
                                                        Time.sleepTicks(lIlIIIllIl[4]);
                                                        "".length();
                                                    }
                                                    if (lIIIlIlIIllII(((Widget) options.get(i)).getText().contains(lIlIIIllII[lIlIIIllIl[60]]) ? 1 : 0)) {
                                                        Mouse.click(((Widget) options.get(i)).getClickPoint().getX(), ((Widget) options.get(i)).getClickPoint().getY(), (boolean) lIlIIIllIl[2]);
                                                        Time.sleepTicks(lIlIIIllIl[4]);
                                                        "".length();
                                                    }
                                                    i++;
                                                    "".length();
                                                    if ((38 ^ 34) > (168 ^ 172)) {
                                                        return;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            int[] iArr10 = new int[lIlIIIllIl[2]];
            iArr10[lIlIIIllIl[1]] = lIlIIIllIl[10];
            if (lIIIlIlIIllII(Inventory.contains(iArr10) ? 1 : 0)) {
                int[] iArr11 = new int[lIlIIIllIl[2]];
                iArr11[lIlIIIllIl[1]] = lIlIIIllIl[0];
                if (!lIIIlIlIIlllI(Inventory.contains(iArr11) ? 1 : 0)) {
                    return;
                }
                int[] iArr12 = new int[lIlIIIllIl[2]];
                iArr12[lIlIIIllIl[1]] = lIlIIIllIl[51];
                if (!lIIIlIlIIlllI(Inventory.contains(iArr12) ? 1 : 0)) {
                    return;
                }
            }
            if (lIIIlIlIlIIll(Players.getLocal().getWorldLocation().distanceTo(ku), lIlIIIllIl[21])) {
                AccBuilderShamans.c = lIlIIIllII[lIlIIIllIl[61]];
                String[] strArr11 = new String[lIlIIIllIl[2]];
                strArr11[lIlIIIllIl[1]] = lIlIIIllII[lIlIIIllIl[62]];
                TileItem nearest6 = TileItems.getNearest(strArr11);
                if (lIIIlIlIIllll(nearest6)) {
                    nearest6.interact(lIlIIIllII[lIlIIIllIl[63]]);
                }
            }
        }
    }

    private static int dh() {
        return (lIIIlIlIIllIl(Skills.getLevel(Skill.PRAYER), lIlIIIllIl[71]) && lIIIlIlIlIlII(Skills.getLevel(Skill.PRAYER), lIlIIIllIl[3])) ? ((lIlIIIllIl[70] - Skills.getExperience(Skill.PRAYER)) / lIlIIIllIl[72]) + lIlIIIllIl[22] : ((lIlIIIllIl[73] - Skills.getExperience(Skill.PRAYER)) / lIlIIIllIl[72]) + lIlIIIllIl[63];
    }

    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public int ad() {
        try {
            dg();
            "".length();
            if ((-(157 ^ 152)) >= 0) {
                return (170 ^ 132) & ((141 ^ 163) ^ (-1));
            }
        } catch (Exception e) {
        }
        return lIlIIIllIl[74];
    }

    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public String ae() {
        return lIlIIIllII[lIlIIIllIl[75]];
    }

    private static String lIIIlIlIIlIIl(String llllllllllllllllllllIlIIIIllIIIl, String llllllllllllllllllllIlIIIIllIIII) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllllllIlIIIIllIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllllIlIIIIlIllll = new StringBuilder();
        char[] llllllllllllllllllllIlIIIIlIlllI = llllllllllllllllllllIlIIIIllIIII.toCharArray();
        int llllllllllllllllllllIlIIIIlIllIl = lIlIIIllIl[1];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIlIIIllIl[1];
        while (lIIIlIlIIllIl(i, length)) {
            llllllllllllllllllllIlIIIIlIllll.append((char) (charArray[i] ^ llllllllllllllllllllIlIIIIlIlllI[llllllllllllllllllllIlIIIIlIllIl % llllllllllllllllllllIlIIIIlIlllI.length]));
            "".length();
            llllllllllllllllllllIlIIIIlIllIl++;
            i++;
            "".length();
            if ((-" ".length()) != (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllllllIlIIIIlIllll);
    }

    private static boolean lIIIlIlIlIIlI(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public boolean ac() {
        return lIlIIIllIl[1];
    }

    private static String lIIIlIlIIIlll(String llllllllllllllllllllIlIIIlIIIIIl, String llllllllllllllllllllIlIIIlIIIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllllIlIIIlIIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllllIlIIIlIIIIll = Cipher.getInstance("Blowfish");
            llllllllllllllllllllIlIIIlIIIIll.init(lIlIIIllIl[4], secretKeySpec);
            return new String(llllllllllllllllllllIlIIIlIIIIll.doFinal(Base64.getDecoder().decode(llllllllllllllllllllIlIIIlIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllllIlIIIlIIIIlI) {
            llllllllllllllllllllIlIIIlIIIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlIlIIlllI(int i) {
        return i == 0;
    }

    static {
        lIIIlIlIIlIll();
        lIIIlIlIIlIlI();
        ks = new WorldPoint(lIlIIIllIl[77], lIlIIIllIl[78], lIlIIIllIl[1]);
        kt = new WorldPoint(lIlIIIllIl[79], lIlIIIllIl[80], lIlIIIllIl[1]);
        ku = new WorldPoint(lIlIIIllIl[81], lIlIIIllIl[82], lIlIIIllIl[1]);
        kv = new WorldPoint(lIlIIIllIl[83], lIlIIIllIl[44], lIlIIIllIl[1]);
        kw = new WorldPoint(lIlIIIllIl[1], lIlIIIllIl[1], lIlIIIllIl[1]);
        kx = new WorldPoint(lIlIIIllIl[1], lIlIIIllIl[1], lIlIIIllIl[1]);
        ky = new WorldPoint(lIlIIIllIl[84], lIlIIIllIl[85], lIlIIIllIl[1]);
        bp = new ArrayList();
    }

    private static boolean lIIIlIlIIllII(int i) {
        return i != 0;
    }

    private static boolean lIIIlIlIlIIIl(int i, int i2) {
        return i > i2;
    }

    private static boolean lIIIlIlIIllIl(int i, int i2) {
        return i < i2;
    }

    private static void lIIIlIlIIlIll() {
        lIlIIIllIl = new int[87];
        lIlIIIllIl[0] = (-1028) & 1563;
        lIlIIIllIl[1] = (60 ^ 39) & ((116 ^ 111) ^ (-1));
        lIlIIIllIl[2] = " ".length();
        lIlIIIllIl[3] = (((141 + 6) - 127) + 164) ^ (((124 + 24) - 13) + 14);
        lIlIIIllIl[4] = "  ".length();
        lIlIIIllIl[5] = "   ".length();
        lIlIIIllIl[6] = (-((-4653) & 31295)) & (-1) & 31642;
        lIlIIIllIl[7] = (62 ^ 3) ^ (12 ^ 53);
        lIlIIIllIl[8] = (-((-17069) & 25598)) & (-2049) & 31743;
        lIlIIIllIl[9] = (-((-717) & 19183)) & (-521) & 31611;
        lIlIIIllIl[10] = (-((-705) & 5853)) & (-18433) & 24575;
        lIlIIIllIl[11] = (-((-30983) & 32255)) & (-16388) & 28159;
        lIlIIIllIl[12] = ((153 + 56) - 41) + 32;
        lIlIIIllIl[13] = 38 ^ 20;
        lIlIIIllIl[14] = 52 ^ 49;
        lIlIIIllIl[15] = 212 ^ 192;
        lIlIIIllIl[16] = 127 ^ 121;
        lIlIIIllIl[17] = -" ".length();
        lIlIIIllIl[18] = 142 ^ 137;
        lIlIIIllIl[19] = 104 ^ 96;
        lIlIIIllIl[20] = (((94 + 153) - 146) + 58) ^ (((147 + 98) - 121) + 26);
        lIlIIIllIl[21] = 176 ^ 189;
        lIlIIIllIl[22] = (((128 + 111) - 122) + 52) ^ (((83 + 47) - 112) + 145);
        lIlIIIllIl[23] = (-((-19341) & 28590)) & (-1) & 12277;
        lIlIIIllIl[24] = (-4165) & 8006;
        lIlIIIllIl[25] = (-((-818) & 29503)) & (-1) & 31711;
        lIlIIIllIl[26] = (-28677) & 32511;
        lIlIIIllIl[27] = (-((-15123) & 32535)) & (-8209) & 28639;
        lIlIIIllIl[28] = (-((-865) & 29543)) & (-2) & 32511;
        lIlIIIllIl[29] = (-9249) & 12263;
        lIlIIIllIl[30] = (-4097) & 7925;
        lIlIIIllIl[31] = (-46) & 3055;
        lIlIIIllIl[32] = (-((-19161) & 27611)) & (-5) & 12279;
        lIlIIIllIl[33] = (-((-2437) & 15749)) & (-16387) & 32703;
        lIlIIIllIl[34] = (-24834) & 28655;
        lIlIIIllIl[35] = (-((-23223) & 32511)) & (-16385) & 28671;
        lIlIIIllIl[36] = (-((-12347) & 28735)) & (-257) & 20462;
        lIlIIIllIl[37] = (-20481) & 23471;
        lIlIIIllIl[38] = (-12565) & 16383;
        lIlIIIllIl[39] = (-13321) & 16303;
        lIlIIIllIl[40] = (-21573) & 24548;
        lIlIIIllIl[41] = (-((-1295) & 5487)) & (-24582) & 31743;
        lIlIIIllIl[42] = (((11 + 17) - (-56)) + 69) ^ (((3 + 71) - 21) + 93);
        lIlIIIllIl[43] = (-9293) & 12255;
        lIlIIIllIl[44] = (-274) & 4093;
        lIlIIIllIl[45] = (227 ^ 197) ^ (89 ^ 115);
        lIlIIIllIl[46] = (-20481) & 23439;
        lIlIIIllIl[47] = (((81 + 11) - (-10)) + 62) ^ (((129 + 20) - 45) + 66);
        lIlIIIllIl[48] = (((126 + 88) - 202) + 124) ^ (((112 + 11) - 86) + 98);
        lIlIIIllIl[49] = (50 ^ 38) ^ (33 ^ 37);
        lIlIIIllIl[50] = (171 ^ 194) ^ (87 ^ 47);
        lIlIIIllIl[51] = (-24039) & 24575;
        lIlIIIllIl[52] = (64 ^ 56) ^ (246 ^ 156);
        lIlIIIllIl[53] = 114 ^ 97;
        lIlIIIllIl[54] = " ".length() ^ (7 ^ 19);
        lIlIIIllIl[55] = (210 ^ 148) ^ (47 ^ 127);
        lIlIIIllIl[56] = (((169 + 149) - 238) + 105) ^ (((18 + 105) - 106) + 157);
        lIlIIIllIl[57] = 142 ^ 150;
        lIlIIIllIl[58] = (39 ^ 51) ^ (21 ^ 24);
        lIlIIIllIl[59] = 45 ^ 55;
        lIlIIIllIl[60] = (((38 + 3) - 32) + 148) ^ (((14 + 84) - 37) + 73);
        lIlIIIllIl[61] = 140 ^ 144;
        lIlIIIllIl[62] = 66 ^ 95;
        lIlIIIllIl[63] = (((138 + 47) - 167) + 142) ^ (((143 + 79) - 71) + 39);
        lIlIIIllIl[64] = (-((-17065) & 17327)) & (-13321) & 16382;
        lIlIIIllIl[65] = (-275) & 12254;
        lIlIIIllIl[66] = (-((-18434) & 24149)) & (-1) & 30715;
        lIlIIIllIl[67] = (-(171 ^ 146)) & (-1) & 8063;
        lIlIIIllIl[68] = 78 ^ 102;
        lIlIIIllIl[69] = (-10332) & 11231;
        lIlIIIllIl[70] = (-641) & 274382;
        lIlIIIllIl[71] = 145 ^ 173;
        lIlIIIllIl[72] = (-18454) & 18903;
        lIlIIIllIl[73] = (-((-9537) & 12243)) & (-1282) & 65499;
        lIlIIIllIl[74] = (64 ^ 90) ^ (11 ^ 117);
        lIlIIIllIl[75] = 160 ^ 191;
        lIlIIIllIl[76] = (154 ^ 132) ^ (23 ^ 41);
        lIlIIIllIl[77] = (-((-17057) & 25257)) & (-5153) & 16381;
        lIlIIIllIl[78] = (-20561) & 24404;
        lIlIIIllIl[79] = (-(165 ^ 171)) & (-12353) & 15359;
        lIlIIIllIl[80] = (-((-6251) & 22655)) & (-12289) & 32509;
        lIlIIIllIl[81] = (-24642) & 27591;
        lIlIIIllIl[82] = (-((-8381) & 8639)) & (-4113) & 8191;
        lIlIIIllIl[83] = (-((-10881) & 16091)) & (-24577) & 32734;
        lIlIIIllIl[84] = (-((-16535) & 25527)) & (-16457) & 28542;
        lIlIIIllIl[85] = (-((-15419) & 15931)) & (-4121) & 8123;
        lIlIIIllIl[86] = (80 ^ 64) ^ (188 ^ 141);
    }

    private static void lIIIlIlIIlIlI() {
        lIlIIIllII = new String[lIlIIIllIl[86]];
        lIlIIIllII[lIlIIIllIl[1]] = lIIIlIlIIIlll("MtFbFjfGs3b6TiCVih/Pgg==", "TQRCu");
        lIlIIIllII[lIlIIIllIl[2]] = lIIIlIlIIlIII("lBVmF8qZ76FNSmHBfnefJ/RIhyhov6LmGl5MFxaecFmBaI4rzX/h09wfYj6J+JD5", "QGRis");
        lIlIIIllII[lIlIIIllIl[4]] = lIIIlIlIIlIIl("OBQdLAkXAQIrCVYBBGUMFxsA", "vukEn");
        lIlIIIllII[lIlIIIllIl[5]] = lIIIlIlIIlIII("MNBczfCtzY3Zjm+MHu/89RkNpGjLKul9", "MJIGB");
        lIlIIIllII[lIlIIIllIl[7]] = lIIIlIlIIlIII("HXpgNqgT1SHQKWvGty179ASwohhZpm1dliLUf7a8bzONUVhm4jKoYT/hHCLQXT7sXFTy43PSEwI=", "ZYgEq");
        lIlIIIllII[lIlIIIllIl[14]] = lIIIlIlIIlIII("dOupv+kRo1s=", "stOJJ");
        lIlIIIllII[lIlIIIllIl[16]] = lIIIlIlIIlIII("bvqqV5Sst+a7W5k97MzwRQ==", "lHvzx");
        lIlIIIllII[lIlIIIllIl[18]] = lIIIlIlIIlIII("Gqp7KIsigTI=", "yJzOS");
        lIlIIIllII[lIlIIIllIl[19]] = lIIIlIlIIlIII("tMolQDjEQBOYsBuxuybnzQ==", "SVGoT");
        lIlIIIllII[lIlIIIllIl[20]] = lIIIlIlIIlIIl("FxMpOm94DC0vJigXOjdjLBdoLyYuHSRjd2lYHyovPB06LSYrC2Y=", "XxHCC");
        lIlIIIllII[lIlIIIllIl[22]] = lIIIlIlIIlIIl("JjY9ZgEHdyoqAQkl", "hWKFu");
        lIlIIIllII[lIlIIIllIl[42]] = lIIIlIlIIIlll("qRQPMVha95sN0Bi8W4pIxw==", "QWHZf");
        lIlIIIllII[lIlIIIllIl[45]] = lIIIlIlIIIlll("lZhZFXkYAgc183QO6SBB7g==", "ErcSu");
        lIlIIIllII[lIlIIIllIl[21]] = lIIIlIlIIIlll("TW5HxuXIIftbycZRT3wTLg==", "QUmJH");
        lIlIIIllII[lIlIIIllIl[47]] = lIIIlIlIIlIIl("BzULAQ==", "HEnoB");
        lIlIIIllII[lIlIIIllIl[48]] = lIIIlIlIIIlll("H7IAHJ3uWxo=", "BPxCH");
        lIlIIIllII[lIlIIIllIl[49]] = lIIIlIlIIlIII("7aB9kNn/uAw=", "LfQbC");
        lIlIIIllII[lIlIIIllIl[50]] = lIIIlIlIIlIIl("Mg8SACpRBh8bOAM=", "qgsoY");
        lIlIIIllII[lIlIIIllIl[52]] = lIIIlIlIIlIIl("Fhc6YyE3Vi0vITkE", "XvLCU");
        lIlIIIllII[lIlIIIllIl[53]] = lIIIlIlIIlIIl("Fi85LQcqLzBiESwvMjE=", "CAWBs");
        lIlIIIllII[lIlIIIllIl[15]] = lIIIlIlIIlIIl("FQ0BEyZwIg0XOyNBAQQhOQU=", "PaevT");
        lIlIIIllII[lIlIIIllIl[54]] = lIIIlIlIIlIII("gUsQMeMsB6RolTDPP30jWQ==", "PbHSa");
        lIlIIIllII[lIlIIIllIl[55]] = lIIIlIlIIIlll("JgJEQXJTI6Y=", "Jiujd");
        lIlIIIllII[lIlIIIllIl[56]] = lIIIlIlIIlIIl("LgkkOw==", "ayAUb");
        lIlIIIllII[lIlIIIllIl[57]] = lIIIlIlIIlIII("8OwtxLthgFY=", "XBHIj");
        lIlIIIllII[lIlIIIllIl[58]] = lIIIlIlIIIlll("EMJFu0JiBcUQH+ImDViMJA==", "SveIG");
        lIlIIIllII[lIlIIIllIl[59]] = lIIIlIlIIlIIl("NAAhGhgfHydSTA==", "qxBry");
        lIlIIIllII[lIlIIIllIl[60]] = lIIIlIlIIlIII("unQ+6idPCbhY8ytPm0IDkg==", "LvPaa");
        lIlIIIllII[lIlIIIllIl[61]] = lIIIlIlIIlIIl("JRQADDASCAcI", "vaioY");
        lIlIIIllII[lIlIIIllIl[62]] = lIIIlIlIIlIIl("Gx8FAlAjEEsdESEZGQYb", "Lvkgp");
        lIlIIIllII[lIlIIIllIl[63]] = lIIIlIlIIIlll("OBt+JNnV5QA=", "UKxCt");
        lIlIIIllII[lIlIIIllIl[75]] = lIIIlIlIIlIIl("OwcpLQ0ZVTwmCQIbIToP", "kuHTh");
        lIlIIIllII[lIlIIIllIl[76]] = lIIIlIlIIIlll("523MbuQzbtw7IR0m+Xzku4wXuerry3Y5", "uDGEl");
    }

    private static boolean lIIIlIlIlIIII(int i) {
        return i > 0;
    }

    private static boolean lIIIlIlIlIIll(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIIIlIlIIllll(Object obj) {
        return obj != null;
    }

    private static void O() {
        int[] iArr = new int[lIlIIIllIl[2]];
        iArr[lIlIIIllIl[1]] = lIlIIIllIl[9];
        if (lIIIlIlIIlllI(Bank.contains(iArr) ? 1 : 0)) {
            bp.add(new C0003d(lIlIIIllIl[9], lIlIIIllIl[14], C0009j.bZ));
            "".length();
        }
        int[] iArr2 = new int[lIlIIIllIl[2]];
        iArr2[lIlIIIllIl[1]] = lIlIIIllIl[0];
        if (lIIIlIlIIlllI(Bank.contains(iArr2) ? 1 : 0)) {
            bp.add(new C0003d(lIlIIIllIl[0], dh(), lIlIIIllIl[64]));
            "".length();
        }
        int[] iArr3 = new int[lIlIIIllIl[2]];
        iArr3[lIlIIIllIl[1]] = lIlIIIllIl[8];
        if (lIIIlIlIIlllI(Bank.contains(iArr3) ? 1 : 0)) {
            bp.add(new C0003d(lIlIIIllIl[8], lIlIIIllIl[4], lIlIIIllIl[6]));
            "".length();
        }
        if (lIIIlIlIIlllI(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIlIIIllII[lIlIIIllIl[76]]);
        }) ? 1 : 0)) {
            bp.add(new C0003d(lIlIIIllIl[65], lIlIIIllIl[14], lIlIIIllIl[66]));
            "".length();
        }
        int[] iArr4 = new int[lIlIIIllIl[2]];
        iArr4[lIlIIIllIl[1]] = lIlIIIllIl[67];
        if (lIIIlIlIIlllI(Bank.contains(iArr4) ? 1 : 0)) {
            bp.add(new C0003d(lIlIIIllIl[67], lIlIIIllIl[68], lIlIIIllIl[69]));
            "".length();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public boolean af() {
        if (lIIIlIlIlIlII(Skills.getLevel(Skill.PRAYER), lIlIIIllIl[3])) {
            ?? r0 = lIlIIIllIl[2];
            "".length();
            return (-((99 ^ 72) ^ (31 ^ 48))) > 0 ? ((36 ^ 64) ^ (149 ^ 179)) & (((92 ^ 20) ^ (164 ^ 174)) ^ (-" ".length())) : r0;
        }
        return lIlIIIllIl[1];
    }
}
