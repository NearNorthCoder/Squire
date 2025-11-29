package s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.thieving.SquireThievingConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
@TaskDesc(name = "Stealing from stall")
/* renamed from: s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.J  reason: invalid package */
/* loaded from: squire-thieving-0.0.1.jar:s/r/i/t/g/n/-/u/h/i/q/i/e/v/e/J.class */
public class J extends Task {
    private final /* synthetic */ int[] aL;
    private static /* synthetic */ String[] lIIllIlIllIlI;
    private static /* synthetic */ int[] lIIllIlIllIll;
    private final /* synthetic */ SquireThievingConfig aK;

    private static boolean lIllIIIIllIIIlI(Object obj) {
        return obj != null;
    }

    private static void lIllIIIIlIlllII() {
        lIIllIlIllIll = new int[20];
        lIIllIlIllIll[0] = (105 ^ 23) ^ (108 ^ 21);
        lIIllIlIllIll[1] = (120 ^ 45) & ((71 ^ 18) ^ (-1));
        lIIllIlIllIll[2] = (-24700) & 30203;
        lIIllIlIllIll[3] = " ".length();
        lIIllIlIllIll[4] = (-97) & 2047;
        lIIllIlIllIll[5] = "  ".length();
        lIIllIlIllIll[6] = (-6161) & 8123;
        lIIllIlIllIll[7] = "   ".length();
        lIIllIlIllIll[8] = (-24605) & 26559;
        lIIllIlIllIll[9] = (43 ^ 81) ^ (34 ^ 92);
        lIIllIlIllIll[10] = (-21139) & 23258;
        lIIllIlIllIll[11] = (188 ^ 159) ^ (30 ^ 56);
        lIIllIlIllIll[12] = (((((79 + 48) - 30) + 52) + (238 ^ 197)) - (-(60 ^ 31))) + (167 ^ 179);
        lIIllIlIllIll[13] = 35 ^ 37;
        lIIllIlIllIll[14] = (-((-2562) & 24203)) & (-8961) & 32703;
        lIIllIlIllIll[15] = (((112 + 92) - 84) + 9) ^ (((111 + 101) - 155) + 85);
        lIIllIlIllIll[16] = (-((-3273) & 28363)) & (-45) & 25598;
        lIIllIlIllIll[17] = 147 ^ 187;
        lIIllIlIllIll[18] = (224 ^ 137) ^ (55 ^ 64);
        lIIllIlIllIll[19] = 118 ^ 126;
    }

