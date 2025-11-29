package s.s.e.u.p.i.r.r.p000.q.a.e.k.r.l.u.i.p.e.t.p001;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.slayer.SquireSkipperConfig;
import gg.squire.slayer.SquireSkipperPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Dialog;
@TaskDesc(name = "Attacking")
/* renamed from: s.s.e.u.p.i.r.r.-.q.a.e.k.r.l.u.i.p.e.t.-.c  reason: invalid package */
/* loaded from: 2e35b2d3-afef-4589-b5f3-450cbc042322.jar:s/s/e/u/p/i/r/r/-/q/a/e/k/r/l/u/i/p/e/t/-/c.class */
public class c extends Task {
    private static /* synthetic */ int[] lIlIIlIIllIII;
    private static /* synthetic */ String[] lIlIIlIIlIlIl;

    /* renamed from: s  reason: collision with root package name */
    private final /* synthetic */ SquireSkipperConfig f0s;
    private final /* synthetic */ SquireSkipperPlugin r;

    @Inject
    public c(SquireSkipperPlugin squireSkipperPlugin, SquireSkipperConfig squireSkipperConfig) {
        this.r = squireSkipperPlugin;
        this.f0s = squireSkipperConfig;
    }

    static {
        lIlllIlIlIIlIlI();
        lIlllIlIlIIlIIl();
    }

