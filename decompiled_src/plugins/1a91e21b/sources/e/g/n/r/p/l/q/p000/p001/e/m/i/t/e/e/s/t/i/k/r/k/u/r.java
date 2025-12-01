package e.g.n.r.p.l.q.p000.p001.e.m.i.t.e.e.s.t.i.k.r.k.u;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.templeTrekking.TempleTrekkingConfig;
import gg.squire.templeTrekking.TempleTrekkingPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
@TaskDesc(name = "Start trek task")
/* renamed from: e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u.r  reason: invalid package */
/* loaded from: 1a91e21b-fcbe-4432-8f0e-1258958a8366.jar:e/g/n/r/p/l/q/-/-/e/m/i/t/e/e/s/t/i/k/r/k/u/r.class */
public class r extends Task {
    /* synthetic */ Pattern X = Pattern.compile(lIIllIlIIIIIl[lIIllIlIIIIll[0]]);
    /* synthetic */ WorldArea Y = new WorldArea(new WorldPoint(lIIllIlIIIIll[1], lIIllIlIIIIll[2], lIIllIlIIIIll[0]), new WorldPoint(lIIllIlIIIIll[3], lIIllIlIIIIll[4], lIIllIlIIIIll[0]));
    private final /* synthetic */ TempleTrekkingConfig W;
    private static /* synthetic */ int[] lIIllIlIIIIll;
    private static /* synthetic */ String[] lIIllIlIIIIIl;
    private final /* synthetic */ TempleTrekkingPlugin V;

    @Inject
    public r(TempleTrekkingPlugin templeTrekkingPlugin, TempleTrekkingConfig templeTrekkingConfig) {
        this.W = templeTrekkingConfig;
        this.V = templeTrekkingPlugin;
    }

    private static void lIllIIIIIlIlIII() {
        lIIllIlIIIIIl = new String[lIIllIlIIIIll[21]];
        lIIllIlIIIIIl[lIIllIlIIIIll[0]] = lIllIIIIIlIIIlI("eJfYAZ2Oyzh+mif7q7UVDkd45gUEH34L", "TGngC");
        lIIllIlIIIIIl[lIIllIlIIIIll[5]] = lIllIIIIIlIIlII("XfZYyEzBx1c=", "gStof");
        lIIllIlIIIIIl[lIIllIlIIIIll[6]] = lIllIIIIIlIIlII("EnCDjk+R8IM=", "XQKMS");
        lIIllIlIIIIIl[lIIllIlIIIIll[7]] = lIllIIIIIlIIlIl("Oh8gJw==", "vpGTM");
        lIIllIlIIIIIl[lIIllIlIIIIll[10]] = lIllIIIIIlIIlII("Nfeg6Qkqw80=", "BRjDk");
        lIIllIlIIIIIl[lIIllIlIIIIll[11]] = lIllIIIIIlIIIlI("ABIpg4COQxh8IHuOJp4bfQ==", "dPTPT");
        lIIllIlIIIIIl[lIIllIlIIIIll[8]] = lIllIIIIIlIIlII("VPlPJpCgXFU=", "kKMPG");
        lIIllIlIIIIIl[lIIllIlIIIIll[12]] = lIllIIIIIlIIIlI("AWHs2GJs/DQ=", "PjixL");
        lIIllIlIIIIIl[lIIllIlIIIIll[13]] = lIllIIIIIlIIlII("0NgmvWlVfaM=", "xSwSd");
        lIIllIlIIIIIl[lIIllIlIIIIll[14]] = lIllIIIIIlIIIlI("mjEPfA6CK2s=", "LiNcl");
        lIIllIlIIIIIl[lIIllIlIIIIll[9]] = lIllIIIIIlIIIlI("CATUoD4w+6GJsyMRIQphqQ==", "sEBUk");
        lIIllIlIIIIIl[lIIllIlIIIIll[15]] = lIllIIIIIlIIlIl("Mzk8Mg==", "VXOKj");
        lIIllIlIIIIIl[lIIllIlIIIIll[16]] = lIllIIIIIlIIlII("gFLhda5xSP8=", "eMaTW");
        lIIllIlIIIIIl[lIIllIlIIIIll[17]] = lIllIIIIIlIIlII("DPRWRcX83vk=", "WFPTJ");
        lIIllIlIIIIIl[lIIllIlIIIIll[18]] = lIllIIIIIlIIlIl("LA8KDQA=", "jvcbn");
        lIIllIlIIIIIl[lIIllIlIIIIll[19]] = lIllIIIIIlIIIlI("fi9cgYajB8E=", "ekQmc");
        lIIllIlIIIIIl[lIIllIlIIIIll[20]] = lIllIIIIIlIIlII("a/i/CBIhIRE=", "wKQhr");
    }

