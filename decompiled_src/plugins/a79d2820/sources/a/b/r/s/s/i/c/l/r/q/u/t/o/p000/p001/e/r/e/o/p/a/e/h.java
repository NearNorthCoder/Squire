package a.b.r.s.s.i.c.l.r.q.u.t.o.p000.p001.e.r.e.o.p.a.e;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.corp.SquireCorp;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Gear;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.TeleportLoader;
@Singleton
@TaskDesc(name = "Attacking corporeal beast")
/* renamed from: a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e.h  reason: invalid package */
/* loaded from: a79d2820-2b30-4bed-9aed-0ccb18befd76.jar:a/b/r/s/s/i/c/l/r/q/u/t/o/-/-/e/r/e/o/p/a/e/h.class */
public class h extends a {
    private static /* synthetic */ String[] lIlIlllllIIl;
    @Inject
    private /* synthetic */ SquireCorp p;
    @Inject

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ s f2a;
    private static /* synthetic */ int[] lIlIlllllIlI;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v62, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v64, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v89, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v93, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v95, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v55, types: [boolean] */
    public boolean run() {
        if (lllIIIlIllIIII(this.f2a.u(), lIlIlllllIlI[0])) {
            return lIlIlllllIlI[1];
        }
        NPC f = f();
        if (lllIIIlIllIIIl(f) && lllIIIlIllIIlI(Reachable.isInteractable(f) ? 1 : 0) && !lllIIIlIllIIlI(f.isDead() ? 1 : 0)) {
            if (lllIIIlIllIIIl(Players.getNearest(player -> {
                if (lllIIIlIlllIII(player, Players.getLocal()) && lllIIIlIllIllI(player.getInteracting(), f) && lllIIIlIllIlIl(player.isFriend() ? 1 : 0)) {
                    ?? r0 = lIlIlllllIlI[2];
                    "".length();
                    return " ".length() >= "  ".length() ? ((197 ^ 172) ^ (37 ^ 72)) & (((18 ^ 117) ^ (16 ^ 115)) ^ (-" ".length())) : r0;
                }
                return lIlIlllllIlI[1];
            }))) {
                this.p.c(lIlIlllllIlI[2]);
                return lIlIlllllIlI[1];
            } else if (lllIIIlIllIIll(Combat.getCurrentHealth(), lIlIlllllIlI[3])) {
                TeleportLoader.enterHouse();
                "".length();
                return lIlIlllllIlI[1];
            } else {
                if (lllIIIlIllIlII(Combat.getSpecEnergy(), lIlIlllllIlI[4]) && lllIIIlIllIIlI(a(f) ? 1 : 0)) {
                    String[] strArr = new String[lIlIlllllIlI[2]];
                    strArr[lIlIlllllIlI[1]] = lIlIlllllIIl[lIlIlllllIlI[1]];
                    Item first = Inventory.getFirst(strArr);
                    if (lllIIIlIllIIIl(first)) {
                        first.interact(lIlIlllllIIl[lIlIlllllIlI[2]]);
                    }
                    if (lllIIIlIllIlIl(Combat.isSpecEnabled() ? 1 : 0)) {
                        Combat.toggleSpec();
                    }
                    "".length();
                    if ("   ".length() >= ((((157 + 48) - 44) + 6) ^ (((15 + 110) - 120) + 158))) {
                        return ((((43 + 81) - 30) + 140) ^ (((68 + 3) - (-97)) + 21)) & (((((94 + 154) - 220) + 185) ^ (((97 + 62) - 34) + 5)) ^ (-" ".length()));
                    }
                } else if (lllIIIlIllIlII(Combat.getSpecEnergy(), lIlIlllllIlI[5]) && lllIIIlIllIlIl(a(f) ? 1 : 0)) {
                    int[] iArr = new int[lIlIlllllIlI[2]];
                    iArr[lIlIlllllIlI[1]] = lIlIlllllIlI[6];
                    Item first2 = Inventory.getFirst(iArr);
                    if (lllIIIlIllIIIl(first2)) {
                        first2.interact(lIlIlllllIIl[lIlIlllllIlI[7]]);
                    }
                    if (lllIIIlIllIlIl(Combat.isSpecEnabled() ? 1 : 0)) {
                        Combat.toggleSpec();
                    }
                    "".length();
                    if (" ".length() != " ".length()) {
                        return (true ^ true) & ((true ^ true) ^ true);
                    }
                } else {
                    EquipmentSetup equipmentSetup = (EquipmentSetup) this.o.fightLoadout().selected(EquipmentSetup.class);
                    if (lllIIIlIllIlIl(Gear.isEquipped(equipmentSetup.getIds()) ? 1 : 0)) {
                        Gear.swapTo(equipmentSetup);
                        "".length();
                    }
                }
                if (lllIIIlIllIllI(Players.getLocal().getInteracting(), f)) {
                    return lIlIlllllIlI[1];
                }
                f.interact(lIlIlllllIIl[lIlIlllllIlI[8]]);
                return lIlIlllllIlI[2];
            }
        }
        return lIlIlllllIlI[1];
    }

