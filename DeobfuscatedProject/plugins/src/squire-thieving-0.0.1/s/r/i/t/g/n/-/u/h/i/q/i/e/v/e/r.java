/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Actor
 *  net.runelite.api.GameState
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.World
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.game.Worlds
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.CollisionMap
 *  net.unethicalite.api.movement.pathfinder.GlobalCollisionMap
 *  net.unethicalite.api.movement.pathfinder.LocalCollisionMap
 *  net.unethicalite.api.movement.pathfinder.Pathfinder
 *  net.unethicalite.api.movement.pathfinder.Walker
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.client.Static
 *  net.unethicalite.client.managers.RegionManager
 */
package s.r.i.t.g.n.-.u.h.i.q.i.e.v.e;

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
import net.runelite.api.Actor;
import net.runelite.api.GameState;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.World;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.CollisionMap;
import net.unethicalite.api.movement.pathfinder.GlobalCollisionMap;
import net.unethicalite.api.movement.pathfinder.LocalCollisionMap;
import net.unethicalite.api.movement.pathfinder.Pathfinder;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.client.Static;
import net.unethicalite.client.managers.RegionManager;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.b;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.k;

@TaskDesc(name="Unnoting for extra food", priority=6, blocking=true)
public class r
extends Task {
    private final /* synthetic */ SquireThievingConfig ab;
    private static /* synthetic */ String[] lIIlllIIIlIlI;
    private final /* synthetic */ SquireThieving ac;
    private static /* synthetic */ int[] lIIlllIIIlIll;
    private static final /* synthetic */ WorldPoint aa;

    private static boolean lIllIIlIlIIlIlI(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIIlIlIlIIIl(int n2, int n3) {
        return n2 != n3;
    }

    private static void lIllIIlIlIIIlll() {
        lIIlllIIIlIlI = new String[lIIlllIIIlIll[7]];
        r.lIIlllIIIlIlI[r.lIIlllIIIlIll[0]] = r.lIllIIlIlIIIlII("p4+Yo9Sc/rtCoCK0i/4ZCQ==", "IDsLz");
        r.lIIlllIIIlIlI[r.lIIlllIIIlIll[1]] = r.lIllIIlIlIIIlIl("Hwg3BA==", "PxRje");
        r.lIIlllIIIlIlI[r.lIIlllIIIlIll[3]] = r.lIllIIlIlIIIllI("1mApbXHlhr0=", "lptXE");
        r.lIIlllIIIlIlI[r.lIIlllIIIlIll[4]] = r.lIllIIlIlIIIlIl("KDQTGxYCLw==", "kAaow");
    }

    private static String lIllIIlIlIIIlIl(String llllllllllllllIlllIllIIlIlllIIll, String llllllllllllllIlllIllIIlIlllIIlI) {
        llllllllllllllIlllIllIIlIlllIIll = new String(Base64.getDecoder().decode(llllllllllllllIlllIllIIlIlllIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIllIIlIlllIllI = new StringBuilder();
        char[] llllllllllllllIlllIllIIlIlllIlIl = llllllllllllllIlllIllIIlIlllIIlI.toCharArray();
        int llllllllllllllIlllIllIIlIlllIlII = lIIlllIIIlIll[0];
        char[] llllllllllllllIlllIllIIlIllIlllI = llllllllllllllIlllIllIIlIlllIIll.toCharArray();
        int llllllllllllllIlllIllIIlIllIllIl = llllllllllllllIlllIllIIlIllIlllI.length;
        int llllllllllllllIlllIllIIlIllIllII = lIIlllIIIlIll[0];
        while (r.lIllIIlIlIlIIlI(llllllllllllllIlllIllIIlIllIllII, llllllllllllllIlllIllIIlIllIllIl)) {
            char llllllllllllllIlllIllIIlIllllIIl = llllllllllllllIlllIllIIlIllIlllI[llllllllllllllIlllIllIIlIllIllII];
            llllllllllllllIlllIllIIlIlllIllI.append((char)(llllllllllllllIlllIllIIlIllllIIl ^ llllllllllllllIlllIllIIlIlllIlIl[llllllllllllllIlllIllIIlIlllIlII % llllllllllllllIlllIllIIlIlllIlIl.length]));
            "".length();
            ++llllllllllllllIlllIllIIlIlllIlII;
            ++llllllllllllllIlllIllIIlIllIllII;
            "".length();
            if ("  ".length() != 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIlllIllIIlIlllIllI);
    }

    static {
        r.lIllIIlIlIIlIII();
        r.lIllIIlIlIIIlll();
        aa = new WorldPoint(lIIlllIIIlIll[5], lIIlllIIIlIll[6], lIIlllIIIlIll[0]);
    }

    private static String lIllIIlIlIIIllI(String llllllllllllllIlllIllIIlIllIIIll, String llllllllllllllIlllIllIIlIllIIIII) {
        try {
            SecretKeySpec llllllllllllllIlllIllIIlIllIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllIIlIllIIIII.getBytes(StandardCharsets.UTF_8)), lIIlllIIIlIll[8]), "DES");
            Cipher llllllllllllllIlllIllIIlIllIIlIl = Cipher.getInstance("DES");
            llllllllllllllIlllIllIIlIllIIlIl.init(lIIlllIIIlIll[3], llllllllllllllIlllIllIIlIllIIllI);
            return new String(llllllllllllllIlllIllIIlIllIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllIIlIllIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIllIIlIllIIlII) {
            llllllllllllllIlllIllIIlIllIIlII.printStackTrace();
            return null;
        }
    }

    private boolean G() {
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> lIIlllIIIlIlI[lIIlllIIIlIll[4]].equals(tileObject.getName()));
        if (r.lIllIIlIlIIllII(tileObject2) && r.lIllIIlIlIIllll(tileObject2.hasAction(lIIlllIIIlIlI[lIIlllIIIlIll[1]]::equals) ? 1 : 0)) {
            tileObject2.interact(lIIlllIIIlIlI[lIIlllIIIlIll[3]]);
            return lIIlllIIIlIll[1];
        }
        return lIIlllIIIlIll[0];
    }

    private static boolean lIllIIlIlIIlIll(int n2) {
        return n2 > 0;
    }

    @Inject
    public r(SquireThievingConfig squireThievingConfig, SquireThieving squireThieving) {
        this.ab = squireThievingConfig;
        this.ac = squireThieving;
    }

    private static boolean lIllIIlIlIlIIII(Object object) {
        return object == null;
    }

    private static String lIllIIlIlIIIlII(String llllllllllllllIlllIllIIllIIIIllI, String llllllllllllllIlllIllIIllIIIIlIl) {
        try {
            SecretKeySpec llllllllllllllIlllIllIIllIIIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllIIllIIIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIllIIllIIIlIlI = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIllIIllIIIlIlI.init(lIIlllIIIlIll[3], llllllllllllllIlllIllIIllIIIlIll);
            return new String(llllllllllllllIlllIllIIllIIIlIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllIIllIIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIllIIllIIIlIIl) {
            llllllllllllllIlllIllIIllIIIlIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIlIlIIllIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIllIIlIlIIllll(int n2) {
        return n2 != 0;
    }

    private static void lIllIIlIlIIlIII() {
        lIIlllIIIlIll = new int[9];
        r.lIIlllIIIlIll[0] = (0x60 ^ 0x6E ^ (0xA9 ^ 0x85)) & (0x1F ^ 0x23 ^ (0xB3 ^ 0xAD) ^ -" ".length());
        r.lIIlllIIIlIll[1] = " ".length();
        r.lIIlllIIIlIll[2] = -(0xFFFFF1FD & 0x6EB3) & (0xFFFFE7FF & 0x7EFF);
        r.lIIlllIIIlIll[3] = "  ".length();
        r.lIIlllIIIlIll[4] = "   ".length();
        r.lIIlllIIIlIll[5] = 0xFFFFEFB7 & 0x1D68;
        r.lIIlllIIIlIll[6] = 0xFFFFCBED & 0x3FBF;
        r.lIIlllIIIlIll[7] = 0x7F ^ 0x7B;
        r.lIIlllIIIlIll[8] = 0xA8 ^ 0x95 ^ (0x60 ^ 0x55);
    }

    private static boolean lIllIIlIlIIlllI(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIllIIlIlIlIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIIlIlIIllII(Object object) {
        return object != null;
    }

    private boolean F() {
        return lIIlllIIIlIll[0];
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var6_7;
        void var5_6;
        r llllllllllllllIlllIllIIllIIlllll;
        if (!r.lIllIIlIlIIlIIl(Game.getState(), GameState.LOGGED_IN) || !r.lIllIIlIlIIlIIl((Object)this.ab.method(), (Object)b.BLACK_JACK) || r.lIllIIlIlIIlIlI(this.ab.unNoteFood() ? 1 : 0)) {
            return lIIlllIIIlIll[0];
        }
        Player llllllllllllllIlllIllIIllIIllllI = Players.getLocal();
        int llllllllllllllIlllIllIIllIIlllIl = Inventory.getCount(item -> item.hasAction(k.z));
        if (r.lIllIIlIlIIlIll(llllllllllllllIlllIllIIllIIlllIl)) {
            return lIIlllIIIlIll[0];
        }
        NPC llllllllllllllIlllIllIIllIIlllII = llllllllllllllIlllIllIIllIIlllll.ac.b().a(llllllllllllllIlllIllIIllIIlllll.ac.b());
        if (r.lIllIIlIlIIllII(llllllllllllllIlllIllIIllIIlllII) && r.lIllIIlIlIIlIIl(llllllllllllllIlllIllIIllIIlllII.getInteracting(), llllllllllllllIlllIllIIllIIllllI)) {
            return lIIlllIIIlIll[0];
        }
        int llllllllllllllIlllIllIIllIIllIll = llllllllllllllIlllIllIIllIIlllll.ac.e();
        if (r.lIllIIlIlIIllIl(Worlds.getCurrentId(), llllllllllllllIlllIllIIllIIllIll)) {
            World llllllllllllllIlllIllIIllIIllIlI = Worlds.getRandom(world -> {
                int n3;
                if (r.lIllIIlIlIIllll(world.isNormal() ? 1 : 0) && r.lIllIIlIlIIllll(world.isMembers() ? 1 : 0) && r.lIllIIlIlIlIIIl(world.getId(), llllllllllllllIlllIllIIllIIllIll)) {
                    n3 = lIIlllIIIlIll[1];
                    "".length();
                    if ("  ".length() <= -" ".length()) {
                        return ((0xA3 ^ 0xC3) & ~(0x3E ^ 0x5E)) != 0;
                    }
                } else {
                    n3 = lIIlllIIIlIll[0];
                }
                return n3 != 0;
            });
            Worlds.hopTo((World)llllllllllllllIlllIllIIllIIllIlI);
            return lIIlllIIIlIll[1];
        }
        Item llllllllllllllIlllIllIIllIIllIlI = Inventory.getFirst(Item::isNoted);
        if (!r.lIllIIlIlIIllII(llllllllllllllIlllIllIIllIIllIlI) || r.lIllIIlIlIIlllI(llllllllllllllIlllIllIIllIIllIlI.getQuantity(), Inventory.getFreeSlots())) {
            return llllllllllllllIlllIllIIllIIlllll.F();
        }
        if (r.lIllIIlIlIIllll(llllllllllllllIlllIllIIllIIlllll.ac.b().t().p().contains((Locatable)Players.getLocal()) ? 1 : 0) && r.lIllIIlIlIIllll(llllllllllllllIlllIllIIllIIlllll.G() ? 1 : 0)) {
            return lIIlllIIIlIll[1];
        }
        int[] nArray = new int[lIIlllIIIlIll[1]];
        nArray[r.lIIlllIIIlIll[0]] = lIIlllIIIlIll[2];
        NPC llllllllllllllIlllIllIIllIIllIIl = NPCs.getNearest((int[])nArray);
        if (r.lIllIIlIlIlIIII(llllllllllllllIlllIllIIllIIllIIl) && r.lIllIIlIlIIlIlI(Movement.isWalking() ? 1 : 0)) {
            Map llllllllllllllIlllIllIIllIIllIII = Walker.buildTransportLinks();
            LocalCollisionMap llllllllllllllIlllIllIIllIIlIlll = new LocalCollisionMap((GlobalCollisionMap)Static.getGlobalCollisionMap(), lIIlllIIIlIll[0]);
            List llllllllllllllIlllIllIIllIIlIllI = new Pathfinder((CollisionMap)llllllllllllllIlllIllIIllIIlIlll, llllllllllllllIlllIllIIllIIllIII, List.of(Players.getLocal().getWorldLocation()), aa.toWorldArea(), RegionManager.avoidWilderness()).find();
            Walker.walkAlong((List)llllllllllllllIlllIllIIllIIlIllI, (Map)llllllllllllllIlllIllIIllIIllIII);
            "".length();
            return lIIlllIIIlIll[1];
        }
        if (r.lIllIIlIlIIllll(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] stringArray = new String[lIIlllIIIlIll[1]];
            stringArray[r.lIIlllIIIlIll[0]] = lIIlllIIIlIlI[lIIlllIIIlIll[0]];
            Dialog.chooseOption((String[])stringArray);
            "".length();
            return lIIlllIIIlIll[1];
        }
        var5_6.useOn((Actor)var6_7);
        return lIIlllIIIlIll[1];
    }

    private static boolean lIllIIlIlIIlIIl(Object object, Object object2) {
        return object == object2;
    }
}