    private static boolean lIllIIIIIllIIIl(int i) {
        return i == 0;
    }

    private static String lIllIIIIIlIIlII(String llllllllllllllIlllIllllllIIIllIl, String llllllllllllllIlllIllllllIIIllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllllllIIIllII.getBytes(StandardCharsets.UTF_8)), lIIllIlIIIIll[13]), "DES");
            Cipher llllllllllllllIlllIllllllIIIllll = Cipher.getInstance("DES");
            llllllllllllllIlllIllllllIIIllll.init(lIIllIlIIIIll[6], secretKeySpec);
            return new String(llllllllllllllIlllIllllllIIIllll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllllllIIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIllllllIIIlllI) {
            llllllllllllllIlllIllllllIIIlllI.printStackTrace();
            return null;
        }
    }

    private static void lIllIIIIIlIllIl() {
        lIIllIlIIIIll = new int[22];
        lIIllIlIIIIll[0] = (20 ^ 31) & ((144 ^ 155) ^ (-1));
        lIIllIlIIIIll[1] = (-((-16593) & 21203)) & (-16386) & 24415;
        lIIllIlIIIIll[2] = (-25113) & 28568;
        lIIllIlIIIIll[3] = (-8325) & 11767;
        lIIllIlIIIIll[4] = (-12805) & 16295;
        lIIllIlIIIIll[5] = " ".length();
        lIIllIlIIIIll[6] = "  ".length();
        lIIllIlIIIIll[7] = "   ".length();
        lIIllIlIIIIll[8] = " ".length() ^ (155 ^ 156);
        lIIllIlIIIIll[9] = (138 ^ 196) ^ (236 ^ 168);
        lIIllIlIIIIll[10] = 162 ^ 166;
        lIIllIlIIIIll[11] = 15 ^ 10;
        lIIllIlIIIIll[12] = (68 ^ 1) ^ (225 ^ 163);
        lIIllIlIIIIll[13] = (156 ^ 167) ^ (86 ^ 101);
        lIIllIlIIIIll[14] = 5 ^ 12;
        lIIllIlIIIIll[15] = 49 ^ 58;
        lIIllIlIIIIll[16] = 0 ^ 12;
        lIIllIlIIIIll[17] = (106 ^ 111) ^ (98 ^ 106);
        lIIllIlIIIIll[18] = (((10 + 133) - 111) + 103) ^ (((107 + 119) - 194) + 105);
        lIIllIlIIIIll[19] = (91 ^ 73) ^ (76 ^ 81);
        lIIllIlIIIIll[20] = (49 ^ 1) ^ (34 ^ 2);
        lIIllIlIIIIll[21] = (((31 + 94) - 75) + 99) ^ (((63 + 90) - 79) + 58);
    }

    private static boolean lIllIIIIIllIIll(int i, int i2) {
        return i >= i2;
    }

    static {
        lIllIIIIIlIllIl();
        lIllIIIIIlIlIII();
    }

    private static boolean lIllIIIIIllIlII(Object obj) {
        return obj != null;
    }

    private static boolean lIllIIIIIllIIlI(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v104, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v115, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v117, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v119, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v121, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v123, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v127, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v65, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v67, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v80, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v97, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v51, types: [boolean] */
    public boolean run() {
        if (lIllIIIIIlIllll(Dialog.isEnterInputOpen() ? 1 : 0)) {
            Dialog.enterAmount(lIIllIlIIIIll[0]);
            return lIIllIlIIIIll[5];
        } else if (lIllIIIIIlIllll(this.V.e() ? 1 : 0)) {
            return lIIllIlIIIIll[0];
        } else {
            Player local = Players.getLocal();
            if (lIllIIIIIllIIII(local)) {
                return lIIllIlIIIIll[0];
            }
            if (!lIllIIIIIllIIIl(local.isMoving() ? 1 : 0) || lIllIIIIIlIllll(local.isAnimating() ? 1 : 0)) {
                return lIIllIlIIIIll[0];
            }
            if (!lIllIIIIIllIIlI(this.V.c(), lIIllIlIIIIll[6]) && !lIllIIIIIlIllll(Dialog.isOpen() ? 1 : 0)) {
                if (!lIllIIIIIlIllll(this.V.f().contains(local) ? 1 : 0)) {
                    if (lIllIIIIIlIllll(this.Y.contains(local) ? 1 : 0)) {
                        String[] strArr = new String[lIIllIlIIIIll[5]];
                        strArr[lIIllIlIIIIll[0]] = lIIllIlIIIIIl[lIIllIlIIIIll[11]];
                        if (lIllIIIIIlIllll(Inventory.dropAll(strArr) ? 1 : 0)) {
                            return lIIllIlIIIIll[5];
                        }
                        if (!lIllIIIIIlIllll(this.V.g().contains(local) ? 1 : 0)) {
                            Movement.walkTo(this.V.g());
                            "".length();
                            return lIIllIlIIIIll[5];
                        }
                        NPC nearest = NPCs.getNearest(npc -> {
                            if (lIllIIIIIlIllll(npc.getName().contains(lIIllIlIIIIIl[lIIllIlIIIIll[12]]) ? 1 : 0)) {
                                String[] strArr2 = new String[lIIllIlIIIIll[5]];
                                strArr2[lIIllIlIIIIll[0]] = lIIllIlIIIIIl[lIIllIlIIIIll[13]];
                                if (lIllIIIIIlIllll(npc.hasAction(strArr2) ? 1 : 0) && (!lIllIIIIIllIIIl(npc.getName().contains(lIIllIlIIIIIl[lIIllIlIIIIll[14]]) ? 1 : 0) || lIllIIIIIlIllll(npc.getName().contains(lIIllIlIIIIIl[lIIllIlIIIIll[9]]) ? 1 : 0))) {
                                    ?? r0 = lIIllIlIIIIll[5];
                                    "".length();
                                    return "   ".length() < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                            }
                            return lIIllIlIIIIll[0];
                        });
                        if (lIllIIIIIllIlII(nearest)) {
                            nearest.interact(lIIllIlIIIIIl[lIIllIlIIIIll[8]]);
                            sleep(lIIllIlIIIIll[11]);
                            return lIIllIlIIIIll[5];
                        }
                        "".length();
                        if (" ".length() == 0) {
                            return ((14 ^ 100) ^ (71 ^ 31)) & (((((166 + 157) - 307) + 228) ^ (((194 + 142) - 295) + 157)) ^ (-" ".length()));
                        }
                    }
                    return lIIllIlIIIIll[0];
                } else if (lIllIIIIIlIllll(this.W.healInBank() ? 1 : 0) && lIllIIIIIllIIll(this.W.hpToBank(), Skills.getBoostedLevel(Skill.HITPOINTS))) {
                    this.V.b((boolean) lIIllIlIIIIll[5]);
                    return lIIllIlIIIIll[0];
                } else {
                    String[] strArr2 = new String[lIIllIlIIIIll[5]];
                    strArr2[lIIllIlIIIIll[0]] = lIIllIlIIIIIl[lIIllIlIIIIll[5]];
                    if (lIllIIIIIlIllll(Inventory.contains(strArr2) ? 1 : 0)) {
                        int freeSlots = Inventory.getFreeSlots();
                        int i = lIIllIlIIIIll[7];
                        String[] strArr3 = new String[lIIllIlIIIIll[6]];
                        strArr3[lIIllIlIIIIll[0]] = lIIllIlIIIIIl[lIIllIlIIIIll[6]];
                        strArr3[lIIllIlIIIIll[5]] = lIIllIlIIIIIl[lIIllIlIIIIll[7]];
                        if (lIllIIIIIllIIll(freeSlots - Math.min(i, Inventory.getAll(strArr3).size()), lIIllIlIIIIll[8]) && (!lIllIIIIIlIllll(this.W.stamina()) || !lIllIIIIIllIIIl(Inventory.contains(item -> {
                            if (lIllIIIIIlIllll(item.getName().contains(lIIllIlIIIIIl[lIIllIlIIIIll[19]]) ? 1 : 0)) {
                                String[] strArr4 = new String[lIIllIlIIIIll[5]];
                                strArr4[lIIllIlIIIIll[0]] = lIIllIlIIIIIl[lIIllIlIIIIll[20]];
                                if (lIllIIIIIlIllll(item.hasAction(strArr4) ? 1 : 0)) {
                                    ?? r0 = lIIllIlIIIIll[5];
                                    "".length();
                                    return "   ".length() == " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                            }
                            return lIIllIlIIIIll[0];
                        }) ? 1 : 0))) {
                            NPC nearest2 = NPCs.getNearest(npc2 -> {
                                if (lIllIIIIIlIllll(npc2.getName().contains(lIIllIlIIIIIl[lIIllIlIIIIll[15]]) ? 1 : 0)) {
                                    String[] strArr4 = new String[lIIllIlIIIIll[5]];
                                    strArr4[lIIllIlIIIIll[0]] = lIIllIlIIIIIl[lIIllIlIIIIll[16]];
                                    if (lIllIIIIIlIllll(npc2.hasAction(strArr4) ? 1 : 0) && (!lIllIIIIIllIIIl(npc2.getName().contains(lIIllIlIIIIIl[lIIllIlIIIIll[17]]) ? 1 : 0) || lIllIIIIIlIllll(npc2.getName().contains(lIIllIlIIIIIl[lIIllIlIIIIll[18]]) ? 1 : 0))) {
                                        ?? r0 = lIIllIlIIIIll[5];
                                        "".length();
                                        return "  ".length() == (-" ".length()) ? ((((157 + 33) - 38) + 28) ^ (((4 + 126) - 68) + 74)) & (((((85 + 206) - 164) + 128) ^ (((151 + 166) - 261) + 139)) ^ (-" ".length())) : r0;
                                    }
                                }
                                return lIIllIlIIIIll[0];
                            });
                            if (lIllIIIIIllIlII(nearest2) && lIllIIIIIllIlIl(local.distanceTo(nearest2), lIIllIlIIIIll[9])) {
                                nearest2.interact(lIIllIlIIIIIl[lIIllIlIIIIll[10]]);
                                sleep(lIIllIlIIIIll[11]);
                                return lIIllIlIIIIll[5];
                            }
                            Movement.walkTo(this.V.f());
                            "".length();
                            return lIIllIlIIIIll[5];
                        }
                    }
                    this.V.b((boolean) lIIllIlIIIIll[5]);
                    return lIIllIlIIIIll[0];
                }
            }
            return lIIllIlIIIIll[0];
        }
    }

    private static boolean lIllIIIIIllIIII(Object obj) {
        return obj == null;
    }

    private static String lIllIIIIIlIIIlI(String llllllllllllllIlllIllllllIIllIlI, String llllllllllllllIlllIllllllIIllIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllllllIIllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIllIlIIIIll[6], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllllllIIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIllllllIIllIll) {
            llllllllllllllIlllIllllllIIllIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIIIIlIllll(int i) {
        return i != 0;
    }

    private static boolean lIllIIIIIllIlIl(int i, int i2) {
        return i < i2;
    }

    private static String lIllIIIIIlIIlIl(String llllllllllllllIlllIllllllIlIllll, String llllllllllllllIlllIllllllIlIlllI) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIlllIllllllIlIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllIlllIllllllIlIllII = llllllllllllllIlllIllllllIlIlllI.toCharArray();
        int llllllllllllllIlllIllllllIlIlIll = lIIllIlIIIIll[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIIllIlIIIIll[0];
        while (lIllIIIIIllIlIl(i, length)) {
            sb.append((char) (charArray[i] ^ llllllllllllllIlllIllllllIlIllII[llllllllllllllIlllIllllllIlIlIll % llllllllllllllIlllIllllllIlIllII.length]));
            "".length();
            llllllllllllllIlllIllllllIlIlIll++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
}