    private static boolean lllIIIlIllIllI(Object obj, Object obj2) {
        return obj == obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    private boolean a(NPC npc) {
        String[] strArr = new String[lIlIlllllIlI[2]];
        strArr[lIlIlllllIlI[1]] = lIlIlllllIIl[lIlIlllllIlI[9]];
        if (lllIIIlIllIlIl(Inventory.contains(strArr) ? 1 : 0)) {
            String[] strArr2 = new String[lIlIlllllIlI[2]];
            strArr2[lIlIlllllIlI[1]] = lIlIlllllIIl[lIlIlllllIlI[10]];
            if (lllIIIlIllIlIl(Equipment.contains(strArr2) ? 1 : 0)) {
                return lIlIlllllIlI[1];
            }
        }
        if (lllIIIlIllIIll(npc.getHealthRatio(), lIlIlllllIlI[11]) && lllIIIlIllIlll(npc.getHealthRatio(), lIlIlllllIlI[2])) {
            ?? r0 = lIlIlllllIlI[2];
            "".length();
            return (((4 ^ 26) ^ (13 ^ 90)) & (((168 ^ 176) ^ (194 ^ 147)) ^ (-" ".length()))) != 0 ? ((15 ^ 68) ^ (8 ^ 2)) & (((89 ^ 107) ^ (254 ^ 141)) ^ (-" ".length())) : r0;
        }
        return lIlIlllllIlI[1];
    }

    private static boolean lllIIIlIllIIlI(int i) {
        return i != 0;
    }

    private static void lllIIIlIlIllll() {
        lIlIlllllIlI = new int[14];
        lIlIlllllIlI[0] = -" ".length();
        lIlIlllllIlI[1] = ((83 ^ 33) ^ (68 ^ 122)) & (((((24 + 158) - 97) + 114) ^ (((114 + 88) - 88) + 25)) ^ (-" ".length()));
        lIlIlllllIlI[2] = " ".length();
        lIlIlllllIlI[3] = (34 ^ 73) ^ (194 ^ 132);
        lIlIlllllIlI[4] = 180 ^ 170;
        lIlIlllllIlI[5] = 50 ^ 0;
        lIlIlllllIlI[6] = (-20866) & 32669;
        lIlIlllllIlI[7] = "  ".length();
        lIlIlllllIlI[8] = "   ".length();
        lIlIlllllIlI[9] = 108 ^ 104;
        lIlIlllllIlI[10] = 28 ^ 25;
        lIlIlllllIlI[11] = ((23 + 131) - 61) + 107;
        lIlIlllllIlI[12] = (52 ^ 100) ^ (229 ^ 179);
        lIlIlllllIlI[13] = (8 ^ 78) ^ (26 ^ 84);
    }

    private static boolean lllIIIlIlllIII(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean lllIIIlIllIlII(int i, int i2) {
        return i >= i2;
    }

    private static String lllIIIlIlIllIl(String lllllllllllllllIllIIIllIIlllIlII, String lllllllllllllllIllIIIllIIlllIIll) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIllIIIllIIlllIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIllIIIllIIlllIIIl = lllllllllllllllIllIIIllIIlllIIll.toCharArray();
        int lllllllllllllllIllIIIllIIlllIIII = lIlIlllllIlI[1];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIlIlllllIlI[1];
        while (lllIIIlIllIIll(i, length)) {
            sb.append((char) (charArray[i] ^ lllllllllllllllIllIIIllIIlllIIIl[lllllllllllllllIllIIIllIIlllIIII % lllllllllllllllIllIIIllIIlllIIIl.length]));
            "".length();
            lllllllllllllllIllIIIllIIlllIIII++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lllIIIlIllIlIl(int i) {
        return i == 0;
    }

    private static boolean lllIIIlIllIlll(int i, int i2) {
        return i > i2;
    }

    private static String lllIIIlIlIllII(String lllllllllllllllIllIIIllIlIIlIIIl, String lllllllllllllllIllIIIllIlIIIlllI) {
        try {
            SecretKeySpec lllllllllllllllIllIIIllIlIIlIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIIllIlIIIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIIIllIlIIlIIll = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIIIllIlIIlIIll.init(lIlIlllllIlI[7], lllllllllllllllIllIIIllIlIIlIlII);
            return new String(lllllllllllllllIllIIIllIlIIlIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIIllIlIIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIIIllIlIIlIIlI) {
            lllllllllllllllIllIIIllIlIIlIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIIlIllIIII(int i, int i2) {
        return i != i2;
    }

    private static void lllIIIlIlIlllI() {
        lIlIlllllIIl = new String[lIlIlllllIlI[12]];
        lIlIlllllIIl[lIlIlllllIlI[1]] = lllIIIlIlIlIll("nYql6WA+tDbPZ72HjcnlKQ==", "nSSXv");
        lIlIlllllIIl[lIlIlllllIlI[2]] = lllIIIlIlIllII("kzTfEddxajU=", "oNIuK");
        lIlIlllllIIl[lIlIlllllIlI[7]] = lllIIIlIlIlIll("gGMD53mVqA4=", "yLUhu");
        lIlIlllllIIl[lIlIlllllIlI[8]] = lllIIIlIlIllII("+g20IFJSWMw=", "VdOMO");
        lIlIlllllIIl[lIlIlllllIlI[9]] = lllIIIlIlIllIl("Gxw7JTY5AmI+IzQMJyQm", "XnBVB");
        lIlIlllllIIl[lIlIlllllIlI[10]] = lllIIIlIlIlIll("+AD6HwQosAkh2MYKBGbd/Q==", "xNCwE");
    }

    private static boolean lllIIIlIllIIll(int i, int i2) {
        return i < i2;
    }

    private static String lllIIIlIlIlIll(String lllllllllllllllIllIIIllIlIIIIlII, String lllllllllllllllIllIIIllIlIIIIIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIIllIlIIIIIll.getBytes(StandardCharsets.UTF_8)), lIlIlllllIlI[13]), "DES");
            Cipher lllllllllllllllIllIIIllIlIIIIllI = Cipher.getInstance("DES");
            lllllllllllllllIllIIIllIlIIIIllI.init(lIlIlllllIlI[7], secretKeySpec);
            return new String(lllllllllllllllIllIIIllIlIIIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIIllIlIIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIIIllIlIIIIlIl) {
            lllllllllllllllIllIIIllIlIIIIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIIlIllIIIl(Object obj) {
        return obj != null;
    }

    static {
        lllIIIlIlIllll();
        lllIIIlIlIlllI();
    }
}
