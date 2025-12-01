package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.client.Static;
@TaskDesc(name = "Vespula", priority = 10000, blocking = true)
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.aH  reason: invalid package */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/aH.class */
public class aH extends U {
    private /* synthetic */ C0039n al;
    private /* synthetic */ C0039n ak;
    private /* synthetic */ int am;
    private static /* synthetic */ int[] lIlIIIllllll;
    private /* synthetic */ int dX;
    private final /* synthetic */ int dY = 5417;
    private static /* synthetic */ String[] lIlIIIlllllI;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    private boolean dm() {
        if (llIlIllllIlIII(TileObjects.getNearest(tileObject -> {
            if (llIlIllllIlIIl(tileObject.getName().toLowerCase().contains(lIlIIIlllllI[lIlIIIllllll[11]]) ? 1 : 0)) {
                String[] strArr = new String[lIlIIIllllll[2]];
                strArr[lIlIIIllllll[4]] = lIlIIIlllllI[lIlIIIllllll[12]];
                if (llIlIllllIlIIl(tileObject.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lIlIIIllllll[2];
                    "".length();
                    return (-((103 ^ 87) ^ (71 ^ 115))) > 0 ? ((23 ^ 10) ^ (118 ^ 45)) & (((7 ^ 26) ^ (121 ^ 34)) ^ (-" ".length())) : r0;
                }
            }
            return lIlIIIllllll[4];
        }))) {
            System.out.println(lIlIIIlllllI[lIlIIIllllll[8]]);
            return lIlIIIllllll[4];
        } else if (!llIlIllllIlIIl(Dialog.isViewingOptions() ? 1 : 0) || !llIlIllllIlIIl(Dialog.getName().contains(lIlIIIlllllI[lIlIIIllllll[9]]) ? 1 : 0)) {
            Game.logout();
            return lIlIIIllllll[2];
        } else {
            String[] strArr = new String[lIlIIIllllll[2]];
            strArr[lIlIIIllllll[4]] = lIlIIIlllllI[lIlIIIllllll[10]];
            Dialog.chooseOption(strArr);
            "".length();
            return lIlIIIllllll[2];
        }
    }

    @Inject
    protected aH(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
        this.am = lIlIIIllllll[0];
        this.dX = lIlIIIllllll[0];
        this.dY = lIlIIIllllll[1];
    }

    static {
        llIlIllllIIlll();
        llIlIllllIIllI();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.U
    public boolean ch() {
        this.ak = this.co.L();
        this.am = this.co.N();
        this.al = this.co.M();
        if (llIlIllllIllII(this.ak.bw, N.VESPULA)) {
            ?? r0 = lIlIIIllllll[2];
            "".length();
            return (true ^ true) == ((true ^ true) & ((true ^ true) ^ true)) ? "   ".length() & ("   ".length() ^ (-1)) : r0;
        }
        return lIlIIIllllll[4];
    }

    public void db() {
        if (llIlIllllIlIIl(cj().isFullyEquipped() ? 1 : 0) && llIlIllllIllll(Combat.getAttackStyle(), Combat.AttackStyle.FOURTH) && llIlIllllIlIIl(Equipment.contains(item -> {
            if (!llIlIllllIlllI(item.getName().toLowerCase().contains(lIlIIIlllllI[lIlIIIllllll[17]]) ? 1 : 0) || llIlIllllIlIIl(item.getName().toLowerCase().contains(lIlIIIlllllI[lIlIIIllllll[18]]) ? 1 : 0)) {
                ?? r0 = lIlIIIllllll[2];
                "".length();
                return "  ".length() < " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIlIIIllllll[4];
        }) ? 1 : 0)) {
            Combat.setAttackStyle(Combat.AttackStyle.FOURTH);
        }
    }

    private static boolean llIlIllllIlIII(Object obj) {
        return obj == null;
    }

    private static void llIlIllllIIlll() {
        lIlIIIllllll = new int[24];
        lIlIIIllllll[0] = -" ".length();
        lIlIIIllllll[1] = (-((-9221) & 27671)) & (-8385) & 32251;
        lIlIIIllllll[2] = " ".length();
        lIlIIIllllll[3] = "  ".length();
        lIlIIIllllll[4] = ((115 ^ 61) ^ (108 ^ 98)) & (((247 ^ 172) ^ (222 ^ 197)) ^ (-" ".length()));
        lIlIIIllllll[5] = 123 ^ 107;
        lIlIIIllllll[6] = "   ".length();
        lIlIIIllllll[7] = (10 ^ 36) ^ (65 ^ 107);
        lIlIIIllllll[8] = 59 ^ 62;
        lIlIIIllllll[9] = (88 ^ 122) ^ (186 ^ 158);
        lIlIIIllllll[10] = (((103 + 110) - 198) + 145) ^ (((89 + 158) - 96) + 16);
        lIlIIIllllll[11] = (41 ^ 78) ^ (220 ^ 179);
        lIlIIIllllll[12] = 16 ^ 25;
        lIlIIIllllll[13] = 95 ^ 85;
        lIlIIIllllll[14] = (((5 + 184) - 151) + 165) ^ (((121 + 126) - 182) + 127);
        lIlIIIllllll[15] = (((133 + 5) - 54) + 60) ^ (((27 + 125) - 42) + 46);
        lIlIIIllllll[16] = (((64 + 37) - (-18)) + 65) ^ (((11 + 1) - (-150)) + 19);
        lIlIIIllllll[17] = (31 ^ 56) ^ (52 ^ 29);
        lIlIIIllllll[18] = (((7 + 71) - (-61)) + 51) ^ (((54 + 27) - 77) + 173);
        lIlIIIllllll[19] = 162 ^ 179;
        lIlIIIllllll[20] = 114 ^ 96;
        lIlIIIllllll[21] = 8 ^ 27;
        lIlIIIllllll[22] = 185 ^ 173;
        lIlIIIllllll[23] = 63 ^ 42;
    }

    private static void llIlIllllIIllI() {
        lIlIIIlllllI = new String[lIlIIIllllll[23]];
        lIlIIIlllllI[lIlIIIllllll[4]] = llIlIllllIIIll("CGlzgGYZYaA=", "KpzCl");
        lIlIIIlllllI[lIlIIIllllll[2]] = llIlIllllIIlII("HTEmLDsBLyVtIwkyNm08CScnbA==", "hABMO");
        lIlIIIlllllI[lIlIIIllllll[3]] = llIlIllllIIIll("QwwFlOcThrI=", "OXCpB");
        lIlIIIlllllI[lIlIIIllllll[6]] = llIlIllllIIlIl("CdherNXyvtw=", "VgwOW");
        lIlIIIlllllI[lIlIIIllllll[7]] = llIlIllllIIIll("86FhXzym9Ck=", "guWId");
        lIlIIIlllllI[lIlIIIllllll[8]] = llIlIllllIIlIl("8Inq4Ghmx1DQyZD7SoH+VFSNI2SZXXbL", "xVaCx");
        lIlIIIlllllI[lIlIIIllllll[9]] = llIlIllllIIIll("Qo4DG/pHsCYYolZWrD1lwQ7yfEnxjkA06xpl5ihInjEEHxVlp0wZ/w==", "lReEu");
        lIlIIIlllllI[lIlIIIllllll[10]] = llIlIllllIIlII("HzIaYQ==", "FWiOd");
        lIlIIIlllllI[lIlIIIllllll[11]] = llIlIllllIIlII("DT05ESMQNCQ=", "yXWuQ");
        lIlIIIlllllI[lIlIIIllllll[12]] = llIlIllllIIlII("Jw8WCQ==", "wnezt");
        lIlIIIlllllI[lIlIIIllllll[13]] = llIlIllllIIlII("Ai8vAgAxJjAYFSQjNgU=", "PJYkt");
        lIlIIIlllllI[lIlIIIllllll[14]] = llIlIllllIIlIl("VZIiqg41PfUvkuXNbJ0rBw==", "hyKAo");
        lIlIIIlllllI[lIlIIIllllll[15]] = llIlIllllIIlII("OgsFISZFHQ==", "bnwHE");
        lIlIIIlllllI[lIlIIIllllll[16]] = llIlIllllIIlIl("O+PuPd7I+Zn1hbvyaRMaHQ==", "PnJii");
        lIlIIIlllllI[lIlIIIllllll[17]] = llIlIllllIIIll("bQqiWiOxWfI=", "GpgdE");
        lIlIIIlllllI[lIlIIIllllll[18]] = llIlIllllIIlII("BDsmNREeNC0hEB4=", "wZHRd");
        lIlIIIlllllI[lIlIIIllllll[5]] = llIlIllllIIlII("NQs6IhECDw==", "ejIQp");
        lIlIIIlllllI[lIlIIIllllll[19]] = llIlIllllIIIll("7aJNAveBBDQ=", "vEupi");
        lIlIIIlllllI[lIlIIIllllll[20]] = llIlIllllIIlII("ITUeKBEbMQ==", "wPmXd");
        lIlIIIlllllI[lIlIIIllllll[21]] = llIlIllllIIlIl("8iNV7cyrxfvnps3kFS4nYA==", "EKmhj");
        lIlIIIlllllI[lIlIIIllllll[22]] = llIlIllllIIlII("FAIxATYuBg==", "BgBqC");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v47, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v56, types: [boolean] */
    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.U
    public boolean cg() {
        NPC nearest = NPCs.getNearest(npc -> {
            if (llIlIllllIlIIl(npc.getName().contains(lIlIIIlllllI[lIlIIIllllll[22]]) ? 1 : 0) && llIlIllllIlIIl(this.ak.a((Locatable) npc) ? 1 : 0)) {
                ?? r0 = lIlIIIllllll[2];
                "".length();
                return " ".length() == ((15 ^ 83) & ((26 ^ 70) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIlIIIllllll[4];
        });
        NPC nearest2 = NPCs.getNearest(npc2 -> {
            if (llIlIllllIlIIl(npc2.getName().contains(lIlIIIlllllI[lIlIIIllllll[21]]) ? 1 : 0) && llIlIllllIlIIl(this.ak.a((Locatable) npc2) ? 1 : 0)) {
                ?? r0 = lIlIIIllllll[2];
                "".length();
                return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIlIIIllllll[4];
        });
        if (llIlIllllIlIII(nearest2) && llIlIllllIlIII(nearest)) {
            return llIlIllllIlIIl(cU() ? 1 : 0) ? lIlIIIllllll[2] : cS();
        } else if (llIlIllllIlIlI(this.bS.distanceTo(this.ak.bs), lIlIIIllllll[2]) && llIlIllllIlIIl(dm() ? 1 : 0)) {
            return lIlIIIllllll[2];
        } else {
            dl();
            "".length();
            db();
            if (llIlIllllIlIlI(this.cq.getTickCount() - this.dX, lIlIIIllllll[3]) && llIlIllllIlIll(Prayers.getPoints())) {
                if (llIlIllllIlIII(nearest2)) {
                    return lIlIIIllllll[4];
                }
                nearest2.interact(lIlIIIlllllI[lIlIIIllllll[4]]);
                return lIlIIIllllll[2];
            }
            WorldPoint c2 = H.VESPULA_ATTACK_POINT.c(this.ak);
            if (!llIlIllllIlIIl(this.bS.getWorldLocation().equals(c2) ? 1 : 0)) {
                Movement.setDestination(c2);
                return lIlIIIllllll[2];
            }
            System.out.println(lIlIIIlllllI[lIlIIIllllll[2]]);
            this.dX = this.cq.getTickCount();
            return lIlIIIllllll[2];
        }
    }

    private static boolean llIlIllllIlllI(int i) {
        return i == 0;
    }

    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.U
    public List<Prayer> ci() {
        ArrayList arrayList = new ArrayList();
        if (llIlIllllIlIII(NPCs.getNearest(npc -> {
            return npc.getName().contains(lIlIIIlllllI[lIlIIIllllll[20]]);
        })) || llIlIllllIlIlI(this.bS.distanceTo(this.ak.bs), lIlIIIllllll[2])) {
            return null;
        }
        List offensive = Prayers.getOffensive();
        arrayList.add(Prayer.REDEMPTION);
        "".length();
        arrayList.addAll(offensive);
        "".length();
        return arrayList;
    }

    private static String llIlIllllIIlII(String lllllllllllllllIllIlllIllIlIlIII, String lllllllllllllllIllIlllIllIlIIlll) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIllIlllIllIlIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIlllIllIlIIllI = new StringBuilder();
        char[] charArray = lllllllllllllllIllIlllIllIlIIlll.toCharArray();
        int lllllllllllllllIllIlllIllIlIIlII = lIlIIIllllll[4];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int lllllllllllllllIllIlllIllIIlllII = lIlIIIllllll[4];
        while (llIlIlllllIIII(lllllllllllllllIllIlllIllIIlllII, length)) {
            char lllllllllllllllIllIlllIllIlIlIIl = charArray2[lllllllllllllllIllIlllIllIIlllII];
            lllllllllllllllIllIlllIllIlIIllI.append((char) (lllllllllllllllIllIlllIllIlIlIIl ^ charArray[lllllllllllllllIllIlllIllIlIIlII % charArray.length]));
            "".length();
            lllllllllllllllIllIlllIllIlIIlII++;
            lllllllllllllllIllIlllIllIIlllII++;
            "".length();
            if ("   ".length() <= ((228 ^ 191) & ((238 ^ 181) ^ (-1)))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIllIlllIllIlIIllI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    private boolean cS() {
        if (llIlIllllIlIIl(Reachable.isWalkable(this.ak.bt) ? 1 : 0)) {
            if (llIlIllllIllIl(Movement.getDestination()) && llIlIllllIlIIl(Movement.getDestination().equals(this.al.bt) ? 1 : 0)) {
                return lIlIIIllllll[4];
            }
            Movement.setDestination(this.al.bs);
            return lIlIIIllllll[2];
        }
        TileObject cR = cR();
        if (llIlIllllIlIII(cR)) {
            Movement.setDestination(this.ak.bq.dx(lIlIIIllllll[5]).dy(lIlIIIllllll[5]));
            return lIlIIIllllll[2];
        } else if (!llIlIllllIlllI(this.bS.isMoving() ? 1 : 0) || llIlIllllIlIIl(this.bS.isAnimating() ? 1 : 0)) {
            return lIlIIIllllll[4];
        } else {
            cR.interact(lIlIIIlllllI[lIlIIIllllll[3]]);
            return lIlIIIllllll[2];
        }
    }

    private static boolean llIlIllllIlIIl(int i) {
        return i != 0;
    }

    private static boolean llIlIllllIlIll(int i) {
        return i > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    private boolean dl() {
        Item first = Inventory.getFirst(item -> {
            return item.getName().startsWith(lIlIIIlllllI[lIlIIIllllll[16]]);
        });
        if (!llIlIllllIlIII(first) && !llIlIllllIlIll(Static.getClient().getVarbitValue(lIlIIIllllll[1]))) {
            first.interact(lIlIIIlllllI[lIlIIIllllll[6]]);
            return lIlIIIllllll[2];
        }
        return lIlIIIllllll[4];
    }

    private static boolean llIlIllllIlIlI(int i, int i2) {
        return i <= i2;
    }

    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.U
    public EquipmentSetup cj() {
        return C0044s.b(C0044s.e(N.VESPULA));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    private boolean cU() {
        if (llIlIllllIlIIl(Inventory.isFull() ? 1 : 0)) {
            return lIlIIIllllll[4];
        }
        TileItem nearest = TileItems.getNearest(tileItem -> {
            if (llIlIllllIlIIl(tileItem.getName().startsWith(lIlIIIlllllI[lIlIIIllllll[15]]) ? 1 : 0) && llIlIllllIlIIl(this.ak.a((Locatable) tileItem) ? 1 : 0) && llIlIllllIlIIl(Reachable.isInteractable(tileItem) ? 1 : 0)) {
                ?? r0 = lIlIIIllllll[2];
                "".length();
                return "   ".length() <= 0 ? ((107 ^ 75) ^ "   ".length()) & (((119 ^ 104) ^ (136 ^ 180)) ^ (-" ".length())) : r0;
            }
            return lIlIIIllllll[4];
        });
        if (llIlIllllIlllI(Inventory.contains(item -> {
            return item.getName().startsWith(lIlIIIlllllI[lIlIIIllllll[14]]);
        }) ? 1 : 0)) {
            nearest = TileItems.getNearest(tileItem2 -> {
                if (llIlIllllIlIIl(tileItem2.getName().startsWith(lIlIIIlllllI[lIlIIIllllll[13]]) ? 1 : 0) && llIlIllllIlIIl(this.ak.a((Locatable) tileItem2) ? 1 : 0) && llIlIllllIlIIl(Reachable.isInteractable(tileItem2) ? 1 : 0)) {
                    ?? r0 = lIlIIIllllll[2];
                    "".length();
                    return ((73 ^ 29) & ((63 ^ 107) ^ (-1))) <= (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIlIIIllllll[4];
            });
        }
        if (llIlIllllIlIII(nearest)) {
            return lIlIIIllllll[4];
        }
        nearest.interact(lIlIIIlllllI[lIlIIIllllll[7]]);
        return lIlIIIllllll[2];
    }

    private static boolean llIlIllllIllII(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static String llIlIllllIIlIl(String lllllllllllllllIllIlllIllIlllIII, String lllllllllllllllIllIlllIllIllIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIlllIllIllIlll.getBytes(StandardCharsets.UTF_8)), lIlIIIllllll[11]), "DES");
            Cipher lllllllllllllllIllIlllIllIlllIlI = Cipher.getInstance("DES");
            lllllllllllllllIllIlllIllIlllIlI.init(lIlIIIllllll[3], secretKeySpec);
            return new String(lllllllllllllllIllIlllIllIlllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIlllIllIlllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIlllIllIlllIIl) {
            lllllllllllllllIllIlllIllIlllIIl.printStackTrace();
            return null;
        }
    }

    private TileObject cR() {
        return TileObjects.getNearest(tileObject -> {
            if (llIlIllllIlIIl(tileObject.getName().equals(lIlIIIlllllI[lIlIIIllllll[5]]) ? 1 : 0)) {
                String[] strArr = new String[lIlIIIllllll[2]];
                strArr[lIlIIIllllll[4]] = lIlIIIlllllI[lIlIIIllllll[19]];
                if (llIlIllllIlIIl(tileObject.hasAction(strArr) ? 1 : 0) && llIlIllllIlIIl(this.ak.a((Locatable) tileObject) ? 1 : 0)) {
                    ?? r0 = lIlIIIllllll[2];
                    "".length();
                    return ((22 ^ 38) & ((90 ^ 106) ^ (-1))) < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
            return lIlIIIllllll[4];
        });
    }

    private static boolean llIlIllllIllIl(Object obj) {
        return obj != null;
    }

    private static boolean llIlIllllIllll(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean llIlIlllllIIII(int i, int i2) {
        return i < i2;
    }

    private static String llIlIllllIIIll(String lllllllllllllllIllIlllIlllIIIlIl, String lllllllllllllllIllIlllIlllIIIlII) {
        try {
            SecretKeySpec lllllllllllllllIllIlllIlllIIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIlllIlllIIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIIIllllll[3], lllllllllllllllIllIlllIlllIIlIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIlllIlllIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIlllIlllIIIllI) {
            lllllllllllllllIllIlllIlllIIIllI.printStackTrace();
            return null;
        }
    }
}
