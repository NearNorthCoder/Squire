package s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.thieving.SquireThieving;
import gg.squire.thieving.SquireThievingConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Returning to the blackjack house", priority = 2, blocking = true)
/* renamed from: s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.q  reason: invalid package */
/* loaded from: squire-thieving-0.0.1.jar:s/r/i/t/g/n/-/u/h/i/q/i/e/v/e/q.class */
public class q extends Task {
    private static /* synthetic */ String[] lIIllIllIIIII;
    private final /* synthetic */ SquireThieving Y;
    private final /* synthetic */ SquireThievingConfig Z;
    private static /* synthetic */ int[] lIIllIllIIIIl;

    static {
        lIllIIIIlllllll();
        lIllIIIIllllllI();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v103, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v105, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v107, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v109, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v60, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v68, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v79, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v98, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    public boolean run() {
        int i;
        if (lIllIIIlIIIIIII(this.Z.method(), EnumC0001b.BLACK_JACK)) {
            return lIIllIllIIIIl[0];
        }
        Player local = Players.getLocal();
        if (!lIllIIIlIIIIIIl(local) && !lIllIIIlIIIIIlI(this.Y.i() ? 1 : 0) && !lIllIIIlIIIIIll(Inventory.getCount(item -> {
            return item.hasAction(C0010k.z);
        }))) {
            WorldPoint worldLocation = local.getWorldLocation();
            EnumC0002c t = this.Y.b().t();
            EnumC0002c b = EnumC0002c.b(worldLocation);
            if (lIllIIIlIIIIlII(b) && lIllIIIlIIIIIII(t, b)) {
                Log.info(lIIllIllIIIII[lIIllIllIIIIl[0]]);
                if (lIllIIIlIIIIlII(this.Y.a(b, (boolean) lIIllIllIIIIl[1]))) {
                    return this.Y.a(local, (boolean) lIIllIllIIIIl[1]);
                }
                NPC nearest = NPCs.getNearest(npc -> {
                    if (lIllIIIlIIIIlII(npc)) {
                        WorldPoint worldLocation2 = npc.getWorldLocation();
                        WorldArea[] worldAreaArr = new WorldArea[lIIllIllIIIIl[1]];
                        worldAreaArr[lIIllIllIIIIl[0]] = b.p();
                        if (lIllIIIlIIIIIll(worldLocation2.isInArea(worldAreaArr) ? 1 : 0)) {
                            String[] strArr = new String[lIIllIllIIIIl[1]];
                            strArr[lIIllIllIIIIl[0]] = lIIllIllIIIII[lIIllIllIIIIl[12]];
                            if (lIllIIIlIIIIIlI(npc.hasAction(strArr) ? 1 : 0)) {
                                ?? r0 = lIIllIllIIIIl[1];
                                "".length();
                                return ((41 ^ 59) & ((137 ^ 155) ^ (-1))) > ((122 ^ 65) & ((64 ^ 123) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                        }
                    }
                    return lIIllIllIIIIl[0];
                });
                Log.info(lIIllIllIIIII[lIIllIllIIIIl[1]]);
                if (lIllIIIlIIIIlII(nearest)) {
                    nearest.interact(lIIllIllIIIII[lIIllIllIIIIl[2]]);
                    return lIIllIllIIIIl[0];
                }
            }
            if (lIllIIIlIIIIlIl(NPCs.getAll(npc2 -> {
                if (lIllIIIlIIIIlII(npc2) && lIllIIIlIIIIIlI(npc2.getName().equals(this.Y.b().v()) ? 1 : 0)) {
                    WorldPoint worldLocation2 = npc2.getWorldLocation();
                    WorldArea[] worldAreaArr = new WorldArea[lIIllIllIIIIl[1]];
                    worldAreaArr[lIIllIllIIIIl[0]] = t.p();
                    if (lIllIIIlIIIIIlI(worldLocation2.isInArea(worldAreaArr) ? 1 : 0)) {
                        ?? r0 = lIIllIllIIIIl[1];
                        "".length();
                        return (-"   ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                }
                return lIIllIllIIIIl[0];
            }).size(), lIIllIllIIIIl[1])) {
                Log.info(lIIllIllIIIII[lIIllIllIIIIl[3]]);
                return lIIllIllIIIIl[0];
            }
            if (lIllIIIlIIIIIll(Movement.isRunEnabled() ? 1 : 0) && lIllIIIlIIIIlIl(Movement.getRunEnergy(), lIIllIllIIIIl[4])) {
                Movement.toggleRun();
            }
            WorldArea[] worldAreaArr = new WorldArea[lIIllIllIIIIl[1]];
            worldAreaArr[lIIllIllIIIIl[0]] = t.p();
            if (lIllIIIlIIIIIll(worldLocation.isInArea(worldAreaArr) ? 1 : 0)) {
                if (lIllIIIlIIIIlII(this.Y.a(t, (boolean) lIIllIllIIIIl[1]))) {
                    return this.Y.a(local, (boolean) lIIllIllIIIIl[1]);
                }
                if (lIllIIIlIIIIlIl(worldLocation.distanceTo(t.p().getRandom()), lIIllIllIIIIl[5])) {
                    i = lIIllIllIIIIl[1];
                    "".length();
                    if ("   ".length() != "   ".length()) {
                        return (true ^ true) & ((true ^ true) ^ true);
                    }
                } else {
                    i = lIIllIllIIIIl[0];
                }
                if (lIllIIIlIIIIIlI(i)) {
                    String str = lIIllIllIIIII[lIIllIllIIIIl[6]];
                    Object[] objArr = new Object[lIIllIllIIIIl[1]];
                    objArr[lIIllIllIIIIl[0]] = t;
                    Log.info(str, objArr);
                    Movement.walkTo(t.p().getRandom());
                    "".length();
                    return lIIllIllIIIIl[1];
                }
                TileObject nearest2 = TileObjects.getNearest(tileObject -> {
                    WorldPoint worldLocation2 = tileObject.getWorldLocation();
                    WorldArea[] worldAreaArr2 = new WorldArea[lIIllIllIIIIl[1]];
                    worldAreaArr2[lIIllIllIIIIl[0]] = t.p();
                    if (lIllIIIlIIIIIlI(worldLocation2.isInArea(worldAreaArr2) ? 1 : 0)) {
                        String[] strArr = new String[lIIllIllIIIIl[1]];
                        strArr[lIIllIllIIIIl[0]] = lIIllIllIIIII[lIIllIllIIIIl[10]];
                        if (lIllIIIlIIIIIll(tileObject.hasAction(strArr) ? 1 : 0)) {
                            String[] strArr2 = new String[lIIllIllIIIIl[1]];
                            strArr2[lIIllIllIIIIl[0]] = lIIllIllIIIII[lIIllIllIIIIl[11]];
                        }
                        ?? r0 = lIIllIllIIIIl[1];
                        "".length();
                        return (-" ".length()) > (-" ".length()) ? ((214 ^ 172) ^ (135 ^ 176)) & (((186 ^ 196) ^ (100 ^ 87)) ^ (-" ".length())) : r0;
                    }
                    return lIIllIllIIIIl[0];
                });
                if (lIllIIIlIIIIlII(nearest2)) {
                    Log.info(lIIllIllIIIII[lIIllIllIIIIl[7]]);
                    String[] strArr = new String[lIIllIllIIIIl[2]];
                    strArr[lIIllIllIIIIl[0]] = lIIllIllIIIII[lIIllIllIIIIl[8]];
                    strArr[lIIllIllIIIIl[1]] = lIIllIllIIIII[lIIllIllIIIIl[9]];
                    nearest2.interact(strArr);
                    return lIIllIllIIIIl[1];
                }
            }
            return lIIllIllIIIIl[0];
        }
        return lIIllIllIIIIl[0];
    }

    private static void lIllIIIIlllllll() {
        lIIllIllIIIIl = new int[14];
        lIIllIllIIIIl[0] = ((20 ^ 98) ^ (27 ^ 115)) & (((54 ^ 112) ^ (7 ^ 95)) ^ (-" ".length()));
        lIIllIllIIIIl[1] = " ".length();
        lIIllIllIIIIl[2] = "  ".length();
        lIIllIllIIIIl[3] = "   ".length();
        lIIllIllIIIIl[4] = 2 ^ 28;
        lIIllIllIIIIl[5] = (((131 + 88) - 204) + 117) ^ (((5 + 93) - (-35)) + 6);
        lIIllIllIIIIl[6] = (94 ^ 70) ^ (72 ^ 84);
        lIIllIllIIIIl[7] = (((10 + 80) - 73) + 110) ^ (184 ^ 194);
        lIIllIllIIIIl[8] = (((56 + 38) - 80) + 166) ^ (((134 + 75) - 151) + 120);
        lIIllIllIIIIl[9] = 126 ^ 121;
        lIIllIllIIIIl[10] = 171 ^ 163;
        lIIllIllIIIIl[11] = (117 ^ 64) ^ (111 ^ 83);
        lIIllIllIIIIl[12] = 55 ^ 61;
        lIIllIllIIIIl[13] = (112 ^ 72) ^ (170 ^ 153);
    }

    private static String lIllIIIIlllllII(String llllllllllllllIlllIlllllIllIIIII, String llllllllllllllIlllIlllllIlIlllll) {
        try {
            SecretKeySpec llllllllllllllIlllIlllllIllIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIlllllIlIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIllIllIIIIl[2], llllllllllllllIlllIlllllIllIIIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIlllllIllIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIlllllIllIIIIl) {
            llllllllllllllIlllIlllllIllIIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIIlIIIIIll(int i) {
        return i == 0;
    }

    private static String lIllIIIIlllllIl(String llllllllllllllIlllIlllllIlIlIIII, String llllllllllllllIlllIlllllIlIIllll) {
        String llllllllllllllIlllIlllllIlIlIIII2 = new String(Base64.getDecoder().decode(llllllllllllllIlllIlllllIlIlIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIlllIlllllIlIIllll.toCharArray();
        int llllllllllllllIlllIlllllIlIIllII = lIIllIllIIIIl[0];
        char[] charArray2 = llllllllllllllIlllIlllllIlIlIIII2.toCharArray();
        int length = charArray2.length;
        int i = lIIllIllIIIIl[0];
        while (lIllIIIlIIIIllI(i, length)) {
            char llllllllllllllIlllIlllllIlIlIIIl = charArray2[i];
            sb.append((char) (llllllllllllllIlllIlllllIlIlIIIl ^ charArray[llllllllllllllIlllIlllllIlIIllII % charArray.length]));
            "".length();
            llllllllllllllIlllIlllllIlIIllII++;
            i++;
            "".length();
            if (" ".length() > " ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIllIIIlIIIIIlI(int i) {
        return i != 0;
    }

    @Inject
    public q(SquireThieving squireThieving, SquireThievingConfig squireThievingConfig) {
        this.Y = squireThieving;
        this.Z = squireThievingConfig;
    }

    private static boolean lIllIIIlIIIIlII(Object obj) {
        return obj != null;
    }

    private static boolean lIllIIIlIIIIllI(int i, int i2) {
        return i < i2;
    }

    private static boolean lIllIIIlIIIIIII(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean lIllIIIlIIIIlIl(int i, int i2) {
        return i > i2;
    }

    private static void lIllIIIIllllllI() {
        lIIllIllIIIII = new String[lIIllIllIIIIl[13]];
        lIIllIllIIIII[lIIllIllIIIIl[0]] = lIllIIIIllllIll("zm+QtIfFqJRxtrFisBhV95/BMvlLlT3chmLAD+MYD+VOK66yz9GO0ACTEkublX6BI9P4fRX0fZYxhFYtbZaPrg==", "NtzSf");
        lIIllIllIIIII[lIIllIllIIIIl[1]] = lIllIIIIllllIll("kf1bw5C6Ze0fi2jNqfZsIHIAGVawvgqf+RTV8cVn3IGnA8l11qKZpcYFkBXw9MaxtM5rwnOj7os=", "beAhZ");
        lIIllIllIIIII[lIIllIllIIIIl[2]] = lIllIIIIlllllII("roGYaitm1hs=", "DemTR");
        lIIllIllIIIII[lIIllIllIIIIl[3]] = lIllIIIIlllllII("l7BZcgNfB+GoBUkXxXZMS7LiMBkGHBly6adMjhB+Are0BJo1q2NZl4H4gFig1cjdXDzFVlElnT7ngsHXc1MhAXUPQH+dcsfz", "JqgMi");
        lIIllIllIIIII[lIIllIllIIIIl[6]] = lIllIIIIlllllII("bADRWwUJmWXmAtQrA+RUR+stpSh6jNGLCPjkvFqsV/nS0hOrFbmzRxI5v2Vbm/yWe1vmJ84czYI=", "Cstov");
        lIIllIllIIIII[lIIllIllIIIIl[7]] = lIllIIIIlllllII("TTWsKOr9nzv9I0tzce+IHVKYw6Et4qfLOFOWAxB71OOLIspaR+j5/w==", "OUiWv");
        lIIllIllIIIII[lIIllIllIIIIl[8]] = lIllIIIIlllllIl("MhIFEToJ", "awdcY");
        lIIllIllIIIII[lIIllIllIIIIl[9]] = lIllIIIIlllllIl("NC06DAVaNCM=", "wASag");
        lIIllIllIIIII[lIIllIllIIIIl[10]] = lIllIIIIllllIll("Fvkf6GzS3WA=", "aJlYy");
        lIIllIllIIIII[lIIllIllIIIIl[11]] = lIllIIIIlllllIl("AAs6FwtuEiM=", "CgSzi");
        lIIllIllIIIII[lIIllIllIIIIl[12]] = lIllIIIIllllIll("HRvBRcWjxcU=", "CTYJs");
    }

    private static boolean lIllIIIlIIIIIIl(Object obj) {
        return obj == null;
    }

    private static String lIllIIIIllllIll(String llllllllllllllIlllIlllllIIlllIll, String llllllllllllllIlllIlllllIIlllIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIlllllIIlllIlI.getBytes(StandardCharsets.UTF_8)), lIIllIllIIIIl[10]), "DES");
            Cipher llllllllllllllIlllIlllllIIllllIl = Cipher.getInstance("DES");
            llllllllllllllIlllIlllllIIllllIl.init(lIIllIllIIIIl[2], secretKeySpec);
            return new String(llllllllllllllIlllIlllllIIllllIl.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIlllllIIlllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIlllllIIllllII) {
            llllllllllllllIlllIlllllIIllllII.printStackTrace();
            return null;
        }
    }
}
