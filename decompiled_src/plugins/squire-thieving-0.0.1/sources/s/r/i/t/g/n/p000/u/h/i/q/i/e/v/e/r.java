package s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.thieving.SquireThieving;
import gg.squire.thieving.SquireThievingConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.GameState;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.LocalCollisionMap;
import net.unethicalite.api.movement.pathfinder.Pathfinder;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.client.Static;
import net.unethicalite.client.managers.RegionManager;
@TaskDesc(name = "Unnoting for extra food", priority = 6, blocking = true)
/* renamed from: s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.r  reason: invalid package */
/* loaded from: squire-thieving-0.0.1.jar:s/r/i/t/g/n/-/u/h/i/q/i/e/v/e/r.class */
public class r extends Task {
    private final /* synthetic */ SquireThievingConfig ab;
    private static /* synthetic */ String[] lIIlllIIIlIlI;
    private final /* synthetic */ SquireThieving ac;
    private static /* synthetic */ int[] lIIlllIIIlIll;
    private static final /* synthetic */ WorldPoint aa;

    private static boolean lIllIIlIlIIlIlI(int i) {
        return i == 0;
    }

    private static boolean lIllIIlIlIlIIIl(int i, int i2) {
        return i != i2;
    }

    private static void lIllIIlIlIIIlll() {
        lIIlllIIIlIlI = new String[lIIlllIIIlIll[7]];
        lIIlllIIIlIlI[lIIlllIIIlIll[0]] = lIllIIlIlIIIlII("p4+Yo9Sc/rtCoCK0i/4ZCQ==", "IDsLz");
        lIIlllIIIlIlI[lIIlllIIIlIll[1]] = lIllIIlIlIIIlIl("Hwg3BA==", "PxRje");
        lIIlllIIIlIlI[lIIlllIIIlIll[3]] = lIllIIlIlIIIllI("1mApbXHlhr0=", "lptXE");
        lIIlllIIIlIlI[lIIlllIIIlIll[4]] = lIllIIlIlIIIlIl("KDQTGxYCLw==", "kAaow");
    }

