package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.Prayer;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Gear;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Prayers;
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.U  reason: invalid package */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/U.class */
public abstract class U extends Task {
    protected final /* synthetic */ SquireChambersConfig cp;
    private static /* synthetic */ int[] lIlIIIIIllII;
    protected static /* synthetic */ C0000a aa;
    private static /* synthetic */ String[] lIlIIIIIlIll;
    protected /* synthetic */ Random cr = new Random();
    protected final /* synthetic */ SquireChambersPlugin co;
    protected /* synthetic */ Player bS;
    protected final /* synthetic */ Client cq;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean e(C0039n c0039n) {
        TileObject nearest = TileObjects.getNearest(tileObject -> {
            if (llIlIlIIIllIlI(tileObject.getName().equals(lIlIIIIIlIll[lIlIIIIIllII[10]]) ? 1 : 0)) {
                String[] strArr = new String[lIlIIIIIllII[0]];
                strArr[lIlIIIIIllII[1]] = lIlIIIIIlIll[lIlIIIIIllII[5]];
                if (llIlIlIIIllIlI(tileObject.hasAction(strArr) ? 1 : 0) && llIlIlIIIllIlI(c0039n.a((Locatable) tileObject) ? 1 : 0)) {
                    ?? r0 = lIlIIIIIllII[0];
                    "".length();
                    return " ".length() < " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
            return lIlIIIIIllII[1];
        });
        if (llIlIlIIIlllII(nearest)) {
            return lIlIIIIIllII[1];
        }
        if (!llIlIlIIlIIIII(Movement.getRunEnergy(), lIlIIIIIllII[3])) {
            nearest.interact(lIlIIIIIlIll[lIlIIIIIllII[0]]);
            return lIlIIIIIllII[0];
        } else if (llIlIlIIIlIlll(Movement.getRunEnergy(), lIlIIIIIllII[4]) && llIlIlIIIlIlll(nearest.distanceTo(this.bS), lIlIIIIIllII[5])) {
            nearest.interact(lIlIIIIIlIll[lIlIIIIIllII[1]]);
            return lIlIIIIIllII[0];
        } else {
            return lIlIIIIIllII[1];
        }
    }

    private static boolean llIlIlIIIllIll(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [boolean] */
    private void cl() {
        List<Prayer> ci = ci();
        if (!llIlIlIIIlllIl(ci) || !llIlIlIIIlIllI(ci.isEmpty() ? 1 : 0) || !llIlIlIIIllllI(Prayers.getPoints())) {
            Prayers.disableAll();
        } else if (llIlIlIIIllIIl(this.co.L().aM(), N.VESPULA)) {
            Prayers.flick(ci, (boolean) lIlIIIIIllII[0]);
            "".length();
        } else {
            Prayers.flick(ci);
            "".length();
            "".length();
            if (((135 ^ 194) & ((34 ^ 103) ^ (-1))) > 0) {
            }
        }
    }

    private static boolean llIlIlIIIlllII(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    protected boolean cn() {
        if (llIlIlIIIllIlI(Inventory.contains(item -> {
            return item.getName().startsWith(lIlIIIIIlIll[lIlIIIIIllII[9]]);
        }) ? 1 : 0)) {
            return lIlIIIIIllII[1];
        }
        TileItem nearest = TileItems.getNearest(tileItem -> {
            if (llIlIlIIIllIll(tileItem.getId(), lIlIIIIIllII[8]) && llIlIlIIIllIlI(Reachable.isWalkable(tileItem.getWorldLocation()) ? 1 : 0)) {
                ?? r0 = lIlIIIIIllII[0];
                "".length();
                return " ".length() < (((21 ^ 94) ^ (50 ^ 118)) & (((((112 + 43) - 144) + 118) ^ (((140 + 23) - 62) + 41)) ^ (-" ".length()))) ? ((62 ^ 44) ^ ((30 ^ 80) & ((41 ^ 103) ^ (-1)))) & (((11 ^ 110) ^ (118 ^ 1)) ^ (-" ".length())) : r0;
            }
            return lIlIIIIIllII[1];
        });
        if (llIlIlIIIlllII(nearest)) {
            return lIlIIIIIllII[1];
        }
        if (llIlIlIIIllIlI(Inventory.isFull() ? 1 : 0)) {
            this.co.x();
            "".length();
            return lIlIIIIIllII[0];
        } else if (llIlIlIIIllIlI(this.bS.isMoving() ? 1 : 0)) {
            return lIlIIIIIllII[0];
        } else {
            nearest.interact(lIlIIIIIlIll[lIlIIIIIllII[6]]);
            return lIlIIIIIllII[0];
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    public boolean co() {
        TileItem nearest = TileItems.getNearest(tileItem -> {
            if (llIlIlIIIllIll(tileItem.getId(), lIlIIIIIllII[7]) && llIlIlIIIllIlI(Reachable.isWalkable(tileItem.getWorldLocation()) ? 1 : 0)) {
                ?? r0 = lIlIIIIIllII[0];
                "".length();
                return " ".length() <= 0 ? ((86 ^ 66) ^ (163 ^ 135)) & (((95 ^ 3) ^ (40 ^ 68)) ^ (-" ".length())) : r0;
            }
            return lIlIIIIIllII[1];
        });
        if (llIlIlIIIlllII(nearest)) {
            return lIlIIIIIllII[1];
        }
        if (llIlIlIIIllIlI(Inventory.isFull() ? 1 : 0)) {
            this.co.x();
            "".length();
            return lIlIIIIIllII[0];
        } else if (llIlIlIIIllIlI(this.bS.isMoving() ? 1 : 0)) {
            return lIlIIIIIllII[0];
        } else {
            nearest.interact(lIlIIIIIlIll[lIlIIIIIllII[2]]);
            return lIlIIIIIllII[0];
        }
    }

    private static boolean llIlIlIIIllIlI(int i) {
        return i != 0;
    }

    private static boolean llIlIlIIIlIlll(int i, int i2) {
        return i < i2;
    }

    private static boolean llIlIlIIIllllI(int i) {
        return i > 0;
    }

    private static void llIlIlIIIlIlIl() {
        lIlIIIIIllII = new int[13];
        lIlIIIIIllII[0] = " ".length();
        lIlIIIIIllII[1] = ((222 ^ 168) ^ (105 ^ 20)) & (((((5 + 21) - (-34)) + 86) ^ (((84 + 28) - 15) + 56)) ^ (-" ".length()));
        lIlIIIIIllII[2] = "   ".length();
        lIlIIIIIllII[3] = (40 ^ 11) ^ (83 ^ 76);
        lIlIIIIIllII[4] = 250 ^ 160;
        lIlIIIIIllII[5] = (((32 + 57) - (-67)) + 4) ^ (((63 + 87) - 121) + 137);
        lIlIIIIIllII[6] = "  ".length();
        lIlIIIIIllII[7] = (-9731) & 16303;
        lIlIIIIIllII[8] = (-((-292) & 3455)) & (-8609) & 32767;
        lIlIIIIIllII[9] = (18 ^ 11) ^ (6 ^ 27);
        lIlIIIIIllII[10] = 131 ^ 134;
        lIlIIIIIllII[11] = (33 ^ 62) ^ (80 ^ 72);
        lIlIIIIIllII[12] = 168 ^ 160;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    public boolean run() {
        if (!llIlIlIIIlIllI(this.cq.isInInstancedRegion() ? 1 : 0) && !llIlIlIIIllIlI(this.cp.pause() ? 1 : 0)) {
            aa = this.co.C();
            if (llIlIlIIIlllII(aa)) {
                return lIlIIIIIllII[1];
            }
            this.bS = Players.getLocal();
            if (!llIlIlIIIlllII(this.bS) && !llIlIlIIIlIllI(ch() ? 1 : 0)) {
                cl();
                cm();
                return cg();
            }
            return lIlIIIIIllII[1];
        }
        return lIlIIIIIllII[1];
    }

    public abstract boolean ch();

    private static boolean llIlIlIIIlllll(int i) {
        return i <= 0;
    }

    static {
        llIlIlIIIlIlIl();
        llIlIlIIIlIlII();
    }

    private static boolean llIlIlIIlIIIII(int i, int i2) {
        return i > i2;
    }

    private static String llIlIlIIIlIIll(String lllllllllllllllIlllIIlIIIlIIlIII, String lllllllllllllllIlllIIlIIIlIIIlll) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlllIIlIIIlIIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIlllIIlIIIlIIIlll.toCharArray();
        int lllllllllllllllIlllIIlIIIlIIIlII = lIlIIIIIllII[1];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIlIIIIIllII[1];
        while (llIlIlIIIlIlll(i, length)) {
            char lllllllllllllllIlllIIlIIIlIIlIIl = charArray2[i];
            sb.append((char) (lllllllllllllllIlllIIlIIIlIIlIIl ^ charArray[lllllllllllllllIlllIIlIIIlIIIlII % charArray.length]));
            "".length();
            lllllllllllllllIlllIIlIIIlIIIlII++;
            i++;
            "".length();
            if ((-" ".length()) > 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean llIlIlIIIllIIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static String llIlIlIIIlIIlI(String lllllllllllllllIlllIIlIIIIllIIll, String lllllllllllllllIlllIIlIIIIllIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIIlIIIIllIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlllIIlIIIIllIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIlllIIlIIIIllIlIl.init(lIlIIIIIllII[6], secretKeySpec);
            return new String(lllllllllllllllIlllIIlIIIIllIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIIlIIIIllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIIlIIIIllIlII) {
            lllllllllllllllIlllIIlIIIIllIlII.printStackTrace();
            return null;
        }
    }

    private static void llIlIlIIIlIlII() {
        lIlIIIIIlIll = new String[lIlIIIIIllII[11]];
        lIlIIIIIlIll[lIlIIIIIllII[1]] = llIlIlIIIlIIIl("5SgPyKsEmcU=", "SpgjG");
        lIlIIIIIlIll[lIlIIIIIllII[0]] = llIlIlIIIlIIlI("1mplxjzWiVw=", "gPMoi");
        lIlIIIIIlIll[lIlIIIIIllII[6]] = llIlIlIIIlIIll("AAYjLA==", "TgHIi");
        lIlIIIIIlIll[lIlIIIIIllII[2]] = llIlIlIIIlIIlI("rMYUTM3t4oI=", "XvVbG");
        lIlIIIIIlIll[lIlIIIIIllII[9]] = llIlIlIIIlIIIl("ltPx4Rthtk+hLkY8Q9ZSwg==", "JVCjq");
        lIlIIIIIlIll[lIlIIIIIllII[10]] = llIlIlIIIlIIll("FzsSBjArdQAROz4=", "RUwtW");
        lIlIIIIIlIll[lIlIIIIIllII[5]] = llIlIlIIIlIIIl("UlUHxIn78dA=", "bCgqX");
    }

    private static boolean llIlIlIIIlIllI(int i) {
        return i == 0;
    }

    private static boolean llIlIlIIIlllIl(Object obj) {
        return obj != null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Inject
    public U(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        this.co = squireChambersPlugin;
        this.cp = squireChambersConfig;
        this.cq = client;
    }

    private void cm() {
        EquipmentSetup cj = cj();
        if (llIlIlIIIlllII(cj) || llIlIlIIIllIlI(cj.isEquipped() ? 1 : 0)) {
            return;
        }
        if (llIlIlIIIllIlI(Inventory.isFull() ? 1 : 0) && llIlIlIIIlllIl(Equipment.fromSlot(EquipmentInventorySlot.SHIELD)) && llIlIlIIIlllll(cj.get(EquipmentInventorySlot.SHIELD))) {
            this.co.x();
            "".length();
        }
        Gear.swapTo(cj);
        "".length();
    }

    public abstract List<Prayer> ci();

    public abstract EquipmentSetup cj();

    private static String llIlIlIIIlIIIl(String lllllllllllllllIlllIIlIIIIlIIllI, String lllllllllllllllIlllIIlIIIIlIIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIIlIIIIlIIlIl.getBytes(StandardCharsets.UTF_8)), lIlIIIIIllII[12]), "DES");
            Cipher lllllllllllllllIlllIIlIIIIlIlIII = Cipher.getInstance("DES");
            lllllllllllllllIlllIIlIIIIlIlIII.init(lIlIIIIIllII[6], secretKeySpec);
            return new String(lllllllllllllllIlllIIlIIIIlIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIIlIIIIlIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIIlIIIIlIIlll) {
            lllllllllllllllIlllIIlIIIIlIIlll.printStackTrace();
            return null;
        }
    }

    public abstract boolean cg();

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v100, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v138, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v63, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v82, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v88, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v94, types: [boolean] */
    public boolean ck() {
        int i;
        if (llIlIlIIIlIllI(aa.e().contains(N.UNKNOWN_COMBAT) ? 1 : 0) && llIlIlIIIlIllI(aa.e().contains(N.UNKNOWN_PUZZLE) ? 1 : 0)) {
            i = lIlIIIIIllII[0];
            "".length();
            if (0 != 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else {
            i = lIlIIIIIllII[1];
        }
        if (llIlIlIIIlIllI(i)) {
            return lIlIIIIIllII[1];
        }
        List<N> e = aa.e();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i2 = lIlIIIIIllII[1];
        while (llIlIlIIIlIlll(i2, e.size())) {
            N n = e.get(i2);
            if (llIlIlIIIllIII(n, N.START) && llIlIlIIIllIII(n, N.SCAVENGERS) && llIlIlIIIllIII(n, N.FARMING)) {
                if (llIlIlIIIllIIl(n, N.END)) {
                    "".length();
                    if ("   ".length() <= 0) {
                        return ((52 ^ 74) ^ (37 ^ 23)) & (((172 ^ 160) ^ (87 ^ 23)) ^ (-" ".length()));
                    }
                } else {
                    if (llIlIlIIIllIIl(n.bY(), P.COMBAT)) {
                        arrayList.add(n);
                        "".length();
                    }
                    if (llIlIlIIIllIIl(n.bY(), P.PUZZLE)) {
                        arrayList2.add(n);
                        "".length();
                    }
                }
            }
            i2++;
            "".length();
            if ("  ".length() == 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        if (llIlIlIIIlIllI(this.cp.enableCrabs() ? 1 : 0) && llIlIlIIIllIlI(aa.e().contains(N.CRABS) ? 1 : 0)) {
            return lIlIIIIIllII[1];
        }
        if (llIlIlIIIlIllI(this.cp.enableIceDemon() ? 1 : 0) && llIlIlIIIllIlI(aa.e().contains(N.ICE_DEMON) ? 1 : 0)) {
            return lIlIIIIIllII[1];
        }
        if (llIlIlIIIlIllI(this.cp.enableThieving() ? 1 : 0) && llIlIlIIIllIlI(aa.e().contains(N.ICE_DEMON) ? 1 : 0)) {
            return lIlIIIIIllII[1];
        }
        if (llIlIlIIIlIllI(this.cp.enableTightrope() ? 1 : 0) && llIlIlIIIllIlI(aa.e().contains(N.TIGHTROPE) ? 1 : 0)) {
            return lIlIIIIIllII[1];
        }
        ArrayList arrayList3 = new ArrayList();
        if (llIlIlIIIllIlI(this.cp.enableVespula() ? 1 : 0) && llIlIlIIIllIlI(aa.g() ? 1 : 0)) {
            arrayList3.add(N.VESPULA);
            "".length();
        }
        if (llIlIlIIIllIlI(this.cp.enableVasa() ? 1 : 0)) {
            arrayList3.add(N.VASA);
            "".length();
        }
        if (llIlIlIIIllIlI(this.cp.enableTekton() ? 1 : 0)) {
            arrayList3.add(N.TEKTON);
            "".length();
        }
        if (llIlIlIIIllIlI(this.cp.enableMuttadiles() ? 1 : 0)) {
            arrayList3.add(N.MUTTADILES);
            "".length();
        }
        if (llIlIlIIIllIlI(this.cp.enableGuardians() ? 1 : 0)) {
            arrayList3.add(N.GUARDIANS);
            "".length();
        }
        return (llIlIlIIIllIlI(arrayList3.containsAll(arrayList) ? 1 : 0) && llIlIlIIIllIll(arrayList.size(), lIlIIIIIllII[2])) ? lIlIIIIIllII[0] : lIlIIIIIllII[1];
    }

    private static boolean llIlIlIIIllIII(Object obj, Object obj2) {
        return obj != obj2;
    }
}
