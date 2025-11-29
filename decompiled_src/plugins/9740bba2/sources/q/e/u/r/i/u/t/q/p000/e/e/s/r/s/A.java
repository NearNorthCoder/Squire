package q.e.u.r.i.u.t.q.p000.e.e.s.r.s;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.quest.SquireQuesterConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.DialogOption;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.items.Shop;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Production;
@TaskDesc(name = "Completing Sheep Shearer")
/* renamed from: q.e.u.r.i.u.t.q.-.e.e.s.r.s.A  reason: invalid package */
/* loaded from: 9740bba2-b19d-4983-898f-2f8083c87d94.jar:q/e/u/r/i/u/t/q/-/e/e/s/r/s/A.class */
public class A extends Task {
    private static /* synthetic */ int[] lIIIllIIllIll;
    private static /* synthetic */ String[] lIIIllIIllIlI;
    private final /* synthetic */ SquireQuesterConfig bx;

    private static String lIlIIIlIIIlIIll(String lllllllllllllllIIIIlIlIIIIIIlIll, String lllllllllllllllIIIIlIlIIIIIIlIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIlIlIIIIIIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIIllIIllIll[10], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIlIlIIIIIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIlIlIIIIIIllII) {
            lllllllllllllllIIIIlIlIIIIIIllII.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x007d, code lost:
        if (lIlIIIlIIIllIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b7, code lost:
        if (lIlIIIlIIIlIllI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c0, code lost:
        if (lIlIIIlIIIlIllI(net.unethicalite.api.items.Bank.isOpen() ? 1 : 0) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c3, code lost:
        r0 = new net.runelite.api.coords.WorldPoint(q.e.u.r.i.u.t.q.p000.e.e.s.r.s.A.lIIIllIIllIll[8], q.e.u.r.i.u.t.q.p000.e.e.s.r.s.A.lIIIllIIllIll[9], q.e.u.r.i.u.t.q.p000.e.e.s.r.s.A.lIIIllIIllIll[10]);
        r1 = new java.lang.String[q.e.u.r.i.u.t.q.p000.e.e.s.r.s.A.lIIIllIIllIll[3]];
        r1[q.e.u.r.i.u.t.q.p000.e.e.s.r.s.A.lIIIllIIllIll[0]] = q.e.u.r.i.u.t.q.p000.e.e.s.r.s.A.lIIIllIIllIlI[q.e.u.r.i.u.t.q.p000.e.e.s.r.s.A.lIIIllIIllIll[0]];
        r0 = net.unethicalite.api.entities.TileObjects.getAt(r0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0101, code lost:
        if (lIlIIIlIIIllIIl(r0.isEmpty() ? 1 : 0) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0104, code lost:
        net.unethicalite.api.movement.pathfinder.Walker.walkTo(new net.runelite.api.coords.WorldPoint(q.e.u.r.i.u.t.q.p000.e.e.s.r.s.A.lIIIllIIllIll[8], q.e.u.r.i.u.t.q.p000.e.e.s.r.s.A.lIIIllIIllIll[11], q.e.u.r.i.u.t.q.p000.e.e.s.r.s.A.lIIIllIIllIll[10]));
        "".length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x012b, code lost:
        return q.e.u.r.i.u.t.q.p000.e.e.s.r.s.A.lIIIllIIllIll[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x013a, code lost:
        if (lIlIIIlIIIllIlI(r0.size(), q.e.u.r.i.u.t.q.p000.e.e.s.r.s.A.lIIIllIIllIll[3]) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0151, code lost:
        if (lIlIIIlIIIlIllI(net.unethicalite.api.movement.Reachable.isInteractable((net.runelite.api.Locatable) r0.get(q.e.u.r.i.u.t.q.p000.e.e.s.r.s.A.lIIIllIIllIll[0])) ? 1 : 0) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0154, code lost:
        net.unethicalite.api.movement.pathfinder.Walker.walkTo(new net.runelite.api.coords.WorldPoint(q.e.u.r.i.u.t.q.p000.e.e.s.r.s.A.lIIIllIIllIll[8], q.e.u.r.i.u.t.q.p000.e.e.s.r.s.A.lIIIllIIllIll[11], q.e.u.r.i.u.t.q.p000.e.e.s.r.s.A.lIIIllIIllIll[10]));
        "".length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x017b, code lost:
        return q.e.u.r.i.u.t.q.p000.e.e.s.r.s.A.lIIIllIIllIll[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x017c, code lost:
        ((net.runelite.api.TileObject) r0.get(q.e.u.r.i.u.t.q.p000.e.e.s.r.s.A.lIIIllIIllIll[0])).interact(q.e.u.r.i.u.t.q.p000.e.e.s.r.s.A.lIIIllIIllIlI[q.e.u.r.i.u.t.q.p000.e.e.s.r.s.A.lIIIllIIllIll[3]]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x019d, code lost:
        return q.e.u.r.i.u.t.q.p000.e.e.s.r.s.A.lIIIllIIllIll[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x01a9, code lost:
        if (lIlIIIlIIIllIII(net.unethicalite.api.items.Inventory.getFreeSlots(), q.e.u.r.i.u.t.q.p000.e.e.s.r.s.A.lIIIllIIllIll[2]) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x01ac, code lost:
        net.unethicalite.api.items.Bank.depositInventory();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01b5, code lost:
        if (lIlIIIlIIIllIIl(net.unethicalite.api.items.Bank.isOpen() ? 1 : 0) == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01bf, code lost:
        if (lIlIIIlIIIllIIl(cx() ? 1 : 0) == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01c2, code lost:
        net.unethicalite.api.items.Bank.withdraw(q.e.u.r.i.u.t.q.p000.e.e.s.r.s.A.lIIIllIIllIll[6], q.e.u.r.i.u.t.q.p000.e.e.s.r.s.A.lIIIllIIllIll[3], net.unethicalite.api.items.Bank.WithdrawMode.ITEM);
        sleep(q.e.u.r.i.u.t.q.p000.e.e.s.r.s.A.lIIIllIIllIll[3]);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v106, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v124, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v128, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v155, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v167, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v171, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v183, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v185, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v63, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v76, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v85, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v88, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean run() {
        if (!lIlIIIlIIIlIllI(this.bx.quest().equals(h.SHEEP_SHEARER) ? 1 : 0) && !lIlIIIlIIIlIlll(Q(), lIIIllIIllIll[1])) {
            System.out.println(Q());
            if (lIlIIIlIIIllIII(Inventory.getFreeSlots(), lIIIllIIllIll[2])) {
                int[] iArr = new int[lIIIllIIllIll[3]];
                iArr[lIIIllIIllIll[0]] = lIIIllIIllIll[4];
                if (lIlIIIlIIIlIllI(Inventory.contains(iArr) ? 1 : 0)) {
                    int[] iArr2 = new int[lIIIllIIllIll[3]];
                    iArr2[lIIIllIIllIll[0]] = lIIIllIIllIll[5];
                }
            }
            int[] iArr3 = new int[lIIIllIIllIll[3]];
            iArr3[lIIIllIIllIll[0]] = lIIIllIIllIll[6];
            if (lIlIIIlIIIlIllI(Inventory.contains(iArr3) ? 1 : 0)) {
                int[] iArr4 = new int[lIIIllIIllIll[3]];
                iArr4[lIIIllIIllIll[0]] = lIIIllIIllIll[7];
            }
            if (lIlIIIlIIIllIIl(Bank.isOpen() ? 1 : 0) && lIlIIIlIIIllIIl(cx() ? 1 : 0)) {
                Bank.withdraw(lIIIllIIllIll[6], lIIIllIIllIll[3], Bank.WithdrawMode.ITEM);
            }
            int[] iArr5 = new int[lIIIllIIllIll[3]];
            iArr5[lIIIllIIllIll[0]] = lIIIllIIllIll[6];
            if (lIlIIIlIIIllIIl(Inventory.contains(iArr5) ? 1 : 0)) {
                int[] iArr6 = new int[lIIIllIIllIll[3]];
                iArr6[lIIIllIIllIll[0]] = lIIIllIIllIll[7];
                if (lIlIIIlIIIlIllI(Inventory.contains(iArr6) ? 1 : 0)) {
                    if (lIlIIIlIIIllIIl(Shop.isOpen() ? 1 : 0)) {
                        Shop.buyOne(lIIIllIIllIll[7]);
                        return lIIIllIIllIll[0];
                    }
                    String[] strArr = new String[lIIIllIIllIll[3]];
                    strArr[lIIIllIIllIll[0]] = lIIIllIIllIlI[lIIIllIIllIll[10]];
                    NPC nearest = NPCs.getNearest(strArr);
                    if (lIlIIIlIIIllIll(nearest)) {
                        nearest.interact(lIIIllIIllIlI[lIIIllIIllIll[12]]);
                        return lIIIllIIllIll[0];
                    }
                    Walker.walkTo(new WorldPoint(lIIIllIIllIll[13], lIIIllIIllIll[14], lIIIllIIllIll[0]));
                    "".length();
                }
            }
            int[] iArr7 = new int[lIIIllIIllIll[3]];
            iArr7[lIIIllIIllIll[0]] = lIIIllIIllIll[7];
            if (lIlIIIlIIIllIIl(Inventory.contains(iArr7) ? 1 : 0) && lIlIIIlIIIllIII(cb(), lIIIllIIllIll[2])) {
                NPC nearest2 = NPCs.getNearest(npc -> {
                    if (lIlIIIlIIIllIIl(npc.getName().equals(lIIIllIIllIlI[lIIIllIIllIll[27]]) ? 1 : 0)) {
                        String[] strArr2 = new String[lIIIllIIllIll[3]];
                        strArr2[lIIIllIIllIll[0]] = lIIIllIIllIlI[lIIIllIIllIll[28]];
                        if (lIlIIIlIIIllIIl(npc.hasAction(strArr2) ? 1 : 0)) {
                            ?? r0 = lIIIllIIllIll[3];
                            "".length();
                            return (-((41 ^ 83) ^ (116 ^ 10))) >= 0 ? ((30 ^ 40) ^ (38 ^ 11)) & (((83 ^ 102) ^ (99 ^ 77)) ^ (-" ".length())) : r0;
                        }
                    }
                    return lIIIllIIllIll[0];
                });
                if (lIlIIIlIIIllIll(nearest2) && lIlIIIlIIIllIIl(Reachable.isInteractable(nearest2) ? 1 : 0) && lIlIIIlIIIlllII(nearest2.getId(), lIIIllIIllIll[15])) {
                    nearest2.interact(lIIIllIIllIlI[lIIIllIIllIll[16]]);
                    return lIIIllIIllIll[0];
                }
                Walker.walkTo(new WorldPoint(lIIIllIIllIll[17], lIIIllIIllIll[18], lIIIllIIllIll[0]));
                "".length();
            }
            if (lIlIIIlIIIllIlI(cb(), lIIIllIIllIll[2])) {
                int[] iArr8 = new int[lIIIllIIllIll[3]];
                iArr8[lIIIllIIllIll[0]] = lIIIllIIllIll[4];
                if (lIlIIIlIIIllIIl(Inventory.contains(iArr8) ? 1 : 0)) {
                    if (lIlIIIlIIIlllII(Players.getLocal().getAnimation(), lIIIllIIllIll[19])) {
                        return lIIIllIIllIll[0];
                    }
                    String[] strArr2 = new String[lIIIllIIllIll[3]];
                    strArr2[lIIIllIIllIll[0]] = lIIIllIIllIlI[lIIIllIIllIll[20]];
                    TileObject nearest3 = TileObjects.getNearest(strArr2);
                    if (!lIlIIIlIIIllIll(nearest3) || !lIlIIIlIIIllIIl(Reachable.isInteractable(nearest3) ? 1 : 0)) {
                        Walker.walkTo(new WorldPoint(lIIIllIIllIll[23], lIIIllIIllIll[24], lIIIllIIllIll[3]));
                        "".length();
                        return lIIIllIIllIll[0];
                    }
                    if (lIlIIIlIIIlIllI(Production.isOpen() ? 1 : 0)) {
                        nearest3.interact(lIIIllIIllIlI[lIIIllIIllIll[21]]);
                    }
                    Production.chooseOption(lIIIllIIllIlI[lIIIllIIllIll[22]]);
                    return lIIIllIIllIll[0];
                } else if (lIlIIIlIIIllIIl(Dialog.isOpen() ? 1 : 0)) {
                    DialogOption[] dialogOptionArr = new DialogOption[lIIIllIIllIll[1]];
                    dialogOptionArr[lIIIllIIllIll[0]] = DialogOption.NPC_CONTINUE;
                    dialogOptionArr[lIIIllIIllIll[3]] = DialogOption.CHAT_OPTION_ONE;
                    dialogOptionArr[lIIIllIIllIll[10]] = DialogOption.PLAYER_CONTINUE;
                    dialogOptionArr[lIIIllIIllIll[12]] = DialogOption.NPC_CONTINUE;
                    dialogOptionArr[lIIIllIIllIll[16]] = DialogOption.NPC_CONTINUE;
                    dialogOptionArr[lIIIllIIllIll[20]] = DialogOption.NPC_CONTINUE;
                    dialogOptionArr[lIIIllIIllIll[21]] = DialogOption.PLAYER_CONTINUE;
                    dialogOptionArr[lIIIllIIllIll[22]] = DialogOption.NPC_CONTINUE;
                    dialogOptionArr[lIIIllIIllIll[25]] = DialogOption.NPC_CONTINUE;
                    dialogOptionArr[lIIIllIIllIll[26]] = DialogOption.NPC_CONTINUE;
                    dialogOptionArr[lIIIllIIllIll[27]] = DialogOption.CHAT_OPTION_ONE;
                    dialogOptionArr[lIIIllIIllIll[28]] = DialogOption.PLAYER_CONTINUE;
                    dialogOptionArr[lIIIllIIllIll[29]] = DialogOption.PLAYER_CONTINUE;
                    dialogOptionArr[lIIIllIIllIll[30]] = DialogOption.NPC_CONTINUE;
                    dialogOptionArr[lIIIllIIllIll[31]] = DialogOption.PLAYER_CONTINUE;
                    dialogOptionArr[lIIIllIIllIll[32]] = DialogOption.NPC_CONTINUE;
                    dialogOptionArr[lIIIllIIllIll[33]] = DialogOption.PLAYER_CONTINUE;
                    dialogOptionArr[lIIIllIIllIll[34]] = DialogOption.NPC_CONTINUE;
                    dialogOptionArr[lIIIllIIllIll[35]] = DialogOption.PLAIN_CONTINUE;
                    dialogOptionArr[lIIIllIIllIll[36]] = DialogOption.PLAYER_CONTINUE;
                    dialogOptionArr[lIIIllIIllIll[2]] = DialogOption.NPC_CONTINUE;
                    Dialog.invokeDialog(dialogOptionArr);
                    return lIIIllIIllIll[0];
                } else {
                    int[] iArr9 = new int[lIIIllIIllIll[3]];
                    iArr9[lIIIllIIllIll[0]] = lIIIllIIllIll[37];
                    NPC nearest4 = NPCs.getNearest(iArr9);
                    if (lIlIIIlIIIllIll(nearest4) && lIlIIIlIIIllIIl(Reachable.isInteractable(nearest4) ? 1 : 0)) {
                        nearest4.interact(lIIIllIIllIlI[lIIIllIIllIll[25]]);
                        return lIIIllIIllIll[0];
                    }
                    Walker.walkTo(new WorldPoint(lIIIllIIllIll[38], lIIIllIIllIll[39], lIIIllIIllIll[0]));
                    "".length();
                }
            }
            return lIIIllIIllIll[3];
        }
        return lIIIllIIllIll[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public boolean cx() {
        int[] iArr = new int[lIIIllIIllIll[3]];
        iArr[lIIIllIIllIll[0]] = lIIIllIIllIll[6];
        if (lIlIIIlIIIlIllI(Inventory.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[lIIIllIIllIll[3]];
            iArr2[lIIIllIIllIll[0]] = lIIIllIIllIll[6];
            if (lIlIIIlIIIlIllI(Bank.contains(iArr2) ? 1 : 0)) {
                System.out.println(lIIIllIIllIlI[lIIIllIIllIll[26]]);
            }
            return lIIIllIIllIll[3];
        }
        return lIIIllIIllIll[0];
    }

    private int cb() {
        int[] iArr = new int[lIIIllIIllIll[3]];
        iArr[lIIIllIIllIll[0]] = lIIIllIIllIll[4];
        int count = Inventory.getCount(iArr);
        int[] iArr2 = new int[lIIIllIIllIll[3]];
        iArr2[lIIIllIIllIll[0]] = lIIIllIIllIll[5];
        return count + Inventory.getCount(iArr2);
    }

    @Inject
    public A(SquireQuesterConfig squireQuesterConfig) {
        this.bx = squireQuesterConfig;
    }

    private static boolean lIlIIIlIIIllIll(Object obj) {
        return obj != null;
    }

    private static void lIlIIIlIIIlIlII() {
        lIIIllIIllIlI = new String[lIIIllIIllIll[29]];
        lIIIllIIllIlI[lIIIllIIllIll[0]] = lIlIIIlIIIlIIIl("/DYjKG23LYzA2rxlN1JB9A==", "QvyRl");
        lIIIllIIllIlI[lIIIllIIllIll[3]] = lIlIIIlIIIlIIlI("JwodBA==", "eksoB");
        lIIIllIIllIlI[lIIIllIIllIll[10]] = lIlIIIlIIIlIIll("+tWUmzkGrQkvxgqVKMfIIA==", "IwSEG");
        lIIIllIIllIlI[lIIIllIIllIll[12]] = lIlIIIlIIIlIIll("grWKPx289HY=", "naXht");
        lIIIllIIllIlI[lIIIllIIllIll[16]] = lIlIIIlIIIlIIIl("rmi8Khz1xoY=", "afrhY");
        lIIIllIIllIlI[lIIIllIIllIll[20]] = lIlIIIlIIIlIIll("U/mPwx/nvjrun0Vu7j+hMw==", "QoYCD");
        lIIIllIIllIlI[lIIIllIIllIll[21]] = lIlIIIlIIIlIIlI("Hx8iIQ==", "LoKOR");
        lIIIllIIllIlI[lIIIllIIllIll[22]] = lIlIIIlIIIlIIIl("eT1GA3eefoJ/CLPXBw0mpg==", "LwHfG");
        lIIIllIIllIlI[lIIIllIIllIll[25]] = lIlIIIlIIIlIIlI("JSINH0sFLA==", "qCatf");
        lIIIllIIllIlI[lIIIllIIllIll[26]] = lIlIIIlIIIlIIlI("AAB2FB8yAXYZFT4LJQ==", "WeVzz");
        lIIIllIIllIlI[lIIIllIIllIll[27]] = lIlIIIlIIIlIIll("aiTg4skzp6Y=", "Uxjdi");
        lIIIllIIllIlI[lIIIllIIllIll[28]] = lIlIIIlIIIlIIlI("PAMiDQA=", "okGlr");
    }

    private static boolean lIlIIIlIIIlIlll(int i, int i2) {
        return i >= i2;
    }

    private static void lIlIIIlIIIlIlIl() {
        lIIIllIIllIll = new int[40];
        lIIIllIIllIll[0] = (40 ^ 25) & ((1 ^ 48) ^ (-1));
        lIIIllIIllIll[1] = 67 ^ 86;
        lIIIllIIllIll[2] = 183 ^ 163;
        lIIIllIIllIll[3] = " ".length();
        lIIIllIIllIll[4] = (-305) & 2041;
        lIIIllIIllIll[5] = (-8193) & 9951;
        lIIIllIIllIll[6] = (-26637) & 27631;
        lIIIllIIllIll[7] = (-28937) & 30671;
        lIIIllIIllIll[8] = (-24657) & 27864;
        lIIIllIIllIll[9] = (-801) & 4021;
        lIIIllIIllIll[10] = "  ".length();
        lIIIllIIllIll[11] = (-((-16627) & 21247)) & (-24897) & 32734;
        lIIIllIIllIll[12] = "   ".length();
        lIIIllIIllIll[13] = (-29557) & 32767;
        lIIIllIIllIll[14] = (-16979) & 20223;
        lIIIllIIllIll[15] = (-((-9799) & 16231)) & (-24581) & 31743;
        lIIIllIIllIll[16] = (186 ^ 183) ^ (83 ^ 90);
        lIIIllIIllIll[17] = (-((-3713) & 24559)) & (-8194) & 32239;
        lIIIllIIllIll[18] = (-4926) & 8189;
        lIIIllIIllIll[19] = -" ".length();
        lIIIllIIllIll[20] = (((41 + 2) - (-33)) + 72) ^ (((16 + 52) - (-65)) + 12);
        lIIIllIIllIll[21] = (255 ^ 145) ^ (218 ^ 178);
        lIIIllIIllIll[22] = 35 ^ 36;
        lIIIllIIllIll[23] = (-((-5186) & 14151)) & (-33) & 12207;
        lIIIllIIllIll[24] = (-13170) & 16383;
        lIIIllIIllIll[25] = (203 ^ 163) ^ (36 ^ 68);
        lIIIllIIllIll[26] = 117 ^ 124;
        lIIIllIIllIll[27] = (((112 + 189) - 144) + 50) ^ (((18 + 170) - 31) + 40);
        lIIIllIIllIll[28] = (7 ^ 79) ^ (10 ^ 73);
        lIIIllIIllIll[29] = 52 ^ 56;
        lIIIllIIllIll[30] = 171 ^ 166;
        lIIIllIIllIll[31] = 10 ^ 4;
        lIIIllIIllIll[32] = (103 ^ 112) ^ (130 ^ 154);
        lIIIllIIllIll[33] = (((126 + 7) - 30) + 85) ^ (((0 + 9) - (-51)) + 112);
        lIIIllIIllIll[34] = (76 ^ 56) ^ (217 ^ 188);
        lIIIllIIllIll[35] = (83 ^ 0) ^ (254 ^ 191);
        lIIIllIIllIll[36] = 22 ^ 5;
        lIIIllIIllIll[37] = (-10532) & 11263;
        lIIIllIIllIll[38] = (-16386) & 19575;
        lIIIllIIllIll[39] = (-4897) & 8169;
    }

    private static boolean lIlIIIlIIIllIIl(int i) {
        return i != 0;
    }

    private int Q() {
        return Vars.getVarp(EnumC0000a.QUEST_SHEEP_SHEARER.c());
    }

    static {
        lIlIIIlIIIlIlIl();
        lIlIIIlIIIlIlII();
    }

    private static boolean lIlIIIlIIIllIlI(int i, int i2) {
        return i == i2;
    }

    private static boolean lIlIIIlIIIlIllI(int i) {
        return i == 0;
    }

    private static boolean lIlIIIlIIIllIII(int i, int i2) {
        return i < i2;
    }

    private static String lIlIIIlIIIlIIlI(String lllllllllllllllIIIIlIlIIIIlIIIII, String lllllllllllllllIIIIlIlIIIIIlllll) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIIIlIlIIIIlIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIIlIlIIIIIllllI = new StringBuilder();
        char[] charArray = lllllllllllllllIIIIlIlIIIIIlllll.toCharArray();
        int lllllllllllllllIIIIlIlIIIIIlIlll = lIIIllIIllIll[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIIIllIIllIll[0];
        while (lIlIIIlIIIllIII(i, length)) {
            lllllllllllllllIIIIlIlIIIIIllllI.append((char) (charArray2[i] ^ charArray[lllllllllllllllIIIIlIlIIIIIlIlll % charArray.length]));
            "".length();
            lllllllllllllllIIIIlIlIIIIIlIlll++;
            i++;
            "".length();
            if (" ".length() > "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIIIlIlIIIIIllllI);
    }

    private static boolean lIlIIIlIIIlllII(int i, int i2) {
        return i != i2;
    }

    private static String lIlIIIlIIIlIIIl(String lllllllllllllllIIIIlIlIIIIllIIII, String lllllllllllllllIIIIlIlIIIIlIllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIlIlIIIIlIllll.getBytes(StandardCharsets.UTF_8)), lIIIllIIllIll[25]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIIllIIllIll[10], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIlIlIIIIllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIlIlIIIIllIIIl) {
            lllllllllllllllIIIIlIlIIIIllIIIl.printStackTrace();
            return null;
        }
    }
}