    private static String lIllIIIIlIllIlI(String llllllllllllllIllllIIIIIIlIlIlII, String llllllllllllllIllllIIIIIIlIlIIll) {
        String llllllllllllllIllllIIIIIIlIlIlII2 = new String(Base64.getDecoder().decode(llllllllllllllIllllIIIIIIlIlIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllllIIIIIIlIlIIlI = new StringBuilder();
        char[] llllllllllllllIllllIIIIIIlIlIIIl = llllllllllllllIllllIIIIIIlIlIIll.toCharArray();
        int llllllllllllllIllllIIIIIIlIlIIII = lIIllIlIllIll[1];
        char[] charArray = llllllllllllllIllllIIIIIIlIlIlII2.toCharArray();
        int llllllllllllllIllllIIIIIIlIIlIIl = charArray.length;
        int i = lIIllIlIllIll[1];
        while (lIllIIIIllIIIll(i, llllllllllllllIllllIIIIIIlIIlIIl)) {
            llllllllllllllIllllIIIIIIlIlIIlI.append((char) (charArray[i] ^ llllllllllllllIllllIIIIIIlIlIIIl[llllllllllllllIllllIIIIIIlIlIIII % llllllllllllllIllllIIIIIIlIlIIIl.length]));
            "".length();
            llllllllllllllIllllIIIIIIlIlIIII++;
            i++;
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllllIIIIIIlIlIIlI);
    }

    private static boolean lIllIIIIllIIlII(int i, int i2) {
        return i == i2;
    }

    private static boolean lIllIIIIllIIIII(int i) {
        return i == 0;
    }

    private static void lIllIIIIlIllIll() {
        lIIllIlIllIlI = new String[lIIllIlIllIll[19]];
        lIIllIlIllIlI[lIIllIlIllIll[1]] = lIllIIIIlIllIII("L0a2BQynbbj3POBgq5BgxxJXXt+TguKJTPXea+yfg0pHDP0TJM+Klg==", "yFRHS");
        lIIllIlIllIlI[lIIllIlIllIll[3]] = lIllIIIIlIllIIl("WOCLiAhRMWU=", "pmVaU");
        lIIllIlIllIlI[lIIllIlIllIll[5]] = lIllIIIIlIllIlI("NSAbOR0=", "qRrWv");
        lIIllIlIllIlI[lIIllIlIllIll[7]] = lIllIIIIlIllIlI("FCYDYj93NQgkKD9nHjEqOys=", "WGmEK");
        lIIllIlIllIlI[lIIllIlIllIll[9]] = lIllIIIIlIllIII("jBEDXGXrC49hH/B4F/yEqQ==", "MKSJx");
        lIIllIlIllIlI[lIIllIlIllIll[11]] = lIllIIIIlIllIIl("Lw9q1AOMgqM=", "kwnYZ");
        lIIllIlIllIlI[lIIllIlIllIll[13]] = lIllIIIIlIllIIl("Pb64fvJc4K9XdKegmlPlhA==", "XRoww");
        lIIllIlIllIlI[lIIllIlIllIll[0]] = lIllIIIIlIllIII("PmIqzvACqPCf8IkieeGhxg==", "UsZKe");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v108, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v110, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v112, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v114, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v116, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v61, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v65, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v72, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v77, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v91, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v93, types: [boolean] */
    public boolean run() {
        TileObject nearest;
        if (lIllIIIIlIlllIl(this.aK.method(), EnumC0001b.STALLS)) {
            return lIIllIlIllIll[1];
        }
        Player local = Players.getLocal();
        if (!lIllIIIIlIllllI(local) && !lIllIIIIlIlllll(Inventory.isFull() ? 1 : 0)) {
            EnumC0007h stallTarget = this.aK.stallTarget();
            WorldPoint z = stallTarget.z();
            List all = Players.getAll(player -> {
                if (lIllIIIIllIIIlI(player) && lIllIIIIlIlllIl(player, local)) {
                    WorldPoint worldLocation = player.getWorldLocation();
                    WorldArea[] worldAreaArr = new WorldArea[lIIllIlIllIll[3]];
                    worldAreaArr[lIIllIlIllIll[1]] = stallTarget.p();
                    if (lIllIIIIlIlllll(worldLocation.isInArea(worldAreaArr) ? 1 : 0)) {
                        ?? r0 = lIIllIlIllIll[3];
                        "".length();
                        return (-" ".length()) >= ((160 ^ 198) ^ (107 ^ 9)) ? ((119 ^ 30) ^ (217 ^ 161)) & (((221 ^ 157) ^ (221 ^ 140)) ^ (-" ".length())) : r0;
                    }
                }
                return lIIllIlIllIll[1];
            });
            if (lIllIIIIlIlllll(stallTarget.equals(EnumC0007h.FRUIT_HOSIDIUS) ? 1 : 0) && lIllIIIIllIIIII(all.isEmpty() ? 1 : 0)) {
                Log.info(lIIllIlIllIlI[lIIllIlIllIll[1]]);
                if (lIllIIIIllIIIII(Worlds.isHopperOpen() ? 1 : 0)) {
                    Worlds.openHopper();
                    return lIIllIlIllIll[3];
                }
                Worlds.hopTo(Worlds.getRandom(world -> {
                    if (lIllIIIIlIlllll(world.isNormal() ? 1 : 0) && lIllIIIIlIlllll(world.isMembers() ? 1 : 0) && lIllIIIIllIIlII(world.getLocation(), Worlds.getCurrentWorld().getLocation())) {
                        ?? r0 = lIIllIlIllIll[3];
                        "".length();
                        return "  ".length() < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIIllIlIllIll[1];
                }));
                return lIIllIlIllIll[3];
            }
            if (lIllIIIIlIlllll(stallTarget.A() ? 1 : 0)) {
                nearest = TileObjects.getNearest(tileObject -> {
                    String[] strArr = new String[lIIllIlIllIll[3]];
                    strArr[lIIllIlIllIll[1]] = lIIllIlIllIlI[lIIllIlIllIll[0]];
                    if (lIllIIIIlIlllll(tileObject.hasAction(strArr) ? 1 : 0) && lIllIIIIlIlllll(tileObject.getName().equals(stallTarget.v()) ? 1 : 0) && lIllIIIIllIIIll(tileObject.distanceTo(z), lIIllIlIllIll[7])) {
                        ?? r0 = lIIllIlIllIll[3];
                        "".length();
                        return ((117 ^ 120) & ((207 ^ 194) ^ (-1))) > "  ".length() ? (!true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIIllIlIllIll[1];
                });
                "".length();
                if ((((((48 + 164) - 107) + 81) ^ (((110 + 137) - 110) + 25)) & (((137 ^ 154) ^ (80 ^ 91)) ^ (-" ".length()))) != 0) {
                    return ((((13 + 174) - 100) + 151) ^ (((188 + 93) - 266) + 181)) & (((((116 + 75) - 137) + 110) ^ (((94 + 98) - 52) + 2)) ^ (-" ".length()));
                }
            } else {
                nearest = TileObjects.getNearest(tileObject2 -> {
                    String[] strArr = new String[lIIllIlIllIll[3]];
                    strArr[lIIllIlIllIll[1]] = lIIllIlIllIlI[lIIllIlIllIll[13]];
                    if (lIllIIIIlIlllll(tileObject2.hasAction(strArr) ? 1 : 0) && lIllIIIIlIlllll(tileObject2.getName().equals(stallTarget.v()) ? 1 : 0)) {
                        ?? r0 = lIIllIlIllIll[3];
                        "".length();
                        return ((98 ^ 40) & ((213 ^ 159) ^ (-1))) > "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIIllIlIllIll[1];
                });
            }
            TileObject tileObject3 = nearest;
            if (lIllIIIIlIllllI(tileObject3)) {
                return lIIllIlIllIll[1];
            }
            if (lIllIIIIlIlllll(this.aK.dropFruit() ? 1 : 0) && lIllIIIIlIlllll(Inventory.contains(this.aL) ? 1 : 0) && lIllIIIIlIlllll(local.isMoving() ? 1 : 0)) {
                Inventory.dropAll(this.aL);
                "".length();
                return lIIllIlIllIll[3];
            }
            if (lIllIIIIllIIIIl(Movement.getRunEnergy(), lIIllIlIllIll[15]) && lIllIIIIllIIIII(Movement.isRunEnabled() ? 1 : 0)) {
                Movement.toggleRun();
            }
            int[] iArr = new int[lIIllIlIllIll[3]];
            iArr[lIIllIlIllIll[1]] = lIIllIlIllIll[16];
            Item first = Inventory.getFirst(iArr);
            if (lIllIIIIllIIIlI(first) && lIllIIIIllIIIll(Movement.getRunEnergy(), lIIllIlIllIll[17])) {
                first.interact(lIIllIlIllIlI[lIIllIlIllIll[3]]);
                return lIIllIlIllIll[3];
            }
            Item first2 = Inventory.getFirst(item -> {
                return item.getName().startsWith(lIIllIlIllIlI[lIIllIlIllIll[11]]);
            });
            if (lIllIIIIllIIIlI(first2) && lIllIIIIllIIIII(Movement.isStaminaBoosted() ? 1 : 0) && lIllIIIIllIIIll(Movement.getRunEnergy(), lIIllIlIllIll[18])) {
                first2.interact(lIIllIlIllIlI[lIIllIlIllIll[5]]);
                return lIIllIlIllIll[3];
            } else if (lIllIIIIllIIIII(Reachable.isInteractable(tileObject3) ? 1 : 0)) {
                Log.info(lIIllIlIllIlI[lIIllIlIllIll[7]]);
                return lIIllIlIllIll[1];
            } else if (!lIllIIIIlIlllll(stallTarget.A() ? 1 : 0) || !lIllIIIIllIIIII(local.getWorldLocation().equals(z) ? 1 : 0)) {
                tileObject3.interact(lIIllIlIllIlI[lIIllIlIllIll[9]]);
                return lIIllIlIllIll[3];
            } else {
                Movement.walkTo(z);
                "".length();
                return lIIllIlIllIll[3];
            }
        }
        return lIIllIlIllIll[1];
    }

    private static boolean lIllIIIIlIllllI(Object obj) {
        return obj == null;
    }

    @Inject
    public J(SquireThievingConfig squireThievingConfig) {
        int[] iArr = new int[lIIllIlIllIll[0]];
        iArr[lIIllIlIllIll[1]] = lIIllIlIllIll[2];
        iArr[lIIllIlIllIll[3]] = lIIllIlIllIll[4];
        iArr[lIIllIlIllIll[5]] = lIIllIlIllIll[6];
        iArr[lIIllIlIllIll[7]] = lIIllIlIllIll[8];
        iArr[lIIllIlIllIll[9]] = lIIllIlIllIll[10];
        iArr[lIIllIlIllIll[11]] = lIIllIlIllIll[12];
        iArr[lIIllIlIllIll[13]] = lIIllIlIllIll[14];
        this.aL = iArr;
        this.aK = squireThievingConfig;
    }

    private static String lIllIIIIlIllIIl(String llllllllllllllIllllIIIIIIllIIlII, String llllllllllllllIllllIIIIIIllIIIll) {
        try {
            SecretKeySpec llllllllllllllIllllIIIIIIllIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIIIIIllIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIllIlIllIll[5], llllllllllllllIllllIIIIIIllIIlll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIIIIIllIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIIIIIIllIIlIl) {
            llllllllllllllIllllIIIIIIllIIlIl.printStackTrace();
            return null;
        }
    }

    private static String lIllIIIIlIllIII(String llllllllllllllIllllIIIIIIlllIIIl, String llllllllllllllIllllIIIIIIlllIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIIIIIlllIIII.getBytes(StandardCharsets.UTF_8)), lIIllIlIllIll[19]), "DES");
            Cipher llllllllllllllIllllIIIIIIlllIIll = Cipher.getInstance("DES");
            llllllllllllllIllllIIIIIIlllIIll.init(lIIllIlIllIll[5], secretKeySpec);
            return new String(llllllllllllllIllllIIIIIIlllIIll.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIIIIIlllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIIIIIIllIllIl) {
            llllllllllllllIllllIIIIIIllIllIl.printStackTrace();
            return null;
        }
    }

    static {
        lIllIIIIlIlllII();
        lIllIIIIlIllIll();
    }

    private static boolean lIllIIIIlIlllIl(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean lIllIIIIllIIIIl(int i, int i2) {
        return i > i2;
    }

    private static boolean lIllIIIIllIIIll(int i, int i2) {
        return i < i2;
    }

    private static boolean lIllIIIIlIlllll(int i) {
        return i != 0;
    }
}