    private static String lIllIIlIlIIIlIl(String llllllllllllllIlllIllIIlIllllIII, String llllllllllllllIlllIllIIlIlllIlll) {
        String llllllllllllllIlllIllIIlIllllIII2 = new String(Base64.getDecoder().decode(llllllllllllllIlllIllIIlIllllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIllIIlIlllIllI = new StringBuilder();
        char[] charArray = llllllllllllllIlllIllIIlIlllIlll.toCharArray();
        int llllllllllllllIlllIllIIlIlllIlII = lIIlllIIIlIll[0];
        char[] charArray2 = llllllllllllllIlllIllIIlIllllIII2.toCharArray();
        int length = charArray2.length;
        int i = lIIlllIIIlIll[0];
        while (lIllIIlIlIlIIlI(i, length)) {
            llllllllllllllIlllIllIIlIlllIllI.append((char) (charArray2[i] ^ charArray[llllllllllllllIlllIllIIlIlllIlII % charArray.length]));
            "".length();
            llllllllllllllIlllIllIIlIlllIlII++;
            i++;
            "".length();
            if ("  ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIlllIllIIlIlllIllI);
    }

    static {
        lIllIIlIlIIlIII();
        lIllIIlIlIIIlll();
        aa = new WorldPoint(lIIlllIIIlIll[5], lIIlllIIIlIll[6], lIIlllIIIlIll[0]);
    }

    private static String lIllIIlIlIIIllI(String llllllllllllllIlllIllIIlIllIIIIl, String llllllllllllllIlllIllIIlIllIIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllIIlIllIIIlI.getBytes(StandardCharsets.UTF_8)), lIIlllIIIlIll[8]), "DES");
            Cipher llllllllllllllIlllIllIIlIllIIlIl = Cipher.getInstance("DES");
            llllllllllllllIlllIllIIlIllIIlIl.init(lIIlllIIIlIll[3], secretKeySpec);
            return new String(llllllllllllllIlllIllIIlIllIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllIIlIllIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIllIIlIllIIlII) {
            llllllllllllllIlllIllIIlIllIIlII.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    private boolean G() {
        TileObject nearest = TileObjects.getNearest(tileObject -> {
            return lIIlllIIIlIlI[lIIlllIIIlIll[4]].equals(tileObject.getName());
        });
        if (lIllIIlIlIIllII(nearest)) {
            String str = lIIlllIIIlIlI[lIIlllIIIlIll[1]];
            if (lIllIIlIlIIllll(nearest.hasAction((v1) -> {
                return r1.equals(v1);
            }) ? 1 : 0)) {
                nearest.interact(lIIlllIIIlIlI[lIIlllIIIlIll[3]]);
                return lIIlllIIIlIll[1];
            }
        }
        return lIIlllIIIlIll[0];
    }

    private static boolean lIllIIlIlIIlIll(int i) {
        return i > 0;
    }

    @Inject
    public r(SquireThievingConfig squireThievingConfig, SquireThieving squireThieving) {
        this.ab = squireThievingConfig;
        this.ac = squireThieving;
    }

    private static boolean lIllIIlIlIlIIII(Object obj) {
        return obj == null;
    }

    private static String lIllIIlIlIIIlII(String llllllllllllllIlllIllIIllIIIlIII, String llllllllllllllIlllIllIIllIIIIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllIIllIIIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIllIIllIIIlIlI = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIllIIllIIIlIlI.init(lIIlllIIIlIll[3], secretKeySpec);
            return new String(llllllllllllllIlllIllIIllIIIlIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllIIllIIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIllIIllIIIlIIl) {
            llllllllllllllIlllIllIIllIIIlIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIlIlIIllIl(int i, int i2) {
        return i == i2;
    }

    private static boolean lIllIIlIlIIllll(int i) {
        return i != 0;
    }

    private static void lIllIIlIlIIlIII() {
        lIIlllIIIlIll = new int[9];
        lIIlllIIIlIll[0] = ((96 ^ 110) ^ (169 ^ 133)) & (((31 ^ 35) ^ (179 ^ 173)) ^ (-" ".length()));
        lIIlllIIIlIll[1] = " ".length();
        lIIlllIIIlIll[2] = (-((-3587) & 28339)) & (-6145) & 32511;
        lIIlllIIIlIll[3] = "  ".length();
        lIIlllIIIlIll[4] = "   ".length();
        lIIlllIIIlIll[5] = (-4169) & 7528;
        lIIlllIIIlIll[6] = (-13331) & 16319;
        lIIlllIIIlIll[7] = 127 ^ 123;
        lIIlllIIIlIll[8] = (168 ^ 149) ^ (96 ^ 85);
    }

    private static boolean lIllIIlIlIIlllI(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIllIIlIlIlIIlI(int i, int i2) {
        return i < i2;
    }

    private static boolean lIllIIlIlIIllII(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    private boolean F() {
        return lIIlllIIIlIll[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v54, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v60, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v70, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v75, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v81, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v86, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v88, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v7, types: [boolean] */
    public boolean run() {
        if (lIllIIlIlIIlIIl(Game.getState(), GameState.LOGGED_IN) && lIllIIlIlIIlIIl(this.ab.method(), EnumC0001b.BLACK_JACK) && !lIllIIlIlIIlIlI(this.ab.unNoteFood() ? 1 : 0)) {
            Player local = Players.getLocal();
            if (lIllIIlIlIIlIll(Inventory.getCount(item -> {
                return item.hasAction(C0010k.z);
            }))) {
                return lIIlllIIIlIll[0];
            }
            NPC a = this.ac.b().a(this.ac.b());
            if (lIllIIlIlIIllII(a) && lIllIIlIlIIlIIl(a.getInteracting(), local)) {
                return lIIlllIIIlIll[0];
            }
            int e = this.ac.e();
            if (lIllIIlIlIIllIl(Worlds.getCurrentId(), e)) {
                Worlds.hopTo(Worlds.getRandom(world -> {
                    if (lIllIIlIlIIllll(world.isNormal() ? 1 : 0) && lIllIIlIlIIllll(world.isMembers() ? 1 : 0) && lIllIIlIlIlIIIl(world.getId(), e)) {
                        ?? r0 = lIIlllIIIlIll[1];
                        "".length();
                        return "  ".length() <= (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIIlllIIIlIll[0];
                }));
                return lIIlllIIIlIll[1];
            }
            Item first = Inventory.getFirst((v0) -> {
                return v0.isNoted();
            });
            if (!lIllIIlIlIIllII(first) || lIllIIlIlIIlllI(first.getQuantity(), Inventory.getFreeSlots())) {
                return F();
            }
            if (lIllIIlIlIIllll(this.ac.b().t().p().contains(Players.getLocal()) ? 1 : 0) && lIllIIlIlIIllll(G() ? 1 : 0)) {
                return lIIlllIIIlIll[1];
            }
            int[] iArr = new int[lIIlllIIIlIll[1]];
            iArr[lIIlllIIIlIll[0]] = lIIlllIIIlIll[2];
            NPC nearest = NPCs.getNearest(iArr);
            if (lIllIIlIlIlIIII(nearest) && lIllIIlIlIIlIlI(Movement.isWalking() ? 1 : 0)) {
                Map buildTransportLinks = Walker.buildTransportLinks();
                Walker.walkAlong(new Pathfinder(new LocalCollisionMap(Static.getGlobalCollisionMap(), (boolean) lIIlllIIIlIll[0]), buildTransportLinks, List.of(Players.getLocal().getWorldLocation()), aa.toWorldArea(), RegionManager.avoidWilderness()).find(), buildTransportLinks);
                "".length();
                return lIIlllIIIlIll[1];
            } else if (!lIllIIlIlIIllll(Dialog.isViewingOptions() ? 1 : 0)) {
                first.useOn(nearest);
                return lIIlllIIIlIll[1];
            } else {
                String[] strArr = new String[lIIlllIIIlIll[1]];
                strArr[lIIlllIIIlIll[0]] = lIIlllIIIlIlI[lIIlllIIIlIll[0]];
                Dialog.chooseOption(strArr);
                "".length();
                return lIIlllIIIlIll[1];
            }
        }
        return lIIlllIIIlIll[0];
    }

    private static boolean lIllIIlIlIIlIIl(Object obj, Object obj2) {
        return obj == obj2;
    }
}