    private static String lIlllIlIIllllll(String llllllllllllllIllIlllIlIlllIIIIl, String llllllllllllllIllIlllIlIlllIIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlllIlIlllIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIIlIIllIII[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlllIlIlllIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlllIlIlllIIIlI) {
            llllllllllllllIllIlllIlIlllIIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlllIlIlIIlllI(int i) {
        return i == 0;
    }

    private static String lIlllIlIlIIIIIl(String llllllllllllllIllIlllIlIllIlIIIl, String llllllllllllllIllIlllIlIllIlIIII) {
        String llllllllllllllIllIlllIlIllIlIIIl2 = new String(Base64.getDecoder().decode(llllllllllllllIllIlllIlIllIlIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIlllIlIllIIllll = new StringBuilder();
        char[] llllllllllllllIllIlllIlIllIIlllI = llllllllllllllIllIlllIlIllIlIIII.toCharArray();
        int llllllllllllllIllIlllIlIllIIllIl = lIlIIlIIllIII[0];
        char[] charArray = llllllllllllllIllIlllIlIllIlIIIl2.toCharArray();
        int length = charArray.length;
        int i = lIlIIlIIllIII[0];
        while (lIlllIlIlIlIIIl(i, length)) {
            llllllllllllllIllIlllIlIllIIllll.append((char) (charArray[i] ^ llllllllllllllIllIlllIlIllIIlllI[llllllllllllllIllIlllIlIllIIllIl % llllllllllllllIllIlllIlIllIIlllI.length]));
            "".length();
            llllllllllllllIllIlllIlIllIIllIl++;
            i++;
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllIlllIlIllIIllll);
    }

    private static boolean lIlllIlIlIIllIl(int i) {
        return i != 0;
    }

    private static boolean lIlllIlIlIlIIIl(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v100, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v104, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v108, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v110, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v112, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v114, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v120, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v135, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v139, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v143, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v151, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v153, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v45, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v63, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v65, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v77, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v89, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v36, types: [boolean] */
    public boolean run() {
        if (lIlllIlIlIIlIll(Players.getLocal().getInteracting())) {
            return lIlIIlIIllIII[0];
        }
        if (lIlllIlIlIIllII(this.r.b(), b.MINOTAURS)) {
            if (lIlllIlIlIIllIl(Dialog.isOpen() ? 1 : 0) && lIlllIlIlIIllIl(Dialog.getName().contains(lIlIIlIIlIlIl[lIlIIlIIllIII[0]]) ? 1 : 0) && lIlllIlIlIIllIl(Dialog.canContinue() ? 1 : 0)) {
                System.out.println(lIlIIlIIlIlIl[lIlIIlIIllIII[1]]);
                Dialog.continueSpace();
                return lIlIIlIIllIII[1];
            } else if (lIlllIlIlIIllIl(Dialog.hasOption(str -> {
                return str.contains(lIlIIlIIlIlIl[lIlIIlIIllIII[20]]);
            }) ? 1 : 0)) {
                Dialog.chooseOption(str2 -> {
                    return str2.contains(lIlIIlIIlIlIl[lIlIIlIIllIII[19]]);
                });
                "".length();
                return lIlIIlIIllIII[1];
            } else if (lIlllIlIlIIllIl(Dialog.hasOption(str3 -> {
                return str3.contains(lIlIIlIIlIlIl[lIlIIlIIllIII[18]]);
            }) ? 1 : 0)) {
                Dialog.chooseOption(str4 -> {
                    return str4.contains(lIlIIlIIlIlIl[lIlIIlIIllIII[17]]);
                });
                "".length();
                return lIlIIlIIllIII[1];
            } else if (lIlllIlIlIIllIl(Dialog.hasOption(str5 -> {
                return str5.contains(lIlIIlIIlIlIl[lIlIIlIIllIII[5]]);
            }) ? 1 : 0)) {
                Dialog.chooseOption(str6 -> {
                    return str6.contains(lIlIIlIIlIlIl[lIlIIlIIllIII[16]]);
                });
                "".length();
                return lIlIIlIIllIII[1];
            }
        }
        String[] strArr = new String[lIlIIlIIllIII[1]];
        strArr[lIlIIlIIllIII[0]] = lIlIIlIIlIlIl[lIlIIlIIllIII[2]];
        if (lIlllIlIlIIllIl(Inventory.contains(strArr) ? 1 : 0)) {
            String[] strArr2 = new String[lIlIIlIIllIII[1]];
            strArr2[lIlIIlIIllIII[0]] = lIlIIlIIlIlIl[lIlIIlIIllIII[3]];
            Inventory.getFirst(strArr2).interact(lIlIIlIIlIlIl[lIlIIlIIllIII[4]]);
            return lIlIIlIIllIII[1];
        }
        if (!lIlllIlIlIIllIl(this.r.h() ? 1 : 0) && !lIlllIlIlIIlllI(Movement.shouldWalk() ? 1 : 0)) {
            b b = this.r.b();
            if (lIlllIlIlIIllll(b)) {
                return lIlIIlIIllIII[0];
            }
            if (lIlllIlIlIlIIII(Movement.getRunEnergy(), lIlIIlIIllIII[5]) && lIlllIlIlIIlllI(Movement.isRunEnabled() ? 1 : 0)) {
                Movement.toggleRun();
                return lIlIIlIIllIII[1];
            } else if (lIlllIlIlIIlllI(b.l() ? 1 : 0)) {
                b.p().forEach(num -> {
                    int[] iArr = new int[lIlIIlIIllIII[1]];
                    iArr[lIlIIlIIllIII[0]] = num.intValue();
                    if (lIlllIlIlIIllIl(Inventory.contains(iArr) ? 1 : 0)) {
                        int[] iArr2 = new int[lIlIIlIIllIII[1]];
                        iArr2[lIlIIlIIllIII[0]] = num.intValue();
                        Item first = Inventory.getFirst(iArr2);
                        String[] strArr3 = new String[lIlIIlIIllIII[1]];
                        strArr3[lIlIIlIIllIII[0]] = lIlIIlIIlIlIl[lIlIIlIIllIII[12]];
                        if (lIlllIlIlIIlllI(first.hasAction(strArr3) ? 1 : 0)) {
                            String[] strArr4 = new String[lIlIIlIIllIII[1]];
                            strArr4[lIlIIlIIllIII[0]] = lIlIIlIIlIlIl[lIlIIlIIllIII[13]];
                            if (!lIlllIlIlIIllIl(first.hasAction(strArr4) ? 1 : 0)) {
                                return;
                            }
                        }
                        String[] strArr5 = new String[lIlIIlIIllIII[2]];
                        strArr5[lIlIIlIIllIII[0]] = lIlIIlIIlIlIl[lIlIIlIIllIII[14]];
                        strArr5[lIlIIlIIllIII[1]] = lIlIIlIIlIlIl[lIlIIlIIllIII[15]];
                        first.interact(strArr5);
                    }
                });
                return lIlIIlIIllIII[1];
            } else {
                NPC attackableNPC = Combat.getAttackableNPC(npc -> {
                    if (lIlllIlIlIIllIl(npc.getName().toLowerCase().contains(b.m().toLowerCase()) ? 1 : 0) && lIlllIlIlIIlllI(npc.isDead() ? 1 : 0)) {
                        ?? r0 = lIlIIlIIllIII[1];
                        "".length();
                        return "   ".length() == 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIlIIlIIllIII[0];
                });
                if (lIlllIlIlIIllll(attackableNPC) && lIlllIlIlIIllIl(b(b) ? 1 : 0)) {
                    Log.info(lIlIIlIIlIlIl[lIlIIlIIllIII[6]]);
                    return lIlIIlIIllIII[0];
                } else if (lIlllIlIlIIllll(attackableNPC) && lIlllIlIlIIlllI(b(b) ? 1 : 0)) {
                    Log.info(lIlIIlIIlIlIl[lIlIIlIIllIII[7]]);
                    if (lIlllIlIlIIllIl(Movement.shouldWalk() ? 1 : 0)) {
                        Movement.walkTo(b.n().getCenter());
                        "".length();
                    }
                    return lIlIIlIIllIII[1];
                } else if (!lIlllIlIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(b.n().getCenter()), lIlIIlIIllIII[8]) || (lIlllIlIlIIlIll(attackableNPC) && lIlllIlIlIIlllI(Reachable.isInteractable(attackableNPC) ? 1 : 0))) {
                    Log.info(lIlIIlIIlIlIl[lIlIIlIIllIII[9]]);
                    if (lIlllIlIlIIllIl(Movement.shouldWalk() ? 1 : 0)) {
                        Movement.walkTo(b.n().getCenter());
                        "".length();
                    }
                    return lIlIIlIIllIII[1];
                } else {
                    this.r.a(this.r.g());
                    "".length();
                    Item fromSlot = Equipment.fromSlot(EquipmentInventorySlot.WEAPON);
                    if (!lIlllIlIlIIlIll(fromSlot) || !lIlllIlIlIlIIlI(fromSlot.getId(), this.r.i())) {
                        if (lIlllIlIlIIllll(attackableNPC)) {
                            return lIlIIlIIllIII[0];
                        }
                        attackableNPC.interact(lIlIIlIIlIlIl[lIlIIlIIllIII[11]]);
                        return lIlIIlIIllIII[1];
                    }
                    System.out.println("Swapping to " + this.r.i());
                    int[] iArr = new int[lIlIIlIIllIII[1]];
                    iArr[lIlIIlIIllIII[0]] = this.r.i();
                    Inventory.getFirst(iArr).interact(lIlIIlIIlIlIl[lIlIIlIIllIII[10]]);
                    this.r.d((boolean) lIlIIlIIllIII[0]);
                    return lIlIIlIIllIII[1];
                }
            }
        }
        return lIlIIlIIllIII[0];
    }

    private static boolean lIlllIlIlIlIIII(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIlllIlIlIIllll(Object obj) {
        return obj == null;
    }

    private static boolean lIlllIlIlIIlIll(Object obj) {
        return obj != null;
    }

    private static void lIlllIlIlIIlIlI() {
        lIlIIlIIllIII = new int[22];
        lIlIIlIIllIII[0] = ((184 ^ 142) ^ (2 ^ 22)) & (((248 ^ 179) ^ (246 ^ 159)) ^ (-" ".length()));
        lIlIIlIIllIII[1] = " ".length();
        lIlIIlIIllIII[2] = "  ".length();
        lIlIIlIIllIII[3] = "   ".length();
        lIlIIlIIllIII[4] = (33 ^ 112) ^ (85 ^ 0);
        lIlIIlIIllIII[5] = (13 ^ 120) ^ (226 ^ 152);
        lIlIIlIIllIII[6] = (36 ^ 41) ^ (131 ^ 139);
        lIlIIlIIllIII[7] = 138 ^ 140;
        lIlIIlIIllIII[8] = (177 ^ 132) ^ (138 ^ 166);
        lIlIIlIIllIII[9] = 146 ^ 149;
        lIlIIlIIllIII[10] = (6 ^ 107) ^ (111 ^ 10);
        lIlIIlIIllIII[11] = 22 ^ 31;
        lIlIIlIIllIII[12] = (((125 + 43) - 153) + 168) ^ (((174 + 25) - 171) + 161);
        lIlIIlIIllIII[13] = 140 ^ 135;
        lIlIIlIIllIII[14] = (243 ^ 129) ^ (36 ^ 90);
        lIlIIlIIllIII[15] = (246 ^ 197) ^ (177 ^ 143);
        lIlIIlIIllIII[16] = 80 ^ 94;
        lIlIIlIIllIII[17] = 93 ^ 77;
        lIlIIlIIllIII[18] = (((60 + 60) - 12) + 32) ^ (((7 + 135) - 9) + 24);
        lIlIIlIIllIII[19] = (12 ^ 80) ^ (201 ^ 135);
        lIlIIlIIllIII[20] = 141 ^ 158;
        lIlIIlIIllIII[21] = 35 ^ 55;
    }

    private static String lIlllIlIlIIIIII(String llllllllllllllIllIlllIlIlllIlllI, String llllllllllllllIllIlllIlIlllIllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlllIlIlllIllIl.getBytes(StandardCharsets.UTF_8)), lIlIIlIIllIII[10]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIIlIIllIII[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlllIlIlllIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlllIlIlllIlIlI) {
            llllllllllllllIllIlllIlIlllIlIlI.printStackTrace();
            return null;
        }
    }

    public boolean b(b bVar) {
        return bVar.n().contains(Players.getLocal());
    }

    private static void lIlllIlIlIIlIIl() {
        lIlIIlIIlIlIl = new String[lIlIIlIIllIII[21]];
        lIlIIlIIlIlIl[lIlIIlIIllIII[0]] = lIlllIlIIllllll("7PkvgL8vtESJepxHC6qv8Q==", "lbvNA");
        lIlIIlIIlIlIl[lIlIIlIIllIII[1]] = lIlllIlIlIIIIII("VOPK0lerBQQ948DxhYRETGXW6wDtyJ3nsqDagY+Kd93jix+eD9XNrylREdO6An00", "DfUOU");
        lIlIIlIIlIlIl[lIlIIlIIllIII[2]] = lIlllIlIlIIIIIl("HwAbBAc7CgYPXXhI", "Haoau");
        lIlIIlIIlIlIl[lIlIIlIIllIII[3]] = lIlllIlIlIIIIII("E74MSy6/pylMwvNXVTLO5A==", "zNCZO");
        lIlIIlIIlIlIl[lIlIIlIIllIII[4]] = lIlllIlIIllllll("gtoMrpKVcZc=", "BmDMK");
        lIlIIlIIlIlIl[lIlIIlIIllIII[6]] = lIlllIlIIllllll("LWVDYlwbCrzdKoCO2EiKqsmtczTRVPZO", "vePFb");
        lIlIIlIIlIlIl[lIlIIlIIllIII[7]] = lIlllIlIlIIIIII("WAkAGWc1WGyzZOOb6Xm5GoDdJD7daakOuerdP35aofQ=", "JyeWJ");
        lIlIIlIIlIlIl[lIlIIlIIllIII[9]] = lIlllIlIIllllll("rzlKH0v3mJ9PqgD1C4DJkFGrdAuxKCr9", "JWbnV");
        lIlIIlIIlIlIl[lIlIIlIIllIII[10]] = lIlllIlIlIIIIII("GZY8QeHySZE=", "CNUKk");
        lIlIIlIIlIlIl[lIlIIlIIllIII[11]] = lIlllIlIIllllll("WxKrUSKgLjA=", "PAdrm");
        lIlIIlIIlIlIl[lIlIIlIIllIII[12]] = lIlllIlIlIIIIII("g2G87ZllQ7s=", "XCxgx");
        lIlIIlIIlIlIl[lIlIIlIIllIII[13]] = lIlllIlIlIIIIII("+/HIfyj/F3M=", "iKLUE");
        lIlIIlIIlIlIl[lIlIIlIIllIII[14]] = lIlllIlIlIIIIII("+zNXuYHPjIE=", "SRmvd");
        lIlIIlIIlIlIl[lIlIIlIIllIII[15]] = lIlllIlIlIIIIII("fj1vhr58fSs=", "CXnKJ");
        lIlIIlIIlIlIl[lIlIIlIIllIII[16]] = lIlllIlIIllllll("gy3B7dyN24Y=", "ZDqHK");
        lIlIIlIIlIlIl[lIlIIlIIllIII[5]] = lIlllIlIlIIIIII("1PsVbgo4A4U=", "miXju");
        lIlIIlIIlIlIl[lIlIIlIIllIII[17]] = lIlllIlIlIIIIII("l1apBCDo5SM=", "RMwFB");
        lIlIIlIIlIlIl[lIlIIlIIllIII[18]] = lIlllIlIlIIIIIl("KCA=", "FOuwl");
        lIlIIlIIlIlIl[lIlIIlIIllIII[19]] = lIlllIlIlIIIIIl("ByYGHxUB", "uCvpg");
        lIlIIlIIlIlIl[lIlIIlIIllIII[20]] = lIlllIlIIllllll("zaJiO9YhNEU=", "aeZll");
    }

    private static boolean lIlllIlIlIIllII(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIlllIlIlIlIIlI(int i, int i2) {
        return i != i2;
    }
}
